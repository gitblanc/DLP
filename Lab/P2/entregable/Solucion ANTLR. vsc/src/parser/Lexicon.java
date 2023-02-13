// Generated from src\parser\Lexicon.g4 by ANTLR 4.7.1
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
public class Lexicon extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LITENT=1, LITREAL=2, MAS=3, MENOS=4, IGUAL=5, PCOMA=6, READ=7, WRITE=8, 
		INT=9, FLOAT=10, IDENT=11, LINE_COMMENT=12, MULTILINE_COMMENT=13, WHITESPACE=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LITENT", "LITREAL", "MAS", "MENOS", "IGUAL", "PCOMA", "READ", "WRITE", 
		"INT", "FLOAT", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'+'", "'-'", "'='", "';'", "'read'", "'write'", "'int'", 
		"'float'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LITENT", "LITREAL", "MAS", "MENOS", "IGUAL", "PCOMA", "READ", "WRITE", 
		"INT", "FLOAT", "IDENT", "LINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE"
	};
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


	public Lexicon(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexicon.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2!\n\2\r\2\16\2\"\3\3\6"+
		"\3&\n\3\r\3\16\3\'\3\3\3\3\6\3,\n\3\r\3\16\3-\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\fO\n\f\f\f\16\fR\13\f\3\r\3\r\3"+
		"\r\3\r\7\rX\n\r\f\r\16\r[\13\r\3\r\5\r^\n\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\7\16f\n\16\f\16\16\16i\13\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17q\n\17"+
		"\r\17\16\17r\3\17\3\17\4Yg\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\3\2\7\3\2\62;\4\2C\\c|\6\2\62;C\\aac|"+
		"\3\3\f\f\5\2\13\f\17\17\"\"\2|\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3"+
		" \3\2\2\2\5%\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2"+
		"\2\17\67\3\2\2\2\21<\3\2\2\2\23B\3\2\2\2\25F\3\2\2\2\27L\3\2\2\2\31S\3"+
		"\2\2\2\33a\3\2\2\2\35p\3\2\2\2\37!\t\2\2\2 \37\3\2\2\2!\"\3\2\2\2\" \3"+
		"\2\2\2\"#\3\2\2\2#\4\3\2\2\2$&\t\2\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2"+
		"\'(\3\2\2\2()\3\2\2\2)+\7\60\2\2*,\t\2\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2"+
		"\2-.\3\2\2\2.\6\3\2\2\2/\60\7-\2\2\60\b\3\2\2\2\61\62\7/\2\2\62\n\3\2"+
		"\2\2\63\64\7?\2\2\64\f\3\2\2\2\65\66\7=\2\2\66\16\3\2\2\2\678\7t\2\28"+
		"9\7g\2\29:\7c\2\2:;\7f\2\2;\20\3\2\2\2<=\7y\2\2=>\7t\2\2>?\7k\2\2?@\7"+
		"v\2\2@A\7g\2\2A\22\3\2\2\2BC\7k\2\2CD\7p\2\2DE\7v\2\2E\24\3\2\2\2FG\7"+
		"h\2\2GH\7n\2\2HI\7q\2\2IJ\7c\2\2JK\7v\2\2K\26\3\2\2\2LP\t\3\2\2MO\t\4"+
		"\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\30\3\2\2\2RP\3\2\2\2ST\7"+
		"\61\2\2TU\7\61\2\2UY\3\2\2\2VX\13\2\2\2WV\3\2\2\2X[\3\2\2\2YZ\3\2\2\2"+
		"YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\^\t\5\2\2]\\\3\2\2\2^_\3\2\2\2_`\b\r\2"+
		"\2`\32\3\2\2\2ab\7\61\2\2bc\7,\2\2cg\3\2\2\2df\13\2\2\2ed\3\2\2\2fi\3"+
		"\2\2\2gh\3\2\2\2ge\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7,\2\2kl\7\61\2\2lm\3"+
		"\2\2\2mn\b\16\2\2n\34\3\2\2\2oq\t\6\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2"+
		"rs\3\2\2\2st\3\2\2\2tu\b\17\2\2u\36\3\2\2\2\13\2\"\'-PY]gr\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}