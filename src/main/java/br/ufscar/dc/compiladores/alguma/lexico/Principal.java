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

            Token t = null;
            // Cria um objeto para escrever no arquivo
            try (PrintWriter pw = new PrintWriter(arquivoSaida)) {
                while ((t = lex.nextToken()).getType() != Token.EOF) {
                    String nomeToken = (String) AlgumaLexer.VOCABULARY.getDisplayName(t.getType());
                    if (nomeToken.equals("ERRO")) {
                        pw.println("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado");
                        break;
                    } else if( nomeToken.equals("COMENTARIO_NAO_FECHADO")) { 
                        pw.println("Linha " + t.getLine() + ": comentario nao fechado");
                        break;
                    } else if (nomeToken.equals("CADEIA_NAO_FECHADA")) {
                        pw.println("Linha " + t.getLine() + ": cadeia literal nao fechada");
                        break;
                    } else if (nomeToken.equals("IDENT") | nomeToken.equals("CADEIA") |
                            nomeToken.equals("NUM_INT") | nomeToken.equals("NUM_REAL")) {
                        pw.println("<'" + t.getText() + "'," + nomeToken + ">");
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