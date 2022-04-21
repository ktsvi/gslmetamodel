package com.ktsv.gsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ktsv.gsl.services.GslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Gamamodel'", "'{'", "'description'", "'keywords'", "'author'", "'createdOn'", "'containsglobal'", "'containsspecie'", "','", "'}'", "'containsexperiment'", "'EDate'", "'init'", "'GlobalBlock'", "'containsglobalvariable'", "'hasspatialentity'", "'aspectfunction'", "'SpecieBlock'", "'aspectName'", "'Color'", "'skillofspecie'", "'containsaction'", "'haspropertie'", "'ExperimentBlock'", "'type'", "'hasparameter'", "'hasoutput'", "'-'", "'GlobalVariable'", "'initValue'", "'SpatialEntity'", "'shapePath'", "'Action'", "'actionName'", "'Propertie'", "'propertieName'", "'ComplexeAction'", "'Reflex'", "'condition'", "'simpleAction'", "'ReturnType'", "'Parameter'", "'targetVariable'", "'Output'", "'outputName'", "'framerate'", "'hasdisplays'", "'hasexportfile'", "'hasmonitor'", "'Display'", "'displayType'", "'specieblock'", "'Exportfile'", "'fileName'", "'fileType'", "'Monitor'", "'targetVar'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalGslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGsl.g"; }



     	private GslGrammarAccess grammarAccess;

        public InternalGslParser(TokenStream input, GslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Gamamodel";
       	}

       	@Override
       	protected GslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGamamodel"
    // InternalGsl.g:64:1: entryRuleGamamodel returns [EObject current=null] : iv_ruleGamamodel= ruleGamamodel EOF ;
    public final EObject entryRuleGamamodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGamamodel = null;


        try {
            // InternalGsl.g:64:50: (iv_ruleGamamodel= ruleGamamodel EOF )
            // InternalGsl.g:65:2: iv_ruleGamamodel= ruleGamamodel EOF
            {
             newCompositeNode(grammarAccess.getGamamodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGamamodel=ruleGamamodel();

            state._fsp--;

             current =iv_ruleGamamodel; 
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
    // $ANTLR end "entryRuleGamamodel"


    // $ANTLR start "ruleGamamodel"
    // InternalGsl.g:71:1: ruleGamamodel returns [EObject current=null] : (otherlv_0= 'Gamamodel' otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? (otherlv_4= 'keywords' ( (lv_keywords_5_0= ruleEString ) ) )? (otherlv_6= 'author' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'createdOn' ( (lv_createdOn_9_0= ruleEDate ) ) )? otherlv_10= 'containsglobal' ( (lv_containsglobal_11_0= ruleGlobalBlock ) ) otherlv_12= 'containsspecie' otherlv_13= '{' ( (lv_containsspecie_14_0= ruleSpecieBlock ) ) (otherlv_15= ',' ( (lv_containsspecie_16_0= ruleSpecieBlock ) ) )* otherlv_17= '}' otherlv_18= 'containsexperiment' otherlv_19= '{' ( (lv_containsexperiment_20_0= ruleExperimentBlock ) ) (otherlv_21= ',' ( (lv_containsexperiment_22_0= ruleExperimentBlock ) ) )* otherlv_23= '}' otherlv_24= '}' ) ;
    public final EObject ruleGamamodel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_description_3_0 = null;

        AntlrDatatypeRuleToken lv_keywords_5_0 = null;

        AntlrDatatypeRuleToken lv_author_7_0 = null;

        AntlrDatatypeRuleToken lv_createdOn_9_0 = null;

        EObject lv_containsglobal_11_0 = null;

        EObject lv_containsspecie_14_0 = null;

        EObject lv_containsspecie_16_0 = null;

        EObject lv_containsexperiment_20_0 = null;

        EObject lv_containsexperiment_22_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:77:2: ( (otherlv_0= 'Gamamodel' otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? (otherlv_4= 'keywords' ( (lv_keywords_5_0= ruleEString ) ) )? (otherlv_6= 'author' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'createdOn' ( (lv_createdOn_9_0= ruleEDate ) ) )? otherlv_10= 'containsglobal' ( (lv_containsglobal_11_0= ruleGlobalBlock ) ) otherlv_12= 'containsspecie' otherlv_13= '{' ( (lv_containsspecie_14_0= ruleSpecieBlock ) ) (otherlv_15= ',' ( (lv_containsspecie_16_0= ruleSpecieBlock ) ) )* otherlv_17= '}' otherlv_18= 'containsexperiment' otherlv_19= '{' ( (lv_containsexperiment_20_0= ruleExperimentBlock ) ) (otherlv_21= ',' ( (lv_containsexperiment_22_0= ruleExperimentBlock ) ) )* otherlv_23= '}' otherlv_24= '}' ) )
            // InternalGsl.g:78:2: (otherlv_0= 'Gamamodel' otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? (otherlv_4= 'keywords' ( (lv_keywords_5_0= ruleEString ) ) )? (otherlv_6= 'author' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'createdOn' ( (lv_createdOn_9_0= ruleEDate ) ) )? otherlv_10= 'containsglobal' ( (lv_containsglobal_11_0= ruleGlobalBlock ) ) otherlv_12= 'containsspecie' otherlv_13= '{' ( (lv_containsspecie_14_0= ruleSpecieBlock ) ) (otherlv_15= ',' ( (lv_containsspecie_16_0= ruleSpecieBlock ) ) )* otherlv_17= '}' otherlv_18= 'containsexperiment' otherlv_19= '{' ( (lv_containsexperiment_20_0= ruleExperimentBlock ) ) (otherlv_21= ',' ( (lv_containsexperiment_22_0= ruleExperimentBlock ) ) )* otherlv_23= '}' otherlv_24= '}' )
            {
            // InternalGsl.g:78:2: (otherlv_0= 'Gamamodel' otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? (otherlv_4= 'keywords' ( (lv_keywords_5_0= ruleEString ) ) )? (otherlv_6= 'author' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'createdOn' ( (lv_createdOn_9_0= ruleEDate ) ) )? otherlv_10= 'containsglobal' ( (lv_containsglobal_11_0= ruleGlobalBlock ) ) otherlv_12= 'containsspecie' otherlv_13= '{' ( (lv_containsspecie_14_0= ruleSpecieBlock ) ) (otherlv_15= ',' ( (lv_containsspecie_16_0= ruleSpecieBlock ) ) )* otherlv_17= '}' otherlv_18= 'containsexperiment' otherlv_19= '{' ( (lv_containsexperiment_20_0= ruleExperimentBlock ) ) (otherlv_21= ',' ( (lv_containsexperiment_22_0= ruleExperimentBlock ) ) )* otherlv_23= '}' otherlv_24= '}' )
            // InternalGsl.g:79:3: otherlv_0= 'Gamamodel' otherlv_1= '{' (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )? (otherlv_4= 'keywords' ( (lv_keywords_5_0= ruleEString ) ) )? (otherlv_6= 'author' ( (lv_author_7_0= ruleEString ) ) )? (otherlv_8= 'createdOn' ( (lv_createdOn_9_0= ruleEDate ) ) )? otherlv_10= 'containsglobal' ( (lv_containsglobal_11_0= ruleGlobalBlock ) ) otherlv_12= 'containsspecie' otherlv_13= '{' ( (lv_containsspecie_14_0= ruleSpecieBlock ) ) (otherlv_15= ',' ( (lv_containsspecie_16_0= ruleSpecieBlock ) ) )* otherlv_17= '}' otherlv_18= 'containsexperiment' otherlv_19= '{' ( (lv_containsexperiment_20_0= ruleExperimentBlock ) ) (otherlv_21= ',' ( (lv_containsexperiment_22_0= ruleExperimentBlock ) ) )* otherlv_23= '}' otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGamamodelAccess().getGamamodelKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGamamodelAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalGsl.g:87:3: (otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalGsl.g:88:4: otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getGamamodelAccess().getDescriptionKeyword_2_0());
                    			
                    // InternalGsl.g:92:4: ( (lv_description_3_0= ruleEString ) )
                    // InternalGsl.g:93:5: (lv_description_3_0= ruleEString )
                    {
                    // InternalGsl.g:93:5: (lv_description_3_0= ruleEString )
                    // InternalGsl.g:94:6: lv_description_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGamamodelAccess().getDescriptionEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGamamodelRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_3_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:112:3: (otherlv_4= 'keywords' ( (lv_keywords_5_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGsl.g:113:4: otherlv_4= 'keywords' ( (lv_keywords_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getGamamodelAccess().getKeywordsKeyword_3_0());
                    			
                    // InternalGsl.g:117:4: ( (lv_keywords_5_0= ruleEString ) )
                    // InternalGsl.g:118:5: (lv_keywords_5_0= ruleEString )
                    {
                    // InternalGsl.g:118:5: (lv_keywords_5_0= ruleEString )
                    // InternalGsl.g:119:6: lv_keywords_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGamamodelAccess().getKeywordsEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_keywords_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGamamodelRule());
                    						}
                    						set(
                    							current,
                    							"keywords",
                    							lv_keywords_5_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:137:3: (otherlv_6= 'author' ( (lv_author_7_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGsl.g:138:4: otherlv_6= 'author' ( (lv_author_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getGamamodelAccess().getAuthorKeyword_4_0());
                    			
                    // InternalGsl.g:142:4: ( (lv_author_7_0= ruleEString ) )
                    // InternalGsl.g:143:5: (lv_author_7_0= ruleEString )
                    {
                    // InternalGsl.g:143:5: (lv_author_7_0= ruleEString )
                    // InternalGsl.g:144:6: lv_author_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGamamodelAccess().getAuthorEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_author_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGamamodelRule());
                    						}
                    						set(
                    							current,
                    							"author",
                    							lv_author_7_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:162:3: (otherlv_8= 'createdOn' ( (lv_createdOn_9_0= ruleEDate ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGsl.g:163:4: otherlv_8= 'createdOn' ( (lv_createdOn_9_0= ruleEDate ) )
                    {
                    otherlv_8=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getGamamodelAccess().getCreatedOnKeyword_5_0());
                    			
                    // InternalGsl.g:167:4: ( (lv_createdOn_9_0= ruleEDate ) )
                    // InternalGsl.g:168:5: (lv_createdOn_9_0= ruleEDate )
                    {
                    // InternalGsl.g:168:5: (lv_createdOn_9_0= ruleEDate )
                    // InternalGsl.g:169:6: lv_createdOn_9_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getGamamodelAccess().getCreatedOnEDateParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_createdOn_9_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGamamodelRule());
                    						}
                    						set(
                    							current,
                    							"createdOn",
                    							lv_createdOn_9_0,
                    							"com.ktsv.gsl.Gsl.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getGamamodelAccess().getContainsglobalKeyword_6());
            		
            // InternalGsl.g:191:3: ( (lv_containsglobal_11_0= ruleGlobalBlock ) )
            // InternalGsl.g:192:4: (lv_containsglobal_11_0= ruleGlobalBlock )
            {
            // InternalGsl.g:192:4: (lv_containsglobal_11_0= ruleGlobalBlock )
            // InternalGsl.g:193:5: lv_containsglobal_11_0= ruleGlobalBlock
            {

            					newCompositeNode(grammarAccess.getGamamodelAccess().getContainsglobalGlobalBlockParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_containsglobal_11_0=ruleGlobalBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGamamodelRule());
            					}
            					set(
            						current,
            						"containsglobal",
            						lv_containsglobal_11_0,
            						"com.ktsv.gsl.Gsl.GlobalBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getGamamodelAccess().getContainsspecieKeyword_8());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getGamamodelAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalGsl.g:218:3: ( (lv_containsspecie_14_0= ruleSpecieBlock ) )
            // InternalGsl.g:219:4: (lv_containsspecie_14_0= ruleSpecieBlock )
            {
            // InternalGsl.g:219:4: (lv_containsspecie_14_0= ruleSpecieBlock )
            // InternalGsl.g:220:5: lv_containsspecie_14_0= ruleSpecieBlock
            {

            					newCompositeNode(grammarAccess.getGamamodelAccess().getContainsspecieSpecieBlockParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_14);
            lv_containsspecie_14_0=ruleSpecieBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGamamodelRule());
            					}
            					add(
            						current,
            						"containsspecie",
            						lv_containsspecie_14_0,
            						"com.ktsv.gsl.Gsl.SpecieBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGsl.g:237:3: (otherlv_15= ',' ( (lv_containsspecie_16_0= ruleSpecieBlock ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGsl.g:238:4: otherlv_15= ',' ( (lv_containsspecie_16_0= ruleSpecieBlock ) )
            	    {
            	    otherlv_15=(Token)match(input,19,FOLLOW_13); 

            	    				newLeafNode(otherlv_15, grammarAccess.getGamamodelAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalGsl.g:242:4: ( (lv_containsspecie_16_0= ruleSpecieBlock ) )
            	    // InternalGsl.g:243:5: (lv_containsspecie_16_0= ruleSpecieBlock )
            	    {
            	    // InternalGsl.g:243:5: (lv_containsspecie_16_0= ruleSpecieBlock )
            	    // InternalGsl.g:244:6: lv_containsspecie_16_0= ruleSpecieBlock
            	    {

            	    						newCompositeNode(grammarAccess.getGamamodelAccess().getContainsspecieSpecieBlockParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_containsspecie_16_0=ruleSpecieBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGamamodelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"containsspecie",
            	    							lv_containsspecie_16_0,
            	    							"com.ktsv.gsl.Gsl.SpecieBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_17=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_17, grammarAccess.getGamamodelAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_18=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getGamamodelAccess().getContainsexperimentKeyword_13());
            		
            otherlv_19=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_19, grammarAccess.getGamamodelAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalGsl.g:274:3: ( (lv_containsexperiment_20_0= ruleExperimentBlock ) )
            // InternalGsl.g:275:4: (lv_containsexperiment_20_0= ruleExperimentBlock )
            {
            // InternalGsl.g:275:4: (lv_containsexperiment_20_0= ruleExperimentBlock )
            // InternalGsl.g:276:5: lv_containsexperiment_20_0= ruleExperimentBlock
            {

            					newCompositeNode(grammarAccess.getGamamodelAccess().getContainsexperimentExperimentBlockParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_14);
            lv_containsexperiment_20_0=ruleExperimentBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGamamodelRule());
            					}
            					add(
            						current,
            						"containsexperiment",
            						lv_containsexperiment_20_0,
            						"com.ktsv.gsl.Gsl.ExperimentBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGsl.g:293:3: (otherlv_21= ',' ( (lv_containsexperiment_22_0= ruleExperimentBlock ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGsl.g:294:4: otherlv_21= ',' ( (lv_containsexperiment_22_0= ruleExperimentBlock ) )
            	    {
            	    otherlv_21=(Token)match(input,19,FOLLOW_16); 

            	    				newLeafNode(otherlv_21, grammarAccess.getGamamodelAccess().getCommaKeyword_16_0());
            	    			
            	    // InternalGsl.g:298:4: ( (lv_containsexperiment_22_0= ruleExperimentBlock ) )
            	    // InternalGsl.g:299:5: (lv_containsexperiment_22_0= ruleExperimentBlock )
            	    {
            	    // InternalGsl.g:299:5: (lv_containsexperiment_22_0= ruleExperimentBlock )
            	    // InternalGsl.g:300:6: lv_containsexperiment_22_0= ruleExperimentBlock
            	    {

            	    						newCompositeNode(grammarAccess.getGamamodelAccess().getContainsexperimentExperimentBlockParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_containsexperiment_22_0=ruleExperimentBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGamamodelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"containsexperiment",
            	    							lv_containsexperiment_22_0,
            	    							"com.ktsv.gsl.Gsl.ExperimentBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_23=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_23, grammarAccess.getGamamodelAccess().getRightCurlyBracketKeyword_17());
            		
            otherlv_24=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getGamamodelAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleGamamodel"


    // $ANTLR start "entryRuleAction"
    // InternalGsl.g:330:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalGsl.g:330:47: (iv_ruleAction= ruleAction EOF )
            // InternalGsl.g:331:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGsl.g:337:1: ruleAction returns [EObject current=null] : (this_Action_Impl_0= ruleAction_Impl | this_ComplexeAction_1= ruleComplexeAction | this_Reflex_2= ruleReflex | this_simpleAction_3= rulesimpleAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Action_Impl_0 = null;

        EObject this_ComplexeAction_1 = null;

        EObject this_Reflex_2 = null;

        EObject this_simpleAction_3 = null;



        	enterRule();

        try {
            // InternalGsl.g:343:2: ( (this_Action_Impl_0= ruleAction_Impl | this_ComplexeAction_1= ruleComplexeAction | this_Reflex_2= ruleReflex | this_simpleAction_3= rulesimpleAction ) )
            // InternalGsl.g:344:2: (this_Action_Impl_0= ruleAction_Impl | this_ComplexeAction_1= ruleComplexeAction | this_Reflex_2= ruleReflex | this_simpleAction_3= rulesimpleAction )
            {
            // InternalGsl.g:344:2: (this_Action_Impl_0= ruleAction_Impl | this_ComplexeAction_1= ruleComplexeAction | this_Reflex_2= ruleReflex | this_simpleAction_3= rulesimpleAction )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt7=1;
                }
                break;
            case 47:
                {
                alt7=2;
                }
                break;
            case 48:
                {
                alt7=3;
                }
                break;
            case 50:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalGsl.g:345:3: this_Action_Impl_0= ruleAction_Impl
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getAction_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_Impl_0=ruleAction_Impl();

                    state._fsp--;


                    			current = this_Action_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGsl.g:354:3: this_ComplexeAction_1= ruleComplexeAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getComplexeActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexeAction_1=ruleComplexeAction();

                    state._fsp--;


                    			current = this_ComplexeAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGsl.g:363:3: this_Reflex_2= ruleReflex
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getReflexParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reflex_2=ruleReflex();

                    state._fsp--;


                    			current = this_Reflex_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGsl.g:372:3: this_simpleAction_3= rulesimpleAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSimpleActionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_simpleAction_3=rulesimpleAction();

                    state._fsp--;


                    			current = this_simpleAction_3;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleEString"
    // InternalGsl.g:384:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGsl.g:384:47: (iv_ruleEString= ruleEString EOF )
            // InternalGsl.g:385:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalGsl.g:391:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGsl.g:397:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGsl.g:398:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGsl.g:398:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalGsl.g:399:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGsl.g:407:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDate"
    // InternalGsl.g:418:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalGsl.g:418:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalGsl.g:419:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalGsl.g:425:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGsl.g:431:2: (kw= 'EDate' )
            // InternalGsl.g:432:2: kw= 'EDate'
            {
            kw=(Token)match(input,22,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword());
            	

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
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleGlobalBlock"
    // InternalGsl.g:440:1: entryRuleGlobalBlock returns [EObject current=null] : iv_ruleGlobalBlock= ruleGlobalBlock EOF ;
    public final EObject entryRuleGlobalBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalBlock = null;


        try {
            // InternalGsl.g:440:52: (iv_ruleGlobalBlock= ruleGlobalBlock EOF )
            // InternalGsl.g:441:2: iv_ruleGlobalBlock= ruleGlobalBlock EOF
            {
             newCompositeNode(grammarAccess.getGlobalBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalBlock=ruleGlobalBlock();

            state._fsp--;

             current =iv_ruleGlobalBlock; 
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
    // $ANTLR end "entryRuleGlobalBlock"


    // $ANTLR start "ruleGlobalBlock"
    // InternalGsl.g:447:1: ruleGlobalBlock returns [EObject current=null] : ( ( (lv_init_0_0= 'init' ) )? otherlv_1= 'GlobalBlock' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' otherlv_4= 'containsglobalvariable' otherlv_5= '{' ( (lv_containsglobalvariable_6_0= ruleGlobalVariable ) ) (otherlv_7= ',' ( (lv_containsglobalvariable_8_0= ruleGlobalVariable ) ) )* otherlv_9= '}' otherlv_10= 'hasspatialentity' otherlv_11= '{' ( (lv_hasspatialentity_12_0= ruleSpatialEntity ) ) (otherlv_13= ',' ( (lv_hasspatialentity_14_0= ruleSpatialEntity ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleGlobalBlock() throws RecognitionException {
        EObject current = null;

        Token lv_init_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        EObject lv_containsglobalvariable_6_0 = null;

        EObject lv_containsglobalvariable_8_0 = null;

        EObject lv_hasspatialentity_12_0 = null;

        EObject lv_hasspatialentity_14_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:453:2: ( ( ( (lv_init_0_0= 'init' ) )? otherlv_1= 'GlobalBlock' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' otherlv_4= 'containsglobalvariable' otherlv_5= '{' ( (lv_containsglobalvariable_6_0= ruleGlobalVariable ) ) (otherlv_7= ',' ( (lv_containsglobalvariable_8_0= ruleGlobalVariable ) ) )* otherlv_9= '}' otherlv_10= 'hasspatialentity' otherlv_11= '{' ( (lv_hasspatialentity_12_0= ruleSpatialEntity ) ) (otherlv_13= ',' ( (lv_hasspatialentity_14_0= ruleSpatialEntity ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalGsl.g:454:2: ( ( (lv_init_0_0= 'init' ) )? otherlv_1= 'GlobalBlock' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' otherlv_4= 'containsglobalvariable' otherlv_5= '{' ( (lv_containsglobalvariable_6_0= ruleGlobalVariable ) ) (otherlv_7= ',' ( (lv_containsglobalvariable_8_0= ruleGlobalVariable ) ) )* otherlv_9= '}' otherlv_10= 'hasspatialentity' otherlv_11= '{' ( (lv_hasspatialentity_12_0= ruleSpatialEntity ) ) (otherlv_13= ',' ( (lv_hasspatialentity_14_0= ruleSpatialEntity ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalGsl.g:454:2: ( ( (lv_init_0_0= 'init' ) )? otherlv_1= 'GlobalBlock' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' otherlv_4= 'containsglobalvariable' otherlv_5= '{' ( (lv_containsglobalvariable_6_0= ruleGlobalVariable ) ) (otherlv_7= ',' ( (lv_containsglobalvariable_8_0= ruleGlobalVariable ) ) )* otherlv_9= '}' otherlv_10= 'hasspatialentity' otherlv_11= '{' ( (lv_hasspatialentity_12_0= ruleSpatialEntity ) ) (otherlv_13= ',' ( (lv_hasspatialentity_14_0= ruleSpatialEntity ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalGsl.g:455:3: ( (lv_init_0_0= 'init' ) )? otherlv_1= 'GlobalBlock' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' otherlv_4= 'containsglobalvariable' otherlv_5= '{' ( (lv_containsglobalvariable_6_0= ruleGlobalVariable ) ) (otherlv_7= ',' ( (lv_containsglobalvariable_8_0= ruleGlobalVariable ) ) )* otherlv_9= '}' otherlv_10= 'hasspatialentity' otherlv_11= '{' ( (lv_hasspatialentity_12_0= ruleSpatialEntity ) ) (otherlv_13= ',' ( (lv_hasspatialentity_14_0= ruleSpatialEntity ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            // InternalGsl.g:455:3: ( (lv_init_0_0= 'init' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGsl.g:456:4: (lv_init_0_0= 'init' )
                    {
                    // InternalGsl.g:456:4: (lv_init_0_0= 'init' )
                    // InternalGsl.g:457:5: lv_init_0_0= 'init'
                    {
                    lv_init_0_0=(Token)match(input,23,FOLLOW_18); 

                    					newLeafNode(lv_init_0_0, grammarAccess.getGlobalBlockAccess().getInitInitKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGlobalBlockRule());
                    					}
                    					setWithLastConsumed(current, "init", true, "init");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalBlockAccess().getGlobalBlockKeyword_1());
            		
            // InternalGsl.g:473:3: ( (lv_id_2_0= ruleEInt ) )
            // InternalGsl.g:474:4: (lv_id_2_0= ruleEInt )
            {
            // InternalGsl.g:474:4: (lv_id_2_0= ruleEInt )
            // InternalGsl.g:475:5: lv_id_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getGlobalBlockAccess().getIdEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_id_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalBlockRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"com.ktsv.gsl.Gsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getGlobalBlockAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getGlobalBlockAccess().getContainsglobalvariableKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getGlobalBlockAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGsl.g:504:3: ( (lv_containsglobalvariable_6_0= ruleGlobalVariable ) )
            // InternalGsl.g:505:4: (lv_containsglobalvariable_6_0= ruleGlobalVariable )
            {
            // InternalGsl.g:505:4: (lv_containsglobalvariable_6_0= ruleGlobalVariable )
            // InternalGsl.g:506:5: lv_containsglobalvariable_6_0= ruleGlobalVariable
            {

            					newCompositeNode(grammarAccess.getGlobalBlockAccess().getContainsglobalvariableGlobalVariableParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_containsglobalvariable_6_0=ruleGlobalVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalBlockRule());
            					}
            					add(
            						current,
            						"containsglobalvariable",
            						lv_containsglobalvariable_6_0,
            						"com.ktsv.gsl.Gsl.GlobalVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGsl.g:523:3: (otherlv_7= ',' ( (lv_containsglobalvariable_8_0= ruleGlobalVariable ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGsl.g:524:4: otherlv_7= ',' ( (lv_containsglobalvariable_8_0= ruleGlobalVariable ) )
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_21); 

            	    				newLeafNode(otherlv_7, grammarAccess.getGlobalBlockAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalGsl.g:528:4: ( (lv_containsglobalvariable_8_0= ruleGlobalVariable ) )
            	    // InternalGsl.g:529:5: (lv_containsglobalvariable_8_0= ruleGlobalVariable )
            	    {
            	    // InternalGsl.g:529:5: (lv_containsglobalvariable_8_0= ruleGlobalVariable )
            	    // InternalGsl.g:530:6: lv_containsglobalvariable_8_0= ruleGlobalVariable
            	    {

            	    						newCompositeNode(grammarAccess.getGlobalBlockAccess().getContainsglobalvariableGlobalVariableParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_containsglobalvariable_8_0=ruleGlobalVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGlobalBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"containsglobalvariable",
            	    							lv_containsglobalvariable_8_0,
            	    							"com.ktsv.gsl.Gsl.GlobalVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getGlobalBlockAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getGlobalBlockAccess().getHasspatialentityKeyword_9());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_11, grammarAccess.getGlobalBlockAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalGsl.g:560:3: ( (lv_hasspatialentity_12_0= ruleSpatialEntity ) )
            // InternalGsl.g:561:4: (lv_hasspatialentity_12_0= ruleSpatialEntity )
            {
            // InternalGsl.g:561:4: (lv_hasspatialentity_12_0= ruleSpatialEntity )
            // InternalGsl.g:562:5: lv_hasspatialentity_12_0= ruleSpatialEntity
            {

            					newCompositeNode(grammarAccess.getGlobalBlockAccess().getHasspatialentitySpatialEntityParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_14);
            lv_hasspatialentity_12_0=ruleSpatialEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalBlockRule());
            					}
            					add(
            						current,
            						"hasspatialentity",
            						lv_hasspatialentity_12_0,
            						"com.ktsv.gsl.Gsl.SpatialEntity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGsl.g:579:3: (otherlv_13= ',' ( (lv_hasspatialentity_14_0= ruleSpatialEntity ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGsl.g:580:4: otherlv_13= ',' ( (lv_hasspatialentity_14_0= ruleSpatialEntity ) )
            	    {
            	    otherlv_13=(Token)match(input,19,FOLLOW_23); 

            	    				newLeafNode(otherlv_13, grammarAccess.getGlobalBlockAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalGsl.g:584:4: ( (lv_hasspatialentity_14_0= ruleSpatialEntity ) )
            	    // InternalGsl.g:585:5: (lv_hasspatialentity_14_0= ruleSpatialEntity )
            	    {
            	    // InternalGsl.g:585:5: (lv_hasspatialentity_14_0= ruleSpatialEntity )
            	    // InternalGsl.g:586:6: lv_hasspatialentity_14_0= ruleSpatialEntity
            	    {

            	    						newCompositeNode(grammarAccess.getGlobalBlockAccess().getHasspatialentitySpatialEntityParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_hasspatialentity_14_0=ruleSpatialEntity();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGlobalBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"hasspatialentity",
            	    							lv_hasspatialentity_14_0,
            	    							"com.ktsv.gsl.Gsl.SpatialEntity");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_15=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_15, grammarAccess.getGlobalBlockAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_16=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getGlobalBlockAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleGlobalBlock"


    // $ANTLR start "entryRuleSpecieBlock"
    // InternalGsl.g:616:1: entryRuleSpecieBlock returns [EObject current=null] : iv_ruleSpecieBlock= ruleSpecieBlock EOF ;
    public final EObject entryRuleSpecieBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecieBlock = null;


        try {
            // InternalGsl.g:616:52: (iv_ruleSpecieBlock= ruleSpecieBlock EOF )
            // InternalGsl.g:617:2: iv_ruleSpecieBlock= ruleSpecieBlock EOF
            {
             newCompositeNode(grammarAccess.getSpecieBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecieBlock=ruleSpecieBlock();

            state._fsp--;

             current =iv_ruleSpecieBlock; 
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
    // $ANTLR end "entryRuleSpecieBlock"


    // $ANTLR start "ruleSpecieBlock"
    // InternalGsl.g:623:1: ruleSpecieBlock returns [EObject current=null] : ( ( (lv_aspectfunction_0_0= 'aspectfunction' ) )? otherlv_1= 'SpecieBlock' ( (lv_specieBlockName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'aspectName' ( (lv_aspectName_5_0= ruleEString ) ) )? (otherlv_6= 'Color' ( (lv_Color_7_0= ruleEString ) ) )? (otherlv_8= 'skillofspecie' ( (lv_skillofspecie_9_0= ruleEString ) ) )? otherlv_10= 'containsaction' otherlv_11= '{' ( (lv_containsaction_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_containsaction_14_0= ruleAction ) ) )* otherlv_15= '}' otherlv_16= 'haspropertie' otherlv_17= '{' ( (lv_haspropertie_18_0= rulePropertie ) ) (otherlv_19= ',' ( (lv_haspropertie_20_0= rulePropertie ) ) )* otherlv_21= '}' otherlv_22= '}' ) ;
    public final EObject ruleSpecieBlock() throws RecognitionException {
        EObject current = null;

        Token lv_aspectfunction_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_specieBlockName_2_0 = null;

        AntlrDatatypeRuleToken lv_aspectName_5_0 = null;

        AntlrDatatypeRuleToken lv_Color_7_0 = null;

        AntlrDatatypeRuleToken lv_skillofspecie_9_0 = null;

        EObject lv_containsaction_12_0 = null;

        EObject lv_containsaction_14_0 = null;

        EObject lv_haspropertie_18_0 = null;

        EObject lv_haspropertie_20_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:629:2: ( ( ( (lv_aspectfunction_0_0= 'aspectfunction' ) )? otherlv_1= 'SpecieBlock' ( (lv_specieBlockName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'aspectName' ( (lv_aspectName_5_0= ruleEString ) ) )? (otherlv_6= 'Color' ( (lv_Color_7_0= ruleEString ) ) )? (otherlv_8= 'skillofspecie' ( (lv_skillofspecie_9_0= ruleEString ) ) )? otherlv_10= 'containsaction' otherlv_11= '{' ( (lv_containsaction_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_containsaction_14_0= ruleAction ) ) )* otherlv_15= '}' otherlv_16= 'haspropertie' otherlv_17= '{' ( (lv_haspropertie_18_0= rulePropertie ) ) (otherlv_19= ',' ( (lv_haspropertie_20_0= rulePropertie ) ) )* otherlv_21= '}' otherlv_22= '}' ) )
            // InternalGsl.g:630:2: ( ( (lv_aspectfunction_0_0= 'aspectfunction' ) )? otherlv_1= 'SpecieBlock' ( (lv_specieBlockName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'aspectName' ( (lv_aspectName_5_0= ruleEString ) ) )? (otherlv_6= 'Color' ( (lv_Color_7_0= ruleEString ) ) )? (otherlv_8= 'skillofspecie' ( (lv_skillofspecie_9_0= ruleEString ) ) )? otherlv_10= 'containsaction' otherlv_11= '{' ( (lv_containsaction_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_containsaction_14_0= ruleAction ) ) )* otherlv_15= '}' otherlv_16= 'haspropertie' otherlv_17= '{' ( (lv_haspropertie_18_0= rulePropertie ) ) (otherlv_19= ',' ( (lv_haspropertie_20_0= rulePropertie ) ) )* otherlv_21= '}' otherlv_22= '}' )
            {
            // InternalGsl.g:630:2: ( ( (lv_aspectfunction_0_0= 'aspectfunction' ) )? otherlv_1= 'SpecieBlock' ( (lv_specieBlockName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'aspectName' ( (lv_aspectName_5_0= ruleEString ) ) )? (otherlv_6= 'Color' ( (lv_Color_7_0= ruleEString ) ) )? (otherlv_8= 'skillofspecie' ( (lv_skillofspecie_9_0= ruleEString ) ) )? otherlv_10= 'containsaction' otherlv_11= '{' ( (lv_containsaction_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_containsaction_14_0= ruleAction ) ) )* otherlv_15= '}' otherlv_16= 'haspropertie' otherlv_17= '{' ( (lv_haspropertie_18_0= rulePropertie ) ) (otherlv_19= ',' ( (lv_haspropertie_20_0= rulePropertie ) ) )* otherlv_21= '}' otherlv_22= '}' )
            // InternalGsl.g:631:3: ( (lv_aspectfunction_0_0= 'aspectfunction' ) )? otherlv_1= 'SpecieBlock' ( (lv_specieBlockName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'aspectName' ( (lv_aspectName_5_0= ruleEString ) ) )? (otherlv_6= 'Color' ( (lv_Color_7_0= ruleEString ) ) )? (otherlv_8= 'skillofspecie' ( (lv_skillofspecie_9_0= ruleEString ) ) )? otherlv_10= 'containsaction' otherlv_11= '{' ( (lv_containsaction_12_0= ruleAction ) ) (otherlv_13= ',' ( (lv_containsaction_14_0= ruleAction ) ) )* otherlv_15= '}' otherlv_16= 'haspropertie' otherlv_17= '{' ( (lv_haspropertie_18_0= rulePropertie ) ) (otherlv_19= ',' ( (lv_haspropertie_20_0= rulePropertie ) ) )* otherlv_21= '}' otherlv_22= '}'
            {
            // InternalGsl.g:631:3: ( (lv_aspectfunction_0_0= 'aspectfunction' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGsl.g:632:4: (lv_aspectfunction_0_0= 'aspectfunction' )
                    {
                    // InternalGsl.g:632:4: (lv_aspectfunction_0_0= 'aspectfunction' )
                    // InternalGsl.g:633:5: lv_aspectfunction_0_0= 'aspectfunction'
                    {
                    lv_aspectfunction_0_0=(Token)match(input,27,FOLLOW_24); 

                    					newLeafNode(lv_aspectfunction_0_0, grammarAccess.getSpecieBlockAccess().getAspectfunctionAspectfunctionKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSpecieBlockRule());
                    					}
                    					setWithLastConsumed(current, "aspectfunction", true, "aspectfunction");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSpecieBlockAccess().getSpecieBlockKeyword_1());
            		
            // InternalGsl.g:649:3: ( (lv_specieBlockName_2_0= ruleEString ) )
            // InternalGsl.g:650:4: (lv_specieBlockName_2_0= ruleEString )
            {
            // InternalGsl.g:650:4: (lv_specieBlockName_2_0= ruleEString )
            // InternalGsl.g:651:5: lv_specieBlockName_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSpecieBlockAccess().getSpecieBlockNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_specieBlockName_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecieBlockRule());
            					}
            					set(
            						current,
            						"specieBlockName",
            						lv_specieBlockName_2_0,
            						"com.ktsv.gsl.Gsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getSpecieBlockAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGsl.g:672:3: (otherlv_4= 'aspectName' ( (lv_aspectName_5_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGsl.g:673:4: otherlv_4= 'aspectName' ( (lv_aspectName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSpecieBlockAccess().getAspectNameKeyword_4_0());
                    			
                    // InternalGsl.g:677:4: ( (lv_aspectName_5_0= ruleEString ) )
                    // InternalGsl.g:678:5: (lv_aspectName_5_0= ruleEString )
                    {
                    // InternalGsl.g:678:5: (lv_aspectName_5_0= ruleEString )
                    // InternalGsl.g:679:6: lv_aspectName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSpecieBlockAccess().getAspectNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_aspectName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpecieBlockRule());
                    						}
                    						set(
                    							current,
                    							"aspectName",
                    							lv_aspectName_5_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:697:3: (otherlv_6= 'Color' ( (lv_Color_7_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGsl.g:698:4: otherlv_6= 'Color' ( (lv_Color_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getSpecieBlockAccess().getColorKeyword_5_0());
                    			
                    // InternalGsl.g:702:4: ( (lv_Color_7_0= ruleEString ) )
                    // InternalGsl.g:703:5: (lv_Color_7_0= ruleEString )
                    {
                    // InternalGsl.g:703:5: (lv_Color_7_0= ruleEString )
                    // InternalGsl.g:704:6: lv_Color_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSpecieBlockAccess().getColorEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_Color_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpecieBlockRule());
                    						}
                    						set(
                    							current,
                    							"Color",
                    							lv_Color_7_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:722:3: (otherlv_8= 'skillofspecie' ( (lv_skillofspecie_9_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGsl.g:723:4: otherlv_8= 'skillofspecie' ( (lv_skillofspecie_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getSpecieBlockAccess().getSkillofspecieKeyword_6_0());
                    			
                    // InternalGsl.g:727:4: ( (lv_skillofspecie_9_0= ruleEString ) )
                    // InternalGsl.g:728:5: (lv_skillofspecie_9_0= ruleEString )
                    {
                    // InternalGsl.g:728:5: (lv_skillofspecie_9_0= ruleEString )
                    // InternalGsl.g:729:6: lv_skillofspecie_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSpecieBlockAccess().getSkillofspecieEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_skillofspecie_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpecieBlockRule());
                    						}
                    						set(
                    							current,
                    							"skillofspecie",
                    							lv_skillofspecie_9_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getSpecieBlockAccess().getContainsactionKeyword_7());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_11, grammarAccess.getSpecieBlockAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalGsl.g:755:3: ( (lv_containsaction_12_0= ruleAction ) )
            // InternalGsl.g:756:4: (lv_containsaction_12_0= ruleAction )
            {
            // InternalGsl.g:756:4: (lv_containsaction_12_0= ruleAction )
            // InternalGsl.g:757:5: lv_containsaction_12_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getSpecieBlockAccess().getContainsactionActionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_containsaction_12_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecieBlockRule());
            					}
            					add(
            						current,
            						"containsaction",
            						lv_containsaction_12_0,
            						"com.ktsv.gsl.Gsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGsl.g:774:3: (otherlv_13= ',' ( (lv_containsaction_14_0= ruleAction ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGsl.g:775:4: otherlv_13= ',' ( (lv_containsaction_14_0= ruleAction ) )
            	    {
            	    otherlv_13=(Token)match(input,19,FOLLOW_29); 

            	    				newLeafNode(otherlv_13, grammarAccess.getSpecieBlockAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalGsl.g:779:4: ( (lv_containsaction_14_0= ruleAction ) )
            	    // InternalGsl.g:780:5: (lv_containsaction_14_0= ruleAction )
            	    {
            	    // InternalGsl.g:780:5: (lv_containsaction_14_0= ruleAction )
            	    // InternalGsl.g:781:6: lv_containsaction_14_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getSpecieBlockAccess().getContainsactionActionParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_containsaction_14_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSpecieBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"containsaction",
            	    							lv_containsaction_14_0,
            	    							"com.ktsv.gsl.Gsl.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_15=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_15, grammarAccess.getSpecieBlockAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_16=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getSpecieBlockAccess().getHaspropertieKeyword_12());
            		
            otherlv_17=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_17, grammarAccess.getSpecieBlockAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalGsl.g:811:3: ( (lv_haspropertie_18_0= rulePropertie ) )
            // InternalGsl.g:812:4: (lv_haspropertie_18_0= rulePropertie )
            {
            // InternalGsl.g:812:4: (lv_haspropertie_18_0= rulePropertie )
            // InternalGsl.g:813:5: lv_haspropertie_18_0= rulePropertie
            {

            					newCompositeNode(grammarAccess.getSpecieBlockAccess().getHaspropertiePropertieParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_14);
            lv_haspropertie_18_0=rulePropertie();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpecieBlockRule());
            					}
            					add(
            						current,
            						"haspropertie",
            						lv_haspropertie_18_0,
            						"com.ktsv.gsl.Gsl.Propertie");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGsl.g:830:3: (otherlv_19= ',' ( (lv_haspropertie_20_0= rulePropertie ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGsl.g:831:4: otherlv_19= ',' ( (lv_haspropertie_20_0= rulePropertie ) )
            	    {
            	    otherlv_19=(Token)match(input,19,FOLLOW_31); 

            	    				newLeafNode(otherlv_19, grammarAccess.getSpecieBlockAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalGsl.g:835:4: ( (lv_haspropertie_20_0= rulePropertie ) )
            	    // InternalGsl.g:836:5: (lv_haspropertie_20_0= rulePropertie )
            	    {
            	    // InternalGsl.g:836:5: (lv_haspropertie_20_0= rulePropertie )
            	    // InternalGsl.g:837:6: lv_haspropertie_20_0= rulePropertie
            	    {

            	    						newCompositeNode(grammarAccess.getSpecieBlockAccess().getHaspropertiePropertieParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_haspropertie_20_0=rulePropertie();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSpecieBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"haspropertie",
            	    							lv_haspropertie_20_0,
            	    							"com.ktsv.gsl.Gsl.Propertie");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_21=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_21, grammarAccess.getSpecieBlockAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_22=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getSpecieBlockAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleSpecieBlock"


    // $ANTLR start "entryRuleExperimentBlock"
    // InternalGsl.g:867:1: entryRuleExperimentBlock returns [EObject current=null] : iv_ruleExperimentBlock= ruleExperimentBlock EOF ;
    public final EObject entryRuleExperimentBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentBlock = null;


        try {
            // InternalGsl.g:867:56: (iv_ruleExperimentBlock= ruleExperimentBlock EOF )
            // InternalGsl.g:868:2: iv_ruleExperimentBlock= ruleExperimentBlock EOF
            {
             newCompositeNode(grammarAccess.getExperimentBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperimentBlock=ruleExperimentBlock();

            state._fsp--;

             current =iv_ruleExperimentBlock; 
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
    // $ANTLR end "entryRuleExperimentBlock"


    // $ANTLR start "ruleExperimentBlock"
    // InternalGsl.g:874:1: ruleExperimentBlock returns [EObject current=null] : (otherlv_0= 'ExperimentBlock' ( (lv_experimentName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= 'hasparameter' otherlv_6= '{' ( (lv_hasparameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_hasparameter_9_0= ruleParameter ) ) )* otherlv_10= '}' otherlv_11= 'hasoutput' otherlv_12= '{' ( (lv_hasoutput_13_0= ruleOutput ) ) (otherlv_14= ',' ( (lv_hasoutput_15_0= ruleOutput ) ) )* otherlv_16= '}' otherlv_17= '}' ) ;
    public final EObject ruleExperimentBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_experimentName_1_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;

        EObject lv_hasparameter_7_0 = null;

        EObject lv_hasparameter_9_0 = null;

        EObject lv_hasoutput_13_0 = null;

        EObject lv_hasoutput_15_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:880:2: ( (otherlv_0= 'ExperimentBlock' ( (lv_experimentName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= 'hasparameter' otherlv_6= '{' ( (lv_hasparameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_hasparameter_9_0= ruleParameter ) ) )* otherlv_10= '}' otherlv_11= 'hasoutput' otherlv_12= '{' ( (lv_hasoutput_13_0= ruleOutput ) ) (otherlv_14= ',' ( (lv_hasoutput_15_0= ruleOutput ) ) )* otherlv_16= '}' otherlv_17= '}' ) )
            // InternalGsl.g:881:2: (otherlv_0= 'ExperimentBlock' ( (lv_experimentName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= 'hasparameter' otherlv_6= '{' ( (lv_hasparameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_hasparameter_9_0= ruleParameter ) ) )* otherlv_10= '}' otherlv_11= 'hasoutput' otherlv_12= '{' ( (lv_hasoutput_13_0= ruleOutput ) ) (otherlv_14= ',' ( (lv_hasoutput_15_0= ruleOutput ) ) )* otherlv_16= '}' otherlv_17= '}' )
            {
            // InternalGsl.g:881:2: (otherlv_0= 'ExperimentBlock' ( (lv_experimentName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= 'hasparameter' otherlv_6= '{' ( (lv_hasparameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_hasparameter_9_0= ruleParameter ) ) )* otherlv_10= '}' otherlv_11= 'hasoutput' otherlv_12= '{' ( (lv_hasoutput_13_0= ruleOutput ) ) (otherlv_14= ',' ( (lv_hasoutput_15_0= ruleOutput ) ) )* otherlv_16= '}' otherlv_17= '}' )
            // InternalGsl.g:882:3: otherlv_0= 'ExperimentBlock' ( (lv_experimentName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )? otherlv_5= 'hasparameter' otherlv_6= '{' ( (lv_hasparameter_7_0= ruleParameter ) ) (otherlv_8= ',' ( (lv_hasparameter_9_0= ruleParameter ) ) )* otherlv_10= '}' otherlv_11= 'hasoutput' otherlv_12= '{' ( (lv_hasoutput_13_0= ruleOutput ) ) (otherlv_14= ',' ( (lv_hasoutput_15_0= ruleOutput ) ) )* otherlv_16= '}' otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExperimentBlockAccess().getExperimentBlockKeyword_0());
            		
            // InternalGsl.g:886:3: ( (lv_experimentName_1_0= ruleEString ) )
            // InternalGsl.g:887:4: (lv_experimentName_1_0= ruleEString )
            {
            // InternalGsl.g:887:4: (lv_experimentName_1_0= ruleEString )
            // InternalGsl.g:888:5: lv_experimentName_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExperimentBlockAccess().getExperimentNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_experimentName_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExperimentBlockRule());
            					}
            					set(
            						current,
            						"experimentName",
            						lv_experimentName_1_0,
            						"com.ktsv.gsl.Gsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getExperimentBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGsl.g:909:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGsl.g:910:4: otherlv_3= 'type' ( (lv_type_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getExperimentBlockAccess().getTypeKeyword_3_0());
                    			
                    // InternalGsl.g:914:4: ( (lv_type_4_0= ruleEString ) )
                    // InternalGsl.g:915:5: (lv_type_4_0= ruleEString )
                    {
                    // InternalGsl.g:915:5: (lv_type_4_0= ruleEString )
                    // InternalGsl.g:916:6: lv_type_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExperimentBlockAccess().getTypeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_type_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExperimentBlockRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getExperimentBlockAccess().getHasparameterKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_6, grammarAccess.getExperimentBlockAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGsl.g:942:3: ( (lv_hasparameter_7_0= ruleParameter ) )
            // InternalGsl.g:943:4: (lv_hasparameter_7_0= ruleParameter )
            {
            // InternalGsl.g:943:4: (lv_hasparameter_7_0= ruleParameter )
            // InternalGsl.g:944:5: lv_hasparameter_7_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getExperimentBlockAccess().getHasparameterParameterParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_hasparameter_7_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExperimentBlockRule());
            					}
            					add(
            						current,
            						"hasparameter",
            						lv_hasparameter_7_0,
            						"com.ktsv.gsl.Gsl.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGsl.g:961:3: (otherlv_8= ',' ( (lv_hasparameter_9_0= ruleParameter ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==19) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGsl.g:962:4: otherlv_8= ',' ( (lv_hasparameter_9_0= ruleParameter ) )
            	    {
            	    otherlv_8=(Token)match(input,19,FOLLOW_34); 

            	    				newLeafNode(otherlv_8, grammarAccess.getExperimentBlockAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalGsl.g:966:4: ( (lv_hasparameter_9_0= ruleParameter ) )
            	    // InternalGsl.g:967:5: (lv_hasparameter_9_0= ruleParameter )
            	    {
            	    // InternalGsl.g:967:5: (lv_hasparameter_9_0= ruleParameter )
            	    // InternalGsl.g:968:6: lv_hasparameter_9_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getExperimentBlockAccess().getHasparameterParameterParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_hasparameter_9_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExperimentBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"hasparameter",
            	    							lv_hasparameter_9_0,
            	    							"com.ktsv.gsl.Gsl.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_10=(Token)match(input,20,FOLLOW_35); 

            			newLeafNode(otherlv_10, grammarAccess.getExperimentBlockAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getExperimentBlockAccess().getHasoutputKeyword_9());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_12, grammarAccess.getExperimentBlockAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalGsl.g:998:3: ( (lv_hasoutput_13_0= ruleOutput ) )
            // InternalGsl.g:999:4: (lv_hasoutput_13_0= ruleOutput )
            {
            // InternalGsl.g:999:4: (lv_hasoutput_13_0= ruleOutput )
            // InternalGsl.g:1000:5: lv_hasoutput_13_0= ruleOutput
            {

            					newCompositeNode(grammarAccess.getExperimentBlockAccess().getHasoutputOutputParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_14);
            lv_hasoutput_13_0=ruleOutput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExperimentBlockRule());
            					}
            					add(
            						current,
            						"hasoutput",
            						lv_hasoutput_13_0,
            						"com.ktsv.gsl.Gsl.Output");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGsl.g:1017:3: (otherlv_14= ',' ( (lv_hasoutput_15_0= ruleOutput ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==19) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGsl.g:1018:4: otherlv_14= ',' ( (lv_hasoutput_15_0= ruleOutput ) )
            	    {
            	    otherlv_14=(Token)match(input,19,FOLLOW_36); 

            	    				newLeafNode(otherlv_14, grammarAccess.getExperimentBlockAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalGsl.g:1022:4: ( (lv_hasoutput_15_0= ruleOutput ) )
            	    // InternalGsl.g:1023:5: (lv_hasoutput_15_0= ruleOutput )
            	    {
            	    // InternalGsl.g:1023:5: (lv_hasoutput_15_0= ruleOutput )
            	    // InternalGsl.g:1024:6: lv_hasoutput_15_0= ruleOutput
            	    {

            	    						newCompositeNode(grammarAccess.getExperimentBlockAccess().getHasoutputOutputParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_hasoutput_15_0=ruleOutput();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExperimentBlockRule());
            	    						}
            	    						add(
            	    							current,
            	    							"hasoutput",
            	    							lv_hasoutput_15_0,
            	    							"com.ktsv.gsl.Gsl.Output");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_16=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_16, grammarAccess.getExperimentBlockAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_17=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getExperimentBlockAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleExperimentBlock"


    // $ANTLR start "entryRuleEInt"
    // InternalGsl.g:1054:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGsl.g:1054:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGsl.g:1055:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalGsl.g:1061:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGsl.g:1067:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGsl.g:1068:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGsl.g:1068:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGsl.g:1069:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGsl.g:1069:3: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGsl.g:1070:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_37); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleGlobalVariable"
    // InternalGsl.g:1087:1: entryRuleGlobalVariable returns [EObject current=null] : iv_ruleGlobalVariable= ruleGlobalVariable EOF ;
    public final EObject entryRuleGlobalVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalVariable = null;


        try {
            // InternalGsl.g:1087:55: (iv_ruleGlobalVariable= ruleGlobalVariable EOF )
            // InternalGsl.g:1088:2: iv_ruleGlobalVariable= ruleGlobalVariable EOF
            {
             newCompositeNode(grammarAccess.getGlobalVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalVariable=ruleGlobalVariable();

            state._fsp--;

             current =iv_ruleGlobalVariable; 
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
    // $ANTLR end "entryRuleGlobalVariable"


    // $ANTLR start "ruleGlobalVariable"
    // InternalGsl.g:1094:1: ruleGlobalVariable returns [EObject current=null] : ( () otherlv_1= 'GlobalVariable' ( (lv_gvarName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'initValue' ( (lv_initValue_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleGlobalVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_gvarName_2_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_initValue_7_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:1100:2: ( ( () otherlv_1= 'GlobalVariable' ( (lv_gvarName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'initValue' ( (lv_initValue_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalGsl.g:1101:2: ( () otherlv_1= 'GlobalVariable' ( (lv_gvarName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'initValue' ( (lv_initValue_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalGsl.g:1101:2: ( () otherlv_1= 'GlobalVariable' ( (lv_gvarName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'initValue' ( (lv_initValue_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalGsl.g:1102:3: () otherlv_1= 'GlobalVariable' ( (lv_gvarName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'initValue' ( (lv_initValue_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalGsl.g:1102:3: ()
            // InternalGsl.g:1103:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalVariableAccess().getGlobalVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalVariableAccess().getGlobalVariableKeyword_1());
            		
            // InternalGsl.g:1113:3: ( (lv_gvarName_2_0= ruleEString ) )
            // InternalGsl.g:1114:4: (lv_gvarName_2_0= ruleEString )
            {
            // InternalGsl.g:1114:4: (lv_gvarName_2_0= ruleEString )
            // InternalGsl.g:1115:5: lv_gvarName_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGlobalVariableAccess().getGvarNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_gvarName_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalVariableRule());
            					}
            					set(
            						current,
            						"gvarName",
            						lv_gvarName_2_0,
            						"com.ktsv.gsl.Gsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getGlobalVariableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGsl.g:1136:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGsl.g:1137:4: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalVariableAccess().getTypeKeyword_4_0());
                    			
                    // InternalGsl.g:1141:4: ( (lv_type_5_0= ruleEString ) )
                    // InternalGsl.g:1142:5: (lv_type_5_0= ruleEString )
                    {
                    // InternalGsl.g:1142:5: (lv_type_5_0= ruleEString )
                    // InternalGsl.g:1143:6: lv_type_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGlobalVariableAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalVariableRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1161:3: (otherlv_6= 'initValue' ( (lv_initValue_7_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGsl.g:1162:4: otherlv_6= 'initValue' ( (lv_initValue_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getGlobalVariableAccess().getInitValueKeyword_5_0());
                    			
                    // InternalGsl.g:1166:4: ( (lv_initValue_7_0= ruleEString ) )
                    // InternalGsl.g:1167:5: (lv_initValue_7_0= ruleEString )
                    {
                    // InternalGsl.g:1167:5: (lv_initValue_7_0= ruleEString )
                    // InternalGsl.g:1168:6: lv_initValue_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getGlobalVariableAccess().getInitValueEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_initValue_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalVariableRule());
                    						}
                    						set(
                    							current,
                    							"initValue",
                    							lv_initValue_7_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGlobalVariableAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleGlobalVariable"


    // $ANTLR start "entryRuleSpatialEntity"
    // InternalGsl.g:1194:1: entryRuleSpatialEntity returns [EObject current=null] : iv_ruleSpatialEntity= ruleSpatialEntity EOF ;
    public final EObject entryRuleSpatialEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpatialEntity = null;


        try {
            // InternalGsl.g:1194:54: (iv_ruleSpatialEntity= ruleSpatialEntity EOF )
            // InternalGsl.g:1195:2: iv_ruleSpatialEntity= ruleSpatialEntity EOF
            {
             newCompositeNode(grammarAccess.getSpatialEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpatialEntity=ruleSpatialEntity();

            state._fsp--;

             current =iv_ruleSpatialEntity; 
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
    // $ANTLR end "entryRuleSpatialEntity"


    // $ANTLR start "ruleSpatialEntity"
    // InternalGsl.g:1201:1: ruleSpatialEntity returns [EObject current=null] : ( () otherlv_1= 'SpatialEntity' ( (lv_shapeName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'shapePath' ( (lv_shapePath_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleSpatialEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_shapeName_2_0 = null;

        AntlrDatatypeRuleToken lv_shapePath_5_0 = null;

        AntlrDatatypeRuleToken lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:1207:2: ( ( () otherlv_1= 'SpatialEntity' ( (lv_shapeName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'shapePath' ( (lv_shapePath_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalGsl.g:1208:2: ( () otherlv_1= 'SpatialEntity' ( (lv_shapeName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'shapePath' ( (lv_shapePath_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalGsl.g:1208:2: ( () otherlv_1= 'SpatialEntity' ( (lv_shapeName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'shapePath' ( (lv_shapePath_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalGsl.g:1209:3: () otherlv_1= 'SpatialEntity' ( (lv_shapeName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'shapePath' ( (lv_shapePath_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalGsl.g:1209:3: ()
            // InternalGsl.g:1210:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpatialEntityAccess().getSpatialEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSpatialEntityAccess().getSpatialEntityKeyword_1());
            		
            // InternalGsl.g:1220:3: ( (lv_shapeName_2_0= ruleEString ) )
            // InternalGsl.g:1221:4: (lv_shapeName_2_0= ruleEString )
            {
            // InternalGsl.g:1221:4: (lv_shapeName_2_0= ruleEString )
            // InternalGsl.g:1222:5: lv_shapeName_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSpatialEntityAccess().getShapeNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_shapeName_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSpatialEntityRule());
            					}
            					set(
            						current,
            						"shapeName",
            						lv_shapeName_2_0,
            						"com.ktsv.gsl.Gsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getSpatialEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGsl.g:1243:3: (otherlv_4= 'shapePath' ( (lv_shapePath_5_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGsl.g:1244:4: otherlv_4= 'shapePath' ( (lv_shapePath_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSpatialEntityAccess().getShapePathKeyword_4_0());
                    			
                    // InternalGsl.g:1248:4: ( (lv_shapePath_5_0= ruleEString ) )
                    // InternalGsl.g:1249:5: (lv_shapePath_5_0= ruleEString )
                    {
                    // InternalGsl.g:1249:5: (lv_shapePath_5_0= ruleEString )
                    // InternalGsl.g:1250:6: lv_shapePath_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSpatialEntityAccess().getShapePathEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_shapePath_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpatialEntityRule());
                    						}
                    						set(
                    							current,
                    							"shapePath",
                    							lv_shapePath_5_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1268:3: (otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGsl.g:1269:4: otherlv_6= 'type' ( (lv_type_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getSpatialEntityAccess().getTypeKeyword_5_0());
                    			
                    // InternalGsl.g:1273:4: ( (lv_type_7_0= ruleEString ) )
                    // InternalGsl.g:1274:5: (lv_type_7_0= ruleEString )
                    {
                    // InternalGsl.g:1274:5: (lv_type_7_0= ruleEString )
                    // InternalGsl.g:1275:6: lv_type_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSpatialEntityAccess().getTypeEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_type_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpatialEntityRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_7_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSpatialEntityAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSpatialEntity"


    // $ANTLR start "entryRuleAction_Impl"
    // InternalGsl.g:1301:1: entryRuleAction_Impl returns [EObject current=null] : iv_ruleAction_Impl= ruleAction_Impl EOF ;
    public final EObject entryRuleAction_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction_Impl = null;


        try {
            // InternalGsl.g:1301:52: (iv_ruleAction_Impl= ruleAction_Impl EOF )
            // InternalGsl.g:1302:2: iv_ruleAction_Impl= ruleAction_Impl EOF
            {
             newCompositeNode(grammarAccess.getAction_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction_Impl=ruleAction_Impl();

            state._fsp--;

             current =iv_ruleAction_Impl; 
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
    // $ANTLR end "entryRuleAction_Impl"


    // $ANTLR start "ruleAction_Impl"
    // InternalGsl.g:1308:1: ruleAction_Impl returns [EObject current=null] : ( () otherlv_1= 'Action' otherlv_2= '{' (otherlv_3= 'actionName' ( (lv_actionName_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAction_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_actionName_4_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:1314:2: ( ( () otherlv_1= 'Action' otherlv_2= '{' (otherlv_3= 'actionName' ( (lv_actionName_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalGsl.g:1315:2: ( () otherlv_1= 'Action' otherlv_2= '{' (otherlv_3= 'actionName' ( (lv_actionName_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalGsl.g:1315:2: ( () otherlv_1= 'Action' otherlv_2= '{' (otherlv_3= 'actionName' ( (lv_actionName_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalGsl.g:1316:3: () otherlv_1= 'Action' otherlv_2= '{' (otherlv_3= 'actionName' ( (lv_actionName_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalGsl.g:1316:3: ()
            // InternalGsl.g:1317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAction_ImplAccess().getActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAction_ImplAccess().getActionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGsl.g:1331:3: (otherlv_3= 'actionName' ( (lv_actionName_4_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGsl.g:1332:4: otherlv_3= 'actionName' ( (lv_actionName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getAction_ImplAccess().getActionNameKeyword_3_0());
                    			
                    // InternalGsl.g:1336:4: ( (lv_actionName_4_0= ruleEString ) )
                    // InternalGsl.g:1337:5: (lv_actionName_4_0= ruleEString )
                    {
                    // InternalGsl.g:1337:5: (lv_actionName_4_0= ruleEString )
                    // InternalGsl.g:1338:6: lv_actionName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAction_ImplAccess().getActionNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_actionName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAction_ImplRule());
                    						}
                    						set(
                    							current,
                    							"actionName",
                    							lv_actionName_4_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAction_ImplAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAction_Impl"


    // $ANTLR start "entryRulePropertie"
    // InternalGsl.g:1364:1: entryRulePropertie returns [EObject current=null] : iv_rulePropertie= rulePropertie EOF ;
    public final EObject entryRulePropertie() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertie = null;


        try {
            // InternalGsl.g:1364:50: (iv_rulePropertie= rulePropertie EOF )
            // InternalGsl.g:1365:2: iv_rulePropertie= rulePropertie EOF
            {
             newCompositeNode(grammarAccess.getPropertieRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertie=rulePropertie();

            state._fsp--;

             current =iv_rulePropertie; 
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
    // $ANTLR end "entryRulePropertie"


    // $ANTLR start "rulePropertie"
    // InternalGsl.g:1371:1: rulePropertie returns [EObject current=null] : ( () otherlv_1= 'Propertie' otherlv_2= '{' (otherlv_3= 'propertieName' ( (lv_propertieName_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )? (otherlv_7= 'initValue' ( (lv_initValue_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject rulePropertie() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_propertieName_4_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;

        AntlrDatatypeRuleToken lv_initValue_8_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:1377:2: ( ( () otherlv_1= 'Propertie' otherlv_2= '{' (otherlv_3= 'propertieName' ( (lv_propertieName_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )? (otherlv_7= 'initValue' ( (lv_initValue_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalGsl.g:1378:2: ( () otherlv_1= 'Propertie' otherlv_2= '{' (otherlv_3= 'propertieName' ( (lv_propertieName_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )? (otherlv_7= 'initValue' ( (lv_initValue_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalGsl.g:1378:2: ( () otherlv_1= 'Propertie' otherlv_2= '{' (otherlv_3= 'propertieName' ( (lv_propertieName_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )? (otherlv_7= 'initValue' ( (lv_initValue_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalGsl.g:1379:3: () otherlv_1= 'Propertie' otherlv_2= '{' (otherlv_3= 'propertieName' ( (lv_propertieName_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )? (otherlv_7= 'initValue' ( (lv_initValue_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalGsl.g:1379:3: ()
            // InternalGsl.g:1380:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPropertieAccess().getPropertieAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertieAccess().getPropertieKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getPropertieAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGsl.g:1394:3: (otherlv_3= 'propertieName' ( (lv_propertieName_4_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==46) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGsl.g:1395:4: otherlv_3= 'propertieName' ( (lv_propertieName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPropertieAccess().getPropertieNameKeyword_3_0());
                    			
                    // InternalGsl.g:1399:4: ( (lv_propertieName_4_0= ruleEString ) )
                    // InternalGsl.g:1400:5: (lv_propertieName_4_0= ruleEString )
                    {
                    // InternalGsl.g:1400:5: (lv_propertieName_4_0= ruleEString )
                    // InternalGsl.g:1401:6: lv_propertieName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertieAccess().getPropertieNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_propertieName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertieRule());
                    						}
                    						set(
                    							current,
                    							"propertieName",
                    							lv_propertieName_4_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1419:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGsl.g:1420:4: otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getPropertieAccess().getTypeKeyword_4_0());
                    			
                    // InternalGsl.g:1424:4: ( (lv_type_6_0= ruleEString ) )
                    // InternalGsl.g:1425:5: (lv_type_6_0= ruleEString )
                    {
                    // InternalGsl.g:1425:5: (lv_type_6_0= ruleEString )
                    // InternalGsl.g:1426:6: lv_type_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertieAccess().getTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_type_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertieRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1444:3: (otherlv_7= 'initValue' ( (lv_initValue_8_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==40) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGsl.g:1445:4: otherlv_7= 'initValue' ( (lv_initValue_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getPropertieAccess().getInitValueKeyword_5_0());
                    			
                    // InternalGsl.g:1449:4: ( (lv_initValue_8_0= ruleEString ) )
                    // InternalGsl.g:1450:5: (lv_initValue_8_0= ruleEString )
                    {
                    // InternalGsl.g:1450:5: (lv_initValue_8_0= ruleEString )
                    // InternalGsl.g:1451:6: lv_initValue_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPropertieAccess().getInitValueEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_initValue_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertieRule());
                    						}
                    						set(
                    							current,
                    							"initValue",
                    							lv_initValue_8_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPropertieAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePropertie"


    // $ANTLR start "entryRuleComplexeAction"
    // InternalGsl.g:1477:1: entryRuleComplexeAction returns [EObject current=null] : iv_ruleComplexeAction= ruleComplexeAction EOF ;
    public final EObject entryRuleComplexeAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexeAction = null;


        try {
            // InternalGsl.g:1477:55: (iv_ruleComplexeAction= ruleComplexeAction EOF )
            // InternalGsl.g:1478:2: iv_ruleComplexeAction= ruleComplexeAction EOF
            {
             newCompositeNode(grammarAccess.getComplexeActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexeAction=ruleComplexeAction();

            state._fsp--;

             current =iv_ruleComplexeAction; 
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
    // $ANTLR end "entryRuleComplexeAction"


    // $ANTLR start "ruleComplexeAction"
    // InternalGsl.g:1484:1: ruleComplexeAction returns [EObject current=null] : ( () otherlv_1= 'ComplexeAction' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleComplexeAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_actionName_5_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:1490:2: ( ( () otherlv_1= 'ComplexeAction' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalGsl.g:1491:2: ( () otherlv_1= 'ComplexeAction' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalGsl.g:1491:2: ( () otherlv_1= 'ComplexeAction' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalGsl.g:1492:3: () otherlv_1= 'ComplexeAction' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalGsl.g:1492:3: ()
            // InternalGsl.g:1493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexeActionAccess().getComplexeActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexeActionAccess().getComplexeActionKeyword_1());
            		
            // InternalGsl.g:1503:3: ( (lv_id_2_0= ruleEInt ) )
            // InternalGsl.g:1504:4: (lv_id_2_0= ruleEInt )
            {
            // InternalGsl.g:1504:4: (lv_id_2_0= ruleEInt )
            // InternalGsl.g:1505:5: lv_id_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getComplexeActionAccess().getIdEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_id_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexeActionRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"com.ktsv.gsl.Gsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getComplexeActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGsl.g:1526:3: (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGsl.g:1527:4: otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getComplexeActionAccess().getActionNameKeyword_4_0());
                    			
                    // InternalGsl.g:1531:4: ( (lv_actionName_5_0= ruleEString ) )
                    // InternalGsl.g:1532:5: (lv_actionName_5_0= ruleEString )
                    {
                    // InternalGsl.g:1532:5: (lv_actionName_5_0= ruleEString )
                    // InternalGsl.g:1533:6: lv_actionName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getComplexeActionAccess().getActionNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_actionName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexeActionRule());
                    						}
                    						set(
                    							current,
                    							"actionName",
                    							lv_actionName_5_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComplexeActionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleComplexeAction"


    // $ANTLR start "entryRuleReflex"
    // InternalGsl.g:1559:1: entryRuleReflex returns [EObject current=null] : iv_ruleReflex= ruleReflex EOF ;
    public final EObject entryRuleReflex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReflex = null;


        try {
            // InternalGsl.g:1559:47: (iv_ruleReflex= ruleReflex EOF )
            // InternalGsl.g:1560:2: iv_ruleReflex= ruleReflex EOF
            {
             newCompositeNode(grammarAccess.getReflexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReflex=ruleReflex();

            state._fsp--;

             current =iv_ruleReflex; 
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
    // $ANTLR end "entryRuleReflex"


    // $ANTLR start "ruleReflex"
    // InternalGsl.g:1566:1: ruleReflex returns [EObject current=null] : ( () otherlv_1= 'Reflex' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleReflex() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_actionName_5_0 = null;

        AntlrDatatypeRuleToken lv_condition_7_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:1572:2: ( ( () otherlv_1= 'Reflex' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalGsl.g:1573:2: ( () otherlv_1= 'Reflex' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalGsl.g:1573:2: ( () otherlv_1= 'Reflex' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalGsl.g:1574:3: () otherlv_1= 'Reflex' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? (otherlv_6= 'condition' ( (lv_condition_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalGsl.g:1574:3: ()
            // InternalGsl.g:1575:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReflexAccess().getReflexAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getReflexAccess().getReflexKeyword_1());
            		
            // InternalGsl.g:1585:3: ( (lv_id_2_0= ruleEInt ) )
            // InternalGsl.g:1586:4: (lv_id_2_0= ruleEInt )
            {
            // InternalGsl.g:1586:4: (lv_id_2_0= ruleEInt )
            // InternalGsl.g:1587:5: lv_id_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getReflexAccess().getIdEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_id_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReflexRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"com.ktsv.gsl.Gsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_3, grammarAccess.getReflexAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGsl.g:1608:3: (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGsl.g:1609:4: otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getReflexAccess().getActionNameKeyword_4_0());
                    			
                    // InternalGsl.g:1613:4: ( (lv_actionName_5_0= ruleEString ) )
                    // InternalGsl.g:1614:5: (lv_actionName_5_0= ruleEString )
                    {
                    // InternalGsl.g:1614:5: (lv_actionName_5_0= ruleEString )
                    // InternalGsl.g:1615:6: lv_actionName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReflexAccess().getActionNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_actionName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReflexRule());
                    						}
                    						set(
                    							current,
                    							"actionName",
                    							lv_actionName_5_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1633:3: (otherlv_6= 'condition' ( (lv_condition_7_0= ruleEString ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGsl.g:1634:4: otherlv_6= 'condition' ( (lv_condition_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getReflexAccess().getConditionKeyword_5_0());
                    			
                    // InternalGsl.g:1638:4: ( (lv_condition_7_0= ruleEString ) )
                    // InternalGsl.g:1639:5: (lv_condition_7_0= ruleEString )
                    {
                    // InternalGsl.g:1639:5: (lv_condition_7_0= ruleEString )
                    // InternalGsl.g:1640:6: lv_condition_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getReflexAccess().getConditionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_condition_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReflexRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_7_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getReflexAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleReflex"


    // $ANTLR start "entryRulesimpleAction"
    // InternalGsl.g:1666:1: entryRulesimpleAction returns [EObject current=null] : iv_rulesimpleAction= rulesimpleAction EOF ;
    public final EObject entryRulesimpleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesimpleAction = null;


        try {
            // InternalGsl.g:1666:53: (iv_rulesimpleAction= rulesimpleAction EOF )
            // InternalGsl.g:1667:2: iv_rulesimpleAction= rulesimpleAction EOF
            {
             newCompositeNode(grammarAccess.getSimpleActionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesimpleAction=rulesimpleAction();

            state._fsp--;

             current =iv_rulesimpleAction; 
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
    // $ANTLR end "entryRulesimpleAction"


    // $ANTLR start "rulesimpleAction"
    // InternalGsl.g:1673:1: rulesimpleAction returns [EObject current=null] : ( () otherlv_1= 'simpleAction' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? (otherlv_6= 'ReturnType' ( (lv_ReturnType_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject rulesimpleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_id_2_0 = null;

        AntlrDatatypeRuleToken lv_actionName_5_0 = null;

        AntlrDatatypeRuleToken lv_ReturnType_7_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:1679:2: ( ( () otherlv_1= 'simpleAction' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? (otherlv_6= 'ReturnType' ( (lv_ReturnType_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalGsl.g:1680:2: ( () otherlv_1= 'simpleAction' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? (otherlv_6= 'ReturnType' ( (lv_ReturnType_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalGsl.g:1680:2: ( () otherlv_1= 'simpleAction' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? (otherlv_6= 'ReturnType' ( (lv_ReturnType_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalGsl.g:1681:3: () otherlv_1= 'simpleAction' ( (lv_id_2_0= ruleEInt ) ) otherlv_3= '{' (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )? (otherlv_6= 'ReturnType' ( (lv_ReturnType_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalGsl.g:1681:3: ()
            // InternalGsl.g:1682:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleActionAccess().getSimpleActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleActionAccess().getSimpleActionKeyword_1());
            		
            // InternalGsl.g:1692:3: ( (lv_id_2_0= ruleEInt ) )
            // InternalGsl.g:1693:4: (lv_id_2_0= ruleEInt )
            {
            // InternalGsl.g:1693:4: (lv_id_2_0= ruleEInt )
            // InternalGsl.g:1694:5: lv_id_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSimpleActionAccess().getIdEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_id_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleActionRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_2_0,
            						"com.ktsv.gsl.Gsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleActionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGsl.g:1715:3: (otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGsl.g:1716:4: otherlv_4= 'actionName' ( (lv_actionName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSimpleActionAccess().getActionNameKeyword_4_0());
                    			
                    // InternalGsl.g:1720:4: ( (lv_actionName_5_0= ruleEString ) )
                    // InternalGsl.g:1721:5: (lv_actionName_5_0= ruleEString )
                    {
                    // InternalGsl.g:1721:5: (lv_actionName_5_0= ruleEString )
                    // InternalGsl.g:1722:6: lv_actionName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSimpleActionAccess().getActionNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_actionName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleActionRule());
                    						}
                    						set(
                    							current,
                    							"actionName",
                    							lv_actionName_5_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1740:3: (otherlv_6= 'ReturnType' ( (lv_ReturnType_7_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGsl.g:1741:4: otherlv_6= 'ReturnType' ( (lv_ReturnType_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getSimpleActionAccess().getReturnTypeKeyword_5_0());
                    			
                    // InternalGsl.g:1745:4: ( (lv_ReturnType_7_0= ruleEString ) )
                    // InternalGsl.g:1746:5: (lv_ReturnType_7_0= ruleEString )
                    {
                    // InternalGsl.g:1746:5: (lv_ReturnType_7_0= ruleEString )
                    // InternalGsl.g:1747:6: lv_ReturnType_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSimpleActionAccess().getReturnTypeEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_ReturnType_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleActionRule());
                    						}
                    						set(
                    							current,
                    							"ReturnType",
                    							lv_ReturnType_7_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSimpleActionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulesimpleAction"


    // $ANTLR start "entryRuleParameter"
    // InternalGsl.g:1773:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalGsl.g:1773:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalGsl.g:1774:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalGsl.g:1780:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'Parameter' ( (lv_parameterName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetVariable' ( (lv_targetVariable_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_parameterName_2_0 = null;

        AntlrDatatypeRuleToken lv_targetVariable_5_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:1786:2: ( ( () otherlv_1= 'Parameter' ( (lv_parameterName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetVariable' ( (lv_targetVariable_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalGsl.g:1787:2: ( () otherlv_1= 'Parameter' ( (lv_parameterName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetVariable' ( (lv_targetVariable_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalGsl.g:1787:2: ( () otherlv_1= 'Parameter' ( (lv_parameterName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetVariable' ( (lv_targetVariable_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalGsl.g:1788:3: () otherlv_1= 'Parameter' ( (lv_parameterName_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetVariable' ( (lv_targetVariable_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalGsl.g:1788:3: ()
            // InternalGsl.g:1789:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParameterKeyword_1());
            		
            // InternalGsl.g:1799:3: ( (lv_parameterName_2_0= ruleEString ) )
            // InternalGsl.g:1800:4: (lv_parameterName_2_0= ruleEString )
            {
            // InternalGsl.g:1800:4: (lv_parameterName_2_0= ruleEString )
            // InternalGsl.g:1801:5: lv_parameterName_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getParameterNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_parameterName_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"parameterName",
            						lv_parameterName_2_0,
            						"com.ktsv.gsl.Gsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGsl.g:1822:3: (otherlv_4= 'targetVariable' ( (lv_targetVariable_5_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGsl.g:1823:4: otherlv_4= 'targetVariable' ( (lv_targetVariable_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,53,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getTargetVariableKeyword_4_0());
                    			
                    // InternalGsl.g:1827:4: ( (lv_targetVariable_5_0= ruleEString ) )
                    // InternalGsl.g:1828:5: (lv_targetVariable_5_0= ruleEString )
                    {
                    // InternalGsl.g:1828:5: (lv_targetVariable_5_0= ruleEString )
                    // InternalGsl.g:1829:6: lv_targetVariable_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTargetVariableEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_targetVariable_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"targetVariable",
                    							lv_targetVariable_5_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleOutput"
    // InternalGsl.g:1855:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalGsl.g:1855:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalGsl.g:1856:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalGsl.g:1862:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'Output' ( (lv_id_1_0= ruleEInt ) ) otherlv_2= '{' (otherlv_3= 'outputName' ( (lv_outputName_4_0= ruleEString ) ) )? (otherlv_5= 'framerate' ( (lv_framerate_6_0= ruleEString ) ) )? otherlv_7= 'hasdisplays' otherlv_8= '{' ( (lv_hasdisplays_9_0= ruleDisplay ) ) (otherlv_10= ',' ( (lv_hasdisplays_11_0= ruleDisplay ) ) )* otherlv_12= '}' otherlv_13= 'hasexportfile' otherlv_14= '{' ( (lv_hasexportfile_15_0= ruleExportfile ) ) (otherlv_16= ',' ( (lv_hasexportfile_17_0= ruleExportfile ) ) )* otherlv_18= '}' otherlv_19= 'hasmonitor' otherlv_20= '{' ( (lv_hasmonitor_21_0= ruleMonitor ) ) (otherlv_22= ',' ( (lv_hasmonitor_23_0= ruleMonitor ) ) )* otherlv_24= '}' otherlv_25= '}' ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_outputName_4_0 = null;

        AntlrDatatypeRuleToken lv_framerate_6_0 = null;

        EObject lv_hasdisplays_9_0 = null;

        EObject lv_hasdisplays_11_0 = null;

        EObject lv_hasexportfile_15_0 = null;

        EObject lv_hasexportfile_17_0 = null;

        EObject lv_hasmonitor_21_0 = null;

        EObject lv_hasmonitor_23_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:1868:2: ( (otherlv_0= 'Output' ( (lv_id_1_0= ruleEInt ) ) otherlv_2= '{' (otherlv_3= 'outputName' ( (lv_outputName_4_0= ruleEString ) ) )? (otherlv_5= 'framerate' ( (lv_framerate_6_0= ruleEString ) ) )? otherlv_7= 'hasdisplays' otherlv_8= '{' ( (lv_hasdisplays_9_0= ruleDisplay ) ) (otherlv_10= ',' ( (lv_hasdisplays_11_0= ruleDisplay ) ) )* otherlv_12= '}' otherlv_13= 'hasexportfile' otherlv_14= '{' ( (lv_hasexportfile_15_0= ruleExportfile ) ) (otherlv_16= ',' ( (lv_hasexportfile_17_0= ruleExportfile ) ) )* otherlv_18= '}' otherlv_19= 'hasmonitor' otherlv_20= '{' ( (lv_hasmonitor_21_0= ruleMonitor ) ) (otherlv_22= ',' ( (lv_hasmonitor_23_0= ruleMonitor ) ) )* otherlv_24= '}' otherlv_25= '}' ) )
            // InternalGsl.g:1869:2: (otherlv_0= 'Output' ( (lv_id_1_0= ruleEInt ) ) otherlv_2= '{' (otherlv_3= 'outputName' ( (lv_outputName_4_0= ruleEString ) ) )? (otherlv_5= 'framerate' ( (lv_framerate_6_0= ruleEString ) ) )? otherlv_7= 'hasdisplays' otherlv_8= '{' ( (lv_hasdisplays_9_0= ruleDisplay ) ) (otherlv_10= ',' ( (lv_hasdisplays_11_0= ruleDisplay ) ) )* otherlv_12= '}' otherlv_13= 'hasexportfile' otherlv_14= '{' ( (lv_hasexportfile_15_0= ruleExportfile ) ) (otherlv_16= ',' ( (lv_hasexportfile_17_0= ruleExportfile ) ) )* otherlv_18= '}' otherlv_19= 'hasmonitor' otherlv_20= '{' ( (lv_hasmonitor_21_0= ruleMonitor ) ) (otherlv_22= ',' ( (lv_hasmonitor_23_0= ruleMonitor ) ) )* otherlv_24= '}' otherlv_25= '}' )
            {
            // InternalGsl.g:1869:2: (otherlv_0= 'Output' ( (lv_id_1_0= ruleEInt ) ) otherlv_2= '{' (otherlv_3= 'outputName' ( (lv_outputName_4_0= ruleEString ) ) )? (otherlv_5= 'framerate' ( (lv_framerate_6_0= ruleEString ) ) )? otherlv_7= 'hasdisplays' otherlv_8= '{' ( (lv_hasdisplays_9_0= ruleDisplay ) ) (otherlv_10= ',' ( (lv_hasdisplays_11_0= ruleDisplay ) ) )* otherlv_12= '}' otherlv_13= 'hasexportfile' otherlv_14= '{' ( (lv_hasexportfile_15_0= ruleExportfile ) ) (otherlv_16= ',' ( (lv_hasexportfile_17_0= ruleExportfile ) ) )* otherlv_18= '}' otherlv_19= 'hasmonitor' otherlv_20= '{' ( (lv_hasmonitor_21_0= ruleMonitor ) ) (otherlv_22= ',' ( (lv_hasmonitor_23_0= ruleMonitor ) ) )* otherlv_24= '}' otherlv_25= '}' )
            // InternalGsl.g:1870:3: otherlv_0= 'Output' ( (lv_id_1_0= ruleEInt ) ) otherlv_2= '{' (otherlv_3= 'outputName' ( (lv_outputName_4_0= ruleEString ) ) )? (otherlv_5= 'framerate' ( (lv_framerate_6_0= ruleEString ) ) )? otherlv_7= 'hasdisplays' otherlv_8= '{' ( (lv_hasdisplays_9_0= ruleDisplay ) ) (otherlv_10= ',' ( (lv_hasdisplays_11_0= ruleDisplay ) ) )* otherlv_12= '}' otherlv_13= 'hasexportfile' otherlv_14= '{' ( (lv_hasexportfile_15_0= ruleExportfile ) ) (otherlv_16= ',' ( (lv_hasexportfile_17_0= ruleExportfile ) ) )* otherlv_18= '}' otherlv_19= 'hasmonitor' otherlv_20= '{' ( (lv_hasmonitor_21_0= ruleMonitor ) ) (otherlv_22= ',' ( (lv_hasmonitor_23_0= ruleMonitor ) ) )* otherlv_24= '}' otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
            		
            // InternalGsl.g:1874:3: ( (lv_id_1_0= ruleEInt ) )
            // InternalGsl.g:1875:4: (lv_id_1_0= ruleEInt )
            {
            // InternalGsl.g:1875:4: (lv_id_1_0= ruleEInt )
            // InternalGsl.g:1876:5: lv_id_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getOutputAccess().getIdEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_id_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"com.ktsv.gsl.Gsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGsl.g:1897:3: (otherlv_3= 'outputName' ( (lv_outputName_4_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==55) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGsl.g:1898:4: otherlv_3= 'outputName' ( (lv_outputName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getOutputNameKeyword_3_0());
                    			
                    // InternalGsl.g:1902:4: ( (lv_outputName_4_0= ruleEString ) )
                    // InternalGsl.g:1903:5: (lv_outputName_4_0= ruleEString )
                    {
                    // InternalGsl.g:1903:5: (lv_outputName_4_0= ruleEString )
                    // InternalGsl.g:1904:6: lv_outputName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getOutputNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_outputName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						set(
                    							current,
                    							"outputName",
                    							lv_outputName_4_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:1922:3: (otherlv_5= 'framerate' ( (lv_framerate_6_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==56) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGsl.g:1923:4: otherlv_5= 'framerate' ( (lv_framerate_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,56,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getOutputAccess().getFramerateKeyword_4_0());
                    			
                    // InternalGsl.g:1927:4: ( (lv_framerate_6_0= ruleEString ) )
                    // InternalGsl.g:1928:5: (lv_framerate_6_0= ruleEString )
                    {
                    // InternalGsl.g:1928:5: (lv_framerate_6_0= ruleEString )
                    // InternalGsl.g:1929:6: lv_framerate_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOutputAccess().getFramerateEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_framerate_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOutputRule());
                    						}
                    						set(
                    							current,
                    							"framerate",
                    							lv_framerate_6_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getOutputAccess().getHasdisplaysKeyword_5());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_8, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalGsl.g:1955:3: ( (lv_hasdisplays_9_0= ruleDisplay ) )
            // InternalGsl.g:1956:4: (lv_hasdisplays_9_0= ruleDisplay )
            {
            // InternalGsl.g:1956:4: (lv_hasdisplays_9_0= ruleDisplay )
            // InternalGsl.g:1957:5: lv_hasdisplays_9_0= ruleDisplay
            {

            					newCompositeNode(grammarAccess.getOutputAccess().getHasdisplaysDisplayParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_hasdisplays_9_0=ruleDisplay();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputRule());
            					}
            					add(
            						current,
            						"hasdisplays",
            						lv_hasdisplays_9_0,
            						"com.ktsv.gsl.Gsl.Display");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGsl.g:1974:3: (otherlv_10= ',' ( (lv_hasdisplays_11_0= ruleDisplay ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==19) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGsl.g:1975:4: otherlv_10= ',' ( (lv_hasdisplays_11_0= ruleDisplay ) )
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_52); 

            	    				newLeafNode(otherlv_10, grammarAccess.getOutputAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalGsl.g:1979:4: ( (lv_hasdisplays_11_0= ruleDisplay ) )
            	    // InternalGsl.g:1980:5: (lv_hasdisplays_11_0= ruleDisplay )
            	    {
            	    // InternalGsl.g:1980:5: (lv_hasdisplays_11_0= ruleDisplay )
            	    // InternalGsl.g:1981:6: lv_hasdisplays_11_0= ruleDisplay
            	    {

            	    						newCompositeNode(grammarAccess.getOutputAccess().getHasdisplaysDisplayParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_hasdisplays_11_0=ruleDisplay();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOutputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"hasdisplays",
            	    							lv_hasdisplays_11_0,
            	    							"com.ktsv.gsl.Gsl.Display");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_12=(Token)match(input,20,FOLLOW_53); 

            			newLeafNode(otherlv_12, grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_13=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getOutputAccess().getHasexportfileKeyword_10());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_14, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalGsl.g:2011:3: ( (lv_hasexportfile_15_0= ruleExportfile ) )
            // InternalGsl.g:2012:4: (lv_hasexportfile_15_0= ruleExportfile )
            {
            // InternalGsl.g:2012:4: (lv_hasexportfile_15_0= ruleExportfile )
            // InternalGsl.g:2013:5: lv_hasexportfile_15_0= ruleExportfile
            {

            					newCompositeNode(grammarAccess.getOutputAccess().getHasexportfileExportfileParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_14);
            lv_hasexportfile_15_0=ruleExportfile();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputRule());
            					}
            					add(
            						current,
            						"hasexportfile",
            						lv_hasexportfile_15_0,
            						"com.ktsv.gsl.Gsl.Exportfile");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGsl.g:2030:3: (otherlv_16= ',' ( (lv_hasexportfile_17_0= ruleExportfile ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==19) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGsl.g:2031:4: otherlv_16= ',' ( (lv_hasexportfile_17_0= ruleExportfile ) )
            	    {
            	    otherlv_16=(Token)match(input,19,FOLLOW_54); 

            	    				newLeafNode(otherlv_16, grammarAccess.getOutputAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalGsl.g:2035:4: ( (lv_hasexportfile_17_0= ruleExportfile ) )
            	    // InternalGsl.g:2036:5: (lv_hasexportfile_17_0= ruleExportfile )
            	    {
            	    // InternalGsl.g:2036:5: (lv_hasexportfile_17_0= ruleExportfile )
            	    // InternalGsl.g:2037:6: lv_hasexportfile_17_0= ruleExportfile
            	    {

            	    						newCompositeNode(grammarAccess.getOutputAccess().getHasexportfileExportfileParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_hasexportfile_17_0=ruleExportfile();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOutputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"hasexportfile",
            	    							lv_hasexportfile_17_0,
            	    							"com.ktsv.gsl.Gsl.Exportfile");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_18=(Token)match(input,20,FOLLOW_55); 

            			newLeafNode(otherlv_18, grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_19=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getOutputAccess().getHasmonitorKeyword_15());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_56); 

            			newLeafNode(otherlv_20, grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalGsl.g:2067:3: ( (lv_hasmonitor_21_0= ruleMonitor ) )
            // InternalGsl.g:2068:4: (lv_hasmonitor_21_0= ruleMonitor )
            {
            // InternalGsl.g:2068:4: (lv_hasmonitor_21_0= ruleMonitor )
            // InternalGsl.g:2069:5: lv_hasmonitor_21_0= ruleMonitor
            {

            					newCompositeNode(grammarAccess.getOutputAccess().getHasmonitorMonitorParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_14);
            lv_hasmonitor_21_0=ruleMonitor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOutputRule());
            					}
            					add(
            						current,
            						"hasmonitor",
            						lv_hasmonitor_21_0,
            						"com.ktsv.gsl.Gsl.Monitor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGsl.g:2086:3: (otherlv_22= ',' ( (lv_hasmonitor_23_0= ruleMonitor ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==19) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGsl.g:2087:4: otherlv_22= ',' ( (lv_hasmonitor_23_0= ruleMonitor ) )
            	    {
            	    otherlv_22=(Token)match(input,19,FOLLOW_56); 

            	    				newLeafNode(otherlv_22, grammarAccess.getOutputAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalGsl.g:2091:4: ( (lv_hasmonitor_23_0= ruleMonitor ) )
            	    // InternalGsl.g:2092:5: (lv_hasmonitor_23_0= ruleMonitor )
            	    {
            	    // InternalGsl.g:2092:5: (lv_hasmonitor_23_0= ruleMonitor )
            	    // InternalGsl.g:2093:6: lv_hasmonitor_23_0= ruleMonitor
            	    {

            	    						newCompositeNode(grammarAccess.getOutputAccess().getHasmonitorMonitorParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_hasmonitor_23_0=ruleMonitor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOutputRule());
            	    						}
            	    						add(
            	    							current,
            	    							"hasmonitor",
            	    							lv_hasmonitor_23_0,
            	    							"com.ktsv.gsl.Gsl.Monitor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_24=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_24, grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_19());
            		
            otherlv_25=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_20());
            		

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleDisplay"
    // InternalGsl.g:2123:1: entryRuleDisplay returns [EObject current=null] : iv_ruleDisplay= ruleDisplay EOF ;
    public final EObject entryRuleDisplay() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisplay = null;


        try {
            // InternalGsl.g:2123:48: (iv_ruleDisplay= ruleDisplay EOF )
            // InternalGsl.g:2124:2: iv_ruleDisplay= ruleDisplay EOF
            {
             newCompositeNode(grammarAccess.getDisplayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDisplay=ruleDisplay();

            state._fsp--;

             current =iv_ruleDisplay; 
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
    // $ANTLR end "entryRuleDisplay"


    // $ANTLR start "ruleDisplay"
    // InternalGsl.g:2130:1: ruleDisplay returns [EObject current=null] : (otherlv_0= 'Display' ( (lv_displayName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'displayType' ( (lv_displayType_4_0= ruleEString ) ) )? otherlv_5= 'specieblock' otherlv_6= '{' ( (lv_specieblock_7_0= ruleSpecieBlock ) ) (otherlv_8= ',' ( (lv_specieblock_9_0= ruleSpecieBlock ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleDisplay() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_displayName_1_0 = null;

        AntlrDatatypeRuleToken lv_displayType_4_0 = null;

        EObject lv_specieblock_7_0 = null;

        EObject lv_specieblock_9_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:2136:2: ( (otherlv_0= 'Display' ( (lv_displayName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'displayType' ( (lv_displayType_4_0= ruleEString ) ) )? otherlv_5= 'specieblock' otherlv_6= '{' ( (lv_specieblock_7_0= ruleSpecieBlock ) ) (otherlv_8= ',' ( (lv_specieblock_9_0= ruleSpecieBlock ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalGsl.g:2137:2: (otherlv_0= 'Display' ( (lv_displayName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'displayType' ( (lv_displayType_4_0= ruleEString ) ) )? otherlv_5= 'specieblock' otherlv_6= '{' ( (lv_specieblock_7_0= ruleSpecieBlock ) ) (otherlv_8= ',' ( (lv_specieblock_9_0= ruleSpecieBlock ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalGsl.g:2137:2: (otherlv_0= 'Display' ( (lv_displayName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'displayType' ( (lv_displayType_4_0= ruleEString ) ) )? otherlv_5= 'specieblock' otherlv_6= '{' ( (lv_specieblock_7_0= ruleSpecieBlock ) ) (otherlv_8= ',' ( (lv_specieblock_9_0= ruleSpecieBlock ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalGsl.g:2138:3: otherlv_0= 'Display' ( (lv_displayName_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'displayType' ( (lv_displayType_4_0= ruleEString ) ) )? otherlv_5= 'specieblock' otherlv_6= '{' ( (lv_specieblock_7_0= ruleSpecieBlock ) ) (otherlv_8= ',' ( (lv_specieblock_9_0= ruleSpecieBlock ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDisplayAccess().getDisplayKeyword_0());
            		
            // InternalGsl.g:2142:3: ( (lv_displayName_1_0= ruleEString ) )
            // InternalGsl.g:2143:4: (lv_displayName_1_0= ruleEString )
            {
            // InternalGsl.g:2143:4: (lv_displayName_1_0= ruleEString )
            // InternalGsl.g:2144:5: lv_displayName_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDisplayAccess().getDisplayNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_displayName_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDisplayRule());
            					}
            					set(
            						current,
            						"displayName",
            						lv_displayName_1_0,
            						"com.ktsv.gsl.Gsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getDisplayAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGsl.g:2165:3: (otherlv_3= 'displayType' ( (lv_displayType_4_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==61) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGsl.g:2166:4: otherlv_3= 'displayType' ( (lv_displayType_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getDisplayAccess().getDisplayTypeKeyword_3_0());
                    			
                    // InternalGsl.g:2170:4: ( (lv_displayType_4_0= ruleEString ) )
                    // InternalGsl.g:2171:5: (lv_displayType_4_0= ruleEString )
                    {
                    // InternalGsl.g:2171:5: (lv_displayType_4_0= ruleEString )
                    // InternalGsl.g:2172:6: lv_displayType_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDisplayAccess().getDisplayTypeEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_displayType_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDisplayRule());
                    						}
                    						set(
                    							current,
                    							"displayType",
                    							lv_displayType_4_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDisplayAccess().getSpecieblockKeyword_4());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getDisplayAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGsl.g:2198:3: ( (lv_specieblock_7_0= ruleSpecieBlock ) )
            // InternalGsl.g:2199:4: (lv_specieblock_7_0= ruleSpecieBlock )
            {
            // InternalGsl.g:2199:4: (lv_specieblock_7_0= ruleSpecieBlock )
            // InternalGsl.g:2200:5: lv_specieblock_7_0= ruleSpecieBlock
            {

            					newCompositeNode(grammarAccess.getDisplayAccess().getSpecieblockSpecieBlockParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_specieblock_7_0=ruleSpecieBlock();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDisplayRule());
            					}
            					add(
            						current,
            						"specieblock",
            						lv_specieblock_7_0,
            						"com.ktsv.gsl.Gsl.SpecieBlock");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGsl.g:2217:3: (otherlv_8= ',' ( (lv_specieblock_9_0= ruleSpecieBlock ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==19) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGsl.g:2218:4: otherlv_8= ',' ( (lv_specieblock_9_0= ruleSpecieBlock ) )
            	    {
            	    otherlv_8=(Token)match(input,19,FOLLOW_13); 

            	    				newLeafNode(otherlv_8, grammarAccess.getDisplayAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalGsl.g:2222:4: ( (lv_specieblock_9_0= ruleSpecieBlock ) )
            	    // InternalGsl.g:2223:5: (lv_specieblock_9_0= ruleSpecieBlock )
            	    {
            	    // InternalGsl.g:2223:5: (lv_specieblock_9_0= ruleSpecieBlock )
            	    // InternalGsl.g:2224:6: lv_specieblock_9_0= ruleSpecieBlock
            	    {

            	    						newCompositeNode(grammarAccess.getDisplayAccess().getSpecieblockSpecieBlockParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_specieblock_9_0=ruleSpecieBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDisplayRule());
            	    						}
            	    						add(
            	    							current,
            	    							"specieblock",
            	    							lv_specieblock_9_0,
            	    							"com.ktsv.gsl.Gsl.SpecieBlock");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_10=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getDisplayAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDisplayAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleDisplay"


    // $ANTLR start "entryRuleExportfile"
    // InternalGsl.g:2254:1: entryRuleExportfile returns [EObject current=null] : iv_ruleExportfile= ruleExportfile EOF ;
    public final EObject entryRuleExportfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportfile = null;


        try {
            // InternalGsl.g:2254:51: (iv_ruleExportfile= ruleExportfile EOF )
            // InternalGsl.g:2255:2: iv_ruleExportfile= ruleExportfile EOF
            {
             newCompositeNode(grammarAccess.getExportfileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExportfile=ruleExportfile();

            state._fsp--;

             current =iv_ruleExportfile; 
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
    // $ANTLR end "entryRuleExportfile"


    // $ANTLR start "ruleExportfile"
    // InternalGsl.g:2261:1: ruleExportfile returns [EObject current=null] : ( () otherlv_1= 'Exportfile' otherlv_2= '{' (otherlv_3= 'fileName' ( (lv_fileName_4_0= ruleEString ) ) )? (otherlv_5= 'fileType' ( (lv_fileType_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleExportfile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_fileName_4_0 = null;

        AntlrDatatypeRuleToken lv_fileType_6_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:2267:2: ( ( () otherlv_1= 'Exportfile' otherlv_2= '{' (otherlv_3= 'fileName' ( (lv_fileName_4_0= ruleEString ) ) )? (otherlv_5= 'fileType' ( (lv_fileType_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalGsl.g:2268:2: ( () otherlv_1= 'Exportfile' otherlv_2= '{' (otherlv_3= 'fileName' ( (lv_fileName_4_0= ruleEString ) ) )? (otherlv_5= 'fileType' ( (lv_fileType_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalGsl.g:2268:2: ( () otherlv_1= 'Exportfile' otherlv_2= '{' (otherlv_3= 'fileName' ( (lv_fileName_4_0= ruleEString ) ) )? (otherlv_5= 'fileType' ( (lv_fileType_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalGsl.g:2269:3: () otherlv_1= 'Exportfile' otherlv_2= '{' (otherlv_3= 'fileName' ( (lv_fileName_4_0= ruleEString ) ) )? (otherlv_5= 'fileType' ( (lv_fileType_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalGsl.g:2269:3: ()
            // InternalGsl.g:2270:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExportfileAccess().getExportfileAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getExportfileAccess().getExportfileKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_59); 

            			newLeafNode(otherlv_2, grammarAccess.getExportfileAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGsl.g:2284:3: (otherlv_3= 'fileName' ( (lv_fileName_4_0= ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==64) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGsl.g:2285:4: otherlv_3= 'fileName' ( (lv_fileName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getExportfileAccess().getFileNameKeyword_3_0());
                    			
                    // InternalGsl.g:2289:4: ( (lv_fileName_4_0= ruleEString ) )
                    // InternalGsl.g:2290:5: (lv_fileName_4_0= ruleEString )
                    {
                    // InternalGsl.g:2290:5: (lv_fileName_4_0= ruleEString )
                    // InternalGsl.g:2291:6: lv_fileName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExportfileAccess().getFileNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_fileName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExportfileRule());
                    						}
                    						set(
                    							current,
                    							"fileName",
                    							lv_fileName_4_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGsl.g:2309:3: (otherlv_5= 'fileType' ( (lv_fileType_6_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==65) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGsl.g:2310:4: otherlv_5= 'fileType' ( (lv_fileType_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,65,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getExportfileAccess().getFileTypeKeyword_4_0());
                    			
                    // InternalGsl.g:2314:4: ( (lv_fileType_6_0= ruleEString ) )
                    // InternalGsl.g:2315:5: (lv_fileType_6_0= ruleEString )
                    {
                    // InternalGsl.g:2315:5: (lv_fileType_6_0= ruleEString )
                    // InternalGsl.g:2316:6: lv_fileType_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getExportfileAccess().getFileTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_fileType_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExportfileRule());
                    						}
                    						set(
                    							current,
                    							"fileType",
                    							lv_fileType_6_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExportfileAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleExportfile"


    // $ANTLR start "entryRuleMonitor"
    // InternalGsl.g:2342:1: entryRuleMonitor returns [EObject current=null] : iv_ruleMonitor= ruleMonitor EOF ;
    public final EObject entryRuleMonitor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMonitor = null;


        try {
            // InternalGsl.g:2342:48: (iv_ruleMonitor= ruleMonitor EOF )
            // InternalGsl.g:2343:2: iv_ruleMonitor= ruleMonitor EOF
            {
             newCompositeNode(grammarAccess.getMonitorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMonitor=ruleMonitor();

            state._fsp--;

             current =iv_ruleMonitor; 
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
    // $ANTLR end "entryRuleMonitor"


    // $ANTLR start "ruleMonitor"
    // InternalGsl.g:2349:1: ruleMonitor returns [EObject current=null] : ( () otherlv_1= 'Monitor' ( (lv_label_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetVar' ( (lv_targetVar_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleMonitor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_label_2_0 = null;

        AntlrDatatypeRuleToken lv_targetVar_5_0 = null;



        	enterRule();

        try {
            // InternalGsl.g:2355:2: ( ( () otherlv_1= 'Monitor' ( (lv_label_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetVar' ( (lv_targetVar_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalGsl.g:2356:2: ( () otherlv_1= 'Monitor' ( (lv_label_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetVar' ( (lv_targetVar_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalGsl.g:2356:2: ( () otherlv_1= 'Monitor' ( (lv_label_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetVar' ( (lv_targetVar_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalGsl.g:2357:3: () otherlv_1= 'Monitor' ( (lv_label_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'targetVar' ( (lv_targetVar_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalGsl.g:2357:3: ()
            // InternalGsl.g:2358:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMonitorAccess().getMonitorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMonitorAccess().getMonitorKeyword_1());
            		
            // InternalGsl.g:2368:3: ( (lv_label_2_0= ruleEString ) )
            // InternalGsl.g:2369:4: (lv_label_2_0= ruleEString )
            {
            // InternalGsl.g:2369:4: (lv_label_2_0= ruleEString )
            // InternalGsl.g:2370:5: lv_label_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMonitorAccess().getLabelEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_label_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMonitorRule());
            					}
            					set(
            						current,
            						"label",
            						lv_label_2_0,
            						"com.ktsv.gsl.Gsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getMonitorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGsl.g:2391:3: (otherlv_4= 'targetVar' ( (lv_targetVar_5_0= ruleEString ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==67) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGsl.g:2392:4: otherlv_4= 'targetVar' ( (lv_targetVar_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,67,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getMonitorAccess().getTargetVarKeyword_4_0());
                    			
                    // InternalGsl.g:2396:4: ( (lv_targetVar_5_0= ruleEString ) )
                    // InternalGsl.g:2397:5: (lv_targetVar_5_0= ruleEString )
                    {
                    // InternalGsl.g:2397:5: (lv_targetVar_5_0= ruleEString )
                    // InternalGsl.g:2398:6: lv_targetVar_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMonitorAccess().getTargetVarEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_targetVar_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMonitorRule());
                    						}
                    						set(
                    							current,
                    							"targetVar",
                    							lv_targetVar_5_0,
                    							"com.ktsv.gsl.Gsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMonitorAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMonitor"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001E0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0005880000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010800100000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040800100000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000410800100000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0002100000100000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000100000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008100000100000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000100000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000100000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000003L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000100000L,0x0000000000000008L});

}