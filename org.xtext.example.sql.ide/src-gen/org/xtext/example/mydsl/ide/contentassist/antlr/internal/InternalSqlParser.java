package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.SqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_STRING_LITERAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TRUE'", "'FALSE'", "'<'", "'>'", "'='", "'>='", "'<='", "'<>'", "'+'", "'-'", "'*'", "'/'", "'%'", "';'", "'SELECT'", "','", "'FROM'", "'JOIN'", "'ON'", "'('", "')'", "'WHERE'", "'OR'", "'AND'", "'NOT'", "'GROUP'", "'BY'", "'HAVING'", "'=~'", "'IN'", "'STARTS'", "'WITH'", "'ENDS'", "'CONTAINS'", "'IS'", "'NULL'", "'.'", "'COUNT'", "'XOR'", "'^'"
    };
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


        public InternalSqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSqlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSql.g"; }


    	private SqlGrammarAccess grammarAccess;

    	public void setGrammarAccess(SqlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalSql.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSql.g:54:1: ( ruleModel EOF )
            // InternalSql.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSql.g:62:1: ruleModel : ( ( rule__Model__QueriesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:66:2: ( ( ( rule__Model__QueriesAssignment )* ) )
            // InternalSql.g:67:2: ( ( rule__Model__QueriesAssignment )* )
            {
            // InternalSql.g:67:2: ( ( rule__Model__QueriesAssignment )* )
            // InternalSql.g:68:3: ( rule__Model__QueriesAssignment )*
            {
             before(grammarAccess.getModelAccess().getQueriesAssignment()); 
            // InternalSql.g:69:3: ( rule__Model__QueriesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSql.g:69:4: rule__Model__QueriesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__QueriesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getQueriesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQuery"
    // InternalSql.g:78:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalSql.g:79:1: ( ruleQuery EOF )
            // InternalSql.g:80:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalSql.g:87:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:91:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalSql.g:92:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalSql.g:92:2: ( ( rule__Query__Group__0 ) )
            // InternalSql.g:93:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalSql.g:94:3: ( rule__Query__Group__0 )
            // InternalSql.g:94:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleSelectSection"
    // InternalSql.g:103:1: entryRuleSelectSection : ruleSelectSection EOF ;
    public final void entryRuleSelectSection() throws RecognitionException {
        try {
            // InternalSql.g:104:1: ( ruleSelectSection EOF )
            // InternalSql.g:105:1: ruleSelectSection EOF
            {
             before(grammarAccess.getSelectSectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectSection();

            state._fsp--;

             after(grammarAccess.getSelectSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectSection"


    // $ANTLR start "ruleSelectSection"
    // InternalSql.g:112:1: ruleSelectSection : ( ( rule__SelectSection__Group__0 ) ) ;
    public final void ruleSelectSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:116:2: ( ( ( rule__SelectSection__Group__0 ) ) )
            // InternalSql.g:117:2: ( ( rule__SelectSection__Group__0 ) )
            {
            // InternalSql.g:117:2: ( ( rule__SelectSection__Group__0 ) )
            // InternalSql.g:118:3: ( rule__SelectSection__Group__0 )
            {
             before(grammarAccess.getSelectSectionAccess().getGroup()); 
            // InternalSql.g:119:3: ( rule__SelectSection__Group__0 )
            // InternalSql.g:119:4: rule__SelectSection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectSection"


    // $ANTLR start "entryRulefromSection"
    // InternalSql.g:128:1: entryRulefromSection : rulefromSection EOF ;
    public final void entryRulefromSection() throws RecognitionException {
        try {
            // InternalSql.g:129:1: ( rulefromSection EOF )
            // InternalSql.g:130:1: rulefromSection EOF
            {
             before(grammarAccess.getFromSectionRule()); 
            pushFollow(FOLLOW_1);
            rulefromSection();

            state._fsp--;

             after(grammarAccess.getFromSectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulefromSection"


    // $ANTLR start "rulefromSection"
    // InternalSql.g:137:1: rulefromSection : ( ( rule__FromSection__Group__0 ) ) ;
    public final void rulefromSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:141:2: ( ( ( rule__FromSection__Group__0 ) ) )
            // InternalSql.g:142:2: ( ( rule__FromSection__Group__0 ) )
            {
            // InternalSql.g:142:2: ( ( rule__FromSection__Group__0 ) )
            // InternalSql.g:143:3: ( rule__FromSection__Group__0 )
            {
             before(grammarAccess.getFromSectionAccess().getGroup()); 
            // InternalSql.g:144:3: ( rule__FromSection__Group__0 )
            // InternalSql.g:144:4: rule__FromSection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FromSection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromSectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulefromSection"


    // $ANTLR start "entryRuleFromItem"
    // InternalSql.g:153:1: entryRuleFromItem : ruleFromItem EOF ;
    public final void entryRuleFromItem() throws RecognitionException {
        try {
            // InternalSql.g:154:1: ( ruleFromItem EOF )
            // InternalSql.g:155:1: ruleFromItem EOF
            {
             before(grammarAccess.getFromItemRule()); 
            pushFollow(FOLLOW_1);
            ruleFromItem();

            state._fsp--;

             after(grammarAccess.getFromItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFromItem"


    // $ANTLR start "ruleFromItem"
    // InternalSql.g:162:1: ruleFromItem : ( ( rule__FromItem__Alternatives ) ) ;
    public final void ruleFromItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:166:2: ( ( ( rule__FromItem__Alternatives ) ) )
            // InternalSql.g:167:2: ( ( rule__FromItem__Alternatives ) )
            {
            // InternalSql.g:167:2: ( ( rule__FromItem__Alternatives ) )
            // InternalSql.g:168:3: ( rule__FromItem__Alternatives )
            {
             before(grammarAccess.getFromItemAccess().getAlternatives()); 
            // InternalSql.g:169:3: ( rule__FromItem__Alternatives )
            // InternalSql.g:169:4: rule__FromItem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFromItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFromItem"


    // $ANTLR start "entryRuleTable"
    // InternalSql.g:178:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalSql.g:179:1: ( ruleTable EOF )
            // InternalSql.g:180:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalSql.g:187:1: ruleTable : ( ( rule__Table__NameAssignment ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:191:2: ( ( ( rule__Table__NameAssignment ) ) )
            // InternalSql.g:192:2: ( ( rule__Table__NameAssignment ) )
            {
            // InternalSql.g:192:2: ( ( rule__Table__NameAssignment ) )
            // InternalSql.g:193:3: ( rule__Table__NameAssignment )
            {
             before(grammarAccess.getTableAccess().getNameAssignment()); 
            // InternalSql.g:194:3: ( rule__Table__NameAssignment )
            // InternalSql.g:194:4: rule__Table__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleWhereClause"
    // InternalSql.g:203:1: entryRuleWhereClause : ruleWhereClause EOF ;
    public final void entryRuleWhereClause() throws RecognitionException {
        try {
            // InternalSql.g:204:1: ( ruleWhereClause EOF )
            // InternalSql.g:205:1: ruleWhereClause EOF
            {
             before(grammarAccess.getWhereClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleWhereClause();

            state._fsp--;

             after(grammarAccess.getWhereClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // InternalSql.g:212:1: ruleWhereClause : ( ( rule__WhereClause__Group__0 ) ) ;
    public final void ruleWhereClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:216:2: ( ( ( rule__WhereClause__Group__0 ) ) )
            // InternalSql.g:217:2: ( ( rule__WhereClause__Group__0 ) )
            {
            // InternalSql.g:217:2: ( ( rule__WhereClause__Group__0 ) )
            // InternalSql.g:218:3: ( rule__WhereClause__Group__0 )
            {
             before(grammarAccess.getWhereClauseAccess().getGroup()); 
            // InternalSql.g:219:3: ( rule__WhereClause__Group__0 )
            // InternalSql.g:219:4: rule__WhereClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleBoolExpression"
    // InternalSql.g:228:1: entryRuleBoolExpression : ruleBoolExpression EOF ;
    public final void entryRuleBoolExpression() throws RecognitionException {
        try {
            // InternalSql.g:229:1: ( ruleBoolExpression EOF )
            // InternalSql.g:230:1: ruleBoolExpression EOF
            {
             before(grammarAccess.getBoolExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolExpression();

            state._fsp--;

             after(grammarAccess.getBoolExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // InternalSql.g:237:1: ruleBoolExpression : ( ( rule__BoolExpression__Group__0 ) ) ;
    public final void ruleBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:241:2: ( ( ( rule__BoolExpression__Group__0 ) ) )
            // InternalSql.g:242:2: ( ( rule__BoolExpression__Group__0 ) )
            {
            // InternalSql.g:242:2: ( ( rule__BoolExpression__Group__0 ) )
            // InternalSql.g:243:3: ( rule__BoolExpression__Group__0 )
            {
             before(grammarAccess.getBoolExpressionAccess().getGroup()); 
            // InternalSql.g:244:3: ( rule__BoolExpression__Group__0 )
            // InternalSql.g:244:4: rule__BoolExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleTerm"
    // InternalSql.g:253:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalSql.g:254:1: ( ruleTerm EOF )
            // InternalSql.g:255:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalSql.g:262:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:266:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalSql.g:267:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalSql.g:267:2: ( ( rule__Term__Group__0 ) )
            // InternalSql.g:268:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalSql.g:269:3: ( rule__Term__Group__0 )
            // InternalSql.g:269:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalSql.g:278:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalSql.g:279:1: ( ruleFactor EOF )
            // InternalSql.g:280:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalSql.g:287:1: ruleFactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:291:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalSql.g:292:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalSql.g:292:2: ( ( rule__Factor__Alternatives ) )
            // InternalSql.g:293:3: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // InternalSql.g:294:3: ( rule__Factor__Alternatives )
            // InternalSql.g:294:4: rule__Factor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleBinary"
    // InternalSql.g:303:1: entryRuleBinary : ruleBinary EOF ;
    public final void entryRuleBinary() throws RecognitionException {
        try {
            // InternalSql.g:304:1: ( ruleBinary EOF )
            // InternalSql.g:305:1: ruleBinary EOF
            {
             before(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_1);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getBinaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // InternalSql.g:312:1: ruleBinary : ( ( rule__Binary__Group__0 ) ) ;
    public final void ruleBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:316:2: ( ( ( rule__Binary__Group__0 ) ) )
            // InternalSql.g:317:2: ( ( rule__Binary__Group__0 ) )
            {
            // InternalSql.g:317:2: ( ( rule__Binary__Group__0 ) )
            // InternalSql.g:318:3: ( rule__Binary__Group__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup()); 
            // InternalSql.g:319:3: ( rule__Binary__Group__0 )
            // InternalSql.g:319:4: rule__Binary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinary"


    // $ANTLR start "entryRuleGroupClause"
    // InternalSql.g:328:1: entryRuleGroupClause : ruleGroupClause EOF ;
    public final void entryRuleGroupClause() throws RecognitionException {
        try {
            // InternalSql.g:329:1: ( ruleGroupClause EOF )
            // InternalSql.g:330:1: ruleGroupClause EOF
            {
             before(grammarAccess.getGroupClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupClause();

            state._fsp--;

             after(grammarAccess.getGroupClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupClause"


    // $ANTLR start "ruleGroupClause"
    // InternalSql.g:337:1: ruleGroupClause : ( ( rule__GroupClause__Group__0 ) ) ;
    public final void ruleGroupClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:341:2: ( ( ( rule__GroupClause__Group__0 ) ) )
            // InternalSql.g:342:2: ( ( rule__GroupClause__Group__0 ) )
            {
            // InternalSql.g:342:2: ( ( rule__GroupClause__Group__0 ) )
            // InternalSql.g:343:3: ( rule__GroupClause__Group__0 )
            {
             before(grammarAccess.getGroupClauseAccess().getGroup()); 
            // InternalSql.g:344:3: ( rule__GroupClause__Group__0 )
            // InternalSql.g:344:4: rule__GroupClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupClause"


    // $ANTLR start "entryRuleHavingClause"
    // InternalSql.g:353:1: entryRuleHavingClause : ruleHavingClause EOF ;
    public final void entryRuleHavingClause() throws RecognitionException {
        try {
            // InternalSql.g:354:1: ( ruleHavingClause EOF )
            // InternalSql.g:355:1: ruleHavingClause EOF
            {
             before(grammarAccess.getHavingClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleHavingClause();

            state._fsp--;

             after(grammarAccess.getHavingClauseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHavingClause"


    // $ANTLR start "ruleHavingClause"
    // InternalSql.g:362:1: ruleHavingClause : ( ( rule__HavingClause__Group__0 ) ) ;
    public final void ruleHavingClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:366:2: ( ( ( rule__HavingClause__Group__0 ) ) )
            // InternalSql.g:367:2: ( ( rule__HavingClause__Group__0 ) )
            {
            // InternalSql.g:367:2: ( ( rule__HavingClause__Group__0 ) )
            // InternalSql.g:368:3: ( rule__HavingClause__Group__0 )
            {
             before(grammarAccess.getHavingClauseAccess().getGroup()); 
            // InternalSql.g:369:3: ( rule__HavingClause__Group__0 )
            // InternalSql.g:369:4: rule__HavingClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HavingClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHavingClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHavingClause"


    // $ANTLR start "entryRuleExpression"
    // InternalSql.g:378:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalSql.g:379:1: ( ruleExpression EOF )
            // InternalSql.g:380:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSql.g:387:1: ruleExpression : ( ruleOrExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:391:2: ( ( ruleOrExpression ) )
            // InternalSql.g:392:2: ( ruleOrExpression )
            {
            // InternalSql.g:392:2: ( ruleOrExpression )
            // InternalSql.g:393:3: ruleOrExpression
            {
             before(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalSql.g:403:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalSql.g:404:1: ( ruleOrExpression EOF )
            // InternalSql.g:405:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalSql.g:412:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:416:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalSql.g:417:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalSql.g:417:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalSql.g:418:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalSql.g:419:3: ( rule__OrExpression__Group__0 )
            // InternalSql.g:419:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalSql.g:428:1: entryRuleXorExpression : ruleXorExpression EOF ;
    public final void entryRuleXorExpression() throws RecognitionException {
        try {
            // InternalSql.g:429:1: ( ruleXorExpression EOF )
            // InternalSql.g:430:1: ruleXorExpression EOF
            {
             before(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalSql.g:437:1: ruleXorExpression : ( ( rule__XorExpression__Group__0 ) ) ;
    public final void ruleXorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:441:2: ( ( ( rule__XorExpression__Group__0 ) ) )
            // InternalSql.g:442:2: ( ( rule__XorExpression__Group__0 ) )
            {
            // InternalSql.g:442:2: ( ( rule__XorExpression__Group__0 ) )
            // InternalSql.g:443:3: ( rule__XorExpression__Group__0 )
            {
             before(grammarAccess.getXorExpressionAccess().getGroup()); 
            // InternalSql.g:444:3: ( rule__XorExpression__Group__0 )
            // InternalSql.g:444:4: rule__XorExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXorExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalSql.g:453:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalSql.g:454:1: ( ruleAndExpression EOF )
            // InternalSql.g:455:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalSql.g:462:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:466:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalSql.g:467:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalSql.g:467:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalSql.g:468:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalSql.g:469:3: ( rule__AndExpression__Group__0 )
            // InternalSql.g:469:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleNotExpression"
    // InternalSql.g:478:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // InternalSql.g:479:1: ( ruleNotExpression EOF )
            // InternalSql.g:480:1: ruleNotExpression EOF
            {
             before(grammarAccess.getNotExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNotExpression();

            state._fsp--;

             after(grammarAccess.getNotExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalSql.g:487:1: ruleNotExpression : ( ( rule__NotExpression__Alternatives ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:491:2: ( ( ( rule__NotExpression__Alternatives ) ) )
            // InternalSql.g:492:2: ( ( rule__NotExpression__Alternatives ) )
            {
            // InternalSql.g:492:2: ( ( rule__NotExpression__Alternatives ) )
            // InternalSql.g:493:3: ( rule__NotExpression__Alternatives )
            {
             before(grammarAccess.getNotExpressionAccess().getAlternatives()); 
            // InternalSql.g:494:3: ( rule__NotExpression__Alternatives )
            // InternalSql.g:494:4: rule__NotExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalSql.g:503:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalSql.g:504:1: ( ruleComparisonExpression EOF )
            // InternalSql.g:505:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalSql.g:512:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:516:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalSql.g:517:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalSql.g:517:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalSql.g:518:3: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // InternalSql.g:519:3: ( rule__ComparisonExpression__Group__0 )
            // InternalSql.g:519:4: rule__ComparisonExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleAddOrSubtractExpression"
    // InternalSql.g:528:1: entryRuleAddOrSubtractExpression : ruleAddOrSubtractExpression EOF ;
    public final void entryRuleAddOrSubtractExpression() throws RecognitionException {
        try {
            // InternalSql.g:529:1: ( ruleAddOrSubtractExpression EOF )
            // InternalSql.g:530:1: ruleAddOrSubtractExpression EOF
            {
             before(grammarAccess.getAddOrSubtractExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddOrSubtractExpression();

            state._fsp--;

             after(grammarAccess.getAddOrSubtractExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddOrSubtractExpression"


    // $ANTLR start "ruleAddOrSubtractExpression"
    // InternalSql.g:537:1: ruleAddOrSubtractExpression : ( ( rule__AddOrSubtractExpression__Group__0 ) ) ;
    public final void ruleAddOrSubtractExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:541:2: ( ( ( rule__AddOrSubtractExpression__Group__0 ) ) )
            // InternalSql.g:542:2: ( ( rule__AddOrSubtractExpression__Group__0 ) )
            {
            // InternalSql.g:542:2: ( ( rule__AddOrSubtractExpression__Group__0 ) )
            // InternalSql.g:543:3: ( rule__AddOrSubtractExpression__Group__0 )
            {
             before(grammarAccess.getAddOrSubtractExpressionAccess().getGroup()); 
            // InternalSql.g:544:3: ( rule__AddOrSubtractExpression__Group__0 )
            // InternalSql.g:544:4: rule__AddOrSubtractExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddOrSubtractExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddOrSubtractExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddOrSubtractExpression"


    // $ANTLR start "entryRuleMultiplyDivideModuloExpression"
    // InternalSql.g:553:1: entryRuleMultiplyDivideModuloExpression : ruleMultiplyDivideModuloExpression EOF ;
    public final void entryRuleMultiplyDivideModuloExpression() throws RecognitionException {
        try {
            // InternalSql.g:554:1: ( ruleMultiplyDivideModuloExpression EOF )
            // InternalSql.g:555:1: ruleMultiplyDivideModuloExpression EOF
            {
             before(grammarAccess.getMultiplyDivideModuloExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplyDivideModuloExpression();

            state._fsp--;

             after(grammarAccess.getMultiplyDivideModuloExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplyDivideModuloExpression"


    // $ANTLR start "ruleMultiplyDivideModuloExpression"
    // InternalSql.g:562:1: ruleMultiplyDivideModuloExpression : ( ( rule__MultiplyDivideModuloExpression__Group__0 ) ) ;
    public final void ruleMultiplyDivideModuloExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:566:2: ( ( ( rule__MultiplyDivideModuloExpression__Group__0 ) ) )
            // InternalSql.g:567:2: ( ( rule__MultiplyDivideModuloExpression__Group__0 ) )
            {
            // InternalSql.g:567:2: ( ( rule__MultiplyDivideModuloExpression__Group__0 ) )
            // InternalSql.g:568:3: ( rule__MultiplyDivideModuloExpression__Group__0 )
            {
             before(grammarAccess.getMultiplyDivideModuloExpressionAccess().getGroup()); 
            // InternalSql.g:569:3: ( rule__MultiplyDivideModuloExpression__Group__0 )
            // InternalSql.g:569:4: rule__MultiplyDivideModuloExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyDivideModuloExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyDivideModuloExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplyDivideModuloExpression"


    // $ANTLR start "entryRulePowerOfExpression"
    // InternalSql.g:578:1: entryRulePowerOfExpression : rulePowerOfExpression EOF ;
    public final void entryRulePowerOfExpression() throws RecognitionException {
        try {
            // InternalSql.g:579:1: ( rulePowerOfExpression EOF )
            // InternalSql.g:580:1: rulePowerOfExpression EOF
            {
             before(grammarAccess.getPowerOfExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePowerOfExpression();

            state._fsp--;

             after(grammarAccess.getPowerOfExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePowerOfExpression"


    // $ANTLR start "rulePowerOfExpression"
    // InternalSql.g:587:1: rulePowerOfExpression : ( ( rule__PowerOfExpression__Group__0 ) ) ;
    public final void rulePowerOfExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:591:2: ( ( ( rule__PowerOfExpression__Group__0 ) ) )
            // InternalSql.g:592:2: ( ( rule__PowerOfExpression__Group__0 ) )
            {
            // InternalSql.g:592:2: ( ( rule__PowerOfExpression__Group__0 ) )
            // InternalSql.g:593:3: ( rule__PowerOfExpression__Group__0 )
            {
             before(grammarAccess.getPowerOfExpressionAccess().getGroup()); 
            // InternalSql.g:594:3: ( rule__PowerOfExpression__Group__0 )
            // InternalSql.g:594:4: rule__PowerOfExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PowerOfExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPowerOfExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePowerOfExpression"


    // $ANTLR start "entryRuleUnaryAddOrSubtractExpression"
    // InternalSql.g:603:1: entryRuleUnaryAddOrSubtractExpression : ruleUnaryAddOrSubtractExpression EOF ;
    public final void entryRuleUnaryAddOrSubtractExpression() throws RecognitionException {
        try {
            // InternalSql.g:604:1: ( ruleUnaryAddOrSubtractExpression EOF )
            // InternalSql.g:605:1: ruleUnaryAddOrSubtractExpression EOF
            {
             before(grammarAccess.getUnaryAddOrSubtractExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryAddOrSubtractExpression();

            state._fsp--;

             after(grammarAccess.getUnaryAddOrSubtractExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryAddOrSubtractExpression"


    // $ANTLR start "ruleUnaryAddOrSubtractExpression"
    // InternalSql.g:612:1: ruleUnaryAddOrSubtractExpression : ( ( rule__UnaryAddOrSubtractExpression__Alternatives ) ) ;
    public final void ruleUnaryAddOrSubtractExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:616:2: ( ( ( rule__UnaryAddOrSubtractExpression__Alternatives ) ) )
            // InternalSql.g:617:2: ( ( rule__UnaryAddOrSubtractExpression__Alternatives ) )
            {
            // InternalSql.g:617:2: ( ( rule__UnaryAddOrSubtractExpression__Alternatives ) )
            // InternalSql.g:618:3: ( rule__UnaryAddOrSubtractExpression__Alternatives )
            {
             before(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getAlternatives()); 
            // InternalSql.g:619:3: ( rule__UnaryAddOrSubtractExpression__Alternatives )
            // InternalSql.g:619:4: rule__UnaryAddOrSubtractExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UnaryAddOrSubtractExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryAddOrSubtractExpression"


    // $ANTLR start "entryRuleStringListNullOperatorExpression"
    // InternalSql.g:628:1: entryRuleStringListNullOperatorExpression : ruleStringListNullOperatorExpression EOF ;
    public final void entryRuleStringListNullOperatorExpression() throws RecognitionException {
        try {
            // InternalSql.g:629:1: ( ruleStringListNullOperatorExpression EOF )
            // InternalSql.g:630:1: ruleStringListNullOperatorExpression EOF
            {
             before(grammarAccess.getStringListNullOperatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleStringListNullOperatorExpression();

            state._fsp--;

             after(grammarAccess.getStringListNullOperatorExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringListNullOperatorExpression"


    // $ANTLR start "ruleStringListNullOperatorExpression"
    // InternalSql.g:637:1: ruleStringListNullOperatorExpression : ( ( rule__StringListNullOperatorExpression__Group__0 ) ) ;
    public final void ruleStringListNullOperatorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:641:2: ( ( ( rule__StringListNullOperatorExpression__Group__0 ) ) )
            // InternalSql.g:642:2: ( ( rule__StringListNullOperatorExpression__Group__0 ) )
            {
            // InternalSql.g:642:2: ( ( rule__StringListNullOperatorExpression__Group__0 ) )
            // InternalSql.g:643:3: ( rule__StringListNullOperatorExpression__Group__0 )
            {
             before(grammarAccess.getStringListNullOperatorExpressionAccess().getGroup()); 
            // InternalSql.g:644:3: ( rule__StringListNullOperatorExpression__Group__0 )
            // InternalSql.g:644:4: rule__StringListNullOperatorExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringListNullOperatorExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringListNullOperatorExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringListNullOperatorExpression"


    // $ANTLR start "entryRuleStringOperatorExpression"
    // InternalSql.g:653:1: entryRuleStringOperatorExpression : ruleStringOperatorExpression EOF ;
    public final void entryRuleStringOperatorExpression() throws RecognitionException {
        try {
            // InternalSql.g:654:1: ( ruleStringOperatorExpression EOF )
            // InternalSql.g:655:1: ruleStringOperatorExpression EOF
            {
             before(grammarAccess.getStringOperatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleStringOperatorExpression();

            state._fsp--;

             after(grammarAccess.getStringOperatorExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringOperatorExpression"


    // $ANTLR start "ruleStringOperatorExpression"
    // InternalSql.g:662:1: ruleStringOperatorExpression : ( ( rule__StringOperatorExpression__Group__0 ) ) ;
    public final void ruleStringOperatorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:666:2: ( ( ( rule__StringOperatorExpression__Group__0 ) ) )
            // InternalSql.g:667:2: ( ( rule__StringOperatorExpression__Group__0 ) )
            {
            // InternalSql.g:667:2: ( ( rule__StringOperatorExpression__Group__0 ) )
            // InternalSql.g:668:3: ( rule__StringOperatorExpression__Group__0 )
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getGroup()); 
            // InternalSql.g:669:3: ( rule__StringOperatorExpression__Group__0 )
            // InternalSql.g:669:4: rule__StringOperatorExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringOperatorExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringOperatorExpression"


    // $ANTLR start "entryRuleNullOperatorExpression"
    // InternalSql.g:678:1: entryRuleNullOperatorExpression : ruleNullOperatorExpression EOF ;
    public final void entryRuleNullOperatorExpression() throws RecognitionException {
        try {
            // InternalSql.g:679:1: ( ruleNullOperatorExpression EOF )
            // InternalSql.g:680:1: ruleNullOperatorExpression EOF
            {
             before(grammarAccess.getNullOperatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNullOperatorExpression();

            state._fsp--;

             after(grammarAccess.getNullOperatorExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNullOperatorExpression"


    // $ANTLR start "ruleNullOperatorExpression"
    // InternalSql.g:687:1: ruleNullOperatorExpression : ( ( rule__NullOperatorExpression__Alternatives ) ) ;
    public final void ruleNullOperatorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:691:2: ( ( ( rule__NullOperatorExpression__Alternatives ) ) )
            // InternalSql.g:692:2: ( ( rule__NullOperatorExpression__Alternatives ) )
            {
            // InternalSql.g:692:2: ( ( rule__NullOperatorExpression__Alternatives ) )
            // InternalSql.g:693:3: ( rule__NullOperatorExpression__Alternatives )
            {
             before(grammarAccess.getNullOperatorExpressionAccess().getAlternatives()); 
            // InternalSql.g:694:3: ( rule__NullOperatorExpression__Alternatives )
            // InternalSql.g:694:4: rule__NullOperatorExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NullOperatorExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNullOperatorExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNullOperatorExpression"


    // $ANTLR start "entryRulePropertyOrRelationAttributeExpression"
    // InternalSql.g:703:1: entryRulePropertyOrRelationAttributeExpression : rulePropertyOrRelationAttributeExpression EOF ;
    public final void entryRulePropertyOrRelationAttributeExpression() throws RecognitionException {
        try {
            // InternalSql.g:704:1: ( rulePropertyOrRelationAttributeExpression EOF )
            // InternalSql.g:705:1: rulePropertyOrRelationAttributeExpression EOF
            {
             before(grammarAccess.getPropertyOrRelationAttributeExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyOrRelationAttributeExpression();

            state._fsp--;

             after(grammarAccess.getPropertyOrRelationAttributeExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyOrRelationAttributeExpression"


    // $ANTLR start "rulePropertyOrRelationAttributeExpression"
    // InternalSql.g:712:1: rulePropertyOrRelationAttributeExpression : ( ( rule__PropertyOrRelationAttributeExpression__Group__0 ) ) ;
    public final void rulePropertyOrRelationAttributeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:716:2: ( ( ( rule__PropertyOrRelationAttributeExpression__Group__0 ) ) )
            // InternalSql.g:717:2: ( ( rule__PropertyOrRelationAttributeExpression__Group__0 ) )
            {
            // InternalSql.g:717:2: ( ( rule__PropertyOrRelationAttributeExpression__Group__0 ) )
            // InternalSql.g:718:3: ( rule__PropertyOrRelationAttributeExpression__Group__0 )
            {
             before(grammarAccess.getPropertyOrRelationAttributeExpressionAccess().getGroup()); 
            // InternalSql.g:719:3: ( rule__PropertyOrRelationAttributeExpression__Group__0 )
            // InternalSql.g:719:4: rule__PropertyOrRelationAttributeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyOrRelationAttributeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyOrRelationAttributeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyOrRelationAttributeExpression"


    // $ANTLR start "entryRuleAttributeLookup"
    // InternalSql.g:728:1: entryRuleAttributeLookup : ruleAttributeLookup EOF ;
    public final void entryRuleAttributeLookup() throws RecognitionException {
        try {
            // InternalSql.g:729:1: ( ruleAttributeLookup EOF )
            // InternalSql.g:730:1: ruleAttributeLookup EOF
            {
             before(grammarAccess.getAttributeLookupRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeLookup();

            state._fsp--;

             after(grammarAccess.getAttributeLookupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeLookup"


    // $ANTLR start "ruleAttributeLookup"
    // InternalSql.g:737:1: ruleAttributeLookup : ( ( rule__AttributeLookup__Group__0 ) ) ;
    public final void ruleAttributeLookup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:741:2: ( ( ( rule__AttributeLookup__Group__0 ) ) )
            // InternalSql.g:742:2: ( ( rule__AttributeLookup__Group__0 ) )
            {
            // InternalSql.g:742:2: ( ( rule__AttributeLookup__Group__0 ) )
            // InternalSql.g:743:3: ( rule__AttributeLookup__Group__0 )
            {
             before(grammarAccess.getAttributeLookupAccess().getGroup()); 
            // InternalSql.g:744:3: ( rule__AttributeLookup__Group__0 )
            // InternalSql.g:744:4: rule__AttributeLookup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeLookup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeLookupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeLookup"


    // $ANTLR start "entryRuleAttributeKeyName"
    // InternalSql.g:753:1: entryRuleAttributeKeyName : ruleAttributeKeyName EOF ;
    public final void entryRuleAttributeKeyName() throws RecognitionException {
        try {
            // InternalSql.g:754:1: ( ruleAttributeKeyName EOF )
            // InternalSql.g:755:1: ruleAttributeKeyName EOF
            {
             before(grammarAccess.getAttributeKeyNameRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeKeyName();

            state._fsp--;

             after(grammarAccess.getAttributeKeyNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeKeyName"


    // $ANTLR start "ruleAttributeKeyName"
    // InternalSql.g:762:1: ruleAttributeKeyName : ( ruleSYMBOLIC_NAME_X ) ;
    public final void ruleAttributeKeyName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:766:2: ( ( ruleSYMBOLIC_NAME_X ) )
            // InternalSql.g:767:2: ( ruleSYMBOLIC_NAME_X )
            {
            // InternalSql.g:767:2: ( ruleSYMBOLIC_NAME_X )
            // InternalSql.g:768:3: ruleSYMBOLIC_NAME_X
            {
             before(grammarAccess.getAttributeKeyNameAccess().getSYMBOLIC_NAME_XParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSYMBOLIC_NAME_X();

            state._fsp--;

             after(grammarAccess.getAttributeKeyNameAccess().getSYMBOLIC_NAME_XParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeKeyName"


    // $ANTLR start "entryRuleAtom"
    // InternalSql.g:778:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // InternalSql.g:779:1: ( ruleAtom EOF )
            // InternalSql.g:780:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalSql.g:787:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:791:2: ( ( ( rule__Atom__Alternatives ) ) )
            // InternalSql.g:792:2: ( ( rule__Atom__Alternatives ) )
            {
            // InternalSql.g:792:2: ( ( rule__Atom__Alternatives ) )
            // InternalSql.g:793:3: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // InternalSql.g:794:3: ( rule__Atom__Alternatives )
            // InternalSql.g:794:4: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleFunctionInvocation"
    // InternalSql.g:803:1: entryRuleFunctionInvocation : ruleFunctionInvocation EOF ;
    public final void entryRuleFunctionInvocation() throws RecognitionException {
        try {
            // InternalSql.g:804:1: ( ruleFunctionInvocation EOF )
            // InternalSql.g:805:1: ruleFunctionInvocation EOF
            {
             before(grammarAccess.getFunctionInvocationRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionInvocation();

            state._fsp--;

             after(grammarAccess.getFunctionInvocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionInvocation"


    // $ANTLR start "ruleFunctionInvocation"
    // InternalSql.g:812:1: ruleFunctionInvocation : ( ( rule__FunctionInvocation__Group__0 ) ) ;
    public final void ruleFunctionInvocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:816:2: ( ( ( rule__FunctionInvocation__Group__0 ) ) )
            // InternalSql.g:817:2: ( ( rule__FunctionInvocation__Group__0 ) )
            {
            // InternalSql.g:817:2: ( ( rule__FunctionInvocation__Group__0 ) )
            // InternalSql.g:818:3: ( rule__FunctionInvocation__Group__0 )
            {
             before(grammarAccess.getFunctionInvocationAccess().getGroup()); 
            // InternalSql.g:819:3: ( rule__FunctionInvocation__Group__0 )
            // InternalSql.g:819:4: rule__FunctionInvocation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionInvocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionInvocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionInvocation"


    // $ANTLR start "entryRuleFunctionName"
    // InternalSql.g:828:1: entryRuleFunctionName : ruleFunctionName EOF ;
    public final void entryRuleFunctionName() throws RecognitionException {
        try {
            // InternalSql.g:829:1: ( ruleFunctionName EOF )
            // InternalSql.g:830:1: ruleFunctionName EOF
            {
             before(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_1);
            ruleFunctionName();

            state._fsp--;

             after(grammarAccess.getFunctionNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalSql.g:837:1: ruleFunctionName : ( ruleSYMBOLIC_NAME_X ) ;
    public final void ruleFunctionName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:841:2: ( ( ruleSYMBOLIC_NAME_X ) )
            // InternalSql.g:842:2: ( ruleSYMBOLIC_NAME_X )
            {
            // InternalSql.g:842:2: ( ruleSYMBOLIC_NAME_X )
            // InternalSql.g:843:3: ruleSYMBOLIC_NAME_X
            {
             before(grammarAccess.getFunctionNameAccess().getSYMBOLIC_NAME_XParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSYMBOLIC_NAME_X();

            state._fsp--;

             after(grammarAccess.getFunctionNameAccess().getSYMBOLIC_NAME_XParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalSql.g:853:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalSql.g:854:1: ( ruleVariableDeclaration EOF )
            // InternalSql.g:855:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalSql.g:862:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__NameAssignment ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:866:2: ( ( ( rule__VariableDeclaration__NameAssignment ) ) )
            // InternalSql.g:867:2: ( ( rule__VariableDeclaration__NameAssignment ) )
            {
            // InternalSql.g:867:2: ( ( rule__VariableDeclaration__NameAssignment ) )
            // InternalSql.g:868:3: ( rule__VariableDeclaration__NameAssignment )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment()); 
            // InternalSql.g:869:3: ( rule__VariableDeclaration__NameAssignment )
            // InternalSql.g:869:4: rule__VariableDeclaration__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleLiteral"
    // InternalSql.g:878:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalSql.g:879:1: ( ruleLiteral EOF )
            // InternalSql.g:880:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalSql.g:887:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:891:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalSql.g:892:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalSql.g:892:2: ( ( rule__Literal__Alternatives ) )
            // InternalSql.g:893:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalSql.g:894:3: ( rule__Literal__Alternatives )
            // InternalSql.g:894:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalSql.g:903:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalSql.g:904:1: ( ruleBooleanLiteral EOF )
            // InternalSql.g:905:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalSql.g:912:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__Group__0 ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:916:2: ( ( ( rule__BooleanLiteral__Group__0 ) ) )
            // InternalSql.g:917:2: ( ( rule__BooleanLiteral__Group__0 ) )
            {
            // InternalSql.g:917:2: ( ( rule__BooleanLiteral__Group__0 ) )
            // InternalSql.g:918:3: ( rule__BooleanLiteral__Group__0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getGroup()); 
            // InternalSql.g:919:3: ( rule__BooleanLiteral__Group__0 )
            // InternalSql.g:919:4: rule__BooleanLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalSql.g:928:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalSql.g:929:1: ( ruleStringLiteral EOF )
            // InternalSql.g:930:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalSql.g:937:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:941:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalSql.g:942:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalSql.g:942:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalSql.g:943:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalSql.g:944:3: ( rule__StringLiteral__ValueAssignment )
            // InternalSql.g:944:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleSYMBOLIC_NAME_X"
    // InternalSql.g:953:1: entryRuleSYMBOLIC_NAME_X : ruleSYMBOLIC_NAME_X EOF ;
    public final void entryRuleSYMBOLIC_NAME_X() throws RecognitionException {
        try {
            // InternalSql.g:954:1: ( ruleSYMBOLIC_NAME_X EOF )
            // InternalSql.g:955:1: ruleSYMBOLIC_NAME_X EOF
            {
             before(grammarAccess.getSYMBOLIC_NAME_XRule()); 
            pushFollow(FOLLOW_1);
            ruleSYMBOLIC_NAME_X();

            state._fsp--;

             after(grammarAccess.getSYMBOLIC_NAME_XRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSYMBOLIC_NAME_X"


    // $ANTLR start "ruleSYMBOLIC_NAME_X"
    // InternalSql.g:962:1: ruleSYMBOLIC_NAME_X : ( RULE_ID ) ;
    public final void ruleSYMBOLIC_NAME_X() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:966:2: ( ( RULE_ID ) )
            // InternalSql.g:967:2: ( RULE_ID )
            {
            // InternalSql.g:967:2: ( RULE_ID )
            // InternalSql.g:968:3: RULE_ID
            {
             before(grammarAccess.getSYMBOLIC_NAME_XAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSYMBOLIC_NAME_XAccess().getIDTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSYMBOLIC_NAME_X"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalSql.g:978:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalSql.g:979:1: ( ruleNumberLiteral EOF )
            // InternalSql.g:980:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalSql.g:987:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:991:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // InternalSql.g:992:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // InternalSql.g:992:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            // InternalSql.g:993:3: ( rule__NumberLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            // InternalSql.g:994:3: ( rule__NumberLiteral__ValueAssignment )
            // InternalSql.g:994:4: rule__NumberLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleNumber"
    // InternalSql.g:1003:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSql.g:1007:1: ( ruleNumber EOF )
            // InternalSql.g:1008:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalSql.g:1018:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1023:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalSql.g:1024:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalSql.g:1024:2: ( ( rule__Number__Alternatives ) )
            // InternalSql.g:1025:3: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // InternalSql.g:1026:3: ( rule__Number__Alternatives )
            // InternalSql.g:1026:4: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__FromItem__Alternatives"
    // InternalSql.g:1035:1: rule__FromItem__Alternatives : ( ( ( rule__FromItem__Group_0__0 ) ) | ( ( rule__FromItem__Group_1__0 ) ) );
    public final void rule__FromItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1039:1: ( ( ( rule__FromItem__Group_0__0 ) ) | ( ( rule__FromItem__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==33) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSql.g:1040:2: ( ( rule__FromItem__Group_0__0 ) )
                    {
                    // InternalSql.g:1040:2: ( ( rule__FromItem__Group_0__0 ) )
                    // InternalSql.g:1041:3: ( rule__FromItem__Group_0__0 )
                    {
                     before(grammarAccess.getFromItemAccess().getGroup_0()); 
                    // InternalSql.g:1042:3: ( rule__FromItem__Group_0__0 )
                    // InternalSql.g:1042:4: rule__FromItem__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FromItem__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFromItemAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1046:2: ( ( rule__FromItem__Group_1__0 ) )
                    {
                    // InternalSql.g:1046:2: ( ( rule__FromItem__Group_1__0 ) )
                    // InternalSql.g:1047:3: ( rule__FromItem__Group_1__0 )
                    {
                     before(grammarAccess.getFromItemAccess().getGroup_1()); 
                    // InternalSql.g:1048:3: ( rule__FromItem__Group_1__0 )
                    // InternalSql.g:1048:4: rule__FromItem__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FromItem__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFromItemAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Alternatives"


    // $ANTLR start "rule__Factor__Alternatives"
    // InternalSql.g:1056:1: rule__Factor__Alternatives : ( ( ( rule__Factor__Group_0__0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( 'TRUE' ) | ( 'FALSE' ) | ( ( rule__Factor__BinexpAssignment_4 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1060:1: ( ( ( rule__Factor__Group_0__0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( 'TRUE' ) | ( 'FALSE' ) | ( ( rule__Factor__BinexpAssignment_4 ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt3=1;
                }
                break;
            case 33:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                int LA3_3 = input.LA(2);

                if ( ((LA3_3>=16 && LA3_3<=20)||LA3_3==50) ) {
                    alt3=5;
                }
                else if ( (LA3_3==EOF||LA3_3==27||LA3_3==34||(LA3_3>=36 && LA3_3<=37)) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA3_4 = input.LA(2);

                if ( ((LA3_4>=16 && LA3_4<=20)||LA3_4==50) ) {
                    alt3=5;
                }
                else if ( (LA3_4==EOF||LA3_4==27||LA3_4==34||(LA3_4>=36 && LA3_4<=37)) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case RULE_STRING_LITERAL:
            case 51:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSql.g:1061:2: ( ( rule__Factor__Group_0__0 ) )
                    {
                    // InternalSql.g:1061:2: ( ( rule__Factor__Group_0__0 ) )
                    // InternalSql.g:1062:3: ( rule__Factor__Group_0__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_0()); 
                    // InternalSql.g:1063:3: ( rule__Factor__Group_0__0 )
                    // InternalSql.g:1063:4: rule__Factor__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1067:2: ( ( rule__Factor__Group_1__0 ) )
                    {
                    // InternalSql.g:1067:2: ( ( rule__Factor__Group_1__0 ) )
                    // InternalSql.g:1068:3: ( rule__Factor__Group_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1()); 
                    // InternalSql.g:1069:3: ( rule__Factor__Group_1__0 )
                    // InternalSql.g:1069:4: rule__Factor__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql.g:1073:2: ( 'TRUE' )
                    {
                    // InternalSql.g:1073:2: ( 'TRUE' )
                    // InternalSql.g:1074:3: 'TRUE'
                    {
                     before(grammarAccess.getFactorAccess().getTRUEKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getFactorAccess().getTRUEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSql.g:1079:2: ( 'FALSE' )
                    {
                    // InternalSql.g:1079:2: ( 'FALSE' )
                    // InternalSql.g:1080:3: 'FALSE'
                    {
                     before(grammarAccess.getFactorAccess().getFALSEKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getFactorAccess().getFALSEKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSql.g:1085:2: ( ( rule__Factor__BinexpAssignment_4 ) )
                    {
                    // InternalSql.g:1085:2: ( ( rule__Factor__BinexpAssignment_4 ) )
                    // InternalSql.g:1086:3: ( rule__Factor__BinexpAssignment_4 )
                    {
                     before(grammarAccess.getFactorAccess().getBinexpAssignment_4()); 
                    // InternalSql.g:1087:3: ( rule__Factor__BinexpAssignment_4 )
                    // InternalSql.g:1087:4: rule__Factor__BinexpAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__BinexpAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getBinexpAssignment_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Alternatives"


    // $ANTLR start "rule__Binary__Alternatives_1"
    // InternalSql.g:1095:1: rule__Binary__Alternatives_1 : ( ( '<' ) | ( '>' ) | ( '=' ) | ( '>=' ) | ( '<=' ) );
    public final void rule__Binary__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1099:1: ( ( '<' ) | ( '>' ) | ( '=' ) | ( '>=' ) | ( '<=' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 18:
                {
                alt4=3;
                }
                break;
            case 19:
                {
                alt4=4;
                }
                break;
            case 20:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSql.g:1100:2: ( '<' )
                    {
                    // InternalSql.g:1100:2: ( '<' )
                    // InternalSql.g:1101:3: '<'
                    {
                     before(grammarAccess.getBinaryAccess().getLessThanSignKeyword_1_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBinaryAccess().getLessThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1106:2: ( '>' )
                    {
                    // InternalSql.g:1106:2: ( '>' )
                    // InternalSql.g:1107:3: '>'
                    {
                     before(grammarAccess.getBinaryAccess().getGreaterThanSignKeyword_1_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBinaryAccess().getGreaterThanSignKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql.g:1112:2: ( '=' )
                    {
                    // InternalSql.g:1112:2: ( '=' )
                    // InternalSql.g:1113:3: '='
                    {
                     before(grammarAccess.getBinaryAccess().getEqualsSignKeyword_1_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getBinaryAccess().getEqualsSignKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSql.g:1118:2: ( '>=' )
                    {
                    // InternalSql.g:1118:2: ( '>=' )
                    // InternalSql.g:1119:3: '>='
                    {
                     before(grammarAccess.getBinaryAccess().getGreaterThanSignEqualsSignKeyword_1_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBinaryAccess().getGreaterThanSignEqualsSignKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSql.g:1124:2: ( '<=' )
                    {
                    // InternalSql.g:1124:2: ( '<=' )
                    // InternalSql.g:1125:3: '<='
                    {
                     before(grammarAccess.getBinaryAccess().getLessThanSignEqualsSignKeyword_1_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBinaryAccess().getLessThanSignEqualsSignKeyword_1_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Alternatives_1"


    // $ANTLR start "rule__NotExpression__Alternatives"
    // InternalSql.g:1134:1: rule__NotExpression__Alternatives : ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleComparisonExpression ) );
    public final void rule__NotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1138:1: ( ( ( rule__NotExpression__Group_0__0 ) ) | ( ruleComparisonExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==38) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING_LITERAL)||(LA5_0>=14 && LA5_0<=15)||(LA5_0>=22 && LA5_0<=23)||LA5_0==51) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSql.g:1139:2: ( ( rule__NotExpression__Group_0__0 ) )
                    {
                    // InternalSql.g:1139:2: ( ( rule__NotExpression__Group_0__0 ) )
                    // InternalSql.g:1140:3: ( rule__NotExpression__Group_0__0 )
                    {
                     before(grammarAccess.getNotExpressionAccess().getGroup_0()); 
                    // InternalSql.g:1141:3: ( rule__NotExpression__Group_0__0 )
                    // InternalSql.g:1141:4: rule__NotExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NotExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNotExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1145:2: ( ruleComparisonExpression )
                    {
                    // InternalSql.g:1145:2: ( ruleComparisonExpression )
                    // InternalSql.g:1146:3: ruleComparisonExpression
                    {
                     before(grammarAccess.getNotExpressionAccess().getComparisonExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComparisonExpression();

                    state._fsp--;

                     after(grammarAccess.getNotExpressionAccess().getComparisonExpressionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Alternatives"


    // $ANTLR start "rule__ComparisonExpression__OperatorAlternatives_1_1_0"
    // InternalSql.g:1155:1: rule__ComparisonExpression__OperatorAlternatives_1_1_0 : ( ( '=' ) | ( '<>' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__ComparisonExpression__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1159:1: ( ( '=' ) | ( '<>' ) | ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            case 20:
                {
                alt6=5;
                }
                break;
            case 19:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSql.g:1160:2: ( '=' )
                    {
                    // InternalSql.g:1160:2: ( '=' )
                    // InternalSql.g:1161:3: '='
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOperatorEqualsSignKeyword_1_1_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOperatorEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1166:2: ( '<>' )
                    {
                    // InternalSql.g:1166:2: ( '<>' )
                    // InternalSql.g:1167:3: '<>'
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignGreaterThanSignKeyword_1_1_0_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignGreaterThanSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql.g:1172:2: ( '<' )
                    {
                    // InternalSql.g:1172:2: ( '<' )
                    // InternalSql.g:1173:3: '<'
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignKeyword_1_1_0_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSql.g:1178:2: ( '>' )
                    {
                    // InternalSql.g:1178:2: ( '>' )
                    // InternalSql.g:1179:3: '>'
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignKeyword_1_1_0_3()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignKeyword_1_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSql.g:1184:2: ( '<=' )
                    {
                    // InternalSql.g:1184:2: ( '<=' )
                    // InternalSql.g:1185:3: '<='
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_4()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSql.g:1190:2: ( '>=' )
                    {
                    // InternalSql.g:1190:2: ( '>=' )
                    // InternalSql.g:1191:3: '>='
                    {
                     before(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_5()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__AddOrSubtractExpression__OperatorAlternatives_1_1_0"
    // InternalSql.g:1200:1: rule__AddOrSubtractExpression__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__AddOrSubtractExpression__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1204:1: ( ( '+' ) | ( '-' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSql.g:1205:2: ( '+' )
                    {
                    // InternalSql.g:1205:2: ( '+' )
                    // InternalSql.g:1206:3: '+'
                    {
                     before(grammarAccess.getAddOrSubtractExpressionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getAddOrSubtractExpressionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1211:2: ( '-' )
                    {
                    // InternalSql.g:1211:2: ( '-' )
                    // InternalSql.g:1212:3: '-'
                    {
                     before(grammarAccess.getAddOrSubtractExpressionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getAddOrSubtractExpressionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOrSubtractExpression__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__MultiplyDivideModuloExpression__OperatorAlternatives_1_1_0"
    // InternalSql.g:1221:1: rule__MultiplyDivideModuloExpression__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__MultiplyDivideModuloExpression__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1225:1: ( ( '*' ) | ( '/' ) | ( '%' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 25:
                {
                alt8=2;
                }
                break;
            case 26:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalSql.g:1226:2: ( '*' )
                    {
                    // InternalSql.g:1226:2: ( '*' )
                    // InternalSql.g:1227:3: '*'
                    {
                     before(grammarAccess.getMultiplyDivideModuloExpressionAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getMultiplyDivideModuloExpressionAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1232:2: ( '/' )
                    {
                    // InternalSql.g:1232:2: ( '/' )
                    // InternalSql.g:1233:3: '/'
                    {
                     before(grammarAccess.getMultiplyDivideModuloExpressionAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getMultiplyDivideModuloExpressionAccess().getOperatorSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql.g:1238:2: ( '%' )
                    {
                    // InternalSql.g:1238:2: ( '%' )
                    // InternalSql.g:1239:3: '%'
                    {
                     before(grammarAccess.getMultiplyDivideModuloExpressionAccess().getOperatorPercentSignKeyword_1_1_0_2()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getMultiplyDivideModuloExpressionAccess().getOperatorPercentSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivideModuloExpression__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__UnaryAddOrSubtractExpression__Alternatives"
    // InternalSql.g:1248:1: rule__UnaryAddOrSubtractExpression__Alternatives : ( ( ruleStringListNullOperatorExpression ) | ( ( rule__UnaryAddOrSubtractExpression__Group_1__0 ) ) );
    public final void rule__UnaryAddOrSubtractExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1252:1: ( ( ruleStringListNullOperatorExpression ) | ( ( rule__UnaryAddOrSubtractExpression__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING_LITERAL)||(LA9_0>=14 && LA9_0<=15)||LA9_0==51) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=22 && LA9_0<=23)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSql.g:1253:2: ( ruleStringListNullOperatorExpression )
                    {
                    // InternalSql.g:1253:2: ( ruleStringListNullOperatorExpression )
                    // InternalSql.g:1254:3: ruleStringListNullOperatorExpression
                    {
                     before(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getStringListNullOperatorExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringListNullOperatorExpression();

                    state._fsp--;

                     after(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getStringListNullOperatorExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1259:2: ( ( rule__UnaryAddOrSubtractExpression__Group_1__0 ) )
                    {
                    // InternalSql.g:1259:2: ( ( rule__UnaryAddOrSubtractExpression__Group_1__0 ) )
                    // InternalSql.g:1260:3: ( rule__UnaryAddOrSubtractExpression__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getGroup_1()); 
                    // InternalSql.g:1261:3: ( rule__UnaryAddOrSubtractExpression__Group_1__0 )
                    // InternalSql.g:1261:4: rule__UnaryAddOrSubtractExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryAddOrSubtractExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryAddOrSubtractExpression__Alternatives"


    // $ANTLR start "rule__UnaryAddOrSubtractExpression__OperatorAlternatives_1_1_0"
    // InternalSql.g:1269:1: rule__UnaryAddOrSubtractExpression__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__UnaryAddOrSubtractExpression__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1273:1: ( ( '+' ) | ( '-' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalSql.g:1274:2: ( '+' )
                    {
                    // InternalSql.g:1274:2: ( '+' )
                    // InternalSql.g:1275:3: '+'
                    {
                     before(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1280:2: ( '-' )
                    {
                    // InternalSql.g:1280:2: ( '-' )
                    // InternalSql.g:1281:3: '-'
                    {
                     before(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryAddOrSubtractExpression__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__StringListNullOperatorExpression__ExpressionsAlternatives_1_1_0"
    // InternalSql.g:1290:1: rule__StringListNullOperatorExpression__ExpressionsAlternatives_1_1_0 : ( ( ruleStringOperatorExpression ) | ( ruleNullOperatorExpression ) );
    public final void rule__StringListNullOperatorExpression__ExpressionsAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1294:1: ( ( ruleStringOperatorExpression ) | ( ruleNullOperatorExpression ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=42 && LA11_0<=44)||(LA11_0>=46 && LA11_0<=47)) ) {
                alt11=1;
            }
            else if ( (LA11_0==48) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalSql.g:1295:2: ( ruleStringOperatorExpression )
                    {
                    // InternalSql.g:1295:2: ( ruleStringOperatorExpression )
                    // InternalSql.g:1296:3: ruleStringOperatorExpression
                    {
                     before(grammarAccess.getStringListNullOperatorExpressionAccess().getExpressionsStringOperatorExpressionParserRuleCall_1_1_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringOperatorExpression();

                    state._fsp--;

                     after(grammarAccess.getStringListNullOperatorExpressionAccess().getExpressionsStringOperatorExpressionParserRuleCall_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1301:2: ( ruleNullOperatorExpression )
                    {
                    // InternalSql.g:1301:2: ( ruleNullOperatorExpression )
                    // InternalSql.g:1302:3: ruleNullOperatorExpression
                    {
                     before(grammarAccess.getStringListNullOperatorExpressionAccess().getExpressionsNullOperatorExpressionParserRuleCall_1_1_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNullOperatorExpression();

                    state._fsp--;

                     after(grammarAccess.getStringListNullOperatorExpressionAccess().getExpressionsNullOperatorExpressionParserRuleCall_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListNullOperatorExpression__ExpressionsAlternatives_1_1_0"


    // $ANTLR start "rule__StringOperatorExpression__Alternatives_0"
    // InternalSql.g:1311:1: rule__StringOperatorExpression__Alternatives_0 : ( ( ( rule__StringOperatorExpression__Group_0_0__0 ) ) | ( ( rule__StringOperatorExpression__Group_0_1__0 ) ) | ( ( rule__StringOperatorExpression__Group_0_2__0 ) ) | ( ( rule__StringOperatorExpression__Group_0_3__0 ) ) | ( ( rule__StringOperatorExpression__Group_0_4__0 ) ) );
    public final void rule__StringOperatorExpression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1315:1: ( ( ( rule__StringOperatorExpression__Group_0_0__0 ) ) | ( ( rule__StringOperatorExpression__Group_0_1__0 ) ) | ( ( rule__StringOperatorExpression__Group_0_2__0 ) ) | ( ( rule__StringOperatorExpression__Group_0_3__0 ) ) | ( ( rule__StringOperatorExpression__Group_0_4__0 ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt12=1;
                }
                break;
            case 43:
                {
                alt12=2;
                }
                break;
            case 44:
                {
                alt12=3;
                }
                break;
            case 46:
                {
                alt12=4;
                }
                break;
            case 47:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSql.g:1316:2: ( ( rule__StringOperatorExpression__Group_0_0__0 ) )
                    {
                    // InternalSql.g:1316:2: ( ( rule__StringOperatorExpression__Group_0_0__0 ) )
                    // InternalSql.g:1317:3: ( rule__StringOperatorExpression__Group_0_0__0 )
                    {
                     before(grammarAccess.getStringOperatorExpressionAccess().getGroup_0_0()); 
                    // InternalSql.g:1318:3: ( rule__StringOperatorExpression__Group_0_0__0 )
                    // InternalSql.g:1318:4: rule__StringOperatorExpression__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringOperatorExpression__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringOperatorExpressionAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1322:2: ( ( rule__StringOperatorExpression__Group_0_1__0 ) )
                    {
                    // InternalSql.g:1322:2: ( ( rule__StringOperatorExpression__Group_0_1__0 ) )
                    // InternalSql.g:1323:3: ( rule__StringOperatorExpression__Group_0_1__0 )
                    {
                     before(grammarAccess.getStringOperatorExpressionAccess().getGroup_0_1()); 
                    // InternalSql.g:1324:3: ( rule__StringOperatorExpression__Group_0_1__0 )
                    // InternalSql.g:1324:4: rule__StringOperatorExpression__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringOperatorExpression__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringOperatorExpressionAccess().getGroup_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql.g:1328:2: ( ( rule__StringOperatorExpression__Group_0_2__0 ) )
                    {
                    // InternalSql.g:1328:2: ( ( rule__StringOperatorExpression__Group_0_2__0 ) )
                    // InternalSql.g:1329:3: ( rule__StringOperatorExpression__Group_0_2__0 )
                    {
                     before(grammarAccess.getStringOperatorExpressionAccess().getGroup_0_2()); 
                    // InternalSql.g:1330:3: ( rule__StringOperatorExpression__Group_0_2__0 )
                    // InternalSql.g:1330:4: rule__StringOperatorExpression__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringOperatorExpression__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringOperatorExpressionAccess().getGroup_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSql.g:1334:2: ( ( rule__StringOperatorExpression__Group_0_3__0 ) )
                    {
                    // InternalSql.g:1334:2: ( ( rule__StringOperatorExpression__Group_0_3__0 ) )
                    // InternalSql.g:1335:3: ( rule__StringOperatorExpression__Group_0_3__0 )
                    {
                     before(grammarAccess.getStringOperatorExpressionAccess().getGroup_0_3()); 
                    // InternalSql.g:1336:3: ( rule__StringOperatorExpression__Group_0_3__0 )
                    // InternalSql.g:1336:4: rule__StringOperatorExpression__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringOperatorExpression__Group_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringOperatorExpressionAccess().getGroup_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSql.g:1340:2: ( ( rule__StringOperatorExpression__Group_0_4__0 ) )
                    {
                    // InternalSql.g:1340:2: ( ( rule__StringOperatorExpression__Group_0_4__0 ) )
                    // InternalSql.g:1341:3: ( rule__StringOperatorExpression__Group_0_4__0 )
                    {
                     before(grammarAccess.getStringOperatorExpressionAccess().getGroup_0_4()); 
                    // InternalSql.g:1342:3: ( rule__StringOperatorExpression__Group_0_4__0 )
                    // InternalSql.g:1342:4: rule__StringOperatorExpression__Group_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringOperatorExpression__Group_0_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringOperatorExpressionAccess().getGroup_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Alternatives_0"


    // $ANTLR start "rule__NullOperatorExpression__Alternatives"
    // InternalSql.g:1350:1: rule__NullOperatorExpression__Alternatives : ( ( ( rule__NullOperatorExpression__Group_0__0 ) ) | ( ( rule__NullOperatorExpression__Group_1__0 ) ) );
    public final void rule__NullOperatorExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1354:1: ( ( ( rule__NullOperatorExpression__Group_0__0 ) ) | ( ( rule__NullOperatorExpression__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==48) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==49) ) {
                    alt13=1;
                }
                else if ( (LA13_1==38) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalSql.g:1355:2: ( ( rule__NullOperatorExpression__Group_0__0 ) )
                    {
                    // InternalSql.g:1355:2: ( ( rule__NullOperatorExpression__Group_0__0 ) )
                    // InternalSql.g:1356:3: ( rule__NullOperatorExpression__Group_0__0 )
                    {
                     before(grammarAccess.getNullOperatorExpressionAccess().getGroup_0()); 
                    // InternalSql.g:1357:3: ( rule__NullOperatorExpression__Group_0__0 )
                    // InternalSql.g:1357:4: rule__NullOperatorExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NullOperatorExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNullOperatorExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1361:2: ( ( rule__NullOperatorExpression__Group_1__0 ) )
                    {
                    // InternalSql.g:1361:2: ( ( rule__NullOperatorExpression__Group_1__0 ) )
                    // InternalSql.g:1362:3: ( rule__NullOperatorExpression__Group_1__0 )
                    {
                     before(grammarAccess.getNullOperatorExpressionAccess().getGroup_1()); 
                    // InternalSql.g:1363:3: ( rule__NullOperatorExpression__Group_1__0 )
                    // InternalSql.g:1363:4: rule__NullOperatorExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NullOperatorExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNullOperatorExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Alternatives"


    // $ANTLR start "rule__Atom__Alternatives"
    // InternalSql.g:1371:1: rule__Atom__Alternatives : ( ( ruleLiteral ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) | ( ruleFunctionInvocation ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1375:1: ( ( ruleLiteral ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) | ( ruleFunctionInvocation ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case RULE_STRING_LITERAL:
            case 14:
            case 15:
                {
                alt14=1;
                }
                break;
            case 51:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
                {
                int LA14_3 = input.LA(2);

                if ( (LA14_3==EOF||(LA14_3>=16 && LA14_3<=27)||(LA14_3>=29 && LA14_3<=31)||(LA14_3>=34 && LA14_3<=37)||LA14_3==39||(LA14_3>=41 && LA14_3<=44)||(LA14_3>=46 && LA14_3<=48)||LA14_3==50||(LA14_3>=52 && LA14_3<=53)) ) {
                    alt14=3;
                }
                else if ( (LA14_3==33) ) {
                    alt14=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalSql.g:1376:2: ( ruleLiteral )
                    {
                    // InternalSql.g:1376:2: ( ruleLiteral )
                    // InternalSql.g:1377:3: ruleLiteral
                    {
                     before(grammarAccess.getAtomAccess().getLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1382:2: ( ( rule__Atom__Group_1__0 ) )
                    {
                    // InternalSql.g:1382:2: ( ( rule__Atom__Group_1__0 ) )
                    // InternalSql.g:1383:3: ( rule__Atom__Group_1__0 )
                    {
                     before(grammarAccess.getAtomAccess().getGroup_1()); 
                    // InternalSql.g:1384:3: ( rule__Atom__Group_1__0 )
                    // InternalSql.g:1384:4: rule__Atom__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql.g:1388:2: ( ( rule__Atom__Group_2__0 ) )
                    {
                    // InternalSql.g:1388:2: ( ( rule__Atom__Group_2__0 ) )
                    // InternalSql.g:1389:3: ( rule__Atom__Group_2__0 )
                    {
                     before(grammarAccess.getAtomAccess().getGroup_2()); 
                    // InternalSql.g:1390:3: ( rule__Atom__Group_2__0 )
                    // InternalSql.g:1390:4: rule__Atom__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atom__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSql.g:1394:2: ( ruleFunctionInvocation )
                    {
                    // InternalSql.g:1394:2: ( ruleFunctionInvocation )
                    // InternalSql.g:1395:3: ruleFunctionInvocation
                    {
                     before(grammarAccess.getAtomAccess().getFunctionInvocationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleFunctionInvocation();

                    state._fsp--;

                     after(grammarAccess.getAtomAccess().getFunctionInvocationParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalSql.g:1404:1: rule__Literal__Alternatives : ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1408:1: ( ( ruleNumberLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt15=1;
                }
                break;
            case RULE_STRING_LITERAL:
                {
                alt15=2;
                }
                break;
            case 14:
            case 15:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSql.g:1409:2: ( ruleNumberLiteral )
                    {
                    // InternalSql.g:1409:2: ( ruleNumberLiteral )
                    // InternalSql.g:1410:3: ruleNumberLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1415:2: ( ruleStringLiteral )
                    {
                    // InternalSql.g:1415:2: ( ruleStringLiteral )
                    // InternalSql.g:1416:3: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSql.g:1421:2: ( ruleBooleanLiteral )
                    {
                    // InternalSql.g:1421:2: ( ruleBooleanLiteral )
                    // InternalSql.g:1422:3: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__BooleanLiteral__ValueAlternatives_1_0"
    // InternalSql.g:1431:1: rule__BooleanLiteral__ValueAlternatives_1_0 : ( ( 'TRUE' ) | ( 'FALSE' ) );
    public final void rule__BooleanLiteral__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1435:1: ( ( 'TRUE' ) | ( 'FALSE' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            else if ( (LA16_0==15) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalSql.g:1436:2: ( 'TRUE' )
                    {
                    // InternalSql.g:1436:2: ( 'TRUE' )
                    // InternalSql.g:1437:3: 'TRUE'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_1_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1442:2: ( 'FALSE' )
                    {
                    // InternalSql.g:1442:2: ( 'FALSE' )
                    // InternalSql.g:1443:3: 'FALSE'
                    {
                     before(grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_1_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAlternatives_1_0"


    // $ANTLR start "rule__Number__Alternatives"
    // InternalSql.g:1452:1: rule__Number__Alternatives : ( ( RULE_HEX ) | ( ( rule__Number__Group_1__0 ) ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1456:1: ( ( RULE_HEX ) | ( ( rule__Number__Group_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_HEX) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=RULE_INT && LA17_0<=RULE_DECIMAL)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSql.g:1457:2: ( RULE_HEX )
                    {
                    // InternalSql.g:1457:2: ( RULE_HEX )
                    // InternalSql.g:1458:3: RULE_HEX
                    {
                     before(grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 
                    match(input,RULE_HEX,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1463:2: ( ( rule__Number__Group_1__0 ) )
                    {
                    // InternalSql.g:1463:2: ( ( rule__Number__Group_1__0 ) )
                    // InternalSql.g:1464:3: ( rule__Number__Group_1__0 )
                    {
                     before(grammarAccess.getNumberAccess().getGroup_1()); 
                    // InternalSql.g:1465:3: ( rule__Number__Group_1__0 )
                    // InternalSql.g:1465:4: rule__Number__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Number__Alternatives_1_0"
    // InternalSql.g:1473:1: rule__Number__Alternatives_1_0 : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Number__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1477:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_DECIMAL) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSql.g:1478:2: ( RULE_INT )
                    {
                    // InternalSql.g:1478:2: ( RULE_INT )
                    // InternalSql.g:1479:3: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1484:2: ( RULE_DECIMAL )
                    {
                    // InternalSql.g:1484:2: ( RULE_DECIMAL )
                    // InternalSql.g:1485:3: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives_1_0"


    // $ANTLR start "rule__Number__Alternatives_1_1_1"
    // InternalSql.g:1494:1: rule__Number__Alternatives_1_1_1 : ( ( RULE_INT ) | ( RULE_DECIMAL ) );
    public final void rule__Number__Alternatives_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1498:1: ( ( RULE_INT ) | ( RULE_DECIMAL ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_INT) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_DECIMAL) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSql.g:1499:2: ( RULE_INT )
                    {
                    // InternalSql.g:1499:2: ( RULE_INT )
                    // InternalSql.g:1500:3: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1505:2: ( RULE_DECIMAL )
                    {
                    // InternalSql.g:1505:2: ( RULE_DECIMAL )
                    // InternalSql.g:1506:3: RULE_DECIMAL
                    {
                     before(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 
                    match(input,RULE_DECIMAL,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives_1_1_1"


    // $ANTLR start "rule__Query__Group__0"
    // InternalSql.g:1515:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1519:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalSql.g:1520:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // InternalSql.g:1527:1: rule__Query__Group__0__Impl : ( ( rule__Query__SelectClauseAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1531:1: ( ( ( rule__Query__SelectClauseAssignment_0 ) ) )
            // InternalSql.g:1532:1: ( ( rule__Query__SelectClauseAssignment_0 ) )
            {
            // InternalSql.g:1532:1: ( ( rule__Query__SelectClauseAssignment_0 ) )
            // InternalSql.g:1533:2: ( rule__Query__SelectClauseAssignment_0 )
            {
             before(grammarAccess.getQueryAccess().getSelectClauseAssignment_0()); 
            // InternalSql.g:1534:2: ( rule__Query__SelectClauseAssignment_0 )
            // InternalSql.g:1534:3: rule__Query__SelectClauseAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Query__SelectClauseAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getSelectClauseAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalSql.g:1542:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1546:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalSql.g:1547:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Query__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // InternalSql.g:1554:1: rule__Query__Group__1__Impl : ( ( rule__Query__FromClauseAssignment_1 )? ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1558:1: ( ( ( rule__Query__FromClauseAssignment_1 )? ) )
            // InternalSql.g:1559:1: ( ( rule__Query__FromClauseAssignment_1 )? )
            {
            // InternalSql.g:1559:1: ( ( rule__Query__FromClauseAssignment_1 )? )
            // InternalSql.g:1560:2: ( rule__Query__FromClauseAssignment_1 )?
            {
             before(grammarAccess.getQueryAccess().getFromClauseAssignment_1()); 
            // InternalSql.g:1561:2: ( rule__Query__FromClauseAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSql.g:1561:3: rule__Query__FromClauseAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__FromClauseAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getFromClauseAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // InternalSql.g:1569:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1573:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalSql.g:1574:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Query__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2"


    // $ANTLR start "rule__Query__Group__2__Impl"
    // InternalSql.g:1581:1: rule__Query__Group__2__Impl : ( ( rule__Query__WhereClauseAssignment_2 )? ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1585:1: ( ( ( rule__Query__WhereClauseAssignment_2 )? ) )
            // InternalSql.g:1586:1: ( ( rule__Query__WhereClauseAssignment_2 )? )
            {
            // InternalSql.g:1586:1: ( ( rule__Query__WhereClauseAssignment_2 )? )
            // InternalSql.g:1587:2: ( rule__Query__WhereClauseAssignment_2 )?
            {
             before(grammarAccess.getQueryAccess().getWhereClauseAssignment_2()); 
            // InternalSql.g:1588:2: ( rule__Query__WhereClauseAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSql.g:1588:3: rule__Query__WhereClauseAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__WhereClauseAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getWhereClauseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__3"
    // InternalSql.g:1596:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1600:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // InternalSql.g:1601:2: rule__Query__Group__3__Impl rule__Query__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Query__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3"


    // $ANTLR start "rule__Query__Group__3__Impl"
    // InternalSql.g:1608:1: rule__Query__Group__3__Impl : ( ( rule__Query__GroupClauseAssignment_3 )? ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1612:1: ( ( ( rule__Query__GroupClauseAssignment_3 )? ) )
            // InternalSql.g:1613:1: ( ( rule__Query__GroupClauseAssignment_3 )? )
            {
            // InternalSql.g:1613:1: ( ( rule__Query__GroupClauseAssignment_3 )? )
            // InternalSql.g:1614:2: ( rule__Query__GroupClauseAssignment_3 )?
            {
             before(grammarAccess.getQueryAccess().getGroupClauseAssignment_3()); 
            // InternalSql.g:1615:2: ( rule__Query__GroupClauseAssignment_3 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSql.g:1615:3: rule__Query__GroupClauseAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__GroupClauseAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getGroupClauseAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3__Impl"


    // $ANTLR start "rule__Query__Group__4"
    // InternalSql.g:1623:1: rule__Query__Group__4 : rule__Query__Group__4__Impl rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1627:1: ( rule__Query__Group__4__Impl rule__Query__Group__5 )
            // InternalSql.g:1628:2: rule__Query__Group__4__Impl rule__Query__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Query__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4"


    // $ANTLR start "rule__Query__Group__4__Impl"
    // InternalSql.g:1635:1: rule__Query__Group__4__Impl : ( ( rule__Query__HavingClauseAssignment_4 )? ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1639:1: ( ( ( rule__Query__HavingClauseAssignment_4 )? ) )
            // InternalSql.g:1640:1: ( ( rule__Query__HavingClauseAssignment_4 )? )
            {
            // InternalSql.g:1640:1: ( ( rule__Query__HavingClauseAssignment_4 )? )
            // InternalSql.g:1641:2: ( rule__Query__HavingClauseAssignment_4 )?
            {
             before(grammarAccess.getQueryAccess().getHavingClauseAssignment_4()); 
            // InternalSql.g:1642:2: ( rule__Query__HavingClauseAssignment_4 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSql.g:1642:3: rule__Query__HavingClauseAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__HavingClauseAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getHavingClauseAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__5"
    // InternalSql.g:1650:1: rule__Query__Group__5 : rule__Query__Group__5__Impl ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1654:1: ( rule__Query__Group__5__Impl )
            // InternalSql.g:1655:2: rule__Query__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5"


    // $ANTLR start "rule__Query__Group__5__Impl"
    // InternalSql.g:1661:1: rule__Query__Group__5__Impl : ( ';' ) ;
    public final void rule__Query__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1665:1: ( ( ';' ) )
            // InternalSql.g:1666:1: ( ';' )
            {
            // InternalSql.g:1666:1: ( ';' )
            // InternalSql.g:1667:2: ';'
            {
             before(grammarAccess.getQueryAccess().getSemicolonKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5__Impl"


    // $ANTLR start "rule__SelectSection__Group__0"
    // InternalSql.g:1677:1: rule__SelectSection__Group__0 : rule__SelectSection__Group__0__Impl rule__SelectSection__Group__1 ;
    public final void rule__SelectSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1681:1: ( rule__SelectSection__Group__0__Impl rule__SelectSection__Group__1 )
            // InternalSql.g:1682:2: rule__SelectSection__Group__0__Impl rule__SelectSection__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SelectSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectSection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectSection__Group__0"


    // $ANTLR start "rule__SelectSection__Group__0__Impl"
    // InternalSql.g:1689:1: rule__SelectSection__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__SelectSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1693:1: ( ( 'SELECT' ) )
            // InternalSql.g:1694:1: ( 'SELECT' )
            {
            // InternalSql.g:1694:1: ( 'SELECT' )
            // InternalSql.g:1695:2: 'SELECT'
            {
             before(grammarAccess.getSelectSectionAccess().getSELECTKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSelectSectionAccess().getSELECTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectSection__Group__0__Impl"


    // $ANTLR start "rule__SelectSection__Group__1"
    // InternalSql.g:1704:1: rule__SelectSection__Group__1 : rule__SelectSection__Group__1__Impl rule__SelectSection__Group__2 ;
    public final void rule__SelectSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1708:1: ( rule__SelectSection__Group__1__Impl rule__SelectSection__Group__2 )
            // InternalSql.g:1709:2: rule__SelectSection__Group__1__Impl rule__SelectSection__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SelectSection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectSection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectSection__Group__1"


    // $ANTLR start "rule__SelectSection__Group__1__Impl"
    // InternalSql.g:1716:1: rule__SelectSection__Group__1__Impl : ( ( rule__SelectSection__ExpressionsAssignment_1 ) ) ;
    public final void rule__SelectSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1720:1: ( ( ( rule__SelectSection__ExpressionsAssignment_1 ) ) )
            // InternalSql.g:1721:1: ( ( rule__SelectSection__ExpressionsAssignment_1 ) )
            {
            // InternalSql.g:1721:1: ( ( rule__SelectSection__ExpressionsAssignment_1 ) )
            // InternalSql.g:1722:2: ( rule__SelectSection__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getSelectSectionAccess().getExpressionsAssignment_1()); 
            // InternalSql.g:1723:2: ( rule__SelectSection__ExpressionsAssignment_1 )
            // InternalSql.g:1723:3: rule__SelectSection__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectSection__ExpressionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectSectionAccess().getExpressionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectSection__Group__1__Impl"


    // $ANTLR start "rule__SelectSection__Group__2"
    // InternalSql.g:1731:1: rule__SelectSection__Group__2 : rule__SelectSection__Group__2__Impl ;
    public final void rule__SelectSection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1735:1: ( rule__SelectSection__Group__2__Impl )
            // InternalSql.g:1736:2: rule__SelectSection__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectSection__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectSection__Group__2"


    // $ANTLR start "rule__SelectSection__Group__2__Impl"
    // InternalSql.g:1742:1: rule__SelectSection__Group__2__Impl : ( ( rule__SelectSection__Group_2__0 )* ) ;
    public final void rule__SelectSection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1746:1: ( ( ( rule__SelectSection__Group_2__0 )* ) )
            // InternalSql.g:1747:1: ( ( rule__SelectSection__Group_2__0 )* )
            {
            // InternalSql.g:1747:1: ( ( rule__SelectSection__Group_2__0 )* )
            // InternalSql.g:1748:2: ( rule__SelectSection__Group_2__0 )*
            {
             before(grammarAccess.getSelectSectionAccess().getGroup_2()); 
            // InternalSql.g:1749:2: ( rule__SelectSection__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==29) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSql.g:1749:3: rule__SelectSection__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SelectSection__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSelectSectionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectSection__Group__2__Impl"


    // $ANTLR start "rule__SelectSection__Group_2__0"
    // InternalSql.g:1758:1: rule__SelectSection__Group_2__0 : rule__SelectSection__Group_2__0__Impl rule__SelectSection__Group_2__1 ;
    public final void rule__SelectSection__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1762:1: ( rule__SelectSection__Group_2__0__Impl rule__SelectSection__Group_2__1 )
            // InternalSql.g:1763:2: rule__SelectSection__Group_2__0__Impl rule__SelectSection__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__SelectSection__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectSection__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectSection__Group_2__0"


    // $ANTLR start "rule__SelectSection__Group_2__0__Impl"
    // InternalSql.g:1770:1: rule__SelectSection__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SelectSection__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1774:1: ( ( ',' ) )
            // InternalSql.g:1775:1: ( ',' )
            {
            // InternalSql.g:1775:1: ( ',' )
            // InternalSql.g:1776:2: ','
            {
             before(grammarAccess.getSelectSectionAccess().getCommaKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSelectSectionAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectSection__Group_2__0__Impl"


    // $ANTLR start "rule__SelectSection__Group_2__1"
    // InternalSql.g:1785:1: rule__SelectSection__Group_2__1 : rule__SelectSection__Group_2__1__Impl ;
    public final void rule__SelectSection__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1789:1: ( rule__SelectSection__Group_2__1__Impl )
            // InternalSql.g:1790:2: rule__SelectSection__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectSection__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectSection__Group_2__1"


    // $ANTLR start "rule__SelectSection__Group_2__1__Impl"
    // InternalSql.g:1796:1: rule__SelectSection__Group_2__1__Impl : ( ( rule__SelectSection__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__SelectSection__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1800:1: ( ( ( rule__SelectSection__ExpressionsAssignment_2_1 ) ) )
            // InternalSql.g:1801:1: ( ( rule__SelectSection__ExpressionsAssignment_2_1 ) )
            {
            // InternalSql.g:1801:1: ( ( rule__SelectSection__ExpressionsAssignment_2_1 ) )
            // InternalSql.g:1802:2: ( rule__SelectSection__ExpressionsAssignment_2_1 )
            {
             before(grammarAccess.getSelectSectionAccess().getExpressionsAssignment_2_1()); 
            // InternalSql.g:1803:2: ( rule__SelectSection__ExpressionsAssignment_2_1 )
            // InternalSql.g:1803:3: rule__SelectSection__ExpressionsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectSection__ExpressionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectSectionAccess().getExpressionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectSection__Group_2__1__Impl"


    // $ANTLR start "rule__FromSection__Group__0"
    // InternalSql.g:1812:1: rule__FromSection__Group__0 : rule__FromSection__Group__0__Impl rule__FromSection__Group__1 ;
    public final void rule__FromSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1816:1: ( rule__FromSection__Group__0__Impl rule__FromSection__Group__1 )
            // InternalSql.g:1817:2: rule__FromSection__Group__0__Impl rule__FromSection__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FromSection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromSection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromSection__Group__0"


    // $ANTLR start "rule__FromSection__Group__0__Impl"
    // InternalSql.g:1824:1: rule__FromSection__Group__0__Impl : ( 'FROM' ) ;
    public final void rule__FromSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1828:1: ( ( 'FROM' ) )
            // InternalSql.g:1829:1: ( 'FROM' )
            {
            // InternalSql.g:1829:1: ( 'FROM' )
            // InternalSql.g:1830:2: 'FROM'
            {
             before(grammarAccess.getFromSectionAccess().getFROMKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFromSectionAccess().getFROMKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromSection__Group__0__Impl"


    // $ANTLR start "rule__FromSection__Group__1"
    // InternalSql.g:1839:1: rule__FromSection__Group__1 : rule__FromSection__Group__1__Impl ;
    public final void rule__FromSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1843:1: ( rule__FromSection__Group__1__Impl )
            // InternalSql.g:1844:2: rule__FromSection__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromSection__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromSection__Group__1"


    // $ANTLR start "rule__FromSection__Group__1__Impl"
    // InternalSql.g:1850:1: rule__FromSection__Group__1__Impl : ( ( rule__FromSection__FromItemAssignment_1 ) ) ;
    public final void rule__FromSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1854:1: ( ( ( rule__FromSection__FromItemAssignment_1 ) ) )
            // InternalSql.g:1855:1: ( ( rule__FromSection__FromItemAssignment_1 ) )
            {
            // InternalSql.g:1855:1: ( ( rule__FromSection__FromItemAssignment_1 ) )
            // InternalSql.g:1856:2: ( rule__FromSection__FromItemAssignment_1 )
            {
             before(grammarAccess.getFromSectionAccess().getFromItemAssignment_1()); 
            // InternalSql.g:1857:2: ( rule__FromSection__FromItemAssignment_1 )
            // InternalSql.g:1857:3: rule__FromSection__FromItemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FromSection__FromItemAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFromSectionAccess().getFromItemAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromSection__Group__1__Impl"


    // $ANTLR start "rule__FromItem__Group_0__0"
    // InternalSql.g:1866:1: rule__FromItem__Group_0__0 : rule__FromItem__Group_0__0__Impl rule__FromItem__Group_0__1 ;
    public final void rule__FromItem__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1870:1: ( rule__FromItem__Group_0__0__Impl rule__FromItem__Group_0__1 )
            // InternalSql.g:1871:2: rule__FromItem__Group_0__0__Impl rule__FromItem__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__FromItem__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromItem__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_0__0"


    // $ANTLR start "rule__FromItem__Group_0__0__Impl"
    // InternalSql.g:1878:1: rule__FromItem__Group_0__0__Impl : ( ( rule__FromItem__TblAssignment_0_0 ) ) ;
    public final void rule__FromItem__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1882:1: ( ( ( rule__FromItem__TblAssignment_0_0 ) ) )
            // InternalSql.g:1883:1: ( ( rule__FromItem__TblAssignment_0_0 ) )
            {
            // InternalSql.g:1883:1: ( ( rule__FromItem__TblAssignment_0_0 ) )
            // InternalSql.g:1884:2: ( rule__FromItem__TblAssignment_0_0 )
            {
             before(grammarAccess.getFromItemAccess().getTblAssignment_0_0()); 
            // InternalSql.g:1885:2: ( rule__FromItem__TblAssignment_0_0 )
            // InternalSql.g:1885:3: rule__FromItem__TblAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__TblAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFromItemAccess().getTblAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_0__0__Impl"


    // $ANTLR start "rule__FromItem__Group_0__1"
    // InternalSql.g:1893:1: rule__FromItem__Group_0__1 : rule__FromItem__Group_0__1__Impl ;
    public final void rule__FromItem__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1897:1: ( rule__FromItem__Group_0__1__Impl )
            // InternalSql.g:1898:2: rule__FromItem__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_0__1"


    // $ANTLR start "rule__FromItem__Group_0__1__Impl"
    // InternalSql.g:1904:1: rule__FromItem__Group_0__1__Impl : ( ( rule__FromItem__Group_0_1__0 )* ) ;
    public final void rule__FromItem__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1908:1: ( ( ( rule__FromItem__Group_0_1__0 )* ) )
            // InternalSql.g:1909:1: ( ( rule__FromItem__Group_0_1__0 )* )
            {
            // InternalSql.g:1909:1: ( ( rule__FromItem__Group_0_1__0 )* )
            // InternalSql.g:1910:2: ( rule__FromItem__Group_0_1__0 )*
            {
             before(grammarAccess.getFromItemAccess().getGroup_0_1()); 
            // InternalSql.g:1911:2: ( rule__FromItem__Group_0_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSql.g:1911:3: rule__FromItem__Group_0_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__FromItem__Group_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getFromItemAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_0__1__Impl"


    // $ANTLR start "rule__FromItem__Group_0_1__0"
    // InternalSql.g:1920:1: rule__FromItem__Group_0_1__0 : rule__FromItem__Group_0_1__0__Impl rule__FromItem__Group_0_1__1 ;
    public final void rule__FromItem__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1924:1: ( rule__FromItem__Group_0_1__0__Impl rule__FromItem__Group_0_1__1 )
            // InternalSql.g:1925:2: rule__FromItem__Group_0_1__0__Impl rule__FromItem__Group_0_1__1
            {
            pushFollow(FOLLOW_11);
            rule__FromItem__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromItem__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_0_1__0"


    // $ANTLR start "rule__FromItem__Group_0_1__0__Impl"
    // InternalSql.g:1932:1: rule__FromItem__Group_0_1__0__Impl : ( 'JOIN' ) ;
    public final void rule__FromItem__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1936:1: ( ( 'JOIN' ) )
            // InternalSql.g:1937:1: ( 'JOIN' )
            {
            // InternalSql.g:1937:1: ( 'JOIN' )
            // InternalSql.g:1938:2: 'JOIN'
            {
             before(grammarAccess.getFromItemAccess().getJOINKeyword_0_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFromItemAccess().getJOINKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_0_1__0__Impl"


    // $ANTLR start "rule__FromItem__Group_0_1__1"
    // InternalSql.g:1947:1: rule__FromItem__Group_0_1__1 : rule__FromItem__Group_0_1__1__Impl rule__FromItem__Group_0_1__2 ;
    public final void rule__FromItem__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1951:1: ( rule__FromItem__Group_0_1__1__Impl rule__FromItem__Group_0_1__2 )
            // InternalSql.g:1952:2: rule__FromItem__Group_0_1__1__Impl rule__FromItem__Group_0_1__2
            {
            pushFollow(FOLLOW_12);
            rule__FromItem__Group_0_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromItem__Group_0_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_0_1__1"


    // $ANTLR start "rule__FromItem__Group_0_1__1__Impl"
    // InternalSql.g:1959:1: rule__FromItem__Group_0_1__1__Impl : ( ( rule__FromItem__TblAssignment_0_1_1 ) ) ;
    public final void rule__FromItem__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1963:1: ( ( ( rule__FromItem__TblAssignment_0_1_1 ) ) )
            // InternalSql.g:1964:1: ( ( rule__FromItem__TblAssignment_0_1_1 ) )
            {
            // InternalSql.g:1964:1: ( ( rule__FromItem__TblAssignment_0_1_1 ) )
            // InternalSql.g:1965:2: ( rule__FromItem__TblAssignment_0_1_1 )
            {
             before(grammarAccess.getFromItemAccess().getTblAssignment_0_1_1()); 
            // InternalSql.g:1966:2: ( rule__FromItem__TblAssignment_0_1_1 )
            // InternalSql.g:1966:3: rule__FromItem__TblAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__TblAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFromItemAccess().getTblAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_0_1__1__Impl"


    // $ANTLR start "rule__FromItem__Group_0_1__2"
    // InternalSql.g:1974:1: rule__FromItem__Group_0_1__2 : rule__FromItem__Group_0_1__2__Impl rule__FromItem__Group_0_1__3 ;
    public final void rule__FromItem__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1978:1: ( rule__FromItem__Group_0_1__2__Impl rule__FromItem__Group_0_1__3 )
            // InternalSql.g:1979:2: rule__FromItem__Group_0_1__2__Impl rule__FromItem__Group_0_1__3
            {
            pushFollow(FOLLOW_5);
            rule__FromItem__Group_0_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromItem__Group_0_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_0_1__2"


    // $ANTLR start "rule__FromItem__Group_0_1__2__Impl"
    // InternalSql.g:1986:1: rule__FromItem__Group_0_1__2__Impl : ( 'ON' ) ;
    public final void rule__FromItem__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:1990:1: ( ( 'ON' ) )
            // InternalSql.g:1991:1: ( 'ON' )
            {
            // InternalSql.g:1991:1: ( 'ON' )
            // InternalSql.g:1992:2: 'ON'
            {
             before(grammarAccess.getFromItemAccess().getONKeyword_0_1_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFromItemAccess().getONKeyword_0_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_0_1__2__Impl"


    // $ANTLR start "rule__FromItem__Group_0_1__3"
    // InternalSql.g:2001:1: rule__FromItem__Group_0_1__3 : rule__FromItem__Group_0_1__3__Impl ;
    public final void rule__FromItem__Group_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2005:1: ( rule__FromItem__Group_0_1__3__Impl )
            // InternalSql.g:2006:2: rule__FromItem__Group_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__Group_0_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_0_1__3"


    // $ANTLR start "rule__FromItem__Group_0_1__3__Impl"
    // InternalSql.g:2012:1: rule__FromItem__Group_0_1__3__Impl : ( ( rule__FromItem__ExpressionsAssignment_0_1_3 ) ) ;
    public final void rule__FromItem__Group_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2016:1: ( ( ( rule__FromItem__ExpressionsAssignment_0_1_3 ) ) )
            // InternalSql.g:2017:1: ( ( rule__FromItem__ExpressionsAssignment_0_1_3 ) )
            {
            // InternalSql.g:2017:1: ( ( rule__FromItem__ExpressionsAssignment_0_1_3 ) )
            // InternalSql.g:2018:2: ( rule__FromItem__ExpressionsAssignment_0_1_3 )
            {
             before(grammarAccess.getFromItemAccess().getExpressionsAssignment_0_1_3()); 
            // InternalSql.g:2019:2: ( rule__FromItem__ExpressionsAssignment_0_1_3 )
            // InternalSql.g:2019:3: rule__FromItem__ExpressionsAssignment_0_1_3
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__ExpressionsAssignment_0_1_3();

            state._fsp--;


            }

             after(grammarAccess.getFromItemAccess().getExpressionsAssignment_0_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_0_1__3__Impl"


    // $ANTLR start "rule__FromItem__Group_1__0"
    // InternalSql.g:2028:1: rule__FromItem__Group_1__0 : rule__FromItem__Group_1__0__Impl rule__FromItem__Group_1__1 ;
    public final void rule__FromItem__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2032:1: ( rule__FromItem__Group_1__0__Impl rule__FromItem__Group_1__1 )
            // InternalSql.g:2033:2: rule__FromItem__Group_1__0__Impl rule__FromItem__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__FromItem__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromItem__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_1__0"


    // $ANTLR start "rule__FromItem__Group_1__0__Impl"
    // InternalSql.g:2040:1: rule__FromItem__Group_1__0__Impl : ( '(' ) ;
    public final void rule__FromItem__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2044:1: ( ( '(' ) )
            // InternalSql.g:2045:1: ( '(' )
            {
            // InternalSql.g:2045:1: ( '(' )
            // InternalSql.g:2046:2: '('
            {
             before(grammarAccess.getFromItemAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFromItemAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_1__0__Impl"


    // $ANTLR start "rule__FromItem__Group_1__1"
    // InternalSql.g:2055:1: rule__FromItem__Group_1__1 : rule__FromItem__Group_1__1__Impl rule__FromItem__Group_1__2 ;
    public final void rule__FromItem__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2059:1: ( rule__FromItem__Group_1__1__Impl rule__FromItem__Group_1__2 )
            // InternalSql.g:2060:2: rule__FromItem__Group_1__1__Impl rule__FromItem__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__FromItem__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromItem__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_1__1"


    // $ANTLR start "rule__FromItem__Group_1__1__Impl"
    // InternalSql.g:2067:1: rule__FromItem__Group_1__1__Impl : ( ( rule__FromItem__Select_exprAssignment_1_1 ) ) ;
    public final void rule__FromItem__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2071:1: ( ( ( rule__FromItem__Select_exprAssignment_1_1 ) ) )
            // InternalSql.g:2072:1: ( ( rule__FromItem__Select_exprAssignment_1_1 ) )
            {
            // InternalSql.g:2072:1: ( ( rule__FromItem__Select_exprAssignment_1_1 ) )
            // InternalSql.g:2073:2: ( rule__FromItem__Select_exprAssignment_1_1 )
            {
             before(grammarAccess.getFromItemAccess().getSelect_exprAssignment_1_1()); 
            // InternalSql.g:2074:2: ( rule__FromItem__Select_exprAssignment_1_1 )
            // InternalSql.g:2074:3: rule__FromItem__Select_exprAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__Select_exprAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFromItemAccess().getSelect_exprAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_1__1__Impl"


    // $ANTLR start "rule__FromItem__Group_1__2"
    // InternalSql.g:2082:1: rule__FromItem__Group_1__2 : rule__FromItem__Group_1__2__Impl ;
    public final void rule__FromItem__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2086:1: ( rule__FromItem__Group_1__2__Impl )
            // InternalSql.g:2087:2: rule__FromItem__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_1__2"


    // $ANTLR start "rule__FromItem__Group_1__2__Impl"
    // InternalSql.g:2093:1: rule__FromItem__Group_1__2__Impl : ( ')' ) ;
    public final void rule__FromItem__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2097:1: ( ( ')' ) )
            // InternalSql.g:2098:1: ( ')' )
            {
            // InternalSql.g:2098:1: ( ')' )
            // InternalSql.g:2099:2: ')'
            {
             before(grammarAccess.getFromItemAccess().getRightParenthesisKeyword_1_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFromItemAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Group_1__2__Impl"


    // $ANTLR start "rule__WhereClause__Group__0"
    // InternalSql.g:2109:1: rule__WhereClause__Group__0 : rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 ;
    public final void rule__WhereClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2113:1: ( rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 )
            // InternalSql.g:2114:2: rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__WhereClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__0"


    // $ANTLR start "rule__WhereClause__Group__0__Impl"
    // InternalSql.g:2121:1: rule__WhereClause__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__WhereClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2125:1: ( ( 'WHERE' ) )
            // InternalSql.g:2126:1: ( 'WHERE' )
            {
            // InternalSql.g:2126:1: ( 'WHERE' )
            // InternalSql.g:2127:2: 'WHERE'
            {
             before(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__0__Impl"


    // $ANTLR start "rule__WhereClause__Group__1"
    // InternalSql.g:2136:1: rule__WhereClause__Group__1 : rule__WhereClause__Group__1__Impl ;
    public final void rule__WhereClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2140:1: ( rule__WhereClause__Group__1__Impl )
            // InternalSql.g:2141:2: rule__WhereClause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__1"


    // $ANTLR start "rule__WhereClause__Group__1__Impl"
    // InternalSql.g:2147:1: rule__WhereClause__Group__1__Impl : ( ( rule__WhereClause__ExpressionAssignment_1 ) ) ;
    public final void rule__WhereClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2151:1: ( ( ( rule__WhereClause__ExpressionAssignment_1 ) ) )
            // InternalSql.g:2152:1: ( ( rule__WhereClause__ExpressionAssignment_1 ) )
            {
            // InternalSql.g:2152:1: ( ( rule__WhereClause__ExpressionAssignment_1 ) )
            // InternalSql.g:2153:2: ( rule__WhereClause__ExpressionAssignment_1 )
            {
             before(grammarAccess.getWhereClauseAccess().getExpressionAssignment_1()); 
            // InternalSql.g:2154:2: ( rule__WhereClause__ExpressionAssignment_1 )
            // InternalSql.g:2154:3: rule__WhereClause__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereClauseAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__1__Impl"


    // $ANTLR start "rule__BoolExpression__Group__0"
    // InternalSql.g:2163:1: rule__BoolExpression__Group__0 : rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1 ;
    public final void rule__BoolExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2167:1: ( rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1 )
            // InternalSql.g:2168:2: rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__BoolExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpression__Group__0"


    // $ANTLR start "rule__BoolExpression__Group__0__Impl"
    // InternalSql.g:2175:1: rule__BoolExpression__Group__0__Impl : ( ( rule__BoolExpression__LhsAssignment_0 ) ) ;
    public final void rule__BoolExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2179:1: ( ( ( rule__BoolExpression__LhsAssignment_0 ) ) )
            // InternalSql.g:2180:1: ( ( rule__BoolExpression__LhsAssignment_0 ) )
            {
            // InternalSql.g:2180:1: ( ( rule__BoolExpression__LhsAssignment_0 ) )
            // InternalSql.g:2181:2: ( rule__BoolExpression__LhsAssignment_0 )
            {
             before(grammarAccess.getBoolExpressionAccess().getLhsAssignment_0()); 
            // InternalSql.g:2182:2: ( rule__BoolExpression__LhsAssignment_0 )
            // InternalSql.g:2182:3: rule__BoolExpression__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpression__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBoolExpressionAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpression__Group__0__Impl"


    // $ANTLR start "rule__BoolExpression__Group__1"
    // InternalSql.g:2190:1: rule__BoolExpression__Group__1 : rule__BoolExpression__Group__1__Impl ;
    public final void rule__BoolExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2194:1: ( rule__BoolExpression__Group__1__Impl )
            // InternalSql.g:2195:2: rule__BoolExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpression__Group__1"


    // $ANTLR start "rule__BoolExpression__Group__1__Impl"
    // InternalSql.g:2201:1: rule__BoolExpression__Group__1__Impl : ( ( rule__BoolExpression__Group_1__0 )? ) ;
    public final void rule__BoolExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2205:1: ( ( ( rule__BoolExpression__Group_1__0 )? ) )
            // InternalSql.g:2206:1: ( ( rule__BoolExpression__Group_1__0 )? )
            {
            // InternalSql.g:2206:1: ( ( rule__BoolExpression__Group_1__0 )? )
            // InternalSql.g:2207:2: ( rule__BoolExpression__Group_1__0 )?
            {
             before(grammarAccess.getBoolExpressionAccess().getGroup_1()); 
            // InternalSql.g:2208:2: ( rule__BoolExpression__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSql.g:2208:3: rule__BoolExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BoolExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBoolExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpression__Group__1__Impl"


    // $ANTLR start "rule__BoolExpression__Group_1__0"
    // InternalSql.g:2217:1: rule__BoolExpression__Group_1__0 : rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1 ;
    public final void rule__BoolExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2221:1: ( rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1 )
            // InternalSql.g:2222:2: rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__BoolExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BoolExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpression__Group_1__0"


    // $ANTLR start "rule__BoolExpression__Group_1__0__Impl"
    // InternalSql.g:2229:1: rule__BoolExpression__Group_1__0__Impl : ( 'OR' ) ;
    public final void rule__BoolExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2233:1: ( ( 'OR' ) )
            // InternalSql.g:2234:1: ( 'OR' )
            {
            // InternalSql.g:2234:1: ( 'OR' )
            // InternalSql.g:2235:2: 'OR'
            {
             before(grammarAccess.getBoolExpressionAccess().getORKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBoolExpressionAccess().getORKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpression__Group_1__0__Impl"


    // $ANTLR start "rule__BoolExpression__Group_1__1"
    // InternalSql.g:2244:1: rule__BoolExpression__Group_1__1 : rule__BoolExpression__Group_1__1__Impl ;
    public final void rule__BoolExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2248:1: ( rule__BoolExpression__Group_1__1__Impl )
            // InternalSql.g:2249:2: rule__BoolExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpression__Group_1__1"


    // $ANTLR start "rule__BoolExpression__Group_1__1__Impl"
    // InternalSql.g:2255:1: rule__BoolExpression__Group_1__1__Impl : ( ( rule__BoolExpression__RhsAssignment_1_1 ) ) ;
    public final void rule__BoolExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2259:1: ( ( ( rule__BoolExpression__RhsAssignment_1_1 ) ) )
            // InternalSql.g:2260:1: ( ( rule__BoolExpression__RhsAssignment_1_1 ) )
            {
            // InternalSql.g:2260:1: ( ( rule__BoolExpression__RhsAssignment_1_1 ) )
            // InternalSql.g:2261:2: ( rule__BoolExpression__RhsAssignment_1_1 )
            {
             before(grammarAccess.getBoolExpressionAccess().getRhsAssignment_1_1()); 
            // InternalSql.g:2262:2: ( rule__BoolExpression__RhsAssignment_1_1 )
            // InternalSql.g:2262:3: rule__BoolExpression__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BoolExpression__RhsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBoolExpressionAccess().getRhsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpression__Group_1__1__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalSql.g:2271:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2275:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalSql.g:2276:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Term__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalSql.g:2283:1: rule__Term__Group__0__Impl : ( ( rule__Term__LhsAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2287:1: ( ( ( rule__Term__LhsAssignment_0 ) ) )
            // InternalSql.g:2288:1: ( ( rule__Term__LhsAssignment_0 ) )
            {
            // InternalSql.g:2288:1: ( ( rule__Term__LhsAssignment_0 ) )
            // InternalSql.g:2289:2: ( rule__Term__LhsAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getLhsAssignment_0()); 
            // InternalSql.g:2290:2: ( rule__Term__LhsAssignment_0 )
            // InternalSql.g:2290:3: rule__Term__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Term__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalSql.g:2298:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2302:1: ( rule__Term__Group__1__Impl )
            // InternalSql.g:2303:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalSql.g:2309:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )? ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2313:1: ( ( ( rule__Term__Group_1__0 )? ) )
            // InternalSql.g:2314:1: ( ( rule__Term__Group_1__0 )? )
            {
            // InternalSql.g:2314:1: ( ( rule__Term__Group_1__0 )? )
            // InternalSql.g:2315:2: ( rule__Term__Group_1__0 )?
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalSql.g:2316:2: ( rule__Term__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSql.g:2316:3: rule__Term__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Term__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group_1__0"
    // InternalSql.g:2325:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2329:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalSql.g:2330:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Term__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0"


    // $ANTLR start "rule__Term__Group_1__0__Impl"
    // InternalSql.g:2337:1: rule__Term__Group_1__0__Impl : ( 'AND' ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2341:1: ( ( 'AND' ) )
            // InternalSql.g:2342:1: ( 'AND' )
            {
            // InternalSql.g:2342:1: ( 'AND' )
            // InternalSql.g:2343:2: 'AND'
            {
             before(grammarAccess.getTermAccess().getANDKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTermAccess().getANDKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__0__Impl"


    // $ANTLR start "rule__Term__Group_1__1"
    // InternalSql.g:2352:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2356:1: ( rule__Term__Group_1__1__Impl )
            // InternalSql.g:2357:2: rule__Term__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1"


    // $ANTLR start "rule__Term__Group_1__1__Impl"
    // InternalSql.g:2363:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__RhsAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2367:1: ( ( ( rule__Term__RhsAssignment_1_1 ) ) )
            // InternalSql.g:2368:1: ( ( rule__Term__RhsAssignment_1_1 ) )
            {
            // InternalSql.g:2368:1: ( ( rule__Term__RhsAssignment_1_1 ) )
            // InternalSql.g:2369:2: ( rule__Term__RhsAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getRhsAssignment_1_1()); 
            // InternalSql.g:2370:2: ( rule__Term__RhsAssignment_1_1 )
            // InternalSql.g:2370:3: rule__Term__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Term__RhsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTermAccess().getRhsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_0__0"
    // InternalSql.g:2379:1: rule__Factor__Group_0__0 : rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1 ;
    public final void rule__Factor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2383:1: ( rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1 )
            // InternalSql.g:2384:2: rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Factor__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__0"


    // $ANTLR start "rule__Factor__Group_0__0__Impl"
    // InternalSql.g:2391:1: rule__Factor__Group_0__0__Impl : ( 'NOT' ) ;
    public final void rule__Factor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2395:1: ( ( 'NOT' ) )
            // InternalSql.g:2396:1: ( 'NOT' )
            {
            // InternalSql.g:2396:1: ( 'NOT' )
            // InternalSql.g:2397:2: 'NOT'
            {
             before(grammarAccess.getFactorAccess().getNOTKeyword_0_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getNOTKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__0__Impl"


    // $ANTLR start "rule__Factor__Group_0__1"
    // InternalSql.g:2406:1: rule__Factor__Group_0__1 : rule__Factor__Group_0__1__Impl ;
    public final void rule__Factor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2410:1: ( rule__Factor__Group_0__1__Impl )
            // InternalSql.g:2411:2: rule__Factor__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__1"


    // $ANTLR start "rule__Factor__Group_0__1__Impl"
    // InternalSql.g:2417:1: rule__Factor__Group_0__1__Impl : ( ( rule__Factor__FactorAssignment_0_1 ) ) ;
    public final void rule__Factor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2421:1: ( ( ( rule__Factor__FactorAssignment_0_1 ) ) )
            // InternalSql.g:2422:1: ( ( rule__Factor__FactorAssignment_0_1 ) )
            {
            // InternalSql.g:2422:1: ( ( rule__Factor__FactorAssignment_0_1 ) )
            // InternalSql.g:2423:2: ( rule__Factor__FactorAssignment_0_1 )
            {
             before(grammarAccess.getFactorAccess().getFactorAssignment_0_1()); 
            // InternalSql.g:2424:2: ( rule__Factor__FactorAssignment_0_1 )
            // InternalSql.g:2424:3: rule__Factor__FactorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__FactorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getFactorAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_0__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalSql.g:2433:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2437:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalSql.g:2438:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalSql.g:2445:1: rule__Factor__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2449:1: ( ( '(' ) )
            // InternalSql.g:2450:1: ( '(' )
            {
            // InternalSql.g:2450:1: ( '(' )
            // InternalSql.g:2451:2: '('
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalSql.g:2460:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2464:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // InternalSql.g:2465:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalSql.g:2472:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__ExprAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2476:1: ( ( ( rule__Factor__ExprAssignment_1_1 ) ) )
            // InternalSql.g:2477:1: ( ( rule__Factor__ExprAssignment_1_1 ) )
            {
            // InternalSql.g:2477:1: ( ( rule__Factor__ExprAssignment_1_1 ) )
            // InternalSql.g:2478:2: ( rule__Factor__ExprAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getExprAssignment_1_1()); 
            // InternalSql.g:2479:2: ( rule__Factor__ExprAssignment_1_1 )
            // InternalSql.g:2479:3: rule__Factor__ExprAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__ExprAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getExprAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__2"
    // InternalSql.g:2487:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2491:1: ( rule__Factor__Group_1__2__Impl )
            // InternalSql.g:2492:2: rule__Factor__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__2"


    // $ANTLR start "rule__Factor__Group_1__2__Impl"
    // InternalSql.g:2498:1: rule__Factor__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2502:1: ( ( ')' ) )
            // InternalSql.g:2503:1: ( ')' )
            {
            // InternalSql.g:2503:1: ( ')' )
            // InternalSql.g:2504:2: ')'
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__2__Impl"


    // $ANTLR start "rule__Binary__Group__0"
    // InternalSql.g:2514:1: rule__Binary__Group__0 : rule__Binary__Group__0__Impl rule__Binary__Group__1 ;
    public final void rule__Binary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2518:1: ( rule__Binary__Group__0__Impl rule__Binary__Group__1 )
            // InternalSql.g:2519:2: rule__Binary__Group__0__Impl rule__Binary__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Binary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__0"


    // $ANTLR start "rule__Binary__Group__0__Impl"
    // InternalSql.g:2526:1: rule__Binary__Group__0__Impl : ( ( rule__Binary__LhsAssignment_0 ) ) ;
    public final void rule__Binary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2530:1: ( ( ( rule__Binary__LhsAssignment_0 ) ) )
            // InternalSql.g:2531:1: ( ( rule__Binary__LhsAssignment_0 ) )
            {
            // InternalSql.g:2531:1: ( ( rule__Binary__LhsAssignment_0 ) )
            // InternalSql.g:2532:2: ( rule__Binary__LhsAssignment_0 )
            {
             before(grammarAccess.getBinaryAccess().getLhsAssignment_0()); 
            // InternalSql.g:2533:2: ( rule__Binary__LhsAssignment_0 )
            // InternalSql.g:2533:3: rule__Binary__LhsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Binary__LhsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getLhsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__0__Impl"


    // $ANTLR start "rule__Binary__Group__1"
    // InternalSql.g:2541:1: rule__Binary__Group__1 : rule__Binary__Group__1__Impl rule__Binary__Group__2 ;
    public final void rule__Binary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2545:1: ( rule__Binary__Group__1__Impl rule__Binary__Group__2 )
            // InternalSql.g:2546:2: rule__Binary__Group__1__Impl rule__Binary__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Binary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Binary__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__1"


    // $ANTLR start "rule__Binary__Group__1__Impl"
    // InternalSql.g:2553:1: rule__Binary__Group__1__Impl : ( ( rule__Binary__Alternatives_1 ) ) ;
    public final void rule__Binary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2557:1: ( ( ( rule__Binary__Alternatives_1 ) ) )
            // InternalSql.g:2558:1: ( ( rule__Binary__Alternatives_1 ) )
            {
            // InternalSql.g:2558:1: ( ( rule__Binary__Alternatives_1 ) )
            // InternalSql.g:2559:2: ( rule__Binary__Alternatives_1 )
            {
             before(grammarAccess.getBinaryAccess().getAlternatives_1()); 
            // InternalSql.g:2560:2: ( rule__Binary__Alternatives_1 )
            // InternalSql.g:2560:3: rule__Binary__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__1__Impl"


    // $ANTLR start "rule__Binary__Group__2"
    // InternalSql.g:2568:1: rule__Binary__Group__2 : rule__Binary__Group__2__Impl ;
    public final void rule__Binary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2572:1: ( rule__Binary__Group__2__Impl )
            // InternalSql.g:2573:2: rule__Binary__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Binary__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__2"


    // $ANTLR start "rule__Binary__Group__2__Impl"
    // InternalSql.g:2579:1: rule__Binary__Group__2__Impl : ( ( rule__Binary__RhsAssignment_2 ) ) ;
    public final void rule__Binary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2583:1: ( ( ( rule__Binary__RhsAssignment_2 ) ) )
            // InternalSql.g:2584:1: ( ( rule__Binary__RhsAssignment_2 ) )
            {
            // InternalSql.g:2584:1: ( ( rule__Binary__RhsAssignment_2 ) )
            // InternalSql.g:2585:2: ( rule__Binary__RhsAssignment_2 )
            {
             before(grammarAccess.getBinaryAccess().getRhsAssignment_2()); 
            // InternalSql.g:2586:2: ( rule__Binary__RhsAssignment_2 )
            // InternalSql.g:2586:3: rule__Binary__RhsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Binary__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryAccess().getRhsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__Group__2__Impl"


    // $ANTLR start "rule__GroupClause__Group__0"
    // InternalSql.g:2595:1: rule__GroupClause__Group__0 : rule__GroupClause__Group__0__Impl rule__GroupClause__Group__1 ;
    public final void rule__GroupClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2599:1: ( rule__GroupClause__Group__0__Impl rule__GroupClause__Group__1 )
            // InternalSql.g:2600:2: rule__GroupClause__Group__0__Impl rule__GroupClause__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__GroupClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__Group__0"


    // $ANTLR start "rule__GroupClause__Group__0__Impl"
    // InternalSql.g:2607:1: rule__GroupClause__Group__0__Impl : ( 'GROUP' ) ;
    public final void rule__GroupClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2611:1: ( ( 'GROUP' ) )
            // InternalSql.g:2612:1: ( 'GROUP' )
            {
            // InternalSql.g:2612:1: ( 'GROUP' )
            // InternalSql.g:2613:2: 'GROUP'
            {
             before(grammarAccess.getGroupClauseAccess().getGROUPKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getGroupClauseAccess().getGROUPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__Group__0__Impl"


    // $ANTLR start "rule__GroupClause__Group__1"
    // InternalSql.g:2622:1: rule__GroupClause__Group__1 : rule__GroupClause__Group__1__Impl rule__GroupClause__Group__2 ;
    public final void rule__GroupClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2626:1: ( rule__GroupClause__Group__1__Impl rule__GroupClause__Group__2 )
            // InternalSql.g:2627:2: rule__GroupClause__Group__1__Impl rule__GroupClause__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__GroupClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupClause__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__Group__1"


    // $ANTLR start "rule__GroupClause__Group__1__Impl"
    // InternalSql.g:2634:1: rule__GroupClause__Group__1__Impl : ( 'BY' ) ;
    public final void rule__GroupClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2638:1: ( ( 'BY' ) )
            // InternalSql.g:2639:1: ( 'BY' )
            {
            // InternalSql.g:2639:1: ( 'BY' )
            // InternalSql.g:2640:2: 'BY'
            {
             before(grammarAccess.getGroupClauseAccess().getBYKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getGroupClauseAccess().getBYKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__Group__1__Impl"


    // $ANTLR start "rule__GroupClause__Group__2"
    // InternalSql.g:2649:1: rule__GroupClause__Group__2 : rule__GroupClause__Group__2__Impl rule__GroupClause__Group__3 ;
    public final void rule__GroupClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2653:1: ( rule__GroupClause__Group__2__Impl rule__GroupClause__Group__3 )
            // InternalSql.g:2654:2: rule__GroupClause__Group__2__Impl rule__GroupClause__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__GroupClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupClause__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__Group__2"


    // $ANTLR start "rule__GroupClause__Group__2__Impl"
    // InternalSql.g:2661:1: rule__GroupClause__Group__2__Impl : ( ( rule__GroupClause__ExpressionsAssignment_2 ) ) ;
    public final void rule__GroupClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2665:1: ( ( ( rule__GroupClause__ExpressionsAssignment_2 ) ) )
            // InternalSql.g:2666:1: ( ( rule__GroupClause__ExpressionsAssignment_2 ) )
            {
            // InternalSql.g:2666:1: ( ( rule__GroupClause__ExpressionsAssignment_2 ) )
            // InternalSql.g:2667:2: ( rule__GroupClause__ExpressionsAssignment_2 )
            {
             before(grammarAccess.getGroupClauseAccess().getExpressionsAssignment_2()); 
            // InternalSql.g:2668:2: ( rule__GroupClause__ExpressionsAssignment_2 )
            // InternalSql.g:2668:3: rule__GroupClause__ExpressionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GroupClause__ExpressionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupClauseAccess().getExpressionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__Group__2__Impl"


    // $ANTLR start "rule__GroupClause__Group__3"
    // InternalSql.g:2676:1: rule__GroupClause__Group__3 : rule__GroupClause__Group__3__Impl ;
    public final void rule__GroupClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2680:1: ( rule__GroupClause__Group__3__Impl )
            // InternalSql.g:2681:2: rule__GroupClause__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupClause__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__Group__3"


    // $ANTLR start "rule__GroupClause__Group__3__Impl"
    // InternalSql.g:2687:1: rule__GroupClause__Group__3__Impl : ( ( rule__GroupClause__Group_3__0 )* ) ;
    public final void rule__GroupClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2691:1: ( ( ( rule__GroupClause__Group_3__0 )* ) )
            // InternalSql.g:2692:1: ( ( rule__GroupClause__Group_3__0 )* )
            {
            // InternalSql.g:2692:1: ( ( rule__GroupClause__Group_3__0 )* )
            // InternalSql.g:2693:2: ( rule__GroupClause__Group_3__0 )*
            {
             before(grammarAccess.getGroupClauseAccess().getGroup_3()); 
            // InternalSql.g:2694:2: ( rule__GroupClause__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==29) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSql.g:2694:3: rule__GroupClause__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__GroupClause__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getGroupClauseAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__Group__3__Impl"


    // $ANTLR start "rule__GroupClause__Group_3__0"
    // InternalSql.g:2703:1: rule__GroupClause__Group_3__0 : rule__GroupClause__Group_3__0__Impl rule__GroupClause__Group_3__1 ;
    public final void rule__GroupClause__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2707:1: ( rule__GroupClause__Group_3__0__Impl rule__GroupClause__Group_3__1 )
            // InternalSql.g:2708:2: rule__GroupClause__Group_3__0__Impl rule__GroupClause__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__GroupClause__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupClause__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__Group_3__0"


    // $ANTLR start "rule__GroupClause__Group_3__0__Impl"
    // InternalSql.g:2715:1: rule__GroupClause__Group_3__0__Impl : ( ',' ) ;
    public final void rule__GroupClause__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2719:1: ( ( ',' ) )
            // InternalSql.g:2720:1: ( ',' )
            {
            // InternalSql.g:2720:1: ( ',' )
            // InternalSql.g:2721:2: ','
            {
             before(grammarAccess.getGroupClauseAccess().getCommaKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGroupClauseAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__Group_3__0__Impl"


    // $ANTLR start "rule__GroupClause__Group_3__1"
    // InternalSql.g:2730:1: rule__GroupClause__Group_3__1 : rule__GroupClause__Group_3__1__Impl ;
    public final void rule__GroupClause__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2734:1: ( rule__GroupClause__Group_3__1__Impl )
            // InternalSql.g:2735:2: rule__GroupClause__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupClause__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__Group_3__1"


    // $ANTLR start "rule__GroupClause__Group_3__1__Impl"
    // InternalSql.g:2741:1: rule__GroupClause__Group_3__1__Impl : ( ( rule__GroupClause__ExpressionsAssignment_3_1 ) ) ;
    public final void rule__GroupClause__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2745:1: ( ( ( rule__GroupClause__ExpressionsAssignment_3_1 ) ) )
            // InternalSql.g:2746:1: ( ( rule__GroupClause__ExpressionsAssignment_3_1 ) )
            {
            // InternalSql.g:2746:1: ( ( rule__GroupClause__ExpressionsAssignment_3_1 ) )
            // InternalSql.g:2747:2: ( rule__GroupClause__ExpressionsAssignment_3_1 )
            {
             before(grammarAccess.getGroupClauseAccess().getExpressionsAssignment_3_1()); 
            // InternalSql.g:2748:2: ( rule__GroupClause__ExpressionsAssignment_3_1 )
            // InternalSql.g:2748:3: rule__GroupClause__ExpressionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupClause__ExpressionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupClauseAccess().getExpressionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__Group_3__1__Impl"


    // $ANTLR start "rule__HavingClause__Group__0"
    // InternalSql.g:2757:1: rule__HavingClause__Group__0 : rule__HavingClause__Group__0__Impl rule__HavingClause__Group__1 ;
    public final void rule__HavingClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2761:1: ( rule__HavingClause__Group__0__Impl rule__HavingClause__Group__1 )
            // InternalSql.g:2762:2: rule__HavingClause__Group__0__Impl rule__HavingClause__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__HavingClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HavingClause__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HavingClause__Group__0"


    // $ANTLR start "rule__HavingClause__Group__0__Impl"
    // InternalSql.g:2769:1: rule__HavingClause__Group__0__Impl : ( 'HAVING' ) ;
    public final void rule__HavingClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2773:1: ( ( 'HAVING' ) )
            // InternalSql.g:2774:1: ( 'HAVING' )
            {
            // InternalSql.g:2774:1: ( 'HAVING' )
            // InternalSql.g:2775:2: 'HAVING'
            {
             before(grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HavingClause__Group__0__Impl"


    // $ANTLR start "rule__HavingClause__Group__1"
    // InternalSql.g:2784:1: rule__HavingClause__Group__1 : rule__HavingClause__Group__1__Impl ;
    public final void rule__HavingClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2788:1: ( rule__HavingClause__Group__1__Impl )
            // InternalSql.g:2789:2: rule__HavingClause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HavingClause__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HavingClause__Group__1"


    // $ANTLR start "rule__HavingClause__Group__1__Impl"
    // InternalSql.g:2795:1: rule__HavingClause__Group__1__Impl : ( ( rule__HavingClause__ExprAssignment_1 ) ) ;
    public final void rule__HavingClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2799:1: ( ( ( rule__HavingClause__ExprAssignment_1 ) ) )
            // InternalSql.g:2800:1: ( ( rule__HavingClause__ExprAssignment_1 ) )
            {
            // InternalSql.g:2800:1: ( ( rule__HavingClause__ExprAssignment_1 ) )
            // InternalSql.g:2801:2: ( rule__HavingClause__ExprAssignment_1 )
            {
             before(grammarAccess.getHavingClauseAccess().getExprAssignment_1()); 
            // InternalSql.g:2802:2: ( rule__HavingClause__ExprAssignment_1 )
            // InternalSql.g:2802:3: rule__HavingClause__ExprAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HavingClause__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHavingClauseAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HavingClause__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalSql.g:2811:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2815:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalSql.g:2816:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalSql.g:2823:1: rule__OrExpression__Group__0__Impl : ( ruleXorExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2827:1: ( ( ruleXorExpression ) )
            // InternalSql.g:2828:1: ( ruleXorExpression )
            {
            // InternalSql.g:2828:1: ( ruleXorExpression )
            // InternalSql.g:2829:2: ruleXorExpression
            {
             before(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalSql.g:2838:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2842:1: ( rule__OrExpression__Group__1__Impl )
            // InternalSql.g:2843:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalSql.g:2849:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2853:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalSql.g:2854:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalSql.g:2854:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalSql.g:2855:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalSql.g:2856:2: ( rule__OrExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==36) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSql.g:2856:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalSql.g:2865:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2869:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalSql.g:2870:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalSql.g:2877:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2881:1: ( ( () ) )
            // InternalSql.g:2882:1: ( () )
            {
            // InternalSql.g:2882:1: ( () )
            // InternalSql.g:2883:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 
            // InternalSql.g:2884:2: ()
            // InternalSql.g:2884:3: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalSql.g:2892:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2896:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalSql.g:2897:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalSql.g:2904:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2908:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalSql.g:2909:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalSql.g:2909:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalSql.g:2910:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalSql.g:2911:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalSql.g:2911:3: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // InternalSql.g:2919:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2923:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalSql.g:2924:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // InternalSql.g:2930:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2934:1: ( ( ( rule__OrExpression__RightAssignment_1_2 ) ) )
            // InternalSql.g:2935:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            {
            // InternalSql.g:2935:1: ( ( rule__OrExpression__RightAssignment_1_2 ) )
            // InternalSql.g:2936:2: ( rule__OrExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 
            // InternalSql.g:2937:2: ( rule__OrExpression__RightAssignment_1_2 )
            // InternalSql.g:2937:3: rule__OrExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__XorExpression__Group__0"
    // InternalSql.g:2946:1: rule__XorExpression__Group__0 : rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 ;
    public final void rule__XorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2950:1: ( rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1 )
            // InternalSql.g:2951:2: rule__XorExpression__Group__0__Impl rule__XorExpression__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__XorExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__0"


    // $ANTLR start "rule__XorExpression__Group__0__Impl"
    // InternalSql.g:2958:1: rule__XorExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__XorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2962:1: ( ( ruleAndExpression ) )
            // InternalSql.g:2963:1: ( ruleAndExpression )
            {
            // InternalSql.g:2963:1: ( ruleAndExpression )
            // InternalSql.g:2964:2: ruleAndExpression
            {
             before(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__0__Impl"


    // $ANTLR start "rule__XorExpression__Group__1"
    // InternalSql.g:2973:1: rule__XorExpression__Group__1 : rule__XorExpression__Group__1__Impl ;
    public final void rule__XorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2977:1: ( rule__XorExpression__Group__1__Impl )
            // InternalSql.g:2978:2: rule__XorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__1"


    // $ANTLR start "rule__XorExpression__Group__1__Impl"
    // InternalSql.g:2984:1: rule__XorExpression__Group__1__Impl : ( ( rule__XorExpression__Group_1__0 )* ) ;
    public final void rule__XorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:2988:1: ( ( ( rule__XorExpression__Group_1__0 )* ) )
            // InternalSql.g:2989:1: ( ( rule__XorExpression__Group_1__0 )* )
            {
            // InternalSql.g:2989:1: ( ( rule__XorExpression__Group_1__0 )* )
            // InternalSql.g:2990:2: ( rule__XorExpression__Group_1__0 )*
            {
             before(grammarAccess.getXorExpressionAccess().getGroup_1()); 
            // InternalSql.g:2991:2: ( rule__XorExpression__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==52) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSql.g:2991:3: rule__XorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__XorExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getXorExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group__1__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__0"
    // InternalSql.g:3000:1: rule__XorExpression__Group_1__0 : rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 ;
    public final void rule__XorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3004:1: ( rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1 )
            // InternalSql.g:3005:2: rule__XorExpression__Group_1__0__Impl rule__XorExpression__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__XorExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__0"


    // $ANTLR start "rule__XorExpression__Group_1__0__Impl"
    // InternalSql.g:3012:1: rule__XorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__XorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3016:1: ( ( () ) )
            // InternalSql.g:3017:1: ( () )
            {
            // InternalSql.g:3017:1: ( () )
            // InternalSql.g:3018:2: ()
            {
             before(grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0()); 
            // InternalSql.g:3019:2: ()
            // InternalSql.g:3019:3: 
            {
            }

             after(grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__1"
    // InternalSql.g:3027:1: rule__XorExpression__Group_1__1 : rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 ;
    public final void rule__XorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3031:1: ( rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2 )
            // InternalSql.g:3032:2: rule__XorExpression__Group_1__1__Impl rule__XorExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__XorExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__1"


    // $ANTLR start "rule__XorExpression__Group_1__1__Impl"
    // InternalSql.g:3039:1: rule__XorExpression__Group_1__1__Impl : ( ( rule__XorExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__XorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3043:1: ( ( ( rule__XorExpression__OperatorAssignment_1_1 ) ) )
            // InternalSql.g:3044:1: ( ( rule__XorExpression__OperatorAssignment_1_1 ) )
            {
            // InternalSql.g:3044:1: ( ( rule__XorExpression__OperatorAssignment_1_1 ) )
            // InternalSql.g:3045:2: ( rule__XorExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getXorExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalSql.g:3046:2: ( rule__XorExpression__OperatorAssignment_1_1 )
            // InternalSql.g:3046:3: rule__XorExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXorExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__XorExpression__Group_1__2"
    // InternalSql.g:3054:1: rule__XorExpression__Group_1__2 : rule__XorExpression__Group_1__2__Impl ;
    public final void rule__XorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3058:1: ( rule__XorExpression__Group_1__2__Impl )
            // InternalSql.g:3059:2: rule__XorExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__2"


    // $ANTLR start "rule__XorExpression__Group_1__2__Impl"
    // InternalSql.g:3065:1: rule__XorExpression__Group_1__2__Impl : ( ( rule__XorExpression__RightAssignment_1_2 ) ) ;
    public final void rule__XorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3069:1: ( ( ( rule__XorExpression__RightAssignment_1_2 ) ) )
            // InternalSql.g:3070:1: ( ( rule__XorExpression__RightAssignment_1_2 ) )
            {
            // InternalSql.g:3070:1: ( ( rule__XorExpression__RightAssignment_1_2 ) )
            // InternalSql.g:3071:2: ( rule__XorExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getXorExpressionAccess().getRightAssignment_1_2()); 
            // InternalSql.g:3072:2: ( rule__XorExpression__RightAssignment_1_2 )
            // InternalSql.g:3072:3: rule__XorExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__XorExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getXorExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalSql.g:3081:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3085:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalSql.g:3086:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalSql.g:3093:1: rule__AndExpression__Group__0__Impl : ( ruleNotExpression ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3097:1: ( ( ruleNotExpression ) )
            // InternalSql.g:3098:1: ( ruleNotExpression )
            {
            // InternalSql.g:3098:1: ( ruleNotExpression )
            // InternalSql.g:3099:2: ruleNotExpression
            {
             before(grammarAccess.getAndExpressionAccess().getNotExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNotExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getNotExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalSql.g:3108:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3112:1: ( rule__AndExpression__Group__1__Impl )
            // InternalSql.g:3113:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalSql.g:3119:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3123:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalSql.g:3124:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalSql.g:3124:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalSql.g:3125:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalSql.g:3126:2: ( rule__AndExpression__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==37) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSql.g:3126:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalSql.g:3135:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3139:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalSql.g:3140:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalSql.g:3147:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3151:1: ( ( () ) )
            // InternalSql.g:3152:1: ( () )
            {
            // InternalSql.g:3152:1: ( () )
            // InternalSql.g:3153:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 
            // InternalSql.g:3154:2: ()
            // InternalSql.g:3154:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalSql.g:3162:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3166:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalSql.g:3167:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalSql.g:3174:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3178:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalSql.g:3179:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalSql.g:3179:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalSql.g:3180:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalSql.g:3181:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalSql.g:3181:3: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalSql.g:3189:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3193:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalSql.g:3194:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalSql.g:3200:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3204:1: ( ( ( rule__AndExpression__RightAssignment_1_2 ) ) )
            // InternalSql.g:3205:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            {
            // InternalSql.g:3205:1: ( ( rule__AndExpression__RightAssignment_1_2 ) )
            // InternalSql.g:3206:2: ( rule__AndExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 
            // InternalSql.g:3207:2: ( rule__AndExpression__RightAssignment_1_2 )
            // InternalSql.g:3207:3: rule__AndExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__NotExpression__Group_0__0"
    // InternalSql.g:3216:1: rule__NotExpression__Group_0__0 : rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 ;
    public final void rule__NotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3220:1: ( rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1 )
            // InternalSql.g:3221:2: rule__NotExpression__Group_0__0__Impl rule__NotExpression__Group_0__1
            {
            pushFollow(FOLLOW_25);
            rule__NotExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_0__0"


    // $ANTLR start "rule__NotExpression__Group_0__0__Impl"
    // InternalSql.g:3228:1: rule__NotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3232:1: ( ( () ) )
            // InternalSql.g:3233:1: ( () )
            {
            // InternalSql.g:3233:1: ( () )
            // InternalSql.g:3234:2: ()
            {
             before(grammarAccess.getNotExpressionAccess().getNotExpressionAction_0_0()); 
            // InternalSql.g:3235:2: ()
            // InternalSql.g:3235:3: 
            {
            }

             after(grammarAccess.getNotExpressionAccess().getNotExpressionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_0__0__Impl"


    // $ANTLR start "rule__NotExpression__Group_0__1"
    // InternalSql.g:3243:1: rule__NotExpression__Group_0__1 : rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 ;
    public final void rule__NotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3247:1: ( rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2 )
            // InternalSql.g:3248:2: rule__NotExpression__Group_0__1__Impl rule__NotExpression__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__NotExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_0__1"


    // $ANTLR start "rule__NotExpression__Group_0__1__Impl"
    // InternalSql.g:3255:1: rule__NotExpression__Group_0__1__Impl : ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) ;
    public final void rule__NotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3259:1: ( ( ( rule__NotExpression__OperatorAssignment_0_1 ) ) )
            // InternalSql.g:3260:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            {
            // InternalSql.g:3260:1: ( ( rule__NotExpression__OperatorAssignment_0_1 ) )
            // InternalSql.g:3261:2: ( rule__NotExpression__OperatorAssignment_0_1 )
            {
             before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 
            // InternalSql.g:3262:2: ( rule__NotExpression__OperatorAssignment_0_1 )
            // InternalSql.g:3262:3: rule__NotExpression__OperatorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__OperatorAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_0__1__Impl"


    // $ANTLR start "rule__NotExpression__Group_0__2"
    // InternalSql.g:3270:1: rule__NotExpression__Group_0__2 : rule__NotExpression__Group_0__2__Impl ;
    public final void rule__NotExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3274:1: ( rule__NotExpression__Group_0__2__Impl )
            // InternalSql.g:3275:2: rule__NotExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_0__2"


    // $ANTLR start "rule__NotExpression__Group_0__2__Impl"
    // InternalSql.g:3281:1: rule__NotExpression__Group_0__2__Impl : ( ( rule__NotExpression__LeftAssignment_0_2 ) ) ;
    public final void rule__NotExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3285:1: ( ( ( rule__NotExpression__LeftAssignment_0_2 ) ) )
            // InternalSql.g:3286:1: ( ( rule__NotExpression__LeftAssignment_0_2 ) )
            {
            // InternalSql.g:3286:1: ( ( rule__NotExpression__LeftAssignment_0_2 ) )
            // InternalSql.g:3287:2: ( rule__NotExpression__LeftAssignment_0_2 )
            {
             before(grammarAccess.getNotExpressionAccess().getLeftAssignment_0_2()); 
            // InternalSql.g:3288:2: ( rule__NotExpression__LeftAssignment_0_2 )
            // InternalSql.g:3288:3: rule__NotExpression__LeftAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__LeftAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getNotExpressionAccess().getLeftAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group_0__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalSql.g:3297:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3301:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalSql.g:3302:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalSql.g:3309:1: rule__ComparisonExpression__Group__0__Impl : ( ruleAddOrSubtractExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3313:1: ( ( ruleAddOrSubtractExpression ) )
            // InternalSql.g:3314:1: ( ruleAddOrSubtractExpression )
            {
            // InternalSql.g:3314:1: ( ruleAddOrSubtractExpression )
            // InternalSql.g:3315:2: ruleAddOrSubtractExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getAddOrSubtractExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAddOrSubtractExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getAddOrSubtractExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalSql.g:3324:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3328:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalSql.g:3329:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalSql.g:3335:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )* ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3339:1: ( ( ( rule__ComparisonExpression__Group_1__0 )* ) )
            // InternalSql.g:3340:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            {
            // InternalSql.g:3340:1: ( ( rule__ComparisonExpression__Group_1__0 )* )
            // InternalSql.g:3341:2: ( rule__ComparisonExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // InternalSql.g:3342:2: ( rule__ComparisonExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=16 && LA32_0<=21)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSql.g:3342:3: rule__ComparisonExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__ComparisonExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0"
    // InternalSql.g:3351:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3355:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalSql.g:3356:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0__Impl"
    // InternalSql.g:3363:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3367:1: ( ( () ) )
            // InternalSql.g:3368:1: ( () )
            {
            // InternalSql.g:3368:1: ( () )
            // InternalSql.g:3369:2: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 
            // InternalSql.g:3370:2: ()
            // InternalSql.g:3370:3: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1"
    // InternalSql.g:3378:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3382:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalSql.g:3383:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ComparisonExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1__Impl"
    // InternalSql.g:3390:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3394:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // InternalSql.g:3395:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // InternalSql.g:3395:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // InternalSql.g:3396:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalSql.g:3397:2: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // InternalSql.g:3397:3: rule__ComparisonExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2"
    // InternalSql.g:3405:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3409:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalSql.g:3410:2: rule__ComparisonExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2__Impl"
    // InternalSql.g:3416:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3420:1: ( ( ( rule__ComparisonExpression__RightAssignment_1_2 ) ) )
            // InternalSql.g:3421:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            {
            // InternalSql.g:3421:1: ( ( rule__ComparisonExpression__RightAssignment_1_2 ) )
            // InternalSql.g:3422:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 
            // InternalSql.g:3423:2: ( rule__ComparisonExpression__RightAssignment_1_2 )
            // InternalSql.g:3423:3: rule__ComparisonExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AddOrSubtractExpression__Group__0"
    // InternalSql.g:3432:1: rule__AddOrSubtractExpression__Group__0 : rule__AddOrSubtractExpression__Group__0__Impl rule__AddOrSubtractExpression__Group__1 ;
    public final void rule__AddOrSubtractExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3436:1: ( rule__AddOrSubtractExpression__Group__0__Impl rule__AddOrSubtractExpression__Group__1 )
            // InternalSql.g:3437:2: rule__AddOrSubtractExpression__Group__0__Impl rule__AddOrSubtractExpression__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AddOrSubtractExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddOrSubtractExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOrSubtractExpression__Group__0"


    // $ANTLR start "rule__AddOrSubtractExpression__Group__0__Impl"
    // InternalSql.g:3444:1: rule__AddOrSubtractExpression__Group__0__Impl : ( ruleMultiplyDivideModuloExpression ) ;
    public final void rule__AddOrSubtractExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3448:1: ( ( ruleMultiplyDivideModuloExpression ) )
            // InternalSql.g:3449:1: ( ruleMultiplyDivideModuloExpression )
            {
            // InternalSql.g:3449:1: ( ruleMultiplyDivideModuloExpression )
            // InternalSql.g:3450:2: ruleMultiplyDivideModuloExpression
            {
             before(grammarAccess.getAddOrSubtractExpressionAccess().getMultiplyDivideModuloExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplyDivideModuloExpression();

            state._fsp--;

             after(grammarAccess.getAddOrSubtractExpressionAccess().getMultiplyDivideModuloExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOrSubtractExpression__Group__0__Impl"


    // $ANTLR start "rule__AddOrSubtractExpression__Group__1"
    // InternalSql.g:3459:1: rule__AddOrSubtractExpression__Group__1 : rule__AddOrSubtractExpression__Group__1__Impl ;
    public final void rule__AddOrSubtractExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3463:1: ( rule__AddOrSubtractExpression__Group__1__Impl )
            // InternalSql.g:3464:2: rule__AddOrSubtractExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddOrSubtractExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOrSubtractExpression__Group__1"


    // $ANTLR start "rule__AddOrSubtractExpression__Group__1__Impl"
    // InternalSql.g:3470:1: rule__AddOrSubtractExpression__Group__1__Impl : ( ( rule__AddOrSubtractExpression__Group_1__0 )* ) ;
    public final void rule__AddOrSubtractExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3474:1: ( ( ( rule__AddOrSubtractExpression__Group_1__0 )* ) )
            // InternalSql.g:3475:1: ( ( rule__AddOrSubtractExpression__Group_1__0 )* )
            {
            // InternalSql.g:3475:1: ( ( rule__AddOrSubtractExpression__Group_1__0 )* )
            // InternalSql.g:3476:2: ( rule__AddOrSubtractExpression__Group_1__0 )*
            {
             before(grammarAccess.getAddOrSubtractExpressionAccess().getGroup_1()); 
            // InternalSql.g:3477:2: ( rule__AddOrSubtractExpression__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=22 && LA33_0<=23)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSql.g:3477:3: rule__AddOrSubtractExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__AddOrSubtractExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getAddOrSubtractExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOrSubtractExpression__Group__1__Impl"


    // $ANTLR start "rule__AddOrSubtractExpression__Group_1__0"
    // InternalSql.g:3486:1: rule__AddOrSubtractExpression__Group_1__0 : rule__AddOrSubtractExpression__Group_1__0__Impl rule__AddOrSubtractExpression__Group_1__1 ;
    public final void rule__AddOrSubtractExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3490:1: ( rule__AddOrSubtractExpression__Group_1__0__Impl rule__AddOrSubtractExpression__Group_1__1 )
            // InternalSql.g:3491:2: rule__AddOrSubtractExpression__Group_1__0__Impl rule__AddOrSubtractExpression__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__AddOrSubtractExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddOrSubtractExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOrSubtractExpression__Group_1__0"


    // $ANTLR start "rule__AddOrSubtractExpression__Group_1__0__Impl"
    // InternalSql.g:3498:1: rule__AddOrSubtractExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AddOrSubtractExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3502:1: ( ( () ) )
            // InternalSql.g:3503:1: ( () )
            {
            // InternalSql.g:3503:1: ( () )
            // InternalSql.g:3504:2: ()
            {
             before(grammarAccess.getAddOrSubtractExpressionAccess().getAddOrSubtractExpressionLeftAction_1_0()); 
            // InternalSql.g:3505:2: ()
            // InternalSql.g:3505:3: 
            {
            }

             after(grammarAccess.getAddOrSubtractExpressionAccess().getAddOrSubtractExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOrSubtractExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AddOrSubtractExpression__Group_1__1"
    // InternalSql.g:3513:1: rule__AddOrSubtractExpression__Group_1__1 : rule__AddOrSubtractExpression__Group_1__1__Impl rule__AddOrSubtractExpression__Group_1__2 ;
    public final void rule__AddOrSubtractExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3517:1: ( rule__AddOrSubtractExpression__Group_1__1__Impl rule__AddOrSubtractExpression__Group_1__2 )
            // InternalSql.g:3518:2: rule__AddOrSubtractExpression__Group_1__1__Impl rule__AddOrSubtractExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__AddOrSubtractExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddOrSubtractExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOrSubtractExpression__Group_1__1"


    // $ANTLR start "rule__AddOrSubtractExpression__Group_1__1__Impl"
    // InternalSql.g:3525:1: rule__AddOrSubtractExpression__Group_1__1__Impl : ( ( rule__AddOrSubtractExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AddOrSubtractExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3529:1: ( ( ( rule__AddOrSubtractExpression__OperatorAssignment_1_1 ) ) )
            // InternalSql.g:3530:1: ( ( rule__AddOrSubtractExpression__OperatorAssignment_1_1 ) )
            {
            // InternalSql.g:3530:1: ( ( rule__AddOrSubtractExpression__OperatorAssignment_1_1 ) )
            // InternalSql.g:3531:2: ( rule__AddOrSubtractExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAddOrSubtractExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalSql.g:3532:2: ( rule__AddOrSubtractExpression__OperatorAssignment_1_1 )
            // InternalSql.g:3532:3: rule__AddOrSubtractExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AddOrSubtractExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAddOrSubtractExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOrSubtractExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AddOrSubtractExpression__Group_1__2"
    // InternalSql.g:3540:1: rule__AddOrSubtractExpression__Group_1__2 : rule__AddOrSubtractExpression__Group_1__2__Impl ;
    public final void rule__AddOrSubtractExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3544:1: ( rule__AddOrSubtractExpression__Group_1__2__Impl )
            // InternalSql.g:3545:2: rule__AddOrSubtractExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddOrSubtractExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOrSubtractExpression__Group_1__2"


    // $ANTLR start "rule__AddOrSubtractExpression__Group_1__2__Impl"
    // InternalSql.g:3551:1: rule__AddOrSubtractExpression__Group_1__2__Impl : ( ( rule__AddOrSubtractExpression__RightAssignment_1_2 ) ) ;
    public final void rule__AddOrSubtractExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3555:1: ( ( ( rule__AddOrSubtractExpression__RightAssignment_1_2 ) ) )
            // InternalSql.g:3556:1: ( ( rule__AddOrSubtractExpression__RightAssignment_1_2 ) )
            {
            // InternalSql.g:3556:1: ( ( rule__AddOrSubtractExpression__RightAssignment_1_2 ) )
            // InternalSql.g:3557:2: ( rule__AddOrSubtractExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getAddOrSubtractExpressionAccess().getRightAssignment_1_2()); 
            // InternalSql.g:3558:2: ( rule__AddOrSubtractExpression__RightAssignment_1_2 )
            // InternalSql.g:3558:3: rule__AddOrSubtractExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AddOrSubtractExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAddOrSubtractExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOrSubtractExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplyDivideModuloExpression__Group__0"
    // InternalSql.g:3567:1: rule__MultiplyDivideModuloExpression__Group__0 : rule__MultiplyDivideModuloExpression__Group__0__Impl rule__MultiplyDivideModuloExpression__Group__1 ;
    public final void rule__MultiplyDivideModuloExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3571:1: ( rule__MultiplyDivideModuloExpression__Group__0__Impl rule__MultiplyDivideModuloExpression__Group__1 )
            // InternalSql.g:3572:2: rule__MultiplyDivideModuloExpression__Group__0__Impl rule__MultiplyDivideModuloExpression__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__MultiplyDivideModuloExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplyDivideModuloExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivideModuloExpression__Group__0"


    // $ANTLR start "rule__MultiplyDivideModuloExpression__Group__0__Impl"
    // InternalSql.g:3579:1: rule__MultiplyDivideModuloExpression__Group__0__Impl : ( rulePowerOfExpression ) ;
    public final void rule__MultiplyDivideModuloExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3583:1: ( ( rulePowerOfExpression ) )
            // InternalSql.g:3584:1: ( rulePowerOfExpression )
            {
            // InternalSql.g:3584:1: ( rulePowerOfExpression )
            // InternalSql.g:3585:2: rulePowerOfExpression
            {
             before(grammarAccess.getMultiplyDivideModuloExpressionAccess().getPowerOfExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePowerOfExpression();

            state._fsp--;

             after(grammarAccess.getMultiplyDivideModuloExpressionAccess().getPowerOfExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivideModuloExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplyDivideModuloExpression__Group__1"
    // InternalSql.g:3594:1: rule__MultiplyDivideModuloExpression__Group__1 : rule__MultiplyDivideModuloExpression__Group__1__Impl ;
    public final void rule__MultiplyDivideModuloExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3598:1: ( rule__MultiplyDivideModuloExpression__Group__1__Impl )
            // InternalSql.g:3599:2: rule__MultiplyDivideModuloExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyDivideModuloExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivideModuloExpression__Group__1"


    // $ANTLR start "rule__MultiplyDivideModuloExpression__Group__1__Impl"
    // InternalSql.g:3605:1: rule__MultiplyDivideModuloExpression__Group__1__Impl : ( ( rule__MultiplyDivideModuloExpression__Group_1__0 )* ) ;
    public final void rule__MultiplyDivideModuloExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3609:1: ( ( ( rule__MultiplyDivideModuloExpression__Group_1__0 )* ) )
            // InternalSql.g:3610:1: ( ( rule__MultiplyDivideModuloExpression__Group_1__0 )* )
            {
            // InternalSql.g:3610:1: ( ( rule__MultiplyDivideModuloExpression__Group_1__0 )* )
            // InternalSql.g:3611:2: ( rule__MultiplyDivideModuloExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplyDivideModuloExpressionAccess().getGroup_1()); 
            // InternalSql.g:3612:2: ( rule__MultiplyDivideModuloExpression__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=24 && LA34_0<=26)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSql.g:3612:3: rule__MultiplyDivideModuloExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__MultiplyDivideModuloExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getMultiplyDivideModuloExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivideModuloExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplyDivideModuloExpression__Group_1__0"
    // InternalSql.g:3621:1: rule__MultiplyDivideModuloExpression__Group_1__0 : rule__MultiplyDivideModuloExpression__Group_1__0__Impl rule__MultiplyDivideModuloExpression__Group_1__1 ;
    public final void rule__MultiplyDivideModuloExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3625:1: ( rule__MultiplyDivideModuloExpression__Group_1__0__Impl rule__MultiplyDivideModuloExpression__Group_1__1 )
            // InternalSql.g:3626:2: rule__MultiplyDivideModuloExpression__Group_1__0__Impl rule__MultiplyDivideModuloExpression__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__MultiplyDivideModuloExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplyDivideModuloExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivideModuloExpression__Group_1__0"


    // $ANTLR start "rule__MultiplyDivideModuloExpression__Group_1__0__Impl"
    // InternalSql.g:3633:1: rule__MultiplyDivideModuloExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplyDivideModuloExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3637:1: ( ( () ) )
            // InternalSql.g:3638:1: ( () )
            {
            // InternalSql.g:3638:1: ( () )
            // InternalSql.g:3639:2: ()
            {
             before(grammarAccess.getMultiplyDivideModuloExpressionAccess().getMultiplyDivideModuloExpressionLeftAction_1_0()); 
            // InternalSql.g:3640:2: ()
            // InternalSql.g:3640:3: 
            {
            }

             after(grammarAccess.getMultiplyDivideModuloExpressionAccess().getMultiplyDivideModuloExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivideModuloExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplyDivideModuloExpression__Group_1__1"
    // InternalSql.g:3648:1: rule__MultiplyDivideModuloExpression__Group_1__1 : rule__MultiplyDivideModuloExpression__Group_1__1__Impl rule__MultiplyDivideModuloExpression__Group_1__2 ;
    public final void rule__MultiplyDivideModuloExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3652:1: ( rule__MultiplyDivideModuloExpression__Group_1__1__Impl rule__MultiplyDivideModuloExpression__Group_1__2 )
            // InternalSql.g:3653:2: rule__MultiplyDivideModuloExpression__Group_1__1__Impl rule__MultiplyDivideModuloExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__MultiplyDivideModuloExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplyDivideModuloExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivideModuloExpression__Group_1__1"


    // $ANTLR start "rule__MultiplyDivideModuloExpression__Group_1__1__Impl"
    // InternalSql.g:3660:1: rule__MultiplyDivideModuloExpression__Group_1__1__Impl : ( ( rule__MultiplyDivideModuloExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplyDivideModuloExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3664:1: ( ( ( rule__MultiplyDivideModuloExpression__OperatorAssignment_1_1 ) ) )
            // InternalSql.g:3665:1: ( ( rule__MultiplyDivideModuloExpression__OperatorAssignment_1_1 ) )
            {
            // InternalSql.g:3665:1: ( ( rule__MultiplyDivideModuloExpression__OperatorAssignment_1_1 ) )
            // InternalSql.g:3666:2: ( rule__MultiplyDivideModuloExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplyDivideModuloExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalSql.g:3667:2: ( rule__MultiplyDivideModuloExpression__OperatorAssignment_1_1 )
            // InternalSql.g:3667:3: rule__MultiplyDivideModuloExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyDivideModuloExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyDivideModuloExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivideModuloExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplyDivideModuloExpression__Group_1__2"
    // InternalSql.g:3675:1: rule__MultiplyDivideModuloExpression__Group_1__2 : rule__MultiplyDivideModuloExpression__Group_1__2__Impl ;
    public final void rule__MultiplyDivideModuloExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3679:1: ( rule__MultiplyDivideModuloExpression__Group_1__2__Impl )
            // InternalSql.g:3680:2: rule__MultiplyDivideModuloExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyDivideModuloExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivideModuloExpression__Group_1__2"


    // $ANTLR start "rule__MultiplyDivideModuloExpression__Group_1__2__Impl"
    // InternalSql.g:3686:1: rule__MultiplyDivideModuloExpression__Group_1__2__Impl : ( ( rule__MultiplyDivideModuloExpression__RightAssignment_1_2 ) ) ;
    public final void rule__MultiplyDivideModuloExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3690:1: ( ( ( rule__MultiplyDivideModuloExpression__RightAssignment_1_2 ) ) )
            // InternalSql.g:3691:1: ( ( rule__MultiplyDivideModuloExpression__RightAssignment_1_2 ) )
            {
            // InternalSql.g:3691:1: ( ( rule__MultiplyDivideModuloExpression__RightAssignment_1_2 ) )
            // InternalSql.g:3692:2: ( rule__MultiplyDivideModuloExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultiplyDivideModuloExpressionAccess().getRightAssignment_1_2()); 
            // InternalSql.g:3693:2: ( rule__MultiplyDivideModuloExpression__RightAssignment_1_2 )
            // InternalSql.g:3693:3: rule__MultiplyDivideModuloExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyDivideModuloExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyDivideModuloExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivideModuloExpression__Group_1__2__Impl"


    // $ANTLR start "rule__PowerOfExpression__Group__0"
    // InternalSql.g:3702:1: rule__PowerOfExpression__Group__0 : rule__PowerOfExpression__Group__0__Impl rule__PowerOfExpression__Group__1 ;
    public final void rule__PowerOfExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3706:1: ( rule__PowerOfExpression__Group__0__Impl rule__PowerOfExpression__Group__1 )
            // InternalSql.g:3707:2: rule__PowerOfExpression__Group__0__Impl rule__PowerOfExpression__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__PowerOfExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerOfExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOfExpression__Group__0"


    // $ANTLR start "rule__PowerOfExpression__Group__0__Impl"
    // InternalSql.g:3714:1: rule__PowerOfExpression__Group__0__Impl : ( ruleUnaryAddOrSubtractExpression ) ;
    public final void rule__PowerOfExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3718:1: ( ( ruleUnaryAddOrSubtractExpression ) )
            // InternalSql.g:3719:1: ( ruleUnaryAddOrSubtractExpression )
            {
            // InternalSql.g:3719:1: ( ruleUnaryAddOrSubtractExpression )
            // InternalSql.g:3720:2: ruleUnaryAddOrSubtractExpression
            {
             before(grammarAccess.getPowerOfExpressionAccess().getUnaryAddOrSubtractExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryAddOrSubtractExpression();

            state._fsp--;

             after(grammarAccess.getPowerOfExpressionAccess().getUnaryAddOrSubtractExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOfExpression__Group__0__Impl"


    // $ANTLR start "rule__PowerOfExpression__Group__1"
    // InternalSql.g:3729:1: rule__PowerOfExpression__Group__1 : rule__PowerOfExpression__Group__1__Impl ;
    public final void rule__PowerOfExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3733:1: ( rule__PowerOfExpression__Group__1__Impl )
            // InternalSql.g:3734:2: rule__PowerOfExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PowerOfExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOfExpression__Group__1"


    // $ANTLR start "rule__PowerOfExpression__Group__1__Impl"
    // InternalSql.g:3740:1: rule__PowerOfExpression__Group__1__Impl : ( ( rule__PowerOfExpression__Group_1__0 )* ) ;
    public final void rule__PowerOfExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3744:1: ( ( ( rule__PowerOfExpression__Group_1__0 )* ) )
            // InternalSql.g:3745:1: ( ( rule__PowerOfExpression__Group_1__0 )* )
            {
            // InternalSql.g:3745:1: ( ( rule__PowerOfExpression__Group_1__0 )* )
            // InternalSql.g:3746:2: ( rule__PowerOfExpression__Group_1__0 )*
            {
             before(grammarAccess.getPowerOfExpressionAccess().getGroup_1()); 
            // InternalSql.g:3747:2: ( rule__PowerOfExpression__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==53) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSql.g:3747:3: rule__PowerOfExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__PowerOfExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getPowerOfExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOfExpression__Group__1__Impl"


    // $ANTLR start "rule__PowerOfExpression__Group_1__0"
    // InternalSql.g:3756:1: rule__PowerOfExpression__Group_1__0 : rule__PowerOfExpression__Group_1__0__Impl rule__PowerOfExpression__Group_1__1 ;
    public final void rule__PowerOfExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3760:1: ( rule__PowerOfExpression__Group_1__0__Impl rule__PowerOfExpression__Group_1__1 )
            // InternalSql.g:3761:2: rule__PowerOfExpression__Group_1__0__Impl rule__PowerOfExpression__Group_1__1
            {
            pushFollow(FOLLOW_32);
            rule__PowerOfExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerOfExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOfExpression__Group_1__0"


    // $ANTLR start "rule__PowerOfExpression__Group_1__0__Impl"
    // InternalSql.g:3768:1: rule__PowerOfExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__PowerOfExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3772:1: ( ( () ) )
            // InternalSql.g:3773:1: ( () )
            {
            // InternalSql.g:3773:1: ( () )
            // InternalSql.g:3774:2: ()
            {
             before(grammarAccess.getPowerOfExpressionAccess().getPowerOfExpressionLeftAction_1_0()); 
            // InternalSql.g:3775:2: ()
            // InternalSql.g:3775:3: 
            {
            }

             after(grammarAccess.getPowerOfExpressionAccess().getPowerOfExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOfExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PowerOfExpression__Group_1__1"
    // InternalSql.g:3783:1: rule__PowerOfExpression__Group_1__1 : rule__PowerOfExpression__Group_1__1__Impl rule__PowerOfExpression__Group_1__2 ;
    public final void rule__PowerOfExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3787:1: ( rule__PowerOfExpression__Group_1__1__Impl rule__PowerOfExpression__Group_1__2 )
            // InternalSql.g:3788:2: rule__PowerOfExpression__Group_1__1__Impl rule__PowerOfExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__PowerOfExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PowerOfExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOfExpression__Group_1__1"


    // $ANTLR start "rule__PowerOfExpression__Group_1__1__Impl"
    // InternalSql.g:3795:1: rule__PowerOfExpression__Group_1__1__Impl : ( ( rule__PowerOfExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__PowerOfExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3799:1: ( ( ( rule__PowerOfExpression__OperatorAssignment_1_1 ) ) )
            // InternalSql.g:3800:1: ( ( rule__PowerOfExpression__OperatorAssignment_1_1 ) )
            {
            // InternalSql.g:3800:1: ( ( rule__PowerOfExpression__OperatorAssignment_1_1 ) )
            // InternalSql.g:3801:2: ( rule__PowerOfExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getPowerOfExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalSql.g:3802:2: ( rule__PowerOfExpression__OperatorAssignment_1_1 )
            // InternalSql.g:3802:3: rule__PowerOfExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PowerOfExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPowerOfExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOfExpression__Group_1__1__Impl"


    // $ANTLR start "rule__PowerOfExpression__Group_1__2"
    // InternalSql.g:3810:1: rule__PowerOfExpression__Group_1__2 : rule__PowerOfExpression__Group_1__2__Impl ;
    public final void rule__PowerOfExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3814:1: ( rule__PowerOfExpression__Group_1__2__Impl )
            // InternalSql.g:3815:2: rule__PowerOfExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PowerOfExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOfExpression__Group_1__2"


    // $ANTLR start "rule__PowerOfExpression__Group_1__2__Impl"
    // InternalSql.g:3821:1: rule__PowerOfExpression__Group_1__2__Impl : ( ( rule__PowerOfExpression__RightAssignment_1_2 ) ) ;
    public final void rule__PowerOfExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3825:1: ( ( ( rule__PowerOfExpression__RightAssignment_1_2 ) ) )
            // InternalSql.g:3826:1: ( ( rule__PowerOfExpression__RightAssignment_1_2 ) )
            {
            // InternalSql.g:3826:1: ( ( rule__PowerOfExpression__RightAssignment_1_2 ) )
            // InternalSql.g:3827:2: ( rule__PowerOfExpression__RightAssignment_1_2 )
            {
             before(grammarAccess.getPowerOfExpressionAccess().getRightAssignment_1_2()); 
            // InternalSql.g:3828:2: ( rule__PowerOfExpression__RightAssignment_1_2 )
            // InternalSql.g:3828:3: rule__PowerOfExpression__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PowerOfExpression__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPowerOfExpressionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOfExpression__Group_1__2__Impl"


    // $ANTLR start "rule__UnaryAddOrSubtractExpression__Group_1__0"
    // InternalSql.g:3837:1: rule__UnaryAddOrSubtractExpression__Group_1__0 : rule__UnaryAddOrSubtractExpression__Group_1__0__Impl rule__UnaryAddOrSubtractExpression__Group_1__1 ;
    public final void rule__UnaryAddOrSubtractExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3841:1: ( rule__UnaryAddOrSubtractExpression__Group_1__0__Impl rule__UnaryAddOrSubtractExpression__Group_1__1 )
            // InternalSql.g:3842:2: rule__UnaryAddOrSubtractExpression__Group_1__0__Impl rule__UnaryAddOrSubtractExpression__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__UnaryAddOrSubtractExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryAddOrSubtractExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryAddOrSubtractExpression__Group_1__0"


    // $ANTLR start "rule__UnaryAddOrSubtractExpression__Group_1__0__Impl"
    // InternalSql.g:3849:1: rule__UnaryAddOrSubtractExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__UnaryAddOrSubtractExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3853:1: ( ( () ) )
            // InternalSql.g:3854:1: ( () )
            {
            // InternalSql.g:3854:1: ( () )
            // InternalSql.g:3855:2: ()
            {
             before(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getUnaryAddOrSubtractExpressionAction_1_0()); 
            // InternalSql.g:3856:2: ()
            // InternalSql.g:3856:3: 
            {
            }

             after(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getUnaryAddOrSubtractExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryAddOrSubtractExpression__Group_1__0__Impl"


    // $ANTLR start "rule__UnaryAddOrSubtractExpression__Group_1__1"
    // InternalSql.g:3864:1: rule__UnaryAddOrSubtractExpression__Group_1__1 : rule__UnaryAddOrSubtractExpression__Group_1__1__Impl rule__UnaryAddOrSubtractExpression__Group_1__2 ;
    public final void rule__UnaryAddOrSubtractExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3868:1: ( rule__UnaryAddOrSubtractExpression__Group_1__1__Impl rule__UnaryAddOrSubtractExpression__Group_1__2 )
            // InternalSql.g:3869:2: rule__UnaryAddOrSubtractExpression__Group_1__1__Impl rule__UnaryAddOrSubtractExpression__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__UnaryAddOrSubtractExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryAddOrSubtractExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryAddOrSubtractExpression__Group_1__1"


    // $ANTLR start "rule__UnaryAddOrSubtractExpression__Group_1__1__Impl"
    // InternalSql.g:3876:1: rule__UnaryAddOrSubtractExpression__Group_1__1__Impl : ( ( rule__UnaryAddOrSubtractExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__UnaryAddOrSubtractExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3880:1: ( ( ( rule__UnaryAddOrSubtractExpression__OperatorAssignment_1_1 ) ) )
            // InternalSql.g:3881:1: ( ( rule__UnaryAddOrSubtractExpression__OperatorAssignment_1_1 ) )
            {
            // InternalSql.g:3881:1: ( ( rule__UnaryAddOrSubtractExpression__OperatorAssignment_1_1 ) )
            // InternalSql.g:3882:2: ( rule__UnaryAddOrSubtractExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalSql.g:3883:2: ( rule__UnaryAddOrSubtractExpression__OperatorAssignment_1_1 )
            // InternalSql.g:3883:3: rule__UnaryAddOrSubtractExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryAddOrSubtractExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryAddOrSubtractExpression__Group_1__1__Impl"


    // $ANTLR start "rule__UnaryAddOrSubtractExpression__Group_1__2"
    // InternalSql.g:3891:1: rule__UnaryAddOrSubtractExpression__Group_1__2 : rule__UnaryAddOrSubtractExpression__Group_1__2__Impl ;
    public final void rule__UnaryAddOrSubtractExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3895:1: ( rule__UnaryAddOrSubtractExpression__Group_1__2__Impl )
            // InternalSql.g:3896:2: rule__UnaryAddOrSubtractExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryAddOrSubtractExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryAddOrSubtractExpression__Group_1__2"


    // $ANTLR start "rule__UnaryAddOrSubtractExpression__Group_1__2__Impl"
    // InternalSql.g:3902:1: rule__UnaryAddOrSubtractExpression__Group_1__2__Impl : ( ( rule__UnaryAddOrSubtractExpression__LeftAssignment_1_2 ) ) ;
    public final void rule__UnaryAddOrSubtractExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3906:1: ( ( ( rule__UnaryAddOrSubtractExpression__LeftAssignment_1_2 ) ) )
            // InternalSql.g:3907:1: ( ( rule__UnaryAddOrSubtractExpression__LeftAssignment_1_2 ) )
            {
            // InternalSql.g:3907:1: ( ( rule__UnaryAddOrSubtractExpression__LeftAssignment_1_2 ) )
            // InternalSql.g:3908:2: ( rule__UnaryAddOrSubtractExpression__LeftAssignment_1_2 )
            {
             before(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getLeftAssignment_1_2()); 
            // InternalSql.g:3909:2: ( rule__UnaryAddOrSubtractExpression__LeftAssignment_1_2 )
            // InternalSql.g:3909:3: rule__UnaryAddOrSubtractExpression__LeftAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__UnaryAddOrSubtractExpression__LeftAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getLeftAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryAddOrSubtractExpression__Group_1__2__Impl"


    // $ANTLR start "rule__StringListNullOperatorExpression__Group__0"
    // InternalSql.g:3918:1: rule__StringListNullOperatorExpression__Group__0 : rule__StringListNullOperatorExpression__Group__0__Impl rule__StringListNullOperatorExpression__Group__1 ;
    public final void rule__StringListNullOperatorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3922:1: ( rule__StringListNullOperatorExpression__Group__0__Impl rule__StringListNullOperatorExpression__Group__1 )
            // InternalSql.g:3923:2: rule__StringListNullOperatorExpression__Group__0__Impl rule__StringListNullOperatorExpression__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__StringListNullOperatorExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringListNullOperatorExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListNullOperatorExpression__Group__0"


    // $ANTLR start "rule__StringListNullOperatorExpression__Group__0__Impl"
    // InternalSql.g:3930:1: rule__StringListNullOperatorExpression__Group__0__Impl : ( rulePropertyOrRelationAttributeExpression ) ;
    public final void rule__StringListNullOperatorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3934:1: ( ( rulePropertyOrRelationAttributeExpression ) )
            // InternalSql.g:3935:1: ( rulePropertyOrRelationAttributeExpression )
            {
            // InternalSql.g:3935:1: ( rulePropertyOrRelationAttributeExpression )
            // InternalSql.g:3936:2: rulePropertyOrRelationAttributeExpression
            {
             before(grammarAccess.getStringListNullOperatorExpressionAccess().getPropertyOrRelationAttributeExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyOrRelationAttributeExpression();

            state._fsp--;

             after(grammarAccess.getStringListNullOperatorExpressionAccess().getPropertyOrRelationAttributeExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListNullOperatorExpression__Group__0__Impl"


    // $ANTLR start "rule__StringListNullOperatorExpression__Group__1"
    // InternalSql.g:3945:1: rule__StringListNullOperatorExpression__Group__1 : rule__StringListNullOperatorExpression__Group__1__Impl ;
    public final void rule__StringListNullOperatorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3949:1: ( rule__StringListNullOperatorExpression__Group__1__Impl )
            // InternalSql.g:3950:2: rule__StringListNullOperatorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringListNullOperatorExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListNullOperatorExpression__Group__1"


    // $ANTLR start "rule__StringListNullOperatorExpression__Group__1__Impl"
    // InternalSql.g:3956:1: rule__StringListNullOperatorExpression__Group__1__Impl : ( ( rule__StringListNullOperatorExpression__Group_1__0 )* ) ;
    public final void rule__StringListNullOperatorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3960:1: ( ( ( rule__StringListNullOperatorExpression__Group_1__0 )* ) )
            // InternalSql.g:3961:1: ( ( rule__StringListNullOperatorExpression__Group_1__0 )* )
            {
            // InternalSql.g:3961:1: ( ( rule__StringListNullOperatorExpression__Group_1__0 )* )
            // InternalSql.g:3962:2: ( rule__StringListNullOperatorExpression__Group_1__0 )*
            {
             before(grammarAccess.getStringListNullOperatorExpressionAccess().getGroup_1()); 
            // InternalSql.g:3963:2: ( rule__StringListNullOperatorExpression__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=42 && LA36_0<=44)||(LA36_0>=46 && LA36_0<=48)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalSql.g:3963:3: rule__StringListNullOperatorExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__StringListNullOperatorExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getStringListNullOperatorExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListNullOperatorExpression__Group__1__Impl"


    // $ANTLR start "rule__StringListNullOperatorExpression__Group_1__0"
    // InternalSql.g:3972:1: rule__StringListNullOperatorExpression__Group_1__0 : rule__StringListNullOperatorExpression__Group_1__0__Impl rule__StringListNullOperatorExpression__Group_1__1 ;
    public final void rule__StringListNullOperatorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3976:1: ( rule__StringListNullOperatorExpression__Group_1__0__Impl rule__StringListNullOperatorExpression__Group_1__1 )
            // InternalSql.g:3977:2: rule__StringListNullOperatorExpression__Group_1__0__Impl rule__StringListNullOperatorExpression__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__StringListNullOperatorExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringListNullOperatorExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListNullOperatorExpression__Group_1__0"


    // $ANTLR start "rule__StringListNullOperatorExpression__Group_1__0__Impl"
    // InternalSql.g:3984:1: rule__StringListNullOperatorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__StringListNullOperatorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:3988:1: ( ( () ) )
            // InternalSql.g:3989:1: ( () )
            {
            // InternalSql.g:3989:1: ( () )
            // InternalSql.g:3990:2: ()
            {
             before(grammarAccess.getStringListNullOperatorExpressionAccess().getStringListNullOperatorExpressionLeftAction_1_0()); 
            // InternalSql.g:3991:2: ()
            // InternalSql.g:3991:3: 
            {
            }

             after(grammarAccess.getStringListNullOperatorExpressionAccess().getStringListNullOperatorExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListNullOperatorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__StringListNullOperatorExpression__Group_1__1"
    // InternalSql.g:3999:1: rule__StringListNullOperatorExpression__Group_1__1 : rule__StringListNullOperatorExpression__Group_1__1__Impl ;
    public final void rule__StringListNullOperatorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4003:1: ( rule__StringListNullOperatorExpression__Group_1__1__Impl )
            // InternalSql.g:4004:2: rule__StringListNullOperatorExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringListNullOperatorExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListNullOperatorExpression__Group_1__1"


    // $ANTLR start "rule__StringListNullOperatorExpression__Group_1__1__Impl"
    // InternalSql.g:4010:1: rule__StringListNullOperatorExpression__Group_1__1__Impl : ( ( rule__StringListNullOperatorExpression__ExpressionsAssignment_1_1 ) ) ;
    public final void rule__StringListNullOperatorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4014:1: ( ( ( rule__StringListNullOperatorExpression__ExpressionsAssignment_1_1 ) ) )
            // InternalSql.g:4015:1: ( ( rule__StringListNullOperatorExpression__ExpressionsAssignment_1_1 ) )
            {
            // InternalSql.g:4015:1: ( ( rule__StringListNullOperatorExpression__ExpressionsAssignment_1_1 ) )
            // InternalSql.g:4016:2: ( rule__StringListNullOperatorExpression__ExpressionsAssignment_1_1 )
            {
             before(grammarAccess.getStringListNullOperatorExpressionAccess().getExpressionsAssignment_1_1()); 
            // InternalSql.g:4017:2: ( rule__StringListNullOperatorExpression__ExpressionsAssignment_1_1 )
            // InternalSql.g:4017:3: rule__StringListNullOperatorExpression__ExpressionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StringListNullOperatorExpression__ExpressionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStringListNullOperatorExpressionAccess().getExpressionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListNullOperatorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__StringOperatorExpression__Group__0"
    // InternalSql.g:4026:1: rule__StringOperatorExpression__Group__0 : rule__StringOperatorExpression__Group__0__Impl rule__StringOperatorExpression__Group__1 ;
    public final void rule__StringOperatorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4030:1: ( rule__StringOperatorExpression__Group__0__Impl rule__StringOperatorExpression__Group__1 )
            // InternalSql.g:4031:2: rule__StringOperatorExpression__Group__0__Impl rule__StringOperatorExpression__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__StringOperatorExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group__0"


    // $ANTLR start "rule__StringOperatorExpression__Group__0__Impl"
    // InternalSql.g:4038:1: rule__StringOperatorExpression__Group__0__Impl : ( ( rule__StringOperatorExpression__Alternatives_0 ) ) ;
    public final void rule__StringOperatorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4042:1: ( ( ( rule__StringOperatorExpression__Alternatives_0 ) ) )
            // InternalSql.g:4043:1: ( ( rule__StringOperatorExpression__Alternatives_0 ) )
            {
            // InternalSql.g:4043:1: ( ( rule__StringOperatorExpression__Alternatives_0 ) )
            // InternalSql.g:4044:2: ( rule__StringOperatorExpression__Alternatives_0 )
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getAlternatives_0()); 
            // InternalSql.g:4045:2: ( rule__StringOperatorExpression__Alternatives_0 )
            // InternalSql.g:4045:3: rule__StringOperatorExpression__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStringOperatorExpressionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group__0__Impl"


    // $ANTLR start "rule__StringOperatorExpression__Group__1"
    // InternalSql.g:4053:1: rule__StringOperatorExpression__Group__1 : rule__StringOperatorExpression__Group__1__Impl ;
    public final void rule__StringOperatorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4057:1: ( rule__StringOperatorExpression__Group__1__Impl )
            // InternalSql.g:4058:2: rule__StringOperatorExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group__1"


    // $ANTLR start "rule__StringOperatorExpression__Group__1__Impl"
    // InternalSql.g:4064:1: rule__StringOperatorExpression__Group__1__Impl : ( ( rule__StringOperatorExpression__RightAssignment_1 ) ) ;
    public final void rule__StringOperatorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4068:1: ( ( ( rule__StringOperatorExpression__RightAssignment_1 ) ) )
            // InternalSql.g:4069:1: ( ( rule__StringOperatorExpression__RightAssignment_1 ) )
            {
            // InternalSql.g:4069:1: ( ( rule__StringOperatorExpression__RightAssignment_1 ) )
            // InternalSql.g:4070:2: ( rule__StringOperatorExpression__RightAssignment_1 )
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getRightAssignment_1()); 
            // InternalSql.g:4071:2: ( rule__StringOperatorExpression__RightAssignment_1 )
            // InternalSql.g:4071:3: rule__StringOperatorExpression__RightAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__RightAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringOperatorExpressionAccess().getRightAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group__1__Impl"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_0__0"
    // InternalSql.g:4080:1: rule__StringOperatorExpression__Group_0_0__0 : rule__StringOperatorExpression__Group_0_0__0__Impl rule__StringOperatorExpression__Group_0_0__1 ;
    public final void rule__StringOperatorExpression__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4084:1: ( rule__StringOperatorExpression__Group_0_0__0__Impl rule__StringOperatorExpression__Group_0_0__1 )
            // InternalSql.g:4085:2: rule__StringOperatorExpression__Group_0_0__0__Impl rule__StringOperatorExpression__Group_0_0__1
            {
            pushFollow(FOLLOW_36);
            rule__StringOperatorExpression__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_0__0"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_0__0__Impl"
    // InternalSql.g:4092:1: rule__StringOperatorExpression__Group_0_0__0__Impl : ( () ) ;
    public final void rule__StringOperatorExpression__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4096:1: ( ( () ) )
            // InternalSql.g:4097:1: ( () )
            {
            // InternalSql.g:4097:1: ( () )
            // InternalSql.g:4098:2: ()
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getRegExpMatchingExpressionAction_0_0_0()); 
            // InternalSql.g:4099:2: ()
            // InternalSql.g:4099:3: 
            {
            }

             after(grammarAccess.getStringOperatorExpressionAccess().getRegExpMatchingExpressionAction_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_0__0__Impl"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_0__1"
    // InternalSql.g:4107:1: rule__StringOperatorExpression__Group_0_0__1 : rule__StringOperatorExpression__Group_0_0__1__Impl ;
    public final void rule__StringOperatorExpression__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4111:1: ( rule__StringOperatorExpression__Group_0_0__1__Impl )
            // InternalSql.g:4112:2: rule__StringOperatorExpression__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_0__1"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_0__1__Impl"
    // InternalSql.g:4118:1: rule__StringOperatorExpression__Group_0_0__1__Impl : ( '=~' ) ;
    public final void rule__StringOperatorExpression__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4122:1: ( ( '=~' ) )
            // InternalSql.g:4123:1: ( '=~' )
            {
            // InternalSql.g:4123:1: ( '=~' )
            // InternalSql.g:4124:2: '=~'
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getEqualsSignTildeKeyword_0_0_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStringOperatorExpressionAccess().getEqualsSignTildeKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_0__1__Impl"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_1__0"
    // InternalSql.g:4134:1: rule__StringOperatorExpression__Group_0_1__0 : rule__StringOperatorExpression__Group_0_1__0__Impl rule__StringOperatorExpression__Group_0_1__1 ;
    public final void rule__StringOperatorExpression__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4138:1: ( rule__StringOperatorExpression__Group_0_1__0__Impl rule__StringOperatorExpression__Group_0_1__1 )
            // InternalSql.g:4139:2: rule__StringOperatorExpression__Group_0_1__0__Impl rule__StringOperatorExpression__Group_0_1__1
            {
            pushFollow(FOLLOW_37);
            rule__StringOperatorExpression__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_1__0"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_1__0__Impl"
    // InternalSql.g:4146:1: rule__StringOperatorExpression__Group_0_1__0__Impl : ( () ) ;
    public final void rule__StringOperatorExpression__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4150:1: ( ( () ) )
            // InternalSql.g:4151:1: ( () )
            {
            // InternalSql.g:4151:1: ( () )
            // InternalSql.g:4152:2: ()
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getInCollectionExpressionAction_0_1_0()); 
            // InternalSql.g:4153:2: ()
            // InternalSql.g:4153:3: 
            {
            }

             after(grammarAccess.getStringOperatorExpressionAccess().getInCollectionExpressionAction_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_1__0__Impl"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_1__1"
    // InternalSql.g:4161:1: rule__StringOperatorExpression__Group_0_1__1 : rule__StringOperatorExpression__Group_0_1__1__Impl ;
    public final void rule__StringOperatorExpression__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4165:1: ( rule__StringOperatorExpression__Group_0_1__1__Impl )
            // InternalSql.g:4166:2: rule__StringOperatorExpression__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_1__1"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_1__1__Impl"
    // InternalSql.g:4172:1: rule__StringOperatorExpression__Group_0_1__1__Impl : ( 'IN' ) ;
    public final void rule__StringOperatorExpression__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4176:1: ( ( 'IN' ) )
            // InternalSql.g:4177:1: ( 'IN' )
            {
            // InternalSql.g:4177:1: ( 'IN' )
            // InternalSql.g:4178:2: 'IN'
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getINKeyword_0_1_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getStringOperatorExpressionAccess().getINKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_1__1__Impl"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_2__0"
    // InternalSql.g:4188:1: rule__StringOperatorExpression__Group_0_2__0 : rule__StringOperatorExpression__Group_0_2__0__Impl rule__StringOperatorExpression__Group_0_2__1 ;
    public final void rule__StringOperatorExpression__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4192:1: ( rule__StringOperatorExpression__Group_0_2__0__Impl rule__StringOperatorExpression__Group_0_2__1 )
            // InternalSql.g:4193:2: rule__StringOperatorExpression__Group_0_2__0__Impl rule__StringOperatorExpression__Group_0_2__1
            {
            pushFollow(FOLLOW_38);
            rule__StringOperatorExpression__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_2__0"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_2__0__Impl"
    // InternalSql.g:4200:1: rule__StringOperatorExpression__Group_0_2__0__Impl : ( () ) ;
    public final void rule__StringOperatorExpression__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4204:1: ( ( () ) )
            // InternalSql.g:4205:1: ( () )
            {
            // InternalSql.g:4205:1: ( () )
            // InternalSql.g:4206:2: ()
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getStartsWithExpressionAction_0_2_0()); 
            // InternalSql.g:4207:2: ()
            // InternalSql.g:4207:3: 
            {
            }

             after(grammarAccess.getStringOperatorExpressionAccess().getStartsWithExpressionAction_0_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_2__0__Impl"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_2__1"
    // InternalSql.g:4215:1: rule__StringOperatorExpression__Group_0_2__1 : rule__StringOperatorExpression__Group_0_2__1__Impl rule__StringOperatorExpression__Group_0_2__2 ;
    public final void rule__StringOperatorExpression__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4219:1: ( rule__StringOperatorExpression__Group_0_2__1__Impl rule__StringOperatorExpression__Group_0_2__2 )
            // InternalSql.g:4220:2: rule__StringOperatorExpression__Group_0_2__1__Impl rule__StringOperatorExpression__Group_0_2__2
            {
            pushFollow(FOLLOW_39);
            rule__StringOperatorExpression__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_2__1"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_2__1__Impl"
    // InternalSql.g:4227:1: rule__StringOperatorExpression__Group_0_2__1__Impl : ( 'STARTS' ) ;
    public final void rule__StringOperatorExpression__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4231:1: ( ( 'STARTS' ) )
            // InternalSql.g:4232:1: ( 'STARTS' )
            {
            // InternalSql.g:4232:1: ( 'STARTS' )
            // InternalSql.g:4233:2: 'STARTS'
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getSTARTSKeyword_0_2_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getStringOperatorExpressionAccess().getSTARTSKeyword_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_2__1__Impl"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_2__2"
    // InternalSql.g:4242:1: rule__StringOperatorExpression__Group_0_2__2 : rule__StringOperatorExpression__Group_0_2__2__Impl ;
    public final void rule__StringOperatorExpression__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4246:1: ( rule__StringOperatorExpression__Group_0_2__2__Impl )
            // InternalSql.g:4247:2: rule__StringOperatorExpression__Group_0_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group_0_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_2__2"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_2__2__Impl"
    // InternalSql.g:4253:1: rule__StringOperatorExpression__Group_0_2__2__Impl : ( 'WITH' ) ;
    public final void rule__StringOperatorExpression__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4257:1: ( ( 'WITH' ) )
            // InternalSql.g:4258:1: ( 'WITH' )
            {
            // InternalSql.g:4258:1: ( 'WITH' )
            // InternalSql.g:4259:2: 'WITH'
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getWITHKeyword_0_2_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getStringOperatorExpressionAccess().getWITHKeyword_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_2__2__Impl"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_3__0"
    // InternalSql.g:4269:1: rule__StringOperatorExpression__Group_0_3__0 : rule__StringOperatorExpression__Group_0_3__0__Impl rule__StringOperatorExpression__Group_0_3__1 ;
    public final void rule__StringOperatorExpression__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4273:1: ( rule__StringOperatorExpression__Group_0_3__0__Impl rule__StringOperatorExpression__Group_0_3__1 )
            // InternalSql.g:4274:2: rule__StringOperatorExpression__Group_0_3__0__Impl rule__StringOperatorExpression__Group_0_3__1
            {
            pushFollow(FOLLOW_40);
            rule__StringOperatorExpression__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_3__0"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_3__0__Impl"
    // InternalSql.g:4281:1: rule__StringOperatorExpression__Group_0_3__0__Impl : ( () ) ;
    public final void rule__StringOperatorExpression__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4285:1: ( ( () ) )
            // InternalSql.g:4286:1: ( () )
            {
            // InternalSql.g:4286:1: ( () )
            // InternalSql.g:4287:2: ()
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getEndsWithExpressionAction_0_3_0()); 
            // InternalSql.g:4288:2: ()
            // InternalSql.g:4288:3: 
            {
            }

             after(grammarAccess.getStringOperatorExpressionAccess().getEndsWithExpressionAction_0_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_3__0__Impl"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_3__1"
    // InternalSql.g:4296:1: rule__StringOperatorExpression__Group_0_3__1 : rule__StringOperatorExpression__Group_0_3__1__Impl rule__StringOperatorExpression__Group_0_3__2 ;
    public final void rule__StringOperatorExpression__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4300:1: ( rule__StringOperatorExpression__Group_0_3__1__Impl rule__StringOperatorExpression__Group_0_3__2 )
            // InternalSql.g:4301:2: rule__StringOperatorExpression__Group_0_3__1__Impl rule__StringOperatorExpression__Group_0_3__2
            {
            pushFollow(FOLLOW_39);
            rule__StringOperatorExpression__Group_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group_0_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_3__1"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_3__1__Impl"
    // InternalSql.g:4308:1: rule__StringOperatorExpression__Group_0_3__1__Impl : ( 'ENDS' ) ;
    public final void rule__StringOperatorExpression__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4312:1: ( ( 'ENDS' ) )
            // InternalSql.g:4313:1: ( 'ENDS' )
            {
            // InternalSql.g:4313:1: ( 'ENDS' )
            // InternalSql.g:4314:2: 'ENDS'
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getENDSKeyword_0_3_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getStringOperatorExpressionAccess().getENDSKeyword_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_3__1__Impl"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_3__2"
    // InternalSql.g:4323:1: rule__StringOperatorExpression__Group_0_3__2 : rule__StringOperatorExpression__Group_0_3__2__Impl ;
    public final void rule__StringOperatorExpression__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4327:1: ( rule__StringOperatorExpression__Group_0_3__2__Impl )
            // InternalSql.g:4328:2: rule__StringOperatorExpression__Group_0_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group_0_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_3__2"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_3__2__Impl"
    // InternalSql.g:4334:1: rule__StringOperatorExpression__Group_0_3__2__Impl : ( 'WITH' ) ;
    public final void rule__StringOperatorExpression__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4338:1: ( ( 'WITH' ) )
            // InternalSql.g:4339:1: ( 'WITH' )
            {
            // InternalSql.g:4339:1: ( 'WITH' )
            // InternalSql.g:4340:2: 'WITH'
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getWITHKeyword_0_3_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getStringOperatorExpressionAccess().getWITHKeyword_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_3__2__Impl"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_4__0"
    // InternalSql.g:4350:1: rule__StringOperatorExpression__Group_0_4__0 : rule__StringOperatorExpression__Group_0_4__0__Impl rule__StringOperatorExpression__Group_0_4__1 ;
    public final void rule__StringOperatorExpression__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4354:1: ( rule__StringOperatorExpression__Group_0_4__0__Impl rule__StringOperatorExpression__Group_0_4__1 )
            // InternalSql.g:4355:2: rule__StringOperatorExpression__Group_0_4__0__Impl rule__StringOperatorExpression__Group_0_4__1
            {
            pushFollow(FOLLOW_41);
            rule__StringOperatorExpression__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_4__0"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_4__0__Impl"
    // InternalSql.g:4362:1: rule__StringOperatorExpression__Group_0_4__0__Impl : ( () ) ;
    public final void rule__StringOperatorExpression__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4366:1: ( ( () ) )
            // InternalSql.g:4367:1: ( () )
            {
            // InternalSql.g:4367:1: ( () )
            // InternalSql.g:4368:2: ()
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getContainsExpressionAction_0_4_0()); 
            // InternalSql.g:4369:2: ()
            // InternalSql.g:4369:3: 
            {
            }

             after(grammarAccess.getStringOperatorExpressionAccess().getContainsExpressionAction_0_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_4__0__Impl"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_4__1"
    // InternalSql.g:4377:1: rule__StringOperatorExpression__Group_0_4__1 : rule__StringOperatorExpression__Group_0_4__1__Impl ;
    public final void rule__StringOperatorExpression__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4381:1: ( rule__StringOperatorExpression__Group_0_4__1__Impl )
            // InternalSql.g:4382:2: rule__StringOperatorExpression__Group_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOperatorExpression__Group_0_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_4__1"


    // $ANTLR start "rule__StringOperatorExpression__Group_0_4__1__Impl"
    // InternalSql.g:4388:1: rule__StringOperatorExpression__Group_0_4__1__Impl : ( 'CONTAINS' ) ;
    public final void rule__StringOperatorExpression__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4392:1: ( ( 'CONTAINS' ) )
            // InternalSql.g:4393:1: ( 'CONTAINS' )
            {
            // InternalSql.g:4393:1: ( 'CONTAINS' )
            // InternalSql.g:4394:2: 'CONTAINS'
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getCONTAINSKeyword_0_4_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getStringOperatorExpressionAccess().getCONTAINSKeyword_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__Group_0_4__1__Impl"


    // $ANTLR start "rule__NullOperatorExpression__Group_0__0"
    // InternalSql.g:4404:1: rule__NullOperatorExpression__Group_0__0 : rule__NullOperatorExpression__Group_0__0__Impl rule__NullOperatorExpression__Group_0__1 ;
    public final void rule__NullOperatorExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4408:1: ( rule__NullOperatorExpression__Group_0__0__Impl rule__NullOperatorExpression__Group_0__1 )
            // InternalSql.g:4409:2: rule__NullOperatorExpression__Group_0__0__Impl rule__NullOperatorExpression__Group_0__1
            {
            pushFollow(FOLLOW_42);
            rule__NullOperatorExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullOperatorExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Group_0__0"


    // $ANTLR start "rule__NullOperatorExpression__Group_0__0__Impl"
    // InternalSql.g:4416:1: rule__NullOperatorExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__NullOperatorExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4420:1: ( ( () ) )
            // InternalSql.g:4421:1: ( () )
            {
            // InternalSql.g:4421:1: ( () )
            // InternalSql.g:4422:2: ()
            {
             before(grammarAccess.getNullOperatorExpressionAccess().getIsNullExpressionAction_0_0()); 
            // InternalSql.g:4423:2: ()
            // InternalSql.g:4423:3: 
            {
            }

             after(grammarAccess.getNullOperatorExpressionAccess().getIsNullExpressionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Group_0__0__Impl"


    // $ANTLR start "rule__NullOperatorExpression__Group_0__1"
    // InternalSql.g:4431:1: rule__NullOperatorExpression__Group_0__1 : rule__NullOperatorExpression__Group_0__1__Impl rule__NullOperatorExpression__Group_0__2 ;
    public final void rule__NullOperatorExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4435:1: ( rule__NullOperatorExpression__Group_0__1__Impl rule__NullOperatorExpression__Group_0__2 )
            // InternalSql.g:4436:2: rule__NullOperatorExpression__Group_0__1__Impl rule__NullOperatorExpression__Group_0__2
            {
            pushFollow(FOLLOW_43);
            rule__NullOperatorExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullOperatorExpression__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Group_0__1"


    // $ANTLR start "rule__NullOperatorExpression__Group_0__1__Impl"
    // InternalSql.g:4443:1: rule__NullOperatorExpression__Group_0__1__Impl : ( 'IS' ) ;
    public final void rule__NullOperatorExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4447:1: ( ( 'IS' ) )
            // InternalSql.g:4448:1: ( 'IS' )
            {
            // InternalSql.g:4448:1: ( 'IS' )
            // InternalSql.g:4449:2: 'IS'
            {
             before(grammarAccess.getNullOperatorExpressionAccess().getISKeyword_0_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getNullOperatorExpressionAccess().getISKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Group_0__1__Impl"


    // $ANTLR start "rule__NullOperatorExpression__Group_0__2"
    // InternalSql.g:4458:1: rule__NullOperatorExpression__Group_0__2 : rule__NullOperatorExpression__Group_0__2__Impl ;
    public final void rule__NullOperatorExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4462:1: ( rule__NullOperatorExpression__Group_0__2__Impl )
            // InternalSql.g:4463:2: rule__NullOperatorExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullOperatorExpression__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Group_0__2"


    // $ANTLR start "rule__NullOperatorExpression__Group_0__2__Impl"
    // InternalSql.g:4469:1: rule__NullOperatorExpression__Group_0__2__Impl : ( 'NULL' ) ;
    public final void rule__NullOperatorExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4473:1: ( ( 'NULL' ) )
            // InternalSql.g:4474:1: ( 'NULL' )
            {
            // InternalSql.g:4474:1: ( 'NULL' )
            // InternalSql.g:4475:2: 'NULL'
            {
             before(grammarAccess.getNullOperatorExpressionAccess().getNULLKeyword_0_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNullOperatorExpressionAccess().getNULLKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Group_0__2__Impl"


    // $ANTLR start "rule__NullOperatorExpression__Group_1__0"
    // InternalSql.g:4485:1: rule__NullOperatorExpression__Group_1__0 : rule__NullOperatorExpression__Group_1__0__Impl rule__NullOperatorExpression__Group_1__1 ;
    public final void rule__NullOperatorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4489:1: ( rule__NullOperatorExpression__Group_1__0__Impl rule__NullOperatorExpression__Group_1__1 )
            // InternalSql.g:4490:2: rule__NullOperatorExpression__Group_1__0__Impl rule__NullOperatorExpression__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__NullOperatorExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullOperatorExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Group_1__0"


    // $ANTLR start "rule__NullOperatorExpression__Group_1__0__Impl"
    // InternalSql.g:4497:1: rule__NullOperatorExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__NullOperatorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4501:1: ( ( () ) )
            // InternalSql.g:4502:1: ( () )
            {
            // InternalSql.g:4502:1: ( () )
            // InternalSql.g:4503:2: ()
            {
             before(grammarAccess.getNullOperatorExpressionAccess().getIsNotNullExpressionAction_1_0()); 
            // InternalSql.g:4504:2: ()
            // InternalSql.g:4504:3: 
            {
            }

             after(grammarAccess.getNullOperatorExpressionAccess().getIsNotNullExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__NullOperatorExpression__Group_1__1"
    // InternalSql.g:4512:1: rule__NullOperatorExpression__Group_1__1 : rule__NullOperatorExpression__Group_1__1__Impl rule__NullOperatorExpression__Group_1__2 ;
    public final void rule__NullOperatorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4516:1: ( rule__NullOperatorExpression__Group_1__1__Impl rule__NullOperatorExpression__Group_1__2 )
            // InternalSql.g:4517:2: rule__NullOperatorExpression__Group_1__1__Impl rule__NullOperatorExpression__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__NullOperatorExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullOperatorExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Group_1__1"


    // $ANTLR start "rule__NullOperatorExpression__Group_1__1__Impl"
    // InternalSql.g:4524:1: rule__NullOperatorExpression__Group_1__1__Impl : ( 'IS' ) ;
    public final void rule__NullOperatorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4528:1: ( ( 'IS' ) )
            // InternalSql.g:4529:1: ( 'IS' )
            {
            // InternalSql.g:4529:1: ( 'IS' )
            // InternalSql.g:4530:2: 'IS'
            {
             before(grammarAccess.getNullOperatorExpressionAccess().getISKeyword_1_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getNullOperatorExpressionAccess().getISKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__NullOperatorExpression__Group_1__2"
    // InternalSql.g:4539:1: rule__NullOperatorExpression__Group_1__2 : rule__NullOperatorExpression__Group_1__2__Impl rule__NullOperatorExpression__Group_1__3 ;
    public final void rule__NullOperatorExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4543:1: ( rule__NullOperatorExpression__Group_1__2__Impl rule__NullOperatorExpression__Group_1__3 )
            // InternalSql.g:4544:2: rule__NullOperatorExpression__Group_1__2__Impl rule__NullOperatorExpression__Group_1__3
            {
            pushFollow(FOLLOW_43);
            rule__NullOperatorExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NullOperatorExpression__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Group_1__2"


    // $ANTLR start "rule__NullOperatorExpression__Group_1__2__Impl"
    // InternalSql.g:4551:1: rule__NullOperatorExpression__Group_1__2__Impl : ( 'NOT' ) ;
    public final void rule__NullOperatorExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4555:1: ( ( 'NOT' ) )
            // InternalSql.g:4556:1: ( 'NOT' )
            {
            // InternalSql.g:4556:1: ( 'NOT' )
            // InternalSql.g:4557:2: 'NOT'
            {
             before(grammarAccess.getNullOperatorExpressionAccess().getNOTKeyword_1_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNullOperatorExpressionAccess().getNOTKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Group_1__2__Impl"


    // $ANTLR start "rule__NullOperatorExpression__Group_1__3"
    // InternalSql.g:4566:1: rule__NullOperatorExpression__Group_1__3 : rule__NullOperatorExpression__Group_1__3__Impl ;
    public final void rule__NullOperatorExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4570:1: ( rule__NullOperatorExpression__Group_1__3__Impl )
            // InternalSql.g:4571:2: rule__NullOperatorExpression__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NullOperatorExpression__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Group_1__3"


    // $ANTLR start "rule__NullOperatorExpression__Group_1__3__Impl"
    // InternalSql.g:4577:1: rule__NullOperatorExpression__Group_1__3__Impl : ( 'NULL' ) ;
    public final void rule__NullOperatorExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4581:1: ( ( 'NULL' ) )
            // InternalSql.g:4582:1: ( 'NULL' )
            {
            // InternalSql.g:4582:1: ( 'NULL' )
            // InternalSql.g:4583:2: 'NULL'
            {
             before(grammarAccess.getNullOperatorExpressionAccess().getNULLKeyword_1_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNullOperatorExpressionAccess().getNULLKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NullOperatorExpression__Group_1__3__Impl"


    // $ANTLR start "rule__PropertyOrRelationAttributeExpression__Group__0"
    // InternalSql.g:4593:1: rule__PropertyOrRelationAttributeExpression__Group__0 : rule__PropertyOrRelationAttributeExpression__Group__0__Impl rule__PropertyOrRelationAttributeExpression__Group__1 ;
    public final void rule__PropertyOrRelationAttributeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4597:1: ( rule__PropertyOrRelationAttributeExpression__Group__0__Impl rule__PropertyOrRelationAttributeExpression__Group__1 )
            // InternalSql.g:4598:2: rule__PropertyOrRelationAttributeExpression__Group__0__Impl rule__PropertyOrRelationAttributeExpression__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__PropertyOrRelationAttributeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PropertyOrRelationAttributeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyOrRelationAttributeExpression__Group__0"


    // $ANTLR start "rule__PropertyOrRelationAttributeExpression__Group__0__Impl"
    // InternalSql.g:4605:1: rule__PropertyOrRelationAttributeExpression__Group__0__Impl : ( ruleAtom ) ;
    public final void rule__PropertyOrRelationAttributeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4609:1: ( ( ruleAtom ) )
            // InternalSql.g:4610:1: ( ruleAtom )
            {
            // InternalSql.g:4610:1: ( ruleAtom )
            // InternalSql.g:4611:2: ruleAtom
            {
             before(grammarAccess.getPropertyOrRelationAttributeExpressionAccess().getAtomParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getPropertyOrRelationAttributeExpressionAccess().getAtomParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyOrRelationAttributeExpression__Group__0__Impl"


    // $ANTLR start "rule__PropertyOrRelationAttributeExpression__Group__1"
    // InternalSql.g:4620:1: rule__PropertyOrRelationAttributeExpression__Group__1 : rule__PropertyOrRelationAttributeExpression__Group__1__Impl ;
    public final void rule__PropertyOrRelationAttributeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4624:1: ( rule__PropertyOrRelationAttributeExpression__Group__1__Impl )
            // InternalSql.g:4625:2: rule__PropertyOrRelationAttributeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyOrRelationAttributeExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyOrRelationAttributeExpression__Group__1"


    // $ANTLR start "rule__PropertyOrRelationAttributeExpression__Group__1__Impl"
    // InternalSql.g:4631:1: rule__PropertyOrRelationAttributeExpression__Group__1__Impl : ( ( rule__PropertyOrRelationAttributeExpression__AttributeLookupAssignment_1 )? ) ;
    public final void rule__PropertyOrRelationAttributeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4635:1: ( ( ( rule__PropertyOrRelationAttributeExpression__AttributeLookupAssignment_1 )? ) )
            // InternalSql.g:4636:1: ( ( rule__PropertyOrRelationAttributeExpression__AttributeLookupAssignment_1 )? )
            {
            // InternalSql.g:4636:1: ( ( rule__PropertyOrRelationAttributeExpression__AttributeLookupAssignment_1 )? )
            // InternalSql.g:4637:2: ( rule__PropertyOrRelationAttributeExpression__AttributeLookupAssignment_1 )?
            {
             before(grammarAccess.getPropertyOrRelationAttributeExpressionAccess().getAttributeLookupAssignment_1()); 
            // InternalSql.g:4638:2: ( rule__PropertyOrRelationAttributeExpression__AttributeLookupAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==50) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSql.g:4638:3: rule__PropertyOrRelationAttributeExpression__AttributeLookupAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyOrRelationAttributeExpression__AttributeLookupAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyOrRelationAttributeExpressionAccess().getAttributeLookupAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyOrRelationAttributeExpression__Group__1__Impl"


    // $ANTLR start "rule__AttributeLookup__Group__0"
    // InternalSql.g:4647:1: rule__AttributeLookup__Group__0 : rule__AttributeLookup__Group__0__Impl rule__AttributeLookup__Group__1 ;
    public final void rule__AttributeLookup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4651:1: ( rule__AttributeLookup__Group__0__Impl rule__AttributeLookup__Group__1 )
            // InternalSql.g:4652:2: rule__AttributeLookup__Group__0__Impl rule__AttributeLookup__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__AttributeLookup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeLookup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeLookup__Group__0"


    // $ANTLR start "rule__AttributeLookup__Group__0__Impl"
    // InternalSql.g:4659:1: rule__AttributeLookup__Group__0__Impl : ( '.' ) ;
    public final void rule__AttributeLookup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4663:1: ( ( '.' ) )
            // InternalSql.g:4664:1: ( '.' )
            {
            // InternalSql.g:4664:1: ( '.' )
            // InternalSql.g:4665:2: '.'
            {
             before(grammarAccess.getAttributeLookupAccess().getFullStopKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAttributeLookupAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeLookup__Group__0__Impl"


    // $ANTLR start "rule__AttributeLookup__Group__1"
    // InternalSql.g:4674:1: rule__AttributeLookup__Group__1 : rule__AttributeLookup__Group__1__Impl ;
    public final void rule__AttributeLookup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4678:1: ( rule__AttributeLookup__Group__1__Impl )
            // InternalSql.g:4679:2: rule__AttributeLookup__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeLookup__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeLookup__Group__1"


    // $ANTLR start "rule__AttributeLookup__Group__1__Impl"
    // InternalSql.g:4685:1: rule__AttributeLookup__Group__1__Impl : ( ( rule__AttributeLookup__AttributeKeyNameAssignment_1 ) ) ;
    public final void rule__AttributeLookup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4689:1: ( ( ( rule__AttributeLookup__AttributeKeyNameAssignment_1 ) ) )
            // InternalSql.g:4690:1: ( ( rule__AttributeLookup__AttributeKeyNameAssignment_1 ) )
            {
            // InternalSql.g:4690:1: ( ( rule__AttributeLookup__AttributeKeyNameAssignment_1 ) )
            // InternalSql.g:4691:2: ( rule__AttributeLookup__AttributeKeyNameAssignment_1 )
            {
             before(grammarAccess.getAttributeLookupAccess().getAttributeKeyNameAssignment_1()); 
            // InternalSql.g:4692:2: ( rule__AttributeLookup__AttributeKeyNameAssignment_1 )
            // InternalSql.g:4692:3: rule__AttributeLookup__AttributeKeyNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeLookup__AttributeKeyNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeLookupAccess().getAttributeKeyNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeLookup__Group__1__Impl"


    // $ANTLR start "rule__Atom__Group_1__0"
    // InternalSql.g:4701:1: rule__Atom__Group_1__0 : rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 ;
    public final void rule__Atom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4705:1: ( rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 )
            // InternalSql.g:4706:2: rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1
            {
            pushFollow(FOLLOW_45);
            rule__Atom__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__0"


    // $ANTLR start "rule__Atom__Group_1__0__Impl"
    // InternalSql.g:4713:1: rule__Atom__Group_1__0__Impl : ( () ) ;
    public final void rule__Atom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4717:1: ( ( () ) )
            // InternalSql.g:4718:1: ( () )
            {
            // InternalSql.g:4718:1: ( () )
            // InternalSql.g:4719:2: ()
            {
             before(grammarAccess.getAtomAccess().getCountAction_1_0()); 
            // InternalSql.g:4720:2: ()
            // InternalSql.g:4720:3: 
            {
            }

             after(grammarAccess.getAtomAccess().getCountAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__0__Impl"


    // $ANTLR start "rule__Atom__Group_1__1"
    // InternalSql.g:4728:1: rule__Atom__Group_1__1 : rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 ;
    public final void rule__Atom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4732:1: ( rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 )
            // InternalSql.g:4733:2: rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2
            {
            pushFollow(FOLLOW_46);
            rule__Atom__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__1"


    // $ANTLR start "rule__Atom__Group_1__1__Impl"
    // InternalSql.g:4740:1: rule__Atom__Group_1__1__Impl : ( 'COUNT' ) ;
    public final void rule__Atom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4744:1: ( ( 'COUNT' ) )
            // InternalSql.g:4745:1: ( 'COUNT' )
            {
            // InternalSql.g:4745:1: ( 'COUNT' )
            // InternalSql.g:4746:2: 'COUNT'
            {
             before(grammarAccess.getAtomAccess().getCOUNTKeyword_1_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getCOUNTKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__1__Impl"


    // $ANTLR start "rule__Atom__Group_1__2"
    // InternalSql.g:4755:1: rule__Atom__Group_1__2 : rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3 ;
    public final void rule__Atom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4759:1: ( rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3 )
            // InternalSql.g:4760:2: rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3
            {
            pushFollow(FOLLOW_47);
            rule__Atom__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__2"


    // $ANTLR start "rule__Atom__Group_1__2__Impl"
    // InternalSql.g:4767:1: rule__Atom__Group_1__2__Impl : ( '(' ) ;
    public final void rule__Atom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4771:1: ( ( '(' ) )
            // InternalSql.g:4772:1: ( '(' )
            {
            // InternalSql.g:4772:1: ( '(' )
            // InternalSql.g:4773:2: '('
            {
             before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__2__Impl"


    // $ANTLR start "rule__Atom__Group_1__3"
    // InternalSql.g:4782:1: rule__Atom__Group_1__3 : rule__Atom__Group_1__3__Impl rule__Atom__Group_1__4 ;
    public final void rule__Atom__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4786:1: ( rule__Atom__Group_1__3__Impl rule__Atom__Group_1__4 )
            // InternalSql.g:4787:2: rule__Atom__Group_1__3__Impl rule__Atom__Group_1__4
            {
            pushFollow(FOLLOW_14);
            rule__Atom__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__3"


    // $ANTLR start "rule__Atom__Group_1__3__Impl"
    // InternalSql.g:4794:1: rule__Atom__Group_1__3__Impl : ( '*' ) ;
    public final void rule__Atom__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4798:1: ( ( '*' ) )
            // InternalSql.g:4799:1: ( '*' )
            {
            // InternalSql.g:4799:1: ( '*' )
            // InternalSql.g:4800:2: '*'
            {
             before(grammarAccess.getAtomAccess().getAsteriskKeyword_1_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getAsteriskKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__3__Impl"


    // $ANTLR start "rule__Atom__Group_1__4"
    // InternalSql.g:4809:1: rule__Atom__Group_1__4 : rule__Atom__Group_1__4__Impl ;
    public final void rule__Atom__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4813:1: ( rule__Atom__Group_1__4__Impl )
            // InternalSql.g:4814:2: rule__Atom__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__4"


    // $ANTLR start "rule__Atom__Group_1__4__Impl"
    // InternalSql.g:4820:1: rule__Atom__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Atom__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4824:1: ( ( ')' ) )
            // InternalSql.g:4825:1: ( ')' )
            {
            // InternalSql.g:4825:1: ( ')' )
            // InternalSql.g:4826:2: ')'
            {
             before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1__4__Impl"


    // $ANTLR start "rule__Atom__Group_2__0"
    // InternalSql.g:4836:1: rule__Atom__Group_2__0 : rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1 ;
    public final void rule__Atom__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4840:1: ( rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1 )
            // InternalSql.g:4841:2: rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Atom__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atom__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_2__0"


    // $ANTLR start "rule__Atom__Group_2__0__Impl"
    // InternalSql.g:4848:1: rule__Atom__Group_2__0__Impl : ( () ) ;
    public final void rule__Atom__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4852:1: ( ( () ) )
            // InternalSql.g:4853:1: ( () )
            {
            // InternalSql.g:4853:1: ( () )
            // InternalSql.g:4854:2: ()
            {
             before(grammarAccess.getAtomAccess().getVariableRefAction_2_0()); 
            // InternalSql.g:4855:2: ()
            // InternalSql.g:4855:3: 
            {
            }

             after(grammarAccess.getAtomAccess().getVariableRefAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_2__0__Impl"


    // $ANTLR start "rule__Atom__Group_2__1"
    // InternalSql.g:4863:1: rule__Atom__Group_2__1 : rule__Atom__Group_2__1__Impl ;
    public final void rule__Atom__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4867:1: ( rule__Atom__Group_2__1__Impl )
            // InternalSql.g:4868:2: rule__Atom__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atom__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_2__1"


    // $ANTLR start "rule__Atom__Group_2__1__Impl"
    // InternalSql.g:4874:1: rule__Atom__Group_2__1__Impl : ( ( rule__Atom__VariableRefAssignment_2_1 ) ) ;
    public final void rule__Atom__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4878:1: ( ( ( rule__Atom__VariableRefAssignment_2_1 ) ) )
            // InternalSql.g:4879:1: ( ( rule__Atom__VariableRefAssignment_2_1 ) )
            {
            // InternalSql.g:4879:1: ( ( rule__Atom__VariableRefAssignment_2_1 ) )
            // InternalSql.g:4880:2: ( rule__Atom__VariableRefAssignment_2_1 )
            {
             before(grammarAccess.getAtomAccess().getVariableRefAssignment_2_1()); 
            // InternalSql.g:4881:2: ( rule__Atom__VariableRefAssignment_2_1 )
            // InternalSql.g:4881:3: rule__Atom__VariableRefAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atom__VariableRefAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getVariableRefAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionInvocation__Group__0"
    // InternalSql.g:4890:1: rule__FunctionInvocation__Group__0 : rule__FunctionInvocation__Group__0__Impl rule__FunctionInvocation__Group__1 ;
    public final void rule__FunctionInvocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4894:1: ( rule__FunctionInvocation__Group__0__Impl rule__FunctionInvocation__Group__1 )
            // InternalSql.g:4895:2: rule__FunctionInvocation__Group__0__Impl rule__FunctionInvocation__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__FunctionInvocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionInvocation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group__0"


    // $ANTLR start "rule__FunctionInvocation__Group__0__Impl"
    // InternalSql.g:4902:1: rule__FunctionInvocation__Group__0__Impl : ( ( rule__FunctionInvocation__FunctionNameAssignment_0 ) ) ;
    public final void rule__FunctionInvocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4906:1: ( ( ( rule__FunctionInvocation__FunctionNameAssignment_0 ) ) )
            // InternalSql.g:4907:1: ( ( rule__FunctionInvocation__FunctionNameAssignment_0 ) )
            {
            // InternalSql.g:4907:1: ( ( rule__FunctionInvocation__FunctionNameAssignment_0 ) )
            // InternalSql.g:4908:2: ( rule__FunctionInvocation__FunctionNameAssignment_0 )
            {
             before(grammarAccess.getFunctionInvocationAccess().getFunctionNameAssignment_0()); 
            // InternalSql.g:4909:2: ( rule__FunctionInvocation__FunctionNameAssignment_0 )
            // InternalSql.g:4909:3: rule__FunctionInvocation__FunctionNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionInvocation__FunctionNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionInvocationAccess().getFunctionNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group__0__Impl"


    // $ANTLR start "rule__FunctionInvocation__Group__1"
    // InternalSql.g:4917:1: rule__FunctionInvocation__Group__1 : rule__FunctionInvocation__Group__1__Impl rule__FunctionInvocation__Group__2 ;
    public final void rule__FunctionInvocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4921:1: ( rule__FunctionInvocation__Group__1__Impl rule__FunctionInvocation__Group__2 )
            // InternalSql.g:4922:2: rule__FunctionInvocation__Group__1__Impl rule__FunctionInvocation__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__FunctionInvocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionInvocation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group__1"


    // $ANTLR start "rule__FunctionInvocation__Group__1__Impl"
    // InternalSql.g:4929:1: rule__FunctionInvocation__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionInvocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4933:1: ( ( '(' ) )
            // InternalSql.g:4934:1: ( '(' )
            {
            // InternalSql.g:4934:1: ( '(' )
            // InternalSql.g:4935:2: '('
            {
             before(grammarAccess.getFunctionInvocationAccess().getLeftParenthesisKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionInvocationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group__1__Impl"


    // $ANTLR start "rule__FunctionInvocation__Group__2"
    // InternalSql.g:4944:1: rule__FunctionInvocation__Group__2 : rule__FunctionInvocation__Group__2__Impl rule__FunctionInvocation__Group__3 ;
    public final void rule__FunctionInvocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4948:1: ( rule__FunctionInvocation__Group__2__Impl rule__FunctionInvocation__Group__3 )
            // InternalSql.g:4949:2: rule__FunctionInvocation__Group__2__Impl rule__FunctionInvocation__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__FunctionInvocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionInvocation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group__2"


    // $ANTLR start "rule__FunctionInvocation__Group__2__Impl"
    // InternalSql.g:4956:1: rule__FunctionInvocation__Group__2__Impl : ( ( rule__FunctionInvocation__Group_2__0 )? ) ;
    public final void rule__FunctionInvocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4960:1: ( ( ( rule__FunctionInvocation__Group_2__0 )? ) )
            // InternalSql.g:4961:1: ( ( rule__FunctionInvocation__Group_2__0 )? )
            {
            // InternalSql.g:4961:1: ( ( rule__FunctionInvocation__Group_2__0 )? )
            // InternalSql.g:4962:2: ( rule__FunctionInvocation__Group_2__0 )?
            {
             before(grammarAccess.getFunctionInvocationAccess().getGroup_2()); 
            // InternalSql.g:4963:2: ( rule__FunctionInvocation__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STRING_LITERAL)||(LA38_0>=14 && LA38_0<=15)||(LA38_0>=22 && LA38_0<=23)||LA38_0==38||LA38_0==51) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSql.g:4963:3: rule__FunctionInvocation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FunctionInvocation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionInvocationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group__2__Impl"


    // $ANTLR start "rule__FunctionInvocation__Group__3"
    // InternalSql.g:4971:1: rule__FunctionInvocation__Group__3 : rule__FunctionInvocation__Group__3__Impl ;
    public final void rule__FunctionInvocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4975:1: ( rule__FunctionInvocation__Group__3__Impl )
            // InternalSql.g:4976:2: rule__FunctionInvocation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionInvocation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group__3"


    // $ANTLR start "rule__FunctionInvocation__Group__3__Impl"
    // InternalSql.g:4982:1: rule__FunctionInvocation__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionInvocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:4986:1: ( ( ')' ) )
            // InternalSql.g:4987:1: ( ')' )
            {
            // InternalSql.g:4987:1: ( ')' )
            // InternalSql.g:4988:2: ')'
            {
             before(grammarAccess.getFunctionInvocationAccess().getRightParenthesisKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFunctionInvocationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group__3__Impl"


    // $ANTLR start "rule__FunctionInvocation__Group_2__0"
    // InternalSql.g:4998:1: rule__FunctionInvocation__Group_2__0 : rule__FunctionInvocation__Group_2__0__Impl rule__FunctionInvocation__Group_2__1 ;
    public final void rule__FunctionInvocation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5002:1: ( rule__FunctionInvocation__Group_2__0__Impl rule__FunctionInvocation__Group_2__1 )
            // InternalSql.g:5003:2: rule__FunctionInvocation__Group_2__0__Impl rule__FunctionInvocation__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__FunctionInvocation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionInvocation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group_2__0"


    // $ANTLR start "rule__FunctionInvocation__Group_2__0__Impl"
    // InternalSql.g:5010:1: rule__FunctionInvocation__Group_2__0__Impl : ( ( rule__FunctionInvocation__ParameterAssignment_2_0 ) ) ;
    public final void rule__FunctionInvocation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5014:1: ( ( ( rule__FunctionInvocation__ParameterAssignment_2_0 ) ) )
            // InternalSql.g:5015:1: ( ( rule__FunctionInvocation__ParameterAssignment_2_0 ) )
            {
            // InternalSql.g:5015:1: ( ( rule__FunctionInvocation__ParameterAssignment_2_0 ) )
            // InternalSql.g:5016:2: ( rule__FunctionInvocation__ParameterAssignment_2_0 )
            {
             before(grammarAccess.getFunctionInvocationAccess().getParameterAssignment_2_0()); 
            // InternalSql.g:5017:2: ( rule__FunctionInvocation__ParameterAssignment_2_0 )
            // InternalSql.g:5017:3: rule__FunctionInvocation__ParameterAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__FunctionInvocation__ParameterAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionInvocationAccess().getParameterAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group_2__0__Impl"


    // $ANTLR start "rule__FunctionInvocation__Group_2__1"
    // InternalSql.g:5025:1: rule__FunctionInvocation__Group_2__1 : rule__FunctionInvocation__Group_2__1__Impl ;
    public final void rule__FunctionInvocation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5029:1: ( rule__FunctionInvocation__Group_2__1__Impl )
            // InternalSql.g:5030:2: rule__FunctionInvocation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionInvocation__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group_2__1"


    // $ANTLR start "rule__FunctionInvocation__Group_2__1__Impl"
    // InternalSql.g:5036:1: rule__FunctionInvocation__Group_2__1__Impl : ( ( rule__FunctionInvocation__Group_2_1__0 )* ) ;
    public final void rule__FunctionInvocation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5040:1: ( ( ( rule__FunctionInvocation__Group_2_1__0 )* ) )
            // InternalSql.g:5041:1: ( ( rule__FunctionInvocation__Group_2_1__0 )* )
            {
            // InternalSql.g:5041:1: ( ( rule__FunctionInvocation__Group_2_1__0 )* )
            // InternalSql.g:5042:2: ( rule__FunctionInvocation__Group_2_1__0 )*
            {
             before(grammarAccess.getFunctionInvocationAccess().getGroup_2_1()); 
            // InternalSql.g:5043:2: ( rule__FunctionInvocation__Group_2_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==29) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalSql.g:5043:3: rule__FunctionInvocation__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__FunctionInvocation__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getFunctionInvocationAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group_2__1__Impl"


    // $ANTLR start "rule__FunctionInvocation__Group_2_1__0"
    // InternalSql.g:5052:1: rule__FunctionInvocation__Group_2_1__0 : rule__FunctionInvocation__Group_2_1__0__Impl rule__FunctionInvocation__Group_2_1__1 ;
    public final void rule__FunctionInvocation__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5056:1: ( rule__FunctionInvocation__Group_2_1__0__Impl rule__FunctionInvocation__Group_2_1__1 )
            // InternalSql.g:5057:2: rule__FunctionInvocation__Group_2_1__0__Impl rule__FunctionInvocation__Group_2_1__1
            {
            pushFollow(FOLLOW_5);
            rule__FunctionInvocation__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FunctionInvocation__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group_2_1__0"


    // $ANTLR start "rule__FunctionInvocation__Group_2_1__0__Impl"
    // InternalSql.g:5064:1: rule__FunctionInvocation__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionInvocation__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5068:1: ( ( ',' ) )
            // InternalSql.g:5069:1: ( ',' )
            {
            // InternalSql.g:5069:1: ( ',' )
            // InternalSql.g:5070:2: ','
            {
             before(grammarAccess.getFunctionInvocationAccess().getCommaKeyword_2_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFunctionInvocationAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group_2_1__0__Impl"


    // $ANTLR start "rule__FunctionInvocation__Group_2_1__1"
    // InternalSql.g:5079:1: rule__FunctionInvocation__Group_2_1__1 : rule__FunctionInvocation__Group_2_1__1__Impl ;
    public final void rule__FunctionInvocation__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5083:1: ( rule__FunctionInvocation__Group_2_1__1__Impl )
            // InternalSql.g:5084:2: rule__FunctionInvocation__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FunctionInvocation__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group_2_1__1"


    // $ANTLR start "rule__FunctionInvocation__Group_2_1__1__Impl"
    // InternalSql.g:5090:1: rule__FunctionInvocation__Group_2_1__1__Impl : ( ( rule__FunctionInvocation__ParameterAssignment_2_1_1 ) ) ;
    public final void rule__FunctionInvocation__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5094:1: ( ( ( rule__FunctionInvocation__ParameterAssignment_2_1_1 ) ) )
            // InternalSql.g:5095:1: ( ( rule__FunctionInvocation__ParameterAssignment_2_1_1 ) )
            {
            // InternalSql.g:5095:1: ( ( rule__FunctionInvocation__ParameterAssignment_2_1_1 ) )
            // InternalSql.g:5096:2: ( rule__FunctionInvocation__ParameterAssignment_2_1_1 )
            {
             before(grammarAccess.getFunctionInvocationAccess().getParameterAssignment_2_1_1()); 
            // InternalSql.g:5097:2: ( rule__FunctionInvocation__ParameterAssignment_2_1_1 )
            // InternalSql.g:5097:3: rule__FunctionInvocation__ParameterAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FunctionInvocation__ParameterAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionInvocationAccess().getParameterAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__Group_2_1__1__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__0"
    // InternalSql.g:5106:1: rule__BooleanLiteral__Group__0 : rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 ;
    public final void rule__BooleanLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5110:1: ( rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1 )
            // InternalSql.g:5111:2: rule__BooleanLiteral__Group__0__Impl rule__BooleanLiteral__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__BooleanLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__0"


    // $ANTLR start "rule__BooleanLiteral__Group__0__Impl"
    // InternalSql.g:5118:1: rule__BooleanLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BooleanLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5122:1: ( ( () ) )
            // InternalSql.g:5123:1: ( () )
            {
            // InternalSql.g:5123:1: ( () )
            // InternalSql.g:5124:2: ()
            {
             before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 
            // InternalSql.g:5125:2: ()
            // InternalSql.g:5125:3: 
            {
            }

             after(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__0__Impl"


    // $ANTLR start "rule__BooleanLiteral__Group__1"
    // InternalSql.g:5133:1: rule__BooleanLiteral__Group__1 : rule__BooleanLiteral__Group__1__Impl ;
    public final void rule__BooleanLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5137:1: ( rule__BooleanLiteral__Group__1__Impl )
            // InternalSql.g:5138:2: rule__BooleanLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__1"


    // $ANTLR start "rule__BooleanLiteral__Group__1__Impl"
    // InternalSql.g:5144:1: rule__BooleanLiteral__Group__1__Impl : ( ( rule__BooleanLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BooleanLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5148:1: ( ( ( rule__BooleanLiteral__ValueAssignment_1 ) ) )
            // InternalSql.g:5149:1: ( ( rule__BooleanLiteral__ValueAssignment_1 ) )
            {
            // InternalSql.g:5149:1: ( ( rule__BooleanLiteral__ValueAssignment_1 ) )
            // InternalSql.g:5150:2: ( rule__BooleanLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1()); 
            // InternalSql.g:5151:2: ( rule__BooleanLiteral__ValueAssignment_1 )
            // InternalSql.g:5151:3: rule__BooleanLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__Group__1__Impl"


    // $ANTLR start "rule__Number__Group_1__0"
    // InternalSql.g:5160:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5164:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // InternalSql.g:5165:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FOLLOW_44);
            rule__Number__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__0"


    // $ANTLR start "rule__Number__Group_1__0__Impl"
    // InternalSql.g:5172:1: rule__Number__Group_1__0__Impl : ( ( rule__Number__Alternatives_1_0 ) ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5176:1: ( ( ( rule__Number__Alternatives_1_0 ) ) )
            // InternalSql.g:5177:1: ( ( rule__Number__Alternatives_1_0 ) )
            {
            // InternalSql.g:5177:1: ( ( rule__Number__Alternatives_1_0 ) )
            // InternalSql.g:5178:2: ( rule__Number__Alternatives_1_0 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1_0()); 
            // InternalSql.g:5179:2: ( rule__Number__Alternatives_1_0 )
            // InternalSql.g:5179:3: rule__Number__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__0__Impl"


    // $ANTLR start "rule__Number__Group_1__1"
    // InternalSql.g:5187:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5191:1: ( rule__Number__Group_1__1__Impl )
            // InternalSql.g:5192:2: rule__Number__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__1"


    // $ANTLR start "rule__Number__Group_1__1__Impl"
    // InternalSql.g:5198:1: rule__Number__Group_1__1__Impl : ( ( rule__Number__Group_1_1__0 )? ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5202:1: ( ( ( rule__Number__Group_1_1__0 )? ) )
            // InternalSql.g:5203:1: ( ( rule__Number__Group_1_1__0 )? )
            {
            // InternalSql.g:5203:1: ( ( rule__Number__Group_1_1__0 )? )
            // InternalSql.g:5204:2: ( rule__Number__Group_1_1__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_1_1()); 
            // InternalSql.g:5205:2: ( rule__Number__Group_1_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                int LA40_1 = input.LA(2);

                if ( ((LA40_1>=RULE_INT && LA40_1<=RULE_DECIMAL)) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalSql.g:5205:3: rule__Number__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__1__Impl"


    // $ANTLR start "rule__Number__Group_1_1__0"
    // InternalSql.g:5214:1: rule__Number__Group_1_1__0 : rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1 ;
    public final void rule__Number__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5218:1: ( rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1 )
            // InternalSql.g:5219:2: rule__Number__Group_1_1__0__Impl rule__Number__Group_1_1__1
            {
            pushFollow(FOLLOW_50);
            rule__Number__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1_1__0"


    // $ANTLR start "rule__Number__Group_1_1__0__Impl"
    // InternalSql.g:5226:1: rule__Number__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5230:1: ( ( '.' ) )
            // InternalSql.g:5231:1: ( '.' )
            {
            // InternalSql.g:5231:1: ( '.' )
            // InternalSql.g:5232:2: '.'
            {
             before(grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1_1__0__Impl"


    // $ANTLR start "rule__Number__Group_1_1__1"
    // InternalSql.g:5241:1: rule__Number__Group_1_1__1 : rule__Number__Group_1_1__1__Impl ;
    public final void rule__Number__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5245:1: ( rule__Number__Group_1_1__1__Impl )
            // InternalSql.g:5246:2: rule__Number__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1_1__1"


    // $ANTLR start "rule__Number__Group_1_1__1__Impl"
    // InternalSql.g:5252:1: rule__Number__Group_1_1__1__Impl : ( ( rule__Number__Alternatives_1_1_1 ) ) ;
    public final void rule__Number__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5256:1: ( ( ( rule__Number__Alternatives_1_1_1 ) ) )
            // InternalSql.g:5257:1: ( ( rule__Number__Alternatives_1_1_1 ) )
            {
            // InternalSql.g:5257:1: ( ( rule__Number__Alternatives_1_1_1 ) )
            // InternalSql.g:5258:2: ( rule__Number__Alternatives_1_1_1 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1_1_1()); 
            // InternalSql.g:5259:2: ( rule__Number__Alternatives_1_1_1 )
            // InternalSql.g:5259:3: rule__Number__Alternatives_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Number__Alternatives_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1_1__1__Impl"


    // $ANTLR start "rule__Model__QueriesAssignment"
    // InternalSql.g:5268:1: rule__Model__QueriesAssignment : ( ruleQuery ) ;
    public final void rule__Model__QueriesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5272:1: ( ( ruleQuery ) )
            // InternalSql.g:5273:2: ( ruleQuery )
            {
            // InternalSql.g:5273:2: ( ruleQuery )
            // InternalSql.g:5274:3: ruleQuery
            {
             before(grammarAccess.getModelAccess().getQueriesQueryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getModelAccess().getQueriesQueryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__QueriesAssignment"


    // $ANTLR start "rule__Query__SelectClauseAssignment_0"
    // InternalSql.g:5283:1: rule__Query__SelectClauseAssignment_0 : ( ruleSelectSection ) ;
    public final void rule__Query__SelectClauseAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5287:1: ( ( ruleSelectSection ) )
            // InternalSql.g:5288:2: ( ruleSelectSection )
            {
            // InternalSql.g:5288:2: ( ruleSelectSection )
            // InternalSql.g:5289:3: ruleSelectSection
            {
             before(grammarAccess.getQueryAccess().getSelectClauseSelectSectionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectSection();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getSelectClauseSelectSectionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__SelectClauseAssignment_0"


    // $ANTLR start "rule__Query__FromClauseAssignment_1"
    // InternalSql.g:5298:1: rule__Query__FromClauseAssignment_1 : ( rulefromSection ) ;
    public final void rule__Query__FromClauseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5302:1: ( ( rulefromSection ) )
            // InternalSql.g:5303:2: ( rulefromSection )
            {
            // InternalSql.g:5303:2: ( rulefromSection )
            // InternalSql.g:5304:3: rulefromSection
            {
             before(grammarAccess.getQueryAccess().getFromClauseFromSectionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulefromSection();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getFromClauseFromSectionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__FromClauseAssignment_1"


    // $ANTLR start "rule__Query__WhereClauseAssignment_2"
    // InternalSql.g:5313:1: rule__Query__WhereClauseAssignment_2 : ( ruleWhereClause ) ;
    public final void rule__Query__WhereClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5317:1: ( ( ruleWhereClause ) )
            // InternalSql.g:5318:2: ( ruleWhereClause )
            {
            // InternalSql.g:5318:2: ( ruleWhereClause )
            // InternalSql.g:5319:3: ruleWhereClause
            {
             before(grammarAccess.getQueryAccess().getWhereClauseWhereClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereClause();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getWhereClauseWhereClauseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__WhereClauseAssignment_2"


    // $ANTLR start "rule__Query__GroupClauseAssignment_3"
    // InternalSql.g:5328:1: rule__Query__GroupClauseAssignment_3 : ( ruleGroupClause ) ;
    public final void rule__Query__GroupClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5332:1: ( ( ruleGroupClause ) )
            // InternalSql.g:5333:2: ( ruleGroupClause )
            {
            // InternalSql.g:5333:2: ( ruleGroupClause )
            // InternalSql.g:5334:3: ruleGroupClause
            {
             before(grammarAccess.getQueryAccess().getGroupClauseGroupClauseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupClause();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getGroupClauseGroupClauseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__GroupClauseAssignment_3"


    // $ANTLR start "rule__Query__HavingClauseAssignment_4"
    // InternalSql.g:5343:1: rule__Query__HavingClauseAssignment_4 : ( ruleHavingClause ) ;
    public final void rule__Query__HavingClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5347:1: ( ( ruleHavingClause ) )
            // InternalSql.g:5348:2: ( ruleHavingClause )
            {
            // InternalSql.g:5348:2: ( ruleHavingClause )
            // InternalSql.g:5349:3: ruleHavingClause
            {
             before(grammarAccess.getQueryAccess().getHavingClauseHavingClauseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleHavingClause();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getHavingClauseHavingClauseParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__HavingClauseAssignment_4"


    // $ANTLR start "rule__SelectSection__ExpressionsAssignment_1"
    // InternalSql.g:5358:1: rule__SelectSection__ExpressionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__SelectSection__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5362:1: ( ( ruleExpression ) )
            // InternalSql.g:5363:2: ( ruleExpression )
            {
            // InternalSql.g:5363:2: ( ruleExpression )
            // InternalSql.g:5364:3: ruleExpression
            {
             before(grammarAccess.getSelectSectionAccess().getExpressionsExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSelectSectionAccess().getExpressionsExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectSection__ExpressionsAssignment_1"


    // $ANTLR start "rule__SelectSection__ExpressionsAssignment_2_1"
    // InternalSql.g:5373:1: rule__SelectSection__ExpressionsAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__SelectSection__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5377:1: ( ( ruleExpression ) )
            // InternalSql.g:5378:2: ( ruleExpression )
            {
            // InternalSql.g:5378:2: ( ruleExpression )
            // InternalSql.g:5379:3: ruleExpression
            {
             before(grammarAccess.getSelectSectionAccess().getExpressionsExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSelectSectionAccess().getExpressionsExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectSection__ExpressionsAssignment_2_1"


    // $ANTLR start "rule__FromSection__FromItemAssignment_1"
    // InternalSql.g:5388:1: rule__FromSection__FromItemAssignment_1 : ( ruleFromItem ) ;
    public final void rule__FromSection__FromItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5392:1: ( ( ruleFromItem ) )
            // InternalSql.g:5393:2: ( ruleFromItem )
            {
            // InternalSql.g:5393:2: ( ruleFromItem )
            // InternalSql.g:5394:3: ruleFromItem
            {
             before(grammarAccess.getFromSectionAccess().getFromItemFromItemParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFromItem();

            state._fsp--;

             after(grammarAccess.getFromSectionAccess().getFromItemFromItemParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromSection__FromItemAssignment_1"


    // $ANTLR start "rule__FromItem__TblAssignment_0_0"
    // InternalSql.g:5403:1: rule__FromItem__TblAssignment_0_0 : ( ruleTable ) ;
    public final void rule__FromItem__TblAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5407:1: ( ( ruleTable ) )
            // InternalSql.g:5408:2: ( ruleTable )
            {
            // InternalSql.g:5408:2: ( ruleTable )
            // InternalSql.g:5409:3: ruleTable
            {
             before(grammarAccess.getFromItemAccess().getTblTableParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getFromItemAccess().getTblTableParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__TblAssignment_0_0"


    // $ANTLR start "rule__FromItem__TblAssignment_0_1_1"
    // InternalSql.g:5418:1: rule__FromItem__TblAssignment_0_1_1 : ( ruleTable ) ;
    public final void rule__FromItem__TblAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5422:1: ( ( ruleTable ) )
            // InternalSql.g:5423:2: ( ruleTable )
            {
            // InternalSql.g:5423:2: ( ruleTable )
            // InternalSql.g:5424:3: ruleTable
            {
             before(grammarAccess.getFromItemAccess().getTblTableParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getFromItemAccess().getTblTableParserRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__TblAssignment_0_1_1"


    // $ANTLR start "rule__FromItem__ExpressionsAssignment_0_1_3"
    // InternalSql.g:5433:1: rule__FromItem__ExpressionsAssignment_0_1_3 : ( ruleExpression ) ;
    public final void rule__FromItem__ExpressionsAssignment_0_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5437:1: ( ( ruleExpression ) )
            // InternalSql.g:5438:2: ( ruleExpression )
            {
            // InternalSql.g:5438:2: ( ruleExpression )
            // InternalSql.g:5439:3: ruleExpression
            {
             before(grammarAccess.getFromItemAccess().getExpressionsExpressionParserRuleCall_0_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFromItemAccess().getExpressionsExpressionParserRuleCall_0_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__ExpressionsAssignment_0_1_3"


    // $ANTLR start "rule__FromItem__Select_exprAssignment_1_1"
    // InternalSql.g:5448:1: rule__FromItem__Select_exprAssignment_1_1 : ( ruleSelectSection ) ;
    public final void rule__FromItem__Select_exprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5452:1: ( ( ruleSelectSection ) )
            // InternalSql.g:5453:2: ( ruleSelectSection )
            {
            // InternalSql.g:5453:2: ( ruleSelectSection )
            // InternalSql.g:5454:3: ruleSelectSection
            {
             before(grammarAccess.getFromItemAccess().getSelect_exprSelectSectionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectSection();

            state._fsp--;

             after(grammarAccess.getFromItemAccess().getSelect_exprSelectSectionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromItem__Select_exprAssignment_1_1"


    // $ANTLR start "rule__Table__NameAssignment"
    // InternalSql.g:5463:1: rule__Table__NameAssignment : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5467:1: ( ( RULE_ID ) )
            // InternalSql.g:5468:2: ( RULE_ID )
            {
            // InternalSql.g:5468:2: ( RULE_ID )
            // InternalSql.g:5469:3: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment"


    // $ANTLR start "rule__WhereClause__ExpressionAssignment_1"
    // InternalSql.g:5478:1: rule__WhereClause__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__WhereClause__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5482:1: ( ( ruleExpression ) )
            // InternalSql.g:5483:2: ( ruleExpression )
            {
            // InternalSql.g:5483:2: ( ruleExpression )
            // InternalSql.g:5484:3: ruleExpression
            {
             before(grammarAccess.getWhereClauseAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhereClauseAccess().getExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__ExpressionAssignment_1"


    // $ANTLR start "rule__BoolExpression__LhsAssignment_0"
    // InternalSql.g:5493:1: rule__BoolExpression__LhsAssignment_0 : ( ruleTerm ) ;
    public final void rule__BoolExpression__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5497:1: ( ( ruleTerm ) )
            // InternalSql.g:5498:2: ( ruleTerm )
            {
            // InternalSql.g:5498:2: ( ruleTerm )
            // InternalSql.g:5499:3: ruleTerm
            {
             before(grammarAccess.getBoolExpressionAccess().getLhsTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getBoolExpressionAccess().getLhsTermParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpression__LhsAssignment_0"


    // $ANTLR start "rule__BoolExpression__RhsAssignment_1_1"
    // InternalSql.g:5508:1: rule__BoolExpression__RhsAssignment_1_1 : ( ruleTerm ) ;
    public final void rule__BoolExpression__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5512:1: ( ( ruleTerm ) )
            // InternalSql.g:5513:2: ( ruleTerm )
            {
            // InternalSql.g:5513:2: ( ruleTerm )
            // InternalSql.g:5514:3: ruleTerm
            {
             before(grammarAccess.getBoolExpressionAccess().getRhsTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;

             after(grammarAccess.getBoolExpressionAccess().getRhsTermParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolExpression__RhsAssignment_1_1"


    // $ANTLR start "rule__Term__LhsAssignment_0"
    // InternalSql.g:5523:1: rule__Term__LhsAssignment_0 : ( ruleFactor ) ;
    public final void rule__Term__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5527:1: ( ( ruleFactor ) )
            // InternalSql.g:5528:2: ( ruleFactor )
            {
            // InternalSql.g:5528:2: ( ruleFactor )
            // InternalSql.g:5529:3: ruleFactor
            {
             before(grammarAccess.getTermAccess().getLhsFactorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getLhsFactorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__LhsAssignment_0"


    // $ANTLR start "rule__Term__RhsAssignment_1_1"
    // InternalSql.g:5538:1: rule__Term__RhsAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Term__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5542:1: ( ( ruleFactor ) )
            // InternalSql.g:5543:2: ( ruleFactor )
            {
            // InternalSql.g:5543:2: ( ruleFactor )
            // InternalSql.g:5544:3: ruleFactor
            {
             before(grammarAccess.getTermAccess().getRhsFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getTermAccess().getRhsFactorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__RhsAssignment_1_1"


    // $ANTLR start "rule__Factor__FactorAssignment_0_1"
    // InternalSql.g:5553:1: rule__Factor__FactorAssignment_0_1 : ( ruleFactor ) ;
    public final void rule__Factor__FactorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5557:1: ( ( ruleFactor ) )
            // InternalSql.g:5558:2: ( ruleFactor )
            {
            // InternalSql.g:5558:2: ( ruleFactor )
            // InternalSql.g:5559:3: ruleFactor
            {
             before(grammarAccess.getFactorAccess().getFactorFactorParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getFactorFactorParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__FactorAssignment_0_1"


    // $ANTLR start "rule__Factor__ExprAssignment_1_1"
    // InternalSql.g:5568:1: rule__Factor__ExprAssignment_1_1 : ( ruleBoolExpression ) ;
    public final void rule__Factor__ExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5572:1: ( ( ruleBoolExpression ) )
            // InternalSql.g:5573:2: ( ruleBoolExpression )
            {
            // InternalSql.g:5573:2: ( ruleBoolExpression )
            // InternalSql.g:5574:3: ruleBoolExpression
            {
             before(grammarAccess.getFactorAccess().getExprBoolExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolExpression();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getExprBoolExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__ExprAssignment_1_1"


    // $ANTLR start "rule__Factor__BinexpAssignment_4"
    // InternalSql.g:5583:1: rule__Factor__BinexpAssignment_4 : ( ruleBinary ) ;
    public final void rule__Factor__BinexpAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5587:1: ( ( ruleBinary ) )
            // InternalSql.g:5588:2: ( ruleBinary )
            {
            // InternalSql.g:5588:2: ( ruleBinary )
            // InternalSql.g:5589:3: ruleBinary
            {
             before(grammarAccess.getFactorAccess().getBinexpBinaryParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleBinary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getBinexpBinaryParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__BinexpAssignment_4"


    // $ANTLR start "rule__Binary__LhsAssignment_0"
    // InternalSql.g:5598:1: rule__Binary__LhsAssignment_0 : ( rulePropertyOrRelationAttributeExpression ) ;
    public final void rule__Binary__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5602:1: ( ( rulePropertyOrRelationAttributeExpression ) )
            // InternalSql.g:5603:2: ( rulePropertyOrRelationAttributeExpression )
            {
            // InternalSql.g:5603:2: ( rulePropertyOrRelationAttributeExpression )
            // InternalSql.g:5604:3: rulePropertyOrRelationAttributeExpression
            {
             before(grammarAccess.getBinaryAccess().getLhsPropertyOrRelationAttributeExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyOrRelationAttributeExpression();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getLhsPropertyOrRelationAttributeExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__LhsAssignment_0"


    // $ANTLR start "rule__Binary__RhsAssignment_2"
    // InternalSql.g:5613:1: rule__Binary__RhsAssignment_2 : ( rulePropertyOrRelationAttributeExpression ) ;
    public final void rule__Binary__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5617:1: ( ( rulePropertyOrRelationAttributeExpression ) )
            // InternalSql.g:5618:2: ( rulePropertyOrRelationAttributeExpression )
            {
            // InternalSql.g:5618:2: ( rulePropertyOrRelationAttributeExpression )
            // InternalSql.g:5619:3: rulePropertyOrRelationAttributeExpression
            {
             before(grammarAccess.getBinaryAccess().getRhsPropertyOrRelationAttributeExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyOrRelationAttributeExpression();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getRhsPropertyOrRelationAttributeExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binary__RhsAssignment_2"


    // $ANTLR start "rule__GroupClause__ExpressionsAssignment_2"
    // InternalSql.g:5628:1: rule__GroupClause__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__GroupClause__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5632:1: ( ( ruleExpression ) )
            // InternalSql.g:5633:2: ( ruleExpression )
            {
            // InternalSql.g:5633:2: ( ruleExpression )
            // InternalSql.g:5634:3: ruleExpression
            {
             before(grammarAccess.getGroupClauseAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGroupClauseAccess().getExpressionsExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__ExpressionsAssignment_2"


    // $ANTLR start "rule__GroupClause__ExpressionsAssignment_3_1"
    // InternalSql.g:5643:1: rule__GroupClause__ExpressionsAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__GroupClause__ExpressionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5647:1: ( ( ruleExpression ) )
            // InternalSql.g:5648:2: ( ruleExpression )
            {
            // InternalSql.g:5648:2: ( ruleExpression )
            // InternalSql.g:5649:3: ruleExpression
            {
             before(grammarAccess.getGroupClauseAccess().getExpressionsExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getGroupClauseAccess().getExpressionsExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupClause__ExpressionsAssignment_3_1"


    // $ANTLR start "rule__HavingClause__ExprAssignment_1"
    // InternalSql.g:5658:1: rule__HavingClause__ExprAssignment_1 : ( ruleBoolExpression ) ;
    public final void rule__HavingClause__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5662:1: ( ( ruleBoolExpression ) )
            // InternalSql.g:5663:2: ( ruleBoolExpression )
            {
            // InternalSql.g:5663:2: ( ruleBoolExpression )
            // InternalSql.g:5664:3: ruleBoolExpression
            {
             before(grammarAccess.getHavingClauseAccess().getExprBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolExpression();

            state._fsp--;

             after(grammarAccess.getHavingClauseAccess().getExprBoolExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HavingClause__ExprAssignment_1"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // InternalSql.g:5673:1: rule__OrExpression__OperatorAssignment_1_1 : ( ( 'OR' ) ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5677:1: ( ( ( 'OR' ) ) )
            // InternalSql.g:5678:2: ( ( 'OR' ) )
            {
            // InternalSql.g:5678:2: ( ( 'OR' ) )
            // InternalSql.g:5679:3: ( 'OR' )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorORKeyword_1_1_0()); 
            // InternalSql.g:5680:3: ( 'OR' )
            // InternalSql.g:5681:4: 'OR'
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorORKeyword_1_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getOrExpressionAccess().getOperatorORKeyword_1_1_0()); 

            }

             after(grammarAccess.getOrExpressionAccess().getOperatorORKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__OrExpression__RightAssignment_1_2"
    // InternalSql.g:5692:1: rule__OrExpression__RightAssignment_1_2 : ( ruleXorExpression ) ;
    public final void rule__OrExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5696:1: ( ( ruleXorExpression ) )
            // InternalSql.g:5697:2: ( ruleXorExpression )
            {
            // InternalSql.g:5697:2: ( ruleXorExpression )
            // InternalSql.g:5698:3: ruleXorExpression
            {
             before(grammarAccess.getOrExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleXorExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__RightAssignment_1_2"


    // $ANTLR start "rule__XorExpression__OperatorAssignment_1_1"
    // InternalSql.g:5707:1: rule__XorExpression__OperatorAssignment_1_1 : ( ( 'XOR' ) ) ;
    public final void rule__XorExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5711:1: ( ( ( 'XOR' ) ) )
            // InternalSql.g:5712:2: ( ( 'XOR' ) )
            {
            // InternalSql.g:5712:2: ( ( 'XOR' ) )
            // InternalSql.g:5713:3: ( 'XOR' )
            {
             before(grammarAccess.getXorExpressionAccess().getOperatorXORKeyword_1_1_0()); 
            // InternalSql.g:5714:3: ( 'XOR' )
            // InternalSql.g:5715:4: 'XOR'
            {
             before(grammarAccess.getXorExpressionAccess().getOperatorXORKeyword_1_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getXorExpressionAccess().getOperatorXORKeyword_1_1_0()); 

            }

             after(grammarAccess.getXorExpressionAccess().getOperatorXORKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__XorExpression__RightAssignment_1_2"
    // InternalSql.g:5726:1: rule__XorExpression__RightAssignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__XorExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5730:1: ( ( ruleAndExpression ) )
            // InternalSql.g:5731:2: ( ruleAndExpression )
            {
            // InternalSql.g:5731:2: ( ruleAndExpression )
            // InternalSql.g:5732:3: ruleAndExpression
            {
             before(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpression__OperatorAssignment_1_1"
    // InternalSql.g:5741:1: rule__AndExpression__OperatorAssignment_1_1 : ( ( 'AND' ) ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5745:1: ( ( ( 'AND' ) ) )
            // InternalSql.g:5746:2: ( ( 'AND' ) )
            {
            // InternalSql.g:5746:2: ( ( 'AND' ) )
            // InternalSql.g:5747:3: ( 'AND' )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorANDKeyword_1_1_0()); 
            // InternalSql.g:5748:3: ( 'AND' )
            // InternalSql.g:5749:4: 'AND'
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorANDKeyword_1_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAndExpressionAccess().getOperatorANDKeyword_1_1_0()); 

            }

             after(grammarAccess.getAndExpressionAccess().getOperatorANDKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AndExpression__RightAssignment_1_2"
    // InternalSql.g:5760:1: rule__AndExpression__RightAssignment_1_2 : ( ruleNotExpression ) ;
    public final void rule__AndExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5764:1: ( ( ruleNotExpression ) )
            // InternalSql.g:5765:2: ( ruleNotExpression )
            {
            // InternalSql.g:5765:2: ( ruleNotExpression )
            // InternalSql.g:5766:3: ruleNotExpression
            {
             before(grammarAccess.getAndExpressionAccess().getRightNotExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNotExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getRightNotExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__RightAssignment_1_2"


    // $ANTLR start "rule__NotExpression__OperatorAssignment_0_1"
    // InternalSql.g:5775:1: rule__NotExpression__OperatorAssignment_0_1 : ( ( 'NOT' ) ) ;
    public final void rule__NotExpression__OperatorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5779:1: ( ( ( 'NOT' ) ) )
            // InternalSql.g:5780:2: ( ( 'NOT' ) )
            {
            // InternalSql.g:5780:2: ( ( 'NOT' ) )
            // InternalSql.g:5781:3: ( 'NOT' )
            {
             before(grammarAccess.getNotExpressionAccess().getOperatorNOTKeyword_0_1_0()); 
            // InternalSql.g:5782:3: ( 'NOT' )
            // InternalSql.g:5783:4: 'NOT'
            {
             before(grammarAccess.getNotExpressionAccess().getOperatorNOTKeyword_0_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNotExpressionAccess().getOperatorNOTKeyword_0_1_0()); 

            }

             after(grammarAccess.getNotExpressionAccess().getOperatorNOTKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__OperatorAssignment_0_1"


    // $ANTLR start "rule__NotExpression__LeftAssignment_0_2"
    // InternalSql.g:5794:1: rule__NotExpression__LeftAssignment_0_2 : ( ruleNotExpression ) ;
    public final void rule__NotExpression__LeftAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5798:1: ( ( ruleNotExpression ) )
            // InternalSql.g:5799:2: ( ruleNotExpression )
            {
            // InternalSql.g:5799:2: ( ruleNotExpression )
            // InternalSql.g:5800:3: ruleNotExpression
            {
             before(grammarAccess.getNotExpressionAccess().getLeftNotExpressionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNotExpression();

            state._fsp--;

             after(grammarAccess.getNotExpressionAccess().getLeftNotExpressionParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__LeftAssignment_0_2"


    // $ANTLR start "rule__ComparisonExpression__OperatorAssignment_1_1"
    // InternalSql.g:5809:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5813:1: ( ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) ) )
            // InternalSql.g:5814:2: ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSql.g:5814:2: ( ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 ) )
            // InternalSql.g:5815:3: ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSql.g:5816:3: ( rule__ComparisonExpression__OperatorAlternatives_1_1_0 )
            // InternalSql.g:5816:4: rule__ComparisonExpression__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisonExpression__RightAssignment_1_2"
    // InternalSql.g:5824:1: rule__ComparisonExpression__RightAssignment_1_2 : ( ruleAddOrSubtractExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5828:1: ( ( ruleAddOrSubtractExpression ) )
            // InternalSql.g:5829:2: ( ruleAddOrSubtractExpression )
            {
            // InternalSql.g:5829:2: ( ruleAddOrSubtractExpression )
            // InternalSql.g:5830:3: ruleAddOrSubtractExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightAddOrSubtractExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAddOrSubtractExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getRightAddOrSubtractExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__RightAssignment_1_2"


    // $ANTLR start "rule__AddOrSubtractExpression__OperatorAssignment_1_1"
    // InternalSql.g:5839:1: rule__AddOrSubtractExpression__OperatorAssignment_1_1 : ( ( rule__AddOrSubtractExpression__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__AddOrSubtractExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5843:1: ( ( ( rule__AddOrSubtractExpression__OperatorAlternatives_1_1_0 ) ) )
            // InternalSql.g:5844:2: ( ( rule__AddOrSubtractExpression__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSql.g:5844:2: ( ( rule__AddOrSubtractExpression__OperatorAlternatives_1_1_0 ) )
            // InternalSql.g:5845:3: ( rule__AddOrSubtractExpression__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getAddOrSubtractExpressionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSql.g:5846:3: ( rule__AddOrSubtractExpression__OperatorAlternatives_1_1_0 )
            // InternalSql.g:5846:4: rule__AddOrSubtractExpression__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AddOrSubtractExpression__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAddOrSubtractExpressionAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOrSubtractExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AddOrSubtractExpression__RightAssignment_1_2"
    // InternalSql.g:5854:1: rule__AddOrSubtractExpression__RightAssignment_1_2 : ( ruleMultiplyDivideModuloExpression ) ;
    public final void rule__AddOrSubtractExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5858:1: ( ( ruleMultiplyDivideModuloExpression ) )
            // InternalSql.g:5859:2: ( ruleMultiplyDivideModuloExpression )
            {
            // InternalSql.g:5859:2: ( ruleMultiplyDivideModuloExpression )
            // InternalSql.g:5860:3: ruleMultiplyDivideModuloExpression
            {
             before(grammarAccess.getAddOrSubtractExpressionAccess().getRightMultiplyDivideModuloExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplyDivideModuloExpression();

            state._fsp--;

             after(grammarAccess.getAddOrSubtractExpressionAccess().getRightMultiplyDivideModuloExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddOrSubtractExpression__RightAssignment_1_2"


    // $ANTLR start "rule__MultiplyDivideModuloExpression__OperatorAssignment_1_1"
    // InternalSql.g:5869:1: rule__MultiplyDivideModuloExpression__OperatorAssignment_1_1 : ( ( rule__MultiplyDivideModuloExpression__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__MultiplyDivideModuloExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5873:1: ( ( ( rule__MultiplyDivideModuloExpression__OperatorAlternatives_1_1_0 ) ) )
            // InternalSql.g:5874:2: ( ( rule__MultiplyDivideModuloExpression__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSql.g:5874:2: ( ( rule__MultiplyDivideModuloExpression__OperatorAlternatives_1_1_0 ) )
            // InternalSql.g:5875:3: ( rule__MultiplyDivideModuloExpression__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultiplyDivideModuloExpressionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSql.g:5876:3: ( rule__MultiplyDivideModuloExpression__OperatorAlternatives_1_1_0 )
            // InternalSql.g:5876:4: rule__MultiplyDivideModuloExpression__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplyDivideModuloExpression__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplyDivideModuloExpressionAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivideModuloExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__MultiplyDivideModuloExpression__RightAssignment_1_2"
    // InternalSql.g:5884:1: rule__MultiplyDivideModuloExpression__RightAssignment_1_2 : ( rulePowerOfExpression ) ;
    public final void rule__MultiplyDivideModuloExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5888:1: ( ( rulePowerOfExpression ) )
            // InternalSql.g:5889:2: ( rulePowerOfExpression )
            {
            // InternalSql.g:5889:2: ( rulePowerOfExpression )
            // InternalSql.g:5890:3: rulePowerOfExpression
            {
             before(grammarAccess.getMultiplyDivideModuloExpressionAccess().getRightPowerOfExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePowerOfExpression();

            state._fsp--;

             after(grammarAccess.getMultiplyDivideModuloExpressionAccess().getRightPowerOfExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplyDivideModuloExpression__RightAssignment_1_2"


    // $ANTLR start "rule__PowerOfExpression__OperatorAssignment_1_1"
    // InternalSql.g:5899:1: rule__PowerOfExpression__OperatorAssignment_1_1 : ( ( '^' ) ) ;
    public final void rule__PowerOfExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5903:1: ( ( ( '^' ) ) )
            // InternalSql.g:5904:2: ( ( '^' ) )
            {
            // InternalSql.g:5904:2: ( ( '^' ) )
            // InternalSql.g:5905:3: ( '^' )
            {
             before(grammarAccess.getPowerOfExpressionAccess().getOperatorCircumflexAccentKeyword_1_1_0()); 
            // InternalSql.g:5906:3: ( '^' )
            // InternalSql.g:5907:4: '^'
            {
             before(grammarAccess.getPowerOfExpressionAccess().getOperatorCircumflexAccentKeyword_1_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getPowerOfExpressionAccess().getOperatorCircumflexAccentKeyword_1_1_0()); 

            }

             after(grammarAccess.getPowerOfExpressionAccess().getOperatorCircumflexAccentKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOfExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__PowerOfExpression__RightAssignment_1_2"
    // InternalSql.g:5918:1: rule__PowerOfExpression__RightAssignment_1_2 : ( ruleUnaryAddOrSubtractExpression ) ;
    public final void rule__PowerOfExpression__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5922:1: ( ( ruleUnaryAddOrSubtractExpression ) )
            // InternalSql.g:5923:2: ( ruleUnaryAddOrSubtractExpression )
            {
            // InternalSql.g:5923:2: ( ruleUnaryAddOrSubtractExpression )
            // InternalSql.g:5924:3: ruleUnaryAddOrSubtractExpression
            {
             before(grammarAccess.getPowerOfExpressionAccess().getRightUnaryAddOrSubtractExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryAddOrSubtractExpression();

            state._fsp--;

             after(grammarAccess.getPowerOfExpressionAccess().getRightUnaryAddOrSubtractExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PowerOfExpression__RightAssignment_1_2"


    // $ANTLR start "rule__UnaryAddOrSubtractExpression__OperatorAssignment_1_1"
    // InternalSql.g:5933:1: rule__UnaryAddOrSubtractExpression__OperatorAssignment_1_1 : ( ( rule__UnaryAddOrSubtractExpression__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__UnaryAddOrSubtractExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5937:1: ( ( ( rule__UnaryAddOrSubtractExpression__OperatorAlternatives_1_1_0 ) ) )
            // InternalSql.g:5938:2: ( ( rule__UnaryAddOrSubtractExpression__OperatorAlternatives_1_1_0 ) )
            {
            // InternalSql.g:5938:2: ( ( rule__UnaryAddOrSubtractExpression__OperatorAlternatives_1_1_0 ) )
            // InternalSql.g:5939:3: ( rule__UnaryAddOrSubtractExpression__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalSql.g:5940:3: ( rule__UnaryAddOrSubtractExpression__OperatorAlternatives_1_1_0 )
            // InternalSql.g:5940:4: rule__UnaryAddOrSubtractExpression__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryAddOrSubtractExpression__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryAddOrSubtractExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__UnaryAddOrSubtractExpression__LeftAssignment_1_2"
    // InternalSql.g:5948:1: rule__UnaryAddOrSubtractExpression__LeftAssignment_1_2 : ( ruleUnaryAddOrSubtractExpression ) ;
    public final void rule__UnaryAddOrSubtractExpression__LeftAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5952:1: ( ( ruleUnaryAddOrSubtractExpression ) )
            // InternalSql.g:5953:2: ( ruleUnaryAddOrSubtractExpression )
            {
            // InternalSql.g:5953:2: ( ruleUnaryAddOrSubtractExpression )
            // InternalSql.g:5954:3: ruleUnaryAddOrSubtractExpression
            {
             before(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getLeftUnaryAddOrSubtractExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryAddOrSubtractExpression();

            state._fsp--;

             after(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getLeftUnaryAddOrSubtractExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryAddOrSubtractExpression__LeftAssignment_1_2"


    // $ANTLR start "rule__StringListNullOperatorExpression__ExpressionsAssignment_1_1"
    // InternalSql.g:5963:1: rule__StringListNullOperatorExpression__ExpressionsAssignment_1_1 : ( ( rule__StringListNullOperatorExpression__ExpressionsAlternatives_1_1_0 ) ) ;
    public final void rule__StringListNullOperatorExpression__ExpressionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5967:1: ( ( ( rule__StringListNullOperatorExpression__ExpressionsAlternatives_1_1_0 ) ) )
            // InternalSql.g:5968:2: ( ( rule__StringListNullOperatorExpression__ExpressionsAlternatives_1_1_0 ) )
            {
            // InternalSql.g:5968:2: ( ( rule__StringListNullOperatorExpression__ExpressionsAlternatives_1_1_0 ) )
            // InternalSql.g:5969:3: ( rule__StringListNullOperatorExpression__ExpressionsAlternatives_1_1_0 )
            {
             before(grammarAccess.getStringListNullOperatorExpressionAccess().getExpressionsAlternatives_1_1_0()); 
            // InternalSql.g:5970:3: ( rule__StringListNullOperatorExpression__ExpressionsAlternatives_1_1_0 )
            // InternalSql.g:5970:4: rule__StringListNullOperatorExpression__ExpressionsAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__StringListNullOperatorExpression__ExpressionsAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStringListNullOperatorExpressionAccess().getExpressionsAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringListNullOperatorExpression__ExpressionsAssignment_1_1"


    // $ANTLR start "rule__StringOperatorExpression__RightAssignment_1"
    // InternalSql.g:5978:1: rule__StringOperatorExpression__RightAssignment_1 : ( rulePropertyOrRelationAttributeExpression ) ;
    public final void rule__StringOperatorExpression__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5982:1: ( ( rulePropertyOrRelationAttributeExpression ) )
            // InternalSql.g:5983:2: ( rulePropertyOrRelationAttributeExpression )
            {
            // InternalSql.g:5983:2: ( rulePropertyOrRelationAttributeExpression )
            // InternalSql.g:5984:3: rulePropertyOrRelationAttributeExpression
            {
             before(grammarAccess.getStringOperatorExpressionAccess().getRightPropertyOrRelationAttributeExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyOrRelationAttributeExpression();

            state._fsp--;

             after(grammarAccess.getStringOperatorExpressionAccess().getRightPropertyOrRelationAttributeExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOperatorExpression__RightAssignment_1"


    // $ANTLR start "rule__PropertyOrRelationAttributeExpression__AttributeLookupAssignment_1"
    // InternalSql.g:5993:1: rule__PropertyOrRelationAttributeExpression__AttributeLookupAssignment_1 : ( ruleAttributeLookup ) ;
    public final void rule__PropertyOrRelationAttributeExpression__AttributeLookupAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:5997:1: ( ( ruleAttributeLookup ) )
            // InternalSql.g:5998:2: ( ruleAttributeLookup )
            {
            // InternalSql.g:5998:2: ( ruleAttributeLookup )
            // InternalSql.g:5999:3: ruleAttributeLookup
            {
             before(grammarAccess.getPropertyOrRelationAttributeExpressionAccess().getAttributeLookupAttributeLookupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeLookup();

            state._fsp--;

             after(grammarAccess.getPropertyOrRelationAttributeExpressionAccess().getAttributeLookupAttributeLookupParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyOrRelationAttributeExpression__AttributeLookupAssignment_1"


    // $ANTLR start "rule__AttributeLookup__AttributeKeyNameAssignment_1"
    // InternalSql.g:6008:1: rule__AttributeLookup__AttributeKeyNameAssignment_1 : ( ruleAttributeKeyName ) ;
    public final void rule__AttributeLookup__AttributeKeyNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:6012:1: ( ( ruleAttributeKeyName ) )
            // InternalSql.g:6013:2: ( ruleAttributeKeyName )
            {
            // InternalSql.g:6013:2: ( ruleAttributeKeyName )
            // InternalSql.g:6014:3: ruleAttributeKeyName
            {
             before(grammarAccess.getAttributeLookupAccess().getAttributeKeyNameAttributeKeyNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeKeyName();

            state._fsp--;

             after(grammarAccess.getAttributeLookupAccess().getAttributeKeyNameAttributeKeyNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeLookup__AttributeKeyNameAssignment_1"


    // $ANTLR start "rule__Atom__VariableRefAssignment_2_1"
    // InternalSql.g:6023:1: rule__Atom__VariableRefAssignment_2_1 : ( ruleVariableDeclaration ) ;
    public final void rule__Atom__VariableRefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:6027:1: ( ( ruleVariableDeclaration ) )
            // InternalSql.g:6028:2: ( ruleVariableDeclaration )
            {
            // InternalSql.g:6028:2: ( ruleVariableDeclaration )
            // InternalSql.g:6029:3: ruleVariableDeclaration
            {
             before(grammarAccess.getAtomAccess().getVariableRefVariableDeclarationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getVariableRefVariableDeclarationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__VariableRefAssignment_2_1"


    // $ANTLR start "rule__FunctionInvocation__FunctionNameAssignment_0"
    // InternalSql.g:6038:1: rule__FunctionInvocation__FunctionNameAssignment_0 : ( ruleFunctionName ) ;
    public final void rule__FunctionInvocation__FunctionNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:6042:1: ( ( ruleFunctionName ) )
            // InternalSql.g:6043:2: ( ruleFunctionName )
            {
            // InternalSql.g:6043:2: ( ruleFunctionName )
            // InternalSql.g:6044:3: ruleFunctionName
            {
             before(grammarAccess.getFunctionInvocationAccess().getFunctionNameFunctionNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunctionName();

            state._fsp--;

             after(grammarAccess.getFunctionInvocationAccess().getFunctionNameFunctionNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__FunctionNameAssignment_0"


    // $ANTLR start "rule__FunctionInvocation__ParameterAssignment_2_0"
    // InternalSql.g:6053:1: rule__FunctionInvocation__ParameterAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__FunctionInvocation__ParameterAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:6057:1: ( ( ruleExpression ) )
            // InternalSql.g:6058:2: ( ruleExpression )
            {
            // InternalSql.g:6058:2: ( ruleExpression )
            // InternalSql.g:6059:3: ruleExpression
            {
             before(grammarAccess.getFunctionInvocationAccess().getParameterExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionInvocationAccess().getParameterExpressionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__ParameterAssignment_2_0"


    // $ANTLR start "rule__FunctionInvocation__ParameterAssignment_2_1_1"
    // InternalSql.g:6068:1: rule__FunctionInvocation__ParameterAssignment_2_1_1 : ( ruleExpression ) ;
    public final void rule__FunctionInvocation__ParameterAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:6072:1: ( ( ruleExpression ) )
            // InternalSql.g:6073:2: ( ruleExpression )
            {
            // InternalSql.g:6073:2: ( ruleExpression )
            // InternalSql.g:6074:3: ruleExpression
            {
             before(grammarAccess.getFunctionInvocationAccess().getParameterExpressionParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFunctionInvocationAccess().getParameterExpressionParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FunctionInvocation__ParameterAssignment_2_1_1"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment"
    // InternalSql.g:6083:1: rule__VariableDeclaration__NameAssignment : ( ruleSYMBOLIC_NAME_X ) ;
    public final void rule__VariableDeclaration__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:6087:1: ( ( ruleSYMBOLIC_NAME_X ) )
            // InternalSql.g:6088:2: ( ruleSYMBOLIC_NAME_X )
            {
            // InternalSql.g:6088:2: ( ruleSYMBOLIC_NAME_X )
            // InternalSql.g:6089:3: ruleSYMBOLIC_NAME_X
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameSYMBOLIC_NAME_XParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSYMBOLIC_NAME_X();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getNameSYMBOLIC_NAME_XParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment_1"
    // InternalSql.g:6098:1: rule__BooleanLiteral__ValueAssignment_1 : ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) ) ;
    public final void rule__BooleanLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:6102:1: ( ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) ) )
            // InternalSql.g:6103:2: ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) )
            {
            // InternalSql.g:6103:2: ( ( rule__BooleanLiteral__ValueAlternatives_1_0 ) )
            // InternalSql.g:6104:3: ( rule__BooleanLiteral__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_1_0()); 
            // InternalSql.g:6105:3: ( rule__BooleanLiteral__ValueAlternatives_1_0 )
            // InternalSql.g:6105:4: rule__BooleanLiteral__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValueAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment_1"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalSql.g:6113:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING_LITERAL ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:6117:1: ( ( RULE_STRING_LITERAL ) )
            // InternalSql.g:6118:2: ( RULE_STRING_LITERAL )
            {
            // InternalSql.g:6118:2: ( RULE_STRING_LITERAL )
            // InternalSql.g:6119:3: RULE_STRING_LITERAL
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRING_LITERALTerminalRuleCall_0()); 
            match(input,RULE_STRING_LITERAL,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRING_LITERALTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // InternalSql.g:6128:1: rule__NumberLiteral__ValueAssignment : ( ruleNumber ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSql.g:6132:1: ( ( ruleNumber ) )
            // InternalSql.g:6133:2: ( ruleNumber )
            {
            // InternalSql.g:6133:2: ( ruleNumber )
            // InternalSql.g:6134:3: ruleNumber
            {
             before(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberLiteral__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000028848000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0008004000C0C1F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000800420000C1F0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000800000000C1F0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001DC0000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001DC0000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000DC0000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008004400C0C1F0L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000000000000C1E0L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000000000C0L});

}