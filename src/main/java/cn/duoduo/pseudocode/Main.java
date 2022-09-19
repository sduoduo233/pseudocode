package cn.duoduo.pseudocode;

import cn.duoduo.pseudocode.compile.CompileException;
import cn.duoduo.pseudocode.compile.Compiler;
import cn.duoduo.pseudocode.grammar.PseudocodeLexer;
import cn.duoduo.pseudocode.grammar.PseudocodeParser;
import cn.duoduo.pseudocode.interpreter.Interpreter;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.BitSet;
import java.util.List;

import static java.nio.file.StandardOpenOption.*;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("test.sc");
            byte[] bytes = Files.readAllBytes(file.toPath());
            String str = new String(bytes, Charset.defaultCharset());

            PseudocodeLexer lexer = new PseudocodeLexer(CharStreams.fromString(str));
            List<? extends Token> tokens = lexer.getAllTokens();
            ListTokenSource tokenSource = new ListTokenSource(tokens);
            PseudocodeParser parser = new PseudocodeParser(new CommonTokenStream(tokenSource));

            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                    System.err.println("SyntaxError at line " + line + ":" + charPositionInLine + ", " + msg);
                }
            });

            Compiler compiler = new Compiler(parser.prog());
            String result = compiler.compile();
            System.out.println(result);

            File out = new File("out.cpp");
            Files.write(out.toPath(), result.getBytes(StandardCharsets.UTF_8), WRITE, CREATE, TRUNCATE_EXISTING);
        } catch (IOException | CompileException e) {
            e.printStackTrace();
        }
    }

}
