// Generated from Micro.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, KEYWORD=34, IDENTIFIER=35, WS=36, INTLITERAL=37, FLOATLITERAL=38, 
		STRINGLITERAL=39, COMMENT=40, OPERATOR=41;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"KEYWORD", "IDENTIFIER", "WS", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", 
			"COMMENT", "OPERATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'OSAMA ABUAMDAN'", "'SAAD JALOWDI'", "'PROGRAM'", "'BEGIN'", "'END'", 
			"'STRING'", "':='", "';'", "'FLOAT'", "'INT'", "'VOID'", "','", "'FUNCTION'", 
			"'('", "')'", "'READ'", "'WRITE'", "'RETURN'", "'IF'", "'ENDIF'", "'ELSE'", 
			"'='", "'!='", "'<='", "'>='", "'<'", "'>'", "'FOR'", "'ENDFOR'", "'+'", 
			"'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "KEYWORD", 
			"IDENTIFIER", "WS", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", "COMMENT", 
			"OPERATOR"
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


	public MicroLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Micro.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u018d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\5#\u013d\n#\3$\3$\7$\u0141\n$\f$\16$\u0144\13$\3%\6%\u0147\n%\r%"+
		"\16%\u0148\3%\3%\3&\3&\3&\7&\u0150\n&\f&\16&\u0153\13&\5&\u0155\n&\3\'"+
		"\3\'\3\'\7\'\u015a\n\'\f\'\16\'\u015d\13\'\5\'\u015f\n\'\3\'\3\'\3\'\7"+
		"\'\u0164\n\'\f\'\16\'\u0167\13\'\3\'\5\'\u016a\n\'\3(\3(\7(\u016e\n(\f"+
		"(\16(\u0171\13(\3(\3(\3)\3)\3)\3)\7)\u0179\n)\f)\16)\u017c\13)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u018c\n*\4\u016f\u017a\2+\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+\3\2\7\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\""+
		"\6\2,-//\61\61??\6\2*+..=>@@\2\u01aa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5d\3\2\2\2\7q\3\2\2\2\ty"+
		"\3\2\2\2\13\177\3\2\2\2\r\u0083\3\2\2\2\17\u008a\3\2\2\2\21\u008d\3\2"+
		"\2\2\23\u008f\3\2\2\2\25\u0095\3\2\2\2\27\u0099\3\2\2\2\31\u009e\3\2\2"+
		"\2\33\u00a0\3\2\2\2\35\u00a9\3\2\2\2\37\u00ab\3\2\2\2!\u00ad\3\2\2\2#"+
		"\u00b2\3\2\2\2%\u00b8\3\2\2\2\'\u00bf\3\2\2\2)\u00c2\3\2\2\2+\u00c8\3"+
		"\2\2\2-\u00cd\3\2\2\2/\u00cf\3\2\2\2\61\u00d2\3\2\2\2\63\u00d5\3\2\2\2"+
		"\65\u00d8\3\2\2\2\67\u00da\3\2\2\29\u00dc\3\2\2\2;\u00e0\3\2\2\2=\u00e7"+
		"\3\2\2\2?\u00e9\3\2\2\2A\u00eb\3\2\2\2C\u00ed\3\2\2\2E\u013c\3\2\2\2G"+
		"\u013e\3\2\2\2I\u0146\3\2\2\2K\u0154\3\2\2\2M\u015e\3\2\2\2O\u016b\3\2"+
		"\2\2Q\u0174\3\2\2\2S\u018b\3\2\2\2UV\7Q\2\2VW\7U\2\2WX\7C\2\2XY\7O\2\2"+
		"YZ\7C\2\2Z[\7\"\2\2[\\\7C\2\2\\]\7D\2\2]^\7W\2\2^_\7C\2\2_`\7O\2\2`a\7"+
		"F\2\2ab\7C\2\2bc\7P\2\2c\4\3\2\2\2de\7U\2\2ef\7C\2\2fg\7C\2\2gh\7F\2\2"+
		"hi\7\"\2\2ij\7L\2\2jk\7C\2\2kl\7N\2\2lm\7Q\2\2mn\7Y\2\2no\7F\2\2op\7K"+
		"\2\2p\6\3\2\2\2qr\7R\2\2rs\7T\2\2st\7Q\2\2tu\7I\2\2uv\7T\2\2vw\7C\2\2"+
		"wx\7O\2\2x\b\3\2\2\2yz\7D\2\2z{\7G\2\2{|\7I\2\2|}\7K\2\2}~\7P\2\2~\n\3"+
		"\2\2\2\177\u0080\7G\2\2\u0080\u0081\7P\2\2\u0081\u0082\7F\2\2\u0082\f"+
		"\3\2\2\2\u0083\u0084\7U\2\2\u0084\u0085\7V\2\2\u0085\u0086\7T\2\2\u0086"+
		"\u0087\7K\2\2\u0087\u0088\7P\2\2\u0088\u0089\7I\2\2\u0089\16\3\2\2\2\u008a"+
		"\u008b\7<\2\2\u008b\u008c\7?\2\2\u008c\20\3\2\2\2\u008d\u008e\7=\2\2\u008e"+
		"\22\3\2\2\2\u008f\u0090\7H\2\2\u0090\u0091\7N\2\2\u0091\u0092\7Q\2\2\u0092"+
		"\u0093\7C\2\2\u0093\u0094\7V\2\2\u0094\24\3\2\2\2\u0095\u0096\7K\2\2\u0096"+
		"\u0097\7P\2\2\u0097\u0098\7V\2\2\u0098\26\3\2\2\2\u0099\u009a\7X\2\2\u009a"+
		"\u009b\7Q\2\2\u009b\u009c\7K\2\2\u009c\u009d\7F\2\2\u009d\30\3\2\2\2\u009e"+
		"\u009f\7.\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7H\2\2\u00a1\u00a2\7W\2\2\u00a2"+
		"\u00a3\7P\2\2\u00a3\u00a4\7E\2\2\u00a4\u00a5\7V\2\2\u00a5\u00a6\7K\2\2"+
		"\u00a6\u00a7\7Q\2\2\u00a7\u00a8\7P\2\2\u00a8\34\3\2\2\2\u00a9\u00aa\7"+
		"*\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7+\2\2\u00ac \3\2\2\2\u00ad\u00ae\7"+
		"T\2\2\u00ae\u00af\7G\2\2\u00af\u00b0\7C\2\2\u00b0\u00b1\7F\2\2\u00b1\""+
		"\3\2\2\2\u00b2\u00b3\7Y\2\2\u00b3\u00b4\7T\2\2\u00b4\u00b5\7K\2\2\u00b5"+
		"\u00b6\7V\2\2\u00b6\u00b7\7G\2\2\u00b7$\3\2\2\2\u00b8\u00b9\7T\2\2\u00b9"+
		"\u00ba\7G\2\2\u00ba\u00bb\7V\2\2\u00bb\u00bc\7W\2\2\u00bc\u00bd\7T\2\2"+
		"\u00bd\u00be\7P\2\2\u00be&\3\2\2\2\u00bf\u00c0\7K\2\2\u00c0\u00c1\7H\2"+
		"\2\u00c1(\3\2\2\2\u00c2\u00c3\7G\2\2\u00c3\u00c4\7P\2\2\u00c4\u00c5\7"+
		"F\2\2\u00c5\u00c6\7K\2\2\u00c6\u00c7\7H\2\2\u00c7*\3\2\2\2\u00c8\u00c9"+
		"\7G\2\2\u00c9\u00ca\7N\2\2\u00ca\u00cb\7U\2\2\u00cb\u00cc\7G\2\2\u00cc"+
		",\3\2\2\2\u00cd\u00ce\7?\2\2\u00ce.\3\2\2\2\u00cf\u00d0\7#\2\2\u00d0\u00d1"+
		"\7?\2\2\u00d1\60\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d4\7?\2\2\u00d4\62"+
		"\3\2\2\2\u00d5\u00d6\7@\2\2\u00d6\u00d7\7?\2\2\u00d7\64\3\2\2\2\u00d8"+
		"\u00d9\7>\2\2\u00d9\66\3\2\2\2\u00da\u00db\7@\2\2\u00db8\3\2\2\2\u00dc"+
		"\u00dd\7H\2\2\u00dd\u00de\7Q\2\2\u00de\u00df\7T\2\2\u00df:\3\2\2\2\u00e0"+
		"\u00e1\7G\2\2\u00e1\u00e2\7P\2\2\u00e2\u00e3\7F\2\2\u00e3\u00e4\7H\2\2"+
		"\u00e4\u00e5\7Q\2\2\u00e5\u00e6\7T\2\2\u00e6<\3\2\2\2\u00e7\u00e8\7-\2"+
		"\2\u00e8>\3\2\2\2\u00e9\u00ea\7/\2\2\u00ea@\3\2\2\2\u00eb\u00ec\7,\2\2"+
		"\u00ecB\3\2\2\2\u00ed\u00ee\7\61\2\2\u00eeD\3\2\2\2\u00ef\u00f0\7R\2\2"+
		"\u00f0\u00f1\7T\2\2\u00f1\u00f2\7Q\2\2\u00f2\u00f3\7I\2\2\u00f3\u00f4"+
		"\7T\2\2\u00f4\u00f5\7C\2\2\u00f5\u00f6\7O\2\2\u00f6\u013d\7\63\2\2\u00f7"+
		"\u00f8\7D\2\2\u00f8\u00f9\7G\2\2\u00f9\u00fa\7I\2\2\u00fa\u00fb\7K\2\2"+
		"\u00fb\u013d\7P\2\2\u00fc\u00fd\7G\2\2\u00fd\u00fe\7P\2\2\u00fe\u013d"+
		"\7F\2\2\u00ff\u0100\7H\2\2\u0100\u0101\7W\2\2\u0101\u0102\7P\2\2\u0102"+
		"\u0103\7E\2\2\u0103\u0104\7V\2\2\u0104\u0105\7K\2\2\u0105\u0106\7Q\2\2"+
		"\u0106\u013d\7P\2\2\u0107\u0108\7T\2\2\u0108\u0109\7G\2\2\u0109\u010a"+
		"\7C\2\2\u010a\u013d\7F\2\2\u010b\u010c\7Y\2\2\u010c\u010d\7T\2\2\u010d"+
		"\u010e\7K\2\2\u010e\u010f\7V\2\2\u010f\u013d\7G\2\2\u0110\u0111\7K\2\2"+
		"\u0111\u013d\7H\2\2\u0112\u0113\7G\2\2\u0113\u0114\7N\2\2\u0114\u0115"+
		"\7U\2\2\u0115\u013d\7G\2\2\u0116\u0117\7G\2\2\u0117\u0118\7P\2\2\u0118"+
		"\u0119\7F\2\2\u0119\u011a\7K\2\2\u011a\u013d\7H\2\2\u011b\u011c\7H\2\2"+
		"\u011c\u011d\7Q\2\2\u011d\u013d\7T\2\2\u011e\u011f\7G\2\2\u011f\u0120"+
		"\7P\2\2\u0120\u0121\7F\2\2\u0121\u0122\7H\2\2\u0122\u0123\7Q\2\2\u0123"+
		"\u013d\7T\2\2\u0124\u0125\7T\2\2\u0125\u0126\7G\2\2\u0126\u0127\7V\2\2"+
		"\u0127\u0128\7W\2\2\u0128\u0129\7T\2\2\u0129\u013d\7P\2\2\u012a\u012b"+
		"\7K\2\2\u012b\u012c\7P\2\2\u012c\u013d\7V\2\2\u012d\u012e\7X\2\2\u012e"+
		"\u012f\7Q\2\2\u012f\u0130\7K\2\2\u0130\u013d\7F\2\2\u0131\u0132\7U\2\2"+
		"\u0132\u0133\7V\2\2\u0133\u0134\7T\2\2\u0134\u0135\7K\2\2\u0135\u0136"+
		"\7P\2\2\u0136\u013d\7I\2\2\u0137\u0138\7H\2\2\u0138\u0139\7N\2\2\u0139"+
		"\u013a\7Q\2\2\u013a\u013b\7C\2\2\u013b\u013d\7V\2\2\u013c\u00ef\3\2\2"+
		"\2\u013c\u00f7\3\2\2\2\u013c\u00fc\3\2\2\2\u013c\u00ff\3\2\2\2\u013c\u0107"+
		"\3\2\2\2\u013c\u010b\3\2\2\2\u013c\u0110\3\2\2\2\u013c\u0112\3\2\2\2\u013c"+
		"\u0116\3\2\2\2\u013c\u011b\3\2\2\2\u013c\u011e\3\2\2\2\u013c\u0124\3\2"+
		"\2\2\u013c\u012a\3\2\2\2\u013c\u012d\3\2\2\2\u013c\u0131\3\2\2\2\u013c"+
		"\u0137\3\2\2\2\u013dF\3\2\2\2\u013e\u0142\t\2\2\2\u013f\u0141\t\3\2\2"+
		"\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143H\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0147\t\4\2\2\u0146"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b%\2\2\u014bJ\3\2\2\2\u014c\u0155"+
		"\7\62\2\2\u014d\u0151\4\63;\2\u014e\u0150\4\62;\2\u014f\u014e\3\2\2\2"+
		"\u0150\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0155"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u014c\3\2\2\2\u0154\u014d\3\2\2\2\u0155"+
		"L\3\2\2\2\u0156\u015f\7\62\2\2\u0157\u015b\4\63;\2\u0158\u015a\4\62;\2"+
		"\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c"+
		"\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u0156\3\2\2\2\u015e"+
		"\u0157\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0169\13\2\2\2\u0161\u016a\7"+
		"\62\2\2\u0162\u0164\4\62;\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0168\u016a\4\63;\2\u0169\u0161\3\2\2\2\u0169\u0165\3\2\2\2\u016a"+
		"N\3\2\2\2\u016b\u016f\7$\2\2\u016c\u016e\13\2\2\2\u016d\u016c\3\2\2\2"+
		"\u016e\u0171\3\2\2\2\u016f\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0172\u0173\7$\2\2\u0173P\3\2\2\2\u0174\u0175"+
		"\7/\2\2\u0175\u0176\7/\2\2\u0176\u017a\3\2\2\2\u0177\u0179\13\2\2\2\u0178"+
		"\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u017b\3\2\2\2\u017a\u0178\3\2"+
		"\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u017e\7\f\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0180\b)\2\2\u0180R\3\2\2\2\u0181\u0182\7<\2\2\u0182"+
		"\u018c\7?\2\2\u0183\u018c\t\5\2\2\u0184\u0185\7#\2\2\u0185\u018c\7?\2"+
		"\2\u0186\u018c\t\6\2\2\u0187\u0188\7>\2\2\u0188\u018c\7?\2\2\u0189\u018a"+
		"\7@\2\2\u018a\u018c\7?\2\2\u018b\u0181\3\2\2\2\u018b\u0183\3\2\2\2\u018b"+
		"\u0184\3\2\2\2\u018b\u0186\3\2\2\2\u018b\u0187\3\2\2\2\u018b\u0189\3\2"+
		"\2\2\u018cT\3\2\2\2\17\2\u013c\u0142\u0148\u0151\u0154\u015b\u015e\u0165"+
		"\u0169\u016f\u017a\u018b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}