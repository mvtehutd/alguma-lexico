// Generated from java-escape by ANTLR 4.11.0-SNAPSHOT
package br.ufscar.dc.compiladores.alguma.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlgumaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.0-SNAPSHOT", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, IDENT=2, CADEIA=3, DELIM=4, OPERADORES=5, COMENTARIO=6, 
		WS=7, ABREPAR=8, FECHAPAR=9, VIRGULA=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "IDENT", "CADEIA", "DELIM", "OPERADORES", "COMENTARIO", 
			"WS", "ABREPAR", "FECHAPAR", "VIRGULA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "':'", null, null, null, "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "IDENT", "CADEIA", "DELIM", "OPERADORES", "COMENTARIO", 
			"WS", "ABREPAR", "FECHAPAR", "VIRGULA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public AlgumaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlgumaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 5:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\nx\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000P\b\u0000\u0001\u0001\u0001\u0001\u0005"+
		"\u0001T\b\u0001\n\u0001\f\u0001W\t\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002[\b\u0002\n\u0002\f\u0002^\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005"+
		"\u0005h\b\u0005\n\u0005\f\u0005k\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0000\u0000\n\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0001\u0000\u0006\u0003\u0000AZ__az\u0004\u000009AZ__az\u0003\u0000\n"+
		"\n\r\r\"\"\u0003\u0000*+--//\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r "+
		" \u0081\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0001"+
		"O\u0001\u0000\u0000\u0000\u0003Q\u0001\u0000\u0000\u0000\u0005X\u0001"+
		"\u0000\u0000\u0000\u0007a\u0001\u0000\u0000\u0000\tc\u0001\u0000\u0000"+
		"\u0000\u000be\u0001\u0000\u0000\u0000\ro\u0001\u0000\u0000\u0000\u000f"+
		"r\u0001\u0000\u0000\u0000\u0011t\u0001\u0000\u0000\u0000\u0013v\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0005a\u0000\u0000\u0016\u0017\u0005l\u0000"+
		"\u0000\u0017\u0018\u0005g\u0000\u0000\u0018\u0019\u0005o\u0000\u0000\u0019"+
		"\u001a\u0005r\u0000\u0000\u001a\u001b\u0005i\u0000\u0000\u001b\u001c\u0005"+
		"t\u0000\u0000\u001c\u001d\u0005m\u0000\u0000\u001dP\u0005o\u0000\u0000"+
		"\u001e\u001f\u0005d\u0000\u0000\u001f \u0005e\u0000\u0000 !\u0005c\u0000"+
		"\u0000!\"\u0005l\u0000\u0000\"#\u0005a\u0000\u0000#$\u0005r\u0000\u0000"+
		"$P\u0005e\u0000\u0000%&\u0005l\u0000\u0000&\'\u0005i\u0000\u0000\'(\u0005"+
		"t\u0000\u0000()\u0005e\u0000\u0000)*\u0005r\u0000\u0000*+\u0005a\u0000"+
		"\u0000+P\u0005l\u0000\u0000,-\u0005i\u0000\u0000-.\u0005n\u0000\u0000"+
		"./\u0005t\u0000\u0000/0\u0005e\u0000\u000001\u0005i\u0000\u000012\u0005"+
		"r\u0000\u00002P\u0005o\u0000\u000034\u0005r\u0000\u000045\u0005e\u0000"+
		"\u000056\u0005a\u0000\u00006P\u0005l\u0000\u000078\u0005l\u0000\u0000"+
		"89\u0005e\u0000\u00009:\u0005i\u0000\u0000:P\u0005a\u0000\u0000;<\u0005"+
		"e\u0000\u0000<=\u0005s\u0000\u0000=>\u0005c\u0000\u0000>?\u0005r\u0000"+
		"\u0000?@\u0005e\u0000\u0000@A\u0005v\u0000\u0000AP\u0005a\u0000\u0000"+
		"BC\u0005f\u0000\u0000CD\u0005i\u0000\u0000DE\u0005m\u0000\u0000EF\u0005"+
		"_\u0000\u0000FG\u0005a\u0000\u0000GH\u0005l\u0000\u0000HI\u0005g\u0000"+
		"\u0000IJ\u0005o\u0000\u0000JK\u0005r\u0000\u0000KL\u0005i\u0000\u0000"+
		"LM\u0005t\u0000\u0000MN\u0005m\u0000\u0000NP\u0005o\u0000\u0000O\u0015"+
		"\u0001\u0000\u0000\u0000O\u001e\u0001\u0000\u0000\u0000O%\u0001\u0000"+
		"\u0000\u0000O,\u0001\u0000\u0000\u0000O3\u0001\u0000\u0000\u0000O7\u0001"+
		"\u0000\u0000\u0000O;\u0001\u0000\u0000\u0000OB\u0001\u0000\u0000\u0000"+
		"P\u0002\u0001\u0000\u0000\u0000QU\u0007\u0000\u0000\u0000RT\u0007\u0001"+
		"\u0000\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0004\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000X\\\u0005\"\u0000\u0000Y[\b\u0002\u0000"+
		"\u0000ZY\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000_`\u0005\"\u0000\u0000`\u0006\u0001\u0000\u0000\u0000"+
		"ab\u0005:\u0000\u0000b\b\u0001\u0000\u0000\u0000cd\u0007\u0003\u0000\u0000"+
		"d\n\u0001\u0000\u0000\u0000ei\u0005{\u0000\u0000fh\b\u0004\u0000\u0000"+
		"gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000lm\u0005}\u0000\u0000mn\u0006\u0005\u0000\u0000n\f\u0001\u0000"+
		"\u0000\u0000op\u0007\u0005\u0000\u0000pq\u0006\u0006\u0001\u0000q\u000e"+
		"\u0001\u0000\u0000\u0000rs\u0005(\u0000\u0000s\u0010\u0001\u0000\u0000"+
		"\u0000tu\u0005)\u0000\u0000u\u0012\u0001\u0000\u0000\u0000vw\u0005,\u0000"+
		"\u0000w\u0014\u0001\u0000\u0000\u0000\u0005\u0000OU\\i\u0002\u0001\u0005"+
		"\u0000\u0001\u0006\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}