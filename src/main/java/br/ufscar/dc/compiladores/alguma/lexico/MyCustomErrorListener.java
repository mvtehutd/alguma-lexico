package br.ufscar.dc.compiladores.alguma.lexico;

import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class MyCustomErrorListener implements ANTLRErrorListener {

    @Override
    public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3, boolean arg4, BitSet arg5,
            ATNConfigSet arg6) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2, int arg3, BitSet arg4, ATNConfigSet arg5) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void reportContextSensitivity(Parser arg0, DFA arg1, int arg2, int arg3, int arg4, ATNConfigSet arg5) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void syntaxError(Recognizer<?, ?> arg0, Object offendingSymbol, int line, int arg3, String message,
            RecognitionException arg5) {
                Token t = (Token) offendingSymbol;

                System.out.println("Minha mensagem customizada: Erro na linha "+line+", o token é "+offendingSymbol);
        
    }
   
}
