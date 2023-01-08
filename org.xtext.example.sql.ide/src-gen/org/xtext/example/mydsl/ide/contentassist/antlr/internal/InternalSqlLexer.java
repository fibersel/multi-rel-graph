package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlLexer extends Lexer {
    public static final int RULE_HEX=5;
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=4;
    public static final int RULE_DECIMAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_STRING_LITERAL=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
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

    // delegates
    // delegators

    public InternalSqlLexer() {;} 
    public InternalSqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalSql.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:11:7: ( 'TRUE' )
            // InternalSql.g:11:9: 'TRUE'
            {
            match("TRUE"); 


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
            // InternalSql.g:12:7: ( 'FALSE' )
            // InternalSql.g:12:9: 'FALSE'
            {
            match("FALSE"); 


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
            // InternalSql.g:13:7: ( '<' )
            // InternalSql.g:13:9: '<'
            {
            match('<'); 

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
            // InternalSql.g:14:7: ( '>' )
            // InternalSql.g:14:9: '>'
            {
            match('>'); 

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
            // InternalSql.g:15:7: ( '=' )
            // InternalSql.g:15:9: '='
            {
            match('='); 

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
            // InternalSql.g:16:7: ( '>=' )
            // InternalSql.g:16:9: '>='
            {
            match(">="); 


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
            // InternalSql.g:17:7: ( '<=' )
            // InternalSql.g:17:9: '<='
            {
            match("<="); 


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
            // InternalSql.g:18:7: ( '<>' )
            // InternalSql.g:18:9: '<>'
            {
            match("<>"); 


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
            // InternalSql.g:19:7: ( '+' )
            // InternalSql.g:19:9: '+'
            {
            match('+'); 

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
            // InternalSql.g:20:7: ( '-' )
            // InternalSql.g:20:9: '-'
            {
            match('-'); 

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
            // InternalSql.g:21:7: ( '*' )
            // InternalSql.g:21:9: '*'
            {
            match('*'); 

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
            // InternalSql.g:22:7: ( '/' )
            // InternalSql.g:22:9: '/'
            {
            match('/'); 

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
            // InternalSql.g:23:7: ( '%' )
            // InternalSql.g:23:9: '%'
            {
            match('%'); 

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
            // InternalSql.g:24:7: ( ';' )
            // InternalSql.g:24:9: ';'
            {
            match(';'); 

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
            // InternalSql.g:25:7: ( 'SELECT' )
            // InternalSql.g:25:9: 'SELECT'
            {
            match("SELECT"); 


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
            // InternalSql.g:26:7: ( ',' )
            // InternalSql.g:26:9: ','
            {
            match(','); 

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
            // InternalSql.g:27:7: ( 'FROM' )
            // InternalSql.g:27:9: 'FROM'
            {
            match("FROM"); 


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
            // InternalSql.g:28:7: ( 'JOIN' )
            // InternalSql.g:28:9: 'JOIN'
            {
            match("JOIN"); 


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
            // InternalSql.g:29:7: ( 'ON' )
            // InternalSql.g:29:9: 'ON'
            {
            match("ON"); 


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
            // InternalSql.g:30:7: ( '(' )
            // InternalSql.g:30:9: '('
            {
            match('('); 

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
            // InternalSql.g:31:7: ( ')' )
            // InternalSql.g:31:9: ')'
            {
            match(')'); 

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
            // InternalSql.g:32:7: ( 'WHERE' )
            // InternalSql.g:32:9: 'WHERE'
            {
            match("WHERE"); 


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
            // InternalSql.g:33:7: ( 'OR' )
            // InternalSql.g:33:9: 'OR'
            {
            match("OR"); 


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
            // InternalSql.g:34:7: ( 'AND' )
            // InternalSql.g:34:9: 'AND'
            {
            match("AND"); 


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
            // InternalSql.g:35:7: ( 'NOT' )
            // InternalSql.g:35:9: 'NOT'
            {
            match("NOT"); 


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
            // InternalSql.g:36:7: ( 'GROUP' )
            // InternalSql.g:36:9: 'GROUP'
            {
            match("GROUP"); 


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
            // InternalSql.g:37:7: ( 'BY' )
            // InternalSql.g:37:9: 'BY'
            {
            match("BY"); 


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
            // InternalSql.g:38:7: ( 'HAVING' )
            // InternalSql.g:38:9: 'HAVING'
            {
            match("HAVING"); 


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
            // InternalSql.g:39:7: ( '=~' )
            // InternalSql.g:39:9: '=~'
            {
            match("=~"); 


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
            // InternalSql.g:40:7: ( 'IN' )
            // InternalSql.g:40:9: 'IN'
            {
            match("IN"); 


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
            // InternalSql.g:41:7: ( 'STARTS' )
            // InternalSql.g:41:9: 'STARTS'
            {
            match("STARTS"); 


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
            // InternalSql.g:42:7: ( 'WITH' )
            // InternalSql.g:42:9: 'WITH'
            {
            match("WITH"); 


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
            // InternalSql.g:43:7: ( 'ENDS' )
            // InternalSql.g:43:9: 'ENDS'
            {
            match("ENDS"); 


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
            // InternalSql.g:44:7: ( 'CONTAINS' )
            // InternalSql.g:44:9: 'CONTAINS'
            {
            match("CONTAINS"); 


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
            // InternalSql.g:45:7: ( 'IS' )
            // InternalSql.g:45:9: 'IS'
            {
            match("IS"); 


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
            // InternalSql.g:46:7: ( 'NULL' )
            // InternalSql.g:46:9: 'NULL'
            {
            match("NULL"); 


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
            // InternalSql.g:47:7: ( '.' )
            // InternalSql.g:47:9: '.'
            {
            match('.'); 

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
            // InternalSql.g:48:7: ( 'COUNT' )
            // InternalSql.g:48:9: 'COUNT'
            {
            match("COUNT"); 


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
            // InternalSql.g:49:7: ( 'XOR' )
            // InternalSql.g:49:9: 'XOR'
            {
            match("XOR"); 


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
            // InternalSql.g:50:7: ( '^' )
            // InternalSql.g:50:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "RULE_STRING_LITERAL"
    public final void mRULE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:6143:21: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSql.g:6143:23: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSql.g:6143:23: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\"') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\'') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSql.g:6143:24: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSql.g:6143:28: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop1:
                    do {
                        int alt1=3;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='\\') ) {
                            alt1=1;
                        }
                        else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                            alt1=2;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSql.g:6143:29: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSql.g:6143:36: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop1;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSql.g:6143:56: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSql.g:6143:61: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalSql.g:6143:62: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSql.g:6143:69: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop2;
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
            // InternalSql.g:6145:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'A' .. 'F' )+ )
            // InternalSql.g:6145:12: ( '0x' | '0X' ) ( '0' .. '9' | 'A' .. 'F' )+
            {
            // InternalSql.g:6145:12: ( '0x' | '0X' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='x') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='X') ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSql.g:6145:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalSql.g:6145:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalSql.g:6145:24: ( '0' .. '9' | 'A' .. 'F' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='F')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSql.g:
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // InternalSql.g:6147:10: ( '0' .. '9' ( '0' .. '9' )* )
            // InternalSql.g:6147:12: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // InternalSql.g:6147:21: ( '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSql.g:6147:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // InternalSql.g:6149:14: ( RULE_INT ( 'e' ( '+' | '-' )? RULE_INT )? )
            // InternalSql.g:6149:16: RULE_INT ( 'e' ( '+' | '-' )? RULE_INT )?
            {
            mRULE_INT(); 
            // InternalSql.g:6149:25: ( 'e' ( '+' | '-' )? RULE_INT )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='e') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSql.g:6149:26: 'e' ( '+' | '-' )? RULE_INT
                    {
                    match('e'); 
                    // InternalSql.g:6149:30: ( '+' | '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalSql.g:
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:6151:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalSql.g:6151:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalSql.g:6151:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSql.g:6151:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalSql.g:6151:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSql.g:
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
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:6153:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalSql.g:6153:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalSql.g:6153:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSql.g:6153:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalSql.g:6153:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSql.g:6153:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSql.g:6153:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalSql.g:6153:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalSql.g:6153:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSql.g:6153:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalSql.g:6153:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop12;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:6155:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalSql.g:6155:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalSql.g:6155:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSql.g:6155:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
            // InternalSql.g:6157:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalSql.g:6157:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalSql.g:6157:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSql.g:6157:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop15;
                }
            } while (true);

            // InternalSql.g:6157:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSql.g:6157:41: ( '\\r' )? '\\n'
                    {
                    // InternalSql.g:6157:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalSql.g:6157:41: '\\r'
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
            // InternalSql.g:6159:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalSql.g:6159:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalSql.g:6159:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSql.g:
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalSql.g:6161:16: ( . )
            // InternalSql.g:6161:18: .
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
        // InternalSql.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_STRING_LITERAL | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=50;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalSql.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalSql.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalSql.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalSql.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalSql.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalSql.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalSql.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalSql.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalSql.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalSql.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalSql.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalSql.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalSql.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalSql.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalSql.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalSql.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalSql.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalSql.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalSql.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalSql.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalSql.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalSql.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalSql.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalSql.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalSql.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalSql.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalSql.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalSql.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalSql.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // InternalSql.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // InternalSql.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // InternalSql.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // InternalSql.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // InternalSql.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // InternalSql.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // InternalSql.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // InternalSql.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // InternalSql.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // InternalSql.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // InternalSql.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // InternalSql.g:1:250: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 42 :
                // InternalSql.g:1:270: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 43 :
                // InternalSql.g:1:279: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 44 :
                // InternalSql.g:1:288: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 45 :
                // InternalSql.g:1:301: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 46 :
                // InternalSql.g:1:309: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // InternalSql.g:1:321: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // InternalSql.g:1:337: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 49 :
                // InternalSql.g:1:353: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 50 :
                // InternalSql.g:1:361: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\2\46\1\53\1\55\1\57\3\uffff\1\65\2\uffff\1\46\1\uffff\2\46\2\uffff\11\46\1\uffff\1\46\1\116\2\44\2\127\3\uffff\1\46\1\uffff\2\46\17\uffff\2\46\1\uffff\1\46\1\140\1\141\2\uffff\6\46\1\150\1\46\1\152\1\153\2\46\1\uffff\1\46\10\uffff\1\127\3\uffff\6\46\2\uffff\2\46\1\173\1\174\2\46\1\uffff\1\46\2\uffff\3\46\1\u0083\3\uffff\1\u0084\1\46\1\u0086\2\46\1\u0089\1\46\1\u008b\2\uffff\1\u008c\2\46\1\u008f\2\46\2\uffff\1\u0092\1\uffff\2\46\1\uffff\1\u0095\2\uffff\1\u0096\1\46\1\uffff\1\46\1\u0099\1\uffff\1\u009a\1\u009b\2\uffff\1\u009c\1\46\4\uffff\1\46\1\u009f\1\uffff";
    static final String DFA19_eofS =
        "\u00a0\uffff";
    static final String DFA19_minS =
        "\1\0\1\122\1\101\2\75\1\176\3\uffff\1\52\2\uffff\1\105\1\uffff\1\117\1\116\2\uffff\1\110\1\116\1\117\1\122\1\131\1\101\2\116\1\117\1\uffff\1\117\1\101\2\0\2\60\3\uffff\1\125\1\uffff\1\114\1\117\17\uffff\1\114\1\101\1\uffff\1\111\2\60\2\uffff\1\105\1\124\1\104\1\124\1\114\1\117\1\60\1\126\2\60\1\104\1\116\1\uffff\1\122\1\uffff\2\0\1\uffff\2\0\2\uffff\1\60\3\uffff\1\105\1\123\1\115\1\105\1\122\1\116\2\uffff\1\122\1\110\2\60\1\114\1\125\1\uffff\1\111\2\uffff\1\123\1\124\1\116\1\60\1\0\1\uffff\1\0\1\60\1\105\1\60\1\103\1\124\1\60\1\105\1\60\2\uffff\1\60\1\120\1\116\1\60\1\101\1\124\2\uffff\1\60\1\uffff\1\124\1\123\1\uffff\1\60\2\uffff\1\60\1\107\1\uffff\1\111\1\60\1\uffff\2\60\2\uffff\1\60\1\116\4\uffff\1\123\1\60\1\uffff";
    static final String DFA19_maxS =
        "\1\uffff\2\122\1\76\1\75\1\176\3\uffff\1\57\2\uffff\1\124\1\uffff\1\117\1\122\2\uffff\1\111\1\116\1\125\1\122\1\131\1\101\1\123\1\116\1\117\1\uffff\1\117\1\172\2\uffff\1\170\1\145\3\uffff\1\125\1\uffff\1\114\1\117\17\uffff\1\114\1\101\1\uffff\1\111\2\172\2\uffff\1\105\1\124\1\104\1\124\1\114\1\117\1\172\1\126\2\172\1\104\1\125\1\uffff\1\122\1\uffff\2\uffff\1\uffff\2\uffff\2\uffff\1\145\3\uffff\1\105\1\123\1\115\1\105\1\122\1\116\2\uffff\1\122\1\110\2\172\1\114\1\125\1\uffff\1\111\2\uffff\1\123\1\124\1\116\1\172\1\uffff\1\uffff\1\uffff\1\172\1\105\1\172\1\103\1\124\1\172\1\105\1\172\2\uffff\1\172\1\120\1\116\1\172\1\101\1\124\2\uffff\1\172\1\uffff\1\124\1\123\1\uffff\1\172\2\uffff\1\172\1\107\1\uffff\1\111\1\172\1\uffff\2\172\2\uffff\1\172\1\116\4\uffff\1\123\1\172\1\uffff";
    static final String DFA19_acceptS =
        "\6\uffff\1\11\1\12\1\13\1\uffff\1\15\1\16\1\uffff\1\20\2\uffff\1\24\1\25\11\uffff\1\45\6\uffff\1\55\1\61\1\62\1\uffff\1\55\2\uffff\1\7\1\10\1\3\1\6\1\4\1\35\1\5\1\11\1\12\1\13\1\57\1\60\1\14\1\15\1\16\2\uffff\1\20\3\uffff\1\24\1\25\14\uffff\1\45\1\uffff\1\50\2\uffff\1\51\2\uffff\1\51\1\52\1\uffff\1\53\1\54\1\61\6\uffff\1\23\1\27\6\uffff\1\33\1\uffff\1\36\1\43\5\uffff\1\51\11\uffff\1\30\1\31\6\uffff\1\47\1\1\1\uffff\1\21\2\uffff\1\22\1\uffff\1\40\1\44\2\uffff\1\41\2\uffff\1\2\2\uffff\1\26\1\32\2\uffff\1\46\1\17\1\37\1\34\2\uffff\1\42";
    static final String DFA19_specialS =
        "\1\5\35\uffff\1\10\1\1\57\uffff\1\0\1\4\1\uffff\1\2\1\7\34\uffff\1\3\1\uffff\1\6\55\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\44\1\36\2\44\1\12\1\44\1\37\1\20\1\21\1\10\1\6\1\15\1\7\1\33\1\11\1\40\11\41\1\44\1\13\1\3\1\5\1\4\2\44\1\23\1\26\1\32\1\42\1\31\1\2\1\25\1\27\1\30\1\16\3\42\1\24\1\17\3\42\1\14\1\1\2\42\1\22\1\34\2\42\3\44\1\35\1\42\1\44\32\42\uff85\44",
            "\1\45",
            "\1\47\20\uffff\1\50",
            "\1\51\1\52",
            "\1\54",
            "\1\56",
            "",
            "",
            "",
            "\1\63\4\uffff\1\64",
            "",
            "",
            "\1\70\16\uffff\1\71",
            "",
            "\1\73",
            "\1\74\3\uffff\1\75",
            "",
            "",
            "\1\100\1\101",
            "\1\102",
            "\1\103\5\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110\4\uffff\1\111",
            "\1\112",
            "\1\113",
            "",
            "\1\115",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\42\120\1\121\71\120\1\117\uffa3\120",
            "\47\123\1\124\64\123\1\122\uffa3\123",
            "\12\126\36\uffff\1\125\14\uffff\1\130\22\uffff\1\125",
            "\12\126\53\uffff\1\130",
            "",
            "",
            "",
            "\1\132",
            "",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\151",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\154",
            "\1\155\6\uffff\1\156",
            "",
            "\1\157",
            "",
            "\0\160",
            "\42\120\1\121\71\120\1\117\uffa3\120",
            "",
            "\0\162",
            "\47\123\1\124\64\123\1\122\uffa3\123",
            "",
            "",
            "\12\126\53\uffff\1\130",
            "",
            "",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "",
            "\1\171",
            "\1\172",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\42\120\1\121\71\120\1\117\uffa3\120",
            "",
            "\47\123\1\124\64\123\1\122\uffa3\123",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0085",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0087",
            "\1\u0088",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008a",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u008d",
            "\1\u008e",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0090",
            "\1\u0091",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u0093",
            "\1\u0094",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0097",
            "",
            "\1\u0098",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u009d",
            "",
            "",
            "",
            "",
            "\1\u009e",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | RULE_STRING_LITERAL | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_79 = input.LA(1);

                        s = -1;
                        if ( ((LA19_79>='\u0000' && LA19_79<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_31 = input.LA(1);

                        s = -1;
                        if ( (LA19_31=='\\') ) {s = 82;}

                        else if ( ((LA19_31>='\u0000' && LA19_31<='&')||(LA19_31>='(' && LA19_31<='[')||(LA19_31>=']' && LA19_31<='\uFFFF')) ) {s = 83;}

                        else if ( (LA19_31=='\'') ) {s = 84;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_82 = input.LA(1);

                        s = -1;
                        if ( ((LA19_82>='\u0000' && LA19_82<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_112 = input.LA(1);

                        s = -1;
                        if ( (LA19_112=='\"') ) {s = 81;}

                        else if ( (LA19_112=='\\') ) {s = 79;}

                        else if ( ((LA19_112>='\u0000' && LA19_112<='!')||(LA19_112>='#' && LA19_112<='[')||(LA19_112>=']' && LA19_112<='\uFFFF')) ) {s = 80;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_80 = input.LA(1);

                        s = -1;
                        if ( (LA19_80=='\"') ) {s = 81;}

                        else if ( (LA19_80=='\\') ) {s = 79;}

                        else if ( ((LA19_80>='\u0000' && LA19_80<='!')||(LA19_80>='#' && LA19_80<='[')||(LA19_80>=']' && LA19_80<='\uFFFF')) ) {s = 80;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='T') ) {s = 1;}

                        else if ( (LA19_0=='F') ) {s = 2;}

                        else if ( (LA19_0=='<') ) {s = 3;}

                        else if ( (LA19_0=='>') ) {s = 4;}

                        else if ( (LA19_0=='=') ) {s = 5;}

                        else if ( (LA19_0=='+') ) {s = 6;}

                        else if ( (LA19_0=='-') ) {s = 7;}

                        else if ( (LA19_0=='*') ) {s = 8;}

                        else if ( (LA19_0=='/') ) {s = 9;}

                        else if ( (LA19_0=='%') ) {s = 10;}

                        else if ( (LA19_0==';') ) {s = 11;}

                        else if ( (LA19_0=='S') ) {s = 12;}

                        else if ( (LA19_0==',') ) {s = 13;}

                        else if ( (LA19_0=='J') ) {s = 14;}

                        else if ( (LA19_0=='O') ) {s = 15;}

                        else if ( (LA19_0=='(') ) {s = 16;}

                        else if ( (LA19_0==')') ) {s = 17;}

                        else if ( (LA19_0=='W') ) {s = 18;}

                        else if ( (LA19_0=='A') ) {s = 19;}

                        else if ( (LA19_0=='N') ) {s = 20;}

                        else if ( (LA19_0=='G') ) {s = 21;}

                        else if ( (LA19_0=='B') ) {s = 22;}

                        else if ( (LA19_0=='H') ) {s = 23;}

                        else if ( (LA19_0=='I') ) {s = 24;}

                        else if ( (LA19_0=='E') ) {s = 25;}

                        else if ( (LA19_0=='C') ) {s = 26;}

                        else if ( (LA19_0=='.') ) {s = 27;}

                        else if ( (LA19_0=='X') ) {s = 28;}

                        else if ( (LA19_0=='^') ) {s = 29;}

                        else if ( (LA19_0=='\"') ) {s = 30;}

                        else if ( (LA19_0=='\'') ) {s = 31;}

                        else if ( (LA19_0=='0') ) {s = 32;}

                        else if ( ((LA19_0>='1' && LA19_0<='9')) ) {s = 33;}

                        else if ( (LA19_0=='D'||(LA19_0>='K' && LA19_0<='M')||(LA19_0>='P' && LA19_0<='R')||(LA19_0>='U' && LA19_0<='V')||(LA19_0>='Y' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {s = 34;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 35;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||(LA19_0>='#' && LA19_0<='$')||LA19_0=='&'||LA19_0==':'||(LA19_0>='?' && LA19_0<='@')||(LA19_0>='[' && LA19_0<=']')||LA19_0=='`'||(LA19_0>='{' && LA19_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_114 = input.LA(1);

                        s = -1;
                        if ( (LA19_114=='\'') ) {s = 84;}

                        else if ( (LA19_114=='\\') ) {s = 82;}

                        else if ( ((LA19_114>='\u0000' && LA19_114<='&')||(LA19_114>='(' && LA19_114<='[')||(LA19_114>=']' && LA19_114<='\uFFFF')) ) {s = 83;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_83 = input.LA(1);

                        s = -1;
                        if ( (LA19_83=='\'') ) {s = 84;}

                        else if ( (LA19_83=='\\') ) {s = 82;}

                        else if ( ((LA19_83>='\u0000' && LA19_83<='&')||(LA19_83>='(' && LA19_83<='[')||(LA19_83>=']' && LA19_83<='\uFFFF')) ) {s = 83;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA19_30 = input.LA(1);

                        s = -1;
                        if ( (LA19_30=='\\') ) {s = 79;}

                        else if ( ((LA19_30>='\u0000' && LA19_30<='!')||(LA19_30>='#' && LA19_30<='[')||(LA19_30>=']' && LA19_30<='\uFFFF')) ) {s = 80;}

                        else if ( (LA19_30=='\"') ) {s = 81;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}