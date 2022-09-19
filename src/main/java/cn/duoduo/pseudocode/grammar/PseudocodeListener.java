// Generated from java-escape by ANTLR 4.11.1
package cn.duoduo.pseudocode.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PseudocodeParser}.
 */
public interface PseudocodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PseudocodeParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PseudocodeParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PseudocodeParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PseudocodeParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(PseudocodeParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStat}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(PseudocodeParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefineFunction}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDefineFunction(PseudocodeParser.DefineFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefineFunction}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDefineFunction(PseudocodeParser.DefineFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefineProc}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDefineProc(PseudocodeParser.DefineProcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefineProc}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDefineProc(PseudocodeParser.DefineProcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(PseudocodeParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(PseudocodeParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RepeatLoop}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRepeatLoop(PseudocodeParser.RepeatLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RepeatLoop}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRepeatLoop(PseudocodeParser.RepeatLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(PseudocodeParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(PseudocodeParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Output}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterOutput(PseudocodeParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Output}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitOutput(PseudocodeParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Input}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterInput(PseudocodeParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitInput(PseudocodeParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefinePointerType}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDefinePointerType(PseudocodeParser.DefinePointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefinePointerType}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDefinePointerType(PseudocodeParser.DefinePointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefineEnum}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDefineEnum(PseudocodeParser.DefineEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefineEnum}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDefineEnum(PseudocodeParser.DefineEnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefineUserType}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDefineUserType(PseudocodeParser.DefineUserTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefineUserType}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDefineUserType(PseudocodeParser.DefineUserTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallFunction}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(PseudocodeParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallFunction}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(PseudocodeParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallProsudure}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCallProsudure(PseudocodeParser.CallProsudureContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallProsudure}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCallProsudure(PseudocodeParser.CallProsudureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(PseudocodeParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(PseudocodeParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclareVariable}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVariable(PseudocodeParser.DeclareVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclareVariable}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVariable(PseudocodeParser.DeclareVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclareConstant}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclareConstant(PseudocodeParser.DeclareConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclareConstant}
	 * labeled alternative in {@link PseudocodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclareConstant(PseudocodeParser.DeclareConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#funcDefineParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefineParams(PseudocodeParser.FuncDefineParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#funcDefineParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefineParams(PseudocodeParser.FuncDefineParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(PseudocodeParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(PseudocodeParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprVar(PseudocodeParser.ExprVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprVar}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprVar(PseudocodeParser.ExprVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpOr}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpOr(PseudocodeParser.OpOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpOr}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpOr(PseudocodeParser.OpOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBracket}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBracket(PseudocodeParser.ExprBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBracket}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBracket(PseudocodeParser.ExprBracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNotEqual}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNotEqual(PseudocodeParser.ExprNotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNotEqual}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNotEqual(PseudocodeParser.ExprNotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpDivide}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpDivide(PseudocodeParser.OpDivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpDivide}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpDivide(PseudocodeParser.OpDivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInt(PseudocodeParser.ExprIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInt}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInt(PseudocodeParser.ExprIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLess}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLess(PseudocodeParser.ExprLessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLess}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLess(PseudocodeParser.ExprLessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprChar}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprChar(PseudocodeParser.ExprCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprChar}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprChar(PseudocodeParser.ExprCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstFalse(PseudocodeParser.ConstFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstFalse(PseudocodeParser.ConstFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMore}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMore(PseudocodeParser.ExprMoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMore}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMore(PseudocodeParser.ExprMoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpMult}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpMult(PseudocodeParser.OpMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpMult}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpMult(PseudocodeParser.OpMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLessEqual}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLessEqual(PseudocodeParser.ExprLessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLessEqual}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLessEqual(PseudocodeParser.ExprLessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpAdd}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpAdd(PseudocodeParser.OpAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpAdd}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpAdd(PseudocodeParser.OpAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStr(PseudocodeParser.ExprStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStr}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStr(PseudocodeParser.ExprStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstTrue(PseudocodeParser.ConstTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstTrue(PseudocodeParser.ConstTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFuncCall}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFuncCall(PseudocodeParser.ExprFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFuncCall}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFuncCall(PseudocodeParser.ExprFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMoreEqual}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMoreEqual(PseudocodeParser.ExprMoreEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMoreEqual}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMoreEqual(PseudocodeParser.ExprMoreEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Opsubtract}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpsubtract(PseudocodeParser.OpsubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Opsubtract}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpsubtract(PseudocodeParser.OpsubtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpAnd}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpAnd(PseudocodeParser.OpAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpAnd}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpAnd(PseudocodeParser.OpAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEqual}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprEqual(PseudocodeParser.ExprEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEqual}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprEqual(PseudocodeParser.ExprEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpNot}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpNot(PseudocodeParser.OpNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpNot}
	 * labeled alternative in {@link PseudocodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpNot(PseudocodeParser.OpNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PseudocodeParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PseudocodeParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(PseudocodeParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(PseudocodeParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#varSuffix}.
	 * @param ctx the parse tree
	 */
	void enterVarSuffix(PseudocodeParser.VarSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#varSuffix}.
	 * @param ctx the parse tree
	 */
	void exitVarSuffix(PseudocodeParser.VarSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(PseudocodeParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(PseudocodeParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(PseudocodeParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(PseudocodeParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeArray}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterTypeArray(PseudocodeParser.TypeArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeArray}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitTypeArray(PseudocodeParser.TypeArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeUserDefined}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterTypeUserDefined(PseudocodeParser.TypeUserDefinedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeUserDefined}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitTypeUserDefined(PseudocodeParser.TypeUserDefinedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(PseudocodeParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeInt}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(PseudocodeParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeStr}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterTypeStr(PseudocodeParser.TypeStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeStr}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitTypeStr(PseudocodeParser.TypeStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeReal}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterTypeReal(PseudocodeParser.TypeRealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeReal}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitTypeReal(PseudocodeParser.TypeRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeChar}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterTypeChar(PseudocodeParser.TypeCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeChar}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitTypeChar(PseudocodeParser.TypeCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterTypeBool(PseudocodeParser.TypeBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeBool}
	 * labeled alternative in {@link PseudocodeParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitTypeBool(PseudocodeParser.TypeBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link PseudocodeParser#arrayLengthDefine}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthDefine(PseudocodeParser.ArrayLengthDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PseudocodeParser#arrayLengthDefine}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthDefine(PseudocodeParser.ArrayLengthDefineContext ctx);
}