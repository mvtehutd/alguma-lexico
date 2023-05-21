package br.ufscar.dc.compiladores.alguma.lexico;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Principal {

    public static void main(String[] args) {
        try {
            // args[0] é o primeiro argumento da linha de comando
            CharStream cs = CharStreams.fromFileName(args[0]);
            AlgumaLexer lex = new AlgumaLexer(cs);
            // Pega o primeiro argumento da linha de comando
            String arquivoSaida = args[1];
            try (PrintWriter pw = new PrintWriter(arquivoSaida)) {
            } catch (FileNotFoundException fnfe) {
                System.err.println("O arquivo/diretório não existe:" + args[1]);
            }

            MyCustomErrorListener mcel = new MyCustomErrorListener();
            lex.addErrorListener(mcel);

            Token t = null;
            // Cria um objeto para escrever no arquivo
            try (PrintWriter pw = new PrintWriter(arquivoSaida)) {
                while ((t = lex.nextToken()).getType() != Token.EOF) {
                    if (AlgumaLexer.VOCABULARY.getDisplayName(t.getType()).equals("IDENT") |
                    AlgumaLexer.VOCABULARY.getDisplayName(t.getType()).equals("CADEIA")) {
                        pw.println("<'" + t.getText() + "'," + (String) AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) + ">");
                    } else {
                        pw.println("<'" + t.getText() + "','" + t.getText() + "'>");
                    }
                }
            } catch (FileNotFoundException fnfe) {
                System.err.println("O arquivo/diretório não existe:" + args[1]);
            }
        } catch (IOException ex) {
        }
    }
}