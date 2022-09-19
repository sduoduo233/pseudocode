package cn.duoduo.pseudocode.compile;

import cn.duoduo.pseudocode.grammar.PseudocodeBaseVisitor;
import cn.duoduo.pseudocode.grammar.PseudocodeParser;
import org.antlr.v4.runtime.Token;

public class Compiler {

    private final PseudocodeParser.ProgContext program;

    public Compiler(PseudocodeParser.ProgContext program) {
        this.program = program;
    }

    public String program(PseudocodeParser.ProgContext program) throws CompileException {
        StringBuilder sb = new StringBuilder();
        sb.append("#include <iostream>");
        sb.append("\nusing namespace std;");
        sb.append("\nint main() {\n");
        sb.append(block(program.block()));
        sb.append("return 0;\n}");
        return sb.toString();
    }

    public String block(PseudocodeParser.BlockContext context) throws CompileException {
        StringBuilder sb = new StringBuilder();
        for (PseudocodeParser.StatContext stat : context.stat()) {
            if (stat instanceof PseudocodeParser.OutputContext) {
                sb.append(output(((PseudocodeParser.OutputContext) stat))).append(";\n");
            }
            if (stat instanceof PseudocodeParser.DeclareVariableContext) {
                sb.append(declareVariable(((PseudocodeParser.DeclareVariableContext) stat))).append(";\n");
            }
            if (stat instanceof PseudocodeParser.AssignmentContext) {
                sb.append(assignment(((PseudocodeParser.AssignmentContext) stat))).append(";\n");
            }
            if (stat instanceof PseudocodeParser.ForLoopContext) {
                sb.append(forLoop(((PseudocodeParser.ForLoopContext) stat))).append(";\n");
            }
            if (stat instanceof PseudocodeParser.IfStatContext) {
                PseudocodeParser.IfStatContext ifContext = (PseudocodeParser.IfStatContext) stat;
                sb.append("if (").append(expr(ifContext.expr())).append(") {\n");
                sb.append(block(ifContext.block()));
                sb.append("}\n");
            }
            if (stat instanceof PseudocodeParser.DefineFunctionContext) {

            }
        }
        return sb.toString();
    }


    public String assignment(PseudocodeParser.AssignmentContext ctx) {
        return var(ctx.var()) + " = " + expr(ctx.expr());
    }

