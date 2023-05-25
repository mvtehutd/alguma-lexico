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
            // args[0] é o primeiro argumento da linha de comando que representa o CAMINHO PARA O ARQUIVO DE ENTRADA COM A LINGUAGEM
            CharStream cs = CharStreams.fromFileName(args[0]);
            AlgumaLexer lex = new AlgumaLexer(cs);
            // Pega o primeiro argumento da linha de comando que representa o CAMINHO PARA O ARQUIVO DE SAIDA DA ANALISE LEXICA
            String arquivoSaida = args[1];

            Token t = null;

            // Cria um objeto para escrever no arquivo
            try (PrintWriter pw = new PrintWriter(arquivoSaida)) {
                while ((t = lex.nextToken()).getType() != Token.EOF) {
                    String nomeToken = (String) AlgumaLexer.VOCABULARY.getDisplayName(t.getType());

                    // Decisões utilizadas para representar de maneira diferente no arquivo de acordo com o token reconhecido 
                    if (nomeToken.equals("ERRO")) { // Grava na saida o erro personalizado para simbolos nao identificados
                        pw.println("Linha " + t.getLine() + ": " + t.getText() + " - simbolo nao identificado");
                        break;
                    } else if( nomeToken.equals("COMENTARIO_NAO_FECHADO")) { //Grava na saida o erro personalizado para comentario nao fechados
                        pw.println("Linha " + t.getLine() + ": comentario nao fechado");
                        break;
                    } else if (nomeToken.equals("CADEIA_NAO_FECHADA")) { //Grava na saida o erro personalizado para cadeia nao fechadas
                        pw.println("Linha " + t.getLine() + ": cadeia literal nao fechada");
                        break;
                    } else if (nomeToken.equals("IDENT") | nomeToken.equals("CADEIA") |
                            nomeToken.equals("NUM_INT") | nomeToken.equals("NUM_REAL")) { // Caso reconheça algum deses tokens, grava o nome do Token e o valor dele.
                        pw.println("<'" + t.getText() + "'," + nomeToken + ">");
                    } else { // Todas as outra opções da analise lexica gravam o valor do token reconhecido e novamente seu valor como nos casos de teste
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