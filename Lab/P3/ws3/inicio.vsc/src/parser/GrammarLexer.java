// Generated from src\parser\Grammar.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITENT=1, LITREAL=2, COMMENT=3, WS=4, MAS=5, DISTINTO=6, INT=7, REAL=8, 
		CASTINT=9, PRINT=10, READ=11, IF=12, ELSE=13, WHILE=14, DATA=15, CODE=16, 
		IGUAL=17, PARIZQ=18, PARDER=19, PCOMA=20, COMA=21, CORCHETEIZQ=22, CORCHETEDER=23, 
		IDENT=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LITENT", "LITREAL", "COMMENT", "WS", "MAS", "DISTINTO", "INT", "REAL", 
			"CASTINT", "PRINT", "READ", "IF", "ELSE", "WHILE", "DATA", "CODE", "IGUAL", 
			"PARIZQ", "PARDER", "PCOMA", "COMA", "CORCHETEIZQ", "CORCHETEDER", "IDENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'+'", "'!='", "'int'", "'real'", "'<int>'", 
			"'print'", "'read'", "'if'", "'else'", "'while'", "'DATA'", "'CODE'", 
			"'='", "'('", "')'", "';'", "','", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LITENT", "LITREAL", "COMMENT", "WS", "MAS", "DISTINTO", "INT", 
			"REAL", "CASTINT", "PRINT", "READ", "IF", "ELSE", "WHILE", "DATA", "CODE", 
			"IGUAL", "PARIZQ", "PARDER", "PCOMA", "COMA", "CORCHETEIZQ", "CORCHETEDER", 
			"IDENT"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00a4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\6\2\65\n\2\r\2\16\2\66\3\3\6\3:\n\3\r\3\16\3;\3\3\3\3\6\3@\n"+
		"\3\r\3\16\3A\3\4\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\6\5S\n\5\r\5\16\5T\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\7\31\u00a0\n\31\f\31\16\31\u00a3\13\31\3I\2\32\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\6\3\2\62;\5\2\13\f\17\17\"\"\4"+
		"\2C\\c|\6\2\62;C\\aac|\2\u00a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\64\3\2\2\2\59\3\2\2\2\7"+
		"C\3\2\2\2\tR\3\2\2\2\13X\3\2\2\2\rZ\3\2\2\2\17]\3\2\2\2\21a\3\2\2\2\23"+
		"f\3\2\2\2\25l\3\2\2\2\27r\3\2\2\2\31w\3\2\2\2\33z\3\2\2\2\35\177\3\2\2"+
		"\2\37\u0085\3\2\2\2!\u008a\3\2\2\2#\u008f\3\2\2\2%\u0091\3\2\2\2\'\u0093"+
		"\3\2\2\2)\u0095\3\2\2\2+\u0097\3\2\2\2-\u0099\3\2\2\2/\u009b\3\2\2\2\61"+
		"\u009d\3\2\2\2\63\65\t\2\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2"+
		"\66\67\3\2\2\2\67\4\3\2\2\28:\t\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<"+
		"\3\2\2\2<=\3\2\2\2=?\7\60\2\2>@\t\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2"+
		"AB\3\2\2\2B\6\3\2\2\2CD\7\61\2\2DE\7,\2\2EI\3\2\2\2FH\13\2\2\2GF\3\2\2"+
		"\2HK\3\2\2\2IJ\3\2\2\2IG\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7,\2\2MN\7\61\2"+
		"\2NO\3\2\2\2OP\b\4\2\2P\b\3\2\2\2QS\t\3\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2"+
		"\2\2TU\3\2\2\2UV\3\2\2\2VW\b\5\2\2W\n\3\2\2\2XY\7-\2\2Y\f\3\2\2\2Z[\7"+
		"#\2\2[\\\7?\2\2\\\16\3\2\2\2]^\7k\2\2^_\7p\2\2_`\7v\2\2`\20\3\2\2\2ab"+
		"\7t\2\2bc\7g\2\2cd\7c\2\2de\7n\2\2e\22\3\2\2\2fg\7>\2\2gh\7k\2\2hi\7p"+
		"\2\2ij\7v\2\2jk\7@\2\2k\24\3\2\2\2lm\7r\2\2mn\7t\2\2no\7k\2\2op\7p\2\2"+
		"pq\7v\2\2q\26\3\2\2\2rs\7t\2\2st\7g\2\2tu\7c\2\2uv\7f\2\2v\30\3\2\2\2"+
		"wx\7k\2\2xy\7h\2\2y\32\3\2\2\2z{\7g\2\2{|\7n\2\2|}\7u\2\2}~\7g\2\2~\34"+
		"\3\2\2\2\177\u0080\7y\2\2\u0080\u0081\7j\2\2\u0081\u0082\7k\2\2\u0082"+
		"\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084\36\3\2\2\2\u0085\u0086\7F\2\2\u0086"+
		"\u0087\7C\2\2\u0087\u0088\7V\2\2\u0088\u0089\7C\2\2\u0089 \3\2\2\2\u008a"+
		"\u008b\7E\2\2\u008b\u008c\7Q\2\2\u008c\u008d\7F\2\2\u008d\u008e\7G\2\2"+
		"\u008e\"\3\2\2\2\u008f\u0090\7?\2\2\u0090$\3\2\2\2\u0091\u0092\7*\2\2"+
		"\u0092&\3\2\2\2\u0093\u0094\7+\2\2\u0094(\3\2\2\2\u0095\u0096\7=\2\2\u0096"+
		"*\3\2\2\2\u0097\u0098\7.\2\2\u0098,\3\2\2\2\u0099\u009a\7}\2\2\u009a."+
		"\3\2\2\2\u009b\u009c\7\177\2\2\u009c\60\3\2\2\2\u009d\u00a1\t\4\2\2\u009e"+
		"\u00a0\t\5\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\62\3\2\2\2\u00a3\u00a1\3\2\2\2\t\2\66;"+
		"AIT\u00a1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}