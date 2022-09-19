package cn.duoduo.pseudocode.compile;

import cn.duoduo.pseudocode.grammar.PseudocodeParser;

import java.util.Random;
import java.util.UUID;

public class Utils {

    private static final Random random = new Random();

    public static String pseudocodeDateType(PseudocodeParser.DatatypeContext context) throws CompileException {
        if (context instanceof PseudocodeParser.TypeIntContext)
            return "int";
        if (context instanceof PseudocodeParser.TypeBoolContext)
            return "int";
        if (context instanceof PseudocodeParser.TypeCharContext)
            return "char";
        if (context instanceof PseudocodeParser.TypeRealContext)
            return "double";
        if (context instanceof PseudocodeParser.TypeStrContext)
            return "string";
        if (context instanceof PseudocodeParser.TypeUserDefinedContext)
            return ((PseudocodeParser.TypeUserDefinedContext) context).NAME().getText();
        if (context instanceof PseudocodeParser.TypeArrayContext)
            return pseudocodeDateType(((PseudocodeParser.TypeArrayContext) context).datatype());
        throw new CompileException("Unknown datatype: " + context);
    }

    public static String randomName() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz_".toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(chars[random.nextInt(chars.length)]);
        }
        return sb.toString();
    }
}
