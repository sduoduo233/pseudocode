// Generated from java-escape by ANTLR 4.11.1
package cn.duoduo.pseudocode.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PseudocodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PseudocodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(PseudocodeParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PseudocodeParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(PseudocodeParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefineFunction}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineFunction(PseudocodeParser.DefineFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefineProc}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineProc(PseudocodeParser.DefineProcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(PseudocodeParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RepeatLoop}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatLoop(PseudocodeParser.RepeatLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(PseudocodeParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Output}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(PseudocodeParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(PseudocodeParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefinePointerType}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinePointerType(PseudocodeParser.DefinePointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefineEnum}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineEnum(PseudocodeParser.DefineEnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefineUserType}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineUserType(PseudocodeParser.DefineUserTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallFunction}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(PseudocodeParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallProsudure}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallProsudure(PseudocodeParser.CallProsudureContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(PseudocodeParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclareVariable}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVariable(PseudocodeParser.DeclareVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclareConstant}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareConstant(PseudocodeParser.DeclareConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#funcDefineParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefineParams(PseudocodeParser.FuncDefineParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#declare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare(PseudocodeParser.DeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprVar(PseudocodeParser.ExprVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpOr}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpOr(PseudocodeParser.OpOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBracket}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBracket(PseudocodeParser.ExprBracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNotEqual}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNotEqual(PseudocodeParser.ExprNotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpDivide}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpDivide(PseudocodeParser.OpDivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInt(PseudocodeParser.ExprIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLess}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLess(PseudocodeParser.ExprLessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprChar}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprChar(PseudocodeParser.ExprCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstFalse(PseudocodeParser.ConstFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMore}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMore(PseudocodeParser.ExprMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpMult}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMult(PseudocodeParser.OpMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLessEqual}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLessEqual(PseudocodeParser.ExprLessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpAdd}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAdd(PseudocodeParser.OpAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStr(PseudocodeParser.ExprStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstTrue(PseudocodeParser.ConstTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFuncCall}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFuncCall(PseudocodeParser.ExprFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMoreEqual}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMoreEqual(PseudocodeParser.ExprMoreEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Opsubtract}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpsubtract(PseudocodeParser.OpsubtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpAnd}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAnd(PseudocodeParser.OpAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprEqual}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprEqual(PseudocodeParser.ExprEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpNot}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpNot(PseudocodeParser.OpNotContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PseudocodeParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(PseudocodeParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#varSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSuffix(PseudocodeParser.VarSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(PseudocodeParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(PseudocodeParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeArray}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArray(PseudocodeParser.TypeArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeUserDefined}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeUserDefined(PseudocodeParser.TypeUserDefinedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(PseudocodeParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeStr}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStr(PseudocodeParser.TypeStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeReal}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeReal(PseudocodeParser.TypeRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeChar}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeChar(PseudocodeParser.TypeCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(PseudocodeParser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudocodeParser#arrayLengthDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLengthDefine(PseudocodeParser.ArrayLengthDefineContext ctx);
}