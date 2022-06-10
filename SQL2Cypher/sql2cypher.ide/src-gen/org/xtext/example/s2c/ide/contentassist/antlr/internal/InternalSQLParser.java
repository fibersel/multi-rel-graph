package org.xtext.example.s2c.ide.contentassist.antlr.internal;

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
import org.xtext.example.s2c.services.SQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TRUE'", "'FALSE'", "'<'", "'>'", "'='", "'>='", "'<='", "'*'", "'count()'", "'SELECT'", "','", "'FROM'", "'('", "')'", "'JOIN'", "'ON'", "'WHERE'", "'OR'", "'AND'", "'NOT'", "'GROUP'", "'BY'", "'HAVING'", "'sum('"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSQLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSQL.g"; }


    	private SQLGrammarAccess grammarAccess;

    	public void setGrammarAccess(SQLGrammarAccess grammarAccess) {
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
    // InternalSQL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSQL.g:54:1: ( ruleModel EOF )
            // InternalSQL.g:55:1: ruleModel EOF
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
    // InternalSQL.g:62:1: ruleModel : ( ( rule__Model__StatementsAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:66:2: ( ( ( rule__Model__StatementsAssignment ) ) )
            // InternalSQL.g:67:2: ( ( rule__Model__StatementsAssignment ) )
            {
            // InternalSQL.g:67:2: ( ( rule__Model__StatementsAssignment ) )
            // InternalSQL.g:68:3: ( rule__Model__StatementsAssignment )
            {
             before(grammarAccess.getModelAccess().getStatementsAssignment()); 
            // InternalSQL.g:69:3: ( rule__Model__StatementsAssignment )
            // InternalSQL.g:69:4: rule__Model__StatementsAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__StatementsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStatementsAssignment()); 

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


    // $ANTLR start "entryRuleselect"
    // InternalSQL.g:78:1: entryRuleselect : ruleselect EOF ;
    public final void entryRuleselect() throws RecognitionException {
        try {
            // InternalSQL.g:79:1: ( ruleselect EOF )
            // InternalSQL.g:80:1: ruleselect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleselect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
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
    // $ANTLR end "entryRuleselect"


    // $ANTLR start "ruleselect"
    // InternalSQL.g:87:1: ruleselect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleselect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:91:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalSQL.g:92:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalSQL.g:92:2: ( ( rule__Select__Group__0 ) )
            // InternalSQL.g:93:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalSQL.g:94:3: ( rule__Select__Group__0 )
            // InternalSQL.g:94:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

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
    // $ANTLR end "ruleselect"


    // $ANTLR start "entryRulefromSection"
    // InternalSQL.g:103:1: entryRulefromSection : rulefromSection EOF ;
    public final void entryRulefromSection() throws RecognitionException {
        try {
            // InternalSQL.g:104:1: ( rulefromSection EOF )
            // InternalSQL.g:105:1: rulefromSection EOF
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
    // InternalSQL.g:112:1: rulefromSection : ( ( rule__FromSection__Group__0 ) ) ;
    public final void rulefromSection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:116:2: ( ( ( rule__FromSection__Group__0 ) ) )
            // InternalSQL.g:117:2: ( ( rule__FromSection__Group__0 ) )
            {
            // InternalSQL.g:117:2: ( ( rule__FromSection__Group__0 ) )
            // InternalSQL.g:118:3: ( rule__FromSection__Group__0 )
            {
             before(grammarAccess.getFromSectionAccess().getGroup()); 
            // InternalSQL.g:119:3: ( rule__FromSection__Group__0 )
            // InternalSQL.g:119:4: rule__FromSection__Group__0
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
    // InternalSQL.g:128:1: entryRuleFromItem : ruleFromItem EOF ;
    public final void entryRuleFromItem() throws RecognitionException {
        try {
            // InternalSQL.g:129:1: ( ruleFromItem EOF )
            // InternalSQL.g:130:1: ruleFromItem EOF
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
    // InternalSQL.g:137:1: ruleFromItem : ( ( rule__FromItem__Group__0 ) ) ;
    public final void ruleFromItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:141:2: ( ( ( rule__FromItem__Group__0 ) ) )
            // InternalSQL.g:142:2: ( ( rule__FromItem__Group__0 ) )
            {
            // InternalSQL.g:142:2: ( ( rule__FromItem__Group__0 ) )
            // InternalSQL.g:143:3: ( rule__FromItem__Group__0 )
            {
             before(grammarAccess.getFromItemAccess().getGroup()); 
            // InternalSQL.g:144:3: ( rule__FromItem__Group__0 )
            // InternalSQL.g:144:4: rule__FromItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromItemAccess().getGroup()); 

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


    // $ANTLR start "entryRuleWhereClause"
    // InternalSQL.g:153:1: entryRuleWhereClause : ruleWhereClause EOF ;
    public final void entryRuleWhereClause() throws RecognitionException {
        try {
            // InternalSQL.g:154:1: ( ruleWhereClause EOF )
            // InternalSQL.g:155:1: ruleWhereClause EOF
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
    // InternalSQL.g:162:1: ruleWhereClause : ( ( rule__WhereClause__Group__0 ) ) ;
    public final void ruleWhereClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:166:2: ( ( ( rule__WhereClause__Group__0 ) ) )
            // InternalSQL.g:167:2: ( ( rule__WhereClause__Group__0 ) )
            {
            // InternalSQL.g:167:2: ( ( rule__WhereClause__Group__0 ) )
            // InternalSQL.g:168:3: ( rule__WhereClause__Group__0 )
            {
             before(grammarAccess.getWhereClauseAccess().getGroup()); 
            // InternalSQL.g:169:3: ( rule__WhereClause__Group__0 )
            // InternalSQL.g:169:4: rule__WhereClause__Group__0
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
    // InternalSQL.g:178:1: entryRuleBoolExpression : ruleBoolExpression EOF ;
    public final void entryRuleBoolExpression() throws RecognitionException {
        try {
            // InternalSQL.g:179:1: ( ruleBoolExpression EOF )
            // InternalSQL.g:180:1: ruleBoolExpression EOF
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
    // InternalSQL.g:187:1: ruleBoolExpression : ( ( rule__BoolExpression__Group__0 ) ) ;
    public final void ruleBoolExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:191:2: ( ( ( rule__BoolExpression__Group__0 ) ) )
            // InternalSQL.g:192:2: ( ( rule__BoolExpression__Group__0 ) )
            {
            // InternalSQL.g:192:2: ( ( rule__BoolExpression__Group__0 ) )
            // InternalSQL.g:193:3: ( rule__BoolExpression__Group__0 )
            {
             before(grammarAccess.getBoolExpressionAccess().getGroup()); 
            // InternalSQL.g:194:3: ( rule__BoolExpression__Group__0 )
            // InternalSQL.g:194:4: rule__BoolExpression__Group__0
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
    // InternalSQL.g:203:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalSQL.g:204:1: ( ruleTerm EOF )
            // InternalSQL.g:205:1: ruleTerm EOF
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
    // InternalSQL.g:212:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:216:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalSQL.g:217:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalSQL.g:217:2: ( ( rule__Term__Group__0 ) )
            // InternalSQL.g:218:3: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // InternalSQL.g:219:3: ( rule__Term__Group__0 )
            // InternalSQL.g:219:4: rule__Term__Group__0
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
    // InternalSQL.g:228:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalSQL.g:229:1: ( ruleFactor EOF )
            // InternalSQL.g:230:1: ruleFactor EOF
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
    // InternalSQL.g:237:1: ruleFactor : ( ( rule__Factor__Alternatives ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:241:2: ( ( ( rule__Factor__Alternatives ) ) )
            // InternalSQL.g:242:2: ( ( rule__Factor__Alternatives ) )
            {
            // InternalSQL.g:242:2: ( ( rule__Factor__Alternatives ) )
            // InternalSQL.g:243:3: ( rule__Factor__Alternatives )
            {
             before(grammarAccess.getFactorAccess().getAlternatives()); 
            // InternalSQL.g:244:3: ( rule__Factor__Alternatives )
            // InternalSQL.g:244:4: rule__Factor__Alternatives
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
    // InternalSQL.g:253:1: entryRuleBinary : ruleBinary EOF ;
    public final void entryRuleBinary() throws RecognitionException {
        try {
            // InternalSQL.g:254:1: ( ruleBinary EOF )
            // InternalSQL.g:255:1: ruleBinary EOF
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
    // InternalSQL.g:262:1: ruleBinary : ( ( rule__Binary__Group__0 ) ) ;
    public final void ruleBinary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:266:2: ( ( ( rule__Binary__Group__0 ) ) )
            // InternalSQL.g:267:2: ( ( rule__Binary__Group__0 ) )
            {
            // InternalSQL.g:267:2: ( ( rule__Binary__Group__0 ) )
            // InternalSQL.g:268:3: ( rule__Binary__Group__0 )
            {
             before(grammarAccess.getBinaryAccess().getGroup()); 
            // InternalSQL.g:269:3: ( rule__Binary__Group__0 )
            // InternalSQL.g:269:4: rule__Binary__Group__0
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


    // $ANTLR start "entryRuleColumn"
    // InternalSQL.g:278:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalSQL.g:279:1: ( ruleColumn EOF )
            // InternalSQL.g:280:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalSQL.g:287:1: ruleColumn : ( ( rule__Column__NameAssignment ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:291:2: ( ( ( rule__Column__NameAssignment ) ) )
            // InternalSQL.g:292:2: ( ( rule__Column__NameAssignment ) )
            {
            // InternalSQL.g:292:2: ( ( rule__Column__NameAssignment ) )
            // InternalSQL.g:293:3: ( rule__Column__NameAssignment )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment()); 
            // InternalSQL.g:294:3: ( rule__Column__NameAssignment )
            // InternalSQL.g:294:4: rule__Column__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleGroupClause"
    // InternalSQL.g:303:1: entryRuleGroupClause : ruleGroupClause EOF ;
    public final void entryRuleGroupClause() throws RecognitionException {
        try {
            // InternalSQL.g:304:1: ( ruleGroupClause EOF )
            // InternalSQL.g:305:1: ruleGroupClause EOF
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
    // InternalSQL.g:312:1: ruleGroupClause : ( ( rule__GroupClause__Group__0 ) ) ;
    public final void ruleGroupClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:316:2: ( ( ( rule__GroupClause__Group__0 ) ) )
            // InternalSQL.g:317:2: ( ( rule__GroupClause__Group__0 ) )
            {
            // InternalSQL.g:317:2: ( ( rule__GroupClause__Group__0 ) )
            // InternalSQL.g:318:3: ( rule__GroupClause__Group__0 )
            {
             before(grammarAccess.getGroupClauseAccess().getGroup()); 
            // InternalSQL.g:319:3: ( rule__GroupClause__Group__0 )
            // InternalSQL.g:319:4: rule__GroupClause__Group__0
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
    // InternalSQL.g:328:1: entryRuleHavingClause : ruleHavingClause EOF ;
    public final void entryRuleHavingClause() throws RecognitionException {
        try {
            // InternalSQL.g:329:1: ( ruleHavingClause EOF )
            // InternalSQL.g:330:1: ruleHavingClause EOF
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
    // InternalSQL.g:337:1: ruleHavingClause : ( ( rule__HavingClause__Group__0 ) ) ;
    public final void ruleHavingClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:341:2: ( ( ( rule__HavingClause__Group__0 ) ) )
            // InternalSQL.g:342:2: ( ( rule__HavingClause__Group__0 ) )
            {
            // InternalSQL.g:342:2: ( ( rule__HavingClause__Group__0 ) )
            // InternalSQL.g:343:3: ( rule__HavingClause__Group__0 )
            {
             before(grammarAccess.getHavingClauseAccess().getGroup()); 
            // InternalSQL.g:344:3: ( rule__HavingClause__Group__0 )
            // InternalSQL.g:344:4: rule__HavingClause__Group__0
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
    // InternalSQL.g:353:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalSQL.g:354:1: ( ruleExpression EOF )
            // InternalSQL.g:355:1: ruleExpression EOF
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
    // InternalSQL.g:362:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:366:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalSQL.g:367:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalSQL.g:367:2: ( ( rule__Expression__Alternatives ) )
            // InternalSQL.g:368:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalSQL.g:369:3: ( rule__Expression__Alternatives )
            // InternalSQL.g:369:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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


    // $ANTLR start "rule__FromItem__Alternatives_0"
    // InternalSQL.g:377:1: rule__FromItem__Alternatives_0 : ( ( ( rule__FromItem__TableNameAssignment_0_0 ) ) | ( ( rule__FromItem__Group_0_1__0 ) ) );
    public final void rule__FromItem__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:381:1: ( ( ( rule__FromItem__TableNameAssignment_0_0 ) ) | ( ( rule__FromItem__Group_0_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSQL.g:382:2: ( ( rule__FromItem__TableNameAssignment_0_0 ) )
                    {
                    // InternalSQL.g:382:2: ( ( rule__FromItem__TableNameAssignment_0_0 ) )
                    // InternalSQL.g:383:3: ( rule__FromItem__TableNameAssignment_0_0 )
                    {
                     before(grammarAccess.getFromItemAccess().getTableNameAssignment_0_0()); 
                    // InternalSQL.g:384:3: ( rule__FromItem__TableNameAssignment_0_0 )
                    // InternalSQL.g:384:4: rule__FromItem__TableNameAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FromItem__TableNameAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFromItemAccess().getTableNameAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:388:2: ( ( rule__FromItem__Group_0_1__0 ) )
                    {
                    // InternalSQL.g:388:2: ( ( rule__FromItem__Group_0_1__0 ) )
                    // InternalSQL.g:389:3: ( rule__FromItem__Group_0_1__0 )
                    {
                     before(grammarAccess.getFromItemAccess().getGroup_0_1()); 
                    // InternalSQL.g:390:3: ( rule__FromItem__Group_0_1__0 )
                    // InternalSQL.g:390:4: rule__FromItem__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FromItem__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFromItemAccess().getGroup_0_1()); 

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
    // $ANTLR end "rule__FromItem__Alternatives_0"


    // $ANTLR start "rule__Factor__Alternatives"
    // InternalSQL.g:398:1: rule__Factor__Alternatives : ( ( ( rule__Factor__Group_0__0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( 'TRUE' ) | ( 'FALSE' ) | ( ( rule__Factor__BinexpAssignment_4 ) ) );
    public final void rule__Factor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:402:1: ( ( ( rule__Factor__Group_0__0 ) ) | ( ( rule__Factor__Group_1__0 ) ) | ( 'TRUE' ) | ( 'FALSE' ) | ( ( rule__Factor__BinexpAssignment_4 ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            case 12:
                {
                alt2=4;
                }
                break;
            case RULE_ID:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSQL.g:403:2: ( ( rule__Factor__Group_0__0 ) )
                    {
                    // InternalSQL.g:403:2: ( ( rule__Factor__Group_0__0 ) )
                    // InternalSQL.g:404:3: ( rule__Factor__Group_0__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_0()); 
                    // InternalSQL.g:405:3: ( rule__Factor__Group_0__0 )
                    // InternalSQL.g:405:4: rule__Factor__Group_0__0
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
                    // InternalSQL.g:409:2: ( ( rule__Factor__Group_1__0 ) )
                    {
                    // InternalSQL.g:409:2: ( ( rule__Factor__Group_1__0 ) )
                    // InternalSQL.g:410:3: ( rule__Factor__Group_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1()); 
                    // InternalSQL.g:411:3: ( rule__Factor__Group_1__0 )
                    // InternalSQL.g:411:4: rule__Factor__Group_1__0
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
                    // InternalSQL.g:415:2: ( 'TRUE' )
                    {
                    // InternalSQL.g:415:2: ( 'TRUE' )
                    // InternalSQL.g:416:3: 'TRUE'
                    {
                     before(grammarAccess.getFactorAccess().getTRUEKeyword_2()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getFactorAccess().getTRUEKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSQL.g:421:2: ( 'FALSE' )
                    {
                    // InternalSQL.g:421:2: ( 'FALSE' )
                    // InternalSQL.g:422:3: 'FALSE'
                    {
                     before(grammarAccess.getFactorAccess().getFALSEKeyword_3()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getFactorAccess().getFALSEKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSQL.g:427:2: ( ( rule__Factor__BinexpAssignment_4 ) )
                    {
                    // InternalSQL.g:427:2: ( ( rule__Factor__BinexpAssignment_4 ) )
                    // InternalSQL.g:428:3: ( rule__Factor__BinexpAssignment_4 )
                    {
                     before(grammarAccess.getFactorAccess().getBinexpAssignment_4()); 
                    // InternalSQL.g:429:3: ( rule__Factor__BinexpAssignment_4 )
                    // InternalSQL.g:429:4: rule__Factor__BinexpAssignment_4
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
    // InternalSQL.g:437:1: rule__Binary__Alternatives_1 : ( ( '<' ) | ( '>' ) | ( '=' ) | ( '>=' ) | ( '<=' ) );
    public final void rule__Binary__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:441:1: ( ( '<' ) | ( '>' ) | ( '=' ) | ( '>=' ) | ( '<=' ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
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
                    // InternalSQL.g:442:2: ( '<' )
                    {
                    // InternalSQL.g:442:2: ( '<' )
                    // InternalSQL.g:443:3: '<'
                    {
                     before(grammarAccess.getBinaryAccess().getLessThanSignKeyword_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBinaryAccess().getLessThanSignKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:448:2: ( '>' )
                    {
                    // InternalSQL.g:448:2: ( '>' )
                    // InternalSQL.g:449:3: '>'
                    {
                     before(grammarAccess.getBinaryAccess().getGreaterThanSignKeyword_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBinaryAccess().getGreaterThanSignKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSQL.g:454:2: ( '=' )
                    {
                    // InternalSQL.g:454:2: ( '=' )
                    // InternalSQL.g:455:3: '='
                    {
                     before(grammarAccess.getBinaryAccess().getEqualsSignKeyword_1_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBinaryAccess().getEqualsSignKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSQL.g:460:2: ( '>=' )
                    {
                    // InternalSQL.g:460:2: ( '>=' )
                    // InternalSQL.g:461:3: '>='
                    {
                     before(grammarAccess.getBinaryAccess().getGreaterThanSignEqualsSignKeyword_1_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBinaryAccess().getGreaterThanSignEqualsSignKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSQL.g:466:2: ( '<=' )
                    {
                    // InternalSQL.g:466:2: ( '<=' )
                    // InternalSQL.g:467:3: '<='
                    {
                     before(grammarAccess.getBinaryAccess().getLessThanSignEqualsSignKeyword_1_4()); 
                    match(input,17,FOLLOW_2); 
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


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalSQL.g:476:1: rule__Expression__Alternatives : ( ( '*' ) | ( ( rule__Expression__ColAssignment_1 ) ) | ( 'count()' ) | ( ( rule__Expression__Group_3__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:480:1: ( ( '*' ) | ( ( rule__Expression__ColAssignment_1 ) ) | ( 'count()' ) | ( ( rule__Expression__Group_3__0 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 34:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSQL.g:481:2: ( '*' )
                    {
                    // InternalSQL.g:481:2: ( '*' )
                    // InternalSQL.g:482:3: '*'
                    {
                     before(grammarAccess.getExpressionAccess().getAsteriskKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:487:2: ( ( rule__Expression__ColAssignment_1 ) )
                    {
                    // InternalSQL.g:487:2: ( ( rule__Expression__ColAssignment_1 ) )
                    // InternalSQL.g:488:3: ( rule__Expression__ColAssignment_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getColAssignment_1()); 
                    // InternalSQL.g:489:3: ( rule__Expression__ColAssignment_1 )
                    // InternalSQL.g:489:4: rule__Expression__ColAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__ColAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getColAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSQL.g:493:2: ( 'count()' )
                    {
                    // InternalSQL.g:493:2: ( 'count()' )
                    // InternalSQL.g:494:3: 'count()'
                    {
                     before(grammarAccess.getExpressionAccess().getCountKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getCountKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSQL.g:499:2: ( ( rule__Expression__Group_3__0 ) )
                    {
                    // InternalSQL.g:499:2: ( ( rule__Expression__Group_3__0 ) )
                    // InternalSQL.g:500:3: ( rule__Expression__Group_3__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_3()); 
                    // InternalSQL.g:501:3: ( rule__Expression__Group_3__0 )
                    // InternalSQL.g:501:4: rule__Expression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Select__Group__0"
    // InternalSQL.g:509:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:513:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalSQL.g:514:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

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
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalSQL.g:521:1: rule__Select__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:525:1: ( ( 'SELECT' ) )
            // InternalSQL.g:526:1: ( 'SELECT' )
            {
            // InternalSQL.g:526:1: ( 'SELECT' )
            // InternalSQL.g:527:2: 'SELECT'
            {
             before(grammarAccess.getSelectAccess().getSELECTKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSELECTKeyword_0()); 

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
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalSQL.g:536:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:540:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalSQL.g:541:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Select__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__2();

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
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalSQL.g:548:1: rule__Select__Group__1__Impl : ( ( rule__Select__ExpressionsAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:552:1: ( ( ( rule__Select__ExpressionsAssignment_1 ) ) )
            // InternalSQL.g:553:1: ( ( rule__Select__ExpressionsAssignment_1 ) )
            {
            // InternalSQL.g:553:1: ( ( rule__Select__ExpressionsAssignment_1 ) )
            // InternalSQL.g:554:2: ( rule__Select__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getExpressionsAssignment_1()); 
            // InternalSQL.g:555:2: ( rule__Select__ExpressionsAssignment_1 )
            // InternalSQL.g:555:3: rule__Select__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__ExpressionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getExpressionsAssignment_1()); 

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
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // InternalSQL.g:563:1: rule__Select__Group__2 : rule__Select__Group__2__Impl rule__Select__Group__3 ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:567:1: ( rule__Select__Group__2__Impl rule__Select__Group__3 )
            // InternalSQL.g:568:2: rule__Select__Group__2__Impl rule__Select__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Select__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__3();

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
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // InternalSQL.g:575:1: rule__Select__Group__2__Impl : ( ( rule__Select__Group_2__0 )* ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:579:1: ( ( ( rule__Select__Group_2__0 )* ) )
            // InternalSQL.g:580:1: ( ( rule__Select__Group_2__0 )* )
            {
            // InternalSQL.g:580:1: ( ( rule__Select__Group_2__0 )* )
            // InternalSQL.g:581:2: ( rule__Select__Group_2__0 )*
            {
             before(grammarAccess.getSelectAccess().getGroup_2()); 
            // InternalSQL.g:582:2: ( rule__Select__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSQL.g:582:3: rule__Select__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Select__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Select__Group__3"
    // InternalSQL.g:590:1: rule__Select__Group__3 : rule__Select__Group__3__Impl rule__Select__Group__4 ;
    public final void rule__Select__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:594:1: ( rule__Select__Group__3__Impl rule__Select__Group__4 )
            // InternalSQL.g:595:2: rule__Select__Group__3__Impl rule__Select__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Select__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__4();

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
    // $ANTLR end "rule__Select__Group__3"


    // $ANTLR start "rule__Select__Group__3__Impl"
    // InternalSQL.g:602:1: rule__Select__Group__3__Impl : ( ( rule__Select__FromSectionAssignment_3 )? ) ;
    public final void rule__Select__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:606:1: ( ( ( rule__Select__FromSectionAssignment_3 )? ) )
            // InternalSQL.g:607:1: ( ( rule__Select__FromSectionAssignment_3 )? )
            {
            // InternalSQL.g:607:1: ( ( rule__Select__FromSectionAssignment_3 )? )
            // InternalSQL.g:608:2: ( rule__Select__FromSectionAssignment_3 )?
            {
             before(grammarAccess.getSelectAccess().getFromSectionAssignment_3()); 
            // InternalSQL.g:609:2: ( rule__Select__FromSectionAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSQL.g:609:3: rule__Select__FromSectionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__FromSectionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectAccess().getFromSectionAssignment_3()); 

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
    // $ANTLR end "rule__Select__Group__3__Impl"


    // $ANTLR start "rule__Select__Group__4"
    // InternalSQL.g:617:1: rule__Select__Group__4 : rule__Select__Group__4__Impl rule__Select__Group__5 ;
    public final void rule__Select__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:621:1: ( rule__Select__Group__4__Impl rule__Select__Group__5 )
            // InternalSQL.g:622:2: rule__Select__Group__4__Impl rule__Select__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Select__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__5();

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
    // $ANTLR end "rule__Select__Group__4"


    // $ANTLR start "rule__Select__Group__4__Impl"
    // InternalSQL.g:629:1: rule__Select__Group__4__Impl : ( ( rule__Select__WhereClauseAssignment_4 )? ) ;
    public final void rule__Select__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:633:1: ( ( ( rule__Select__WhereClauseAssignment_4 )? ) )
            // InternalSQL.g:634:1: ( ( rule__Select__WhereClauseAssignment_4 )? )
            {
            // InternalSQL.g:634:1: ( ( rule__Select__WhereClauseAssignment_4 )? )
            // InternalSQL.g:635:2: ( rule__Select__WhereClauseAssignment_4 )?
            {
             before(grammarAccess.getSelectAccess().getWhereClauseAssignment_4()); 
            // InternalSQL.g:636:2: ( rule__Select__WhereClauseAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSQL.g:636:3: rule__Select__WhereClauseAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__WhereClauseAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectAccess().getWhereClauseAssignment_4()); 

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
    // $ANTLR end "rule__Select__Group__4__Impl"


    // $ANTLR start "rule__Select__Group__5"
    // InternalSQL.g:644:1: rule__Select__Group__5 : rule__Select__Group__5__Impl rule__Select__Group__6 ;
    public final void rule__Select__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:648:1: ( rule__Select__Group__5__Impl rule__Select__Group__6 )
            // InternalSQL.g:649:2: rule__Select__Group__5__Impl rule__Select__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Select__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__6();

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
    // $ANTLR end "rule__Select__Group__5"


    // $ANTLR start "rule__Select__Group__5__Impl"
    // InternalSQL.g:656:1: rule__Select__Group__5__Impl : ( ( rule__Select__GroupClauseAssignment_5 )? ) ;
    public final void rule__Select__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:660:1: ( ( ( rule__Select__GroupClauseAssignment_5 )? ) )
            // InternalSQL.g:661:1: ( ( rule__Select__GroupClauseAssignment_5 )? )
            {
            // InternalSQL.g:661:1: ( ( rule__Select__GroupClauseAssignment_5 )? )
            // InternalSQL.g:662:2: ( rule__Select__GroupClauseAssignment_5 )?
            {
             before(grammarAccess.getSelectAccess().getGroupClauseAssignment_5()); 
            // InternalSQL.g:663:2: ( rule__Select__GroupClauseAssignment_5 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSQL.g:663:3: rule__Select__GroupClauseAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__GroupClauseAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectAccess().getGroupClauseAssignment_5()); 

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
    // $ANTLR end "rule__Select__Group__5__Impl"


    // $ANTLR start "rule__Select__Group__6"
    // InternalSQL.g:671:1: rule__Select__Group__6 : rule__Select__Group__6__Impl ;
    public final void rule__Select__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:675:1: ( rule__Select__Group__6__Impl )
            // InternalSQL.g:676:2: rule__Select__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__6__Impl();

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
    // $ANTLR end "rule__Select__Group__6"


    // $ANTLR start "rule__Select__Group__6__Impl"
    // InternalSQL.g:682:1: rule__Select__Group__6__Impl : ( ( rule__Select__HavingClauseAssignment_6 )? ) ;
    public final void rule__Select__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:686:1: ( ( ( rule__Select__HavingClauseAssignment_6 )? ) )
            // InternalSQL.g:687:1: ( ( rule__Select__HavingClauseAssignment_6 )? )
            {
            // InternalSQL.g:687:1: ( ( rule__Select__HavingClauseAssignment_6 )? )
            // InternalSQL.g:688:2: ( rule__Select__HavingClauseAssignment_6 )?
            {
             before(grammarAccess.getSelectAccess().getHavingClauseAssignment_6()); 
            // InternalSQL.g:689:2: ( rule__Select__HavingClauseAssignment_6 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSQL.g:689:3: rule__Select__HavingClauseAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__HavingClauseAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectAccess().getHavingClauseAssignment_6()); 

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
    // $ANTLR end "rule__Select__Group__6__Impl"


    // $ANTLR start "rule__Select__Group_2__0"
    // InternalSQL.g:698:1: rule__Select__Group_2__0 : rule__Select__Group_2__0__Impl rule__Select__Group_2__1 ;
    public final void rule__Select__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:702:1: ( rule__Select__Group_2__0__Impl rule__Select__Group_2__1 )
            // InternalSQL.g:703:2: rule__Select__Group_2__0__Impl rule__Select__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Select__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_2__1();

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
    // $ANTLR end "rule__Select__Group_2__0"


    // $ANTLR start "rule__Select__Group_2__0__Impl"
    // InternalSQL.g:710:1: rule__Select__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Select__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:714:1: ( ( ',' ) )
            // InternalSQL.g:715:1: ( ',' )
            {
            // InternalSQL.g:715:1: ( ',' )
            // InternalSQL.g:716:2: ','
            {
             before(grammarAccess.getSelectAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__Select__Group_2__0__Impl"


    // $ANTLR start "rule__Select__Group_2__1"
    // InternalSQL.g:725:1: rule__Select__Group_2__1 : rule__Select__Group_2__1__Impl ;
    public final void rule__Select__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:729:1: ( rule__Select__Group_2__1__Impl )
            // InternalSQL.g:730:2: rule__Select__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_2__1__Impl();

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
    // $ANTLR end "rule__Select__Group_2__1"


    // $ANTLR start "rule__Select__Group_2__1__Impl"
    // InternalSQL.g:736:1: rule__Select__Group_2__1__Impl : ( ( rule__Select__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__Select__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:740:1: ( ( ( rule__Select__ExpressionsAssignment_2_1 ) ) )
            // InternalSQL.g:741:1: ( ( rule__Select__ExpressionsAssignment_2_1 ) )
            {
            // InternalSQL.g:741:1: ( ( rule__Select__ExpressionsAssignment_2_1 ) )
            // InternalSQL.g:742:2: ( rule__Select__ExpressionsAssignment_2_1 )
            {
             before(grammarAccess.getSelectAccess().getExpressionsAssignment_2_1()); 
            // InternalSQL.g:743:2: ( rule__Select__ExpressionsAssignment_2_1 )
            // InternalSQL.g:743:3: rule__Select__ExpressionsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__ExpressionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getExpressionsAssignment_2_1()); 

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
    // $ANTLR end "rule__Select__Group_2__1__Impl"


    // $ANTLR start "rule__FromSection__Group__0"
    // InternalSQL.g:752:1: rule__FromSection__Group__0 : rule__FromSection__Group__0__Impl rule__FromSection__Group__1 ;
    public final void rule__FromSection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:756:1: ( rule__FromSection__Group__0__Impl rule__FromSection__Group__1 )
            // InternalSQL.g:757:2: rule__FromSection__Group__0__Impl rule__FromSection__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSQL.g:764:1: rule__FromSection__Group__0__Impl : ( 'FROM' ) ;
    public final void rule__FromSection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:768:1: ( ( 'FROM' ) )
            // InternalSQL.g:769:1: ( 'FROM' )
            {
            // InternalSQL.g:769:1: ( 'FROM' )
            // InternalSQL.g:770:2: 'FROM'
            {
             before(grammarAccess.getFromSectionAccess().getFROMKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSQL.g:779:1: rule__FromSection__Group__1 : rule__FromSection__Group__1__Impl ;
    public final void rule__FromSection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:783:1: ( rule__FromSection__Group__1__Impl )
            // InternalSQL.g:784:2: rule__FromSection__Group__1__Impl
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
    // InternalSQL.g:790:1: rule__FromSection__Group__1__Impl : ( ( rule__FromSection__FromItemAssignment_1 ) ) ;
    public final void rule__FromSection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:794:1: ( ( ( rule__FromSection__FromItemAssignment_1 ) ) )
            // InternalSQL.g:795:1: ( ( rule__FromSection__FromItemAssignment_1 ) )
            {
            // InternalSQL.g:795:1: ( ( rule__FromSection__FromItemAssignment_1 ) )
            // InternalSQL.g:796:2: ( rule__FromSection__FromItemAssignment_1 )
            {
             before(grammarAccess.getFromSectionAccess().getFromItemAssignment_1()); 
            // InternalSQL.g:797:2: ( rule__FromSection__FromItemAssignment_1 )
            // InternalSQL.g:797:3: rule__FromSection__FromItemAssignment_1
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


    // $ANTLR start "rule__FromItem__Group__0"
    // InternalSQL.g:806:1: rule__FromItem__Group__0 : rule__FromItem__Group__0__Impl rule__FromItem__Group__1 ;
    public final void rule__FromItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:810:1: ( rule__FromItem__Group__0__Impl rule__FromItem__Group__1 )
            // InternalSQL.g:811:2: rule__FromItem__Group__0__Impl rule__FromItem__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__FromItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromItem__Group__1();

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
    // $ANTLR end "rule__FromItem__Group__0"


    // $ANTLR start "rule__FromItem__Group__0__Impl"
    // InternalSQL.g:818:1: rule__FromItem__Group__0__Impl : ( ( rule__FromItem__Alternatives_0 ) ) ;
    public final void rule__FromItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:822:1: ( ( ( rule__FromItem__Alternatives_0 ) ) )
            // InternalSQL.g:823:1: ( ( rule__FromItem__Alternatives_0 ) )
            {
            // InternalSQL.g:823:1: ( ( rule__FromItem__Alternatives_0 ) )
            // InternalSQL.g:824:2: ( rule__FromItem__Alternatives_0 )
            {
             before(grammarAccess.getFromItemAccess().getAlternatives_0()); 
            // InternalSQL.g:825:2: ( rule__FromItem__Alternatives_0 )
            // InternalSQL.g:825:3: rule__FromItem__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getFromItemAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__FromItem__Group__0__Impl"


    // $ANTLR start "rule__FromItem__Group__1"
    // InternalSQL.g:833:1: rule__FromItem__Group__1 : rule__FromItem__Group__1__Impl ;
    public final void rule__FromItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:837:1: ( rule__FromItem__Group__1__Impl )
            // InternalSQL.g:838:2: rule__FromItem__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__Group__1__Impl();

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
    // $ANTLR end "rule__FromItem__Group__1"


    // $ANTLR start "rule__FromItem__Group__1__Impl"
    // InternalSQL.g:844:1: rule__FromItem__Group__1__Impl : ( ( rule__FromItem__Group_1__0 )? ) ;
    public final void rule__FromItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:848:1: ( ( ( rule__FromItem__Group_1__0 )? ) )
            // InternalSQL.g:849:1: ( ( rule__FromItem__Group_1__0 )? )
            {
            // InternalSQL.g:849:1: ( ( rule__FromItem__Group_1__0 )? )
            // InternalSQL.g:850:2: ( rule__FromItem__Group_1__0 )?
            {
             before(grammarAccess.getFromItemAccess().getGroup_1()); 
            // InternalSQL.g:851:2: ( rule__FromItem__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSQL.g:851:3: rule__FromItem__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FromItem__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFromItemAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FromItem__Group__1__Impl"


    // $ANTLR start "rule__FromItem__Group_0_1__0"
    // InternalSQL.g:860:1: rule__FromItem__Group_0_1__0 : rule__FromItem__Group_0_1__0__Impl rule__FromItem__Group_0_1__1 ;
    public final void rule__FromItem__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:864:1: ( rule__FromItem__Group_0_1__0__Impl rule__FromItem__Group_0_1__1 )
            // InternalSQL.g:865:2: rule__FromItem__Group_0_1__0__Impl rule__FromItem__Group_0_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSQL.g:872:1: rule__FromItem__Group_0_1__0__Impl : ( '(' ) ;
    public final void rule__FromItem__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:876:1: ( ( '(' ) )
            // InternalSQL.g:877:1: ( '(' )
            {
            // InternalSQL.g:877:1: ( '(' )
            // InternalSQL.g:878:2: '('
            {
             before(grammarAccess.getFromItemAccess().getLeftParenthesisKeyword_0_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFromItemAccess().getLeftParenthesisKeyword_0_1_0()); 

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
    // InternalSQL.g:887:1: rule__FromItem__Group_0_1__1 : rule__FromItem__Group_0_1__1__Impl rule__FromItem__Group_0_1__2 ;
    public final void rule__FromItem__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:891:1: ( rule__FromItem__Group_0_1__1__Impl rule__FromItem__Group_0_1__2 )
            // InternalSQL.g:892:2: rule__FromItem__Group_0_1__1__Impl rule__FromItem__Group_0_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSQL.g:899:1: rule__FromItem__Group_0_1__1__Impl : ( ( rule__FromItem__Select_exprAssignment_0_1_1 ) ) ;
    public final void rule__FromItem__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:903:1: ( ( ( rule__FromItem__Select_exprAssignment_0_1_1 ) ) )
            // InternalSQL.g:904:1: ( ( rule__FromItem__Select_exprAssignment_0_1_1 ) )
            {
            // InternalSQL.g:904:1: ( ( rule__FromItem__Select_exprAssignment_0_1_1 ) )
            // InternalSQL.g:905:2: ( rule__FromItem__Select_exprAssignment_0_1_1 )
            {
             before(grammarAccess.getFromItemAccess().getSelect_exprAssignment_0_1_1()); 
            // InternalSQL.g:906:2: ( rule__FromItem__Select_exprAssignment_0_1_1 )
            // InternalSQL.g:906:3: rule__FromItem__Select_exprAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__Select_exprAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFromItemAccess().getSelect_exprAssignment_0_1_1()); 

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
    // InternalSQL.g:914:1: rule__FromItem__Group_0_1__2 : rule__FromItem__Group_0_1__2__Impl ;
    public final void rule__FromItem__Group_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:918:1: ( rule__FromItem__Group_0_1__2__Impl )
            // InternalSQL.g:919:2: rule__FromItem__Group_0_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__Group_0_1__2__Impl();

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
    // InternalSQL.g:925:1: rule__FromItem__Group_0_1__2__Impl : ( ')' ) ;
    public final void rule__FromItem__Group_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:929:1: ( ( ')' ) )
            // InternalSQL.g:930:1: ( ')' )
            {
            // InternalSQL.g:930:1: ( ')' )
            // InternalSQL.g:931:2: ')'
            {
             before(grammarAccess.getFromItemAccess().getRightParenthesisKeyword_0_1_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFromItemAccess().getRightParenthesisKeyword_0_1_2()); 

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


    // $ANTLR start "rule__FromItem__Group_1__0"
    // InternalSQL.g:941:1: rule__FromItem__Group_1__0 : rule__FromItem__Group_1__0__Impl rule__FromItem__Group_1__1 ;
    public final void rule__FromItem__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:945:1: ( rule__FromItem__Group_1__0__Impl rule__FromItem__Group_1__1 )
            // InternalSQL.g:946:2: rule__FromItem__Group_1__0__Impl rule__FromItem__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalSQL.g:953:1: rule__FromItem__Group_1__0__Impl : ( 'JOIN' ) ;
    public final void rule__FromItem__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:957:1: ( ( 'JOIN' ) )
            // InternalSQL.g:958:1: ( 'JOIN' )
            {
            // InternalSQL.g:958:1: ( 'JOIN' )
            // InternalSQL.g:959:2: 'JOIN'
            {
             before(grammarAccess.getFromItemAccess().getJOINKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFromItemAccess().getJOINKeyword_1_0()); 

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
    // InternalSQL.g:968:1: rule__FromItem__Group_1__1 : rule__FromItem__Group_1__1__Impl rule__FromItem__Group_1__2 ;
    public final void rule__FromItem__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:972:1: ( rule__FromItem__Group_1__1__Impl rule__FromItem__Group_1__2 )
            // InternalSQL.g:973:2: rule__FromItem__Group_1__1__Impl rule__FromItem__Group_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSQL.g:980:1: rule__FromItem__Group_1__1__Impl : ( ( rule__FromItem__RhsAssignment_1_1 ) ) ;
    public final void rule__FromItem__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:984:1: ( ( ( rule__FromItem__RhsAssignment_1_1 ) ) )
            // InternalSQL.g:985:1: ( ( rule__FromItem__RhsAssignment_1_1 ) )
            {
            // InternalSQL.g:985:1: ( ( rule__FromItem__RhsAssignment_1_1 ) )
            // InternalSQL.g:986:2: ( rule__FromItem__RhsAssignment_1_1 )
            {
             before(grammarAccess.getFromItemAccess().getRhsAssignment_1_1()); 
            // InternalSQL.g:987:2: ( rule__FromItem__RhsAssignment_1_1 )
            // InternalSQL.g:987:3: rule__FromItem__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__RhsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFromItemAccess().getRhsAssignment_1_1()); 

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
    // InternalSQL.g:995:1: rule__FromItem__Group_1__2 : rule__FromItem__Group_1__2__Impl rule__FromItem__Group_1__3 ;
    public final void rule__FromItem__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:999:1: ( rule__FromItem__Group_1__2__Impl rule__FromItem__Group_1__3 )
            // InternalSQL.g:1000:2: rule__FromItem__Group_1__2__Impl rule__FromItem__Group_1__3
            {
            pushFollow(FOLLOW_11);
            rule__FromItem__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromItem__Group_1__3();

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
    // InternalSQL.g:1007:1: rule__FromItem__Group_1__2__Impl : ( 'ON' ) ;
    public final void rule__FromItem__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1011:1: ( ( 'ON' ) )
            // InternalSQL.g:1012:1: ( 'ON' )
            {
            // InternalSQL.g:1012:1: ( 'ON' )
            // InternalSQL.g:1013:2: 'ON'
            {
             before(grammarAccess.getFromItemAccess().getONKeyword_1_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFromItemAccess().getONKeyword_1_2()); 

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


    // $ANTLR start "rule__FromItem__Group_1__3"
    // InternalSQL.g:1022:1: rule__FromItem__Group_1__3 : rule__FromItem__Group_1__3__Impl ;
    public final void rule__FromItem__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1026:1: ( rule__FromItem__Group_1__3__Impl )
            // InternalSQL.g:1027:2: rule__FromItem__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__Group_1__3__Impl();

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
    // $ANTLR end "rule__FromItem__Group_1__3"


    // $ANTLR start "rule__FromItem__Group_1__3__Impl"
    // InternalSQL.g:1033:1: rule__FromItem__Group_1__3__Impl : ( ( rule__FromItem__Bool_exprAssignment_1_3 ) ) ;
    public final void rule__FromItem__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1037:1: ( ( ( rule__FromItem__Bool_exprAssignment_1_3 ) ) )
            // InternalSQL.g:1038:1: ( ( rule__FromItem__Bool_exprAssignment_1_3 ) )
            {
            // InternalSQL.g:1038:1: ( ( rule__FromItem__Bool_exprAssignment_1_3 ) )
            // InternalSQL.g:1039:2: ( rule__FromItem__Bool_exprAssignment_1_3 )
            {
             before(grammarAccess.getFromItemAccess().getBool_exprAssignment_1_3()); 
            // InternalSQL.g:1040:2: ( rule__FromItem__Bool_exprAssignment_1_3 )
            // InternalSQL.g:1040:3: rule__FromItem__Bool_exprAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__FromItem__Bool_exprAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getFromItemAccess().getBool_exprAssignment_1_3()); 

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
    // $ANTLR end "rule__FromItem__Group_1__3__Impl"


    // $ANTLR start "rule__WhereClause__Group__0"
    // InternalSQL.g:1049:1: rule__WhereClause__Group__0 : rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 ;
    public final void rule__WhereClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1053:1: ( rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 )
            // InternalSQL.g:1054:2: rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSQL.g:1061:1: rule__WhereClause__Group__0__Impl : ( 'WHERE' ) ;
    public final void rule__WhereClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1065:1: ( ( 'WHERE' ) )
            // InternalSQL.g:1066:1: ( 'WHERE' )
            {
            // InternalSQL.g:1066:1: ( 'WHERE' )
            // InternalSQL.g:1067:2: 'WHERE'
            {
             before(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSQL.g:1076:1: rule__WhereClause__Group__1 : rule__WhereClause__Group__1__Impl ;
    public final void rule__WhereClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1080:1: ( rule__WhereClause__Group__1__Impl )
            // InternalSQL.g:1081:2: rule__WhereClause__Group__1__Impl
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
    // InternalSQL.g:1087:1: rule__WhereClause__Group__1__Impl : ( ( rule__WhereClause__BoolExpressionAssignment_1 ) ) ;
    public final void rule__WhereClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1091:1: ( ( ( rule__WhereClause__BoolExpressionAssignment_1 ) ) )
            // InternalSQL.g:1092:1: ( ( rule__WhereClause__BoolExpressionAssignment_1 ) )
            {
            // InternalSQL.g:1092:1: ( ( rule__WhereClause__BoolExpressionAssignment_1 ) )
            // InternalSQL.g:1093:2: ( rule__WhereClause__BoolExpressionAssignment_1 )
            {
             before(grammarAccess.getWhereClauseAccess().getBoolExpressionAssignment_1()); 
            // InternalSQL.g:1094:2: ( rule__WhereClause__BoolExpressionAssignment_1 )
            // InternalSQL.g:1094:3: rule__WhereClause__BoolExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__BoolExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereClauseAccess().getBoolExpressionAssignment_1()); 

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
    // InternalSQL.g:1103:1: rule__BoolExpression__Group__0 : rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1 ;
    public final void rule__BoolExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1107:1: ( rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1 )
            // InternalSQL.g:1108:2: rule__BoolExpression__Group__0__Impl rule__BoolExpression__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalSQL.g:1115:1: rule__BoolExpression__Group__0__Impl : ( ( rule__BoolExpression__LhsAssignment_0 ) ) ;
    public final void rule__BoolExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1119:1: ( ( ( rule__BoolExpression__LhsAssignment_0 ) ) )
            // InternalSQL.g:1120:1: ( ( rule__BoolExpression__LhsAssignment_0 ) )
            {
            // InternalSQL.g:1120:1: ( ( rule__BoolExpression__LhsAssignment_0 ) )
            // InternalSQL.g:1121:2: ( rule__BoolExpression__LhsAssignment_0 )
            {
             before(grammarAccess.getBoolExpressionAccess().getLhsAssignment_0()); 
            // InternalSQL.g:1122:2: ( rule__BoolExpression__LhsAssignment_0 )
            // InternalSQL.g:1122:3: rule__BoolExpression__LhsAssignment_0
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
    // InternalSQL.g:1130:1: rule__BoolExpression__Group__1 : rule__BoolExpression__Group__1__Impl ;
    public final void rule__BoolExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1134:1: ( rule__BoolExpression__Group__1__Impl )
            // InternalSQL.g:1135:2: rule__BoolExpression__Group__1__Impl
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
    // InternalSQL.g:1141:1: rule__BoolExpression__Group__1__Impl : ( ( rule__BoolExpression__Group_1__0 )? ) ;
    public final void rule__BoolExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1145:1: ( ( ( rule__BoolExpression__Group_1__0 )? ) )
            // InternalSQL.g:1146:1: ( ( rule__BoolExpression__Group_1__0 )? )
            {
            // InternalSQL.g:1146:1: ( ( rule__BoolExpression__Group_1__0 )? )
            // InternalSQL.g:1147:2: ( rule__BoolExpression__Group_1__0 )?
            {
             before(grammarAccess.getBoolExpressionAccess().getGroup_1()); 
            // InternalSQL.g:1148:2: ( rule__BoolExpression__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSQL.g:1148:3: rule__BoolExpression__Group_1__0
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
    // InternalSQL.g:1157:1: rule__BoolExpression__Group_1__0 : rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1 ;
    public final void rule__BoolExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1161:1: ( rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1 )
            // InternalSQL.g:1162:2: rule__BoolExpression__Group_1__0__Impl rule__BoolExpression__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSQL.g:1169:1: rule__BoolExpression__Group_1__0__Impl : ( 'OR' ) ;
    public final void rule__BoolExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1173:1: ( ( 'OR' ) )
            // InternalSQL.g:1174:1: ( 'OR' )
            {
            // InternalSQL.g:1174:1: ( 'OR' )
            // InternalSQL.g:1175:2: 'OR'
            {
             before(grammarAccess.getBoolExpressionAccess().getORKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalSQL.g:1184:1: rule__BoolExpression__Group_1__1 : rule__BoolExpression__Group_1__1__Impl ;
    public final void rule__BoolExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1188:1: ( rule__BoolExpression__Group_1__1__Impl )
            // InternalSQL.g:1189:2: rule__BoolExpression__Group_1__1__Impl
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
    // InternalSQL.g:1195:1: rule__BoolExpression__Group_1__1__Impl : ( ( rule__BoolExpression__RhsAssignment_1_1 ) ) ;
    public final void rule__BoolExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1199:1: ( ( ( rule__BoolExpression__RhsAssignment_1_1 ) ) )
            // InternalSQL.g:1200:1: ( ( rule__BoolExpression__RhsAssignment_1_1 ) )
            {
            // InternalSQL.g:1200:1: ( ( rule__BoolExpression__RhsAssignment_1_1 ) )
            // InternalSQL.g:1201:2: ( rule__BoolExpression__RhsAssignment_1_1 )
            {
             before(grammarAccess.getBoolExpressionAccess().getRhsAssignment_1_1()); 
            // InternalSQL.g:1202:2: ( rule__BoolExpression__RhsAssignment_1_1 )
            // InternalSQL.g:1202:3: rule__BoolExpression__RhsAssignment_1_1
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
    // InternalSQL.g:1211:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1215:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalSQL.g:1216:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalSQL.g:1223:1: rule__Term__Group__0__Impl : ( ( rule__Term__LhsAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1227:1: ( ( ( rule__Term__LhsAssignment_0 ) ) )
            // InternalSQL.g:1228:1: ( ( rule__Term__LhsAssignment_0 ) )
            {
            // InternalSQL.g:1228:1: ( ( rule__Term__LhsAssignment_0 ) )
            // InternalSQL.g:1229:2: ( rule__Term__LhsAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getLhsAssignment_0()); 
            // InternalSQL.g:1230:2: ( rule__Term__LhsAssignment_0 )
            // InternalSQL.g:1230:3: rule__Term__LhsAssignment_0
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
    // InternalSQL.g:1238:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1242:1: ( rule__Term__Group__1__Impl )
            // InternalSQL.g:1243:2: rule__Term__Group__1__Impl
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
    // InternalSQL.g:1249:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 ) ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1253:1: ( ( ( rule__Term__Group_1__0 ) ) )
            // InternalSQL.g:1254:1: ( ( rule__Term__Group_1__0 ) )
            {
            // InternalSQL.g:1254:1: ( ( rule__Term__Group_1__0 ) )
            // InternalSQL.g:1255:2: ( rule__Term__Group_1__0 )
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // InternalSQL.g:1256:2: ( rule__Term__Group_1__0 )
            // InternalSQL.g:1256:3: rule__Term__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group_1__0();

            state._fsp--;


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
    // InternalSQL.g:1265:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1269:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // InternalSQL.g:1270:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSQL.g:1277:1: rule__Term__Group_1__0__Impl : ( 'AND' ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1281:1: ( ( 'AND' ) )
            // InternalSQL.g:1282:1: ( 'AND' )
            {
            // InternalSQL.g:1282:1: ( 'AND' )
            // InternalSQL.g:1283:2: 'AND'
            {
             before(grammarAccess.getTermAccess().getANDKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSQL.g:1292:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1296:1: ( rule__Term__Group_1__1__Impl )
            // InternalSQL.g:1297:2: rule__Term__Group_1__1__Impl
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
    // InternalSQL.g:1303:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__RhsAssignment_1_1 ) ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1307:1: ( ( ( rule__Term__RhsAssignment_1_1 ) ) )
            // InternalSQL.g:1308:1: ( ( rule__Term__RhsAssignment_1_1 ) )
            {
            // InternalSQL.g:1308:1: ( ( rule__Term__RhsAssignment_1_1 ) )
            // InternalSQL.g:1309:2: ( rule__Term__RhsAssignment_1_1 )
            {
             before(grammarAccess.getTermAccess().getRhsAssignment_1_1()); 
            // InternalSQL.g:1310:2: ( rule__Term__RhsAssignment_1_1 )
            // InternalSQL.g:1310:3: rule__Term__RhsAssignment_1_1
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
    // InternalSQL.g:1319:1: rule__Factor__Group_0__0 : rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1 ;
    public final void rule__Factor__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1323:1: ( rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1 )
            // InternalSQL.g:1324:2: rule__Factor__Group_0__0__Impl rule__Factor__Group_0__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSQL.g:1331:1: rule__Factor__Group_0__0__Impl : ( 'NOT' ) ;
    public final void rule__Factor__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1335:1: ( ( 'NOT' ) )
            // InternalSQL.g:1336:1: ( 'NOT' )
            {
            // InternalSQL.g:1336:1: ( 'NOT' )
            // InternalSQL.g:1337:2: 'NOT'
            {
             before(grammarAccess.getFactorAccess().getNOTKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSQL.g:1346:1: rule__Factor__Group_0__1 : rule__Factor__Group_0__1__Impl ;
    public final void rule__Factor__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1350:1: ( rule__Factor__Group_0__1__Impl )
            // InternalSQL.g:1351:2: rule__Factor__Group_0__1__Impl
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
    // InternalSQL.g:1357:1: rule__Factor__Group_0__1__Impl : ( ( rule__Factor__FactorAssignment_0_1 ) ) ;
    public final void rule__Factor__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1361:1: ( ( ( rule__Factor__FactorAssignment_0_1 ) ) )
            // InternalSQL.g:1362:1: ( ( rule__Factor__FactorAssignment_0_1 ) )
            {
            // InternalSQL.g:1362:1: ( ( rule__Factor__FactorAssignment_0_1 ) )
            // InternalSQL.g:1363:2: ( rule__Factor__FactorAssignment_0_1 )
            {
             before(grammarAccess.getFactorAccess().getFactorAssignment_0_1()); 
            // InternalSQL.g:1364:2: ( rule__Factor__FactorAssignment_0_1 )
            // InternalSQL.g:1364:3: rule__Factor__FactorAssignment_0_1
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
    // InternalSQL.g:1373:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1377:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalSQL.g:1378:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSQL.g:1385:1: rule__Factor__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1389:1: ( ( '(' ) )
            // InternalSQL.g:1390:1: ( '(' )
            {
            // InternalSQL.g:1390:1: ( '(' )
            // InternalSQL.g:1391:2: '('
            {
             before(grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSQL.g:1400:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1404:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // InternalSQL.g:1405:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalSQL.g:1412:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__ExprAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1416:1: ( ( ( rule__Factor__ExprAssignment_1_1 ) ) )
            // InternalSQL.g:1417:1: ( ( rule__Factor__ExprAssignment_1_1 ) )
            {
            // InternalSQL.g:1417:1: ( ( rule__Factor__ExprAssignment_1_1 ) )
            // InternalSQL.g:1418:2: ( rule__Factor__ExprAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getExprAssignment_1_1()); 
            // InternalSQL.g:1419:2: ( rule__Factor__ExprAssignment_1_1 )
            // InternalSQL.g:1419:3: rule__Factor__ExprAssignment_1_1
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
    // InternalSQL.g:1427:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1431:1: ( rule__Factor__Group_1__2__Impl )
            // InternalSQL.g:1432:2: rule__Factor__Group_1__2__Impl
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
    // InternalSQL.g:1438:1: rule__Factor__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1442:1: ( ( ')' ) )
            // InternalSQL.g:1443:1: ( ')' )
            {
            // InternalSQL.g:1443:1: ( ')' )
            // InternalSQL.g:1444:2: ')'
            {
             before(grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSQL.g:1454:1: rule__Binary__Group__0 : rule__Binary__Group__0__Impl rule__Binary__Group__1 ;
    public final void rule__Binary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1458:1: ( rule__Binary__Group__0__Impl rule__Binary__Group__1 )
            // InternalSQL.g:1459:2: rule__Binary__Group__0__Impl rule__Binary__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSQL.g:1466:1: rule__Binary__Group__0__Impl : ( ( rule__Binary__LhsAssignment_0 ) ) ;
    public final void rule__Binary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1470:1: ( ( ( rule__Binary__LhsAssignment_0 ) ) )
            // InternalSQL.g:1471:1: ( ( rule__Binary__LhsAssignment_0 ) )
            {
            // InternalSQL.g:1471:1: ( ( rule__Binary__LhsAssignment_0 ) )
            // InternalSQL.g:1472:2: ( rule__Binary__LhsAssignment_0 )
            {
             before(grammarAccess.getBinaryAccess().getLhsAssignment_0()); 
            // InternalSQL.g:1473:2: ( rule__Binary__LhsAssignment_0 )
            // InternalSQL.g:1473:3: rule__Binary__LhsAssignment_0
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
    // InternalSQL.g:1481:1: rule__Binary__Group__1 : rule__Binary__Group__1__Impl rule__Binary__Group__2 ;
    public final void rule__Binary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1485:1: ( rule__Binary__Group__1__Impl rule__Binary__Group__2 )
            // InternalSQL.g:1486:2: rule__Binary__Group__1__Impl rule__Binary__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalSQL.g:1493:1: rule__Binary__Group__1__Impl : ( ( rule__Binary__Alternatives_1 ) ) ;
    public final void rule__Binary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1497:1: ( ( ( rule__Binary__Alternatives_1 ) ) )
            // InternalSQL.g:1498:1: ( ( rule__Binary__Alternatives_1 ) )
            {
            // InternalSQL.g:1498:1: ( ( rule__Binary__Alternatives_1 ) )
            // InternalSQL.g:1499:2: ( rule__Binary__Alternatives_1 )
            {
             before(grammarAccess.getBinaryAccess().getAlternatives_1()); 
            // InternalSQL.g:1500:2: ( rule__Binary__Alternatives_1 )
            // InternalSQL.g:1500:3: rule__Binary__Alternatives_1
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
    // InternalSQL.g:1508:1: rule__Binary__Group__2 : rule__Binary__Group__2__Impl ;
    public final void rule__Binary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1512:1: ( rule__Binary__Group__2__Impl )
            // InternalSQL.g:1513:2: rule__Binary__Group__2__Impl
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
    // InternalSQL.g:1519:1: rule__Binary__Group__2__Impl : ( ( rule__Binary__RhsAssignment_2 ) ) ;
    public final void rule__Binary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1523:1: ( ( ( rule__Binary__RhsAssignment_2 ) ) )
            // InternalSQL.g:1524:1: ( ( rule__Binary__RhsAssignment_2 ) )
            {
            // InternalSQL.g:1524:1: ( ( rule__Binary__RhsAssignment_2 ) )
            // InternalSQL.g:1525:2: ( rule__Binary__RhsAssignment_2 )
            {
             before(grammarAccess.getBinaryAccess().getRhsAssignment_2()); 
            // InternalSQL.g:1526:2: ( rule__Binary__RhsAssignment_2 )
            // InternalSQL.g:1526:3: rule__Binary__RhsAssignment_2
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
    // InternalSQL.g:1535:1: rule__GroupClause__Group__0 : rule__GroupClause__Group__0__Impl rule__GroupClause__Group__1 ;
    public final void rule__GroupClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1539:1: ( rule__GroupClause__Group__0__Impl rule__GroupClause__Group__1 )
            // InternalSQL.g:1540:2: rule__GroupClause__Group__0__Impl rule__GroupClause__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSQL.g:1547:1: rule__GroupClause__Group__0__Impl : ( 'GROUP' ) ;
    public final void rule__GroupClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1551:1: ( ( 'GROUP' ) )
            // InternalSQL.g:1552:1: ( 'GROUP' )
            {
            // InternalSQL.g:1552:1: ( 'GROUP' )
            // InternalSQL.g:1553:2: 'GROUP'
            {
             before(grammarAccess.getGroupClauseAccess().getGROUPKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSQL.g:1562:1: rule__GroupClause__Group__1 : rule__GroupClause__Group__1__Impl rule__GroupClause__Group__2 ;
    public final void rule__GroupClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1566:1: ( rule__GroupClause__Group__1__Impl rule__GroupClause__Group__2 )
            // InternalSQL.g:1567:2: rule__GroupClause__Group__1__Impl rule__GroupClause__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSQL.g:1574:1: rule__GroupClause__Group__1__Impl : ( 'BY' ) ;
    public final void rule__GroupClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1578:1: ( ( 'BY' ) )
            // InternalSQL.g:1579:1: ( 'BY' )
            {
            // InternalSQL.g:1579:1: ( 'BY' )
            // InternalSQL.g:1580:2: 'BY'
            {
             before(grammarAccess.getGroupClauseAccess().getBYKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSQL.g:1589:1: rule__GroupClause__Group__2 : rule__GroupClause__Group__2__Impl rule__GroupClause__Group__3 ;
    public final void rule__GroupClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1593:1: ( rule__GroupClause__Group__2__Impl rule__GroupClause__Group__3 )
            // InternalSQL.g:1594:2: rule__GroupClause__Group__2__Impl rule__GroupClause__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalSQL.g:1601:1: rule__GroupClause__Group__2__Impl : ( ( rule__GroupClause__ExpressionsAssignment_2 ) ) ;
    public final void rule__GroupClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1605:1: ( ( ( rule__GroupClause__ExpressionsAssignment_2 ) ) )
            // InternalSQL.g:1606:1: ( ( rule__GroupClause__ExpressionsAssignment_2 ) )
            {
            // InternalSQL.g:1606:1: ( ( rule__GroupClause__ExpressionsAssignment_2 ) )
            // InternalSQL.g:1607:2: ( rule__GroupClause__ExpressionsAssignment_2 )
            {
             before(grammarAccess.getGroupClauseAccess().getExpressionsAssignment_2()); 
            // InternalSQL.g:1608:2: ( rule__GroupClause__ExpressionsAssignment_2 )
            // InternalSQL.g:1608:3: rule__GroupClause__ExpressionsAssignment_2
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
    // InternalSQL.g:1616:1: rule__GroupClause__Group__3 : rule__GroupClause__Group__3__Impl ;
    public final void rule__GroupClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1620:1: ( rule__GroupClause__Group__3__Impl )
            // InternalSQL.g:1621:2: rule__GroupClause__Group__3__Impl
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
    // InternalSQL.g:1627:1: rule__GroupClause__Group__3__Impl : ( ( rule__GroupClause__Group_3__0 )* ) ;
    public final void rule__GroupClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1631:1: ( ( ( rule__GroupClause__Group_3__0 )* ) )
            // InternalSQL.g:1632:1: ( ( rule__GroupClause__Group_3__0 )* )
            {
            // InternalSQL.g:1632:1: ( ( rule__GroupClause__Group_3__0 )* )
            // InternalSQL.g:1633:2: ( rule__GroupClause__Group_3__0 )*
            {
             before(grammarAccess.getGroupClauseAccess().getGroup_3()); 
            // InternalSQL.g:1634:2: ( rule__GroupClause__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSQL.g:1634:3: rule__GroupClause__Group_3__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__GroupClause__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalSQL.g:1643:1: rule__GroupClause__Group_3__0 : rule__GroupClause__Group_3__0__Impl rule__GroupClause__Group_3__1 ;
    public final void rule__GroupClause__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1647:1: ( rule__GroupClause__Group_3__0__Impl rule__GroupClause__Group_3__1 )
            // InternalSQL.g:1648:2: rule__GroupClause__Group_3__0__Impl rule__GroupClause__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSQL.g:1655:1: rule__GroupClause__Group_3__0__Impl : ( ',' ) ;
    public final void rule__GroupClause__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1659:1: ( ( ',' ) )
            // InternalSQL.g:1660:1: ( ',' )
            {
            // InternalSQL.g:1660:1: ( ',' )
            // InternalSQL.g:1661:2: ','
            {
             before(grammarAccess.getGroupClauseAccess().getCommaKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSQL.g:1670:1: rule__GroupClause__Group_3__1 : rule__GroupClause__Group_3__1__Impl ;
    public final void rule__GroupClause__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1674:1: ( rule__GroupClause__Group_3__1__Impl )
            // InternalSQL.g:1675:2: rule__GroupClause__Group_3__1__Impl
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
    // InternalSQL.g:1681:1: rule__GroupClause__Group_3__1__Impl : ( ( rule__GroupClause__ExpressionsAssignment_3_1 ) ) ;
    public final void rule__GroupClause__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1685:1: ( ( ( rule__GroupClause__ExpressionsAssignment_3_1 ) ) )
            // InternalSQL.g:1686:1: ( ( rule__GroupClause__ExpressionsAssignment_3_1 ) )
            {
            // InternalSQL.g:1686:1: ( ( rule__GroupClause__ExpressionsAssignment_3_1 ) )
            // InternalSQL.g:1687:2: ( rule__GroupClause__ExpressionsAssignment_3_1 )
            {
             before(grammarAccess.getGroupClauseAccess().getExpressionsAssignment_3_1()); 
            // InternalSQL.g:1688:2: ( rule__GroupClause__ExpressionsAssignment_3_1 )
            // InternalSQL.g:1688:3: rule__GroupClause__ExpressionsAssignment_3_1
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
    // InternalSQL.g:1697:1: rule__HavingClause__Group__0 : rule__HavingClause__Group__0__Impl rule__HavingClause__Group__1 ;
    public final void rule__HavingClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1701:1: ( rule__HavingClause__Group__0__Impl rule__HavingClause__Group__1 )
            // InternalSQL.g:1702:2: rule__HavingClause__Group__0__Impl rule__HavingClause__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalSQL.g:1709:1: rule__HavingClause__Group__0__Impl : ( 'HAVING' ) ;
    public final void rule__HavingClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1713:1: ( ( 'HAVING' ) )
            // InternalSQL.g:1714:1: ( 'HAVING' )
            {
            // InternalSQL.g:1714:1: ( 'HAVING' )
            // InternalSQL.g:1715:2: 'HAVING'
            {
             before(grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSQL.g:1724:1: rule__HavingClause__Group__1 : rule__HavingClause__Group__1__Impl ;
    public final void rule__HavingClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1728:1: ( rule__HavingClause__Group__1__Impl )
            // InternalSQL.g:1729:2: rule__HavingClause__Group__1__Impl
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
    // InternalSQL.g:1735:1: rule__HavingClause__Group__1__Impl : ( ( rule__HavingClause__ExprAssignment_1 ) ) ;
    public final void rule__HavingClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1739:1: ( ( ( rule__HavingClause__ExprAssignment_1 ) ) )
            // InternalSQL.g:1740:1: ( ( rule__HavingClause__ExprAssignment_1 ) )
            {
            // InternalSQL.g:1740:1: ( ( rule__HavingClause__ExprAssignment_1 ) )
            // InternalSQL.g:1741:2: ( rule__HavingClause__ExprAssignment_1 )
            {
             before(grammarAccess.getHavingClauseAccess().getExprAssignment_1()); 
            // InternalSQL.g:1742:2: ( rule__HavingClause__ExprAssignment_1 )
            // InternalSQL.g:1742:3: rule__HavingClause__ExprAssignment_1
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


    // $ANTLR start "rule__Expression__Group_3__0"
    // InternalSQL.g:1751:1: rule__Expression__Group_3__0 : rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 ;
    public final void rule__Expression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1755:1: ( rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1 )
            // InternalSQL.g:1756:2: rule__Expression__Group_3__0__Impl rule__Expression__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Expression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__1();

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
    // $ANTLR end "rule__Expression__Group_3__0"


    // $ANTLR start "rule__Expression__Group_3__0__Impl"
    // InternalSQL.g:1763:1: rule__Expression__Group_3__0__Impl : ( 'sum(' ) ;
    public final void rule__Expression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1767:1: ( ( 'sum(' ) )
            // InternalSQL.g:1768:1: ( 'sum(' )
            {
            // InternalSQL.g:1768:1: ( 'sum(' )
            // InternalSQL.g:1769:2: 'sum('
            {
             before(grammarAccess.getExpressionAccess().getSumKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getSumKeyword_3_0()); 

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
    // $ANTLR end "rule__Expression__Group_3__0__Impl"


    // $ANTLR start "rule__Expression__Group_3__1"
    // InternalSQL.g:1778:1: rule__Expression__Group_3__1 : rule__Expression__Group_3__1__Impl rule__Expression__Group_3__2 ;
    public final void rule__Expression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1782:1: ( rule__Expression__Group_3__1__Impl rule__Expression__Group_3__2 )
            // InternalSQL.g:1783:2: rule__Expression__Group_3__1__Impl rule__Expression__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__Expression__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__2();

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
    // $ANTLR end "rule__Expression__Group_3__1"


    // $ANTLR start "rule__Expression__Group_3__1__Impl"
    // InternalSQL.g:1790:1: rule__Expression__Group_3__1__Impl : ( ( rule__Expression__ColAssignment_3_1 ) ) ;
    public final void rule__Expression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1794:1: ( ( ( rule__Expression__ColAssignment_3_1 ) ) )
            // InternalSQL.g:1795:1: ( ( rule__Expression__ColAssignment_3_1 ) )
            {
            // InternalSQL.g:1795:1: ( ( rule__Expression__ColAssignment_3_1 ) )
            // InternalSQL.g:1796:2: ( rule__Expression__ColAssignment_3_1 )
            {
             before(grammarAccess.getExpressionAccess().getColAssignment_3_1()); 
            // InternalSQL.g:1797:2: ( rule__Expression__ColAssignment_3_1 )
            // InternalSQL.g:1797:3: rule__Expression__ColAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ColAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getColAssignment_3_1()); 

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
    // $ANTLR end "rule__Expression__Group_3__1__Impl"


    // $ANTLR start "rule__Expression__Group_3__2"
    // InternalSQL.g:1805:1: rule__Expression__Group_3__2 : rule__Expression__Group_3__2__Impl ;
    public final void rule__Expression__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1809:1: ( rule__Expression__Group_3__2__Impl )
            // InternalSQL.g:1810:2: rule__Expression__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_3__2__Impl();

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
    // $ANTLR end "rule__Expression__Group_3__2"


    // $ANTLR start "rule__Expression__Group_3__2__Impl"
    // InternalSQL.g:1816:1: rule__Expression__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Expression__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1820:1: ( ( ')' ) )
            // InternalSQL.g:1821:1: ( ')' )
            {
            // InternalSQL.g:1821:1: ( ')' )
            // InternalSQL.g:1822:2: ')'
            {
             before(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_3_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__Expression__Group_3__2__Impl"


    // $ANTLR start "rule__Model__StatementsAssignment"
    // InternalSQL.g:1832:1: rule__Model__StatementsAssignment : ( ruleselect ) ;
    public final void rule__Model__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1836:1: ( ( ruleselect ) )
            // InternalSQL.g:1837:2: ( ruleselect )
            {
            // InternalSQL.g:1837:2: ( ruleselect )
            // InternalSQL.g:1838:3: ruleselect
            {
             before(grammarAccess.getModelAccess().getStatementsSelectParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleselect();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStatementsSelectParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__StatementsAssignment"


    // $ANTLR start "rule__Select__ExpressionsAssignment_1"
    // InternalSQL.g:1847:1: rule__Select__ExpressionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__Select__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1851:1: ( ( ruleExpression ) )
            // InternalSQL.g:1852:2: ( ruleExpression )
            {
            // InternalSQL.g:1852:2: ( ruleExpression )
            // InternalSQL.g:1853:3: ruleExpression
            {
             before(grammarAccess.getSelectAccess().getExpressionsExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getExpressionsExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Select__ExpressionsAssignment_1"


    // $ANTLR start "rule__Select__ExpressionsAssignment_2_1"
    // InternalSQL.g:1862:1: rule__Select__ExpressionsAssignment_2_1 : ( ruleExpression ) ;
    public final void rule__Select__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1866:1: ( ( ruleExpression ) )
            // InternalSQL.g:1867:2: ( ruleExpression )
            {
            // InternalSQL.g:1867:2: ( ruleExpression )
            // InternalSQL.g:1868:3: ruleExpression
            {
             before(grammarAccess.getSelectAccess().getExpressionsExpressionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getExpressionsExpressionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Select__ExpressionsAssignment_2_1"


    // $ANTLR start "rule__Select__FromSectionAssignment_3"
    // InternalSQL.g:1877:1: rule__Select__FromSectionAssignment_3 : ( rulefromSection ) ;
    public final void rule__Select__FromSectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1881:1: ( ( rulefromSection ) )
            // InternalSQL.g:1882:2: ( rulefromSection )
            {
            // InternalSQL.g:1882:2: ( rulefromSection )
            // InternalSQL.g:1883:3: rulefromSection
            {
             before(grammarAccess.getSelectAccess().getFromSectionFromSectionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulefromSection();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getFromSectionFromSectionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Select__FromSectionAssignment_3"


    // $ANTLR start "rule__Select__WhereClauseAssignment_4"
    // InternalSQL.g:1892:1: rule__Select__WhereClauseAssignment_4 : ( ruleWhereClause ) ;
    public final void rule__Select__WhereClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1896:1: ( ( ruleWhereClause ) )
            // InternalSQL.g:1897:2: ( ruleWhereClause )
            {
            // InternalSQL.g:1897:2: ( ruleWhereClause )
            // InternalSQL.g:1898:3: ruleWhereClause
            {
             before(grammarAccess.getSelectAccess().getWhereClauseWhereClauseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereClause();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getWhereClauseWhereClauseParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Select__WhereClauseAssignment_4"


    // $ANTLR start "rule__Select__GroupClauseAssignment_5"
    // InternalSQL.g:1907:1: rule__Select__GroupClauseAssignment_5 : ( ruleGroupClause ) ;
    public final void rule__Select__GroupClauseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1911:1: ( ( ruleGroupClause ) )
            // InternalSQL.g:1912:2: ( ruleGroupClause )
            {
            // InternalSQL.g:1912:2: ( ruleGroupClause )
            // InternalSQL.g:1913:3: ruleGroupClause
            {
             before(grammarAccess.getSelectAccess().getGroupClauseGroupClauseParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupClause();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getGroupClauseGroupClauseParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Select__GroupClauseAssignment_5"


    // $ANTLR start "rule__Select__HavingClauseAssignment_6"
    // InternalSQL.g:1922:1: rule__Select__HavingClauseAssignment_6 : ( ruleHavingClause ) ;
    public final void rule__Select__HavingClauseAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1926:1: ( ( ruleHavingClause ) )
            // InternalSQL.g:1927:2: ( ruleHavingClause )
            {
            // InternalSQL.g:1927:2: ( ruleHavingClause )
            // InternalSQL.g:1928:3: ruleHavingClause
            {
             before(grammarAccess.getSelectAccess().getHavingClauseHavingClauseParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleHavingClause();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getHavingClauseHavingClauseParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Select__HavingClauseAssignment_6"


    // $ANTLR start "rule__FromSection__FromItemAssignment_1"
    // InternalSQL.g:1937:1: rule__FromSection__FromItemAssignment_1 : ( ruleFromItem ) ;
    public final void rule__FromSection__FromItemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1941:1: ( ( ruleFromItem ) )
            // InternalSQL.g:1942:2: ( ruleFromItem )
            {
            // InternalSQL.g:1942:2: ( ruleFromItem )
            // InternalSQL.g:1943:3: ruleFromItem
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


    // $ANTLR start "rule__FromItem__TableNameAssignment_0_0"
    // InternalSQL.g:1952:1: rule__FromItem__TableNameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__FromItem__TableNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1956:1: ( ( RULE_ID ) )
            // InternalSQL.g:1957:2: ( RULE_ID )
            {
            // InternalSQL.g:1957:2: ( RULE_ID )
            // InternalSQL.g:1958:3: RULE_ID
            {
             before(grammarAccess.getFromItemAccess().getTableNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFromItemAccess().getTableNameIDTerminalRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__FromItem__TableNameAssignment_0_0"


    // $ANTLR start "rule__FromItem__Select_exprAssignment_0_1_1"
    // InternalSQL.g:1967:1: rule__FromItem__Select_exprAssignment_0_1_1 : ( ruleselect ) ;
    public final void rule__FromItem__Select_exprAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1971:1: ( ( ruleselect ) )
            // InternalSQL.g:1972:2: ( ruleselect )
            {
            // InternalSQL.g:1972:2: ( ruleselect )
            // InternalSQL.g:1973:3: ruleselect
            {
             before(grammarAccess.getFromItemAccess().getSelect_exprSelectParserRuleCall_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleselect();

            state._fsp--;

             after(grammarAccess.getFromItemAccess().getSelect_exprSelectParserRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__FromItem__Select_exprAssignment_0_1_1"


    // $ANTLR start "rule__FromItem__RhsAssignment_1_1"
    // InternalSQL.g:1982:1: rule__FromItem__RhsAssignment_1_1 : ( ruleFromItem ) ;
    public final void rule__FromItem__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:1986:1: ( ( ruleFromItem ) )
            // InternalSQL.g:1987:2: ( ruleFromItem )
            {
            // InternalSQL.g:1987:2: ( ruleFromItem )
            // InternalSQL.g:1988:3: ruleFromItem
            {
             before(grammarAccess.getFromItemAccess().getRhsFromItemParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFromItem();

            state._fsp--;

             after(grammarAccess.getFromItemAccess().getRhsFromItemParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__FromItem__RhsAssignment_1_1"


    // $ANTLR start "rule__FromItem__Bool_exprAssignment_1_3"
    // InternalSQL.g:1997:1: rule__FromItem__Bool_exprAssignment_1_3 : ( ruleBoolExpression ) ;
    public final void rule__FromItem__Bool_exprAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2001:1: ( ( ruleBoolExpression ) )
            // InternalSQL.g:2002:2: ( ruleBoolExpression )
            {
            // InternalSQL.g:2002:2: ( ruleBoolExpression )
            // InternalSQL.g:2003:3: ruleBoolExpression
            {
             before(grammarAccess.getFromItemAccess().getBool_exprBoolExpressionParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolExpression();

            state._fsp--;

             after(grammarAccess.getFromItemAccess().getBool_exprBoolExpressionParserRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__FromItem__Bool_exprAssignment_1_3"


    // $ANTLR start "rule__WhereClause__BoolExpressionAssignment_1"
    // InternalSQL.g:2012:1: rule__WhereClause__BoolExpressionAssignment_1 : ( ruleBoolExpression ) ;
    public final void rule__WhereClause__BoolExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2016:1: ( ( ruleBoolExpression ) )
            // InternalSQL.g:2017:2: ( ruleBoolExpression )
            {
            // InternalSQL.g:2017:2: ( ruleBoolExpression )
            // InternalSQL.g:2018:3: ruleBoolExpression
            {
             before(grammarAccess.getWhereClauseAccess().getBoolExpressionBoolExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolExpression();

            state._fsp--;

             after(grammarAccess.getWhereClauseAccess().getBoolExpressionBoolExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__WhereClause__BoolExpressionAssignment_1"


    // $ANTLR start "rule__BoolExpression__LhsAssignment_0"
    // InternalSQL.g:2027:1: rule__BoolExpression__LhsAssignment_0 : ( ruleTerm ) ;
    public final void rule__BoolExpression__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2031:1: ( ( ruleTerm ) )
            // InternalSQL.g:2032:2: ( ruleTerm )
            {
            // InternalSQL.g:2032:2: ( ruleTerm )
            // InternalSQL.g:2033:3: ruleTerm
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
    // InternalSQL.g:2042:1: rule__BoolExpression__RhsAssignment_1_1 : ( ruleTerm ) ;
    public final void rule__BoolExpression__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2046:1: ( ( ruleTerm ) )
            // InternalSQL.g:2047:2: ( ruleTerm )
            {
            // InternalSQL.g:2047:2: ( ruleTerm )
            // InternalSQL.g:2048:3: ruleTerm
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
    // InternalSQL.g:2057:1: rule__Term__LhsAssignment_0 : ( ruleFactor ) ;
    public final void rule__Term__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2061:1: ( ( ruleFactor ) )
            // InternalSQL.g:2062:2: ( ruleFactor )
            {
            // InternalSQL.g:2062:2: ( ruleFactor )
            // InternalSQL.g:2063:3: ruleFactor
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
    // InternalSQL.g:2072:1: rule__Term__RhsAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Term__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2076:1: ( ( ruleFactor ) )
            // InternalSQL.g:2077:2: ( ruleFactor )
            {
            // InternalSQL.g:2077:2: ( ruleFactor )
            // InternalSQL.g:2078:3: ruleFactor
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
    // InternalSQL.g:2087:1: rule__Factor__FactorAssignment_0_1 : ( ruleFactor ) ;
    public final void rule__Factor__FactorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2091:1: ( ( ruleFactor ) )
            // InternalSQL.g:2092:2: ( ruleFactor )
            {
            // InternalSQL.g:2092:2: ( ruleFactor )
            // InternalSQL.g:2093:3: ruleFactor
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
    // InternalSQL.g:2102:1: rule__Factor__ExprAssignment_1_1 : ( ruleBoolExpression ) ;
    public final void rule__Factor__ExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2106:1: ( ( ruleBoolExpression ) )
            // InternalSQL.g:2107:2: ( ruleBoolExpression )
            {
            // InternalSQL.g:2107:2: ( ruleBoolExpression )
            // InternalSQL.g:2108:3: ruleBoolExpression
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
    // InternalSQL.g:2117:1: rule__Factor__BinexpAssignment_4 : ( ruleBinary ) ;
    public final void rule__Factor__BinexpAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2121:1: ( ( ruleBinary ) )
            // InternalSQL.g:2122:2: ( ruleBinary )
            {
            // InternalSQL.g:2122:2: ( ruleBinary )
            // InternalSQL.g:2123:3: ruleBinary
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
    // InternalSQL.g:2132:1: rule__Binary__LhsAssignment_0 : ( ruleColumn ) ;
    public final void rule__Binary__LhsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2136:1: ( ( ruleColumn ) )
            // InternalSQL.g:2137:2: ( ruleColumn )
            {
            // InternalSQL.g:2137:2: ( ruleColumn )
            // InternalSQL.g:2138:3: ruleColumn
            {
             before(grammarAccess.getBinaryAccess().getLhsColumnParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getLhsColumnParserRuleCall_0_0()); 

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
    // InternalSQL.g:2147:1: rule__Binary__RhsAssignment_2 : ( ruleColumn ) ;
    public final void rule__Binary__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2151:1: ( ( ruleColumn ) )
            // InternalSQL.g:2152:2: ( ruleColumn )
            {
            // InternalSQL.g:2152:2: ( ruleColumn )
            // InternalSQL.g:2153:3: ruleColumn
            {
             before(grammarAccess.getBinaryAccess().getRhsColumnParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getBinaryAccess().getRhsColumnParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__Column__NameAssignment"
    // InternalSQL.g:2162:1: rule__Column__NameAssignment : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2166:1: ( ( RULE_ID ) )
            // InternalSQL.g:2167:2: ( RULE_ID )
            {
            // InternalSQL.g:2167:2: ( RULE_ID )
            // InternalSQL.g:2168:3: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Column__NameAssignment"


    // $ANTLR start "rule__GroupClause__ExpressionsAssignment_2"
    // InternalSQL.g:2177:1: rule__GroupClause__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__GroupClause__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2181:1: ( ( ruleExpression ) )
            // InternalSQL.g:2182:2: ( ruleExpression )
            {
            // InternalSQL.g:2182:2: ( ruleExpression )
            // InternalSQL.g:2183:3: ruleExpression
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
    // InternalSQL.g:2192:1: rule__GroupClause__ExpressionsAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__GroupClause__ExpressionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2196:1: ( ( ruleExpression ) )
            // InternalSQL.g:2197:2: ( ruleExpression )
            {
            // InternalSQL.g:2197:2: ( ruleExpression )
            // InternalSQL.g:2198:3: ruleExpression
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
    // InternalSQL.g:2207:1: rule__HavingClause__ExprAssignment_1 : ( ruleBoolExpression ) ;
    public final void rule__HavingClause__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2211:1: ( ( ruleBoolExpression ) )
            // InternalSQL.g:2212:2: ( ruleBoolExpression )
            {
            // InternalSQL.g:2212:2: ( ruleBoolExpression )
            // InternalSQL.g:2213:3: ruleBoolExpression
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


    // $ANTLR start "rule__Expression__ColAssignment_1"
    // InternalSQL.g:2222:1: rule__Expression__ColAssignment_1 : ( ruleColumn ) ;
    public final void rule__Expression__ColAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2226:1: ( ( ruleColumn ) )
            // InternalSQL.g:2227:2: ( ruleColumn )
            {
            // InternalSQL.g:2227:2: ( ruleColumn )
            // InternalSQL.g:2228:3: ruleColumn
            {
             before(grammarAccess.getExpressionAccess().getColColumnParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getColColumnParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Expression__ColAssignment_1"


    // $ANTLR start "rule__Expression__ColAssignment_3_1"
    // InternalSQL.g:2237:1: rule__Expression__ColAssignment_3_1 : ( ruleColumn ) ;
    public final void rule__Expression__ColAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSQL.g:2241:1: ( ( ruleColumn ) )
            // InternalSQL.g:2242:2: ( ruleColumn )
            {
            // InternalSQL.g:2242:2: ( ruleColumn )
            // InternalSQL.g:2243:3: ruleColumn
            {
             before(grammarAccess.getExpressionAccess().getColColumnParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getColColumnParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Expression__ColAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000004000C0010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000288600000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040801810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});

}