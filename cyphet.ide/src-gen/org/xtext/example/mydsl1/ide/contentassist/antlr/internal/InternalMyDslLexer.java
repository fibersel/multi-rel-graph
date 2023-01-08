package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_HEX=4;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_DECIMAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=12;
    public static final int RULE_STRING_LITERAL=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( '<' )
            // InternalMyDsl.g:11:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( '>' )
            // InternalMyDsl.g:12:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( '-' )
            // InternalMyDsl.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'MATCH' )
            // InternalMyDsl.g:14:9: 'MATCH'
            {
            match("MATCH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'CREATE' )
            // InternalMyDsl.g:15:9: 'CREATE'
            {
            match("CREATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( 'DESCENDING' )
            // InternalMyDsl.g:16:9: 'DESCENDING'
            {
            match("DESCENDING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( 'DESC' )
            // InternalMyDsl.g:17:9: 'DESC'
            {
            match("DESC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'ASCENDING' )
            // InternalMyDsl.g:18:9: 'ASCENDING'
            {
            match("ASCENDING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'ASC' )
            // InternalMyDsl.g:19:9: 'ASC'
            {
            match("ASC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'RELATIONSHIP' )
            // InternalMyDsl.g:20:9: 'RELATIONSHIP'
            {
            match("RELATIONSHIP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'REL' )
            // InternalMyDsl.g:21:9: 'REL'
            {
            match("REL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( '=' )
            // InternalMyDsl.g:22:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( '<>' )
            // InternalMyDsl.g:23:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( '<=' )
            // InternalMyDsl.g:24:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( '>=' )
            // InternalMyDsl.g:25:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( '+' )
            // InternalMyDsl.g:26:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( '*' )
            // InternalMyDsl.g:27:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( '/' )
            // InternalMyDsl.g:28:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( '%' )
            // InternalMyDsl.g:29:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( 'TRUE' )
            // InternalMyDsl.g:30:9: 'TRUE'
            {
            match("TRUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( 'FALSE' )
            // InternalMyDsl.g:31:9: 'FALSE'
            {
            match("FALSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( '?' )
            // InternalMyDsl.g:32:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( '!' )
            // InternalMyDsl.g:33:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( 'CYPHER' )
            // InternalMyDsl.g:34:9: 'CYPHER'
            {
            match("CYPHER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( 'EXPLAIN' )
            // InternalMyDsl.g:35:9: 'EXPLAIN'
            {
            match("EXPLAIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'PROFILE' )
            // InternalMyDsl.g:36:9: 'PROFILE'
            {
            match("PROFILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( 'USING' )
            // InternalMyDsl.g:37:9: 'USING'
            {
            match("USING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'PERIODIC' )
            // InternalMyDsl.g:38:9: 'PERIODIC'
            {
            match("PERIODIC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( 'COMMIT' )
            // InternalMyDsl.g:39:9: 'COMMIT'
            {
            match("COMMIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( 'UNION' )
            // InternalMyDsl.g:40:9: 'UNION'
            {
            match("UNION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:41:7: ( 'ALL' )
            // InternalMyDsl.g:41:9: 'ALL'
            {
            match("ALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:42:7: ( 'INDEX' )
            // InternalMyDsl.g:42:9: 'INDEX'
            {
            match("INDEX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:43:7: ( 'ON' )
            // InternalMyDsl.g:43:9: 'ON'
            {
            match("ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:44:7: ( 'DROP' )
            // InternalMyDsl.g:44:9: 'DROP'
            {
            match("DROP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:45:7: ( 'CONSTRAINT' )
            // InternalMyDsl.g:45:9: 'CONSTRAINT'
            {
            match("CONSTRAINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:46:7: ( 'ASSERT' )
            // InternalMyDsl.g:46:9: 'ASSERT'
            {
            match("ASSERT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:47:7: ( 'IS' )
            // InternalMyDsl.g:47:9: 'IS'
            {
            match("IS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:48:7: ( 'UNIQUE' )
            // InternalMyDsl.g:48:9: 'UNIQUE'
            {
            match("UNIQUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:49:7: ( 'EXISTS' )
            // InternalMyDsl.g:49:9: 'EXISTS'
            {
            match("EXISTS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:50:7: ( 'LOAD' )
            // InternalMyDsl.g:50:9: 'LOAD'
            {
            match("LOAD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:51:7: ( 'CSV' )
            // InternalMyDsl.g:51:9: 'CSV'
            {
            match("CSV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:52:7: ( 'WITH' )
            // InternalMyDsl.g:52:9: 'WITH'
            {
            match("WITH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:53:7: ( 'HEADERS' )
            // InternalMyDsl.g:53:9: 'HEADERS'
            {
            match("HEADERS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:54:7: ( 'FROM' )
            // InternalMyDsl.g:54:9: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:55:7: ( 'AS' )
            // InternalMyDsl.g:55:9: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:56:7: ( 'FIELDTERMINATOR' )
            // InternalMyDsl.g:56:9: 'FIELDTERMINATOR'
            {
            match("FIELDTERMINATOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:57:7: ( 'OPTIONAL' )
            // InternalMyDsl.g:57:9: 'OPTIONAL'
            {
            match("OPTIONAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:58:7: ( 'UNWIND' )
            // InternalMyDsl.g:58:9: 'UNWIND'
            {
            match("UNWIND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:59:7: ( 'MERGE' )
            // InternalMyDsl.g:59:9: 'MERGE'
            {
            match("MERGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:60:7: ( 'SET' )
            // InternalMyDsl.g:60:9: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:61:7: ( 'DELETE' )
            // InternalMyDsl.g:61:9: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:62:7: ( 'DETACH' )
            // InternalMyDsl.g:62:9: 'DETACH'
            {
            match("DETACH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:63:7: ( 'REMOVE' )
            // InternalMyDsl.g:63:9: 'REMOVE'
            {
            match("REMOVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:64:7: ( 'FOREACH' )
            // InternalMyDsl.g:64:9: 'FOREACH'
            {
            match("FOREACH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:65:7: ( 'IN' )
            // InternalMyDsl.g:65:9: 'IN'
            {
            match("IN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:66:7: ( 'DISTINCT' )
            // InternalMyDsl.g:66:9: 'DISTINCT'
            {
            match("DISTINCT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:67:7: ( 'RETURN' )
            // InternalMyDsl.g:67:9: 'RETURN'
            {
            match("RETURN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:68:7: ( 'ORDER' )
            // InternalMyDsl.g:68:9: 'ORDER'
            {
            match("ORDER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:69:7: ( 'BY' )
            // InternalMyDsl.g:69:9: 'BY'
            {
            match("BY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:70:7: ( 'SKIP' )
            // InternalMyDsl.g:70:9: 'SKIP'
            {
            match("SKIP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:71:7: ( 'LIMIT' )
            // InternalMyDsl.g:71:9: 'LIMIT'
            {
            match("LIMIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:72:7: ( 'JOIN' )
            // InternalMyDsl.g:72:9: 'JOIN'
            {
            match("JOIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:73:7: ( 'SCAN' )
            // InternalMyDsl.g:73:9: 'SCAN'
            {
            match("SCAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:74:7: ( 'START' )
            // InternalMyDsl.g:74:9: 'START'
            {
            match("START"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:75:7: ( 'NODE' )
            // InternalMyDsl.g:75:9: 'NODE'
            {
            match("NODE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:76:7: ( 'WHERE' )
            // InternalMyDsl.g:76:9: 'WHERE'
            {
            match("WHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:77:7: ( 'SHORTESTPATH' )
            // InternalMyDsl.g:77:9: 'SHORTESTPATH'
            {
            match("SHORTESTPATH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:78:7: ( 'ALLSHORTESTPATHS' )
            // InternalMyDsl.g:78:9: 'ALLSHORTESTPATHS'
            {
            match("ALLSHORTESTPATHS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:79:7: ( 'OR' )
            // InternalMyDsl.g:79:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:80:7: ( 'XOR' )
            // InternalMyDsl.g:80:9: 'XOR'
            {
            match("XOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:81:7: ( 'AND' )
            // InternalMyDsl.g:81:9: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:82:7: ( 'NOT' )
            // InternalMyDsl.g:82:9: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:83:7: ( 'STARTS' )
            // InternalMyDsl.g:83:9: 'STARTS'
            {
            match("STARTS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:84:7: ( 'ENDS' )
            // InternalMyDsl.g:84:9: 'ENDS'
            {
            match("ENDS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:85:7: ( 'CONTAINS' )
            // InternalMyDsl.g:85:9: 'CONTAINS'
            {
            match("CONTAINS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:86:7: ( 'NULL' )
            // InternalMyDsl.g:86:9: 'NULL'
            {
            match("NULL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:87:7: ( 'COUNT' )
            // InternalMyDsl.g:87:9: 'COUNT'
            {
            match("COUNT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:88:7: ( 'FILTER' )
            // InternalMyDsl.g:88:9: 'FILTER'
            {
            match("FILTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:89:7: ( 'EXTRACT' )
            // InternalMyDsl.g:89:9: 'EXTRACT'
            {
            match("EXTRACT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:90:7: ( 'ANY' )
            // InternalMyDsl.g:90:9: 'ANY'
            {
            match("ANY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:91:7: ( 'NONE' )
            // InternalMyDsl.g:91:9: 'NONE'
            {
            match("NONE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:92:7: ( 'SINGLE' )
            // InternalMyDsl.g:92:9: 'SINGLE'
            {
            match("SINGLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:93:7: ( 'REDUCE' )
            // InternalMyDsl.g:93:9: 'REDUCE'
            {
            match("REDUCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:94:7: ( 'CASE' )
            // InternalMyDsl.g:94:9: 'CASE'
            {
            match("CASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:95:7: ( 'ELSE' )
            // InternalMyDsl.g:95:9: 'ELSE'
            {
            match("ELSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:96:7: ( 'END' )
            // InternalMyDsl.g:96:9: 'END'
            {
            match("END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:97:8: ( 'WHEN' )
            // InternalMyDsl.g:97:10: 'WHEN'
            {
            match("WHEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:98:8: ( 'THEN' )
            // InternalMyDsl.g:98:10: 'THEN'
            {
            match("THEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:99:8: ( ';' )
            // InternalMyDsl.g:99:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:100:8: ( '(' )
            // InternalMyDsl.g:100:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:101:8: ( ')' )
            // InternalMyDsl.g:101:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:102:8: ( '[' )
            // InternalMyDsl.g:102:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:103:8: ( ']' )
            // InternalMyDsl.g:103:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:104:8: ( ',' )
            // InternalMyDsl.g:104:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:105:8: ( '+=' )
            // InternalMyDsl.g:105:10: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:106:8: ( '|' )
            // InternalMyDsl.g:106:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:107:8: ( 'CALL' )
            // InternalMyDsl.g:107:10: 'CALL'
            {
            match("CALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:108:8: ( 'YIELD' )
            // InternalMyDsl.g:108:10: 'YIELD'
            {
            match("YIELD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:109:8: ( ':' )
            // InternalMyDsl.g:109:10: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:110:8: ( '..' )
            // InternalMyDsl.g:110:10: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:111:8: ( '=~' )
            // InternalMyDsl.g:111:10: '=~'
            {
            match("=~"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:112:8: ( '.' )
            // InternalMyDsl.g:112:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:113:8: ( '{' )
            // InternalMyDsl.g:113:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:114:8: ( '}' )
            // InternalMyDsl.g:114:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:115:8: ( '$' )
            // InternalMyDsl.g:115:10: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:116:8: ( '^' )
            // InternalMyDsl.g:116:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25176:9: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '`' ( options {greedy=false; } : . )* '`' ) )
            // InternalMyDsl.g:25176:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '`' ( options {greedy=false; } : . )* '`' )
            {
            // InternalMyDsl.g:25176:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '`' ( options {greedy=false; } : . )* '`' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='`') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:25176:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyDsl.g:25176:36: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:25176:70: '`' ( options {greedy=false; } : . )* '`'
                    {
                    match('`'); 
                    // InternalMyDsl.g:25176:74: ( options {greedy=false; } : . )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='`') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='_')||(LA2_0>='a' && LA2_0<='\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:25176:102: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('`'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25178:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:25178:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:25178:24: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:25178:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25180:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:25180:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:25180:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:25180:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalMyDsl.g:25180:40: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:25180:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:25180:41: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyDsl.g:25180:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25182:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:25182:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:25182:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_STRING_LITERAL"
    public final void mRULE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25184:21: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:25184:23: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:25184:23: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\"') ) {
                alt11=1;
            }
            else if ( (LA11_0=='\'') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:25184:24: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:25184:28: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:25184:29: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:25184:36: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:25184:56: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:25184:61: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMyDsl.g:25184:62: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:25184:69: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25186:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'A' .. 'F' )+ )
            // InternalMyDsl.g:25186:12: ( '0x' | '0X' ) ( '0' .. '9' | 'A' .. 'F' )+
            {
            // InternalMyDsl.g:25186:12: ( '0x' | '0X' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='0') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='x') ) {
                    alt12=1;
                }
                else if ( (LA12_1=='X') ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:25186:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:25186:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalMyDsl.g:25186:24: ( '0' .. '9' | 'A' .. 'F' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='F')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25188:10: ( '0' .. '9' ( '0' .. '9' )* )
            // InternalMyDsl.g:25188:12: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // InternalMyDsl.g:25188:21: ( '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:25188:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25190:14: ( RULE_INT ( 'e' ( '+' | '-' )? RULE_INT )? )
            // InternalMyDsl.g:25190:16: RULE_INT ( 'e' ( '+' | '-' )? RULE_INT )?
            {
            mRULE_INT(); 
            // InternalMyDsl.g:25190:25: ( 'e' ( '+' | '-' )? RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='e') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:25190:26: 'e' ( '+' | '-' )? RULE_INT
                    {
                    match('e'); 
                    // InternalMyDsl.g:25190:30: ( '+' | '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='+'||LA15_0=='-') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMyDsl.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25192:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:25192:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:25192:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:25192:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:25192:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMyDsl.g:25192:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:25192:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:25192:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:25192:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:25192:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:25192:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25194:16: ( . )
            // InternalMyDsl.g:25194:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_STRING_LITERAL | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_ANY_OTHER )
        int alt20=116;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalMyDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // InternalMyDsl.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // InternalMyDsl.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // InternalMyDsl.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // InternalMyDsl.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // InternalMyDsl.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // InternalMyDsl.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // InternalMyDsl.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // InternalMyDsl.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // InternalMyDsl.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // InternalMyDsl.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // InternalMyDsl.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // InternalMyDsl.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // InternalMyDsl.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // InternalMyDsl.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // InternalMyDsl.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // InternalMyDsl.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // InternalMyDsl.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // InternalMyDsl.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // InternalMyDsl.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // InternalMyDsl.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // InternalMyDsl.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // InternalMyDsl.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // InternalMyDsl.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // InternalMyDsl.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // InternalMyDsl.g:1:508: T__97
                {
                mT__97(); 

                }
                break;
            case 85 :
                // InternalMyDsl.g:1:514: T__98
                {
                mT__98(); 

                }
                break;
            case 86 :
                // InternalMyDsl.g:1:520: T__99
                {
                mT__99(); 

                }
                break;
            case 87 :
                // InternalMyDsl.g:1:526: T__100
                {
                mT__100(); 

                }
                break;
            case 88 :
                // InternalMyDsl.g:1:533: T__101
                {
                mT__101(); 

                }
                break;
            case 89 :
                // InternalMyDsl.g:1:540: T__102
                {
                mT__102(); 

                }
                break;
            case 90 :
                // InternalMyDsl.g:1:547: T__103
                {
                mT__103(); 

                }
                break;
            case 91 :
                // InternalMyDsl.g:1:554: T__104
                {
                mT__104(); 

                }
                break;
            case 92 :
                // InternalMyDsl.g:1:561: T__105
                {
                mT__105(); 

                }
                break;
            case 93 :
                // InternalMyDsl.g:1:568: T__106
                {
                mT__106(); 

                }
                break;
            case 94 :
                // InternalMyDsl.g:1:575: T__107
                {
                mT__107(); 

                }
                break;
            case 95 :
                // InternalMyDsl.g:1:582: T__108
                {
                mT__108(); 

                }
                break;
            case 96 :
                // InternalMyDsl.g:1:589: T__109
                {
                mT__109(); 

                }
                break;
            case 97 :
                // InternalMyDsl.g:1:596: T__110
                {
                mT__110(); 

                }
                break;
            case 98 :
                // InternalMyDsl.g:1:603: T__111
                {
                mT__111(); 

                }
                break;
            case 99 :
                // InternalMyDsl.g:1:610: T__112
                {
                mT__112(); 

                }
                break;
            case 100 :
                // InternalMyDsl.g:1:617: T__113
                {
                mT__113(); 

                }
                break;
            case 101 :
                // InternalMyDsl.g:1:624: T__114
                {
                mT__114(); 

                }
                break;
            case 102 :
                // InternalMyDsl.g:1:631: T__115
                {
                mT__115(); 

                }
                break;
            case 103 :
                // InternalMyDsl.g:1:638: T__116
                {
                mT__116(); 

                }
                break;
            case 104 :
                // InternalMyDsl.g:1:645: T__117
                {
                mT__117(); 

                }
                break;
            case 105 :
                // InternalMyDsl.g:1:652: T__118
                {
                mT__118(); 

                }
                break;
            case 106 :
                // InternalMyDsl.g:1:659: T__119
                {
                mT__119(); 

                }
                break;
            case 107 :
                // InternalMyDsl.g:1:666: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 108 :
                // InternalMyDsl.g:1:674: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 109 :
                // InternalMyDsl.g:1:690: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 110 :
                // InternalMyDsl.g:1:706: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 111 :
                // InternalMyDsl.g:1:714: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 112 :
                // InternalMyDsl.g:1:734: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 113 :
                // InternalMyDsl.g:1:743: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 114 :
                // InternalMyDsl.g:1:752: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 115 :
                // InternalMyDsl.g:1:765: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 116 :
                // InternalMyDsl.g:1:777: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\1\67\1\71\1\uffff\5\75\1\113\1\115\1\uffff\1\121\1\uffff\2\75\2\uffff\15\75\7\uffff\1\75\1\uffff\1\u0081\5\uffff\1\64\1\uffff\2\64\2\u008f\7\uffff\2\75\1\uffff\10\75\1\u00a2\3\75\11\uffff\6\75\2\uffff\7\75\1\u00bc\1\u00bd\1\u00be\1\75\1\u00c1\13\75\1\u00cd\4\75\7\uffff\1\75\17\uffff\1\u008f\2\uffff\7\75\1\u00e0\7\75\1\u00e9\1\75\1\uffff\1\u00ec\1\u00ed\1\u00ee\1\u00f0\15\75\1\u00ff\7\75\3\uffff\2\75\1\uffff\5\75\1\u0110\5\75\1\uffff\2\75\1\u0118\2\75\1\u011b\1\75\3\uffff\10\75\1\uffff\1\u0125\1\u0126\1\u0128\2\75\1\u012b\2\75\1\uffff\2\75\3\uffff\1\75\1\uffff\3\75\1\u0134\1\u0135\1\75\1\u0137\6\75\1\u013e\1\uffff\1\u013f\11\75\1\u0149\1\75\1\u014b\1\75\1\u014d\1\75\1\uffff\1\u014f\1\u0150\3\75\1\u0154\1\u0155\1\uffff\1\u0156\1\u0157\1\uffff\1\75\1\u0159\1\u015a\5\75\1\u0160\2\uffff\1\75\1\uffff\2\75\1\uffff\10\75\2\uffff\1\u016c\1\uffff\6\75\2\uffff\2\75\1\u0175\1\u0176\2\75\1\u0179\1\75\1\u017b\1\uffff\1\u017c\1\uffff\1\u017d\1\uffff\1\75\2\uffff\1\u0180\2\75\4\uffff\1\u0183\2\uffff\1\u0184\1\u0185\1\u0186\2\75\1\uffff\1\75\1\u018a\1\u018b\2\75\1\u018e\2\75\1\u0191\1\u0192\1\u0193\1\uffff\1\75\1\u0195\2\75\1\u0198\3\75\2\uffff\1\u019c\1\u019d\1\uffff\1\75\3\uffff\1\75\1\u01a0\1\uffff\1\75\1\u01a2\4\uffff\3\75\2\uffff\2\75\1\uffff\2\75\3\uffff\1\75\1\uffff\1\u01ab\1\u01ac\1\uffff\1\u01ad\1\u01ae\1\75\2\uffff\1\75\1\u01b1\1\uffff\1\75\1\uffff\1\75\1\u01b4\1\75\1\u01b6\4\75\4\uffff\1\u01bb\1\u01bc\1\uffff\2\75\1\uffff\1\75\1\uffff\1\u01c0\3\75\2\uffff\1\75\1\u01c5\1\u01c6\1\uffff\4\75\2\uffff\5\75\1\u01d0\1\75\1\u01d2\1\75\1\uffff\1\75\1\uffff\3\75\1\u01d8\1\u01d9\2\uffff";
    static final String DFA20_eofS =
        "\u01da\uffff";
    static final String DFA20_minS =
        "\1\0\2\75\1\uffff\2\101\1\105\1\114\1\105\1\176\1\75\1\uffff\1\52\1\uffff\1\110\1\101\2\uffff\1\114\1\105\3\116\1\111\1\110\1\105\1\103\1\131\3\117\7\uffff\1\111\1\uffff\1\56\5\uffff\1\0\1\uffff\2\0\2\60\7\uffff\1\124\1\122\1\uffff\1\105\1\120\1\115\1\126\2\114\1\117\1\123\1\60\1\114\2\104\11\uffff\1\125\1\105\1\114\1\117\1\105\1\122\2\uffff\1\111\1\104\1\123\1\117\1\122\2\111\3\60\1\124\1\60\1\101\1\115\1\124\1\105\1\101\1\124\1\111\2\101\1\117\1\116\1\60\1\111\1\104\1\114\1\122\7\uffff\1\105\10\uffff\2\0\1\uffff\2\0\2\uffff\1\60\2\uffff\1\103\1\107\1\101\1\110\1\115\1\123\1\116\1\60\1\105\1\114\1\103\1\105\1\101\1\120\1\124\1\60\1\105\1\uffff\4\60\1\117\2\125\1\105\1\116\1\123\1\115\1\114\1\124\1\105\1\114\1\123\1\122\1\60\1\105\1\106\1\111\1\116\1\117\1\111\1\105\3\uffff\1\111\1\105\1\uffff\1\104\1\111\1\110\1\116\1\104\1\60\1\120\1\116\2\122\1\107\1\uffff\1\116\1\105\1\60\1\105\1\114\1\60\1\114\1\0\1\uffff\1\0\1\110\1\105\1\124\1\105\1\111\1\124\1\101\1\124\1\uffff\3\60\1\124\1\103\1\60\1\111\1\116\1\uffff\1\122\1\110\3\uffff\1\124\1\uffff\1\126\1\122\1\103\2\60\1\105\1\60\1\104\1\105\2\101\1\124\1\101\1\60\1\uffff\1\60\1\111\1\117\1\107\1\116\1\125\1\116\1\130\1\117\1\122\1\60\1\124\1\60\1\105\1\60\1\105\1\uffff\2\60\2\124\1\114\2\60\1\uffff\2\60\1\uffff\1\104\2\60\1\105\1\122\1\124\1\122\1\111\1\60\2\uffff\1\116\1\uffff\1\105\1\110\1\uffff\1\116\1\104\1\124\1\117\1\111\1\105\1\116\1\105\2\uffff\1\60\1\uffff\1\124\1\122\1\103\1\111\1\123\1\103\2\uffff\1\114\1\104\2\60\1\105\1\104\1\60\1\116\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\122\2\uffff\1\60\2\105\4\uffff\1\60\2\uffff\3\60\1\101\1\116\1\uffff\1\104\2\60\1\103\1\111\1\60\1\122\1\117\3\60\1\uffff\1\105\1\60\1\110\1\116\1\60\1\124\1\105\1\111\2\uffff\2\60\1\uffff\1\101\3\uffff\1\123\1\60\1\uffff\1\123\1\60\4\uffff\1\111\1\123\1\111\2\uffff\1\124\1\116\1\uffff\1\124\1\116\3\uffff\1\122\1\uffff\2\60\1\uffff\2\60\1\103\2\uffff\1\114\1\60\1\uffff\1\124\1\uffff\1\116\1\60\1\116\1\60\1\107\1\105\1\123\1\115\4\uffff\2\60\1\uffff\1\120\1\124\1\uffff\1\107\1\uffff\1\60\1\123\1\110\1\111\2\uffff\1\101\2\60\1\uffff\1\124\1\111\1\116\1\124\2\uffff\2\120\1\101\1\110\1\101\1\60\1\124\1\60\1\124\1\uffff\1\117\1\uffff\1\110\1\122\1\123\2\60\2\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\76\1\75\1\uffff\1\105\1\131\1\122\1\123\1\105\1\176\1\75\1\uffff\1\57\1\uffff\2\122\2\uffff\1\130\1\122\2\123\1\122\1\117\1\111\1\105\1\124\1\131\1\117\1\125\1\117\7\uffff\1\111\1\uffff\1\56\5\uffff\1\uffff\1\uffff\2\uffff\1\170\1\145\7\uffff\1\124\1\122\1\uffff\1\105\1\120\1\125\1\126\1\123\1\124\1\117\1\123\1\172\1\114\1\131\1\124\11\uffff\1\125\1\105\1\114\1\117\1\114\1\122\2\uffff\1\124\1\104\1\123\1\117\1\122\1\111\1\127\3\172\1\124\1\172\1\101\1\115\1\124\1\105\1\101\1\124\1\111\2\101\1\117\1\116\1\172\1\111\1\124\1\114\1\122\7\uffff\1\105\10\uffff\2\uffff\1\uffff\2\uffff\2\uffff\1\145\2\uffff\1\103\1\107\1\101\1\110\1\115\1\124\1\116\1\172\1\105\1\114\1\103\1\105\1\101\1\120\1\124\1\172\1\105\1\uffff\4\172\1\117\2\125\1\105\1\116\1\123\1\115\1\114\1\124\1\105\1\114\1\123\1\122\1\172\1\105\1\106\1\111\1\116\1\121\1\111\1\105\3\uffff\1\111\1\105\1\uffff\1\104\1\111\1\110\1\122\1\104\1\172\1\120\1\116\2\122\1\107\1\uffff\1\116\1\105\1\172\1\105\1\114\1\172\1\114\1\uffff\1\uffff\1\uffff\1\110\1\105\1\124\1\105\1\111\1\124\1\101\1\124\1\uffff\3\172\1\124\1\103\1\172\1\111\1\116\1\uffff\1\122\1\110\3\uffff\1\124\1\uffff\1\126\1\122\1\103\2\172\1\105\1\172\1\104\1\105\2\101\1\124\1\101\1\172\1\uffff\1\172\1\111\1\117\1\107\1\116\1\125\1\116\1\130\1\117\1\122\1\172\1\124\1\172\1\105\1\172\1\105\1\uffff\2\172\2\124\1\114\2\172\1\uffff\2\172\1\uffff\1\104\2\172\1\105\1\122\1\124\1\122\1\111\1\172\2\uffff\1\116\1\uffff\1\105\1\110\1\uffff\1\116\1\104\1\124\1\117\1\111\1\105\1\116\1\105\2\uffff\1\172\1\uffff\1\124\1\122\1\103\1\111\1\123\1\103\2\uffff\1\114\1\104\2\172\1\105\1\104\1\172\1\116\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\1\122\2\uffff\1\172\2\105\4\uffff\1\172\2\uffff\3\172\1\101\1\116\1\uffff\1\104\2\172\1\103\1\111\1\172\1\122\1\117\3\172\1\uffff\1\105\1\172\1\110\1\116\1\172\1\124\1\105\1\111\2\uffff\2\172\1\uffff\1\101\3\uffff\1\123\1\172\1\uffff\1\123\1\172\4\uffff\1\111\1\123\1\111\2\uffff\1\124\1\116\1\uffff\1\124\1\116\3\uffff\1\122\1\uffff\2\172\1\uffff\2\172\1\103\2\uffff\1\114\1\172\1\uffff\1\124\1\uffff\1\116\1\172\1\116\1\172\1\107\1\105\1\123\1\115\4\uffff\2\172\1\uffff\1\120\1\124\1\uffff\1\107\1\uffff\1\172\1\123\1\110\1\111\2\uffff\1\101\2\172\1\uffff\1\124\1\111\1\116\1\124\2\uffff\2\120\1\101\1\110\1\101\1\172\1\124\1\172\1\124\1\uffff\1\117\1\uffff\1\110\1\122\1\123\2\172\2\uffff";
    static final String DFA20_acceptS =
        "\3\uffff\1\3\7\uffff\1\21\1\uffff\1\23\2\uffff\1\26\1\27\15\uffff\1\131\1\132\1\133\1\134\1\135\1\136\1\140\1\uffff\1\143\1\uffff\1\147\1\150\1\151\1\152\1\153\1\uffff\1\156\4\uffff\1\164\1\15\1\16\1\1\1\17\1\2\1\3\2\uffff\1\153\14\uffff\1\145\1\14\1\137\1\20\1\21\1\154\1\155\1\22\1\23\6\uffff\1\26\1\27\34\uffff\1\131\1\132\1\133\1\134\1\135\1\136\1\140\1\uffff\1\143\1\144\1\146\1\147\1\150\1\151\1\152\1\156\2\uffff\1\157\2\uffff\1\157\1\160\1\uffff\1\161\1\162\21\uffff\1\55\31\uffff\1\67\1\45\1\41\2\uffff\1\105\13\uffff\1\73\10\uffff\1\157\11\uffff\1\51\10\uffff\1\11\2\uffff\1\37\1\107\1\120\1\uffff\1\13\16\uffff\1\126\20\uffff\1\62\7\uffff\1\110\2\uffff\1\106\11\uffff\1\124\1\141\1\uffff\1\7\2\uffff\1\42\10\uffff\1\24\1\130\1\uffff\1\54\6\uffff\1\112\1\125\11\uffff\1\50\1\uffff\1\52\1\uffff\1\127\1\uffff\1\74\1\77\3\uffff\1\76\1\101\1\121\1\114\1\uffff\1\4\1\61\5\uffff\1\115\13\uffff\1\25\10\uffff\1\33\1\36\2\uffff\1\40\1\uffff\1\72\1\75\1\102\2\uffff\1\100\2\uffff\1\142\1\5\1\30\1\35\3\uffff\1\63\1\64\2\uffff\1\44\2\uffff\1\65\1\71\1\123\1\uffff\1\116\2\uffff\1\47\3\uffff\1\46\1\60\2\uffff\1\111\1\uffff\1\122\10\uffff\1\66\1\31\1\117\1\32\2\uffff\1\53\2\uffff\1\113\1\uffff\1\70\4\uffff\1\34\1\57\3\uffff\1\10\4\uffff\1\43\1\6\11\uffff\1\12\1\uffff\1\103\5\uffff\1\56\1\104";
    static final String DFA20_specialS =
        "\1\0\55\uffff\1\7\1\uffff\1\3\1\6\125\uffff\1\1\1\5\1\uffff\1\2\1\11\111\uffff\1\4\1\uffff\1\10\u0102\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\64\2\57\2\64\1\57\22\64\1\57\1\21\1\60\1\64\1\53\1\15\1\64\1\61\1\40\1\41\1\13\1\12\1\44\1\3\1\50\1\14\1\62\11\63\1\47\1\37\1\1\1\11\1\2\1\20\1\64\1\7\1\33\1\5\1\6\1\22\1\17\1\55\1\31\1\25\1\34\1\55\1\27\1\4\1\35\1\26\1\23\1\55\1\10\1\32\1\16\1\24\1\55\1\30\1\36\1\46\1\55\1\42\1\64\1\43\1\54\1\55\1\56\32\55\1\51\1\45\1\52\uff82\64",
            "\1\66\1\65",
            "\1\70",
            "",
            "\1\73\3\uffff\1\74",
            "\1\102\15\uffff\1\100\2\uffff\1\76\1\101\5\uffff\1\77",
            "\1\103\3\uffff\1\105\10\uffff\1\104",
            "\1\107\1\uffff\1\110\4\uffff\1\106",
            "\1\111",
            "\1\112",
            "\1\114",
            "",
            "\1\117\4\uffff\1\120",
            "",
            "\1\124\11\uffff\1\123",
            "\1\125\7\uffff\1\127\5\uffff\1\130\2\uffff\1\126",
            "",
            "",
            "\1\135\1\uffff\1\134\11\uffff\1\133",
            "\1\137\14\uffff\1\136",
            "\1\141\4\uffff\1\140",
            "\1\142\4\uffff\1\143",
            "\1\144\1\uffff\1\145\1\uffff\1\146",
            "\1\150\5\uffff\1\147",
            "\1\152\1\151",
            "\1\153",
            "\1\156\1\uffff\1\154\2\uffff\1\160\1\161\1\uffff\1\155\10\uffff\1\157",
            "\1\162",
            "\1\163",
            "\1\164\5\uffff\1\165",
            "\1\166",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\176",
            "",
            "\1\u0080",
            "",
            "",
            "",
            "",
            "",
            "\0\75",
            "",
            "\42\u0088\1\u0089\71\u0088\1\u0087\uffa3\u0088",
            "\47\u008b\1\u008c\64\u008b\1\u008a\uffa3\u008b",
            "\12\u008e\36\uffff\1\u008d\14\uffff\1\u0090\22\uffff\1\u008d",
            "\12\u008e\53\uffff\1\u0090",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095\1\u0096\6\uffff\1\u0097",
            "\1\u0098",
            "\1\u009a\6\uffff\1\u0099",
            "\1\u009c\6\uffff\1\u009b\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\75\7\uffff\2\75\1\u00a0\17\75\1\u00a1\7\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u00a3",
            "\1\u00a4\24\uffff\1\u00a5",
            "\1\u00a9\7\uffff\1\u00a6\1\u00a7\6\uffff\1\u00a8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae\6\uffff\1\u00af",
            "\1\u00b0",
            "",
            "",
            "\1\u00b2\6\uffff\1\u00b1\3\uffff\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9\15\uffff\1\u00ba",
            "\12\75\7\uffff\3\75\1\u00bb\26\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u00bf",
            "\12\75\7\uffff\3\75\1\u00c0\26\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u00ce",
            "\1\u00cf\11\uffff\1\u00d1\5\uffff\1\u00d0",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d4",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\u00d5",
            "\42\u0088\1\u0089\71\u0088\1\u0087\uffa3\u0088",
            "",
            "\0\u00d7",
            "\47\u008b\1\u008c\64\u008b\1\u008a\uffa3\u008b",
            "",
            "",
            "\12\u008e\53\uffff\1\u0090",
            "",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd\1\u00de",
            "\1\u00df",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\12\75\7\uffff\4\75\1\u00e8\25\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u00ea",
            "",
            "\12\75\7\uffff\22\75\1\u00eb\7\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\1\u00ef\31\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\75\7\uffff\22\75\1\u00fe\7\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104\1\uffff\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "",
            "",
            "",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010e\3\uffff\1\u010d",
            "\1\u010f",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u0119",
            "\1\u011a",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u011c",
            "\42\u0088\1\u0089\71\u0088\1\u0087\uffa3\u0088",
            "",
            "\47\u008b\1\u008c\64\u008b\1\u008a\uffa3\u008b",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\4\75\1\u0127\25\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u0129",
            "\1\u012a",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u012c",
            "\1\u012d",
            "",
            "\1\u012e",
            "\1\u012f",
            "",
            "",
            "",
            "\1\u0130",
            "",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u0136",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u014a",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u014c",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u014e",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\1\u0158",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "",
            "\1\u0161",
            "",
            "\1\u0162",
            "\1\u0163",
            "",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "",
            "",
            "\1\u0173",
            "\1\u0174",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u0177",
            "\1\u0178",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u017a",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\1\u017e",
            "",
            "",
            "\12\75\7\uffff\22\75\1\u017f\7\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u0181",
            "\1\u0182",
            "",
            "",
            "",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u0187",
            "\1\u0188",
            "",
            "\1\u0189",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u018c",
            "\1\u018d",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u018f",
            "\1\u0190",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\1\u0194",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u0196",
            "\1\u0197",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\1\u019e",
            "",
            "",
            "",
            "\1\u019f",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\1\u01a1",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "",
            "",
            "",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "",
            "",
            "\1\u01a6",
            "\1\u01a7",
            "",
            "\1\u01a8",
            "\1\u01a9",
            "",
            "",
            "",
            "\1\u01aa",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u01af",
            "",
            "",
            "\1\u01b0",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\1\u01b2",
            "",
            "\1\u01b3",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u01b5",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "",
            "",
            "",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\1\u01bd",
            "\1\u01be",
            "",
            "\1\u01bf",
            "",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "",
            "",
            "\1\u01c4",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "",
            "",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u01d1",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\u01d3",
            "",
            "\1\u01d4",
            "",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\75\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_STRING_LITERAL | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='<') ) {s = 1;}

                        else if ( (LA20_0=='>') ) {s = 2;}

                        else if ( (LA20_0=='-') ) {s = 3;}

                        else if ( (LA20_0=='M') ) {s = 4;}

                        else if ( (LA20_0=='C') ) {s = 5;}

                        else if ( (LA20_0=='D') ) {s = 6;}

                        else if ( (LA20_0=='A') ) {s = 7;}

                        else if ( (LA20_0=='R') ) {s = 8;}

                        else if ( (LA20_0=='=') ) {s = 9;}

                        else if ( (LA20_0=='+') ) {s = 10;}

                        else if ( (LA20_0=='*') ) {s = 11;}

                        else if ( (LA20_0=='/') ) {s = 12;}

                        else if ( (LA20_0=='%') ) {s = 13;}

                        else if ( (LA20_0=='T') ) {s = 14;}

                        else if ( (LA20_0=='F') ) {s = 15;}

                        else if ( (LA20_0=='?') ) {s = 16;}

                        else if ( (LA20_0=='!') ) {s = 17;}

                        else if ( (LA20_0=='E') ) {s = 18;}

                        else if ( (LA20_0=='P') ) {s = 19;}

                        else if ( (LA20_0=='U') ) {s = 20;}

                        else if ( (LA20_0=='I') ) {s = 21;}

                        else if ( (LA20_0=='O') ) {s = 22;}

                        else if ( (LA20_0=='L') ) {s = 23;}

                        else if ( (LA20_0=='W') ) {s = 24;}

                        else if ( (LA20_0=='H') ) {s = 25;}

                        else if ( (LA20_0=='S') ) {s = 26;}

                        else if ( (LA20_0=='B') ) {s = 27;}

                        else if ( (LA20_0=='J') ) {s = 28;}

                        else if ( (LA20_0=='N') ) {s = 29;}

                        else if ( (LA20_0=='X') ) {s = 30;}

                        else if ( (LA20_0==';') ) {s = 31;}

                        else if ( (LA20_0=='(') ) {s = 32;}

                        else if ( (LA20_0==')') ) {s = 33;}

                        else if ( (LA20_0=='[') ) {s = 34;}

                        else if ( (LA20_0==']') ) {s = 35;}

                        else if ( (LA20_0==',') ) {s = 36;}

                        else if ( (LA20_0=='|') ) {s = 37;}

                        else if ( (LA20_0=='Y') ) {s = 38;}

                        else if ( (LA20_0==':') ) {s = 39;}

                        else if ( (LA20_0=='.') ) {s = 40;}

                        else if ( (LA20_0=='{') ) {s = 41;}

                        else if ( (LA20_0=='}') ) {s = 42;}

                        else if ( (LA20_0=='$') ) {s = 43;}

                        else if ( (LA20_0=='^') ) {s = 44;}

                        else if ( (LA20_0=='G'||LA20_0=='K'||LA20_0=='Q'||LA20_0=='V'||LA20_0=='Z'||LA20_0=='_'||(LA20_0>='a' && LA20_0<='z')) ) {s = 45;}

                        else if ( (LA20_0=='`') ) {s = 46;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 47;}

                        else if ( (LA20_0=='\"') ) {s = 48;}

                        else if ( (LA20_0=='\'') ) {s = 49;}

                        else if ( (LA20_0=='0') ) {s = 50;}

                        else if ( ((LA20_0>='1' && LA20_0<='9')) ) {s = 51;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='#'||LA20_0=='&'||LA20_0=='@'||LA20_0=='\\'||(LA20_0>='~' && LA20_0<='\uFFFF')) ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_135 = input.LA(1);

                        s = -1;
                        if ( ((LA20_135>='\u0000' && LA20_135<='\uFFFF')) ) {s = 213;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_138 = input.LA(1);

                        s = -1;
                        if ( ((LA20_138>='\u0000' && LA20_138<='\uFFFF')) ) {s = 215;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_48 = input.LA(1);

                        s = -1;
                        if ( (LA20_48=='\\') ) {s = 135;}

                        else if ( ((LA20_48>='\u0000' && LA20_48<='!')||(LA20_48>='#' && LA20_48<='[')||(LA20_48>=']' && LA20_48<='\uFFFF')) ) {s = 136;}

                        else if ( (LA20_48=='\"') ) {s = 137;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_213 = input.LA(1);

                        s = -1;
                        if ( (LA20_213=='\"') ) {s = 137;}

                        else if ( (LA20_213=='\\') ) {s = 135;}

                        else if ( ((LA20_213>='\u0000' && LA20_213<='!')||(LA20_213>='#' && LA20_213<='[')||(LA20_213>=']' && LA20_213<='\uFFFF')) ) {s = 136;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_136 = input.LA(1);

                        s = -1;
                        if ( (LA20_136=='\"') ) {s = 137;}

                        else if ( (LA20_136=='\\') ) {s = 135;}

                        else if ( ((LA20_136>='\u0000' && LA20_136<='!')||(LA20_136>='#' && LA20_136<='[')||(LA20_136>=']' && LA20_136<='\uFFFF')) ) {s = 136;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_49 = input.LA(1);

                        s = -1;
                        if ( (LA20_49=='\\') ) {s = 138;}

                        else if ( ((LA20_49>='\u0000' && LA20_49<='&')||(LA20_49>='(' && LA20_49<='[')||(LA20_49>=']' && LA20_49<='\uFFFF')) ) {s = 139;}

                        else if ( (LA20_49=='\'') ) {s = 140;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_46 = input.LA(1);

                        s = -1;
                        if ( ((LA20_46>='\u0000' && LA20_46<='\uFFFF')) ) {s = 61;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA20_215 = input.LA(1);

                        s = -1;
                        if ( (LA20_215=='\'') ) {s = 140;}

                        else if ( (LA20_215=='\\') ) {s = 138;}

                        else if ( ((LA20_215>='\u0000' && LA20_215<='&')||(LA20_215>='(' && LA20_215<='[')||(LA20_215>=']' && LA20_215<='\uFFFF')) ) {s = 139;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA20_139 = input.LA(1);

                        s = -1;
                        if ( (LA20_139=='\'') ) {s = 140;}

                        else if ( (LA20_139=='\\') ) {s = 138;}

                        else if ( ((LA20_139>='\u0000' && LA20_139<='&')||(LA20_139>='(' && LA20_139<='[')||(LA20_139>=']' && LA20_139<='\uFFFF')) ) {s = 139;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}