package org.xtext.example.mydsl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCypherLexer extends Lexer {
    public static final int LessThanSignGreaterThanSign=78;
    public static final int RULE_HEX=115;
    public static final int CREATE=22;
    public static final int JOIN=54;
    public static final int LessThanSign=100;
    public static final int WHEN=63;
    public static final int LeftParenthesis=90;
    public static final int EXPLAIN=15;
    public static final int PERIODIC=14;
    public static final int ELSE=51;
    public static final int EqualsSignTilde=79;
    public static final int NONE=57;
    public static final int ExclamationMark=87;
    public static final int GreaterThanSign=102;
    public static final int RULE_ID=110;
    public static final int IN=83;
    public static final int NODE=56;
    public static final int DISTINCT=12;
    public static final int IS=84;
    public static final int WHERE=45;
    public static final int CASE=48;
    public static final int GreaterThanSignEqualsSign=80;
    public static final int FIELDTERMINATOR=5;
    public static final int STARTS=32;
    public static final int AS=81;
    public static final int VerticalLine=108;
    public static final int PlusSign=93;
    public static final int RULE_INT=116;
    public static final int RULE_ML_COMMENT=111;
    public static final int COUNT=35;
    public static final int THEN=61;
    public static final int XOR=74;
    public static final int LeftSquareBracket=104;
    public static final int CALL=47;
    public static final int SET=73;
    public static final int MERGE=40;
    public static final int CONSTRAINT=8;
    public static final int FOREACH=17;
    public static final int ORDER=41;
    public static final int ASC=68;
    public static final int Comma=94;
    public static final int DELETE=24;
    public static final int HyphenMinus=95;
    public static final int HEADERS=18;
    public static final int BY=82;
    public static final int REMOVE=29;
    public static final int SKIP=60;
    public static final int SCAN=59;
    public static final int LessThanSignEqualsSign=77;
    public static final int Solidus=97;
    public static final int RightCurlyBracket=109;
    public static final int UNWIND=34;
    public static final int FullStop=96;
    public static final int YIELD=46;
    public static final int DETACH=25;
    public static final int Semicolon=99;
    public static final int ASCENDING=10;
    public static final int QuestionMark=103;
    public static final int SHORTESTPATH=7;
    public static final int REL=72;
    public static final int CYPHER=23;
    public static final int UNION=43;
    public static final int ALL=65;
    public static final int SINGLE=31;
    public static final int FROM=53;
    public static final int DESC=49;
    public static final int OPTIONAL=13;
    public static final int PercentSign=89;
    public static final int ALLSHORTESTPATHS=4;
    public static final int FullStopFullStop=76;
    public static final int DESCENDING=9;
    public static final int INDEX=37;
    public static final int RightSquareBracket=105;
    public static final int EXTRACT=16;
    public static final int NULL=58;
    public static final int UNIQUE=33;
    public static final int RightParenthesis=91;
    public static final int TRUE=62;
    public static final int USING=44;
    public static final int RULE_DECIMAL=117;
    public static final int NOT=71;
    public static final int AND=66;
    public static final int END=70;
    public static final int RELATIONSHIP=6;
    public static final int REDUCE=28;
    public static final int LOAD=55;
    public static final int LIMIT=38;
    public static final int RULE_STRING=118;
    public static final int CONTAINS=11;
    public static final int ANY=67;
    public static final int RULE_STRING_LITERAL=114;
    public static final int DROP=50;
    public static final int RULE_SL_COMMENT=112;
    public static final int RETURN=30;
    public static final int EqualsSign=101;
    public static final int PROFILE=19;
    public static final int ENDS=52;
    public static final int Colon=98;
    public static final int EOF=-1;
    public static final int Asterisk=92;
    public static final int PlusSignEqualsSign=75;
    public static final int ON=85;
    public static final int FILTER=27;
    public static final int OR=86;
    public static final int EXISTS=26;
    public static final int ASSERT=20;
    public static final int COMMIT=21;
    public static final int RULE_WS=113;
    public static final int CSV=69;
    public static final int LeftCurlyBracket=107;
    public static final int RULE_ANY_OTHER=119;
    public static final int WITH=64;
    public static final int CircumflexAccent=106;
    public static final int DollarSign=88;
    public static final int FALSE=36;
    public static final int START=42;
    public static final int MATCH=39;

    // delegates
    // delegators

    public InternalCypherLexer() {;} 
    public InternalCypherLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCypherLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCypherLexer.g"; }

    // $ANTLR start "ALLSHORTESTPATHS"
    public final void mALLSHORTESTPATHS() throws RecognitionException {
        try {
            int _type = ALLSHORTESTPATHS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:14:18: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'S' | 's' ) )
            // InternalCypherLexer.g:14:20: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'H' | 'h' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALLSHORTESTPATHS"

    // $ANTLR start "FIELDTERMINATOR"
    public final void mFIELDTERMINATOR() throws RecognitionException {
        try {
            int _type = FIELDTERMINATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:16:17: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalCypherLexer.g:16:19: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIELDTERMINATOR"

    // $ANTLR start "RELATIONSHIP"
    public final void mRELATIONSHIP() throws RecognitionException {
        try {
            int _type = RELATIONSHIP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:18:14: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'P' | 'p' ) )
            // InternalCypherLexer.g:18:16: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'H' | 'h' ) ( 'I' | 'i' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELATIONSHIP"

    // $ANTLR start "SHORTESTPATH"
    public final void mSHORTESTPATH() throws RecognitionException {
        try {
            int _type = SHORTESTPATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:20:14: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // InternalCypherLexer.g:20:16: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHORTESTPATH"

    // $ANTLR start "CONSTRAINT"
    public final void mCONSTRAINT() throws RecognitionException {
        try {
            int _type = CONSTRAINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:22:12: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalCypherLexer.g:22:14: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTRAINT"

    // $ANTLR start "DESCENDING"
    public final void mDESCENDING() throws RecognitionException {
        try {
            int _type = DESCENDING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:24:12: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // InternalCypherLexer.g:24:14: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESCENDING"

    // $ANTLR start "ASCENDING"
    public final void mASCENDING() throws RecognitionException {
        try {
            int _type = ASCENDING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:26:11: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // InternalCypherLexer.g:26:13: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASCENDING"

    // $ANTLR start "CONTAINS"
    public final void mCONTAINS() throws RecognitionException {
        try {
            int _type = CONTAINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:28:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) )
            // InternalCypherLexer.g:28:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTAINS"

    // $ANTLR start "DISTINCT"
    public final void mDISTINCT() throws RecognitionException {
        try {
            int _type = DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:30:10: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // InternalCypherLexer.g:30:12: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DISTINCT"

    // $ANTLR start "OPTIONAL"
    public final void mOPTIONAL() throws RecognitionException {
        try {
            int _type = OPTIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:32:10: ( ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // InternalCypherLexer.g:32:12: ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPTIONAL"

    // $ANTLR start "PERIODIC"
    public final void mPERIODIC() throws RecognitionException {
        try {
            int _type = PERIODIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:34:10: ( ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'C' | 'c' ) )
            // InternalCypherLexer.g:34:12: ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERIODIC"

    // $ANTLR start "EXPLAIN"
    public final void mEXPLAIN() throws RecognitionException {
        try {
            int _type = EXPLAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:36:9: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalCypherLexer.g:36:11: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPLAIN"

    // $ANTLR start "EXTRACT"
    public final void mEXTRACT() throws RecognitionException {
        try {
            int _type = EXTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:38:9: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // InternalCypherLexer.g:38:11: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXTRACT"

    // $ANTLR start "FOREACH"
    public final void mFOREACH() throws RecognitionException {
        try {
            int _type = FOREACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:40:9: ( ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // InternalCypherLexer.g:40:11: ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOREACH"

    // $ANTLR start "HEADERS"
    public final void mHEADERS() throws RecognitionException {
        try {
            int _type = HEADERS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:42:9: ( ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'S' | 's' ) )
            // InternalCypherLexer.g:42:11: ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEADERS"

    // $ANTLR start "PROFILE"
    public final void mPROFILE() throws RecognitionException {
        try {
            int _type = PROFILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:44:9: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:44:11: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROFILE"

    // $ANTLR start "ASSERT"
    public final void mASSERT() throws RecognitionException {
        try {
            int _type = ASSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:46:8: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // InternalCypherLexer.g:46:10: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSERT"

    // $ANTLR start "COMMIT"
    public final void mCOMMIT() throws RecognitionException {
        try {
            int _type = COMMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:48:8: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' ) )
            // InternalCypherLexer.g:48:10: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMIT"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:50:8: ( ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:50:10: ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "CYPHER"
    public final void mCYPHER() throws RecognitionException {
        try {
            int _type = CYPHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:52:8: ( ( 'C' | 'c' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // InternalCypherLexer.g:52:10: ( 'C' | 'c' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CYPHER"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:54:8: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:54:10: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "DETACH"
    public final void mDETACH() throws RecognitionException {
        try {
            int _type = DETACH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:56:8: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // InternalCypherLexer.g:56:10: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DETACH"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:58:8: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // InternalCypherLexer.g:58:10: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "FILTER"
    public final void mFILTER() throws RecognitionException {
        try {
            int _type = FILTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:60:8: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // InternalCypherLexer.g:60:10: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FILTER"

    // $ANTLR start "REDUCE"
    public final void mREDUCE() throws RecognitionException {
        try {
            int _type = REDUCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:62:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:62:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REDUCE"

    // $ANTLR start "REMOVE"
    public final void mREMOVE() throws RecognitionException {
        try {
            int _type = REMOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:64:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:64:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REMOVE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:66:8: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' ) )
            // InternalCypherLexer.g:66:10: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "SINGLE"
    public final void mSINGLE() throws RecognitionException {
        try {
            int _type = SINGLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:68:8: ( ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:68:10: ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SINGLE"

    // $ANTLR start "STARTS"
    public final void mSTARTS() throws RecognitionException {
        try {
            int _type = STARTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:70:8: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // InternalCypherLexer.g:70:10: ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STARTS"

    // $ANTLR start "UNIQUE"
    public final void mUNIQUE() throws RecognitionException {
        try {
            int _type = UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:72:8: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:72:10: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNIQUE"

    // $ANTLR start "UNWIND"
    public final void mUNWIND() throws RecognitionException {
        try {
            int _type = UNWIND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:74:8: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalCypherLexer.g:74:10: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNWIND"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:76:7: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // InternalCypherLexer.g:76:9: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:78:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:78:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "INDEX"
    public final void mINDEX() throws RecognitionException {
        try {
            int _type = INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:80:7: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'X' | 'x' ) )
            // InternalCypherLexer.g:80:9: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDEX"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:82:7: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' ) )
            // InternalCypherLexer.g:82:9: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "MATCH"
    public final void mMATCH() throws RecognitionException {
        try {
            int _type = MATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:84:7: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // InternalCypherLexer.g:84:9: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MATCH"

    // $ANTLR start "MERGE"
    public final void mMERGE() throws RecognitionException {
        try {
            int _type = MERGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:86:7: ( ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:86:9: ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'G' | 'g' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MERGE"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:88:7: ( ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // InternalCypherLexer.g:88:9: ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "START"
    public final void mSTART() throws RecognitionException {
        try {
            int _type = START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:90:7: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // InternalCypherLexer.g:90:9: ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "START"

    // $ANTLR start "UNION"
    public final void mUNION() throws RecognitionException {
        try {
            int _type = UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:92:7: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // InternalCypherLexer.g:92:9: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNION"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:94:7: ( ( 'U' | 'u' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // InternalCypherLexer.g:94:9: ( 'U' | 'u' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:96:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:96:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "YIELD"
    public final void mYIELD() throws RecognitionException {
        try {
            int _type = YIELD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:98:7: ( ( 'Y' | 'y' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // InternalCypherLexer.g:98:9: ( 'Y' | 'y' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YIELD"

    // $ANTLR start "CALL"
    public final void mCALL() throws RecognitionException {
        try {
            int _type = CALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:100:6: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // InternalCypherLexer.g:100:8: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CALL"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:102:6: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:102:8: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:104:6: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // InternalCypherLexer.g:104:8: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:106:6: ( ( 'D' | 'd' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) )
            // InternalCypherLexer.g:106:8: ( 'D' | 'd' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:108:6: ( ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:108:8: ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ENDS"
    public final void mENDS() throws RecognitionException {
        try {
            int _type = ENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:110:6: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) )
            // InternalCypherLexer.g:110:8: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDS"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:112:6: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // InternalCypherLexer.g:112:8: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:114:6: ( ( 'J' | 'j' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalCypherLexer.g:114:8: ( 'J' | 'j' ) ( 'O' | 'o' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "LOAD"
    public final void mLOAD() throws RecognitionException {
        try {
            int _type = LOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:116:6: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'D' | 'd' ) )
            // InternalCypherLexer.g:116:8: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOAD"

    // $ANTLR start "NODE"
    public final void mNODE() throws RecognitionException {
        try {
            int _type = NODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:118:6: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:118:8: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NODE"

    // $ANTLR start "NONE"
    public final void mNONE() throws RecognitionException {
        try {
            int _type = NONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:120:6: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:120:8: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NONE"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:122:6: ( ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // InternalCypherLexer.g:122:8: ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "SCAN"
    public final void mSCAN() throws RecognitionException {
        try {
            int _type = SCAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:124:6: ( ( 'S' | 's' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) )
            // InternalCypherLexer.g:124:8: ( 'S' | 's' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SCAN"

    // $ANTLR start "SKIP"
    public final void mSKIP() throws RecognitionException {
        try {
            int _type = SKIP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:126:6: ( ( 'S' | 's' ) ( 'K' | 'k' ) ( 'I' | 'i' ) ( 'P' | 'p' ) )
            // InternalCypherLexer.g:126:8: ( 'S' | 's' ) ( 'K' | 'k' ) ( 'I' | 'i' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SKIP"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:128:6: ( ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // InternalCypherLexer.g:128:8: ( 'T' | 't' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:130:6: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // InternalCypherLexer.g:130:8: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:132:6: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // InternalCypherLexer.g:132:8: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:134:6: ( ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // InternalCypherLexer.g:134:8: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:136:5: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // InternalCypherLexer.g:136:7: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:138:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalCypherLexer.g:138:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "ANY"
    public final void mANY() throws RecognitionException {
        try {
            int _type = ANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:140:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' ) )
            // InternalCypherLexer.g:140:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANY"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:142:5: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // InternalCypherLexer.g:142:7: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "CSV"
    public final void mCSV() throws RecognitionException {
        try {
            int _type = CSV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:144:5: ( ( 'C' | 'c' ) ( 'S' | 's' ) ( 'V' | 'v' ) )
            // InternalCypherLexer.g:144:7: ( 'C' | 'c' ) ( 'S' | 's' ) ( 'V' | 'v' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CSV"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:146:5: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalCypherLexer.g:146:7: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:148:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // InternalCypherLexer.g:148:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "REL"
    public final void mREL() throws RecognitionException {
        try {
            int _type = REL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:150:5: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'L' | 'l' ) )
            // InternalCypherLexer.g:150:7: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REL"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:152:5: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // InternalCypherLexer.g:152:7: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:154:5: ( ( 'X' | 'x' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalCypherLexer.g:154:7: ( 'X' | 'x' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "PlusSignEqualsSign"
    public final void mPlusSignEqualsSign() throws RecognitionException {
        try {
            int _type = PlusSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:156:20: ( '+' '=' )
            // InternalCypherLexer.g:156:22: '+' '='
            {
            match('+'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSignEqualsSign"

    // $ANTLR start "FullStopFullStop"
    public final void mFullStopFullStop() throws RecognitionException {
        try {
            int _type = FullStopFullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:158:18: ( '.' '.' )
            // InternalCypherLexer.g:158:20: '.' '.'
            {
            match('.'); 
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStopFullStop"

    // $ANTLR start "LessThanSignEqualsSign"
    public final void mLessThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = LessThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:160:24: ( '<' '=' )
            // InternalCypherLexer.g:160:26: '<' '='
            {
            match('<'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignEqualsSign"

    // $ANTLR start "LessThanSignGreaterThanSign"
    public final void mLessThanSignGreaterThanSign() throws RecognitionException {
        try {
            int _type = LessThanSignGreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:162:29: ( '<' '>' )
            // InternalCypherLexer.g:162:31: '<' '>'
            {
            match('<'); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSignGreaterThanSign"

    // $ANTLR start "EqualsSignTilde"
    public final void mEqualsSignTilde() throws RecognitionException {
        try {
            int _type = EqualsSignTilde;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:164:17: ( '=' '~' )
            // InternalCypherLexer.g:164:19: '=' '~'
            {
            match('='); 
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSignTilde"

    // $ANTLR start "GreaterThanSignEqualsSign"
    public final void mGreaterThanSignEqualsSign() throws RecognitionException {
        try {
            int _type = GreaterThanSignEqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:166:27: ( '>' '=' )
            // InternalCypherLexer.g:166:29: '>' '='
            {
            match('>'); 
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSignEqualsSign"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:168:4: ( ( 'A' | 'a' ) ( 'S' | 's' ) )
            // InternalCypherLexer.g:168:6: ( 'A' | 'a' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:170:4: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // InternalCypherLexer.g:170:6: ( 'B' | 'b' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:172:4: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalCypherLexer.g:172:6: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:174:4: ( ( 'I' | 'i' ) ( 'S' | 's' ) )
            // InternalCypherLexer.g:174:6: ( 'I' | 'i' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:176:4: ( ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // InternalCypherLexer.g:176:6: ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:178:4: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalCypherLexer.g:178:6: ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:180:17: ( '!' )
            // InternalCypherLexer.g:180:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "DollarSign"
    public final void mDollarSign() throws RecognitionException {
        try {
            int _type = DollarSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:182:12: ( '$' )
            // InternalCypherLexer.g:182:14: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DollarSign"

    // $ANTLR start "PercentSign"
    public final void mPercentSign() throws RecognitionException {
        try {
            int _type = PercentSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:184:13: ( '%' )
            // InternalCypherLexer.g:184:15: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PercentSign"

    // $ANTLR start "LeftParenthesis"
    public final void mLeftParenthesis() throws RecognitionException {
        try {
            int _type = LeftParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:186:17: ( '(' )
            // InternalCypherLexer.g:186:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftParenthesis"

    // $ANTLR start "RightParenthesis"
    public final void mRightParenthesis() throws RecognitionException {
        try {
            int _type = RightParenthesis;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:188:18: ( ')' )
            // InternalCypherLexer.g:188:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightParenthesis"

    // $ANTLR start "Asterisk"
    public final void mAsterisk() throws RecognitionException {
        try {
            int _type = Asterisk;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:190:10: ( '*' )
            // InternalCypherLexer.g:190:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Asterisk"

    // $ANTLR start "PlusSign"
    public final void mPlusSign() throws RecognitionException {
        try {
            int _type = PlusSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:192:10: ( '+' )
            // InternalCypherLexer.g:192:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PlusSign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:194:7: ( ',' )
            // InternalCypherLexer.g:194:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "HyphenMinus"
    public final void mHyphenMinus() throws RecognitionException {
        try {
            int _type = HyphenMinus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:196:13: ( '-' )
            // InternalCypherLexer.g:196:15: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HyphenMinus"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:198:10: ( '.' )
            // InternalCypherLexer.g:198:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "Solidus"
    public final void mSolidus() throws RecognitionException {
        try {
            int _type = Solidus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:200:9: ( '/' )
            // InternalCypherLexer.g:200:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Solidus"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:202:7: ( ':' )
            // InternalCypherLexer.g:202:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Semicolon"
    public final void mSemicolon() throws RecognitionException {
        try {
            int _type = Semicolon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:204:11: ( ';' )
            // InternalCypherLexer.g:204:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Semicolon"

    // $ANTLR start "LessThanSign"
    public final void mLessThanSign() throws RecognitionException {
        try {
            int _type = LessThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:206:14: ( '<' )
            // InternalCypherLexer.g:206:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LessThanSign"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:208:12: ( '=' )
            // InternalCypherLexer.g:208:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "GreaterThanSign"
    public final void mGreaterThanSign() throws RecognitionException {
        try {
            int _type = GreaterThanSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:210:17: ( '>' )
            // InternalCypherLexer.g:210:19: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GreaterThanSign"

    // $ANTLR start "QuestionMark"
    public final void mQuestionMark() throws RecognitionException {
        try {
            int _type = QuestionMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:212:14: ( '?' )
            // InternalCypherLexer.g:212:16: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QuestionMark"

    // $ANTLR start "LeftSquareBracket"
    public final void mLeftSquareBracket() throws RecognitionException {
        try {
            int _type = LeftSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:214:19: ( '[' )
            // InternalCypherLexer.g:214:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftSquareBracket"

    // $ANTLR start "RightSquareBracket"
    public final void mRightSquareBracket() throws RecognitionException {
        try {
            int _type = RightSquareBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:216:20: ( ']' )
            // InternalCypherLexer.g:216:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightSquareBracket"

    // $ANTLR start "CircumflexAccent"
    public final void mCircumflexAccent() throws RecognitionException {
        try {
            int _type = CircumflexAccent;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:218:18: ( '^' )
            // InternalCypherLexer.g:218:20: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CircumflexAccent"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:220:18: ( '{' )
            // InternalCypherLexer.g:220:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "VerticalLine"
    public final void mVerticalLine() throws RecognitionException {
        try {
            int _type = VerticalLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:222:14: ( '|' )
            // InternalCypherLexer.g:222:16: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VerticalLine"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:224:19: ( '}' )
            // InternalCypherLexer.g:224:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCypherLexer.g:226:9: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '`' ( options {greedy=false; } : . )* '`' ) )
            // InternalCypherLexer.g:226:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '`' ( options {greedy=false; } : . )* '`' )
            {
            // InternalCypherLexer.g:226:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '`' ( options {greedy=false; } : . )* '`' )
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
                    // InternalCypherLexer.g:226:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalCypherLexer.g:226:36: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalCypherLexer.g:
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
                    // InternalCypherLexer.g:226:70: '`' ( options {greedy=false; } : . )* '`'
                    {
                    match('`'); 
                    // InternalCypherLexer.g:226:74: ( options {greedy=false; } : . )*
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
                    	    // InternalCypherLexer.g:226:102: .
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
            // InternalCypherLexer.g:228:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCypherLexer.g:228:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCypherLexer.g:228:24: ( options {greedy=false; } : . )*
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
            	    // InternalCypherLexer.g:228:52: .
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
            // InternalCypherLexer.g:230:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCypherLexer.g:230:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCypherLexer.g:230:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCypherLexer.g:230:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalCypherLexer.g:230:40: ( ( '\\r' )? '\\n' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCypherLexer.g:230:41: ( '\\r' )? '\\n'
                    {
                    // InternalCypherLexer.g:230:41: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCypherLexer.g:230:41: '\\r'
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
            // InternalCypherLexer.g:232:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCypherLexer.g:232:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCypherLexer.g:232:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalCypherLexer.g:
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
            // InternalCypherLexer.g:234:21: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCypherLexer.g:234:23: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCypherLexer.g:234:23: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalCypherLexer.g:234:24: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCypherLexer.g:234:28: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalCypherLexer.g:234:29: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCypherLexer.g:234:36: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalCypherLexer.g:234:56: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCypherLexer.g:234:61: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalCypherLexer.g:234:62: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCypherLexer.g:234:69: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalCypherLexer.g:236:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'A' .. 'F' )+ )
            // InternalCypherLexer.g:236:12: ( '0x' | '0X' ) ( '0' .. '9' | 'A' .. 'F' )+
            {
            // InternalCypherLexer.g:236:12: ( '0x' | '0X' )
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
                    // InternalCypherLexer.g:236:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalCypherLexer.g:236:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalCypherLexer.g:236:24: ( '0' .. '9' | 'A' .. 'F' )+
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
            	    // InternalCypherLexer.g:
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
            // InternalCypherLexer.g:238:10: ( '0' .. '9' ( '0' .. '9' )* )
            // InternalCypherLexer.g:238:12: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 
            // InternalCypherLexer.g:238:21: ( '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCypherLexer.g:238:22: '0' .. '9'
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
            // InternalCypherLexer.g:240:14: ( RULE_INT ( 'e' ( '+' | '-' )? RULE_INT )? )
            // InternalCypherLexer.g:240:16: RULE_INT ( 'e' ( '+' | '-' )? RULE_INT )?
            {
            mRULE_INT(); 
            // InternalCypherLexer.g:240:25: ( 'e' ( '+' | '-' )? RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='e') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalCypherLexer.g:240:26: 'e' ( '+' | '-' )? RULE_INT
                    {
                    match('e'); 
                    // InternalCypherLexer.g:240:30: ( '+' | '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='+'||LA15_0=='-') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalCypherLexer.g:
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
            // InternalCypherLexer.g:242:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCypherLexer.g:242:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCypherLexer.g:242:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalCypherLexer.g:242:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCypherLexer.g:242:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalCypherLexer.g:242:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCypherLexer.g:242:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalCypherLexer.g:242:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCypherLexer.g:242:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalCypherLexer.g:242:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCypherLexer.g:242:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalCypherLexer.g:244:16: ( . )
            // InternalCypherLexer.g:244:18: .
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
        // InternalCypherLexer.g:1:8: ( ALLSHORTESTPATHS | FIELDTERMINATOR | RELATIONSHIP | SHORTESTPATH | CONSTRAINT | DESCENDING | ASCENDING | CONTAINS | DISTINCT | OPTIONAL | PERIODIC | EXPLAIN | EXTRACT | FOREACH | HEADERS | PROFILE | ASSERT | COMMIT | CREATE | CYPHER | DELETE | DETACH | EXISTS | FILTER | REDUCE | REMOVE | RETURN | SINGLE | STARTS | UNIQUE | UNWIND | COUNT | FALSE | INDEX | LIMIT | MATCH | MERGE | ORDER | START | UNION | USING | WHERE | YIELD | CALL | CASE | DESC | DROP | ELSE | ENDS | FROM | JOIN | LOAD | NODE | NONE | NULL | SCAN | SKIP | THEN | TRUE | WHEN | WITH | ALL | AND | ANY | ASC | CSV | END | NOT | REL | SET | XOR | PlusSignEqualsSign | FullStopFullStop | LessThanSignEqualsSign | LessThanSignGreaterThanSign | EqualsSignTilde | GreaterThanSignEqualsSign | AS | BY | IN | IS | ON | OR | ExclamationMark | DollarSign | PercentSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | CircumflexAccent | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_STRING_LITERAL | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_ANY_OTHER )
        int alt20=116;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalCypherLexer.g:1:10: ALLSHORTESTPATHS
                {
                mALLSHORTESTPATHS(); 

                }
                break;
            case 2 :
                // InternalCypherLexer.g:1:27: FIELDTERMINATOR
                {
                mFIELDTERMINATOR(); 

                }
                break;
            case 3 :
                // InternalCypherLexer.g:1:43: RELATIONSHIP
                {
                mRELATIONSHIP(); 

                }
                break;
            case 4 :
                // InternalCypherLexer.g:1:56: SHORTESTPATH
                {
                mSHORTESTPATH(); 

                }
                break;
            case 5 :
                // InternalCypherLexer.g:1:69: CONSTRAINT
                {
                mCONSTRAINT(); 

                }
                break;
            case 6 :
                // InternalCypherLexer.g:1:80: DESCENDING
                {
                mDESCENDING(); 

                }
                break;
            case 7 :
                // InternalCypherLexer.g:1:91: ASCENDING
                {
                mASCENDING(); 

                }
                break;
            case 8 :
                // InternalCypherLexer.g:1:101: CONTAINS
                {
                mCONTAINS(); 

                }
                break;
            case 9 :
                // InternalCypherLexer.g:1:110: DISTINCT
                {
                mDISTINCT(); 

                }
                break;
            case 10 :
                // InternalCypherLexer.g:1:119: OPTIONAL
                {
                mOPTIONAL(); 

                }
                break;
            case 11 :
                // InternalCypherLexer.g:1:128: PERIODIC
                {
                mPERIODIC(); 

                }
                break;
            case 12 :
                // InternalCypherLexer.g:1:137: EXPLAIN
                {
                mEXPLAIN(); 

                }
                break;
            case 13 :
                // InternalCypherLexer.g:1:145: EXTRACT
                {
                mEXTRACT(); 

                }
                break;
            case 14 :
                // InternalCypherLexer.g:1:153: FOREACH
                {
                mFOREACH(); 

                }
                break;
            case 15 :
                // InternalCypherLexer.g:1:161: HEADERS
                {
                mHEADERS(); 

                }
                break;
            case 16 :
                // InternalCypherLexer.g:1:169: PROFILE
                {
                mPROFILE(); 

                }
                break;
            case 17 :
                // InternalCypherLexer.g:1:177: ASSERT
                {
                mASSERT(); 

                }
                break;
            case 18 :
                // InternalCypherLexer.g:1:184: COMMIT
                {
                mCOMMIT(); 

                }
                break;
            case 19 :
                // InternalCypherLexer.g:1:191: CREATE
                {
                mCREATE(); 

                }
                break;
            case 20 :
                // InternalCypherLexer.g:1:198: CYPHER
                {
                mCYPHER(); 

                }
                break;
            case 21 :
                // InternalCypherLexer.g:1:205: DELETE
                {
                mDELETE(); 

                }
                break;
            case 22 :
                // InternalCypherLexer.g:1:212: DETACH
                {
                mDETACH(); 

                }
                break;
            case 23 :
                // InternalCypherLexer.g:1:219: EXISTS
                {
                mEXISTS(); 

                }
                break;
            case 24 :
                // InternalCypherLexer.g:1:226: FILTER
                {
                mFILTER(); 

                }
                break;
            case 25 :
                // InternalCypherLexer.g:1:233: REDUCE
                {
                mREDUCE(); 

                }
                break;
            case 26 :
                // InternalCypherLexer.g:1:240: REMOVE
                {
                mREMOVE(); 

                }
                break;
            case 27 :
                // InternalCypherLexer.g:1:247: RETURN
                {
                mRETURN(); 

                }
                break;
            case 28 :
                // InternalCypherLexer.g:1:254: SINGLE
                {
                mSINGLE(); 

                }
                break;
            case 29 :
                // InternalCypherLexer.g:1:261: STARTS
                {
                mSTARTS(); 

                }
                break;
            case 30 :
                // InternalCypherLexer.g:1:268: UNIQUE
                {
                mUNIQUE(); 

                }
                break;
            case 31 :
                // InternalCypherLexer.g:1:275: UNWIND
                {
                mUNWIND(); 

                }
                break;
            case 32 :
                // InternalCypherLexer.g:1:282: COUNT
                {
                mCOUNT(); 

                }
                break;
            case 33 :
                // InternalCypherLexer.g:1:288: FALSE
                {
                mFALSE(); 

                }
                break;
            case 34 :
                // InternalCypherLexer.g:1:294: INDEX
                {
                mINDEX(); 

                }
                break;
            case 35 :
                // InternalCypherLexer.g:1:300: LIMIT
                {
                mLIMIT(); 

                }
                break;
            case 36 :
                // InternalCypherLexer.g:1:306: MATCH
                {
                mMATCH(); 

                }
                break;
            case 37 :
                // InternalCypherLexer.g:1:312: MERGE
                {
                mMERGE(); 

                }
                break;
            case 38 :
                // InternalCypherLexer.g:1:318: ORDER
                {
                mORDER(); 

                }
                break;
            case 39 :
                // InternalCypherLexer.g:1:324: START
                {
                mSTART(); 

                }
                break;
            case 40 :
                // InternalCypherLexer.g:1:330: UNION
                {
                mUNION(); 

                }
                break;
            case 41 :
                // InternalCypherLexer.g:1:336: USING
                {
                mUSING(); 

                }
                break;
            case 42 :
                // InternalCypherLexer.g:1:342: WHERE
                {
                mWHERE(); 

                }
                break;
            case 43 :
                // InternalCypherLexer.g:1:348: YIELD
                {
                mYIELD(); 

                }
                break;
            case 44 :
                // InternalCypherLexer.g:1:354: CALL
                {
                mCALL(); 

                }
                break;
            case 45 :
                // InternalCypherLexer.g:1:359: CASE
                {
                mCASE(); 

                }
                break;
            case 46 :
                // InternalCypherLexer.g:1:364: DESC
                {
                mDESC(); 

                }
                break;
            case 47 :
                // InternalCypherLexer.g:1:369: DROP
                {
                mDROP(); 

                }
                break;
            case 48 :
                // InternalCypherLexer.g:1:374: ELSE
                {
                mELSE(); 

                }
                break;
            case 49 :
                // InternalCypherLexer.g:1:379: ENDS
                {
                mENDS(); 

                }
                break;
            case 50 :
                // InternalCypherLexer.g:1:384: FROM
                {
                mFROM(); 

                }
                break;
            case 51 :
                // InternalCypherLexer.g:1:389: JOIN
                {
                mJOIN(); 

                }
                break;
            case 52 :
                // InternalCypherLexer.g:1:394: LOAD
                {
                mLOAD(); 

                }
                break;
            case 53 :
                // InternalCypherLexer.g:1:399: NODE
                {
                mNODE(); 

                }
                break;
            case 54 :
                // InternalCypherLexer.g:1:404: NONE
                {
                mNONE(); 

                }
                break;
            case 55 :
                // InternalCypherLexer.g:1:409: NULL
                {
                mNULL(); 

                }
                break;
            case 56 :
                // InternalCypherLexer.g:1:414: SCAN
                {
                mSCAN(); 

                }
                break;
            case 57 :
                // InternalCypherLexer.g:1:419: SKIP
                {
                mSKIP(); 

                }
                break;
            case 58 :
                // InternalCypherLexer.g:1:424: THEN
                {
                mTHEN(); 

                }
                break;
            case 59 :
                // InternalCypherLexer.g:1:429: TRUE
                {
                mTRUE(); 

                }
                break;
            case 60 :
                // InternalCypherLexer.g:1:434: WHEN
                {
                mWHEN(); 

                }
                break;
            case 61 :
                // InternalCypherLexer.g:1:439: WITH
                {
                mWITH(); 

                }
                break;
            case 62 :
                // InternalCypherLexer.g:1:444: ALL
                {
                mALL(); 

                }
                break;
            case 63 :
                // InternalCypherLexer.g:1:448: AND
                {
                mAND(); 

                }
                break;
            case 64 :
                // InternalCypherLexer.g:1:452: ANY
                {
                mANY(); 

                }
                break;
            case 65 :
                // InternalCypherLexer.g:1:456: ASC
                {
                mASC(); 

                }
                break;
            case 66 :
                // InternalCypherLexer.g:1:460: CSV
                {
                mCSV(); 

                }
                break;
            case 67 :
                // InternalCypherLexer.g:1:464: END
                {
                mEND(); 

                }
                break;
            case 68 :
                // InternalCypherLexer.g:1:468: NOT
                {
                mNOT(); 

                }
                break;
            case 69 :
                // InternalCypherLexer.g:1:472: REL
                {
                mREL(); 

                }
                break;
            case 70 :
                // InternalCypherLexer.g:1:476: SET
                {
                mSET(); 

                }
                break;
            case 71 :
                // InternalCypherLexer.g:1:480: XOR
                {
                mXOR(); 

                }
                break;
            case 72 :
                // InternalCypherLexer.g:1:484: PlusSignEqualsSign
                {
                mPlusSignEqualsSign(); 

                }
                break;
            case 73 :
                // InternalCypherLexer.g:1:503: FullStopFullStop
                {
                mFullStopFullStop(); 

                }
                break;
            case 74 :
                // InternalCypherLexer.g:1:520: LessThanSignEqualsSign
                {
                mLessThanSignEqualsSign(); 

                }
                break;
            case 75 :
                // InternalCypherLexer.g:1:543: LessThanSignGreaterThanSign
                {
                mLessThanSignGreaterThanSign(); 

                }
                break;
            case 76 :
                // InternalCypherLexer.g:1:571: EqualsSignTilde
                {
                mEqualsSignTilde(); 

                }
                break;
            case 77 :
                // InternalCypherLexer.g:1:587: GreaterThanSignEqualsSign
                {
                mGreaterThanSignEqualsSign(); 

                }
                break;
            case 78 :
                // InternalCypherLexer.g:1:613: AS
                {
                mAS(); 

                }
                break;
            case 79 :
                // InternalCypherLexer.g:1:616: BY
                {
                mBY(); 

                }
                break;
            case 80 :
                // InternalCypherLexer.g:1:619: IN
                {
                mIN(); 

                }
                break;
            case 81 :
                // InternalCypherLexer.g:1:622: IS
                {
                mIS(); 

                }
                break;
            case 82 :
                // InternalCypherLexer.g:1:625: ON
                {
                mON(); 

                }
                break;
            case 83 :
                // InternalCypherLexer.g:1:628: OR
                {
                mOR(); 

                }
                break;
            case 84 :
                // InternalCypherLexer.g:1:631: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 85 :
                // InternalCypherLexer.g:1:647: DollarSign
                {
                mDollarSign(); 

                }
                break;
            case 86 :
                // InternalCypherLexer.g:1:658: PercentSign
                {
                mPercentSign(); 

                }
                break;
            case 87 :
                // InternalCypherLexer.g:1:670: LeftParenthesis
                {
                mLeftParenthesis(); 

                }
                break;
            case 88 :
                // InternalCypherLexer.g:1:686: RightParenthesis
                {
                mRightParenthesis(); 

                }
                break;
            case 89 :
                // InternalCypherLexer.g:1:703: Asterisk
                {
                mAsterisk(); 

                }
                break;
            case 90 :
                // InternalCypherLexer.g:1:712: PlusSign
                {
                mPlusSign(); 

                }
                break;
            case 91 :
                // InternalCypherLexer.g:1:721: Comma
                {
                mComma(); 

                }
                break;
            case 92 :
                // InternalCypherLexer.g:1:727: HyphenMinus
                {
                mHyphenMinus(); 

                }
                break;
            case 93 :
                // InternalCypherLexer.g:1:739: FullStop
                {
                mFullStop(); 

                }
                break;
            case 94 :
                // InternalCypherLexer.g:1:748: Solidus
                {
                mSolidus(); 

                }
                break;
            case 95 :
                // InternalCypherLexer.g:1:756: Colon
                {
                mColon(); 

                }
                break;
            case 96 :
                // InternalCypherLexer.g:1:762: Semicolon
                {
                mSemicolon(); 

                }
                break;
            case 97 :
                // InternalCypherLexer.g:1:772: LessThanSign
                {
                mLessThanSign(); 

                }
                break;
            case 98 :
                // InternalCypherLexer.g:1:785: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 99 :
                // InternalCypherLexer.g:1:796: GreaterThanSign
                {
                mGreaterThanSign(); 

                }
                break;
            case 100 :
                // InternalCypherLexer.g:1:812: QuestionMark
                {
                mQuestionMark(); 

                }
                break;
            case 101 :
                // InternalCypherLexer.g:1:825: LeftSquareBracket
                {
                mLeftSquareBracket(); 

                }
                break;
            case 102 :
                // InternalCypherLexer.g:1:843: RightSquareBracket
                {
                mRightSquareBracket(); 

                }
                break;
            case 103 :
                // InternalCypherLexer.g:1:862: CircumflexAccent
                {
                mCircumflexAccent(); 

                }
                break;
            case 104 :
                // InternalCypherLexer.g:1:879: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 105 :
                // InternalCypherLexer.g:1:896: VerticalLine
                {
                mVerticalLine(); 

                }
                break;
            case 106 :
                // InternalCypherLexer.g:1:909: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 107 :
                // InternalCypherLexer.g:1:927: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 108 :
                // InternalCypherLexer.g:1:935: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 109 :
                // InternalCypherLexer.g:1:951: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 110 :
                // InternalCypherLexer.g:1:967: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 111 :
                // InternalCypherLexer.g:1:975: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 112 :
                // InternalCypherLexer.g:1:995: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 113 :
                // InternalCypherLexer.g:1:1004: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 114 :
                // InternalCypherLexer.g:1:1013: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 115 :
                // InternalCypherLexer.g:1:1026: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 116 :
                // InternalCypherLexer.g:1:1038: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\24\70\1\147\1\151\1\154\1\156\1\160\1\70\10\uffff\1\174\12\uffff\1\64\1\uffff\2\64\2\u008f\1\uffff\1\70\1\u0094\1\70\1\uffff\24\70\1\u00b5\1\u00b6\10\70\1\u00c3\1\u00c4\15\70\13\uffff\1\u00d4\34\uffff\1\u008f\2\uffff\1\u00d9\1\u00db\1\70\1\uffff\1\u00dd\1\u00de\5\70\1\u00e5\10\70\1\u00ee\7\70\1\u00f7\7\70\2\uffff\6\70\1\u0106\5\70\2\uffff\12\70\1\u0118\3\70\1\u011c\4\uffff\1\70\1\uffff\1\70\1\uffff\1\70\2\uffff\4\70\1\u0124\1\70\1\uffff\6\70\1\u012c\1\u012d\1\uffff\6\70\1\u0134\1\u0135\1\uffff\1\u0137\3\70\1\u013b\7\70\1\u0143\1\u0144\1\uffff\7\70\1\u014c\3\70\1\u0150\1\u0151\1\70\1\u0153\1\u0154\1\u0155\1\uffff\1\u0156\1\u0157\1\u0158\1\uffff\6\70\1\u015f\1\uffff\6\70\1\u0167\2\uffff\3\70\1\u016b\2\70\2\uffff\1\70\1\uffff\3\70\1\uffff\1\70\1\u0173\5\70\2\uffff\2\70\1\u017b\1\70\1\u017d\1\u017e\1\u017f\1\uffff\1\u0180\1\u0181\1\u0182\2\uffff\1\u0183\6\uffff\2\70\1\u0186\1\70\1\u0188\1\70\1\uffff\1\70\1\u018b\1\u018c\1\u018d\1\70\1\u018f\1\u0190\1\uffff\2\70\1\u0193\1\uffff\1\u0194\1\u0195\1\70\1\u0197\1\u0198\2\70\1\uffff\4\70\1\u019f\1\70\1\u01a1\1\uffff\1\u01a2\7\uffff\2\70\1\uffff\1\70\1\uffff\1\u01a6\1\70\3\uffff\1\70\2\uffff\2\70\3\uffff\1\70\2\uffff\3\70\1\u01af\1\u01b0\1\u01b1\1\uffff\1\u01b2\2\uffff\3\70\1\uffff\3\70\1\u01b9\1\70\1\u01bb\1\u01bc\1\u01bd\4\uffff\1\70\1\u01bf\4\70\1\uffff\1\70\3\uffff\1\70\1\uffff\3\70\1\u01c9\1\u01ca\4\70\2\uffff\2\70\1\u01d1\1\u01d2\2\70\2\uffff\3\70\1\u01d8\1\u01d9\2\uffff";
    static final String DFA20_eofS =
        "\u01da\uffff";
    static final String DFA20_minS =
        "\1\0\1\114\1\101\1\105\1\103\1\101\1\105\1\116\1\105\1\114\1\105\2\116\1\111\1\101\1\110\1\111\2\117\1\110\1\117\1\75\1\56\1\75\1\176\1\75\1\131\10\uffff\1\52\12\uffff\1\0\1\uffff\2\0\2\60\1\uffff\1\114\1\60\1\104\1\uffff\1\105\1\122\1\114\1\117\1\104\1\117\1\116\2\101\1\111\1\124\1\115\1\105\1\120\1\114\1\126\1\114\1\123\1\117\1\124\2\60\1\122\1\117\1\111\1\123\1\104\1\101\2\111\2\60\1\115\1\101\1\124\1\122\1\105\1\124\1\105\1\111\1\104\1\114\1\105\1\125\1\122\13\uffff\1\60\25\uffff\2\0\1\uffff\2\0\2\uffff\1\60\2\uffff\2\60\1\105\1\uffff\2\60\1\114\1\124\1\105\1\123\1\115\1\60\1\125\1\117\1\125\1\122\1\107\1\122\1\116\1\120\1\60\1\123\1\115\1\116\1\101\1\110\1\114\1\105\1\60\1\103\1\105\1\101\1\124\1\120\1\111\1\105\2\uffff\1\111\1\106\1\114\1\122\1\123\1\105\1\60\1\104\1\117\1\111\1\116\1\105\2\uffff\1\111\1\104\1\103\1\107\1\116\1\110\1\114\1\116\2\105\1\60\1\114\1\116\1\105\1\60\1\uffff\1\0\1\uffff\1\0\1\110\1\uffff\1\116\1\uffff\1\122\2\uffff\1\104\1\105\1\101\1\105\1\60\1\124\1\uffff\1\103\1\126\1\122\1\124\1\114\1\124\2\60\1\uffff\1\124\1\101\1\111\2\124\1\105\2\60\1\uffff\1\60\1\124\1\103\1\111\1\60\1\117\1\122\1\117\1\111\2\101\1\124\2\60\1\uffff\1\105\1\125\2\116\1\107\1\130\1\124\1\60\1\110\2\105\2\60\1\104\3\60\1\uffff\3\60\1\uffff\1\117\1\104\2\124\1\122\1\103\1\60\1\uffff\1\111\2\105\1\116\2\105\1\60\2\uffff\1\122\1\111\1\124\1\60\1\105\1\122\2\uffff\1\116\1\uffff\1\105\1\110\1\116\1\uffff\1\116\1\60\1\104\1\114\1\111\1\103\1\123\2\uffff\1\122\1\105\1\60\1\104\3\60\1\uffff\3\60\2\uffff\1\60\6\uffff\1\122\1\111\1\60\1\105\1\60\1\110\1\uffff\1\117\3\60\1\123\2\60\1\uffff\1\101\1\116\1\60\1\uffff\2\60\1\104\2\60\1\103\1\101\1\uffff\1\111\1\105\1\116\1\124\1\60\1\123\1\60\1\uffff\1\60\7\uffff\1\124\1\116\1\uffff\1\122\1\uffff\1\60\1\116\3\uffff\1\124\2\uffff\1\111\1\123\3\uffff\1\111\2\uffff\1\124\1\114\1\103\3\60\1\uffff\1\60\2\uffff\1\105\1\107\1\115\1\uffff\1\123\1\120\1\116\1\60\1\116\3\60\4\uffff\1\123\1\60\1\111\1\110\1\101\1\124\1\uffff\1\107\3\uffff\1\124\1\uffff\1\116\1\111\1\124\2\60\1\120\1\101\1\120\1\110\2\uffff\1\101\1\124\2\60\1\124\1\117\2\uffff\1\110\1\122\1\123\2\60\2\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\163\1\162\1\145\1\164\1\171\3\162\1\170\1\145\2\163\1\157\1\145\2\151\1\157\1\165\1\162\1\157\1\75\1\56\1\76\1\176\1\75\1\171\10\uffff\1\57\12\uffff\1\uffff\1\uffff\2\uffff\1\170\1\145\1\uffff\1\154\1\172\1\171\1\uffff\1\154\1\162\1\154\1\157\1\164\1\157\1\156\2\141\1\151\1\164\1\165\1\145\1\160\1\163\1\166\1\164\1\163\1\157\1\164\2\172\1\162\1\157\1\164\1\163\1\144\1\141\1\167\1\151\2\172\1\155\1\141\1\164\1\162\1\145\1\164\1\145\1\151\1\164\1\154\1\145\1\165\1\162\13\uffff\1\172\25\uffff\2\uffff\1\uffff\2\uffff\2\uffff\1\145\2\uffff\2\172\1\145\1\uffff\2\172\1\154\1\164\1\145\1\163\1\155\1\172\1\165\1\157\1\165\1\162\1\147\1\162\1\156\1\160\1\172\1\164\1\155\1\156\1\141\1\150\1\154\1\145\1\172\1\143\1\145\1\141\1\164\1\160\1\151\1\145\2\uffff\1\151\1\146\1\154\1\162\1\163\1\145\1\172\1\144\1\161\1\151\1\156\1\145\2\uffff\1\151\1\144\1\143\1\147\1\162\1\150\1\154\1\156\2\145\1\172\1\154\1\156\1\145\1\172\1\uffff\1\uffff\1\uffff\1\uffff\1\150\1\uffff\1\156\1\uffff\1\162\2\uffff\1\144\1\145\1\141\1\145\1\172\1\164\1\uffff\1\143\1\166\1\162\1\164\1\154\1\164\2\172\1\uffff\1\164\1\141\1\151\2\164\1\145\2\172\1\uffff\1\172\1\164\1\143\1\151\1\172\1\157\1\162\1\157\1\151\2\141\1\164\2\172\1\uffff\1\145\1\165\2\156\1\147\1\170\1\164\1\172\1\150\2\145\2\172\1\144\3\172\1\uffff\3\172\1\uffff\1\157\1\144\2\164\1\162\1\143\1\172\1\uffff\1\151\2\145\1\156\2\145\1\172\2\uffff\1\162\1\151\1\164\1\172\1\145\1\162\2\uffff\1\156\1\uffff\1\145\1\150\1\156\1\uffff\1\156\1\172\1\144\1\154\1\151\1\143\1\163\2\uffff\1\162\1\145\1\172\1\144\3\172\1\uffff\3\172\2\uffff\1\172\6\uffff\1\162\1\151\1\172\1\145\1\172\1\150\1\uffff\1\157\3\172\1\163\2\172\1\uffff\1\141\1\156\1\172\1\uffff\2\172\1\144\2\172\1\143\1\141\1\uffff\1\151\1\145\1\156\1\164\1\172\1\163\1\172\1\uffff\1\172\7\uffff\1\164\1\156\1\uffff\1\162\1\uffff\1\172\1\156\3\uffff\1\164\2\uffff\1\151\1\163\3\uffff\1\151\2\uffff\1\164\1\154\1\143\3\172\1\uffff\1\172\2\uffff\1\145\1\147\1\155\1\uffff\1\163\1\160\1\156\1\172\1\156\3\172\4\uffff\1\163\1\172\1\151\1\150\1\141\1\164\1\uffff\1\147\3\uffff\1\164\1\uffff\1\156\1\151\1\164\2\172\1\160\1\141\1\160\1\150\2\uffff\1\141\1\164\2\172\1\164\1\157\2\uffff\1\150\1\162\1\163\2\172\2\uffff";
    static final String DFA20_acceptS =
        "\33\uffff\1\124\1\125\1\126\1\127\1\130\1\131\1\133\1\134\1\uffff\1\137\1\140\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\153\1\uffff\1\156\4\uffff\1\164\3\uffff\1\153\55\uffff\1\110\1\132\1\111\1\135\1\112\1\113\1\141\1\114\1\142\1\115\1\143\1\uffff\1\124\1\125\1\126\1\127\1\130\1\131\1\133\1\134\1\154\1\155\1\136\1\137\1\140\1\144\1\145\1\146\1\147\1\150\1\151\1\152\1\156\2\uffff\1\157\2\uffff\1\157\1\160\1\uffff\1\161\1\162\3\uffff\1\116\40\uffff\1\123\1\122\14\uffff\1\120\1\121\17\uffff\1\117\1\uffff\1\157\2\uffff\1\76\1\uffff\1\101\1\uffff\1\77\1\100\6\uffff\1\105\10\uffff\1\106\10\uffff\1\102\16\uffff\1\103\21\uffff\1\104\3\uffff\1\107\7\uffff\1\62\7\uffff\1\70\1\71\6\uffff\1\54\1\55\1\uffff\1\56\3\uffff\1\57\7\uffff\1\60\1\61\7\uffff\1\64\3\uffff\1\74\1\75\1\uffff\1\63\1\65\1\66\1\67\1\72\1\73\6\uffff\1\41\7\uffff\1\47\3\uffff\1\40\7\uffff\1\46\7\uffff\1\50\1\uffff\1\51\1\42\1\43\1\44\1\45\1\52\1\53\2\uffff\1\21\1\uffff\1\30\2\uffff\1\31\1\32\1\33\1\uffff\1\34\1\35\2\uffff\1\22\1\23\1\24\1\uffff\1\25\1\26\6\uffff\1\27\1\uffff\1\36\1\37\3\uffff\1\16\10\uffff\1\20\1\14\1\15\1\17\6\uffff\1\10\1\uffff\1\11\1\12\1\13\1\uffff\1\7\11\uffff\1\5\1\6\6\uffff\1\3\1\4\5\uffff\1\2\1\1";
    static final String DFA20_specialS =
        "\1\10\55\uffff\1\4\1\uffff\1\5\1\11\125\uffff\1\6\1\1\1\uffff\1\7\1\3\111\uffff\1\0\1\uffff\1\2\u0102\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\64\2\57\2\64\1\57\22\64\1\57\1\33\1\60\1\64\1\34\1\35\1\64\1\61\1\36\1\37\1\40\1\25\1\41\1\42\1\26\1\43\1\62\11\63\1\44\1\45\1\27\1\30\1\31\1\46\1\64\1\1\1\32\1\5\1\6\1\11\1\2\1\55\1\12\1\14\1\21\1\55\1\15\1\16\1\22\1\7\1\10\1\55\1\3\1\4\1\23\1\13\1\55\1\17\1\24\1\20\1\55\1\47\1\64\1\50\1\51\1\55\1\56\1\1\1\32\1\5\1\6\1\11\1\2\1\55\1\12\1\14\1\21\1\55\1\15\1\16\1\22\1\7\1\10\1\55\1\3\1\4\1\23\1\13\1\55\1\17\1\24\1\20\1\55\1\52\1\53\1\54\uff82\64",
            "\1\65\1\uffff\1\67\4\uffff\1\66\30\uffff\1\65\1\uffff\1\67\4\uffff\1\66",
            "\1\73\7\uffff\1\71\5\uffff\1\72\2\uffff\1\74\16\uffff\1\73\7\uffff\1\71\5\uffff\1\72\2\uffff\1\74",
            "\1\75\37\uffff\1\75",
            "\1\101\1\uffff\1\103\2\uffff\1\76\1\77\1\uffff\1\102\10\uffff\1\100\16\uffff\1\101\1\uffff\1\103\2\uffff\1\76\1\77\1\uffff\1\102\10\uffff\1\100",
            "\1\107\15\uffff\1\104\2\uffff\1\105\1\110\5\uffff\1\106\7\uffff\1\107\15\uffff\1\104\2\uffff\1\105\1\110\5\uffff\1\106",
            "\1\111\3\uffff\1\112\10\uffff\1\113\22\uffff\1\111\3\uffff\1\112\10\uffff\1\113",
            "\1\116\1\uffff\1\114\1\uffff\1\115\33\uffff\1\116\1\uffff\1\114\1\uffff\1\115",
            "\1\117\14\uffff\1\120\22\uffff\1\117\14\uffff\1\120",
            "\1\122\1\uffff\1\123\11\uffff\1\121\23\uffff\1\122\1\uffff\1\123\11\uffff\1\121",
            "\1\124\37\uffff\1\124",
            "\1\125\4\uffff\1\126\32\uffff\1\125\4\uffff\1\126",
            "\1\127\4\uffff\1\130\32\uffff\1\127\4\uffff\1\130",
            "\1\131\5\uffff\1\132\31\uffff\1\131\5\uffff\1\132",
            "\1\133\3\uffff\1\134\33\uffff\1\133\3\uffff\1\134",
            "\1\135\1\136\36\uffff\1\135\1\136",
            "\1\137\37\uffff\1\137",
            "\1\140\37\uffff\1\140",
            "\1\141\5\uffff\1\142\31\uffff\1\141\5\uffff\1\142",
            "\1\143\11\uffff\1\144\25\uffff\1\143\11\uffff\1\144",
            "\1\145\37\uffff\1\145",
            "\1\146",
            "\1\150",
            "\1\152\1\153",
            "\1\155",
            "\1\157",
            "\1\161\37\uffff\1\161",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\172\4\uffff\1\173",
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
            "\0\70",
            "",
            "\42\u0088\1\u0089\71\u0088\1\u0087\uffa3\u0088",
            "\47\u008b\1\u008c\64\u008b\1\u008a\uffa3\u008b",
            "\12\u008e\36\uffff\1\u008d\14\uffff\1\u0090\22\uffff\1\u008d",
            "\12\u008e\53\uffff\1\u0090",
            "",
            "\1\u0091\37\uffff\1\u0091",
            "\12\70\7\uffff\2\70\1\u0092\17\70\1\u0093\7\70\4\uffff\1\70\1\uffff\2\70\1\u0092\17\70\1\u0093\7\70",
            "\1\u0095\24\uffff\1\u0096\12\uffff\1\u0095\24\uffff\1\u0096",
            "",
            "\1\u0097\6\uffff\1\u0098\30\uffff\1\u0097\6\uffff\1\u0098",
            "\1\u0099\37\uffff\1\u0099",
            "\1\u009a\37\uffff\1\u009a",
            "\1\u009b\37\uffff\1\u009b",
            "\1\u009d\7\uffff\1\u009c\1\u009e\6\uffff\1\u009f\17\uffff\1\u009d\7\uffff\1\u009c\1\u009e\6\uffff\1\u009f",
            "\1\u00a0\37\uffff\1\u00a0",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a2\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a4\37\uffff\1\u00a4",
            "\1\u00a5\37\uffff\1\u00a5",
            "\1\u00a7\1\u00a6\6\uffff\1\u00a8\27\uffff\1\u00a7\1\u00a6\6\uffff\1\u00a8",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00aa\37\uffff\1\u00aa",
            "\1\u00ab\6\uffff\1\u00ac\30\uffff\1\u00ab\6\uffff\1\u00ac",
            "\1\u00ad\37\uffff\1\u00ad",
            "\1\u00af\6\uffff\1\u00ae\1\u00b0\27\uffff\1\u00af\6\uffff\1\u00ae\1\u00b0",
            "\1\u00b1\37\uffff\1\u00b1",
            "\1\u00b2\37\uffff\1\u00b2",
            "\1\u00b3\37\uffff\1\u00b3",
            "\12\70\7\uffff\3\70\1\u00b4\26\70\4\uffff\1\70\1\uffff\3\70\1\u00b4\26\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00b7\37\uffff\1\u00b7",
            "\1\u00b8\37\uffff\1\u00b8",
            "\1\u00bb\6\uffff\1\u00b9\3\uffff\1\u00ba\24\uffff\1\u00bb\6\uffff\1\u00b9\3\uffff\1\u00ba",
            "\1\u00bc\37\uffff\1\u00bc",
            "\1\u00bd\37\uffff\1\u00bd",
            "\1\u00be\37\uffff\1\u00be",
            "\1\u00bf\15\uffff\1\u00c0\21\uffff\1\u00bf\15\uffff\1\u00c0",
            "\1\u00c1\37\uffff\1\u00c1",
            "\12\70\7\uffff\3\70\1\u00c2\26\70\4\uffff\1\70\1\uffff\3\70\1\u00c2\26\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00c5\37\uffff\1\u00c5",
            "\1\u00c6\37\uffff\1\u00c6",
            "\1\u00c7\37\uffff\1\u00c7",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00c9\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\1\u00cb\37\uffff\1\u00cb",
            "\1\u00cc\37\uffff\1\u00cc",
            "\1\u00cd\11\uffff\1\u00ce\5\uffff\1\u00cf\17\uffff\1\u00cd\11\uffff\1\u00ce\5\uffff\1\u00cf",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d1\37\uffff\1\u00d1",
            "\1\u00d2\37\uffff\1\u00d2",
            "\1\u00d3\37\uffff\1\u00d3",
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
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
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
            "\12\70\7\uffff\22\70\1\u00d8\7\70\4\uffff\1\70\1\uffff\22\70\1\u00d8\7\70",
            "\12\70\7\uffff\4\70\1\u00da\25\70\4\uffff\1\70\1\uffff\4\70\1\u00da\25\70",
            "\1\u00dc\37\uffff\1\u00dc",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00df\37\uffff\1\u00df",
            "\1\u00e0\37\uffff\1\u00e0",
            "\1\u00e1\37\uffff\1\u00e1",
            "\1\u00e2\37\uffff\1\u00e2",
            "\1\u00e3\37\uffff\1\u00e3",
            "\12\70\7\uffff\1\u00e4\31\70\4\uffff\1\70\1\uffff\1\u00e4\31\70",
            "\1\u00e6\37\uffff\1\u00e6",
            "\1\u00e7\37\uffff\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e8",
            "\1\u00e9\37\uffff\1\u00e9",
            "\1\u00ea\37\uffff\1\u00ea",
            "\1\u00eb\37\uffff\1\u00eb",
            "\1\u00ec\37\uffff\1\u00ec",
            "\1\u00ed\37\uffff\1\u00ed",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00ef\1\u00f0\36\uffff\1\u00ef\1\u00f0",
            "\1\u00f1\37\uffff\1\u00f1",
            "\1\u00f2\37\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f3",
            "\1\u00f4\37\uffff\1\u00f4",
            "\1\u00f5\37\uffff\1\u00f5",
            "\1\u00f6\37\uffff\1\u00f6",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u00f8\37\uffff\1\u00f8",
            "\1\u00f9\37\uffff\1\u00f9",
            "\1\u00fa\37\uffff\1\u00fa",
            "\1\u00fb\37\uffff\1\u00fb",
            "\1\u00fc\37\uffff\1\u00fc",
            "\1\u00fd\37\uffff\1\u00fd",
            "\1\u00fe\37\uffff\1\u00fe",
            "",
            "",
            "\1\u00ff\37\uffff\1\u00ff",
            "\1\u0100\37\uffff\1\u0100",
            "\1\u0101\37\uffff\1\u0101",
            "\1\u0102\37\uffff\1\u0102",
            "\1\u0103\37\uffff\1\u0103",
            "\1\u0104\37\uffff\1\u0104",
            "\12\70\7\uffff\22\70\1\u0105\7\70\4\uffff\1\70\1\uffff\22\70\1\u0105\7\70",
            "\1\u0107\37\uffff\1\u0107",
            "\1\u0109\1\uffff\1\u0108\35\uffff\1\u0109\1\uffff\1\u0108",
            "\1\u010a\37\uffff\1\u010a",
            "\1\u010b\37\uffff\1\u010b",
            "\1\u010c\37\uffff\1\u010c",
            "",
            "",
            "\1\u010d\37\uffff\1\u010d",
            "\1\u010e\37\uffff\1\u010e",
            "\1\u010f\37\uffff\1\u010f",
            "\1\u0110\37\uffff\1\u0110",
            "\1\u0112\3\uffff\1\u0111\33\uffff\1\u0112\3\uffff\1\u0111",
            "\1\u0113\37\uffff\1\u0113",
            "\1\u0114\37\uffff\1\u0114",
            "\1\u0115\37\uffff\1\u0115",
            "\1\u0116\37\uffff\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0119\37\uffff\1\u0119",
            "\1\u011a\37\uffff\1\u011a",
            "\1\u011b\37\uffff\1\u011b",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\42\u0088\1\u0089\71\u0088\1\u0087\uffa3\u0088",
            "",
            "\47\u008b\1\u008c\64\u008b\1\u008a\uffa3\u008b",
            "\1\u011d\37\uffff\1\u011d",
            "",
            "\1\u011e\37\uffff\1\u011e",
            "",
            "\1\u011f\37\uffff\1\u011f",
            "",
            "",
            "\1\u0120\37\uffff\1\u0120",
            "\1\u0121\37\uffff\1\u0121",
            "\1\u0122\37\uffff\1\u0122",
            "\1\u0123\37\uffff\1\u0123",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0125\37\uffff\1\u0125",
            "",
            "\1\u0126\37\uffff\1\u0126",
            "\1\u0127\37\uffff\1\u0127",
            "\1\u0128\37\uffff\1\u0128",
            "\1\u0129\37\uffff\1\u0129",
            "\1\u012a\37\uffff\1\u012a",
            "\1\u012b\37\uffff\1\u012b",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u012e\37\uffff\1\u012e",
            "\1\u012f\37\uffff\1\u012f",
            "\1\u0130\37\uffff\1\u0130",
            "\1\u0131\37\uffff\1\u0131",
            "\1\u0132\37\uffff\1\u0132",
            "\1\u0133\37\uffff\1\u0133",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\4\70\1\u0136\25\70\4\uffff\1\70\1\uffff\4\70\1\u0136\25\70",
            "\1\u0138\37\uffff\1\u0138",
            "\1\u0139\37\uffff\1\u0139",
            "\1\u013a\37\uffff\1\u013a",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u013c\37\uffff\1\u013c",
            "\1\u013d\37\uffff\1\u013d",
            "\1\u013e\37\uffff\1\u013e",
            "\1\u013f\37\uffff\1\u013f",
            "\1\u0140\37\uffff\1\u0140",
            "\1\u0141\37\uffff\1\u0141",
            "\1\u0142\37\uffff\1\u0142",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u0145\37\uffff\1\u0145",
            "\1\u0146\37\uffff\1\u0146",
            "\1\u0147\37\uffff\1\u0147",
            "\1\u0148\37\uffff\1\u0148",
            "\1\u0149\37\uffff\1\u0149",
            "\1\u014a\37\uffff\1\u014a",
            "\1\u014b\37\uffff\1\u014b",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u014d\37\uffff\1\u014d",
            "\1\u014e\37\uffff\1\u014e",
            "\1\u014f\37\uffff\1\u014f",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0152\37\uffff\1\u0152",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u0159\37\uffff\1\u0159",
            "\1\u015a\37\uffff\1\u015a",
            "\1\u015b\37\uffff\1\u015b",
            "\1\u015c\37\uffff\1\u015c",
            "\1\u015d\37\uffff\1\u015d",
            "\1\u015e\37\uffff\1\u015e",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u0160\37\uffff\1\u0160",
            "\1\u0161\37\uffff\1\u0161",
            "\1\u0162\37\uffff\1\u0162",
            "\1\u0163\37\uffff\1\u0163",
            "\1\u0164\37\uffff\1\u0164",
            "\1\u0165\37\uffff\1\u0165",
            "\12\70\7\uffff\22\70\1\u0166\7\70\4\uffff\1\70\1\uffff\22\70\1\u0166\7\70",
            "",
            "",
            "\1\u0168\37\uffff\1\u0168",
            "\1\u0169\37\uffff\1\u0169",
            "\1\u016a\37\uffff\1\u016a",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u016c\37\uffff\1\u016c",
            "\1\u016d\37\uffff\1\u016d",
            "",
            "",
            "\1\u016e\37\uffff\1\u016e",
            "",
            "\1\u016f\37\uffff\1\u016f",
            "\1\u0170\37\uffff\1\u0170",
            "\1\u0171\37\uffff\1\u0171",
            "",
            "\1\u0172\37\uffff\1\u0172",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0174\37\uffff\1\u0174",
            "\1\u0175\37\uffff\1\u0175",
            "\1\u0176\37\uffff\1\u0176",
            "\1\u0177\37\uffff\1\u0177",
            "\1\u0178\37\uffff\1\u0178",
            "",
            "",
            "\1\u0179\37\uffff\1\u0179",
            "\1\u017a\37\uffff\1\u017a",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u017c\37\uffff\1\u017c",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0184\37\uffff\1\u0184",
            "\1\u0185\37\uffff\1\u0185",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0187\37\uffff\1\u0187",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0189\37\uffff\1\u0189",
            "",
            "\1\u018a\37\uffff\1\u018a",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u018e\37\uffff\1\u018e",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\1\u0191\37\uffff\1\u0191",
            "\1\u0192\37\uffff\1\u0192",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0196\37\uffff\1\u0196",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u0199\37\uffff\1\u0199",
            "\1\u019a\37\uffff\1\u019a",
            "",
            "\1\u019b\37\uffff\1\u019b",
            "\1\u019c\37\uffff\1\u019c",
            "\1\u019d\37\uffff\1\u019d",
            "\1\u019e\37\uffff\1\u019e",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u01a0\37\uffff\1\u01a0",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01a3\37\uffff\1\u01a3",
            "\1\u01a4\37\uffff\1\u01a4",
            "",
            "\1\u01a5\37\uffff\1\u01a5",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u01a7\37\uffff\1\u01a7",
            "",
            "",
            "",
            "\1\u01a8\37\uffff\1\u01a8",
            "",
            "",
            "\1\u01a9\37\uffff\1\u01a9",
            "\1\u01aa\37\uffff\1\u01aa",
            "",
            "",
            "",
            "\1\u01ab\37\uffff\1\u01ab",
            "",
            "",
            "\1\u01ac\37\uffff\1\u01ac",
            "\1\u01ad\37\uffff\1\u01ad",
            "\1\u01ae\37\uffff\1\u01ae",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "\1\u01b3\37\uffff\1\u01b3",
            "\1\u01b4\37\uffff\1\u01b4",
            "\1\u01b5\37\uffff\1\u01b5",
            "",
            "\1\u01b6\37\uffff\1\u01b6",
            "\1\u01b7\37\uffff\1\u01b7",
            "\1\u01b8\37\uffff\1\u01b8",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u01ba\37\uffff\1\u01ba",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "",
            "",
            "",
            "",
            "\1\u01be\37\uffff\1\u01be",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u01c0\37\uffff\1\u01c0",
            "\1\u01c1\37\uffff\1\u01c1",
            "\1\u01c2\37\uffff\1\u01c2",
            "\1\u01c3\37\uffff\1\u01c3",
            "",
            "\1\u01c4\37\uffff\1\u01c4",
            "",
            "",
            "",
            "\1\u01c5\37\uffff\1\u01c5",
            "",
            "\1\u01c6\37\uffff\1\u01c6",
            "\1\u01c7\37\uffff\1\u01c7",
            "\1\u01c8\37\uffff\1\u01c8",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u01cb\37\uffff\1\u01cb",
            "\1\u01cc\37\uffff\1\u01cc",
            "\1\u01cd\37\uffff\1\u01cd",
            "\1\u01ce\37\uffff\1\u01ce",
            "",
            "",
            "\1\u01cf\37\uffff\1\u01cf",
            "\1\u01d0\37\uffff\1\u01d0",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\1\u01d3\37\uffff\1\u01d3",
            "\1\u01d4\37\uffff\1\u01d4",
            "",
            "",
            "\1\u01d5\37\uffff\1\u01d5",
            "\1\u01d6\37\uffff\1\u01d6",
            "\1\u01d7\37\uffff\1\u01d7",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
            "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
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
            return "1:1: Tokens : ( ALLSHORTESTPATHS | FIELDTERMINATOR | RELATIONSHIP | SHORTESTPATH | CONSTRAINT | DESCENDING | ASCENDING | CONTAINS | DISTINCT | OPTIONAL | PERIODIC | EXPLAIN | EXTRACT | FOREACH | HEADERS | PROFILE | ASSERT | COMMIT | CREATE | CYPHER | DELETE | DETACH | EXISTS | FILTER | REDUCE | REMOVE | RETURN | SINGLE | STARTS | UNIQUE | UNWIND | COUNT | FALSE | INDEX | LIMIT | MATCH | MERGE | ORDER | START | UNION | USING | WHERE | YIELD | CALL | CASE | DESC | DROP | ELSE | ENDS | FROM | JOIN | LOAD | NODE | NONE | NULL | SCAN | SKIP | THEN | TRUE | WHEN | WITH | ALL | AND | ANY | ASC | CSV | END | NOT | REL | SET | XOR | PlusSignEqualsSign | FullStopFullStop | LessThanSignEqualsSign | LessThanSignGreaterThanSign | EqualsSignTilde | GreaterThanSignEqualsSign | AS | BY | IN | IS | ON | OR | ExclamationMark | DollarSign | PercentSign | LeftParenthesis | RightParenthesis | Asterisk | PlusSign | Comma | HyphenMinus | FullStop | Solidus | Colon | Semicolon | LessThanSign | EqualsSign | GreaterThanSign | QuestionMark | LeftSquareBracket | RightSquareBracket | CircumflexAccent | LeftCurlyBracket | VerticalLine | RightCurlyBracket | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_STRING_LITERAL | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_STRING | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_213 = input.LA(1);

                        s = -1;
                        if ( (LA20_213=='\"') ) {s = 137;}

                        else if ( (LA20_213=='\\') ) {s = 135;}

                        else if ( ((LA20_213>='\u0000' && LA20_213<='!')||(LA20_213>='#' && LA20_213<='[')||(LA20_213>=']' && LA20_213<='\uFFFF')) ) {s = 136;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_136 = input.LA(1);

                        s = -1;
                        if ( (LA20_136=='\"') ) {s = 137;}

                        else if ( (LA20_136=='\\') ) {s = 135;}

                        else if ( ((LA20_136>='\u0000' && LA20_136<='!')||(LA20_136>='#' && LA20_136<='[')||(LA20_136>=']' && LA20_136<='\uFFFF')) ) {s = 136;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_215 = input.LA(1);

                        s = -1;
                        if ( (LA20_215=='\'') ) {s = 140;}

                        else if ( (LA20_215=='\\') ) {s = 138;}

                        else if ( ((LA20_215>='\u0000' && LA20_215<='&')||(LA20_215>='(' && LA20_215<='[')||(LA20_215>=']' && LA20_215<='\uFFFF')) ) {s = 139;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA20_139 = input.LA(1);

                        s = -1;
                        if ( (LA20_139=='\'') ) {s = 140;}

                        else if ( (LA20_139=='\\') ) {s = 138;}

                        else if ( ((LA20_139>='\u0000' && LA20_139<='&')||(LA20_139>='(' && LA20_139<='[')||(LA20_139>=']' && LA20_139<='\uFFFF')) ) {s = 139;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA20_46 = input.LA(1);

                        s = -1;
                        if ( ((LA20_46>='\u0000' && LA20_46<='\uFFFF')) ) {s = 56;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA20_48 = input.LA(1);

                        s = -1;
                        if ( (LA20_48=='\\') ) {s = 135;}

                        else if ( ((LA20_48>='\u0000' && LA20_48<='!')||(LA20_48>='#' && LA20_48<='[')||(LA20_48>=']' && LA20_48<='\uFFFF')) ) {s = 136;}

                        else if ( (LA20_48=='\"') ) {s = 137;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA20_135 = input.LA(1);

                        s = -1;
                        if ( ((LA20_135>='\u0000' && LA20_135<='\uFFFF')) ) {s = 213;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA20_138 = input.LA(1);

                        s = -1;
                        if ( ((LA20_138>='\u0000' && LA20_138<='\uFFFF')) ) {s = 215;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='A'||LA20_0=='a') ) {s = 1;}

                        else if ( (LA20_0=='F'||LA20_0=='f') ) {s = 2;}

                        else if ( (LA20_0=='R'||LA20_0=='r') ) {s = 3;}

                        else if ( (LA20_0=='S'||LA20_0=='s') ) {s = 4;}

                        else if ( (LA20_0=='C'||LA20_0=='c') ) {s = 5;}

                        else if ( (LA20_0=='D'||LA20_0=='d') ) {s = 6;}

                        else if ( (LA20_0=='O'||LA20_0=='o') ) {s = 7;}

                        else if ( (LA20_0=='P'||LA20_0=='p') ) {s = 8;}

                        else if ( (LA20_0=='E'||LA20_0=='e') ) {s = 9;}

                        else if ( (LA20_0=='H'||LA20_0=='h') ) {s = 10;}

                        else if ( (LA20_0=='U'||LA20_0=='u') ) {s = 11;}

                        else if ( (LA20_0=='I'||LA20_0=='i') ) {s = 12;}

                        else if ( (LA20_0=='L'||LA20_0=='l') ) {s = 13;}

                        else if ( (LA20_0=='M'||LA20_0=='m') ) {s = 14;}

                        else if ( (LA20_0=='W'||LA20_0=='w') ) {s = 15;}

                        else if ( (LA20_0=='Y'||LA20_0=='y') ) {s = 16;}

                        else if ( (LA20_0=='J'||LA20_0=='j') ) {s = 17;}

                        else if ( (LA20_0=='N'||LA20_0=='n') ) {s = 18;}

                        else if ( (LA20_0=='T'||LA20_0=='t') ) {s = 19;}

                        else if ( (LA20_0=='X'||LA20_0=='x') ) {s = 20;}

                        else if ( (LA20_0=='+') ) {s = 21;}

                        else if ( (LA20_0=='.') ) {s = 22;}

                        else if ( (LA20_0=='<') ) {s = 23;}

                        else if ( (LA20_0=='=') ) {s = 24;}

                        else if ( (LA20_0=='>') ) {s = 25;}

                        else if ( (LA20_0=='B'||LA20_0=='b') ) {s = 26;}

                        else if ( (LA20_0=='!') ) {s = 27;}

                        else if ( (LA20_0=='$') ) {s = 28;}

                        else if ( (LA20_0=='%') ) {s = 29;}

                        else if ( (LA20_0=='(') ) {s = 30;}

                        else if ( (LA20_0==')') ) {s = 31;}

                        else if ( (LA20_0=='*') ) {s = 32;}

                        else if ( (LA20_0==',') ) {s = 33;}

                        else if ( (LA20_0=='-') ) {s = 34;}

                        else if ( (LA20_0=='/') ) {s = 35;}

                        else if ( (LA20_0==':') ) {s = 36;}

                        else if ( (LA20_0==';') ) {s = 37;}

                        else if ( (LA20_0=='?') ) {s = 38;}

                        else if ( (LA20_0=='[') ) {s = 39;}

                        else if ( (LA20_0==']') ) {s = 40;}

                        else if ( (LA20_0=='^') ) {s = 41;}

                        else if ( (LA20_0=='{') ) {s = 42;}

                        else if ( (LA20_0=='|') ) {s = 43;}

                        else if ( (LA20_0=='}') ) {s = 44;}

                        else if ( (LA20_0=='G'||LA20_0=='K'||LA20_0=='Q'||LA20_0=='V'||LA20_0=='Z'||LA20_0=='_'||LA20_0=='g'||LA20_0=='k'||LA20_0=='q'||LA20_0=='v'||LA20_0=='z') ) {s = 45;}

                        else if ( (LA20_0=='`') ) {s = 46;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 47;}

                        else if ( (LA20_0=='\"') ) {s = 48;}

                        else if ( (LA20_0=='\'') ) {s = 49;}

                        else if ( (LA20_0=='0') ) {s = 50;}

                        else if ( ((LA20_0>='1' && LA20_0<='9')) ) {s = 51;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='#'||LA20_0=='&'||LA20_0=='@'||LA20_0=='\\'||(LA20_0>='~' && LA20_0<='\uFFFF')) ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA20_49 = input.LA(1);

                        s = -1;
                        if ( (LA20_49=='\\') ) {s = 138;}

                        else if ( ((LA20_49>='\u0000' && LA20_49<='&')||(LA20_49>='(' && LA20_49<='[')||(LA20_49>=']' && LA20_49<='\uFFFF')) ) {s = 139;}

                        else if ( (LA20_49=='\'') ) {s = 140;}

                        else s = 52;

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