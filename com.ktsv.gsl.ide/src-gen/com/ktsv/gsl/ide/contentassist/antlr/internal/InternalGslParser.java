package com.ktsv.gsl.ide.contentassist.antlr.internal;

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
import com.ktsv.gsl.services.GslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'EDate'", "'Gamamodel'", "'{'", "'containsglobal'", "'containsspecie'", "'}'", "'containsexperiment'", "'description'", "'keywords'", "'author'", "'createdOn'", "','", "'GlobalBlock'", "'containsglobalvariable'", "'hasspatialentity'", "'SpecieBlock'", "'containsaction'", "'haspropertie'", "'aspectName'", "'Color'", "'skillofspecie'", "'ExperimentBlock'", "'hasparameter'", "'hasoutput'", "'type'", "'-'", "'GlobalVariable'", "'initValue'", "'SpatialEntity'", "'shapePath'", "'Action'", "'actionName'", "'Propertie'", "'propertieName'", "'ComplexeAction'", "'Reflex'", "'condition'", "'simpleAction'", "'ReturnType'", "'Parameter'", "'targetVariable'", "'Output'", "'hasdisplays'", "'hasexportfile'", "'hasmonitor'", "'outputName'", "'framerate'", "'Display'", "'specieblock'", "'displayType'", "'Exportfile'", "'fileName'", "'fileType'", "'Monitor'", "'targetVar'", "'init'", "'aspectfunction'"
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

    	public void setGrammarAccess(GslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleGamamodel"
    // InternalGsl.g:53:1: entryRuleGamamodel : ruleGamamodel EOF ;
    public final void entryRuleGamamodel() throws RecognitionException {
        try {
            // InternalGsl.g:54:1: ( ruleGamamodel EOF )
            // InternalGsl.g:55:1: ruleGamamodel EOF
            {
             before(grammarAccess.getGamamodelRule()); 
            pushFollow(FOLLOW_1);
            ruleGamamodel();

            state._fsp--;

             after(grammarAccess.getGamamodelRule()); 
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
    // $ANTLR end "entryRuleGamamodel"


    // $ANTLR start "ruleGamamodel"
    // InternalGsl.g:62:1: ruleGamamodel : ( ( rule__Gamamodel__Group__0 ) ) ;
    public final void ruleGamamodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:66:2: ( ( ( rule__Gamamodel__Group__0 ) ) )
            // InternalGsl.g:67:2: ( ( rule__Gamamodel__Group__0 ) )
            {
            // InternalGsl.g:67:2: ( ( rule__Gamamodel__Group__0 ) )
            // InternalGsl.g:68:3: ( rule__Gamamodel__Group__0 )
            {
             before(grammarAccess.getGamamodelAccess().getGroup()); 
            // InternalGsl.g:69:3: ( rule__Gamamodel__Group__0 )
            // InternalGsl.g:69:4: rule__Gamamodel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGamamodelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGamamodel"


    // $ANTLR start "entryRuleAction"
    // InternalGsl.g:78:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalGsl.g:79:1: ( ruleAction EOF )
            // InternalGsl.g:80:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalGsl.g:87:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:91:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalGsl.g:92:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalGsl.g:92:2: ( ( rule__Action__Alternatives ) )
            // InternalGsl.g:93:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalGsl.g:94:3: ( rule__Action__Alternatives )
            // InternalGsl.g:94:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleEString"
    // InternalGsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGsl.g:104:1: ( ruleEString EOF )
            // InternalGsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalGsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalGsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalGsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalGsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalGsl.g:119:3: ( rule__EString__Alternatives )
            // InternalGsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDate"
    // InternalGsl.g:128:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalGsl.g:129:1: ( ruleEDate EOF )
            // InternalGsl.g:130:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalGsl.g:137:1: ruleEDate : ( 'EDate' ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:141:2: ( ( 'EDate' ) )
            // InternalGsl.g:142:2: ( 'EDate' )
            {
            // InternalGsl.g:142:2: ( 'EDate' )
            // InternalGsl.g:143:3: 'EDate'
            {
             before(grammarAccess.getEDateAccess().getEDateKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getEDateKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleGlobalBlock"
    // InternalGsl.g:153:1: entryRuleGlobalBlock : ruleGlobalBlock EOF ;
    public final void entryRuleGlobalBlock() throws RecognitionException {
        try {
            // InternalGsl.g:154:1: ( ruleGlobalBlock EOF )
            // InternalGsl.g:155:1: ruleGlobalBlock EOF
            {
             before(grammarAccess.getGlobalBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalBlock();

            state._fsp--;

             after(grammarAccess.getGlobalBlockRule()); 
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
    // $ANTLR end "entryRuleGlobalBlock"


    // $ANTLR start "ruleGlobalBlock"
    // InternalGsl.g:162:1: ruleGlobalBlock : ( ( rule__GlobalBlock__Group__0 ) ) ;
    public final void ruleGlobalBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:166:2: ( ( ( rule__GlobalBlock__Group__0 ) ) )
            // InternalGsl.g:167:2: ( ( rule__GlobalBlock__Group__0 ) )
            {
            // InternalGsl.g:167:2: ( ( rule__GlobalBlock__Group__0 ) )
            // InternalGsl.g:168:3: ( rule__GlobalBlock__Group__0 )
            {
             before(grammarAccess.getGlobalBlockAccess().getGroup()); 
            // InternalGsl.g:169:3: ( rule__GlobalBlock__Group__0 )
            // InternalGsl.g:169:4: rule__GlobalBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalBlock"


    // $ANTLR start "entryRuleSpecieBlock"
    // InternalGsl.g:178:1: entryRuleSpecieBlock : ruleSpecieBlock EOF ;
    public final void entryRuleSpecieBlock() throws RecognitionException {
        try {
            // InternalGsl.g:179:1: ( ruleSpecieBlock EOF )
            // InternalGsl.g:180:1: ruleSpecieBlock EOF
            {
             before(grammarAccess.getSpecieBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecieBlock();

            state._fsp--;

             after(grammarAccess.getSpecieBlockRule()); 
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
    // $ANTLR end "entryRuleSpecieBlock"


    // $ANTLR start "ruleSpecieBlock"
    // InternalGsl.g:187:1: ruleSpecieBlock : ( ( rule__SpecieBlock__Group__0 ) ) ;
    public final void ruleSpecieBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:191:2: ( ( ( rule__SpecieBlock__Group__0 ) ) )
            // InternalGsl.g:192:2: ( ( rule__SpecieBlock__Group__0 ) )
            {
            // InternalGsl.g:192:2: ( ( rule__SpecieBlock__Group__0 ) )
            // InternalGsl.g:193:3: ( rule__SpecieBlock__Group__0 )
            {
             before(grammarAccess.getSpecieBlockAccess().getGroup()); 
            // InternalGsl.g:194:3: ( rule__SpecieBlock__Group__0 )
            // InternalGsl.g:194:4: rule__SpecieBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecieBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecieBlock"


    // $ANTLR start "entryRuleExperimentBlock"
    // InternalGsl.g:203:1: entryRuleExperimentBlock : ruleExperimentBlock EOF ;
    public final void entryRuleExperimentBlock() throws RecognitionException {
        try {
            // InternalGsl.g:204:1: ( ruleExperimentBlock EOF )
            // InternalGsl.g:205:1: ruleExperimentBlock EOF
            {
             before(grammarAccess.getExperimentBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleExperimentBlock();

            state._fsp--;

             after(grammarAccess.getExperimentBlockRule()); 
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
    // $ANTLR end "entryRuleExperimentBlock"


    // $ANTLR start "ruleExperimentBlock"
    // InternalGsl.g:212:1: ruleExperimentBlock : ( ( rule__ExperimentBlock__Group__0 ) ) ;
    public final void ruleExperimentBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:216:2: ( ( ( rule__ExperimentBlock__Group__0 ) ) )
            // InternalGsl.g:217:2: ( ( rule__ExperimentBlock__Group__0 ) )
            {
            // InternalGsl.g:217:2: ( ( rule__ExperimentBlock__Group__0 ) )
            // InternalGsl.g:218:3: ( rule__ExperimentBlock__Group__0 )
            {
             before(grammarAccess.getExperimentBlockAccess().getGroup()); 
            // InternalGsl.g:219:3: ( rule__ExperimentBlock__Group__0 )
            // InternalGsl.g:219:4: rule__ExperimentBlock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExperimentBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExperimentBlock"


    // $ANTLR start "entryRuleEInt"
    // InternalGsl.g:228:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalGsl.g:229:1: ( ruleEInt EOF )
            // InternalGsl.g:230:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalGsl.g:237:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:241:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalGsl.g:242:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalGsl.g:242:2: ( ( rule__EInt__Group__0 ) )
            // InternalGsl.g:243:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalGsl.g:244:3: ( rule__EInt__Group__0 )
            // InternalGsl.g:244:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleGlobalVariable"
    // InternalGsl.g:253:1: entryRuleGlobalVariable : ruleGlobalVariable EOF ;
    public final void entryRuleGlobalVariable() throws RecognitionException {
        try {
            // InternalGsl.g:254:1: ( ruleGlobalVariable EOF )
            // InternalGsl.g:255:1: ruleGlobalVariable EOF
            {
             before(grammarAccess.getGlobalVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalVariable();

            state._fsp--;

             after(grammarAccess.getGlobalVariableRule()); 
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
    // $ANTLR end "entryRuleGlobalVariable"


    // $ANTLR start "ruleGlobalVariable"
    // InternalGsl.g:262:1: ruleGlobalVariable : ( ( rule__GlobalVariable__Group__0 ) ) ;
    public final void ruleGlobalVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:266:2: ( ( ( rule__GlobalVariable__Group__0 ) ) )
            // InternalGsl.g:267:2: ( ( rule__GlobalVariable__Group__0 ) )
            {
            // InternalGsl.g:267:2: ( ( rule__GlobalVariable__Group__0 ) )
            // InternalGsl.g:268:3: ( rule__GlobalVariable__Group__0 )
            {
             before(grammarAccess.getGlobalVariableAccess().getGroup()); 
            // InternalGsl.g:269:3: ( rule__GlobalVariable__Group__0 )
            // InternalGsl.g:269:4: rule__GlobalVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalVariable"


    // $ANTLR start "entryRuleSpatialEntity"
    // InternalGsl.g:278:1: entryRuleSpatialEntity : ruleSpatialEntity EOF ;
    public final void entryRuleSpatialEntity() throws RecognitionException {
        try {
            // InternalGsl.g:279:1: ( ruleSpatialEntity EOF )
            // InternalGsl.g:280:1: ruleSpatialEntity EOF
            {
             before(grammarAccess.getSpatialEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleSpatialEntity();

            state._fsp--;

             after(grammarAccess.getSpatialEntityRule()); 
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
    // $ANTLR end "entryRuleSpatialEntity"


    // $ANTLR start "ruleSpatialEntity"
    // InternalGsl.g:287:1: ruleSpatialEntity : ( ( rule__SpatialEntity__Group__0 ) ) ;
    public final void ruleSpatialEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:291:2: ( ( ( rule__SpatialEntity__Group__0 ) ) )
            // InternalGsl.g:292:2: ( ( rule__SpatialEntity__Group__0 ) )
            {
            // InternalGsl.g:292:2: ( ( rule__SpatialEntity__Group__0 ) )
            // InternalGsl.g:293:3: ( rule__SpatialEntity__Group__0 )
            {
             before(grammarAccess.getSpatialEntityAccess().getGroup()); 
            // InternalGsl.g:294:3: ( rule__SpatialEntity__Group__0 )
            // InternalGsl.g:294:4: rule__SpatialEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SpatialEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpatialEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpatialEntity"


    // $ANTLR start "entryRuleAction_Impl"
    // InternalGsl.g:303:1: entryRuleAction_Impl : ruleAction_Impl EOF ;
    public final void entryRuleAction_Impl() throws RecognitionException {
        try {
            // InternalGsl.g:304:1: ( ruleAction_Impl EOF )
            // InternalGsl.g:305:1: ruleAction_Impl EOF
            {
             before(grammarAccess.getAction_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleAction_Impl();

            state._fsp--;

             after(grammarAccess.getAction_ImplRule()); 
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
    // $ANTLR end "entryRuleAction_Impl"


    // $ANTLR start "ruleAction_Impl"
    // InternalGsl.g:312:1: ruleAction_Impl : ( ( rule__Action_Impl__Group__0 ) ) ;
    public final void ruleAction_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:316:2: ( ( ( rule__Action_Impl__Group__0 ) ) )
            // InternalGsl.g:317:2: ( ( rule__Action_Impl__Group__0 ) )
            {
            // InternalGsl.g:317:2: ( ( rule__Action_Impl__Group__0 ) )
            // InternalGsl.g:318:3: ( rule__Action_Impl__Group__0 )
            {
             before(grammarAccess.getAction_ImplAccess().getGroup()); 
            // InternalGsl.g:319:3: ( rule__Action_Impl__Group__0 )
            // InternalGsl.g:319:4: rule__Action_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAction_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction_Impl"


    // $ANTLR start "entryRulePropertie"
    // InternalGsl.g:328:1: entryRulePropertie : rulePropertie EOF ;
    public final void entryRulePropertie() throws RecognitionException {
        try {
            // InternalGsl.g:329:1: ( rulePropertie EOF )
            // InternalGsl.g:330:1: rulePropertie EOF
            {
             before(grammarAccess.getPropertieRule()); 
            pushFollow(FOLLOW_1);
            rulePropertie();

            state._fsp--;

             after(grammarAccess.getPropertieRule()); 
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
    // $ANTLR end "entryRulePropertie"


    // $ANTLR start "rulePropertie"
    // InternalGsl.g:337:1: rulePropertie : ( ( rule__Propertie__Group__0 ) ) ;
    public final void rulePropertie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:341:2: ( ( ( rule__Propertie__Group__0 ) ) )
            // InternalGsl.g:342:2: ( ( rule__Propertie__Group__0 ) )
            {
            // InternalGsl.g:342:2: ( ( rule__Propertie__Group__0 ) )
            // InternalGsl.g:343:3: ( rule__Propertie__Group__0 )
            {
             before(grammarAccess.getPropertieAccess().getGroup()); 
            // InternalGsl.g:344:3: ( rule__Propertie__Group__0 )
            // InternalGsl.g:344:4: rule__Propertie__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Propertie__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertieAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertie"


    // $ANTLR start "entryRuleComplexeAction"
    // InternalGsl.g:353:1: entryRuleComplexeAction : ruleComplexeAction EOF ;
    public final void entryRuleComplexeAction() throws RecognitionException {
        try {
            // InternalGsl.g:354:1: ( ruleComplexeAction EOF )
            // InternalGsl.g:355:1: ruleComplexeAction EOF
            {
             before(grammarAccess.getComplexeActionRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexeAction();

            state._fsp--;

             after(grammarAccess.getComplexeActionRule()); 
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
    // $ANTLR end "entryRuleComplexeAction"


    // $ANTLR start "ruleComplexeAction"
    // InternalGsl.g:362:1: ruleComplexeAction : ( ( rule__ComplexeAction__Group__0 ) ) ;
    public final void ruleComplexeAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:366:2: ( ( ( rule__ComplexeAction__Group__0 ) ) )
            // InternalGsl.g:367:2: ( ( rule__ComplexeAction__Group__0 ) )
            {
            // InternalGsl.g:367:2: ( ( rule__ComplexeAction__Group__0 ) )
            // InternalGsl.g:368:3: ( rule__ComplexeAction__Group__0 )
            {
             before(grammarAccess.getComplexeActionAccess().getGroup()); 
            // InternalGsl.g:369:3: ( rule__ComplexeAction__Group__0 )
            // InternalGsl.g:369:4: rule__ComplexeAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexeAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexeActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexeAction"


    // $ANTLR start "entryRuleReflex"
    // InternalGsl.g:378:1: entryRuleReflex : ruleReflex EOF ;
    public final void entryRuleReflex() throws RecognitionException {
        try {
            // InternalGsl.g:379:1: ( ruleReflex EOF )
            // InternalGsl.g:380:1: ruleReflex EOF
            {
             before(grammarAccess.getReflexRule()); 
            pushFollow(FOLLOW_1);
            ruleReflex();

            state._fsp--;

             after(grammarAccess.getReflexRule()); 
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
    // $ANTLR end "entryRuleReflex"


    // $ANTLR start "ruleReflex"
    // InternalGsl.g:387:1: ruleReflex : ( ( rule__Reflex__Group__0 ) ) ;
    public final void ruleReflex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:391:2: ( ( ( rule__Reflex__Group__0 ) ) )
            // InternalGsl.g:392:2: ( ( rule__Reflex__Group__0 ) )
            {
            // InternalGsl.g:392:2: ( ( rule__Reflex__Group__0 ) )
            // InternalGsl.g:393:3: ( rule__Reflex__Group__0 )
            {
             before(grammarAccess.getReflexAccess().getGroup()); 
            // InternalGsl.g:394:3: ( rule__Reflex__Group__0 )
            // InternalGsl.g:394:4: rule__Reflex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reflex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReflexAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReflex"


    // $ANTLR start "entryRulesimpleAction"
    // InternalGsl.g:403:1: entryRulesimpleAction : rulesimpleAction EOF ;
    public final void entryRulesimpleAction() throws RecognitionException {
        try {
            // InternalGsl.g:404:1: ( rulesimpleAction EOF )
            // InternalGsl.g:405:1: rulesimpleAction EOF
            {
             before(grammarAccess.getSimpleActionRule()); 
            pushFollow(FOLLOW_1);
            rulesimpleAction();

            state._fsp--;

             after(grammarAccess.getSimpleActionRule()); 
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
    // $ANTLR end "entryRulesimpleAction"


    // $ANTLR start "rulesimpleAction"
    // InternalGsl.g:412:1: rulesimpleAction : ( ( rule__SimpleAction__Group__0 ) ) ;
    public final void rulesimpleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:416:2: ( ( ( rule__SimpleAction__Group__0 ) ) )
            // InternalGsl.g:417:2: ( ( rule__SimpleAction__Group__0 ) )
            {
            // InternalGsl.g:417:2: ( ( rule__SimpleAction__Group__0 ) )
            // InternalGsl.g:418:3: ( rule__SimpleAction__Group__0 )
            {
             before(grammarAccess.getSimpleActionAccess().getGroup()); 
            // InternalGsl.g:419:3: ( rule__SimpleAction__Group__0 )
            // InternalGsl.g:419:4: rule__SimpleAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesimpleAction"


    // $ANTLR start "entryRuleParameter"
    // InternalGsl.g:428:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalGsl.g:429:1: ( ruleParameter EOF )
            // InternalGsl.g:430:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalGsl.g:437:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:441:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalGsl.g:442:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalGsl.g:442:2: ( ( rule__Parameter__Group__0 ) )
            // InternalGsl.g:443:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalGsl.g:444:3: ( rule__Parameter__Group__0 )
            // InternalGsl.g:444:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleOutput"
    // InternalGsl.g:453:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalGsl.g:454:1: ( ruleOutput EOF )
            // InternalGsl.g:455:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalGsl.g:462:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:466:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalGsl.g:467:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalGsl.g:467:2: ( ( rule__Output__Group__0 ) )
            // InternalGsl.g:468:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalGsl.g:469:3: ( rule__Output__Group__0 )
            // InternalGsl.g:469:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleDisplay"
    // InternalGsl.g:478:1: entryRuleDisplay : ruleDisplay EOF ;
    public final void entryRuleDisplay() throws RecognitionException {
        try {
            // InternalGsl.g:479:1: ( ruleDisplay EOF )
            // InternalGsl.g:480:1: ruleDisplay EOF
            {
             before(grammarAccess.getDisplayRule()); 
            pushFollow(FOLLOW_1);
            ruleDisplay();

            state._fsp--;

             after(grammarAccess.getDisplayRule()); 
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
    // $ANTLR end "entryRuleDisplay"


    // $ANTLR start "ruleDisplay"
    // InternalGsl.g:487:1: ruleDisplay : ( ( rule__Display__Group__0 ) ) ;
    public final void ruleDisplay() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:491:2: ( ( ( rule__Display__Group__0 ) ) )
            // InternalGsl.g:492:2: ( ( rule__Display__Group__0 ) )
            {
            // InternalGsl.g:492:2: ( ( rule__Display__Group__0 ) )
            // InternalGsl.g:493:3: ( rule__Display__Group__0 )
            {
             before(grammarAccess.getDisplayAccess().getGroup()); 
            // InternalGsl.g:494:3: ( rule__Display__Group__0 )
            // InternalGsl.g:494:4: rule__Display__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Display__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisplayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisplay"


    // $ANTLR start "entryRuleExportfile"
    // InternalGsl.g:503:1: entryRuleExportfile : ruleExportfile EOF ;
    public final void entryRuleExportfile() throws RecognitionException {
        try {
            // InternalGsl.g:504:1: ( ruleExportfile EOF )
            // InternalGsl.g:505:1: ruleExportfile EOF
            {
             before(grammarAccess.getExportfileRule()); 
            pushFollow(FOLLOW_1);
            ruleExportfile();

            state._fsp--;

             after(grammarAccess.getExportfileRule()); 
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
    // $ANTLR end "entryRuleExportfile"


    // $ANTLR start "ruleExportfile"
    // InternalGsl.g:512:1: ruleExportfile : ( ( rule__Exportfile__Group__0 ) ) ;
    public final void ruleExportfile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:516:2: ( ( ( rule__Exportfile__Group__0 ) ) )
            // InternalGsl.g:517:2: ( ( rule__Exportfile__Group__0 ) )
            {
            // InternalGsl.g:517:2: ( ( rule__Exportfile__Group__0 ) )
            // InternalGsl.g:518:3: ( rule__Exportfile__Group__0 )
            {
             before(grammarAccess.getExportfileAccess().getGroup()); 
            // InternalGsl.g:519:3: ( rule__Exportfile__Group__0 )
            // InternalGsl.g:519:4: rule__Exportfile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exportfile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExportfileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExportfile"


    // $ANTLR start "entryRuleMonitor"
    // InternalGsl.g:528:1: entryRuleMonitor : ruleMonitor EOF ;
    public final void entryRuleMonitor() throws RecognitionException {
        try {
            // InternalGsl.g:529:1: ( ruleMonitor EOF )
            // InternalGsl.g:530:1: ruleMonitor EOF
            {
             before(grammarAccess.getMonitorRule()); 
            pushFollow(FOLLOW_1);
            ruleMonitor();

            state._fsp--;

             after(grammarAccess.getMonitorRule()); 
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
    // $ANTLR end "entryRuleMonitor"


    // $ANTLR start "ruleMonitor"
    // InternalGsl.g:537:1: ruleMonitor : ( ( rule__Monitor__Group__0 ) ) ;
    public final void ruleMonitor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:541:2: ( ( ( rule__Monitor__Group__0 ) ) )
            // InternalGsl.g:542:2: ( ( rule__Monitor__Group__0 ) )
            {
            // InternalGsl.g:542:2: ( ( rule__Monitor__Group__0 ) )
            // InternalGsl.g:543:3: ( rule__Monitor__Group__0 )
            {
             before(grammarAccess.getMonitorAccess().getGroup()); 
            // InternalGsl.g:544:3: ( rule__Monitor__Group__0 )
            // InternalGsl.g:544:4: rule__Monitor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Monitor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMonitorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonitor"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalGsl.g:552:1: rule__Action__Alternatives : ( ( ruleAction_Impl ) | ( ruleComplexeAction ) | ( ruleReflex ) | ( rulesimpleAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:556:1: ( ( ruleAction_Impl ) | ( ruleComplexeAction ) | ( ruleReflex ) | ( rulesimpleAction ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt1=1;
                }
                break;
            case 45:
                {
                alt1=2;
                }
                break;
            case 46:
                {
                alt1=3;
                }
                break;
            case 48:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGsl.g:557:2: ( ruleAction_Impl )
                    {
                    // InternalGsl.g:557:2: ( ruleAction_Impl )
                    // InternalGsl.g:558:3: ruleAction_Impl
                    {
                     before(grammarAccess.getActionAccess().getAction_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAction_Impl();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getAction_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGsl.g:563:2: ( ruleComplexeAction )
                    {
                    // InternalGsl.g:563:2: ( ruleComplexeAction )
                    // InternalGsl.g:564:3: ruleComplexeAction
                    {
                     before(grammarAccess.getActionAccess().getComplexeActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComplexeAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getComplexeActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGsl.g:569:2: ( ruleReflex )
                    {
                    // InternalGsl.g:569:2: ( ruleReflex )
                    // InternalGsl.g:570:3: ruleReflex
                    {
                     before(grammarAccess.getActionAccess().getReflexParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleReflex();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getReflexParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGsl.g:575:2: ( rulesimpleAction )
                    {
                    // InternalGsl.g:575:2: ( rulesimpleAction )
                    // InternalGsl.g:576:3: rulesimpleAction
                    {
                     before(grammarAccess.getActionAccess().getSimpleActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulesimpleAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getSimpleActionParserRuleCall_3()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalGsl.g:585:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:589:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGsl.g:590:2: ( RULE_STRING )
                    {
                    // InternalGsl.g:590:2: ( RULE_STRING )
                    // InternalGsl.g:591:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGsl.g:596:2: ( RULE_ID )
                    {
                    // InternalGsl.g:596:2: ( RULE_ID )
                    // InternalGsl.g:597:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Gamamodel__Group__0"
    // InternalGsl.g:606:1: rule__Gamamodel__Group__0 : rule__Gamamodel__Group__0__Impl rule__Gamamodel__Group__1 ;
    public final void rule__Gamamodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:610:1: ( rule__Gamamodel__Group__0__Impl rule__Gamamodel__Group__1 )
            // InternalGsl.g:611:2: rule__Gamamodel__Group__0__Impl rule__Gamamodel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Gamamodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__1();

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
    // $ANTLR end "rule__Gamamodel__Group__0"


    // $ANTLR start "rule__Gamamodel__Group__0__Impl"
    // InternalGsl.g:618:1: rule__Gamamodel__Group__0__Impl : ( 'Gamamodel' ) ;
    public final void rule__Gamamodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:622:1: ( ( 'Gamamodel' ) )
            // InternalGsl.g:623:1: ( 'Gamamodel' )
            {
            // InternalGsl.g:623:1: ( 'Gamamodel' )
            // InternalGsl.g:624:2: 'Gamamodel'
            {
             before(grammarAccess.getGamamodelAccess().getGamamodelKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getGamamodelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__0__Impl"


    // $ANTLR start "rule__Gamamodel__Group__1"
    // InternalGsl.g:633:1: rule__Gamamodel__Group__1 : rule__Gamamodel__Group__1__Impl rule__Gamamodel__Group__2 ;
    public final void rule__Gamamodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:637:1: ( rule__Gamamodel__Group__1__Impl rule__Gamamodel__Group__2 )
            // InternalGsl.g:638:2: rule__Gamamodel__Group__1__Impl rule__Gamamodel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Gamamodel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__2();

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
    // $ANTLR end "rule__Gamamodel__Group__1"


    // $ANTLR start "rule__Gamamodel__Group__1__Impl"
    // InternalGsl.g:645:1: rule__Gamamodel__Group__1__Impl : ( '{' ) ;
    public final void rule__Gamamodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:649:1: ( ( '{' ) )
            // InternalGsl.g:650:1: ( '{' )
            {
            // InternalGsl.g:650:1: ( '{' )
            // InternalGsl.g:651:2: '{'
            {
             before(grammarAccess.getGamamodelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__1__Impl"


    // $ANTLR start "rule__Gamamodel__Group__2"
    // InternalGsl.g:660:1: rule__Gamamodel__Group__2 : rule__Gamamodel__Group__2__Impl rule__Gamamodel__Group__3 ;
    public final void rule__Gamamodel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:664:1: ( rule__Gamamodel__Group__2__Impl rule__Gamamodel__Group__3 )
            // InternalGsl.g:665:2: rule__Gamamodel__Group__2__Impl rule__Gamamodel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Gamamodel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__3();

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
    // $ANTLR end "rule__Gamamodel__Group__2"


    // $ANTLR start "rule__Gamamodel__Group__2__Impl"
    // InternalGsl.g:672:1: rule__Gamamodel__Group__2__Impl : ( ( rule__Gamamodel__Group_2__0 )? ) ;
    public final void rule__Gamamodel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:676:1: ( ( ( rule__Gamamodel__Group_2__0 )? ) )
            // InternalGsl.g:677:1: ( ( rule__Gamamodel__Group_2__0 )? )
            {
            // InternalGsl.g:677:1: ( ( rule__Gamamodel__Group_2__0 )? )
            // InternalGsl.g:678:2: ( rule__Gamamodel__Group_2__0 )?
            {
             before(grammarAccess.getGamamodelAccess().getGroup_2()); 
            // InternalGsl.g:679:2: ( rule__Gamamodel__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGsl.g:679:3: rule__Gamamodel__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gamamodel__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGamamodelAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__2__Impl"


    // $ANTLR start "rule__Gamamodel__Group__3"
    // InternalGsl.g:687:1: rule__Gamamodel__Group__3 : rule__Gamamodel__Group__3__Impl rule__Gamamodel__Group__4 ;
    public final void rule__Gamamodel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:691:1: ( rule__Gamamodel__Group__3__Impl rule__Gamamodel__Group__4 )
            // InternalGsl.g:692:2: rule__Gamamodel__Group__3__Impl rule__Gamamodel__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Gamamodel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__4();

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
    // $ANTLR end "rule__Gamamodel__Group__3"


    // $ANTLR start "rule__Gamamodel__Group__3__Impl"
    // InternalGsl.g:699:1: rule__Gamamodel__Group__3__Impl : ( ( rule__Gamamodel__Group_3__0 )? ) ;
    public final void rule__Gamamodel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:703:1: ( ( ( rule__Gamamodel__Group_3__0 )? ) )
            // InternalGsl.g:704:1: ( ( rule__Gamamodel__Group_3__0 )? )
            {
            // InternalGsl.g:704:1: ( ( rule__Gamamodel__Group_3__0 )? )
            // InternalGsl.g:705:2: ( rule__Gamamodel__Group_3__0 )?
            {
             before(grammarAccess.getGamamodelAccess().getGroup_3()); 
            // InternalGsl.g:706:2: ( rule__Gamamodel__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGsl.g:706:3: rule__Gamamodel__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gamamodel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGamamodelAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__3__Impl"


    // $ANTLR start "rule__Gamamodel__Group__4"
    // InternalGsl.g:714:1: rule__Gamamodel__Group__4 : rule__Gamamodel__Group__4__Impl rule__Gamamodel__Group__5 ;
    public final void rule__Gamamodel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:718:1: ( rule__Gamamodel__Group__4__Impl rule__Gamamodel__Group__5 )
            // InternalGsl.g:719:2: rule__Gamamodel__Group__4__Impl rule__Gamamodel__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Gamamodel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__5();

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
    // $ANTLR end "rule__Gamamodel__Group__4"


    // $ANTLR start "rule__Gamamodel__Group__4__Impl"
    // InternalGsl.g:726:1: rule__Gamamodel__Group__4__Impl : ( ( rule__Gamamodel__Group_4__0 )? ) ;
    public final void rule__Gamamodel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:730:1: ( ( ( rule__Gamamodel__Group_4__0 )? ) )
            // InternalGsl.g:731:1: ( ( rule__Gamamodel__Group_4__0 )? )
            {
            // InternalGsl.g:731:1: ( ( rule__Gamamodel__Group_4__0 )? )
            // InternalGsl.g:732:2: ( rule__Gamamodel__Group_4__0 )?
            {
             before(grammarAccess.getGamamodelAccess().getGroup_4()); 
            // InternalGsl.g:733:2: ( rule__Gamamodel__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGsl.g:733:3: rule__Gamamodel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gamamodel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGamamodelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__4__Impl"


    // $ANTLR start "rule__Gamamodel__Group__5"
    // InternalGsl.g:741:1: rule__Gamamodel__Group__5 : rule__Gamamodel__Group__5__Impl rule__Gamamodel__Group__6 ;
    public final void rule__Gamamodel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:745:1: ( rule__Gamamodel__Group__5__Impl rule__Gamamodel__Group__6 )
            // InternalGsl.g:746:2: rule__Gamamodel__Group__5__Impl rule__Gamamodel__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Gamamodel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__6();

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
    // $ANTLR end "rule__Gamamodel__Group__5"


    // $ANTLR start "rule__Gamamodel__Group__5__Impl"
    // InternalGsl.g:753:1: rule__Gamamodel__Group__5__Impl : ( ( rule__Gamamodel__Group_5__0 )? ) ;
    public final void rule__Gamamodel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:757:1: ( ( ( rule__Gamamodel__Group_5__0 )? ) )
            // InternalGsl.g:758:1: ( ( rule__Gamamodel__Group_5__0 )? )
            {
            // InternalGsl.g:758:1: ( ( rule__Gamamodel__Group_5__0 )? )
            // InternalGsl.g:759:2: ( rule__Gamamodel__Group_5__0 )?
            {
             before(grammarAccess.getGamamodelAccess().getGroup_5()); 
            // InternalGsl.g:760:2: ( rule__Gamamodel__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGsl.g:760:3: rule__Gamamodel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gamamodel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGamamodelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__5__Impl"


    // $ANTLR start "rule__Gamamodel__Group__6"
    // InternalGsl.g:768:1: rule__Gamamodel__Group__6 : rule__Gamamodel__Group__6__Impl rule__Gamamodel__Group__7 ;
    public final void rule__Gamamodel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:772:1: ( rule__Gamamodel__Group__6__Impl rule__Gamamodel__Group__7 )
            // InternalGsl.g:773:2: rule__Gamamodel__Group__6__Impl rule__Gamamodel__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Gamamodel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__7();

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
    // $ANTLR end "rule__Gamamodel__Group__6"


    // $ANTLR start "rule__Gamamodel__Group__6__Impl"
    // InternalGsl.g:780:1: rule__Gamamodel__Group__6__Impl : ( 'containsglobal' ) ;
    public final void rule__Gamamodel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:784:1: ( ( 'containsglobal' ) )
            // InternalGsl.g:785:1: ( 'containsglobal' )
            {
            // InternalGsl.g:785:1: ( 'containsglobal' )
            // InternalGsl.g:786:2: 'containsglobal'
            {
             before(grammarAccess.getGamamodelAccess().getContainsglobalKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getContainsglobalKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__6__Impl"


    // $ANTLR start "rule__Gamamodel__Group__7"
    // InternalGsl.g:795:1: rule__Gamamodel__Group__7 : rule__Gamamodel__Group__7__Impl rule__Gamamodel__Group__8 ;
    public final void rule__Gamamodel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:799:1: ( rule__Gamamodel__Group__7__Impl rule__Gamamodel__Group__8 )
            // InternalGsl.g:800:2: rule__Gamamodel__Group__7__Impl rule__Gamamodel__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Gamamodel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__8();

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
    // $ANTLR end "rule__Gamamodel__Group__7"


    // $ANTLR start "rule__Gamamodel__Group__7__Impl"
    // InternalGsl.g:807:1: rule__Gamamodel__Group__7__Impl : ( ( rule__Gamamodel__ContainsglobalAssignment_7 ) ) ;
    public final void rule__Gamamodel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:811:1: ( ( ( rule__Gamamodel__ContainsglobalAssignment_7 ) ) )
            // InternalGsl.g:812:1: ( ( rule__Gamamodel__ContainsglobalAssignment_7 ) )
            {
            // InternalGsl.g:812:1: ( ( rule__Gamamodel__ContainsglobalAssignment_7 ) )
            // InternalGsl.g:813:2: ( rule__Gamamodel__ContainsglobalAssignment_7 )
            {
             before(grammarAccess.getGamamodelAccess().getContainsglobalAssignment_7()); 
            // InternalGsl.g:814:2: ( rule__Gamamodel__ContainsglobalAssignment_7 )
            // InternalGsl.g:814:3: rule__Gamamodel__ContainsglobalAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__ContainsglobalAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getGamamodelAccess().getContainsglobalAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__7__Impl"


    // $ANTLR start "rule__Gamamodel__Group__8"
    // InternalGsl.g:822:1: rule__Gamamodel__Group__8 : rule__Gamamodel__Group__8__Impl rule__Gamamodel__Group__9 ;
    public final void rule__Gamamodel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:826:1: ( rule__Gamamodel__Group__8__Impl rule__Gamamodel__Group__9 )
            // InternalGsl.g:827:2: rule__Gamamodel__Group__8__Impl rule__Gamamodel__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Gamamodel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__9();

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
    // $ANTLR end "rule__Gamamodel__Group__8"


    // $ANTLR start "rule__Gamamodel__Group__8__Impl"
    // InternalGsl.g:834:1: rule__Gamamodel__Group__8__Impl : ( 'containsspecie' ) ;
    public final void rule__Gamamodel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:838:1: ( ( 'containsspecie' ) )
            // InternalGsl.g:839:1: ( 'containsspecie' )
            {
            // InternalGsl.g:839:1: ( 'containsspecie' )
            // InternalGsl.g:840:2: 'containsspecie'
            {
             before(grammarAccess.getGamamodelAccess().getContainsspecieKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getContainsspecieKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__8__Impl"


    // $ANTLR start "rule__Gamamodel__Group__9"
    // InternalGsl.g:849:1: rule__Gamamodel__Group__9 : rule__Gamamodel__Group__9__Impl rule__Gamamodel__Group__10 ;
    public final void rule__Gamamodel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:853:1: ( rule__Gamamodel__Group__9__Impl rule__Gamamodel__Group__10 )
            // InternalGsl.g:854:2: rule__Gamamodel__Group__9__Impl rule__Gamamodel__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Gamamodel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__10();

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
    // $ANTLR end "rule__Gamamodel__Group__9"


    // $ANTLR start "rule__Gamamodel__Group__9__Impl"
    // InternalGsl.g:861:1: rule__Gamamodel__Group__9__Impl : ( '{' ) ;
    public final void rule__Gamamodel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:865:1: ( ( '{' ) )
            // InternalGsl.g:866:1: ( '{' )
            {
            // InternalGsl.g:866:1: ( '{' )
            // InternalGsl.g:867:2: '{'
            {
             before(grammarAccess.getGamamodelAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__9__Impl"


    // $ANTLR start "rule__Gamamodel__Group__10"
    // InternalGsl.g:876:1: rule__Gamamodel__Group__10 : rule__Gamamodel__Group__10__Impl rule__Gamamodel__Group__11 ;
    public final void rule__Gamamodel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:880:1: ( rule__Gamamodel__Group__10__Impl rule__Gamamodel__Group__11 )
            // InternalGsl.g:881:2: rule__Gamamodel__Group__10__Impl rule__Gamamodel__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__Gamamodel__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__11();

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
    // $ANTLR end "rule__Gamamodel__Group__10"


    // $ANTLR start "rule__Gamamodel__Group__10__Impl"
    // InternalGsl.g:888:1: rule__Gamamodel__Group__10__Impl : ( ( rule__Gamamodel__ContainsspecieAssignment_10 ) ) ;
    public final void rule__Gamamodel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:892:1: ( ( ( rule__Gamamodel__ContainsspecieAssignment_10 ) ) )
            // InternalGsl.g:893:1: ( ( rule__Gamamodel__ContainsspecieAssignment_10 ) )
            {
            // InternalGsl.g:893:1: ( ( rule__Gamamodel__ContainsspecieAssignment_10 ) )
            // InternalGsl.g:894:2: ( rule__Gamamodel__ContainsspecieAssignment_10 )
            {
             before(grammarAccess.getGamamodelAccess().getContainsspecieAssignment_10()); 
            // InternalGsl.g:895:2: ( rule__Gamamodel__ContainsspecieAssignment_10 )
            // InternalGsl.g:895:3: rule__Gamamodel__ContainsspecieAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__ContainsspecieAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getGamamodelAccess().getContainsspecieAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__10__Impl"


    // $ANTLR start "rule__Gamamodel__Group__11"
    // InternalGsl.g:903:1: rule__Gamamodel__Group__11 : rule__Gamamodel__Group__11__Impl rule__Gamamodel__Group__12 ;
    public final void rule__Gamamodel__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:907:1: ( rule__Gamamodel__Group__11__Impl rule__Gamamodel__Group__12 )
            // InternalGsl.g:908:2: rule__Gamamodel__Group__11__Impl rule__Gamamodel__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Gamamodel__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__12();

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
    // $ANTLR end "rule__Gamamodel__Group__11"


    // $ANTLR start "rule__Gamamodel__Group__11__Impl"
    // InternalGsl.g:915:1: rule__Gamamodel__Group__11__Impl : ( ( rule__Gamamodel__Group_11__0 )* ) ;
    public final void rule__Gamamodel__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:919:1: ( ( ( rule__Gamamodel__Group_11__0 )* ) )
            // InternalGsl.g:920:1: ( ( rule__Gamamodel__Group_11__0 )* )
            {
            // InternalGsl.g:920:1: ( ( rule__Gamamodel__Group_11__0 )* )
            // InternalGsl.g:921:2: ( rule__Gamamodel__Group_11__0 )*
            {
             before(grammarAccess.getGamamodelAccess().getGroup_11()); 
            // InternalGsl.g:922:2: ( rule__Gamamodel__Group_11__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGsl.g:922:3: rule__Gamamodel__Group_11__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Gamamodel__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getGamamodelAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__11__Impl"


    // $ANTLR start "rule__Gamamodel__Group__12"
    // InternalGsl.g:930:1: rule__Gamamodel__Group__12 : rule__Gamamodel__Group__12__Impl rule__Gamamodel__Group__13 ;
    public final void rule__Gamamodel__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:934:1: ( rule__Gamamodel__Group__12__Impl rule__Gamamodel__Group__13 )
            // InternalGsl.g:935:2: rule__Gamamodel__Group__12__Impl rule__Gamamodel__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__Gamamodel__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__13();

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
    // $ANTLR end "rule__Gamamodel__Group__12"


    // $ANTLR start "rule__Gamamodel__Group__12__Impl"
    // InternalGsl.g:942:1: rule__Gamamodel__Group__12__Impl : ( '}' ) ;
    public final void rule__Gamamodel__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:946:1: ( ( '}' ) )
            // InternalGsl.g:947:1: ( '}' )
            {
            // InternalGsl.g:947:1: ( '}' )
            // InternalGsl.g:948:2: '}'
            {
             before(grammarAccess.getGamamodelAccess().getRightCurlyBracketKeyword_12()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__12__Impl"


    // $ANTLR start "rule__Gamamodel__Group__13"
    // InternalGsl.g:957:1: rule__Gamamodel__Group__13 : rule__Gamamodel__Group__13__Impl rule__Gamamodel__Group__14 ;
    public final void rule__Gamamodel__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:961:1: ( rule__Gamamodel__Group__13__Impl rule__Gamamodel__Group__14 )
            // InternalGsl.g:962:2: rule__Gamamodel__Group__13__Impl rule__Gamamodel__Group__14
            {
            pushFollow(FOLLOW_3);
            rule__Gamamodel__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__14();

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
    // $ANTLR end "rule__Gamamodel__Group__13"


    // $ANTLR start "rule__Gamamodel__Group__13__Impl"
    // InternalGsl.g:969:1: rule__Gamamodel__Group__13__Impl : ( 'containsexperiment' ) ;
    public final void rule__Gamamodel__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:973:1: ( ( 'containsexperiment' ) )
            // InternalGsl.g:974:1: ( 'containsexperiment' )
            {
            // InternalGsl.g:974:1: ( 'containsexperiment' )
            // InternalGsl.g:975:2: 'containsexperiment'
            {
             before(grammarAccess.getGamamodelAccess().getContainsexperimentKeyword_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getContainsexperimentKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__13__Impl"


    // $ANTLR start "rule__Gamamodel__Group__14"
    // InternalGsl.g:984:1: rule__Gamamodel__Group__14 : rule__Gamamodel__Group__14__Impl rule__Gamamodel__Group__15 ;
    public final void rule__Gamamodel__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:988:1: ( rule__Gamamodel__Group__14__Impl rule__Gamamodel__Group__15 )
            // InternalGsl.g:989:2: rule__Gamamodel__Group__14__Impl rule__Gamamodel__Group__15
            {
            pushFollow(FOLLOW_11);
            rule__Gamamodel__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__15();

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
    // $ANTLR end "rule__Gamamodel__Group__14"


    // $ANTLR start "rule__Gamamodel__Group__14__Impl"
    // InternalGsl.g:996:1: rule__Gamamodel__Group__14__Impl : ( '{' ) ;
    public final void rule__Gamamodel__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1000:1: ( ( '{' ) )
            // InternalGsl.g:1001:1: ( '{' )
            {
            // InternalGsl.g:1001:1: ( '{' )
            // InternalGsl.g:1002:2: '{'
            {
             before(grammarAccess.getGamamodelAccess().getLeftCurlyBracketKeyword_14()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getLeftCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__14__Impl"


    // $ANTLR start "rule__Gamamodel__Group__15"
    // InternalGsl.g:1011:1: rule__Gamamodel__Group__15 : rule__Gamamodel__Group__15__Impl rule__Gamamodel__Group__16 ;
    public final void rule__Gamamodel__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1015:1: ( rule__Gamamodel__Group__15__Impl rule__Gamamodel__Group__16 )
            // InternalGsl.g:1016:2: rule__Gamamodel__Group__15__Impl rule__Gamamodel__Group__16
            {
            pushFollow(FOLLOW_8);
            rule__Gamamodel__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__16();

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
    // $ANTLR end "rule__Gamamodel__Group__15"


    // $ANTLR start "rule__Gamamodel__Group__15__Impl"
    // InternalGsl.g:1023:1: rule__Gamamodel__Group__15__Impl : ( ( rule__Gamamodel__ContainsexperimentAssignment_15 ) ) ;
    public final void rule__Gamamodel__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1027:1: ( ( ( rule__Gamamodel__ContainsexperimentAssignment_15 ) ) )
            // InternalGsl.g:1028:1: ( ( rule__Gamamodel__ContainsexperimentAssignment_15 ) )
            {
            // InternalGsl.g:1028:1: ( ( rule__Gamamodel__ContainsexperimentAssignment_15 ) )
            // InternalGsl.g:1029:2: ( rule__Gamamodel__ContainsexperimentAssignment_15 )
            {
             before(grammarAccess.getGamamodelAccess().getContainsexperimentAssignment_15()); 
            // InternalGsl.g:1030:2: ( rule__Gamamodel__ContainsexperimentAssignment_15 )
            // InternalGsl.g:1030:3: rule__Gamamodel__ContainsexperimentAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__ContainsexperimentAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getGamamodelAccess().getContainsexperimentAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__15__Impl"


    // $ANTLR start "rule__Gamamodel__Group__16"
    // InternalGsl.g:1038:1: rule__Gamamodel__Group__16 : rule__Gamamodel__Group__16__Impl rule__Gamamodel__Group__17 ;
    public final void rule__Gamamodel__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1042:1: ( rule__Gamamodel__Group__16__Impl rule__Gamamodel__Group__17 )
            // InternalGsl.g:1043:2: rule__Gamamodel__Group__16__Impl rule__Gamamodel__Group__17
            {
            pushFollow(FOLLOW_8);
            rule__Gamamodel__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__17();

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
    // $ANTLR end "rule__Gamamodel__Group__16"


    // $ANTLR start "rule__Gamamodel__Group__16__Impl"
    // InternalGsl.g:1050:1: rule__Gamamodel__Group__16__Impl : ( ( rule__Gamamodel__Group_16__0 )* ) ;
    public final void rule__Gamamodel__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1054:1: ( ( ( rule__Gamamodel__Group_16__0 )* ) )
            // InternalGsl.g:1055:1: ( ( rule__Gamamodel__Group_16__0 )* )
            {
            // InternalGsl.g:1055:1: ( ( rule__Gamamodel__Group_16__0 )* )
            // InternalGsl.g:1056:2: ( rule__Gamamodel__Group_16__0 )*
            {
             before(grammarAccess.getGamamodelAccess().getGroup_16()); 
            // InternalGsl.g:1057:2: ( rule__Gamamodel__Group_16__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalGsl.g:1057:3: rule__Gamamodel__Group_16__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Gamamodel__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getGamamodelAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__16__Impl"


    // $ANTLR start "rule__Gamamodel__Group__17"
    // InternalGsl.g:1065:1: rule__Gamamodel__Group__17 : rule__Gamamodel__Group__17__Impl rule__Gamamodel__Group__18 ;
    public final void rule__Gamamodel__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1069:1: ( rule__Gamamodel__Group__17__Impl rule__Gamamodel__Group__18 )
            // InternalGsl.g:1070:2: rule__Gamamodel__Group__17__Impl rule__Gamamodel__Group__18
            {
            pushFollow(FOLLOW_12);
            rule__Gamamodel__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__18();

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
    // $ANTLR end "rule__Gamamodel__Group__17"


    // $ANTLR start "rule__Gamamodel__Group__17__Impl"
    // InternalGsl.g:1077:1: rule__Gamamodel__Group__17__Impl : ( '}' ) ;
    public final void rule__Gamamodel__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1081:1: ( ( '}' ) )
            // InternalGsl.g:1082:1: ( '}' )
            {
            // InternalGsl.g:1082:1: ( '}' )
            // InternalGsl.g:1083:2: '}'
            {
             before(grammarAccess.getGamamodelAccess().getRightCurlyBracketKeyword_17()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__17__Impl"


    // $ANTLR start "rule__Gamamodel__Group__18"
    // InternalGsl.g:1092:1: rule__Gamamodel__Group__18 : rule__Gamamodel__Group__18__Impl ;
    public final void rule__Gamamodel__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1096:1: ( rule__Gamamodel__Group__18__Impl )
            // InternalGsl.g:1097:2: rule__Gamamodel__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group__18__Impl();

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
    // $ANTLR end "rule__Gamamodel__Group__18"


    // $ANTLR start "rule__Gamamodel__Group__18__Impl"
    // InternalGsl.g:1103:1: rule__Gamamodel__Group__18__Impl : ( '}' ) ;
    public final void rule__Gamamodel__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1107:1: ( ( '}' ) )
            // InternalGsl.g:1108:1: ( '}' )
            {
            // InternalGsl.g:1108:1: ( '}' )
            // InternalGsl.g:1109:2: '}'
            {
             before(grammarAccess.getGamamodelAccess().getRightCurlyBracketKeyword_18()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group__18__Impl"


    // $ANTLR start "rule__Gamamodel__Group_2__0"
    // InternalGsl.g:1119:1: rule__Gamamodel__Group_2__0 : rule__Gamamodel__Group_2__0__Impl rule__Gamamodel__Group_2__1 ;
    public final void rule__Gamamodel__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1123:1: ( rule__Gamamodel__Group_2__0__Impl rule__Gamamodel__Group_2__1 )
            // InternalGsl.g:1124:2: rule__Gamamodel__Group_2__0__Impl rule__Gamamodel__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Gamamodel__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group_2__1();

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
    // $ANTLR end "rule__Gamamodel__Group_2__0"


    // $ANTLR start "rule__Gamamodel__Group_2__0__Impl"
    // InternalGsl.g:1131:1: rule__Gamamodel__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__Gamamodel__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1135:1: ( ( 'description' ) )
            // InternalGsl.g:1136:1: ( 'description' )
            {
            // InternalGsl.g:1136:1: ( 'description' )
            // InternalGsl.g:1137:2: 'description'
            {
             before(grammarAccess.getGamamodelAccess().getDescriptionKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getDescriptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group_2__0__Impl"


    // $ANTLR start "rule__Gamamodel__Group_2__1"
    // InternalGsl.g:1146:1: rule__Gamamodel__Group_2__1 : rule__Gamamodel__Group_2__1__Impl ;
    public final void rule__Gamamodel__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1150:1: ( rule__Gamamodel__Group_2__1__Impl )
            // InternalGsl.g:1151:2: rule__Gamamodel__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group_2__1__Impl();

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
    // $ANTLR end "rule__Gamamodel__Group_2__1"


    // $ANTLR start "rule__Gamamodel__Group_2__1__Impl"
    // InternalGsl.g:1157:1: rule__Gamamodel__Group_2__1__Impl : ( ( rule__Gamamodel__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Gamamodel__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1161:1: ( ( ( rule__Gamamodel__DescriptionAssignment_2_1 ) ) )
            // InternalGsl.g:1162:1: ( ( rule__Gamamodel__DescriptionAssignment_2_1 ) )
            {
            // InternalGsl.g:1162:1: ( ( rule__Gamamodel__DescriptionAssignment_2_1 ) )
            // InternalGsl.g:1163:2: ( rule__Gamamodel__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getGamamodelAccess().getDescriptionAssignment_2_1()); 
            // InternalGsl.g:1164:2: ( rule__Gamamodel__DescriptionAssignment_2_1 )
            // InternalGsl.g:1164:3: rule__Gamamodel__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGamamodelAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group_2__1__Impl"


    // $ANTLR start "rule__Gamamodel__Group_3__0"
    // InternalGsl.g:1173:1: rule__Gamamodel__Group_3__0 : rule__Gamamodel__Group_3__0__Impl rule__Gamamodel__Group_3__1 ;
    public final void rule__Gamamodel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1177:1: ( rule__Gamamodel__Group_3__0__Impl rule__Gamamodel__Group_3__1 )
            // InternalGsl.g:1178:2: rule__Gamamodel__Group_3__0__Impl rule__Gamamodel__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Gamamodel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group_3__1();

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
    // $ANTLR end "rule__Gamamodel__Group_3__0"


    // $ANTLR start "rule__Gamamodel__Group_3__0__Impl"
    // InternalGsl.g:1185:1: rule__Gamamodel__Group_3__0__Impl : ( 'keywords' ) ;
    public final void rule__Gamamodel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1189:1: ( ( 'keywords' ) )
            // InternalGsl.g:1190:1: ( 'keywords' )
            {
            // InternalGsl.g:1190:1: ( 'keywords' )
            // InternalGsl.g:1191:2: 'keywords'
            {
             before(grammarAccess.getGamamodelAccess().getKeywordsKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getKeywordsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group_3__0__Impl"


    // $ANTLR start "rule__Gamamodel__Group_3__1"
    // InternalGsl.g:1200:1: rule__Gamamodel__Group_3__1 : rule__Gamamodel__Group_3__1__Impl ;
    public final void rule__Gamamodel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1204:1: ( rule__Gamamodel__Group_3__1__Impl )
            // InternalGsl.g:1205:2: rule__Gamamodel__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group_3__1__Impl();

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
    // $ANTLR end "rule__Gamamodel__Group_3__1"


    // $ANTLR start "rule__Gamamodel__Group_3__1__Impl"
    // InternalGsl.g:1211:1: rule__Gamamodel__Group_3__1__Impl : ( ( rule__Gamamodel__KeywordsAssignment_3_1 ) ) ;
    public final void rule__Gamamodel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1215:1: ( ( ( rule__Gamamodel__KeywordsAssignment_3_1 ) ) )
            // InternalGsl.g:1216:1: ( ( rule__Gamamodel__KeywordsAssignment_3_1 ) )
            {
            // InternalGsl.g:1216:1: ( ( rule__Gamamodel__KeywordsAssignment_3_1 ) )
            // InternalGsl.g:1217:2: ( rule__Gamamodel__KeywordsAssignment_3_1 )
            {
             before(grammarAccess.getGamamodelAccess().getKeywordsAssignment_3_1()); 
            // InternalGsl.g:1218:2: ( rule__Gamamodel__KeywordsAssignment_3_1 )
            // InternalGsl.g:1218:3: rule__Gamamodel__KeywordsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__KeywordsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGamamodelAccess().getKeywordsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group_3__1__Impl"


    // $ANTLR start "rule__Gamamodel__Group_4__0"
    // InternalGsl.g:1227:1: rule__Gamamodel__Group_4__0 : rule__Gamamodel__Group_4__0__Impl rule__Gamamodel__Group_4__1 ;
    public final void rule__Gamamodel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1231:1: ( rule__Gamamodel__Group_4__0__Impl rule__Gamamodel__Group_4__1 )
            // InternalGsl.g:1232:2: rule__Gamamodel__Group_4__0__Impl rule__Gamamodel__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Gamamodel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group_4__1();

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
    // $ANTLR end "rule__Gamamodel__Group_4__0"


    // $ANTLR start "rule__Gamamodel__Group_4__0__Impl"
    // InternalGsl.g:1239:1: rule__Gamamodel__Group_4__0__Impl : ( 'author' ) ;
    public final void rule__Gamamodel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1243:1: ( ( 'author' ) )
            // InternalGsl.g:1244:1: ( 'author' )
            {
            // InternalGsl.g:1244:1: ( 'author' )
            // InternalGsl.g:1245:2: 'author'
            {
             before(grammarAccess.getGamamodelAccess().getAuthorKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getAuthorKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group_4__0__Impl"


    // $ANTLR start "rule__Gamamodel__Group_4__1"
    // InternalGsl.g:1254:1: rule__Gamamodel__Group_4__1 : rule__Gamamodel__Group_4__1__Impl ;
    public final void rule__Gamamodel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1258:1: ( rule__Gamamodel__Group_4__1__Impl )
            // InternalGsl.g:1259:2: rule__Gamamodel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group_4__1__Impl();

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
    // $ANTLR end "rule__Gamamodel__Group_4__1"


    // $ANTLR start "rule__Gamamodel__Group_4__1__Impl"
    // InternalGsl.g:1265:1: rule__Gamamodel__Group_4__1__Impl : ( ( rule__Gamamodel__AuthorAssignment_4_1 ) ) ;
    public final void rule__Gamamodel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1269:1: ( ( ( rule__Gamamodel__AuthorAssignment_4_1 ) ) )
            // InternalGsl.g:1270:1: ( ( rule__Gamamodel__AuthorAssignment_4_1 ) )
            {
            // InternalGsl.g:1270:1: ( ( rule__Gamamodel__AuthorAssignment_4_1 ) )
            // InternalGsl.g:1271:2: ( rule__Gamamodel__AuthorAssignment_4_1 )
            {
             before(grammarAccess.getGamamodelAccess().getAuthorAssignment_4_1()); 
            // InternalGsl.g:1272:2: ( rule__Gamamodel__AuthorAssignment_4_1 )
            // InternalGsl.g:1272:3: rule__Gamamodel__AuthorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__AuthorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGamamodelAccess().getAuthorAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group_4__1__Impl"


    // $ANTLR start "rule__Gamamodel__Group_5__0"
    // InternalGsl.g:1281:1: rule__Gamamodel__Group_5__0 : rule__Gamamodel__Group_5__0__Impl rule__Gamamodel__Group_5__1 ;
    public final void rule__Gamamodel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1285:1: ( rule__Gamamodel__Group_5__0__Impl rule__Gamamodel__Group_5__1 )
            // InternalGsl.g:1286:2: rule__Gamamodel__Group_5__0__Impl rule__Gamamodel__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Gamamodel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group_5__1();

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
    // $ANTLR end "rule__Gamamodel__Group_5__0"


    // $ANTLR start "rule__Gamamodel__Group_5__0__Impl"
    // InternalGsl.g:1293:1: rule__Gamamodel__Group_5__0__Impl : ( 'createdOn' ) ;
    public final void rule__Gamamodel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1297:1: ( ( 'createdOn' ) )
            // InternalGsl.g:1298:1: ( 'createdOn' )
            {
            // InternalGsl.g:1298:1: ( 'createdOn' )
            // InternalGsl.g:1299:2: 'createdOn'
            {
             before(grammarAccess.getGamamodelAccess().getCreatedOnKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getCreatedOnKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group_5__0__Impl"


    // $ANTLR start "rule__Gamamodel__Group_5__1"
    // InternalGsl.g:1308:1: rule__Gamamodel__Group_5__1 : rule__Gamamodel__Group_5__1__Impl ;
    public final void rule__Gamamodel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1312:1: ( rule__Gamamodel__Group_5__1__Impl )
            // InternalGsl.g:1313:2: rule__Gamamodel__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group_5__1__Impl();

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
    // $ANTLR end "rule__Gamamodel__Group_5__1"


    // $ANTLR start "rule__Gamamodel__Group_5__1__Impl"
    // InternalGsl.g:1319:1: rule__Gamamodel__Group_5__1__Impl : ( ( rule__Gamamodel__CreatedOnAssignment_5_1 ) ) ;
    public final void rule__Gamamodel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1323:1: ( ( ( rule__Gamamodel__CreatedOnAssignment_5_1 ) ) )
            // InternalGsl.g:1324:1: ( ( rule__Gamamodel__CreatedOnAssignment_5_1 ) )
            {
            // InternalGsl.g:1324:1: ( ( rule__Gamamodel__CreatedOnAssignment_5_1 ) )
            // InternalGsl.g:1325:2: ( rule__Gamamodel__CreatedOnAssignment_5_1 )
            {
             before(grammarAccess.getGamamodelAccess().getCreatedOnAssignment_5_1()); 
            // InternalGsl.g:1326:2: ( rule__Gamamodel__CreatedOnAssignment_5_1 )
            // InternalGsl.g:1326:3: rule__Gamamodel__CreatedOnAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__CreatedOnAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGamamodelAccess().getCreatedOnAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group_5__1__Impl"


    // $ANTLR start "rule__Gamamodel__Group_11__0"
    // InternalGsl.g:1335:1: rule__Gamamodel__Group_11__0 : rule__Gamamodel__Group_11__0__Impl rule__Gamamodel__Group_11__1 ;
    public final void rule__Gamamodel__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1339:1: ( rule__Gamamodel__Group_11__0__Impl rule__Gamamodel__Group_11__1 )
            // InternalGsl.g:1340:2: rule__Gamamodel__Group_11__0__Impl rule__Gamamodel__Group_11__1
            {
            pushFollow(FOLLOW_7);
            rule__Gamamodel__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group_11__1();

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
    // $ANTLR end "rule__Gamamodel__Group_11__0"


    // $ANTLR start "rule__Gamamodel__Group_11__0__Impl"
    // InternalGsl.g:1347:1: rule__Gamamodel__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Gamamodel__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1351:1: ( ( ',' ) )
            // InternalGsl.g:1352:1: ( ',' )
            {
            // InternalGsl.g:1352:1: ( ',' )
            // InternalGsl.g:1353:2: ','
            {
             before(grammarAccess.getGamamodelAccess().getCommaKeyword_11_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group_11__0__Impl"


    // $ANTLR start "rule__Gamamodel__Group_11__1"
    // InternalGsl.g:1362:1: rule__Gamamodel__Group_11__1 : rule__Gamamodel__Group_11__1__Impl ;
    public final void rule__Gamamodel__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1366:1: ( rule__Gamamodel__Group_11__1__Impl )
            // InternalGsl.g:1367:2: rule__Gamamodel__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group_11__1__Impl();

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
    // $ANTLR end "rule__Gamamodel__Group_11__1"


    // $ANTLR start "rule__Gamamodel__Group_11__1__Impl"
    // InternalGsl.g:1373:1: rule__Gamamodel__Group_11__1__Impl : ( ( rule__Gamamodel__ContainsspecieAssignment_11_1 ) ) ;
    public final void rule__Gamamodel__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1377:1: ( ( ( rule__Gamamodel__ContainsspecieAssignment_11_1 ) ) )
            // InternalGsl.g:1378:1: ( ( rule__Gamamodel__ContainsspecieAssignment_11_1 ) )
            {
            // InternalGsl.g:1378:1: ( ( rule__Gamamodel__ContainsspecieAssignment_11_1 ) )
            // InternalGsl.g:1379:2: ( rule__Gamamodel__ContainsspecieAssignment_11_1 )
            {
             before(grammarAccess.getGamamodelAccess().getContainsspecieAssignment_11_1()); 
            // InternalGsl.g:1380:2: ( rule__Gamamodel__ContainsspecieAssignment_11_1 )
            // InternalGsl.g:1380:3: rule__Gamamodel__ContainsspecieAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__ContainsspecieAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getGamamodelAccess().getContainsspecieAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group_11__1__Impl"


    // $ANTLR start "rule__Gamamodel__Group_16__0"
    // InternalGsl.g:1389:1: rule__Gamamodel__Group_16__0 : rule__Gamamodel__Group_16__0__Impl rule__Gamamodel__Group_16__1 ;
    public final void rule__Gamamodel__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1393:1: ( rule__Gamamodel__Group_16__0__Impl rule__Gamamodel__Group_16__1 )
            // InternalGsl.g:1394:2: rule__Gamamodel__Group_16__0__Impl rule__Gamamodel__Group_16__1
            {
            pushFollow(FOLLOW_11);
            rule__Gamamodel__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group_16__1();

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
    // $ANTLR end "rule__Gamamodel__Group_16__0"


    // $ANTLR start "rule__Gamamodel__Group_16__0__Impl"
    // InternalGsl.g:1401:1: rule__Gamamodel__Group_16__0__Impl : ( ',' ) ;
    public final void rule__Gamamodel__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1405:1: ( ( ',' ) )
            // InternalGsl.g:1406:1: ( ',' )
            {
            // InternalGsl.g:1406:1: ( ',' )
            // InternalGsl.g:1407:2: ','
            {
             before(grammarAccess.getGamamodelAccess().getCommaKeyword_16_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGamamodelAccess().getCommaKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group_16__0__Impl"


    // $ANTLR start "rule__Gamamodel__Group_16__1"
    // InternalGsl.g:1416:1: rule__Gamamodel__Group_16__1 : rule__Gamamodel__Group_16__1__Impl ;
    public final void rule__Gamamodel__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1420:1: ( rule__Gamamodel__Group_16__1__Impl )
            // InternalGsl.g:1421:2: rule__Gamamodel__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__Group_16__1__Impl();

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
    // $ANTLR end "rule__Gamamodel__Group_16__1"


    // $ANTLR start "rule__Gamamodel__Group_16__1__Impl"
    // InternalGsl.g:1427:1: rule__Gamamodel__Group_16__1__Impl : ( ( rule__Gamamodel__ContainsexperimentAssignment_16_1 ) ) ;
    public final void rule__Gamamodel__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1431:1: ( ( ( rule__Gamamodel__ContainsexperimentAssignment_16_1 ) ) )
            // InternalGsl.g:1432:1: ( ( rule__Gamamodel__ContainsexperimentAssignment_16_1 ) )
            {
            // InternalGsl.g:1432:1: ( ( rule__Gamamodel__ContainsexperimentAssignment_16_1 ) )
            // InternalGsl.g:1433:2: ( rule__Gamamodel__ContainsexperimentAssignment_16_1 )
            {
             before(grammarAccess.getGamamodelAccess().getContainsexperimentAssignment_16_1()); 
            // InternalGsl.g:1434:2: ( rule__Gamamodel__ContainsexperimentAssignment_16_1 )
            // InternalGsl.g:1434:3: rule__Gamamodel__ContainsexperimentAssignment_16_1
            {
            pushFollow(FOLLOW_2);
            rule__Gamamodel__ContainsexperimentAssignment_16_1();

            state._fsp--;


            }

             after(grammarAccess.getGamamodelAccess().getContainsexperimentAssignment_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__Group_16__1__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__0"
    // InternalGsl.g:1443:1: rule__GlobalBlock__Group__0 : rule__GlobalBlock__Group__0__Impl rule__GlobalBlock__Group__1 ;
    public final void rule__GlobalBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1447:1: ( rule__GlobalBlock__Group__0__Impl rule__GlobalBlock__Group__1 )
            // InternalGsl.g:1448:2: rule__GlobalBlock__Group__0__Impl rule__GlobalBlock__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__GlobalBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__1();

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
    // $ANTLR end "rule__GlobalBlock__Group__0"


    // $ANTLR start "rule__GlobalBlock__Group__0__Impl"
    // InternalGsl.g:1455:1: rule__GlobalBlock__Group__0__Impl : ( ( rule__GlobalBlock__InitAssignment_0 )? ) ;
    public final void rule__GlobalBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1459:1: ( ( ( rule__GlobalBlock__InitAssignment_0 )? ) )
            // InternalGsl.g:1460:1: ( ( rule__GlobalBlock__InitAssignment_0 )? )
            {
            // InternalGsl.g:1460:1: ( ( rule__GlobalBlock__InitAssignment_0 )? )
            // InternalGsl.g:1461:2: ( rule__GlobalBlock__InitAssignment_0 )?
            {
             before(grammarAccess.getGlobalBlockAccess().getInitAssignment_0()); 
            // InternalGsl.g:1462:2: ( rule__GlobalBlock__InitAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==66) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalGsl.g:1462:3: rule__GlobalBlock__InitAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GlobalBlock__InitAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalBlockAccess().getInitAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__0__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__1"
    // InternalGsl.g:1470:1: rule__GlobalBlock__Group__1 : rule__GlobalBlock__Group__1__Impl rule__GlobalBlock__Group__2 ;
    public final void rule__GlobalBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1474:1: ( rule__GlobalBlock__Group__1__Impl rule__GlobalBlock__Group__2 )
            // InternalGsl.g:1475:2: rule__GlobalBlock__Group__1__Impl rule__GlobalBlock__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__GlobalBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__2();

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
    // $ANTLR end "rule__GlobalBlock__Group__1"


    // $ANTLR start "rule__GlobalBlock__Group__1__Impl"
    // InternalGsl.g:1482:1: rule__GlobalBlock__Group__1__Impl : ( 'GlobalBlock' ) ;
    public final void rule__GlobalBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1486:1: ( ( 'GlobalBlock' ) )
            // InternalGsl.g:1487:1: ( 'GlobalBlock' )
            {
            // InternalGsl.g:1487:1: ( 'GlobalBlock' )
            // InternalGsl.g:1488:2: 'GlobalBlock'
            {
             before(grammarAccess.getGlobalBlockAccess().getGlobalBlockKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGlobalBlockAccess().getGlobalBlockKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__1__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__2"
    // InternalGsl.g:1497:1: rule__GlobalBlock__Group__2 : rule__GlobalBlock__Group__2__Impl rule__GlobalBlock__Group__3 ;
    public final void rule__GlobalBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1501:1: ( rule__GlobalBlock__Group__2__Impl rule__GlobalBlock__Group__3 )
            // InternalGsl.g:1502:2: rule__GlobalBlock__Group__2__Impl rule__GlobalBlock__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__GlobalBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__3();

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
    // $ANTLR end "rule__GlobalBlock__Group__2"


    // $ANTLR start "rule__GlobalBlock__Group__2__Impl"
    // InternalGsl.g:1509:1: rule__GlobalBlock__Group__2__Impl : ( ( rule__GlobalBlock__IdAssignment_2 ) ) ;
    public final void rule__GlobalBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1513:1: ( ( ( rule__GlobalBlock__IdAssignment_2 ) ) )
            // InternalGsl.g:1514:1: ( ( rule__GlobalBlock__IdAssignment_2 ) )
            {
            // InternalGsl.g:1514:1: ( ( rule__GlobalBlock__IdAssignment_2 ) )
            // InternalGsl.g:1515:2: ( rule__GlobalBlock__IdAssignment_2 )
            {
             before(grammarAccess.getGlobalBlockAccess().getIdAssignment_2()); 
            // InternalGsl.g:1516:2: ( rule__GlobalBlock__IdAssignment_2 )
            // InternalGsl.g:1516:3: rule__GlobalBlock__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GlobalBlock__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalBlockAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__2__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__3"
    // InternalGsl.g:1524:1: rule__GlobalBlock__Group__3 : rule__GlobalBlock__Group__3__Impl rule__GlobalBlock__Group__4 ;
    public final void rule__GlobalBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1528:1: ( rule__GlobalBlock__Group__3__Impl rule__GlobalBlock__Group__4 )
            // InternalGsl.g:1529:2: rule__GlobalBlock__Group__3__Impl rule__GlobalBlock__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__GlobalBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__4();

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
    // $ANTLR end "rule__GlobalBlock__Group__3"


    // $ANTLR start "rule__GlobalBlock__Group__3__Impl"
    // InternalGsl.g:1536:1: rule__GlobalBlock__Group__3__Impl : ( '{' ) ;
    public final void rule__GlobalBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1540:1: ( ( '{' ) )
            // InternalGsl.g:1541:1: ( '{' )
            {
            // InternalGsl.g:1541:1: ( '{' )
            // InternalGsl.g:1542:2: '{'
            {
             before(grammarAccess.getGlobalBlockAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGlobalBlockAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__3__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__4"
    // InternalGsl.g:1551:1: rule__GlobalBlock__Group__4 : rule__GlobalBlock__Group__4__Impl rule__GlobalBlock__Group__5 ;
    public final void rule__GlobalBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1555:1: ( rule__GlobalBlock__Group__4__Impl rule__GlobalBlock__Group__5 )
            // InternalGsl.g:1556:2: rule__GlobalBlock__Group__4__Impl rule__GlobalBlock__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__GlobalBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__5();

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
    // $ANTLR end "rule__GlobalBlock__Group__4"


    // $ANTLR start "rule__GlobalBlock__Group__4__Impl"
    // InternalGsl.g:1563:1: rule__GlobalBlock__Group__4__Impl : ( 'containsglobalvariable' ) ;
    public final void rule__GlobalBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1567:1: ( ( 'containsglobalvariable' ) )
            // InternalGsl.g:1568:1: ( 'containsglobalvariable' )
            {
            // InternalGsl.g:1568:1: ( 'containsglobalvariable' )
            // InternalGsl.g:1569:2: 'containsglobalvariable'
            {
             before(grammarAccess.getGlobalBlockAccess().getContainsglobalvariableKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGlobalBlockAccess().getContainsglobalvariableKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__4__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__5"
    // InternalGsl.g:1578:1: rule__GlobalBlock__Group__5 : rule__GlobalBlock__Group__5__Impl rule__GlobalBlock__Group__6 ;
    public final void rule__GlobalBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1582:1: ( rule__GlobalBlock__Group__5__Impl rule__GlobalBlock__Group__6 )
            // InternalGsl.g:1583:2: rule__GlobalBlock__Group__5__Impl rule__GlobalBlock__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__GlobalBlock__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__6();

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
    // $ANTLR end "rule__GlobalBlock__Group__5"


    // $ANTLR start "rule__GlobalBlock__Group__5__Impl"
    // InternalGsl.g:1590:1: rule__GlobalBlock__Group__5__Impl : ( '{' ) ;
    public final void rule__GlobalBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1594:1: ( ( '{' ) )
            // InternalGsl.g:1595:1: ( '{' )
            {
            // InternalGsl.g:1595:1: ( '{' )
            // InternalGsl.g:1596:2: '{'
            {
             before(grammarAccess.getGlobalBlockAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGlobalBlockAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__5__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__6"
    // InternalGsl.g:1605:1: rule__GlobalBlock__Group__6 : rule__GlobalBlock__Group__6__Impl rule__GlobalBlock__Group__7 ;
    public final void rule__GlobalBlock__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1609:1: ( rule__GlobalBlock__Group__6__Impl rule__GlobalBlock__Group__7 )
            // InternalGsl.g:1610:2: rule__GlobalBlock__Group__6__Impl rule__GlobalBlock__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__GlobalBlock__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__7();

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
    // $ANTLR end "rule__GlobalBlock__Group__6"


    // $ANTLR start "rule__GlobalBlock__Group__6__Impl"
    // InternalGsl.g:1617:1: rule__GlobalBlock__Group__6__Impl : ( ( rule__GlobalBlock__ContainsglobalvariableAssignment_6 ) ) ;
    public final void rule__GlobalBlock__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1621:1: ( ( ( rule__GlobalBlock__ContainsglobalvariableAssignment_6 ) ) )
            // InternalGsl.g:1622:1: ( ( rule__GlobalBlock__ContainsglobalvariableAssignment_6 ) )
            {
            // InternalGsl.g:1622:1: ( ( rule__GlobalBlock__ContainsglobalvariableAssignment_6 ) )
            // InternalGsl.g:1623:2: ( rule__GlobalBlock__ContainsglobalvariableAssignment_6 )
            {
             before(grammarAccess.getGlobalBlockAccess().getContainsglobalvariableAssignment_6()); 
            // InternalGsl.g:1624:2: ( rule__GlobalBlock__ContainsglobalvariableAssignment_6 )
            // InternalGsl.g:1624:3: rule__GlobalBlock__ContainsglobalvariableAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__GlobalBlock__ContainsglobalvariableAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getGlobalBlockAccess().getContainsglobalvariableAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__6__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__7"
    // InternalGsl.g:1632:1: rule__GlobalBlock__Group__7 : rule__GlobalBlock__Group__7__Impl rule__GlobalBlock__Group__8 ;
    public final void rule__GlobalBlock__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1636:1: ( rule__GlobalBlock__Group__7__Impl rule__GlobalBlock__Group__8 )
            // InternalGsl.g:1637:2: rule__GlobalBlock__Group__7__Impl rule__GlobalBlock__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__GlobalBlock__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__8();

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
    // $ANTLR end "rule__GlobalBlock__Group__7"


    // $ANTLR start "rule__GlobalBlock__Group__7__Impl"
    // InternalGsl.g:1644:1: rule__GlobalBlock__Group__7__Impl : ( ( rule__GlobalBlock__Group_7__0 )* ) ;
    public final void rule__GlobalBlock__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1648:1: ( ( ( rule__GlobalBlock__Group_7__0 )* ) )
            // InternalGsl.g:1649:1: ( ( rule__GlobalBlock__Group_7__0 )* )
            {
            // InternalGsl.g:1649:1: ( ( rule__GlobalBlock__Group_7__0 )* )
            // InternalGsl.g:1650:2: ( rule__GlobalBlock__Group_7__0 )*
            {
             before(grammarAccess.getGlobalBlockAccess().getGroup_7()); 
            // InternalGsl.g:1651:2: ( rule__GlobalBlock__Group_7__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGsl.g:1651:3: rule__GlobalBlock__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__GlobalBlock__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getGlobalBlockAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__7__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__8"
    // InternalGsl.g:1659:1: rule__GlobalBlock__Group__8 : rule__GlobalBlock__Group__8__Impl rule__GlobalBlock__Group__9 ;
    public final void rule__GlobalBlock__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1663:1: ( rule__GlobalBlock__Group__8__Impl rule__GlobalBlock__Group__9 )
            // InternalGsl.g:1664:2: rule__GlobalBlock__Group__8__Impl rule__GlobalBlock__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__GlobalBlock__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__9();

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
    // $ANTLR end "rule__GlobalBlock__Group__8"


    // $ANTLR start "rule__GlobalBlock__Group__8__Impl"
    // InternalGsl.g:1671:1: rule__GlobalBlock__Group__8__Impl : ( '}' ) ;
    public final void rule__GlobalBlock__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1675:1: ( ( '}' ) )
            // InternalGsl.g:1676:1: ( '}' )
            {
            // InternalGsl.g:1676:1: ( '}' )
            // InternalGsl.g:1677:2: '}'
            {
             before(grammarAccess.getGlobalBlockAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGlobalBlockAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__8__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__9"
    // InternalGsl.g:1686:1: rule__GlobalBlock__Group__9 : rule__GlobalBlock__Group__9__Impl rule__GlobalBlock__Group__10 ;
    public final void rule__GlobalBlock__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1690:1: ( rule__GlobalBlock__Group__9__Impl rule__GlobalBlock__Group__10 )
            // InternalGsl.g:1691:2: rule__GlobalBlock__Group__9__Impl rule__GlobalBlock__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__GlobalBlock__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__10();

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
    // $ANTLR end "rule__GlobalBlock__Group__9"


    // $ANTLR start "rule__GlobalBlock__Group__9__Impl"
    // InternalGsl.g:1698:1: rule__GlobalBlock__Group__9__Impl : ( 'hasspatialentity' ) ;
    public final void rule__GlobalBlock__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1702:1: ( ( 'hasspatialentity' ) )
            // InternalGsl.g:1703:1: ( 'hasspatialentity' )
            {
            // InternalGsl.g:1703:1: ( 'hasspatialentity' )
            // InternalGsl.g:1704:2: 'hasspatialentity'
            {
             before(grammarAccess.getGlobalBlockAccess().getHasspatialentityKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getGlobalBlockAccess().getHasspatialentityKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__9__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__10"
    // InternalGsl.g:1713:1: rule__GlobalBlock__Group__10 : rule__GlobalBlock__Group__10__Impl rule__GlobalBlock__Group__11 ;
    public final void rule__GlobalBlock__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1717:1: ( rule__GlobalBlock__Group__10__Impl rule__GlobalBlock__Group__11 )
            // InternalGsl.g:1718:2: rule__GlobalBlock__Group__10__Impl rule__GlobalBlock__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__GlobalBlock__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__11();

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
    // $ANTLR end "rule__GlobalBlock__Group__10"


    // $ANTLR start "rule__GlobalBlock__Group__10__Impl"
    // InternalGsl.g:1725:1: rule__GlobalBlock__Group__10__Impl : ( '{' ) ;
    public final void rule__GlobalBlock__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1729:1: ( ( '{' ) )
            // InternalGsl.g:1730:1: ( '{' )
            {
            // InternalGsl.g:1730:1: ( '{' )
            // InternalGsl.g:1731:2: '{'
            {
             before(grammarAccess.getGlobalBlockAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGlobalBlockAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__10__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__11"
    // InternalGsl.g:1740:1: rule__GlobalBlock__Group__11 : rule__GlobalBlock__Group__11__Impl rule__GlobalBlock__Group__12 ;
    public final void rule__GlobalBlock__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1744:1: ( rule__GlobalBlock__Group__11__Impl rule__GlobalBlock__Group__12 )
            // InternalGsl.g:1745:2: rule__GlobalBlock__Group__11__Impl rule__GlobalBlock__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__GlobalBlock__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__12();

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
    // $ANTLR end "rule__GlobalBlock__Group__11"


    // $ANTLR start "rule__GlobalBlock__Group__11__Impl"
    // InternalGsl.g:1752:1: rule__GlobalBlock__Group__11__Impl : ( ( rule__GlobalBlock__HasspatialentityAssignment_11 ) ) ;
    public final void rule__GlobalBlock__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1756:1: ( ( ( rule__GlobalBlock__HasspatialentityAssignment_11 ) ) )
            // InternalGsl.g:1757:1: ( ( rule__GlobalBlock__HasspatialentityAssignment_11 ) )
            {
            // InternalGsl.g:1757:1: ( ( rule__GlobalBlock__HasspatialentityAssignment_11 ) )
            // InternalGsl.g:1758:2: ( rule__GlobalBlock__HasspatialentityAssignment_11 )
            {
             before(grammarAccess.getGlobalBlockAccess().getHasspatialentityAssignment_11()); 
            // InternalGsl.g:1759:2: ( rule__GlobalBlock__HasspatialentityAssignment_11 )
            // InternalGsl.g:1759:3: rule__GlobalBlock__HasspatialentityAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__GlobalBlock__HasspatialentityAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getGlobalBlockAccess().getHasspatialentityAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__11__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__12"
    // InternalGsl.g:1767:1: rule__GlobalBlock__Group__12 : rule__GlobalBlock__Group__12__Impl rule__GlobalBlock__Group__13 ;
    public final void rule__GlobalBlock__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1771:1: ( rule__GlobalBlock__Group__12__Impl rule__GlobalBlock__Group__13 )
            // InternalGsl.g:1772:2: rule__GlobalBlock__Group__12__Impl rule__GlobalBlock__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__GlobalBlock__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__13();

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
    // $ANTLR end "rule__GlobalBlock__Group__12"


    // $ANTLR start "rule__GlobalBlock__Group__12__Impl"
    // InternalGsl.g:1779:1: rule__GlobalBlock__Group__12__Impl : ( ( rule__GlobalBlock__Group_12__0 )* ) ;
    public final void rule__GlobalBlock__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1783:1: ( ( ( rule__GlobalBlock__Group_12__0 )* ) )
            // InternalGsl.g:1784:1: ( ( rule__GlobalBlock__Group_12__0 )* )
            {
            // InternalGsl.g:1784:1: ( ( rule__GlobalBlock__Group_12__0 )* )
            // InternalGsl.g:1785:2: ( rule__GlobalBlock__Group_12__0 )*
            {
             before(grammarAccess.getGlobalBlockAccess().getGroup_12()); 
            // InternalGsl.g:1786:2: ( rule__GlobalBlock__Group_12__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalGsl.g:1786:3: rule__GlobalBlock__Group_12__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__GlobalBlock__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getGlobalBlockAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__12__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__13"
    // InternalGsl.g:1794:1: rule__GlobalBlock__Group__13 : rule__GlobalBlock__Group__13__Impl rule__GlobalBlock__Group__14 ;
    public final void rule__GlobalBlock__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1798:1: ( rule__GlobalBlock__Group__13__Impl rule__GlobalBlock__Group__14 )
            // InternalGsl.g:1799:2: rule__GlobalBlock__Group__13__Impl rule__GlobalBlock__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__GlobalBlock__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__14();

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
    // $ANTLR end "rule__GlobalBlock__Group__13"


    // $ANTLR start "rule__GlobalBlock__Group__13__Impl"
    // InternalGsl.g:1806:1: rule__GlobalBlock__Group__13__Impl : ( '}' ) ;
    public final void rule__GlobalBlock__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1810:1: ( ( '}' ) )
            // InternalGsl.g:1811:1: ( '}' )
            {
            // InternalGsl.g:1811:1: ( '}' )
            // InternalGsl.g:1812:2: '}'
            {
             before(grammarAccess.getGlobalBlockAccess().getRightCurlyBracketKeyword_13()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGlobalBlockAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__13__Impl"


    // $ANTLR start "rule__GlobalBlock__Group__14"
    // InternalGsl.g:1821:1: rule__GlobalBlock__Group__14 : rule__GlobalBlock__Group__14__Impl ;
    public final void rule__GlobalBlock__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1825:1: ( rule__GlobalBlock__Group__14__Impl )
            // InternalGsl.g:1826:2: rule__GlobalBlock__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group__14__Impl();

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
    // $ANTLR end "rule__GlobalBlock__Group__14"


    // $ANTLR start "rule__GlobalBlock__Group__14__Impl"
    // InternalGsl.g:1832:1: rule__GlobalBlock__Group__14__Impl : ( '}' ) ;
    public final void rule__GlobalBlock__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1836:1: ( ( '}' ) )
            // InternalGsl.g:1837:1: ( '}' )
            {
            // InternalGsl.g:1837:1: ( '}' )
            // InternalGsl.g:1838:2: '}'
            {
             before(grammarAccess.getGlobalBlockAccess().getRightCurlyBracketKeyword_14()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGlobalBlockAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group__14__Impl"


    // $ANTLR start "rule__GlobalBlock__Group_7__0"
    // InternalGsl.g:1848:1: rule__GlobalBlock__Group_7__0 : rule__GlobalBlock__Group_7__0__Impl rule__GlobalBlock__Group_7__1 ;
    public final void rule__GlobalBlock__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1852:1: ( rule__GlobalBlock__Group_7__0__Impl rule__GlobalBlock__Group_7__1 )
            // InternalGsl.g:1853:2: rule__GlobalBlock__Group_7__0__Impl rule__GlobalBlock__Group_7__1
            {
            pushFollow(FOLLOW_17);
            rule__GlobalBlock__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group_7__1();

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
    // $ANTLR end "rule__GlobalBlock__Group_7__0"


    // $ANTLR start "rule__GlobalBlock__Group_7__0__Impl"
    // InternalGsl.g:1860:1: rule__GlobalBlock__Group_7__0__Impl : ( ',' ) ;
    public final void rule__GlobalBlock__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1864:1: ( ( ',' ) )
            // InternalGsl.g:1865:1: ( ',' )
            {
            // InternalGsl.g:1865:1: ( ',' )
            // InternalGsl.g:1866:2: ','
            {
             before(grammarAccess.getGlobalBlockAccess().getCommaKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGlobalBlockAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group_7__0__Impl"


    // $ANTLR start "rule__GlobalBlock__Group_7__1"
    // InternalGsl.g:1875:1: rule__GlobalBlock__Group_7__1 : rule__GlobalBlock__Group_7__1__Impl ;
    public final void rule__GlobalBlock__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1879:1: ( rule__GlobalBlock__Group_7__1__Impl )
            // InternalGsl.g:1880:2: rule__GlobalBlock__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group_7__1__Impl();

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
    // $ANTLR end "rule__GlobalBlock__Group_7__1"


    // $ANTLR start "rule__GlobalBlock__Group_7__1__Impl"
    // InternalGsl.g:1886:1: rule__GlobalBlock__Group_7__1__Impl : ( ( rule__GlobalBlock__ContainsglobalvariableAssignment_7_1 ) ) ;
    public final void rule__GlobalBlock__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1890:1: ( ( ( rule__GlobalBlock__ContainsglobalvariableAssignment_7_1 ) ) )
            // InternalGsl.g:1891:1: ( ( rule__GlobalBlock__ContainsglobalvariableAssignment_7_1 ) )
            {
            // InternalGsl.g:1891:1: ( ( rule__GlobalBlock__ContainsglobalvariableAssignment_7_1 ) )
            // InternalGsl.g:1892:2: ( rule__GlobalBlock__ContainsglobalvariableAssignment_7_1 )
            {
             before(grammarAccess.getGlobalBlockAccess().getContainsglobalvariableAssignment_7_1()); 
            // InternalGsl.g:1893:2: ( rule__GlobalBlock__ContainsglobalvariableAssignment_7_1 )
            // InternalGsl.g:1893:3: rule__GlobalBlock__ContainsglobalvariableAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalBlock__ContainsglobalvariableAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalBlockAccess().getContainsglobalvariableAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group_7__1__Impl"


    // $ANTLR start "rule__GlobalBlock__Group_12__0"
    // InternalGsl.g:1902:1: rule__GlobalBlock__Group_12__0 : rule__GlobalBlock__Group_12__0__Impl rule__GlobalBlock__Group_12__1 ;
    public final void rule__GlobalBlock__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1906:1: ( rule__GlobalBlock__Group_12__0__Impl rule__GlobalBlock__Group_12__1 )
            // InternalGsl.g:1907:2: rule__GlobalBlock__Group_12__0__Impl rule__GlobalBlock__Group_12__1
            {
            pushFollow(FOLLOW_19);
            rule__GlobalBlock__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group_12__1();

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
    // $ANTLR end "rule__GlobalBlock__Group_12__0"


    // $ANTLR start "rule__GlobalBlock__Group_12__0__Impl"
    // InternalGsl.g:1914:1: rule__GlobalBlock__Group_12__0__Impl : ( ',' ) ;
    public final void rule__GlobalBlock__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1918:1: ( ( ',' ) )
            // InternalGsl.g:1919:1: ( ',' )
            {
            // InternalGsl.g:1919:1: ( ',' )
            // InternalGsl.g:1920:2: ','
            {
             before(grammarAccess.getGlobalBlockAccess().getCommaKeyword_12_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGlobalBlockAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group_12__0__Impl"


    // $ANTLR start "rule__GlobalBlock__Group_12__1"
    // InternalGsl.g:1929:1: rule__GlobalBlock__Group_12__1 : rule__GlobalBlock__Group_12__1__Impl ;
    public final void rule__GlobalBlock__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1933:1: ( rule__GlobalBlock__Group_12__1__Impl )
            // InternalGsl.g:1934:2: rule__GlobalBlock__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalBlock__Group_12__1__Impl();

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
    // $ANTLR end "rule__GlobalBlock__Group_12__1"


    // $ANTLR start "rule__GlobalBlock__Group_12__1__Impl"
    // InternalGsl.g:1940:1: rule__GlobalBlock__Group_12__1__Impl : ( ( rule__GlobalBlock__HasspatialentityAssignment_12_1 ) ) ;
    public final void rule__GlobalBlock__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1944:1: ( ( ( rule__GlobalBlock__HasspatialentityAssignment_12_1 ) ) )
            // InternalGsl.g:1945:1: ( ( rule__GlobalBlock__HasspatialentityAssignment_12_1 ) )
            {
            // InternalGsl.g:1945:1: ( ( rule__GlobalBlock__HasspatialentityAssignment_12_1 ) )
            // InternalGsl.g:1946:2: ( rule__GlobalBlock__HasspatialentityAssignment_12_1 )
            {
             before(grammarAccess.getGlobalBlockAccess().getHasspatialentityAssignment_12_1()); 
            // InternalGsl.g:1947:2: ( rule__GlobalBlock__HasspatialentityAssignment_12_1 )
            // InternalGsl.g:1947:3: rule__GlobalBlock__HasspatialentityAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalBlock__HasspatialentityAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalBlockAccess().getHasspatialentityAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__Group_12__1__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__0"
    // InternalGsl.g:1956:1: rule__SpecieBlock__Group__0 : rule__SpecieBlock__Group__0__Impl rule__SpecieBlock__Group__1 ;
    public final void rule__SpecieBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1960:1: ( rule__SpecieBlock__Group__0__Impl rule__SpecieBlock__Group__1 )
            // InternalGsl.g:1961:2: rule__SpecieBlock__Group__0__Impl rule__SpecieBlock__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SpecieBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__1();

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
    // $ANTLR end "rule__SpecieBlock__Group__0"


    // $ANTLR start "rule__SpecieBlock__Group__0__Impl"
    // InternalGsl.g:1968:1: rule__SpecieBlock__Group__0__Impl : ( ( rule__SpecieBlock__AspectfunctionAssignment_0 )? ) ;
    public final void rule__SpecieBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1972:1: ( ( ( rule__SpecieBlock__AspectfunctionAssignment_0 )? ) )
            // InternalGsl.g:1973:1: ( ( rule__SpecieBlock__AspectfunctionAssignment_0 )? )
            {
            // InternalGsl.g:1973:1: ( ( rule__SpecieBlock__AspectfunctionAssignment_0 )? )
            // InternalGsl.g:1974:2: ( rule__SpecieBlock__AspectfunctionAssignment_0 )?
            {
             before(grammarAccess.getSpecieBlockAccess().getAspectfunctionAssignment_0()); 
            // InternalGsl.g:1975:2: ( rule__SpecieBlock__AspectfunctionAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==67) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGsl.g:1975:3: rule__SpecieBlock__AspectfunctionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecieBlock__AspectfunctionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecieBlockAccess().getAspectfunctionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__0__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__1"
    // InternalGsl.g:1983:1: rule__SpecieBlock__Group__1 : rule__SpecieBlock__Group__1__Impl rule__SpecieBlock__Group__2 ;
    public final void rule__SpecieBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1987:1: ( rule__SpecieBlock__Group__1__Impl rule__SpecieBlock__Group__2 )
            // InternalGsl.g:1988:2: rule__SpecieBlock__Group__1__Impl rule__SpecieBlock__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__SpecieBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__2();

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
    // $ANTLR end "rule__SpecieBlock__Group__1"


    // $ANTLR start "rule__SpecieBlock__Group__1__Impl"
    // InternalGsl.g:1995:1: rule__SpecieBlock__Group__1__Impl : ( 'SpecieBlock' ) ;
    public final void rule__SpecieBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:1999:1: ( ( 'SpecieBlock' ) )
            // InternalGsl.g:2000:1: ( 'SpecieBlock' )
            {
            // InternalGsl.g:2000:1: ( 'SpecieBlock' )
            // InternalGsl.g:2001:2: 'SpecieBlock'
            {
             before(grammarAccess.getSpecieBlockAccess().getSpecieBlockKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getSpecieBlockKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__1__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__2"
    // InternalGsl.g:2010:1: rule__SpecieBlock__Group__2 : rule__SpecieBlock__Group__2__Impl rule__SpecieBlock__Group__3 ;
    public final void rule__SpecieBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2014:1: ( rule__SpecieBlock__Group__2__Impl rule__SpecieBlock__Group__3 )
            // InternalGsl.g:2015:2: rule__SpecieBlock__Group__2__Impl rule__SpecieBlock__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__SpecieBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__3();

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
    // $ANTLR end "rule__SpecieBlock__Group__2"


    // $ANTLR start "rule__SpecieBlock__Group__2__Impl"
    // InternalGsl.g:2022:1: rule__SpecieBlock__Group__2__Impl : ( ( rule__SpecieBlock__SpecieBlockNameAssignment_2 ) ) ;
    public final void rule__SpecieBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2026:1: ( ( ( rule__SpecieBlock__SpecieBlockNameAssignment_2 ) ) )
            // InternalGsl.g:2027:1: ( ( rule__SpecieBlock__SpecieBlockNameAssignment_2 ) )
            {
            // InternalGsl.g:2027:1: ( ( rule__SpecieBlock__SpecieBlockNameAssignment_2 ) )
            // InternalGsl.g:2028:2: ( rule__SpecieBlock__SpecieBlockNameAssignment_2 )
            {
             before(grammarAccess.getSpecieBlockAccess().getSpecieBlockNameAssignment_2()); 
            // InternalGsl.g:2029:2: ( rule__SpecieBlock__SpecieBlockNameAssignment_2 )
            // InternalGsl.g:2029:3: rule__SpecieBlock__SpecieBlockNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__SpecieBlockNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpecieBlockAccess().getSpecieBlockNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__2__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__3"
    // InternalGsl.g:2037:1: rule__SpecieBlock__Group__3 : rule__SpecieBlock__Group__3__Impl rule__SpecieBlock__Group__4 ;
    public final void rule__SpecieBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2041:1: ( rule__SpecieBlock__Group__3__Impl rule__SpecieBlock__Group__4 )
            // InternalGsl.g:2042:2: rule__SpecieBlock__Group__3__Impl rule__SpecieBlock__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__SpecieBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__4();

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
    // $ANTLR end "rule__SpecieBlock__Group__3"


    // $ANTLR start "rule__SpecieBlock__Group__3__Impl"
    // InternalGsl.g:2049:1: rule__SpecieBlock__Group__3__Impl : ( '{' ) ;
    public final void rule__SpecieBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2053:1: ( ( '{' ) )
            // InternalGsl.g:2054:1: ( '{' )
            {
            // InternalGsl.g:2054:1: ( '{' )
            // InternalGsl.g:2055:2: '{'
            {
             before(grammarAccess.getSpecieBlockAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__3__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__4"
    // InternalGsl.g:2064:1: rule__SpecieBlock__Group__4 : rule__SpecieBlock__Group__4__Impl rule__SpecieBlock__Group__5 ;
    public final void rule__SpecieBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2068:1: ( rule__SpecieBlock__Group__4__Impl rule__SpecieBlock__Group__5 )
            // InternalGsl.g:2069:2: rule__SpecieBlock__Group__4__Impl rule__SpecieBlock__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__SpecieBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__5();

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
    // $ANTLR end "rule__SpecieBlock__Group__4"


    // $ANTLR start "rule__SpecieBlock__Group__4__Impl"
    // InternalGsl.g:2076:1: rule__SpecieBlock__Group__4__Impl : ( ( rule__SpecieBlock__Group_4__0 )? ) ;
    public final void rule__SpecieBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2080:1: ( ( ( rule__SpecieBlock__Group_4__0 )? ) )
            // InternalGsl.g:2081:1: ( ( rule__SpecieBlock__Group_4__0 )? )
            {
            // InternalGsl.g:2081:1: ( ( rule__SpecieBlock__Group_4__0 )? )
            // InternalGsl.g:2082:2: ( rule__SpecieBlock__Group_4__0 )?
            {
             before(grammarAccess.getSpecieBlockAccess().getGroup_4()); 
            // InternalGsl.g:2083:2: ( rule__SpecieBlock__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalGsl.g:2083:3: rule__SpecieBlock__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecieBlock__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecieBlockAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__4__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__5"
    // InternalGsl.g:2091:1: rule__SpecieBlock__Group__5 : rule__SpecieBlock__Group__5__Impl rule__SpecieBlock__Group__6 ;
    public final void rule__SpecieBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2095:1: ( rule__SpecieBlock__Group__5__Impl rule__SpecieBlock__Group__6 )
            // InternalGsl.g:2096:2: rule__SpecieBlock__Group__5__Impl rule__SpecieBlock__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__SpecieBlock__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__6();

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
    // $ANTLR end "rule__SpecieBlock__Group__5"


    // $ANTLR start "rule__SpecieBlock__Group__5__Impl"
    // InternalGsl.g:2103:1: rule__SpecieBlock__Group__5__Impl : ( ( rule__SpecieBlock__Group_5__0 )? ) ;
    public final void rule__SpecieBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2107:1: ( ( ( rule__SpecieBlock__Group_5__0 )? ) )
            // InternalGsl.g:2108:1: ( ( rule__SpecieBlock__Group_5__0 )? )
            {
            // InternalGsl.g:2108:1: ( ( rule__SpecieBlock__Group_5__0 )? )
            // InternalGsl.g:2109:2: ( rule__SpecieBlock__Group_5__0 )?
            {
             before(grammarAccess.getSpecieBlockAccess().getGroup_5()); 
            // InternalGsl.g:2110:2: ( rule__SpecieBlock__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGsl.g:2110:3: rule__SpecieBlock__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecieBlock__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecieBlockAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__5__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__6"
    // InternalGsl.g:2118:1: rule__SpecieBlock__Group__6 : rule__SpecieBlock__Group__6__Impl rule__SpecieBlock__Group__7 ;
    public final void rule__SpecieBlock__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2122:1: ( rule__SpecieBlock__Group__6__Impl rule__SpecieBlock__Group__7 )
            // InternalGsl.g:2123:2: rule__SpecieBlock__Group__6__Impl rule__SpecieBlock__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__SpecieBlock__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__7();

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
    // $ANTLR end "rule__SpecieBlock__Group__6"


    // $ANTLR start "rule__SpecieBlock__Group__6__Impl"
    // InternalGsl.g:2130:1: rule__SpecieBlock__Group__6__Impl : ( ( rule__SpecieBlock__Group_6__0 )? ) ;
    public final void rule__SpecieBlock__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2134:1: ( ( ( rule__SpecieBlock__Group_6__0 )? ) )
            // InternalGsl.g:2135:1: ( ( rule__SpecieBlock__Group_6__0 )? )
            {
            // InternalGsl.g:2135:1: ( ( rule__SpecieBlock__Group_6__0 )? )
            // InternalGsl.g:2136:2: ( rule__SpecieBlock__Group_6__0 )?
            {
             before(grammarAccess.getSpecieBlockAccess().getGroup_6()); 
            // InternalGsl.g:2137:2: ( rule__SpecieBlock__Group_6__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGsl.g:2137:3: rule__SpecieBlock__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpecieBlock__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpecieBlockAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__6__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__7"
    // InternalGsl.g:2145:1: rule__SpecieBlock__Group__7 : rule__SpecieBlock__Group__7__Impl rule__SpecieBlock__Group__8 ;
    public final void rule__SpecieBlock__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2149:1: ( rule__SpecieBlock__Group__7__Impl rule__SpecieBlock__Group__8 )
            // InternalGsl.g:2150:2: rule__SpecieBlock__Group__7__Impl rule__SpecieBlock__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__SpecieBlock__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__8();

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
    // $ANTLR end "rule__SpecieBlock__Group__7"


    // $ANTLR start "rule__SpecieBlock__Group__7__Impl"
    // InternalGsl.g:2157:1: rule__SpecieBlock__Group__7__Impl : ( 'containsaction' ) ;
    public final void rule__SpecieBlock__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2161:1: ( ( 'containsaction' ) )
            // InternalGsl.g:2162:1: ( 'containsaction' )
            {
            // InternalGsl.g:2162:1: ( 'containsaction' )
            // InternalGsl.g:2163:2: 'containsaction'
            {
             before(grammarAccess.getSpecieBlockAccess().getContainsactionKeyword_7()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getContainsactionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__7__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__8"
    // InternalGsl.g:2172:1: rule__SpecieBlock__Group__8 : rule__SpecieBlock__Group__8__Impl rule__SpecieBlock__Group__9 ;
    public final void rule__SpecieBlock__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2176:1: ( rule__SpecieBlock__Group__8__Impl rule__SpecieBlock__Group__9 )
            // InternalGsl.g:2177:2: rule__SpecieBlock__Group__8__Impl rule__SpecieBlock__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__SpecieBlock__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__9();

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
    // $ANTLR end "rule__SpecieBlock__Group__8"


    // $ANTLR start "rule__SpecieBlock__Group__8__Impl"
    // InternalGsl.g:2184:1: rule__SpecieBlock__Group__8__Impl : ( '{' ) ;
    public final void rule__SpecieBlock__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2188:1: ( ( '{' ) )
            // InternalGsl.g:2189:1: ( '{' )
            {
            // InternalGsl.g:2189:1: ( '{' )
            // InternalGsl.g:2190:2: '{'
            {
             before(grammarAccess.getSpecieBlockAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__8__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__9"
    // InternalGsl.g:2199:1: rule__SpecieBlock__Group__9 : rule__SpecieBlock__Group__9__Impl rule__SpecieBlock__Group__10 ;
    public final void rule__SpecieBlock__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2203:1: ( rule__SpecieBlock__Group__9__Impl rule__SpecieBlock__Group__10 )
            // InternalGsl.g:2204:2: rule__SpecieBlock__Group__9__Impl rule__SpecieBlock__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__SpecieBlock__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__10();

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
    // $ANTLR end "rule__SpecieBlock__Group__9"


    // $ANTLR start "rule__SpecieBlock__Group__9__Impl"
    // InternalGsl.g:2211:1: rule__SpecieBlock__Group__9__Impl : ( ( rule__SpecieBlock__ContainsactionAssignment_9 ) ) ;
    public final void rule__SpecieBlock__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2215:1: ( ( ( rule__SpecieBlock__ContainsactionAssignment_9 ) ) )
            // InternalGsl.g:2216:1: ( ( rule__SpecieBlock__ContainsactionAssignment_9 ) )
            {
            // InternalGsl.g:2216:1: ( ( rule__SpecieBlock__ContainsactionAssignment_9 ) )
            // InternalGsl.g:2217:2: ( rule__SpecieBlock__ContainsactionAssignment_9 )
            {
             before(grammarAccess.getSpecieBlockAccess().getContainsactionAssignment_9()); 
            // InternalGsl.g:2218:2: ( rule__SpecieBlock__ContainsactionAssignment_9 )
            // InternalGsl.g:2218:3: rule__SpecieBlock__ContainsactionAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__ContainsactionAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSpecieBlockAccess().getContainsactionAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__9__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__10"
    // InternalGsl.g:2226:1: rule__SpecieBlock__Group__10 : rule__SpecieBlock__Group__10__Impl rule__SpecieBlock__Group__11 ;
    public final void rule__SpecieBlock__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2230:1: ( rule__SpecieBlock__Group__10__Impl rule__SpecieBlock__Group__11 )
            // InternalGsl.g:2231:2: rule__SpecieBlock__Group__10__Impl rule__SpecieBlock__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__SpecieBlock__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__11();

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
    // $ANTLR end "rule__SpecieBlock__Group__10"


    // $ANTLR start "rule__SpecieBlock__Group__10__Impl"
    // InternalGsl.g:2238:1: rule__SpecieBlock__Group__10__Impl : ( ( rule__SpecieBlock__Group_10__0 )* ) ;
    public final void rule__SpecieBlock__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2242:1: ( ( ( rule__SpecieBlock__Group_10__0 )* ) )
            // InternalGsl.g:2243:1: ( ( rule__SpecieBlock__Group_10__0 )* )
            {
            // InternalGsl.g:2243:1: ( ( rule__SpecieBlock__Group_10__0 )* )
            // InternalGsl.g:2244:2: ( rule__SpecieBlock__Group_10__0 )*
            {
             before(grammarAccess.getSpecieBlockAccess().getGroup_10()); 
            // InternalGsl.g:2245:2: ( rule__SpecieBlock__Group_10__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalGsl.g:2245:3: rule__SpecieBlock__Group_10__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SpecieBlock__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSpecieBlockAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__10__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__11"
    // InternalGsl.g:2253:1: rule__SpecieBlock__Group__11 : rule__SpecieBlock__Group__11__Impl rule__SpecieBlock__Group__12 ;
    public final void rule__SpecieBlock__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2257:1: ( rule__SpecieBlock__Group__11__Impl rule__SpecieBlock__Group__12 )
            // InternalGsl.g:2258:2: rule__SpecieBlock__Group__11__Impl rule__SpecieBlock__Group__12
            {
            pushFollow(FOLLOW_22);
            rule__SpecieBlock__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__12();

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
    // $ANTLR end "rule__SpecieBlock__Group__11"


    // $ANTLR start "rule__SpecieBlock__Group__11__Impl"
    // InternalGsl.g:2265:1: rule__SpecieBlock__Group__11__Impl : ( '}' ) ;
    public final void rule__SpecieBlock__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2269:1: ( ( '}' ) )
            // InternalGsl.g:2270:1: ( '}' )
            {
            // InternalGsl.g:2270:1: ( '}' )
            // InternalGsl.g:2271:2: '}'
            {
             before(grammarAccess.getSpecieBlockAccess().getRightCurlyBracketKeyword_11()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__11__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__12"
    // InternalGsl.g:2280:1: rule__SpecieBlock__Group__12 : rule__SpecieBlock__Group__12__Impl rule__SpecieBlock__Group__13 ;
    public final void rule__SpecieBlock__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2284:1: ( rule__SpecieBlock__Group__12__Impl rule__SpecieBlock__Group__13 )
            // InternalGsl.g:2285:2: rule__SpecieBlock__Group__12__Impl rule__SpecieBlock__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__SpecieBlock__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__13();

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
    // $ANTLR end "rule__SpecieBlock__Group__12"


    // $ANTLR start "rule__SpecieBlock__Group__12__Impl"
    // InternalGsl.g:2292:1: rule__SpecieBlock__Group__12__Impl : ( 'haspropertie' ) ;
    public final void rule__SpecieBlock__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2296:1: ( ( 'haspropertie' ) )
            // InternalGsl.g:2297:1: ( 'haspropertie' )
            {
            // InternalGsl.g:2297:1: ( 'haspropertie' )
            // InternalGsl.g:2298:2: 'haspropertie'
            {
             before(grammarAccess.getSpecieBlockAccess().getHaspropertieKeyword_12()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getHaspropertieKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__12__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__13"
    // InternalGsl.g:2307:1: rule__SpecieBlock__Group__13 : rule__SpecieBlock__Group__13__Impl rule__SpecieBlock__Group__14 ;
    public final void rule__SpecieBlock__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2311:1: ( rule__SpecieBlock__Group__13__Impl rule__SpecieBlock__Group__14 )
            // InternalGsl.g:2312:2: rule__SpecieBlock__Group__13__Impl rule__SpecieBlock__Group__14
            {
            pushFollow(FOLLOW_23);
            rule__SpecieBlock__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__14();

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
    // $ANTLR end "rule__SpecieBlock__Group__13"


    // $ANTLR start "rule__SpecieBlock__Group__13__Impl"
    // InternalGsl.g:2319:1: rule__SpecieBlock__Group__13__Impl : ( '{' ) ;
    public final void rule__SpecieBlock__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2323:1: ( ( '{' ) )
            // InternalGsl.g:2324:1: ( '{' )
            {
            // InternalGsl.g:2324:1: ( '{' )
            // InternalGsl.g:2325:2: '{'
            {
             before(grammarAccess.getSpecieBlockAccess().getLeftCurlyBracketKeyword_13()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getLeftCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__13__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__14"
    // InternalGsl.g:2334:1: rule__SpecieBlock__Group__14 : rule__SpecieBlock__Group__14__Impl rule__SpecieBlock__Group__15 ;
    public final void rule__SpecieBlock__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2338:1: ( rule__SpecieBlock__Group__14__Impl rule__SpecieBlock__Group__15 )
            // InternalGsl.g:2339:2: rule__SpecieBlock__Group__14__Impl rule__SpecieBlock__Group__15
            {
            pushFollow(FOLLOW_8);
            rule__SpecieBlock__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__15();

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
    // $ANTLR end "rule__SpecieBlock__Group__14"


    // $ANTLR start "rule__SpecieBlock__Group__14__Impl"
    // InternalGsl.g:2346:1: rule__SpecieBlock__Group__14__Impl : ( ( rule__SpecieBlock__HaspropertieAssignment_14 ) ) ;
    public final void rule__SpecieBlock__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2350:1: ( ( ( rule__SpecieBlock__HaspropertieAssignment_14 ) ) )
            // InternalGsl.g:2351:1: ( ( rule__SpecieBlock__HaspropertieAssignment_14 ) )
            {
            // InternalGsl.g:2351:1: ( ( rule__SpecieBlock__HaspropertieAssignment_14 ) )
            // InternalGsl.g:2352:2: ( rule__SpecieBlock__HaspropertieAssignment_14 )
            {
             before(grammarAccess.getSpecieBlockAccess().getHaspropertieAssignment_14()); 
            // InternalGsl.g:2353:2: ( rule__SpecieBlock__HaspropertieAssignment_14 )
            // InternalGsl.g:2353:3: rule__SpecieBlock__HaspropertieAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__HaspropertieAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getSpecieBlockAccess().getHaspropertieAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__14__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__15"
    // InternalGsl.g:2361:1: rule__SpecieBlock__Group__15 : rule__SpecieBlock__Group__15__Impl rule__SpecieBlock__Group__16 ;
    public final void rule__SpecieBlock__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2365:1: ( rule__SpecieBlock__Group__15__Impl rule__SpecieBlock__Group__16 )
            // InternalGsl.g:2366:2: rule__SpecieBlock__Group__15__Impl rule__SpecieBlock__Group__16
            {
            pushFollow(FOLLOW_8);
            rule__SpecieBlock__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__16();

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
    // $ANTLR end "rule__SpecieBlock__Group__15"


    // $ANTLR start "rule__SpecieBlock__Group__15__Impl"
    // InternalGsl.g:2373:1: rule__SpecieBlock__Group__15__Impl : ( ( rule__SpecieBlock__Group_15__0 )* ) ;
    public final void rule__SpecieBlock__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2377:1: ( ( ( rule__SpecieBlock__Group_15__0 )* ) )
            // InternalGsl.g:2378:1: ( ( rule__SpecieBlock__Group_15__0 )* )
            {
            // InternalGsl.g:2378:1: ( ( rule__SpecieBlock__Group_15__0 )* )
            // InternalGsl.g:2379:2: ( rule__SpecieBlock__Group_15__0 )*
            {
             before(grammarAccess.getSpecieBlockAccess().getGroup_15()); 
            // InternalGsl.g:2380:2: ( rule__SpecieBlock__Group_15__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalGsl.g:2380:3: rule__SpecieBlock__Group_15__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SpecieBlock__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSpecieBlockAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__15__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__16"
    // InternalGsl.g:2388:1: rule__SpecieBlock__Group__16 : rule__SpecieBlock__Group__16__Impl rule__SpecieBlock__Group__17 ;
    public final void rule__SpecieBlock__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2392:1: ( rule__SpecieBlock__Group__16__Impl rule__SpecieBlock__Group__17 )
            // InternalGsl.g:2393:2: rule__SpecieBlock__Group__16__Impl rule__SpecieBlock__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__SpecieBlock__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__17();

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
    // $ANTLR end "rule__SpecieBlock__Group__16"


    // $ANTLR start "rule__SpecieBlock__Group__16__Impl"
    // InternalGsl.g:2400:1: rule__SpecieBlock__Group__16__Impl : ( '}' ) ;
    public final void rule__SpecieBlock__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2404:1: ( ( '}' ) )
            // InternalGsl.g:2405:1: ( '}' )
            {
            // InternalGsl.g:2405:1: ( '}' )
            // InternalGsl.g:2406:2: '}'
            {
             before(grammarAccess.getSpecieBlockAccess().getRightCurlyBracketKeyword_16()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__16__Impl"


    // $ANTLR start "rule__SpecieBlock__Group__17"
    // InternalGsl.g:2415:1: rule__SpecieBlock__Group__17 : rule__SpecieBlock__Group__17__Impl ;
    public final void rule__SpecieBlock__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2419:1: ( rule__SpecieBlock__Group__17__Impl )
            // InternalGsl.g:2420:2: rule__SpecieBlock__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group__17__Impl();

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
    // $ANTLR end "rule__SpecieBlock__Group__17"


    // $ANTLR start "rule__SpecieBlock__Group__17__Impl"
    // InternalGsl.g:2426:1: rule__SpecieBlock__Group__17__Impl : ( '}' ) ;
    public final void rule__SpecieBlock__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2430:1: ( ( '}' ) )
            // InternalGsl.g:2431:1: ( '}' )
            {
            // InternalGsl.g:2431:1: ( '}' )
            // InternalGsl.g:2432:2: '}'
            {
             before(grammarAccess.getSpecieBlockAccess().getRightCurlyBracketKeyword_17()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group__17__Impl"


    // $ANTLR start "rule__SpecieBlock__Group_4__0"
    // InternalGsl.g:2442:1: rule__SpecieBlock__Group_4__0 : rule__SpecieBlock__Group_4__0__Impl rule__SpecieBlock__Group_4__1 ;
    public final void rule__SpecieBlock__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2446:1: ( rule__SpecieBlock__Group_4__0__Impl rule__SpecieBlock__Group_4__1 )
            // InternalGsl.g:2447:2: rule__SpecieBlock__Group_4__0__Impl rule__SpecieBlock__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__SpecieBlock__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group_4__1();

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
    // $ANTLR end "rule__SpecieBlock__Group_4__0"


    // $ANTLR start "rule__SpecieBlock__Group_4__0__Impl"
    // InternalGsl.g:2454:1: rule__SpecieBlock__Group_4__0__Impl : ( 'aspectName' ) ;
    public final void rule__SpecieBlock__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2458:1: ( ( 'aspectName' ) )
            // InternalGsl.g:2459:1: ( 'aspectName' )
            {
            // InternalGsl.g:2459:1: ( 'aspectName' )
            // InternalGsl.g:2460:2: 'aspectName'
            {
             before(grammarAccess.getSpecieBlockAccess().getAspectNameKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getAspectNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group_4__0__Impl"


    // $ANTLR start "rule__SpecieBlock__Group_4__1"
    // InternalGsl.g:2469:1: rule__SpecieBlock__Group_4__1 : rule__SpecieBlock__Group_4__1__Impl ;
    public final void rule__SpecieBlock__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2473:1: ( rule__SpecieBlock__Group_4__1__Impl )
            // InternalGsl.g:2474:2: rule__SpecieBlock__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group_4__1__Impl();

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
    // $ANTLR end "rule__SpecieBlock__Group_4__1"


    // $ANTLR start "rule__SpecieBlock__Group_4__1__Impl"
    // InternalGsl.g:2480:1: rule__SpecieBlock__Group_4__1__Impl : ( ( rule__SpecieBlock__AspectNameAssignment_4_1 ) ) ;
    public final void rule__SpecieBlock__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2484:1: ( ( ( rule__SpecieBlock__AspectNameAssignment_4_1 ) ) )
            // InternalGsl.g:2485:1: ( ( rule__SpecieBlock__AspectNameAssignment_4_1 ) )
            {
            // InternalGsl.g:2485:1: ( ( rule__SpecieBlock__AspectNameAssignment_4_1 ) )
            // InternalGsl.g:2486:2: ( rule__SpecieBlock__AspectNameAssignment_4_1 )
            {
             before(grammarAccess.getSpecieBlockAccess().getAspectNameAssignment_4_1()); 
            // InternalGsl.g:2487:2: ( rule__SpecieBlock__AspectNameAssignment_4_1 )
            // InternalGsl.g:2487:3: rule__SpecieBlock__AspectNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__AspectNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecieBlockAccess().getAspectNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group_4__1__Impl"


    // $ANTLR start "rule__SpecieBlock__Group_5__0"
    // InternalGsl.g:2496:1: rule__SpecieBlock__Group_5__0 : rule__SpecieBlock__Group_5__0__Impl rule__SpecieBlock__Group_5__1 ;
    public final void rule__SpecieBlock__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2500:1: ( rule__SpecieBlock__Group_5__0__Impl rule__SpecieBlock__Group_5__1 )
            // InternalGsl.g:2501:2: rule__SpecieBlock__Group_5__0__Impl rule__SpecieBlock__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__SpecieBlock__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group_5__1();

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
    // $ANTLR end "rule__SpecieBlock__Group_5__0"


    // $ANTLR start "rule__SpecieBlock__Group_5__0__Impl"
    // InternalGsl.g:2508:1: rule__SpecieBlock__Group_5__0__Impl : ( 'Color' ) ;
    public final void rule__SpecieBlock__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2512:1: ( ( 'Color' ) )
            // InternalGsl.g:2513:1: ( 'Color' )
            {
            // InternalGsl.g:2513:1: ( 'Color' )
            // InternalGsl.g:2514:2: 'Color'
            {
             before(grammarAccess.getSpecieBlockAccess().getColorKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getColorKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group_5__0__Impl"


    // $ANTLR start "rule__SpecieBlock__Group_5__1"
    // InternalGsl.g:2523:1: rule__SpecieBlock__Group_5__1 : rule__SpecieBlock__Group_5__1__Impl ;
    public final void rule__SpecieBlock__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2527:1: ( rule__SpecieBlock__Group_5__1__Impl )
            // InternalGsl.g:2528:2: rule__SpecieBlock__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group_5__1__Impl();

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
    // $ANTLR end "rule__SpecieBlock__Group_5__1"


    // $ANTLR start "rule__SpecieBlock__Group_5__1__Impl"
    // InternalGsl.g:2534:1: rule__SpecieBlock__Group_5__1__Impl : ( ( rule__SpecieBlock__ColorAssignment_5_1 ) ) ;
    public final void rule__SpecieBlock__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2538:1: ( ( ( rule__SpecieBlock__ColorAssignment_5_1 ) ) )
            // InternalGsl.g:2539:1: ( ( rule__SpecieBlock__ColorAssignment_5_1 ) )
            {
            // InternalGsl.g:2539:1: ( ( rule__SpecieBlock__ColorAssignment_5_1 ) )
            // InternalGsl.g:2540:2: ( rule__SpecieBlock__ColorAssignment_5_1 )
            {
             before(grammarAccess.getSpecieBlockAccess().getColorAssignment_5_1()); 
            // InternalGsl.g:2541:2: ( rule__SpecieBlock__ColorAssignment_5_1 )
            // InternalGsl.g:2541:3: rule__SpecieBlock__ColorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__ColorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecieBlockAccess().getColorAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group_5__1__Impl"


    // $ANTLR start "rule__SpecieBlock__Group_6__0"
    // InternalGsl.g:2550:1: rule__SpecieBlock__Group_6__0 : rule__SpecieBlock__Group_6__0__Impl rule__SpecieBlock__Group_6__1 ;
    public final void rule__SpecieBlock__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2554:1: ( rule__SpecieBlock__Group_6__0__Impl rule__SpecieBlock__Group_6__1 )
            // InternalGsl.g:2555:2: rule__SpecieBlock__Group_6__0__Impl rule__SpecieBlock__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__SpecieBlock__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group_6__1();

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
    // $ANTLR end "rule__SpecieBlock__Group_6__0"


    // $ANTLR start "rule__SpecieBlock__Group_6__0__Impl"
    // InternalGsl.g:2562:1: rule__SpecieBlock__Group_6__0__Impl : ( 'skillofspecie' ) ;
    public final void rule__SpecieBlock__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2566:1: ( ( 'skillofspecie' ) )
            // InternalGsl.g:2567:1: ( 'skillofspecie' )
            {
            // InternalGsl.g:2567:1: ( 'skillofspecie' )
            // InternalGsl.g:2568:2: 'skillofspecie'
            {
             before(grammarAccess.getSpecieBlockAccess().getSkillofspecieKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getSkillofspecieKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group_6__0__Impl"


    // $ANTLR start "rule__SpecieBlock__Group_6__1"
    // InternalGsl.g:2577:1: rule__SpecieBlock__Group_6__1 : rule__SpecieBlock__Group_6__1__Impl ;
    public final void rule__SpecieBlock__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2581:1: ( rule__SpecieBlock__Group_6__1__Impl )
            // InternalGsl.g:2582:2: rule__SpecieBlock__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group_6__1__Impl();

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
    // $ANTLR end "rule__SpecieBlock__Group_6__1"


    // $ANTLR start "rule__SpecieBlock__Group_6__1__Impl"
    // InternalGsl.g:2588:1: rule__SpecieBlock__Group_6__1__Impl : ( ( rule__SpecieBlock__SkillofspecieAssignment_6_1 ) ) ;
    public final void rule__SpecieBlock__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2592:1: ( ( ( rule__SpecieBlock__SkillofspecieAssignment_6_1 ) ) )
            // InternalGsl.g:2593:1: ( ( rule__SpecieBlock__SkillofspecieAssignment_6_1 ) )
            {
            // InternalGsl.g:2593:1: ( ( rule__SpecieBlock__SkillofspecieAssignment_6_1 ) )
            // InternalGsl.g:2594:2: ( rule__SpecieBlock__SkillofspecieAssignment_6_1 )
            {
             before(grammarAccess.getSpecieBlockAccess().getSkillofspecieAssignment_6_1()); 
            // InternalGsl.g:2595:2: ( rule__SpecieBlock__SkillofspecieAssignment_6_1 )
            // InternalGsl.g:2595:3: rule__SpecieBlock__SkillofspecieAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__SkillofspecieAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecieBlockAccess().getSkillofspecieAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group_6__1__Impl"


    // $ANTLR start "rule__SpecieBlock__Group_10__0"
    // InternalGsl.g:2604:1: rule__SpecieBlock__Group_10__0 : rule__SpecieBlock__Group_10__0__Impl rule__SpecieBlock__Group_10__1 ;
    public final void rule__SpecieBlock__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2608:1: ( rule__SpecieBlock__Group_10__0__Impl rule__SpecieBlock__Group_10__1 )
            // InternalGsl.g:2609:2: rule__SpecieBlock__Group_10__0__Impl rule__SpecieBlock__Group_10__1
            {
            pushFollow(FOLLOW_21);
            rule__SpecieBlock__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group_10__1();

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
    // $ANTLR end "rule__SpecieBlock__Group_10__0"


    // $ANTLR start "rule__SpecieBlock__Group_10__0__Impl"
    // InternalGsl.g:2616:1: rule__SpecieBlock__Group_10__0__Impl : ( ',' ) ;
    public final void rule__SpecieBlock__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2620:1: ( ( ',' ) )
            // InternalGsl.g:2621:1: ( ',' )
            {
            // InternalGsl.g:2621:1: ( ',' )
            // InternalGsl.g:2622:2: ','
            {
             before(grammarAccess.getSpecieBlockAccess().getCommaKeyword_10_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group_10__0__Impl"


    // $ANTLR start "rule__SpecieBlock__Group_10__1"
    // InternalGsl.g:2631:1: rule__SpecieBlock__Group_10__1 : rule__SpecieBlock__Group_10__1__Impl ;
    public final void rule__SpecieBlock__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2635:1: ( rule__SpecieBlock__Group_10__1__Impl )
            // InternalGsl.g:2636:2: rule__SpecieBlock__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group_10__1__Impl();

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
    // $ANTLR end "rule__SpecieBlock__Group_10__1"


    // $ANTLR start "rule__SpecieBlock__Group_10__1__Impl"
    // InternalGsl.g:2642:1: rule__SpecieBlock__Group_10__1__Impl : ( ( rule__SpecieBlock__ContainsactionAssignment_10_1 ) ) ;
    public final void rule__SpecieBlock__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2646:1: ( ( ( rule__SpecieBlock__ContainsactionAssignment_10_1 ) ) )
            // InternalGsl.g:2647:1: ( ( rule__SpecieBlock__ContainsactionAssignment_10_1 ) )
            {
            // InternalGsl.g:2647:1: ( ( rule__SpecieBlock__ContainsactionAssignment_10_1 ) )
            // InternalGsl.g:2648:2: ( rule__SpecieBlock__ContainsactionAssignment_10_1 )
            {
             before(grammarAccess.getSpecieBlockAccess().getContainsactionAssignment_10_1()); 
            // InternalGsl.g:2649:2: ( rule__SpecieBlock__ContainsactionAssignment_10_1 )
            // InternalGsl.g:2649:3: rule__SpecieBlock__ContainsactionAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__ContainsactionAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecieBlockAccess().getContainsactionAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group_10__1__Impl"


    // $ANTLR start "rule__SpecieBlock__Group_15__0"
    // InternalGsl.g:2658:1: rule__SpecieBlock__Group_15__0 : rule__SpecieBlock__Group_15__0__Impl rule__SpecieBlock__Group_15__1 ;
    public final void rule__SpecieBlock__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2662:1: ( rule__SpecieBlock__Group_15__0__Impl rule__SpecieBlock__Group_15__1 )
            // InternalGsl.g:2663:2: rule__SpecieBlock__Group_15__0__Impl rule__SpecieBlock__Group_15__1
            {
            pushFollow(FOLLOW_23);
            rule__SpecieBlock__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group_15__1();

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
    // $ANTLR end "rule__SpecieBlock__Group_15__0"


    // $ANTLR start "rule__SpecieBlock__Group_15__0__Impl"
    // InternalGsl.g:2670:1: rule__SpecieBlock__Group_15__0__Impl : ( ',' ) ;
    public final void rule__SpecieBlock__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2674:1: ( ( ',' ) )
            // InternalGsl.g:2675:1: ( ',' )
            {
            // InternalGsl.g:2675:1: ( ',' )
            // InternalGsl.g:2676:2: ','
            {
             before(grammarAccess.getSpecieBlockAccess().getCommaKeyword_15_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getCommaKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group_15__0__Impl"


    // $ANTLR start "rule__SpecieBlock__Group_15__1"
    // InternalGsl.g:2685:1: rule__SpecieBlock__Group_15__1 : rule__SpecieBlock__Group_15__1__Impl ;
    public final void rule__SpecieBlock__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2689:1: ( rule__SpecieBlock__Group_15__1__Impl )
            // InternalGsl.g:2690:2: rule__SpecieBlock__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__Group_15__1__Impl();

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
    // $ANTLR end "rule__SpecieBlock__Group_15__1"


    // $ANTLR start "rule__SpecieBlock__Group_15__1__Impl"
    // InternalGsl.g:2696:1: rule__SpecieBlock__Group_15__1__Impl : ( ( rule__SpecieBlock__HaspropertieAssignment_15_1 ) ) ;
    public final void rule__SpecieBlock__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2700:1: ( ( ( rule__SpecieBlock__HaspropertieAssignment_15_1 ) ) )
            // InternalGsl.g:2701:1: ( ( rule__SpecieBlock__HaspropertieAssignment_15_1 ) )
            {
            // InternalGsl.g:2701:1: ( ( rule__SpecieBlock__HaspropertieAssignment_15_1 ) )
            // InternalGsl.g:2702:2: ( rule__SpecieBlock__HaspropertieAssignment_15_1 )
            {
             before(grammarAccess.getSpecieBlockAccess().getHaspropertieAssignment_15_1()); 
            // InternalGsl.g:2703:2: ( rule__SpecieBlock__HaspropertieAssignment_15_1 )
            // InternalGsl.g:2703:3: rule__SpecieBlock__HaspropertieAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__SpecieBlock__HaspropertieAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecieBlockAccess().getHaspropertieAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__Group_15__1__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__0"
    // InternalGsl.g:2712:1: rule__ExperimentBlock__Group__0 : rule__ExperimentBlock__Group__0__Impl rule__ExperimentBlock__Group__1 ;
    public final void rule__ExperimentBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2716:1: ( rule__ExperimentBlock__Group__0__Impl rule__ExperimentBlock__Group__1 )
            // InternalGsl.g:2717:2: rule__ExperimentBlock__Group__0__Impl rule__ExperimentBlock__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ExperimentBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__1();

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
    // $ANTLR end "rule__ExperimentBlock__Group__0"


    // $ANTLR start "rule__ExperimentBlock__Group__0__Impl"
    // InternalGsl.g:2724:1: rule__ExperimentBlock__Group__0__Impl : ( 'ExperimentBlock' ) ;
    public final void rule__ExperimentBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2728:1: ( ( 'ExperimentBlock' ) )
            // InternalGsl.g:2729:1: ( 'ExperimentBlock' )
            {
            // InternalGsl.g:2729:1: ( 'ExperimentBlock' )
            // InternalGsl.g:2730:2: 'ExperimentBlock'
            {
             before(grammarAccess.getExperimentBlockAccess().getExperimentBlockKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExperimentBlockAccess().getExperimentBlockKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__0__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__1"
    // InternalGsl.g:2739:1: rule__ExperimentBlock__Group__1 : rule__ExperimentBlock__Group__1__Impl rule__ExperimentBlock__Group__2 ;
    public final void rule__ExperimentBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2743:1: ( rule__ExperimentBlock__Group__1__Impl rule__ExperimentBlock__Group__2 )
            // InternalGsl.g:2744:2: rule__ExperimentBlock__Group__1__Impl rule__ExperimentBlock__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ExperimentBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__2();

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
    // $ANTLR end "rule__ExperimentBlock__Group__1"


    // $ANTLR start "rule__ExperimentBlock__Group__1__Impl"
    // InternalGsl.g:2751:1: rule__ExperimentBlock__Group__1__Impl : ( ( rule__ExperimentBlock__ExperimentNameAssignment_1 ) ) ;
    public final void rule__ExperimentBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2755:1: ( ( ( rule__ExperimentBlock__ExperimentNameAssignment_1 ) ) )
            // InternalGsl.g:2756:1: ( ( rule__ExperimentBlock__ExperimentNameAssignment_1 ) )
            {
            // InternalGsl.g:2756:1: ( ( rule__ExperimentBlock__ExperimentNameAssignment_1 ) )
            // InternalGsl.g:2757:2: ( rule__ExperimentBlock__ExperimentNameAssignment_1 )
            {
             before(grammarAccess.getExperimentBlockAccess().getExperimentNameAssignment_1()); 
            // InternalGsl.g:2758:2: ( rule__ExperimentBlock__ExperimentNameAssignment_1 )
            // InternalGsl.g:2758:3: rule__ExperimentBlock__ExperimentNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__ExperimentNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExperimentBlockAccess().getExperimentNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__1__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__2"
    // InternalGsl.g:2766:1: rule__ExperimentBlock__Group__2 : rule__ExperimentBlock__Group__2__Impl rule__ExperimentBlock__Group__3 ;
    public final void rule__ExperimentBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2770:1: ( rule__ExperimentBlock__Group__2__Impl rule__ExperimentBlock__Group__3 )
            // InternalGsl.g:2771:2: rule__ExperimentBlock__Group__2__Impl rule__ExperimentBlock__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__ExperimentBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__3();

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
    // $ANTLR end "rule__ExperimentBlock__Group__2"


    // $ANTLR start "rule__ExperimentBlock__Group__2__Impl"
    // InternalGsl.g:2778:1: rule__ExperimentBlock__Group__2__Impl : ( '{' ) ;
    public final void rule__ExperimentBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2782:1: ( ( '{' ) )
            // InternalGsl.g:2783:1: ( '{' )
            {
            // InternalGsl.g:2783:1: ( '{' )
            // InternalGsl.g:2784:2: '{'
            {
             before(grammarAccess.getExperimentBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExperimentBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__2__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__3"
    // InternalGsl.g:2793:1: rule__ExperimentBlock__Group__3 : rule__ExperimentBlock__Group__3__Impl rule__ExperimentBlock__Group__4 ;
    public final void rule__ExperimentBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2797:1: ( rule__ExperimentBlock__Group__3__Impl rule__ExperimentBlock__Group__4 )
            // InternalGsl.g:2798:2: rule__ExperimentBlock__Group__3__Impl rule__ExperimentBlock__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ExperimentBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__4();

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
    // $ANTLR end "rule__ExperimentBlock__Group__3"


    // $ANTLR start "rule__ExperimentBlock__Group__3__Impl"
    // InternalGsl.g:2805:1: rule__ExperimentBlock__Group__3__Impl : ( ( rule__ExperimentBlock__Group_3__0 )? ) ;
    public final void rule__ExperimentBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2809:1: ( ( ( rule__ExperimentBlock__Group_3__0 )? ) )
            // InternalGsl.g:2810:1: ( ( rule__ExperimentBlock__Group_3__0 )? )
            {
            // InternalGsl.g:2810:1: ( ( rule__ExperimentBlock__Group_3__0 )? )
            // InternalGsl.g:2811:2: ( rule__ExperimentBlock__Group_3__0 )?
            {
             before(grammarAccess.getExperimentBlockAccess().getGroup_3()); 
            // InternalGsl.g:2812:2: ( rule__ExperimentBlock__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGsl.g:2812:3: rule__ExperimentBlock__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExperimentBlock__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExperimentBlockAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__3__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__4"
    // InternalGsl.g:2820:1: rule__ExperimentBlock__Group__4 : rule__ExperimentBlock__Group__4__Impl rule__ExperimentBlock__Group__5 ;
    public final void rule__ExperimentBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2824:1: ( rule__ExperimentBlock__Group__4__Impl rule__ExperimentBlock__Group__5 )
            // InternalGsl.g:2825:2: rule__ExperimentBlock__Group__4__Impl rule__ExperimentBlock__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__ExperimentBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__5();

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
    // $ANTLR end "rule__ExperimentBlock__Group__4"


    // $ANTLR start "rule__ExperimentBlock__Group__4__Impl"
    // InternalGsl.g:2832:1: rule__ExperimentBlock__Group__4__Impl : ( 'hasparameter' ) ;
    public final void rule__ExperimentBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2836:1: ( ( 'hasparameter' ) )
            // InternalGsl.g:2837:1: ( 'hasparameter' )
            {
            // InternalGsl.g:2837:1: ( 'hasparameter' )
            // InternalGsl.g:2838:2: 'hasparameter'
            {
             before(grammarAccess.getExperimentBlockAccess().getHasparameterKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getExperimentBlockAccess().getHasparameterKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__4__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__5"
    // InternalGsl.g:2847:1: rule__ExperimentBlock__Group__5 : rule__ExperimentBlock__Group__5__Impl rule__ExperimentBlock__Group__6 ;
    public final void rule__ExperimentBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2851:1: ( rule__ExperimentBlock__Group__5__Impl rule__ExperimentBlock__Group__6 )
            // InternalGsl.g:2852:2: rule__ExperimentBlock__Group__5__Impl rule__ExperimentBlock__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__ExperimentBlock__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__6();

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
    // $ANTLR end "rule__ExperimentBlock__Group__5"


    // $ANTLR start "rule__ExperimentBlock__Group__5__Impl"
    // InternalGsl.g:2859:1: rule__ExperimentBlock__Group__5__Impl : ( '{' ) ;
    public final void rule__ExperimentBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2863:1: ( ( '{' ) )
            // InternalGsl.g:2864:1: ( '{' )
            {
            // InternalGsl.g:2864:1: ( '{' )
            // InternalGsl.g:2865:2: '{'
            {
             before(grammarAccess.getExperimentBlockAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExperimentBlockAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__5__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__6"
    // InternalGsl.g:2874:1: rule__ExperimentBlock__Group__6 : rule__ExperimentBlock__Group__6__Impl rule__ExperimentBlock__Group__7 ;
    public final void rule__ExperimentBlock__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2878:1: ( rule__ExperimentBlock__Group__6__Impl rule__ExperimentBlock__Group__7 )
            // InternalGsl.g:2879:2: rule__ExperimentBlock__Group__6__Impl rule__ExperimentBlock__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__ExperimentBlock__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__7();

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
    // $ANTLR end "rule__ExperimentBlock__Group__6"


    // $ANTLR start "rule__ExperimentBlock__Group__6__Impl"
    // InternalGsl.g:2886:1: rule__ExperimentBlock__Group__6__Impl : ( ( rule__ExperimentBlock__HasparameterAssignment_6 ) ) ;
    public final void rule__ExperimentBlock__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2890:1: ( ( ( rule__ExperimentBlock__HasparameterAssignment_6 ) ) )
            // InternalGsl.g:2891:1: ( ( rule__ExperimentBlock__HasparameterAssignment_6 ) )
            {
            // InternalGsl.g:2891:1: ( ( rule__ExperimentBlock__HasparameterAssignment_6 ) )
            // InternalGsl.g:2892:2: ( rule__ExperimentBlock__HasparameterAssignment_6 )
            {
             before(grammarAccess.getExperimentBlockAccess().getHasparameterAssignment_6()); 
            // InternalGsl.g:2893:2: ( rule__ExperimentBlock__HasparameterAssignment_6 )
            // InternalGsl.g:2893:3: rule__ExperimentBlock__HasparameterAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__HasparameterAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExperimentBlockAccess().getHasparameterAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__6__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__7"
    // InternalGsl.g:2901:1: rule__ExperimentBlock__Group__7 : rule__ExperimentBlock__Group__7__Impl rule__ExperimentBlock__Group__8 ;
    public final void rule__ExperimentBlock__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2905:1: ( rule__ExperimentBlock__Group__7__Impl rule__ExperimentBlock__Group__8 )
            // InternalGsl.g:2906:2: rule__ExperimentBlock__Group__7__Impl rule__ExperimentBlock__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__ExperimentBlock__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__8();

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
    // $ANTLR end "rule__ExperimentBlock__Group__7"


    // $ANTLR start "rule__ExperimentBlock__Group__7__Impl"
    // InternalGsl.g:2913:1: rule__ExperimentBlock__Group__7__Impl : ( ( rule__ExperimentBlock__Group_7__0 )* ) ;
    public final void rule__ExperimentBlock__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2917:1: ( ( ( rule__ExperimentBlock__Group_7__0 )* ) )
            // InternalGsl.g:2918:1: ( ( rule__ExperimentBlock__Group_7__0 )* )
            {
            // InternalGsl.g:2918:1: ( ( rule__ExperimentBlock__Group_7__0 )* )
            // InternalGsl.g:2919:2: ( rule__ExperimentBlock__Group_7__0 )*
            {
             before(grammarAccess.getExperimentBlockAccess().getGroup_7()); 
            // InternalGsl.g:2920:2: ( rule__ExperimentBlock__Group_7__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalGsl.g:2920:3: rule__ExperimentBlock__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ExperimentBlock__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getExperimentBlockAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__7__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__8"
    // InternalGsl.g:2928:1: rule__ExperimentBlock__Group__8 : rule__ExperimentBlock__Group__8__Impl rule__ExperimentBlock__Group__9 ;
    public final void rule__ExperimentBlock__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2932:1: ( rule__ExperimentBlock__Group__8__Impl rule__ExperimentBlock__Group__9 )
            // InternalGsl.g:2933:2: rule__ExperimentBlock__Group__8__Impl rule__ExperimentBlock__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__ExperimentBlock__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__9();

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
    // $ANTLR end "rule__ExperimentBlock__Group__8"


    // $ANTLR start "rule__ExperimentBlock__Group__8__Impl"
    // InternalGsl.g:2940:1: rule__ExperimentBlock__Group__8__Impl : ( '}' ) ;
    public final void rule__ExperimentBlock__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2944:1: ( ( '}' ) )
            // InternalGsl.g:2945:1: ( '}' )
            {
            // InternalGsl.g:2945:1: ( '}' )
            // InternalGsl.g:2946:2: '}'
            {
             before(grammarAccess.getExperimentBlockAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExperimentBlockAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__8__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__9"
    // InternalGsl.g:2955:1: rule__ExperimentBlock__Group__9 : rule__ExperimentBlock__Group__9__Impl rule__ExperimentBlock__Group__10 ;
    public final void rule__ExperimentBlock__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2959:1: ( rule__ExperimentBlock__Group__9__Impl rule__ExperimentBlock__Group__10 )
            // InternalGsl.g:2960:2: rule__ExperimentBlock__Group__9__Impl rule__ExperimentBlock__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__ExperimentBlock__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__10();

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
    // $ANTLR end "rule__ExperimentBlock__Group__9"


    // $ANTLR start "rule__ExperimentBlock__Group__9__Impl"
    // InternalGsl.g:2967:1: rule__ExperimentBlock__Group__9__Impl : ( 'hasoutput' ) ;
    public final void rule__ExperimentBlock__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2971:1: ( ( 'hasoutput' ) )
            // InternalGsl.g:2972:1: ( 'hasoutput' )
            {
            // InternalGsl.g:2972:1: ( 'hasoutput' )
            // InternalGsl.g:2973:2: 'hasoutput'
            {
             before(grammarAccess.getExperimentBlockAccess().getHasoutputKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getExperimentBlockAccess().getHasoutputKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__9__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__10"
    // InternalGsl.g:2982:1: rule__ExperimentBlock__Group__10 : rule__ExperimentBlock__Group__10__Impl rule__ExperimentBlock__Group__11 ;
    public final void rule__ExperimentBlock__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2986:1: ( rule__ExperimentBlock__Group__10__Impl rule__ExperimentBlock__Group__11 )
            // InternalGsl.g:2987:2: rule__ExperimentBlock__Group__10__Impl rule__ExperimentBlock__Group__11
            {
            pushFollow(FOLLOW_27);
            rule__ExperimentBlock__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__11();

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
    // $ANTLR end "rule__ExperimentBlock__Group__10"


    // $ANTLR start "rule__ExperimentBlock__Group__10__Impl"
    // InternalGsl.g:2994:1: rule__ExperimentBlock__Group__10__Impl : ( '{' ) ;
    public final void rule__ExperimentBlock__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:2998:1: ( ( '{' ) )
            // InternalGsl.g:2999:1: ( '{' )
            {
            // InternalGsl.g:2999:1: ( '{' )
            // InternalGsl.g:3000:2: '{'
            {
             before(grammarAccess.getExperimentBlockAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExperimentBlockAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__10__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__11"
    // InternalGsl.g:3009:1: rule__ExperimentBlock__Group__11 : rule__ExperimentBlock__Group__11__Impl rule__ExperimentBlock__Group__12 ;
    public final void rule__ExperimentBlock__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3013:1: ( rule__ExperimentBlock__Group__11__Impl rule__ExperimentBlock__Group__12 )
            // InternalGsl.g:3014:2: rule__ExperimentBlock__Group__11__Impl rule__ExperimentBlock__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__ExperimentBlock__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__12();

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
    // $ANTLR end "rule__ExperimentBlock__Group__11"


    // $ANTLR start "rule__ExperimentBlock__Group__11__Impl"
    // InternalGsl.g:3021:1: rule__ExperimentBlock__Group__11__Impl : ( ( rule__ExperimentBlock__HasoutputAssignment_11 ) ) ;
    public final void rule__ExperimentBlock__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3025:1: ( ( ( rule__ExperimentBlock__HasoutputAssignment_11 ) ) )
            // InternalGsl.g:3026:1: ( ( rule__ExperimentBlock__HasoutputAssignment_11 ) )
            {
            // InternalGsl.g:3026:1: ( ( rule__ExperimentBlock__HasoutputAssignment_11 ) )
            // InternalGsl.g:3027:2: ( rule__ExperimentBlock__HasoutputAssignment_11 )
            {
             before(grammarAccess.getExperimentBlockAccess().getHasoutputAssignment_11()); 
            // InternalGsl.g:3028:2: ( rule__ExperimentBlock__HasoutputAssignment_11 )
            // InternalGsl.g:3028:3: rule__ExperimentBlock__HasoutputAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__HasoutputAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getExperimentBlockAccess().getHasoutputAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__11__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__12"
    // InternalGsl.g:3036:1: rule__ExperimentBlock__Group__12 : rule__ExperimentBlock__Group__12__Impl rule__ExperimentBlock__Group__13 ;
    public final void rule__ExperimentBlock__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3040:1: ( rule__ExperimentBlock__Group__12__Impl rule__ExperimentBlock__Group__13 )
            // InternalGsl.g:3041:2: rule__ExperimentBlock__Group__12__Impl rule__ExperimentBlock__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__ExperimentBlock__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__13();

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
    // $ANTLR end "rule__ExperimentBlock__Group__12"


    // $ANTLR start "rule__ExperimentBlock__Group__12__Impl"
    // InternalGsl.g:3048:1: rule__ExperimentBlock__Group__12__Impl : ( ( rule__ExperimentBlock__Group_12__0 )* ) ;
    public final void rule__ExperimentBlock__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3052:1: ( ( ( rule__ExperimentBlock__Group_12__0 )* ) )
            // InternalGsl.g:3053:1: ( ( rule__ExperimentBlock__Group_12__0 )* )
            {
            // InternalGsl.g:3053:1: ( ( rule__ExperimentBlock__Group_12__0 )* )
            // InternalGsl.g:3054:2: ( rule__ExperimentBlock__Group_12__0 )*
            {
             before(grammarAccess.getExperimentBlockAccess().getGroup_12()); 
            // InternalGsl.g:3055:2: ( rule__ExperimentBlock__Group_12__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalGsl.g:3055:3: rule__ExperimentBlock__Group_12__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ExperimentBlock__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getExperimentBlockAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__12__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__13"
    // InternalGsl.g:3063:1: rule__ExperimentBlock__Group__13 : rule__ExperimentBlock__Group__13__Impl rule__ExperimentBlock__Group__14 ;
    public final void rule__ExperimentBlock__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3067:1: ( rule__ExperimentBlock__Group__13__Impl rule__ExperimentBlock__Group__14 )
            // InternalGsl.g:3068:2: rule__ExperimentBlock__Group__13__Impl rule__ExperimentBlock__Group__14
            {
            pushFollow(FOLLOW_12);
            rule__ExperimentBlock__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__14();

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
    // $ANTLR end "rule__ExperimentBlock__Group__13"


    // $ANTLR start "rule__ExperimentBlock__Group__13__Impl"
    // InternalGsl.g:3075:1: rule__ExperimentBlock__Group__13__Impl : ( '}' ) ;
    public final void rule__ExperimentBlock__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3079:1: ( ( '}' ) )
            // InternalGsl.g:3080:1: ( '}' )
            {
            // InternalGsl.g:3080:1: ( '}' )
            // InternalGsl.g:3081:2: '}'
            {
             before(grammarAccess.getExperimentBlockAccess().getRightCurlyBracketKeyword_13()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExperimentBlockAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__13__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group__14"
    // InternalGsl.g:3090:1: rule__ExperimentBlock__Group__14 : rule__ExperimentBlock__Group__14__Impl ;
    public final void rule__ExperimentBlock__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3094:1: ( rule__ExperimentBlock__Group__14__Impl )
            // InternalGsl.g:3095:2: rule__ExperimentBlock__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group__14__Impl();

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
    // $ANTLR end "rule__ExperimentBlock__Group__14"


    // $ANTLR start "rule__ExperimentBlock__Group__14__Impl"
    // InternalGsl.g:3101:1: rule__ExperimentBlock__Group__14__Impl : ( '}' ) ;
    public final void rule__ExperimentBlock__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3105:1: ( ( '}' ) )
            // InternalGsl.g:3106:1: ( '}' )
            {
            // InternalGsl.g:3106:1: ( '}' )
            // InternalGsl.g:3107:2: '}'
            {
             before(grammarAccess.getExperimentBlockAccess().getRightCurlyBracketKeyword_14()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExperimentBlockAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group__14__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group_3__0"
    // InternalGsl.g:3117:1: rule__ExperimentBlock__Group_3__0 : rule__ExperimentBlock__Group_3__0__Impl rule__ExperimentBlock__Group_3__1 ;
    public final void rule__ExperimentBlock__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3121:1: ( rule__ExperimentBlock__Group_3__0__Impl rule__ExperimentBlock__Group_3__1 )
            // InternalGsl.g:3122:2: rule__ExperimentBlock__Group_3__0__Impl rule__ExperimentBlock__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ExperimentBlock__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group_3__1();

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
    // $ANTLR end "rule__ExperimentBlock__Group_3__0"


    // $ANTLR start "rule__ExperimentBlock__Group_3__0__Impl"
    // InternalGsl.g:3129:1: rule__ExperimentBlock__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__ExperimentBlock__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3133:1: ( ( 'type' ) )
            // InternalGsl.g:3134:1: ( 'type' )
            {
            // InternalGsl.g:3134:1: ( 'type' )
            // InternalGsl.g:3135:2: 'type'
            {
             before(grammarAccess.getExperimentBlockAccess().getTypeKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getExperimentBlockAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group_3__0__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group_3__1"
    // InternalGsl.g:3144:1: rule__ExperimentBlock__Group_3__1 : rule__ExperimentBlock__Group_3__1__Impl ;
    public final void rule__ExperimentBlock__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3148:1: ( rule__ExperimentBlock__Group_3__1__Impl )
            // InternalGsl.g:3149:2: rule__ExperimentBlock__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group_3__1__Impl();

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
    // $ANTLR end "rule__ExperimentBlock__Group_3__1"


    // $ANTLR start "rule__ExperimentBlock__Group_3__1__Impl"
    // InternalGsl.g:3155:1: rule__ExperimentBlock__Group_3__1__Impl : ( ( rule__ExperimentBlock__TypeAssignment_3_1 ) ) ;
    public final void rule__ExperimentBlock__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3159:1: ( ( ( rule__ExperimentBlock__TypeAssignment_3_1 ) ) )
            // InternalGsl.g:3160:1: ( ( rule__ExperimentBlock__TypeAssignment_3_1 ) )
            {
            // InternalGsl.g:3160:1: ( ( rule__ExperimentBlock__TypeAssignment_3_1 ) )
            // InternalGsl.g:3161:2: ( rule__ExperimentBlock__TypeAssignment_3_1 )
            {
             before(grammarAccess.getExperimentBlockAccess().getTypeAssignment_3_1()); 
            // InternalGsl.g:3162:2: ( rule__ExperimentBlock__TypeAssignment_3_1 )
            // InternalGsl.g:3162:3: rule__ExperimentBlock__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExperimentBlockAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group_3__1__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group_7__0"
    // InternalGsl.g:3171:1: rule__ExperimentBlock__Group_7__0 : rule__ExperimentBlock__Group_7__0__Impl rule__ExperimentBlock__Group_7__1 ;
    public final void rule__ExperimentBlock__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3175:1: ( rule__ExperimentBlock__Group_7__0__Impl rule__ExperimentBlock__Group_7__1 )
            // InternalGsl.g:3176:2: rule__ExperimentBlock__Group_7__0__Impl rule__ExperimentBlock__Group_7__1
            {
            pushFollow(FOLLOW_25);
            rule__ExperimentBlock__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group_7__1();

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
    // $ANTLR end "rule__ExperimentBlock__Group_7__0"


    // $ANTLR start "rule__ExperimentBlock__Group_7__0__Impl"
    // InternalGsl.g:3183:1: rule__ExperimentBlock__Group_7__0__Impl : ( ',' ) ;
    public final void rule__ExperimentBlock__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3187:1: ( ( ',' ) )
            // InternalGsl.g:3188:1: ( ',' )
            {
            // InternalGsl.g:3188:1: ( ',' )
            // InternalGsl.g:3189:2: ','
            {
             before(grammarAccess.getExperimentBlockAccess().getCommaKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExperimentBlockAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group_7__0__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group_7__1"
    // InternalGsl.g:3198:1: rule__ExperimentBlock__Group_7__1 : rule__ExperimentBlock__Group_7__1__Impl ;
    public final void rule__ExperimentBlock__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3202:1: ( rule__ExperimentBlock__Group_7__1__Impl )
            // InternalGsl.g:3203:2: rule__ExperimentBlock__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group_7__1__Impl();

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
    // $ANTLR end "rule__ExperimentBlock__Group_7__1"


    // $ANTLR start "rule__ExperimentBlock__Group_7__1__Impl"
    // InternalGsl.g:3209:1: rule__ExperimentBlock__Group_7__1__Impl : ( ( rule__ExperimentBlock__HasparameterAssignment_7_1 ) ) ;
    public final void rule__ExperimentBlock__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3213:1: ( ( ( rule__ExperimentBlock__HasparameterAssignment_7_1 ) ) )
            // InternalGsl.g:3214:1: ( ( rule__ExperimentBlock__HasparameterAssignment_7_1 ) )
            {
            // InternalGsl.g:3214:1: ( ( rule__ExperimentBlock__HasparameterAssignment_7_1 ) )
            // InternalGsl.g:3215:2: ( rule__ExperimentBlock__HasparameterAssignment_7_1 )
            {
             before(grammarAccess.getExperimentBlockAccess().getHasparameterAssignment_7_1()); 
            // InternalGsl.g:3216:2: ( rule__ExperimentBlock__HasparameterAssignment_7_1 )
            // InternalGsl.g:3216:3: rule__ExperimentBlock__HasparameterAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__HasparameterAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getExperimentBlockAccess().getHasparameterAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group_7__1__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group_12__0"
    // InternalGsl.g:3225:1: rule__ExperimentBlock__Group_12__0 : rule__ExperimentBlock__Group_12__0__Impl rule__ExperimentBlock__Group_12__1 ;
    public final void rule__ExperimentBlock__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3229:1: ( rule__ExperimentBlock__Group_12__0__Impl rule__ExperimentBlock__Group_12__1 )
            // InternalGsl.g:3230:2: rule__ExperimentBlock__Group_12__0__Impl rule__ExperimentBlock__Group_12__1
            {
            pushFollow(FOLLOW_27);
            rule__ExperimentBlock__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group_12__1();

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
    // $ANTLR end "rule__ExperimentBlock__Group_12__0"


    // $ANTLR start "rule__ExperimentBlock__Group_12__0__Impl"
    // InternalGsl.g:3237:1: rule__ExperimentBlock__Group_12__0__Impl : ( ',' ) ;
    public final void rule__ExperimentBlock__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3241:1: ( ( ',' ) )
            // InternalGsl.g:3242:1: ( ',' )
            {
            // InternalGsl.g:3242:1: ( ',' )
            // InternalGsl.g:3243:2: ','
            {
             before(grammarAccess.getExperimentBlockAccess().getCommaKeyword_12_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExperimentBlockAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group_12__0__Impl"


    // $ANTLR start "rule__ExperimentBlock__Group_12__1"
    // InternalGsl.g:3252:1: rule__ExperimentBlock__Group_12__1 : rule__ExperimentBlock__Group_12__1__Impl ;
    public final void rule__ExperimentBlock__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3256:1: ( rule__ExperimentBlock__Group_12__1__Impl )
            // InternalGsl.g:3257:2: rule__ExperimentBlock__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__Group_12__1__Impl();

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
    // $ANTLR end "rule__ExperimentBlock__Group_12__1"


    // $ANTLR start "rule__ExperimentBlock__Group_12__1__Impl"
    // InternalGsl.g:3263:1: rule__ExperimentBlock__Group_12__1__Impl : ( ( rule__ExperimentBlock__HasoutputAssignment_12_1 ) ) ;
    public final void rule__ExperimentBlock__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3267:1: ( ( ( rule__ExperimentBlock__HasoutputAssignment_12_1 ) ) )
            // InternalGsl.g:3268:1: ( ( rule__ExperimentBlock__HasoutputAssignment_12_1 ) )
            {
            // InternalGsl.g:3268:1: ( ( rule__ExperimentBlock__HasoutputAssignment_12_1 ) )
            // InternalGsl.g:3269:2: ( rule__ExperimentBlock__HasoutputAssignment_12_1 )
            {
             before(grammarAccess.getExperimentBlockAccess().getHasoutputAssignment_12_1()); 
            // InternalGsl.g:3270:2: ( rule__ExperimentBlock__HasoutputAssignment_12_1 )
            // InternalGsl.g:3270:3: rule__ExperimentBlock__HasoutputAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__ExperimentBlock__HasoutputAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getExperimentBlockAccess().getHasoutputAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__Group_12__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalGsl.g:3279:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3283:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalGsl.g:3284:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalGsl.g:3291:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3295:1: ( ( ( '-' )? ) )
            // InternalGsl.g:3296:1: ( ( '-' )? )
            {
            // InternalGsl.g:3296:1: ( ( '-' )? )
            // InternalGsl.g:3297:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalGsl.g:3298:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalGsl.g:3298:3: '-'
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalGsl.g:3306:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3310:1: ( rule__EInt__Group__1__Impl )
            // InternalGsl.g:3311:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalGsl.g:3317:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3321:1: ( ( RULE_INT ) )
            // InternalGsl.g:3322:1: ( RULE_INT )
            {
            // InternalGsl.g:3322:1: ( RULE_INT )
            // InternalGsl.g:3323:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__GlobalVariable__Group__0"
    // InternalGsl.g:3333:1: rule__GlobalVariable__Group__0 : rule__GlobalVariable__Group__0__Impl rule__GlobalVariable__Group__1 ;
    public final void rule__GlobalVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3337:1: ( rule__GlobalVariable__Group__0__Impl rule__GlobalVariable__Group__1 )
            // InternalGsl.g:3338:2: rule__GlobalVariable__Group__0__Impl rule__GlobalVariable__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__GlobalVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalVariable__Group__1();

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
    // $ANTLR end "rule__GlobalVariable__Group__0"


    // $ANTLR start "rule__GlobalVariable__Group__0__Impl"
    // InternalGsl.g:3345:1: rule__GlobalVariable__Group__0__Impl : ( () ) ;
    public final void rule__GlobalVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3349:1: ( ( () ) )
            // InternalGsl.g:3350:1: ( () )
            {
            // InternalGsl.g:3350:1: ( () )
            // InternalGsl.g:3351:2: ()
            {
             before(grammarAccess.getGlobalVariableAccess().getGlobalVariableAction_0()); 
            // InternalGsl.g:3352:2: ()
            // InternalGsl.g:3352:3: 
            {
            }

             after(grammarAccess.getGlobalVariableAccess().getGlobalVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariable__Group__0__Impl"


    // $ANTLR start "rule__GlobalVariable__Group__1"
    // InternalGsl.g:3360:1: rule__GlobalVariable__Group__1 : rule__GlobalVariable__Group__1__Impl rule__GlobalVariable__Group__2 ;
    public final void rule__GlobalVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3364:1: ( rule__GlobalVariable__Group__1__Impl rule__GlobalVariable__Group__2 )
            // InternalGsl.g:3365:2: rule__GlobalVariable__Group__1__Impl rule__GlobalVariable__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__GlobalVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalVariable__Group__2();

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
    // $ANTLR end "rule__GlobalVariable__Group__1"


    // $ANTLR start "rule__GlobalVariable__Group__1__Impl"
    // InternalGsl.g:3372:1: rule__GlobalVariable__Group__1__Impl : ( 'GlobalVariable' ) ;
    public final void rule__GlobalVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3376:1: ( ( 'GlobalVariable' ) )
            // InternalGsl.g:3377:1: ( 'GlobalVariable' )
            {
            // InternalGsl.g:3377:1: ( 'GlobalVariable' )
            // InternalGsl.g:3378:2: 'GlobalVariable'
            {
             before(grammarAccess.getGlobalVariableAccess().getGlobalVariableKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGlobalVariableAccess().getGlobalVariableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariable__Group__1__Impl"


    // $ANTLR start "rule__GlobalVariable__Group__2"
    // InternalGsl.g:3387:1: rule__GlobalVariable__Group__2 : rule__GlobalVariable__Group__2__Impl rule__GlobalVariable__Group__3 ;
    public final void rule__GlobalVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3391:1: ( rule__GlobalVariable__Group__2__Impl rule__GlobalVariable__Group__3 )
            // InternalGsl.g:3392:2: rule__GlobalVariable__Group__2__Impl rule__GlobalVariable__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__GlobalVariable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalVariable__Group__3();

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
    // $ANTLR end "rule__GlobalVariable__Group__2"


    // $ANTLR start "rule__GlobalVariable__Group__2__Impl"
    // InternalGsl.g:3399:1: rule__GlobalVariable__Group__2__Impl : ( ( rule__GlobalVariable__GvarNameAssignment_2 ) ) ;
    public final void rule__GlobalVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3403:1: ( ( ( rule__GlobalVariable__GvarNameAssignment_2 ) ) )
            // InternalGsl.g:3404:1: ( ( rule__GlobalVariable__GvarNameAssignment_2 ) )
            {
            // InternalGsl.g:3404:1: ( ( rule__GlobalVariable__GvarNameAssignment_2 ) )
            // InternalGsl.g:3405:2: ( rule__GlobalVariable__GvarNameAssignment_2 )
            {
             before(grammarAccess.getGlobalVariableAccess().getGvarNameAssignment_2()); 
            // InternalGsl.g:3406:2: ( rule__GlobalVariable__GvarNameAssignment_2 )
            // InternalGsl.g:3406:3: rule__GlobalVariable__GvarNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVariable__GvarNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalVariableAccess().getGvarNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariable__Group__2__Impl"


    // $ANTLR start "rule__GlobalVariable__Group__3"
    // InternalGsl.g:3414:1: rule__GlobalVariable__Group__3 : rule__GlobalVariable__Group__3__Impl rule__GlobalVariable__Group__4 ;
    public final void rule__GlobalVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3418:1: ( rule__GlobalVariable__Group__3__Impl rule__GlobalVariable__Group__4 )
            // InternalGsl.g:3419:2: rule__GlobalVariable__Group__3__Impl rule__GlobalVariable__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__GlobalVariable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalVariable__Group__4();

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
    // $ANTLR end "rule__GlobalVariable__Group__3"


    // $ANTLR start "rule__GlobalVariable__Group__3__Impl"
    // InternalGsl.g:3426:1: rule__GlobalVariable__Group__3__Impl : ( '{' ) ;
    public final void rule__GlobalVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3430:1: ( ( '{' ) )
            // InternalGsl.g:3431:1: ( '{' )
            {
            // InternalGsl.g:3431:1: ( '{' )
            // InternalGsl.g:3432:2: '{'
            {
             before(grammarAccess.getGlobalVariableAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGlobalVariableAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariable__Group__3__Impl"


    // $ANTLR start "rule__GlobalVariable__Group__4"
    // InternalGsl.g:3441:1: rule__GlobalVariable__Group__4 : rule__GlobalVariable__Group__4__Impl rule__GlobalVariable__Group__5 ;
    public final void rule__GlobalVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3445:1: ( rule__GlobalVariable__Group__4__Impl rule__GlobalVariable__Group__5 )
            // InternalGsl.g:3446:2: rule__GlobalVariable__Group__4__Impl rule__GlobalVariable__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__GlobalVariable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalVariable__Group__5();

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
    // $ANTLR end "rule__GlobalVariable__Group__4"


    // $ANTLR start "rule__GlobalVariable__Group__4__Impl"
    // InternalGsl.g:3453:1: rule__GlobalVariable__Group__4__Impl : ( ( rule__GlobalVariable__Group_4__0 )? ) ;
    public final void rule__GlobalVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3457:1: ( ( ( rule__GlobalVariable__Group_4__0 )? ) )
            // InternalGsl.g:3458:1: ( ( rule__GlobalVariable__Group_4__0 )? )
            {
            // InternalGsl.g:3458:1: ( ( rule__GlobalVariable__Group_4__0 )? )
            // InternalGsl.g:3459:2: ( rule__GlobalVariable__Group_4__0 )?
            {
             before(grammarAccess.getGlobalVariableAccess().getGroup_4()); 
            // InternalGsl.g:3460:2: ( rule__GlobalVariable__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGsl.g:3460:3: rule__GlobalVariable__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GlobalVariable__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalVariableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariable__Group__4__Impl"


    // $ANTLR start "rule__GlobalVariable__Group__5"
    // InternalGsl.g:3468:1: rule__GlobalVariable__Group__5 : rule__GlobalVariable__Group__5__Impl rule__GlobalVariable__Group__6 ;
    public final void rule__GlobalVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3472:1: ( rule__GlobalVariable__Group__5__Impl rule__GlobalVariable__Group__6 )
            // InternalGsl.g:3473:2: rule__GlobalVariable__Group__5__Impl rule__GlobalVariable__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__GlobalVariable__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalVariable__Group__6();

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
    // $ANTLR end "rule__GlobalVariable__Group__5"


    // $ANTLR start "rule__GlobalVariable__Group__5__Impl"
    // InternalGsl.g:3480:1: rule__GlobalVariable__Group__5__Impl : ( ( rule__GlobalVariable__Group_5__0 )? ) ;
    public final void rule__GlobalVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3484:1: ( ( ( rule__GlobalVariable__Group_5__0 )? ) )
            // InternalGsl.g:3485:1: ( ( rule__GlobalVariable__Group_5__0 )? )
            {
            // InternalGsl.g:3485:1: ( ( rule__GlobalVariable__Group_5__0 )? )
            // InternalGsl.g:3486:2: ( rule__GlobalVariable__Group_5__0 )?
            {
             before(grammarAccess.getGlobalVariableAccess().getGroup_5()); 
            // InternalGsl.g:3487:2: ( rule__GlobalVariable__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGsl.g:3487:3: rule__GlobalVariable__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GlobalVariable__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalVariableAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariable__Group__5__Impl"


    // $ANTLR start "rule__GlobalVariable__Group__6"
    // InternalGsl.g:3495:1: rule__GlobalVariable__Group__6 : rule__GlobalVariable__Group__6__Impl ;
    public final void rule__GlobalVariable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3499:1: ( rule__GlobalVariable__Group__6__Impl )
            // InternalGsl.g:3500:2: rule__GlobalVariable__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVariable__Group__6__Impl();

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
    // $ANTLR end "rule__GlobalVariable__Group__6"


    // $ANTLR start "rule__GlobalVariable__Group__6__Impl"
    // InternalGsl.g:3506:1: rule__GlobalVariable__Group__6__Impl : ( '}' ) ;
    public final void rule__GlobalVariable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3510:1: ( ( '}' ) )
            // InternalGsl.g:3511:1: ( '}' )
            {
            // InternalGsl.g:3511:1: ( '}' )
            // InternalGsl.g:3512:2: '}'
            {
             before(grammarAccess.getGlobalVariableAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGlobalVariableAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariable__Group__6__Impl"


    // $ANTLR start "rule__GlobalVariable__Group_4__0"
    // InternalGsl.g:3522:1: rule__GlobalVariable__Group_4__0 : rule__GlobalVariable__Group_4__0__Impl rule__GlobalVariable__Group_4__1 ;
    public final void rule__GlobalVariable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3526:1: ( rule__GlobalVariable__Group_4__0__Impl rule__GlobalVariable__Group_4__1 )
            // InternalGsl.g:3527:2: rule__GlobalVariable__Group_4__0__Impl rule__GlobalVariable__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__GlobalVariable__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalVariable__Group_4__1();

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
    // $ANTLR end "rule__GlobalVariable__Group_4__0"


    // $ANTLR start "rule__GlobalVariable__Group_4__0__Impl"
    // InternalGsl.g:3534:1: rule__GlobalVariable__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__GlobalVariable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3538:1: ( ( 'type' ) )
            // InternalGsl.g:3539:1: ( 'type' )
            {
            // InternalGsl.g:3539:1: ( 'type' )
            // InternalGsl.g:3540:2: 'type'
            {
             before(grammarAccess.getGlobalVariableAccess().getTypeKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGlobalVariableAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariable__Group_4__0__Impl"


    // $ANTLR start "rule__GlobalVariable__Group_4__1"
    // InternalGsl.g:3549:1: rule__GlobalVariable__Group_4__1 : rule__GlobalVariable__Group_4__1__Impl ;
    public final void rule__GlobalVariable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3553:1: ( rule__GlobalVariable__Group_4__1__Impl )
            // InternalGsl.g:3554:2: rule__GlobalVariable__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVariable__Group_4__1__Impl();

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
    // $ANTLR end "rule__GlobalVariable__Group_4__1"


    // $ANTLR start "rule__GlobalVariable__Group_4__1__Impl"
    // InternalGsl.g:3560:1: rule__GlobalVariable__Group_4__1__Impl : ( ( rule__GlobalVariable__TypeAssignment_4_1 ) ) ;
    public final void rule__GlobalVariable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3564:1: ( ( ( rule__GlobalVariable__TypeAssignment_4_1 ) ) )
            // InternalGsl.g:3565:1: ( ( rule__GlobalVariable__TypeAssignment_4_1 ) )
            {
            // InternalGsl.g:3565:1: ( ( rule__GlobalVariable__TypeAssignment_4_1 ) )
            // InternalGsl.g:3566:2: ( rule__GlobalVariable__TypeAssignment_4_1 )
            {
             before(grammarAccess.getGlobalVariableAccess().getTypeAssignment_4_1()); 
            // InternalGsl.g:3567:2: ( rule__GlobalVariable__TypeAssignment_4_1 )
            // InternalGsl.g:3567:3: rule__GlobalVariable__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVariable__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalVariableAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariable__Group_4__1__Impl"


    // $ANTLR start "rule__GlobalVariable__Group_5__0"
    // InternalGsl.g:3576:1: rule__GlobalVariable__Group_5__0 : rule__GlobalVariable__Group_5__0__Impl rule__GlobalVariable__Group_5__1 ;
    public final void rule__GlobalVariable__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3580:1: ( rule__GlobalVariable__Group_5__0__Impl rule__GlobalVariable__Group_5__1 )
            // InternalGsl.g:3581:2: rule__GlobalVariable__Group_5__0__Impl rule__GlobalVariable__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__GlobalVariable__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalVariable__Group_5__1();

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
    // $ANTLR end "rule__GlobalVariable__Group_5__0"


    // $ANTLR start "rule__GlobalVariable__Group_5__0__Impl"
    // InternalGsl.g:3588:1: rule__GlobalVariable__Group_5__0__Impl : ( 'initValue' ) ;
    public final void rule__GlobalVariable__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3592:1: ( ( 'initValue' ) )
            // InternalGsl.g:3593:1: ( 'initValue' )
            {
            // InternalGsl.g:3593:1: ( 'initValue' )
            // InternalGsl.g:3594:2: 'initValue'
            {
             before(grammarAccess.getGlobalVariableAccess().getInitValueKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getGlobalVariableAccess().getInitValueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariable__Group_5__0__Impl"


    // $ANTLR start "rule__GlobalVariable__Group_5__1"
    // InternalGsl.g:3603:1: rule__GlobalVariable__Group_5__1 : rule__GlobalVariable__Group_5__1__Impl ;
    public final void rule__GlobalVariable__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3607:1: ( rule__GlobalVariable__Group_5__1__Impl )
            // InternalGsl.g:3608:2: rule__GlobalVariable__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVariable__Group_5__1__Impl();

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
    // $ANTLR end "rule__GlobalVariable__Group_5__1"


    // $ANTLR start "rule__GlobalVariable__Group_5__1__Impl"
    // InternalGsl.g:3614:1: rule__GlobalVariable__Group_5__1__Impl : ( ( rule__GlobalVariable__InitValueAssignment_5_1 ) ) ;
    public final void rule__GlobalVariable__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3618:1: ( ( ( rule__GlobalVariable__InitValueAssignment_5_1 ) ) )
            // InternalGsl.g:3619:1: ( ( rule__GlobalVariable__InitValueAssignment_5_1 ) )
            {
            // InternalGsl.g:3619:1: ( ( rule__GlobalVariable__InitValueAssignment_5_1 ) )
            // InternalGsl.g:3620:2: ( rule__GlobalVariable__InitValueAssignment_5_1 )
            {
             before(grammarAccess.getGlobalVariableAccess().getInitValueAssignment_5_1()); 
            // InternalGsl.g:3621:2: ( rule__GlobalVariable__InitValueAssignment_5_1 )
            // InternalGsl.g:3621:3: rule__GlobalVariable__InitValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVariable__InitValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalVariableAccess().getInitValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariable__Group_5__1__Impl"


    // $ANTLR start "rule__SpatialEntity__Group__0"
    // InternalGsl.g:3630:1: rule__SpatialEntity__Group__0 : rule__SpatialEntity__Group__0__Impl rule__SpatialEntity__Group__1 ;
    public final void rule__SpatialEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3634:1: ( rule__SpatialEntity__Group__0__Impl rule__SpatialEntity__Group__1 )
            // InternalGsl.g:3635:2: rule__SpatialEntity__Group__0__Impl rule__SpatialEntity__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__SpatialEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpatialEntity__Group__1();

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
    // $ANTLR end "rule__SpatialEntity__Group__0"


    // $ANTLR start "rule__SpatialEntity__Group__0__Impl"
    // InternalGsl.g:3642:1: rule__SpatialEntity__Group__0__Impl : ( () ) ;
    public final void rule__SpatialEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3646:1: ( ( () ) )
            // InternalGsl.g:3647:1: ( () )
            {
            // InternalGsl.g:3647:1: ( () )
            // InternalGsl.g:3648:2: ()
            {
             before(grammarAccess.getSpatialEntityAccess().getSpatialEntityAction_0()); 
            // InternalGsl.g:3649:2: ()
            // InternalGsl.g:3649:3: 
            {
            }

             after(grammarAccess.getSpatialEntityAccess().getSpatialEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpatialEntity__Group__0__Impl"


    // $ANTLR start "rule__SpatialEntity__Group__1"
    // InternalGsl.g:3657:1: rule__SpatialEntity__Group__1 : rule__SpatialEntity__Group__1__Impl rule__SpatialEntity__Group__2 ;
    public final void rule__SpatialEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3661:1: ( rule__SpatialEntity__Group__1__Impl rule__SpatialEntity__Group__2 )
            // InternalGsl.g:3662:2: rule__SpatialEntity__Group__1__Impl rule__SpatialEntity__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__SpatialEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpatialEntity__Group__2();

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
    // $ANTLR end "rule__SpatialEntity__Group__1"


    // $ANTLR start "rule__SpatialEntity__Group__1__Impl"
    // InternalGsl.g:3669:1: rule__SpatialEntity__Group__1__Impl : ( 'SpatialEntity' ) ;
    public final void rule__SpatialEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3673:1: ( ( 'SpatialEntity' ) )
            // InternalGsl.g:3674:1: ( 'SpatialEntity' )
            {
            // InternalGsl.g:3674:1: ( 'SpatialEntity' )
            // InternalGsl.g:3675:2: 'SpatialEntity'
            {
             before(grammarAccess.getSpatialEntityAccess().getSpatialEntityKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSpatialEntityAccess().getSpatialEntityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpatialEntity__Group__1__Impl"


    // $ANTLR start "rule__SpatialEntity__Group__2"
    // InternalGsl.g:3684:1: rule__SpatialEntity__Group__2 : rule__SpatialEntity__Group__2__Impl rule__SpatialEntity__Group__3 ;
    public final void rule__SpatialEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3688:1: ( rule__SpatialEntity__Group__2__Impl rule__SpatialEntity__Group__3 )
            // InternalGsl.g:3689:2: rule__SpatialEntity__Group__2__Impl rule__SpatialEntity__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__SpatialEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpatialEntity__Group__3();

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
    // $ANTLR end "rule__SpatialEntity__Group__2"


    // $ANTLR start "rule__SpatialEntity__Group__2__Impl"
    // InternalGsl.g:3696:1: rule__SpatialEntity__Group__2__Impl : ( ( rule__SpatialEntity__ShapeNameAssignment_2 ) ) ;
    public final void rule__SpatialEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3700:1: ( ( ( rule__SpatialEntity__ShapeNameAssignment_2 ) ) )
            // InternalGsl.g:3701:1: ( ( rule__SpatialEntity__ShapeNameAssignment_2 ) )
            {
            // InternalGsl.g:3701:1: ( ( rule__SpatialEntity__ShapeNameAssignment_2 ) )
            // InternalGsl.g:3702:2: ( rule__SpatialEntity__ShapeNameAssignment_2 )
            {
             before(grammarAccess.getSpatialEntityAccess().getShapeNameAssignment_2()); 
            // InternalGsl.g:3703:2: ( rule__SpatialEntity__ShapeNameAssignment_2 )
            // InternalGsl.g:3703:3: rule__SpatialEntity__ShapeNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SpatialEntity__ShapeNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSpatialEntityAccess().getShapeNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpatialEntity__Group__2__Impl"


    // $ANTLR start "rule__SpatialEntity__Group__3"
    // InternalGsl.g:3711:1: rule__SpatialEntity__Group__3 : rule__SpatialEntity__Group__3__Impl rule__SpatialEntity__Group__4 ;
    public final void rule__SpatialEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3715:1: ( rule__SpatialEntity__Group__3__Impl rule__SpatialEntity__Group__4 )
            // InternalGsl.g:3716:2: rule__SpatialEntity__Group__3__Impl rule__SpatialEntity__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__SpatialEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpatialEntity__Group__4();

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
    // $ANTLR end "rule__SpatialEntity__Group__3"


    // $ANTLR start "rule__SpatialEntity__Group__3__Impl"
    // InternalGsl.g:3723:1: rule__SpatialEntity__Group__3__Impl : ( '{' ) ;
    public final void rule__SpatialEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3727:1: ( ( '{' ) )
            // InternalGsl.g:3728:1: ( '{' )
            {
            // InternalGsl.g:3728:1: ( '{' )
            // InternalGsl.g:3729:2: '{'
            {
             before(grammarAccess.getSpatialEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSpatialEntityAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpatialEntity__Group__3__Impl"


    // $ANTLR start "rule__SpatialEntity__Group__4"
    // InternalGsl.g:3738:1: rule__SpatialEntity__Group__4 : rule__SpatialEntity__Group__4__Impl rule__SpatialEntity__Group__5 ;
    public final void rule__SpatialEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3742:1: ( rule__SpatialEntity__Group__4__Impl rule__SpatialEntity__Group__5 )
            // InternalGsl.g:3743:2: rule__SpatialEntity__Group__4__Impl rule__SpatialEntity__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__SpatialEntity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpatialEntity__Group__5();

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
    // $ANTLR end "rule__SpatialEntity__Group__4"


    // $ANTLR start "rule__SpatialEntity__Group__4__Impl"
    // InternalGsl.g:3750:1: rule__SpatialEntity__Group__4__Impl : ( ( rule__SpatialEntity__Group_4__0 )? ) ;
    public final void rule__SpatialEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3754:1: ( ( ( rule__SpatialEntity__Group_4__0 )? ) )
            // InternalGsl.g:3755:1: ( ( rule__SpatialEntity__Group_4__0 )? )
            {
            // InternalGsl.g:3755:1: ( ( rule__SpatialEntity__Group_4__0 )? )
            // InternalGsl.g:3756:2: ( rule__SpatialEntity__Group_4__0 )?
            {
             before(grammarAccess.getSpatialEntityAccess().getGroup_4()); 
            // InternalGsl.g:3757:2: ( rule__SpatialEntity__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalGsl.g:3757:3: rule__SpatialEntity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpatialEntity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpatialEntityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpatialEntity__Group__4__Impl"


    // $ANTLR start "rule__SpatialEntity__Group__5"
    // InternalGsl.g:3765:1: rule__SpatialEntity__Group__5 : rule__SpatialEntity__Group__5__Impl rule__SpatialEntity__Group__6 ;
    public final void rule__SpatialEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3769:1: ( rule__SpatialEntity__Group__5__Impl rule__SpatialEntity__Group__6 )
            // InternalGsl.g:3770:2: rule__SpatialEntity__Group__5__Impl rule__SpatialEntity__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__SpatialEntity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpatialEntity__Group__6();

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
    // $ANTLR end "rule__SpatialEntity__Group__5"


    // $ANTLR start "rule__SpatialEntity__Group__5__Impl"
    // InternalGsl.g:3777:1: rule__SpatialEntity__Group__5__Impl : ( ( rule__SpatialEntity__Group_5__0 )? ) ;
    public final void rule__SpatialEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3781:1: ( ( ( rule__SpatialEntity__Group_5__0 )? ) )
            // InternalGsl.g:3782:1: ( ( rule__SpatialEntity__Group_5__0 )? )
            {
            // InternalGsl.g:3782:1: ( ( rule__SpatialEntity__Group_5__0 )? )
            // InternalGsl.g:3783:2: ( rule__SpatialEntity__Group_5__0 )?
            {
             before(grammarAccess.getSpatialEntityAccess().getGroup_5()); 
            // InternalGsl.g:3784:2: ( rule__SpatialEntity__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGsl.g:3784:3: rule__SpatialEntity__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SpatialEntity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSpatialEntityAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpatialEntity__Group__5__Impl"


    // $ANTLR start "rule__SpatialEntity__Group__6"
    // InternalGsl.g:3792:1: rule__SpatialEntity__Group__6 : rule__SpatialEntity__Group__6__Impl ;
    public final void rule__SpatialEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3796:1: ( rule__SpatialEntity__Group__6__Impl )
            // InternalGsl.g:3797:2: rule__SpatialEntity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpatialEntity__Group__6__Impl();

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
    // $ANTLR end "rule__SpatialEntity__Group__6"


    // $ANTLR start "rule__SpatialEntity__Group__6__Impl"
    // InternalGsl.g:3803:1: rule__SpatialEntity__Group__6__Impl : ( '}' ) ;
    public final void rule__SpatialEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3807:1: ( ( '}' ) )
            // InternalGsl.g:3808:1: ( '}' )
            {
            // InternalGsl.g:3808:1: ( '}' )
            // InternalGsl.g:3809:2: '}'
            {
             before(grammarAccess.getSpatialEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSpatialEntityAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpatialEntity__Group__6__Impl"


    // $ANTLR start "rule__SpatialEntity__Group_4__0"
    // InternalGsl.g:3819:1: rule__SpatialEntity__Group_4__0 : rule__SpatialEntity__Group_4__0__Impl rule__SpatialEntity__Group_4__1 ;
    public final void rule__SpatialEntity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3823:1: ( rule__SpatialEntity__Group_4__0__Impl rule__SpatialEntity__Group_4__1 )
            // InternalGsl.g:3824:2: rule__SpatialEntity__Group_4__0__Impl rule__SpatialEntity__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__SpatialEntity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpatialEntity__Group_4__1();

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
    // $ANTLR end "rule__SpatialEntity__Group_4__0"


    // $ANTLR start "rule__SpatialEntity__Group_4__0__Impl"
    // InternalGsl.g:3831:1: rule__SpatialEntity__Group_4__0__Impl : ( 'shapePath' ) ;
    public final void rule__SpatialEntity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3835:1: ( ( 'shapePath' ) )
            // InternalGsl.g:3836:1: ( 'shapePath' )
            {
            // InternalGsl.g:3836:1: ( 'shapePath' )
            // InternalGsl.g:3837:2: 'shapePath'
            {
             before(grammarAccess.getSpatialEntityAccess().getShapePathKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSpatialEntityAccess().getShapePathKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpatialEntity__Group_4__0__Impl"


    // $ANTLR start "rule__SpatialEntity__Group_4__1"
    // InternalGsl.g:3846:1: rule__SpatialEntity__Group_4__1 : rule__SpatialEntity__Group_4__1__Impl ;
    public final void rule__SpatialEntity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3850:1: ( rule__SpatialEntity__Group_4__1__Impl )
            // InternalGsl.g:3851:2: rule__SpatialEntity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpatialEntity__Group_4__1__Impl();

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
    // $ANTLR end "rule__SpatialEntity__Group_4__1"


    // $ANTLR start "rule__SpatialEntity__Group_4__1__Impl"
    // InternalGsl.g:3857:1: rule__SpatialEntity__Group_4__1__Impl : ( ( rule__SpatialEntity__ShapePathAssignment_4_1 ) ) ;
    public final void rule__SpatialEntity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3861:1: ( ( ( rule__SpatialEntity__ShapePathAssignment_4_1 ) ) )
            // InternalGsl.g:3862:1: ( ( rule__SpatialEntity__ShapePathAssignment_4_1 ) )
            {
            // InternalGsl.g:3862:1: ( ( rule__SpatialEntity__ShapePathAssignment_4_1 ) )
            // InternalGsl.g:3863:2: ( rule__SpatialEntity__ShapePathAssignment_4_1 )
            {
             before(grammarAccess.getSpatialEntityAccess().getShapePathAssignment_4_1()); 
            // InternalGsl.g:3864:2: ( rule__SpatialEntity__ShapePathAssignment_4_1 )
            // InternalGsl.g:3864:3: rule__SpatialEntity__ShapePathAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SpatialEntity__ShapePathAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSpatialEntityAccess().getShapePathAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpatialEntity__Group_4__1__Impl"


    // $ANTLR start "rule__SpatialEntity__Group_5__0"
    // InternalGsl.g:3873:1: rule__SpatialEntity__Group_5__0 : rule__SpatialEntity__Group_5__0__Impl rule__SpatialEntity__Group_5__1 ;
    public final void rule__SpatialEntity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3877:1: ( rule__SpatialEntity__Group_5__0__Impl rule__SpatialEntity__Group_5__1 )
            // InternalGsl.g:3878:2: rule__SpatialEntity__Group_5__0__Impl rule__SpatialEntity__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__SpatialEntity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SpatialEntity__Group_5__1();

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
    // $ANTLR end "rule__SpatialEntity__Group_5__0"


    // $ANTLR start "rule__SpatialEntity__Group_5__0__Impl"
    // InternalGsl.g:3885:1: rule__SpatialEntity__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__SpatialEntity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3889:1: ( ( 'type' ) )
            // InternalGsl.g:3890:1: ( 'type' )
            {
            // InternalGsl.g:3890:1: ( 'type' )
            // InternalGsl.g:3891:2: 'type'
            {
             before(grammarAccess.getSpatialEntityAccess().getTypeKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSpatialEntityAccess().getTypeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpatialEntity__Group_5__0__Impl"


    // $ANTLR start "rule__SpatialEntity__Group_5__1"
    // InternalGsl.g:3900:1: rule__SpatialEntity__Group_5__1 : rule__SpatialEntity__Group_5__1__Impl ;
    public final void rule__SpatialEntity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3904:1: ( rule__SpatialEntity__Group_5__1__Impl )
            // InternalGsl.g:3905:2: rule__SpatialEntity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SpatialEntity__Group_5__1__Impl();

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
    // $ANTLR end "rule__SpatialEntity__Group_5__1"


    // $ANTLR start "rule__SpatialEntity__Group_5__1__Impl"
    // InternalGsl.g:3911:1: rule__SpatialEntity__Group_5__1__Impl : ( ( rule__SpatialEntity__TypeAssignment_5_1 ) ) ;
    public final void rule__SpatialEntity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3915:1: ( ( ( rule__SpatialEntity__TypeAssignment_5_1 ) ) )
            // InternalGsl.g:3916:1: ( ( rule__SpatialEntity__TypeAssignment_5_1 ) )
            {
            // InternalGsl.g:3916:1: ( ( rule__SpatialEntity__TypeAssignment_5_1 ) )
            // InternalGsl.g:3917:2: ( rule__SpatialEntity__TypeAssignment_5_1 )
            {
             before(grammarAccess.getSpatialEntityAccess().getTypeAssignment_5_1()); 
            // InternalGsl.g:3918:2: ( rule__SpatialEntity__TypeAssignment_5_1 )
            // InternalGsl.g:3918:3: rule__SpatialEntity__TypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SpatialEntity__TypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSpatialEntityAccess().getTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpatialEntity__Group_5__1__Impl"


    // $ANTLR start "rule__Action_Impl__Group__0"
    // InternalGsl.g:3927:1: rule__Action_Impl__Group__0 : rule__Action_Impl__Group__0__Impl rule__Action_Impl__Group__1 ;
    public final void rule__Action_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3931:1: ( rule__Action_Impl__Group__0__Impl rule__Action_Impl__Group__1 )
            // InternalGsl.g:3932:2: rule__Action_Impl__Group__0__Impl rule__Action_Impl__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Action_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action_Impl__Group__1();

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
    // $ANTLR end "rule__Action_Impl__Group__0"


    // $ANTLR start "rule__Action_Impl__Group__0__Impl"
    // InternalGsl.g:3939:1: rule__Action_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Action_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3943:1: ( ( () ) )
            // InternalGsl.g:3944:1: ( () )
            {
            // InternalGsl.g:3944:1: ( () )
            // InternalGsl.g:3945:2: ()
            {
             before(grammarAccess.getAction_ImplAccess().getActionAction_0()); 
            // InternalGsl.g:3946:2: ()
            // InternalGsl.g:3946:3: 
            {
            }

             after(grammarAccess.getAction_ImplAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action_Impl__Group__0__Impl"


    // $ANTLR start "rule__Action_Impl__Group__1"
    // InternalGsl.g:3954:1: rule__Action_Impl__Group__1 : rule__Action_Impl__Group__1__Impl rule__Action_Impl__Group__2 ;
    public final void rule__Action_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3958:1: ( rule__Action_Impl__Group__1__Impl rule__Action_Impl__Group__2 )
            // InternalGsl.g:3959:2: rule__Action_Impl__Group__1__Impl rule__Action_Impl__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Action_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action_Impl__Group__2();

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
    // $ANTLR end "rule__Action_Impl__Group__1"


    // $ANTLR start "rule__Action_Impl__Group__1__Impl"
    // InternalGsl.g:3966:1: rule__Action_Impl__Group__1__Impl : ( 'Action' ) ;
    public final void rule__Action_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3970:1: ( ( 'Action' ) )
            // InternalGsl.g:3971:1: ( 'Action' )
            {
            // InternalGsl.g:3971:1: ( 'Action' )
            // InternalGsl.g:3972:2: 'Action'
            {
             before(grammarAccess.getAction_ImplAccess().getActionKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAction_ImplAccess().getActionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action_Impl__Group__1__Impl"


    // $ANTLR start "rule__Action_Impl__Group__2"
    // InternalGsl.g:3981:1: rule__Action_Impl__Group__2 : rule__Action_Impl__Group__2__Impl rule__Action_Impl__Group__3 ;
    public final void rule__Action_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3985:1: ( rule__Action_Impl__Group__2__Impl rule__Action_Impl__Group__3 )
            // InternalGsl.g:3986:2: rule__Action_Impl__Group__2__Impl rule__Action_Impl__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Action_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action_Impl__Group__3();

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
    // $ANTLR end "rule__Action_Impl__Group__2"


    // $ANTLR start "rule__Action_Impl__Group__2__Impl"
    // InternalGsl.g:3993:1: rule__Action_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Action_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:3997:1: ( ( '{' ) )
            // InternalGsl.g:3998:1: ( '{' )
            {
            // InternalGsl.g:3998:1: ( '{' )
            // InternalGsl.g:3999:2: '{'
            {
             before(grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAction_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action_Impl__Group__2__Impl"


    // $ANTLR start "rule__Action_Impl__Group__3"
    // InternalGsl.g:4008:1: rule__Action_Impl__Group__3 : rule__Action_Impl__Group__3__Impl rule__Action_Impl__Group__4 ;
    public final void rule__Action_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4012:1: ( rule__Action_Impl__Group__3__Impl rule__Action_Impl__Group__4 )
            // InternalGsl.g:4013:2: rule__Action_Impl__Group__3__Impl rule__Action_Impl__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Action_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action_Impl__Group__4();

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
    // $ANTLR end "rule__Action_Impl__Group__3"


    // $ANTLR start "rule__Action_Impl__Group__3__Impl"
    // InternalGsl.g:4020:1: rule__Action_Impl__Group__3__Impl : ( ( rule__Action_Impl__Group_3__0 )? ) ;
    public final void rule__Action_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4024:1: ( ( ( rule__Action_Impl__Group_3__0 )? ) )
            // InternalGsl.g:4025:1: ( ( rule__Action_Impl__Group_3__0 )? )
            {
            // InternalGsl.g:4025:1: ( ( rule__Action_Impl__Group_3__0 )? )
            // InternalGsl.g:4026:2: ( rule__Action_Impl__Group_3__0 )?
            {
             before(grammarAccess.getAction_ImplAccess().getGroup_3()); 
            // InternalGsl.g:4027:2: ( rule__Action_Impl__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGsl.g:4027:3: rule__Action_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAction_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action_Impl__Group__3__Impl"


    // $ANTLR start "rule__Action_Impl__Group__4"
    // InternalGsl.g:4035:1: rule__Action_Impl__Group__4 : rule__Action_Impl__Group__4__Impl ;
    public final void rule__Action_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4039:1: ( rule__Action_Impl__Group__4__Impl )
            // InternalGsl.g:4040:2: rule__Action_Impl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action_Impl__Group__4__Impl();

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
    // $ANTLR end "rule__Action_Impl__Group__4"


    // $ANTLR start "rule__Action_Impl__Group__4__Impl"
    // InternalGsl.g:4046:1: rule__Action_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__Action_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4050:1: ( ( '}' ) )
            // InternalGsl.g:4051:1: ( '}' )
            {
            // InternalGsl.g:4051:1: ( '}' )
            // InternalGsl.g:4052:2: '}'
            {
             before(grammarAccess.getAction_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAction_ImplAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action_Impl__Group__4__Impl"


    // $ANTLR start "rule__Action_Impl__Group_3__0"
    // InternalGsl.g:4062:1: rule__Action_Impl__Group_3__0 : rule__Action_Impl__Group_3__0__Impl rule__Action_Impl__Group_3__1 ;
    public final void rule__Action_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4066:1: ( rule__Action_Impl__Group_3__0__Impl rule__Action_Impl__Group_3__1 )
            // InternalGsl.g:4067:2: rule__Action_Impl__Group_3__0__Impl rule__Action_Impl__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Action_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action_Impl__Group_3__1();

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
    // $ANTLR end "rule__Action_Impl__Group_3__0"


    // $ANTLR start "rule__Action_Impl__Group_3__0__Impl"
    // InternalGsl.g:4074:1: rule__Action_Impl__Group_3__0__Impl : ( 'actionName' ) ;
    public final void rule__Action_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4078:1: ( ( 'actionName' ) )
            // InternalGsl.g:4079:1: ( 'actionName' )
            {
            // InternalGsl.g:4079:1: ( 'actionName' )
            // InternalGsl.g:4080:2: 'actionName'
            {
             before(grammarAccess.getAction_ImplAccess().getActionNameKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAction_ImplAccess().getActionNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__Action_Impl__Group_3__1"
    // InternalGsl.g:4089:1: rule__Action_Impl__Group_3__1 : rule__Action_Impl__Group_3__1__Impl ;
    public final void rule__Action_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4093:1: ( rule__Action_Impl__Group_3__1__Impl )
            // InternalGsl.g:4094:2: rule__Action_Impl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action_Impl__Group_3__1__Impl();

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
    // $ANTLR end "rule__Action_Impl__Group_3__1"


    // $ANTLR start "rule__Action_Impl__Group_3__1__Impl"
    // InternalGsl.g:4100:1: rule__Action_Impl__Group_3__1__Impl : ( ( rule__Action_Impl__ActionNameAssignment_3_1 ) ) ;
    public final void rule__Action_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4104:1: ( ( ( rule__Action_Impl__ActionNameAssignment_3_1 ) ) )
            // InternalGsl.g:4105:1: ( ( rule__Action_Impl__ActionNameAssignment_3_1 ) )
            {
            // InternalGsl.g:4105:1: ( ( rule__Action_Impl__ActionNameAssignment_3_1 ) )
            // InternalGsl.g:4106:2: ( rule__Action_Impl__ActionNameAssignment_3_1 )
            {
             before(grammarAccess.getAction_ImplAccess().getActionNameAssignment_3_1()); 
            // InternalGsl.g:4107:2: ( rule__Action_Impl__ActionNameAssignment_3_1 )
            // InternalGsl.g:4107:3: rule__Action_Impl__ActionNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Action_Impl__ActionNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAction_ImplAccess().getActionNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__Propertie__Group__0"
    // InternalGsl.g:4116:1: rule__Propertie__Group__0 : rule__Propertie__Group__0__Impl rule__Propertie__Group__1 ;
    public final void rule__Propertie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4120:1: ( rule__Propertie__Group__0__Impl rule__Propertie__Group__1 )
            // InternalGsl.g:4121:2: rule__Propertie__Group__0__Impl rule__Propertie__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Propertie__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Propertie__Group__1();

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
    // $ANTLR end "rule__Propertie__Group__0"


    // $ANTLR start "rule__Propertie__Group__0__Impl"
    // InternalGsl.g:4128:1: rule__Propertie__Group__0__Impl : ( () ) ;
    public final void rule__Propertie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4132:1: ( ( () ) )
            // InternalGsl.g:4133:1: ( () )
            {
            // InternalGsl.g:4133:1: ( () )
            // InternalGsl.g:4134:2: ()
            {
             before(grammarAccess.getPropertieAccess().getPropertieAction_0()); 
            // InternalGsl.g:4135:2: ()
            // InternalGsl.g:4135:3: 
            {
            }

             after(grammarAccess.getPropertieAccess().getPropertieAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__Group__0__Impl"


    // $ANTLR start "rule__Propertie__Group__1"
    // InternalGsl.g:4143:1: rule__Propertie__Group__1 : rule__Propertie__Group__1__Impl rule__Propertie__Group__2 ;
    public final void rule__Propertie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4147:1: ( rule__Propertie__Group__1__Impl rule__Propertie__Group__2 )
            // InternalGsl.g:4148:2: rule__Propertie__Group__1__Impl rule__Propertie__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Propertie__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Propertie__Group__2();

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
    // $ANTLR end "rule__Propertie__Group__1"


    // $ANTLR start "rule__Propertie__Group__1__Impl"
    // InternalGsl.g:4155:1: rule__Propertie__Group__1__Impl : ( 'Propertie' ) ;
    public final void rule__Propertie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4159:1: ( ( 'Propertie' ) )
            // InternalGsl.g:4160:1: ( 'Propertie' )
            {
            // InternalGsl.g:4160:1: ( 'Propertie' )
            // InternalGsl.g:4161:2: 'Propertie'
            {
             before(grammarAccess.getPropertieAccess().getPropertieKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPropertieAccess().getPropertieKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__Group__1__Impl"


    // $ANTLR start "rule__Propertie__Group__2"
    // InternalGsl.g:4170:1: rule__Propertie__Group__2 : rule__Propertie__Group__2__Impl rule__Propertie__Group__3 ;
    public final void rule__Propertie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4174:1: ( rule__Propertie__Group__2__Impl rule__Propertie__Group__3 )
            // InternalGsl.g:4175:2: rule__Propertie__Group__2__Impl rule__Propertie__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Propertie__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Propertie__Group__3();

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
    // $ANTLR end "rule__Propertie__Group__2"


    // $ANTLR start "rule__Propertie__Group__2__Impl"
    // InternalGsl.g:4182:1: rule__Propertie__Group__2__Impl : ( '{' ) ;
    public final void rule__Propertie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4186:1: ( ( '{' ) )
            // InternalGsl.g:4187:1: ( '{' )
            {
            // InternalGsl.g:4187:1: ( '{' )
            // InternalGsl.g:4188:2: '{'
            {
             before(grammarAccess.getPropertieAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPropertieAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__Group__2__Impl"


    // $ANTLR start "rule__Propertie__Group__3"
    // InternalGsl.g:4197:1: rule__Propertie__Group__3 : rule__Propertie__Group__3__Impl rule__Propertie__Group__4 ;
    public final void rule__Propertie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4201:1: ( rule__Propertie__Group__3__Impl rule__Propertie__Group__4 )
            // InternalGsl.g:4202:2: rule__Propertie__Group__3__Impl rule__Propertie__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Propertie__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Propertie__Group__4();

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
    // $ANTLR end "rule__Propertie__Group__3"


    // $ANTLR start "rule__Propertie__Group__3__Impl"
    // InternalGsl.g:4209:1: rule__Propertie__Group__3__Impl : ( ( rule__Propertie__Group_3__0 )? ) ;
    public final void rule__Propertie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4213:1: ( ( ( rule__Propertie__Group_3__0 )? ) )
            // InternalGsl.g:4214:1: ( ( rule__Propertie__Group_3__0 )? )
            {
            // InternalGsl.g:4214:1: ( ( rule__Propertie__Group_3__0 )? )
            // InternalGsl.g:4215:2: ( rule__Propertie__Group_3__0 )?
            {
             before(grammarAccess.getPropertieAccess().getGroup_3()); 
            // InternalGsl.g:4216:2: ( rule__Propertie__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGsl.g:4216:3: rule__Propertie__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Propertie__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertieAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__Group__3__Impl"


    // $ANTLR start "rule__Propertie__Group__4"
    // InternalGsl.g:4224:1: rule__Propertie__Group__4 : rule__Propertie__Group__4__Impl rule__Propertie__Group__5 ;
    public final void rule__Propertie__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4228:1: ( rule__Propertie__Group__4__Impl rule__Propertie__Group__5 )
            // InternalGsl.g:4229:2: rule__Propertie__Group__4__Impl rule__Propertie__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Propertie__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Propertie__Group__5();

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
    // $ANTLR end "rule__Propertie__Group__4"


    // $ANTLR start "rule__Propertie__Group__4__Impl"
    // InternalGsl.g:4236:1: rule__Propertie__Group__4__Impl : ( ( rule__Propertie__Group_4__0 )? ) ;
    public final void rule__Propertie__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4240:1: ( ( ( rule__Propertie__Group_4__0 )? ) )
            // InternalGsl.g:4241:1: ( ( rule__Propertie__Group_4__0 )? )
            {
            // InternalGsl.g:4241:1: ( ( rule__Propertie__Group_4__0 )? )
            // InternalGsl.g:4242:2: ( rule__Propertie__Group_4__0 )?
            {
             before(grammarAccess.getPropertieAccess().getGroup_4()); 
            // InternalGsl.g:4243:2: ( rule__Propertie__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGsl.g:4243:3: rule__Propertie__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Propertie__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertieAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__Group__4__Impl"


    // $ANTLR start "rule__Propertie__Group__5"
    // InternalGsl.g:4251:1: rule__Propertie__Group__5 : rule__Propertie__Group__5__Impl rule__Propertie__Group__6 ;
    public final void rule__Propertie__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4255:1: ( rule__Propertie__Group__5__Impl rule__Propertie__Group__6 )
            // InternalGsl.g:4256:2: rule__Propertie__Group__5__Impl rule__Propertie__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__Propertie__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Propertie__Group__6();

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
    // $ANTLR end "rule__Propertie__Group__5"


    // $ANTLR start "rule__Propertie__Group__5__Impl"
    // InternalGsl.g:4263:1: rule__Propertie__Group__5__Impl : ( ( rule__Propertie__Group_5__0 )? ) ;
    public final void rule__Propertie__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4267:1: ( ( ( rule__Propertie__Group_5__0 )? ) )
            // InternalGsl.g:4268:1: ( ( rule__Propertie__Group_5__0 )? )
            {
            // InternalGsl.g:4268:1: ( ( rule__Propertie__Group_5__0 )? )
            // InternalGsl.g:4269:2: ( rule__Propertie__Group_5__0 )?
            {
             before(grammarAccess.getPropertieAccess().getGroup_5()); 
            // InternalGsl.g:4270:2: ( rule__Propertie__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGsl.g:4270:3: rule__Propertie__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Propertie__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertieAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__Group__5__Impl"


    // $ANTLR start "rule__Propertie__Group__6"
    // InternalGsl.g:4278:1: rule__Propertie__Group__6 : rule__Propertie__Group__6__Impl ;
    public final void rule__Propertie__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4282:1: ( rule__Propertie__Group__6__Impl )
            // InternalGsl.g:4283:2: rule__Propertie__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Propertie__Group__6__Impl();

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
    // $ANTLR end "rule__Propertie__Group__6"


    // $ANTLR start "rule__Propertie__Group__6__Impl"
    // InternalGsl.g:4289:1: rule__Propertie__Group__6__Impl : ( '}' ) ;
    public final void rule__Propertie__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4293:1: ( ( '}' ) )
            // InternalGsl.g:4294:1: ( '}' )
            {
            // InternalGsl.g:4294:1: ( '}' )
            // InternalGsl.g:4295:2: '}'
            {
             before(grammarAccess.getPropertieAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPropertieAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__Group__6__Impl"


    // $ANTLR start "rule__Propertie__Group_3__0"
    // InternalGsl.g:4305:1: rule__Propertie__Group_3__0 : rule__Propertie__Group_3__0__Impl rule__Propertie__Group_3__1 ;
    public final void rule__Propertie__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4309:1: ( rule__Propertie__Group_3__0__Impl rule__Propertie__Group_3__1 )
            // InternalGsl.g:4310:2: rule__Propertie__Group_3__0__Impl rule__Propertie__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Propertie__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Propertie__Group_3__1();

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
    // $ANTLR end "rule__Propertie__Group_3__0"


    // $ANTLR start "rule__Propertie__Group_3__0__Impl"
    // InternalGsl.g:4317:1: rule__Propertie__Group_3__0__Impl : ( 'propertieName' ) ;
    public final void rule__Propertie__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4321:1: ( ( 'propertieName' ) )
            // InternalGsl.g:4322:1: ( 'propertieName' )
            {
            // InternalGsl.g:4322:1: ( 'propertieName' )
            // InternalGsl.g:4323:2: 'propertieName'
            {
             before(grammarAccess.getPropertieAccess().getPropertieNameKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPropertieAccess().getPropertieNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__Group_3__0__Impl"


    // $ANTLR start "rule__Propertie__Group_3__1"
    // InternalGsl.g:4332:1: rule__Propertie__Group_3__1 : rule__Propertie__Group_3__1__Impl ;
    public final void rule__Propertie__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4336:1: ( rule__Propertie__Group_3__1__Impl )
            // InternalGsl.g:4337:2: rule__Propertie__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Propertie__Group_3__1__Impl();

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
    // $ANTLR end "rule__Propertie__Group_3__1"


    // $ANTLR start "rule__Propertie__Group_3__1__Impl"
    // InternalGsl.g:4343:1: rule__Propertie__Group_3__1__Impl : ( ( rule__Propertie__PropertieNameAssignment_3_1 ) ) ;
    public final void rule__Propertie__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4347:1: ( ( ( rule__Propertie__PropertieNameAssignment_3_1 ) ) )
            // InternalGsl.g:4348:1: ( ( rule__Propertie__PropertieNameAssignment_3_1 ) )
            {
            // InternalGsl.g:4348:1: ( ( rule__Propertie__PropertieNameAssignment_3_1 ) )
            // InternalGsl.g:4349:2: ( rule__Propertie__PropertieNameAssignment_3_1 )
            {
             before(grammarAccess.getPropertieAccess().getPropertieNameAssignment_3_1()); 
            // InternalGsl.g:4350:2: ( rule__Propertie__PropertieNameAssignment_3_1 )
            // InternalGsl.g:4350:3: rule__Propertie__PropertieNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Propertie__PropertieNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertieAccess().getPropertieNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__Group_3__1__Impl"


    // $ANTLR start "rule__Propertie__Group_4__0"
    // InternalGsl.g:4359:1: rule__Propertie__Group_4__0 : rule__Propertie__Group_4__0__Impl rule__Propertie__Group_4__1 ;
    public final void rule__Propertie__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4363:1: ( rule__Propertie__Group_4__0__Impl rule__Propertie__Group_4__1 )
            // InternalGsl.g:4364:2: rule__Propertie__Group_4__0__Impl rule__Propertie__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Propertie__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Propertie__Group_4__1();

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
    // $ANTLR end "rule__Propertie__Group_4__0"


    // $ANTLR start "rule__Propertie__Group_4__0__Impl"
    // InternalGsl.g:4371:1: rule__Propertie__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Propertie__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4375:1: ( ( 'type' ) )
            // InternalGsl.g:4376:1: ( 'type' )
            {
            // InternalGsl.g:4376:1: ( 'type' )
            // InternalGsl.g:4377:2: 'type'
            {
             before(grammarAccess.getPropertieAccess().getTypeKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPropertieAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__Group_4__0__Impl"


    // $ANTLR start "rule__Propertie__Group_4__1"
    // InternalGsl.g:4386:1: rule__Propertie__Group_4__1 : rule__Propertie__Group_4__1__Impl ;
    public final void rule__Propertie__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4390:1: ( rule__Propertie__Group_4__1__Impl )
            // InternalGsl.g:4391:2: rule__Propertie__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Propertie__Group_4__1__Impl();

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
    // $ANTLR end "rule__Propertie__Group_4__1"


    // $ANTLR start "rule__Propertie__Group_4__1__Impl"
    // InternalGsl.g:4397:1: rule__Propertie__Group_4__1__Impl : ( ( rule__Propertie__TypeAssignment_4_1 ) ) ;
    public final void rule__Propertie__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4401:1: ( ( ( rule__Propertie__TypeAssignment_4_1 ) ) )
            // InternalGsl.g:4402:1: ( ( rule__Propertie__TypeAssignment_4_1 ) )
            {
            // InternalGsl.g:4402:1: ( ( rule__Propertie__TypeAssignment_4_1 ) )
            // InternalGsl.g:4403:2: ( rule__Propertie__TypeAssignment_4_1 )
            {
             before(grammarAccess.getPropertieAccess().getTypeAssignment_4_1()); 
            // InternalGsl.g:4404:2: ( rule__Propertie__TypeAssignment_4_1 )
            // InternalGsl.g:4404:3: rule__Propertie__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Propertie__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertieAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__Group_4__1__Impl"


    // $ANTLR start "rule__Propertie__Group_5__0"
    // InternalGsl.g:4413:1: rule__Propertie__Group_5__0 : rule__Propertie__Group_5__0__Impl rule__Propertie__Group_5__1 ;
    public final void rule__Propertie__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4417:1: ( rule__Propertie__Group_5__0__Impl rule__Propertie__Group_5__1 )
            // InternalGsl.g:4418:2: rule__Propertie__Group_5__0__Impl rule__Propertie__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Propertie__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Propertie__Group_5__1();

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
    // $ANTLR end "rule__Propertie__Group_5__0"


    // $ANTLR start "rule__Propertie__Group_5__0__Impl"
    // InternalGsl.g:4425:1: rule__Propertie__Group_5__0__Impl : ( 'initValue' ) ;
    public final void rule__Propertie__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4429:1: ( ( 'initValue' ) )
            // InternalGsl.g:4430:1: ( 'initValue' )
            {
            // InternalGsl.g:4430:1: ( 'initValue' )
            // InternalGsl.g:4431:2: 'initValue'
            {
             before(grammarAccess.getPropertieAccess().getInitValueKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPropertieAccess().getInitValueKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__Group_5__0__Impl"


    // $ANTLR start "rule__Propertie__Group_5__1"
    // InternalGsl.g:4440:1: rule__Propertie__Group_5__1 : rule__Propertie__Group_5__1__Impl ;
    public final void rule__Propertie__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4444:1: ( rule__Propertie__Group_5__1__Impl )
            // InternalGsl.g:4445:2: rule__Propertie__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Propertie__Group_5__1__Impl();

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
    // $ANTLR end "rule__Propertie__Group_5__1"


    // $ANTLR start "rule__Propertie__Group_5__1__Impl"
    // InternalGsl.g:4451:1: rule__Propertie__Group_5__1__Impl : ( ( rule__Propertie__InitValueAssignment_5_1 ) ) ;
    public final void rule__Propertie__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4455:1: ( ( ( rule__Propertie__InitValueAssignment_5_1 ) ) )
            // InternalGsl.g:4456:1: ( ( rule__Propertie__InitValueAssignment_5_1 ) )
            {
            // InternalGsl.g:4456:1: ( ( rule__Propertie__InitValueAssignment_5_1 ) )
            // InternalGsl.g:4457:2: ( rule__Propertie__InitValueAssignment_5_1 )
            {
             before(grammarAccess.getPropertieAccess().getInitValueAssignment_5_1()); 
            // InternalGsl.g:4458:2: ( rule__Propertie__InitValueAssignment_5_1 )
            // InternalGsl.g:4458:3: rule__Propertie__InitValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Propertie__InitValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertieAccess().getInitValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__Group_5__1__Impl"


    // $ANTLR start "rule__ComplexeAction__Group__0"
    // InternalGsl.g:4467:1: rule__ComplexeAction__Group__0 : rule__ComplexeAction__Group__0__Impl rule__ComplexeAction__Group__1 ;
    public final void rule__ComplexeAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4471:1: ( rule__ComplexeAction__Group__0__Impl rule__ComplexeAction__Group__1 )
            // InternalGsl.g:4472:2: rule__ComplexeAction__Group__0__Impl rule__ComplexeAction__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__ComplexeAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexeAction__Group__1();

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
    // $ANTLR end "rule__ComplexeAction__Group__0"


    // $ANTLR start "rule__ComplexeAction__Group__0__Impl"
    // InternalGsl.g:4479:1: rule__ComplexeAction__Group__0__Impl : ( () ) ;
    public final void rule__ComplexeAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4483:1: ( ( () ) )
            // InternalGsl.g:4484:1: ( () )
            {
            // InternalGsl.g:4484:1: ( () )
            // InternalGsl.g:4485:2: ()
            {
             before(grammarAccess.getComplexeActionAccess().getComplexeActionAction_0()); 
            // InternalGsl.g:4486:2: ()
            // InternalGsl.g:4486:3: 
            {
            }

             after(grammarAccess.getComplexeActionAccess().getComplexeActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexeAction__Group__0__Impl"


    // $ANTLR start "rule__ComplexeAction__Group__1"
    // InternalGsl.g:4494:1: rule__ComplexeAction__Group__1 : rule__ComplexeAction__Group__1__Impl rule__ComplexeAction__Group__2 ;
    public final void rule__ComplexeAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4498:1: ( rule__ComplexeAction__Group__1__Impl rule__ComplexeAction__Group__2 )
            // InternalGsl.g:4499:2: rule__ComplexeAction__Group__1__Impl rule__ComplexeAction__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ComplexeAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexeAction__Group__2();

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
    // $ANTLR end "rule__ComplexeAction__Group__1"


    // $ANTLR start "rule__ComplexeAction__Group__1__Impl"
    // InternalGsl.g:4506:1: rule__ComplexeAction__Group__1__Impl : ( 'ComplexeAction' ) ;
    public final void rule__ComplexeAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4510:1: ( ( 'ComplexeAction' ) )
            // InternalGsl.g:4511:1: ( 'ComplexeAction' )
            {
            // InternalGsl.g:4511:1: ( 'ComplexeAction' )
            // InternalGsl.g:4512:2: 'ComplexeAction'
            {
             before(grammarAccess.getComplexeActionAccess().getComplexeActionKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getComplexeActionAccess().getComplexeActionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexeAction__Group__1__Impl"


    // $ANTLR start "rule__ComplexeAction__Group__2"
    // InternalGsl.g:4521:1: rule__ComplexeAction__Group__2 : rule__ComplexeAction__Group__2__Impl rule__ComplexeAction__Group__3 ;
    public final void rule__ComplexeAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4525:1: ( rule__ComplexeAction__Group__2__Impl rule__ComplexeAction__Group__3 )
            // InternalGsl.g:4526:2: rule__ComplexeAction__Group__2__Impl rule__ComplexeAction__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ComplexeAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexeAction__Group__3();

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
    // $ANTLR end "rule__ComplexeAction__Group__2"


    // $ANTLR start "rule__ComplexeAction__Group__2__Impl"
    // InternalGsl.g:4533:1: rule__ComplexeAction__Group__2__Impl : ( ( rule__ComplexeAction__IdAssignment_2 ) ) ;
    public final void rule__ComplexeAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4537:1: ( ( ( rule__ComplexeAction__IdAssignment_2 ) ) )
            // InternalGsl.g:4538:1: ( ( rule__ComplexeAction__IdAssignment_2 ) )
            {
            // InternalGsl.g:4538:1: ( ( rule__ComplexeAction__IdAssignment_2 ) )
            // InternalGsl.g:4539:2: ( rule__ComplexeAction__IdAssignment_2 )
            {
             before(grammarAccess.getComplexeActionAccess().getIdAssignment_2()); 
            // InternalGsl.g:4540:2: ( rule__ComplexeAction__IdAssignment_2 )
            // InternalGsl.g:4540:3: rule__ComplexeAction__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComplexeAction__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexeActionAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexeAction__Group__2__Impl"


    // $ANTLR start "rule__ComplexeAction__Group__3"
    // InternalGsl.g:4548:1: rule__ComplexeAction__Group__3 : rule__ComplexeAction__Group__3__Impl rule__ComplexeAction__Group__4 ;
    public final void rule__ComplexeAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4552:1: ( rule__ComplexeAction__Group__3__Impl rule__ComplexeAction__Group__4 )
            // InternalGsl.g:4553:2: rule__ComplexeAction__Group__3__Impl rule__ComplexeAction__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__ComplexeAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexeAction__Group__4();

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
    // $ANTLR end "rule__ComplexeAction__Group__3"


    // $ANTLR start "rule__ComplexeAction__Group__3__Impl"
    // InternalGsl.g:4560:1: rule__ComplexeAction__Group__3__Impl : ( '{' ) ;
    public final void rule__ComplexeAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4564:1: ( ( '{' ) )
            // InternalGsl.g:4565:1: ( '{' )
            {
            // InternalGsl.g:4565:1: ( '{' )
            // InternalGsl.g:4566:2: '{'
            {
             before(grammarAccess.getComplexeActionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComplexeActionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexeAction__Group__3__Impl"


    // $ANTLR start "rule__ComplexeAction__Group__4"
    // InternalGsl.g:4575:1: rule__ComplexeAction__Group__4 : rule__ComplexeAction__Group__4__Impl rule__ComplexeAction__Group__5 ;
    public final void rule__ComplexeAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4579:1: ( rule__ComplexeAction__Group__4__Impl rule__ComplexeAction__Group__5 )
            // InternalGsl.g:4580:2: rule__ComplexeAction__Group__4__Impl rule__ComplexeAction__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__ComplexeAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexeAction__Group__5();

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
    // $ANTLR end "rule__ComplexeAction__Group__4"


    // $ANTLR start "rule__ComplexeAction__Group__4__Impl"
    // InternalGsl.g:4587:1: rule__ComplexeAction__Group__4__Impl : ( ( rule__ComplexeAction__Group_4__0 )? ) ;
    public final void rule__ComplexeAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4591:1: ( ( ( rule__ComplexeAction__Group_4__0 )? ) )
            // InternalGsl.g:4592:1: ( ( rule__ComplexeAction__Group_4__0 )? )
            {
            // InternalGsl.g:4592:1: ( ( rule__ComplexeAction__Group_4__0 )? )
            // InternalGsl.g:4593:2: ( rule__ComplexeAction__Group_4__0 )?
            {
             before(grammarAccess.getComplexeActionAccess().getGroup_4()); 
            // InternalGsl.g:4594:2: ( rule__ComplexeAction__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalGsl.g:4594:3: rule__ComplexeAction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexeAction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexeActionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexeAction__Group__4__Impl"


    // $ANTLR start "rule__ComplexeAction__Group__5"
    // InternalGsl.g:4602:1: rule__ComplexeAction__Group__5 : rule__ComplexeAction__Group__5__Impl ;
    public final void rule__ComplexeAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4606:1: ( rule__ComplexeAction__Group__5__Impl )
            // InternalGsl.g:4607:2: rule__ComplexeAction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexeAction__Group__5__Impl();

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
    // $ANTLR end "rule__ComplexeAction__Group__5"


    // $ANTLR start "rule__ComplexeAction__Group__5__Impl"
    // InternalGsl.g:4613:1: rule__ComplexeAction__Group__5__Impl : ( '}' ) ;
    public final void rule__ComplexeAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4617:1: ( ( '}' ) )
            // InternalGsl.g:4618:1: ( '}' )
            {
            // InternalGsl.g:4618:1: ( '}' )
            // InternalGsl.g:4619:2: '}'
            {
             before(grammarAccess.getComplexeActionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComplexeActionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexeAction__Group__5__Impl"


    // $ANTLR start "rule__ComplexeAction__Group_4__0"
    // InternalGsl.g:4629:1: rule__ComplexeAction__Group_4__0 : rule__ComplexeAction__Group_4__0__Impl rule__ComplexeAction__Group_4__1 ;
    public final void rule__ComplexeAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4633:1: ( rule__ComplexeAction__Group_4__0__Impl rule__ComplexeAction__Group_4__1 )
            // InternalGsl.g:4634:2: rule__ComplexeAction__Group_4__0__Impl rule__ComplexeAction__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__ComplexeAction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexeAction__Group_4__1();

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
    // $ANTLR end "rule__ComplexeAction__Group_4__0"


    // $ANTLR start "rule__ComplexeAction__Group_4__0__Impl"
    // InternalGsl.g:4641:1: rule__ComplexeAction__Group_4__0__Impl : ( 'actionName' ) ;
    public final void rule__ComplexeAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4645:1: ( ( 'actionName' ) )
            // InternalGsl.g:4646:1: ( 'actionName' )
            {
            // InternalGsl.g:4646:1: ( 'actionName' )
            // InternalGsl.g:4647:2: 'actionName'
            {
             before(grammarAccess.getComplexeActionAccess().getActionNameKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getComplexeActionAccess().getActionNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexeAction__Group_4__0__Impl"


    // $ANTLR start "rule__ComplexeAction__Group_4__1"
    // InternalGsl.g:4656:1: rule__ComplexeAction__Group_4__1 : rule__ComplexeAction__Group_4__1__Impl ;
    public final void rule__ComplexeAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4660:1: ( rule__ComplexeAction__Group_4__1__Impl )
            // InternalGsl.g:4661:2: rule__ComplexeAction__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexeAction__Group_4__1__Impl();

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
    // $ANTLR end "rule__ComplexeAction__Group_4__1"


    // $ANTLR start "rule__ComplexeAction__Group_4__1__Impl"
    // InternalGsl.g:4667:1: rule__ComplexeAction__Group_4__1__Impl : ( ( rule__ComplexeAction__ActionNameAssignment_4_1 ) ) ;
    public final void rule__ComplexeAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4671:1: ( ( ( rule__ComplexeAction__ActionNameAssignment_4_1 ) ) )
            // InternalGsl.g:4672:1: ( ( rule__ComplexeAction__ActionNameAssignment_4_1 ) )
            {
            // InternalGsl.g:4672:1: ( ( rule__ComplexeAction__ActionNameAssignment_4_1 ) )
            // InternalGsl.g:4673:2: ( rule__ComplexeAction__ActionNameAssignment_4_1 )
            {
             before(grammarAccess.getComplexeActionAccess().getActionNameAssignment_4_1()); 
            // InternalGsl.g:4674:2: ( rule__ComplexeAction__ActionNameAssignment_4_1 )
            // InternalGsl.g:4674:3: rule__ComplexeAction__ActionNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexeAction__ActionNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexeActionAccess().getActionNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexeAction__Group_4__1__Impl"


    // $ANTLR start "rule__Reflex__Group__0"
    // InternalGsl.g:4683:1: rule__Reflex__Group__0 : rule__Reflex__Group__0__Impl rule__Reflex__Group__1 ;
    public final void rule__Reflex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4687:1: ( rule__Reflex__Group__0__Impl rule__Reflex__Group__1 )
            // InternalGsl.g:4688:2: rule__Reflex__Group__0__Impl rule__Reflex__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Reflex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reflex__Group__1();

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
    // $ANTLR end "rule__Reflex__Group__0"


    // $ANTLR start "rule__Reflex__Group__0__Impl"
    // InternalGsl.g:4695:1: rule__Reflex__Group__0__Impl : ( () ) ;
    public final void rule__Reflex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4699:1: ( ( () ) )
            // InternalGsl.g:4700:1: ( () )
            {
            // InternalGsl.g:4700:1: ( () )
            // InternalGsl.g:4701:2: ()
            {
             before(grammarAccess.getReflexAccess().getReflexAction_0()); 
            // InternalGsl.g:4702:2: ()
            // InternalGsl.g:4702:3: 
            {
            }

             after(grammarAccess.getReflexAccess().getReflexAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reflex__Group__0__Impl"


    // $ANTLR start "rule__Reflex__Group__1"
    // InternalGsl.g:4710:1: rule__Reflex__Group__1 : rule__Reflex__Group__1__Impl rule__Reflex__Group__2 ;
    public final void rule__Reflex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4714:1: ( rule__Reflex__Group__1__Impl rule__Reflex__Group__2 )
            // InternalGsl.g:4715:2: rule__Reflex__Group__1__Impl rule__Reflex__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Reflex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reflex__Group__2();

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
    // $ANTLR end "rule__Reflex__Group__1"


    // $ANTLR start "rule__Reflex__Group__1__Impl"
    // InternalGsl.g:4722:1: rule__Reflex__Group__1__Impl : ( 'Reflex' ) ;
    public final void rule__Reflex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4726:1: ( ( 'Reflex' ) )
            // InternalGsl.g:4727:1: ( 'Reflex' )
            {
            // InternalGsl.g:4727:1: ( 'Reflex' )
            // InternalGsl.g:4728:2: 'Reflex'
            {
             before(grammarAccess.getReflexAccess().getReflexKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getReflexAccess().getReflexKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reflex__Group__1__Impl"


    // $ANTLR start "rule__Reflex__Group__2"
    // InternalGsl.g:4737:1: rule__Reflex__Group__2 : rule__Reflex__Group__2__Impl rule__Reflex__Group__3 ;
    public final void rule__Reflex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4741:1: ( rule__Reflex__Group__2__Impl rule__Reflex__Group__3 )
            // InternalGsl.g:4742:2: rule__Reflex__Group__2__Impl rule__Reflex__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Reflex__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reflex__Group__3();

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
    // $ANTLR end "rule__Reflex__Group__2"


    // $ANTLR start "rule__Reflex__Group__2__Impl"
    // InternalGsl.g:4749:1: rule__Reflex__Group__2__Impl : ( ( rule__Reflex__IdAssignment_2 ) ) ;
    public final void rule__Reflex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4753:1: ( ( ( rule__Reflex__IdAssignment_2 ) ) )
            // InternalGsl.g:4754:1: ( ( rule__Reflex__IdAssignment_2 ) )
            {
            // InternalGsl.g:4754:1: ( ( rule__Reflex__IdAssignment_2 ) )
            // InternalGsl.g:4755:2: ( rule__Reflex__IdAssignment_2 )
            {
             before(grammarAccess.getReflexAccess().getIdAssignment_2()); 
            // InternalGsl.g:4756:2: ( rule__Reflex__IdAssignment_2 )
            // InternalGsl.g:4756:3: rule__Reflex__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Reflex__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReflexAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reflex__Group__2__Impl"


    // $ANTLR start "rule__Reflex__Group__3"
    // InternalGsl.g:4764:1: rule__Reflex__Group__3 : rule__Reflex__Group__3__Impl rule__Reflex__Group__4 ;
    public final void rule__Reflex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4768:1: ( rule__Reflex__Group__3__Impl rule__Reflex__Group__4 )
            // InternalGsl.g:4769:2: rule__Reflex__Group__3__Impl rule__Reflex__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Reflex__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reflex__Group__4();

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
    // $ANTLR end "rule__Reflex__Group__3"


    // $ANTLR start "rule__Reflex__Group__3__Impl"
    // InternalGsl.g:4776:1: rule__Reflex__Group__3__Impl : ( '{' ) ;
    public final void rule__Reflex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4780:1: ( ( '{' ) )
            // InternalGsl.g:4781:1: ( '{' )
            {
            // InternalGsl.g:4781:1: ( '{' )
            // InternalGsl.g:4782:2: '{'
            {
             before(grammarAccess.getReflexAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getReflexAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reflex__Group__3__Impl"


    // $ANTLR start "rule__Reflex__Group__4"
    // InternalGsl.g:4791:1: rule__Reflex__Group__4 : rule__Reflex__Group__4__Impl rule__Reflex__Group__5 ;
    public final void rule__Reflex__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4795:1: ( rule__Reflex__Group__4__Impl rule__Reflex__Group__5 )
            // InternalGsl.g:4796:2: rule__Reflex__Group__4__Impl rule__Reflex__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Reflex__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reflex__Group__5();

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
    // $ANTLR end "rule__Reflex__Group__4"


    // $ANTLR start "rule__Reflex__Group__4__Impl"
    // InternalGsl.g:4803:1: rule__Reflex__Group__4__Impl : ( ( rule__Reflex__Group_4__0 )? ) ;
    public final void rule__Reflex__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4807:1: ( ( ( rule__Reflex__Group_4__0 )? ) )
            // InternalGsl.g:4808:1: ( ( rule__Reflex__Group_4__0 )? )
            {
            // InternalGsl.g:4808:1: ( ( rule__Reflex__Group_4__0 )? )
            // InternalGsl.g:4809:2: ( rule__Reflex__Group_4__0 )?
            {
             before(grammarAccess.getReflexAccess().getGroup_4()); 
            // InternalGsl.g:4810:2: ( rule__Reflex__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGsl.g:4810:3: rule__Reflex__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reflex__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReflexAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reflex__Group__4__Impl"


    // $ANTLR start "rule__Reflex__Group__5"
    // InternalGsl.g:4818:1: rule__Reflex__Group__5 : rule__Reflex__Group__5__Impl rule__Reflex__Group__6 ;
    public final void rule__Reflex__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4822:1: ( rule__Reflex__Group__5__Impl rule__Reflex__Group__6 )
            // InternalGsl.g:4823:2: rule__Reflex__Group__5__Impl rule__Reflex__Group__6
            {
            pushFollow(FOLLOW_35);
            rule__Reflex__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reflex__Group__6();

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
    // $ANTLR end "rule__Reflex__Group__5"


    // $ANTLR start "rule__Reflex__Group__5__Impl"
    // InternalGsl.g:4830:1: rule__Reflex__Group__5__Impl : ( ( rule__Reflex__Group_5__0 )? ) ;
    public final void rule__Reflex__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4834:1: ( ( ( rule__Reflex__Group_5__0 )? ) )
            // InternalGsl.g:4835:1: ( ( rule__Reflex__Group_5__0 )? )
            {
            // InternalGsl.g:4835:1: ( ( rule__Reflex__Group_5__0 )? )
            // InternalGsl.g:4836:2: ( rule__Reflex__Group_5__0 )?
            {
             before(grammarAccess.getReflexAccess().getGroup_5()); 
            // InternalGsl.g:4837:2: ( rule__Reflex__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==47) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGsl.g:4837:3: rule__Reflex__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reflex__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReflexAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reflex__Group__5__Impl"


    // $ANTLR start "rule__Reflex__Group__6"
    // InternalGsl.g:4845:1: rule__Reflex__Group__6 : rule__Reflex__Group__6__Impl ;
    public final void rule__Reflex__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4849:1: ( rule__Reflex__Group__6__Impl )
            // InternalGsl.g:4850:2: rule__Reflex__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reflex__Group__6__Impl();

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
    // $ANTLR end "rule__Reflex__Group__6"


    // $ANTLR start "rule__Reflex__Group__6__Impl"
    // InternalGsl.g:4856:1: rule__Reflex__Group__6__Impl : ( '}' ) ;
    public final void rule__Reflex__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4860:1: ( ( '}' ) )
            // InternalGsl.g:4861:1: ( '}' )
            {
            // InternalGsl.g:4861:1: ( '}' )
            // InternalGsl.g:4862:2: '}'
            {
             before(grammarAccess.getReflexAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getReflexAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reflex__Group__6__Impl"


    // $ANTLR start "rule__Reflex__Group_4__0"
    // InternalGsl.g:4872:1: rule__Reflex__Group_4__0 : rule__Reflex__Group_4__0__Impl rule__Reflex__Group_4__1 ;
    public final void rule__Reflex__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4876:1: ( rule__Reflex__Group_4__0__Impl rule__Reflex__Group_4__1 )
            // InternalGsl.g:4877:2: rule__Reflex__Group_4__0__Impl rule__Reflex__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Reflex__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reflex__Group_4__1();

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
    // $ANTLR end "rule__Reflex__Group_4__0"


    // $ANTLR start "rule__Reflex__Group_4__0__Impl"
    // InternalGsl.g:4884:1: rule__Reflex__Group_4__0__Impl : ( 'actionName' ) ;
    public final void rule__Reflex__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4888:1: ( ( 'actionName' ) )
            // InternalGsl.g:4889:1: ( 'actionName' )
            {
            // InternalGsl.g:4889:1: ( 'actionName' )
            // InternalGsl.g:4890:2: 'actionName'
            {
             before(grammarAccess.getReflexAccess().getActionNameKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getReflexAccess().getActionNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reflex__Group_4__0__Impl"


    // $ANTLR start "rule__Reflex__Group_4__1"
    // InternalGsl.g:4899:1: rule__Reflex__Group_4__1 : rule__Reflex__Group_4__1__Impl ;
    public final void rule__Reflex__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4903:1: ( rule__Reflex__Group_4__1__Impl )
            // InternalGsl.g:4904:2: rule__Reflex__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reflex__Group_4__1__Impl();

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
    // $ANTLR end "rule__Reflex__Group_4__1"


    // $ANTLR start "rule__Reflex__Group_4__1__Impl"
    // InternalGsl.g:4910:1: rule__Reflex__Group_4__1__Impl : ( ( rule__Reflex__ActionNameAssignment_4_1 ) ) ;
    public final void rule__Reflex__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4914:1: ( ( ( rule__Reflex__ActionNameAssignment_4_1 ) ) )
            // InternalGsl.g:4915:1: ( ( rule__Reflex__ActionNameAssignment_4_1 ) )
            {
            // InternalGsl.g:4915:1: ( ( rule__Reflex__ActionNameAssignment_4_1 ) )
            // InternalGsl.g:4916:2: ( rule__Reflex__ActionNameAssignment_4_1 )
            {
             before(grammarAccess.getReflexAccess().getActionNameAssignment_4_1()); 
            // InternalGsl.g:4917:2: ( rule__Reflex__ActionNameAssignment_4_1 )
            // InternalGsl.g:4917:3: rule__Reflex__ActionNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Reflex__ActionNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReflexAccess().getActionNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reflex__Group_4__1__Impl"


    // $ANTLR start "rule__Reflex__Group_5__0"
    // InternalGsl.g:4926:1: rule__Reflex__Group_5__0 : rule__Reflex__Group_5__0__Impl rule__Reflex__Group_5__1 ;
    public final void rule__Reflex__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4930:1: ( rule__Reflex__Group_5__0__Impl rule__Reflex__Group_5__1 )
            // InternalGsl.g:4931:2: rule__Reflex__Group_5__0__Impl rule__Reflex__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Reflex__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reflex__Group_5__1();

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
    // $ANTLR end "rule__Reflex__Group_5__0"


    // $ANTLR start "rule__Reflex__Group_5__0__Impl"
    // InternalGsl.g:4938:1: rule__Reflex__Group_5__0__Impl : ( 'condition' ) ;
    public final void rule__Reflex__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4942:1: ( ( 'condition' ) )
            // InternalGsl.g:4943:1: ( 'condition' )
            {
            // InternalGsl.g:4943:1: ( 'condition' )
            // InternalGsl.g:4944:2: 'condition'
            {
             before(grammarAccess.getReflexAccess().getConditionKeyword_5_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getReflexAccess().getConditionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reflex__Group_5__0__Impl"


    // $ANTLR start "rule__Reflex__Group_5__1"
    // InternalGsl.g:4953:1: rule__Reflex__Group_5__1 : rule__Reflex__Group_5__1__Impl ;
    public final void rule__Reflex__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4957:1: ( rule__Reflex__Group_5__1__Impl )
            // InternalGsl.g:4958:2: rule__Reflex__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reflex__Group_5__1__Impl();

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
    // $ANTLR end "rule__Reflex__Group_5__1"


    // $ANTLR start "rule__Reflex__Group_5__1__Impl"
    // InternalGsl.g:4964:1: rule__Reflex__Group_5__1__Impl : ( ( rule__Reflex__ConditionAssignment_5_1 ) ) ;
    public final void rule__Reflex__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4968:1: ( ( ( rule__Reflex__ConditionAssignment_5_1 ) ) )
            // InternalGsl.g:4969:1: ( ( rule__Reflex__ConditionAssignment_5_1 ) )
            {
            // InternalGsl.g:4969:1: ( ( rule__Reflex__ConditionAssignment_5_1 ) )
            // InternalGsl.g:4970:2: ( rule__Reflex__ConditionAssignment_5_1 )
            {
             before(grammarAccess.getReflexAccess().getConditionAssignment_5_1()); 
            // InternalGsl.g:4971:2: ( rule__Reflex__ConditionAssignment_5_1 )
            // InternalGsl.g:4971:3: rule__Reflex__ConditionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Reflex__ConditionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getReflexAccess().getConditionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reflex__Group_5__1__Impl"


    // $ANTLR start "rule__SimpleAction__Group__0"
    // InternalGsl.g:4980:1: rule__SimpleAction__Group__0 : rule__SimpleAction__Group__0__Impl rule__SimpleAction__Group__1 ;
    public final void rule__SimpleAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4984:1: ( rule__SimpleAction__Group__0__Impl rule__SimpleAction__Group__1 )
            // InternalGsl.g:4985:2: rule__SimpleAction__Group__0__Impl rule__SimpleAction__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__SimpleAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group__1();

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
    // $ANTLR end "rule__SimpleAction__Group__0"


    // $ANTLR start "rule__SimpleAction__Group__0__Impl"
    // InternalGsl.g:4992:1: rule__SimpleAction__Group__0__Impl : ( () ) ;
    public final void rule__SimpleAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:4996:1: ( ( () ) )
            // InternalGsl.g:4997:1: ( () )
            {
            // InternalGsl.g:4997:1: ( () )
            // InternalGsl.g:4998:2: ()
            {
             before(grammarAccess.getSimpleActionAccess().getSimpleActionAction_0()); 
            // InternalGsl.g:4999:2: ()
            // InternalGsl.g:4999:3: 
            {
            }

             after(grammarAccess.getSimpleActionAccess().getSimpleActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAction__Group__0__Impl"


    // $ANTLR start "rule__SimpleAction__Group__1"
    // InternalGsl.g:5007:1: rule__SimpleAction__Group__1 : rule__SimpleAction__Group__1__Impl rule__SimpleAction__Group__2 ;
    public final void rule__SimpleAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5011:1: ( rule__SimpleAction__Group__1__Impl rule__SimpleAction__Group__2 )
            // InternalGsl.g:5012:2: rule__SimpleAction__Group__1__Impl rule__SimpleAction__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__SimpleAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group__2();

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
    // $ANTLR end "rule__SimpleAction__Group__1"


    // $ANTLR start "rule__SimpleAction__Group__1__Impl"
    // InternalGsl.g:5019:1: rule__SimpleAction__Group__1__Impl : ( 'simpleAction' ) ;
    public final void rule__SimpleAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5023:1: ( ( 'simpleAction' ) )
            // InternalGsl.g:5024:1: ( 'simpleAction' )
            {
            // InternalGsl.g:5024:1: ( 'simpleAction' )
            // InternalGsl.g:5025:2: 'simpleAction'
            {
             before(grammarAccess.getSimpleActionAccess().getSimpleActionKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSimpleActionAccess().getSimpleActionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAction__Group__1__Impl"


    // $ANTLR start "rule__SimpleAction__Group__2"
    // InternalGsl.g:5034:1: rule__SimpleAction__Group__2 : rule__SimpleAction__Group__2__Impl rule__SimpleAction__Group__3 ;
    public final void rule__SimpleAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5038:1: ( rule__SimpleAction__Group__2__Impl rule__SimpleAction__Group__3 )
            // InternalGsl.g:5039:2: rule__SimpleAction__Group__2__Impl rule__SimpleAction__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__SimpleAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group__3();

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
    // $ANTLR end "rule__SimpleAction__Group__2"


    // $ANTLR start "rule__SimpleAction__Group__2__Impl"
    // InternalGsl.g:5046:1: rule__SimpleAction__Group__2__Impl : ( ( rule__SimpleAction__IdAssignment_2 ) ) ;
    public final void rule__SimpleAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5050:1: ( ( ( rule__SimpleAction__IdAssignment_2 ) ) )
            // InternalGsl.g:5051:1: ( ( rule__SimpleAction__IdAssignment_2 ) )
            {
            // InternalGsl.g:5051:1: ( ( rule__SimpleAction__IdAssignment_2 ) )
            // InternalGsl.g:5052:2: ( rule__SimpleAction__IdAssignment_2 )
            {
             before(grammarAccess.getSimpleActionAccess().getIdAssignment_2()); 
            // InternalGsl.g:5053:2: ( rule__SimpleAction__IdAssignment_2 )
            // InternalGsl.g:5053:3: rule__SimpleAction__IdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAction__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleActionAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAction__Group__2__Impl"


    // $ANTLR start "rule__SimpleAction__Group__3"
    // InternalGsl.g:5061:1: rule__SimpleAction__Group__3 : rule__SimpleAction__Group__3__Impl rule__SimpleAction__Group__4 ;
    public final void rule__SimpleAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5065:1: ( rule__SimpleAction__Group__3__Impl rule__SimpleAction__Group__4 )
            // InternalGsl.g:5066:2: rule__SimpleAction__Group__3__Impl rule__SimpleAction__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__SimpleAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group__4();

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
    // $ANTLR end "rule__SimpleAction__Group__3"


    // $ANTLR start "rule__SimpleAction__Group__3__Impl"
    // InternalGsl.g:5073:1: rule__SimpleAction__Group__3__Impl : ( '{' ) ;
    public final void rule__SimpleAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5077:1: ( ( '{' ) )
            // InternalGsl.g:5078:1: ( '{' )
            {
            // InternalGsl.g:5078:1: ( '{' )
            // InternalGsl.g:5079:2: '{'
            {
             before(grammarAccess.getSimpleActionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSimpleActionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAction__Group__3__Impl"


    // $ANTLR start "rule__SimpleAction__Group__4"
    // InternalGsl.g:5088:1: rule__SimpleAction__Group__4 : rule__SimpleAction__Group__4__Impl rule__SimpleAction__Group__5 ;
    public final void rule__SimpleAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5092:1: ( rule__SimpleAction__Group__4__Impl rule__SimpleAction__Group__5 )
            // InternalGsl.g:5093:2: rule__SimpleAction__Group__4__Impl rule__SimpleAction__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__SimpleAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group__5();

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
    // $ANTLR end "rule__SimpleAction__Group__4"


    // $ANTLR start "rule__SimpleAction__Group__4__Impl"
    // InternalGsl.g:5100:1: rule__SimpleAction__Group__4__Impl : ( ( rule__SimpleAction__Group_4__0 )? ) ;
    public final void rule__SimpleAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5104:1: ( ( ( rule__SimpleAction__Group_4__0 )? ) )
            // InternalGsl.g:5105:1: ( ( rule__SimpleAction__Group_4__0 )? )
            {
            // InternalGsl.g:5105:1: ( ( rule__SimpleAction__Group_4__0 )? )
            // InternalGsl.g:5106:2: ( rule__SimpleAction__Group_4__0 )?
            {
             before(grammarAccess.getSimpleActionAccess().getGroup_4()); 
            // InternalGsl.g:5107:2: ( rule__SimpleAction__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalGsl.g:5107:3: rule__SimpleAction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleActionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAction__Group__4__Impl"


    // $ANTLR start "rule__SimpleAction__Group__5"
    // InternalGsl.g:5115:1: rule__SimpleAction__Group__5 : rule__SimpleAction__Group__5__Impl rule__SimpleAction__Group__6 ;
    public final void rule__SimpleAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5119:1: ( rule__SimpleAction__Group__5__Impl rule__SimpleAction__Group__6 )
            // InternalGsl.g:5120:2: rule__SimpleAction__Group__5__Impl rule__SimpleAction__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__SimpleAction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group__6();

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
    // $ANTLR end "rule__SimpleAction__Group__5"


    // $ANTLR start "rule__SimpleAction__Group__5__Impl"
    // InternalGsl.g:5127:1: rule__SimpleAction__Group__5__Impl : ( ( rule__SimpleAction__Group_5__0 )? ) ;
    public final void rule__SimpleAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5131:1: ( ( ( rule__SimpleAction__Group_5__0 )? ) )
            // InternalGsl.g:5132:1: ( ( rule__SimpleAction__Group_5__0 )? )
            {
            // InternalGsl.g:5132:1: ( ( rule__SimpleAction__Group_5__0 )? )
            // InternalGsl.g:5133:2: ( rule__SimpleAction__Group_5__0 )?
            {
             before(grammarAccess.getSimpleActionAccess().getGroup_5()); 
            // InternalGsl.g:5134:2: ( rule__SimpleAction__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==49) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGsl.g:5134:3: rule__SimpleAction__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleAction__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleActionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAction__Group__5__Impl"


    // $ANTLR start "rule__SimpleAction__Group__6"
    // InternalGsl.g:5142:1: rule__SimpleAction__Group__6 : rule__SimpleAction__Group__6__Impl ;
    public final void rule__SimpleAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5146:1: ( rule__SimpleAction__Group__6__Impl )
            // InternalGsl.g:5147:2: rule__SimpleAction__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group__6__Impl();

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
    // $ANTLR end "rule__SimpleAction__Group__6"


    // $ANTLR start "rule__SimpleAction__Group__6__Impl"
    // InternalGsl.g:5153:1: rule__SimpleAction__Group__6__Impl : ( '}' ) ;
    public final void rule__SimpleAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5157:1: ( ( '}' ) )
            // InternalGsl.g:5158:1: ( '}' )
            {
            // InternalGsl.g:5158:1: ( '}' )
            // InternalGsl.g:5159:2: '}'
            {
             before(grammarAccess.getSimpleActionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSimpleActionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAction__Group__6__Impl"


    // $ANTLR start "rule__SimpleAction__Group_4__0"
    // InternalGsl.g:5169:1: rule__SimpleAction__Group_4__0 : rule__SimpleAction__Group_4__0__Impl rule__SimpleAction__Group_4__1 ;
    public final void rule__SimpleAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5173:1: ( rule__SimpleAction__Group_4__0__Impl rule__SimpleAction__Group_4__1 )
            // InternalGsl.g:5174:2: rule__SimpleAction__Group_4__0__Impl rule__SimpleAction__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__SimpleAction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group_4__1();

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
    // $ANTLR end "rule__SimpleAction__Group_4__0"


    // $ANTLR start "rule__SimpleAction__Group_4__0__Impl"
    // InternalGsl.g:5181:1: rule__SimpleAction__Group_4__0__Impl : ( 'actionName' ) ;
    public final void rule__SimpleAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5185:1: ( ( 'actionName' ) )
            // InternalGsl.g:5186:1: ( 'actionName' )
            {
            // InternalGsl.g:5186:1: ( 'actionName' )
            // InternalGsl.g:5187:2: 'actionName'
            {
             before(grammarAccess.getSimpleActionAccess().getActionNameKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSimpleActionAccess().getActionNameKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAction__Group_4__0__Impl"


    // $ANTLR start "rule__SimpleAction__Group_4__1"
    // InternalGsl.g:5196:1: rule__SimpleAction__Group_4__1 : rule__SimpleAction__Group_4__1__Impl ;
    public final void rule__SimpleAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5200:1: ( rule__SimpleAction__Group_4__1__Impl )
            // InternalGsl.g:5201:2: rule__SimpleAction__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group_4__1__Impl();

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
    // $ANTLR end "rule__SimpleAction__Group_4__1"


    // $ANTLR start "rule__SimpleAction__Group_4__1__Impl"
    // InternalGsl.g:5207:1: rule__SimpleAction__Group_4__1__Impl : ( ( rule__SimpleAction__ActionNameAssignment_4_1 ) ) ;
    public final void rule__SimpleAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5211:1: ( ( ( rule__SimpleAction__ActionNameAssignment_4_1 ) ) )
            // InternalGsl.g:5212:1: ( ( rule__SimpleAction__ActionNameAssignment_4_1 ) )
            {
            // InternalGsl.g:5212:1: ( ( rule__SimpleAction__ActionNameAssignment_4_1 ) )
            // InternalGsl.g:5213:2: ( rule__SimpleAction__ActionNameAssignment_4_1 )
            {
             before(grammarAccess.getSimpleActionAccess().getActionNameAssignment_4_1()); 
            // InternalGsl.g:5214:2: ( rule__SimpleAction__ActionNameAssignment_4_1 )
            // InternalGsl.g:5214:3: rule__SimpleAction__ActionNameAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAction__ActionNameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleActionAccess().getActionNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAction__Group_4__1__Impl"


    // $ANTLR start "rule__SimpleAction__Group_5__0"
    // InternalGsl.g:5223:1: rule__SimpleAction__Group_5__0 : rule__SimpleAction__Group_5__0__Impl rule__SimpleAction__Group_5__1 ;
    public final void rule__SimpleAction__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5227:1: ( rule__SimpleAction__Group_5__0__Impl rule__SimpleAction__Group_5__1 )
            // InternalGsl.g:5228:2: rule__SimpleAction__Group_5__0__Impl rule__SimpleAction__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__SimpleAction__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group_5__1();

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
    // $ANTLR end "rule__SimpleAction__Group_5__0"


    // $ANTLR start "rule__SimpleAction__Group_5__0__Impl"
    // InternalGsl.g:5235:1: rule__SimpleAction__Group_5__0__Impl : ( 'ReturnType' ) ;
    public final void rule__SimpleAction__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5239:1: ( ( 'ReturnType' ) )
            // InternalGsl.g:5240:1: ( 'ReturnType' )
            {
            // InternalGsl.g:5240:1: ( 'ReturnType' )
            // InternalGsl.g:5241:2: 'ReturnType'
            {
             before(grammarAccess.getSimpleActionAccess().getReturnTypeKeyword_5_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSimpleActionAccess().getReturnTypeKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAction__Group_5__0__Impl"


    // $ANTLR start "rule__SimpleAction__Group_5__1"
    // InternalGsl.g:5250:1: rule__SimpleAction__Group_5__1 : rule__SimpleAction__Group_5__1__Impl ;
    public final void rule__SimpleAction__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5254:1: ( rule__SimpleAction__Group_5__1__Impl )
            // InternalGsl.g:5255:2: rule__SimpleAction__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAction__Group_5__1__Impl();

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
    // $ANTLR end "rule__SimpleAction__Group_5__1"


    // $ANTLR start "rule__SimpleAction__Group_5__1__Impl"
    // InternalGsl.g:5261:1: rule__SimpleAction__Group_5__1__Impl : ( ( rule__SimpleAction__ReturnTypeAssignment_5_1 ) ) ;
    public final void rule__SimpleAction__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5265:1: ( ( ( rule__SimpleAction__ReturnTypeAssignment_5_1 ) ) )
            // InternalGsl.g:5266:1: ( ( rule__SimpleAction__ReturnTypeAssignment_5_1 ) )
            {
            // InternalGsl.g:5266:1: ( ( rule__SimpleAction__ReturnTypeAssignment_5_1 ) )
            // InternalGsl.g:5267:2: ( rule__SimpleAction__ReturnTypeAssignment_5_1 )
            {
             before(grammarAccess.getSimpleActionAccess().getReturnTypeAssignment_5_1()); 
            // InternalGsl.g:5268:2: ( rule__SimpleAction__ReturnTypeAssignment_5_1 )
            // InternalGsl.g:5268:3: rule__SimpleAction__ReturnTypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleAction__ReturnTypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleActionAccess().getReturnTypeAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAction__Group_5__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalGsl.g:5277:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5281:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalGsl.g:5282:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalGsl.g:5289:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5293:1: ( ( () ) )
            // InternalGsl.g:5294:1: ( () )
            {
            // InternalGsl.g:5294:1: ( () )
            // InternalGsl.g:5295:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalGsl.g:5296:2: ()
            // InternalGsl.g:5296:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalGsl.g:5304:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5308:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalGsl.g:5309:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalGsl.g:5316:1: rule__Parameter__Group__1__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5320:1: ( ( 'Parameter' ) )
            // InternalGsl.g:5321:1: ( 'Parameter' )
            {
            // InternalGsl.g:5321:1: ( 'Parameter' )
            // InternalGsl.g:5322:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalGsl.g:5331:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5335:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalGsl.g:5336:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalGsl.g:5343:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__ParameterNameAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5347:1: ( ( ( rule__Parameter__ParameterNameAssignment_2 ) ) )
            // InternalGsl.g:5348:1: ( ( rule__Parameter__ParameterNameAssignment_2 ) )
            {
            // InternalGsl.g:5348:1: ( ( rule__Parameter__ParameterNameAssignment_2 ) )
            // InternalGsl.g:5349:2: ( rule__Parameter__ParameterNameAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getParameterNameAssignment_2()); 
            // InternalGsl.g:5350:2: ( rule__Parameter__ParameterNameAssignment_2 )
            // InternalGsl.g:5350:3: rule__Parameter__ParameterNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__ParameterNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getParameterNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalGsl.g:5358:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5362:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalGsl.g:5363:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalGsl.g:5370:1: rule__Parameter__Group__3__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5374:1: ( ( '{' ) )
            // InternalGsl.g:5375:1: ( '{' )
            {
            // InternalGsl.g:5375:1: ( '{' )
            // InternalGsl.g:5376:2: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalGsl.g:5385:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5389:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalGsl.g:5390:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_37);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

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
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalGsl.g:5397:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__Group_4__0 )? ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5401:1: ( ( ( rule__Parameter__Group_4__0 )? ) )
            // InternalGsl.g:5402:1: ( ( rule__Parameter__Group_4__0 )? )
            {
            // InternalGsl.g:5402:1: ( ( rule__Parameter__Group_4__0 )? )
            // InternalGsl.g:5403:2: ( rule__Parameter__Group_4__0 )?
            {
             before(grammarAccess.getParameterAccess().getGroup_4()); 
            // InternalGsl.g:5404:2: ( rule__Parameter__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==51) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGsl.g:5404:3: rule__Parameter__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parameter__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalGsl.g:5412:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5416:1: ( rule__Parameter__Group__5__Impl )
            // InternalGsl.g:5417:2: rule__Parameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5__Impl();

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
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalGsl.g:5423:1: rule__Parameter__Group__5__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5427:1: ( ( '}' ) )
            // InternalGsl.g:5428:1: ( '}' )
            {
            // InternalGsl.g:5428:1: ( '}' )
            // InternalGsl.g:5429:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Parameter__Group_4__0"
    // InternalGsl.g:5439:1: rule__Parameter__Group_4__0 : rule__Parameter__Group_4__0__Impl rule__Parameter__Group_4__1 ;
    public final void rule__Parameter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5443:1: ( rule__Parameter__Group_4__0__Impl rule__Parameter__Group_4__1 )
            // InternalGsl.g:5444:2: rule__Parameter__Group_4__0__Impl rule__Parameter__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Parameter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group_4__1();

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
    // $ANTLR end "rule__Parameter__Group_4__0"


    // $ANTLR start "rule__Parameter__Group_4__0__Impl"
    // InternalGsl.g:5451:1: rule__Parameter__Group_4__0__Impl : ( 'targetVariable' ) ;
    public final void rule__Parameter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5455:1: ( ( 'targetVariable' ) )
            // InternalGsl.g:5456:1: ( 'targetVariable' )
            {
            // InternalGsl.g:5456:1: ( 'targetVariable' )
            // InternalGsl.g:5457:2: 'targetVariable'
            {
             before(grammarAccess.getParameterAccess().getTargetVariableKeyword_4_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTargetVariableKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4__0__Impl"


    // $ANTLR start "rule__Parameter__Group_4__1"
    // InternalGsl.g:5466:1: rule__Parameter__Group_4__1 : rule__Parameter__Group_4__1__Impl ;
    public final void rule__Parameter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5470:1: ( rule__Parameter__Group_4__1__Impl )
            // InternalGsl.g:5471:2: rule__Parameter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group_4__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group_4__1"


    // $ANTLR start "rule__Parameter__Group_4__1__Impl"
    // InternalGsl.g:5477:1: rule__Parameter__Group_4__1__Impl : ( ( rule__Parameter__TargetVariableAssignment_4_1 ) ) ;
    public final void rule__Parameter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5481:1: ( ( ( rule__Parameter__TargetVariableAssignment_4_1 ) ) )
            // InternalGsl.g:5482:1: ( ( rule__Parameter__TargetVariableAssignment_4_1 ) )
            {
            // InternalGsl.g:5482:1: ( ( rule__Parameter__TargetVariableAssignment_4_1 ) )
            // InternalGsl.g:5483:2: ( rule__Parameter__TargetVariableAssignment_4_1 )
            {
             before(grammarAccess.getParameterAccess().getTargetVariableAssignment_4_1()); 
            // InternalGsl.g:5484:2: ( rule__Parameter__TargetVariableAssignment_4_1 )
            // InternalGsl.g:5484:3: rule__Parameter__TargetVariableAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TargetVariableAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTargetVariableAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group_4__1__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalGsl.g:5493:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5497:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalGsl.g:5498:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

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
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalGsl.g:5505:1: rule__Output__Group__0__Impl : ( 'Output' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5509:1: ( ( 'Output' ) )
            // InternalGsl.g:5510:1: ( 'Output' )
            {
            // InternalGsl.g:5510:1: ( 'Output' )
            // InternalGsl.g:5511:2: 'Output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalGsl.g:5520:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5524:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalGsl.g:5525:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Output__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__2();

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
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalGsl.g:5532:1: rule__Output__Group__1__Impl : ( ( rule__Output__IdAssignment_1 ) ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5536:1: ( ( ( rule__Output__IdAssignment_1 ) ) )
            // InternalGsl.g:5537:1: ( ( rule__Output__IdAssignment_1 ) )
            {
            // InternalGsl.g:5537:1: ( ( rule__Output__IdAssignment_1 ) )
            // InternalGsl.g:5538:2: ( rule__Output__IdAssignment_1 )
            {
             before(grammarAccess.getOutputAccess().getIdAssignment_1()); 
            // InternalGsl.g:5539:2: ( rule__Output__IdAssignment_1 )
            // InternalGsl.g:5539:3: rule__Output__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // InternalGsl.g:5547:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5551:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalGsl.g:5552:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Output__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__3();

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
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // InternalGsl.g:5559:1: rule__Output__Group__2__Impl : ( '{' ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5563:1: ( ( '{' ) )
            // InternalGsl.g:5564:1: ( '{' )
            {
            // InternalGsl.g:5564:1: ( '{' )
            // InternalGsl.g:5565:2: '{'
            {
             before(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // InternalGsl.g:5574:1: rule__Output__Group__3 : rule__Output__Group__3__Impl rule__Output__Group__4 ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5578:1: ( rule__Output__Group__3__Impl rule__Output__Group__4 )
            // InternalGsl.g:5579:2: rule__Output__Group__3__Impl rule__Output__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__Output__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__4();

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
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // InternalGsl.g:5586:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5590:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalGsl.g:5591:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalGsl.g:5591:1: ( ( rule__Output__Group_3__0 )? )
            // InternalGsl.g:5592:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalGsl.g:5593:2: ( rule__Output__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==56) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGsl.g:5593:3: rule__Output__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Output__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Output__Group__4"
    // InternalGsl.g:5601:1: rule__Output__Group__4 : rule__Output__Group__4__Impl rule__Output__Group__5 ;
    public final void rule__Output__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5605:1: ( rule__Output__Group__4__Impl rule__Output__Group__5 )
            // InternalGsl.g:5606:2: rule__Output__Group__4__Impl rule__Output__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__Output__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__5();

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
    // $ANTLR end "rule__Output__Group__4"


    // $ANTLR start "rule__Output__Group__4__Impl"
    // InternalGsl.g:5613:1: rule__Output__Group__4__Impl : ( ( rule__Output__Group_4__0 )? ) ;
    public final void rule__Output__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5617:1: ( ( ( rule__Output__Group_4__0 )? ) )
            // InternalGsl.g:5618:1: ( ( rule__Output__Group_4__0 )? )
            {
            // InternalGsl.g:5618:1: ( ( rule__Output__Group_4__0 )? )
            // InternalGsl.g:5619:2: ( rule__Output__Group_4__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_4()); 
            // InternalGsl.g:5620:2: ( rule__Output__Group_4__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==57) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalGsl.g:5620:3: rule__Output__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Output__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__4__Impl"


    // $ANTLR start "rule__Output__Group__5"
    // InternalGsl.g:5628:1: rule__Output__Group__5 : rule__Output__Group__5__Impl rule__Output__Group__6 ;
    public final void rule__Output__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5632:1: ( rule__Output__Group__5__Impl rule__Output__Group__6 )
            // InternalGsl.g:5633:2: rule__Output__Group__5__Impl rule__Output__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Output__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__6();

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
    // $ANTLR end "rule__Output__Group__5"


    // $ANTLR start "rule__Output__Group__5__Impl"
    // InternalGsl.g:5640:1: rule__Output__Group__5__Impl : ( 'hasdisplays' ) ;
    public final void rule__Output__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5644:1: ( ( 'hasdisplays' ) )
            // InternalGsl.g:5645:1: ( 'hasdisplays' )
            {
            // InternalGsl.g:5645:1: ( 'hasdisplays' )
            // InternalGsl.g:5646:2: 'hasdisplays'
            {
             before(grammarAccess.getOutputAccess().getHasdisplaysKeyword_5()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getHasdisplaysKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__5__Impl"


    // $ANTLR start "rule__Output__Group__6"
    // InternalGsl.g:5655:1: rule__Output__Group__6 : rule__Output__Group__6__Impl rule__Output__Group__7 ;
    public final void rule__Output__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5659:1: ( rule__Output__Group__6__Impl rule__Output__Group__7 )
            // InternalGsl.g:5660:2: rule__Output__Group__6__Impl rule__Output__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__Output__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__7();

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
    // $ANTLR end "rule__Output__Group__6"


    // $ANTLR start "rule__Output__Group__6__Impl"
    // InternalGsl.g:5667:1: rule__Output__Group__6__Impl : ( '{' ) ;
    public final void rule__Output__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5671:1: ( ( '{' ) )
            // InternalGsl.g:5672:1: ( '{' )
            {
            // InternalGsl.g:5672:1: ( '{' )
            // InternalGsl.g:5673:2: '{'
            {
             before(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__6__Impl"


    // $ANTLR start "rule__Output__Group__7"
    // InternalGsl.g:5682:1: rule__Output__Group__7 : rule__Output__Group__7__Impl rule__Output__Group__8 ;
    public final void rule__Output__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5686:1: ( rule__Output__Group__7__Impl rule__Output__Group__8 )
            // InternalGsl.g:5687:2: rule__Output__Group__7__Impl rule__Output__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Output__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__8();

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
    // $ANTLR end "rule__Output__Group__7"


    // $ANTLR start "rule__Output__Group__7__Impl"
    // InternalGsl.g:5694:1: rule__Output__Group__7__Impl : ( ( rule__Output__HasdisplaysAssignment_7 ) ) ;
    public final void rule__Output__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5698:1: ( ( ( rule__Output__HasdisplaysAssignment_7 ) ) )
            // InternalGsl.g:5699:1: ( ( rule__Output__HasdisplaysAssignment_7 ) )
            {
            // InternalGsl.g:5699:1: ( ( rule__Output__HasdisplaysAssignment_7 ) )
            // InternalGsl.g:5700:2: ( rule__Output__HasdisplaysAssignment_7 )
            {
             before(grammarAccess.getOutputAccess().getHasdisplaysAssignment_7()); 
            // InternalGsl.g:5701:2: ( rule__Output__HasdisplaysAssignment_7 )
            // InternalGsl.g:5701:3: rule__Output__HasdisplaysAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Output__HasdisplaysAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getHasdisplaysAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__7__Impl"


    // $ANTLR start "rule__Output__Group__8"
    // InternalGsl.g:5709:1: rule__Output__Group__8 : rule__Output__Group__8__Impl rule__Output__Group__9 ;
    public final void rule__Output__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5713:1: ( rule__Output__Group__8__Impl rule__Output__Group__9 )
            // InternalGsl.g:5714:2: rule__Output__Group__8__Impl rule__Output__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Output__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__9();

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
    // $ANTLR end "rule__Output__Group__8"


    // $ANTLR start "rule__Output__Group__8__Impl"
    // InternalGsl.g:5721:1: rule__Output__Group__8__Impl : ( ( rule__Output__Group_8__0 )* ) ;
    public final void rule__Output__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5725:1: ( ( ( rule__Output__Group_8__0 )* ) )
            // InternalGsl.g:5726:1: ( ( rule__Output__Group_8__0 )* )
            {
            // InternalGsl.g:5726:1: ( ( rule__Output__Group_8__0 )* )
            // InternalGsl.g:5727:2: ( rule__Output__Group_8__0 )*
            {
             before(grammarAccess.getOutputAccess().getGroup_8()); 
            // InternalGsl.g:5728:2: ( rule__Output__Group_8__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==22) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalGsl.g:5728:3: rule__Output__Group_8__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Output__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getOutputAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__8__Impl"


    // $ANTLR start "rule__Output__Group__9"
    // InternalGsl.g:5736:1: rule__Output__Group__9 : rule__Output__Group__9__Impl rule__Output__Group__10 ;
    public final void rule__Output__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5740:1: ( rule__Output__Group__9__Impl rule__Output__Group__10 )
            // InternalGsl.g:5741:2: rule__Output__Group__9__Impl rule__Output__Group__10
            {
            pushFollow(FOLLOW_40);
            rule__Output__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__10();

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
    // $ANTLR end "rule__Output__Group__9"


    // $ANTLR start "rule__Output__Group__9__Impl"
    // InternalGsl.g:5748:1: rule__Output__Group__9__Impl : ( '}' ) ;
    public final void rule__Output__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5752:1: ( ( '}' ) )
            // InternalGsl.g:5753:1: ( '}' )
            {
            // InternalGsl.g:5753:1: ( '}' )
            // InternalGsl.g:5754:2: '}'
            {
             before(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__9__Impl"


    // $ANTLR start "rule__Output__Group__10"
    // InternalGsl.g:5763:1: rule__Output__Group__10 : rule__Output__Group__10__Impl rule__Output__Group__11 ;
    public final void rule__Output__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5767:1: ( rule__Output__Group__10__Impl rule__Output__Group__11 )
            // InternalGsl.g:5768:2: rule__Output__Group__10__Impl rule__Output__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__Output__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__11();

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
    // $ANTLR end "rule__Output__Group__10"


    // $ANTLR start "rule__Output__Group__10__Impl"
    // InternalGsl.g:5775:1: rule__Output__Group__10__Impl : ( 'hasexportfile' ) ;
    public final void rule__Output__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5779:1: ( ( 'hasexportfile' ) )
            // InternalGsl.g:5780:1: ( 'hasexportfile' )
            {
            // InternalGsl.g:5780:1: ( 'hasexportfile' )
            // InternalGsl.g:5781:2: 'hasexportfile'
            {
             before(grammarAccess.getOutputAccess().getHasexportfileKeyword_10()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getHasexportfileKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__10__Impl"


    // $ANTLR start "rule__Output__Group__11"
    // InternalGsl.g:5790:1: rule__Output__Group__11 : rule__Output__Group__11__Impl rule__Output__Group__12 ;
    public final void rule__Output__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5794:1: ( rule__Output__Group__11__Impl rule__Output__Group__12 )
            // InternalGsl.g:5795:2: rule__Output__Group__11__Impl rule__Output__Group__12
            {
            pushFollow(FOLLOW_41);
            rule__Output__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__12();

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
    // $ANTLR end "rule__Output__Group__11"


    // $ANTLR start "rule__Output__Group__11__Impl"
    // InternalGsl.g:5802:1: rule__Output__Group__11__Impl : ( '{' ) ;
    public final void rule__Output__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5806:1: ( ( '{' ) )
            // InternalGsl.g:5807:1: ( '{' )
            {
            // InternalGsl.g:5807:1: ( '{' )
            // InternalGsl.g:5808:2: '{'
            {
             before(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__11__Impl"


    // $ANTLR start "rule__Output__Group__12"
    // InternalGsl.g:5817:1: rule__Output__Group__12 : rule__Output__Group__12__Impl rule__Output__Group__13 ;
    public final void rule__Output__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5821:1: ( rule__Output__Group__12__Impl rule__Output__Group__13 )
            // InternalGsl.g:5822:2: rule__Output__Group__12__Impl rule__Output__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Output__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__13();

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
    // $ANTLR end "rule__Output__Group__12"


    // $ANTLR start "rule__Output__Group__12__Impl"
    // InternalGsl.g:5829:1: rule__Output__Group__12__Impl : ( ( rule__Output__HasexportfileAssignment_12 ) ) ;
    public final void rule__Output__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5833:1: ( ( ( rule__Output__HasexportfileAssignment_12 ) ) )
            // InternalGsl.g:5834:1: ( ( rule__Output__HasexportfileAssignment_12 ) )
            {
            // InternalGsl.g:5834:1: ( ( rule__Output__HasexportfileAssignment_12 ) )
            // InternalGsl.g:5835:2: ( rule__Output__HasexportfileAssignment_12 )
            {
             before(grammarAccess.getOutputAccess().getHasexportfileAssignment_12()); 
            // InternalGsl.g:5836:2: ( rule__Output__HasexportfileAssignment_12 )
            // InternalGsl.g:5836:3: rule__Output__HasexportfileAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Output__HasexportfileAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getHasexportfileAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__12__Impl"


    // $ANTLR start "rule__Output__Group__13"
    // InternalGsl.g:5844:1: rule__Output__Group__13 : rule__Output__Group__13__Impl rule__Output__Group__14 ;
    public final void rule__Output__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5848:1: ( rule__Output__Group__13__Impl rule__Output__Group__14 )
            // InternalGsl.g:5849:2: rule__Output__Group__13__Impl rule__Output__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__Output__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__14();

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
    // $ANTLR end "rule__Output__Group__13"


    // $ANTLR start "rule__Output__Group__13__Impl"
    // InternalGsl.g:5856:1: rule__Output__Group__13__Impl : ( ( rule__Output__Group_13__0 )* ) ;
    public final void rule__Output__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5860:1: ( ( ( rule__Output__Group_13__0 )* ) )
            // InternalGsl.g:5861:1: ( ( rule__Output__Group_13__0 )* )
            {
            // InternalGsl.g:5861:1: ( ( rule__Output__Group_13__0 )* )
            // InternalGsl.g:5862:2: ( rule__Output__Group_13__0 )*
            {
             before(grammarAccess.getOutputAccess().getGroup_13()); 
            // InternalGsl.g:5863:2: ( rule__Output__Group_13__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==22) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalGsl.g:5863:3: rule__Output__Group_13__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Output__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getOutputAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__13__Impl"


    // $ANTLR start "rule__Output__Group__14"
    // InternalGsl.g:5871:1: rule__Output__Group__14 : rule__Output__Group__14__Impl rule__Output__Group__15 ;
    public final void rule__Output__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5875:1: ( rule__Output__Group__14__Impl rule__Output__Group__15 )
            // InternalGsl.g:5876:2: rule__Output__Group__14__Impl rule__Output__Group__15
            {
            pushFollow(FOLLOW_42);
            rule__Output__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__15();

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
    // $ANTLR end "rule__Output__Group__14"


    // $ANTLR start "rule__Output__Group__14__Impl"
    // InternalGsl.g:5883:1: rule__Output__Group__14__Impl : ( '}' ) ;
    public final void rule__Output__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5887:1: ( ( '}' ) )
            // InternalGsl.g:5888:1: ( '}' )
            {
            // InternalGsl.g:5888:1: ( '}' )
            // InternalGsl.g:5889:2: '}'
            {
             before(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_14()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__14__Impl"


    // $ANTLR start "rule__Output__Group__15"
    // InternalGsl.g:5898:1: rule__Output__Group__15 : rule__Output__Group__15__Impl rule__Output__Group__16 ;
    public final void rule__Output__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5902:1: ( rule__Output__Group__15__Impl rule__Output__Group__16 )
            // InternalGsl.g:5903:2: rule__Output__Group__15__Impl rule__Output__Group__16
            {
            pushFollow(FOLLOW_3);
            rule__Output__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__16();

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
    // $ANTLR end "rule__Output__Group__15"


    // $ANTLR start "rule__Output__Group__15__Impl"
    // InternalGsl.g:5910:1: rule__Output__Group__15__Impl : ( 'hasmonitor' ) ;
    public final void rule__Output__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5914:1: ( ( 'hasmonitor' ) )
            // InternalGsl.g:5915:1: ( 'hasmonitor' )
            {
            // InternalGsl.g:5915:1: ( 'hasmonitor' )
            // InternalGsl.g:5916:2: 'hasmonitor'
            {
             before(grammarAccess.getOutputAccess().getHasmonitorKeyword_15()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getHasmonitorKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__15__Impl"


    // $ANTLR start "rule__Output__Group__16"
    // InternalGsl.g:5925:1: rule__Output__Group__16 : rule__Output__Group__16__Impl rule__Output__Group__17 ;
    public final void rule__Output__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5929:1: ( rule__Output__Group__16__Impl rule__Output__Group__17 )
            // InternalGsl.g:5930:2: rule__Output__Group__16__Impl rule__Output__Group__17
            {
            pushFollow(FOLLOW_43);
            rule__Output__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__17();

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
    // $ANTLR end "rule__Output__Group__16"


    // $ANTLR start "rule__Output__Group__16__Impl"
    // InternalGsl.g:5937:1: rule__Output__Group__16__Impl : ( '{' ) ;
    public final void rule__Output__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5941:1: ( ( '{' ) )
            // InternalGsl.g:5942:1: ( '{' )
            {
            // InternalGsl.g:5942:1: ( '{' )
            // InternalGsl.g:5943:2: '{'
            {
             before(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_16()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getLeftCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__16__Impl"


    // $ANTLR start "rule__Output__Group__17"
    // InternalGsl.g:5952:1: rule__Output__Group__17 : rule__Output__Group__17__Impl rule__Output__Group__18 ;
    public final void rule__Output__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5956:1: ( rule__Output__Group__17__Impl rule__Output__Group__18 )
            // InternalGsl.g:5957:2: rule__Output__Group__17__Impl rule__Output__Group__18
            {
            pushFollow(FOLLOW_8);
            rule__Output__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__18();

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
    // $ANTLR end "rule__Output__Group__17"


    // $ANTLR start "rule__Output__Group__17__Impl"
    // InternalGsl.g:5964:1: rule__Output__Group__17__Impl : ( ( rule__Output__HasmonitorAssignment_17 ) ) ;
    public final void rule__Output__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5968:1: ( ( ( rule__Output__HasmonitorAssignment_17 ) ) )
            // InternalGsl.g:5969:1: ( ( rule__Output__HasmonitorAssignment_17 ) )
            {
            // InternalGsl.g:5969:1: ( ( rule__Output__HasmonitorAssignment_17 ) )
            // InternalGsl.g:5970:2: ( rule__Output__HasmonitorAssignment_17 )
            {
             before(grammarAccess.getOutputAccess().getHasmonitorAssignment_17()); 
            // InternalGsl.g:5971:2: ( rule__Output__HasmonitorAssignment_17 )
            // InternalGsl.g:5971:3: rule__Output__HasmonitorAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Output__HasmonitorAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getHasmonitorAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__17__Impl"


    // $ANTLR start "rule__Output__Group__18"
    // InternalGsl.g:5979:1: rule__Output__Group__18 : rule__Output__Group__18__Impl rule__Output__Group__19 ;
    public final void rule__Output__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5983:1: ( rule__Output__Group__18__Impl rule__Output__Group__19 )
            // InternalGsl.g:5984:2: rule__Output__Group__18__Impl rule__Output__Group__19
            {
            pushFollow(FOLLOW_8);
            rule__Output__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__19();

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
    // $ANTLR end "rule__Output__Group__18"


    // $ANTLR start "rule__Output__Group__18__Impl"
    // InternalGsl.g:5991:1: rule__Output__Group__18__Impl : ( ( rule__Output__Group_18__0 )* ) ;
    public final void rule__Output__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:5995:1: ( ( ( rule__Output__Group_18__0 )* ) )
            // InternalGsl.g:5996:1: ( ( rule__Output__Group_18__0 )* )
            {
            // InternalGsl.g:5996:1: ( ( rule__Output__Group_18__0 )* )
            // InternalGsl.g:5997:2: ( rule__Output__Group_18__0 )*
            {
             before(grammarAccess.getOutputAccess().getGroup_18()); 
            // InternalGsl.g:5998:2: ( rule__Output__Group_18__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==22) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalGsl.g:5998:3: rule__Output__Group_18__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Output__Group_18__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getOutputAccess().getGroup_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__18__Impl"


    // $ANTLR start "rule__Output__Group__19"
    // InternalGsl.g:6006:1: rule__Output__Group__19 : rule__Output__Group__19__Impl rule__Output__Group__20 ;
    public final void rule__Output__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6010:1: ( rule__Output__Group__19__Impl rule__Output__Group__20 )
            // InternalGsl.g:6011:2: rule__Output__Group__19__Impl rule__Output__Group__20
            {
            pushFollow(FOLLOW_12);
            rule__Output__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__20();

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
    // $ANTLR end "rule__Output__Group__19"


    // $ANTLR start "rule__Output__Group__19__Impl"
    // InternalGsl.g:6018:1: rule__Output__Group__19__Impl : ( '}' ) ;
    public final void rule__Output__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6022:1: ( ( '}' ) )
            // InternalGsl.g:6023:1: ( '}' )
            {
            // InternalGsl.g:6023:1: ( '}' )
            // InternalGsl.g:6024:2: '}'
            {
             before(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_19()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__19__Impl"


    // $ANTLR start "rule__Output__Group__20"
    // InternalGsl.g:6033:1: rule__Output__Group__20 : rule__Output__Group__20__Impl ;
    public final void rule__Output__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6037:1: ( rule__Output__Group__20__Impl )
            // InternalGsl.g:6038:2: rule__Output__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__20__Impl();

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
    // $ANTLR end "rule__Output__Group__20"


    // $ANTLR start "rule__Output__Group__20__Impl"
    // InternalGsl.g:6044:1: rule__Output__Group__20__Impl : ( '}' ) ;
    public final void rule__Output__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6048:1: ( ( '}' ) )
            // InternalGsl.g:6049:1: ( '}' )
            {
            // InternalGsl.g:6049:1: ( '}' )
            // InternalGsl.g:6050:2: '}'
            {
             before(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_20()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__20__Impl"


    // $ANTLR start "rule__Output__Group_3__0"
    // InternalGsl.g:6060:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6064:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalGsl.g:6065:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Output__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_3__1();

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
    // $ANTLR end "rule__Output__Group_3__0"


    // $ANTLR start "rule__Output__Group_3__0__Impl"
    // InternalGsl.g:6072:1: rule__Output__Group_3__0__Impl : ( 'outputName' ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6076:1: ( ( 'outputName' ) )
            // InternalGsl.g:6077:1: ( 'outputName' )
            {
            // InternalGsl.g:6077:1: ( 'outputName' )
            // InternalGsl.g:6078:2: 'outputName'
            {
             before(grammarAccess.getOutputAccess().getOutputNameKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__0__Impl"


    // $ANTLR start "rule__Output__Group_3__1"
    // InternalGsl.g:6087:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6091:1: ( rule__Output__Group_3__1__Impl )
            // InternalGsl.g:6092:2: rule__Output__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_3__1__Impl();

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
    // $ANTLR end "rule__Output__Group_3__1"


    // $ANTLR start "rule__Output__Group_3__1__Impl"
    // InternalGsl.g:6098:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__OutputNameAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6102:1: ( ( ( rule__Output__OutputNameAssignment_3_1 ) ) )
            // InternalGsl.g:6103:1: ( ( rule__Output__OutputNameAssignment_3_1 ) )
            {
            // InternalGsl.g:6103:1: ( ( rule__Output__OutputNameAssignment_3_1 ) )
            // InternalGsl.g:6104:2: ( rule__Output__OutputNameAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getOutputNameAssignment_3_1()); 
            // InternalGsl.g:6105:2: ( rule__Output__OutputNameAssignment_3_1 )
            // InternalGsl.g:6105:3: rule__Output__OutputNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__OutputNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getOutputNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__1__Impl"


    // $ANTLR start "rule__Output__Group_4__0"
    // InternalGsl.g:6114:1: rule__Output__Group_4__0 : rule__Output__Group_4__0__Impl rule__Output__Group_4__1 ;
    public final void rule__Output__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6118:1: ( rule__Output__Group_4__0__Impl rule__Output__Group_4__1 )
            // InternalGsl.g:6119:2: rule__Output__Group_4__0__Impl rule__Output__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Output__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_4__1();

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
    // $ANTLR end "rule__Output__Group_4__0"


    // $ANTLR start "rule__Output__Group_4__0__Impl"
    // InternalGsl.g:6126:1: rule__Output__Group_4__0__Impl : ( 'framerate' ) ;
    public final void rule__Output__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6130:1: ( ( 'framerate' ) )
            // InternalGsl.g:6131:1: ( 'framerate' )
            {
            // InternalGsl.g:6131:1: ( 'framerate' )
            // InternalGsl.g:6132:2: 'framerate'
            {
             before(grammarAccess.getOutputAccess().getFramerateKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getFramerateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__0__Impl"


    // $ANTLR start "rule__Output__Group_4__1"
    // InternalGsl.g:6141:1: rule__Output__Group_4__1 : rule__Output__Group_4__1__Impl ;
    public final void rule__Output__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6145:1: ( rule__Output__Group_4__1__Impl )
            // InternalGsl.g:6146:2: rule__Output__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_4__1__Impl();

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
    // $ANTLR end "rule__Output__Group_4__1"


    // $ANTLR start "rule__Output__Group_4__1__Impl"
    // InternalGsl.g:6152:1: rule__Output__Group_4__1__Impl : ( ( rule__Output__FramerateAssignment_4_1 ) ) ;
    public final void rule__Output__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6156:1: ( ( ( rule__Output__FramerateAssignment_4_1 ) ) )
            // InternalGsl.g:6157:1: ( ( rule__Output__FramerateAssignment_4_1 ) )
            {
            // InternalGsl.g:6157:1: ( ( rule__Output__FramerateAssignment_4_1 ) )
            // InternalGsl.g:6158:2: ( rule__Output__FramerateAssignment_4_1 )
            {
             before(grammarAccess.getOutputAccess().getFramerateAssignment_4_1()); 
            // InternalGsl.g:6159:2: ( rule__Output__FramerateAssignment_4_1 )
            // InternalGsl.g:6159:3: rule__Output__FramerateAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__FramerateAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getFramerateAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_4__1__Impl"


    // $ANTLR start "rule__Output__Group_8__0"
    // InternalGsl.g:6168:1: rule__Output__Group_8__0 : rule__Output__Group_8__0__Impl rule__Output__Group_8__1 ;
    public final void rule__Output__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6172:1: ( rule__Output__Group_8__0__Impl rule__Output__Group_8__1 )
            // InternalGsl.g:6173:2: rule__Output__Group_8__0__Impl rule__Output__Group_8__1
            {
            pushFollow(FOLLOW_39);
            rule__Output__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_8__1();

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
    // $ANTLR end "rule__Output__Group_8__0"


    // $ANTLR start "rule__Output__Group_8__0__Impl"
    // InternalGsl.g:6180:1: rule__Output__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6184:1: ( ( ',' ) )
            // InternalGsl.g:6185:1: ( ',' )
            {
            // InternalGsl.g:6185:1: ( ',' )
            // InternalGsl.g:6186:2: ','
            {
             before(grammarAccess.getOutputAccess().getCommaKeyword_8_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_8__0__Impl"


    // $ANTLR start "rule__Output__Group_8__1"
    // InternalGsl.g:6195:1: rule__Output__Group_8__1 : rule__Output__Group_8__1__Impl ;
    public final void rule__Output__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6199:1: ( rule__Output__Group_8__1__Impl )
            // InternalGsl.g:6200:2: rule__Output__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_8__1__Impl();

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
    // $ANTLR end "rule__Output__Group_8__1"


    // $ANTLR start "rule__Output__Group_8__1__Impl"
    // InternalGsl.g:6206:1: rule__Output__Group_8__1__Impl : ( ( rule__Output__HasdisplaysAssignment_8_1 ) ) ;
    public final void rule__Output__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6210:1: ( ( ( rule__Output__HasdisplaysAssignment_8_1 ) ) )
            // InternalGsl.g:6211:1: ( ( rule__Output__HasdisplaysAssignment_8_1 ) )
            {
            // InternalGsl.g:6211:1: ( ( rule__Output__HasdisplaysAssignment_8_1 ) )
            // InternalGsl.g:6212:2: ( rule__Output__HasdisplaysAssignment_8_1 )
            {
             before(grammarAccess.getOutputAccess().getHasdisplaysAssignment_8_1()); 
            // InternalGsl.g:6213:2: ( rule__Output__HasdisplaysAssignment_8_1 )
            // InternalGsl.g:6213:3: rule__Output__HasdisplaysAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__HasdisplaysAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getHasdisplaysAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_8__1__Impl"


    // $ANTLR start "rule__Output__Group_13__0"
    // InternalGsl.g:6222:1: rule__Output__Group_13__0 : rule__Output__Group_13__0__Impl rule__Output__Group_13__1 ;
    public final void rule__Output__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6226:1: ( rule__Output__Group_13__0__Impl rule__Output__Group_13__1 )
            // InternalGsl.g:6227:2: rule__Output__Group_13__0__Impl rule__Output__Group_13__1
            {
            pushFollow(FOLLOW_41);
            rule__Output__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_13__1();

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
    // $ANTLR end "rule__Output__Group_13__0"


    // $ANTLR start "rule__Output__Group_13__0__Impl"
    // InternalGsl.g:6234:1: rule__Output__Group_13__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6238:1: ( ( ',' ) )
            // InternalGsl.g:6239:1: ( ',' )
            {
            // InternalGsl.g:6239:1: ( ',' )
            // InternalGsl.g:6240:2: ','
            {
             before(grammarAccess.getOutputAccess().getCommaKeyword_13_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_13__0__Impl"


    // $ANTLR start "rule__Output__Group_13__1"
    // InternalGsl.g:6249:1: rule__Output__Group_13__1 : rule__Output__Group_13__1__Impl ;
    public final void rule__Output__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6253:1: ( rule__Output__Group_13__1__Impl )
            // InternalGsl.g:6254:2: rule__Output__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_13__1__Impl();

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
    // $ANTLR end "rule__Output__Group_13__1"


    // $ANTLR start "rule__Output__Group_13__1__Impl"
    // InternalGsl.g:6260:1: rule__Output__Group_13__1__Impl : ( ( rule__Output__HasexportfileAssignment_13_1 ) ) ;
    public final void rule__Output__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6264:1: ( ( ( rule__Output__HasexportfileAssignment_13_1 ) ) )
            // InternalGsl.g:6265:1: ( ( rule__Output__HasexportfileAssignment_13_1 ) )
            {
            // InternalGsl.g:6265:1: ( ( rule__Output__HasexportfileAssignment_13_1 ) )
            // InternalGsl.g:6266:2: ( rule__Output__HasexportfileAssignment_13_1 )
            {
             before(grammarAccess.getOutputAccess().getHasexportfileAssignment_13_1()); 
            // InternalGsl.g:6267:2: ( rule__Output__HasexportfileAssignment_13_1 )
            // InternalGsl.g:6267:3: rule__Output__HasexportfileAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__HasexportfileAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getHasexportfileAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_13__1__Impl"


    // $ANTLR start "rule__Output__Group_18__0"
    // InternalGsl.g:6276:1: rule__Output__Group_18__0 : rule__Output__Group_18__0__Impl rule__Output__Group_18__1 ;
    public final void rule__Output__Group_18__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6280:1: ( rule__Output__Group_18__0__Impl rule__Output__Group_18__1 )
            // InternalGsl.g:6281:2: rule__Output__Group_18__0__Impl rule__Output__Group_18__1
            {
            pushFollow(FOLLOW_43);
            rule__Output__Group_18__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_18__1();

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
    // $ANTLR end "rule__Output__Group_18__0"


    // $ANTLR start "rule__Output__Group_18__0__Impl"
    // InternalGsl.g:6288:1: rule__Output__Group_18__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_18__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6292:1: ( ( ',' ) )
            // InternalGsl.g:6293:1: ( ',' )
            {
            // InternalGsl.g:6293:1: ( ',' )
            // InternalGsl.g:6294:2: ','
            {
             before(grammarAccess.getOutputAccess().getCommaKeyword_18_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getCommaKeyword_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_18__0__Impl"


    // $ANTLR start "rule__Output__Group_18__1"
    // InternalGsl.g:6303:1: rule__Output__Group_18__1 : rule__Output__Group_18__1__Impl ;
    public final void rule__Output__Group_18__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6307:1: ( rule__Output__Group_18__1__Impl )
            // InternalGsl.g:6308:2: rule__Output__Group_18__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_18__1__Impl();

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
    // $ANTLR end "rule__Output__Group_18__1"


    // $ANTLR start "rule__Output__Group_18__1__Impl"
    // InternalGsl.g:6314:1: rule__Output__Group_18__1__Impl : ( ( rule__Output__HasmonitorAssignment_18_1 ) ) ;
    public final void rule__Output__Group_18__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6318:1: ( ( ( rule__Output__HasmonitorAssignment_18_1 ) ) )
            // InternalGsl.g:6319:1: ( ( rule__Output__HasmonitorAssignment_18_1 ) )
            {
            // InternalGsl.g:6319:1: ( ( rule__Output__HasmonitorAssignment_18_1 ) )
            // InternalGsl.g:6320:2: ( rule__Output__HasmonitorAssignment_18_1 )
            {
             before(grammarAccess.getOutputAccess().getHasmonitorAssignment_18_1()); 
            // InternalGsl.g:6321:2: ( rule__Output__HasmonitorAssignment_18_1 )
            // InternalGsl.g:6321:3: rule__Output__HasmonitorAssignment_18_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__HasmonitorAssignment_18_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getHasmonitorAssignment_18_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_18__1__Impl"


    // $ANTLR start "rule__Display__Group__0"
    // InternalGsl.g:6330:1: rule__Display__Group__0 : rule__Display__Group__0__Impl rule__Display__Group__1 ;
    public final void rule__Display__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6334:1: ( rule__Display__Group__0__Impl rule__Display__Group__1 )
            // InternalGsl.g:6335:2: rule__Display__Group__0__Impl rule__Display__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Display__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Display__Group__1();

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
    // $ANTLR end "rule__Display__Group__0"


    // $ANTLR start "rule__Display__Group__0__Impl"
    // InternalGsl.g:6342:1: rule__Display__Group__0__Impl : ( 'Display' ) ;
    public final void rule__Display__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6346:1: ( ( 'Display' ) )
            // InternalGsl.g:6347:1: ( 'Display' )
            {
            // InternalGsl.g:6347:1: ( 'Display' )
            // InternalGsl.g:6348:2: 'Display'
            {
             before(grammarAccess.getDisplayAccess().getDisplayKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDisplayAccess().getDisplayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__Group__0__Impl"


    // $ANTLR start "rule__Display__Group__1"
    // InternalGsl.g:6357:1: rule__Display__Group__1 : rule__Display__Group__1__Impl rule__Display__Group__2 ;
    public final void rule__Display__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6361:1: ( rule__Display__Group__1__Impl rule__Display__Group__2 )
            // InternalGsl.g:6362:2: rule__Display__Group__1__Impl rule__Display__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Display__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Display__Group__2();

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
    // $ANTLR end "rule__Display__Group__1"


    // $ANTLR start "rule__Display__Group__1__Impl"
    // InternalGsl.g:6369:1: rule__Display__Group__1__Impl : ( ( rule__Display__DisplayNameAssignment_1 ) ) ;
    public final void rule__Display__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6373:1: ( ( ( rule__Display__DisplayNameAssignment_1 ) ) )
            // InternalGsl.g:6374:1: ( ( rule__Display__DisplayNameAssignment_1 ) )
            {
            // InternalGsl.g:6374:1: ( ( rule__Display__DisplayNameAssignment_1 ) )
            // InternalGsl.g:6375:2: ( rule__Display__DisplayNameAssignment_1 )
            {
             before(grammarAccess.getDisplayAccess().getDisplayNameAssignment_1()); 
            // InternalGsl.g:6376:2: ( rule__Display__DisplayNameAssignment_1 )
            // InternalGsl.g:6376:3: rule__Display__DisplayNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Display__DisplayNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDisplayAccess().getDisplayNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__Group__1__Impl"


    // $ANTLR start "rule__Display__Group__2"
    // InternalGsl.g:6384:1: rule__Display__Group__2 : rule__Display__Group__2__Impl rule__Display__Group__3 ;
    public final void rule__Display__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6388:1: ( rule__Display__Group__2__Impl rule__Display__Group__3 )
            // InternalGsl.g:6389:2: rule__Display__Group__2__Impl rule__Display__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__Display__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Display__Group__3();

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
    // $ANTLR end "rule__Display__Group__2"


    // $ANTLR start "rule__Display__Group__2__Impl"
    // InternalGsl.g:6396:1: rule__Display__Group__2__Impl : ( '{' ) ;
    public final void rule__Display__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6400:1: ( ( '{' ) )
            // InternalGsl.g:6401:1: ( '{' )
            {
            // InternalGsl.g:6401:1: ( '{' )
            // InternalGsl.g:6402:2: '{'
            {
             before(grammarAccess.getDisplayAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDisplayAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__Group__2__Impl"


    // $ANTLR start "rule__Display__Group__3"
    // InternalGsl.g:6411:1: rule__Display__Group__3 : rule__Display__Group__3__Impl rule__Display__Group__4 ;
    public final void rule__Display__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6415:1: ( rule__Display__Group__3__Impl rule__Display__Group__4 )
            // InternalGsl.g:6416:2: rule__Display__Group__3__Impl rule__Display__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__Display__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Display__Group__4();

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
    // $ANTLR end "rule__Display__Group__3"


    // $ANTLR start "rule__Display__Group__3__Impl"
    // InternalGsl.g:6423:1: rule__Display__Group__3__Impl : ( ( rule__Display__Group_3__0 )? ) ;
    public final void rule__Display__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6427:1: ( ( ( rule__Display__Group_3__0 )? ) )
            // InternalGsl.g:6428:1: ( ( rule__Display__Group_3__0 )? )
            {
            // InternalGsl.g:6428:1: ( ( rule__Display__Group_3__0 )? )
            // InternalGsl.g:6429:2: ( rule__Display__Group_3__0 )?
            {
             before(grammarAccess.getDisplayAccess().getGroup_3()); 
            // InternalGsl.g:6430:2: ( rule__Display__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==60) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalGsl.g:6430:3: rule__Display__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Display__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDisplayAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__Group__3__Impl"


    // $ANTLR start "rule__Display__Group__4"
    // InternalGsl.g:6438:1: rule__Display__Group__4 : rule__Display__Group__4__Impl rule__Display__Group__5 ;
    public final void rule__Display__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6442:1: ( rule__Display__Group__4__Impl rule__Display__Group__5 )
            // InternalGsl.g:6443:2: rule__Display__Group__4__Impl rule__Display__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Display__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Display__Group__5();

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
    // $ANTLR end "rule__Display__Group__4"


    // $ANTLR start "rule__Display__Group__4__Impl"
    // InternalGsl.g:6450:1: rule__Display__Group__4__Impl : ( 'specieblock' ) ;
    public final void rule__Display__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6454:1: ( ( 'specieblock' ) )
            // InternalGsl.g:6455:1: ( 'specieblock' )
            {
            // InternalGsl.g:6455:1: ( 'specieblock' )
            // InternalGsl.g:6456:2: 'specieblock'
            {
             before(grammarAccess.getDisplayAccess().getSpecieblockKeyword_4()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getDisplayAccess().getSpecieblockKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__Group__4__Impl"


    // $ANTLR start "rule__Display__Group__5"
    // InternalGsl.g:6465:1: rule__Display__Group__5 : rule__Display__Group__5__Impl rule__Display__Group__6 ;
    public final void rule__Display__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6469:1: ( rule__Display__Group__5__Impl rule__Display__Group__6 )
            // InternalGsl.g:6470:2: rule__Display__Group__5__Impl rule__Display__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Display__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Display__Group__6();

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
    // $ANTLR end "rule__Display__Group__5"


    // $ANTLR start "rule__Display__Group__5__Impl"
    // InternalGsl.g:6477:1: rule__Display__Group__5__Impl : ( '{' ) ;
    public final void rule__Display__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6481:1: ( ( '{' ) )
            // InternalGsl.g:6482:1: ( '{' )
            {
            // InternalGsl.g:6482:1: ( '{' )
            // InternalGsl.g:6483:2: '{'
            {
             before(grammarAccess.getDisplayAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDisplayAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__Group__5__Impl"


    // $ANTLR start "rule__Display__Group__6"
    // InternalGsl.g:6492:1: rule__Display__Group__6 : rule__Display__Group__6__Impl rule__Display__Group__7 ;
    public final void rule__Display__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6496:1: ( rule__Display__Group__6__Impl rule__Display__Group__7 )
            // InternalGsl.g:6497:2: rule__Display__Group__6__Impl rule__Display__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Display__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Display__Group__7();

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
    // $ANTLR end "rule__Display__Group__6"


    // $ANTLR start "rule__Display__Group__6__Impl"
    // InternalGsl.g:6504:1: rule__Display__Group__6__Impl : ( ( rule__Display__SpecieblockAssignment_6 ) ) ;
    public final void rule__Display__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6508:1: ( ( ( rule__Display__SpecieblockAssignment_6 ) ) )
            // InternalGsl.g:6509:1: ( ( rule__Display__SpecieblockAssignment_6 ) )
            {
            // InternalGsl.g:6509:1: ( ( rule__Display__SpecieblockAssignment_6 ) )
            // InternalGsl.g:6510:2: ( rule__Display__SpecieblockAssignment_6 )
            {
             before(grammarAccess.getDisplayAccess().getSpecieblockAssignment_6()); 
            // InternalGsl.g:6511:2: ( rule__Display__SpecieblockAssignment_6 )
            // InternalGsl.g:6511:3: rule__Display__SpecieblockAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Display__SpecieblockAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDisplayAccess().getSpecieblockAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__Group__6__Impl"


    // $ANTLR start "rule__Display__Group__7"
    // InternalGsl.g:6519:1: rule__Display__Group__7 : rule__Display__Group__7__Impl rule__Display__Group__8 ;
    public final void rule__Display__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6523:1: ( rule__Display__Group__7__Impl rule__Display__Group__8 )
            // InternalGsl.g:6524:2: rule__Display__Group__7__Impl rule__Display__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Display__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Display__Group__8();

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
    // $ANTLR end "rule__Display__Group__7"


    // $ANTLR start "rule__Display__Group__7__Impl"
    // InternalGsl.g:6531:1: rule__Display__Group__7__Impl : ( ( rule__Display__Group_7__0 )* ) ;
    public final void rule__Display__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6535:1: ( ( ( rule__Display__Group_7__0 )* ) )
            // InternalGsl.g:6536:1: ( ( rule__Display__Group_7__0 )* )
            {
            // InternalGsl.g:6536:1: ( ( rule__Display__Group_7__0 )* )
            // InternalGsl.g:6537:2: ( rule__Display__Group_7__0 )*
            {
             before(grammarAccess.getDisplayAccess().getGroup_7()); 
            // InternalGsl.g:6538:2: ( rule__Display__Group_7__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==22) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalGsl.g:6538:3: rule__Display__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Display__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getDisplayAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__Group__7__Impl"


    // $ANTLR start "rule__Display__Group__8"
    // InternalGsl.g:6546:1: rule__Display__Group__8 : rule__Display__Group__8__Impl rule__Display__Group__9 ;
    public final void rule__Display__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6550:1: ( rule__Display__Group__8__Impl rule__Display__Group__9 )
            // InternalGsl.g:6551:2: rule__Display__Group__8__Impl rule__Display__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__Display__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Display__Group__9();

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
    // $ANTLR end "rule__Display__Group__8"


    // $ANTLR start "rule__Display__Group__8__Impl"
    // InternalGsl.g:6558:1: rule__Display__Group__8__Impl : ( '}' ) ;
    public final void rule__Display__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6562:1: ( ( '}' ) )
            // InternalGsl.g:6563:1: ( '}' )
            {
            // InternalGsl.g:6563:1: ( '}' )
            // InternalGsl.g:6564:2: '}'
            {
             before(grammarAccess.getDisplayAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDisplayAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__Group__8__Impl"


    // $ANTLR start "rule__Display__Group__9"
    // InternalGsl.g:6573:1: rule__Display__Group__9 : rule__Display__Group__9__Impl ;
    public final void rule__Display__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6577:1: ( rule__Display__Group__9__Impl )
            // InternalGsl.g:6578:2: rule__Display__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Display__Group__9__Impl();

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
    // $ANTLR end "rule__Display__Group__9"


    // $ANTLR start "rule__Display__Group__9__Impl"
    // InternalGsl.g:6584:1: rule__Display__Group__9__Impl : ( '}' ) ;
    public final void rule__Display__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6588:1: ( ( '}' ) )
            // InternalGsl.g:6589:1: ( '}' )
            {
            // InternalGsl.g:6589:1: ( '}' )
            // InternalGsl.g:6590:2: '}'
            {
             before(grammarAccess.getDisplayAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDisplayAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__Group__9__Impl"


    // $ANTLR start "rule__Display__Group_3__0"
    // InternalGsl.g:6600:1: rule__Display__Group_3__0 : rule__Display__Group_3__0__Impl rule__Display__Group_3__1 ;
    public final void rule__Display__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6604:1: ( rule__Display__Group_3__0__Impl rule__Display__Group_3__1 )
            // InternalGsl.g:6605:2: rule__Display__Group_3__0__Impl rule__Display__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Display__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Display__Group_3__1();

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
    // $ANTLR end "rule__Display__Group_3__0"


    // $ANTLR start "rule__Display__Group_3__0__Impl"
    // InternalGsl.g:6612:1: rule__Display__Group_3__0__Impl : ( 'displayType' ) ;
    public final void rule__Display__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6616:1: ( ( 'displayType' ) )
            // InternalGsl.g:6617:1: ( 'displayType' )
            {
            // InternalGsl.g:6617:1: ( 'displayType' )
            // InternalGsl.g:6618:2: 'displayType'
            {
             before(grammarAccess.getDisplayAccess().getDisplayTypeKeyword_3_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDisplayAccess().getDisplayTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__Group_3__0__Impl"


    // $ANTLR start "rule__Display__Group_3__1"
    // InternalGsl.g:6627:1: rule__Display__Group_3__1 : rule__Display__Group_3__1__Impl ;
    public final void rule__Display__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6631:1: ( rule__Display__Group_3__1__Impl )
            // InternalGsl.g:6632:2: rule__Display__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Display__Group_3__1__Impl();

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
    // $ANTLR end "rule__Display__Group_3__1"


    // $ANTLR start "rule__Display__Group_3__1__Impl"
    // InternalGsl.g:6638:1: rule__Display__Group_3__1__Impl : ( ( rule__Display__DisplayTypeAssignment_3_1 ) ) ;
    public final void rule__Display__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6642:1: ( ( ( rule__Display__DisplayTypeAssignment_3_1 ) ) )
            // InternalGsl.g:6643:1: ( ( rule__Display__DisplayTypeAssignment_3_1 ) )
            {
            // InternalGsl.g:6643:1: ( ( rule__Display__DisplayTypeAssignment_3_1 ) )
            // InternalGsl.g:6644:2: ( rule__Display__DisplayTypeAssignment_3_1 )
            {
             before(grammarAccess.getDisplayAccess().getDisplayTypeAssignment_3_1()); 
            // InternalGsl.g:6645:2: ( rule__Display__DisplayTypeAssignment_3_1 )
            // InternalGsl.g:6645:3: rule__Display__DisplayTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Display__DisplayTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDisplayAccess().getDisplayTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__Group_3__1__Impl"


    // $ANTLR start "rule__Display__Group_7__0"
    // InternalGsl.g:6654:1: rule__Display__Group_7__0 : rule__Display__Group_7__0__Impl rule__Display__Group_7__1 ;
    public final void rule__Display__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6658:1: ( rule__Display__Group_7__0__Impl rule__Display__Group_7__1 )
            // InternalGsl.g:6659:2: rule__Display__Group_7__0__Impl rule__Display__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__Display__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Display__Group_7__1();

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
    // $ANTLR end "rule__Display__Group_7__0"


    // $ANTLR start "rule__Display__Group_7__0__Impl"
    // InternalGsl.g:6666:1: rule__Display__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Display__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6670:1: ( ( ',' ) )
            // InternalGsl.g:6671:1: ( ',' )
            {
            // InternalGsl.g:6671:1: ( ',' )
            // InternalGsl.g:6672:2: ','
            {
             before(grammarAccess.getDisplayAccess().getCommaKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDisplayAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__Group_7__0__Impl"


    // $ANTLR start "rule__Display__Group_7__1"
    // InternalGsl.g:6681:1: rule__Display__Group_7__1 : rule__Display__Group_7__1__Impl ;
    public final void rule__Display__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6685:1: ( rule__Display__Group_7__1__Impl )
            // InternalGsl.g:6686:2: rule__Display__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Display__Group_7__1__Impl();

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
    // $ANTLR end "rule__Display__Group_7__1"


    // $ANTLR start "rule__Display__Group_7__1__Impl"
    // InternalGsl.g:6692:1: rule__Display__Group_7__1__Impl : ( ( rule__Display__SpecieblockAssignment_7_1 ) ) ;
    public final void rule__Display__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6696:1: ( ( ( rule__Display__SpecieblockAssignment_7_1 ) ) )
            // InternalGsl.g:6697:1: ( ( rule__Display__SpecieblockAssignment_7_1 ) )
            {
            // InternalGsl.g:6697:1: ( ( rule__Display__SpecieblockAssignment_7_1 ) )
            // InternalGsl.g:6698:2: ( rule__Display__SpecieblockAssignment_7_1 )
            {
             before(grammarAccess.getDisplayAccess().getSpecieblockAssignment_7_1()); 
            // InternalGsl.g:6699:2: ( rule__Display__SpecieblockAssignment_7_1 )
            // InternalGsl.g:6699:3: rule__Display__SpecieblockAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Display__SpecieblockAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDisplayAccess().getSpecieblockAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__Group_7__1__Impl"


    // $ANTLR start "rule__Exportfile__Group__0"
    // InternalGsl.g:6708:1: rule__Exportfile__Group__0 : rule__Exportfile__Group__0__Impl rule__Exportfile__Group__1 ;
    public final void rule__Exportfile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6712:1: ( rule__Exportfile__Group__0__Impl rule__Exportfile__Group__1 )
            // InternalGsl.g:6713:2: rule__Exportfile__Group__0__Impl rule__Exportfile__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Exportfile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exportfile__Group__1();

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
    // $ANTLR end "rule__Exportfile__Group__0"


    // $ANTLR start "rule__Exportfile__Group__0__Impl"
    // InternalGsl.g:6720:1: rule__Exportfile__Group__0__Impl : ( () ) ;
    public final void rule__Exportfile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6724:1: ( ( () ) )
            // InternalGsl.g:6725:1: ( () )
            {
            // InternalGsl.g:6725:1: ( () )
            // InternalGsl.g:6726:2: ()
            {
             before(grammarAccess.getExportfileAccess().getExportfileAction_0()); 
            // InternalGsl.g:6727:2: ()
            // InternalGsl.g:6727:3: 
            {
            }

             after(grammarAccess.getExportfileAccess().getExportfileAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exportfile__Group__0__Impl"


    // $ANTLR start "rule__Exportfile__Group__1"
    // InternalGsl.g:6735:1: rule__Exportfile__Group__1 : rule__Exportfile__Group__1__Impl rule__Exportfile__Group__2 ;
    public final void rule__Exportfile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6739:1: ( rule__Exportfile__Group__1__Impl rule__Exportfile__Group__2 )
            // InternalGsl.g:6740:2: rule__Exportfile__Group__1__Impl rule__Exportfile__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Exportfile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exportfile__Group__2();

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
    // $ANTLR end "rule__Exportfile__Group__1"


    // $ANTLR start "rule__Exportfile__Group__1__Impl"
    // InternalGsl.g:6747:1: rule__Exportfile__Group__1__Impl : ( 'Exportfile' ) ;
    public final void rule__Exportfile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6751:1: ( ( 'Exportfile' ) )
            // InternalGsl.g:6752:1: ( 'Exportfile' )
            {
            // InternalGsl.g:6752:1: ( 'Exportfile' )
            // InternalGsl.g:6753:2: 'Exportfile'
            {
             before(grammarAccess.getExportfileAccess().getExportfileKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getExportfileAccess().getExportfileKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exportfile__Group__1__Impl"


    // $ANTLR start "rule__Exportfile__Group__2"
    // InternalGsl.g:6762:1: rule__Exportfile__Group__2 : rule__Exportfile__Group__2__Impl rule__Exportfile__Group__3 ;
    public final void rule__Exportfile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6766:1: ( rule__Exportfile__Group__2__Impl rule__Exportfile__Group__3 )
            // InternalGsl.g:6767:2: rule__Exportfile__Group__2__Impl rule__Exportfile__Group__3
            {
            pushFollow(FOLLOW_45);
            rule__Exportfile__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exportfile__Group__3();

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
    // $ANTLR end "rule__Exportfile__Group__2"


    // $ANTLR start "rule__Exportfile__Group__2__Impl"
    // InternalGsl.g:6774:1: rule__Exportfile__Group__2__Impl : ( '{' ) ;
    public final void rule__Exportfile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6778:1: ( ( '{' ) )
            // InternalGsl.g:6779:1: ( '{' )
            {
            // InternalGsl.g:6779:1: ( '{' )
            // InternalGsl.g:6780:2: '{'
            {
             before(grammarAccess.getExportfileAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExportfileAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exportfile__Group__2__Impl"


    // $ANTLR start "rule__Exportfile__Group__3"
    // InternalGsl.g:6789:1: rule__Exportfile__Group__3 : rule__Exportfile__Group__3__Impl rule__Exportfile__Group__4 ;
    public final void rule__Exportfile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6793:1: ( rule__Exportfile__Group__3__Impl rule__Exportfile__Group__4 )
            // InternalGsl.g:6794:2: rule__Exportfile__Group__3__Impl rule__Exportfile__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__Exportfile__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exportfile__Group__4();

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
    // $ANTLR end "rule__Exportfile__Group__3"


    // $ANTLR start "rule__Exportfile__Group__3__Impl"
    // InternalGsl.g:6801:1: rule__Exportfile__Group__3__Impl : ( ( rule__Exportfile__Group_3__0 )? ) ;
    public final void rule__Exportfile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6805:1: ( ( ( rule__Exportfile__Group_3__0 )? ) )
            // InternalGsl.g:6806:1: ( ( rule__Exportfile__Group_3__0 )? )
            {
            // InternalGsl.g:6806:1: ( ( rule__Exportfile__Group_3__0 )? )
            // InternalGsl.g:6807:2: ( rule__Exportfile__Group_3__0 )?
            {
             before(grammarAccess.getExportfileAccess().getGroup_3()); 
            // InternalGsl.g:6808:2: ( rule__Exportfile__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==62) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalGsl.g:6808:3: rule__Exportfile__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exportfile__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExportfileAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exportfile__Group__3__Impl"


    // $ANTLR start "rule__Exportfile__Group__4"
    // InternalGsl.g:6816:1: rule__Exportfile__Group__4 : rule__Exportfile__Group__4__Impl rule__Exportfile__Group__5 ;
    public final void rule__Exportfile__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6820:1: ( rule__Exportfile__Group__4__Impl rule__Exportfile__Group__5 )
            // InternalGsl.g:6821:2: rule__Exportfile__Group__4__Impl rule__Exportfile__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__Exportfile__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exportfile__Group__5();

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
    // $ANTLR end "rule__Exportfile__Group__4"


    // $ANTLR start "rule__Exportfile__Group__4__Impl"
    // InternalGsl.g:6828:1: rule__Exportfile__Group__4__Impl : ( ( rule__Exportfile__Group_4__0 )? ) ;
    public final void rule__Exportfile__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6832:1: ( ( ( rule__Exportfile__Group_4__0 )? ) )
            // InternalGsl.g:6833:1: ( ( rule__Exportfile__Group_4__0 )? )
            {
            // InternalGsl.g:6833:1: ( ( rule__Exportfile__Group_4__0 )? )
            // InternalGsl.g:6834:2: ( rule__Exportfile__Group_4__0 )?
            {
             before(grammarAccess.getExportfileAccess().getGroup_4()); 
            // InternalGsl.g:6835:2: ( rule__Exportfile__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==63) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGsl.g:6835:3: rule__Exportfile__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exportfile__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExportfileAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exportfile__Group__4__Impl"


    // $ANTLR start "rule__Exportfile__Group__5"
    // InternalGsl.g:6843:1: rule__Exportfile__Group__5 : rule__Exportfile__Group__5__Impl ;
    public final void rule__Exportfile__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6847:1: ( rule__Exportfile__Group__5__Impl )
            // InternalGsl.g:6848:2: rule__Exportfile__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exportfile__Group__5__Impl();

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
    // $ANTLR end "rule__Exportfile__Group__5"


    // $ANTLR start "rule__Exportfile__Group__5__Impl"
    // InternalGsl.g:6854:1: rule__Exportfile__Group__5__Impl : ( '}' ) ;
    public final void rule__Exportfile__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6858:1: ( ( '}' ) )
            // InternalGsl.g:6859:1: ( '}' )
            {
            // InternalGsl.g:6859:1: ( '}' )
            // InternalGsl.g:6860:2: '}'
            {
             before(grammarAccess.getExportfileAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getExportfileAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exportfile__Group__5__Impl"


    // $ANTLR start "rule__Exportfile__Group_3__0"
    // InternalGsl.g:6870:1: rule__Exportfile__Group_3__0 : rule__Exportfile__Group_3__0__Impl rule__Exportfile__Group_3__1 ;
    public final void rule__Exportfile__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6874:1: ( rule__Exportfile__Group_3__0__Impl rule__Exportfile__Group_3__1 )
            // InternalGsl.g:6875:2: rule__Exportfile__Group_3__0__Impl rule__Exportfile__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Exportfile__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exportfile__Group_3__1();

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
    // $ANTLR end "rule__Exportfile__Group_3__0"


    // $ANTLR start "rule__Exportfile__Group_3__0__Impl"
    // InternalGsl.g:6882:1: rule__Exportfile__Group_3__0__Impl : ( 'fileName' ) ;
    public final void rule__Exportfile__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6886:1: ( ( 'fileName' ) )
            // InternalGsl.g:6887:1: ( 'fileName' )
            {
            // InternalGsl.g:6887:1: ( 'fileName' )
            // InternalGsl.g:6888:2: 'fileName'
            {
             before(grammarAccess.getExportfileAccess().getFileNameKeyword_3_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getExportfileAccess().getFileNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exportfile__Group_3__0__Impl"


    // $ANTLR start "rule__Exportfile__Group_3__1"
    // InternalGsl.g:6897:1: rule__Exportfile__Group_3__1 : rule__Exportfile__Group_3__1__Impl ;
    public final void rule__Exportfile__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6901:1: ( rule__Exportfile__Group_3__1__Impl )
            // InternalGsl.g:6902:2: rule__Exportfile__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exportfile__Group_3__1__Impl();

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
    // $ANTLR end "rule__Exportfile__Group_3__1"


    // $ANTLR start "rule__Exportfile__Group_3__1__Impl"
    // InternalGsl.g:6908:1: rule__Exportfile__Group_3__1__Impl : ( ( rule__Exportfile__FileNameAssignment_3_1 ) ) ;
    public final void rule__Exportfile__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6912:1: ( ( ( rule__Exportfile__FileNameAssignment_3_1 ) ) )
            // InternalGsl.g:6913:1: ( ( rule__Exportfile__FileNameAssignment_3_1 ) )
            {
            // InternalGsl.g:6913:1: ( ( rule__Exportfile__FileNameAssignment_3_1 ) )
            // InternalGsl.g:6914:2: ( rule__Exportfile__FileNameAssignment_3_1 )
            {
             before(grammarAccess.getExportfileAccess().getFileNameAssignment_3_1()); 
            // InternalGsl.g:6915:2: ( rule__Exportfile__FileNameAssignment_3_1 )
            // InternalGsl.g:6915:3: rule__Exportfile__FileNameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Exportfile__FileNameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExportfileAccess().getFileNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exportfile__Group_3__1__Impl"


    // $ANTLR start "rule__Exportfile__Group_4__0"
    // InternalGsl.g:6924:1: rule__Exportfile__Group_4__0 : rule__Exportfile__Group_4__0__Impl rule__Exportfile__Group_4__1 ;
    public final void rule__Exportfile__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6928:1: ( rule__Exportfile__Group_4__0__Impl rule__Exportfile__Group_4__1 )
            // InternalGsl.g:6929:2: rule__Exportfile__Group_4__0__Impl rule__Exportfile__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Exportfile__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exportfile__Group_4__1();

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
    // $ANTLR end "rule__Exportfile__Group_4__0"


    // $ANTLR start "rule__Exportfile__Group_4__0__Impl"
    // InternalGsl.g:6936:1: rule__Exportfile__Group_4__0__Impl : ( 'fileType' ) ;
    public final void rule__Exportfile__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6940:1: ( ( 'fileType' ) )
            // InternalGsl.g:6941:1: ( 'fileType' )
            {
            // InternalGsl.g:6941:1: ( 'fileType' )
            // InternalGsl.g:6942:2: 'fileType'
            {
             before(grammarAccess.getExportfileAccess().getFileTypeKeyword_4_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getExportfileAccess().getFileTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exportfile__Group_4__0__Impl"


    // $ANTLR start "rule__Exportfile__Group_4__1"
    // InternalGsl.g:6951:1: rule__Exportfile__Group_4__1 : rule__Exportfile__Group_4__1__Impl ;
    public final void rule__Exportfile__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6955:1: ( rule__Exportfile__Group_4__1__Impl )
            // InternalGsl.g:6956:2: rule__Exportfile__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exportfile__Group_4__1__Impl();

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
    // $ANTLR end "rule__Exportfile__Group_4__1"


    // $ANTLR start "rule__Exportfile__Group_4__1__Impl"
    // InternalGsl.g:6962:1: rule__Exportfile__Group_4__1__Impl : ( ( rule__Exportfile__FileTypeAssignment_4_1 ) ) ;
    public final void rule__Exportfile__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6966:1: ( ( ( rule__Exportfile__FileTypeAssignment_4_1 ) ) )
            // InternalGsl.g:6967:1: ( ( rule__Exportfile__FileTypeAssignment_4_1 ) )
            {
            // InternalGsl.g:6967:1: ( ( rule__Exportfile__FileTypeAssignment_4_1 ) )
            // InternalGsl.g:6968:2: ( rule__Exportfile__FileTypeAssignment_4_1 )
            {
             before(grammarAccess.getExportfileAccess().getFileTypeAssignment_4_1()); 
            // InternalGsl.g:6969:2: ( rule__Exportfile__FileTypeAssignment_4_1 )
            // InternalGsl.g:6969:3: rule__Exportfile__FileTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Exportfile__FileTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getExportfileAccess().getFileTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exportfile__Group_4__1__Impl"


    // $ANTLR start "rule__Monitor__Group__0"
    // InternalGsl.g:6978:1: rule__Monitor__Group__0 : rule__Monitor__Group__0__Impl rule__Monitor__Group__1 ;
    public final void rule__Monitor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6982:1: ( rule__Monitor__Group__0__Impl rule__Monitor__Group__1 )
            // InternalGsl.g:6983:2: rule__Monitor__Group__0__Impl rule__Monitor__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__Monitor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monitor__Group__1();

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
    // $ANTLR end "rule__Monitor__Group__0"


    // $ANTLR start "rule__Monitor__Group__0__Impl"
    // InternalGsl.g:6990:1: rule__Monitor__Group__0__Impl : ( () ) ;
    public final void rule__Monitor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:6994:1: ( ( () ) )
            // InternalGsl.g:6995:1: ( () )
            {
            // InternalGsl.g:6995:1: ( () )
            // InternalGsl.g:6996:2: ()
            {
             before(grammarAccess.getMonitorAccess().getMonitorAction_0()); 
            // InternalGsl.g:6997:2: ()
            // InternalGsl.g:6997:3: 
            {
            }

             after(grammarAccess.getMonitorAccess().getMonitorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group__0__Impl"


    // $ANTLR start "rule__Monitor__Group__1"
    // InternalGsl.g:7005:1: rule__Monitor__Group__1 : rule__Monitor__Group__1__Impl rule__Monitor__Group__2 ;
    public final void rule__Monitor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7009:1: ( rule__Monitor__Group__1__Impl rule__Monitor__Group__2 )
            // InternalGsl.g:7010:2: rule__Monitor__Group__1__Impl rule__Monitor__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Monitor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monitor__Group__2();

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
    // $ANTLR end "rule__Monitor__Group__1"


    // $ANTLR start "rule__Monitor__Group__1__Impl"
    // InternalGsl.g:7017:1: rule__Monitor__Group__1__Impl : ( 'Monitor' ) ;
    public final void rule__Monitor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7021:1: ( ( 'Monitor' ) )
            // InternalGsl.g:7022:1: ( 'Monitor' )
            {
            // InternalGsl.g:7022:1: ( 'Monitor' )
            // InternalGsl.g:7023:2: 'Monitor'
            {
             before(grammarAccess.getMonitorAccess().getMonitorKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getMonitorAccess().getMonitorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group__1__Impl"


    // $ANTLR start "rule__Monitor__Group__2"
    // InternalGsl.g:7032:1: rule__Monitor__Group__2 : rule__Monitor__Group__2__Impl rule__Monitor__Group__3 ;
    public final void rule__Monitor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7036:1: ( rule__Monitor__Group__2__Impl rule__Monitor__Group__3 )
            // InternalGsl.g:7037:2: rule__Monitor__Group__2__Impl rule__Monitor__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Monitor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monitor__Group__3();

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
    // $ANTLR end "rule__Monitor__Group__2"


    // $ANTLR start "rule__Monitor__Group__2__Impl"
    // InternalGsl.g:7044:1: rule__Monitor__Group__2__Impl : ( ( rule__Monitor__LabelAssignment_2 ) ) ;
    public final void rule__Monitor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7048:1: ( ( ( rule__Monitor__LabelAssignment_2 ) ) )
            // InternalGsl.g:7049:1: ( ( rule__Monitor__LabelAssignment_2 ) )
            {
            // InternalGsl.g:7049:1: ( ( rule__Monitor__LabelAssignment_2 ) )
            // InternalGsl.g:7050:2: ( rule__Monitor__LabelAssignment_2 )
            {
             before(grammarAccess.getMonitorAccess().getLabelAssignment_2()); 
            // InternalGsl.g:7051:2: ( rule__Monitor__LabelAssignment_2 )
            // InternalGsl.g:7051:3: rule__Monitor__LabelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Monitor__LabelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMonitorAccess().getLabelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group__2__Impl"


    // $ANTLR start "rule__Monitor__Group__3"
    // InternalGsl.g:7059:1: rule__Monitor__Group__3 : rule__Monitor__Group__3__Impl rule__Monitor__Group__4 ;
    public final void rule__Monitor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7063:1: ( rule__Monitor__Group__3__Impl rule__Monitor__Group__4 )
            // InternalGsl.g:7064:2: rule__Monitor__Group__3__Impl rule__Monitor__Group__4
            {
            pushFollow(FOLLOW_46);
            rule__Monitor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monitor__Group__4();

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
    // $ANTLR end "rule__Monitor__Group__3"


    // $ANTLR start "rule__Monitor__Group__3__Impl"
    // InternalGsl.g:7071:1: rule__Monitor__Group__3__Impl : ( '{' ) ;
    public final void rule__Monitor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7075:1: ( ( '{' ) )
            // InternalGsl.g:7076:1: ( '{' )
            {
            // InternalGsl.g:7076:1: ( '{' )
            // InternalGsl.g:7077:2: '{'
            {
             before(grammarAccess.getMonitorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMonitorAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group__3__Impl"


    // $ANTLR start "rule__Monitor__Group__4"
    // InternalGsl.g:7086:1: rule__Monitor__Group__4 : rule__Monitor__Group__4__Impl rule__Monitor__Group__5 ;
    public final void rule__Monitor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7090:1: ( rule__Monitor__Group__4__Impl rule__Monitor__Group__5 )
            // InternalGsl.g:7091:2: rule__Monitor__Group__4__Impl rule__Monitor__Group__5
            {
            pushFollow(FOLLOW_46);
            rule__Monitor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monitor__Group__5();

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
    // $ANTLR end "rule__Monitor__Group__4"


    // $ANTLR start "rule__Monitor__Group__4__Impl"
    // InternalGsl.g:7098:1: rule__Monitor__Group__4__Impl : ( ( rule__Monitor__Group_4__0 )? ) ;
    public final void rule__Monitor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7102:1: ( ( ( rule__Monitor__Group_4__0 )? ) )
            // InternalGsl.g:7103:1: ( ( rule__Monitor__Group_4__0 )? )
            {
            // InternalGsl.g:7103:1: ( ( rule__Monitor__Group_4__0 )? )
            // InternalGsl.g:7104:2: ( rule__Monitor__Group_4__0 )?
            {
             before(grammarAccess.getMonitorAccess().getGroup_4()); 
            // InternalGsl.g:7105:2: ( rule__Monitor__Group_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==65) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalGsl.g:7105:3: rule__Monitor__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Monitor__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMonitorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group__4__Impl"


    // $ANTLR start "rule__Monitor__Group__5"
    // InternalGsl.g:7113:1: rule__Monitor__Group__5 : rule__Monitor__Group__5__Impl ;
    public final void rule__Monitor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7117:1: ( rule__Monitor__Group__5__Impl )
            // InternalGsl.g:7118:2: rule__Monitor__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Monitor__Group__5__Impl();

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
    // $ANTLR end "rule__Monitor__Group__5"


    // $ANTLR start "rule__Monitor__Group__5__Impl"
    // InternalGsl.g:7124:1: rule__Monitor__Group__5__Impl : ( '}' ) ;
    public final void rule__Monitor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7128:1: ( ( '}' ) )
            // InternalGsl.g:7129:1: ( '}' )
            {
            // InternalGsl.g:7129:1: ( '}' )
            // InternalGsl.g:7130:2: '}'
            {
             before(grammarAccess.getMonitorAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMonitorAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group__5__Impl"


    // $ANTLR start "rule__Monitor__Group_4__0"
    // InternalGsl.g:7140:1: rule__Monitor__Group_4__0 : rule__Monitor__Group_4__0__Impl rule__Monitor__Group_4__1 ;
    public final void rule__Monitor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7144:1: ( rule__Monitor__Group_4__0__Impl rule__Monitor__Group_4__1 )
            // InternalGsl.g:7145:2: rule__Monitor__Group_4__0__Impl rule__Monitor__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Monitor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Monitor__Group_4__1();

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
    // $ANTLR end "rule__Monitor__Group_4__0"


    // $ANTLR start "rule__Monitor__Group_4__0__Impl"
    // InternalGsl.g:7152:1: rule__Monitor__Group_4__0__Impl : ( 'targetVar' ) ;
    public final void rule__Monitor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7156:1: ( ( 'targetVar' ) )
            // InternalGsl.g:7157:1: ( 'targetVar' )
            {
            // InternalGsl.g:7157:1: ( 'targetVar' )
            // InternalGsl.g:7158:2: 'targetVar'
            {
             before(grammarAccess.getMonitorAccess().getTargetVarKeyword_4_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getMonitorAccess().getTargetVarKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_4__0__Impl"


    // $ANTLR start "rule__Monitor__Group_4__1"
    // InternalGsl.g:7167:1: rule__Monitor__Group_4__1 : rule__Monitor__Group_4__1__Impl ;
    public final void rule__Monitor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7171:1: ( rule__Monitor__Group_4__1__Impl )
            // InternalGsl.g:7172:2: rule__Monitor__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Monitor__Group_4__1__Impl();

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
    // $ANTLR end "rule__Monitor__Group_4__1"


    // $ANTLR start "rule__Monitor__Group_4__1__Impl"
    // InternalGsl.g:7178:1: rule__Monitor__Group_4__1__Impl : ( ( rule__Monitor__TargetVarAssignment_4_1 ) ) ;
    public final void rule__Monitor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7182:1: ( ( ( rule__Monitor__TargetVarAssignment_4_1 ) ) )
            // InternalGsl.g:7183:1: ( ( rule__Monitor__TargetVarAssignment_4_1 ) )
            {
            // InternalGsl.g:7183:1: ( ( rule__Monitor__TargetVarAssignment_4_1 ) )
            // InternalGsl.g:7184:2: ( rule__Monitor__TargetVarAssignment_4_1 )
            {
             before(grammarAccess.getMonitorAccess().getTargetVarAssignment_4_1()); 
            // InternalGsl.g:7185:2: ( rule__Monitor__TargetVarAssignment_4_1 )
            // InternalGsl.g:7185:3: rule__Monitor__TargetVarAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Monitor__TargetVarAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMonitorAccess().getTargetVarAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__Group_4__1__Impl"


    // $ANTLR start "rule__Gamamodel__DescriptionAssignment_2_1"
    // InternalGsl.g:7194:1: rule__Gamamodel__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Gamamodel__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7198:1: ( ( ruleEString ) )
            // InternalGsl.g:7199:2: ( ruleEString )
            {
            // InternalGsl.g:7199:2: ( ruleEString )
            // InternalGsl.g:7200:3: ruleEString
            {
             before(grammarAccess.getGamamodelAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGamamodelAccess().getDescriptionEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__DescriptionAssignment_2_1"


    // $ANTLR start "rule__Gamamodel__KeywordsAssignment_3_1"
    // InternalGsl.g:7209:1: rule__Gamamodel__KeywordsAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Gamamodel__KeywordsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7213:1: ( ( ruleEString ) )
            // InternalGsl.g:7214:2: ( ruleEString )
            {
            // InternalGsl.g:7214:2: ( ruleEString )
            // InternalGsl.g:7215:3: ruleEString
            {
             before(grammarAccess.getGamamodelAccess().getKeywordsEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGamamodelAccess().getKeywordsEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__KeywordsAssignment_3_1"


    // $ANTLR start "rule__Gamamodel__AuthorAssignment_4_1"
    // InternalGsl.g:7224:1: rule__Gamamodel__AuthorAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Gamamodel__AuthorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7228:1: ( ( ruleEString ) )
            // InternalGsl.g:7229:2: ( ruleEString )
            {
            // InternalGsl.g:7229:2: ( ruleEString )
            // InternalGsl.g:7230:3: ruleEString
            {
             before(grammarAccess.getGamamodelAccess().getAuthorEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGamamodelAccess().getAuthorEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__AuthorAssignment_4_1"


    // $ANTLR start "rule__Gamamodel__CreatedOnAssignment_5_1"
    // InternalGsl.g:7239:1: rule__Gamamodel__CreatedOnAssignment_5_1 : ( ruleEDate ) ;
    public final void rule__Gamamodel__CreatedOnAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7243:1: ( ( ruleEDate ) )
            // InternalGsl.g:7244:2: ( ruleEDate )
            {
            // InternalGsl.g:7244:2: ( ruleEDate )
            // InternalGsl.g:7245:3: ruleEDate
            {
             before(grammarAccess.getGamamodelAccess().getCreatedOnEDateParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getGamamodelAccess().getCreatedOnEDateParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__CreatedOnAssignment_5_1"


    // $ANTLR start "rule__Gamamodel__ContainsglobalAssignment_7"
    // InternalGsl.g:7254:1: rule__Gamamodel__ContainsglobalAssignment_7 : ( ruleGlobalBlock ) ;
    public final void rule__Gamamodel__ContainsglobalAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7258:1: ( ( ruleGlobalBlock ) )
            // InternalGsl.g:7259:2: ( ruleGlobalBlock )
            {
            // InternalGsl.g:7259:2: ( ruleGlobalBlock )
            // InternalGsl.g:7260:3: ruleGlobalBlock
            {
             before(grammarAccess.getGamamodelAccess().getContainsglobalGlobalBlockParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalBlock();

            state._fsp--;

             after(grammarAccess.getGamamodelAccess().getContainsglobalGlobalBlockParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__ContainsglobalAssignment_7"


    // $ANTLR start "rule__Gamamodel__ContainsspecieAssignment_10"
    // InternalGsl.g:7269:1: rule__Gamamodel__ContainsspecieAssignment_10 : ( ruleSpecieBlock ) ;
    public final void rule__Gamamodel__ContainsspecieAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7273:1: ( ( ruleSpecieBlock ) )
            // InternalGsl.g:7274:2: ( ruleSpecieBlock )
            {
            // InternalGsl.g:7274:2: ( ruleSpecieBlock )
            // InternalGsl.g:7275:3: ruleSpecieBlock
            {
             before(grammarAccess.getGamamodelAccess().getContainsspecieSpecieBlockParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecieBlock();

            state._fsp--;

             after(grammarAccess.getGamamodelAccess().getContainsspecieSpecieBlockParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__ContainsspecieAssignment_10"


    // $ANTLR start "rule__Gamamodel__ContainsspecieAssignment_11_1"
    // InternalGsl.g:7284:1: rule__Gamamodel__ContainsspecieAssignment_11_1 : ( ruleSpecieBlock ) ;
    public final void rule__Gamamodel__ContainsspecieAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7288:1: ( ( ruleSpecieBlock ) )
            // InternalGsl.g:7289:2: ( ruleSpecieBlock )
            {
            // InternalGsl.g:7289:2: ( ruleSpecieBlock )
            // InternalGsl.g:7290:3: ruleSpecieBlock
            {
             before(grammarAccess.getGamamodelAccess().getContainsspecieSpecieBlockParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecieBlock();

            state._fsp--;

             after(grammarAccess.getGamamodelAccess().getContainsspecieSpecieBlockParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__ContainsspecieAssignment_11_1"


    // $ANTLR start "rule__Gamamodel__ContainsexperimentAssignment_15"
    // InternalGsl.g:7299:1: rule__Gamamodel__ContainsexperimentAssignment_15 : ( ruleExperimentBlock ) ;
    public final void rule__Gamamodel__ContainsexperimentAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7303:1: ( ( ruleExperimentBlock ) )
            // InternalGsl.g:7304:2: ( ruleExperimentBlock )
            {
            // InternalGsl.g:7304:2: ( ruleExperimentBlock )
            // InternalGsl.g:7305:3: ruleExperimentBlock
            {
             before(grammarAccess.getGamamodelAccess().getContainsexperimentExperimentBlockParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleExperimentBlock();

            state._fsp--;

             after(grammarAccess.getGamamodelAccess().getContainsexperimentExperimentBlockParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__ContainsexperimentAssignment_15"


    // $ANTLR start "rule__Gamamodel__ContainsexperimentAssignment_16_1"
    // InternalGsl.g:7314:1: rule__Gamamodel__ContainsexperimentAssignment_16_1 : ( ruleExperimentBlock ) ;
    public final void rule__Gamamodel__ContainsexperimentAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7318:1: ( ( ruleExperimentBlock ) )
            // InternalGsl.g:7319:2: ( ruleExperimentBlock )
            {
            // InternalGsl.g:7319:2: ( ruleExperimentBlock )
            // InternalGsl.g:7320:3: ruleExperimentBlock
            {
             before(grammarAccess.getGamamodelAccess().getContainsexperimentExperimentBlockParserRuleCall_16_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExperimentBlock();

            state._fsp--;

             after(grammarAccess.getGamamodelAccess().getContainsexperimentExperimentBlockParserRuleCall_16_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gamamodel__ContainsexperimentAssignment_16_1"


    // $ANTLR start "rule__GlobalBlock__InitAssignment_0"
    // InternalGsl.g:7329:1: rule__GlobalBlock__InitAssignment_0 : ( ( 'init' ) ) ;
    public final void rule__GlobalBlock__InitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7333:1: ( ( ( 'init' ) ) )
            // InternalGsl.g:7334:2: ( ( 'init' ) )
            {
            // InternalGsl.g:7334:2: ( ( 'init' ) )
            // InternalGsl.g:7335:3: ( 'init' )
            {
             before(grammarAccess.getGlobalBlockAccess().getInitInitKeyword_0_0()); 
            // InternalGsl.g:7336:3: ( 'init' )
            // InternalGsl.g:7337:4: 'init'
            {
             before(grammarAccess.getGlobalBlockAccess().getInitInitKeyword_0_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getGlobalBlockAccess().getInitInitKeyword_0_0()); 

            }

             after(grammarAccess.getGlobalBlockAccess().getInitInitKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__InitAssignment_0"


    // $ANTLR start "rule__GlobalBlock__IdAssignment_2"
    // InternalGsl.g:7348:1: rule__GlobalBlock__IdAssignment_2 : ( ruleEInt ) ;
    public final void rule__GlobalBlock__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7352:1: ( ( ruleEInt ) )
            // InternalGsl.g:7353:2: ( ruleEInt )
            {
            // InternalGsl.g:7353:2: ( ruleEInt )
            // InternalGsl.g:7354:3: ruleEInt
            {
             before(grammarAccess.getGlobalBlockAccess().getIdEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getGlobalBlockAccess().getIdEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__IdAssignment_2"


    // $ANTLR start "rule__GlobalBlock__ContainsglobalvariableAssignment_6"
    // InternalGsl.g:7363:1: rule__GlobalBlock__ContainsglobalvariableAssignment_6 : ( ruleGlobalVariable ) ;
    public final void rule__GlobalBlock__ContainsglobalvariableAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7367:1: ( ( ruleGlobalVariable ) )
            // InternalGsl.g:7368:2: ( ruleGlobalVariable )
            {
            // InternalGsl.g:7368:2: ( ruleGlobalVariable )
            // InternalGsl.g:7369:3: ruleGlobalVariable
            {
             before(grammarAccess.getGlobalBlockAccess().getContainsglobalvariableGlobalVariableParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalVariable();

            state._fsp--;

             after(grammarAccess.getGlobalBlockAccess().getContainsglobalvariableGlobalVariableParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__ContainsglobalvariableAssignment_6"


    // $ANTLR start "rule__GlobalBlock__ContainsglobalvariableAssignment_7_1"
    // InternalGsl.g:7378:1: rule__GlobalBlock__ContainsglobalvariableAssignment_7_1 : ( ruleGlobalVariable ) ;
    public final void rule__GlobalBlock__ContainsglobalvariableAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7382:1: ( ( ruleGlobalVariable ) )
            // InternalGsl.g:7383:2: ( ruleGlobalVariable )
            {
            // InternalGsl.g:7383:2: ( ruleGlobalVariable )
            // InternalGsl.g:7384:3: ruleGlobalVariable
            {
             before(grammarAccess.getGlobalBlockAccess().getContainsglobalvariableGlobalVariableParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGlobalVariable();

            state._fsp--;

             after(grammarAccess.getGlobalBlockAccess().getContainsglobalvariableGlobalVariableParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__ContainsglobalvariableAssignment_7_1"


    // $ANTLR start "rule__GlobalBlock__HasspatialentityAssignment_11"
    // InternalGsl.g:7393:1: rule__GlobalBlock__HasspatialentityAssignment_11 : ( ruleSpatialEntity ) ;
    public final void rule__GlobalBlock__HasspatialentityAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7397:1: ( ( ruleSpatialEntity ) )
            // InternalGsl.g:7398:2: ( ruleSpatialEntity )
            {
            // InternalGsl.g:7398:2: ( ruleSpatialEntity )
            // InternalGsl.g:7399:3: ruleSpatialEntity
            {
             before(grammarAccess.getGlobalBlockAccess().getHasspatialentitySpatialEntityParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleSpatialEntity();

            state._fsp--;

             after(grammarAccess.getGlobalBlockAccess().getHasspatialentitySpatialEntityParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__HasspatialentityAssignment_11"


    // $ANTLR start "rule__GlobalBlock__HasspatialentityAssignment_12_1"
    // InternalGsl.g:7408:1: rule__GlobalBlock__HasspatialentityAssignment_12_1 : ( ruleSpatialEntity ) ;
    public final void rule__GlobalBlock__HasspatialentityAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7412:1: ( ( ruleSpatialEntity ) )
            // InternalGsl.g:7413:2: ( ruleSpatialEntity )
            {
            // InternalGsl.g:7413:2: ( ruleSpatialEntity )
            // InternalGsl.g:7414:3: ruleSpatialEntity
            {
             before(grammarAccess.getGlobalBlockAccess().getHasspatialentitySpatialEntityParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpatialEntity();

            state._fsp--;

             after(grammarAccess.getGlobalBlockAccess().getHasspatialentitySpatialEntityParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalBlock__HasspatialentityAssignment_12_1"


    // $ANTLR start "rule__SpecieBlock__AspectfunctionAssignment_0"
    // InternalGsl.g:7423:1: rule__SpecieBlock__AspectfunctionAssignment_0 : ( ( 'aspectfunction' ) ) ;
    public final void rule__SpecieBlock__AspectfunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7427:1: ( ( ( 'aspectfunction' ) ) )
            // InternalGsl.g:7428:2: ( ( 'aspectfunction' ) )
            {
            // InternalGsl.g:7428:2: ( ( 'aspectfunction' ) )
            // InternalGsl.g:7429:3: ( 'aspectfunction' )
            {
             before(grammarAccess.getSpecieBlockAccess().getAspectfunctionAspectfunctionKeyword_0_0()); 
            // InternalGsl.g:7430:3: ( 'aspectfunction' )
            // InternalGsl.g:7431:4: 'aspectfunction'
            {
             before(grammarAccess.getSpecieBlockAccess().getAspectfunctionAspectfunctionKeyword_0_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getSpecieBlockAccess().getAspectfunctionAspectfunctionKeyword_0_0()); 

            }

             after(grammarAccess.getSpecieBlockAccess().getAspectfunctionAspectfunctionKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__AspectfunctionAssignment_0"


    // $ANTLR start "rule__SpecieBlock__SpecieBlockNameAssignment_2"
    // InternalGsl.g:7442:1: rule__SpecieBlock__SpecieBlockNameAssignment_2 : ( ruleEString ) ;
    public final void rule__SpecieBlock__SpecieBlockNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7446:1: ( ( ruleEString ) )
            // InternalGsl.g:7447:2: ( ruleEString )
            {
            // InternalGsl.g:7447:2: ( ruleEString )
            // InternalGsl.g:7448:3: ruleEString
            {
             before(grammarAccess.getSpecieBlockAccess().getSpecieBlockNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpecieBlockAccess().getSpecieBlockNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__SpecieBlockNameAssignment_2"


    // $ANTLR start "rule__SpecieBlock__AspectNameAssignment_4_1"
    // InternalGsl.g:7457:1: rule__SpecieBlock__AspectNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__SpecieBlock__AspectNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7461:1: ( ( ruleEString ) )
            // InternalGsl.g:7462:2: ( ruleEString )
            {
            // InternalGsl.g:7462:2: ( ruleEString )
            // InternalGsl.g:7463:3: ruleEString
            {
             before(grammarAccess.getSpecieBlockAccess().getAspectNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpecieBlockAccess().getAspectNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__AspectNameAssignment_4_1"


    // $ANTLR start "rule__SpecieBlock__ColorAssignment_5_1"
    // InternalGsl.g:7472:1: rule__SpecieBlock__ColorAssignment_5_1 : ( ruleEString ) ;
    public final void rule__SpecieBlock__ColorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7476:1: ( ( ruleEString ) )
            // InternalGsl.g:7477:2: ( ruleEString )
            {
            // InternalGsl.g:7477:2: ( ruleEString )
            // InternalGsl.g:7478:3: ruleEString
            {
             before(grammarAccess.getSpecieBlockAccess().getColorEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpecieBlockAccess().getColorEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__ColorAssignment_5_1"


    // $ANTLR start "rule__SpecieBlock__SkillofspecieAssignment_6_1"
    // InternalGsl.g:7487:1: rule__SpecieBlock__SkillofspecieAssignment_6_1 : ( ruleEString ) ;
    public final void rule__SpecieBlock__SkillofspecieAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7491:1: ( ( ruleEString ) )
            // InternalGsl.g:7492:2: ( ruleEString )
            {
            // InternalGsl.g:7492:2: ( ruleEString )
            // InternalGsl.g:7493:3: ruleEString
            {
             before(grammarAccess.getSpecieBlockAccess().getSkillofspecieEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpecieBlockAccess().getSkillofspecieEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__SkillofspecieAssignment_6_1"


    // $ANTLR start "rule__SpecieBlock__ContainsactionAssignment_9"
    // InternalGsl.g:7502:1: rule__SpecieBlock__ContainsactionAssignment_9 : ( ruleAction ) ;
    public final void rule__SpecieBlock__ContainsactionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7506:1: ( ( ruleAction ) )
            // InternalGsl.g:7507:2: ( ruleAction )
            {
            // InternalGsl.g:7507:2: ( ruleAction )
            // InternalGsl.g:7508:3: ruleAction
            {
             before(grammarAccess.getSpecieBlockAccess().getContainsactionActionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getSpecieBlockAccess().getContainsactionActionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__ContainsactionAssignment_9"


    // $ANTLR start "rule__SpecieBlock__ContainsactionAssignment_10_1"
    // InternalGsl.g:7517:1: rule__SpecieBlock__ContainsactionAssignment_10_1 : ( ruleAction ) ;
    public final void rule__SpecieBlock__ContainsactionAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7521:1: ( ( ruleAction ) )
            // InternalGsl.g:7522:2: ( ruleAction )
            {
            // InternalGsl.g:7522:2: ( ruleAction )
            // InternalGsl.g:7523:3: ruleAction
            {
             before(grammarAccess.getSpecieBlockAccess().getContainsactionActionParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getSpecieBlockAccess().getContainsactionActionParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__ContainsactionAssignment_10_1"


    // $ANTLR start "rule__SpecieBlock__HaspropertieAssignment_14"
    // InternalGsl.g:7532:1: rule__SpecieBlock__HaspropertieAssignment_14 : ( rulePropertie ) ;
    public final void rule__SpecieBlock__HaspropertieAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7536:1: ( ( rulePropertie ) )
            // InternalGsl.g:7537:2: ( rulePropertie )
            {
            // InternalGsl.g:7537:2: ( rulePropertie )
            // InternalGsl.g:7538:3: rulePropertie
            {
             before(grammarAccess.getSpecieBlockAccess().getHaspropertiePropertieParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            rulePropertie();

            state._fsp--;

             after(grammarAccess.getSpecieBlockAccess().getHaspropertiePropertieParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__HaspropertieAssignment_14"


    // $ANTLR start "rule__SpecieBlock__HaspropertieAssignment_15_1"
    // InternalGsl.g:7547:1: rule__SpecieBlock__HaspropertieAssignment_15_1 : ( rulePropertie ) ;
    public final void rule__SpecieBlock__HaspropertieAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7551:1: ( ( rulePropertie ) )
            // InternalGsl.g:7552:2: ( rulePropertie )
            {
            // InternalGsl.g:7552:2: ( rulePropertie )
            // InternalGsl.g:7553:3: rulePropertie
            {
             before(grammarAccess.getSpecieBlockAccess().getHaspropertiePropertieParserRuleCall_15_1_0()); 
            pushFollow(FOLLOW_2);
            rulePropertie();

            state._fsp--;

             after(grammarAccess.getSpecieBlockAccess().getHaspropertiePropertieParserRuleCall_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecieBlock__HaspropertieAssignment_15_1"


    // $ANTLR start "rule__ExperimentBlock__ExperimentNameAssignment_1"
    // InternalGsl.g:7562:1: rule__ExperimentBlock__ExperimentNameAssignment_1 : ( ruleEString ) ;
    public final void rule__ExperimentBlock__ExperimentNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7566:1: ( ( ruleEString ) )
            // InternalGsl.g:7567:2: ( ruleEString )
            {
            // InternalGsl.g:7567:2: ( ruleEString )
            // InternalGsl.g:7568:3: ruleEString
            {
             before(grammarAccess.getExperimentBlockAccess().getExperimentNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExperimentBlockAccess().getExperimentNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__ExperimentNameAssignment_1"


    // $ANTLR start "rule__ExperimentBlock__TypeAssignment_3_1"
    // InternalGsl.g:7577:1: rule__ExperimentBlock__TypeAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ExperimentBlock__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7581:1: ( ( ruleEString ) )
            // InternalGsl.g:7582:2: ( ruleEString )
            {
            // InternalGsl.g:7582:2: ( ruleEString )
            // InternalGsl.g:7583:3: ruleEString
            {
             before(grammarAccess.getExperimentBlockAccess().getTypeEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExperimentBlockAccess().getTypeEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__TypeAssignment_3_1"


    // $ANTLR start "rule__ExperimentBlock__HasparameterAssignment_6"
    // InternalGsl.g:7592:1: rule__ExperimentBlock__HasparameterAssignment_6 : ( ruleParameter ) ;
    public final void rule__ExperimentBlock__HasparameterAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7596:1: ( ( ruleParameter ) )
            // InternalGsl.g:7597:2: ( ruleParameter )
            {
            // InternalGsl.g:7597:2: ( ruleParameter )
            // InternalGsl.g:7598:3: ruleParameter
            {
             before(grammarAccess.getExperimentBlockAccess().getHasparameterParameterParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getExperimentBlockAccess().getHasparameterParameterParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__HasparameterAssignment_6"


    // $ANTLR start "rule__ExperimentBlock__HasparameterAssignment_7_1"
    // InternalGsl.g:7607:1: rule__ExperimentBlock__HasparameterAssignment_7_1 : ( ruleParameter ) ;
    public final void rule__ExperimentBlock__HasparameterAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7611:1: ( ( ruleParameter ) )
            // InternalGsl.g:7612:2: ( ruleParameter )
            {
            // InternalGsl.g:7612:2: ( ruleParameter )
            // InternalGsl.g:7613:3: ruleParameter
            {
             before(grammarAccess.getExperimentBlockAccess().getHasparameterParameterParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getExperimentBlockAccess().getHasparameterParameterParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__HasparameterAssignment_7_1"


    // $ANTLR start "rule__ExperimentBlock__HasoutputAssignment_11"
    // InternalGsl.g:7622:1: rule__ExperimentBlock__HasoutputAssignment_11 : ( ruleOutput ) ;
    public final void rule__ExperimentBlock__HasoutputAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7626:1: ( ( ruleOutput ) )
            // InternalGsl.g:7627:2: ( ruleOutput )
            {
            // InternalGsl.g:7627:2: ( ruleOutput )
            // InternalGsl.g:7628:3: ruleOutput
            {
             before(grammarAccess.getExperimentBlockAccess().getHasoutputOutputParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getExperimentBlockAccess().getHasoutputOutputParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__HasoutputAssignment_11"


    // $ANTLR start "rule__ExperimentBlock__HasoutputAssignment_12_1"
    // InternalGsl.g:7637:1: rule__ExperimentBlock__HasoutputAssignment_12_1 : ( ruleOutput ) ;
    public final void rule__ExperimentBlock__HasoutputAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7641:1: ( ( ruleOutput ) )
            // InternalGsl.g:7642:2: ( ruleOutput )
            {
            // InternalGsl.g:7642:2: ( ruleOutput )
            // InternalGsl.g:7643:3: ruleOutput
            {
             before(grammarAccess.getExperimentBlockAccess().getHasoutputOutputParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getExperimentBlockAccess().getHasoutputOutputParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExperimentBlock__HasoutputAssignment_12_1"


    // $ANTLR start "rule__GlobalVariable__GvarNameAssignment_2"
    // InternalGsl.g:7652:1: rule__GlobalVariable__GvarNameAssignment_2 : ( ruleEString ) ;
    public final void rule__GlobalVariable__GvarNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7656:1: ( ( ruleEString ) )
            // InternalGsl.g:7657:2: ( ruleEString )
            {
            // InternalGsl.g:7657:2: ( ruleEString )
            // InternalGsl.g:7658:3: ruleEString
            {
             before(grammarAccess.getGlobalVariableAccess().getGvarNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGlobalVariableAccess().getGvarNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariable__GvarNameAssignment_2"


    // $ANTLR start "rule__GlobalVariable__TypeAssignment_4_1"
    // InternalGsl.g:7667:1: rule__GlobalVariable__TypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__GlobalVariable__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7671:1: ( ( ruleEString ) )
            // InternalGsl.g:7672:2: ( ruleEString )
            {
            // InternalGsl.g:7672:2: ( ruleEString )
            // InternalGsl.g:7673:3: ruleEString
            {
             before(grammarAccess.getGlobalVariableAccess().getTypeEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGlobalVariableAccess().getTypeEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariable__TypeAssignment_4_1"


    // $ANTLR start "rule__GlobalVariable__InitValueAssignment_5_1"
    // InternalGsl.g:7682:1: rule__GlobalVariable__InitValueAssignment_5_1 : ( ruleEString ) ;
    public final void rule__GlobalVariable__InitValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7686:1: ( ( ruleEString ) )
            // InternalGsl.g:7687:2: ( ruleEString )
            {
            // InternalGsl.g:7687:2: ( ruleEString )
            // InternalGsl.g:7688:3: ruleEString
            {
             before(grammarAccess.getGlobalVariableAccess().getInitValueEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGlobalVariableAccess().getInitValueEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVariable__InitValueAssignment_5_1"


    // $ANTLR start "rule__SpatialEntity__ShapeNameAssignment_2"
    // InternalGsl.g:7697:1: rule__SpatialEntity__ShapeNameAssignment_2 : ( ruleEString ) ;
    public final void rule__SpatialEntity__ShapeNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7701:1: ( ( ruleEString ) )
            // InternalGsl.g:7702:2: ( ruleEString )
            {
            // InternalGsl.g:7702:2: ( ruleEString )
            // InternalGsl.g:7703:3: ruleEString
            {
             before(grammarAccess.getSpatialEntityAccess().getShapeNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpatialEntityAccess().getShapeNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpatialEntity__ShapeNameAssignment_2"


    // $ANTLR start "rule__SpatialEntity__ShapePathAssignment_4_1"
    // InternalGsl.g:7712:1: rule__SpatialEntity__ShapePathAssignment_4_1 : ( ruleEString ) ;
    public final void rule__SpatialEntity__ShapePathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7716:1: ( ( ruleEString ) )
            // InternalGsl.g:7717:2: ( ruleEString )
            {
            // InternalGsl.g:7717:2: ( ruleEString )
            // InternalGsl.g:7718:3: ruleEString
            {
             before(grammarAccess.getSpatialEntityAccess().getShapePathEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpatialEntityAccess().getShapePathEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpatialEntity__ShapePathAssignment_4_1"


    // $ANTLR start "rule__SpatialEntity__TypeAssignment_5_1"
    // InternalGsl.g:7727:1: rule__SpatialEntity__TypeAssignment_5_1 : ( ruleEString ) ;
    public final void rule__SpatialEntity__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7731:1: ( ( ruleEString ) )
            // InternalGsl.g:7732:2: ( ruleEString )
            {
            // InternalGsl.g:7732:2: ( ruleEString )
            // InternalGsl.g:7733:3: ruleEString
            {
             before(grammarAccess.getSpatialEntityAccess().getTypeEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpatialEntityAccess().getTypeEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpatialEntity__TypeAssignment_5_1"


    // $ANTLR start "rule__Action_Impl__ActionNameAssignment_3_1"
    // InternalGsl.g:7742:1: rule__Action_Impl__ActionNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Action_Impl__ActionNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7746:1: ( ( ruleEString ) )
            // InternalGsl.g:7747:2: ( ruleEString )
            {
            // InternalGsl.g:7747:2: ( ruleEString )
            // InternalGsl.g:7748:3: ruleEString
            {
             before(grammarAccess.getAction_ImplAccess().getActionNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAction_ImplAccess().getActionNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action_Impl__ActionNameAssignment_3_1"


    // $ANTLR start "rule__Propertie__PropertieNameAssignment_3_1"
    // InternalGsl.g:7757:1: rule__Propertie__PropertieNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Propertie__PropertieNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7761:1: ( ( ruleEString ) )
            // InternalGsl.g:7762:2: ( ruleEString )
            {
            // InternalGsl.g:7762:2: ( ruleEString )
            // InternalGsl.g:7763:3: ruleEString
            {
             before(grammarAccess.getPropertieAccess().getPropertieNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertieAccess().getPropertieNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__PropertieNameAssignment_3_1"


    // $ANTLR start "rule__Propertie__TypeAssignment_4_1"
    // InternalGsl.g:7772:1: rule__Propertie__TypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Propertie__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7776:1: ( ( ruleEString ) )
            // InternalGsl.g:7777:2: ( ruleEString )
            {
            // InternalGsl.g:7777:2: ( ruleEString )
            // InternalGsl.g:7778:3: ruleEString
            {
             before(grammarAccess.getPropertieAccess().getTypeEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertieAccess().getTypeEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__TypeAssignment_4_1"


    // $ANTLR start "rule__Propertie__InitValueAssignment_5_1"
    // InternalGsl.g:7787:1: rule__Propertie__InitValueAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Propertie__InitValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7791:1: ( ( ruleEString ) )
            // InternalGsl.g:7792:2: ( ruleEString )
            {
            // InternalGsl.g:7792:2: ( ruleEString )
            // InternalGsl.g:7793:3: ruleEString
            {
             before(grammarAccess.getPropertieAccess().getInitValueEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPropertieAccess().getInitValueEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Propertie__InitValueAssignment_5_1"


    // $ANTLR start "rule__ComplexeAction__IdAssignment_2"
    // InternalGsl.g:7802:1: rule__ComplexeAction__IdAssignment_2 : ( ruleEInt ) ;
    public final void rule__ComplexeAction__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7806:1: ( ( ruleEInt ) )
            // InternalGsl.g:7807:2: ( ruleEInt )
            {
            // InternalGsl.g:7807:2: ( ruleEInt )
            // InternalGsl.g:7808:3: ruleEInt
            {
             before(grammarAccess.getComplexeActionAccess().getIdEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getComplexeActionAccess().getIdEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexeAction__IdAssignment_2"


    // $ANTLR start "rule__ComplexeAction__ActionNameAssignment_4_1"
    // InternalGsl.g:7817:1: rule__ComplexeAction__ActionNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ComplexeAction__ActionNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7821:1: ( ( ruleEString ) )
            // InternalGsl.g:7822:2: ( ruleEString )
            {
            // InternalGsl.g:7822:2: ( ruleEString )
            // InternalGsl.g:7823:3: ruleEString
            {
             before(grammarAccess.getComplexeActionAccess().getActionNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComplexeActionAccess().getActionNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexeAction__ActionNameAssignment_4_1"


    // $ANTLR start "rule__Reflex__IdAssignment_2"
    // InternalGsl.g:7832:1: rule__Reflex__IdAssignment_2 : ( ruleEInt ) ;
    public final void rule__Reflex__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7836:1: ( ( ruleEInt ) )
            // InternalGsl.g:7837:2: ( ruleEInt )
            {
            // InternalGsl.g:7837:2: ( ruleEInt )
            // InternalGsl.g:7838:3: ruleEInt
            {
             before(grammarAccess.getReflexAccess().getIdEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReflexAccess().getIdEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reflex__IdAssignment_2"


    // $ANTLR start "rule__Reflex__ActionNameAssignment_4_1"
    // InternalGsl.g:7847:1: rule__Reflex__ActionNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Reflex__ActionNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7851:1: ( ( ruleEString ) )
            // InternalGsl.g:7852:2: ( ruleEString )
            {
            // InternalGsl.g:7852:2: ( ruleEString )
            // InternalGsl.g:7853:3: ruleEString
            {
             before(grammarAccess.getReflexAccess().getActionNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReflexAccess().getActionNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reflex__ActionNameAssignment_4_1"


    // $ANTLR start "rule__Reflex__ConditionAssignment_5_1"
    // InternalGsl.g:7862:1: rule__Reflex__ConditionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Reflex__ConditionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7866:1: ( ( ruleEString ) )
            // InternalGsl.g:7867:2: ( ruleEString )
            {
            // InternalGsl.g:7867:2: ( ruleEString )
            // InternalGsl.g:7868:3: ruleEString
            {
             before(grammarAccess.getReflexAccess().getConditionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReflexAccess().getConditionEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reflex__ConditionAssignment_5_1"


    // $ANTLR start "rule__SimpleAction__IdAssignment_2"
    // InternalGsl.g:7877:1: rule__SimpleAction__IdAssignment_2 : ( ruleEInt ) ;
    public final void rule__SimpleAction__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7881:1: ( ( ruleEInt ) )
            // InternalGsl.g:7882:2: ( ruleEInt )
            {
            // InternalGsl.g:7882:2: ( ruleEInt )
            // InternalGsl.g:7883:3: ruleEInt
            {
             before(grammarAccess.getSimpleActionAccess().getIdEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSimpleActionAccess().getIdEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAction__IdAssignment_2"


    // $ANTLR start "rule__SimpleAction__ActionNameAssignment_4_1"
    // InternalGsl.g:7892:1: rule__SimpleAction__ActionNameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__SimpleAction__ActionNameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7896:1: ( ( ruleEString ) )
            // InternalGsl.g:7897:2: ( ruleEString )
            {
            // InternalGsl.g:7897:2: ( ruleEString )
            // InternalGsl.g:7898:3: ruleEString
            {
             before(grammarAccess.getSimpleActionAccess().getActionNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleActionAccess().getActionNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAction__ActionNameAssignment_4_1"


    // $ANTLR start "rule__SimpleAction__ReturnTypeAssignment_5_1"
    // InternalGsl.g:7907:1: rule__SimpleAction__ReturnTypeAssignment_5_1 : ( ruleEString ) ;
    public final void rule__SimpleAction__ReturnTypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7911:1: ( ( ruleEString ) )
            // InternalGsl.g:7912:2: ( ruleEString )
            {
            // InternalGsl.g:7912:2: ( ruleEString )
            // InternalGsl.g:7913:3: ruleEString
            {
             before(grammarAccess.getSimpleActionAccess().getReturnTypeEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimpleActionAccess().getReturnTypeEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleAction__ReturnTypeAssignment_5_1"


    // $ANTLR start "rule__Parameter__ParameterNameAssignment_2"
    // InternalGsl.g:7922:1: rule__Parameter__ParameterNameAssignment_2 : ( ruleEString ) ;
    public final void rule__Parameter__ParameterNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7926:1: ( ( ruleEString ) )
            // InternalGsl.g:7927:2: ( ruleEString )
            {
            // InternalGsl.g:7927:2: ( ruleEString )
            // InternalGsl.g:7928:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getParameterNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getParameterNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__ParameterNameAssignment_2"


    // $ANTLR start "rule__Parameter__TargetVariableAssignment_4_1"
    // InternalGsl.g:7937:1: rule__Parameter__TargetVariableAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Parameter__TargetVariableAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7941:1: ( ( ruleEString ) )
            // InternalGsl.g:7942:2: ( ruleEString )
            {
            // InternalGsl.g:7942:2: ( ruleEString )
            // InternalGsl.g:7943:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getTargetVariableEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTargetVariableEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TargetVariableAssignment_4_1"


    // $ANTLR start "rule__Output__IdAssignment_1"
    // InternalGsl.g:7952:1: rule__Output__IdAssignment_1 : ( ruleEInt ) ;
    public final void rule__Output__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7956:1: ( ( ruleEInt ) )
            // InternalGsl.g:7957:2: ( ruleEInt )
            {
            // InternalGsl.g:7957:2: ( ruleEInt )
            // InternalGsl.g:7958:3: ruleEInt
            {
             before(grammarAccess.getOutputAccess().getIdEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getIdEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__IdAssignment_1"


    // $ANTLR start "rule__Output__OutputNameAssignment_3_1"
    // InternalGsl.g:7967:1: rule__Output__OutputNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Output__OutputNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7971:1: ( ( ruleEString ) )
            // InternalGsl.g:7972:2: ( ruleEString )
            {
            // InternalGsl.g:7972:2: ( ruleEString )
            // InternalGsl.g:7973:3: ruleEString
            {
             before(grammarAccess.getOutputAccess().getOutputNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getOutputNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__OutputNameAssignment_3_1"


    // $ANTLR start "rule__Output__FramerateAssignment_4_1"
    // InternalGsl.g:7982:1: rule__Output__FramerateAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Output__FramerateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:7986:1: ( ( ruleEString ) )
            // InternalGsl.g:7987:2: ( ruleEString )
            {
            // InternalGsl.g:7987:2: ( ruleEString )
            // InternalGsl.g:7988:3: ruleEString
            {
             before(grammarAccess.getOutputAccess().getFramerateEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getFramerateEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__FramerateAssignment_4_1"


    // $ANTLR start "rule__Output__HasdisplaysAssignment_7"
    // InternalGsl.g:7997:1: rule__Output__HasdisplaysAssignment_7 : ( ruleDisplay ) ;
    public final void rule__Output__HasdisplaysAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:8001:1: ( ( ruleDisplay ) )
            // InternalGsl.g:8002:2: ( ruleDisplay )
            {
            // InternalGsl.g:8002:2: ( ruleDisplay )
            // InternalGsl.g:8003:3: ruleDisplay
            {
             before(grammarAccess.getOutputAccess().getHasdisplaysDisplayParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDisplay();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getHasdisplaysDisplayParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__HasdisplaysAssignment_7"


    // $ANTLR start "rule__Output__HasdisplaysAssignment_8_1"
    // InternalGsl.g:8012:1: rule__Output__HasdisplaysAssignment_8_1 : ( ruleDisplay ) ;
    public final void rule__Output__HasdisplaysAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:8016:1: ( ( ruleDisplay ) )
            // InternalGsl.g:8017:2: ( ruleDisplay )
            {
            // InternalGsl.g:8017:2: ( ruleDisplay )
            // InternalGsl.g:8018:3: ruleDisplay
            {
             before(grammarAccess.getOutputAccess().getHasdisplaysDisplayParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDisplay();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getHasdisplaysDisplayParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__HasdisplaysAssignment_8_1"


    // $ANTLR start "rule__Output__HasexportfileAssignment_12"
    // InternalGsl.g:8027:1: rule__Output__HasexportfileAssignment_12 : ( ruleExportfile ) ;
    public final void rule__Output__HasexportfileAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:8031:1: ( ( ruleExportfile ) )
            // InternalGsl.g:8032:2: ( ruleExportfile )
            {
            // InternalGsl.g:8032:2: ( ruleExportfile )
            // InternalGsl.g:8033:3: ruleExportfile
            {
             before(grammarAccess.getOutputAccess().getHasexportfileExportfileParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleExportfile();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getHasexportfileExportfileParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__HasexportfileAssignment_12"


    // $ANTLR start "rule__Output__HasexportfileAssignment_13_1"
    // InternalGsl.g:8042:1: rule__Output__HasexportfileAssignment_13_1 : ( ruleExportfile ) ;
    public final void rule__Output__HasexportfileAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:8046:1: ( ( ruleExportfile ) )
            // InternalGsl.g:8047:2: ( ruleExportfile )
            {
            // InternalGsl.g:8047:2: ( ruleExportfile )
            // InternalGsl.g:8048:3: ruleExportfile
            {
             before(grammarAccess.getOutputAccess().getHasexportfileExportfileParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExportfile();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getHasexportfileExportfileParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__HasexportfileAssignment_13_1"


    // $ANTLR start "rule__Output__HasmonitorAssignment_17"
    // InternalGsl.g:8057:1: rule__Output__HasmonitorAssignment_17 : ( ruleMonitor ) ;
    public final void rule__Output__HasmonitorAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:8061:1: ( ( ruleMonitor ) )
            // InternalGsl.g:8062:2: ( ruleMonitor )
            {
            // InternalGsl.g:8062:2: ( ruleMonitor )
            // InternalGsl.g:8063:3: ruleMonitor
            {
             before(grammarAccess.getOutputAccess().getHasmonitorMonitorParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleMonitor();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getHasmonitorMonitorParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__HasmonitorAssignment_17"


    // $ANTLR start "rule__Output__HasmonitorAssignment_18_1"
    // InternalGsl.g:8072:1: rule__Output__HasmonitorAssignment_18_1 : ( ruleMonitor ) ;
    public final void rule__Output__HasmonitorAssignment_18_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:8076:1: ( ( ruleMonitor ) )
            // InternalGsl.g:8077:2: ( ruleMonitor )
            {
            // InternalGsl.g:8077:2: ( ruleMonitor )
            // InternalGsl.g:8078:3: ruleMonitor
            {
             before(grammarAccess.getOutputAccess().getHasmonitorMonitorParserRuleCall_18_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMonitor();

            state._fsp--;

             after(grammarAccess.getOutputAccess().getHasmonitorMonitorParserRuleCall_18_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__HasmonitorAssignment_18_1"


    // $ANTLR start "rule__Display__DisplayNameAssignment_1"
    // InternalGsl.g:8087:1: rule__Display__DisplayNameAssignment_1 : ( ruleEString ) ;
    public final void rule__Display__DisplayNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:8091:1: ( ( ruleEString ) )
            // InternalGsl.g:8092:2: ( ruleEString )
            {
            // InternalGsl.g:8092:2: ( ruleEString )
            // InternalGsl.g:8093:3: ruleEString
            {
             before(grammarAccess.getDisplayAccess().getDisplayNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDisplayAccess().getDisplayNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__DisplayNameAssignment_1"


    // $ANTLR start "rule__Display__DisplayTypeAssignment_3_1"
    // InternalGsl.g:8102:1: rule__Display__DisplayTypeAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Display__DisplayTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:8106:1: ( ( ruleEString ) )
            // InternalGsl.g:8107:2: ( ruleEString )
            {
            // InternalGsl.g:8107:2: ( ruleEString )
            // InternalGsl.g:8108:3: ruleEString
            {
             before(grammarAccess.getDisplayAccess().getDisplayTypeEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDisplayAccess().getDisplayTypeEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__DisplayTypeAssignment_3_1"


    // $ANTLR start "rule__Display__SpecieblockAssignment_6"
    // InternalGsl.g:8117:1: rule__Display__SpecieblockAssignment_6 : ( ruleSpecieBlock ) ;
    public final void rule__Display__SpecieblockAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:8121:1: ( ( ruleSpecieBlock ) )
            // InternalGsl.g:8122:2: ( ruleSpecieBlock )
            {
            // InternalGsl.g:8122:2: ( ruleSpecieBlock )
            // InternalGsl.g:8123:3: ruleSpecieBlock
            {
             before(grammarAccess.getDisplayAccess().getSpecieblockSpecieBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecieBlock();

            state._fsp--;

             after(grammarAccess.getDisplayAccess().getSpecieblockSpecieBlockParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__SpecieblockAssignment_6"


    // $ANTLR start "rule__Display__SpecieblockAssignment_7_1"
    // InternalGsl.g:8132:1: rule__Display__SpecieblockAssignment_7_1 : ( ruleSpecieBlock ) ;
    public final void rule__Display__SpecieblockAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:8136:1: ( ( ruleSpecieBlock ) )
            // InternalGsl.g:8137:2: ( ruleSpecieBlock )
            {
            // InternalGsl.g:8137:2: ( ruleSpecieBlock )
            // InternalGsl.g:8138:3: ruleSpecieBlock
            {
             before(grammarAccess.getDisplayAccess().getSpecieblockSpecieBlockParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecieBlock();

            state._fsp--;

             after(grammarAccess.getDisplayAccess().getSpecieblockSpecieBlockParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Display__SpecieblockAssignment_7_1"


    // $ANTLR start "rule__Exportfile__FileNameAssignment_3_1"
    // InternalGsl.g:8147:1: rule__Exportfile__FileNameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Exportfile__FileNameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:8151:1: ( ( ruleEString ) )
            // InternalGsl.g:8152:2: ( ruleEString )
            {
            // InternalGsl.g:8152:2: ( ruleEString )
            // InternalGsl.g:8153:3: ruleEString
            {
             before(grammarAccess.getExportfileAccess().getFileNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExportfileAccess().getFileNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exportfile__FileNameAssignment_3_1"


    // $ANTLR start "rule__Exportfile__FileTypeAssignment_4_1"
    // InternalGsl.g:8162:1: rule__Exportfile__FileTypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Exportfile__FileTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:8166:1: ( ( ruleEString ) )
            // InternalGsl.g:8167:2: ( ruleEString )
            {
            // InternalGsl.g:8167:2: ( ruleEString )
            // InternalGsl.g:8168:3: ruleEString
            {
             before(grammarAccess.getExportfileAccess().getFileTypeEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExportfileAccess().getFileTypeEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exportfile__FileTypeAssignment_4_1"


    // $ANTLR start "rule__Monitor__LabelAssignment_2"
    // InternalGsl.g:8177:1: rule__Monitor__LabelAssignment_2 : ( ruleEString ) ;
    public final void rule__Monitor__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:8181:1: ( ( ruleEString ) )
            // InternalGsl.g:8182:2: ( ruleEString )
            {
            // InternalGsl.g:8182:2: ( ruleEString )
            // InternalGsl.g:8183:3: ruleEString
            {
             before(grammarAccess.getMonitorAccess().getLabelEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMonitorAccess().getLabelEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__LabelAssignment_2"


    // $ANTLR start "rule__Monitor__TargetVarAssignment_4_1"
    // InternalGsl.g:8192:1: rule__Monitor__TargetVarAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Monitor__TargetVarAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGsl.g:8196:1: ( ( ruleEString ) )
            // InternalGsl.g:8197:2: ( ruleEString )
            {
            // InternalGsl.g:8197:2: ( ruleEString )
            // InternalGsl.g:8198:3: ruleEString
            {
             before(grammarAccess.getMonitorAccess().getTargetVarEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMonitorAccess().getTargetVarEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Monitor__TargetVarAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000003C4000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000E8000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001620000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004800010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010800010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000010000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000104800010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000840000010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002040000010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0008000000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0320000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x1800000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xC000000000010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000002L});

}