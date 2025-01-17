package io.github.abelgomez.asyncapi.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import io.github.abelgomez.asyncapi.services.AsyncApiGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAsyncApiParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_WS", "'{'", "'\"asyncapi\"'", "':'", "','", "'\"info\"'", "'\"servers\"'", "'}'", "'\"channels\"'", "'\"components\"'", "'\"x-sla\"'", "'\"title\"'", "'\"version\"'", "'\"description\"'", "'\"termsOfService\"'", "'\"contact\"'", "'\"license\"'", "'\"x-basePackage\"'", "'\"name\"'", "'\"url\"'", "'\"email\"'", "'\"protocol\"'", "'\"variables\"'", "'\"default\"'", "'\"enum\"'", "'['", "']'", "'\"publish\"'", "'\"subscribe\"'", "'\"parameters\"'", "'\"x-title\"'", "'\"operationId\"'", "'\"summary\"'", "'\"message\"'", "'\"traits\"'", "'\"deprecated\"'", "'\"headers\"'", "'\"tags\"'", "'\"payload\"'", "'\"type\"'", "'\"format\"'", "'\"minimum\"'", "'\"maximum\"'", "'\"minItems\"'", "'\"maxItems\"'", "'\"properties\"'", "'\"items\"'", "'\"required\"'", "'\"schema\"'", "'\"location\"'", "'\"schemas\"'", "'\"messages\"'", "'\"operationTraits\"'", "'\"messageTraits\"'", "'\"x-qosMetrics\"'", "'\"guaranteeTerm\"'", "'\"scopes\"'", "'\"qualifyingConditions\"'", "'\"slos\"'", "'\"metricType\"'", "'\"unit\"'", "'\"groupedByMessage\"'", "'\"derivedQoSMetricDefinition\"'", "'\"window\"'", "'\"windowUnit\"'", "'\"aggregationFunction\"'", "'\"AND\"'", "'\"OR\"'", "'\"qosMetric\"'", "'\"operator\"'", "'\"value\"'", "'\"$ref\"'", "'true'", "'false'", "'\"2.0.0\"'", "'\"<\"'", "'\"<=\"'", "'\"=\"'", "'\">\"'", "'\">=\"'", "'\"amqp\"'", "'\"amqps\"'", "'\"any\"'", "'\"array\"'", "'\"boolean\"'", "'\"dataType\"'", "'\"days\"'", "'\"hours\"'", "'\"integer\"'", "'\"milliseconds\"'", "'\"minutes\"'", "'\"mqtt\"'", "'\"mqtts\"'", "'\"null\"'", "'\"number\"'", "'\"object\"'", "'\"seconds\"'", "'\"stomp\"'", "'\"stomps\"'", "'\"string\"'", "'\"ws\"'", "'\"wss\"'", "'\"AVG\"'", "'\"MEDIAN\"'", "'\"MAX\"'", "'\"MIN\"'", "'\"latency\"'", "'\"availability\"'"
    };
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
    public static final int RULE_ID=6;
    public static final int RULE_INT=4;
    public static final int T__66=66;
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
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__10=10;
    public static final int T__98=98;
    public static final int T__9=9;
    public static final int T__8=8;
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
    public static final int RULE_STRING=5;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=7;
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


        public InternalAsyncApiParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAsyncApiParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAsyncApiParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAsyncApi.g"; }



     	private AsyncApiGrammarAccess grammarAccess;

        public InternalAsyncApiParser(TokenStream input, AsyncApiGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "AsyncAPI";
       	}

       	@Override
       	protected AsyncApiGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAsyncAPI"
    // InternalAsyncApi.g:65:1: entryRuleAsyncAPI returns [EObject current=null] : iv_ruleAsyncAPI= ruleAsyncAPI EOF ;
    public final EObject entryRuleAsyncAPI() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsyncAPI = null;


        try {
            // InternalAsyncApi.g:65:49: (iv_ruleAsyncAPI= ruleAsyncAPI EOF )
            // InternalAsyncApi.g:66:2: iv_ruleAsyncAPI= ruleAsyncAPI EOF
            {
             newCompositeNode(grammarAccess.getAsyncAPIRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsyncAPI=ruleAsyncAPI();

            state._fsp--;

             current =iv_ruleAsyncAPI; 
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
    // $ANTLR end "entryRuleAsyncAPI"


    // $ANTLR start "ruleAsyncAPI"
    // InternalAsyncApi.g:72:1: ruleAsyncAPI returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' ) ;
    public final EObject ruleAsyncAPI() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Enumerator lv_version_5_0 = null;

        EObject lv_info_9_0 = null;

        EObject lv_servers_14_0 = null;

        EObject lv_servers_16_0 = null;

        EObject lv_channels_22_0 = null;

        EObject lv_channels_24_0 = null;

        EObject lv_components_29_0 = null;

        EObject lv_sla_33_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:78:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' ) )
            // InternalAsyncApi.g:79:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' )
            {
            // InternalAsyncApi.g:79:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}' )
            // InternalAsyncApi.g:80:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_35= '}'
            {
            // InternalAsyncApi.g:80:3: ()
            // InternalAsyncApi.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAsyncAPIAccess().getAsyncAPIAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAsyncAPIAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:91:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:92:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:92:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:93:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:96:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:97:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:97:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) ) ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=7;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == 9 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 12 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2) ) {
                    alt9=3;
                }
                else if ( LA9_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3) ) {
                    alt9=4;
                }
                else if ( LA9_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 4) ) {
                    alt9=5;
                }
                else if ( LA9_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 5) ) {
                    alt9=6;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAsyncApi.g:98:4: ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:98:4: ({...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:99:5: {...}? => ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:99:105: ( ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:100:6: ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:103:9: ({...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:103:10: {...}? => (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:103:19: (otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:103:20: otherlv_3= '\"asyncapi\"' otherlv_4= ':' ( (lv_version_5_0= ruleVersionNumber ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,9,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getAsyncAPIAccess().getAsyncapiKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_5); 

            	    									newLeafNode(otherlv_4, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:111:9: ( (lv_version_5_0= ruleVersionNumber ) )
            	    // InternalAsyncApi.g:112:10: (lv_version_5_0= ruleVersionNumber )
            	    {
            	    // InternalAsyncApi.g:112:10: (lv_version_5_0= ruleVersionNumber )
            	    // InternalAsyncApi.g:113:11: lv_version_5_0= ruleVersionNumber
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getVersionVersionNumberEnumRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_version_5_0=ruleVersionNumber();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											set(
            	    												current,
            	    												"version",
            	    												lv_version_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.VersionNumber");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:130:9: (otherlv_6= ',' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==11) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalAsyncApi.g:131:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_7); 

            	            										newLeafNode(otherlv_6, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:142:4: ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:142:4: ({...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:143:5: {...}? => ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:143:105: ( ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:144:6: ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:147:9: ({...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:147:10: {...}? => (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:147:19: (otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:147:20: otherlv_7= '\"info\"' otherlv_8= ':' ( (lv_info_9_0= ruleInfo ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,12,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getAsyncAPIAccess().getInfoKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_8, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:155:9: ( (lv_info_9_0= ruleInfo ) )
            	    // InternalAsyncApi.g:156:10: (lv_info_9_0= ruleInfo )
            	    {
            	    // InternalAsyncApi.g:156:10: (lv_info_9_0= ruleInfo )
            	    // InternalAsyncApi.g:157:11: lv_info_9_0= ruleInfo
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getInfoInfoParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_info_9_0=ruleInfo();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											set(
            	    												current,
            	    												"info",
            	    												lv_info_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Info");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:174:9: (otherlv_10= ',' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==11) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalAsyncApi.g:175:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_7); 

            	            										newLeafNode(otherlv_10, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:186:4: ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:186:4: ({...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:187:5: {...}? => ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:187:105: ( ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:188:6: ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:191:9: ({...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:191:10: {...}? => (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:191:19: (otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:191:20: otherlv_11= '\"servers\"' otherlv_12= ':' otherlv_13= '{' ( (lv_servers_14_0= ruleServer ) ) (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )* otherlv_17= '}' (otherlv_18= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,13,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getAsyncAPIAccess().getServersKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_12, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_2_1());
            	    								
            	    otherlv_13=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_13, grammarAccess.getAsyncAPIAccess().getLeftCurlyBracketKeyword_2_2_2());
            	    								
            	    // InternalAsyncApi.g:203:9: ( (lv_servers_14_0= ruleServer ) )
            	    // InternalAsyncApi.g:204:10: (lv_servers_14_0= ruleServer )
            	    {
            	    // InternalAsyncApi.g:204:10: (lv_servers_14_0= ruleServer )
            	    // InternalAsyncApi.g:205:11: lv_servers_14_0= ruleServer
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getServersServerParserRuleCall_2_2_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_servers_14_0=ruleServer();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											add(
            	    												current,
            	    												"servers",
            	    												lv_servers_14_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Server");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:222:9: (otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==11) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:223:10: otherlv_15= ',' ( (lv_servers_16_0= ruleServer ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_15, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_2_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:227:10: ( (lv_servers_16_0= ruleServer ) )
            	    	    // InternalAsyncApi.g:228:11: (lv_servers_16_0= ruleServer )
            	    	    {
            	    	    // InternalAsyncApi.g:228:11: (lv_servers_16_0= ruleServer )
            	    	    // InternalAsyncApi.g:229:12: lv_servers_16_0= ruleServer
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getAsyncAPIAccess().getServersServerParserRuleCall_2_2_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_servers_16_0=ruleServer();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"servers",
            	    	    													lv_servers_16_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.Server");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,14,FOLLOW_6); 

            	    									newLeafNode(otherlv_17, grammarAccess.getAsyncAPIAccess().getRightCurlyBracketKeyword_2_2_5());
            	    								
            	    // InternalAsyncApi.g:251:9: (otherlv_18= ',' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==11) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalAsyncApi.g:252:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_7); 

            	            										newLeafNode(otherlv_18, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_2_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:263:4: ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:263:4: ({...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:264:5: {...}? => ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:264:105: ( ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:265:6: ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:268:9: ({...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:268:10: {...}? => (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:268:19: (otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:268:20: otherlv_19= '\"channels\"' otherlv_20= ':' otherlv_21= '{' ( (lv_channels_22_0= ruleChannel ) ) (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )* otherlv_25= '}' (otherlv_26= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getAsyncAPIAccess().getChannelsKeyword_2_3_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_20, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_3_1());
            	    								
            	    otherlv_21=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_21, grammarAccess.getAsyncAPIAccess().getLeftCurlyBracketKeyword_2_3_2());
            	    								
            	    // InternalAsyncApi.g:280:9: ( (lv_channels_22_0= ruleChannel ) )
            	    // InternalAsyncApi.g:281:10: (lv_channels_22_0= ruleChannel )
            	    {
            	    // InternalAsyncApi.g:281:10: (lv_channels_22_0= ruleChannel )
            	    // InternalAsyncApi.g:282:11: lv_channels_22_0= ruleChannel
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getChannelsChannelParserRuleCall_2_3_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_channels_22_0=ruleChannel();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											add(
            	    												current,
            	    												"channels",
            	    												lv_channels_22_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Channel");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:299:9: (otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==11) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:300:10: otherlv_23= ',' ( (lv_channels_24_0= ruleChannel ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:304:10: ( (lv_channels_24_0= ruleChannel ) )
            	    	    // InternalAsyncApi.g:305:11: (lv_channels_24_0= ruleChannel )
            	    	    {
            	    	    // InternalAsyncApi.g:305:11: (lv_channels_24_0= ruleChannel )
            	    	    // InternalAsyncApi.g:306:12: lv_channels_24_0= ruleChannel
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getAsyncAPIAccess().getChannelsChannelParserRuleCall_2_3_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_channels_24_0=ruleChannel();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"channels",
            	    	    													lv_channels_24_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.Channel");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,14,FOLLOW_6); 

            	    									newLeafNode(otherlv_25, grammarAccess.getAsyncAPIAccess().getRightCurlyBracketKeyword_2_3_5());
            	    								
            	    // InternalAsyncApi.g:328:9: (otherlv_26= ',' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==11) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalAsyncApi.g:329:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_7); 

            	            										newLeafNode(otherlv_26, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_3_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:340:4: ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:340:4: ({...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:341:5: {...}? => ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:341:105: ( ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) ) )
            	    // InternalAsyncApi.g:342:6: ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:345:9: ({...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? ) )
            	    // InternalAsyncApi.g:345:10: {...}? => (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:345:19: (otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )? )
            	    // InternalAsyncApi.g:345:20: otherlv_27= '\"components\"' otherlv_28= ':' ( (lv_components_29_0= ruleComponents ) ) (otherlv_30= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getAsyncAPIAccess().getComponentsKeyword_2_4_0());
            	    								
            	    otherlv_28=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_28, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:353:9: ( (lv_components_29_0= ruleComponents ) )
            	    // InternalAsyncApi.g:354:10: (lv_components_29_0= ruleComponents )
            	    {
            	    // InternalAsyncApi.g:354:10: (lv_components_29_0= ruleComponents )
            	    // InternalAsyncApi.g:355:11: lv_components_29_0= ruleComponents
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getComponentsComponentsParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_components_29_0=ruleComponents();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											set(
            	    												current,
            	    												"components",
            	    												lv_components_29_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Components");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:372:9: (otherlv_30= ',' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==11) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalAsyncApi.g:373:10: otherlv_30= ','
            	            {
            	            otherlv_30=(Token)match(input,11,FOLLOW_7); 

            	            										newLeafNode(otherlv_30, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_4_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAsyncApi.g:384:4: ({...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:384:4: ({...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:385:5: {...}? => ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canSelect(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:385:105: ( ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) ) )
            	    // InternalAsyncApi.g:386:6: ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:389:9: ({...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? ) )
            	    // InternalAsyncApi.g:389:10: {...}? => (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAsyncAPI", "true");
            	    }
            	    // InternalAsyncApi.g:389:19: (otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )? )
            	    // InternalAsyncApi.g:389:20: otherlv_31= '\"x-sla\"' otherlv_32= ':' ( (lv_sla_33_0= ruleSla ) ) (otherlv_34= ',' )?
            	    {
            	    otherlv_31=(Token)match(input,17,FOLLOW_4); 

            	    									newLeafNode(otherlv_31, grammarAccess.getAsyncAPIAccess().getXSlaKeyword_2_5_0());
            	    								
            	    otherlv_32=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_32, grammarAccess.getAsyncAPIAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:397:9: ( (lv_sla_33_0= ruleSla ) )
            	    // InternalAsyncApi.g:398:10: (lv_sla_33_0= ruleSla )
            	    {
            	    // InternalAsyncApi.g:398:10: (lv_sla_33_0= ruleSla )
            	    // InternalAsyncApi.g:399:11: lv_sla_33_0= ruleSla
            	    {

            	    											newCompositeNode(grammarAccess.getAsyncAPIAccess().getSlaSlaParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_sla_33_0=ruleSla();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAsyncAPIRule());
            	    											}
            	    											set(
            	    												current,
            	    												"sla",
            	    												lv_sla_33_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Sla");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:416:9: (otherlv_34= ',' )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==11) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // InternalAsyncApi.g:417:10: otherlv_34= ','
            	            {
            	            otherlv_34=(Token)match(input,11,FOLLOW_7); 

            	            										newLeafNode(otherlv_34, grammarAccess.getAsyncAPIAccess().getCommaKeyword_2_5_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleAsyncAPI", "getUnorderedGroupHelper().canLeave(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2());
            				

            }

            otherlv_35=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_35, grammarAccess.getAsyncAPIAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleAsyncAPI"


    // $ANTLR start "entryRuleInfo"
    // InternalAsyncApi.g:444:1: entryRuleInfo returns [EObject current=null] : iv_ruleInfo= ruleInfo EOF ;
    public final EObject entryRuleInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfo = null;


        try {
            // InternalAsyncApi.g:444:45: (iv_ruleInfo= ruleInfo EOF )
            // InternalAsyncApi.g:445:2: iv_ruleInfo= ruleInfo EOF
            {
             newCompositeNode(grammarAccess.getInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfo=ruleInfo();

            state._fsp--;

             current =iv_ruleInfo; 
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
    // $ANTLR end "entryRuleInfo"


    // $ANTLR start "ruleInfo"
    // InternalAsyncApi.g:451:1: ruleInfo returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' ) ;
    public final EObject ruleInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_version_9_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;

        AntlrDatatypeRuleToken lv_termsOfService_17_0 = null;

        EObject lv_contact_21_0 = null;

        EObject lv_license_25_0 = null;

        AntlrDatatypeRuleToken lv_basePackage_29_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:457:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' ) )
            // InternalAsyncApi.g:458:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' )
            {
            // InternalAsyncApi.g:458:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}' )
            // InternalAsyncApi.g:459:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_31= '}'
            {
            // InternalAsyncApi.g:459:3: ()
            // InternalAsyncApi.g:460:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInfoAccess().getInfoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getInfoAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:470:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:471:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:471:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:472:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:475:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:476:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:476:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=8;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2) ) {
                    alt17=3;
                }
                else if ( LA17_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3) ) {
                    alt17=4;
                }
                else if ( LA17_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4) ) {
                    alt17=5;
                }
                else if ( LA17_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5) ) {
                    alt17=6;
                }
                else if ( LA17_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 6) ) {
                    alt17=7;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAsyncApi.g:477:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:477:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:478:5: {...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:478:101: ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:479:6: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:482:9: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:482:10: {...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:482:19: (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:482:20: otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getInfoAccess().getTitleKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getInfoAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:490:9: ( (lv_title_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:491:10: (lv_title_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:491:10: (lv_title_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:492:11: lv_title_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getTitleAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_title_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"title",
            	    												lv_title_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:509:9: (otherlv_6= ',' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==11) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalAsyncApi.g:510:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_13); 

            	            										newLeafNode(otherlv_6, grammarAccess.getInfoAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:521:4: ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:521:4: ({...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:522:5: {...}? => ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:522:101: ( ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:523:6: ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:526:9: ({...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:526:10: {...}? => (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:526:19: (otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:526:20: otherlv_7= '\"version\"' otherlv_8= ':' ( (lv_version_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,19,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getInfoAccess().getVersionKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getInfoAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:534:9: ( (lv_version_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:535:10: (lv_version_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:535:10: (lv_version_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:536:11: lv_version_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getVersionAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_version_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"version",
            	    												lv_version_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:553:9: (otherlv_10= ',' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==11) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalAsyncApi.g:554:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_13); 

            	            										newLeafNode(otherlv_10, grammarAccess.getInfoAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:565:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:565:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:566:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:566:101: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:567:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:570:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:570:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:570:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:570:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getInfoAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getInfoAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:578:9: ( (lv_description_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:579:10: (lv_description_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:579:10: (lv_description_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:580:11: lv_description_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getDescriptionAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_description_13_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:597:9: (otherlv_14= ',' )?
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==11) ) {
            	        alt12=1;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalAsyncApi.g:598:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_13); 

            	            										newLeafNode(otherlv_14, grammarAccess.getInfoAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:609:4: ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:609:4: ({...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:610:5: {...}? => ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:610:101: ( ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:611:6: ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:614:9: ({...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:614:10: {...}? => (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:614:19: (otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:614:20: otherlv_15= '\"termsOfService\"' otherlv_16= ':' ( (lv_termsOfService_17_0= ruleAnyString ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,21,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getInfoAccess().getTermsOfServiceKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_16, grammarAccess.getInfoAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:622:9: ( (lv_termsOfService_17_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:623:10: (lv_termsOfService_17_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:623:10: (lv_termsOfService_17_0= ruleAnyString )
            	    // InternalAsyncApi.g:624:11: lv_termsOfService_17_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getTermsOfServiceAnyStringParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_termsOfService_17_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"termsOfService",
            	    												lv_termsOfService_17_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:641:9: (otherlv_18= ',' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==11) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalAsyncApi.g:642:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_13); 

            	            										newLeafNode(otherlv_18, grammarAccess.getInfoAccess().getCommaKeyword_2_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:653:4: ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:653:4: ({...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:654:5: {...}? => ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:654:101: ( ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:655:6: ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:658:9: ({...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:658:10: {...}? => (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:658:19: (otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:658:20: otherlv_19= '\"contact\"' otherlv_20= ':' ( (lv_contact_21_0= ruleContact ) ) (otherlv_22= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,22,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getInfoAccess().getContactKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_20, grammarAccess.getInfoAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:666:9: ( (lv_contact_21_0= ruleContact ) )
            	    // InternalAsyncApi.g:667:10: (lv_contact_21_0= ruleContact )
            	    {
            	    // InternalAsyncApi.g:667:10: (lv_contact_21_0= ruleContact )
            	    // InternalAsyncApi.g:668:11: lv_contact_21_0= ruleContact
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getContactContactParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_contact_21_0=ruleContact();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"contact",
            	    												lv_contact_21_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Contact");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:685:9: (otherlv_22= ',' )?
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==11) ) {
            	        alt14=1;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalAsyncApi.g:686:10: otherlv_22= ','
            	            {
            	            otherlv_22=(Token)match(input,11,FOLLOW_13); 

            	            										newLeafNode(otherlv_22, grammarAccess.getInfoAccess().getCommaKeyword_2_4_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAsyncApi.g:697:4: ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:697:4: ({...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:698:5: {...}? => ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:698:101: ( ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:699:6: ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:702:9: ({...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:702:10: {...}? => (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:702:19: (otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:702:20: otherlv_23= '\"license\"' otherlv_24= ':' ( (lv_license_25_0= ruleLicense ) ) (otherlv_26= ',' )?
            	    {
            	    otherlv_23=(Token)match(input,23,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getInfoAccess().getLicenseKeyword_2_5_0());
            	    								
            	    otherlv_24=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_24, grammarAccess.getInfoAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:710:9: ( (lv_license_25_0= ruleLicense ) )
            	    // InternalAsyncApi.g:711:10: (lv_license_25_0= ruleLicense )
            	    {
            	    // InternalAsyncApi.g:711:10: (lv_license_25_0= ruleLicense )
            	    // InternalAsyncApi.g:712:11: lv_license_25_0= ruleLicense
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getLicenseLicenseParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_license_25_0=ruleLicense();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"license",
            	    												lv_license_25_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.License");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:729:9: (otherlv_26= ',' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==11) ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalAsyncApi.g:730:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_13); 

            	            										newLeafNode(otherlv_26, grammarAccess.getInfoAccess().getCommaKeyword_2_5_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalAsyncApi.g:741:4: ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:741:4: ({...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:742:5: {...}? => ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canSelect(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalAsyncApi.g:742:101: ( ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) ) )
            	    // InternalAsyncApi.g:743:6: ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getInfoAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalAsyncApi.g:746:9: ({...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? ) )
            	    // InternalAsyncApi.g:746:10: {...}? => (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInfo", "true");
            	    }
            	    // InternalAsyncApi.g:746:19: (otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )? )
            	    // InternalAsyncApi.g:746:20: otherlv_27= '\"x-basePackage\"' otherlv_28= ':' ( (lv_basePackage_29_0= ruleAnyString ) ) (otherlv_30= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,24,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getInfoAccess().getXBasePackageKeyword_2_6_0());
            	    								
            	    otherlv_28=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_28, grammarAccess.getInfoAccess().getColonKeyword_2_6_1());
            	    								
            	    // InternalAsyncApi.g:754:9: ( (lv_basePackage_29_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:755:10: (lv_basePackage_29_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:755:10: (lv_basePackage_29_0= ruleAnyString )
            	    // InternalAsyncApi.g:756:11: lv_basePackage_29_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getInfoAccess().getBasePackageAnyStringParserRuleCall_2_6_2_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_basePackage_29_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getInfoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"basePackage",
            	    												lv_basePackage_29_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:773:9: (otherlv_30= ',' )?
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==11) ) {
            	        alt16=1;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalAsyncApi.g:774:10: otherlv_30= ','
            	            {
            	            otherlv_30=(Token)match(input,11,FOLLOW_13); 

            	            										newLeafNode(otherlv_30, grammarAccess.getInfoAccess().getCommaKeyword_2_6_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getInfoAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleInfo", "getUnorderedGroupHelper().canLeave(grammarAccess.getInfoAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getInfoAccess().getUnorderedGroup_2());
            				

            }

            otherlv_31=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getInfoAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleInfo"


    // $ANTLR start "entryRuleContact"
    // InternalAsyncApi.g:801:1: entryRuleContact returns [EObject current=null] : iv_ruleContact= ruleContact EOF ;
    public final EObject entryRuleContact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContact = null;


        try {
            // InternalAsyncApi.g:801:48: (iv_ruleContact= ruleContact EOF )
            // InternalAsyncApi.g:802:2: iv_ruleContact= ruleContact EOF
            {
             newCompositeNode(grammarAccess.getContactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContact=ruleContact();

            state._fsp--;

             current =iv_ruleContact; 
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
    // $ANTLR end "entryRuleContact"


    // $ANTLR start "ruleContact"
    // InternalAsyncApi.g:808:1: ruleContact returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
    public final EObject ruleContact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_url_9_0 = null;

        AntlrDatatypeRuleToken lv_email_13_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:814:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalAsyncApi.g:815:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalAsyncApi.g:815:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // InternalAsyncApi.g:816:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            // InternalAsyncApi.g:816:3: ()
            // InternalAsyncApi.g:817:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContactAccess().getContactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getContactAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:827:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:828:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:828:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:829:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getContactAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:832:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:833:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:833:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            loop21:
            do {
                int alt21=4;
                int LA21_0 = input.LA(1);

                if ( LA21_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1) ) {
                    alt21=2;
                }
                else if ( LA21_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2) ) {
                    alt21=3;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAsyncApi.g:834:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:834:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:835:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:835:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:836:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:839:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:839:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:839:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:839:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getContactAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getContactAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:847:9: ( (lv_name_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:848:10: (lv_name_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:848:10: (lv_name_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:849:11: lv_name_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getContactAccess().getNameAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_15);
            	    lv_name_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getContactRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:866:9: (otherlv_6= ',' )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==11) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalAsyncApi.g:867:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_14); 

            	            										newLeafNode(otherlv_6, grammarAccess.getContactAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContactAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:878:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:878:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:879:5: {...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:879:104: ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:880:6: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:883:9: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:883:10: {...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:883:19: (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:883:20: otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getContactAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getContactAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:891:9: ( (lv_url_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:892:10: (lv_url_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:892:10: (lv_url_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:893:11: lv_url_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getContactAccess().getUrlAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_15);
            	    lv_url_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getContactRule());
            	    											}
            	    											set(
            	    												current,
            	    												"url",
            	    												lv_url_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:910:9: (otherlv_10= ',' )?
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==11) ) {
            	        alt19=1;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalAsyncApi.g:911:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_14); 

            	            										newLeafNode(otherlv_10, grammarAccess.getContactAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContactAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:922:4: ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:922:4: ({...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:923:5: {...}? => ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "getUnorderedGroupHelper().canSelect(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:923:104: ( ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:924:6: ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getContactAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:927:9: ({...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:927:10: {...}? => (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContact", "true");
            	    }
            	    // InternalAsyncApi.g:927:19: (otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:927:20: otherlv_11= '\"email\"' otherlv_12= ':' ( (lv_email_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,27,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getContactAccess().getEmailKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getContactAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:935:9: ( (lv_email_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:936:10: (lv_email_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:936:10: (lv_email_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:937:11: lv_email_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getContactAccess().getEmailAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_15);
            	    lv_email_13_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getContactRule());
            	    											}
            	    											set(
            	    												current,
            	    												"email",
            	    												lv_email_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:954:9: (otherlv_14= ',' )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==11) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalAsyncApi.g:955:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_14); 

            	            										newLeafNode(otherlv_14, grammarAccess.getContactAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContactAccess().getUnorderedGroup_2());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getContactAccess().getUnorderedGroup_2());
            				

            }

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getContactAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleContact"


    // $ANTLR start "entryRuleLicense"
    // InternalAsyncApi.g:981:1: entryRuleLicense returns [EObject current=null] : iv_ruleLicense= ruleLicense EOF ;
    public final EObject entryRuleLicense() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLicense = null;


        try {
            // InternalAsyncApi.g:981:48: (iv_ruleLicense= ruleLicense EOF )
            // InternalAsyncApi.g:982:2: iv_ruleLicense= ruleLicense EOF
            {
             newCompositeNode(grammarAccess.getLicenseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLicense=ruleLicense();

            state._fsp--;

             current =iv_ruleLicense; 
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
    // $ANTLR end "entryRuleLicense"


    // $ANTLR start "ruleLicense"
    // InternalAsyncApi.g:988:1: ruleLicense returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleLicense() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_url_9_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:994:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // InternalAsyncApi.g:995:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // InternalAsyncApi.g:995:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // InternalAsyncApi.g:996:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // InternalAsyncApi.g:996:3: ()
            // InternalAsyncApi.g:997:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLicenseAccess().getLicenseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getLicenseAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:1007:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1008:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1008:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1009:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getLicenseAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:1012:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1013:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1013:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAsyncApi.g:1014:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1014:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1015:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:1015:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:1016:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:1019:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:1019:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "true");
            	    }
            	    // InternalAsyncApi.g:1019:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:1019:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getLicenseAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getLicenseAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:1027:9: ( (lv_name_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1028:10: (lv_name_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1028:10: (lv_name_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:1029:11: lv_name_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getLicenseAccess().getNameAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_name_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLicenseRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1046:9: (otherlv_6= ',' )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==11) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalAsyncApi.g:1047:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_16); 

            	            										newLeafNode(otherlv_6, grammarAccess.getLicenseAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLicenseAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:1058:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1058:4: ({...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1059:5: {...}? => ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "getUnorderedGroupHelper().canSelect(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:1059:104: ( ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:1060:6: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:1063:9: ({...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:1063:10: {...}? => (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleLicense", "true");
            	    }
            	    // InternalAsyncApi.g:1063:19: (otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:1063:20: otherlv_7= '\"url\"' otherlv_8= ':' ( (lv_url_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getLicenseAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getLicenseAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:1071:9: ( (lv_url_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1072:10: (lv_url_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1072:10: (lv_url_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:1073:11: lv_url_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getLicenseAccess().getUrlAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_17);
            	    lv_url_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getLicenseRule());
            	    											}
            	    											set(
            	    												current,
            	    												"url",
            	    												lv_url_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1090:9: (otherlv_10= ',' )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==11) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalAsyncApi.g:1091:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_16); 

            	            										newLeafNode(otherlv_10, grammarAccess.getLicenseAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLicenseAccess().getUnorderedGroup_2());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getLicenseAccess().getUnorderedGroup_2());
            				

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLicenseAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleLicense"


    // $ANTLR start "entryRuleServer"
    // InternalAsyncApi.g:1117:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // InternalAsyncApi.g:1117:47: (iv_ruleServer= ruleServer EOF )
            // InternalAsyncApi.g:1118:2: iv_ruleServer= ruleServer EOF
            {
             newCompositeNode(grammarAccess.getServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServer=ruleServer();

            state._fsp--;

             current =iv_ruleServer; 
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
    // $ANTLR end "entryRuleServer"


    // $ANTLR start "ruleServer"
    // InternalAsyncApi.g:1124:1: ruleServer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' ) ;
    public final EObject ruleServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_url_7_0 = null;

        Enumerator lv_protocol_11_0 = null;

        AntlrDatatypeRuleToken lv_description_15_0 = null;

        EObject lv_variables_20_0 = null;

        EObject lv_variables_22_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1130:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' ) )
            // InternalAsyncApi.g:1131:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' )
            {
            // InternalAsyncApi.g:1131:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}' )
            // InternalAsyncApi.g:1132:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_25= '}'
            {
            // InternalAsyncApi.g:1132:3: ()
            // InternalAsyncApi.g:1133:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServerAccess().getServerAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1139:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:1140:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:1140:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:1141:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getServerAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getServerAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,8,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsyncApi.g:1166:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:1167:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:1167:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:1168:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getServerAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1171:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:1172:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:1172:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=5;
                int LA30_0 = input.LA(1);

                if ( LA30_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 1) ) {
                    alt30=2;
                }
                else if ( LA30_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 2) ) {
                    alt30=3;
                }
                else if ( LA30_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 3) ) {
                    alt30=4;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAsyncApi.g:1173:4: ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1173:4: ({...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1174:5: {...}? => ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1174:103: ( ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1175:6: ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1178:9: ({...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1178:10: {...}? => (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1178:19: (otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1178:20: otherlv_5= '\"url\"' otherlv_6= ':' ( (lv_url_7_0= ruleAnyString ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,26,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getServerAccess().getUrlKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_6, grammarAccess.getServerAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1186:9: ( (lv_url_7_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1187:10: (lv_url_7_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1187:10: (lv_url_7_0= ruleAnyString )
            	    // InternalAsyncApi.g:1188:11: lv_url_7_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getServerAccess().getUrlAnyStringParserRuleCall_4_0_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
            	    lv_url_7_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServerRule());
            	    											}
            	    											set(
            	    												current,
            	    												"url",
            	    												lv_url_7_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1205:9: (otherlv_8= ',' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==11) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalAsyncApi.g:1206:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,11,FOLLOW_20); 

            	            										newLeafNode(otherlv_8, grammarAccess.getServerAccess().getCommaKeyword_4_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServerAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:1217:4: ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1217:4: ({...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1218:5: {...}? => ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1218:103: ( ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1219:6: ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1222:9: ({...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1222:10: {...}? => (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1222:19: (otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1222:20: otherlv_9= '\"protocol\"' otherlv_10= ':' ( (lv_protocol_11_0= ruleProtocol ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,28,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getServerAccess().getProtocolKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,10,FOLLOW_21); 

            	    									newLeafNode(otherlv_10, grammarAccess.getServerAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1230:9: ( (lv_protocol_11_0= ruleProtocol ) )
            	    // InternalAsyncApi.g:1231:10: (lv_protocol_11_0= ruleProtocol )
            	    {
            	    // InternalAsyncApi.g:1231:10: (lv_protocol_11_0= ruleProtocol )
            	    // InternalAsyncApi.g:1232:11: lv_protocol_11_0= ruleProtocol
            	    {

            	    											newCompositeNode(grammarAccess.getServerAccess().getProtocolProtocolEnumRuleCall_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
            	    lv_protocol_11_0=ruleProtocol();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServerRule());
            	    											}
            	    											set(
            	    												current,
            	    												"protocol",
            	    												lv_protocol_11_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Protocol");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1249:9: (otherlv_12= ',' )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==11) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalAsyncApi.g:1250:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,11,FOLLOW_20); 

            	            										newLeafNode(otherlv_12, grammarAccess.getServerAccess().getCommaKeyword_4_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServerAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:1261:4: ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1261:4: ({...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1262:5: {...}? => ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalAsyncApi.g:1262:103: ( ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalAsyncApi.g:1263:6: ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalAsyncApi.g:1266:9: ({...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? ) )
            	    // InternalAsyncApi.g:1266:10: {...}? => (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1266:19: (otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )? )
            	    // InternalAsyncApi.g:1266:20: otherlv_13= '\"description\"' otherlv_14= ':' ( (lv_description_15_0= ruleAnyString ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getServerAccess().getDescriptionKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_14, grammarAccess.getServerAccess().getColonKeyword_4_2_1());
            	    								
            	    // InternalAsyncApi.g:1274:9: ( (lv_description_15_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1275:10: (lv_description_15_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1275:10: (lv_description_15_0= ruleAnyString )
            	    // InternalAsyncApi.g:1276:11: lv_description_15_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getServerAccess().getDescriptionAnyStringParserRuleCall_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
            	    lv_description_15_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServerRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_15_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1293:9: (otherlv_16= ',' )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==11) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalAsyncApi.g:1294:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,11,FOLLOW_20); 

            	            										newLeafNode(otherlv_16, grammarAccess.getServerAccess().getCommaKeyword_4_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServerAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:1305:4: ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1305:4: ({...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1306:5: {...}? => ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getServerAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalAsyncApi.g:1306:103: ( ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) )
            	    // InternalAsyncApi.g:1307:6: ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getServerAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalAsyncApi.g:1310:9: ({...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) )
            	    // InternalAsyncApi.g:1310:10: {...}? => (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleServer", "true");
            	    }
            	    // InternalAsyncApi.g:1310:19: (otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )? )
            	    // InternalAsyncApi.g:1310:20: otherlv_17= '\"variables\"' otherlv_18= ':' otherlv_19= '{' ( (lv_variables_20_0= ruleVariable ) ) (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )* otherlv_23= '}' (otherlv_24= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,29,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getServerAccess().getVariablesKeyword_4_3_0());
            	    								
            	    otherlv_18=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_18, grammarAccess.getServerAccess().getColonKeyword_4_3_1());
            	    								
            	    otherlv_19=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_19, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_4_3_2());
            	    								
            	    // InternalAsyncApi.g:1322:9: ( (lv_variables_20_0= ruleVariable ) )
            	    // InternalAsyncApi.g:1323:10: (lv_variables_20_0= ruleVariable )
            	    {
            	    // InternalAsyncApi.g:1323:10: (lv_variables_20_0= ruleVariable )
            	    // InternalAsyncApi.g:1324:11: lv_variables_20_0= ruleVariable
            	    {

            	    											newCompositeNode(grammarAccess.getServerAccess().getVariablesVariableParserRuleCall_4_3_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_variables_20_0=ruleVariable();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getServerRule());
            	    											}
            	    											add(
            	    												current,
            	    												"variables",
            	    												lv_variables_20_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Variable");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1341:9: (otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) ) )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==11) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1342:10: otherlv_21= ',' ( (lv_variables_22_0= ruleVariable ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_21, grammarAccess.getServerAccess().getCommaKeyword_4_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1346:10: ( (lv_variables_22_0= ruleVariable ) )
            	    	    // InternalAsyncApi.g:1347:11: (lv_variables_22_0= ruleVariable )
            	    	    {
            	    	    // InternalAsyncApi.g:1347:11: (lv_variables_22_0= ruleVariable )
            	    	    // InternalAsyncApi.g:1348:12: lv_variables_22_0= ruleVariable
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getServerAccess().getVariablesVariableParserRuleCall_4_3_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_variables_22_0=ruleVariable();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getServerRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"variables",
            	    	    													lv_variables_22_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.Variable");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);

            	    otherlv_23=(Token)match(input,14,FOLLOW_19); 

            	    									newLeafNode(otherlv_23, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_4_3_5());
            	    								
            	    // InternalAsyncApi.g:1370:9: (otherlv_24= ',' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==11) ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalAsyncApi.g:1371:10: otherlv_24= ','
            	            {
            	            otherlv_24=(Token)match(input,11,FOLLOW_20); 

            	            										newLeafNode(otherlv_24, grammarAccess.getServerAccess().getCommaKeyword_4_3_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getServerAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getServerAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleServer", "getUnorderedGroupHelper().canLeave(grammarAccess.getServerAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getServerAccess().getUnorderedGroup_4());
            				

            }

            otherlv_25=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleServer"


    // $ANTLR start "entryRuleVariable"
    // InternalAsyncApi.g:1398:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalAsyncApi.g:1398:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalAsyncApi.g:1399:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalAsyncApi.g:1405:1: ruleVariable returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_default_11_0 = null;

        AntlrDatatypeRuleToken lv_enum_16_0 = null;

        AntlrDatatypeRuleToken lv_enum_18_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1411:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' ) )
            // InternalAsyncApi.g:1412:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' )
            {
            // InternalAsyncApi.g:1412:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}' )
            // InternalAsyncApi.g:1413:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) ) otherlv_21= '}'
            {
            // InternalAsyncApi.g:1413:3: ()
            // InternalAsyncApi.g:1414:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1420:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:1421:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:1421:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:1422:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,8,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsyncApi.g:1447:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1448:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1448:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1449:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getVariableAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1452:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1453:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1453:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) ) )*
            loop35:
            do {
                int alt35=4;
                int LA35_0 = input.LA(1);

                if ( LA35_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0) ) {
                    alt35=1;
                }
                else if ( LA35_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1) ) {
                    alt35=2;
                }
                else if ( LA35_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2) ) {
                    alt35=3;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAsyncApi.g:1454:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1454:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1455:5: {...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1455:105: ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1456:6: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1459:9: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1459:10: {...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1459:19: (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1459:20: otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getDescriptionKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1467:9: ( (lv_description_7_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1468:10: (lv_description_7_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1468:10: (lv_description_7_0= ruleAnyString )
            	    // InternalAsyncApi.g:1469:11: lv_description_7_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getVariableAccess().getDescriptionAnyStringParserRuleCall_4_0_2_0());
            	    										
            	    pushFollow(FOLLOW_23);
            	    lv_description_7_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVariableRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_7_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1486:9: (otherlv_8= ',' )?
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==11) ) {
            	        alt31=1;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalAsyncApi.g:1487:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,11,FOLLOW_22); 

            	            										newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getCommaKeyword_4_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVariableAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:1498:4: ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1498:4: ({...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1499:5: {...}? => ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1499:105: ( ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1500:6: ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1503:9: ({...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1503:10: {...}? => (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1503:19: (otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1503:20: otherlv_9= '\"default\"' otherlv_10= ':' ( (lv_default_11_0= ruleAnyString ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,30,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getDefaultKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1511:9: ( (lv_default_11_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1512:10: (lv_default_11_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1512:10: (lv_default_11_0= ruleAnyString )
            	    // InternalAsyncApi.g:1513:11: lv_default_11_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getVariableAccess().getDefaultAnyStringParserRuleCall_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_23);
            	    lv_default_11_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVariableRule());
            	    											}
            	    											set(
            	    												current,
            	    												"default",
            	    												lv_default_11_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1530:9: (otherlv_12= ',' )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==11) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalAsyncApi.g:1531:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,11,FOLLOW_22); 

            	            										newLeafNode(otherlv_12, grammarAccess.getVariableAccess().getCommaKeyword_4_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVariableAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:1542:4: ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1542:4: ({...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1543:5: {...}? => ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "getUnorderedGroupHelper().canSelect(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalAsyncApi.g:1543:105: ( ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) ) )
            	    // InternalAsyncApi.g:1544:6: ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getVariableAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalAsyncApi.g:1547:9: ({...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? ) )
            	    // InternalAsyncApi.g:1547:10: {...}? => (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleVariable", "true");
            	    }
            	    // InternalAsyncApi.g:1547:19: (otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )? )
            	    // InternalAsyncApi.g:1547:20: otherlv_13= '\"enum\"' otherlv_14= ':' otherlv_15= '[' ( (lv_enum_16_0= ruleAnyString ) ) (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )* otherlv_19= ']' (otherlv_20= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,31,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getEnumKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_14, grammarAccess.getVariableAccess().getColonKeyword_4_2_1());
            	    								
            	    otherlv_15=(Token)match(input,32,FOLLOW_9); 

            	    									newLeafNode(otherlv_15, grammarAccess.getVariableAccess().getLeftSquareBracketKeyword_4_2_2());
            	    								
            	    // InternalAsyncApi.g:1559:9: ( (lv_enum_16_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1560:10: (lv_enum_16_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1560:10: (lv_enum_16_0= ruleAnyString )
            	    // InternalAsyncApi.g:1561:11: lv_enum_16_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getVariableAccess().getEnumAnyStringParserRuleCall_4_2_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_enum_16_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getVariableRule());
            	    											}
            	    											add(
            	    												current,
            	    												"enum",
            	    												lv_enum_16_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1578:9: (otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) ) )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==11) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1579:10: otherlv_17= ',' ( (lv_enum_18_0= ruleAnyString ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_17, grammarAccess.getVariableAccess().getCommaKeyword_4_2_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1583:10: ( (lv_enum_18_0= ruleAnyString ) )
            	    	    // InternalAsyncApi.g:1584:11: (lv_enum_18_0= ruleAnyString )
            	    	    {
            	    	    // InternalAsyncApi.g:1584:11: (lv_enum_18_0= ruleAnyString )
            	    	    // InternalAsyncApi.g:1585:12: lv_enum_18_0= ruleAnyString
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getVariableAccess().getEnumAnyStringParserRuleCall_4_2_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
            	    	    lv_enum_18_0=ruleAnyString();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getVariableRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"enum",
            	    	    													lv_enum_18_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,33,FOLLOW_23); 

            	    									newLeafNode(otherlv_19, grammarAccess.getVariableAccess().getRightSquareBracketKeyword_4_2_5());
            	    								
            	    // InternalAsyncApi.g:1607:9: (otherlv_20= ',' )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==11) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalAsyncApi.g:1608:10: otherlv_20= ','
            	            {
            	            otherlv_20=(Token)match(input,11,FOLLOW_22); 

            	            										newLeafNode(otherlv_20, grammarAccess.getVariableAccess().getCommaKeyword_4_2_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVariableAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getVariableAccess().getUnorderedGroup_4());
            				

            }

            otherlv_21=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleChannel"
    // InternalAsyncApi.g:1634:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalAsyncApi.g:1634:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalAsyncApi.g:1635:2: iv_ruleChannel= ruleChannel EOF
            {
             newCompositeNode(grammarAccess.getChannelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannel=ruleChannel();

            state._fsp--;

             current =iv_ruleChannel; 
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
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalAsyncApi.g:1641:1: ruleChannel returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}' ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_publish_11_0 = null;

        EObject lv_subscribe_15_0 = null;

        EObject lv_parameters_20_0 = null;

        EObject lv_parameters_22_0 = null;

        AntlrDatatypeRuleToken lv_title_27_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1647:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}' ) )
            // InternalAsyncApi.g:1648:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}' )
            {
            // InternalAsyncApi.g:1648:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}' )
            // InternalAsyncApi.g:1649:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) ) otherlv_29= '}'
            {
            // InternalAsyncApi.g:1649:3: ()
            // InternalAsyncApi.g:1650:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChannelAccess().getChannelAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:1656:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:1657:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:1657:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:1658:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getChannelAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChannelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getChannelAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,8,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getChannelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAsyncApi.g:1683:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1684:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1684:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1685:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            				
            // InternalAsyncApi.g:1688:5: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1689:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1689:6: ( ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) ) )*
            loop42:
            do {
                int alt42=6;
                int LA42_0 = input.LA(1);

                if ( LA42_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 0) ) {
                    alt42=1;
                }
                else if ( LA42_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 1) ) {
                    alt42=2;
                }
                else if ( LA42_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 2) ) {
                    alt42=3;
                }
                else if ( LA42_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 3) ) {
                    alt42=4;
                }
                else if ( LA42_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 4) ) {
                    alt42=5;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAsyncApi.g:1690:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1690:4: ({...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1691:5: {...}? => ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalAsyncApi.g:1691:104: ( ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:1692:6: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalAsyncApi.g:1695:9: ({...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:1695:10: {...}? => (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1695:19: (otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:1695:20: otherlv_5= '\"description\"' otherlv_6= ':' ( (lv_description_7_0= ruleAnyString ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getChannelAccess().getDescriptionKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_6, grammarAccess.getChannelAccess().getColonKeyword_4_0_1());
            	    								
            	    // InternalAsyncApi.g:1703:9: ( (lv_description_7_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1704:10: (lv_description_7_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1704:10: (lv_description_7_0= ruleAnyString )
            	    // InternalAsyncApi.g:1705:11: lv_description_7_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getChannelAccess().getDescriptionAnyStringParserRuleCall_4_0_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
            	    lv_description_7_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getChannelRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_7_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1722:9: (otherlv_8= ',' )?
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==11) ) {
            	        alt36=1;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalAsyncApi.g:1723:10: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,11,FOLLOW_26); 

            	            										newLeafNode(otherlv_8, grammarAccess.getChannelAccess().getCommaKeyword_4_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:1734:4: ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1734:4: ({...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1735:5: {...}? => ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalAsyncApi.g:1735:104: ( ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:1736:6: ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalAsyncApi.g:1739:9: ({...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:1739:10: {...}? => (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1739:19: (otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:1739:20: otherlv_9= '\"publish\"' otherlv_10= ':' ( (lv_publish_11_0= ruleOperation ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,34,FOLLOW_4); 

            	    									newLeafNode(otherlv_9, grammarAccess.getChannelAccess().getPublishKeyword_4_1_0());
            	    								
            	    otherlv_10=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getChannelAccess().getColonKeyword_4_1_1());
            	    								
            	    // InternalAsyncApi.g:1747:9: ( (lv_publish_11_0= ruleOperation ) )
            	    // InternalAsyncApi.g:1748:10: (lv_publish_11_0= ruleOperation )
            	    {
            	    // InternalAsyncApi.g:1748:10: (lv_publish_11_0= ruleOperation )
            	    // InternalAsyncApi.g:1749:11: lv_publish_11_0= ruleOperation
            	    {

            	    											newCompositeNode(grammarAccess.getChannelAccess().getPublishOperationParserRuleCall_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
            	    lv_publish_11_0=ruleOperation();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getChannelRule());
            	    											}
            	    											set(
            	    												current,
            	    												"publish",
            	    												lv_publish_11_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Operation");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1766:9: (otherlv_12= ',' )?
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==11) ) {
            	        alt37=1;
            	    }
            	    switch (alt37) {
            	        case 1 :
            	            // InternalAsyncApi.g:1767:10: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,11,FOLLOW_26); 

            	            										newLeafNode(otherlv_12, grammarAccess.getChannelAccess().getCommaKeyword_4_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:1778:4: ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1778:4: ({...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1779:5: {...}? => ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalAsyncApi.g:1779:104: ( ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalAsyncApi.g:1780:6: ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalAsyncApi.g:1783:9: ({...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? ) )
            	    // InternalAsyncApi.g:1783:10: {...}? => (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1783:19: (otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )? )
            	    // InternalAsyncApi.g:1783:20: otherlv_13= '\"subscribe\"' otherlv_14= ':' ( (lv_subscribe_15_0= ruleOperation ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,35,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getChannelAccess().getSubscribeKeyword_4_2_0());
            	    								
            	    otherlv_14=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_14, grammarAccess.getChannelAccess().getColonKeyword_4_2_1());
            	    								
            	    // InternalAsyncApi.g:1791:9: ( (lv_subscribe_15_0= ruleOperation ) )
            	    // InternalAsyncApi.g:1792:10: (lv_subscribe_15_0= ruleOperation )
            	    {
            	    // InternalAsyncApi.g:1792:10: (lv_subscribe_15_0= ruleOperation )
            	    // InternalAsyncApi.g:1793:11: lv_subscribe_15_0= ruleOperation
            	    {

            	    											newCompositeNode(grammarAccess.getChannelAccess().getSubscribeOperationParserRuleCall_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
            	    lv_subscribe_15_0=ruleOperation();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getChannelRule());
            	    											}
            	    											set(
            	    												current,
            	    												"subscribe",
            	    												lv_subscribe_15_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Operation");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1810:9: (otherlv_16= ',' )?
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==11) ) {
            	        alt38=1;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalAsyncApi.g:1811:10: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,11,FOLLOW_26); 

            	            										newLeafNode(otherlv_16, grammarAccess.getChannelAccess().getCommaKeyword_4_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:1822:4: ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1822:4: ({...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1823:5: {...}? => ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalAsyncApi.g:1823:104: ( ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) ) )
            	    // InternalAsyncApi.g:1824:6: ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalAsyncApi.g:1827:9: ({...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? ) )
            	    // InternalAsyncApi.g:1827:10: {...}? => (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1827:19: (otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )? )
            	    // InternalAsyncApi.g:1827:20: otherlv_17= '\"parameters\"' otherlv_18= ':' otherlv_19= '{' ( (lv_parameters_20_0= ruleNamedParameter ) ) (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )* otherlv_23= '}' (otherlv_24= ',' )?
            	    {
            	    otherlv_17=(Token)match(input,36,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getChannelAccess().getParametersKeyword_4_3_0());
            	    								
            	    otherlv_18=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_18, grammarAccess.getChannelAccess().getColonKeyword_4_3_1());
            	    								
            	    otherlv_19=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_19, grammarAccess.getChannelAccess().getLeftCurlyBracketKeyword_4_3_2());
            	    								
            	    // InternalAsyncApi.g:1839:9: ( (lv_parameters_20_0= ruleNamedParameter ) )
            	    // InternalAsyncApi.g:1840:10: (lv_parameters_20_0= ruleNamedParameter )
            	    {
            	    // InternalAsyncApi.g:1840:10: (lv_parameters_20_0= ruleNamedParameter )
            	    // InternalAsyncApi.g:1841:11: lv_parameters_20_0= ruleNamedParameter
            	    {

            	    											newCompositeNode(grammarAccess.getChannelAccess().getParametersNamedParameterParserRuleCall_4_3_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_parameters_20_0=ruleNamedParameter();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getChannelRule());
            	    											}
            	    											add(
            	    												current,
            	    												"parameters",
            	    												lv_parameters_20_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedParameter");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1858:9: (otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) ) )*
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==11) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:1859:10: otherlv_21= ',' ( (lv_parameters_22_0= ruleNamedParameter ) )
            	    	    {
            	    	    otherlv_21=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_21, grammarAccess.getChannelAccess().getCommaKeyword_4_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:1863:10: ( (lv_parameters_22_0= ruleNamedParameter ) )
            	    	    // InternalAsyncApi.g:1864:11: (lv_parameters_22_0= ruleNamedParameter )
            	    	    {
            	    	    // InternalAsyncApi.g:1864:11: (lv_parameters_22_0= ruleNamedParameter )
            	    	    // InternalAsyncApi.g:1865:12: lv_parameters_22_0= ruleNamedParameter
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getChannelAccess().getParametersNamedParameterParserRuleCall_4_3_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_parameters_22_0=ruleNamedParameter();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getChannelRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"parameters",
            	    	    													lv_parameters_22_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedParameter");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop39;
            	        }
            	    } while (true);

            	    otherlv_23=(Token)match(input,14,FOLLOW_27); 

            	    									newLeafNode(otherlv_23, grammarAccess.getChannelAccess().getRightCurlyBracketKeyword_4_3_5());
            	    								
            	    // InternalAsyncApi.g:1887:9: (otherlv_24= ',' )?
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==11) ) {
            	        alt40=1;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // InternalAsyncApi.g:1888:10: otherlv_24= ','
            	            {
            	            otherlv_24=(Token)match(input,11,FOLLOW_26); 

            	            										newLeafNode(otherlv_24, grammarAccess.getChannelAccess().getCommaKeyword_4_3_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:1899:4: ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1899:4: ({...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1900:5: {...}? => ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "getUnorderedGroupHelper().canSelect(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalAsyncApi.g:1900:104: ( ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) ) )
            	    // InternalAsyncApi.g:1901:6: ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getChannelAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalAsyncApi.g:1904:9: ({...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? ) )
            	    // InternalAsyncApi.g:1904:10: {...}? => (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleChannel", "true");
            	    }
            	    // InternalAsyncApi.g:1904:19: (otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )? )
            	    // InternalAsyncApi.g:1904:20: otherlv_25= '\"x-title\"' otherlv_26= ':' ( (lv_title_27_0= ruleAnyString ) ) (otherlv_28= ',' )?
            	    {
            	    otherlv_25=(Token)match(input,37,FOLLOW_4); 

            	    									newLeafNode(otherlv_25, grammarAccess.getChannelAccess().getXTitleKeyword_4_4_0());
            	    								
            	    otherlv_26=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_26, grammarAccess.getChannelAccess().getColonKeyword_4_4_1());
            	    								
            	    // InternalAsyncApi.g:1912:9: ( (lv_title_27_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:1913:10: (lv_title_27_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:1913:10: (lv_title_27_0= ruleAnyString )
            	    // InternalAsyncApi.g:1914:11: lv_title_27_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getChannelAccess().getTitleAnyStringParserRuleCall_4_4_2_0());
            	    										
            	    pushFollow(FOLLOW_27);
            	    lv_title_27_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getChannelRule());
            	    											}
            	    											set(
            	    												current,
            	    												"title",
            	    												lv_title_27_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:1931:9: (otherlv_28= ',' )?
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==11) ) {
            	        alt41=1;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalAsyncApi.g:1932:10: otherlv_28= ','
            	            {
            	            otherlv_28=(Token)match(input,11,FOLLOW_26); 

            	            										newLeafNode(otherlv_28, grammarAccess.getChannelAccess().getCommaKeyword_4_4_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getChannelAccess().getUnorderedGroup_4());
            				

            }

            otherlv_29=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getChannelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleOperation"
    // InternalAsyncApi.g:1958:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalAsyncApi.g:1958:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalAsyncApi.g:1959:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalAsyncApi.g:1965:1: ruleOperation returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_operationId_5_0 = null;

        AntlrDatatypeRuleToken lv_summary_9_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;

        EObject lv_message_17_0 = null;

        EObject lv_traits_22_0 = null;

        EObject lv_traits_24_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:1971:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' ) )
            // InternalAsyncApi.g:1972:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' )
            {
            // InternalAsyncApi.g:1972:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' )
            // InternalAsyncApi.g:1973:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}'
            {
            // InternalAsyncApi.g:1973:3: ()
            // InternalAsyncApi.g:1974:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationAccess().getOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:1984:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:1985:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:1985:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:1986:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:1989:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:1990:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:1990:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )*
            loop49:
            do {
                int alt49=6;
                int LA49_0 = input.LA(1);

                if ( LA49_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 0) ) {
                    alt49=1;
                }
                else if ( LA49_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 1) ) {
                    alt49=2;
                }
                else if ( LA49_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 2) ) {
                    alt49=3;
                }
                else if ( LA49_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 3) ) {
                    alt49=4;
                }
                else if ( LA49_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 4) ) {
                    alt49=5;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAsyncApi.g:1991:4: ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:1991:4: ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:1992:5: {...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:1992:106: ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:1993:6: ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:1996:9: ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:1996:10: {...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:1996:19: (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:1996:20: otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,38,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getOperationIdKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:2004:9: ( (lv_operationId_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2005:10: (lv_operationId_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2005:10: (lv_operationId_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:2006:11: lv_operationId_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getOperationIdAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_29);
            	    lv_operationId_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"operationId",
            	    												lv_operationId_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2023:9: (otherlv_6= ',' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0==11) ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // InternalAsyncApi.g:2024:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_28); 

            	            										newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:2035:4: ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2035:4: ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2036:5: {...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:2036:106: ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:2037:6: ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:2040:9: ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:2040:10: {...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:2040:19: (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:2040:20: otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,39,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getSummaryKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:2048:9: ( (lv_summary_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2049:10: (lv_summary_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2049:10: (lv_summary_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:2050:11: lv_summary_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getSummaryAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_29);
            	    lv_summary_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"summary",
            	    												lv_summary_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2067:9: (otherlv_10= ',' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==11) ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalAsyncApi.g:2068:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_28); 

            	            										newLeafNode(otherlv_10, grammarAccess.getOperationAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:2079:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2079:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2080:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:2080:106: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:2081:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:2084:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:2084:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:2084:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:2084:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getOperationAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getOperationAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:2092:9: ( (lv_description_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2093:10: (lv_description_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2093:10: (lv_description_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:2094:11: lv_description_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getDescriptionAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_29);
            	    lv_description_13_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2111:9: (otherlv_14= ',' )?
            	    int alt45=2;
            	    int LA45_0 = input.LA(1);

            	    if ( (LA45_0==11) ) {
            	        alt45=1;
            	    }
            	    switch (alt45) {
            	        case 1 :
            	            // InternalAsyncApi.g:2112:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_28); 

            	            										newLeafNode(otherlv_14, grammarAccess.getOperationAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:2123:4: ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2123:4: ({...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2124:5: {...}? => ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:2124:106: ( ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:2125:6: ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:2128:9: ({...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:2128:10: {...}? => (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:2128:19: (otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:2128:20: otherlv_15= '\"message\"' otherlv_16= ':' ( (lv_message_17_0= ruleAbstractMessage ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,40,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getOperationAccess().getMessageKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_16, grammarAccess.getOperationAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:2136:9: ( (lv_message_17_0= ruleAbstractMessage ) )
            	    // InternalAsyncApi.g:2137:10: (lv_message_17_0= ruleAbstractMessage )
            	    {
            	    // InternalAsyncApi.g:2137:10: (lv_message_17_0= ruleAbstractMessage )
            	    // InternalAsyncApi.g:2138:11: lv_message_17_0= ruleAbstractMessage
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getMessageAbstractMessageParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_29);
            	    lv_message_17_0=ruleAbstractMessage();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"message",
            	    												lv_message_17_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractMessage");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2155:9: (otherlv_18= ',' )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==11) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalAsyncApi.g:2156:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_28); 

            	            										newLeafNode(otherlv_18, grammarAccess.getOperationAccess().getCommaKeyword_2_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:2167:4: ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2167:4: ({...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2168:5: {...}? => ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:2168:106: ( ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:2169:6: ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:2172:9: ({...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:2172:10: {...}? => (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // InternalAsyncApi.g:2172:19: (otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:2172:20: otherlv_19= '\"traits\"' otherlv_20= ':' otherlv_21= '[' ( (lv_traits_22_0= ruleAbstractOperationTrait ) ) (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )* otherlv_25= ']' (otherlv_26= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,41,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getOperationAccess().getTraitsKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_20, grammarAccess.getOperationAccess().getColonKeyword_2_4_1());
            	    								
            	    otherlv_21=(Token)match(input,32,FOLLOW_8); 

            	    									newLeafNode(otherlv_21, grammarAccess.getOperationAccess().getLeftSquareBracketKeyword_2_4_2());
            	    								
            	    // InternalAsyncApi.g:2184:9: ( (lv_traits_22_0= ruleAbstractOperationTrait ) )
            	    // InternalAsyncApi.g:2185:10: (lv_traits_22_0= ruleAbstractOperationTrait )
            	    {
            	    // InternalAsyncApi.g:2185:10: (lv_traits_22_0= ruleAbstractOperationTrait )
            	    // InternalAsyncApi.g:2186:11: lv_traits_22_0= ruleAbstractOperationTrait
            	    {

            	    											newCompositeNode(grammarAccess.getOperationAccess().getTraitsAbstractOperationTraitParserRuleCall_2_4_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_traits_22_0=ruleAbstractOperationTrait();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationRule());
            	    											}
            	    											add(
            	    												current,
            	    												"traits",
            	    												lv_traits_22_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractOperationTrait");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2203:9: (otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) ) )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==11) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2204:10: otherlv_23= ',' ( (lv_traits_24_0= ruleAbstractOperationTrait ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,11,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getOperationAccess().getCommaKeyword_2_4_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2208:10: ( (lv_traits_24_0= ruleAbstractOperationTrait ) )
            	    	    // InternalAsyncApi.g:2209:11: (lv_traits_24_0= ruleAbstractOperationTrait )
            	    	    {
            	    	    // InternalAsyncApi.g:2209:11: (lv_traits_24_0= ruleAbstractOperationTrait )
            	    	    // InternalAsyncApi.g:2210:12: lv_traits_24_0= ruleAbstractOperationTrait
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getOperationAccess().getTraitsAbstractOperationTraitParserRuleCall_2_4_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
            	    	    lv_traits_24_0=ruleAbstractOperationTrait();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getOperationRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"traits",
            	    	    													lv_traits_24_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AbstractOperationTrait");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,33,FOLLOW_29); 

            	    									newLeafNode(otherlv_25, grammarAccess.getOperationAccess().getRightSquareBracketKeyword_2_4_5());
            	    								
            	    // InternalAsyncApi.g:2232:9: (otherlv_26= ',' )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==11) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalAsyncApi.g:2233:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_28); 

            	            										newLeafNode(otherlv_26, grammarAccess.getOperationAccess().getCommaKeyword_2_4_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOperationAccess().getUnorderedGroup_2());
            				

            }

            otherlv_27=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleAbstractMessage"
    // InternalAsyncApi.g:2259:1: entryRuleAbstractMessage returns [EObject current=null] : iv_ruleAbstractMessage= ruleAbstractMessage EOF ;
    public final EObject entryRuleAbstractMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMessage = null;


        try {
            // InternalAsyncApi.g:2259:56: (iv_ruleAbstractMessage= ruleAbstractMessage EOF )
            // InternalAsyncApi.g:2260:2: iv_ruleAbstractMessage= ruleAbstractMessage EOF
            {
             newCompositeNode(grammarAccess.getAbstractMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractMessage=ruleAbstractMessage();

            state._fsp--;

             current =iv_ruleAbstractMessage; 
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
    // $ANTLR end "entryRuleAbstractMessage"


    // $ANTLR start "ruleAbstractMessage"
    // InternalAsyncApi.g:2266:1: ruleAbstractMessage returns [EObject current=null] : (this_Reference_0= ruleReference | this_Message_1= ruleMessage ) ;
    public final EObject ruleAbstractMessage() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Message_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2272:2: ( (this_Reference_0= ruleReference | this_Message_1= ruleMessage ) )
            // InternalAsyncApi.g:2273:2: (this_Reference_0= ruleReference | this_Message_1= ruleMessage )
            {
            // InternalAsyncApi.g:2273:2: (this_Reference_0= ruleReference | this_Message_1= ruleMessage )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==8) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==78) ) {
                    alt50=1;
                }
                else if ( (LA50_1==14||LA50_1==18||LA50_1==20||LA50_1==25||LA50_1==39||(LA50_1>=41 && LA50_1<=45)) ) {
                    alt50=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalAsyncApi.g:2274:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractMessageAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:2283:3: this_Message_1= ruleMessage
                    {

                    			newCompositeNode(grammarAccess.getAbstractMessageAccess().getMessageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Message_1=ruleMessage();

                    state._fsp--;


                    			current = this_Message_1;
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
    // $ANTLR end "ruleAbstractMessage"


    // $ANTLR start "entryRuleMessage"
    // InternalAsyncApi.g:2295:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalAsyncApi.g:2295:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalAsyncApi.g:2296:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalAsyncApi.g:2302:1: ruleMessage returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_title_9_0 = null;

        AntlrDatatypeRuleToken lv_summary_13_0 = null;

        AntlrDatatypeRuleToken lv_description_17_0 = null;

        Enumerator lv_deprecated_21_0 = null;

        EObject lv_headers_25_0 = null;

        EObject lv_tags_30_0 = null;

        EObject lv_tags_32_0 = null;

        EObject lv_payload_37_0 = null;

        EObject lv_traits_42_0 = null;

        EObject lv_traits_44_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2308:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}' ) )
            // InternalAsyncApi.g:2309:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}' )
            {
            // InternalAsyncApi.g:2309:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}' )
            // InternalAsyncApi.g:2310:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) ) otherlv_47= '}'
            {
            // InternalAsyncApi.g:2310:3: ()
            // InternalAsyncApi.g:2311:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageAccess().getMessageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:2321:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:2322:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:2322:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:2323:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:2326:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:2327:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:2327:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )*
            loop62:
            do {
                int alt62=10;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // InternalAsyncApi.g:2328:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2328:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2329:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:2329:104: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:2330:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:2333:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:2333:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2333:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:2333:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMessageAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:2341:9: ( (lv_name_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2342:10: (lv_name_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2342:10: (lv_name_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:2343:11: lv_name_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getNameAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_name_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2360:9: (otherlv_6= ',' )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==11) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalAsyncApi.g:2361:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_30); 

            	            										newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:2372:4: ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2372:4: ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2373:5: {...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:2373:104: ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:2374:6: ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:2377:9: ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:2377:10: {...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2377:19: (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:2377:20: otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMessageAccess().getTitleKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:2385:9: ( (lv_title_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2386:10: (lv_title_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2386:10: (lv_title_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:2387:11: lv_title_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getTitleAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_title_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"title",
            	    												lv_title_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2404:9: (otherlv_10= ',' )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==11) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // InternalAsyncApi.g:2405:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_30); 

            	            										newLeafNode(otherlv_10, grammarAccess.getMessageAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:2416:4: ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2416:4: ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2417:5: {...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:2417:104: ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:2418:6: ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:2421:9: ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:2421:10: {...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2421:19: (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:2421:20: otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,39,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMessageAccess().getSummaryKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:2429:9: ( (lv_summary_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2430:10: (lv_summary_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2430:10: (lv_summary_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:2431:11: lv_summary_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getSummaryAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_summary_13_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"summary",
            	    												lv_summary_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2448:9: (otherlv_14= ',' )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==11) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalAsyncApi.g:2449:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_30); 

            	            										newLeafNode(otherlv_14, grammarAccess.getMessageAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:2460:4: ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2460:4: ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2461:5: {...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:2461:104: ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:2462:6: ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:2465:9: ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:2465:10: {...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2465:19: (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:2465:20: otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMessageAccess().getDescriptionKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_16, grammarAccess.getMessageAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:2473:9: ( (lv_description_17_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2474:10: (lv_description_17_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2474:10: (lv_description_17_0= ruleAnyString )
            	    // InternalAsyncApi.g:2475:11: lv_description_17_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getDescriptionAnyStringParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_description_17_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_17_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2492:9: (otherlv_18= ',' )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==11) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // InternalAsyncApi.g:2493:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_30); 

            	            										newLeafNode(otherlv_18, grammarAccess.getMessageAccess().getCommaKeyword_2_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:2504:4: ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2504:4: ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2505:5: {...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:2505:104: ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:2506:6: ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:2509:9: ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:2509:10: {...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2509:19: (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:2509:20: otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,42,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getMessageAccess().getDeprecatedKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_32); 

            	    									newLeafNode(otherlv_20, grammarAccess.getMessageAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:2517:9: ( (lv_deprecated_21_0= ruleBoolean ) )
            	    // InternalAsyncApi.g:2518:10: (lv_deprecated_21_0= ruleBoolean )
            	    {
            	    // InternalAsyncApi.g:2518:10: (lv_deprecated_21_0= ruleBoolean )
            	    // InternalAsyncApi.g:2519:11: lv_deprecated_21_0= ruleBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getDeprecatedBooleanEnumRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_deprecated_21_0=ruleBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"deprecated",
            	    												lv_deprecated_21_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Boolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2536:9: (otherlv_22= ',' )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==11) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalAsyncApi.g:2537:10: otherlv_22= ','
            	            {
            	            otherlv_22=(Token)match(input,11,FOLLOW_30); 

            	            										newLeafNode(otherlv_22, grammarAccess.getMessageAccess().getCommaKeyword_2_4_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAsyncApi.g:2548:4: ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2548:4: ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2549:5: {...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:2549:104: ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:2550:6: ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:2553:9: ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:2553:10: {...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2553:19: (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:2553:20: otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )?
            	    {
            	    otherlv_23=(Token)match(input,43,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getMessageAccess().getHeadersKeyword_2_5_0());
            	    								
            	    otherlv_24=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_24, grammarAccess.getMessageAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:2561:9: ( (lv_headers_25_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2562:10: (lv_headers_25_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2562:10: (lv_headers_25_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2563:11: lv_headers_25_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getHeadersAbstractSchemaParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_headers_25_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"headers",
            	    												lv_headers_25_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2580:9: (otherlv_26= ',' )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==11) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // InternalAsyncApi.g:2581:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_30); 

            	            										newLeafNode(otherlv_26, grammarAccess.getMessageAccess().getCommaKeyword_2_5_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalAsyncApi.g:2592:4: ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2592:4: ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2593:5: {...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalAsyncApi.g:2593:104: ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) )
            	    // InternalAsyncApi.g:2594:6: ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalAsyncApi.g:2597:9: ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) )
            	    // InternalAsyncApi.g:2597:10: {...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2597:19: (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? )
            	    // InternalAsyncApi.g:2597:20: otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,44,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getMessageAccess().getTagsKeyword_2_6_0());
            	    								
            	    otherlv_28=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_28, grammarAccess.getMessageAccess().getColonKeyword_2_6_1());
            	    								
            	    otherlv_29=(Token)match(input,32,FOLLOW_8); 

            	    									newLeafNode(otherlv_29, grammarAccess.getMessageAccess().getLeftSquareBracketKeyword_2_6_2());
            	    								
            	    // InternalAsyncApi.g:2609:9: ( (lv_tags_30_0= ruleTag ) )
            	    // InternalAsyncApi.g:2610:10: (lv_tags_30_0= ruleTag )
            	    {
            	    // InternalAsyncApi.g:2610:10: (lv_tags_30_0= ruleTag )
            	    // InternalAsyncApi.g:2611:11: lv_tags_30_0= ruleTag
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getTagsTagParserRuleCall_2_6_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_tags_30_0=ruleTag();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											add(
            	    												current,
            	    												"tags",
            	    												lv_tags_30_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Tag");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2628:9: (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )*
            	    loop57:
            	    do {
            	        int alt57=2;
            	        int LA57_0 = input.LA(1);

            	        if ( (LA57_0==11) ) {
            	            alt57=1;
            	        }


            	        switch (alt57) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2629:10: otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,11,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_31, grammarAccess.getMessageAccess().getCommaKeyword_2_6_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2633:10: ( (lv_tags_32_0= ruleTag ) )
            	    	    // InternalAsyncApi.g:2634:11: (lv_tags_32_0= ruleTag )
            	    	    {
            	    	    // InternalAsyncApi.g:2634:11: (lv_tags_32_0= ruleTag )
            	    	    // InternalAsyncApi.g:2635:12: lv_tags_32_0= ruleTag
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMessageAccess().getTagsTagParserRuleCall_2_6_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
            	    	    lv_tags_32_0=ruleTag();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMessageRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"tags",
            	    	    													lv_tags_32_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.Tag");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop57;
            	        }
            	    } while (true);

            	    otherlv_33=(Token)match(input,33,FOLLOW_31); 

            	    									newLeafNode(otherlv_33, grammarAccess.getMessageAccess().getRightSquareBracketKeyword_2_6_5());
            	    								
            	    // InternalAsyncApi.g:2657:9: (otherlv_34= ',' )?
            	    int alt58=2;
            	    int LA58_0 = input.LA(1);

            	    if ( (LA58_0==11) ) {
            	        alt58=1;
            	    }
            	    switch (alt58) {
            	        case 1 :
            	            // InternalAsyncApi.g:2658:10: otherlv_34= ','
            	            {
            	            otherlv_34=(Token)match(input,11,FOLLOW_30); 

            	            										newLeafNode(otherlv_34, grammarAccess.getMessageAccess().getCommaKeyword_2_6_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAsyncApi.g:2669:4: ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2669:4: ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2670:5: {...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalAsyncApi.g:2670:104: ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) )
            	    // InternalAsyncApi.g:2671:6: ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalAsyncApi.g:2674:9: ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) )
            	    // InternalAsyncApi.g:2674:10: {...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2674:19: (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? )
            	    // InternalAsyncApi.g:2674:20: otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )?
            	    {
            	    otherlv_35=(Token)match(input,45,FOLLOW_4); 

            	    									newLeafNode(otherlv_35, grammarAccess.getMessageAccess().getPayloadKeyword_2_7_0());
            	    								
            	    otherlv_36=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_36, grammarAccess.getMessageAccess().getColonKeyword_2_7_1());
            	    								
            	    // InternalAsyncApi.g:2682:9: ( (lv_payload_37_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:2683:10: (lv_payload_37_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:2683:10: (lv_payload_37_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:2684:11: lv_payload_37_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getPayloadAbstractSchemaParserRuleCall_2_7_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
            	    lv_payload_37_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											set(
            	    												current,
            	    												"payload",
            	    												lv_payload_37_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2701:9: (otherlv_38= ',' )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==11) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // InternalAsyncApi.g:2702:10: otherlv_38= ','
            	            {
            	            otherlv_38=(Token)match(input,11,FOLLOW_30); 

            	            										newLeafNode(otherlv_38, grammarAccess.getMessageAccess().getCommaKeyword_2_7_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalAsyncApi.g:2713:4: ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2713:4: ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2714:5: {...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalAsyncApi.g:2714:104: ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) )
            	    // InternalAsyncApi.g:2715:6: ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalAsyncApi.g:2718:9: ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) )
            	    // InternalAsyncApi.g:2718:10: {...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessage", "true");
            	    }
            	    // InternalAsyncApi.g:2718:19: (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? )
            	    // InternalAsyncApi.g:2718:20: otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )?
            	    {
            	    otherlv_39=(Token)match(input,41,FOLLOW_4); 

            	    									newLeafNode(otherlv_39, grammarAccess.getMessageAccess().getTraitsKeyword_2_8_0());
            	    								
            	    otherlv_40=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_40, grammarAccess.getMessageAccess().getColonKeyword_2_8_1());
            	    								
            	    otherlv_41=(Token)match(input,32,FOLLOW_8); 

            	    									newLeafNode(otherlv_41, grammarAccess.getMessageAccess().getLeftSquareBracketKeyword_2_8_2());
            	    								
            	    // InternalAsyncApi.g:2730:9: ( (lv_traits_42_0= ruleAbstractMessageTrait ) )
            	    // InternalAsyncApi.g:2731:10: (lv_traits_42_0= ruleAbstractMessageTrait )
            	    {
            	    // InternalAsyncApi.g:2731:10: (lv_traits_42_0= ruleAbstractMessageTrait )
            	    // InternalAsyncApi.g:2732:11: lv_traits_42_0= ruleAbstractMessageTrait
            	    {

            	    											newCompositeNode(grammarAccess.getMessageAccess().getTraitsAbstractMessageTraitParserRuleCall_2_8_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_traits_42_0=ruleAbstractMessageTrait();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageRule());
            	    											}
            	    											add(
            	    												current,
            	    												"traits",
            	    												lv_traits_42_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractMessageTrait");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2749:9: (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )*
            	    loop60:
            	    do {
            	        int alt60=2;
            	        int LA60_0 = input.LA(1);

            	        if ( (LA60_0==11) ) {
            	            alt60=1;
            	        }


            	        switch (alt60) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:2750:10: otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) )
            	    	    {
            	    	    otherlv_43=(Token)match(input,11,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_43, grammarAccess.getMessageAccess().getCommaKeyword_2_8_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:2754:10: ( (lv_traits_44_0= ruleAbstractMessageTrait ) )
            	    	    // InternalAsyncApi.g:2755:11: (lv_traits_44_0= ruleAbstractMessageTrait )
            	    	    {
            	    	    // InternalAsyncApi.g:2755:11: (lv_traits_44_0= ruleAbstractMessageTrait )
            	    	    // InternalAsyncApi.g:2756:12: lv_traits_44_0= ruleAbstractMessageTrait
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMessageAccess().getTraitsAbstractMessageTraitParserRuleCall_2_8_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
            	    	    lv_traits_44_0=ruleAbstractMessageTrait();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMessageRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"traits",
            	    	    													lv_traits_44_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AbstractMessageTrait");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop60;
            	        }
            	    } while (true);

            	    otherlv_45=(Token)match(input,33,FOLLOW_31); 

            	    									newLeafNode(otherlv_45, grammarAccess.getMessageAccess().getRightSquareBracketKeyword_2_8_5());
            	    								
            	    // InternalAsyncApi.g:2778:9: (otherlv_46= ',' )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==11) ) {
            	        alt61=1;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // InternalAsyncApi.g:2779:10: otherlv_46= ','
            	            {
            	            otherlv_46=(Token)match(input,11,FOLLOW_30); 

            	            										newLeafNode(otherlv_46, grammarAccess.getMessageAccess().getCommaKeyword_2_8_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMessageAccess().getUnorderedGroup_2());
            				

            }

            otherlv_47=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_47, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleNamedMessage"
    // InternalAsyncApi.g:2805:1: entryRuleNamedMessage returns [EObject current=null] : iv_ruleNamedMessage= ruleNamedMessage EOF ;
    public final EObject entryRuleNamedMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedMessage = null;


        try {
            // InternalAsyncApi.g:2805:53: (iv_ruleNamedMessage= ruleNamedMessage EOF )
            // InternalAsyncApi.g:2806:2: iv_ruleNamedMessage= ruleNamedMessage EOF
            {
             newCompositeNode(grammarAccess.getNamedMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedMessage=ruleNamedMessage();

            state._fsp--;

             current =iv_ruleNamedMessage; 
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
    // $ANTLR end "entryRuleNamedMessage"


    // $ANTLR start "ruleNamedMessage"
    // InternalAsyncApi.g:2812:1: ruleNamedMessage returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) ) ;
    public final EObject ruleNamedMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_message_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2818:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) ) )
            // InternalAsyncApi.g:2819:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) )
            {
            // InternalAsyncApi.g:2819:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) ) )
            // InternalAsyncApi.g:2820:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_message_3_0= ruleAbstractMessage ) )
            {
            // InternalAsyncApi.g:2820:3: ()
            // InternalAsyncApi.g:2821:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedMessageAccess().getNamedMessageAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:2827:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:2828:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:2828:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:2829:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getNamedMessageAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedMessageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedMessageAccess().getColonKeyword_2());
            		
            // InternalAsyncApi.g:2850:3: ( (lv_message_3_0= ruleAbstractMessage ) )
            // InternalAsyncApi.g:2851:4: (lv_message_3_0= ruleAbstractMessage )
            {
            // InternalAsyncApi.g:2851:4: (lv_message_3_0= ruleAbstractMessage )
            // InternalAsyncApi.g:2852:5: lv_message_3_0= ruleAbstractMessage
            {

            					newCompositeNode(grammarAccess.getNamedMessageAccess().getMessageAbstractMessageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_message_3_0=ruleAbstractMessage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedMessageRule());
            					}
            					set(
            						current,
            						"message",
            						lv_message_3_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AbstractMessage");
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
    // $ANTLR end "ruleNamedMessage"


    // $ANTLR start "entryRuleTag"
    // InternalAsyncApi.g:2873:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalAsyncApi.g:2873:44: (iv_ruleTag= ruleTag EOF )
            // InternalAsyncApi.g:2874:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalAsyncApi.g:2880:1: ruleTag returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:2886:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // InternalAsyncApi.g:2887:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // InternalAsyncApi.g:2887:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // InternalAsyncApi.g:2888:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            // InternalAsyncApi.g:2888:3: ()
            // InternalAsyncApi.g:2889:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTagAccess().getTagAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getTagAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:2899:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:2900:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:2900:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:2901:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getTagAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:2904:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:2905:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:2905:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) )*
            loop65:
            do {
                int alt65=3;
                int LA65_0 = input.LA(1);

                if ( LA65_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0) ) {
                    alt65=1;
                }
                else if ( LA65_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1) ) {
                    alt65=2;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalAsyncApi.g:2906:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2906:4: ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2907:5: {...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:2907:100: ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:2908:6: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTagAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:2911:9: ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:2911:10: {...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "true");
            	    }
            	    // InternalAsyncApi.g:2911:19: (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:2911:20: otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getTagAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getTagAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:2919:9: ( (lv_name_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2920:10: (lv_name_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2920:10: (lv_name_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:2921:11: lv_name_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getTagAccess().getNameAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    lv_name_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTagRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2938:9: (otherlv_6= ',' )?
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==11) ) {
            	        alt63=1;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // InternalAsyncApi.g:2939:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_33); 

            	            										newLeafNode(otherlv_6, grammarAccess.getTagAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTagAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:2950:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:2950:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:2951:5: {...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "getUnorderedGroupHelper().canSelect(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:2951:100: ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:2952:6: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getTagAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:2955:9: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:2955:10: {...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTag", "true");
            	    }
            	    // InternalAsyncApi.g:2955:19: (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:2955:20: otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getTagAccess().getDescriptionKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getTagAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:2963:9: ( (lv_description_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:2964:10: (lv_description_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:2964:10: (lv_description_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:2965:11: lv_description_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getTagAccess().getDescriptionAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
            	    lv_description_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getTagRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:2982:9: (otherlv_10= ',' )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==11) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalAsyncApi.g:2983:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_33); 

            	            										newLeafNode(otherlv_10, grammarAccess.getTagAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTagAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getTagAccess().getUnorderedGroup_2());
            				

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTagAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleAbstractSchema"
    // InternalAsyncApi.g:3009:1: entryRuleAbstractSchema returns [EObject current=null] : iv_ruleAbstractSchema= ruleAbstractSchema EOF ;
    public final EObject entryRuleAbstractSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractSchema = null;


        try {
            // InternalAsyncApi.g:3009:55: (iv_ruleAbstractSchema= ruleAbstractSchema EOF )
            // InternalAsyncApi.g:3010:2: iv_ruleAbstractSchema= ruleAbstractSchema EOF
            {
             newCompositeNode(grammarAccess.getAbstractSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractSchema=ruleAbstractSchema();

            state._fsp--;

             current =iv_ruleAbstractSchema; 
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
    // $ANTLR end "entryRuleAbstractSchema"


    // $ANTLR start "ruleAbstractSchema"
    // InternalAsyncApi.g:3016:1: ruleAbstractSchema returns [EObject current=null] : (this_Reference_0= ruleReference | this_Schema_1= ruleSchema ) ;
    public final EObject ruleAbstractSchema() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Schema_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:3022:2: ( (this_Reference_0= ruleReference | this_Schema_1= ruleSchema ) )
            // InternalAsyncApi.g:3023:2: (this_Reference_0= ruleReference | this_Schema_1= ruleSchema )
            {
            // InternalAsyncApi.g:3023:2: (this_Reference_0= ruleReference | this_Schema_1= ruleSchema )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==8) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==78) ) {
                    alt66=1;
                }
                else if ( (LA66_1==14||LA66_1==18||LA66_1==20||(LA66_1>=30 && LA66_1<=31)||(LA66_1>=46 && LA66_1<=54)) ) {
                    alt66=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 66, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalAsyncApi.g:3024:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractSchemaAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:3033:3: this_Schema_1= ruleSchema
                    {

                    			newCompositeNode(grammarAccess.getAbstractSchemaAccess().getSchemaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Schema_1=ruleSchema();

                    state._fsp--;


                    			current = this_Schema_1;
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
    // $ANTLR end "ruleAbstractSchema"


    // $ANTLR start "entryRuleSchema"
    // InternalAsyncApi.g:3045:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalAsyncApi.g:3045:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalAsyncApi.g:3046:2: iv_ruleSchema= ruleSchema EOF
            {
             newCompositeNode(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchema=ruleSchema();

            state._fsp--;

             current =iv_ruleSchema; 
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
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalAsyncApi.g:3052:1: ruleSchema returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) ) ) otherlv_67= '}' ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_minimum_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_maximum_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_minItems_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_maxItems_33_0=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token otherlv_65=null;
        Token otherlv_66=null;
        Token otherlv_67=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        Enumerator lv_type_9_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;

        AntlrDatatypeRuleToken lv_format_17_0 = null;

        AntlrDatatypeRuleToken lv_default_37_0 = null;

        EObject lv_properties_42_0 = null;

        EObject lv_properties_44_0 = null;

        AntlrDatatypeRuleToken lv_enum_50_0 = null;

        AntlrDatatypeRuleToken lv_enum_52_0 = null;

        EObject lv_items_57_0 = null;

        AntlrDatatypeRuleToken lv_required_62_0 = null;

        AntlrDatatypeRuleToken lv_required_64_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:3058:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) ) ) otherlv_67= '}' ) )
            // InternalAsyncApi.g:3059:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) ) ) otherlv_67= '}' )
            {
            // InternalAsyncApi.g:3059:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) ) ) otherlv_67= '}' )
            // InternalAsyncApi.g:3060:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) ) ) otherlv_67= '}'
            {
            // InternalAsyncApi.g:3060:3: ()
            // InternalAsyncApi.g:3061:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSchemaAccess().getSchemaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:3071:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:3072:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:3072:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:3073:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:3076:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:3077:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:3077:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )*
            loop83:
            do {
                int alt83=14;
                alt83 = dfa83.predict(input);
                switch (alt83) {
            	case 1 :
            	    // InternalAsyncApi.g:3078:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3078:4: ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3079:5: {...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:3079:103: ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:3080:6: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:3083:9: ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:3083:10: {...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3083:19: (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:3083:20: otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getSchemaAccess().getTitleKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getSchemaAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:3091:9: ( (lv_title_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3092:10: (lv_title_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3092:10: (lv_title_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:3093:11: lv_title_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getTitleAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_title_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"title",
            	    												lv_title_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3110:9: (otherlv_6= ',' )?
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==11) ) {
            	        alt67=1;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // InternalAsyncApi.g:3111:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_6, grammarAccess.getSchemaAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:3122:4: ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3122:4: ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3123:5: {...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:3123:103: ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:3124:6: ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:3127:9: ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:3127:10: {...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3127:19: (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:3127:20: otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,46,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getSchemaAccess().getTypeKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_37); 

            	    									newLeafNode(otherlv_8, grammarAccess.getSchemaAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:3135:9: ( (lv_type_9_0= ruleJsonType ) )
            	    // InternalAsyncApi.g:3136:10: (lv_type_9_0= ruleJsonType )
            	    {
            	    // InternalAsyncApi.g:3136:10: (lv_type_9_0= ruleJsonType )
            	    // InternalAsyncApi.g:3137:11: lv_type_9_0= ruleJsonType
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getTypeJsonTypeEnumRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_type_9_0=ruleJsonType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.JsonType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3154:9: (otherlv_10= ',' )?
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==11) ) {
            	        alt68=1;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // InternalAsyncApi.g:3155:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_10, grammarAccess.getSchemaAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:3166:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3166:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3167:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:3167:103: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:3168:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:3171:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:3171:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3171:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:3171:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getSchemaAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getSchemaAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:3179:9: ( (lv_description_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3180:10: (lv_description_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3180:10: (lv_description_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:3181:11: lv_description_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getDescriptionAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_description_13_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3198:9: (otherlv_14= ',' )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==11) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // InternalAsyncApi.g:3199:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_14, grammarAccess.getSchemaAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:3210:4: ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3210:4: ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3211:5: {...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:3211:103: ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:3212:6: ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:3215:9: ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:3215:10: {...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3215:19: (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:3215:20: otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,47,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getSchemaAccess().getFormatKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_16, grammarAccess.getSchemaAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:3223:9: ( (lv_format_17_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3224:10: (lv_format_17_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3224:10: (lv_format_17_0= ruleAnyString )
            	    // InternalAsyncApi.g:3225:11: lv_format_17_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getFormatAnyStringParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_format_17_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"format",
            	    												lv_format_17_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3242:9: (otherlv_18= ',' )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==11) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalAsyncApi.g:3243:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_18, grammarAccess.getSchemaAccess().getCommaKeyword_2_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:3254:4: ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3254:4: ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3255:5: {...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:3255:103: ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) )
            	    // InternalAsyncApi.g:3256:6: ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:3259:9: ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) )
            	    // InternalAsyncApi.g:3259:10: {...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3259:19: (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? )
            	    // InternalAsyncApi.g:3259:20: otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,48,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getSchemaAccess().getMinimumKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_38); 

            	    									newLeafNode(otherlv_20, grammarAccess.getSchemaAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalAsyncApi.g:3267:9: ( (lv_minimum_21_0= RULE_INT ) )
            	    // InternalAsyncApi.g:3268:10: (lv_minimum_21_0= RULE_INT )
            	    {
            	    // InternalAsyncApi.g:3268:10: (lv_minimum_21_0= RULE_INT )
            	    // InternalAsyncApi.g:3269:11: lv_minimum_21_0= RULE_INT
            	    {
            	    lv_minimum_21_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            	    											newLeafNode(lv_minimum_21_0, grammarAccess.getSchemaAccess().getMinimumINTTerminalRuleCall_2_4_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"minimum",
            	    												lv_minimum_21_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.INT");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3285:9: (otherlv_22= ',' )?
            	    int alt71=2;
            	    int LA71_0 = input.LA(1);

            	    if ( (LA71_0==11) ) {
            	        alt71=1;
            	    }
            	    switch (alt71) {
            	        case 1 :
            	            // InternalAsyncApi.g:3286:10: otherlv_22= ','
            	            {
            	            otherlv_22=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_22, grammarAccess.getSchemaAccess().getCommaKeyword_2_4_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAsyncApi.g:3297:4: ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3297:4: ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3298:5: {...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:3298:103: ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:3299:6: ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:3302:9: ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:3302:10: {...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3302:19: (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:3302:20: otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )?
            	    {
            	    otherlv_23=(Token)match(input,49,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getSchemaAccess().getMaximumKeyword_2_5_0());
            	    								
            	    otherlv_24=(Token)match(input,10,FOLLOW_38); 

            	    									newLeafNode(otherlv_24, grammarAccess.getSchemaAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalAsyncApi.g:3310:9: ( (lv_maximum_25_0= RULE_INT ) )
            	    // InternalAsyncApi.g:3311:10: (lv_maximum_25_0= RULE_INT )
            	    {
            	    // InternalAsyncApi.g:3311:10: (lv_maximum_25_0= RULE_INT )
            	    // InternalAsyncApi.g:3312:11: lv_maximum_25_0= RULE_INT
            	    {
            	    lv_maximum_25_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            	    											newLeafNode(lv_maximum_25_0, grammarAccess.getSchemaAccess().getMaximumINTTerminalRuleCall_2_5_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"maximum",
            	    												lv_maximum_25_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.INT");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3328:9: (otherlv_26= ',' )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==11) ) {
            	        alt72=1;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // InternalAsyncApi.g:3329:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_26, grammarAccess.getSchemaAccess().getCommaKeyword_2_5_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalAsyncApi.g:3340:4: ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3340:4: ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3341:5: {...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalAsyncApi.g:3341:103: ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) )
            	    // InternalAsyncApi.g:3342:6: ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalAsyncApi.g:3345:9: ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) )
            	    // InternalAsyncApi.g:3345:10: {...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3345:19: (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? )
            	    // InternalAsyncApi.g:3345:20: otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,50,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getSchemaAccess().getMinItemsKeyword_2_6_0());
            	    								
            	    otherlv_28=(Token)match(input,10,FOLLOW_38); 

            	    									newLeafNode(otherlv_28, grammarAccess.getSchemaAccess().getColonKeyword_2_6_1());
            	    								
            	    // InternalAsyncApi.g:3353:9: ( (lv_minItems_29_0= RULE_INT ) )
            	    // InternalAsyncApi.g:3354:10: (lv_minItems_29_0= RULE_INT )
            	    {
            	    // InternalAsyncApi.g:3354:10: (lv_minItems_29_0= RULE_INT )
            	    // InternalAsyncApi.g:3355:11: lv_minItems_29_0= RULE_INT
            	    {
            	    lv_minItems_29_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            	    											newLeafNode(lv_minItems_29_0, grammarAccess.getSchemaAccess().getMinItemsINTTerminalRuleCall_2_6_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"minItems",
            	    												lv_minItems_29_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.INT");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3371:9: (otherlv_30= ',' )?
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==11) ) {
            	        alt73=1;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // InternalAsyncApi.g:3372:10: otherlv_30= ','
            	            {
            	            otherlv_30=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_30, grammarAccess.getSchemaAccess().getCommaKeyword_2_6_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalAsyncApi.g:3383:4: ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3383:4: ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3384:5: {...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalAsyncApi.g:3384:103: ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) )
            	    // InternalAsyncApi.g:3385:6: ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalAsyncApi.g:3388:9: ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) )
            	    // InternalAsyncApi.g:3388:10: {...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3388:19: (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? )
            	    // InternalAsyncApi.g:3388:20: otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )?
            	    {
            	    otherlv_31=(Token)match(input,51,FOLLOW_4); 

            	    									newLeafNode(otherlv_31, grammarAccess.getSchemaAccess().getMaxItemsKeyword_2_7_0());
            	    								
            	    otherlv_32=(Token)match(input,10,FOLLOW_38); 

            	    									newLeafNode(otherlv_32, grammarAccess.getSchemaAccess().getColonKeyword_2_7_1());
            	    								
            	    // InternalAsyncApi.g:3396:9: ( (lv_maxItems_33_0= RULE_INT ) )
            	    // InternalAsyncApi.g:3397:10: (lv_maxItems_33_0= RULE_INT )
            	    {
            	    // InternalAsyncApi.g:3397:10: (lv_maxItems_33_0= RULE_INT )
            	    // InternalAsyncApi.g:3398:11: lv_maxItems_33_0= RULE_INT
            	    {
            	    lv_maxItems_33_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            	    											newLeafNode(lv_maxItems_33_0, grammarAccess.getSchemaAccess().getMaxItemsINTTerminalRuleCall_2_7_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getSchemaRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"maxItems",
            	    												lv_maxItems_33_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.INT");
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3414:9: (otherlv_34= ',' )?
            	    int alt74=2;
            	    int LA74_0 = input.LA(1);

            	    if ( (LA74_0==11) ) {
            	        alt74=1;
            	    }
            	    switch (alt74) {
            	        case 1 :
            	            // InternalAsyncApi.g:3415:10: otherlv_34= ','
            	            {
            	            otherlv_34=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_34, grammarAccess.getSchemaAccess().getCommaKeyword_2_7_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalAsyncApi.g:3426:4: ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3426:4: ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3427:5: {...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalAsyncApi.g:3427:103: ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) )
            	    // InternalAsyncApi.g:3428:6: ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalAsyncApi.g:3431:9: ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) )
            	    // InternalAsyncApi.g:3431:10: {...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3431:19: (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? )
            	    // InternalAsyncApi.g:3431:20: otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )?
            	    {
            	    otherlv_35=(Token)match(input,30,FOLLOW_4); 

            	    									newLeafNode(otherlv_35, grammarAccess.getSchemaAccess().getDefaultKeyword_2_8_0());
            	    								
            	    otherlv_36=(Token)match(input,10,FOLLOW_39); 

            	    									newLeafNode(otherlv_36, grammarAccess.getSchemaAccess().getColonKeyword_2_8_1());
            	    								
            	    // InternalAsyncApi.g:3439:9: ( (lv_default_37_0= rulePrimitiveValue ) )
            	    // InternalAsyncApi.g:3440:10: (lv_default_37_0= rulePrimitiveValue )
            	    {
            	    // InternalAsyncApi.g:3440:10: (lv_default_37_0= rulePrimitiveValue )
            	    // InternalAsyncApi.g:3441:11: lv_default_37_0= rulePrimitiveValue
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getDefaultPrimitiveValueParserRuleCall_2_8_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_default_37_0=rulePrimitiveValue();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"default",
            	    												lv_default_37_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.PrimitiveValue");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3458:9: (otherlv_38= ',' )?
            	    int alt75=2;
            	    int LA75_0 = input.LA(1);

            	    if ( (LA75_0==11) ) {
            	        alt75=1;
            	    }
            	    switch (alt75) {
            	        case 1 :
            	            // InternalAsyncApi.g:3459:10: otherlv_38= ','
            	            {
            	            otherlv_38=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_38, grammarAccess.getSchemaAccess().getCommaKeyword_2_8_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalAsyncApi.g:3470:4: ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3470:4: ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3471:5: {...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // InternalAsyncApi.g:3471:103: ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) )
            	    // InternalAsyncApi.g:3472:6: ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9);
            	    					
            	    // InternalAsyncApi.g:3475:9: ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) )
            	    // InternalAsyncApi.g:3475:10: {...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3475:19: (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? )
            	    // InternalAsyncApi.g:3475:20: otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )?
            	    {
            	    otherlv_39=(Token)match(input,52,FOLLOW_4); 

            	    									newLeafNode(otherlv_39, grammarAccess.getSchemaAccess().getPropertiesKeyword_2_9_0());
            	    								
            	    otherlv_40=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_40, grammarAccess.getSchemaAccess().getColonKeyword_2_9_1());
            	    								
            	    otherlv_41=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_41, grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_2_9_2());
            	    								
            	    // InternalAsyncApi.g:3487:9: ( (lv_properties_42_0= ruleNamedSchema ) )
            	    // InternalAsyncApi.g:3488:10: (lv_properties_42_0= ruleNamedSchema )
            	    {
            	    // InternalAsyncApi.g:3488:10: (lv_properties_42_0= ruleNamedSchema )
            	    // InternalAsyncApi.g:3489:11: lv_properties_42_0= ruleNamedSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getPropertiesNamedSchemaParserRuleCall_2_9_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_properties_42_0=ruleNamedSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"properties",
            	    												lv_properties_42_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3506:9: (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )*
            	    loop76:
            	    do {
            	        int alt76=2;
            	        int LA76_0 = input.LA(1);

            	        if ( (LA76_0==11) ) {
            	            alt76=1;
            	        }


            	        switch (alt76) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:3507:10: otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) )
            	    	    {
            	    	    otherlv_43=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_43, grammarAccess.getSchemaAccess().getCommaKeyword_2_9_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:3511:10: ( (lv_properties_44_0= ruleNamedSchema ) )
            	    	    // InternalAsyncApi.g:3512:11: (lv_properties_44_0= ruleNamedSchema )
            	    	    {
            	    	    // InternalAsyncApi.g:3512:11: (lv_properties_44_0= ruleNamedSchema )
            	    	    // InternalAsyncApi.g:3513:12: lv_properties_44_0= ruleNamedSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getPropertiesNamedSchemaParserRuleCall_2_9_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_properties_44_0=ruleNamedSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"properties",
            	    	    													lv_properties_44_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop76;
            	        }
            	    } while (true);

            	    otherlv_45=(Token)match(input,14,FOLLOW_36); 

            	    									newLeafNode(otherlv_45, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_2_9_5());
            	    								
            	    // InternalAsyncApi.g:3535:9: (otherlv_46= ',' )?
            	    int alt77=2;
            	    int LA77_0 = input.LA(1);

            	    if ( (LA77_0==11) ) {
            	        alt77=1;
            	    }
            	    switch (alt77) {
            	        case 1 :
            	            // InternalAsyncApi.g:3536:10: otherlv_46= ','
            	            {
            	            otherlv_46=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_46, grammarAccess.getSchemaAccess().getCommaKeyword_2_9_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalAsyncApi.g:3547:4: ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3547:4: ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3548:5: {...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // InternalAsyncApi.g:3548:104: ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) )
            	    // InternalAsyncApi.g:3549:6: ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10);
            	    					
            	    // InternalAsyncApi.g:3552:9: ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) )
            	    // InternalAsyncApi.g:3552:10: {...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3552:19: (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? )
            	    // InternalAsyncApi.g:3552:20: otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )?
            	    {
            	    otherlv_47=(Token)match(input,31,FOLLOW_4); 

            	    									newLeafNode(otherlv_47, grammarAccess.getSchemaAccess().getEnumKeyword_2_10_0());
            	    								
            	    otherlv_48=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_48, grammarAccess.getSchemaAccess().getColonKeyword_2_10_1());
            	    								
            	    otherlv_49=(Token)match(input,32,FOLLOW_39); 

            	    									newLeafNode(otherlv_49, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_10_2());
            	    								
            	    // InternalAsyncApi.g:3564:9: ( (lv_enum_50_0= rulePrimitiveValue ) )
            	    // InternalAsyncApi.g:3565:10: (lv_enum_50_0= rulePrimitiveValue )
            	    {
            	    // InternalAsyncApi.g:3565:10: (lv_enum_50_0= rulePrimitiveValue )
            	    // InternalAsyncApi.g:3566:11: lv_enum_50_0= rulePrimitiveValue
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getEnumPrimitiveValueParserRuleCall_2_10_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_enum_50_0=rulePrimitiveValue();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"enum",
            	    												lv_enum_50_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.PrimitiveValue");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3583:9: (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )*
            	    loop78:
            	    do {
            	        int alt78=2;
            	        int LA78_0 = input.LA(1);

            	        if ( (LA78_0==11) ) {
            	            alt78=1;
            	        }


            	        switch (alt78) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:3584:10: otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) )
            	    	    {
            	    	    otherlv_51=(Token)match(input,11,FOLLOW_39); 

            	    	    										newLeafNode(otherlv_51, grammarAccess.getSchemaAccess().getCommaKeyword_2_10_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:3588:10: ( (lv_enum_52_0= rulePrimitiveValue ) )
            	    	    // InternalAsyncApi.g:3589:11: (lv_enum_52_0= rulePrimitiveValue )
            	    	    {
            	    	    // InternalAsyncApi.g:3589:11: (lv_enum_52_0= rulePrimitiveValue )
            	    	    // InternalAsyncApi.g:3590:12: lv_enum_52_0= rulePrimitiveValue
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getEnumPrimitiveValueParserRuleCall_2_10_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
            	    	    lv_enum_52_0=rulePrimitiveValue();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"enum",
            	    	    													lv_enum_52_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.PrimitiveValue");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop78;
            	        }
            	    } while (true);

            	    otherlv_53=(Token)match(input,33,FOLLOW_36); 

            	    									newLeafNode(otherlv_53, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_10_5());
            	    								
            	    // InternalAsyncApi.g:3612:9: (otherlv_54= ',' )?
            	    int alt79=2;
            	    int LA79_0 = input.LA(1);

            	    if ( (LA79_0==11) ) {
            	        alt79=1;
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // InternalAsyncApi.g:3613:10: otherlv_54= ','
            	            {
            	            otherlv_54=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_54, grammarAccess.getSchemaAccess().getCommaKeyword_2_10_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalAsyncApi.g:3624:4: ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3624:4: ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3625:5: {...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // InternalAsyncApi.g:3625:104: ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) )
            	    // InternalAsyncApi.g:3626:6: ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 11);
            	    					
            	    // InternalAsyncApi.g:3629:9: ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) )
            	    // InternalAsyncApi.g:3629:10: {...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3629:19: (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? )
            	    // InternalAsyncApi.g:3629:20: otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )?
            	    {
            	    otherlv_55=(Token)match(input,53,FOLLOW_4); 

            	    									newLeafNode(otherlv_55, grammarAccess.getSchemaAccess().getItemsKeyword_2_11_0());
            	    								
            	    otherlv_56=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_56, grammarAccess.getSchemaAccess().getColonKeyword_2_11_1());
            	    								
            	    // InternalAsyncApi.g:3637:9: ( (lv_items_57_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:3638:10: (lv_items_57_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:3638:10: (lv_items_57_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:3639:11: lv_items_57_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getItemsAbstractSchemaParserRuleCall_2_11_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
            	    lv_items_57_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											set(
            	    												current,
            	    												"items",
            	    												lv_items_57_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3656:9: (otherlv_58= ',' )?
            	    int alt80=2;
            	    int LA80_0 = input.LA(1);

            	    if ( (LA80_0==11) ) {
            	        alt80=1;
            	    }
            	    switch (alt80) {
            	        case 1 :
            	            // InternalAsyncApi.g:3657:10: otherlv_58= ','
            	            {
            	            otherlv_58=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_58, grammarAccess.getSchemaAccess().getCommaKeyword_2_11_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalAsyncApi.g:3668:4: ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3668:4: ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3669:5: {...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // InternalAsyncApi.g:3669:104: ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) )
            	    // InternalAsyncApi.g:3670:6: ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 12);
            	    					
            	    // InternalAsyncApi.g:3673:9: ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) )
            	    // InternalAsyncApi.g:3673:10: {...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSchema", "true");
            	    }
            	    // InternalAsyncApi.g:3673:19: (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? )
            	    // InternalAsyncApi.g:3673:20: otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )?
            	    {
            	    otherlv_59=(Token)match(input,54,FOLLOW_4); 

            	    									newLeafNode(otherlv_59, grammarAccess.getSchemaAccess().getRequiredKeyword_2_12_0());
            	    								
            	    otherlv_60=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_60, grammarAccess.getSchemaAccess().getColonKeyword_2_12_1());
            	    								
            	    otherlv_61=(Token)match(input,32,FOLLOW_9); 

            	    									newLeafNode(otherlv_61, grammarAccess.getSchemaAccess().getLeftSquareBracketKeyword_2_12_2());
            	    								
            	    // InternalAsyncApi.g:3685:9: ( (lv_required_62_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3686:10: (lv_required_62_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3686:10: (lv_required_62_0= ruleAnyString )
            	    // InternalAsyncApi.g:3687:11: lv_required_62_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getSchemaAccess().getRequiredAnyStringParserRuleCall_2_12_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_required_62_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    											}
            	    											add(
            	    												current,
            	    												"required",
            	    												lv_required_62_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3704:9: (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )*
            	    loop81:
            	    do {
            	        int alt81=2;
            	        int LA81_0 = input.LA(1);

            	        if ( (LA81_0==11) ) {
            	            alt81=1;
            	        }


            	        switch (alt81) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:3705:10: otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) )
            	    	    {
            	    	    otherlv_63=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_63, grammarAccess.getSchemaAccess().getCommaKeyword_2_12_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:3709:10: ( (lv_required_64_0= ruleAnyString ) )
            	    	    // InternalAsyncApi.g:3710:11: (lv_required_64_0= ruleAnyString )
            	    	    {
            	    	    // InternalAsyncApi.g:3710:11: (lv_required_64_0= ruleAnyString )
            	    	    // InternalAsyncApi.g:3711:12: lv_required_64_0= ruleAnyString
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getSchemaAccess().getRequiredAnyStringParserRuleCall_2_12_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
            	    	    lv_required_64_0=ruleAnyString();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"required",
            	    	    													lv_required_64_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop81;
            	        }
            	    } while (true);

            	    otherlv_65=(Token)match(input,33,FOLLOW_36); 

            	    									newLeafNode(otherlv_65, grammarAccess.getSchemaAccess().getRightSquareBracketKeyword_2_12_5());
            	    								
            	    // InternalAsyncApi.g:3733:9: (otherlv_66= ',' )?
            	    int alt82=2;
            	    int LA82_0 = input.LA(1);

            	    if ( (LA82_0==11) ) {
            	        alt82=1;
            	    }
            	    switch (alt82) {
            	        case 1 :
            	            // InternalAsyncApi.g:3734:10: otherlv_66= ','
            	            {
            	            otherlv_66=(Token)match(input,11,FOLLOW_35); 

            	            										newLeafNode(otherlv_66, grammarAccess.getSchemaAccess().getCommaKeyword_2_12_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getSchemaAccess().getUnorderedGroup_2());
            				

            }

            otherlv_67=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_67, grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleNamedSchema"
    // InternalAsyncApi.g:3760:1: entryRuleNamedSchema returns [EObject current=null] : iv_ruleNamedSchema= ruleNamedSchema EOF ;
    public final EObject entryRuleNamedSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedSchema = null;


        try {
            // InternalAsyncApi.g:3760:52: (iv_ruleNamedSchema= ruleNamedSchema EOF )
            // InternalAsyncApi.g:3761:2: iv_ruleNamedSchema= ruleNamedSchema EOF
            {
             newCompositeNode(grammarAccess.getNamedSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedSchema=ruleNamedSchema();

            state._fsp--;

             current =iv_ruleNamedSchema; 
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
    // $ANTLR end "entryRuleNamedSchema"


    // $ANTLR start "ruleNamedSchema"
    // InternalAsyncApi.g:3767:1: ruleNamedSchema returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) ) ;
    public final EObject ruleNamedSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_schema_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:3773:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) ) )
            // InternalAsyncApi.g:3774:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) )
            {
            // InternalAsyncApi.g:3774:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) ) )
            // InternalAsyncApi.g:3775:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_schema_3_0= ruleAbstractSchema ) )
            {
            // InternalAsyncApi.g:3775:3: ()
            // InternalAsyncApi.g:3776:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedSchemaAccess().getNamedSchemaAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:3782:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:3783:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:3783:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:3784:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getNamedSchemaAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedSchemaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedSchemaAccess().getColonKeyword_2());
            		
            // InternalAsyncApi.g:3805:3: ( (lv_schema_3_0= ruleAbstractSchema ) )
            // InternalAsyncApi.g:3806:4: (lv_schema_3_0= ruleAbstractSchema )
            {
            // InternalAsyncApi.g:3806:4: (lv_schema_3_0= ruleAbstractSchema )
            // InternalAsyncApi.g:3807:5: lv_schema_3_0= ruleAbstractSchema
            {

            					newCompositeNode(grammarAccess.getNamedSchemaAccess().getSchemaAbstractSchemaParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_schema_3_0=ruleAbstractSchema();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedSchemaRule());
            					}
            					set(
            						current,
            						"schema",
            						lv_schema_3_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
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
    // $ANTLR end "ruleNamedSchema"


    // $ANTLR start "entryRuleAbstractParameter"
    // InternalAsyncApi.g:3828:1: entryRuleAbstractParameter returns [EObject current=null] : iv_ruleAbstractParameter= ruleAbstractParameter EOF ;
    public final EObject entryRuleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractParameter = null;


        try {
            // InternalAsyncApi.g:3828:58: (iv_ruleAbstractParameter= ruleAbstractParameter EOF )
            // InternalAsyncApi.g:3829:2: iv_ruleAbstractParameter= ruleAbstractParameter EOF
            {
             newCompositeNode(grammarAccess.getAbstractParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractParameter=ruleAbstractParameter();

            state._fsp--;

             current =iv_ruleAbstractParameter; 
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
    // $ANTLR end "entryRuleAbstractParameter"


    // $ANTLR start "ruleAbstractParameter"
    // InternalAsyncApi.g:3835:1: ruleAbstractParameter returns [EObject current=null] : (this_Reference_0= ruleReference | this_Parameter_1= ruleParameter ) ;
    public final EObject ruleAbstractParameter() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_Parameter_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:3841:2: ( (this_Reference_0= ruleReference | this_Parameter_1= ruleParameter ) )
            // InternalAsyncApi.g:3842:2: (this_Reference_0= ruleReference | this_Parameter_1= ruleParameter )
            {
            // InternalAsyncApi.g:3842:2: (this_Reference_0= ruleReference | this_Parameter_1= ruleParameter )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==8) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==78) ) {
                    alt84=1;
                }
                else if ( (LA84_1==14||LA84_1==20||(LA84_1>=55 && LA84_1<=56)) ) {
                    alt84=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalAsyncApi.g:3843:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractParameterAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:3852:3: this_Parameter_1= ruleParameter
                    {

                    			newCompositeNode(grammarAccess.getAbstractParameterAccess().getParameterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_1=ruleParameter();

                    state._fsp--;


                    			current = this_Parameter_1;
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
    // $ANTLR end "ruleAbstractParameter"


    // $ANTLR start "entryRuleParameter"
    // InternalAsyncApi.g:3864:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalAsyncApi.g:3864:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalAsyncApi.g:3865:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalAsyncApi.g:3871:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_schema_9_0 = null;

        AntlrDatatypeRuleToken lv_location_13_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:3877:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalAsyncApi.g:3878:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalAsyncApi.g:3878:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // InternalAsyncApi.g:3879:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            // InternalAsyncApi.g:3879:3: ()
            // InternalAsyncApi.g:3880:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:3890:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:3891:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:3891:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:3892:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:3895:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:3896:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:3896:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            loop88:
            do {
                int alt88=4;
                int LA88_0 = input.LA(1);

                if ( LA88_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 0) ) {
                    alt88=1;
                }
                else if ( LA88_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 1) ) {
                    alt88=2;
                }
                else if ( LA88_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 2) ) {
                    alt88=3;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalAsyncApi.g:3897:4: ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3897:4: ({...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3898:5: {...}? => ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:3898:106: ( ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:3899:6: ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:3902:9: ({...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:3902:10: {...}? => (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalAsyncApi.g:3902:19: (otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:3902:20: otherlv_3= '\"description\"' otherlv_4= ':' ( (lv_description_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getDescriptionKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:3910:9: ( (lv_description_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3911:10: (lv_description_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3911:10: (lv_description_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:3912:11: lv_description_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getParameterAccess().getDescriptionAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
            	    lv_description_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getParameterRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3929:9: (otherlv_6= ',' )?
            	    int alt85=2;
            	    int LA85_0 = input.LA(1);

            	    if ( (LA85_0==11) ) {
            	        alt85=1;
            	    }
            	    switch (alt85) {
            	        case 1 :
            	            // InternalAsyncApi.g:3930:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_40); 

            	            										newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:3941:4: ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3941:4: ({...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3942:5: {...}? => ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:3942:106: ( ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:3943:6: ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:3946:9: ({...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:3946:10: {...}? => (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalAsyncApi.g:3946:19: (otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:3946:20: otherlv_7= '\"schema\"' otherlv_8= ':' ( (lv_schema_9_0= ruleAbstractSchema ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,55,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getSchemaKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:3954:9: ( (lv_schema_9_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:3955:10: (lv_schema_9_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:3955:10: (lv_schema_9_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:3956:11: lv_schema_9_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getParameterAccess().getSchemaAbstractSchemaParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
            	    lv_schema_9_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getParameterRule());
            	    											}
            	    											set(
            	    												current,
            	    												"schema",
            	    												lv_schema_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:3973:9: (otherlv_10= ',' )?
            	    int alt86=2;
            	    int LA86_0 = input.LA(1);

            	    if ( (LA86_0==11) ) {
            	        alt86=1;
            	    }
            	    switch (alt86) {
            	        case 1 :
            	            // InternalAsyncApi.g:3974:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_40); 

            	            										newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:3985:4: ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:3985:4: ({...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:3986:5: {...}? => ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:3986:106: ( ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:3987:6: ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:3990:9: ({...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:3990:10: {...}? => (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalAsyncApi.g:3990:19: (otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:3990:20: otherlv_11= '\"location\"' otherlv_12= ':' ( (lv_location_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,56,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getLocationKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getParameterAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:3998:9: ( (lv_location_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:3999:10: (lv_location_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:3999:10: (lv_location_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:4000:11: lv_location_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getParameterAccess().getLocationAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
            	    lv_location_13_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getParameterRule());
            	    											}
            	    											set(
            	    												current,
            	    												"location",
            	    												lv_location_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4017:9: (otherlv_14= ',' )?
            	    int alt87=2;
            	    int LA87_0 = input.LA(1);

            	    if ( (LA87_0==11) ) {
            	        alt87=1;
            	    }
            	    switch (alt87) {
            	        case 1 :
            	            // InternalAsyncApi.g:4018:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_40); 

            	            										newLeafNode(otherlv_14, grammarAccess.getParameterAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getParameterAccess().getUnorderedGroup_2());
            				

            }

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleNamedParameter"
    // InternalAsyncApi.g:4044:1: entryRuleNamedParameter returns [EObject current=null] : iv_ruleNamedParameter= ruleNamedParameter EOF ;
    public final EObject entryRuleNamedParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedParameter = null;


        try {
            // InternalAsyncApi.g:4044:55: (iv_ruleNamedParameter= ruleNamedParameter EOF )
            // InternalAsyncApi.g:4045:2: iv_ruleNamedParameter= ruleNamedParameter EOF
            {
             newCompositeNode(grammarAccess.getNamedParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedParameter=ruleNamedParameter();

            state._fsp--;

             current =iv_ruleNamedParameter; 
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
    // $ANTLR end "entryRuleNamedParameter"


    // $ANTLR start "ruleNamedParameter"
    // InternalAsyncApi.g:4051:1: ruleNamedParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) ) ) ;
    public final EObject ruleNamedParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4057:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) ) ) )
            // InternalAsyncApi.g:4058:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) ) )
            {
            // InternalAsyncApi.g:4058:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) ) )
            // InternalAsyncApi.g:4059:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_parameter_3_0= ruleAbstractParameter ) )
            {
            // InternalAsyncApi.g:4059:3: ()
            // InternalAsyncApi.g:4060:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedParameterAccess().getNamedParameterAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:4066:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:4067:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:4067:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:4068:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getNamedParameterAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedParameterAccess().getColonKeyword_2());
            		
            // InternalAsyncApi.g:4089:3: ( (lv_parameter_3_0= ruleAbstractParameter ) )
            // InternalAsyncApi.g:4090:4: (lv_parameter_3_0= ruleAbstractParameter )
            {
            // InternalAsyncApi.g:4090:4: (lv_parameter_3_0= ruleAbstractParameter )
            // InternalAsyncApi.g:4091:5: lv_parameter_3_0= ruleAbstractParameter
            {

            					newCompositeNode(grammarAccess.getNamedParameterAccess().getParameterAbstractParameterParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_parameter_3_0=ruleAbstractParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedParameterRule());
            					}
            					set(
            						current,
            						"parameter",
            						lv_parameter_3_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AbstractParameter");
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
    // $ANTLR end "ruleNamedParameter"


    // $ANTLR start "entryRuleAbstractOperationTrait"
    // InternalAsyncApi.g:4112:1: entryRuleAbstractOperationTrait returns [EObject current=null] : iv_ruleAbstractOperationTrait= ruleAbstractOperationTrait EOF ;
    public final EObject entryRuleAbstractOperationTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractOperationTrait = null;


        try {
            // InternalAsyncApi.g:4112:63: (iv_ruleAbstractOperationTrait= ruleAbstractOperationTrait EOF )
            // InternalAsyncApi.g:4113:2: iv_ruleAbstractOperationTrait= ruleAbstractOperationTrait EOF
            {
             newCompositeNode(grammarAccess.getAbstractOperationTraitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractOperationTrait=ruleAbstractOperationTrait();

            state._fsp--;

             current =iv_ruleAbstractOperationTrait; 
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
    // $ANTLR end "entryRuleAbstractOperationTrait"


    // $ANTLR start "ruleAbstractOperationTrait"
    // InternalAsyncApi.g:4119:1: ruleAbstractOperationTrait returns [EObject current=null] : (this_Reference_0= ruleReference | this_OperationTrait_1= ruleOperationTrait ) ;
    public final EObject ruleAbstractOperationTrait() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_OperationTrait_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4125:2: ( (this_Reference_0= ruleReference | this_OperationTrait_1= ruleOperationTrait ) )
            // InternalAsyncApi.g:4126:2: (this_Reference_0= ruleReference | this_OperationTrait_1= ruleOperationTrait )
            {
            // InternalAsyncApi.g:4126:2: (this_Reference_0= ruleReference | this_OperationTrait_1= ruleOperationTrait )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==8) ) {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==78) ) {
                    alt89=1;
                }
                else if ( (LA89_1==14||LA89_1==20||(LA89_1>=38 && LA89_1<=39)) ) {
                    alt89=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalAsyncApi.g:4127:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractOperationTraitAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:4136:3: this_OperationTrait_1= ruleOperationTrait
                    {

                    			newCompositeNode(grammarAccess.getAbstractOperationTraitAccess().getOperationTraitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OperationTrait_1=ruleOperationTrait();

                    state._fsp--;


                    			current = this_OperationTrait_1;
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
    // $ANTLR end "ruleAbstractOperationTrait"


    // $ANTLR start "entryRuleOperationTrait"
    // InternalAsyncApi.g:4148:1: entryRuleOperationTrait returns [EObject current=null] : iv_ruleOperationTrait= ruleOperationTrait EOF ;
    public final EObject entryRuleOperationTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationTrait = null;


        try {
            // InternalAsyncApi.g:4148:55: (iv_ruleOperationTrait= ruleOperationTrait EOF )
            // InternalAsyncApi.g:4149:2: iv_ruleOperationTrait= ruleOperationTrait EOF
            {
             newCompositeNode(grammarAccess.getOperationTraitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperationTrait=ruleOperationTrait();

            state._fsp--;

             current =iv_ruleOperationTrait; 
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
    // $ANTLR end "entryRuleOperationTrait"


    // $ANTLR start "ruleOperationTrait"
    // InternalAsyncApi.g:4155:1: ruleOperationTrait returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
    public final EObject ruleOperationTrait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_operationId_5_0 = null;

        AntlrDatatypeRuleToken lv_summary_9_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4161:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // InternalAsyncApi.g:4162:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // InternalAsyncApi.g:4162:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // InternalAsyncApi.g:4163:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            // InternalAsyncApi.g:4163:3: ()
            // InternalAsyncApi.g:4164:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOperationTraitAccess().getOperationTraitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationTraitAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:4174:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:4175:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:4175:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:4176:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:4179:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:4180:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:4180:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) )*
            loop93:
            do {
                int alt93=4;
                int LA93_0 = input.LA(1);

                if ( LA93_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 0) ) {
                    alt93=1;
                }
                else if ( LA93_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 1) ) {
                    alt93=2;
                }
                else if ( LA93_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 2) ) {
                    alt93=3;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalAsyncApi.g:4181:4: ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4181:4: ({...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4182:5: {...}? => ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:4182:111: ( ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:4183:6: ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:4186:9: ({...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:4186:10: {...}? => (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4186:19: (otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:4186:20: otherlv_3= '\"operationId\"' otherlv_4= ':' ( (lv_operationId_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,38,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOperationTraitAccess().getOperationIdKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getOperationTraitAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:4194:9: ( (lv_operationId_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4195:10: (lv_operationId_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4195:10: (lv_operationId_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:4196:11: lv_operationId_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationTraitAccess().getOperationIdAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_operationId_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationTraitRule());
            	    											}
            	    											set(
            	    												current,
            	    												"operationId",
            	    												lv_operationId_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4213:9: (otherlv_6= ',' )?
            	    int alt90=2;
            	    int LA90_0 = input.LA(1);

            	    if ( (LA90_0==11) ) {
            	        alt90=1;
            	    }
            	    switch (alt90) {
            	        case 1 :
            	            // InternalAsyncApi.g:4214:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_42); 

            	            										newLeafNode(otherlv_6, grammarAccess.getOperationTraitAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:4225:4: ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4225:4: ({...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4226:5: {...}? => ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:4226:111: ( ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:4227:6: ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:4230:9: ({...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:4230:10: {...}? => (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4230:19: (otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:4230:20: otherlv_7= '\"summary\"' otherlv_8= ':' ( (lv_summary_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,39,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOperationTraitAccess().getSummaryKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getOperationTraitAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:4238:9: ( (lv_summary_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4239:10: (lv_summary_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4239:10: (lv_summary_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:4240:11: lv_summary_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationTraitAccess().getSummaryAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_summary_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationTraitRule());
            	    											}
            	    											set(
            	    												current,
            	    												"summary",
            	    												lv_summary_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4257:9: (otherlv_10= ',' )?
            	    int alt91=2;
            	    int LA91_0 = input.LA(1);

            	    if ( (LA91_0==11) ) {
            	        alt91=1;
            	    }
            	    switch (alt91) {
            	        case 1 :
            	            // InternalAsyncApi.g:4258:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_42); 

            	            										newLeafNode(otherlv_10, grammarAccess.getOperationTraitAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:4269:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4269:4: ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4270:5: {...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:4270:111: ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:4271:6: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:4274:9: ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:4274:10: {...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOperationTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4274:19: (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:4274:20: otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getOperationTraitAccess().getDescriptionKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_12, grammarAccess.getOperationTraitAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:4282:9: ( (lv_description_13_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4283:10: (lv_description_13_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4283:10: (lv_description_13_0= ruleAnyString )
            	    // InternalAsyncApi.g:4284:11: lv_description_13_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getOperationTraitAccess().getDescriptionAnyStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_description_13_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOperationTraitRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4301:9: (otherlv_14= ',' )?
            	    int alt92=2;
            	    int LA92_0 = input.LA(1);

            	    if ( (LA92_0==11) ) {
            	        alt92=1;
            	    }
            	    switch (alt92) {
            	        case 1 :
            	            // InternalAsyncApi.g:4302:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_42); 

            	            										newLeafNode(otherlv_14, grammarAccess.getOperationTraitAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOperationTraitAccess().getUnorderedGroup_2());
            				

            }

            otherlv_15=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getOperationTraitAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleOperationTrait"


    // $ANTLR start "entryRuleNamedOperationTrait"
    // InternalAsyncApi.g:4328:1: entryRuleNamedOperationTrait returns [EObject current=null] : iv_ruleNamedOperationTrait= ruleNamedOperationTrait EOF ;
    public final EObject entryRuleNamedOperationTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedOperationTrait = null;


        try {
            // InternalAsyncApi.g:4328:60: (iv_ruleNamedOperationTrait= ruleNamedOperationTrait EOF )
            // InternalAsyncApi.g:4329:2: iv_ruleNamedOperationTrait= ruleNamedOperationTrait EOF
            {
             newCompositeNode(grammarAccess.getNamedOperationTraitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedOperationTrait=ruleNamedOperationTrait();

            state._fsp--;

             current =iv_ruleNamedOperationTrait; 
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
    // $ANTLR end "entryRuleNamedOperationTrait"


    // $ANTLR start "ruleNamedOperationTrait"
    // InternalAsyncApi.g:4335:1: ruleNamedOperationTrait returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) ) ) ;
    public final EObject ruleNamedOperationTrait() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operationTrait_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4341:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) ) ) )
            // InternalAsyncApi.g:4342:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) ) )
            {
            // InternalAsyncApi.g:4342:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) ) )
            // InternalAsyncApi.g:4343:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) )
            {
            // InternalAsyncApi.g:4343:3: ()
            // InternalAsyncApi.g:4344:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedOperationTraitAccess().getNamedOperationTraitAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:4350:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:4351:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:4351:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:4352:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getNamedOperationTraitAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedOperationTraitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedOperationTraitAccess().getColonKeyword_2());
            		
            // InternalAsyncApi.g:4373:3: ( (lv_operationTrait_3_0= ruleAbstractOperationTrait ) )
            // InternalAsyncApi.g:4374:4: (lv_operationTrait_3_0= ruleAbstractOperationTrait )
            {
            // InternalAsyncApi.g:4374:4: (lv_operationTrait_3_0= ruleAbstractOperationTrait )
            // InternalAsyncApi.g:4375:5: lv_operationTrait_3_0= ruleAbstractOperationTrait
            {

            					newCompositeNode(grammarAccess.getNamedOperationTraitAccess().getOperationTraitAbstractOperationTraitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_operationTrait_3_0=ruleAbstractOperationTrait();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedOperationTraitRule());
            					}
            					set(
            						current,
            						"operationTrait",
            						lv_operationTrait_3_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AbstractOperationTrait");
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
    // $ANTLR end "ruleNamedOperationTrait"


    // $ANTLR start "entryRuleAbstractMessageTrait"
    // InternalAsyncApi.g:4396:1: entryRuleAbstractMessageTrait returns [EObject current=null] : iv_ruleAbstractMessageTrait= ruleAbstractMessageTrait EOF ;
    public final EObject entryRuleAbstractMessageTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMessageTrait = null;


        try {
            // InternalAsyncApi.g:4396:61: (iv_ruleAbstractMessageTrait= ruleAbstractMessageTrait EOF )
            // InternalAsyncApi.g:4397:2: iv_ruleAbstractMessageTrait= ruleAbstractMessageTrait EOF
            {
             newCompositeNode(grammarAccess.getAbstractMessageTraitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractMessageTrait=ruleAbstractMessageTrait();

            state._fsp--;

             current =iv_ruleAbstractMessageTrait; 
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
    // $ANTLR end "entryRuleAbstractMessageTrait"


    // $ANTLR start "ruleAbstractMessageTrait"
    // InternalAsyncApi.g:4403:1: ruleAbstractMessageTrait returns [EObject current=null] : (this_Reference_0= ruleReference | this_MessageTrait_1= ruleMessageTrait ) ;
    public final EObject ruleAbstractMessageTrait() throws RecognitionException {
        EObject current = null;

        EObject this_Reference_0 = null;

        EObject this_MessageTrait_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4409:2: ( (this_Reference_0= ruleReference | this_MessageTrait_1= ruleMessageTrait ) )
            // InternalAsyncApi.g:4410:2: (this_Reference_0= ruleReference | this_MessageTrait_1= ruleMessageTrait )
            {
            // InternalAsyncApi.g:4410:2: (this_Reference_0= ruleReference | this_MessageTrait_1= ruleMessageTrait )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==8) ) {
                int LA94_1 = input.LA(2);

                if ( (LA94_1==78) ) {
                    alt94=1;
                }
                else if ( (LA94_1==14||LA94_1==20||LA94_1==39||(LA94_1>=42 && LA94_1<=44)) ) {
                    alt94=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalAsyncApi.g:4411:3: this_Reference_0= ruleReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractMessageTraitAccess().getReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reference_0=ruleReference();

                    state._fsp--;


                    			current = this_Reference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:4420:3: this_MessageTrait_1= ruleMessageTrait
                    {

                    			newCompositeNode(grammarAccess.getAbstractMessageTraitAccess().getMessageTraitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MessageTrait_1=ruleMessageTrait();

                    state._fsp--;


                    			current = this_MessageTrait_1;
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
    // $ANTLR end "ruleAbstractMessageTrait"


    // $ANTLR start "entryRuleMessageTrait"
    // InternalAsyncApi.g:4432:1: entryRuleMessageTrait returns [EObject current=null] : iv_ruleMessageTrait= ruleMessageTrait EOF ;
    public final EObject entryRuleMessageTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageTrait = null;


        try {
            // InternalAsyncApi.g:4432:53: (iv_ruleMessageTrait= ruleMessageTrait EOF )
            // InternalAsyncApi.g:4433:2: iv_ruleMessageTrait= ruleMessageTrait EOF
            {
             newCompositeNode(grammarAccess.getMessageTraitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageTrait=ruleMessageTrait();

            state._fsp--;

             current =iv_ruleMessageTrait; 
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
    // $ANTLR end "entryRuleMessageTrait"


    // $ANTLR start "ruleMessageTrait"
    // InternalAsyncApi.g:4439:1: ruleMessageTrait returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' ) ;
    public final EObject ruleMessageTrait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_summary_5_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        Enumerator lv_deprecated_13_0 = null;

        EObject lv_headers_17_0 = null;

        EObject lv_tags_22_0 = null;

        EObject lv_tags_24_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4445:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' ) )
            // InternalAsyncApi.g:4446:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' )
            {
            // InternalAsyncApi.g:4446:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}' )
            // InternalAsyncApi.g:4447:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) ) otherlv_27= '}'
            {
            // InternalAsyncApi.g:4447:3: ()
            // InternalAsyncApi.g:4448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageTraitAccess().getMessageTraitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageTraitAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:4458:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:4459:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:4459:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:4460:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:4463:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:4464:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:4464:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) ) )*
            loop101:
            do {
                int alt101=6;
                int LA101_0 = input.LA(1);

                if ( LA101_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 0) ) {
                    alt101=1;
                }
                else if ( LA101_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 1) ) {
                    alt101=2;
                }
                else if ( LA101_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 2) ) {
                    alt101=3;
                }
                else if ( LA101_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 3) ) {
                    alt101=4;
                }
                else if ( LA101_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 4) ) {
                    alt101=5;
                }


                switch (alt101) {
            	case 1 :
            	    // InternalAsyncApi.g:4465:4: ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4465:4: ({...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4466:5: {...}? => ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:4466:109: ( ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) )
            	    // InternalAsyncApi.g:4467:6: ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:4470:9: ({...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) )
            	    // InternalAsyncApi.g:4470:10: {...}? => (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4470:19: (otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )? )
            	    // InternalAsyncApi.g:4470:20: otherlv_3= '\"summary\"' otherlv_4= ':' ( (lv_summary_5_0= ruleAnyString ) ) (otherlv_6= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,39,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMessageTraitAccess().getSummaryKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMessageTraitAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalAsyncApi.g:4478:9: ( (lv_summary_5_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4479:10: (lv_summary_5_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4479:10: (lv_summary_5_0= ruleAnyString )
            	    // InternalAsyncApi.g:4480:11: lv_summary_5_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getSummaryAnyStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_summary_5_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageTraitRule());
            	    											}
            	    											set(
            	    												current,
            	    												"summary",
            	    												lv_summary_5_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4497:9: (otherlv_6= ',' )?
            	    int alt95=2;
            	    int LA95_0 = input.LA(1);

            	    if ( (LA95_0==11) ) {
            	        alt95=1;
            	    }
            	    switch (alt95) {
            	        case 1 :
            	            // InternalAsyncApi.g:4498:10: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,11,FOLLOW_44); 

            	            										newLeafNode(otherlv_6, grammarAccess.getMessageTraitAccess().getCommaKeyword_2_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:4509:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4509:4: ({...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4510:5: {...}? => ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:4510:109: ( ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:4511:6: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:4514:9: ({...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:4514:10: {...}? => (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4514:19: (otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:4514:20: otherlv_7= '\"description\"' otherlv_8= ':' ( (lv_description_9_0= ruleAnyString ) ) (otherlv_10= ',' )?
            	    {
            	    otherlv_7=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMessageTraitAccess().getDescriptionKeyword_2_1_0());
            	    								
            	    otherlv_8=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getMessageTraitAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalAsyncApi.g:4522:9: ( (lv_description_9_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:4523:10: (lv_description_9_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:4523:10: (lv_description_9_0= ruleAnyString )
            	    // InternalAsyncApi.g:4524:11: lv_description_9_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getDescriptionAnyStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_description_9_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageTraitRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_9_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4541:9: (otherlv_10= ',' )?
            	    int alt96=2;
            	    int LA96_0 = input.LA(1);

            	    if ( (LA96_0==11) ) {
            	        alt96=1;
            	    }
            	    switch (alt96) {
            	        case 1 :
            	            // InternalAsyncApi.g:4542:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_44); 

            	            										newLeafNode(otherlv_10, grammarAccess.getMessageTraitAccess().getCommaKeyword_2_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:4553:4: ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4553:4: ({...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4554:5: {...}? => ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:4554:109: ( ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) ) )
            	    // InternalAsyncApi.g:4555:6: ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:4558:9: ({...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? ) )
            	    // InternalAsyncApi.g:4558:10: {...}? => (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4558:19: (otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )? )
            	    // InternalAsyncApi.g:4558:20: otherlv_11= '\"deprecated\"' otherlv_12= ':' ( (lv_deprecated_13_0= ruleBoolean ) ) (otherlv_14= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,42,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMessageTraitAccess().getDeprecatedKeyword_2_2_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_32); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMessageTraitAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalAsyncApi.g:4566:9: ( (lv_deprecated_13_0= ruleBoolean ) )
            	    // InternalAsyncApi.g:4567:10: (lv_deprecated_13_0= ruleBoolean )
            	    {
            	    // InternalAsyncApi.g:4567:10: (lv_deprecated_13_0= ruleBoolean )
            	    // InternalAsyncApi.g:4568:11: lv_deprecated_13_0= ruleBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getDeprecatedBooleanEnumRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_deprecated_13_0=ruleBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageTraitRule());
            	    											}
            	    											set(
            	    												current,
            	    												"deprecated",
            	    												lv_deprecated_13_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Boolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4585:9: (otherlv_14= ',' )?
            	    int alt97=2;
            	    int LA97_0 = input.LA(1);

            	    if ( (LA97_0==11) ) {
            	        alt97=1;
            	    }
            	    switch (alt97) {
            	        case 1 :
            	            // InternalAsyncApi.g:4586:10: otherlv_14= ','
            	            {
            	            otherlv_14=(Token)match(input,11,FOLLOW_44); 

            	            										newLeafNode(otherlv_14, grammarAccess.getMessageTraitAccess().getCommaKeyword_2_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:4597:4: ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4597:4: ({...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4598:5: {...}? => ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:4598:109: ( ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:4599:6: ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:4602:9: ({...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:4602:10: {...}? => (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4602:19: (otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:4602:20: otherlv_15= '\"headers\"' otherlv_16= ':' ( (lv_headers_17_0= ruleAbstractSchema ) ) (otherlv_18= ',' )?
            	    {
            	    otherlv_15=(Token)match(input,43,FOLLOW_4); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMessageTraitAccess().getHeadersKeyword_2_3_0());
            	    								
            	    otherlv_16=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_16, grammarAccess.getMessageTraitAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalAsyncApi.g:4610:9: ( (lv_headers_17_0= ruleAbstractSchema ) )
            	    // InternalAsyncApi.g:4611:10: (lv_headers_17_0= ruleAbstractSchema )
            	    {
            	    // InternalAsyncApi.g:4611:10: (lv_headers_17_0= ruleAbstractSchema )
            	    // InternalAsyncApi.g:4612:11: lv_headers_17_0= ruleAbstractSchema
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getHeadersAbstractSchemaParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_headers_17_0=ruleAbstractSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageTraitRule());
            	    											}
            	    											set(
            	    												current,
            	    												"headers",
            	    												lv_headers_17_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AbstractSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4629:9: (otherlv_18= ',' )?
            	    int alt98=2;
            	    int LA98_0 = input.LA(1);

            	    if ( (LA98_0==11) ) {
            	        alt98=1;
            	    }
            	    switch (alt98) {
            	        case 1 :
            	            // InternalAsyncApi.g:4630:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_44); 

            	            										newLeafNode(otherlv_18, grammarAccess.getMessageTraitAccess().getCommaKeyword_2_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:4641:4: ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4641:4: ({...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4642:5: {...}? => ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "getUnorderedGroupHelper().canSelect(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:4642:109: ( ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:4643:6: ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:4646:9: ({...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:4646:10: {...}? => (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMessageTrait", "true");
            	    }
            	    // InternalAsyncApi.g:4646:19: (otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:4646:20: otherlv_19= '\"tags\"' otherlv_20= ':' otherlv_21= '[' ( (lv_tags_22_0= ruleTag ) ) (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )* otherlv_25= ']' (otherlv_26= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,44,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getMessageTraitAccess().getTagsKeyword_2_4_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_20, grammarAccess.getMessageTraitAccess().getColonKeyword_2_4_1());
            	    								
            	    otherlv_21=(Token)match(input,32,FOLLOW_8); 

            	    									newLeafNode(otherlv_21, grammarAccess.getMessageTraitAccess().getLeftSquareBracketKeyword_2_4_2());
            	    								
            	    // InternalAsyncApi.g:4658:9: ( (lv_tags_22_0= ruleTag ) )
            	    // InternalAsyncApi.g:4659:10: (lv_tags_22_0= ruleTag )
            	    {
            	    // InternalAsyncApi.g:4659:10: (lv_tags_22_0= ruleTag )
            	    // InternalAsyncApi.g:4660:11: lv_tags_22_0= ruleTag
            	    {

            	    											newCompositeNode(grammarAccess.getMessageTraitAccess().getTagsTagParserRuleCall_2_4_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_tags_22_0=ruleTag();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMessageTraitRule());
            	    											}
            	    											add(
            	    												current,
            	    												"tags",
            	    												lv_tags_22_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.Tag");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4677:9: (otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) ) )*
            	    loop99:
            	    do {
            	        int alt99=2;
            	        int LA99_0 = input.LA(1);

            	        if ( (LA99_0==11) ) {
            	            alt99=1;
            	        }


            	        switch (alt99) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:4678:10: otherlv_23= ',' ( (lv_tags_24_0= ruleTag ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,11,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getMessageTraitAccess().getCommaKeyword_2_4_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:4682:10: ( (lv_tags_24_0= ruleTag ) )
            	    	    // InternalAsyncApi.g:4683:11: (lv_tags_24_0= ruleTag )
            	    	    {
            	    	    // InternalAsyncApi.g:4683:11: (lv_tags_24_0= ruleTag )
            	    	    // InternalAsyncApi.g:4684:12: lv_tags_24_0= ruleTag
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMessageTraitAccess().getTagsTagParserRuleCall_2_4_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
            	    	    lv_tags_24_0=ruleTag();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMessageTraitRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"tags",
            	    	    													lv_tags_24_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.Tag");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop99;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,33,FOLLOW_45); 

            	    									newLeafNode(otherlv_25, grammarAccess.getMessageTraitAccess().getRightSquareBracketKeyword_2_4_5());
            	    								
            	    // InternalAsyncApi.g:4706:9: (otherlv_26= ',' )?
            	    int alt100=2;
            	    int LA100_0 = input.LA(1);

            	    if ( (LA100_0==11) ) {
            	        alt100=1;
            	    }
            	    switch (alt100) {
            	        case 1 :
            	            // InternalAsyncApi.g:4707:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_44); 

            	            										newLeafNode(otherlv_26, grammarAccess.getMessageTraitAccess().getCommaKeyword_2_4_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMessageTraitAccess().getUnorderedGroup_2());
            				

            }

            otherlv_27=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getMessageTraitAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleMessageTrait"


    // $ANTLR start "entryRuleNamedMessageTrait"
    // InternalAsyncApi.g:4733:1: entryRuleNamedMessageTrait returns [EObject current=null] : iv_ruleNamedMessageTrait= ruleNamedMessageTrait EOF ;
    public final EObject entryRuleNamedMessageTrait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedMessageTrait = null;


        try {
            // InternalAsyncApi.g:4733:58: (iv_ruleNamedMessageTrait= ruleNamedMessageTrait EOF )
            // InternalAsyncApi.g:4734:2: iv_ruleNamedMessageTrait= ruleNamedMessageTrait EOF
            {
             newCompositeNode(grammarAccess.getNamedMessageTraitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedMessageTrait=ruleNamedMessageTrait();

            state._fsp--;

             current =iv_ruleNamedMessageTrait; 
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
    // $ANTLR end "entryRuleNamedMessageTrait"


    // $ANTLR start "ruleNamedMessageTrait"
    // InternalAsyncApi.g:4740:1: ruleNamedMessageTrait returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) ) ) ;
    public final EObject ruleNamedMessageTrait() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_messageTrait_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4746:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) ) ) )
            // InternalAsyncApi.g:4747:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) ) )
            {
            // InternalAsyncApi.g:4747:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) ) )
            // InternalAsyncApi.g:4748:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) )
            {
            // InternalAsyncApi.g:4748:3: ()
            // InternalAsyncApi.g:4749:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNamedMessageTraitAccess().getNamedMessageTraitAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:4755:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:4756:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:4756:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:4757:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getNamedMessageTraitAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedMessageTraitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getNamedMessageTraitAccess().getColonKeyword_2());
            		
            // InternalAsyncApi.g:4778:3: ( (lv_messageTrait_3_0= ruleAbstractMessageTrait ) )
            // InternalAsyncApi.g:4779:4: (lv_messageTrait_3_0= ruleAbstractMessageTrait )
            {
            // InternalAsyncApi.g:4779:4: (lv_messageTrait_3_0= ruleAbstractMessageTrait )
            // InternalAsyncApi.g:4780:5: lv_messageTrait_3_0= ruleAbstractMessageTrait
            {

            					newCompositeNode(grammarAccess.getNamedMessageTraitAccess().getMessageTraitAbstractMessageTraitParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_messageTrait_3_0=ruleAbstractMessageTrait();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedMessageTraitRule());
            					}
            					set(
            						current,
            						"messageTrait",
            						lv_messageTrait_3_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AbstractMessageTrait");
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
    // $ANTLR end "ruleNamedMessageTrait"


    // $ANTLR start "entryRuleComponents"
    // InternalAsyncApi.g:4801:1: entryRuleComponents returns [EObject current=null] : iv_ruleComponents= ruleComponents EOF ;
    public final EObject entryRuleComponents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponents = null;


        try {
            // InternalAsyncApi.g:4801:51: (iv_ruleComponents= ruleComponents EOF )
            // InternalAsyncApi.g:4802:2: iv_ruleComponents= ruleComponents EOF
            {
             newCompositeNode(grammarAccess.getComponentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponents=ruleComponents();

            state._fsp--;

             current =iv_ruleComponents; 
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
    // $ANTLR end "entryRuleComponents"


    // $ANTLR start "ruleComponents"
    // InternalAsyncApi.g:4808:1: ruleComponents returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) ) ) )* ) ) ) otherlv_51= '}' ) ;
    public final EObject ruleComponents() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        EObject lv_schemas_6_0 = null;

        EObject lv_schemas_8_0 = null;

        EObject lv_messages_14_0 = null;

        EObject lv_messages_16_0 = null;

        EObject lv_parameters_22_0 = null;

        EObject lv_parameters_24_0 = null;

        EObject lv_operationTraits_30_0 = null;

        EObject lv_operationTraits_32_0 = null;

        EObject lv_messageTraits_38_0 = null;

        EObject lv_messageTraits_40_0 = null;

        EObject lv_qosMetrics_46_0 = null;

        EObject lv_qosMetrics_48_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:4814:2: ( ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) ) ) )* ) ) ) otherlv_51= '}' ) )
            // InternalAsyncApi.g:4815:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) ) ) )* ) ) ) otherlv_51= '}' )
            {
            // InternalAsyncApi.g:4815:2: ( () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) ) ) )* ) ) ) otherlv_51= '}' )
            // InternalAsyncApi.g:4816:3: () otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) ) ) )* ) ) ) otherlv_51= '}'
            {
            // InternalAsyncApi.g:4816:3: ()
            // InternalAsyncApi.g:4817:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentsAccess().getComponentsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:4827:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) ) ) )* ) ) )
            // InternalAsyncApi.g:4828:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) ) ) )* ) )
            {
            // InternalAsyncApi.g:4828:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) ) ) )* ) )
            // InternalAsyncApi.g:4829:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            				
            // InternalAsyncApi.g:4832:5: ( ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) ) ) )* )
            // InternalAsyncApi.g:4833:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) ) ) )*
            {
            // InternalAsyncApi.g:4833:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) ) ) )*
            loop114:
            do {
                int alt114=7;
                int LA114_0 = input.LA(1);

                if ( LA114_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0) ) {
                    alt114=1;
                }
                else if ( LA114_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1) ) {
                    alt114=2;
                }
                else if ( LA114_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 2) ) {
                    alt114=3;
                }
                else if ( LA114_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 3) ) {
                    alt114=4;
                }
                else if ( LA114_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 4) ) {
                    alt114=5;
                }
                else if ( LA114_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 5) ) {
                    alt114=6;
                }


                switch (alt114) {
            	case 1 :
            	    // InternalAsyncApi.g:4834:4: ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4834:4: ({...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4835:5: {...}? => ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAsyncApi.g:4835:107: ( ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) ) )
            	    // InternalAsyncApi.g:4836:6: ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAsyncApi.g:4839:9: ({...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? ) )
            	    // InternalAsyncApi.g:4839:10: {...}? => (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:4839:19: (otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )? )
            	    // InternalAsyncApi.g:4839:20: otherlv_3= '\"schemas\"' otherlv_4= ':' otherlv_5= '{' ( (lv_schemas_6_0= ruleNamedSchema ) ) (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )* otherlv_9= '}' (otherlv_10= ',' )?
            	    {
            	    otherlv_3=(Token)match(input,57,FOLLOW_4); 

            	    									newLeafNode(otherlv_3, grammarAccess.getComponentsAccess().getSchemasKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_4, grammarAccess.getComponentsAccess().getColonKeyword_2_0_1());
            	    								
            	    otherlv_5=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_5, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_0_2());
            	    								
            	    // InternalAsyncApi.g:4851:9: ( (lv_schemas_6_0= ruleNamedSchema ) )
            	    // InternalAsyncApi.g:4852:10: (lv_schemas_6_0= ruleNamedSchema )
            	    {
            	    // InternalAsyncApi.g:4852:10: (lv_schemas_6_0= ruleNamedSchema )
            	    // InternalAsyncApi.g:4853:11: lv_schemas_6_0= ruleNamedSchema
            	    {

            	    											newCompositeNode(grammarAccess.getComponentsAccess().getSchemasNamedSchemaParserRuleCall_2_0_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_schemas_6_0=ruleNamedSchema();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    											}
            	    											add(
            	    												current,
            	    												"schemas",
            	    												lv_schemas_6_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedSchema");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4870:9: (otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) ) )*
            	    loop102:
            	    do {
            	        int alt102=2;
            	        int LA102_0 = input.LA(1);

            	        if ( (LA102_0==11) ) {
            	            alt102=1;
            	        }


            	        switch (alt102) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:4871:10: otherlv_7= ',' ( (lv_schemas_8_0= ruleNamedSchema ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_7, grammarAccess.getComponentsAccess().getCommaKeyword_2_0_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:4875:10: ( (lv_schemas_8_0= ruleNamedSchema ) )
            	    	    // InternalAsyncApi.g:4876:11: (lv_schemas_8_0= ruleNamedSchema )
            	    	    {
            	    	    // InternalAsyncApi.g:4876:11: (lv_schemas_8_0= ruleNamedSchema )
            	    	    // InternalAsyncApi.g:4877:12: lv_schemas_8_0= ruleNamedSchema
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentsAccess().getSchemasNamedSchemaParserRuleCall_2_0_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_schemas_8_0=ruleNamedSchema();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"schemas",
            	    	    													lv_schemas_8_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedSchema");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop102;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,14,FOLLOW_47); 

            	    									newLeafNode(otherlv_9, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_0_5());
            	    								
            	    // InternalAsyncApi.g:4899:9: (otherlv_10= ',' )?
            	    int alt103=2;
            	    int LA103_0 = input.LA(1);

            	    if ( (LA103_0==11) ) {
            	        alt103=1;
            	    }
            	    switch (alt103) {
            	        case 1 :
            	            // InternalAsyncApi.g:4900:10: otherlv_10= ','
            	            {
            	            otherlv_10=(Token)match(input,11,FOLLOW_46); 

            	            										newLeafNode(otherlv_10, grammarAccess.getComponentsAccess().getCommaKeyword_2_0_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:4911:4: ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4911:4: ({...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4912:5: {...}? => ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAsyncApi.g:4912:107: ( ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) ) )
            	    // InternalAsyncApi.g:4913:6: ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAsyncApi.g:4916:9: ({...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? ) )
            	    // InternalAsyncApi.g:4916:10: {...}? => (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:4916:19: (otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )? )
            	    // InternalAsyncApi.g:4916:20: otherlv_11= '\"messages\"' otherlv_12= ':' otherlv_13= '{' ( (lv_messages_14_0= ruleNamedMessage ) ) (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )* otherlv_17= '}' (otherlv_18= ',' )?
            	    {
            	    otherlv_11=(Token)match(input,58,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getComponentsAccess().getMessagesKeyword_2_1_0());
            	    								
            	    otherlv_12=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_12, grammarAccess.getComponentsAccess().getColonKeyword_2_1_1());
            	    								
            	    otherlv_13=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_13, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_1_2());
            	    								
            	    // InternalAsyncApi.g:4928:9: ( (lv_messages_14_0= ruleNamedMessage ) )
            	    // InternalAsyncApi.g:4929:10: (lv_messages_14_0= ruleNamedMessage )
            	    {
            	    // InternalAsyncApi.g:4929:10: (lv_messages_14_0= ruleNamedMessage )
            	    // InternalAsyncApi.g:4930:11: lv_messages_14_0= ruleNamedMessage
            	    {

            	    											newCompositeNode(grammarAccess.getComponentsAccess().getMessagesNamedMessageParserRuleCall_2_1_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_messages_14_0=ruleNamedMessage();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    											}
            	    											add(
            	    												current,
            	    												"messages",
            	    												lv_messages_14_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedMessage");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:4947:9: (otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) ) )*
            	    loop104:
            	    do {
            	        int alt104=2;
            	        int LA104_0 = input.LA(1);

            	        if ( (LA104_0==11) ) {
            	            alt104=1;
            	        }


            	        switch (alt104) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:4948:10: otherlv_15= ',' ( (lv_messages_16_0= ruleNamedMessage ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_15, grammarAccess.getComponentsAccess().getCommaKeyword_2_1_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:4952:10: ( (lv_messages_16_0= ruleNamedMessage ) )
            	    	    // InternalAsyncApi.g:4953:11: (lv_messages_16_0= ruleNamedMessage )
            	    	    {
            	    	    // InternalAsyncApi.g:4953:11: (lv_messages_16_0= ruleNamedMessage )
            	    	    // InternalAsyncApi.g:4954:12: lv_messages_16_0= ruleNamedMessage
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentsAccess().getMessagesNamedMessageParserRuleCall_2_1_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_messages_16_0=ruleNamedMessage();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"messages",
            	    	    													lv_messages_16_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedMessage");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop104;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,14,FOLLOW_47); 

            	    									newLeafNode(otherlv_17, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_1_5());
            	    								
            	    // InternalAsyncApi.g:4976:9: (otherlv_18= ',' )?
            	    int alt105=2;
            	    int LA105_0 = input.LA(1);

            	    if ( (LA105_0==11) ) {
            	        alt105=1;
            	    }
            	    switch (alt105) {
            	        case 1 :
            	            // InternalAsyncApi.g:4977:10: otherlv_18= ','
            	            {
            	            otherlv_18=(Token)match(input,11,FOLLOW_46); 

            	            										newLeafNode(otherlv_18, grammarAccess.getComponentsAccess().getCommaKeyword_2_1_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:4988:4: ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:4988:4: ({...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:4989:5: {...}? => ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAsyncApi.g:4989:107: ( ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) ) )
            	    // InternalAsyncApi.g:4990:6: ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAsyncApi.g:4993:9: ({...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? ) )
            	    // InternalAsyncApi.g:4993:10: {...}? => (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:4993:19: (otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )? )
            	    // InternalAsyncApi.g:4993:20: otherlv_19= '\"parameters\"' otherlv_20= ':' otherlv_21= '{' ( (lv_parameters_22_0= ruleNamedParameter ) ) (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )* otherlv_25= '}' (otherlv_26= ',' )?
            	    {
            	    otherlv_19=(Token)match(input,36,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getComponentsAccess().getParametersKeyword_2_2_0());
            	    								
            	    otherlv_20=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_20, grammarAccess.getComponentsAccess().getColonKeyword_2_2_1());
            	    								
            	    otherlv_21=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_21, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_2_2());
            	    								
            	    // InternalAsyncApi.g:5005:9: ( (lv_parameters_22_0= ruleNamedParameter ) )
            	    // InternalAsyncApi.g:5006:10: (lv_parameters_22_0= ruleNamedParameter )
            	    {
            	    // InternalAsyncApi.g:5006:10: (lv_parameters_22_0= ruleNamedParameter )
            	    // InternalAsyncApi.g:5007:11: lv_parameters_22_0= ruleNamedParameter
            	    {

            	    											newCompositeNode(grammarAccess.getComponentsAccess().getParametersNamedParameterParserRuleCall_2_2_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_parameters_22_0=ruleNamedParameter();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    											}
            	    											add(
            	    												current,
            	    												"parameters",
            	    												lv_parameters_22_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedParameter");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:5024:9: (otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) ) )*
            	    loop106:
            	    do {
            	        int alt106=2;
            	        int LA106_0 = input.LA(1);

            	        if ( (LA106_0==11) ) {
            	            alt106=1;
            	        }


            	        switch (alt106) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:5025:10: otherlv_23= ',' ( (lv_parameters_24_0= ruleNamedParameter ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_23, grammarAccess.getComponentsAccess().getCommaKeyword_2_2_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:5029:10: ( (lv_parameters_24_0= ruleNamedParameter ) )
            	    	    // InternalAsyncApi.g:5030:11: (lv_parameters_24_0= ruleNamedParameter )
            	    	    {
            	    	    // InternalAsyncApi.g:5030:11: (lv_parameters_24_0= ruleNamedParameter )
            	    	    // InternalAsyncApi.g:5031:12: lv_parameters_24_0= ruleNamedParameter
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentsAccess().getParametersNamedParameterParserRuleCall_2_2_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_parameters_24_0=ruleNamedParameter();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"parameters",
            	    	    													lv_parameters_24_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedParameter");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop106;
            	        }
            	    } while (true);

            	    otherlv_25=(Token)match(input,14,FOLLOW_47); 

            	    									newLeafNode(otherlv_25, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_2_5());
            	    								
            	    // InternalAsyncApi.g:5053:9: (otherlv_26= ',' )?
            	    int alt107=2;
            	    int LA107_0 = input.LA(1);

            	    if ( (LA107_0==11) ) {
            	        alt107=1;
            	    }
            	    switch (alt107) {
            	        case 1 :
            	            // InternalAsyncApi.g:5054:10: otherlv_26= ','
            	            {
            	            otherlv_26=(Token)match(input,11,FOLLOW_46); 

            	            										newLeafNode(otherlv_26, grammarAccess.getComponentsAccess().getCommaKeyword_2_2_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:5065:4: ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:5065:4: ({...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:5066:5: {...}? => ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAsyncApi.g:5066:107: ( ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) ) )
            	    // InternalAsyncApi.g:5067:6: ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAsyncApi.g:5070:9: ({...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? ) )
            	    // InternalAsyncApi.g:5070:10: {...}? => (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:5070:19: (otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )? )
            	    // InternalAsyncApi.g:5070:20: otherlv_27= '\"operationTraits\"' otherlv_28= ':' otherlv_29= '{' ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) ) (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )* otherlv_33= '}' (otherlv_34= ',' )?
            	    {
            	    otherlv_27=(Token)match(input,59,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getComponentsAccess().getOperationTraitsKeyword_2_3_0());
            	    								
            	    otherlv_28=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_28, grammarAccess.getComponentsAccess().getColonKeyword_2_3_1());
            	    								
            	    otherlv_29=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_29, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_3_2());
            	    								
            	    // InternalAsyncApi.g:5082:9: ( (lv_operationTraits_30_0= ruleNamedOperationTrait ) )
            	    // InternalAsyncApi.g:5083:10: (lv_operationTraits_30_0= ruleNamedOperationTrait )
            	    {
            	    // InternalAsyncApi.g:5083:10: (lv_operationTraits_30_0= ruleNamedOperationTrait )
            	    // InternalAsyncApi.g:5084:11: lv_operationTraits_30_0= ruleNamedOperationTrait
            	    {

            	    											newCompositeNode(grammarAccess.getComponentsAccess().getOperationTraitsNamedOperationTraitParserRuleCall_2_3_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_operationTraits_30_0=ruleNamedOperationTrait();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    											}
            	    											add(
            	    												current,
            	    												"operationTraits",
            	    												lv_operationTraits_30_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedOperationTrait");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:5101:9: (otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) ) )*
            	    loop108:
            	    do {
            	        int alt108=2;
            	        int LA108_0 = input.LA(1);

            	        if ( (LA108_0==11) ) {
            	            alt108=1;
            	        }


            	        switch (alt108) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:5102:10: otherlv_31= ',' ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_31, grammarAccess.getComponentsAccess().getCommaKeyword_2_3_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:5106:10: ( (lv_operationTraits_32_0= ruleNamedOperationTrait ) )
            	    	    // InternalAsyncApi.g:5107:11: (lv_operationTraits_32_0= ruleNamedOperationTrait )
            	    	    {
            	    	    // InternalAsyncApi.g:5107:11: (lv_operationTraits_32_0= ruleNamedOperationTrait )
            	    	    // InternalAsyncApi.g:5108:12: lv_operationTraits_32_0= ruleNamedOperationTrait
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentsAccess().getOperationTraitsNamedOperationTraitParserRuleCall_2_3_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_operationTraits_32_0=ruleNamedOperationTrait();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"operationTraits",
            	    	    													lv_operationTraits_32_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedOperationTrait");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop108;
            	        }
            	    } while (true);

            	    otherlv_33=(Token)match(input,14,FOLLOW_47); 

            	    									newLeafNode(otherlv_33, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_3_5());
            	    								
            	    // InternalAsyncApi.g:5130:9: (otherlv_34= ',' )?
            	    int alt109=2;
            	    int LA109_0 = input.LA(1);

            	    if ( (LA109_0==11) ) {
            	        alt109=1;
            	    }
            	    switch (alt109) {
            	        case 1 :
            	            // InternalAsyncApi.g:5131:10: otherlv_34= ','
            	            {
            	            otherlv_34=(Token)match(input,11,FOLLOW_46); 

            	            										newLeafNode(otherlv_34, grammarAccess.getComponentsAccess().getCommaKeyword_2_3_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:5142:4: ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:5142:4: ({...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:5143:5: {...}? => ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAsyncApi.g:5143:107: ( ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) ) )
            	    // InternalAsyncApi.g:5144:6: ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAsyncApi.g:5147:9: ({...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? ) )
            	    // InternalAsyncApi.g:5147:10: {...}? => (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:5147:19: (otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )? )
            	    // InternalAsyncApi.g:5147:20: otherlv_35= '\"messageTraits\"' otherlv_36= ':' otherlv_37= '{' ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) ) (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )* otherlv_41= '}' (otherlv_42= ',' )?
            	    {
            	    otherlv_35=(Token)match(input,60,FOLLOW_4); 

            	    									newLeafNode(otherlv_35, grammarAccess.getComponentsAccess().getMessageTraitsKeyword_2_4_0());
            	    								
            	    otherlv_36=(Token)match(input,10,FOLLOW_8); 

            	    									newLeafNode(otherlv_36, grammarAccess.getComponentsAccess().getColonKeyword_2_4_1());
            	    								
            	    otherlv_37=(Token)match(input,8,FOLLOW_9); 

            	    									newLeafNode(otherlv_37, grammarAccess.getComponentsAccess().getLeftCurlyBracketKeyword_2_4_2());
            	    								
            	    // InternalAsyncApi.g:5159:9: ( (lv_messageTraits_38_0= ruleNamedMessageTrait ) )
            	    // InternalAsyncApi.g:5160:10: (lv_messageTraits_38_0= ruleNamedMessageTrait )
            	    {
            	    // InternalAsyncApi.g:5160:10: (lv_messageTraits_38_0= ruleNamedMessageTrait )
            	    // InternalAsyncApi.g:5161:11: lv_messageTraits_38_0= ruleNamedMessageTrait
            	    {

            	    											newCompositeNode(grammarAccess.getComponentsAccess().getMessageTraitsNamedMessageTraitParserRuleCall_2_4_3_0());
            	    										
            	    pushFollow(FOLLOW_10);
            	    lv_messageTraits_38_0=ruleNamedMessageTrait();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    											}
            	    											add(
            	    												current,
            	    												"messageTraits",
            	    												lv_messageTraits_38_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.NamedMessageTrait");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:5178:9: (otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) ) )*
            	    loop110:
            	    do {
            	        int alt110=2;
            	        int LA110_0 = input.LA(1);

            	        if ( (LA110_0==11) ) {
            	            alt110=1;
            	        }


            	        switch (alt110) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:5179:10: otherlv_39= ',' ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,11,FOLLOW_9); 

            	    	    										newLeafNode(otherlv_39, grammarAccess.getComponentsAccess().getCommaKeyword_2_4_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:5183:10: ( (lv_messageTraits_40_0= ruleNamedMessageTrait ) )
            	    	    // InternalAsyncApi.g:5184:11: (lv_messageTraits_40_0= ruleNamedMessageTrait )
            	    	    {
            	    	    // InternalAsyncApi.g:5184:11: (lv_messageTraits_40_0= ruleNamedMessageTrait )
            	    	    // InternalAsyncApi.g:5185:12: lv_messageTraits_40_0= ruleNamedMessageTrait
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentsAccess().getMessageTraitsNamedMessageTraitParserRuleCall_2_4_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_messageTraits_40_0=ruleNamedMessageTrait();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"messageTraits",
            	    	    													lv_messageTraits_40_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.NamedMessageTrait");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop110;
            	        }
            	    } while (true);

            	    otherlv_41=(Token)match(input,14,FOLLOW_47); 

            	    									newLeafNode(otherlv_41, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_2_4_5());
            	    								
            	    // InternalAsyncApi.g:5207:9: (otherlv_42= ',' )?
            	    int alt111=2;
            	    int LA111_0 = input.LA(1);

            	    if ( (LA111_0==11) ) {
            	        alt111=1;
            	    }
            	    switch (alt111) {
            	        case 1 :
            	            // InternalAsyncApi.g:5208:10: otherlv_42= ','
            	            {
            	            otherlv_42=(Token)match(input,11,FOLLOW_46); 

            	            										newLeafNode(otherlv_42, grammarAccess.getComponentsAccess().getCommaKeyword_2_4_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAsyncApi.g:5219:4: ({...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:5219:4: ({...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:5220:5: {...}? => ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "getUnorderedGroupHelper().canSelect(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalAsyncApi.g:5220:107: ( ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) ) )
            	    // InternalAsyncApi.g:5221:6: ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalAsyncApi.g:5224:9: ({...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? ) )
            	    // InternalAsyncApi.g:5224:10: {...}? => (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleComponents", "true");
            	    }
            	    // InternalAsyncApi.g:5224:19: (otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )? )
            	    // InternalAsyncApi.g:5224:20: otherlv_43= '\"x-qosMetrics\"' otherlv_44= ':' otherlv_45= '[' ( (lv_qosMetrics_46_0= ruleQoSMetric ) ) (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )* otherlv_49= ']' (otherlv_50= ',' )?
            	    {
            	    otherlv_43=(Token)match(input,61,FOLLOW_4); 

            	    									newLeafNode(otherlv_43, grammarAccess.getComponentsAccess().getXQosMetricsKeyword_2_5_0());
            	    								
            	    otherlv_44=(Token)match(input,10,FOLLOW_24); 

            	    									newLeafNode(otherlv_44, grammarAccess.getComponentsAccess().getColonKeyword_2_5_1());
            	    								
            	    otherlv_45=(Token)match(input,32,FOLLOW_8); 

            	    									newLeafNode(otherlv_45, grammarAccess.getComponentsAccess().getLeftSquareBracketKeyword_2_5_2());
            	    								
            	    // InternalAsyncApi.g:5236:9: ( (lv_qosMetrics_46_0= ruleQoSMetric ) )
            	    // InternalAsyncApi.g:5237:10: (lv_qosMetrics_46_0= ruleQoSMetric )
            	    {
            	    // InternalAsyncApi.g:5237:10: (lv_qosMetrics_46_0= ruleQoSMetric )
            	    // InternalAsyncApi.g:5238:11: lv_qosMetrics_46_0= ruleQoSMetric
            	    {

            	    											newCompositeNode(grammarAccess.getComponentsAccess().getQosMetricsQoSMetricParserRuleCall_2_5_3_0());
            	    										
            	    pushFollow(FOLLOW_25);
            	    lv_qosMetrics_46_0=ruleQoSMetric();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    											}
            	    											add(
            	    												current,
            	    												"qosMetrics",
            	    												lv_qosMetrics_46_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.QoSMetric");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:5255:9: (otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) ) )*
            	    loop112:
            	    do {
            	        int alt112=2;
            	        int LA112_0 = input.LA(1);

            	        if ( (LA112_0==11) ) {
            	            alt112=1;
            	        }


            	        switch (alt112) {
            	    	case 1 :
            	    	    // InternalAsyncApi.g:5256:10: otherlv_47= ',' ( (lv_qosMetrics_48_0= ruleQoSMetric ) )
            	    	    {
            	    	    otherlv_47=(Token)match(input,11,FOLLOW_8); 

            	    	    										newLeafNode(otherlv_47, grammarAccess.getComponentsAccess().getCommaKeyword_2_5_4_0());
            	    	    									
            	    	    // InternalAsyncApi.g:5260:10: ( (lv_qosMetrics_48_0= ruleQoSMetric ) )
            	    	    // InternalAsyncApi.g:5261:11: (lv_qosMetrics_48_0= ruleQoSMetric )
            	    	    {
            	    	    // InternalAsyncApi.g:5261:11: (lv_qosMetrics_48_0= ruleQoSMetric )
            	    	    // InternalAsyncApi.g:5262:12: lv_qosMetrics_48_0= ruleQoSMetric
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getComponentsAccess().getQosMetricsQoSMetricParserRuleCall_2_5_4_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_25);
            	    	    lv_qosMetrics_48_0=ruleQoSMetric();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getComponentsRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"qosMetrics",
            	    	    													lv_qosMetrics_48_0,
            	    	    													"io.github.abelgomez.asyncapi.AsyncApi.QoSMetric");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop112;
            	        }
            	    } while (true);

            	    otherlv_49=(Token)match(input,33,FOLLOW_47); 

            	    									newLeafNode(otherlv_49, grammarAccess.getComponentsAccess().getRightSquareBracketKeyword_2_5_5());
            	    								
            	    // InternalAsyncApi.g:5284:9: (otherlv_50= ',' )?
            	    int alt113=2;
            	    int LA113_0 = input.LA(1);

            	    if ( (LA113_0==11) ) {
            	        alt113=1;
            	    }
            	    switch (alt113) {
            	        case 1 :
            	            // InternalAsyncApi.g:5285:10: otherlv_50= ','
            	            {
            	            otherlv_50=(Token)match(input,11,FOLLOW_46); 

            	            										newLeafNode(otherlv_50, grammarAccess.getComponentsAccess().getCommaKeyword_2_5_6());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getComponentsAccess().getUnorderedGroup_2());
            				

            }

            otherlv_51=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_51, grammarAccess.getComponentsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleComponents"


    // $ANTLR start "entryRuleSla"
    // InternalAsyncApi.g:5311:1: entryRuleSla returns [EObject current=null] : iv_ruleSla= ruleSla EOF ;
    public final EObject entryRuleSla() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSla = null;


        try {
            // InternalAsyncApi.g:5311:44: (iv_ruleSla= ruleSla EOF )
            // InternalAsyncApi.g:5312:2: iv_ruleSla= ruleSla EOF
            {
             newCompositeNode(grammarAccess.getSlaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSla=ruleSla();

            state._fsp--;

             current =iv_ruleSla; 
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
    // $ANTLR end "entryRuleSla"


    // $ANTLR start "ruleSla"
    // InternalAsyncApi.g:5318:1: ruleSla returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= '\"guaranteeTerm\"' otherlv_3= ':' ( (lv_guaranteeTerm_4_0= ruleGuaranteeTerm ) ) (otherlv_5= ',' ( (lv_guaranteeTerm_6_0= ruleGuaranteeTerm ) ) )* ) otherlv_7= '}' ) ;
    public final EObject ruleSla() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_guaranteeTerm_4_0 = null;

        EObject lv_guaranteeTerm_6_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:5324:2: ( ( () otherlv_1= '{' (otherlv_2= '\"guaranteeTerm\"' otherlv_3= ':' ( (lv_guaranteeTerm_4_0= ruleGuaranteeTerm ) ) (otherlv_5= ',' ( (lv_guaranteeTerm_6_0= ruleGuaranteeTerm ) ) )* ) otherlv_7= '}' ) )
            // InternalAsyncApi.g:5325:2: ( () otherlv_1= '{' (otherlv_2= '\"guaranteeTerm\"' otherlv_3= ':' ( (lv_guaranteeTerm_4_0= ruleGuaranteeTerm ) ) (otherlv_5= ',' ( (lv_guaranteeTerm_6_0= ruleGuaranteeTerm ) ) )* ) otherlv_7= '}' )
            {
            // InternalAsyncApi.g:5325:2: ( () otherlv_1= '{' (otherlv_2= '\"guaranteeTerm\"' otherlv_3= ':' ( (lv_guaranteeTerm_4_0= ruleGuaranteeTerm ) ) (otherlv_5= ',' ( (lv_guaranteeTerm_6_0= ruleGuaranteeTerm ) ) )* ) otherlv_7= '}' )
            // InternalAsyncApi.g:5326:3: () otherlv_1= '{' (otherlv_2= '\"guaranteeTerm\"' otherlv_3= ':' ( (lv_guaranteeTerm_4_0= ruleGuaranteeTerm ) ) (otherlv_5= ',' ( (lv_guaranteeTerm_6_0= ruleGuaranteeTerm ) ) )* ) otherlv_7= '}'
            {
            // InternalAsyncApi.g:5326:3: ()
            // InternalAsyncApi.g:5327:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSlaAccess().getSlaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getSlaAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:5337:3: (otherlv_2= '\"guaranteeTerm\"' otherlv_3= ':' ( (lv_guaranteeTerm_4_0= ruleGuaranteeTerm ) ) (otherlv_5= ',' ( (lv_guaranteeTerm_6_0= ruleGuaranteeTerm ) ) )* )
            // InternalAsyncApi.g:5338:4: otherlv_2= '\"guaranteeTerm\"' otherlv_3= ':' ( (lv_guaranteeTerm_4_0= ruleGuaranteeTerm ) ) (otherlv_5= ',' ( (lv_guaranteeTerm_6_0= ruleGuaranteeTerm ) ) )*
            {
            otherlv_2=(Token)match(input,62,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getSlaAccess().getGuaranteeTermKeyword_2_0());
            			
            otherlv_3=(Token)match(input,10,FOLLOW_8); 

            				newLeafNode(otherlv_3, grammarAccess.getSlaAccess().getColonKeyword_2_1());
            			
            // InternalAsyncApi.g:5346:4: ( (lv_guaranteeTerm_4_0= ruleGuaranteeTerm ) )
            // InternalAsyncApi.g:5347:5: (lv_guaranteeTerm_4_0= ruleGuaranteeTerm )
            {
            // InternalAsyncApi.g:5347:5: (lv_guaranteeTerm_4_0= ruleGuaranteeTerm )
            // InternalAsyncApi.g:5348:6: lv_guaranteeTerm_4_0= ruleGuaranteeTerm
            {

            						newCompositeNode(grammarAccess.getSlaAccess().getGuaranteeTermGuaranteeTermParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_10);
            lv_guaranteeTerm_4_0=ruleGuaranteeTerm();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getSlaRule());
            						}
            						add(
            							current,
            							"guaranteeTerm",
            							lv_guaranteeTerm_4_0,
            							"io.github.abelgomez.asyncapi.AsyncApi.GuaranteeTerm");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalAsyncApi.g:5365:4: (otherlv_5= ',' ( (lv_guaranteeTerm_6_0= ruleGuaranteeTerm ) ) )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==11) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // InternalAsyncApi.g:5366:5: otherlv_5= ',' ( (lv_guaranteeTerm_6_0= ruleGuaranteeTerm ) )
            	    {
            	    otherlv_5=(Token)match(input,11,FOLLOW_8); 

            	    					newLeafNode(otherlv_5, grammarAccess.getSlaAccess().getCommaKeyword_2_3_0());
            	    				
            	    // InternalAsyncApi.g:5370:5: ( (lv_guaranteeTerm_6_0= ruleGuaranteeTerm ) )
            	    // InternalAsyncApi.g:5371:6: (lv_guaranteeTerm_6_0= ruleGuaranteeTerm )
            	    {
            	    // InternalAsyncApi.g:5371:6: (lv_guaranteeTerm_6_0= ruleGuaranteeTerm )
            	    // InternalAsyncApi.g:5372:7: lv_guaranteeTerm_6_0= ruleGuaranteeTerm
            	    {

            	    							newCompositeNode(grammarAccess.getSlaAccess().getGuaranteeTermGuaranteeTermParserRuleCall_2_3_1_0());
            	    						
            	    pushFollow(FOLLOW_10);
            	    lv_guaranteeTerm_6_0=ruleGuaranteeTerm();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSlaRule());
            	    							}
            	    							add(
            	    								current,
            	    								"guaranteeTerm",
            	    								lv_guaranteeTerm_6_0,
            	    								"io.github.abelgomez.asyncapi.AsyncApi.GuaranteeTerm");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop115;
                }
            } while (true);


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSlaAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleSla"


    // $ANTLR start "entryRuleGuaranteeTerm"
    // InternalAsyncApi.g:5399:1: entryRuleGuaranteeTerm returns [EObject current=null] : iv_ruleGuaranteeTerm= ruleGuaranteeTerm EOF ;
    public final EObject entryRuleGuaranteeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuaranteeTerm = null;


        try {
            // InternalAsyncApi.g:5399:54: (iv_ruleGuaranteeTerm= ruleGuaranteeTerm EOF )
            // InternalAsyncApi.g:5400:2: iv_ruleGuaranteeTerm= ruleGuaranteeTerm EOF
            {
             newCompositeNode(grammarAccess.getGuaranteeTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGuaranteeTerm=ruleGuaranteeTerm();

            state._fsp--;

             current =iv_ruleGuaranteeTerm; 
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
    // $ANTLR end "entryRuleGuaranteeTerm"


    // $ANTLR start "ruleGuaranteeTerm"
    // InternalAsyncApi.g:5406:1: ruleGuaranteeTerm returns [EObject current=null] : ( () otherlv_1= '{' ( (otherlv_2= '\"scopes\"' otherlv_3= ':' otherlv_4= '{' ( (lv_scopes_5_0= ruleScope ) ) (otherlv_6= ',' ( (lv_scopes_7_0= ruleScope ) ) )* otherlv_8= '}' otherlv_9= ',' ) (otherlv_10= '\"qualifyingConditions\"' otherlv_11= ':' otherlv_12= '{' ( (lv_qualifyingConditions_13_0= ruleQualifyingCondition ) ) (otherlv_14= ',' ( (lv_qualifyingConditions_15_0= ruleQualifyingCondition ) ) )* otherlv_16= '}' otherlv_17= ',' )? (otherlv_18= '\"slos\"' otherlv_19= ':' otherlv_20= '{' ( (lv_slos_21_0= ruleSlo ) ) (otherlv_22= ',' ( (lv_slos_23_0= ruleSlo ) ) )* otherlv_24= '}' ) ) otherlv_25= '}' ) ;
    public final EObject ruleGuaranteeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject lv_scopes_5_0 = null;

        EObject lv_scopes_7_0 = null;

        EObject lv_qualifyingConditions_13_0 = null;

        EObject lv_qualifyingConditions_15_0 = null;

        EObject lv_slos_21_0 = null;

        EObject lv_slos_23_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:5412:2: ( ( () otherlv_1= '{' ( (otherlv_2= '\"scopes\"' otherlv_3= ':' otherlv_4= '{' ( (lv_scopes_5_0= ruleScope ) ) (otherlv_6= ',' ( (lv_scopes_7_0= ruleScope ) ) )* otherlv_8= '}' otherlv_9= ',' ) (otherlv_10= '\"qualifyingConditions\"' otherlv_11= ':' otherlv_12= '{' ( (lv_qualifyingConditions_13_0= ruleQualifyingCondition ) ) (otherlv_14= ',' ( (lv_qualifyingConditions_15_0= ruleQualifyingCondition ) ) )* otherlv_16= '}' otherlv_17= ',' )? (otherlv_18= '\"slos\"' otherlv_19= ':' otherlv_20= '{' ( (lv_slos_21_0= ruleSlo ) ) (otherlv_22= ',' ( (lv_slos_23_0= ruleSlo ) ) )* otherlv_24= '}' ) ) otherlv_25= '}' ) )
            // InternalAsyncApi.g:5413:2: ( () otherlv_1= '{' ( (otherlv_2= '\"scopes\"' otherlv_3= ':' otherlv_4= '{' ( (lv_scopes_5_0= ruleScope ) ) (otherlv_6= ',' ( (lv_scopes_7_0= ruleScope ) ) )* otherlv_8= '}' otherlv_9= ',' ) (otherlv_10= '\"qualifyingConditions\"' otherlv_11= ':' otherlv_12= '{' ( (lv_qualifyingConditions_13_0= ruleQualifyingCondition ) ) (otherlv_14= ',' ( (lv_qualifyingConditions_15_0= ruleQualifyingCondition ) ) )* otherlv_16= '}' otherlv_17= ',' )? (otherlv_18= '\"slos\"' otherlv_19= ':' otherlv_20= '{' ( (lv_slos_21_0= ruleSlo ) ) (otherlv_22= ',' ( (lv_slos_23_0= ruleSlo ) ) )* otherlv_24= '}' ) ) otherlv_25= '}' )
            {
            // InternalAsyncApi.g:5413:2: ( () otherlv_1= '{' ( (otherlv_2= '\"scopes\"' otherlv_3= ':' otherlv_4= '{' ( (lv_scopes_5_0= ruleScope ) ) (otherlv_6= ',' ( (lv_scopes_7_0= ruleScope ) ) )* otherlv_8= '}' otherlv_9= ',' ) (otherlv_10= '\"qualifyingConditions\"' otherlv_11= ':' otherlv_12= '{' ( (lv_qualifyingConditions_13_0= ruleQualifyingCondition ) ) (otherlv_14= ',' ( (lv_qualifyingConditions_15_0= ruleQualifyingCondition ) ) )* otherlv_16= '}' otherlv_17= ',' )? (otherlv_18= '\"slos\"' otherlv_19= ':' otherlv_20= '{' ( (lv_slos_21_0= ruleSlo ) ) (otherlv_22= ',' ( (lv_slos_23_0= ruleSlo ) ) )* otherlv_24= '}' ) ) otherlv_25= '}' )
            // InternalAsyncApi.g:5414:3: () otherlv_1= '{' ( (otherlv_2= '\"scopes\"' otherlv_3= ':' otherlv_4= '{' ( (lv_scopes_5_0= ruleScope ) ) (otherlv_6= ',' ( (lv_scopes_7_0= ruleScope ) ) )* otherlv_8= '}' otherlv_9= ',' ) (otherlv_10= '\"qualifyingConditions\"' otherlv_11= ':' otherlv_12= '{' ( (lv_qualifyingConditions_13_0= ruleQualifyingCondition ) ) (otherlv_14= ',' ( (lv_qualifyingConditions_15_0= ruleQualifyingCondition ) ) )* otherlv_16= '}' otherlv_17= ',' )? (otherlv_18= '\"slos\"' otherlv_19= ':' otherlv_20= '{' ( (lv_slos_21_0= ruleSlo ) ) (otherlv_22= ',' ( (lv_slos_23_0= ruleSlo ) ) )* otherlv_24= '}' ) ) otherlv_25= '}'
            {
            // InternalAsyncApi.g:5414:3: ()
            // InternalAsyncApi.g:5415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGuaranteeTermAccess().getGuaranteeTermAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getGuaranteeTermAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAsyncApi.g:5425:3: ( (otherlv_2= '\"scopes\"' otherlv_3= ':' otherlv_4= '{' ( (lv_scopes_5_0= ruleScope ) ) (otherlv_6= ',' ( (lv_scopes_7_0= ruleScope ) ) )* otherlv_8= '}' otherlv_9= ',' ) (otherlv_10= '\"qualifyingConditions\"' otherlv_11= ':' otherlv_12= '{' ( (lv_qualifyingConditions_13_0= ruleQualifyingCondition ) ) (otherlv_14= ',' ( (lv_qualifyingConditions_15_0= ruleQualifyingCondition ) ) )* otherlv_16= '}' otherlv_17= ',' )? (otherlv_18= '\"slos\"' otherlv_19= ':' otherlv_20= '{' ( (lv_slos_21_0= ruleSlo ) ) (otherlv_22= ',' ( (lv_slos_23_0= ruleSlo ) ) )* otherlv_24= '}' ) )
            // InternalAsyncApi.g:5426:4: (otherlv_2= '\"scopes\"' otherlv_3= ':' otherlv_4= '{' ( (lv_scopes_5_0= ruleScope ) ) (otherlv_6= ',' ( (lv_scopes_7_0= ruleScope ) ) )* otherlv_8= '}' otherlv_9= ',' ) (otherlv_10= '\"qualifyingConditions\"' otherlv_11= ':' otherlv_12= '{' ( (lv_qualifyingConditions_13_0= ruleQualifyingCondition ) ) (otherlv_14= ',' ( (lv_qualifyingConditions_15_0= ruleQualifyingCondition ) ) )* otherlv_16= '}' otherlv_17= ',' )? (otherlv_18= '\"slos\"' otherlv_19= ':' otherlv_20= '{' ( (lv_slos_21_0= ruleSlo ) ) (otherlv_22= ',' ( (lv_slos_23_0= ruleSlo ) ) )* otherlv_24= '}' )
            {
            // InternalAsyncApi.g:5426:4: (otherlv_2= '\"scopes\"' otherlv_3= ':' otherlv_4= '{' ( (lv_scopes_5_0= ruleScope ) ) (otherlv_6= ',' ( (lv_scopes_7_0= ruleScope ) ) )* otherlv_8= '}' otherlv_9= ',' )
            // InternalAsyncApi.g:5427:5: otherlv_2= '\"scopes\"' otherlv_3= ':' otherlv_4= '{' ( (lv_scopes_5_0= ruleScope ) ) (otherlv_6= ',' ( (lv_scopes_7_0= ruleScope ) ) )* otherlv_8= '}' otherlv_9= ','
            {
            otherlv_2=(Token)match(input,63,FOLLOW_4); 

            					newLeafNode(otherlv_2, grammarAccess.getGuaranteeTermAccess().getScopesKeyword_2_0_0());
            				
            otherlv_3=(Token)match(input,10,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getGuaranteeTermAccess().getColonKeyword_2_0_1());
            				
            otherlv_4=(Token)match(input,8,FOLLOW_9); 

            					newLeafNode(otherlv_4, grammarAccess.getGuaranteeTermAccess().getLeftCurlyBracketKeyword_2_0_2());
            				
            // InternalAsyncApi.g:5439:5: ( (lv_scopes_5_0= ruleScope ) )
            // InternalAsyncApi.g:5440:6: (lv_scopes_5_0= ruleScope )
            {
            // InternalAsyncApi.g:5440:6: (lv_scopes_5_0= ruleScope )
            // InternalAsyncApi.g:5441:7: lv_scopes_5_0= ruleScope
            {

            							newCompositeNode(grammarAccess.getGuaranteeTermAccess().getScopesScopeParserRuleCall_2_0_3_0());
            						
            pushFollow(FOLLOW_10);
            lv_scopes_5_0=ruleScope();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getGuaranteeTermRule());
            							}
            							add(
            								current,
            								"scopes",
            								lv_scopes_5_0,
            								"io.github.abelgomez.asyncapi.AsyncApi.Scope");
            							afterParserOrEnumRuleCall();
            						

            }


            }

            // InternalAsyncApi.g:5458:5: (otherlv_6= ',' ( (lv_scopes_7_0= ruleScope ) ) )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==11) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // InternalAsyncApi.g:5459:6: otherlv_6= ',' ( (lv_scopes_7_0= ruleScope ) )
            	    {
            	    otherlv_6=(Token)match(input,11,FOLLOW_9); 

            	    						newLeafNode(otherlv_6, grammarAccess.getGuaranteeTermAccess().getCommaKeyword_2_0_4_0());
            	    					
            	    // InternalAsyncApi.g:5463:6: ( (lv_scopes_7_0= ruleScope ) )
            	    // InternalAsyncApi.g:5464:7: (lv_scopes_7_0= ruleScope )
            	    {
            	    // InternalAsyncApi.g:5464:7: (lv_scopes_7_0= ruleScope )
            	    // InternalAsyncApi.g:5465:8: lv_scopes_7_0= ruleScope
            	    {

            	    								newCompositeNode(grammarAccess.getGuaranteeTermAccess().getScopesScopeParserRuleCall_2_0_4_1_0());
            	    							
            	    pushFollow(FOLLOW_10);
            	    lv_scopes_7_0=ruleScope();

            	    state._fsp--;


            	    								if (current==null) {
            	    									current = createModelElementForParent(grammarAccess.getGuaranteeTermRule());
            	    								}
            	    								add(
            	    									current,
            	    									"scopes",
            	    									lv_scopes_7_0,
            	    									"io.github.abelgomez.asyncapi.AsyncApi.Scope");
            	    								afterParserOrEnumRuleCall();
            	    							

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_50); 

            					newLeafNode(otherlv_8, grammarAccess.getGuaranteeTermAccess().getRightCurlyBracketKeyword_2_0_5());
            				
            otherlv_9=(Token)match(input,11,FOLLOW_51); 

            					newLeafNode(otherlv_9, grammarAccess.getGuaranteeTermAccess().getCommaKeyword_2_0_6());
            				

            }

            // InternalAsyncApi.g:5492:4: (otherlv_10= '\"qualifyingConditions\"' otherlv_11= ':' otherlv_12= '{' ( (lv_qualifyingConditions_13_0= ruleQualifyingCondition ) ) (otherlv_14= ',' ( (lv_qualifyingConditions_15_0= ruleQualifyingCondition ) ) )* otherlv_16= '}' otherlv_17= ',' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==64) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalAsyncApi.g:5493:5: otherlv_10= '\"qualifyingConditions\"' otherlv_11= ':' otherlv_12= '{' ( (lv_qualifyingConditions_13_0= ruleQualifyingCondition ) ) (otherlv_14= ',' ( (lv_qualifyingConditions_15_0= ruleQualifyingCondition ) ) )* otherlv_16= '}' otherlv_17= ','
                    {
                    otherlv_10=(Token)match(input,64,FOLLOW_4); 

                    					newLeafNode(otherlv_10, grammarAccess.getGuaranteeTermAccess().getQualifyingConditionsKeyword_2_1_0());
                    				
                    otherlv_11=(Token)match(input,10,FOLLOW_8); 

                    					newLeafNode(otherlv_11, grammarAccess.getGuaranteeTermAccess().getColonKeyword_2_1_1());
                    				
                    otherlv_12=(Token)match(input,8,FOLLOW_9); 

                    					newLeafNode(otherlv_12, grammarAccess.getGuaranteeTermAccess().getLeftCurlyBracketKeyword_2_1_2());
                    				
                    // InternalAsyncApi.g:5505:5: ( (lv_qualifyingConditions_13_0= ruleQualifyingCondition ) )
                    // InternalAsyncApi.g:5506:6: (lv_qualifyingConditions_13_0= ruleQualifyingCondition )
                    {
                    // InternalAsyncApi.g:5506:6: (lv_qualifyingConditions_13_0= ruleQualifyingCondition )
                    // InternalAsyncApi.g:5507:7: lv_qualifyingConditions_13_0= ruleQualifyingCondition
                    {

                    							newCompositeNode(grammarAccess.getGuaranteeTermAccess().getQualifyingConditionsQualifyingConditionParserRuleCall_2_1_3_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_qualifyingConditions_13_0=ruleQualifyingCondition();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getGuaranteeTermRule());
                    							}
                    							add(
                    								current,
                    								"qualifyingConditions",
                    								lv_qualifyingConditions_13_0,
                    								"io.github.abelgomez.asyncapi.AsyncApi.QualifyingCondition");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalAsyncApi.g:5524:5: (otherlv_14= ',' ( (lv_qualifyingConditions_15_0= ruleQualifyingCondition ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==11) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // InternalAsyncApi.g:5525:6: otherlv_14= ',' ( (lv_qualifyingConditions_15_0= ruleQualifyingCondition ) )
                    	    {
                    	    otherlv_14=(Token)match(input,11,FOLLOW_9); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getGuaranteeTermAccess().getCommaKeyword_2_1_4_0());
                    	    					
                    	    // InternalAsyncApi.g:5529:6: ( (lv_qualifyingConditions_15_0= ruleQualifyingCondition ) )
                    	    // InternalAsyncApi.g:5530:7: (lv_qualifyingConditions_15_0= ruleQualifyingCondition )
                    	    {
                    	    // InternalAsyncApi.g:5530:7: (lv_qualifyingConditions_15_0= ruleQualifyingCondition )
                    	    // InternalAsyncApi.g:5531:8: lv_qualifyingConditions_15_0= ruleQualifyingCondition
                    	    {

                    	    								newCompositeNode(grammarAccess.getGuaranteeTermAccess().getQualifyingConditionsQualifyingConditionParserRuleCall_2_1_4_1_0());
                    	    							
                    	    pushFollow(FOLLOW_10);
                    	    lv_qualifyingConditions_15_0=ruleQualifyingCondition();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getGuaranteeTermRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"qualifyingConditions",
                    	    									lv_qualifyingConditions_15_0,
                    	    									"io.github.abelgomez.asyncapi.AsyncApi.QualifyingCondition");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,14,FOLLOW_50); 

                    					newLeafNode(otherlv_16, grammarAccess.getGuaranteeTermAccess().getRightCurlyBracketKeyword_2_1_5());
                    				
                    otherlv_17=(Token)match(input,11,FOLLOW_52); 

                    					newLeafNode(otherlv_17, grammarAccess.getGuaranteeTermAccess().getCommaKeyword_2_1_6());
                    				

                    }
                    break;

            }

            // InternalAsyncApi.g:5558:4: (otherlv_18= '\"slos\"' otherlv_19= ':' otherlv_20= '{' ( (lv_slos_21_0= ruleSlo ) ) (otherlv_22= ',' ( (lv_slos_23_0= ruleSlo ) ) )* otherlv_24= '}' )
            // InternalAsyncApi.g:5559:5: otherlv_18= '\"slos\"' otherlv_19= ':' otherlv_20= '{' ( (lv_slos_21_0= ruleSlo ) ) (otherlv_22= ',' ( (lv_slos_23_0= ruleSlo ) ) )* otherlv_24= '}'
            {
            otherlv_18=(Token)match(input,65,FOLLOW_4); 

            					newLeafNode(otherlv_18, grammarAccess.getGuaranteeTermAccess().getSlosKeyword_2_2_0());
            				
            otherlv_19=(Token)match(input,10,FOLLOW_8); 

            					newLeafNode(otherlv_19, grammarAccess.getGuaranteeTermAccess().getColonKeyword_2_2_1());
            				
            otherlv_20=(Token)match(input,8,FOLLOW_9); 

            					newLeafNode(otherlv_20, grammarAccess.getGuaranteeTermAccess().getLeftCurlyBracketKeyword_2_2_2());
            				
            // InternalAsyncApi.g:5571:5: ( (lv_slos_21_0= ruleSlo ) )
            // InternalAsyncApi.g:5572:6: (lv_slos_21_0= ruleSlo )
            {
            // InternalAsyncApi.g:5572:6: (lv_slos_21_0= ruleSlo )
            // InternalAsyncApi.g:5573:7: lv_slos_21_0= ruleSlo
            {

            							newCompositeNode(grammarAccess.getGuaranteeTermAccess().getSlosSloParserRuleCall_2_2_3_0());
            						
            pushFollow(FOLLOW_10);
            lv_slos_21_0=ruleSlo();

            state._fsp--;


            							if (current==null) {
            								current = createModelElementForParent(grammarAccess.getGuaranteeTermRule());
            							}
            							add(
            								current,
            								"slos",
            								lv_slos_21_0,
            								"io.github.abelgomez.asyncapi.AsyncApi.Slo");
            							afterParserOrEnumRuleCall();
            						

            }


            }

            // InternalAsyncApi.g:5590:5: (otherlv_22= ',' ( (lv_slos_23_0= ruleSlo ) ) )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( (LA119_0==11) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalAsyncApi.g:5591:6: otherlv_22= ',' ( (lv_slos_23_0= ruleSlo ) )
            	    {
            	    otherlv_22=(Token)match(input,11,FOLLOW_9); 

            	    						newLeafNode(otherlv_22, grammarAccess.getGuaranteeTermAccess().getCommaKeyword_2_2_4_0());
            	    					
            	    // InternalAsyncApi.g:5595:6: ( (lv_slos_23_0= ruleSlo ) )
            	    // InternalAsyncApi.g:5596:7: (lv_slos_23_0= ruleSlo )
            	    {
            	    // InternalAsyncApi.g:5596:7: (lv_slos_23_0= ruleSlo )
            	    // InternalAsyncApi.g:5597:8: lv_slos_23_0= ruleSlo
            	    {

            	    								newCompositeNode(grammarAccess.getGuaranteeTermAccess().getSlosSloParserRuleCall_2_2_4_1_0());
            	    							
            	    pushFollow(FOLLOW_10);
            	    lv_slos_23_0=ruleSlo();

            	    state._fsp--;


            	    								if (current==null) {
            	    									current = createModelElementForParent(grammarAccess.getGuaranteeTermRule());
            	    								}
            	    								add(
            	    									current,
            	    									"slos",
            	    									lv_slos_23_0,
            	    									"io.github.abelgomez.asyncapi.AsyncApi.Slo");
            	    								afterParserOrEnumRuleCall();
            	    							

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);

            otherlv_24=(Token)match(input,14,FOLLOW_53); 

            					newLeafNode(otherlv_24, grammarAccess.getGuaranteeTermAccess().getRightCurlyBracketKeyword_2_2_5());
            				

            }


            }

            otherlv_25=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getGuaranteeTermAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleGuaranteeTerm"


    // $ANTLR start "entryRuleScope"
    // InternalAsyncApi.g:5629:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalAsyncApi.g:5629:46: (iv_ruleScope= ruleScope EOF )
            // InternalAsyncApi.g:5630:2: iv_ruleScope= ruleScope EOF
            {
             newCompositeNode(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;

             current =iv_ruleScope; 
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
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalAsyncApi.g:5636:1: ruleScope returns [EObject current=null] : ( () ( ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( ( ruleAnyString ) ) ) ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:5642:2: ( ( () ( ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( ( ruleAnyString ) ) ) ) )
            // InternalAsyncApi.g:5643:2: ( () ( ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( ( ruleAnyString ) ) ) )
            {
            // InternalAsyncApi.g:5643:2: ( () ( ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( ( ruleAnyString ) ) ) )
            // InternalAsyncApi.g:5644:3: () ( ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( ( ruleAnyString ) ) )
            {
            // InternalAsyncApi.g:5644:3: ()
            // InternalAsyncApi.g:5645:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScopeAccess().getScopeAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:5651:3: ( ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( ( ruleAnyString ) ) )
            // InternalAsyncApi.g:5652:4: ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( ( ruleAnyString ) )
            {
            // InternalAsyncApi.g:5652:4: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:5653:5: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:5653:5: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:5654:6: lv_name_1_0= ruleAnyString
            {

            						newCompositeNode(grammarAccess.getScopeAccess().getNameAnyStringParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getScopeRule());
            						}
            						set(
            							current,
            							"name",
            							lv_name_1_0,
            							"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_9); 

            				newLeafNode(otherlv_2, grammarAccess.getScopeAccess().getColonKeyword_1_1());
            			
            // InternalAsyncApi.g:5675:4: ( ( ruleAnyString ) )
            // InternalAsyncApi.g:5676:5: ( ruleAnyString )
            {
            // InternalAsyncApi.g:5676:5: ( ruleAnyString )
            // InternalAsyncApi.g:5677:6: ruleAnyString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getScopeRule());
            						}
            					

            						newCompositeNode(grammarAccess.getScopeAccess().getReferenceChannelCrossReference_1_2_0());
            					
            pushFollow(FOLLOW_2);
            ruleAnyString();

            state._fsp--;


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
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleQualifyingCondition"
    // InternalAsyncApi.g:5696:1: entryRuleQualifyingCondition returns [EObject current=null] : iv_ruleQualifyingCondition= ruleQualifyingCondition EOF ;
    public final EObject entryRuleQualifyingCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifyingCondition = null;


        try {
            // InternalAsyncApi.g:5696:60: (iv_ruleQualifyingCondition= ruleQualifyingCondition EOF )
            // InternalAsyncApi.g:5697:2: iv_ruleQualifyingCondition= ruleQualifyingCondition EOF
            {
             newCompositeNode(grammarAccess.getQualifyingConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifyingCondition=ruleQualifyingCondition();

            state._fsp--;

             current =iv_ruleQualifyingCondition; 
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
    // $ANTLR end "entryRuleQualifyingCondition"


    // $ANTLR start "ruleQualifyingCondition"
    // InternalAsyncApi.g:5703:1: ruleQualifyingCondition returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleBooleanCondition ) ) ) ;
    public final EObject ruleQualifyingCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:5709:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleBooleanCondition ) ) ) )
            // InternalAsyncApi.g:5710:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleBooleanCondition ) ) )
            {
            // InternalAsyncApi.g:5710:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleBooleanCondition ) ) )
            // InternalAsyncApi.g:5711:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleBooleanCondition ) )
            {
            // InternalAsyncApi.g:5711:3: ()
            // InternalAsyncApi.g:5712:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQualifyingConditionAccess().getQualifyingConditionAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:5718:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:5719:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:5719:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:5720:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getQualifyingConditionAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifyingConditionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getQualifyingConditionAccess().getColonKeyword_2());
            		
            // InternalAsyncApi.g:5741:3: ( (lv_condition_3_0= ruleBooleanCondition ) )
            // InternalAsyncApi.g:5742:4: (lv_condition_3_0= ruleBooleanCondition )
            {
            // InternalAsyncApi.g:5742:4: (lv_condition_3_0= ruleBooleanCondition )
            // InternalAsyncApi.g:5743:5: lv_condition_3_0= ruleBooleanCondition
            {

            					newCompositeNode(grammarAccess.getQualifyingConditionAccess().getConditionBooleanConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_3_0=ruleBooleanCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifyingConditionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.BooleanCondition");
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
    // $ANTLR end "ruleQualifyingCondition"


    // $ANTLR start "entryRuleSlo"
    // InternalAsyncApi.g:5764:1: entryRuleSlo returns [EObject current=null] : iv_ruleSlo= ruleSlo EOF ;
    public final EObject entryRuleSlo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSlo = null;


        try {
            // InternalAsyncApi.g:5764:44: (iv_ruleSlo= ruleSlo EOF )
            // InternalAsyncApi.g:5765:2: iv_ruleSlo= ruleSlo EOF
            {
             newCompositeNode(grammarAccess.getSloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSlo=ruleSlo();

            state._fsp--;

             current =iv_ruleSlo; 
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
    // $ANTLR end "entryRuleSlo"


    // $ANTLR start "ruleSlo"
    // InternalAsyncApi.g:5771:1: ruleSlo returns [EObject current=null] : ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleBooleanCondition ) ) ) ;
    public final EObject ruleSlo() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_condition_3_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:5777:2: ( ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleBooleanCondition ) ) ) )
            // InternalAsyncApi.g:5778:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleBooleanCondition ) ) )
            {
            // InternalAsyncApi.g:5778:2: ( () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleBooleanCondition ) ) )
            // InternalAsyncApi.g:5779:3: () ( (lv_name_1_0= ruleAnyString ) ) otherlv_2= ':' ( (lv_condition_3_0= ruleBooleanCondition ) )
            {
            // InternalAsyncApi.g:5779:3: ()
            // InternalAsyncApi.g:5780:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSloAccess().getSloAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:5786:3: ( (lv_name_1_0= ruleAnyString ) )
            // InternalAsyncApi.g:5787:4: (lv_name_1_0= ruleAnyString )
            {
            // InternalAsyncApi.g:5787:4: (lv_name_1_0= ruleAnyString )
            // InternalAsyncApi.g:5788:5: lv_name_1_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getSloAccess().getNameAnyStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSloRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSloAccess().getColonKeyword_2());
            		
            // InternalAsyncApi.g:5809:3: ( (lv_condition_3_0= ruleBooleanCondition ) )
            // InternalAsyncApi.g:5810:4: (lv_condition_3_0= ruleBooleanCondition )
            {
            // InternalAsyncApi.g:5810:4: (lv_condition_3_0= ruleBooleanCondition )
            // InternalAsyncApi.g:5811:5: lv_condition_3_0= ruleBooleanCondition
            {

            					newCompositeNode(grammarAccess.getSloAccess().getConditionBooleanConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_condition_3_0=ruleBooleanCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSloRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_3_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.BooleanCondition");
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
    // $ANTLR end "ruleSlo"


    // $ANTLR start "entryRuleAbstractQoSMetric"
    // InternalAsyncApi.g:5832:1: entryRuleAbstractQoSMetric returns [EObject current=null] : iv_ruleAbstractQoSMetric= ruleAbstractQoSMetric EOF ;
    public final EObject entryRuleAbstractQoSMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractQoSMetric = null;


        try {
            // InternalAsyncApi.g:5832:58: (iv_ruleAbstractQoSMetric= ruleAbstractQoSMetric EOF )
            // InternalAsyncApi.g:5833:2: iv_ruleAbstractQoSMetric= ruleAbstractQoSMetric EOF
            {
             newCompositeNode(grammarAccess.getAbstractQoSMetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractQoSMetric=ruleAbstractQoSMetric();

            state._fsp--;

             current =iv_ruleAbstractQoSMetric; 
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
    // $ANTLR end "entryRuleAbstractQoSMetric"


    // $ANTLR start "ruleAbstractQoSMetric"
    // InternalAsyncApi.g:5839:1: ruleAbstractQoSMetric returns [EObject current=null] : (this_QoSMetricReference_0= ruleQoSMetricReference | this_QoSMetric_1= ruleQoSMetric ) ;
    public final EObject ruleAbstractQoSMetric() throws RecognitionException {
        EObject current = null;

        EObject this_QoSMetricReference_0 = null;

        EObject this_QoSMetric_1 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:5845:2: ( (this_QoSMetricReference_0= ruleQoSMetricReference | this_QoSMetric_1= ruleQoSMetric ) )
            // InternalAsyncApi.g:5846:2: (this_QoSMetricReference_0= ruleQoSMetricReference | this_QoSMetric_1= ruleQoSMetric )
            {
            // InternalAsyncApi.g:5846:2: (this_QoSMetricReference_0= ruleQoSMetricReference | this_QoSMetric_1= ruleQoSMetric )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==RULE_STRING||LA120_0==9||(LA120_0>=12 && LA120_0<=13)||(LA120_0>=15 && LA120_0<=31)||(LA120_0>=34 && LA120_0<=67)||(LA120_0>=69 && LA120_0<=78)||(LA120_0>=81 && LA120_0<=108)) ) {
                alt120=1;
            }
            else if ( (LA120_0==8) ) {
                alt120=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // InternalAsyncApi.g:5847:3: this_QoSMetricReference_0= ruleQoSMetricReference
                    {

                    			newCompositeNode(grammarAccess.getAbstractQoSMetricAccess().getQoSMetricReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_QoSMetricReference_0=ruleQoSMetricReference();

                    state._fsp--;


                    			current = this_QoSMetricReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:5856:3: this_QoSMetric_1= ruleQoSMetric
                    {

                    			newCompositeNode(grammarAccess.getAbstractQoSMetricAccess().getQoSMetricParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QoSMetric_1=ruleQoSMetric();

                    state._fsp--;


                    			current = this_QoSMetric_1;
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
    // $ANTLR end "ruleAbstractQoSMetric"


    // $ANTLR start "entryRuleQoSMetricReference"
    // InternalAsyncApi.g:5868:1: entryRuleQoSMetricReference returns [EObject current=null] : iv_ruleQoSMetricReference= ruleQoSMetricReference EOF ;
    public final EObject entryRuleQoSMetricReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQoSMetricReference = null;


        try {
            // InternalAsyncApi.g:5868:59: (iv_ruleQoSMetricReference= ruleQoSMetricReference EOF )
            // InternalAsyncApi.g:5869:2: iv_ruleQoSMetricReference= ruleQoSMetricReference EOF
            {
             newCompositeNode(grammarAccess.getQoSMetricReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQoSMetricReference=ruleQoSMetricReference();

            state._fsp--;

             current =iv_ruleQoSMetricReference; 
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
    // $ANTLR end "entryRuleQoSMetricReference"


    // $ANTLR start "ruleQoSMetricReference"
    // InternalAsyncApi.g:5875:1: ruleQoSMetricReference returns [EObject current=null] : ( ( ruleAnyString ) ) ;
    public final EObject ruleQoSMetricReference() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalAsyncApi.g:5881:2: ( ( ( ruleAnyString ) ) )
            // InternalAsyncApi.g:5882:2: ( ( ruleAnyString ) )
            {
            // InternalAsyncApi.g:5882:2: ( ( ruleAnyString ) )
            // InternalAsyncApi.g:5883:3: ( ruleAnyString )
            {
            // InternalAsyncApi.g:5883:3: ( ruleAnyString )
            // InternalAsyncApi.g:5884:4: ruleAnyString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getQoSMetricReferenceRule());
            				}
            			

            				newCompositeNode(grammarAccess.getQoSMetricReferenceAccess().getMetricQoSMetricCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleAnyString();

            state._fsp--;


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
    // $ANTLR end "ruleQoSMetricReference"


    // $ANTLR start "entryRuleQoSMetric"
    // InternalAsyncApi.g:5901:1: entryRuleQoSMetric returns [EObject current=null] : iv_ruleQoSMetric= ruleQoSMetric EOF ;
    public final EObject entryRuleQoSMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQoSMetric = null;


        try {
            // InternalAsyncApi.g:5901:50: (iv_ruleQoSMetric= ruleQoSMetric EOF )
            // InternalAsyncApi.g:5902:2: iv_ruleQoSMetric= ruleQoSMetric EOF
            {
             newCompositeNode(grammarAccess.getQoSMetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQoSMetric=ruleQoSMetric();

            state._fsp--;

             current =iv_ruleQoSMetric; 
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
    // $ANTLR end "entryRuleQoSMetric"


    // $ANTLR start "ruleQoSMetric"
    // InternalAsyncApi.g:5908:1: ruleQoSMetric returns [EObject current=null] : (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) ) ) )+ {...}?) ) ) (this_DerivedQoSMetric_22= ruleDerivedQoSMetric )? otherlv_23= '}' ) ;
    public final EObject ruleQoSMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_metricType_8_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        Enumerator lv_unit_16_0 = null;

        Enumerator lv_groupedByMessage_20_0 = null;

        EObject this_DerivedQoSMetric_22 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:5914:2: ( (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) ) ) )+ {...}?) ) ) (this_DerivedQoSMetric_22= ruleDerivedQoSMetric )? otherlv_23= '}' ) )
            // InternalAsyncApi.g:5915:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) ) ) )+ {...}?) ) ) (this_DerivedQoSMetric_22= ruleDerivedQoSMetric )? otherlv_23= '}' )
            {
            // InternalAsyncApi.g:5915:2: (otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) ) ) )+ {...}?) ) ) (this_DerivedQoSMetric_22= ruleDerivedQoSMetric )? otherlv_23= '}' )
            // InternalAsyncApi.g:5916:3: otherlv_0= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) ) ) )+ {...}?) ) ) (this_DerivedQoSMetric_22= ruleDerivedQoSMetric )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,8,FOLLOW_54); 

            			newLeafNode(otherlv_0, grammarAccess.getQoSMetricAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalAsyncApi.g:5920:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:5921:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:5921:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:5922:5: ( ( ({...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1());
            				
            // InternalAsyncApi.g:5925:5: ( ( ({...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:5926:6: ( ({...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:5926:6: ( ({...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) ) ) )+
            int cnt126=0;
            loop126:
            do {
                int alt126=6;
                int LA126_0 = input.LA(1);

                if ( LA126_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 0) ) {
                    alt126=1;
                }
                else if ( LA126_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 1) ) {
                    alt126=2;
                }
                else if ( LA126_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 2) ) {
                    alt126=3;
                }
                else if ( LA126_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 3) ) {
                    alt126=4;
                }
                else if ( LA126_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 4) ) {
                    alt126=5;
                }


                switch (alt126) {
            	case 1 :
            	    // InternalAsyncApi.g:5927:4: ({...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:5927:4: ({...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:5928:5: {...}? => ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQoSMetric", "getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalAsyncApi.g:5928:106: ( ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) ) )
            	    // InternalAsyncApi.g:5929:6: ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalAsyncApi.g:5932:9: ({...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? ) )
            	    // InternalAsyncApi.g:5932:10: {...}? => (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQoSMetric", "true");
            	    }
            	    // InternalAsyncApi.g:5932:19: (otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )? )
            	    // InternalAsyncApi.g:5932:20: otherlv_2= '\"name\"' otherlv_3= ':' ( (lv_name_4_0= ruleAnyString ) ) (otherlv_5= ',' )?
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_4); 

            	    									newLeafNode(otherlv_2, grammarAccess.getQoSMetricAccess().getNameKeyword_1_0_0());
            	    								
            	    otherlv_3=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_3, grammarAccess.getQoSMetricAccess().getColonKeyword_1_0_1());
            	    								
            	    // InternalAsyncApi.g:5940:9: ( (lv_name_4_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:5941:10: (lv_name_4_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:5941:10: (lv_name_4_0= ruleAnyString )
            	    // InternalAsyncApi.g:5942:11: lv_name_4_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getQoSMetricAccess().getNameAnyStringParserRuleCall_1_0_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
            	    lv_name_4_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getQoSMetricRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_4_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:5959:9: (otherlv_5= ',' )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==11) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // InternalAsyncApi.g:5960:10: otherlv_5= ','
            	            {
            	            otherlv_5=(Token)match(input,11,FOLLOW_56); 

            	            										newLeafNode(otherlv_5, grammarAccess.getQoSMetricAccess().getCommaKeyword_1_0_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:5971:4: ({...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:5971:4: ({...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:5972:5: {...}? => ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQoSMetric", "getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalAsyncApi.g:5972:106: ( ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) ) )
            	    // InternalAsyncApi.g:5973:6: ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalAsyncApi.g:5976:9: ({...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? ) )
            	    // InternalAsyncApi.g:5976:10: {...}? => (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQoSMetric", "true");
            	    }
            	    // InternalAsyncApi.g:5976:19: (otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )? )
            	    // InternalAsyncApi.g:5976:20: otherlv_6= '\"metricType\"' otherlv_7= ':' ( (lv_metricType_8_0= ruleQoSMetricName ) ) (otherlv_9= ',' )?
            	    {
            	    otherlv_6=(Token)match(input,66,FOLLOW_4); 

            	    									newLeafNode(otherlv_6, grammarAccess.getQoSMetricAccess().getMetricTypeKeyword_1_1_0());
            	    								
            	    otherlv_7=(Token)match(input,10,FOLLOW_57); 

            	    									newLeafNode(otherlv_7, grammarAccess.getQoSMetricAccess().getColonKeyword_1_1_1());
            	    								
            	    // InternalAsyncApi.g:5984:9: ( (lv_metricType_8_0= ruleQoSMetricName ) )
            	    // InternalAsyncApi.g:5985:10: (lv_metricType_8_0= ruleQoSMetricName )
            	    {
            	    // InternalAsyncApi.g:5985:10: (lv_metricType_8_0= ruleQoSMetricName )
            	    // InternalAsyncApi.g:5986:11: lv_metricType_8_0= ruleQoSMetricName
            	    {

            	    											newCompositeNode(grammarAccess.getQoSMetricAccess().getMetricTypeQoSMetricNameEnumRuleCall_1_1_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
            	    lv_metricType_8_0=ruleQoSMetricName();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getQoSMetricRule());
            	    											}
            	    											set(
            	    												current,
            	    												"metricType",
            	    												lv_metricType_8_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.QoSMetricName");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:6003:9: (otherlv_9= ',' )?
            	    int alt122=2;
            	    int LA122_0 = input.LA(1);

            	    if ( (LA122_0==11) ) {
            	        alt122=1;
            	    }
            	    switch (alt122) {
            	        case 1 :
            	            // InternalAsyncApi.g:6004:10: otherlv_9= ','
            	            {
            	            otherlv_9=(Token)match(input,11,FOLLOW_56); 

            	            										newLeafNode(otherlv_9, grammarAccess.getQoSMetricAccess().getCommaKeyword_1_1_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:6015:4: ({...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:6015:4: ({...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:6016:5: {...}? => ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleQoSMetric", "getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalAsyncApi.g:6016:106: ( ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) ) )
            	    // InternalAsyncApi.g:6017:6: ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalAsyncApi.g:6020:9: ({...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? ) )
            	    // InternalAsyncApi.g:6020:10: {...}? => (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQoSMetric", "true");
            	    }
            	    // InternalAsyncApi.g:6020:19: (otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )? )
            	    // InternalAsyncApi.g:6020:20: otherlv_10= '\"description\"' otherlv_11= ':' ( (lv_description_12_0= ruleAnyString ) ) (otherlv_13= ',' )?
            	    {
            	    otherlv_10=(Token)match(input,20,FOLLOW_4); 

            	    									newLeafNode(otherlv_10, grammarAccess.getQoSMetricAccess().getDescriptionKeyword_1_2_0());
            	    								
            	    otherlv_11=(Token)match(input,10,FOLLOW_9); 

            	    									newLeafNode(otherlv_11, grammarAccess.getQoSMetricAccess().getColonKeyword_1_2_1());
            	    								
            	    // InternalAsyncApi.g:6028:9: ( (lv_description_12_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:6029:10: (lv_description_12_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:6029:10: (lv_description_12_0= ruleAnyString )
            	    // InternalAsyncApi.g:6030:11: lv_description_12_0= ruleAnyString
            	    {

            	    											newCompositeNode(grammarAccess.getQoSMetricAccess().getDescriptionAnyStringParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
            	    lv_description_12_0=ruleAnyString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getQoSMetricRule());
            	    											}
            	    											set(
            	    												current,
            	    												"description",
            	    												lv_description_12_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:6047:9: (otherlv_13= ',' )?
            	    int alt123=2;
            	    int LA123_0 = input.LA(1);

            	    if ( (LA123_0==11) ) {
            	        alt123=1;
            	    }
            	    switch (alt123) {
            	        case 1 :
            	            // InternalAsyncApi.g:6048:10: otherlv_13= ','
            	            {
            	            otherlv_13=(Token)match(input,11,FOLLOW_56); 

            	            										newLeafNode(otherlv_13, grammarAccess.getQoSMetricAccess().getCommaKeyword_1_2_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAsyncApi.g:6059:4: ({...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:6059:4: ({...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:6060:5: {...}? => ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleQoSMetric", "getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalAsyncApi.g:6060:106: ( ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) ) )
            	    // InternalAsyncApi.g:6061:6: ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalAsyncApi.g:6064:9: ({...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? ) )
            	    // InternalAsyncApi.g:6064:10: {...}? => (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQoSMetric", "true");
            	    }
            	    // InternalAsyncApi.g:6064:19: (otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )? )
            	    // InternalAsyncApi.g:6064:20: otherlv_14= '\"unit\"' otherlv_15= ':' ( (lv_unit_16_0= ruleQoSMetricUnit ) ) (otherlv_17= ',' )?
            	    {
            	    otherlv_14=(Token)match(input,67,FOLLOW_4); 

            	    									newLeafNode(otherlv_14, grammarAccess.getQoSMetricAccess().getUnitKeyword_1_3_0());
            	    								
            	    otherlv_15=(Token)match(input,10,FOLLOW_58); 

            	    									newLeafNode(otherlv_15, grammarAccess.getQoSMetricAccess().getColonKeyword_1_3_1());
            	    								
            	    // InternalAsyncApi.g:6072:9: ( (lv_unit_16_0= ruleQoSMetricUnit ) )
            	    // InternalAsyncApi.g:6073:10: (lv_unit_16_0= ruleQoSMetricUnit )
            	    {
            	    // InternalAsyncApi.g:6073:10: (lv_unit_16_0= ruleQoSMetricUnit )
            	    // InternalAsyncApi.g:6074:11: lv_unit_16_0= ruleQoSMetricUnit
            	    {

            	    											newCompositeNode(grammarAccess.getQoSMetricAccess().getUnitQoSMetricUnitEnumRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
            	    lv_unit_16_0=ruleQoSMetricUnit();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getQoSMetricRule());
            	    											}
            	    											set(
            	    												current,
            	    												"unit",
            	    												lv_unit_16_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.QoSMetricUnit");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:6091:9: (otherlv_17= ',' )?
            	    int alt124=2;
            	    int LA124_0 = input.LA(1);

            	    if ( (LA124_0==11) ) {
            	        alt124=1;
            	    }
            	    switch (alt124) {
            	        case 1 :
            	            // InternalAsyncApi.g:6092:10: otherlv_17= ','
            	            {
            	            otherlv_17=(Token)match(input,11,FOLLOW_56); 

            	            										newLeafNode(otherlv_17, grammarAccess.getQoSMetricAccess().getCommaKeyword_1_3_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAsyncApi.g:6103:4: ({...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:6103:4: ({...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:6104:5: {...}? => ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleQoSMetric", "getUnorderedGroupHelper().canSelect(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalAsyncApi.g:6104:106: ( ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) ) )
            	    // InternalAsyncApi.g:6105:6: ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalAsyncApi.g:6108:9: ({...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? ) )
            	    // InternalAsyncApi.g:6108:10: {...}? => (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQoSMetric", "true");
            	    }
            	    // InternalAsyncApi.g:6108:19: (otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )? )
            	    // InternalAsyncApi.g:6108:20: otherlv_18= '\"groupedByMessage\"' otherlv_19= ':' ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) ) (otherlv_21= ',' )?
            	    {
            	    otherlv_18=(Token)match(input,68,FOLLOW_4); 

            	    									newLeafNode(otherlv_18, grammarAccess.getQoSMetricAccess().getGroupedByMessageKeyword_1_4_0());
            	    								
            	    otherlv_19=(Token)match(input,10,FOLLOW_59); 

            	    									newLeafNode(otherlv_19, grammarAccess.getQoSMetricAccess().getColonKeyword_1_4_1());
            	    								
            	    // InternalAsyncApi.g:6116:9: ( (lv_groupedByMessage_20_0= ruleAggregationFunction ) )
            	    // InternalAsyncApi.g:6117:10: (lv_groupedByMessage_20_0= ruleAggregationFunction )
            	    {
            	    // InternalAsyncApi.g:6117:10: (lv_groupedByMessage_20_0= ruleAggregationFunction )
            	    // InternalAsyncApi.g:6118:11: lv_groupedByMessage_20_0= ruleAggregationFunction
            	    {

            	    											newCompositeNode(grammarAccess.getQoSMetricAccess().getGroupedByMessageAggregationFunctionEnumRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
            	    lv_groupedByMessage_20_0=ruleAggregationFunction();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getQoSMetricRule());
            	    											}
            	    											set(
            	    												current,
            	    												"groupedByMessage",
            	    												lv_groupedByMessage_20_0,
            	    												"io.github.abelgomez.asyncapi.AsyncApi.AggregationFunction");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalAsyncApi.g:6135:9: (otherlv_21= ',' )?
            	    int alt125=2;
            	    int LA125_0 = input.LA(1);

            	    if ( (LA125_0==11) ) {
            	        alt125=1;
            	    }
            	    switch (alt125) {
            	        case 1 :
            	            // InternalAsyncApi.g:6136:10: otherlv_21= ','
            	            {
            	            otherlv_21=(Token)match(input,11,FOLLOW_56); 

            	            										newLeafNode(otherlv_21, grammarAccess.getQoSMetricAccess().getCommaKeyword_1_4_3());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt126 >= 1 ) break loop126;
                        EarlyExitException eee =
                            new EarlyExitException(126, input);
                        throw eee;
                }
                cnt126++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "ruleQoSMetric", "getUnorderedGroupHelper().canLeave(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getQoSMetricAccess().getUnorderedGroup_1());
            				

            }

            // InternalAsyncApi.g:6155:3: (this_DerivedQoSMetric_22= ruleDerivedQoSMetric )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==69) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // InternalAsyncApi.g:6156:4: this_DerivedQoSMetric_22= ruleDerivedQoSMetric
                    {

                    				newCompositeNode(grammarAccess.getQoSMetricAccess().getDerivedQoSMetricParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_53);
                    this_DerivedQoSMetric_22=ruleDerivedQoSMetric();

                    state._fsp--;


                    				current = this_DerivedQoSMetric_22;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getQoSMetricAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleQoSMetric"


    // $ANTLR start "entryRuleDerivedQoSMetric"
    // InternalAsyncApi.g:6173:1: entryRuleDerivedQoSMetric returns [EObject current=null] : iv_ruleDerivedQoSMetric= ruleDerivedQoSMetric EOF ;
    public final EObject entryRuleDerivedQoSMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDerivedQoSMetric = null;


        try {
            // InternalAsyncApi.g:6173:57: (iv_ruleDerivedQoSMetric= ruleDerivedQoSMetric EOF )
            // InternalAsyncApi.g:6174:2: iv_ruleDerivedQoSMetric= ruleDerivedQoSMetric EOF
            {
             newCompositeNode(grammarAccess.getDerivedQoSMetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDerivedQoSMetric=ruleDerivedQoSMetric();

            state._fsp--;

             current =iv_ruleDerivedQoSMetric; 
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
    // $ANTLR end "entryRuleDerivedQoSMetric"


    // $ANTLR start "ruleDerivedQoSMetric"
    // InternalAsyncApi.g:6180:1: ruleDerivedQoSMetric returns [EObject current=null] : ( () (otherlv_1= '\"derivedQoSMetricDefinition\"' otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) ) ;
    public final EObject ruleDerivedQoSMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_window_7_0 = null;

        Enumerator lv_windowUnit_11_0 = null;

        Enumerator lv_aggregationFunction_15_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:6186:2: ( ( () (otherlv_1= '\"derivedQoSMetricDefinition\"' otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) ) )
            // InternalAsyncApi.g:6187:2: ( () (otherlv_1= '\"derivedQoSMetricDefinition\"' otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) )
            {
            // InternalAsyncApi.g:6187:2: ( () (otherlv_1= '\"derivedQoSMetricDefinition\"' otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) )
            // InternalAsyncApi.g:6188:3: () (otherlv_1= '\"derivedQoSMetricDefinition\"' otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' )
            {
            // InternalAsyncApi.g:6188:3: ()
            // InternalAsyncApi.g:6189:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDerivedQoSMetricAccess().getDerivedQoSMetricAction_0(),
            					current);
            			

            }

            // InternalAsyncApi.g:6195:3: (otherlv_1= '\"derivedQoSMetricDefinition\"' otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' )
            // InternalAsyncApi.g:6196:4: otherlv_1= '\"derivedQoSMetricDefinition\"' otherlv_2= ':' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) ) )+ {...}?) ) ) otherlv_17= '}'
            {
            otherlv_1=(Token)match(input,69,FOLLOW_4); 

            				newLeafNode(otherlv_1, grammarAccess.getDerivedQoSMetricAccess().getDerivedQoSMetricDefinitionKeyword_1_0());
            			
            otherlv_2=(Token)match(input,10,FOLLOW_8); 

            				newLeafNode(otherlv_2, grammarAccess.getDerivedQoSMetricAccess().getColonKeyword_1_1());
            			
            otherlv_3=(Token)match(input,8,FOLLOW_60); 

            				newLeafNode(otherlv_3, grammarAccess.getDerivedQoSMetricAccess().getLeftCurlyBracketKeyword_1_2());
            			
            // InternalAsyncApi.g:6208:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) ) )+ {...}?) ) )
            // InternalAsyncApi.g:6209:5: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) ) )+ {...}?) )
            {
            // InternalAsyncApi.g:6209:5: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) ) )+ {...}?) )
            // InternalAsyncApi.g:6210:6: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) ) )+ {...}?)
            {
             
            					  getUnorderedGroupHelper().enter(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3());
            					
            // InternalAsyncApi.g:6213:6: ( ( ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) ) )+ {...}?)
            // InternalAsyncApi.g:6214:7: ( ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) ) )+ {...}?
            {
            // InternalAsyncApi.g:6214:7: ( ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) ) )+
            int cnt131=0;
            loop131:
            do {
                int alt131=4;
                int LA131_0 = input.LA(1);

                if ( LA131_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3(), 0) ) {
                    alt131=1;
                }
                else if ( LA131_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3(), 1) ) {
                    alt131=2;
                }
                else if ( LA131_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3(), 2) ) {
                    alt131=3;
                }


                switch (alt131) {
            	case 1 :
            	    // InternalAsyncApi.g:6215:5: ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:6215:5: ({...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:6216:6: {...}? => ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedQoSMetric", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3(), 0)");
            	    }
            	    // InternalAsyncApi.g:6216:116: ( ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) ) )
            	    // InternalAsyncApi.g:6217:7: ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3(), 0);
            	    						
            	    // InternalAsyncApi.g:6220:10: ({...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? ) )
            	    // InternalAsyncApi.g:6220:11: {...}? => (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedQoSMetric", "true");
            	    }
            	    // InternalAsyncApi.g:6220:20: (otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )? )
            	    // InternalAsyncApi.g:6220:21: otherlv_5= '\"window\"' otherlv_6= ':' ( (lv_window_7_0= ruleAnyString ) ) (otherlv_8= ',' )?
            	    {
            	    otherlv_5=(Token)match(input,70,FOLLOW_4); 

            	    										newLeafNode(otherlv_5, grammarAccess.getDerivedQoSMetricAccess().getWindowKeyword_1_3_0_0());
            	    									
            	    otherlv_6=(Token)match(input,10,FOLLOW_9); 

            	    										newLeafNode(otherlv_6, grammarAccess.getDerivedQoSMetricAccess().getColonKeyword_1_3_0_1());
            	    									
            	    // InternalAsyncApi.g:6228:10: ( (lv_window_7_0= ruleAnyString ) )
            	    // InternalAsyncApi.g:6229:11: (lv_window_7_0= ruleAnyString )
            	    {
            	    // InternalAsyncApi.g:6229:11: (lv_window_7_0= ruleAnyString )
            	    // InternalAsyncApi.g:6230:12: lv_window_7_0= ruleAnyString
            	    {

            	    												newCompositeNode(grammarAccess.getDerivedQoSMetricAccess().getWindowAnyStringParserRuleCall_1_3_0_2_0());
            	    											
            	    pushFollow(FOLLOW_61);
            	    lv_window_7_0=ruleAnyString();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getDerivedQoSMetricRule());
            	    												}
            	    												set(
            	    													current,
            	    													"window",
            	    													lv_window_7_0,
            	    													"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalAsyncApi.g:6247:10: (otherlv_8= ',' )?
            	    int alt128=2;
            	    int LA128_0 = input.LA(1);

            	    if ( (LA128_0==11) ) {
            	        alt128=1;
            	    }
            	    switch (alt128) {
            	        case 1 :
            	            // InternalAsyncApi.g:6248:11: otherlv_8= ','
            	            {
            	            otherlv_8=(Token)match(input,11,FOLLOW_62); 

            	            											newLeafNode(otherlv_8, grammarAccess.getDerivedQoSMetricAccess().getCommaKeyword_1_3_0_3());
            	            										

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3());
            	    						

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAsyncApi.g:6259:5: ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:6259:5: ({...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:6260:6: {...}? => ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedQoSMetric", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3(), 1)");
            	    }
            	    // InternalAsyncApi.g:6260:116: ( ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) ) )
            	    // InternalAsyncApi.g:6261:7: ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3(), 1);
            	    						
            	    // InternalAsyncApi.g:6264:10: ({...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? ) )
            	    // InternalAsyncApi.g:6264:11: {...}? => (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedQoSMetric", "true");
            	    }
            	    // InternalAsyncApi.g:6264:20: (otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )? )
            	    // InternalAsyncApi.g:6264:21: otherlv_9= '\"windowUnit\"' otherlv_10= ':' ( (lv_windowUnit_11_0= ruleWindowUnit ) ) (otherlv_12= ',' )?
            	    {
            	    otherlv_9=(Token)match(input,71,FOLLOW_4); 

            	    										newLeafNode(otherlv_9, grammarAccess.getDerivedQoSMetricAccess().getWindowUnitKeyword_1_3_1_0());
            	    									
            	    otherlv_10=(Token)match(input,10,FOLLOW_63); 

            	    										newLeafNode(otherlv_10, grammarAccess.getDerivedQoSMetricAccess().getColonKeyword_1_3_1_1());
            	    									
            	    // InternalAsyncApi.g:6272:10: ( (lv_windowUnit_11_0= ruleWindowUnit ) )
            	    // InternalAsyncApi.g:6273:11: (lv_windowUnit_11_0= ruleWindowUnit )
            	    {
            	    // InternalAsyncApi.g:6273:11: (lv_windowUnit_11_0= ruleWindowUnit )
            	    // InternalAsyncApi.g:6274:12: lv_windowUnit_11_0= ruleWindowUnit
            	    {

            	    												newCompositeNode(grammarAccess.getDerivedQoSMetricAccess().getWindowUnitWindowUnitEnumRuleCall_1_3_1_2_0());
            	    											
            	    pushFollow(FOLLOW_61);
            	    lv_windowUnit_11_0=ruleWindowUnit();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getDerivedQoSMetricRule());
            	    												}
            	    												set(
            	    													current,
            	    													"windowUnit",
            	    													lv_windowUnit_11_0,
            	    													"io.github.abelgomez.asyncapi.AsyncApi.WindowUnit");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalAsyncApi.g:6291:10: (otherlv_12= ',' )?
            	    int alt129=2;
            	    int LA129_0 = input.LA(1);

            	    if ( (LA129_0==11) ) {
            	        alt129=1;
            	    }
            	    switch (alt129) {
            	        case 1 :
            	            // InternalAsyncApi.g:6292:11: otherlv_12= ','
            	            {
            	            otherlv_12=(Token)match(input,11,FOLLOW_62); 

            	            											newLeafNode(otherlv_12, grammarAccess.getDerivedQoSMetricAccess().getCommaKeyword_1_3_1_3());
            	            										

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3());
            	    						

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAsyncApi.g:6303:5: ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) )
            	    {
            	    // InternalAsyncApi.g:6303:5: ({...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) ) )
            	    // InternalAsyncApi.g:6304:6: {...}? => ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedQoSMetric", "getUnorderedGroupHelper().canSelect(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3(), 2)");
            	    }
            	    // InternalAsyncApi.g:6304:116: ( ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) ) )
            	    // InternalAsyncApi.g:6305:7: ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) )
            	    {

            	    							getUnorderedGroupHelper().select(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3(), 2);
            	    						
            	    // InternalAsyncApi.g:6308:10: ({...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? ) )
            	    // InternalAsyncApi.g:6308:11: {...}? => (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDerivedQoSMetric", "true");
            	    }
            	    // InternalAsyncApi.g:6308:20: (otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )? )
            	    // InternalAsyncApi.g:6308:21: otherlv_13= '\"aggregationFunction\"' otherlv_14= ':' ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) ) (otherlv_16= ',' )?
            	    {
            	    otherlv_13=(Token)match(input,72,FOLLOW_4); 

            	    										newLeafNode(otherlv_13, grammarAccess.getDerivedQoSMetricAccess().getAggregationFunctionKeyword_1_3_2_0());
            	    									
            	    otherlv_14=(Token)match(input,10,FOLLOW_59); 

            	    										newLeafNode(otherlv_14, grammarAccess.getDerivedQoSMetricAccess().getColonKeyword_1_3_2_1());
            	    									
            	    // InternalAsyncApi.g:6316:10: ( (lv_aggregationFunction_15_0= ruleAggregationFunction ) )
            	    // InternalAsyncApi.g:6317:11: (lv_aggregationFunction_15_0= ruleAggregationFunction )
            	    {
            	    // InternalAsyncApi.g:6317:11: (lv_aggregationFunction_15_0= ruleAggregationFunction )
            	    // InternalAsyncApi.g:6318:12: lv_aggregationFunction_15_0= ruleAggregationFunction
            	    {

            	    												newCompositeNode(grammarAccess.getDerivedQoSMetricAccess().getAggregationFunctionAggregationFunctionEnumRuleCall_1_3_2_2_0());
            	    											
            	    pushFollow(FOLLOW_61);
            	    lv_aggregationFunction_15_0=ruleAggregationFunction();

            	    state._fsp--;


            	    												if (current==null) {
            	    													current = createModelElementForParent(grammarAccess.getDerivedQoSMetricRule());
            	    												}
            	    												set(
            	    													current,
            	    													"aggregationFunction",
            	    													lv_aggregationFunction_15_0,
            	    													"io.github.abelgomez.asyncapi.AsyncApi.AggregationFunction");
            	    												afterParserOrEnumRuleCall();
            	    											

            	    }


            	    }

            	    // InternalAsyncApi.g:6335:10: (otherlv_16= ',' )?
            	    int alt130=2;
            	    int LA130_0 = input.LA(1);

            	    if ( (LA130_0==11) ) {
            	        alt130=1;
            	    }
            	    switch (alt130) {
            	        case 1 :
            	            // InternalAsyncApi.g:6336:11: otherlv_16= ','
            	            {
            	            otherlv_16=(Token)match(input,11,FOLLOW_62); 

            	            											newLeafNode(otherlv_16, grammarAccess.getDerivedQoSMetricAccess().getCommaKeyword_1_3_2_3());
            	            										

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt131 >= 1 ) break loop131;
                        EarlyExitException eee =
                            new EarlyExitException(131, input);
                        throw eee;
                }
                cnt131++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3()) ) {
                throw new FailedPredicateException(input, "ruleDerivedQoSMetric", "getUnorderedGroupHelper().canLeave(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3())");
            }

            }


            }

             
            					  getUnorderedGroupHelper().leave(grammarAccess.getDerivedQoSMetricAccess().getUnorderedGroup_1_3());
            					

            }

            otherlv_17=(Token)match(input,14,FOLLOW_2); 

            				newLeafNode(otherlv_17, grammarAccess.getDerivedQoSMetricAccess().getRightCurlyBracketKeyword_1_4());
            			

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
    // $ANTLR end "ruleDerivedQoSMetric"


    // $ANTLR start "entryRuleBooleanCondition"
    // InternalAsyncApi.g:6364:1: entryRuleBooleanCondition returns [EObject current=null] : iv_ruleBooleanCondition= ruleBooleanCondition EOF ;
    public final EObject entryRuleBooleanCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanCondition = null;


        try {
            // InternalAsyncApi.g:6364:57: (iv_ruleBooleanCondition= ruleBooleanCondition EOF )
            // InternalAsyncApi.g:6365:2: iv_ruleBooleanCondition= ruleBooleanCondition EOF
            {
             newCompositeNode(grammarAccess.getBooleanConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanCondition=ruleBooleanCondition();

            state._fsp--;

             current =iv_ruleBooleanCondition; 
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
    // $ANTLR end "entryRuleBooleanCondition"


    // $ANTLR start "ruleBooleanCondition"
    // InternalAsyncApi.g:6371:1: ruleBooleanCondition returns [EObject current=null] : (this_ANDCondition_0= ruleANDCondition | this_ORCondition_1= ruleORCondition | this_AtomicBooleanCondition_2= ruleAtomicBooleanCondition ) ;
    public final EObject ruleBooleanCondition() throws RecognitionException {
        EObject current = null;

        EObject this_ANDCondition_0 = null;

        EObject this_ORCondition_1 = null;

        EObject this_AtomicBooleanCondition_2 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:6377:2: ( (this_ANDCondition_0= ruleANDCondition | this_ORCondition_1= ruleORCondition | this_AtomicBooleanCondition_2= ruleAtomicBooleanCondition ) )
            // InternalAsyncApi.g:6378:2: (this_ANDCondition_0= ruleANDCondition | this_ORCondition_1= ruleORCondition | this_AtomicBooleanCondition_2= ruleAtomicBooleanCondition )
            {
            // InternalAsyncApi.g:6378:2: (this_ANDCondition_0= ruleANDCondition | this_ORCondition_1= ruleORCondition | this_AtomicBooleanCondition_2= ruleAtomicBooleanCondition )
            int alt132=3;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==8) ) {
                switch ( input.LA(2) ) {
                case 74:
                    {
                    alt132=2;
                    }
                    break;
                case 73:
                    {
                    alt132=1;
                    }
                    break;
                case 75:
                    {
                    alt132=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 132, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // InternalAsyncApi.g:6379:3: this_ANDCondition_0= ruleANDCondition
                    {

                    			newCompositeNode(grammarAccess.getBooleanConditionAccess().getANDConditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ANDCondition_0=ruleANDCondition();

                    state._fsp--;


                    			current = this_ANDCondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:6388:3: this_ORCondition_1= ruleORCondition
                    {

                    			newCompositeNode(grammarAccess.getBooleanConditionAccess().getORConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ORCondition_1=ruleORCondition();

                    state._fsp--;


                    			current = this_ORCondition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:6397:3: this_AtomicBooleanCondition_2= ruleAtomicBooleanCondition
                    {

                    			newCompositeNode(grammarAccess.getBooleanConditionAccess().getAtomicBooleanConditionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomicBooleanCondition_2=ruleAtomicBooleanCondition();

                    state._fsp--;


                    			current = this_AtomicBooleanCondition_2;
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
    // $ANTLR end "ruleBooleanCondition"


    // $ANTLR start "entryRuleANDCondition"
    // InternalAsyncApi.g:6409:1: entryRuleANDCondition returns [EObject current=null] : iv_ruleANDCondition= ruleANDCondition EOF ;
    public final EObject entryRuleANDCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleANDCondition = null;


        try {
            // InternalAsyncApi.g:6409:53: (iv_ruleANDCondition= ruleANDCondition EOF )
            // InternalAsyncApi.g:6410:2: iv_ruleANDCondition= ruleANDCondition EOF
            {
             newCompositeNode(grammarAccess.getANDConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleANDCondition=ruleANDCondition();

            state._fsp--;

             current =iv_ruleANDCondition; 
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
    // $ANTLR end "entryRuleANDCondition"


    // $ANTLR start "ruleANDCondition"
    // InternalAsyncApi.g:6416:1: ruleANDCondition returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"AND\"' otherlv_3= ':' otherlv_4= '[' ( (lv_conditions_5_0= ruleBooleanCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleBooleanCondition ) ) )* otherlv_8= ']' otherlv_9= '}' ) ;
    public final EObject ruleANDCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_conditions_5_0 = null;

        EObject lv_conditions_7_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:6422:2: ( ( () otherlv_1= '{' otherlv_2= '\"AND\"' otherlv_3= ':' otherlv_4= '[' ( (lv_conditions_5_0= ruleBooleanCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleBooleanCondition ) ) )* otherlv_8= ']' otherlv_9= '}' ) )
            // InternalAsyncApi.g:6423:2: ( () otherlv_1= '{' otherlv_2= '\"AND\"' otherlv_3= ':' otherlv_4= '[' ( (lv_conditions_5_0= ruleBooleanCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleBooleanCondition ) ) )* otherlv_8= ']' otherlv_9= '}' )
            {
            // InternalAsyncApi.g:6423:2: ( () otherlv_1= '{' otherlv_2= '\"AND\"' otherlv_3= ':' otherlv_4= '[' ( (lv_conditions_5_0= ruleBooleanCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleBooleanCondition ) ) )* otherlv_8= ']' otherlv_9= '}' )
            // InternalAsyncApi.g:6424:3: () otherlv_1= '{' otherlv_2= '\"AND\"' otherlv_3= ':' otherlv_4= '[' ( (lv_conditions_5_0= ruleBooleanCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleBooleanCondition ) ) )* otherlv_8= ']' otherlv_9= '}'
            {
            // InternalAsyncApi.g:6424:3: ()
            // InternalAsyncApi.g:6425:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getANDConditionAccess().getANDConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getANDConditionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,73,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getANDConditionAccess().getANDKeyword_2());
            		
            otherlv_3=(Token)match(input,10,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getANDConditionAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getANDConditionAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalAsyncApi.g:6447:3: ( (lv_conditions_5_0= ruleBooleanCondition ) )
            // InternalAsyncApi.g:6448:4: (lv_conditions_5_0= ruleBooleanCondition )
            {
            // InternalAsyncApi.g:6448:4: (lv_conditions_5_0= ruleBooleanCondition )
            // InternalAsyncApi.g:6449:5: lv_conditions_5_0= ruleBooleanCondition
            {

            					newCompositeNode(grammarAccess.getANDConditionAccess().getConditionsBooleanConditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_conditions_5_0=ruleBooleanCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getANDConditionRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_5_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.BooleanCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAsyncApi.g:6466:3: (otherlv_6= ',' ( (lv_conditions_7_0= ruleBooleanCondition ) ) )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==11) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // InternalAsyncApi.g:6467:4: otherlv_6= ',' ( (lv_conditions_7_0= ruleBooleanCondition ) )
            	    {
            	    otherlv_6=(Token)match(input,11,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getANDConditionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalAsyncApi.g:6471:4: ( (lv_conditions_7_0= ruleBooleanCondition ) )
            	    // InternalAsyncApi.g:6472:5: (lv_conditions_7_0= ruleBooleanCondition )
            	    {
            	    // InternalAsyncApi.g:6472:5: (lv_conditions_7_0= ruleBooleanCondition )
            	    // InternalAsyncApi.g:6473:6: lv_conditions_7_0= ruleBooleanCondition
            	    {

            	    						newCompositeNode(grammarAccess.getANDConditionAccess().getConditionsBooleanConditionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_conditions_7_0=ruleBooleanCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getANDConditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_7_0,
            	    							"io.github.abelgomez.asyncapi.AsyncApi.BooleanCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);

            otherlv_8=(Token)match(input,33,FOLLOW_53); 

            			newLeafNode(otherlv_8, grammarAccess.getANDConditionAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getANDConditionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleANDCondition"


    // $ANTLR start "entryRuleORCondition"
    // InternalAsyncApi.g:6503:1: entryRuleORCondition returns [EObject current=null] : iv_ruleORCondition= ruleORCondition EOF ;
    public final EObject entryRuleORCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleORCondition = null;


        try {
            // InternalAsyncApi.g:6503:52: (iv_ruleORCondition= ruleORCondition EOF )
            // InternalAsyncApi.g:6504:2: iv_ruleORCondition= ruleORCondition EOF
            {
             newCompositeNode(grammarAccess.getORConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleORCondition=ruleORCondition();

            state._fsp--;

             current =iv_ruleORCondition; 
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
    // $ANTLR end "entryRuleORCondition"


    // $ANTLR start "ruleORCondition"
    // InternalAsyncApi.g:6510:1: ruleORCondition returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"OR\"' otherlv_3= ':' otherlv_4= '[' ( (lv_conditions_5_0= ruleBooleanCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleBooleanCondition ) ) )* otherlv_8= ']' otherlv_9= '}' ) ;
    public final EObject ruleORCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_conditions_5_0 = null;

        EObject lv_conditions_7_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:6516:2: ( ( () otherlv_1= '{' otherlv_2= '\"OR\"' otherlv_3= ':' otherlv_4= '[' ( (lv_conditions_5_0= ruleBooleanCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleBooleanCondition ) ) )* otherlv_8= ']' otherlv_9= '}' ) )
            // InternalAsyncApi.g:6517:2: ( () otherlv_1= '{' otherlv_2= '\"OR\"' otherlv_3= ':' otherlv_4= '[' ( (lv_conditions_5_0= ruleBooleanCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleBooleanCondition ) ) )* otherlv_8= ']' otherlv_9= '}' )
            {
            // InternalAsyncApi.g:6517:2: ( () otherlv_1= '{' otherlv_2= '\"OR\"' otherlv_3= ':' otherlv_4= '[' ( (lv_conditions_5_0= ruleBooleanCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleBooleanCondition ) ) )* otherlv_8= ']' otherlv_9= '}' )
            // InternalAsyncApi.g:6518:3: () otherlv_1= '{' otherlv_2= '\"OR\"' otherlv_3= ':' otherlv_4= '[' ( (lv_conditions_5_0= ruleBooleanCondition ) ) (otherlv_6= ',' ( (lv_conditions_7_0= ruleBooleanCondition ) ) )* otherlv_8= ']' otherlv_9= '}'
            {
            // InternalAsyncApi.g:6518:3: ()
            // InternalAsyncApi.g:6519:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getORConditionAccess().getANDConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getORConditionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,74,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getORConditionAccess().getORKeyword_2());
            		
            otherlv_3=(Token)match(input,10,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getORConditionAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getORConditionAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalAsyncApi.g:6541:3: ( (lv_conditions_5_0= ruleBooleanCondition ) )
            // InternalAsyncApi.g:6542:4: (lv_conditions_5_0= ruleBooleanCondition )
            {
            // InternalAsyncApi.g:6542:4: (lv_conditions_5_0= ruleBooleanCondition )
            // InternalAsyncApi.g:6543:5: lv_conditions_5_0= ruleBooleanCondition
            {

            					newCompositeNode(grammarAccess.getORConditionAccess().getConditionsBooleanConditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_conditions_5_0=ruleBooleanCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getORConditionRule());
            					}
            					add(
            						current,
            						"conditions",
            						lv_conditions_5_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.BooleanCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAsyncApi.g:6560:3: (otherlv_6= ',' ( (lv_conditions_7_0= ruleBooleanCondition ) ) )*
            loop134:
            do {
                int alt134=2;
                int LA134_0 = input.LA(1);

                if ( (LA134_0==11) ) {
                    alt134=1;
                }


                switch (alt134) {
            	case 1 :
            	    // InternalAsyncApi.g:6561:4: otherlv_6= ',' ( (lv_conditions_7_0= ruleBooleanCondition ) )
            	    {
            	    otherlv_6=(Token)match(input,11,FOLLOW_8); 

            	    				newLeafNode(otherlv_6, grammarAccess.getORConditionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalAsyncApi.g:6565:4: ( (lv_conditions_7_0= ruleBooleanCondition ) )
            	    // InternalAsyncApi.g:6566:5: (lv_conditions_7_0= ruleBooleanCondition )
            	    {
            	    // InternalAsyncApi.g:6566:5: (lv_conditions_7_0= ruleBooleanCondition )
            	    // InternalAsyncApi.g:6567:6: lv_conditions_7_0= ruleBooleanCondition
            	    {

            	    						newCompositeNode(grammarAccess.getORConditionAccess().getConditionsBooleanConditionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_conditions_7_0=ruleBooleanCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getORConditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"conditions",
            	    							lv_conditions_7_0,
            	    							"io.github.abelgomez.asyncapi.AsyncApi.BooleanCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop134;
                }
            } while (true);

            otherlv_8=(Token)match(input,33,FOLLOW_53); 

            			newLeafNode(otherlv_8, grammarAccess.getORConditionAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getORConditionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleORCondition"


    // $ANTLR start "entryRuleAtomicBooleanCondition"
    // InternalAsyncApi.g:6597:1: entryRuleAtomicBooleanCondition returns [EObject current=null] : iv_ruleAtomicBooleanCondition= ruleAtomicBooleanCondition EOF ;
    public final EObject entryRuleAtomicBooleanCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicBooleanCondition = null;


        try {
            // InternalAsyncApi.g:6597:63: (iv_ruleAtomicBooleanCondition= ruleAtomicBooleanCondition EOF )
            // InternalAsyncApi.g:6598:2: iv_ruleAtomicBooleanCondition= ruleAtomicBooleanCondition EOF
            {
             newCompositeNode(grammarAccess.getAtomicBooleanConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicBooleanCondition=ruleAtomicBooleanCondition();

            state._fsp--;

             current =iv_ruleAtomicBooleanCondition; 
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
    // $ANTLR end "entryRuleAtomicBooleanCondition"


    // $ANTLR start "ruleAtomicBooleanCondition"
    // InternalAsyncApi.g:6604:1: ruleAtomicBooleanCondition returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"qosMetric\"' otherlv_3= ':' ( (lv_qosMetric_4_0= ruleAbstractQoSMetric ) ) otherlv_5= ',' otherlv_6= '\"operator\"' otherlv_7= ':' ( (lv_operator_8_0= ruleOperator ) ) otherlv_9= ',' otherlv_10= '\"value\"' otherlv_11= ':' ( (lv_value_12_0= ruleAnyString ) ) otherlv_13= '}' ) ;
    public final EObject ruleAtomicBooleanCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_qosMetric_4_0 = null;

        Enumerator lv_operator_8_0 = null;

        AntlrDatatypeRuleToken lv_value_12_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:6610:2: ( ( () otherlv_1= '{' otherlv_2= '\"qosMetric\"' otherlv_3= ':' ( (lv_qosMetric_4_0= ruleAbstractQoSMetric ) ) otherlv_5= ',' otherlv_6= '\"operator\"' otherlv_7= ':' ( (lv_operator_8_0= ruleOperator ) ) otherlv_9= ',' otherlv_10= '\"value\"' otherlv_11= ':' ( (lv_value_12_0= ruleAnyString ) ) otherlv_13= '}' ) )
            // InternalAsyncApi.g:6611:2: ( () otherlv_1= '{' otherlv_2= '\"qosMetric\"' otherlv_3= ':' ( (lv_qosMetric_4_0= ruleAbstractQoSMetric ) ) otherlv_5= ',' otherlv_6= '\"operator\"' otherlv_7= ':' ( (lv_operator_8_0= ruleOperator ) ) otherlv_9= ',' otherlv_10= '\"value\"' otherlv_11= ':' ( (lv_value_12_0= ruleAnyString ) ) otherlv_13= '}' )
            {
            // InternalAsyncApi.g:6611:2: ( () otherlv_1= '{' otherlv_2= '\"qosMetric\"' otherlv_3= ':' ( (lv_qosMetric_4_0= ruleAbstractQoSMetric ) ) otherlv_5= ',' otherlv_6= '\"operator\"' otherlv_7= ':' ( (lv_operator_8_0= ruleOperator ) ) otherlv_9= ',' otherlv_10= '\"value\"' otherlv_11= ':' ( (lv_value_12_0= ruleAnyString ) ) otherlv_13= '}' )
            // InternalAsyncApi.g:6612:3: () otherlv_1= '{' otherlv_2= '\"qosMetric\"' otherlv_3= ':' ( (lv_qosMetric_4_0= ruleAbstractQoSMetric ) ) otherlv_5= ',' otherlv_6= '\"operator\"' otherlv_7= ':' ( (lv_operator_8_0= ruleOperator ) ) otherlv_9= ',' otherlv_10= '\"value\"' otherlv_11= ':' ( (lv_value_12_0= ruleAnyString ) ) otherlv_13= '}'
            {
            // InternalAsyncApi.g:6612:3: ()
            // InternalAsyncApi.g:6613:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomicBooleanConditionAccess().getAtomicBooleanConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getAtomicBooleanConditionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,75,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAtomicBooleanConditionAccess().getQosMetricKeyword_2());
            		
            otherlv_3=(Token)match(input,10,FOLLOW_67); 

            			newLeafNode(otherlv_3, grammarAccess.getAtomicBooleanConditionAccess().getColonKeyword_3());
            		
            // InternalAsyncApi.g:6631:3: ( (lv_qosMetric_4_0= ruleAbstractQoSMetric ) )
            // InternalAsyncApi.g:6632:4: (lv_qosMetric_4_0= ruleAbstractQoSMetric )
            {
            // InternalAsyncApi.g:6632:4: (lv_qosMetric_4_0= ruleAbstractQoSMetric )
            // InternalAsyncApi.g:6633:5: lv_qosMetric_4_0= ruleAbstractQoSMetric
            {

            					newCompositeNode(grammarAccess.getAtomicBooleanConditionAccess().getQosMetricAbstractQoSMetricParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_50);
            lv_qosMetric_4_0=ruleAbstractQoSMetric();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicBooleanConditionRule());
            					}
            					set(
            						current,
            						"qosMetric",
            						lv_qosMetric_4_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AbstractQoSMetric");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_68); 

            			newLeafNode(otherlv_5, grammarAccess.getAtomicBooleanConditionAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,76,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getAtomicBooleanConditionAccess().getOperatorKeyword_6());
            		
            otherlv_7=(Token)match(input,10,FOLLOW_69); 

            			newLeafNode(otherlv_7, grammarAccess.getAtomicBooleanConditionAccess().getColonKeyword_7());
            		
            // InternalAsyncApi.g:6662:3: ( (lv_operator_8_0= ruleOperator ) )
            // InternalAsyncApi.g:6663:4: (lv_operator_8_0= ruleOperator )
            {
            // InternalAsyncApi.g:6663:4: (lv_operator_8_0= ruleOperator )
            // InternalAsyncApi.g:6664:5: lv_operator_8_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getAtomicBooleanConditionAccess().getOperatorOperatorEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_50);
            lv_operator_8_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicBooleanConditionRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_8_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,11,FOLLOW_70); 

            			newLeafNode(otherlv_9, grammarAccess.getAtomicBooleanConditionAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,77,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getAtomicBooleanConditionAccess().getValueKeyword_10());
            		
            otherlv_11=(Token)match(input,10,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getAtomicBooleanConditionAccess().getColonKeyword_11());
            		
            // InternalAsyncApi.g:6693:3: ( (lv_value_12_0= ruleAnyString ) )
            // InternalAsyncApi.g:6694:4: (lv_value_12_0= ruleAnyString )
            {
            // InternalAsyncApi.g:6694:4: (lv_value_12_0= ruleAnyString )
            // InternalAsyncApi.g:6695:5: lv_value_12_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getAtomicBooleanConditionAccess().getValueAnyStringParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_53);
            lv_value_12_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicBooleanConditionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_12_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAtomicBooleanConditionAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleAtomicBooleanCondition"


    // $ANTLR start "entryRuleReference"
    // InternalAsyncApi.g:6720:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalAsyncApi.g:6720:50: (iv_ruleReference= ruleReference EOF )
            // InternalAsyncApi.g:6721:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalAsyncApi.g:6727:1: ruleReference returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_uri_4_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:6733:2: ( ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' ) )
            // InternalAsyncApi.g:6734:2: ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' )
            {
            // InternalAsyncApi.g:6734:2: ( () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}' )
            // InternalAsyncApi.g:6735:3: () otherlv_1= '{' otherlv_2= '\"$ref\"' otherlv_3= ':' ( (lv_uri_4_0= ruleAnyString ) ) otherlv_5= '}'
            {
            // InternalAsyncApi.g:6735:3: ()
            // InternalAsyncApi.g:6736:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferenceAccess().getReferenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,8,FOLLOW_71); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,78,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getReferenceAccess().getRefKeyword_2());
            		
            otherlv_3=(Token)match(input,10,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getColonKeyword_3());
            		
            // InternalAsyncApi.g:6754:3: ( (lv_uri_4_0= ruleAnyString ) )
            // InternalAsyncApi.g:6755:4: (lv_uri_4_0= ruleAnyString )
            {
            // InternalAsyncApi.g:6755:4: (lv_uri_4_0= ruleAnyString )
            // InternalAsyncApi.g:6756:5: lv_uri_4_0= ruleAnyString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getUriAnyStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_53);
            lv_uri_4_0=ruleAnyString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"uri",
            						lv_uri_4_0,
            						"io.github.abelgomez.asyncapi.AsyncApi.AnyString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRulePrimitiveValue"
    // InternalAsyncApi.g:6781:1: entryRulePrimitiveValue returns [String current=null] : iv_rulePrimitiveValue= rulePrimitiveValue EOF ;
    public final String entryRulePrimitiveValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveValue = null;


        try {
            // InternalAsyncApi.g:6781:54: (iv_rulePrimitiveValue= rulePrimitiveValue EOF )
            // InternalAsyncApi.g:6782:2: iv_rulePrimitiveValue= rulePrimitiveValue EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveValue=rulePrimitiveValue();

            state._fsp--;

             current =iv_rulePrimitiveValue.getText(); 
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
    // $ANTLR end "entryRulePrimitiveValue"


    // $ANTLR start "rulePrimitiveValue"
    // InternalAsyncApi.g:6788:1: rulePrimitiveValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_AnyString_0= ruleAnyString | kw= 'true' | kw= 'false' | this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken this_AnyString_0 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:6794:2: ( (this_AnyString_0= ruleAnyString | kw= 'true' | kw= 'false' | this_INT_3= RULE_INT ) )
            // InternalAsyncApi.g:6795:2: (this_AnyString_0= ruleAnyString | kw= 'true' | kw= 'false' | this_INT_3= RULE_INT )
            {
            // InternalAsyncApi.g:6795:2: (this_AnyString_0= ruleAnyString | kw= 'true' | kw= 'false' | this_INT_3= RULE_INT )
            int alt135=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 9:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
                {
                alt135=1;
                }
                break;
            case 79:
                {
                alt135=2;
                }
                break;
            case 80:
                {
                alt135=3;
                }
                break;
            case RULE_INT:
                {
                alt135=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }

            switch (alt135) {
                case 1 :
                    // InternalAsyncApi.g:6796:3: this_AnyString_0= ruleAnyString
                    {

                    			newCompositeNode(grammarAccess.getPrimitiveValueAccess().getAnyStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnyString_0=ruleAnyString();

                    state._fsp--;


                    			current.merge(this_AnyString_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:6807:3: kw= 'true'
                    {
                    kw=(Token)match(input,79,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveValueAccess().getTrueKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:6813:3: kw= 'false'
                    {
                    kw=(Token)match(input,80,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimitiveValueAccess().getFalseKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:6819:3: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_3);
                    		

                    			newLeafNode(this_INT_3, grammarAccess.getPrimitiveValueAccess().getINTTerminalRuleCall_3());
                    		

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
    // $ANTLR end "rulePrimitiveValue"


    // $ANTLR start "entryRuleAnyString"
    // InternalAsyncApi.g:6830:1: entryRuleAnyString returns [String current=null] : iv_ruleAnyString= ruleAnyString EOF ;
    public final String entryRuleAnyString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyString = null;


        try {
            // InternalAsyncApi.g:6830:49: (iv_ruleAnyString= ruleAnyString EOF )
            // InternalAsyncApi.g:6831:2: iv_ruleAnyString= ruleAnyString EOF
            {
             newCompositeNode(grammarAccess.getAnyStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyString=ruleAnyString();

            state._fsp--;

             current =iv_ruleAnyString.getText(); 
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
    // $ANTLR end "entryRuleAnyString"


    // $ANTLR start "ruleAnyString"
    // InternalAsyncApi.g:6837:1: ruleAnyString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | kw= '\"$ref\"' | this_Keyword_2= ruleKeyword ) ;
    public final AntlrDatatypeRuleToken ruleAnyString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Keyword_2 = null;



        	enterRule();

        try {
            // InternalAsyncApi.g:6843:2: ( (this_STRING_0= RULE_STRING | kw= '\"$ref\"' | this_Keyword_2= ruleKeyword ) )
            // InternalAsyncApi.g:6844:2: (this_STRING_0= RULE_STRING | kw= '\"$ref\"' | this_Keyword_2= ruleKeyword )
            {
            // InternalAsyncApi.g:6844:2: (this_STRING_0= RULE_STRING | kw= '\"$ref\"' | this_Keyword_2= ruleKeyword )
            int alt136=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt136=1;
                }
                break;
            case 78:
                {
                alt136=2;
                }
                break;
            case 9:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
                {
                alt136=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }

            switch (alt136) {
                case 1 :
                    // InternalAsyncApi.g:6845:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getAnyStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:6853:3: kw= '\"$ref\"'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getAnyStringAccess().getRefKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:6859:3: this_Keyword_2= ruleKeyword
                    {

                    			newCompositeNode(grammarAccess.getAnyStringAccess().getKeywordParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Keyword_2=ruleKeyword();

                    state._fsp--;


                    			current.merge(this_Keyword_2);
                    		

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
    // $ANTLR end "ruleAnyString"


    // $ANTLR start "entryRuleKeyword"
    // InternalAsyncApi.g:6873:1: entryRuleKeyword returns [String current=null] : iv_ruleKeyword= ruleKeyword EOF ;
    public final String entryRuleKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyword = null;


        try {
            // InternalAsyncApi.g:6873:47: (iv_ruleKeyword= ruleKeyword EOF )
            // InternalAsyncApi.g:6874:2: iv_ruleKeyword= ruleKeyword EOF
            {
             newCompositeNode(grammarAccess.getKeywordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyword=ruleKeyword();

            state._fsp--;

             current =iv_ruleKeyword.getText(); 
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
    // $ANTLR end "entryRuleKeyword"


    // $ANTLR start "ruleKeyword"
    // InternalAsyncApi.g:6880:1: ruleKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"2.0.0\"' | kw= '\"<\"' | kw= '\"<=\"' | kw= '\"=\"' | kw= '\">\"' | kw= '\">=\"' | kw= '\"AND\"' | kw= '\"OR\"' | kw= '\"aggregationFunction\"' | kw= '\"amqp\"' | kw= '\"amqps\"' | kw= '\"any\"' | kw= '\"array\"' | kw= '\"asyncapi\"' | kw= '\"boolean\"' | kw= '\"channels\"' | kw= '\"components\"' | kw= '\"contact\"' | kw= '\"dataType\"' | kw= '\"days\"' | kw= '\"default\"' | kw= '\"deprecated\"' | kw= '\"derivedQoSMetricDefinition\"' | kw= '\"description\"' | kw= '\"email\"' | kw= '\"enum\"' | kw= '\"format\"' | kw= '\"guaranteeTerm\"' | kw= '\"headers\"' | kw= '\"hours\"' | kw= '\"info\"' | kw= '\"integer\"' | kw= '\"items\"' | kw= '\"license\"' | kw= '\"location\"' | kw= '\"maxItems\"' | kw= '\"maximum\"' | kw= '\"message\"' | kw= '\"messageTraits\"' | kw= '\"messages\"' | kw= '\"metricType\"' | kw= '\"milliseconds\"' | kw= '\"minItems\"' | kw= '\"minimum\"' | kw= '\"minutes\"' | kw= '\"mqtt\"' | kw= '\"mqtts\"' | kw= '\"name\"' | kw= '\"null\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"operationId\"' | kw= '\"operationTraits\"' | kw= '\"operator\"' | kw= '\"parameters\"' | kw= '\"payload\"' | kw= '\"properties\"' | kw= '\"protocol\"' | kw= '\"publish\"' | kw= '\"qosMetric\"' | kw= '\"qualifyingConditions\"' | kw= '\"required\"' | kw= '\"schema\"' | kw= '\"schemas\"' | kw= '\"scopes\"' | kw= '\"seconds\"' | kw= '\"servers\"' | kw= '\"slos\"' | kw= '\"stomp\"' | kw= '\"stomps\"' | kw= '\"string\"' | kw= '\"subscribe\"' | kw= '\"summary\"' | kw= '\"tags\"' | kw= '\"termsOfService\"' | kw= '\"title\"' | kw= '\"traits\"' | kw= '\"type\"' | kw= '\"unit\"' | kw= '\"url\"' | kw= '\"value\"' | kw= '\"variables\"' | kw= '\"version\"' | kw= '\"window\"' | kw= '\"windowUnit\"' | kw= '\"ws\"' | kw= '\"wss\"' | kw= '\"x-basePackage\"' | kw= '\"x-qosMetrics\"' | kw= '\"x-sla\"' | kw= '\"x-title\"' ) ;
    public final AntlrDatatypeRuleToken ruleKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:6886:2: ( (kw= '\"2.0.0\"' | kw= '\"<\"' | kw= '\"<=\"' | kw= '\"=\"' | kw= '\">\"' | kw= '\">=\"' | kw= '\"AND\"' | kw= '\"OR\"' | kw= '\"aggregationFunction\"' | kw= '\"amqp\"' | kw= '\"amqps\"' | kw= '\"any\"' | kw= '\"array\"' | kw= '\"asyncapi\"' | kw= '\"boolean\"' | kw= '\"channels\"' | kw= '\"components\"' | kw= '\"contact\"' | kw= '\"dataType\"' | kw= '\"days\"' | kw= '\"default\"' | kw= '\"deprecated\"' | kw= '\"derivedQoSMetricDefinition\"' | kw= '\"description\"' | kw= '\"email\"' | kw= '\"enum\"' | kw= '\"format\"' | kw= '\"guaranteeTerm\"' | kw= '\"headers\"' | kw= '\"hours\"' | kw= '\"info\"' | kw= '\"integer\"' | kw= '\"items\"' | kw= '\"license\"' | kw= '\"location\"' | kw= '\"maxItems\"' | kw= '\"maximum\"' | kw= '\"message\"' | kw= '\"messageTraits\"' | kw= '\"messages\"' | kw= '\"metricType\"' | kw= '\"milliseconds\"' | kw= '\"minItems\"' | kw= '\"minimum\"' | kw= '\"minutes\"' | kw= '\"mqtt\"' | kw= '\"mqtts\"' | kw= '\"name\"' | kw= '\"null\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"operationId\"' | kw= '\"operationTraits\"' | kw= '\"operator\"' | kw= '\"parameters\"' | kw= '\"payload\"' | kw= '\"properties\"' | kw= '\"protocol\"' | kw= '\"publish\"' | kw= '\"qosMetric\"' | kw= '\"qualifyingConditions\"' | kw= '\"required\"' | kw= '\"schema\"' | kw= '\"schemas\"' | kw= '\"scopes\"' | kw= '\"seconds\"' | kw= '\"servers\"' | kw= '\"slos\"' | kw= '\"stomp\"' | kw= '\"stomps\"' | kw= '\"string\"' | kw= '\"subscribe\"' | kw= '\"summary\"' | kw= '\"tags\"' | kw= '\"termsOfService\"' | kw= '\"title\"' | kw= '\"traits\"' | kw= '\"type\"' | kw= '\"unit\"' | kw= '\"url\"' | kw= '\"value\"' | kw= '\"variables\"' | kw= '\"version\"' | kw= '\"window\"' | kw= '\"windowUnit\"' | kw= '\"ws\"' | kw= '\"wss\"' | kw= '\"x-basePackage\"' | kw= '\"x-qosMetrics\"' | kw= '\"x-sla\"' | kw= '\"x-title\"' ) )
            // InternalAsyncApi.g:6887:2: (kw= '\"2.0.0\"' | kw= '\"<\"' | kw= '\"<=\"' | kw= '\"=\"' | kw= '\">\"' | kw= '\">=\"' | kw= '\"AND\"' | kw= '\"OR\"' | kw= '\"aggregationFunction\"' | kw= '\"amqp\"' | kw= '\"amqps\"' | kw= '\"any\"' | kw= '\"array\"' | kw= '\"asyncapi\"' | kw= '\"boolean\"' | kw= '\"channels\"' | kw= '\"components\"' | kw= '\"contact\"' | kw= '\"dataType\"' | kw= '\"days\"' | kw= '\"default\"' | kw= '\"deprecated\"' | kw= '\"derivedQoSMetricDefinition\"' | kw= '\"description\"' | kw= '\"email\"' | kw= '\"enum\"' | kw= '\"format\"' | kw= '\"guaranteeTerm\"' | kw= '\"headers\"' | kw= '\"hours\"' | kw= '\"info\"' | kw= '\"integer\"' | kw= '\"items\"' | kw= '\"license\"' | kw= '\"location\"' | kw= '\"maxItems\"' | kw= '\"maximum\"' | kw= '\"message\"' | kw= '\"messageTraits\"' | kw= '\"messages\"' | kw= '\"metricType\"' | kw= '\"milliseconds\"' | kw= '\"minItems\"' | kw= '\"minimum\"' | kw= '\"minutes\"' | kw= '\"mqtt\"' | kw= '\"mqtts\"' | kw= '\"name\"' | kw= '\"null\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"operationId\"' | kw= '\"operationTraits\"' | kw= '\"operator\"' | kw= '\"parameters\"' | kw= '\"payload\"' | kw= '\"properties\"' | kw= '\"protocol\"' | kw= '\"publish\"' | kw= '\"qosMetric\"' | kw= '\"qualifyingConditions\"' | kw= '\"required\"' | kw= '\"schema\"' | kw= '\"schemas\"' | kw= '\"scopes\"' | kw= '\"seconds\"' | kw= '\"servers\"' | kw= '\"slos\"' | kw= '\"stomp\"' | kw= '\"stomps\"' | kw= '\"string\"' | kw= '\"subscribe\"' | kw= '\"summary\"' | kw= '\"tags\"' | kw= '\"termsOfService\"' | kw= '\"title\"' | kw= '\"traits\"' | kw= '\"type\"' | kw= '\"unit\"' | kw= '\"url\"' | kw= '\"value\"' | kw= '\"variables\"' | kw= '\"version\"' | kw= '\"window\"' | kw= '\"windowUnit\"' | kw= '\"ws\"' | kw= '\"wss\"' | kw= '\"x-basePackage\"' | kw= '\"x-qosMetrics\"' | kw= '\"x-sla\"' | kw= '\"x-title\"' )
            {
            // InternalAsyncApi.g:6887:2: (kw= '\"2.0.0\"' | kw= '\"<\"' | kw= '\"<=\"' | kw= '\"=\"' | kw= '\">\"' | kw= '\">=\"' | kw= '\"AND\"' | kw= '\"OR\"' | kw= '\"aggregationFunction\"' | kw= '\"amqp\"' | kw= '\"amqps\"' | kw= '\"any\"' | kw= '\"array\"' | kw= '\"asyncapi\"' | kw= '\"boolean\"' | kw= '\"channels\"' | kw= '\"components\"' | kw= '\"contact\"' | kw= '\"dataType\"' | kw= '\"days\"' | kw= '\"default\"' | kw= '\"deprecated\"' | kw= '\"derivedQoSMetricDefinition\"' | kw= '\"description\"' | kw= '\"email\"' | kw= '\"enum\"' | kw= '\"format\"' | kw= '\"guaranteeTerm\"' | kw= '\"headers\"' | kw= '\"hours\"' | kw= '\"info\"' | kw= '\"integer\"' | kw= '\"items\"' | kw= '\"license\"' | kw= '\"location\"' | kw= '\"maxItems\"' | kw= '\"maximum\"' | kw= '\"message\"' | kw= '\"messageTraits\"' | kw= '\"messages\"' | kw= '\"metricType\"' | kw= '\"milliseconds\"' | kw= '\"minItems\"' | kw= '\"minimum\"' | kw= '\"minutes\"' | kw= '\"mqtt\"' | kw= '\"mqtts\"' | kw= '\"name\"' | kw= '\"null\"' | kw= '\"number\"' | kw= '\"object\"' | kw= '\"operationId\"' | kw= '\"operationTraits\"' | kw= '\"operator\"' | kw= '\"parameters\"' | kw= '\"payload\"' | kw= '\"properties\"' | kw= '\"protocol\"' | kw= '\"publish\"' | kw= '\"qosMetric\"' | kw= '\"qualifyingConditions\"' | kw= '\"required\"' | kw= '\"schema\"' | kw= '\"schemas\"' | kw= '\"scopes\"' | kw= '\"seconds\"' | kw= '\"servers\"' | kw= '\"slos\"' | kw= '\"stomp\"' | kw= '\"stomps\"' | kw= '\"string\"' | kw= '\"subscribe\"' | kw= '\"summary\"' | kw= '\"tags\"' | kw= '\"termsOfService\"' | kw= '\"title\"' | kw= '\"traits\"' | kw= '\"type\"' | kw= '\"unit\"' | kw= '\"url\"' | kw= '\"value\"' | kw= '\"variables\"' | kw= '\"version\"' | kw= '\"window\"' | kw= '\"windowUnit\"' | kw= '\"ws\"' | kw= '\"wss\"' | kw= '\"x-basePackage\"' | kw= '\"x-qosMetrics\"' | kw= '\"x-sla\"' | kw= '\"x-title\"' )
            int alt137=91;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt137=1;
                }
                break;
            case 82:
                {
                alt137=2;
                }
                break;
            case 83:
                {
                alt137=3;
                }
                break;
            case 84:
                {
                alt137=4;
                }
                break;
            case 85:
                {
                alt137=5;
                }
                break;
            case 86:
                {
                alt137=6;
                }
                break;
            case 73:
                {
                alt137=7;
                }
                break;
            case 74:
                {
                alt137=8;
                }
                break;
            case 72:
                {
                alt137=9;
                }
                break;
            case 87:
                {
                alt137=10;
                }
                break;
            case 88:
                {
                alt137=11;
                }
                break;
            case 89:
                {
                alt137=12;
                }
                break;
            case 90:
                {
                alt137=13;
                }
                break;
            case 9:
                {
                alt137=14;
                }
                break;
            case 91:
                {
                alt137=15;
                }
                break;
            case 15:
                {
                alt137=16;
                }
                break;
            case 16:
                {
                alt137=17;
                }
                break;
            case 22:
                {
                alt137=18;
                }
                break;
            case 92:
                {
                alt137=19;
                }
                break;
            case 93:
                {
                alt137=20;
                }
                break;
            case 30:
                {
                alt137=21;
                }
                break;
            case 42:
                {
                alt137=22;
                }
                break;
            case 69:
                {
                alt137=23;
                }
                break;
            case 20:
                {
                alt137=24;
                }
                break;
            case 27:
                {
                alt137=25;
                }
                break;
            case 31:
                {
                alt137=26;
                }
                break;
            case 47:
                {
                alt137=27;
                }
                break;
            case 62:
                {
                alt137=28;
                }
                break;
            case 43:
                {
                alt137=29;
                }
                break;
            case 94:
                {
                alt137=30;
                }
                break;
            case 12:
                {
                alt137=31;
                }
                break;
            case 95:
                {
                alt137=32;
                }
                break;
            case 53:
                {
                alt137=33;
                }
                break;
            case 23:
                {
                alt137=34;
                }
                break;
            case 56:
                {
                alt137=35;
                }
                break;
            case 51:
                {
                alt137=36;
                }
                break;
            case 49:
                {
                alt137=37;
                }
                break;
            case 40:
                {
                alt137=38;
                }
                break;
            case 60:
                {
                alt137=39;
                }
                break;
            case 58:
                {
                alt137=40;
                }
                break;
            case 66:
                {
                alt137=41;
                }
                break;
            case 96:
                {
                alt137=42;
                }
                break;
            case 50:
                {
                alt137=43;
                }
                break;
            case 48:
                {
                alt137=44;
                }
                break;
            case 97:
                {
                alt137=45;
                }
                break;
            case 98:
                {
                alt137=46;
                }
                break;
            case 99:
                {
                alt137=47;
                }
                break;
            case 25:
                {
                alt137=48;
                }
                break;
            case 100:
                {
                alt137=49;
                }
                break;
            case 101:
                {
                alt137=50;
                }
                break;
            case 102:
                {
                alt137=51;
                }
                break;
            case 38:
                {
                alt137=52;
                }
                break;
            case 59:
                {
                alt137=53;
                }
                break;
            case 76:
                {
                alt137=54;
                }
                break;
            case 36:
                {
                alt137=55;
                }
                break;
            case 45:
                {
                alt137=56;
                }
                break;
            case 52:
                {
                alt137=57;
                }
                break;
            case 28:
                {
                alt137=58;
                }
                break;
            case 34:
                {
                alt137=59;
                }
                break;
            case 75:
                {
                alt137=60;
                }
                break;
            case 64:
                {
                alt137=61;
                }
                break;
            case 54:
                {
                alt137=62;
                }
                break;
            case 55:
                {
                alt137=63;
                }
                break;
            case 57:
                {
                alt137=64;
                }
                break;
            case 63:
                {
                alt137=65;
                }
                break;
            case 103:
                {
                alt137=66;
                }
                break;
            case 13:
                {
                alt137=67;
                }
                break;
            case 65:
                {
                alt137=68;
                }
                break;
            case 104:
                {
                alt137=69;
                }
                break;
            case 105:
                {
                alt137=70;
                }
                break;
            case 106:
                {
                alt137=71;
                }
                break;
            case 35:
                {
                alt137=72;
                }
                break;
            case 39:
                {
                alt137=73;
                }
                break;
            case 44:
                {
                alt137=74;
                }
                break;
            case 21:
                {
                alt137=75;
                }
                break;
            case 18:
                {
                alt137=76;
                }
                break;
            case 41:
                {
                alt137=77;
                }
                break;
            case 46:
                {
                alt137=78;
                }
                break;
            case 67:
                {
                alt137=79;
                }
                break;
            case 26:
                {
                alt137=80;
                }
                break;
            case 77:
                {
                alt137=81;
                }
                break;
            case 29:
                {
                alt137=82;
                }
                break;
            case 19:
                {
                alt137=83;
                }
                break;
            case 70:
                {
                alt137=84;
                }
                break;
            case 71:
                {
                alt137=85;
                }
                break;
            case 107:
                {
                alt137=86;
                }
                break;
            case 108:
                {
                alt137=87;
                }
                break;
            case 24:
                {
                alt137=88;
                }
                break;
            case 61:
                {
                alt137=89;
                }
                break;
            case 17:
                {
                alt137=90;
                }
                break;
            case 37:
                {
                alt137=91;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }

            switch (alt137) {
                case 1 :
                    // InternalAsyncApi.g:6888:3: kw= '\"2.0.0\"'
                    {
                    kw=(Token)match(input,81,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getQuotationMarkDigitTwoFullStopDigitZeroFullStopDigitZeroQuotationMarkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:6894:3: kw= '\"<\"'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getQuotationMarkLessThanSignQuotationMarkKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:6900:3: kw= '\"<=\"'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getQuotationMarkLessThanSignEqualsSignQuotationMarkKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:6906:3: kw= '\"=\"'
                    {
                    kw=(Token)match(input,84,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getQuotationMarkEqualsSignQuotationMarkKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:6912:3: kw= '\">\"'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getQuotationMarkGreaterThanSignQuotationMarkKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalAsyncApi.g:6918:3: kw= '\">=\"'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getQuotationMarkGreaterThanSignEqualsSignQuotationMarkKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalAsyncApi.g:6924:3: kw= '\"AND\"'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getANDKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalAsyncApi.g:6930:3: kw= '\"OR\"'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getORKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalAsyncApi.g:6936:3: kw= '\"aggregationFunction\"'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getAggregationFunctionKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalAsyncApi.g:6942:3: kw= '\"amqp\"'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getAmqpKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalAsyncApi.g:6948:3: kw= '\"amqps\"'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getAmqpsKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalAsyncApi.g:6954:3: kw= '\"any\"'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getAnyKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalAsyncApi.g:6960:3: kw= '\"array\"'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getArrayKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalAsyncApi.g:6966:3: kw= '\"asyncapi\"'
                    {
                    kw=(Token)match(input,9,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getAsyncapiKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalAsyncApi.g:6972:3: kw= '\"boolean\"'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getBooleanKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalAsyncApi.g:6978:3: kw= '\"channels\"'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getChannelsKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalAsyncApi.g:6984:3: kw= '\"components\"'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getComponentsKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalAsyncApi.g:6990:3: kw= '\"contact\"'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getContactKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalAsyncApi.g:6996:3: kw= '\"dataType\"'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getDataTypeKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalAsyncApi.g:7002:3: kw= '\"days\"'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getDaysKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalAsyncApi.g:7008:3: kw= '\"default\"'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getDefaultKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalAsyncApi.g:7014:3: kw= '\"deprecated\"'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getDeprecatedKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalAsyncApi.g:7020:3: kw= '\"derivedQoSMetricDefinition\"'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getDerivedQoSMetricDefinitionKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalAsyncApi.g:7026:3: kw= '\"description\"'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getDescriptionKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalAsyncApi.g:7032:3: kw= '\"email\"'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getEmailKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalAsyncApi.g:7038:3: kw= '\"enum\"'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getEnumKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalAsyncApi.g:7044:3: kw= '\"format\"'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getFormatKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalAsyncApi.g:7050:3: kw= '\"guaranteeTerm\"'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getGuaranteeTermKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalAsyncApi.g:7056:3: kw= '\"headers\"'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getHeadersKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalAsyncApi.g:7062:3: kw= '\"hours\"'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getHoursKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalAsyncApi.g:7068:3: kw= '\"info\"'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getInfoKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalAsyncApi.g:7074:3: kw= '\"integer\"'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getIntegerKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalAsyncApi.g:7080:3: kw= '\"items\"'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getItemsKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalAsyncApi.g:7086:3: kw= '\"license\"'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getLicenseKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalAsyncApi.g:7092:3: kw= '\"location\"'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getLocationKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalAsyncApi.g:7098:3: kw= '\"maxItems\"'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMaxItemsKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalAsyncApi.g:7104:3: kw= '\"maximum\"'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMaximumKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalAsyncApi.g:7110:3: kw= '\"message\"'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMessageKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalAsyncApi.g:7116:3: kw= '\"messageTraits\"'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMessageTraitsKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalAsyncApi.g:7122:3: kw= '\"messages\"'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMessagesKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalAsyncApi.g:7128:3: kw= '\"metricType\"'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMetricTypeKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalAsyncApi.g:7134:3: kw= '\"milliseconds\"'
                    {
                    kw=(Token)match(input,96,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMillisecondsKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalAsyncApi.g:7140:3: kw= '\"minItems\"'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMinItemsKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalAsyncApi.g:7146:3: kw= '\"minimum\"'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMinimumKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalAsyncApi.g:7152:3: kw= '\"minutes\"'
                    {
                    kw=(Token)match(input,97,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMinutesKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalAsyncApi.g:7158:3: kw= '\"mqtt\"'
                    {
                    kw=(Token)match(input,98,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMqttKeyword_45());
                    		

                    }
                    break;
                case 47 :
                    // InternalAsyncApi.g:7164:3: kw= '\"mqtts\"'
                    {
                    kw=(Token)match(input,99,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getMqttsKeyword_46());
                    		

                    }
                    break;
                case 48 :
                    // InternalAsyncApi.g:7170:3: kw= '\"name\"'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getNameKeyword_47());
                    		

                    }
                    break;
                case 49 :
                    // InternalAsyncApi.g:7176:3: kw= '\"null\"'
                    {
                    kw=(Token)match(input,100,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getNullKeyword_48());
                    		

                    }
                    break;
                case 50 :
                    // InternalAsyncApi.g:7182:3: kw= '\"number\"'
                    {
                    kw=(Token)match(input,101,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getNumberKeyword_49());
                    		

                    }
                    break;
                case 51 :
                    // InternalAsyncApi.g:7188:3: kw= '\"object\"'
                    {
                    kw=(Token)match(input,102,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getObjectKeyword_50());
                    		

                    }
                    break;
                case 52 :
                    // InternalAsyncApi.g:7194:3: kw= '\"operationId\"'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getOperationIdKeyword_51());
                    		

                    }
                    break;
                case 53 :
                    // InternalAsyncApi.g:7200:3: kw= '\"operationTraits\"'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getOperationTraitsKeyword_52());
                    		

                    }
                    break;
                case 54 :
                    // InternalAsyncApi.g:7206:3: kw= '\"operator\"'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getOperatorKeyword_53());
                    		

                    }
                    break;
                case 55 :
                    // InternalAsyncApi.g:7212:3: kw= '\"parameters\"'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getParametersKeyword_54());
                    		

                    }
                    break;
                case 56 :
                    // InternalAsyncApi.g:7218:3: kw= '\"payload\"'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getPayloadKeyword_55());
                    		

                    }
                    break;
                case 57 :
                    // InternalAsyncApi.g:7224:3: kw= '\"properties\"'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getPropertiesKeyword_56());
                    		

                    }
                    break;
                case 58 :
                    // InternalAsyncApi.g:7230:3: kw= '\"protocol\"'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getProtocolKeyword_57());
                    		

                    }
                    break;
                case 59 :
                    // InternalAsyncApi.g:7236:3: kw= '\"publish\"'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getPublishKeyword_58());
                    		

                    }
                    break;
                case 60 :
                    // InternalAsyncApi.g:7242:3: kw= '\"qosMetric\"'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getQosMetricKeyword_59());
                    		

                    }
                    break;
                case 61 :
                    // InternalAsyncApi.g:7248:3: kw= '\"qualifyingConditions\"'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getQualifyingConditionsKeyword_60());
                    		

                    }
                    break;
                case 62 :
                    // InternalAsyncApi.g:7254:3: kw= '\"required\"'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getRequiredKeyword_61());
                    		

                    }
                    break;
                case 63 :
                    // InternalAsyncApi.g:7260:3: kw= '\"schema\"'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getSchemaKeyword_62());
                    		

                    }
                    break;
                case 64 :
                    // InternalAsyncApi.g:7266:3: kw= '\"schemas\"'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getSchemasKeyword_63());
                    		

                    }
                    break;
                case 65 :
                    // InternalAsyncApi.g:7272:3: kw= '\"scopes\"'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getScopesKeyword_64());
                    		

                    }
                    break;
                case 66 :
                    // InternalAsyncApi.g:7278:3: kw= '\"seconds\"'
                    {
                    kw=(Token)match(input,103,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getSecondsKeyword_65());
                    		

                    }
                    break;
                case 67 :
                    // InternalAsyncApi.g:7284:3: kw= '\"servers\"'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getServersKeyword_66());
                    		

                    }
                    break;
                case 68 :
                    // InternalAsyncApi.g:7290:3: kw= '\"slos\"'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getSlosKeyword_67());
                    		

                    }
                    break;
                case 69 :
                    // InternalAsyncApi.g:7296:3: kw= '\"stomp\"'
                    {
                    kw=(Token)match(input,104,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getStompKeyword_68());
                    		

                    }
                    break;
                case 70 :
                    // InternalAsyncApi.g:7302:3: kw= '\"stomps\"'
                    {
                    kw=(Token)match(input,105,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getStompsKeyword_69());
                    		

                    }
                    break;
                case 71 :
                    // InternalAsyncApi.g:7308:3: kw= '\"string\"'
                    {
                    kw=(Token)match(input,106,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getStringKeyword_70());
                    		

                    }
                    break;
                case 72 :
                    // InternalAsyncApi.g:7314:3: kw= '\"subscribe\"'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getSubscribeKeyword_71());
                    		

                    }
                    break;
                case 73 :
                    // InternalAsyncApi.g:7320:3: kw= '\"summary\"'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getSummaryKeyword_72());
                    		

                    }
                    break;
                case 74 :
                    // InternalAsyncApi.g:7326:3: kw= '\"tags\"'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTagsKeyword_73());
                    		

                    }
                    break;
                case 75 :
                    // InternalAsyncApi.g:7332:3: kw= '\"termsOfService\"'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTermsOfServiceKeyword_74());
                    		

                    }
                    break;
                case 76 :
                    // InternalAsyncApi.g:7338:3: kw= '\"title\"'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTitleKeyword_75());
                    		

                    }
                    break;
                case 77 :
                    // InternalAsyncApi.g:7344:3: kw= '\"traits\"'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTraitsKeyword_76());
                    		

                    }
                    break;
                case 78 :
                    // InternalAsyncApi.g:7350:3: kw= '\"type\"'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getTypeKeyword_77());
                    		

                    }
                    break;
                case 79 :
                    // InternalAsyncApi.g:7356:3: kw= '\"unit\"'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getUnitKeyword_78());
                    		

                    }
                    break;
                case 80 :
                    // InternalAsyncApi.g:7362:3: kw= '\"url\"'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getUrlKeyword_79());
                    		

                    }
                    break;
                case 81 :
                    // InternalAsyncApi.g:7368:3: kw= '\"value\"'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getValueKeyword_80());
                    		

                    }
                    break;
                case 82 :
                    // InternalAsyncApi.g:7374:3: kw= '\"variables\"'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getVariablesKeyword_81());
                    		

                    }
                    break;
                case 83 :
                    // InternalAsyncApi.g:7380:3: kw= '\"version\"'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getVersionKeyword_82());
                    		

                    }
                    break;
                case 84 :
                    // InternalAsyncApi.g:7386:3: kw= '\"window\"'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getWindowKeyword_83());
                    		

                    }
                    break;
                case 85 :
                    // InternalAsyncApi.g:7392:3: kw= '\"windowUnit\"'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getWindowUnitKeyword_84());
                    		

                    }
                    break;
                case 86 :
                    // InternalAsyncApi.g:7398:3: kw= '\"ws\"'
                    {
                    kw=(Token)match(input,107,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getWsKeyword_85());
                    		

                    }
                    break;
                case 87 :
                    // InternalAsyncApi.g:7404:3: kw= '\"wss\"'
                    {
                    kw=(Token)match(input,108,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getWssKeyword_86());
                    		

                    }
                    break;
                case 88 :
                    // InternalAsyncApi.g:7410:3: kw= '\"x-basePackage\"'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getXBasePackageKeyword_87());
                    		

                    }
                    break;
                case 89 :
                    // InternalAsyncApi.g:7416:3: kw= '\"x-qosMetrics\"'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getXQosMetricsKeyword_88());
                    		

                    }
                    break;
                case 90 :
                    // InternalAsyncApi.g:7422:3: kw= '\"x-sla\"'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getXSlaKeyword_89());
                    		

                    }
                    break;
                case 91 :
                    // InternalAsyncApi.g:7428:3: kw= '\"x-title\"'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeywordAccess().getXTitleKeyword_90());
                    		

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
    // $ANTLR end "ruleKeyword"


    // $ANTLR start "ruleWindowUnit"
    // InternalAsyncApi.g:7437:1: ruleWindowUnit returns [Enumerator current=null] : ( (enumLiteral_0= '\"seconds\"' ) | (enumLiteral_1= '\"minutes\"' ) | (enumLiteral_2= '\"hours\"' ) | (enumLiteral_3= '\"days\"' ) | (enumLiteral_4= '\"messages\"' ) ) ;
    public final Enumerator ruleWindowUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:7443:2: ( ( (enumLiteral_0= '\"seconds\"' ) | (enumLiteral_1= '\"minutes\"' ) | (enumLiteral_2= '\"hours\"' ) | (enumLiteral_3= '\"days\"' ) | (enumLiteral_4= '\"messages\"' ) ) )
            // InternalAsyncApi.g:7444:2: ( (enumLiteral_0= '\"seconds\"' ) | (enumLiteral_1= '\"minutes\"' ) | (enumLiteral_2= '\"hours\"' ) | (enumLiteral_3= '\"days\"' ) | (enumLiteral_4= '\"messages\"' ) )
            {
            // InternalAsyncApi.g:7444:2: ( (enumLiteral_0= '\"seconds\"' ) | (enumLiteral_1= '\"minutes\"' ) | (enumLiteral_2= '\"hours\"' ) | (enumLiteral_3= '\"days\"' ) | (enumLiteral_4= '\"messages\"' ) )
            int alt138=5;
            switch ( input.LA(1) ) {
            case 103:
                {
                alt138=1;
                }
                break;
            case 97:
                {
                alt138=2;
                }
                break;
            case 94:
                {
                alt138=3;
                }
                break;
            case 93:
                {
                alt138=4;
                }
                break;
            case 58:
                {
                alt138=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }

            switch (alt138) {
                case 1 :
                    // InternalAsyncApi.g:7445:3: (enumLiteral_0= '\"seconds\"' )
                    {
                    // InternalAsyncApi.g:7445:3: (enumLiteral_0= '\"seconds\"' )
                    // InternalAsyncApi.g:7446:4: enumLiteral_0= '\"seconds\"'
                    {
                    enumLiteral_0=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getWindowUnitAccess().getSecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWindowUnitAccess().getSecondsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:7453:3: (enumLiteral_1= '\"minutes\"' )
                    {
                    // InternalAsyncApi.g:7453:3: (enumLiteral_1= '\"minutes\"' )
                    // InternalAsyncApi.g:7454:4: enumLiteral_1= '\"minutes\"'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getWindowUnitAccess().getMinutesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWindowUnitAccess().getMinutesEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:7461:3: (enumLiteral_2= '\"hours\"' )
                    {
                    // InternalAsyncApi.g:7461:3: (enumLiteral_2= '\"hours\"' )
                    // InternalAsyncApi.g:7462:4: enumLiteral_2= '\"hours\"'
                    {
                    enumLiteral_2=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getWindowUnitAccess().getHoursEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWindowUnitAccess().getHoursEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:7469:3: (enumLiteral_3= '\"days\"' )
                    {
                    // InternalAsyncApi.g:7469:3: (enumLiteral_3= '\"days\"' )
                    // InternalAsyncApi.g:7470:4: enumLiteral_3= '\"days\"'
                    {
                    enumLiteral_3=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getWindowUnitAccess().getDaysEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWindowUnitAccess().getDaysEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:7477:3: (enumLiteral_4= '\"messages\"' )
                    {
                    // InternalAsyncApi.g:7477:3: (enumLiteral_4= '\"messages\"' )
                    // InternalAsyncApi.g:7478:4: enumLiteral_4= '\"messages\"'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getWindowUnitAccess().getMessagesEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getWindowUnitAccess().getMessagesEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleWindowUnit"


    // $ANTLR start "ruleAggregationFunction"
    // InternalAsyncApi.g:7488:1: ruleAggregationFunction returns [Enumerator current=null] : ( (enumLiteral_0= '\"AVG\"' ) | (enumLiteral_1= '\"MEDIAN\"' ) | (enumLiteral_2= '\"MAX\"' ) | (enumLiteral_3= '\"MIN\"' ) ) ;
    public final Enumerator ruleAggregationFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:7494:2: ( ( (enumLiteral_0= '\"AVG\"' ) | (enumLiteral_1= '\"MEDIAN\"' ) | (enumLiteral_2= '\"MAX\"' ) | (enumLiteral_3= '\"MIN\"' ) ) )
            // InternalAsyncApi.g:7495:2: ( (enumLiteral_0= '\"AVG\"' ) | (enumLiteral_1= '\"MEDIAN\"' ) | (enumLiteral_2= '\"MAX\"' ) | (enumLiteral_3= '\"MIN\"' ) )
            {
            // InternalAsyncApi.g:7495:2: ( (enumLiteral_0= '\"AVG\"' ) | (enumLiteral_1= '\"MEDIAN\"' ) | (enumLiteral_2= '\"MAX\"' ) | (enumLiteral_3= '\"MIN\"' ) )
            int alt139=4;
            switch ( input.LA(1) ) {
            case 109:
                {
                alt139=1;
                }
                break;
            case 110:
                {
                alt139=2;
                }
                break;
            case 111:
                {
                alt139=3;
                }
                break;
            case 112:
                {
                alt139=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }

            switch (alt139) {
                case 1 :
                    // InternalAsyncApi.g:7496:3: (enumLiteral_0= '\"AVG\"' )
                    {
                    // InternalAsyncApi.g:7496:3: (enumLiteral_0= '\"AVG\"' )
                    // InternalAsyncApi.g:7497:4: enumLiteral_0= '\"AVG\"'
                    {
                    enumLiteral_0=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getAggregationFunctionAccess().getAVGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAggregationFunctionAccess().getAVGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:7504:3: (enumLiteral_1= '\"MEDIAN\"' )
                    {
                    // InternalAsyncApi.g:7504:3: (enumLiteral_1= '\"MEDIAN\"' )
                    // InternalAsyncApi.g:7505:4: enumLiteral_1= '\"MEDIAN\"'
                    {
                    enumLiteral_1=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getAggregationFunctionAccess().getMEDIANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAggregationFunctionAccess().getMEDIANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:7512:3: (enumLiteral_2= '\"MAX\"' )
                    {
                    // InternalAsyncApi.g:7512:3: (enumLiteral_2= '\"MAX\"' )
                    // InternalAsyncApi.g:7513:4: enumLiteral_2= '\"MAX\"'
                    {
                    enumLiteral_2=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getAggregationFunctionAccess().getMAXEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAggregationFunctionAccess().getMAXEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:7520:3: (enumLiteral_3= '\"MIN\"' )
                    {
                    // InternalAsyncApi.g:7520:3: (enumLiteral_3= '\"MIN\"' )
                    // InternalAsyncApi.g:7521:4: enumLiteral_3= '\"MIN\"'
                    {
                    enumLiteral_3=(Token)match(input,112,FOLLOW_2); 

                    				current = grammarAccess.getAggregationFunctionAccess().getMINEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAggregationFunctionAccess().getMINEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleAggregationFunction"


    // $ANTLR start "ruleQoSMetricName"
    // InternalAsyncApi.g:7531:1: ruleQoSMetricName returns [Enumerator current=null] : ( (enumLiteral_0= '\"latency\"' ) | (enumLiteral_1= '\"availability\"' ) ) ;
    public final Enumerator ruleQoSMetricName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:7537:2: ( ( (enumLiteral_0= '\"latency\"' ) | (enumLiteral_1= '\"availability\"' ) ) )
            // InternalAsyncApi.g:7538:2: ( (enumLiteral_0= '\"latency\"' ) | (enumLiteral_1= '\"availability\"' ) )
            {
            // InternalAsyncApi.g:7538:2: ( (enumLiteral_0= '\"latency\"' ) | (enumLiteral_1= '\"availability\"' ) )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==113) ) {
                alt140=1;
            }
            else if ( (LA140_0==114) ) {
                alt140=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // InternalAsyncApi.g:7539:3: (enumLiteral_0= '\"latency\"' )
                    {
                    // InternalAsyncApi.g:7539:3: (enumLiteral_0= '\"latency\"' )
                    // InternalAsyncApi.g:7540:4: enumLiteral_0= '\"latency\"'
                    {
                    enumLiteral_0=(Token)match(input,113,FOLLOW_2); 

                    				current = grammarAccess.getQoSMetricNameAccess().getLatencyEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQoSMetricNameAccess().getLatencyEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:7547:3: (enumLiteral_1= '\"availability\"' )
                    {
                    // InternalAsyncApi.g:7547:3: (enumLiteral_1= '\"availability\"' )
                    // InternalAsyncApi.g:7548:4: enumLiteral_1= '\"availability\"'
                    {
                    enumLiteral_1=(Token)match(input,114,FOLLOW_2); 

                    				current = grammarAccess.getQoSMetricNameAccess().getAvailabilityEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQoSMetricNameAccess().getAvailabilityEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleQoSMetricName"


    // $ANTLR start "ruleQoSMetricUnit"
    // InternalAsyncApi.g:7558:1: ruleQoSMetricUnit returns [Enumerator current=null] : ( (enumLiteral_0= '\"milliseconds\"' ) | (enumLiteral_1= '\"seconds\"' ) | (enumLiteral_2= '\"minutes\"' ) | (enumLiteral_3= '\"hours\"' ) | (enumLiteral_4= '\"null\"' ) ) ;
    public final Enumerator ruleQoSMetricUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:7564:2: ( ( (enumLiteral_0= '\"milliseconds\"' ) | (enumLiteral_1= '\"seconds\"' ) | (enumLiteral_2= '\"minutes\"' ) | (enumLiteral_3= '\"hours\"' ) | (enumLiteral_4= '\"null\"' ) ) )
            // InternalAsyncApi.g:7565:2: ( (enumLiteral_0= '\"milliseconds\"' ) | (enumLiteral_1= '\"seconds\"' ) | (enumLiteral_2= '\"minutes\"' ) | (enumLiteral_3= '\"hours\"' ) | (enumLiteral_4= '\"null\"' ) )
            {
            // InternalAsyncApi.g:7565:2: ( (enumLiteral_0= '\"milliseconds\"' ) | (enumLiteral_1= '\"seconds\"' ) | (enumLiteral_2= '\"minutes\"' ) | (enumLiteral_3= '\"hours\"' ) | (enumLiteral_4= '\"null\"' ) )
            int alt141=5;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt141=1;
                }
                break;
            case 103:
                {
                alt141=2;
                }
                break;
            case 97:
                {
                alt141=3;
                }
                break;
            case 94:
                {
                alt141=4;
                }
                break;
            case 100:
                {
                alt141=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }

            switch (alt141) {
                case 1 :
                    // InternalAsyncApi.g:7566:3: (enumLiteral_0= '\"milliseconds\"' )
                    {
                    // InternalAsyncApi.g:7566:3: (enumLiteral_0= '\"milliseconds\"' )
                    // InternalAsyncApi.g:7567:4: enumLiteral_0= '\"milliseconds\"'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getQoSMetricUnitAccess().getMillisecondsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQoSMetricUnitAccess().getMillisecondsEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:7574:3: (enumLiteral_1= '\"seconds\"' )
                    {
                    // InternalAsyncApi.g:7574:3: (enumLiteral_1= '\"seconds\"' )
                    // InternalAsyncApi.g:7575:4: enumLiteral_1= '\"seconds\"'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getQoSMetricUnitAccess().getSecondsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQoSMetricUnitAccess().getSecondsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:7582:3: (enumLiteral_2= '\"minutes\"' )
                    {
                    // InternalAsyncApi.g:7582:3: (enumLiteral_2= '\"minutes\"' )
                    // InternalAsyncApi.g:7583:4: enumLiteral_2= '\"minutes\"'
                    {
                    enumLiteral_2=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getQoSMetricUnitAccess().getMinutesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getQoSMetricUnitAccess().getMinutesEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:7590:3: (enumLiteral_3= '\"hours\"' )
                    {
                    // InternalAsyncApi.g:7590:3: (enumLiteral_3= '\"hours\"' )
                    // InternalAsyncApi.g:7591:4: enumLiteral_3= '\"hours\"'
                    {
                    enumLiteral_3=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getQoSMetricUnitAccess().getHoursEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getQoSMetricUnitAccess().getHoursEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:7598:3: (enumLiteral_4= '\"null\"' )
                    {
                    // InternalAsyncApi.g:7598:3: (enumLiteral_4= '\"null\"' )
                    // InternalAsyncApi.g:7599:4: enumLiteral_4= '\"null\"'
                    {
                    enumLiteral_4=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getQoSMetricUnitAccess().getNullEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getQoSMetricUnitAccess().getNullEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleQoSMetricUnit"


    // $ANTLR start "ruleOperator"
    // InternalAsyncApi.g:7609:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= '\">\"' ) | (enumLiteral_1= '\">=\"' ) | (enumLiteral_2= '\"=\"' ) | (enumLiteral_3= '\"<=\"' ) | (enumLiteral_4= '\"<\"' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:7615:2: ( ( (enumLiteral_0= '\">\"' ) | (enumLiteral_1= '\">=\"' ) | (enumLiteral_2= '\"=\"' ) | (enumLiteral_3= '\"<=\"' ) | (enumLiteral_4= '\"<\"' ) ) )
            // InternalAsyncApi.g:7616:2: ( (enumLiteral_0= '\">\"' ) | (enumLiteral_1= '\">=\"' ) | (enumLiteral_2= '\"=\"' ) | (enumLiteral_3= '\"<=\"' ) | (enumLiteral_4= '\"<\"' ) )
            {
            // InternalAsyncApi.g:7616:2: ( (enumLiteral_0= '\">\"' ) | (enumLiteral_1= '\">=\"' ) | (enumLiteral_2= '\"=\"' ) | (enumLiteral_3= '\"<=\"' ) | (enumLiteral_4= '\"<\"' ) )
            int alt142=5;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt142=1;
                }
                break;
            case 86:
                {
                alt142=2;
                }
                break;
            case 84:
                {
                alt142=3;
                }
                break;
            case 83:
                {
                alt142=4;
                }
                break;
            case 82:
                {
                alt142=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;
            }

            switch (alt142) {
                case 1 :
                    // InternalAsyncApi.g:7617:3: (enumLiteral_0= '\">\"' )
                    {
                    // InternalAsyncApi.g:7617:3: (enumLiteral_0= '\">\"' )
                    // InternalAsyncApi.g:7618:4: enumLiteral_0= '\">\"'
                    {
                    enumLiteral_0=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getGreaterEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getGreaterEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:7625:3: (enumLiteral_1= '\">=\"' )
                    {
                    // InternalAsyncApi.g:7625:3: (enumLiteral_1= '\">=\"' )
                    // InternalAsyncApi.g:7626:4: enumLiteral_1= '\">=\"'
                    {
                    enumLiteral_1=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getGreater_equalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getGreater_equalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:7633:3: (enumLiteral_2= '\"=\"' )
                    {
                    // InternalAsyncApi.g:7633:3: (enumLiteral_2= '\"=\"' )
                    // InternalAsyncApi.g:7634:4: enumLiteral_2= '\"=\"'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getEqualEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:7641:3: (enumLiteral_3= '\"<=\"' )
                    {
                    // InternalAsyncApi.g:7641:3: (enumLiteral_3= '\"<=\"' )
                    // InternalAsyncApi.g:7642:4: enumLiteral_3= '\"<=\"'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getOperatorAccess().getLess_equalEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:7649:3: (enumLiteral_4= '\"<\"' )
                    {
                    // InternalAsyncApi.g:7649:3: (enumLiteral_4= '\"<\"' )
                    // InternalAsyncApi.g:7650:4: enumLiteral_4= '\"<\"'
                    {
                    enumLiteral_4=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getOperatorAccess().getLessEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleJsonType"
    // InternalAsyncApi.g:7660:1: ruleJsonType returns [Enumerator current=null] : ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"number\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"boolean\"' ) | (enumLiteral_4= '\"object\"' ) | (enumLiteral_5= '\"array\"' ) | (enumLiteral_6= '\"any\"' ) | (enumLiteral_7= '\"null\"' ) ) ;
    public final Enumerator ruleJsonType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:7666:2: ( ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"number\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"boolean\"' ) | (enumLiteral_4= '\"object\"' ) | (enumLiteral_5= '\"array\"' ) | (enumLiteral_6= '\"any\"' ) | (enumLiteral_7= '\"null\"' ) ) )
            // InternalAsyncApi.g:7667:2: ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"number\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"boolean\"' ) | (enumLiteral_4= '\"object\"' ) | (enumLiteral_5= '\"array\"' ) | (enumLiteral_6= '\"any\"' ) | (enumLiteral_7= '\"null\"' ) )
            {
            // InternalAsyncApi.g:7667:2: ( (enumLiteral_0= '\"string\"' ) | (enumLiteral_1= '\"number\"' ) | (enumLiteral_2= '\"integer\"' ) | (enumLiteral_3= '\"boolean\"' ) | (enumLiteral_4= '\"object\"' ) | (enumLiteral_5= '\"array\"' ) | (enumLiteral_6= '\"any\"' ) | (enumLiteral_7= '\"null\"' ) )
            int alt143=8;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt143=1;
                }
                break;
            case 101:
                {
                alt143=2;
                }
                break;
            case 95:
                {
                alt143=3;
                }
                break;
            case 91:
                {
                alt143=4;
                }
                break;
            case 102:
                {
                alt143=5;
                }
                break;
            case 90:
                {
                alt143=6;
                }
                break;
            case 89:
                {
                alt143=7;
                }
                break;
            case 100:
                {
                alt143=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }

            switch (alt143) {
                case 1 :
                    // InternalAsyncApi.g:7668:3: (enumLiteral_0= '\"string\"' )
                    {
                    // InternalAsyncApi.g:7668:3: (enumLiteral_0= '\"string\"' )
                    // InternalAsyncApi.g:7669:4: enumLiteral_0= '\"string\"'
                    {
                    enumLiteral_0=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJsonTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:7676:3: (enumLiteral_1= '\"number\"' )
                    {
                    // InternalAsyncApi.g:7676:3: (enumLiteral_1= '\"number\"' )
                    // InternalAsyncApi.g:7677:4: enumLiteral_1= '\"number\"'
                    {
                    enumLiteral_1=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getNumberEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJsonTypeAccess().getNumberEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:7684:3: (enumLiteral_2= '\"integer\"' )
                    {
                    // InternalAsyncApi.g:7684:3: (enumLiteral_2= '\"integer\"' )
                    // InternalAsyncApi.g:7685:4: enumLiteral_2= '\"integer\"'
                    {
                    enumLiteral_2=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getIntegerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJsonTypeAccess().getIntegerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:7692:3: (enumLiteral_3= '\"boolean\"' )
                    {
                    // InternalAsyncApi.g:7692:3: (enumLiteral_3= '\"boolean\"' )
                    // InternalAsyncApi.g:7693:4: enumLiteral_3= '\"boolean\"'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getBooleanEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJsonTypeAccess().getBooleanEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:7700:3: (enumLiteral_4= '\"object\"' )
                    {
                    // InternalAsyncApi.g:7700:3: (enumLiteral_4= '\"object\"' )
                    // InternalAsyncApi.g:7701:4: enumLiteral_4= '\"object\"'
                    {
                    enumLiteral_4=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getObjectEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getJsonTypeAccess().getObjectEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAsyncApi.g:7708:3: (enumLiteral_5= '\"array\"' )
                    {
                    // InternalAsyncApi.g:7708:3: (enumLiteral_5= '\"array\"' )
                    // InternalAsyncApi.g:7709:4: enumLiteral_5= '\"array\"'
                    {
                    enumLiteral_5=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getArrayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getJsonTypeAccess().getArrayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAsyncApi.g:7716:3: (enumLiteral_6= '\"any\"' )
                    {
                    // InternalAsyncApi.g:7716:3: (enumLiteral_6= '\"any\"' )
                    // InternalAsyncApi.g:7717:4: enumLiteral_6= '\"any\"'
                    {
                    enumLiteral_6=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getAnyEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getJsonTypeAccess().getAnyEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAsyncApi.g:7724:3: (enumLiteral_7= '\"null\"' )
                    {
                    // InternalAsyncApi.g:7724:3: (enumLiteral_7= '\"null\"' )
                    // InternalAsyncApi.g:7725:4: enumLiteral_7= '\"null\"'
                    {
                    enumLiteral_7=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getJsonTypeAccess().getNullEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getJsonTypeAccess().getNullEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleJsonType"


    // $ANTLR start "ruleBoolean"
    // InternalAsyncApi.g:7735:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:7741:2: ( ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) ) )
            // InternalAsyncApi.g:7742:2: ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) )
            {
            // InternalAsyncApi.g:7742:2: ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==80) ) {
                alt144=1;
            }
            else if ( (LA144_0==79) ) {
                alt144=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;
            }
            switch (alt144) {
                case 1 :
                    // InternalAsyncApi.g:7743:3: (enumLiteral_0= 'false' )
                    {
                    // InternalAsyncApi.g:7743:3: (enumLiteral_0= 'false' )
                    // InternalAsyncApi.g:7744:4: enumLiteral_0= 'false'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().get_falseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().get_falseEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:7751:3: (enumLiteral_1= 'true' )
                    {
                    // InternalAsyncApi.g:7751:3: (enumLiteral_1= 'true' )
                    // InternalAsyncApi.g:7752:4: enumLiteral_1= 'true'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().get_trueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().get_trueEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleVersionNumber"
    // InternalAsyncApi.g:7762:1: ruleVersionNumber returns [Enumerator current=null] : (enumLiteral_0= '\"2.0.0\"' ) ;
    public final Enumerator ruleVersionNumber() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:7768:2: ( (enumLiteral_0= '\"2.0.0\"' ) )
            // InternalAsyncApi.g:7769:2: (enumLiteral_0= '\"2.0.0\"' )
            {
            // InternalAsyncApi.g:7769:2: (enumLiteral_0= '\"2.0.0\"' )
            // InternalAsyncApi.g:7770:3: enumLiteral_0= '\"2.0.0\"'
            {
            enumLiteral_0=(Token)match(input,81,FOLLOW_2); 

            			current = grammarAccess.getVersionNumberAccess().get_200EnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getVersionNumberAccess().get_200EnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleVersionNumber"


    // $ANTLR start "ruleProtocol"
    // InternalAsyncApi.g:7779:1: ruleProtocol returns [Enumerator current=null] : ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) ) ;
    public final Enumerator ruleProtocol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalAsyncApi.g:7785:2: ( ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) ) )
            // InternalAsyncApi.g:7786:2: ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) )
            {
            // InternalAsyncApi.g:7786:2: ( (enumLiteral_0= '\"amqp\"' ) | (enumLiteral_1= '\"amqps\"' ) | (enumLiteral_2= '\"mqtt\"' ) | (enumLiteral_3= '\"mqtts\"' ) | (enumLiteral_4= '\"ws\"' ) | (enumLiteral_5= '\"wss\"' ) | (enumLiteral_6= '\"stomp\"' ) | (enumLiteral_7= '\"stomps\"' ) )
            int alt145=8;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt145=1;
                }
                break;
            case 88:
                {
                alt145=2;
                }
                break;
            case 98:
                {
                alt145=3;
                }
                break;
            case 99:
                {
                alt145=4;
                }
                break;
            case 107:
                {
                alt145=5;
                }
                break;
            case 108:
                {
                alt145=6;
                }
                break;
            case 104:
                {
                alt145=7;
                }
                break;
            case 105:
                {
                alt145=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // InternalAsyncApi.g:7787:3: (enumLiteral_0= '\"amqp\"' )
                    {
                    // InternalAsyncApi.g:7787:3: (enumLiteral_0= '\"amqp\"' )
                    // InternalAsyncApi.g:7788:4: enumLiteral_0= '\"amqp\"'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getAmqpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProtocolAccess().getAmqpEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAsyncApi.g:7795:3: (enumLiteral_1= '\"amqps\"' )
                    {
                    // InternalAsyncApi.g:7795:3: (enumLiteral_1= '\"amqps\"' )
                    // InternalAsyncApi.g:7796:4: enumLiteral_1= '\"amqps\"'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getAmqpsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProtocolAccess().getAmqpsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAsyncApi.g:7803:3: (enumLiteral_2= '\"mqtt\"' )
                    {
                    // InternalAsyncApi.g:7803:3: (enumLiteral_2= '\"mqtt\"' )
                    // InternalAsyncApi.g:7804:4: enumLiteral_2= '\"mqtt\"'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getMqttEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getProtocolAccess().getMqttEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAsyncApi.g:7811:3: (enumLiteral_3= '\"mqtts\"' )
                    {
                    // InternalAsyncApi.g:7811:3: (enumLiteral_3= '\"mqtts\"' )
                    // InternalAsyncApi.g:7812:4: enumLiteral_3= '\"mqtts\"'
                    {
                    enumLiteral_3=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getMqttsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getProtocolAccess().getMqttsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalAsyncApi.g:7819:3: (enumLiteral_4= '\"ws\"' )
                    {
                    // InternalAsyncApi.g:7819:3: (enumLiteral_4= '\"ws\"' )
                    // InternalAsyncApi.g:7820:4: enumLiteral_4= '\"ws\"'
                    {
                    enumLiteral_4=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getWsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getProtocolAccess().getWsEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalAsyncApi.g:7827:3: (enumLiteral_5= '\"wss\"' )
                    {
                    // InternalAsyncApi.g:7827:3: (enumLiteral_5= '\"wss\"' )
                    // InternalAsyncApi.g:7828:4: enumLiteral_5= '\"wss\"'
                    {
                    enumLiteral_5=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getWssEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getProtocolAccess().getWssEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalAsyncApi.g:7835:3: (enumLiteral_6= '\"stomp\"' )
                    {
                    // InternalAsyncApi.g:7835:3: (enumLiteral_6= '\"stomp\"' )
                    // InternalAsyncApi.g:7836:4: enumLiteral_6= '\"stomp\"'
                    {
                    enumLiteral_6=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getStompEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getProtocolAccess().getStompEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalAsyncApi.g:7843:3: (enumLiteral_7= '\"stomps\"' )
                    {
                    // InternalAsyncApi.g:7843:3: (enumLiteral_7= '\"stomps\"' )
                    // InternalAsyncApi.g:7844:4: enumLiteral_7= '\"stomps\"'
                    {
                    enumLiteral_7=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getStompsEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getProtocolAccess().getStompsEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleProtocol"

    // Delegated rules


    protected DFA62 dfa62 = new DFA62(this);
    protected DFA83 dfa83 = new DFA83(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\16\12\uffff";
    static final String dfa_3s = "\1\55\12\uffff";
    static final String dfa_4s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_5s = "\1\0\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\3\uffff\1\3\1\uffff\1\5\4\uffff\1\2\15\uffff\1\4\1\uffff\1\12\1\6\1\7\1\10\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 2327:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"name\"' otherlv_4= ':' ( (lv_name_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"title\"' otherlv_8= ':' ( (lv_title_9_0= ruleAnyString ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"summary\"' otherlv_12= ':' ( (lv_summary_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"description\"' otherlv_16= ':' ( (lv_description_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"deprecated\"' otherlv_20= ':' ( (lv_deprecated_21_0= ruleBoolean ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"headers\"' otherlv_24= ':' ( (lv_headers_25_0= ruleAbstractSchema ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"tags\"' otherlv_28= ':' otherlv_29= '[' ( (lv_tags_30_0= ruleTag ) ) (otherlv_31= ',' ( (lv_tags_32_0= ruleTag ) ) )* otherlv_33= ']' (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"payload\"' otherlv_36= ':' ( (lv_payload_37_0= ruleAbstractSchema ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"traits\"' otherlv_40= ':' otherlv_41= '[' ( (lv_traits_42_0= ruleAbstractMessageTrait ) ) (otherlv_43= ',' ( (lv_traits_44_0= ruleAbstractMessageTrait ) ) )* otherlv_45= ']' (otherlv_46= ',' )? ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_0 = input.LA(1);

                         
                        int index62_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA62_0==14) ) {s = 1;}

                        else if ( LA62_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA62_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA62_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA62_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA62_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA62_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA62_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA62_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA62_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getMessageAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                         
                        input.seek(index62_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\1\16\16\uffff";
    static final String dfa_9s = "\1\66\16\uffff";
    static final String dfa_10s = "\1\uffff\1\16\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15";
    static final String dfa_11s = "\1\0\16\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\3\uffff\1\2\1\uffff\1\4\11\uffff\1\12\1\14\16\uffff\1\3\1\5\1\6\1\7\1\10\1\11\1\13\1\15\1\16",
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
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA83 extends DFA {

        public DFA83(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 83;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 3077:6: ( ({...}? => ( ({...}? => (otherlv_3= '\"title\"' otherlv_4= ':' ( (lv_title_5_0= ruleAnyString ) ) (otherlv_6= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '\"type\"' otherlv_8= ':' ( (lv_type_9_0= ruleJsonType ) ) (otherlv_10= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= '\"description\"' otherlv_12= ':' ( (lv_description_13_0= ruleAnyString ) ) (otherlv_14= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= '\"format\"' otherlv_16= ':' ( (lv_format_17_0= ruleAnyString ) ) (otherlv_18= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= '\"minimum\"' otherlv_20= ':' ( (lv_minimum_21_0= RULE_INT ) ) (otherlv_22= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= '\"maximum\"' otherlv_24= ':' ( (lv_maximum_25_0= RULE_INT ) ) (otherlv_26= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= '\"minItems\"' otherlv_28= ':' ( (lv_minItems_29_0= RULE_INT ) ) (otherlv_30= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= '\"maxItems\"' otherlv_32= ':' ( (lv_maxItems_33_0= RULE_INT ) ) (otherlv_34= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= '\"default\"' otherlv_36= ':' ( (lv_default_37_0= rulePrimitiveValue ) ) (otherlv_38= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= '\"properties\"' otherlv_40= ':' otherlv_41= '{' ( (lv_properties_42_0= ruleNamedSchema ) ) (otherlv_43= ',' ( (lv_properties_44_0= ruleNamedSchema ) ) )* otherlv_45= '}' (otherlv_46= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= '\"enum\"' otherlv_48= ':' otherlv_49= '[' ( (lv_enum_50_0= rulePrimitiveValue ) ) (otherlv_51= ',' ( (lv_enum_52_0= rulePrimitiveValue ) ) )* otherlv_53= ']' (otherlv_54= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= '\"items\"' otherlv_56= ':' ( (lv_items_57_0= ruleAbstractSchema ) ) (otherlv_58= ',' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_59= '\"required\"' otherlv_60= ':' otherlv_61= '[' ( (lv_required_62_0= ruleAnyString ) ) (otherlv_63= ',' ( (lv_required_64_0= ruleAnyString ) ) )* otherlv_65= ']' (otherlv_66= ',' )? ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA83_0 = input.LA(1);

                         
                        int index83_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA83_0==14) ) {s = 1;}

                        else if ( LA83_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA83_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA83_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA83_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA83_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA83_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA83_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA83_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA83_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA83_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA83_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA83_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA83_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), 12) ) {s = 14;}

                         
                        input.seek(index83_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 83, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000003B200L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003FA00L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000003F200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0xFFFFFFFCFFFFB220L,0x00001FFFFFFE7FEFL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001FC0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001FC4800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001FC4000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000E004000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000E004800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006004800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000034100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000034104800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000034104000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x00001B0C01800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000C0104000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C0104800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000003C00104000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003C00104800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000003C000104000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000003C000104800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00003E8002144000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00003E8002144800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000002104000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000002104800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x007FC000C0144000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x007FC000C0144800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x000004708E000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xFFFFFFFCFFFFB230L,0x00001FFFFFFFFFEFL});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0180000000104000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0180000000104800L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000C000104000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000C000104800L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00001C8000104000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00001C8000104800L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x3E00001000004000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x3E00001000004800L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000002100000L,0x000000000000001CL});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000002104800L,0x000000000000003CL});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000002104000L,0x000000000000003CL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0006000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000009340000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0001E00000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000004800L,0x00000000000001C0L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000004000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0400000000000000L,0x0000008260000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0xFFFFFFFCFFFFB320L,0x00001FFFFFFE7FEFL});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x00000000007C0000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});

}
