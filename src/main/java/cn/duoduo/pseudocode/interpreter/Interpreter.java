package cn.duoduo.pseudocode.interpreter;

import cn.duoduo.pseudocode.grammar.PseudocodeBaseVisitor;
import cn.duoduo.pseudocode.grammar.PseudocodeParser;

public class Interpreter {

    private final PseudocodeParser.ProgContext program;

    public Interpreter(PseudocodeParser.ProgContext program) {
        this.program = program;
    }

    public void execute() {
        program.accept(new PseudocodeBaseVisitor<>() {
            @Override
            public Object visitProg(PseudocodeParser.ProgContext ctx) {
                return super.visitProg(ctx);
            }
        });
    }
}
