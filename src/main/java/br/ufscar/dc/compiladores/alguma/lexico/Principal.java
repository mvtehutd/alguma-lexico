package br.ufscar.dc.compiladores.alguma.lexico;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Principal {

    public static void main(String[] args) {
        try {
            // args[0] é o primeiro argumento da linha de comando
            CharStream cs = CharStreams.fromFileName(args[0]);
            AlgumaLexer lex = new AlgumaLexer(cs);

            MyCustomErrorListener mcel = new MyCustomErrorListener();
            lex.addErrorListener(mcel);

            while (lex.nextToken().getType() != Token.EOF) {
                System.out.println("");
            }
        } catch (IOException ex) {
        } 
    }
}