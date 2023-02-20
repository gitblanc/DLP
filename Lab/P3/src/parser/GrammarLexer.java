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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, LITENT=20, LITREAL=21, IDENT=22, COMMENT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "LITENT", "LITREAL", "IDENT", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DATA'", "'CODE'", "';'", "'int'", "'real'", "'print'", "'read'", 
			"'='", "'if'", "'('", "')'", "'{'", "'}'", "'else'", "'while'", "'+'", 
			"'!='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "LITENT", "LITREAL", 
			"IDENT", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u009f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\6\25v\n\25\r\25\16\25w\3\26\6\26{\n\26\r\26\16\26|\3\26"+
		"\3\26\6\26\u0081\n\26\r\26\16\26\u0082\3\27\3\27\6\27\u0087\n\27\r\27"+
		"\16\27\u0088\3\30\3\30\3\30\3\30\7\30\u008f\n\30\f\30\16\30\u0092\13\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\6\31\u009a\n\31\r\31\16\31\u009b\3\31\3"+
		"\31\3\u0090\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\6\3\2"+
		"\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00a4\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\3\63\3\2\2\2\58\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13C\3\2\2\2\rH\3\2\2"+
		"\2\17N\3\2\2\2\21S\3\2\2\2\23U\3\2\2\2\25X\3\2\2\2\27Z\3\2\2\2\31\\\3"+
		"\2\2\2\33^\3\2\2\2\35`\3\2\2\2\37e\3\2\2\2!k\3\2\2\2#m\3\2\2\2%p\3\2\2"+
		"\2\'r\3\2\2\2)u\3\2\2\2+z\3\2\2\2-\u0084\3\2\2\2/\u008a\3\2\2\2\61\u0099"+
		"\3\2\2\2\63\64\7F\2\2\64\65\7C\2\2\65\66\7V\2\2\66\67\7C\2\2\67\4\3\2"+
		"\2\289\7E\2\29:\7Q\2\2:;\7F\2\2;<\7G\2\2<\6\3\2\2\2=>\7=\2\2>\b\3\2\2"+
		"\2?@\7k\2\2@A\7p\2\2AB\7v\2\2B\n\3\2\2\2CD\7t\2\2DE\7g\2\2EF\7c\2\2FG"+
		"\7n\2\2G\f\3\2\2\2HI\7r\2\2IJ\7t\2\2JK\7k\2\2KL\7p\2\2LM\7v\2\2M\16\3"+
		"\2\2\2NO\7t\2\2OP\7g\2\2PQ\7c\2\2QR\7f\2\2R\20\3\2\2\2ST\7?\2\2T\22\3"+
		"\2\2\2UV\7k\2\2VW\7h\2\2W\24\3\2\2\2XY\7*\2\2Y\26\3\2\2\2Z[\7+\2\2[\30"+
		"\3\2\2\2\\]\7}\2\2]\32\3\2\2\2^_\7\177\2\2_\34\3\2\2\2`a\7g\2\2ab\7n\2"+
		"\2bc\7u\2\2cd\7g\2\2d\36\3\2\2\2ef\7y\2\2fg\7j\2\2gh\7k\2\2hi\7n\2\2i"+
		"j\7g\2\2j \3\2\2\2kl\7-\2\2l\"\3\2\2\2mn\7#\2\2no\7?\2\2o$\3\2\2\2pq\7"+
		">\2\2q&\3\2\2\2rs\7@\2\2s(\3\2\2\2tv\t\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2"+
		"\2\2wx\3\2\2\2x*\3\2\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}~\3\2\2\2~\u0080\7\60\2\2\177\u0081\t\2\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083,\3\2\2\2"+
		"\u0084\u0086\t\3\2\2\u0085\u0087\t\4\2\2\u0086\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089.\3\2\2\2\u008a"+
		"\u008b\7\61\2\2\u008b\u008c\7,\2\2\u008c\u0090\3\2\2\2\u008d\u008f\13"+
		"\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7,"+
		"\2\2\u0094\u0095\7\61\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\30\2\2\u0097"+
		"\60\3\2\2\2\u0098\u009a\t\5\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2"+
		"\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\b\31\2\2\u009e\62\3\2\2\2\t\2w|\u0082\u0088\u0090\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}