    public String var(PseudocodeParser.VarContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.NAME().getText());
        for (PseudocodeParser.VarSuffixContext varSuffix : ctx.varSuffix()) {
            if (varSuffix.args() != null)
                for (PseudocodeParser.ArgsContext args : varSuffix.args()) {
                    sb.append(args(args));
                }
            if (varSuffix.expr() != null)
                sb.append("[").append(expr(varSuffix.expr())).append("]");
            else
                sb.append(".").append(varSuffix.NAME().getText());
        }
        return sb.toString();
    }

    public String args(PseudocodeParser.ArgsContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        if (ctx.exprlist() != null)
            for (PseudocodeParser.ExprContext exprContext : ctx.exprlist().expr()) {
                sb.append(expr(exprContext)).append(", ");
            }
        sb.append(")");
        return sb.toString();
    }

    public String output(PseudocodeParser.OutputContext output) {
        StringBuilder sb = new StringBuilder();
        sb.append("cout");
        for (PseudocodeParser.ExprContext expr : output.exprlist().expr()) {
            sb.append(" << ").append(expr(expr));
        }
        sb.append(" << \"\\n\"");
        return sb.toString();
    }

    public String forLoop(PseudocodeParser.ForLoopContext context) throws CompileException {
        StringBuilder sb = new StringBuilder();
        String name = context.NAME(0).getText();
        String start = expr(context.expr(0));
        String stop = expr(context.expr(1));

        sb.append("for (");
        sb.append("int ").append(name).append(" = ").append(start).append("; ");
        sb.append(name).append(" <= ").append(stop).append(";");
        sb.append(name).append("++)");

        sb.append("{\n").append(block(context.block())).append("\n}");
        return sb.toString();
    }

    public String expr(PseudocodeParser.ExprContext expr) {
        StringBuilder sb = new StringBuilder();
        if (expr instanceof PseudocodeParser.ExprVarContext) {
            sb.append(var(((PseudocodeParser.ExprVarContext) expr).var()));
        }
        else if (expr instanceof PseudocodeParser.ExprStrContext) {
            sb.append(((PseudocodeParser.ExprStrContext) expr).STRING().getText());
        }
        else if (expr instanceof PseudocodeParser.ExprBracketContext) {
            sb.append("(").append(expr(((PseudocodeParser.ExprBracketContext) expr).expr())).append(")");
        }
        else if (expr instanceof PseudocodeParser.ExprIntContext) {
            sb.append(((PseudocodeParser.ExprIntContext) expr).INT().getText());
        }
        else if (expr instanceof PseudocodeParser.OpAddContext) {
            PseudocodeParser.OpAddContext opAddCtx = (PseudocodeParser.OpAddContext) expr;
            sb.append(expr(opAddCtx.expr(0))).append(" + ").append(expr(opAddCtx.expr(1)));
        }
        else if (expr instanceof PseudocodeParser.OpsubtractContext) {
            PseudocodeParser.OpsubtractContext op = (PseudocodeParser.OpsubtractContext) expr;
            sb.append(expr(op.expr(0))).append(" - ").append(expr(op.expr(1)));
        }
        else if (expr instanceof PseudocodeParser.OpMultContext) {
            PseudocodeParser.OpMultContext op = (PseudocodeParser.OpMultContext) expr;
            sb.append(expr(op.expr(0))).append(" * ").append(expr(op.expr(1)));
        }
        else if (expr instanceof PseudocodeParser.OpDivideContext) {
            PseudocodeParser.OpDivideContext op = (PseudocodeParser.OpDivideContext) expr;
            sb.append(expr(op.expr(0))).append(" / ").append(expr(op.expr(1)));
        }
        else if (expr instanceof PseudocodeParser.ExprCharContext) {
            sb.append(((PseudocodeParser.ExprCharContext) expr).CHAR().getText());
        }
        else if (expr instanceof PseudocodeParser.ExprMoreContext) {
            PseudocodeParser.ExprMoreContext e = (PseudocodeParser.ExprMoreContext) expr;
            sb.append(expr(e.expr(0))).append(" > ").append(expr(e.expr(1)));
        }
        else if (expr instanceof PseudocodeParser.ExprLessContext) {
            PseudocodeParser.ExprLessContext e = (PseudocodeParser.ExprLessContext) expr;
            sb.append(expr(e.expr(0))).append(" < ").append(expr(e.expr(1)));
        }
        else if (expr instanceof PseudocodeParser.ExprLessEqualContext) {
            PseudocodeParser.ExprLessEqualContext e = (PseudocodeParser.ExprLessEqualContext) expr;
            sb.append(expr(e.expr(0))).append(" <= ").append(expr(e.expr(1)));
        }
        else if (expr instanceof PseudocodeParser.ExprMoreEqualContext) {
            PseudocodeParser.ExprMoreEqualContext e = (PseudocodeParser.ExprMoreEqualContext) expr;
            sb.append(expr(e.expr(0))).append(" >= ").append(expr(e.expr(1)));
        }
        else if (expr instanceof PseudocodeParser.ExprEqualContext) {
            PseudocodeParser.ExprEqualContext e = (PseudocodeParser.ExprEqualContext) expr;
            sb.append(expr(e.expr(0))).append(" == ").append(expr(e.expr(1)));
        }
        else if (expr instanceof PseudocodeParser.ExprNotEqualContext) {
            PseudocodeParser.ExprNotEqualContext e = (PseudocodeParser.ExprNotEqualContext) expr;
            sb.append(expr(e.expr(0))).append(" != ").append(expr(e.expr(1)));
        }

        return sb.toString();
    }

    public String declareVariable(PseudocodeParser.DeclareVariableContext ctx) throws CompileException {
        StringBuilder sb = new StringBuilder();
        String name = ctx.declare().name.getText();
        PseudocodeParser.DatatypeContext datatype = ctx.declare().datatype();

        if (datatype instanceof PseudocodeParser.TypeArrayContext) {
            // int name[length]
            sb.append(Utils.pseudocodeDateType(datatype));
            sb.append(" ");
            sb.append(name);
            for (PseudocodeParser.ArrayLengthDefineContext arrLength : ((PseudocodeParser.TypeArrayContext) datatype).arrayLengthDefine()) {
                sb.append("[").append(arrLength.INT(1).getText()).append("]");
            }
        } else {
            // Type name
            sb.append(Utils.pseudocodeDateType(datatype));
            sb.append(" ");
            sb.append(name);
        }

        return sb.toString();
    }

    public String compile() throws CompileException {
        return program(program);
    }
}
