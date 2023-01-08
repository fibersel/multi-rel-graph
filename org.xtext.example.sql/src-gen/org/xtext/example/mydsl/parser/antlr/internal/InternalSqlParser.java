package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.SqlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSqlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING_LITERAL", "RULE_HEX", "RULE_INT", "RULE_DECIMAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'SELECT'", "','", "'FROM'", "'JOIN'", "'ON'", "'('", "')'", "'WHERE'", "'OR'", "'AND'", "'NOT'", "'TRUE'", "'FALSE'", "'<'", "'>'", "'='", "'>='", "'<='", "'GROUP'", "'BY'", "'HAVING'", "'XOR'", "'<>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'=~'", "'IN'", "'STARTS'", "'WITH'", "'ENDS'", "'CONTAINS'", "'IS'", "'NULL'", "'.'", "'COUNT'"
    };
    public static final int RULE_HEX=6;
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
    public static final int RULE_DECIMAL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_STRING_LITERAL=5;
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

        public InternalSqlParser(TokenStream input, SqlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SqlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSql.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSql.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalSql.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalSql.g:71:1: ruleModel returns [EObject current=null] : ( (lv_queries_0_0= ruleQuery ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_queries_0_0 = null;



        	enterRule();

        try {
            // InternalSql.g:77:2: ( ( (lv_queries_0_0= ruleQuery ) )* )
            // InternalSql.g:78:2: ( (lv_queries_0_0= ruleQuery ) )*
            {
            // InternalSql.g:78:2: ( (lv_queries_0_0= ruleQuery ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSql.g:79:3: (lv_queries_0_0= ruleQuery )
            	    {
            	    // InternalSql.g:79:3: (lv_queries_0_0= ruleQuery )
            	    // InternalSql.g:80:4: lv_queries_0_0= ruleQuery
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getQueriesQueryParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_queries_0_0=ruleQuery();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"queries",
            	    					lv_queries_0_0,
            	    					"org.xtext.example.mydsl.Sql.Query");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleQuery"
    // InternalSql.g:100:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalSql.g:100:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalSql.g:101:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalSql.g:107:1: ruleQuery returns [EObject current=null] : ( ( (lv_selectClause_0_0= ruleSelectSection ) ) ( (lv_fromClause_1_0= rulefromSection ) )? ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupClause_3_0= ruleGroupClause ) )? ( (lv_havingClause_4_0= ruleHavingClause ) )? otherlv_5= ';' ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject lv_selectClause_0_0 = null;

        EObject lv_fromClause_1_0 = null;

        EObject lv_whereClause_2_0 = null;

        EObject lv_groupClause_3_0 = null;

        EObject lv_havingClause_4_0 = null;



        	enterRule();

        try {
            // InternalSql.g:113:2: ( ( ( (lv_selectClause_0_0= ruleSelectSection ) ) ( (lv_fromClause_1_0= rulefromSection ) )? ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupClause_3_0= ruleGroupClause ) )? ( (lv_havingClause_4_0= ruleHavingClause ) )? otherlv_5= ';' ) )
            // InternalSql.g:114:2: ( ( (lv_selectClause_0_0= ruleSelectSection ) ) ( (lv_fromClause_1_0= rulefromSection ) )? ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupClause_3_0= ruleGroupClause ) )? ( (lv_havingClause_4_0= ruleHavingClause ) )? otherlv_5= ';' )
            {
            // InternalSql.g:114:2: ( ( (lv_selectClause_0_0= ruleSelectSection ) ) ( (lv_fromClause_1_0= rulefromSection ) )? ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupClause_3_0= ruleGroupClause ) )? ( (lv_havingClause_4_0= ruleHavingClause ) )? otherlv_5= ';' )
            // InternalSql.g:115:3: ( (lv_selectClause_0_0= ruleSelectSection ) ) ( (lv_fromClause_1_0= rulefromSection ) )? ( (lv_whereClause_2_0= ruleWhereClause ) )? ( (lv_groupClause_3_0= ruleGroupClause ) )? ( (lv_havingClause_4_0= ruleHavingClause ) )? otherlv_5= ';'
            {
            // InternalSql.g:115:3: ( (lv_selectClause_0_0= ruleSelectSection ) )
            // InternalSql.g:116:4: (lv_selectClause_0_0= ruleSelectSection )
            {
            // InternalSql.g:116:4: (lv_selectClause_0_0= ruleSelectSection )
            // InternalSql.g:117:5: lv_selectClause_0_0= ruleSelectSection
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getSelectClauseSelectSectionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_selectClause_0_0=ruleSelectSection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"selectClause",
            						lv_selectClause_0_0,
            						"org.xtext.example.mydsl.Sql.SelectSection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSql.g:134:3: ( (lv_fromClause_1_0= rulefromSection ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSql.g:135:4: (lv_fromClause_1_0= rulefromSection )
                    {
                    // InternalSql.g:135:4: (lv_fromClause_1_0= rulefromSection )
                    // InternalSql.g:136:5: lv_fromClause_1_0= rulefromSection
                    {

                    					newCompositeNode(grammarAccess.getQueryAccess().getFromClauseFromSectionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_fromClause_1_0=rulefromSection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQueryRule());
                    					}
                    					set(
                    						current,
                    						"fromClause",
                    						lv_fromClause_1_0,
                    						"org.xtext.example.mydsl.Sql.fromSection");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSql.g:153:3: ( (lv_whereClause_2_0= ruleWhereClause ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSql.g:154:4: (lv_whereClause_2_0= ruleWhereClause )
                    {
                    // InternalSql.g:154:4: (lv_whereClause_2_0= ruleWhereClause )
                    // InternalSql.g:155:5: lv_whereClause_2_0= ruleWhereClause
                    {

                    					newCompositeNode(grammarAccess.getQueryAccess().getWhereClauseWhereClauseParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_whereClause_2_0=ruleWhereClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQueryRule());
                    					}
                    					set(
                    						current,
                    						"whereClause",
                    						lv_whereClause_2_0,
                    						"org.xtext.example.mydsl.Sql.WhereClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSql.g:172:3: ( (lv_groupClause_3_0= ruleGroupClause ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSql.g:173:4: (lv_groupClause_3_0= ruleGroupClause )
                    {
                    // InternalSql.g:173:4: (lv_groupClause_3_0= ruleGroupClause )
                    // InternalSql.g:174:5: lv_groupClause_3_0= ruleGroupClause
                    {

                    					newCompositeNode(grammarAccess.getQueryAccess().getGroupClauseGroupClauseParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_groupClause_3_0=ruleGroupClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQueryRule());
                    					}
                    					set(
                    						current,
                    						"groupClause",
                    						lv_groupClause_3_0,
                    						"org.xtext.example.mydsl.Sql.GroupClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSql.g:191:3: ( (lv_havingClause_4_0= ruleHavingClause ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSql.g:192:4: (lv_havingClause_4_0= ruleHavingClause )
                    {
                    // InternalSql.g:192:4: (lv_havingClause_4_0= ruleHavingClause )
                    // InternalSql.g:193:5: lv_havingClause_4_0= ruleHavingClause
                    {

                    					newCompositeNode(grammarAccess.getQueryAccess().getHavingClauseHavingClauseParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_8);
                    lv_havingClause_4_0=ruleHavingClause();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQueryRule());
                    					}
                    					set(
                    						current,
                    						"havingClause",
                    						lv_havingClause_4_0,
                    						"org.xtext.example.mydsl.Sql.HavingClause");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getQueryAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleSelectSection"
    // InternalSql.g:218:1: entryRuleSelectSection returns [EObject current=null] : iv_ruleSelectSection= ruleSelectSection EOF ;
    public final EObject entryRuleSelectSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectSection = null;


        try {
            // InternalSql.g:218:54: (iv_ruleSelectSection= ruleSelectSection EOF )
            // InternalSql.g:219:2: iv_ruleSelectSection= ruleSelectSection EOF
            {
             newCompositeNode(grammarAccess.getSelectSectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectSection=ruleSelectSection();

            state._fsp--;

             current =iv_ruleSelectSection; 
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
    // $ANTLR end "entryRuleSelectSection"


    // $ANTLR start "ruleSelectSection"
    // InternalSql.g:225:1: ruleSelectSection returns [EObject current=null] : (otherlv_0= 'SELECT' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* ) ;
    public final EObject ruleSelectSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;



        	enterRule();

        try {
            // InternalSql.g:231:2: ( (otherlv_0= 'SELECT' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* ) )
            // InternalSql.g:232:2: (otherlv_0= 'SELECT' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )
            {
            // InternalSql.g:232:2: (otherlv_0= 'SELECT' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* )
            // InternalSql.g:233:3: otherlv_0= 'SELECT' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectSectionAccess().getSELECTKeyword_0());
            		
            // InternalSql.g:237:3: ( (lv_expressions_1_0= ruleExpression ) )
            // InternalSql.g:238:4: (lv_expressions_1_0= ruleExpression )
            {
            // InternalSql.g:238:4: (lv_expressions_1_0= ruleExpression )
            // InternalSql.g:239:5: lv_expressions_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSelectSectionAccess().getExpressionsExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_expressions_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectSectionRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_1_0,
            						"org.xtext.example.mydsl.Sql.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSql.g:256:3: (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSql.g:257:4: otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSelectSectionAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalSql.g:261:4: ( (lv_expressions_3_0= ruleExpression ) )
            	    // InternalSql.g:262:5: (lv_expressions_3_0= ruleExpression )
            	    {
            	    // InternalSql.g:262:5: (lv_expressions_3_0= ruleExpression )
            	    // InternalSql.g:263:6: lv_expressions_3_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getSelectSectionAccess().getExpressionsExpressionParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_expressions_3_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectSectionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_3_0,
            	    							"org.xtext.example.mydsl.Sql.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleSelectSection"


    // $ANTLR start "entryRulefromSection"
    // InternalSql.g:285:1: entryRulefromSection returns [EObject current=null] : iv_rulefromSection= rulefromSection EOF ;
    public final EObject entryRulefromSection() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefromSection = null;


        try {
            // InternalSql.g:285:52: (iv_rulefromSection= rulefromSection EOF )
            // InternalSql.g:286:2: iv_rulefromSection= rulefromSection EOF
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
    // InternalSql.g:292:1: rulefromSection returns [EObject current=null] : (otherlv_0= 'FROM' ( (lv_fromItem_1_0= ruleFromItem ) ) ) ;
    public final EObject rulefromSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_fromItem_1_0 = null;



        	enterRule();

        try {
            // InternalSql.g:298:2: ( (otherlv_0= 'FROM' ( (lv_fromItem_1_0= ruleFromItem ) ) ) )
            // InternalSql.g:299:2: (otherlv_0= 'FROM' ( (lv_fromItem_1_0= ruleFromItem ) ) )
            {
            // InternalSql.g:299:2: (otherlv_0= 'FROM' ( (lv_fromItem_1_0= ruleFromItem ) ) )
            // InternalSql.g:300:3: otherlv_0= 'FROM' ( (lv_fromItem_1_0= ruleFromItem ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getFromSectionAccess().getFROMKeyword_0());
            		
            // InternalSql.g:304:3: ( (lv_fromItem_1_0= ruleFromItem ) )
            // InternalSql.g:305:4: (lv_fromItem_1_0= ruleFromItem )
            {
            // InternalSql.g:305:4: (lv_fromItem_1_0= ruleFromItem )
            // InternalSql.g:306:5: lv_fromItem_1_0= ruleFromItem
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
            						"org.xtext.example.mydsl.Sql.FromItem");
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
    // InternalSql.g:327:1: entryRuleFromItem returns [EObject current=null] : iv_ruleFromItem= ruleFromItem EOF ;
    public final EObject entryRuleFromItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFromItem = null;


        try {
            // InternalSql.g:327:49: (iv_ruleFromItem= ruleFromItem EOF )
            // InternalSql.g:328:2: iv_ruleFromItem= ruleFromItem EOF
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
    // InternalSql.g:334:1: ruleFromItem returns [EObject current=null] : ( ( ( (lv_tbl_0_0= ruleTable ) ) (otherlv_1= 'JOIN' ( (lv_tbl_2_0= ruleTable ) ) otherlv_3= 'ON' ( (lv_expressions_4_0= ruleExpression ) ) )* ) | (otherlv_5= '(' ( (lv_select_expr_6_0= ruleSelectSection ) ) otherlv_7= ')' ) ) ;
    public final EObject ruleFromItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_tbl_0_0 = null;

        EObject lv_tbl_2_0 = null;

        EObject lv_expressions_4_0 = null;

        EObject lv_select_expr_6_0 = null;



        	enterRule();

        try {
            // InternalSql.g:340:2: ( ( ( ( (lv_tbl_0_0= ruleTable ) ) (otherlv_1= 'JOIN' ( (lv_tbl_2_0= ruleTable ) ) otherlv_3= 'ON' ( (lv_expressions_4_0= ruleExpression ) ) )* ) | (otherlv_5= '(' ( (lv_select_expr_6_0= ruleSelectSection ) ) otherlv_7= ')' ) ) )
            // InternalSql.g:341:2: ( ( ( (lv_tbl_0_0= ruleTable ) ) (otherlv_1= 'JOIN' ( (lv_tbl_2_0= ruleTable ) ) otherlv_3= 'ON' ( (lv_expressions_4_0= ruleExpression ) ) )* ) | (otherlv_5= '(' ( (lv_select_expr_6_0= ruleSelectSection ) ) otherlv_7= ')' ) )
            {
            // InternalSql.g:341:2: ( ( ( (lv_tbl_0_0= ruleTable ) ) (otherlv_1= 'JOIN' ( (lv_tbl_2_0= ruleTable ) ) otherlv_3= 'ON' ( (lv_expressions_4_0= ruleExpression ) ) )* ) | (otherlv_5= '(' ( (lv_select_expr_6_0= ruleSelectSection ) ) otherlv_7= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalSql.g:342:3: ( ( (lv_tbl_0_0= ruleTable ) ) (otherlv_1= 'JOIN' ( (lv_tbl_2_0= ruleTable ) ) otherlv_3= 'ON' ( (lv_expressions_4_0= ruleExpression ) ) )* )
                    {
                    // InternalSql.g:342:3: ( ( (lv_tbl_0_0= ruleTable ) ) (otherlv_1= 'JOIN' ( (lv_tbl_2_0= ruleTable ) ) otherlv_3= 'ON' ( (lv_expressions_4_0= ruleExpression ) ) )* )
                    // InternalSql.g:343:4: ( (lv_tbl_0_0= ruleTable ) ) (otherlv_1= 'JOIN' ( (lv_tbl_2_0= ruleTable ) ) otherlv_3= 'ON' ( (lv_expressions_4_0= ruleExpression ) ) )*
                    {
                    // InternalSql.g:343:4: ( (lv_tbl_0_0= ruleTable ) )
                    // InternalSql.g:344:5: (lv_tbl_0_0= ruleTable )
                    {
                    // InternalSql.g:344:5: (lv_tbl_0_0= ruleTable )
                    // InternalSql.g:345:6: lv_tbl_0_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getFromItemAccess().getTblTableParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_tbl_0_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFromItemRule());
                    						}
                    						add(
                    							current,
                    							"tbl",
                    							lv_tbl_0_0,
                    							"org.xtext.example.mydsl.Sql.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSql.g:362:4: (otherlv_1= 'JOIN' ( (lv_tbl_2_0= ruleTable ) ) otherlv_3= 'ON' ( (lv_expressions_4_0= ruleExpression ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSql.g:363:5: otherlv_1= 'JOIN' ( (lv_tbl_2_0= ruleTable ) ) otherlv_3= 'ON' ( (lv_expressions_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_1=(Token)match(input,18,FOLLOW_13); 

                    	    					newLeafNode(otherlv_1, grammarAccess.getFromItemAccess().getJOINKeyword_0_1_0());
                    	    				
                    	    // InternalSql.g:367:5: ( (lv_tbl_2_0= ruleTable ) )
                    	    // InternalSql.g:368:6: (lv_tbl_2_0= ruleTable )
                    	    {
                    	    // InternalSql.g:368:6: (lv_tbl_2_0= ruleTable )
                    	    // InternalSql.g:369:7: lv_tbl_2_0= ruleTable
                    	    {

                    	    							newCompositeNode(grammarAccess.getFromItemAccess().getTblTableParserRuleCall_0_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_tbl_2_0=ruleTable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFromItemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tbl",
                    	    								lv_tbl_2_0,
                    	    								"org.xtext.example.mydsl.Sql.Table");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_3=(Token)match(input,19,FOLLOW_9); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFromItemAccess().getONKeyword_0_1_2());
                    	    				
                    	    // InternalSql.g:390:5: ( (lv_expressions_4_0= ruleExpression ) )
                    	    // InternalSql.g:391:6: (lv_expressions_4_0= ruleExpression )
                    	    {
                    	    // InternalSql.g:391:6: (lv_expressions_4_0= ruleExpression )
                    	    // InternalSql.g:392:7: lv_expressions_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFromItemAccess().getExpressionsExpressionParserRuleCall_0_1_3_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_expressions_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFromItemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"expressions",
                    	    								lv_expressions_4_0,
                    	    								"org.xtext.example.mydsl.Sql.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:412:3: (otherlv_5= '(' ( (lv_select_expr_6_0= ruleSelectSection ) ) otherlv_7= ')' )
                    {
                    // InternalSql.g:412:3: (otherlv_5= '(' ( (lv_select_expr_6_0= ruleSelectSection ) ) otherlv_7= ')' )
                    // InternalSql.g:413:4: otherlv_5= '(' ( (lv_select_expr_6_0= ruleSelectSection ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getFromItemAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalSql.g:417:4: ( (lv_select_expr_6_0= ruleSelectSection ) )
                    // InternalSql.g:418:5: (lv_select_expr_6_0= ruleSelectSection )
                    {
                    // InternalSql.g:418:5: (lv_select_expr_6_0= ruleSelectSection )
                    // InternalSql.g:419:6: lv_select_expr_6_0= ruleSelectSection
                    {

                    						newCompositeNode(grammarAccess.getFromItemAccess().getSelect_exprSelectSectionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_select_expr_6_0=ruleSelectSection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFromItemRule());
                    						}
                    						set(
                    							current,
                    							"select_expr",
                    							lv_select_expr_6_0,
                    							"org.xtext.example.mydsl.Sql.SelectSection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getFromItemAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "ruleFromItem"


    // $ANTLR start "entryRuleTable"
    // InternalSql.g:445:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalSql.g:445:46: (iv_ruleTable= ruleTable EOF )
            // InternalSql.g:446:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalSql.g:452:1: ruleTable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalSql.g:458:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalSql.g:459:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalSql.g:459:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSql.g:460:3: (lv_name_0_0= RULE_ID )
            {
            // InternalSql.g:460:3: (lv_name_0_0= RULE_ID )
            // InternalSql.g:461:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTableRule());
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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleWhereClause"
    // InternalSql.g:480:1: entryRuleWhereClause returns [EObject current=null] : iv_ruleWhereClause= ruleWhereClause EOF ;
    public final EObject entryRuleWhereClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereClause = null;


        try {
            // InternalSql.g:480:52: (iv_ruleWhereClause= ruleWhereClause EOF )
            // InternalSql.g:481:2: iv_ruleWhereClause= ruleWhereClause EOF
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
    // InternalSql.g:487:1: ruleWhereClause returns [EObject current=null] : (otherlv_0= 'WHERE' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleWhereClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalSql.g:493:2: ( (otherlv_0= 'WHERE' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalSql.g:494:2: (otherlv_0= 'WHERE' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalSql.g:494:2: (otherlv_0= 'WHERE' ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalSql.g:495:3: otherlv_0= 'WHERE' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereClauseAccess().getWHEREKeyword_0());
            		
            // InternalSql.g:499:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalSql.g:500:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalSql.g:500:4: (lv_expression_1_0= ruleExpression )
            // InternalSql.g:501:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhereClauseAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhereClauseRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.mydsl.Sql.Expression");
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
    // InternalSql.g:522:1: entryRuleBoolExpression returns [EObject current=null] : iv_ruleBoolExpression= ruleBoolExpression EOF ;
    public final EObject entryRuleBoolExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolExpression = null;


        try {
            // InternalSql.g:522:55: (iv_ruleBoolExpression= ruleBoolExpression EOF )
            // InternalSql.g:523:2: iv_ruleBoolExpression= ruleBoolExpression EOF
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
    // InternalSql.g:529:1: ruleBoolExpression returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleTerm ) ) (otherlv_1= 'OR' ( (lv_rhs_2_0= ruleTerm ) ) )? ) ;
    public final EObject ruleBoolExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;



        	enterRule();

        try {
            // InternalSql.g:535:2: ( ( ( (lv_lhs_0_0= ruleTerm ) ) (otherlv_1= 'OR' ( (lv_rhs_2_0= ruleTerm ) ) )? ) )
            // InternalSql.g:536:2: ( ( (lv_lhs_0_0= ruleTerm ) ) (otherlv_1= 'OR' ( (lv_rhs_2_0= ruleTerm ) ) )? )
            {
            // InternalSql.g:536:2: ( ( (lv_lhs_0_0= ruleTerm ) ) (otherlv_1= 'OR' ( (lv_rhs_2_0= ruleTerm ) ) )? )
            // InternalSql.g:537:3: ( (lv_lhs_0_0= ruleTerm ) ) (otherlv_1= 'OR' ( (lv_rhs_2_0= ruleTerm ) ) )?
            {
            // InternalSql.g:537:3: ( (lv_lhs_0_0= ruleTerm ) )
            // InternalSql.g:538:4: (lv_lhs_0_0= ruleTerm )
            {
            // InternalSql.g:538:4: (lv_lhs_0_0= ruleTerm )
            // InternalSql.g:539:5: lv_lhs_0_0= ruleTerm
            {

            					newCompositeNode(grammarAccess.getBoolExpressionAccess().getLhsTermParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_lhs_0_0=ruleTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBoolExpressionRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"org.xtext.example.mydsl.Sql.Term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSql.g:556:3: (otherlv_1= 'OR' ( (lv_rhs_2_0= ruleTerm ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSql.g:557:4: otherlv_1= 'OR' ( (lv_rhs_2_0= ruleTerm ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getBoolExpressionAccess().getORKeyword_1_0());
                    			
                    // InternalSql.g:561:4: ( (lv_rhs_2_0= ruleTerm ) )
                    // InternalSql.g:562:5: (lv_rhs_2_0= ruleTerm )
                    {
                    // InternalSql.g:562:5: (lv_rhs_2_0= ruleTerm )
                    // InternalSql.g:563:6: lv_rhs_2_0= ruleTerm
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
                    							"org.xtext.example.mydsl.Sql.Term");
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
    // InternalSql.g:585:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalSql.g:585:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalSql.g:586:2: iv_ruleTerm= ruleTerm EOF
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
    // InternalSql.g:592:1: ruleTerm returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleFactor ) ) (otherlv_1= 'AND' ( (lv_rhs_2_0= ruleFactor ) ) )? ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;



        	enterRule();

        try {
            // InternalSql.g:598:2: ( ( ( (lv_lhs_0_0= ruleFactor ) ) (otherlv_1= 'AND' ( (lv_rhs_2_0= ruleFactor ) ) )? ) )
            // InternalSql.g:599:2: ( ( (lv_lhs_0_0= ruleFactor ) ) (otherlv_1= 'AND' ( (lv_rhs_2_0= ruleFactor ) ) )? )
            {
            // InternalSql.g:599:2: ( ( (lv_lhs_0_0= ruleFactor ) ) (otherlv_1= 'AND' ( (lv_rhs_2_0= ruleFactor ) ) )? )
            // InternalSql.g:600:3: ( (lv_lhs_0_0= ruleFactor ) ) (otherlv_1= 'AND' ( (lv_rhs_2_0= ruleFactor ) ) )?
            {
            // InternalSql.g:600:3: ( (lv_lhs_0_0= ruleFactor ) )
            // InternalSql.g:601:4: (lv_lhs_0_0= ruleFactor )
            {
            // InternalSql.g:601:4: (lv_lhs_0_0= ruleFactor )
            // InternalSql.g:602:5: lv_lhs_0_0= ruleFactor
            {

            					newCompositeNode(grammarAccess.getTermAccess().getLhsFactorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_lhs_0_0=ruleFactor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"org.xtext.example.mydsl.Sql.Factor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSql.g:619:3: (otherlv_1= 'AND' ( (lv_rhs_2_0= ruleFactor ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSql.g:620:4: otherlv_1= 'AND' ( (lv_rhs_2_0= ruleFactor ) )
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getTermAccess().getANDKeyword_1_0());
                    			
                    // InternalSql.g:624:4: ( (lv_rhs_2_0= ruleFactor ) )
                    // InternalSql.g:625:5: (lv_rhs_2_0= ruleFactor )
                    {
                    // InternalSql.g:625:5: (lv_rhs_2_0= ruleFactor )
                    // InternalSql.g:626:6: lv_rhs_2_0= ruleFactor
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
                    							"org.xtext.example.mydsl.Sql.Factor");
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalSql.g:648:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalSql.g:648:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalSql.g:649:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalSql.g:655:1: ruleFactor returns [EObject current=null] : ( (otherlv_0= 'NOT' ( (lv_factor_1_0= ruleFactor ) ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleBoolExpression ) ) otherlv_4= ')' ) | otherlv_5= 'TRUE' | otherlv_6= 'FALSE' | ( (lv_binexp_7_0= ruleBinary ) ) ) ;
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
            // InternalSql.g:661:2: ( ( (otherlv_0= 'NOT' ( (lv_factor_1_0= ruleFactor ) ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleBoolExpression ) ) otherlv_4= ')' ) | otherlv_5= 'TRUE' | otherlv_6= 'FALSE' | ( (lv_binexp_7_0= ruleBinary ) ) ) )
            // InternalSql.g:662:2: ( (otherlv_0= 'NOT' ( (lv_factor_1_0= ruleFactor ) ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleBoolExpression ) ) otherlv_4= ')' ) | otherlv_5= 'TRUE' | otherlv_6= 'FALSE' | ( (lv_binexp_7_0= ruleBinary ) ) )
            {
            // InternalSql.g:662:2: ( (otherlv_0= 'NOT' ( (lv_factor_1_0= ruleFactor ) ) ) | (otherlv_2= '(' ( (lv_expr_3_0= ruleBoolExpression ) ) otherlv_4= ')' ) | otherlv_5= 'TRUE' | otherlv_6= 'FALSE' | ( (lv_binexp_7_0= ruleBinary ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                int LA11_3 = input.LA(2);

                if ( ((LA11_3>=28 && LA11_3<=32)||LA11_3==52) ) {
                    alt11=5;
                }
                else if ( (LA11_3==EOF||LA11_3==14||LA11_3==21||(LA11_3>=23 && LA11_3<=24)) ) {
                    alt11=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                int LA11_4 = input.LA(2);

                if ( ((LA11_4>=28 && LA11_4<=32)||LA11_4==52) ) {
                    alt11=5;
                }
                else if ( (LA11_4==EOF||LA11_4==14||LA11_4==21||(LA11_4>=23 && LA11_4<=24)) ) {
                    alt11=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
            case RULE_STRING_LITERAL:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 53:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalSql.g:663:3: (otherlv_0= 'NOT' ( (lv_factor_1_0= ruleFactor ) ) )
                    {
                    // InternalSql.g:663:3: (otherlv_0= 'NOT' ( (lv_factor_1_0= ruleFactor ) ) )
                    // InternalSql.g:664:4: otherlv_0= 'NOT' ( (lv_factor_1_0= ruleFactor ) )
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getFactorAccess().getNOTKeyword_0_0());
                    			
                    // InternalSql.g:668:4: ( (lv_factor_1_0= ruleFactor ) )
                    // InternalSql.g:669:5: (lv_factor_1_0= ruleFactor )
                    {
                    // InternalSql.g:669:5: (lv_factor_1_0= ruleFactor )
                    // InternalSql.g:670:6: lv_factor_1_0= ruleFactor
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
                    							"org.xtext.example.mydsl.Sql.Factor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:689:3: (otherlv_2= '(' ( (lv_expr_3_0= ruleBoolExpression ) ) otherlv_4= ')' )
                    {
                    // InternalSql.g:689:3: (otherlv_2= '(' ( (lv_expr_3_0= ruleBoolExpression ) ) otherlv_4= ')' )
                    // InternalSql.g:690:4: otherlv_2= '(' ( (lv_expr_3_0= ruleBoolExpression ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalSql.g:694:4: ( (lv_expr_3_0= ruleBoolExpression ) )
                    // InternalSql.g:695:5: (lv_expr_3_0= ruleBoolExpression )
                    {
                    // InternalSql.g:695:5: (lv_expr_3_0= ruleBoolExpression )
                    // InternalSql.g:696:6: lv_expr_3_0= ruleBoolExpression
                    {

                    						newCompositeNode(grammarAccess.getFactorAccess().getExprBoolExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_expr_3_0=ruleBoolExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFactorRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_3_0,
                    							"org.xtext.example.mydsl.Sql.BoolExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSql.g:719:3: otherlv_5= 'TRUE'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_2); 

                    			newLeafNode(otherlv_5, grammarAccess.getFactorAccess().getTRUEKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSql.g:724:3: otherlv_6= 'FALSE'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_2); 

                    			newLeafNode(otherlv_6, grammarAccess.getFactorAccess().getFALSEKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSql.g:729:3: ( (lv_binexp_7_0= ruleBinary ) )
                    {
                    // InternalSql.g:729:3: ( (lv_binexp_7_0= ruleBinary ) )
                    // InternalSql.g:730:4: (lv_binexp_7_0= ruleBinary )
                    {
                    // InternalSql.g:730:4: (lv_binexp_7_0= ruleBinary )
                    // InternalSql.g:731:5: lv_binexp_7_0= ruleBinary
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
                    						"org.xtext.example.mydsl.Sql.Binary");
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
    // InternalSql.g:752:1: entryRuleBinary returns [EObject current=null] : iv_ruleBinary= ruleBinary EOF ;
    public final EObject entryRuleBinary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinary = null;


        try {
            // InternalSql.g:752:47: (iv_ruleBinary= ruleBinary EOF )
            // InternalSql.g:753:2: iv_ruleBinary= ruleBinary EOF
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
    // InternalSql.g:759:1: ruleBinary returns [EObject current=null] : ( ( (lv_lhs_0_0= rulePropertyOrRelationAttributeExpression ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '=' | otherlv_4= '>=' | otherlv_5= '<=' ) ( (lv_rhs_6_0= rulePropertyOrRelationAttributeExpression ) ) ) ;
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
            // InternalSql.g:765:2: ( ( ( (lv_lhs_0_0= rulePropertyOrRelationAttributeExpression ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '=' | otherlv_4= '>=' | otherlv_5= '<=' ) ( (lv_rhs_6_0= rulePropertyOrRelationAttributeExpression ) ) ) )
            // InternalSql.g:766:2: ( ( (lv_lhs_0_0= rulePropertyOrRelationAttributeExpression ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '=' | otherlv_4= '>=' | otherlv_5= '<=' ) ( (lv_rhs_6_0= rulePropertyOrRelationAttributeExpression ) ) )
            {
            // InternalSql.g:766:2: ( ( (lv_lhs_0_0= rulePropertyOrRelationAttributeExpression ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '=' | otherlv_4= '>=' | otherlv_5= '<=' ) ( (lv_rhs_6_0= rulePropertyOrRelationAttributeExpression ) ) )
            // InternalSql.g:767:3: ( (lv_lhs_0_0= rulePropertyOrRelationAttributeExpression ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '=' | otherlv_4= '>=' | otherlv_5= '<=' ) ( (lv_rhs_6_0= rulePropertyOrRelationAttributeExpression ) )
            {
            // InternalSql.g:767:3: ( (lv_lhs_0_0= rulePropertyOrRelationAttributeExpression ) )
            // InternalSql.g:768:4: (lv_lhs_0_0= rulePropertyOrRelationAttributeExpression )
            {
            // InternalSql.g:768:4: (lv_lhs_0_0= rulePropertyOrRelationAttributeExpression )
            // InternalSql.g:769:5: lv_lhs_0_0= rulePropertyOrRelationAttributeExpression
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getLhsPropertyOrRelationAttributeExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_lhs_0_0=rulePropertyOrRelationAttributeExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"lhs",
            						lv_lhs_0_0,
            						"org.xtext.example.mydsl.Sql.PropertyOrRelationAttributeExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSql.g:786:3: (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '=' | otherlv_4= '>=' | otherlv_5= '<=' )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            case 31:
                {
                alt12=4;
                }
                break;
            case 32:
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
                    // InternalSql.g:787:4: otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getBinaryAccess().getLessThanSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSql.g:792:4: otherlv_2= '>'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getBinaryAccess().getGreaterThanSignKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalSql.g:797:4: otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getBinaryAccess().getEqualsSignKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalSql.g:802:4: otherlv_4= '>='
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getBinaryAccess().getGreaterThanSignEqualsSignKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalSql.g:807:4: otherlv_5= '<='
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getBinaryAccess().getLessThanSignEqualsSignKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalSql.g:812:3: ( (lv_rhs_6_0= rulePropertyOrRelationAttributeExpression ) )
            // InternalSql.g:813:4: (lv_rhs_6_0= rulePropertyOrRelationAttributeExpression )
            {
            // InternalSql.g:813:4: (lv_rhs_6_0= rulePropertyOrRelationAttributeExpression )
            // InternalSql.g:814:5: lv_rhs_6_0= rulePropertyOrRelationAttributeExpression
            {

            					newCompositeNode(grammarAccess.getBinaryAccess().getRhsPropertyOrRelationAttributeExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_rhs_6_0=rulePropertyOrRelationAttributeExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryRule());
            					}
            					set(
            						current,
            						"rhs",
            						lv_rhs_6_0,
            						"org.xtext.example.mydsl.Sql.PropertyOrRelationAttributeExpression");
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


    // $ANTLR start "entryRuleGroupClause"
    // InternalSql.g:835:1: entryRuleGroupClause returns [EObject current=null] : iv_ruleGroupClause= ruleGroupClause EOF ;
    public final EObject entryRuleGroupClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupClause = null;


        try {
            // InternalSql.g:835:52: (iv_ruleGroupClause= ruleGroupClause EOF )
            // InternalSql.g:836:2: iv_ruleGroupClause= ruleGroupClause EOF
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
    // InternalSql.g:842:1: ruleGroupClause returns [EObject current=null] : (otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )* ) ;
    public final EObject ruleGroupClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;

        EObject lv_expressions_4_0 = null;



        	enterRule();

        try {
            // InternalSql.g:848:2: ( (otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )* ) )
            // InternalSql.g:849:2: (otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )* )
            {
            // InternalSql.g:849:2: (otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )* )
            // InternalSql.g:850:3: otherlv_0= 'GROUP' otherlv_1= 'BY' ( (lv_expressions_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )*
            {
            otherlv_0=(Token)match(input,33,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupClauseAccess().getGROUPKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupClauseAccess().getBYKeyword_1());
            		
            // InternalSql.g:858:3: ( (lv_expressions_2_0= ruleExpression ) )
            // InternalSql.g:859:4: (lv_expressions_2_0= ruleExpression )
            {
            // InternalSql.g:859:4: (lv_expressions_2_0= ruleExpression )
            // InternalSql.g:860:5: lv_expressions_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getGroupClauseAccess().getExpressionsExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_expressions_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupClauseRule());
            					}
            					add(
            						current,
            						"expressions",
            						lv_expressions_2_0,
            						"org.xtext.example.mydsl.Sql.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSql.g:877:3: (otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSql.g:878:4: otherlv_3= ',' ( (lv_expressions_4_0= ruleExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_3, grammarAccess.getGroupClauseAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalSql.g:882:4: ( (lv_expressions_4_0= ruleExpression ) )
            	    // InternalSql.g:883:5: (lv_expressions_4_0= ruleExpression )
            	    {
            	    // InternalSql.g:883:5: (lv_expressions_4_0= ruleExpression )
            	    // InternalSql.g:884:6: lv_expressions_4_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getGroupClauseAccess().getExpressionsExpressionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_expressions_4_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupClauseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_4_0,
            	    							"org.xtext.example.mydsl.Sql.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSql.g:906:1: entryRuleHavingClause returns [EObject current=null] : iv_ruleHavingClause= ruleHavingClause EOF ;
    public final EObject entryRuleHavingClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHavingClause = null;


        try {
            // InternalSql.g:906:53: (iv_ruleHavingClause= ruleHavingClause EOF )
            // InternalSql.g:907:2: iv_ruleHavingClause= ruleHavingClause EOF
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
    // InternalSql.g:913:1: ruleHavingClause returns [EObject current=null] : (otherlv_0= 'HAVING' ( (lv_expr_1_0= ruleBoolExpression ) ) ) ;
    public final EObject ruleHavingClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;



        	enterRule();

        try {
            // InternalSql.g:919:2: ( (otherlv_0= 'HAVING' ( (lv_expr_1_0= ruleBoolExpression ) ) ) )
            // InternalSql.g:920:2: (otherlv_0= 'HAVING' ( (lv_expr_1_0= ruleBoolExpression ) ) )
            {
            // InternalSql.g:920:2: (otherlv_0= 'HAVING' ( (lv_expr_1_0= ruleBoolExpression ) ) )
            // InternalSql.g:921:3: otherlv_0= 'HAVING' ( (lv_expr_1_0= ruleBoolExpression ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getHavingClauseAccess().getHAVINGKeyword_0());
            		
            // InternalSql.g:925:3: ( (lv_expr_1_0= ruleBoolExpression ) )
            // InternalSql.g:926:4: (lv_expr_1_0= ruleBoolExpression )
            {
            // InternalSql.g:926:4: (lv_expr_1_0= ruleBoolExpression )
            // InternalSql.g:927:5: lv_expr_1_0= ruleBoolExpression
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
            						"org.xtext.example.mydsl.Sql.BoolExpression");
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
    // InternalSql.g:948:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalSql.g:948:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalSql.g:949:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalSql.g:955:1: ruleExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalSql.g:961:2: (this_OrExpression_0= ruleOrExpression )
            // InternalSql.g:962:2: this_OrExpression_0= ruleOrExpression
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            		current = this_OrExpression_0;
            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRuleOrExpression"
    // InternalSql.g:973:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalSql.g:973:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalSql.g:974:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalSql.g:980:1: ruleOrExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= 'OR' ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSql.g:986:2: ( (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= 'OR' ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalSql.g:987:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= 'OR' ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalSql.g:987:2: (this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= 'OR' ) ) ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalSql.g:988:3: this_XorExpression_0= ruleXorExpression ( () ( (lv_operator_2_0= 'OR' ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSql.g:996:3: ( () ( (lv_operator_2_0= 'OR' ) ) ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSql.g:997:4: () ( (lv_operator_2_0= 'OR' ) ) ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalSql.g:997:4: ()
            	    // InternalSql.g:998:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSql.g:1004:4: ( (lv_operator_2_0= 'OR' ) )
            	    // InternalSql.g:1005:5: (lv_operator_2_0= 'OR' )
            	    {
            	    // InternalSql.g:1005:5: (lv_operator_2_0= 'OR' )
            	    // InternalSql.g:1006:6: lv_operator_2_0= 'OR'
            	    {
            	    lv_operator_2_0=(Token)match(input,23,FOLLOW_9); 

            	    						newLeafNode(lv_operator_2_0, grammarAccess.getOrExpressionAccess().getOperatorORKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOrExpressionRule());
            	    						}
            	    						setWithLastConsumed(current, "operator", lv_operator_2_0, "OR");
            	    					

            	    }


            	    }

            	    // InternalSql.g:1018:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalSql.g:1019:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalSql.g:1019:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalSql.g:1020:6: lv_right_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=ruleXorExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Sql.XorExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalSql.g:1042:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalSql.g:1042:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalSql.g:1043:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
             newCompositeNode(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;

             current =iv_ruleXorExpression; 
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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalSql.g:1049:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= 'XOR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSql.g:1055:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= 'XOR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalSql.g:1056:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= 'XOR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalSql.g:1056:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= 'XOR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalSql.g:1057:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= 'XOR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSql.g:1065:3: ( () ( (lv_operator_2_0= 'XOR' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==36) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSql.g:1066:4: () ( (lv_operator_2_0= 'XOR' ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalSql.g:1066:4: ()
            	    // InternalSql.g:1067:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSql.g:1073:4: ( (lv_operator_2_0= 'XOR' ) )
            	    // InternalSql.g:1074:5: (lv_operator_2_0= 'XOR' )
            	    {
            	    // InternalSql.g:1074:5: (lv_operator_2_0= 'XOR' )
            	    // InternalSql.g:1075:6: lv_operator_2_0= 'XOR'
            	    {
            	    lv_operator_2_0=(Token)match(input,36,FOLLOW_9); 

            	    						newLeafNode(lv_operator_2_0, grammarAccess.getXorExpressionAccess().getOperatorXORKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getXorExpressionRule());
            	    						}
            	    						setWithLastConsumed(current, "operator", lv_operator_2_0, "XOR");
            	    					

            	    }


            	    }

            	    // InternalSql.g:1087:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalSql.g:1088:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalSql.g:1088:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalSql.g:1089:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Sql.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalSql.g:1111:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalSql.g:1111:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalSql.g:1112:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalSql.g:1118:1: ruleAndExpression returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= 'AND' ) ) ( (lv_right_3_0= ruleNotExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_NotExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSql.g:1124:2: ( (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= 'AND' ) ) ( (lv_right_3_0= ruleNotExpression ) ) )* ) )
            // InternalSql.g:1125:2: (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= 'AND' ) ) ( (lv_right_3_0= ruleNotExpression ) ) )* )
            {
            // InternalSql.g:1125:2: (this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= 'AND' ) ) ( (lv_right_3_0= ruleNotExpression ) ) )* )
            // InternalSql.g:1126:3: this_NotExpression_0= ruleNotExpression ( () ( (lv_operator_2_0= 'AND' ) ) ( (lv_right_3_0= ruleNotExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getNotExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_NotExpression_0=ruleNotExpression();

            state._fsp--;


            			current = this_NotExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSql.g:1134:3: ( () ( (lv_operator_2_0= 'AND' ) ) ( (lv_right_3_0= ruleNotExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSql.g:1135:4: () ( (lv_operator_2_0= 'AND' ) ) ( (lv_right_3_0= ruleNotExpression ) )
            	    {
            	    // InternalSql.g:1135:4: ()
            	    // InternalSql.g:1136:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSql.g:1142:4: ( (lv_operator_2_0= 'AND' ) )
            	    // InternalSql.g:1143:5: (lv_operator_2_0= 'AND' )
            	    {
            	    // InternalSql.g:1143:5: (lv_operator_2_0= 'AND' )
            	    // InternalSql.g:1144:6: lv_operator_2_0= 'AND'
            	    {
            	    lv_operator_2_0=(Token)match(input,24,FOLLOW_9); 

            	    						newLeafNode(lv_operator_2_0, grammarAccess.getAndExpressionAccess().getOperatorANDKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAndExpressionRule());
            	    						}
            	    						setWithLastConsumed(current, "operator", lv_operator_2_0, "AND");
            	    					

            	    }


            	    }

            	    // InternalSql.g:1156:4: ( (lv_right_3_0= ruleNotExpression ) )
            	    // InternalSql.g:1157:5: (lv_right_3_0= ruleNotExpression )
            	    {
            	    // InternalSql.g:1157:5: (lv_right_3_0= ruleNotExpression )
            	    // InternalSql.g:1158:6: lv_right_3_0= ruleNotExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightNotExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleNotExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Sql.NotExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleNotExpression"
    // InternalSql.g:1180:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalSql.g:1180:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalSql.g:1181:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
             newCompositeNode(grammarAccess.getNotExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;

             current =iv_ruleNotExpression; 
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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalSql.g:1187:1: ruleNotExpression returns [EObject current=null] : ( ( () ( (lv_operator_1_0= 'NOT' ) ) ( (lv_left_2_0= ruleNotExpression ) ) ) | this_ComparisonExpression_3= ruleComparisonExpression ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        EObject lv_left_2_0 = null;

        EObject this_ComparisonExpression_3 = null;



        	enterRule();

        try {
            // InternalSql.g:1193:2: ( ( ( () ( (lv_operator_1_0= 'NOT' ) ) ( (lv_left_2_0= ruleNotExpression ) ) ) | this_ComparisonExpression_3= ruleComparisonExpression ) )
            // InternalSql.g:1194:2: ( ( () ( (lv_operator_1_0= 'NOT' ) ) ( (lv_left_2_0= ruleNotExpression ) ) ) | this_ComparisonExpression_3= ruleComparisonExpression )
            {
            // InternalSql.g:1194:2: ( ( () ( (lv_operator_1_0= 'NOT' ) ) ( (lv_left_2_0= ruleNotExpression ) ) ) | this_ComparisonExpression_3= ruleComparisonExpression )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_DECIMAL)||(LA17_0>=26 && LA17_0<=27)||(LA17_0>=38 && LA17_0<=39)||LA17_0==53) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalSql.g:1195:3: ( () ( (lv_operator_1_0= 'NOT' ) ) ( (lv_left_2_0= ruleNotExpression ) ) )
                    {
                    // InternalSql.g:1195:3: ( () ( (lv_operator_1_0= 'NOT' ) ) ( (lv_left_2_0= ruleNotExpression ) ) )
                    // InternalSql.g:1196:4: () ( (lv_operator_1_0= 'NOT' ) ) ( (lv_left_2_0= ruleNotExpression ) )
                    {
                    // InternalSql.g:1196:4: ()
                    // InternalSql.g:1197:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNotExpressionAccess().getNotExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSql.g:1203:4: ( (lv_operator_1_0= 'NOT' ) )
                    // InternalSql.g:1204:5: (lv_operator_1_0= 'NOT' )
                    {
                    // InternalSql.g:1204:5: (lv_operator_1_0= 'NOT' )
                    // InternalSql.g:1205:6: lv_operator_1_0= 'NOT'
                    {
                    lv_operator_1_0=(Token)match(input,25,FOLLOW_9); 

                    						newLeafNode(lv_operator_1_0, grammarAccess.getNotExpressionAccess().getOperatorNOTKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNotExpressionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_1_0, "NOT");
                    					

                    }


                    }

                    // InternalSql.g:1217:4: ( (lv_left_2_0= ruleNotExpression ) )
                    // InternalSql.g:1218:5: (lv_left_2_0= ruleNotExpression )
                    {
                    // InternalSql.g:1218:5: (lv_left_2_0= ruleNotExpression )
                    // InternalSql.g:1219:6: lv_left_2_0= ruleNotExpression
                    {

                    						newCompositeNode(grammarAccess.getNotExpressionAccess().getLeftNotExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_left_2_0=ruleNotExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotExpressionRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_2_0,
                    							"org.xtext.example.mydsl.Sql.NotExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1238:3: this_ComparisonExpression_3= ruleComparisonExpression
                    {

                    			newCompositeNode(grammarAccess.getNotExpressionAccess().getComparisonExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComparisonExpression_3=ruleComparisonExpression();

                    state._fsp--;


                    			current = this_ComparisonExpression_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalSql.g:1250:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalSql.g:1250:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalSql.g:1251:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalSql.g:1257:1: ruleComparisonExpression returns [EObject current=null] : (this_AddOrSubtractExpression_0= ruleAddOrSubtractExpression ( () ( ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' | lv_operator_2_3= '<' | lv_operator_2_4= '>' | lv_operator_2_5= '<=' | lv_operator_2_6= '>=' ) ) ) ( (lv_right_3_0= ruleAddOrSubtractExpression ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        Token lv_operator_2_5=null;
        Token lv_operator_2_6=null;
        EObject this_AddOrSubtractExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSql.g:1263:2: ( (this_AddOrSubtractExpression_0= ruleAddOrSubtractExpression ( () ( ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' | lv_operator_2_3= '<' | lv_operator_2_4= '>' | lv_operator_2_5= '<=' | lv_operator_2_6= '>=' ) ) ) ( (lv_right_3_0= ruleAddOrSubtractExpression ) ) )* ) )
            // InternalSql.g:1264:2: (this_AddOrSubtractExpression_0= ruleAddOrSubtractExpression ( () ( ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' | lv_operator_2_3= '<' | lv_operator_2_4= '>' | lv_operator_2_5= '<=' | lv_operator_2_6= '>=' ) ) ) ( (lv_right_3_0= ruleAddOrSubtractExpression ) ) )* )
            {
            // InternalSql.g:1264:2: (this_AddOrSubtractExpression_0= ruleAddOrSubtractExpression ( () ( ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' | lv_operator_2_3= '<' | lv_operator_2_4= '>' | lv_operator_2_5= '<=' | lv_operator_2_6= '>=' ) ) ) ( (lv_right_3_0= ruleAddOrSubtractExpression ) ) )* )
            // InternalSql.g:1265:3: this_AddOrSubtractExpression_0= ruleAddOrSubtractExpression ( () ( ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' | lv_operator_2_3= '<' | lv_operator_2_4= '>' | lv_operator_2_5= '<=' | lv_operator_2_6= '>=' ) ) ) ( (lv_right_3_0= ruleAddOrSubtractExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getAddOrSubtractExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_AddOrSubtractExpression_0=ruleAddOrSubtractExpression();

            state._fsp--;


            			current = this_AddOrSubtractExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSql.g:1273:3: ( () ( ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' | lv_operator_2_3= '<' | lv_operator_2_4= '>' | lv_operator_2_5= '<=' | lv_operator_2_6= '>=' ) ) ) ( (lv_right_3_0= ruleAddOrSubtractExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=28 && LA19_0<=32)||LA19_0==37) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSql.g:1274:4: () ( ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' | lv_operator_2_3= '<' | lv_operator_2_4= '>' | lv_operator_2_5= '<=' | lv_operator_2_6= '>=' ) ) ) ( (lv_right_3_0= ruleAddOrSubtractExpression ) )
            	    {
            	    // InternalSql.g:1274:4: ()
            	    // InternalSql.g:1275:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSql.g:1281:4: ( ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' | lv_operator_2_3= '<' | lv_operator_2_4= '>' | lv_operator_2_5= '<=' | lv_operator_2_6= '>=' ) ) )
            	    // InternalSql.g:1282:5: ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' | lv_operator_2_3= '<' | lv_operator_2_4= '>' | lv_operator_2_5= '<=' | lv_operator_2_6= '>=' ) )
            	    {
            	    // InternalSql.g:1282:5: ( (lv_operator_2_1= '=' | lv_operator_2_2= '<>' | lv_operator_2_3= '<' | lv_operator_2_4= '>' | lv_operator_2_5= '<=' | lv_operator_2_6= '>=' ) )
            	    // InternalSql.g:1283:6: (lv_operator_2_1= '=' | lv_operator_2_2= '<>' | lv_operator_2_3= '<' | lv_operator_2_4= '>' | lv_operator_2_5= '<=' | lv_operator_2_6= '>=' )
            	    {
            	    // InternalSql.g:1283:6: (lv_operator_2_1= '=' | lv_operator_2_2= '<>' | lv_operator_2_3= '<' | lv_operator_2_4= '>' | lv_operator_2_5= '<=' | lv_operator_2_6= '>=' )
            	    int alt18=6;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt18=4;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt18=5;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt18=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // InternalSql.g:1284:7: lv_operator_2_1= '='
            	            {
            	            lv_operator_2_1=(Token)match(input,30,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getComparisonExpressionAccess().getOperatorEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSql.g:1295:7: lv_operator_2_2= '<>'
            	            {
            	            lv_operator_2_2=(Token)match(input,37,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignGreaterThanSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalSql.g:1306:7: lv_operator_2_3= '<'
            	            {
            	            lv_operator_2_3=(Token)match(input,28,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_3, grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalSql.g:1317:7: lv_operator_2_4= '>'
            	            {
            	            lv_operator_2_4=(Token)match(input,29,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_4, grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalSql.g:1328:7: lv_operator_2_5= '<='
            	            {
            	            lv_operator_2_5=(Token)match(input,32,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_5, grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	            						

            	            }
            	            break;
            	        case 6 :
            	            // InternalSql.g:1339:7: lv_operator_2_6= '>='
            	            {
            	            lv_operator_2_6=(Token)match(input,31,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_6, grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_5());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_6, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSql.g:1352:4: ( (lv_right_3_0= ruleAddOrSubtractExpression ) )
            	    // InternalSql.g:1353:5: (lv_right_3_0= ruleAddOrSubtractExpression )
            	    {
            	    // InternalSql.g:1353:5: (lv_right_3_0= ruleAddOrSubtractExpression )
            	    // InternalSql.g:1354:6: lv_right_3_0= ruleAddOrSubtractExpression
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightAddOrSubtractExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleAddOrSubtractExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Sql.AddOrSubtractExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleAddOrSubtractExpression"
    // InternalSql.g:1376:1: entryRuleAddOrSubtractExpression returns [EObject current=null] : iv_ruleAddOrSubtractExpression= ruleAddOrSubtractExpression EOF ;
    public final EObject entryRuleAddOrSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddOrSubtractExpression = null;


        try {
            // InternalSql.g:1376:64: (iv_ruleAddOrSubtractExpression= ruleAddOrSubtractExpression EOF )
            // InternalSql.g:1377:2: iv_ruleAddOrSubtractExpression= ruleAddOrSubtractExpression EOF
            {
             newCompositeNode(grammarAccess.getAddOrSubtractExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddOrSubtractExpression=ruleAddOrSubtractExpression();

            state._fsp--;

             current =iv_ruleAddOrSubtractExpression; 
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
    // $ANTLR end "entryRuleAddOrSubtractExpression"


    // $ANTLR start "ruleAddOrSubtractExpression"
    // InternalSql.g:1383:1: ruleAddOrSubtractExpression returns [EObject current=null] : (this_MultiplyDivideModuloExpression_0= ruleMultiplyDivideModuloExpression ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplyDivideModuloExpression ) ) )* ) ;
    public final EObject ruleAddOrSubtractExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_MultiplyDivideModuloExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSql.g:1389:2: ( (this_MultiplyDivideModuloExpression_0= ruleMultiplyDivideModuloExpression ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplyDivideModuloExpression ) ) )* ) )
            // InternalSql.g:1390:2: (this_MultiplyDivideModuloExpression_0= ruleMultiplyDivideModuloExpression ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplyDivideModuloExpression ) ) )* )
            {
            // InternalSql.g:1390:2: (this_MultiplyDivideModuloExpression_0= ruleMultiplyDivideModuloExpression ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplyDivideModuloExpression ) ) )* )
            // InternalSql.g:1391:3: this_MultiplyDivideModuloExpression_0= ruleMultiplyDivideModuloExpression ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplyDivideModuloExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddOrSubtractExpressionAccess().getMultiplyDivideModuloExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_MultiplyDivideModuloExpression_0=ruleMultiplyDivideModuloExpression();

            state._fsp--;


            			current = this_MultiplyDivideModuloExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSql.g:1399:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplyDivideModuloExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=38 && LA21_0<=39)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSql.g:1400:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplyDivideModuloExpression ) )
            	    {
            	    // InternalSql.g:1400:4: ()
            	    // InternalSql.g:1401:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAddOrSubtractExpressionAccess().getAddOrSubtractExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSql.g:1407:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalSql.g:1408:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalSql.g:1408:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalSql.g:1409:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalSql.g:1409:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==38) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==39) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalSql.g:1410:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,38,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAddOrSubtractExpressionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAddOrSubtractExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSql.g:1421:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,39,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAddOrSubtractExpressionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAddOrSubtractExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSql.g:1434:4: ( (lv_right_3_0= ruleMultiplyDivideModuloExpression ) )
            	    // InternalSql.g:1435:5: (lv_right_3_0= ruleMultiplyDivideModuloExpression )
            	    {
            	    // InternalSql.g:1435:5: (lv_right_3_0= ruleMultiplyDivideModuloExpression )
            	    // InternalSql.g:1436:6: lv_right_3_0= ruleMultiplyDivideModuloExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAddOrSubtractExpressionAccess().getRightMultiplyDivideModuloExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleMultiplyDivideModuloExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddOrSubtractExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Sql.MultiplyDivideModuloExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleAddOrSubtractExpression"


    // $ANTLR start "entryRuleMultiplyDivideModuloExpression"
    // InternalSql.g:1458:1: entryRuleMultiplyDivideModuloExpression returns [EObject current=null] : iv_ruleMultiplyDivideModuloExpression= ruleMultiplyDivideModuloExpression EOF ;
    public final EObject entryRuleMultiplyDivideModuloExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplyDivideModuloExpression = null;


        try {
            // InternalSql.g:1458:71: (iv_ruleMultiplyDivideModuloExpression= ruleMultiplyDivideModuloExpression EOF )
            // InternalSql.g:1459:2: iv_ruleMultiplyDivideModuloExpression= ruleMultiplyDivideModuloExpression EOF
            {
             newCompositeNode(grammarAccess.getMultiplyDivideModuloExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplyDivideModuloExpression=ruleMultiplyDivideModuloExpression();

            state._fsp--;

             current =iv_ruleMultiplyDivideModuloExpression; 
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
    // $ANTLR end "entryRuleMultiplyDivideModuloExpression"


    // $ANTLR start "ruleMultiplyDivideModuloExpression"
    // InternalSql.g:1465:1: ruleMultiplyDivideModuloExpression returns [EObject current=null] : (this_PowerOfExpression_0= rulePowerOfExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= rulePowerOfExpression ) ) )* ) ;
    public final EObject ruleMultiplyDivideModuloExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        EObject this_PowerOfExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSql.g:1471:2: ( (this_PowerOfExpression_0= rulePowerOfExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= rulePowerOfExpression ) ) )* ) )
            // InternalSql.g:1472:2: (this_PowerOfExpression_0= rulePowerOfExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= rulePowerOfExpression ) ) )* )
            {
            // InternalSql.g:1472:2: (this_PowerOfExpression_0= rulePowerOfExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= rulePowerOfExpression ) ) )* )
            // InternalSql.g:1473:3: this_PowerOfExpression_0= rulePowerOfExpression ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= rulePowerOfExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplyDivideModuloExpressionAccess().getPowerOfExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_PowerOfExpression_0=rulePowerOfExpression();

            state._fsp--;


            			current = this_PowerOfExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSql.g:1481:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= rulePowerOfExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=40 && LA23_0<=42)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSql.g:1482:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) ) ( (lv_right_3_0= rulePowerOfExpression ) )
            	    {
            	    // InternalSql.g:1482:4: ()
            	    // InternalSql.g:1483:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplyDivideModuloExpressionAccess().getMultiplyDivideModuloExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSql.g:1489:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) ) )
            	    // InternalSql.g:1490:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) )
            	    {
            	    // InternalSql.g:1490:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' ) )
            	    // InternalSql.g:1491:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' )
            	    {
            	    // InternalSql.g:1491:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' | lv_operator_2_3= '%' )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case 40:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 41:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // InternalSql.g:1492:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,40,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplyDivideModuloExpressionAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplyDivideModuloExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSql.g:1503:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,41,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplyDivideModuloExpressionAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplyDivideModuloExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalSql.g:1514:7: lv_operator_2_3= '%'
            	            {
            	            lv_operator_2_3=(Token)match(input,42,FOLLOW_9); 

            	            							newLeafNode(lv_operator_2_3, grammarAccess.getMultiplyDivideModuloExpressionAccess().getOperatorPercentSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplyDivideModuloExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalSql.g:1527:4: ( (lv_right_3_0= rulePowerOfExpression ) )
            	    // InternalSql.g:1528:5: (lv_right_3_0= rulePowerOfExpression )
            	    {
            	    // InternalSql.g:1528:5: (lv_right_3_0= rulePowerOfExpression )
            	    // InternalSql.g:1529:6: lv_right_3_0= rulePowerOfExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplyDivideModuloExpressionAccess().getRightPowerOfExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=rulePowerOfExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplyDivideModuloExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Sql.PowerOfExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // $ANTLR end "ruleMultiplyDivideModuloExpression"


    // $ANTLR start "entryRulePowerOfExpression"
    // InternalSql.g:1551:1: entryRulePowerOfExpression returns [EObject current=null] : iv_rulePowerOfExpression= rulePowerOfExpression EOF ;
    public final EObject entryRulePowerOfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerOfExpression = null;


        try {
            // InternalSql.g:1551:58: (iv_rulePowerOfExpression= rulePowerOfExpression EOF )
            // InternalSql.g:1552:2: iv_rulePowerOfExpression= rulePowerOfExpression EOF
            {
             newCompositeNode(grammarAccess.getPowerOfExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePowerOfExpression=rulePowerOfExpression();

            state._fsp--;

             current =iv_rulePowerOfExpression; 
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
    // $ANTLR end "entryRulePowerOfExpression"


    // $ANTLR start "rulePowerOfExpression"
    // InternalSql.g:1558:1: rulePowerOfExpression returns [EObject current=null] : (this_UnaryAddOrSubtractExpression_0= ruleUnaryAddOrSubtractExpression ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryAddOrSubtractExpression ) ) )* ) ;
    public final EObject rulePowerOfExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_UnaryAddOrSubtractExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalSql.g:1564:2: ( (this_UnaryAddOrSubtractExpression_0= ruleUnaryAddOrSubtractExpression ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryAddOrSubtractExpression ) ) )* ) )
            // InternalSql.g:1565:2: (this_UnaryAddOrSubtractExpression_0= ruleUnaryAddOrSubtractExpression ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryAddOrSubtractExpression ) ) )* )
            {
            // InternalSql.g:1565:2: (this_UnaryAddOrSubtractExpression_0= ruleUnaryAddOrSubtractExpression ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryAddOrSubtractExpression ) ) )* )
            // InternalSql.g:1566:3: this_UnaryAddOrSubtractExpression_0= ruleUnaryAddOrSubtractExpression ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryAddOrSubtractExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getPowerOfExpressionAccess().getUnaryAddOrSubtractExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_UnaryAddOrSubtractExpression_0=ruleUnaryAddOrSubtractExpression();

            state._fsp--;


            			current = this_UnaryAddOrSubtractExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSql.g:1574:3: ( () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryAddOrSubtractExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==43) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSql.g:1575:4: () ( (lv_operator_2_0= '^' ) ) ( (lv_right_3_0= ruleUnaryAddOrSubtractExpression ) )
            	    {
            	    // InternalSql.g:1575:4: ()
            	    // InternalSql.g:1576:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPowerOfExpressionAccess().getPowerOfExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSql.g:1582:4: ( (lv_operator_2_0= '^' ) )
            	    // InternalSql.g:1583:5: (lv_operator_2_0= '^' )
            	    {
            	    // InternalSql.g:1583:5: (lv_operator_2_0= '^' )
            	    // InternalSql.g:1584:6: lv_operator_2_0= '^'
            	    {
            	    lv_operator_2_0=(Token)match(input,43,FOLLOW_9); 

            	    						newLeafNode(lv_operator_2_0, grammarAccess.getPowerOfExpressionAccess().getOperatorCircumflexAccentKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPowerOfExpressionRule());
            	    						}
            	    						setWithLastConsumed(current, "operator", lv_operator_2_0, "^");
            	    					

            	    }


            	    }

            	    // InternalSql.g:1596:4: ( (lv_right_3_0= ruleUnaryAddOrSubtractExpression ) )
            	    // InternalSql.g:1597:5: (lv_right_3_0= ruleUnaryAddOrSubtractExpression )
            	    {
            	    // InternalSql.g:1597:5: (lv_right_3_0= ruleUnaryAddOrSubtractExpression )
            	    // InternalSql.g:1598:6: lv_right_3_0= ruleUnaryAddOrSubtractExpression
            	    {

            	    						newCompositeNode(grammarAccess.getPowerOfExpressionAccess().getRightUnaryAddOrSubtractExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=ruleUnaryAddOrSubtractExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPowerOfExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.Sql.UnaryAddOrSubtractExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "rulePowerOfExpression"


    // $ANTLR start "entryRuleUnaryAddOrSubtractExpression"
    // InternalSql.g:1620:1: entryRuleUnaryAddOrSubtractExpression returns [EObject current=null] : iv_ruleUnaryAddOrSubtractExpression= ruleUnaryAddOrSubtractExpression EOF ;
    public final EObject entryRuleUnaryAddOrSubtractExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryAddOrSubtractExpression = null;


        try {
            // InternalSql.g:1620:69: (iv_ruleUnaryAddOrSubtractExpression= ruleUnaryAddOrSubtractExpression EOF )
            // InternalSql.g:1621:2: iv_ruleUnaryAddOrSubtractExpression= ruleUnaryAddOrSubtractExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryAddOrSubtractExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryAddOrSubtractExpression=ruleUnaryAddOrSubtractExpression();

            state._fsp--;

             current =iv_ruleUnaryAddOrSubtractExpression; 
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
    // $ANTLR end "entryRuleUnaryAddOrSubtractExpression"


    // $ANTLR start "ruleUnaryAddOrSubtractExpression"
    // InternalSql.g:1627:1: ruleUnaryAddOrSubtractExpression returns [EObject current=null] : (this_StringListNullOperatorExpression_0= ruleStringListNullOperatorExpression | ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_left_3_0= ruleUnaryAddOrSubtractExpression ) ) ) ) ;
    public final EObject ruleUnaryAddOrSubtractExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_StringListNullOperatorExpression_0 = null;

        EObject lv_left_3_0 = null;



        	enterRule();

        try {
            // InternalSql.g:1633:2: ( (this_StringListNullOperatorExpression_0= ruleStringListNullOperatorExpression | ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_left_3_0= ruleUnaryAddOrSubtractExpression ) ) ) ) )
            // InternalSql.g:1634:2: (this_StringListNullOperatorExpression_0= ruleStringListNullOperatorExpression | ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_left_3_0= ruleUnaryAddOrSubtractExpression ) ) ) )
            {
            // InternalSql.g:1634:2: (this_StringListNullOperatorExpression_0= ruleStringListNullOperatorExpression | ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_left_3_0= ruleUnaryAddOrSubtractExpression ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_DECIMAL)||(LA26_0>=26 && LA26_0<=27)||LA26_0==53) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=38 && LA26_0<=39)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSql.g:1635:3: this_StringListNullOperatorExpression_0= ruleStringListNullOperatorExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getStringListNullOperatorExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringListNullOperatorExpression_0=ruleStringListNullOperatorExpression();

                    state._fsp--;


                    			current = this_StringListNullOperatorExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSql.g:1644:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_left_3_0= ruleUnaryAddOrSubtractExpression ) ) )
                    {
                    // InternalSql.g:1644:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_left_3_0= ruleUnaryAddOrSubtractExpression ) ) )
                    // InternalSql.g:1645:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_left_3_0= ruleUnaryAddOrSubtractExpression ) )
                    {
                    // InternalSql.g:1645:4: ()
                    // InternalSql.g:1646:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getUnaryAddOrSubtractExpressionAccess().getUnaryAddOrSubtractExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalSql.g:1652:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
                    // InternalSql.g:1653:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
                    {
                    // InternalSql.g:1653:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
                    // InternalSql.g:1654:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
                    {
                    // InternalSql.g:1654:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==38) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==39) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalSql.g:1655:7: lv_operator_2_1= '+'
                            {
                            lv_operator_2_1=(Token)match(input,38,FOLLOW_9); 

                            							newLeafNode(lv_operator_2_1, grammarAccess.getUnaryAddOrSubtractExpressionAccess().getOperatorPlusSignKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUnaryAddOrSubtractExpressionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalSql.g:1666:7: lv_operator_2_2= '-'
                            {
                            lv_operator_2_2=(Token)match(input,39,FOLLOW_9); 

                            							newLeafNode(lv_operator_2_2, grammarAccess.getUnaryAddOrSubtractExpressionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getUnaryAddOrSubtractExpressionRule());
                            							}
                            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }

                    // InternalSql.g:1679:4: ( (lv_left_3_0= ruleUnaryAddOrSubtractExpression ) )
                    // InternalSql.g:1680:5: (lv_left_3_0= ruleUnaryAddOrSubtractExpression )
                    {
                    // InternalSql.g:1680:5: (lv_left_3_0= ruleUnaryAddOrSubtractExpression )
                    // InternalSql.g:1681:6: lv_left_3_0= ruleUnaryAddOrSubtractExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryAddOrSubtractExpressionAccess().getLeftUnaryAddOrSubtractExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_left_3_0=ruleUnaryAddOrSubtractExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryAddOrSubtractExpressionRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_3_0,
                    							"org.xtext.example.mydsl.Sql.UnaryAddOrSubtractExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleUnaryAddOrSubtractExpression"


    // $ANTLR start "entryRuleStringListNullOperatorExpression"
    // InternalSql.g:1703:1: entryRuleStringListNullOperatorExpression returns [EObject current=null] : iv_ruleStringListNullOperatorExpression= ruleStringListNullOperatorExpression EOF ;
    public final EObject entryRuleStringListNullOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringListNullOperatorExpression = null;


        try {
            // InternalSql.g:1703:73: (iv_ruleStringListNullOperatorExpression= ruleStringListNullOperatorExpression EOF )
            // InternalSql.g:1704:2: iv_ruleStringListNullOperatorExpression= ruleStringListNullOperatorExpression EOF
            {
             newCompositeNode(grammarAccess.getStringListNullOperatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringListNullOperatorExpression=ruleStringListNullOperatorExpression();

            state._fsp--;

             current =iv_ruleStringListNullOperatorExpression; 
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
    // $ANTLR end "entryRuleStringListNullOperatorExpression"


    // $ANTLR start "ruleStringListNullOperatorExpression"
    // InternalSql.g:1710:1: ruleStringListNullOperatorExpression returns [EObject current=null] : (this_PropertyOrRelationAttributeExpression_0= rulePropertyOrRelationAttributeExpression ( () ( ( (lv_expressions_2_1= ruleStringOperatorExpression | lv_expressions_2_2= ruleNullOperatorExpression ) ) ) )* ) ;
    public final EObject ruleStringListNullOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyOrRelationAttributeExpression_0 = null;

        EObject lv_expressions_2_1 = null;

        EObject lv_expressions_2_2 = null;



        	enterRule();

        try {
            // InternalSql.g:1716:2: ( (this_PropertyOrRelationAttributeExpression_0= rulePropertyOrRelationAttributeExpression ( () ( ( (lv_expressions_2_1= ruleStringOperatorExpression | lv_expressions_2_2= ruleNullOperatorExpression ) ) ) )* ) )
            // InternalSql.g:1717:2: (this_PropertyOrRelationAttributeExpression_0= rulePropertyOrRelationAttributeExpression ( () ( ( (lv_expressions_2_1= ruleStringOperatorExpression | lv_expressions_2_2= ruleNullOperatorExpression ) ) ) )* )
            {
            // InternalSql.g:1717:2: (this_PropertyOrRelationAttributeExpression_0= rulePropertyOrRelationAttributeExpression ( () ( ( (lv_expressions_2_1= ruleStringOperatorExpression | lv_expressions_2_2= ruleNullOperatorExpression ) ) ) )* )
            // InternalSql.g:1718:3: this_PropertyOrRelationAttributeExpression_0= rulePropertyOrRelationAttributeExpression ( () ( ( (lv_expressions_2_1= ruleStringOperatorExpression | lv_expressions_2_2= ruleNullOperatorExpression ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getStringListNullOperatorExpressionAccess().getPropertyOrRelationAttributeExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_PropertyOrRelationAttributeExpression_0=rulePropertyOrRelationAttributeExpression();

            state._fsp--;


            			current = this_PropertyOrRelationAttributeExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSql.g:1726:3: ( () ( ( (lv_expressions_2_1= ruleStringOperatorExpression | lv_expressions_2_2= ruleNullOperatorExpression ) ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=44 && LA28_0<=46)||(LA28_0>=48 && LA28_0<=50)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSql.g:1727:4: () ( ( (lv_expressions_2_1= ruleStringOperatorExpression | lv_expressions_2_2= ruleNullOperatorExpression ) ) )
            	    {
            	    // InternalSql.g:1727:4: ()
            	    // InternalSql.g:1728:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getStringListNullOperatorExpressionAccess().getStringListNullOperatorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalSql.g:1734:4: ( ( (lv_expressions_2_1= ruleStringOperatorExpression | lv_expressions_2_2= ruleNullOperatorExpression ) ) )
            	    // InternalSql.g:1735:5: ( (lv_expressions_2_1= ruleStringOperatorExpression | lv_expressions_2_2= ruleNullOperatorExpression ) )
            	    {
            	    // InternalSql.g:1735:5: ( (lv_expressions_2_1= ruleStringOperatorExpression | lv_expressions_2_2= ruleNullOperatorExpression ) )
            	    // InternalSql.g:1736:6: (lv_expressions_2_1= ruleStringOperatorExpression | lv_expressions_2_2= ruleNullOperatorExpression )
            	    {
            	    // InternalSql.g:1736:6: (lv_expressions_2_1= ruleStringOperatorExpression | lv_expressions_2_2= ruleNullOperatorExpression )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( ((LA27_0>=44 && LA27_0<=46)||(LA27_0>=48 && LA27_0<=49)) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==50) ) {
            	        alt27=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalSql.g:1737:7: lv_expressions_2_1= ruleStringOperatorExpression
            	            {

            	            							newCompositeNode(grammarAccess.getStringListNullOperatorExpressionAccess().getExpressionsStringOperatorExpressionParserRuleCall_1_1_0_0());
            	            						
            	            pushFollow(FOLLOW_28);
            	            lv_expressions_2_1=ruleStringOperatorExpression();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getStringListNullOperatorExpressionRule());
            	            							}
            	            							add(
            	            								current,
            	            								"expressions",
            	            								lv_expressions_2_1,
            	            								"org.xtext.example.mydsl.Sql.StringOperatorExpression");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalSql.g:1753:7: lv_expressions_2_2= ruleNullOperatorExpression
            	            {

            	            							newCompositeNode(grammarAccess.getStringListNullOperatorExpressionAccess().getExpressionsNullOperatorExpressionParserRuleCall_1_1_0_1());
            	            						
            	            pushFollow(FOLLOW_28);
            	            lv_expressions_2_2=ruleNullOperatorExpression();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getStringListNullOperatorExpressionRule());
            	            							}
            	            							add(
            	            								current,
            	            								"expressions",
            	            								lv_expressions_2_2,
            	            								"org.xtext.example.mydsl.Sql.NullOperatorExpression");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleStringListNullOperatorExpression"


    // $ANTLR start "entryRuleStringOperatorExpression"
    // InternalSql.g:1776:1: entryRuleStringOperatorExpression returns [EObject current=null] : iv_ruleStringOperatorExpression= ruleStringOperatorExpression EOF ;
    public final EObject entryRuleStringOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringOperatorExpression = null;


        try {
            // InternalSql.g:1776:65: (iv_ruleStringOperatorExpression= ruleStringOperatorExpression EOF )
            // InternalSql.g:1777:2: iv_ruleStringOperatorExpression= ruleStringOperatorExpression EOF
            {
             newCompositeNode(grammarAccess.getStringOperatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringOperatorExpression=ruleStringOperatorExpression();

            state._fsp--;

             current =iv_ruleStringOperatorExpression; 
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
    // $ANTLR end "entryRuleStringOperatorExpression"


    // $ANTLR start "ruleStringOperatorExpression"
    // InternalSql.g:1783:1: ruleStringOperatorExpression returns [EObject current=null] : ( ( ( () otherlv_1= '=~' ) | ( () otherlv_3= 'IN' ) | ( () otherlv_5= 'STARTS' otherlv_6= 'WITH' ) | ( () otherlv_8= 'ENDS' otherlv_9= 'WITH' ) | ( () otherlv_11= 'CONTAINS' ) ) ( (lv_right_12_0= rulePropertyOrRelationAttributeExpression ) ) ) ;
    public final EObject ruleStringOperatorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_right_12_0 = null;



        	enterRule();

        try {
            // InternalSql.g:1789:2: ( ( ( ( () otherlv_1= '=~' ) | ( () otherlv_3= 'IN' ) | ( () otherlv_5= 'STARTS' otherlv_6= 'WITH' ) | ( () otherlv_8= 'ENDS' otherlv_9= 'WITH' ) | ( () otherlv_11= 'CONTAINS' ) ) ( (lv_right_12_0= rulePropertyOrRelationAttributeExpression ) ) ) )
            // InternalSql.g:1790:2: ( ( ( () otherlv_1= '=~' ) | ( () otherlv_3= 'IN' ) | ( () otherlv_5= 'STARTS' otherlv_6= 'WITH' ) | ( () otherlv_8= 'ENDS' otherlv_9= 'WITH' ) | ( () otherlv_11= 'CONTAINS' ) ) ( (lv_right_12_0= rulePropertyOrRelationAttributeExpression ) ) )
            {
            // InternalSql.g:1790:2: ( ( ( () otherlv_1= '=~' ) | ( () otherlv_3= 'IN' ) | ( () otherlv_5= 'STARTS' otherlv_6= 'WITH' ) | ( () otherlv_8= 'ENDS' otherlv_9= 'WITH' ) | ( () otherlv_11= 'CONTAINS' ) ) ( (lv_right_12_0= rulePropertyOrRelationAttributeExpression ) ) )
            // InternalSql.g:1791:3: ( ( () otherlv_1= '=~' ) | ( () otherlv_3= 'IN' ) | ( () otherlv_5= 'STARTS' otherlv_6= 'WITH' ) | ( () otherlv_8= 'ENDS' otherlv_9= 'WITH' ) | ( () otherlv_11= 'CONTAINS' ) ) ( (lv_right_12_0= rulePropertyOrRelationAttributeExpression ) )
            {
            // InternalSql.g:1791:3: ( ( () otherlv_1= '=~' ) | ( () otherlv_3= 'IN' ) | ( () otherlv_5= 'STARTS' otherlv_6= 'WITH' ) | ( () otherlv_8= 'ENDS' otherlv_9= 'WITH' ) | ( () otherlv_11= 'CONTAINS' ) )
            int alt29=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt29=1;
                }
                break;
            case 45:
                {
                alt29=2;
                }
                break;
            case 46:
                {
                alt29=3;
                }
                break;
            case 48:
                {
                alt29=4;
                }
                break;
            case 49:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalSql.g:1792:4: ( () otherlv_1= '=~' )
                    {
                    // InternalSql.g:1792:4: ( () otherlv_1= '=~' )
                    // InternalSql.g:1793:5: () otherlv_1= '=~'
                    {
                    // InternalSql.g:1793:5: ()
                    // InternalSql.g:1794:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getStringOperatorExpressionAccess().getRegExpMatchingExpressionAction_0_0_0(),
                    							current);
                    					

                    }

                    otherlv_1=(Token)match(input,44,FOLLOW_21); 

                    					newLeafNode(otherlv_1, grammarAccess.getStringOperatorExpressionAccess().getEqualsSignTildeKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1806:4: ( () otherlv_3= 'IN' )
                    {
                    // InternalSql.g:1806:4: ( () otherlv_3= 'IN' )
                    // InternalSql.g:1807:5: () otherlv_3= 'IN'
                    {
                    // InternalSql.g:1807:5: ()
                    // InternalSql.g:1808:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getStringOperatorExpressionAccess().getInCollectionExpressionAction_0_1_0(),
                    							current);
                    					

                    }

                    otherlv_3=(Token)match(input,45,FOLLOW_21); 

                    					newLeafNode(otherlv_3, grammarAccess.getStringOperatorExpressionAccess().getINKeyword_0_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalSql.g:1820:4: ( () otherlv_5= 'STARTS' otherlv_6= 'WITH' )
                    {
                    // InternalSql.g:1820:4: ( () otherlv_5= 'STARTS' otherlv_6= 'WITH' )
                    // InternalSql.g:1821:5: () otherlv_5= 'STARTS' otherlv_6= 'WITH'
                    {
                    // InternalSql.g:1821:5: ()
                    // InternalSql.g:1822:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getStringOperatorExpressionAccess().getStartsWithExpressionAction_0_2_0(),
                    							current);
                    					

                    }

                    otherlv_5=(Token)match(input,46,FOLLOW_29); 

                    					newLeafNode(otherlv_5, grammarAccess.getStringOperatorExpressionAccess().getSTARTSKeyword_0_2_1());
                    				
                    otherlv_6=(Token)match(input,47,FOLLOW_21); 

                    					newLeafNode(otherlv_6, grammarAccess.getStringOperatorExpressionAccess().getWITHKeyword_0_2_2());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalSql.g:1838:4: ( () otherlv_8= 'ENDS' otherlv_9= 'WITH' )
                    {
                    // InternalSql.g:1838:4: ( () otherlv_8= 'ENDS' otherlv_9= 'WITH' )
                    // InternalSql.g:1839:5: () otherlv_8= 'ENDS' otherlv_9= 'WITH'
                    {
                    // InternalSql.g:1839:5: ()
                    // InternalSql.g:1840:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getStringOperatorExpressionAccess().getEndsWithExpressionAction_0_3_0(),
                    							current);
                    					

                    }

                    otherlv_8=(Token)match(input,48,FOLLOW_29); 

                    					newLeafNode(otherlv_8, grammarAccess.getStringOperatorExpressionAccess().getENDSKeyword_0_3_1());
                    				
                    otherlv_9=(Token)match(input,47,FOLLOW_21); 

                    					newLeafNode(otherlv_9, grammarAccess.getStringOperatorExpressionAccess().getWITHKeyword_0_3_2());
                    				

                    }


                    }
                    break;
                case 5 :
                    // InternalSql.g:1856:4: ( () otherlv_11= 'CONTAINS' )
                    {
                    // InternalSql.g:1856:4: ( () otherlv_11= 'CONTAINS' )
                    // InternalSql.g:1857:5: () otherlv_11= 'CONTAINS'
                    {
                    // InternalSql.g:1857:5: ()
                    // InternalSql.g:1858:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getStringOperatorExpressionAccess().getContainsExpressionAction_0_4_0(),
                    							current);
                    					

                    }

                    otherlv_11=(Token)match(input,49,FOLLOW_21); 

                    					newLeafNode(otherlv_11, grammarAccess.getStringOperatorExpressionAccess().getCONTAINSKeyword_0_4_1());
                    				

                    }


                    }
                    break;

            }

            // InternalSql.g:1870:3: ( (lv_right_12_0= rulePropertyOrRelationAttributeExpression ) )
            // InternalSql.g:1871:4: (lv_right_12_0= rulePropertyOrRelationAttributeExpression )
            {
            // InternalSql.g:1871:4: (lv_right_12_0= rulePropertyOrRelationAttributeExpression )
            // InternalSql.g:1872:5: lv_right_12_0= rulePropertyOrRelationAttributeExpression
            {

            					newCompositeNode(grammarAccess.getStringOperatorExpressionAccess().getRightPropertyOrRelationAttributeExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_12_0=rulePropertyOrRelationAttributeExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringOperatorExpressionRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_12_0,
            						"org.xtext.example.mydsl.Sql.PropertyOrRelationAttributeExpression");
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
    // $ANTLR end "ruleStringOperatorExpression"


    // $ANTLR start "entryRuleNullOperatorExpression"
    // InternalSql.g:1893:1: entryRuleNullOperatorExpression returns [EObject current=null] : iv_ruleNullOperatorExpression= ruleNullOperatorExpression EOF ;
    public final EObject entryRuleNullOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullOperatorExpression = null;


        try {
            // InternalSql.g:1893:63: (iv_ruleNullOperatorExpression= ruleNullOperatorExpression EOF )
            // InternalSql.g:1894:2: iv_ruleNullOperatorExpression= ruleNullOperatorExpression EOF
            {
             newCompositeNode(grammarAccess.getNullOperatorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNullOperatorExpression=ruleNullOperatorExpression();

            state._fsp--;

             current =iv_ruleNullOperatorExpression; 
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
    // $ANTLR end "entryRuleNullOperatorExpression"


    // $ANTLR start "ruleNullOperatorExpression"
    // InternalSql.g:1900:1: ruleNullOperatorExpression returns [EObject current=null] : ( ( () otherlv_1= 'IS' otherlv_2= 'NULL' ) | ( () otherlv_4= 'IS' otherlv_5= 'NOT' otherlv_6= 'NULL' ) ) ;
    public final EObject ruleNullOperatorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSql.g:1906:2: ( ( ( () otherlv_1= 'IS' otherlv_2= 'NULL' ) | ( () otherlv_4= 'IS' otherlv_5= 'NOT' otherlv_6= 'NULL' ) ) )
            // InternalSql.g:1907:2: ( ( () otherlv_1= 'IS' otherlv_2= 'NULL' ) | ( () otherlv_4= 'IS' otherlv_5= 'NOT' otherlv_6= 'NULL' ) )
            {
            // InternalSql.g:1907:2: ( ( () otherlv_1= 'IS' otherlv_2= 'NULL' ) | ( () otherlv_4= 'IS' otherlv_5= 'NOT' otherlv_6= 'NULL' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==50) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==51) ) {
                    alt30=1;
                }
                else if ( (LA30_1==25) ) {
                    alt30=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSql.g:1908:3: ( () otherlv_1= 'IS' otherlv_2= 'NULL' )
                    {
                    // InternalSql.g:1908:3: ( () otherlv_1= 'IS' otherlv_2= 'NULL' )
                    // InternalSql.g:1909:4: () otherlv_1= 'IS' otherlv_2= 'NULL'
                    {
                    // InternalSql.g:1909:4: ()
                    // InternalSql.g:1910:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNullOperatorExpressionAccess().getIsNullExpressionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,50,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getNullOperatorExpressionAccess().getISKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getNullOperatorExpressionAccess().getNULLKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSql.g:1926:3: ( () otherlv_4= 'IS' otherlv_5= 'NOT' otherlv_6= 'NULL' )
                    {
                    // InternalSql.g:1926:3: ( () otherlv_4= 'IS' otherlv_5= 'NOT' otherlv_6= 'NULL' )
                    // InternalSql.g:1927:4: () otherlv_4= 'IS' otherlv_5= 'NOT' otherlv_6= 'NULL'
                    {
                    // InternalSql.g:1927:4: ()
                    // InternalSql.g:1928:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNullOperatorExpressionAccess().getIsNotNullExpressionAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,50,FOLLOW_31); 

                    				newLeafNode(otherlv_4, grammarAccess.getNullOperatorExpressionAccess().getISKeyword_1_1());
                    			
                    otherlv_5=(Token)match(input,25,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getNullOperatorExpressionAccess().getNOTKeyword_1_2());
                    			
                    otherlv_6=(Token)match(input,51,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getNullOperatorExpressionAccess().getNULLKeyword_1_3());
                    			

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
    // $ANTLR end "ruleNullOperatorExpression"


    // $ANTLR start "entryRulePropertyOrRelationAttributeExpression"
    // InternalSql.g:1951:1: entryRulePropertyOrRelationAttributeExpression returns [EObject current=null] : iv_rulePropertyOrRelationAttributeExpression= rulePropertyOrRelationAttributeExpression EOF ;
    public final EObject entryRulePropertyOrRelationAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyOrRelationAttributeExpression = null;


        try {
            // InternalSql.g:1951:78: (iv_rulePropertyOrRelationAttributeExpression= rulePropertyOrRelationAttributeExpression EOF )
            // InternalSql.g:1952:2: iv_rulePropertyOrRelationAttributeExpression= rulePropertyOrRelationAttributeExpression EOF
            {
             newCompositeNode(grammarAccess.getPropertyOrRelationAttributeExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyOrRelationAttributeExpression=rulePropertyOrRelationAttributeExpression();

            state._fsp--;

             current =iv_rulePropertyOrRelationAttributeExpression; 
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
    // $ANTLR end "entryRulePropertyOrRelationAttributeExpression"


    // $ANTLR start "rulePropertyOrRelationAttributeExpression"
    // InternalSql.g:1958:1: rulePropertyOrRelationAttributeExpression returns [EObject current=null] : (this_Atom_0= ruleAtom ( (lv_attributeLookup_1_0= ruleAttributeLookup ) )? ) ;
    public final EObject rulePropertyOrRelationAttributeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Atom_0 = null;

        EObject lv_attributeLookup_1_0 = null;



        	enterRule();

        try {
            // InternalSql.g:1964:2: ( (this_Atom_0= ruleAtom ( (lv_attributeLookup_1_0= ruleAttributeLookup ) )? ) )
            // InternalSql.g:1965:2: (this_Atom_0= ruleAtom ( (lv_attributeLookup_1_0= ruleAttributeLookup ) )? )
            {
            // InternalSql.g:1965:2: (this_Atom_0= ruleAtom ( (lv_attributeLookup_1_0= ruleAttributeLookup ) )? )
            // InternalSql.g:1966:3: this_Atom_0= ruleAtom ( (lv_attributeLookup_1_0= ruleAttributeLookup ) )?
            {

            			newCompositeNode(grammarAccess.getPropertyOrRelationAttributeExpressionAccess().getAtomParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Atom_0=ruleAtom();

            state._fsp--;


            			current = this_Atom_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalSql.g:1974:3: ( (lv_attributeLookup_1_0= ruleAttributeLookup ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==52) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSql.g:1975:4: (lv_attributeLookup_1_0= ruleAttributeLookup )
                    {
                    // InternalSql.g:1975:4: (lv_attributeLookup_1_0= ruleAttributeLookup )
                    // InternalSql.g:1976:5: lv_attributeLookup_1_0= ruleAttributeLookup
                    {

                    					newCompositeNode(grammarAccess.getPropertyOrRelationAttributeExpressionAccess().getAttributeLookupAttributeLookupParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_attributeLookup_1_0=ruleAttributeLookup();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyOrRelationAttributeExpressionRule());
                    					}
                    					set(
                    						current,
                    						"attributeLookup",
                    						lv_attributeLookup_1_0,
                    						"org.xtext.example.mydsl.Sql.AttributeLookup");
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
    // $ANTLR end "rulePropertyOrRelationAttributeExpression"


    // $ANTLR start "entryRuleAttributeLookup"
    // InternalSql.g:1997:1: entryRuleAttributeLookup returns [EObject current=null] : iv_ruleAttributeLookup= ruleAttributeLookup EOF ;
    public final EObject entryRuleAttributeLookup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeLookup = null;


        try {
            // InternalSql.g:1997:56: (iv_ruleAttributeLookup= ruleAttributeLookup EOF )
            // InternalSql.g:1998:2: iv_ruleAttributeLookup= ruleAttributeLookup EOF
            {
             newCompositeNode(grammarAccess.getAttributeLookupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeLookup=ruleAttributeLookup();

            state._fsp--;

             current =iv_ruleAttributeLookup; 
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
    // $ANTLR end "entryRuleAttributeLookup"


    // $ANTLR start "ruleAttributeLookup"
    // InternalSql.g:2004:1: ruleAttributeLookup returns [EObject current=null] : (otherlv_0= '.' ( (lv_attributeKeyName_1_0= ruleAttributeKeyName ) ) ) ;
    public final EObject ruleAttributeLookup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_attributeKeyName_1_0 = null;



        	enterRule();

        try {
            // InternalSql.g:2010:2: ( (otherlv_0= '.' ( (lv_attributeKeyName_1_0= ruleAttributeKeyName ) ) ) )
            // InternalSql.g:2011:2: (otherlv_0= '.' ( (lv_attributeKeyName_1_0= ruleAttributeKeyName ) ) )
            {
            // InternalSql.g:2011:2: (otherlv_0= '.' ( (lv_attributeKeyName_1_0= ruleAttributeKeyName ) ) )
            // InternalSql.g:2012:3: otherlv_0= '.' ( (lv_attributeKeyName_1_0= ruleAttributeKeyName ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeLookupAccess().getFullStopKeyword_0());
            		
            // InternalSql.g:2016:3: ( (lv_attributeKeyName_1_0= ruleAttributeKeyName ) )
            // InternalSql.g:2017:4: (lv_attributeKeyName_1_0= ruleAttributeKeyName )
            {
            // InternalSql.g:2017:4: (lv_attributeKeyName_1_0= ruleAttributeKeyName )
            // InternalSql.g:2018:5: lv_attributeKeyName_1_0= ruleAttributeKeyName
            {

            					newCompositeNode(grammarAccess.getAttributeLookupAccess().getAttributeKeyNameAttributeKeyNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_attributeKeyName_1_0=ruleAttributeKeyName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeLookupRule());
            					}
            					set(
            						current,
            						"attributeKeyName",
            						lv_attributeKeyName_1_0,
            						"org.xtext.example.mydsl.Sql.AttributeKeyName");
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
    // $ANTLR end "ruleAttributeLookup"


    // $ANTLR start "entryRuleAttributeKeyName"
    // InternalSql.g:2039:1: entryRuleAttributeKeyName returns [String current=null] : iv_ruleAttributeKeyName= ruleAttributeKeyName EOF ;
    public final String entryRuleAttributeKeyName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeKeyName = null;


        try {
            // InternalSql.g:2039:56: (iv_ruleAttributeKeyName= ruleAttributeKeyName EOF )
            // InternalSql.g:2040:2: iv_ruleAttributeKeyName= ruleAttributeKeyName EOF
            {
             newCompositeNode(grammarAccess.getAttributeKeyNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeKeyName=ruleAttributeKeyName();

            state._fsp--;

             current =iv_ruleAttributeKeyName.getText(); 
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
    // $ANTLR end "entryRuleAttributeKeyName"


    // $ANTLR start "ruleAttributeKeyName"
    // InternalSql.g:2046:1: ruleAttributeKeyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SYMBOLIC_NAME_X_0= ruleSYMBOLIC_NAME_X ;
    public final AntlrDatatypeRuleToken ruleAttributeKeyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SYMBOLIC_NAME_X_0 = null;



        	enterRule();

        try {
            // InternalSql.g:2052:2: (this_SYMBOLIC_NAME_X_0= ruleSYMBOLIC_NAME_X )
            // InternalSql.g:2053:2: this_SYMBOLIC_NAME_X_0= ruleSYMBOLIC_NAME_X
            {

            		newCompositeNode(grammarAccess.getAttributeKeyNameAccess().getSYMBOLIC_NAME_XParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SYMBOLIC_NAME_X_0=ruleSYMBOLIC_NAME_X();

            state._fsp--;


            		current.merge(this_SYMBOLIC_NAME_X_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleAttributeKeyName"


    // $ANTLR start "entryRuleAtom"
    // InternalSql.g:2066:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // InternalSql.g:2066:45: (iv_ruleAtom= ruleAtom EOF )
            // InternalSql.g:2067:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // InternalSql.g:2073:1: ruleAtom returns [EObject current=null] : (this_Literal_0= ruleLiteral | ( () otherlv_2= 'COUNT' otherlv_3= '(' otherlv_4= '*' otherlv_5= ')' ) | ( () ( (lv_variableRef_7_0= ruleVariableDeclaration ) ) ) | this_FunctionInvocation_8= ruleFunctionInvocation ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_Literal_0 = null;

        EObject lv_variableRef_7_0 = null;

        EObject this_FunctionInvocation_8 = null;



        	enterRule();

        try {
            // InternalSql.g:2079:2: ( (this_Literal_0= ruleLiteral | ( () otherlv_2= 'COUNT' otherlv_3= '(' otherlv_4= '*' otherlv_5= ')' ) | ( () ( (lv_variableRef_7_0= ruleVariableDeclaration ) ) ) | this_FunctionInvocation_8= ruleFunctionInvocation ) )
            // InternalSql.g:2080:2: (this_Literal_0= ruleLiteral | ( () otherlv_2= 'COUNT' otherlv_3= '(' otherlv_4= '*' otherlv_5= ')' ) | ( () ( (lv_variableRef_7_0= ruleVariableDeclaration ) ) ) | this_FunctionInvocation_8= ruleFunctionInvocation )
            {
            // InternalSql.g:2080:2: (this_Literal_0= ruleLiteral | ( () otherlv_2= 'COUNT' otherlv_3= '(' otherlv_4= '*' otherlv_5= ')' ) | ( () ( (lv_variableRef_7_0= ruleVariableDeclaration ) ) ) | this_FunctionInvocation_8= ruleFunctionInvocation )
            int alt32=4;
            switch ( input.LA(1) ) {
            case RULE_STRING_LITERAL:
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
            case 26:
            case 27:
                {
                alt32=1;
                }
                break;
            case 53:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
                {
                int LA32_3 = input.LA(2);

                if ( (LA32_3==20) ) {
                    alt32=4;
                }
                else if ( (LA32_3==EOF||LA32_3==14||(LA32_3>=16 && LA32_3<=18)||(LA32_3>=21 && LA32_3<=24)||(LA32_3>=28 && LA32_3<=33)||(LA32_3>=35 && LA32_3<=46)||(LA32_3>=48 && LA32_3<=50)||LA32_3==52) ) {
                    alt32=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalSql.g:2081:3: this_Literal_0= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getAtomAccess().getLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSql.g:2090:3: ( () otherlv_2= 'COUNT' otherlv_3= '(' otherlv_4= '*' otherlv_5= ')' )
                    {
                    // InternalSql.g:2090:3: ( () otherlv_2= 'COUNT' otherlv_3= '(' otherlv_4= '*' otherlv_5= ')' )
                    // InternalSql.g:2091:4: () otherlv_2= 'COUNT' otherlv_3= '(' otherlv_4= '*' otherlv_5= ')'
                    {
                    // InternalSql.g:2091:4: ()
                    // InternalSql.g:2092:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomAccess().getCountAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_2=(Token)match(input,53,FOLLOW_33); 

                    				newLeafNode(otherlv_2, grammarAccess.getAtomAccess().getCOUNTKeyword_1_1());
                    			
                    otherlv_3=(Token)match(input,20,FOLLOW_34); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_2());
                    			
                    otherlv_4=(Token)match(input,40,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getAtomAccess().getAsteriskKeyword_1_3());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSql.g:2116:3: ( () ( (lv_variableRef_7_0= ruleVariableDeclaration ) ) )
                    {
                    // InternalSql.g:2116:3: ( () ( (lv_variableRef_7_0= ruleVariableDeclaration ) ) )
                    // InternalSql.g:2117:4: () ( (lv_variableRef_7_0= ruleVariableDeclaration ) )
                    {
                    // InternalSql.g:2117:4: ()
                    // InternalSql.g:2118:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomAccess().getVariableRefAction_2_0(),
                    						current);
                    				

                    }

                    // InternalSql.g:2124:4: ( (lv_variableRef_7_0= ruleVariableDeclaration ) )
                    // InternalSql.g:2125:5: (lv_variableRef_7_0= ruleVariableDeclaration )
                    {
                    // InternalSql.g:2125:5: (lv_variableRef_7_0= ruleVariableDeclaration )
                    // InternalSql.g:2126:6: lv_variableRef_7_0= ruleVariableDeclaration
                    {

                    						newCompositeNode(grammarAccess.getAtomAccess().getVariableRefVariableDeclarationParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_variableRef_7_0=ruleVariableDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomRule());
                    						}
                    						set(
                    							current,
                    							"variableRef",
                    							lv_variableRef_7_0,
                    							"org.xtext.example.mydsl.Sql.VariableDeclaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalSql.g:2145:3: this_FunctionInvocation_8= ruleFunctionInvocation
                    {

                    			newCompositeNode(grammarAccess.getAtomAccess().getFunctionInvocationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionInvocation_8=ruleFunctionInvocation();

                    state._fsp--;


                    			current = this_FunctionInvocation_8;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleFunctionInvocation"
    // InternalSql.g:2157:1: entryRuleFunctionInvocation returns [EObject current=null] : iv_ruleFunctionInvocation= ruleFunctionInvocation EOF ;
    public final EObject entryRuleFunctionInvocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionInvocation = null;


        try {
            // InternalSql.g:2157:59: (iv_ruleFunctionInvocation= ruleFunctionInvocation EOF )
            // InternalSql.g:2158:2: iv_ruleFunctionInvocation= ruleFunctionInvocation EOF
            {
             newCompositeNode(grammarAccess.getFunctionInvocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionInvocation=ruleFunctionInvocation();

            state._fsp--;

             current =iv_ruleFunctionInvocation; 
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
    // $ANTLR end "entryRuleFunctionInvocation"


    // $ANTLR start "ruleFunctionInvocation"
    // InternalSql.g:2164:1: ruleFunctionInvocation returns [EObject current=null] : ( ( (lv_functionName_0_0= ruleFunctionName ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionInvocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_functionName_0_0 = null;

        EObject lv_parameter_2_0 = null;

        EObject lv_parameter_4_0 = null;



        	enterRule();

        try {
            // InternalSql.g:2170:2: ( ( ( (lv_functionName_0_0= ruleFunctionName ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) )
            // InternalSql.g:2171:2: ( ( (lv_functionName_0_0= ruleFunctionName ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            {
            // InternalSql.g:2171:2: ( ( (lv_functionName_0_0= ruleFunctionName ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
            // InternalSql.g:2172:3: ( (lv_functionName_0_0= ruleFunctionName ) ) otherlv_1= '(' ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
            {
            // InternalSql.g:2172:3: ( (lv_functionName_0_0= ruleFunctionName ) )
            // InternalSql.g:2173:4: (lv_functionName_0_0= ruleFunctionName )
            {
            // InternalSql.g:2173:4: (lv_functionName_0_0= ruleFunctionName )
            // InternalSql.g:2174:5: lv_functionName_0_0= ruleFunctionName
            {

            					newCompositeNode(grammarAccess.getFunctionInvocationAccess().getFunctionNameFunctionNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_functionName_0_0=ruleFunctionName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionInvocationRule());
            					}
            					set(
            						current,
            						"functionName",
            						lv_functionName_0_0,
            						"org.xtext.example.mydsl.Sql.FunctionName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionInvocationAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSql.g:2195:3: ( ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_DECIMAL)||(LA34_0>=25 && LA34_0<=27)||(LA34_0>=38 && LA34_0<=39)||LA34_0==53) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSql.g:2196:4: ( (lv_parameter_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )*
                    {
                    // InternalSql.g:2196:4: ( (lv_parameter_2_0= ruleExpression ) )
                    // InternalSql.g:2197:5: (lv_parameter_2_0= ruleExpression )
                    {
                    // InternalSql.g:2197:5: (lv_parameter_2_0= ruleExpression )
                    // InternalSql.g:2198:6: lv_parameter_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getFunctionInvocationAccess().getParameterExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_parameter_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionInvocationRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_2_0,
                    							"org.xtext.example.mydsl.Sql.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSql.g:2215:4: (otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==16) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalSql.g:2216:5: otherlv_3= ',' ( (lv_parameter_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_9); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionInvocationAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSql.g:2220:5: ( (lv_parameter_4_0= ruleExpression ) )
                    	    // InternalSql.g:2221:6: (lv_parameter_4_0= ruleExpression )
                    	    {
                    	    // InternalSql.g:2221:6: (lv_parameter_4_0= ruleExpression )
                    	    // InternalSql.g:2222:7: lv_parameter_4_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionInvocationAccess().getParameterExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_36);
                    	    lv_parameter_4_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionInvocationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_4_0,
                    	    								"org.xtext.example.mydsl.Sql.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionInvocationAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFunctionInvocation"


    // $ANTLR start "entryRuleFunctionName"
    // InternalSql.g:2249:1: entryRuleFunctionName returns [String current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final String entryRuleFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionName = null;


        try {
            // InternalSql.g:2249:52: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalSql.g:2250:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName.getText(); 
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
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalSql.g:2256:1: ruleFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_SYMBOLIC_NAME_X_0= ruleSYMBOLIC_NAME_X ;
    public final AntlrDatatypeRuleToken ruleFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_SYMBOLIC_NAME_X_0 = null;



        	enterRule();

        try {
            // InternalSql.g:2262:2: (this_SYMBOLIC_NAME_X_0= ruleSYMBOLIC_NAME_X )
            // InternalSql.g:2263:2: this_SYMBOLIC_NAME_X_0= ruleSYMBOLIC_NAME_X
            {

            		newCompositeNode(grammarAccess.getFunctionNameAccess().getSYMBOLIC_NAME_XParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_SYMBOLIC_NAME_X_0=ruleSYMBOLIC_NAME_X();

            state._fsp--;


            		current.merge(this_SYMBOLIC_NAME_X_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalSql.g:2276:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalSql.g:2276:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalSql.g:2277:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalSql.g:2283:1: ruleVariableDeclaration returns [EObject current=null] : ( (lv_name_0_0= ruleSYMBOLIC_NAME_X ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSql.g:2289:2: ( ( (lv_name_0_0= ruleSYMBOLIC_NAME_X ) ) )
            // InternalSql.g:2290:2: ( (lv_name_0_0= ruleSYMBOLIC_NAME_X ) )
            {
            // InternalSql.g:2290:2: ( (lv_name_0_0= ruleSYMBOLIC_NAME_X ) )
            // InternalSql.g:2291:3: (lv_name_0_0= ruleSYMBOLIC_NAME_X )
            {
            // InternalSql.g:2291:3: (lv_name_0_0= ruleSYMBOLIC_NAME_X )
            // InternalSql.g:2292:4: lv_name_0_0= ruleSYMBOLIC_NAME_X
            {

            				newCompositeNode(grammarAccess.getVariableDeclarationAccess().getNameSYMBOLIC_NAME_XParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleSYMBOLIC_NAME_X();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.xtext.example.mydsl.Sql.SYMBOLIC_NAME_X");
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleLiteral"
    // InternalSql.g:2312:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalSql.g:2312:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalSql.g:2313:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalSql.g:2319:1: ruleLiteral returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BooleanLiteral_2 = null;



        	enterRule();

        try {
            // InternalSql.g:2325:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // InternalSql.g:2326:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // InternalSql.g:2326:2: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt35=3;
            switch ( input.LA(1) ) {
            case RULE_HEX:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt35=1;
                }
                break;
            case RULE_STRING_LITERAL:
                {
                alt35=2;
                }
                break;
            case 26:
            case 27:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalSql.g:2327:3: this_NumberLiteral_0= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSql.g:2336:3: this_StringLiteral_1= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSql.g:2345:3: this_BooleanLiteral_2= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_2=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalSql.g:2357:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalSql.g:2357:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalSql.g:2358:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalSql.g:2364:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_1= 'TRUE' | lv_value_1_2= 'FALSE' ) ) ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_1=null;
        Token lv_value_1_2=null;


        	enterRule();

        try {
            // InternalSql.g:2370:2: ( ( () ( ( (lv_value_1_1= 'TRUE' | lv_value_1_2= 'FALSE' ) ) ) ) )
            // InternalSql.g:2371:2: ( () ( ( (lv_value_1_1= 'TRUE' | lv_value_1_2= 'FALSE' ) ) ) )
            {
            // InternalSql.g:2371:2: ( () ( ( (lv_value_1_1= 'TRUE' | lv_value_1_2= 'FALSE' ) ) ) )
            // InternalSql.g:2372:3: () ( ( (lv_value_1_1= 'TRUE' | lv_value_1_2= 'FALSE' ) ) )
            {
            // InternalSql.g:2372:3: ()
            // InternalSql.g:2373:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
            					current);
            			

            }

            // InternalSql.g:2379:3: ( ( (lv_value_1_1= 'TRUE' | lv_value_1_2= 'FALSE' ) ) )
            // InternalSql.g:2380:4: ( (lv_value_1_1= 'TRUE' | lv_value_1_2= 'FALSE' ) )
            {
            // InternalSql.g:2380:4: ( (lv_value_1_1= 'TRUE' | lv_value_1_2= 'FALSE' ) )
            // InternalSql.g:2381:5: (lv_value_1_1= 'TRUE' | lv_value_1_2= 'FALSE' )
            {
            // InternalSql.g:2381:5: (lv_value_1_1= 'TRUE' | lv_value_1_2= 'FALSE' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            else if ( (LA36_0==27) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalSql.g:2382:6: lv_value_1_1= 'TRUE'
                    {
                    lv_value_1_1=(Token)match(input,26,FOLLOW_2); 

                    						newLeafNode(lv_value_1_1, grammarAccess.getBooleanLiteralAccess().getValueTRUEKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalSql.g:2393:6: lv_value_1_2= 'FALSE'
                    {
                    lv_value_1_2=(Token)match(input,27,FOLLOW_2); 

                    						newLeafNode(lv_value_1_2, grammarAccess.getBooleanLiteralAccess().getValueFALSEKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_2, null);
                    					

                    }
                    break;

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalSql.g:2410:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalSql.g:2410:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalSql.g:2411:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalSql.g:2417:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING_LITERAL ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalSql.g:2423:2: ( ( (lv_value_0_0= RULE_STRING_LITERAL ) ) )
            // InternalSql.g:2424:2: ( (lv_value_0_0= RULE_STRING_LITERAL ) )
            {
            // InternalSql.g:2424:2: ( (lv_value_0_0= RULE_STRING_LITERAL ) )
            // InternalSql.g:2425:3: (lv_value_0_0= RULE_STRING_LITERAL )
            {
            // InternalSql.g:2425:3: (lv_value_0_0= RULE_STRING_LITERAL )
            // InternalSql.g:2426:4: lv_value_0_0= RULE_STRING_LITERAL
            {
            lv_value_0_0=(Token)match(input,RULE_STRING_LITERAL,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRING_LITERALTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.mydsl.Sql.STRING_LITERAL");
            			

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleSYMBOLIC_NAME_X"
    // InternalSql.g:2445:1: entryRuleSYMBOLIC_NAME_X returns [String current=null] : iv_ruleSYMBOLIC_NAME_X= ruleSYMBOLIC_NAME_X EOF ;
    public final String entryRuleSYMBOLIC_NAME_X() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSYMBOLIC_NAME_X = null;


        try {
            // InternalSql.g:2445:55: (iv_ruleSYMBOLIC_NAME_X= ruleSYMBOLIC_NAME_X EOF )
            // InternalSql.g:2446:2: iv_ruleSYMBOLIC_NAME_X= ruleSYMBOLIC_NAME_X EOF
            {
             newCompositeNode(grammarAccess.getSYMBOLIC_NAME_XRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSYMBOLIC_NAME_X=ruleSYMBOLIC_NAME_X();

            state._fsp--;

             current =iv_ruleSYMBOLIC_NAME_X.getText(); 
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
    // $ANTLR end "entryRuleSYMBOLIC_NAME_X"


    // $ANTLR start "ruleSYMBOLIC_NAME_X"
    // InternalSql.g:2452:1: ruleSYMBOLIC_NAME_X returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleSYMBOLIC_NAME_X() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalSql.g:2458:2: (this_ID_0= RULE_ID )
            // InternalSql.g:2459:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getSYMBOLIC_NAME_XAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleSYMBOLIC_NAME_X"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalSql.g:2469:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalSql.g:2469:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalSql.g:2470:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalSql.g:2476:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSql.g:2482:2: ( ( (lv_value_0_0= ruleNumber ) ) )
            // InternalSql.g:2483:2: ( (lv_value_0_0= ruleNumber ) )
            {
            // InternalSql.g:2483:2: ( (lv_value_0_0= ruleNumber ) )
            // InternalSql.g:2484:3: (lv_value_0_0= ruleNumber )
            {
            // InternalSql.g:2484:3: (lv_value_0_0= ruleNumber )
            // InternalSql.g:2485:4: lv_value_0_0= ruleNumber
            {

            				newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNumber();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.xtext.example.mydsl.Sql.Number");
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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleNumber"
    // InternalSql.g:2505:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSql.g:2507:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalSql.g:2508:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalSql.g:2517:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HEX_0=null;
        Token this_INT_1=null;
        Token this_DECIMAL_2=null;
        Token kw=null;
        Token this_INT_4=null;
        Token this_DECIMAL_5=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalSql.g:2524:2: ( (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) ) )
            // InternalSql.g:2525:2: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            {
            // InternalSql.g:2525:2: (this_HEX_0= RULE_HEX | ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_HEX) ) {
                alt40=1;
            }
            else if ( ((LA40_0>=RULE_INT && LA40_0<=RULE_DECIMAL)) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalSql.g:2526:3: this_HEX_0= RULE_HEX
                    {
                    this_HEX_0=(Token)match(input,RULE_HEX,FOLLOW_2); 

                    			current.merge(this_HEX_0);
                    		

                    			newLeafNode(this_HEX_0, grammarAccess.getNumberAccess().getHEXTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSql.g:2534:3: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    {
                    // InternalSql.g:2534:3: ( (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )? )
                    // InternalSql.g:2535:4: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL ) (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    {
                    // InternalSql.g:2535:4: (this_INT_1= RULE_INT | this_DECIMAL_2= RULE_DECIMAL )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_INT) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==RULE_DECIMAL) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalSql.g:2536:5: this_INT_1= RULE_INT
                            {
                            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_32); 

                            					current.merge(this_INT_1);
                            				

                            					newLeafNode(this_INT_1, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSql.g:2544:5: this_DECIMAL_2= RULE_DECIMAL
                            {
                            this_DECIMAL_2=(Token)match(input,RULE_DECIMAL,FOLLOW_32); 

                            					current.merge(this_DECIMAL_2);
                            				

                            					newLeafNode(this_DECIMAL_2, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSql.g:2552:4: (kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==52) ) {
                        int LA39_1 = input.LA(2);

                        if ( ((LA39_1>=RULE_INT && LA39_1<=RULE_DECIMAL)) ) {
                            alt39=1;
                        }
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalSql.g:2553:5: kw= '.' (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            {
                            kw=(Token)match(input,52,FOLLOW_37); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_1_0());
                            				
                            // InternalSql.g:2558:5: (this_INT_4= RULE_INT | this_DECIMAL_5= RULE_DECIMAL )
                            int alt38=2;
                            int LA38_0 = input.LA(1);

                            if ( (LA38_0==RULE_INT) ) {
                                alt38=1;
                            }
                            else if ( (LA38_0==RULE_DECIMAL) ) {
                                alt38=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 38, 0, input);

                                throw nvae;
                            }
                            switch (alt38) {
                                case 1 :
                                    // InternalSql.g:2559:6: this_INT_4= RULE_INT
                                    {
                                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_2); 

                                    						current.merge(this_INT_4);
                                    					

                                    						newLeafNode(this_INT_4, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1_1_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalSql.g:2567:6: this_DECIMAL_5= RULE_DECIMAL
                                    {
                                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

                                    						current.merge(this_DECIMAL_5);
                                    					

                                    						newLeafNode(this_DECIMAL_5, grammarAccess.getNumberAccess().getDECIMALTerminalRuleCall_1_1_1_1());
                                    					

                                    }
                                    break;

                            }


                            }
                            break;

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000A00424000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000A00404000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000A00004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x002000C00E0001F0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x002000000E1001F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x002000000C0001F0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000021F0000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0007700000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x002000C00E2001F0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000180L});

}