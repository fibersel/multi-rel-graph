package org.xtext.example.s2c.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.s2c.services.SQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SELECT'", "','", "'FROM'", "'('", "')'", "'JOIN'", "'ON'", "'WHERE'", "'OR'", "'AND'", "'NOT'", "'TRUE'", "'FALSE'", "'<'", "'>'", "'='", "'>='", "'<='", "'GROUP'", "'BY'", "'HAVING'", "'*'", "'count()'", "'sum('"
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

        public InternalSQLParser(TokenStream input, SQLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SQLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSQL.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSQL.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSQL.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSQL.g:71:1: ruleModel returns [EObject current=null] : ( (lv_statements_0_0= ruleselect ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:77:2: ( ( (lv_statements_0_0= ruleselect ) ) )
            // InternalSQL.g:78:2: ( (lv_statements_0_0= ruleselect ) )
            {
            // InternalSQL.g:78:2: ( (lv_statements_0_0= ruleselect ) )
            // InternalSQL.g:79:3: (lv_statements_0_0= ruleselect )
            {
            // InternalSQL.g:79:3: (lv_statements_0_0= ruleselect )
            // InternalSQL.g:80:4: lv_statements_0_0= ruleselect
            {

            				newCompositeNode(grammarAccess.getModelAccess().getStatementsSelectParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_statements_0_0=ruleselect();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getModelRule());
            				}
            				add(
            					current,
            					"statements",
            					lv_statements_0_0,
            					"org.xtext.example.s2c.SQL.select");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleselect"
    // InternalSQL.g:100:1: entryRuleselect returns [EObject current=null] : iv_ruleselect= ruleselect EOF ;
    public final EObject entryRuleselect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleselect = null;


        try {
            // InternalSQL.g:100:47: (iv_ruleselect= ruleselect EOF )
            // InternalSQL.g:101:2: iv_ruleselect= ruleselect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleselect=ruleselect();

            state._fsp--;

             current =iv_ruleselect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleselect"


    // $ANTLR start "ruleselect"
    // InternalSQL.g:107:1: ruleselect returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* ( (lv_fromSection_4_0= rulefromSection ) )? ( (lv_whereClause_5_0= ruleWhereClause ) )? ( (lv_groupClause_6_0= ruleGroupClause ) )? ( (lv_havingClause_7_0= ruleHavingClause ) )? ) ;
    public final EObject ruleselect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;

        EObject lv_fromSection_4_0 = null;

        EObject lv_whereClause_5_0 = null;

        EObject lv_groupClause_6_0 = null;

        EObject lv_havingClause_7_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:113:2: ( (otherlv_0= 'SELECT' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* ( (lv_fromSection_4_0= rulefromSection ) )? ( (lv_whereClause_5_0= ruleWhereClause ) )? ( (lv_groupClause_6_0= ruleGroupClause ) )? ( (lv_havingClause_7_0= ruleHavingClause ) )? ) )
            // InternalSQL.g:114:2: (otherlv_0= 'SELECT' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* ( (lv_fromSection_4_0= rulefromSection ) )? ( (lv_whereClause_5_0= ruleWhereClause ) )? ( (lv_groupClause_6_0= ruleGroupClause ) )? ( (lv_havingClause_7_0= ruleHavingClause ) )? )
            {
            // InternalSQL.g:114:2: (otherlv_0= 'SELECT' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* ( (lv_fromSection_4_0= rulefromSection ) )? ( (lv_whereClause_5_0= ruleWhereClause ) )? ( (lv_groupClause_6_0= ruleGroupClause ) )? ( (lv_havingClause_7_0= ruleHavingClause ) )? )
            // InternalSQL.g:115:3: otherlv_0= 'SELECT' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* ( (lv_fromSection_4_0= rulefromSection ) )? ( (lv_whereClause_5_0= ruleWhereClause ) )? ( (lv_groupClause_6_0= ruleGroupClause ) )? ( (lv_havingClause_7_0= ruleHavingClause ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSELECTKeyword_0());
            		
            // InternalSQL.g:119:3: ( (lv_expressions_1_0= ruleExpression ) )
            // InternalSQL.g:120:4: (lv_expressions_1_0= ruleExpression )
            {
            // InternalSQL.g:120:4: (lv_expressions_1_0= ruleExpression )
            // InternalSQL.g:121:5: lv_expressions_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getExpressionsExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_expressions_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_1_0,
            						"org.xtext.example.s2c.SQL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSQL.g:138:3: (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSQL.g:139:4: otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSQL.g:143:4: ( (lv_expressions_3_0= ruleExpression ) )
            	    // InternalSQL.g:144:5: (lv_expressions_3_0= ruleExpression )
            	    {
            	    // InternalSQL.g:144:5: (lv_expressions_3_0= ruleExpression )
            	    // InternalSQL.g:145:6: lv_expressions_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getSelectAccess().getExpressionsExpressionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_expressions_3_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_3_0,
            	    							"org.xtext.example.s2c.SQL.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSQL.g:163:3: ( (lv_fromSection_4_0= rulefromSection ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSQL.g:164:4: (lv_fromSection_4_0= rulefromSection )
                    {
                    // InternalSQL.g:164:4: (lv_fromSection_4_0= rulefromSection )
                    // InternalSQL.g:165:5: lv_fromSection_4_0= rulefromSection
                    {

                    					newCompositeNode(grammarAccess.getSelectAccess().getFromSectionFromSectionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_fromSection_4_0=rulefromSection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectRule());
                    					}
                    					set(
                    						current,
                    						"fromSection",
                    						lv_fromSection_4_0,
                    						"org.xtext.example.s2c.SQL.fromSection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSQL.g:182:3: ( (lv_whereClause_5_0= ruleWhereClause ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSQL.g:183:4: (lv_whereClause_5_0= ruleWhereClause )
                    {
                    // InternalSQL.g:183:4: (lv_whereClause_5_0= ruleWhereClause )
                    // InternalSQL.g:184:5: lv_whereClause_5_0= ruleWhereClause
                    {

                    					newCompositeNode(grammarAccess.getSelectAccess().getWhereClauseWhereClauseParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_whereClause_5_0=ruleWhereClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectRule());
                    					}
                    					set(
                    						current,
                    						"whereClause",
                    						lv_whereClause_5_0,
                    						"org.xtext.example.s2c.SQL.WhereClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSQL.g:201:3: ( (lv_groupClause_6_0= ruleGroupClause ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSQL.g:202:4: (lv_groupClause_6_0= ruleGroupClause )
                    {
                    // InternalSQL.g:202:4: (lv_groupClause_6_0= ruleGroupClause )
                    // InternalSQL.g:203:5: lv_groupClause_6_0= ruleGroupClause
                    {

                    					newCompositeNode(grammarAccess.getSelectAccess().getGroupClauseGroupClauseParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_groupClause_6_0=ruleGroupClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectRule());
                    					}
                    					set(
                    						current,
                    						"groupClause",
                    						lv_groupClause_6_0,
                    						"org.xtext.example.s2c.SQL.GroupClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSQL.g:220:3: ( (lv_havingClause_7_0= ruleHavingClause ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSQL.g:221:4: (lv_havingClause_7_0= ruleHavingClause )
                    {
                    // InternalSQL.g:221:4: (lv_havingClause_7_0= ruleHavingClause )
                    // InternalSQL.g:222:5: lv_havingClause_7_0= ruleHavingClause
                    {

                    					newCompositeNode(grammarAccess.getSelectAccess().getHavingClauseHavingClauseParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_havingClause_7_0=ruleHavingClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSelectRule());
                    					}
                    					set(
                    						current,
                    						"havingClause",
                    						lv_havingClause_7_0,
                    						"org.xtext.example.s2c.SQL.HavingClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleselect"


    // $ANTLR start "entryRulefromSection"
    // InternalSQL.g:243:1: entryRulefromSection returns [EObject current=null] : iv_rulefromSection= rulefromSection EOF ;
    public final EObject entryRulefromSection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefromSection = null;


        try {
            // InternalSQL.g:243:52: (iv_rulefromSection= rulefromSection EOF )
            // InternalSQL.g:244:2: iv_rulefromSection= rulefromSection EOF
            {
             newCompositeNode(grammarAccess.getFromSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefromSection=rulefromSection();

            state._fsp--;

             current =iv_rulefromSection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefromSection"


    // $ANTLR start "rulefromSection"
    // InternalSQL.g:250:1: rulefromSection returns [EObject current=null] : (otherlv_0= 'FROM' ( (lv_fromItem_1_0= ruleFromItem ) ) ) ;
    public final EObject rulefromSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fromItem_1_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:256:2: ( (otherlv_0= 'FROM' ( (lv_fromItem_1_0= ruleFromItem ) ) ) )
            // InternalSQL.g:257:2: (otherlv_0= 'FROM' ( (lv_fromItem_1_0= ruleFromItem ) ) )
            {
            // InternalSQL.g:257:2: (otherlv_0= 'FROM' ( (lv_fromItem_1_0= ruleFromItem ) ) )
            // InternalSQL.g:258:3: otherlv_0= 'FROM' ( (lv_fromItem_1_0= ruleFromItem ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFromSectionAccess().getFROMKeyword_0());
            		
            // InternalSQL.g:262:3: ( (lv_fromItem_1_0= ruleFromItem ) )
            // InternalSQL.g:263:4: (lv_fromItem_1_0= ruleFromItem )
            {
            // InternalSQL.g:263:4: (lv_fromItem_1_0= ruleFromItem )
            // InternalSQL.g:264:5: lv_fromItem_1_0= ruleFromItem
            {

            					newCompositeNode(grammarAccess.getFromSectionAccess().getFromItemFromItemParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_fromItem_1_0=ruleFromItem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFromSectionRule());
            					}
            					set(
            						current,
            						"fromItem",
            						lv_fromItem_1_0,
            						"org.xtext.example.s2c.SQL.FromItem");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefromSection"


    // $ANTLR start "entryRuleFromItem"
    // InternalSQL.g:285:1: entryRuleFromItem returns [EObject current=null] : iv_ruleFromItem= ruleFromItem EOF ;
    public final EObject entryRuleFromItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromItem = null;


        try {
            // InternalSQL.g:285:49: (iv_ruleFromItem= ruleFromItem EOF )
            // InternalSQL.g:286:2: iv_ruleFromItem= ruleFromItem EOF
            {
             newCompositeNode(grammarAccess.getFromItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFromItem=ruleFromItem();

            state._fsp--;

             current =iv_ruleFromItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFromItem"


    // $ANTLR start "ruleFromItem"
    // InternalSQL.g:292:1: ruleFromItem returns [EObject current=null] : ( ( ( (lv_tableName_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_select_expr_2_0= ruleselect ) ) otherlv_3= ')' ) ) (otherlv_4= 'JOIN' ( (lv_rhs_5_0= ruleFromItem ) ) otherlv_6= 'ON' ( (lv_bool_expr_7_0= ruleBoolExpression ) ) )? ) ;
    public final EObject ruleFromItem() throws RecognitionException {
        EObject current = null;

        Token lv_tableName_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_select_expr_2_0 = null;

        EObject lv_rhs_5_0 = null;

        EObject lv_bool_expr_7_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:298:2: ( ( ( ( (lv_tableName_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_select_expr_2_0= ruleselect ) ) otherlv_3= ')' ) ) (otherlv_4= 'JOIN' ( (lv_rhs_5_0= ruleFromItem ) ) otherlv_6= 'ON' ( (lv_bool_expr_7_0= ruleBoolExpression ) ) )? ) )
            // InternalSQL.g:299:2: ( ( ( (lv_tableName_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_select_expr_2_0= ruleselect ) ) otherlv_3= ')' ) ) (otherlv_4= 'JOIN' ( (lv_rhs_5_0= ruleFromItem ) ) otherlv_6= 'ON' ( (lv_bool_expr_7_0= ruleBoolExpression ) ) )? )
            {
            // InternalSQL.g:299:2: ( ( ( (lv_tableName_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_select_expr_2_0= ruleselect ) ) otherlv_3= ')' ) ) (otherlv_4= 'JOIN' ( (lv_rhs_5_0= ruleFromItem ) ) otherlv_6= 'ON' ( (lv_bool_expr_7_0= ruleBoolExpression ) ) )? )
            // InternalSQL.g:300:3: ( ( (lv_tableName_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_select_expr_2_0= ruleselect ) ) otherlv_3= ')' ) ) (otherlv_4= 'JOIN' ( (lv_rhs_5_0= ruleFromItem ) ) otherlv_6= 'ON' ( (lv_bool_expr_7_0= ruleBoolExpression ) ) )?
            {
            // InternalSQL.g:300:3: ( ( (lv_tableName_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_select_expr_2_0= ruleselect ) ) otherlv_3= ')' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSQL.g:301:4: ( (lv_tableName_0_0= RULE_ID ) )
                    {
                    // InternalSQL.g:301:4: ( (lv_tableName_0_0= RULE_ID ) )
                    // InternalSQL.g:302:5: (lv_tableName_0_0= RULE_ID )
                    {
                    // InternalSQL.g:302:5: (lv_tableName_0_0= RULE_ID )
                    // InternalSQL.g:303:6: lv_tableName_0_0= RULE_ID
                    {
                    lv_tableName_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_tableName_0_0, grammarAccess.getFromItemAccess().getTableNameIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFromItemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tableName",
                    							lv_tableName_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:320:4: (otherlv_1= '(' ( (lv_select_expr_2_0= ruleselect ) ) otherlv_3= ')' )
                    {
                    // InternalSQL.g:320:4: (otherlv_1= '(' ( (lv_select_expr_2_0= ruleselect ) ) otherlv_3= ')' )
                    // InternalSQL.g:321:5: otherlv_1= '(' ( (lv_select_expr_2_0= ruleselect ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_10); 

                    					newLeafNode(otherlv_1, grammarAccess.getFromItemAccess().getLeftParenthesisKeyword_0_1_0());
                    				
                    // InternalSQL.g:325:5: ( (lv_select_expr_2_0= ruleselect ) )
                    // InternalSQL.g:326:6: (lv_select_expr_2_0= ruleselect )
                    {
                    // InternalSQL.g:326:6: (lv_select_expr_2_0= ruleselect )
                    // InternalSQL.g:327:7: lv_select_expr_2_0= ruleselect
                    {

                    							newCompositeNode(grammarAccess.getFromItemAccess().getSelect_exprSelectParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_11);
                    lv_select_expr_2_0=ruleselect();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getFromItemRule());
                    							}
                    							set(
                    								current,
                    								"select_expr",
                    								lv_select_expr_2_0,
                    								"org.xtext.example.s2c.SQL.select");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_9); 

                    					newLeafNode(otherlv_3, grammarAccess.getFromItemAccess().getRightParenthesisKeyword_0_1_2());
                    				

                    }


                    }
                    break;

            }

            // InternalSQL.g:350:3: (otherlv_4= 'JOIN' ( (lv_rhs_5_0= ruleFromItem ) ) otherlv_6= 'ON' ( (lv_bool_expr_7_0= ruleBoolExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSQL.g:351:4: otherlv_4= 'JOIN' ( (lv_rhs_5_0= ruleFromItem ) ) otherlv_6= 'ON' ( (lv_bool_expr_7_0= ruleBoolExpression ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getFromItemAccess().getJOINKeyword_1_0());
                    			
                    // InternalSQL.g:355:4: ( (lv_rhs_5_0= ruleFromItem ) )
                    // InternalSQL.g:356:5: (lv_rhs_5_0= ruleFromItem )
                    {
                    // InternalSQL.g:356:5: (lv_rhs_5_0= ruleFromItem )
                    // InternalSQL.g:357:6: lv_rhs_5_0= ruleFromItem
                    {

                    						newCompositeNode(grammarAccess.getFromItemAccess().getRhsFromItemParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_rhs_5_0=ruleFromItem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFromItemRule());
                    						}
                    						set(
                    							current,
                    							"rhs",
                    							lv_rhs_5_0,
                    							"org.xtext.example.s2c.SQL.FromItem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getFromItemAccess().getONKeyword_1_2());
                    			
                    // InternalSQL.g:378:4: ( (lv_bool_expr_7_0= ruleBoolExpression ) )
                    // InternalSQL.g:379:5: (lv_bool_expr_7_0= ruleBoolExpression )
                    {
                    // InternalSQL.g:379:5: (lv_bool_expr_7_0= ruleBoolExpression )
                    // InternalSQL.g:380:6: lv_bool_expr_7_0= ruleBoolExpression
                    {

                    						newCompositeNode(grammarAccess.getFromItemAccess().getBool_exprBoolExpressionParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_bool_expr_7_0=ruleBoolExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFromItemRule());
                    						}
                    						set(
                    							current,
                    							"bool_expr",
                    							lv_bool_expr_7_0,
                    							"org.xtext.example.s2c.SQL.BoolExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFromItem"


    // $ANTLR start "entryRuleWhereClause"
    // InternalSQL.g:402:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // InternalSQL.g:402:52: (iv_ruleWhereClause= ruleWhereClause EOF )
            // InternalSQL.g:403:2: iv_ruleWhereClause= ruleWhereClause EOF
            {
             newCompositeNode(grammarAccess.getWhereClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhereClause=ruleWhereClause();

            state._fsp--;

             current =iv_ruleWhereClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // InternalSQL.g:409:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= 'WHERE' ( (lv_boolExpression_1_0= ruleBoolExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_boolExpression_1_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:415:2: ( (otherlv_0= 'WHERE' ( (lv_boolExpression_1_0= ruleBoolExpression ) ) ) )
            // InternalSQL.g:416:2: (otherlv_0= 'WHERE' ( (lv_boolExpression_1_0= ruleBoolExpression ) ) )
            {
            // InternalSQL.g:416:2: (otherlv_0= 'WHERE' ( (lv_boolExpression_1_0= ruleBoolExpression ) ) )
            // InternalSQL.g:417:3: otherlv_0= 'WHERE' ( (lv_boolExpression_1_0= ruleBoolExpression ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
            		
            // InternalSQL.g:421:3: ( (lv_boolExpression_1_0= ruleBoolExpression ) )
            // InternalSQL.g:422:4: (lv_boolExpression_1_0= ruleBoolExpression )
            {
            // InternalSQL.g:422:4: (lv_boolExpression_1_0= ruleBoolExpression )
            // InternalSQL.g:423:5: lv_boolExpression_1_0= ruleBoolExpression
            {

            					newCompositeNode(grammarAccess.getWhereClauseAccess().getBoolExpressionBoolExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_boolExpression_1_0=ruleBoolExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhereClauseRule());
            					}
            					set(
            						current,
            						"boolExpression",
            						lv_boolExpression_1_0,
            						"org.xtext.example.s2c.SQL.BoolExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleBoolExpression"
    // InternalSQL.g:444:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalSQL.g:444:55: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalSQL.g:445:2: iv_ruleBoolExpression= ruleBoolExpression EOF
            {
             newCompositeNode(grammarAccess.getBoolExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolExpression=ruleBoolExpression();

            state._fsp--;

             current =iv_ruleBoolExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolExpression"


    // $ANTLR start "ruleBoolExpression"
    // InternalSQL.g:451:1: ruleBoolExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleTerm ) ) (otherlv_1= 'OR' ( (lv_rhs_2_0= ruleTerm ) ) )? ) ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:457:2: ( ( ( (lv_lhs_0_0= ruleTerm ) ) (otherlv_1= 'OR' ( (lv_rhs_2_0= ruleTerm ) ) )? ) )
            // InternalSQL.g:458:2: ( ( (lv_lhs_0_0= ruleTerm ) ) (otherlv_1= 'OR' ( (lv_rhs_2_0= ruleTerm ) ) )? )
            {
            // InternalSQL.g:458:2: ( ( (lv_lhs_0_0= ruleTerm ) ) (otherlv_1= 'OR' ( (lv_rhs_2_0= ruleTerm ) ) )? )
            // InternalSQL.g:459:3: ( (lv_lhs_0_0= ruleTerm ) ) (otherlv_1= 'OR' ( (lv_rhs_2_0= ruleTerm ) ) )?
            {
            // InternalSQL.g:459:3: ( (lv_lhs_0_0= ruleTerm ) )
            // InternalSQL.g:460:4: (lv_lhs_0_0= ruleTerm )
            {
            // InternalSQL.g:460:4: (lv_lhs_0_0= ruleTerm )
            // InternalSQL.g:461:5: lv_lhs_0_0= ruleTerm
            {

            					newCompositeNode(grammarAccess.getBoolExpressionAccess().getLhsTermParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_lhs_0_0=ruleTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoolExpressionRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"org.xtext.example.s2c.SQL.Term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSQL.g:478:3: (otherlv_1= 'OR' ( (lv_rhs_2_0= ruleTerm ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSQL.g:479:4: otherlv_1= 'OR' ( (lv_rhs_2_0= ruleTerm ) )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getBoolExpressionAccess().getORKeyword_1_0());
                    			
                    // InternalSQL.g:483:4: ( (lv_rhs_2_0= ruleTerm ) )
                    // InternalSQL.g:484:5: (lv_rhs_2_0= ruleTerm )
                    {
                    // InternalSQL.g:484:5: (lv_rhs_2_0= ruleTerm )
                    // InternalSQL.g:485:6: lv_rhs_2_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getBoolExpressionAccess().getRhsTermParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_rhs_2_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBoolExpressionRule());
                    						}
                    						set(
                    							current,
                    							"rhs",
                    							lv_rhs_2_0,
                    							"org.xtext.example.s2c.SQL.Term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolExpression"


    // $ANTLR start "entryRuleTerm"
    // InternalSQL.g:507:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalSQL.g:507:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalSQL.g:508:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalSQL.g:514:1: ruleTerm returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleFactor ) ) (otherlv_1= 'AND' ( (lv_rhs_2_0= ruleFactor ) ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:520:2: ( ( ( (lv_lhs_0_0= ruleFactor ) ) (otherlv_1= 'AND' ( (lv_rhs_2_0= ruleFactor ) ) ) ) )
            // InternalSQL.g:521:2: ( ( (lv_lhs_0_0= ruleFactor ) ) (otherlv_1= 'AND' ( (lv_rhs_2_0= ruleFactor ) ) ) )
            {
            // InternalSQL.g:521:2: ( ( (lv_lhs_0_0= ruleFactor ) ) (otherlv_1= 'AND' ( (lv_rhs_2_0= ruleFactor ) ) ) )
            // InternalSQL.g:522:3: ( (lv_lhs_0_0= ruleFactor ) ) (otherlv_1= 'AND' ( (lv_rhs_2_0= ruleFactor ) ) )
            {
            // InternalSQL.g:522:3: ( (lv_lhs_0_0= ruleFactor ) )
            // InternalSQL.g:523:4: (lv_lhs_0_0= ruleFactor )
            {
            // InternalSQL.g:523:4: (lv_lhs_0_0= ruleFactor )
            // InternalSQL.g:524:5: lv_lhs_0_0= ruleFactor
            {

            					newCompositeNode(grammarAccess.getTermAccess().getLhsFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_lhs_0_0=ruleFactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"org.xtext.example.s2c.SQL.Factor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSQL.g:541:3: (otherlv_1= 'AND' ( (lv_rhs_2_0= ruleFactor ) ) )
            // InternalSQL.g:542:4: otherlv_1= 'AND' ( (lv_rhs_2_0= ruleFactor ) )
            {
            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            				newLeafNode(otherlv_1, grammarAccess.getTermAccess().getANDKeyword_1_0());
            			
            // InternalSQL.g:546:4: ( (lv_rhs_2_0= ruleFactor ) )
            // InternalSQL.g:547:5: (lv_rhs_2_0= ruleFactor )
            {
            // InternalSQL.g:547:5: (lv_rhs_2_0= ruleFactor )
            // InternalSQL.g:548:6: lv_rhs_2_0= ruleFactor
            {

            						newCompositeNode(grammarAccess.getTermAccess().getRhsFactorParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_rhs_2_0=ruleFactor();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTermRule());
            						}
            						set(
            							current,
            							"rhs",
            							lv_rhs_2_0,
            							"org.xtext.example.s2c.SQL.Factor");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalSQL.g:570:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalSQL.g:570:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalSQL.g:571:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalSQL.g:577:1: ruleFactor returns [EObject current=null] : ( (otherlv_0= 'NOT' ( (lv_factor_1_0= ruleFactor ) ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleBoolExpression ) ) otherlv_4= ')' ) | otherlv_5= 'TRUE' | otherlv_6= 'FALSE' | ( (lv_binexp_7_0= ruleBinary ) ) ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_factor_1_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_binexp_7_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:583:2: ( ( (otherlv_0= 'NOT' ( (lv_factor_1_0= ruleFactor ) ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleBoolExpression ) ) otherlv_4= ')' ) | otherlv_5= 'TRUE' | otherlv_6= 'FALSE' | ( (lv_binexp_7_0= ruleBinary ) ) ) )
            // InternalSQL.g:584:2: ( (otherlv_0= 'NOT' ( (lv_factor_1_0= ruleFactor ) ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleBoolExpression ) ) otherlv_4= ')' ) | otherlv_5= 'TRUE' | otherlv_6= 'FALSE' | ( (lv_binexp_7_0= ruleBinary ) ) )
            {
            // InternalSQL.g:584:2: ( (otherlv_0= 'NOT' ( (lv_factor_1_0= ruleFactor ) ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleBoolExpression ) ) otherlv_4= ')' ) | otherlv_5= 'TRUE' | otherlv_6= 'FALSE' | ( (lv_binexp_7_0= ruleBinary ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 14:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            case RULE_ID:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalSQL.g:585:3: (otherlv_0= 'NOT' ( (lv_factor_1_0= ruleFactor ) ) )
                    {
                    // InternalSQL.g:585:3: (otherlv_0= 'NOT' ( (lv_factor_1_0= ruleFactor ) ) )
                    // InternalSQL.g:586:4: otherlv_0= 'NOT' ( (lv_factor_1_0= ruleFactor ) )
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getNOTKeyword_0_0());
                    			
                    // InternalSQL.g:590:4: ( (lv_factor_1_0= ruleFactor ) )
                    // InternalSQL.g:591:5: (lv_factor_1_0= ruleFactor )
                    {
                    // InternalSQL.g:591:5: (lv_factor_1_0= ruleFactor )
                    // InternalSQL.g:592:6: lv_factor_1_0= ruleFactor
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getFactorFactorParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_factor_1_0=ruleFactor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"factor",
                    							lv_factor_1_0,
                    							"org.xtext.example.s2c.SQL.Factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSQL.g:611:3: (otherlv_2= '(' ( (lv_expr_3_0= ruleBoolExpression ) ) otherlv_4= ')' )
                    {
                    // InternalSQL.g:611:3: (otherlv_2= '(' ( (lv_expr_3_0= ruleBoolExpression ) ) otherlv_4= ')' )
                    // InternalSQL.g:612:4: otherlv_2= '(' ( (lv_expr_3_0= ruleBoolExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalSQL.g:616:4: ( (lv_expr_3_0= ruleBoolExpression ) )
                    // InternalSQL.g:617:5: (lv_expr_3_0= ruleBoolExpression )
                    {
                    // InternalSQL.g:617:5: (lv_expr_3_0= ruleBoolExpression )
                    // InternalSQL.g:618:6: lv_expr_3_0= ruleBoolExpression
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExprBoolExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_expr_3_0=ruleBoolExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_3_0,
                    							"org.xtext.example.s2c.SQL.BoolExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSQL.g:641:3: otherlv_5= 'TRUE'
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

                    			newLeafNode(otherlv_5, grammarAccess.getFactorAccess().getTRUEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSQL.g:646:3: otherlv_6= 'FALSE'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_2); 

                    			newLeafNode(otherlv_6, grammarAccess.getFactorAccess().getFALSEKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSQL.g:651:3: ( (lv_binexp_7_0= ruleBinary ) )
                    {
                    // InternalSQL.g:651:3: ( (lv_binexp_7_0= ruleBinary ) )
                    // InternalSQL.g:652:4: (lv_binexp_7_0= ruleBinary )
                    {
                    // InternalSQL.g:652:4: (lv_binexp_7_0= ruleBinary )
                    // InternalSQL.g:653:5: lv_binexp_7_0= ruleBinary
                    {

                    					newCompositeNode(grammarAccess.getFactorAccess().getBinexpBinaryParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_binexp_7_0=ruleBinary();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFactorRule());
                    					}
                    					set(
                    						current,
                    						"binexp",
                    						lv_binexp_7_0,
                    						"org.xtext.example.s2c.SQL.Binary");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleBinary"
    // InternalSQL.g:674:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // InternalSQL.g:674:47: (iv_ruleBinary= ruleBinary EOF )
            // InternalSQL.g:675:2: iv_ruleBinary= ruleBinary EOF
            {
             newCompositeNode(grammarAccess.getBinaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinary=ruleBinary();

            state._fsp--;

             current =iv_ruleBinary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinary"


    // $ANTLR start "ruleBinary"
    // InternalSQL.g:681:1: ruleBinary returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleColumn ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '=' | otherlv_4= '>=' | otherlv_5= '<=' ) ( (lv_rhs_6_0= ruleColumn ) ) ) ;
    public final EObject ruleBinary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_6_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:687:2: ( ( ( (lv_lhs_0_0= ruleColumn ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '=' | otherlv_4= '>=' | otherlv_5= '<=' ) ( (lv_rhs_6_0= ruleColumn ) ) ) )
            // InternalSQL.g:688:2: ( ( (lv_lhs_0_0= ruleColumn ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '=' | otherlv_4= '>=' | otherlv_5= '<=' ) ( (lv_rhs_6_0= ruleColumn ) ) )
            {
            // InternalSQL.g:688:2: ( ( (lv_lhs_0_0= ruleColumn ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '=' | otherlv_4= '>=' | otherlv_5= '<=' ) ( (lv_rhs_6_0= ruleColumn ) ) )
            // InternalSQL.g:689:3: ( (lv_lhs_0_0= ruleColumn ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '=' | otherlv_4= '>=' | otherlv_5= '<=' ) ( (lv_rhs_6_0= ruleColumn ) )
            {
            // InternalSQL.g:689:3: ( (lv_lhs_0_0= ruleColumn ) )
            // InternalSQL.g:690:4: (lv_lhs_0_0= ruleColumn )
            {
            // InternalSQL.g:690:4: (lv_lhs_0_0= ruleColumn )
            // InternalSQL.g:691:5: lv_lhs_0_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getLhsColumnParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_lhs_0_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"org.xtext.example.s2c.SQL.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSQL.g:708:3: (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '=' | otherlv_4= '>=' | otherlv_5= '<=' )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            case 27:
                {
                alt10=4;
                }
                break;
            case 28:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSQL.g:709:4: otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getBinaryAccess().getLessThanSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSQL.g:714:4: otherlv_2= '>'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getBinaryAccess().getGreaterThanSignKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalSQL.g:719:4: otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getBinaryAccess().getEqualsSignKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalSQL.g:724:4: otherlv_4= '>='
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getBinaryAccess().getGreaterThanSignEqualsSignKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalSQL.g:729:4: otherlv_5= '<='
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getBinaryAccess().getLessThanSignEqualsSignKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalSQL.g:734:3: ( (lv_rhs_6_0= ruleColumn ) )
            // InternalSQL.g:735:4: (lv_rhs_6_0= ruleColumn )
            {
            // InternalSQL.g:735:4: (lv_rhs_6_0= ruleColumn )
            // InternalSQL.g:736:5: lv_rhs_6_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getRhsColumnParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rhs_6_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"rhs",
            						lv_rhs_6_0,
            						"org.xtext.example.s2c.SQL.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinary"


    // $ANTLR start "entryRuleColumn"
    // InternalSQL.g:757:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalSQL.g:757:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalSQL.g:758:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalSQL.g:764:1: ruleColumn returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSQL.g:770:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSQL.g:771:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSQL.g:771:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSQL.g:772:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSQL.g:772:3: (lv_name_0_0= RULE_ID )
            // InternalSQL.g:773:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColumnRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleGroupClause"
    // InternalSQL.g:792:1: entryRuleGroupClause returns [EObject current=null] : iv_ruleGroupClause= ruleGroupClause EOF ;
    public final EObject entryRuleGroupClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupClause = null;


        try {
            // InternalSQL.g:792:52: (iv_ruleGroupClause= ruleGroupClause EOF )
            // InternalSQL.g:793:2: iv_ruleGroupClause= ruleGroupClause EOF
            {
             newCompositeNode(grammarAccess.getGroupClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupClause=ruleGroupClause();

            state._fsp--;

             current =iv_ruleGroupClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupClause"


    // $ANTLR start "ruleGroupClause"
    // InternalSQL.g:799:1: ruleGroupClause returns [EObject current=null] : (otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )* ) ;
    public final EObject ruleGroupClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:805:2: ( (otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )* ) )
            // InternalSQL.g:806:2: (otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )* )
            {
            // InternalSQL.g:806:2: (otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )* )
            // InternalSQL.g:807:3: otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupClauseAccess().getGROUPKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupClauseAccess().getBYKeyword_1());
            		
            // InternalSQL.g:815:3: ( (lv_expressions_2_0= ruleExpression ) )
            // InternalSQL.g:816:4: (lv_expressions_2_0= ruleExpression )
            {
            // InternalSQL.g:816:4: (lv_expressions_2_0= ruleExpression )
            // InternalSQL.g:817:5: lv_expressions_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGroupClauseAccess().getExpressionsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_expressions_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupClauseRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_2_0,
            						"org.xtext.example.s2c.SQL.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSQL.g:834:3: (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==12) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSQL.g:835:4: otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getGroupClauseAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSQL.g:839:4: ( (lv_expressions_4_0= ruleExpression ) )
            	    // InternalSQL.g:840:5: (lv_expressions_4_0= ruleExpression )
            	    {
            	    // InternalSQL.g:840:5: (lv_expressions_4_0= ruleExpression )
            	    // InternalSQL.g:841:6: lv_expressions_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getGroupClauseAccess().getExpressionsExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_expressions_4_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupClauseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_4_0,
            	    							"org.xtext.example.s2c.SQL.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupClause"


    // $ANTLR start "entryRuleHavingClause"
    // InternalSQL.g:863:1: entryRuleHavingClause returns [EObject current=null] : iv_ruleHavingClause= ruleHavingClause EOF ;
    public final EObject entryRuleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingClause = null;


        try {
            // InternalSQL.g:863:53: (iv_ruleHavingClause= ruleHavingClause EOF )
            // InternalSQL.g:864:2: iv_ruleHavingClause= ruleHavingClause EOF
            {
             newCompositeNode(grammarAccess.getHavingClauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHavingClause=ruleHavingClause();

            state._fsp--;

             current =iv_ruleHavingClause; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHavingClause"


    // $ANTLR start "ruleHavingClause"
    // InternalSQL.g:870:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= 'HAVING' ( (lv_expr_1_0= ruleBoolExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:876:2: ( (otherlv_0= 'HAVING' ( (lv_expr_1_0= ruleBoolExpression ) ) ) )
            // InternalSQL.g:877:2: (otherlv_0= 'HAVING' ( (lv_expr_1_0= ruleBoolExpression ) ) )
            {
            // InternalSQL.g:877:2: (otherlv_0= 'HAVING' ( (lv_expr_1_0= ruleBoolExpression ) ) )
            // InternalSQL.g:878:3: otherlv_0= 'HAVING' ( (lv_expr_1_0= ruleBoolExpression ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0());
            		
            // InternalSQL.g:882:3: ( (lv_expr_1_0= ruleBoolExpression ) )
            // InternalSQL.g:883:4: (lv_expr_1_0= ruleBoolExpression )
            {
            // InternalSQL.g:883:4: (lv_expr_1_0= ruleBoolExpression )
            // InternalSQL.g:884:5: lv_expr_1_0= ruleBoolExpression
            {

            					newCompositeNode(grammarAccess.getHavingClauseAccess().getExprBoolExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleBoolExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHavingClauseRule());
            					}
            					set(
            						current,
            						"expr",
            						lv_expr_1_0,
            						"org.xtext.example.s2c.SQL.BoolExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHavingClause"


    // $ANTLR start "entryRuleExpression"
    // InternalSQL.g:905:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSQL.g:905:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSQL.g:906:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSQL.g:912:1: ruleExpression returns [EObject current=null] : (otherlv_0= '*' | ( (lv_col_1_0= ruleColumn ) ) | otherlv_2= 'count()' | (otherlv_3= 'sum(' ( (lv_col_4_0= ruleColumn ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_col_1_0 = null;

        EObject lv_col_4_0 = null;



        	enterRule();

        try {
            // InternalSQL.g:918:2: ( (otherlv_0= '*' | ( (lv_col_1_0= ruleColumn ) ) | otherlv_2= 'count()' | (otherlv_3= 'sum(' ( (lv_col_4_0= ruleColumn ) ) otherlv_5= ')' ) ) )
            // InternalSQL.g:919:2: (otherlv_0= '*' | ( (lv_col_1_0= ruleColumn ) ) | otherlv_2= 'count()' | (otherlv_3= 'sum(' ( (lv_col_4_0= ruleColumn ) ) otherlv_5= ')' ) )
            {
            // InternalSQL.g:919:2: (otherlv_0= '*' | ( (lv_col_1_0= ruleColumn ) ) | otherlv_2= 'count()' | (otherlv_3= 'sum(' ( (lv_col_4_0= ruleColumn ) ) otherlv_5= ')' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case 33:
                {
                alt12=3;
                }
                break;
            case 34:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalSQL.g:920:3: otherlv_0= '*'
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getExpressionAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSQL.g:925:3: ( (lv_col_1_0= ruleColumn ) )
                    {
                    // InternalSQL.g:925:3: ( (lv_col_1_0= ruleColumn ) )
                    // InternalSQL.g:926:4: (lv_col_1_0= ruleColumn )
                    {
                    // InternalSQL.g:926:4: (lv_col_1_0= ruleColumn )
                    // InternalSQL.g:927:5: lv_col_1_0= ruleColumn
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getColColumnParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_col_1_0=ruleColumn();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"col",
                    						lv_col_1_0,
                    						"org.xtext.example.s2c.SQL.Column");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalSQL.g:945:3: otherlv_2= 'count()'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_2); 

                    			newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getCountKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSQL.g:950:3: (otherlv_3= 'sum(' ( (lv_col_4_0= ruleColumn ) ) otherlv_5= ')' )
                    {
                    // InternalSQL.g:950:3: (otherlv_3= 'sum(' ( (lv_col_4_0= ruleColumn ) ) otherlv_5= ')' )
                    // InternalSQL.g:951:4: otherlv_3= 'sum(' ( (lv_col_4_0= ruleColumn ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpressionAccess().getSumKeyword_3_0());
                    			
                    // InternalSQL.g:955:4: ( (lv_col_4_0= ruleColumn ) )
                    // InternalSQL.g:956:5: (lv_col_4_0= ruleColumn )
                    {
                    // InternalSQL.g:956:5: (lv_col_4_0= ruleColumn )
                    // InternalSQL.g:957:6: lv_col_4_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getExpressionAccess().getColColumnParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_col_4_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExpressionRule());
                    						}
                    						set(
                    							current,
                    							"col",
                    							lv_col_4_0,
                    							"org.xtext.example.s2c.SQL.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getExpressionAccess().getRightParenthesisKeyword_3_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000700000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000A0043002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000A0040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000A0000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000E04010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001002L});

}