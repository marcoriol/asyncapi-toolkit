/*
 * generated by Xtext 2.17.0
 */
package io.github.abelgomez.asyncapi.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import io.github.abelgomez.asyncapi.ide.contentassist.antlr.internal.InternalAsyncApiParser;
import io.github.abelgomez.asyncapi.services.AsyncApiGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class AsyncApiParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AsyncApiGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AsyncApiGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractMessageAccess().getAlternatives(), "rule__AbstractMessage__Alternatives");
			builder.put(grammarAccess.getAbstractSchemaAccess().getAlternatives(), "rule__AbstractSchema__Alternatives");
			builder.put(grammarAccess.getPrimitiveValueAccess().getAlternatives(), "rule__PrimitiveValue__Alternatives");
			builder.put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
			builder.put(grammarAccess.getVersionNumberAccess().getAlternatives(), "rule__VersionNumber__Alternatives");
			builder.put(grammarAccess.getSchemeAccess().getAlternatives(), "rule__Scheme__Alternatives");
			builder.put(grammarAccess.getAsyncAPIAccess().getGroup(), "rule__AsyncAPI__Group__0");
			builder.put(grammarAccess.getAsyncAPIAccess().getGroup_2_0(), "rule__AsyncAPI__Group_2_0__0");
			builder.put(grammarAccess.getAsyncAPIAccess().getGroup_2_1(), "rule__AsyncAPI__Group_2_1__0");
			builder.put(grammarAccess.getAsyncAPIAccess().getGroup_2_2(), "rule__AsyncAPI__Group_2_2__0");
			builder.put(grammarAccess.getAsyncAPIAccess().getGroup_2_2_4(), "rule__AsyncAPI__Group_2_2_4__0");
			builder.put(grammarAccess.getAsyncAPIAccess().getGroup_2_3(), "rule__AsyncAPI__Group_2_3__0");
			builder.put(grammarAccess.getAsyncAPIAccess().getGroup_2_3_4(), "rule__AsyncAPI__Group_2_3_4__0");
			builder.put(grammarAccess.getAsyncAPIAccess().getGroup_2_4(), "rule__AsyncAPI__Group_2_4__0");
			builder.put(grammarAccess.getAsyncAPIAccess().getGroup_2_5(), "rule__AsyncAPI__Group_2_5__0");
			builder.put(grammarAccess.getInfoAccess().getGroup(), "rule__Info__Group__0");
			builder.put(grammarAccess.getInfoAccess().getGroup_2_0(), "rule__Info__Group_2_0__0");
			builder.put(grammarAccess.getInfoAccess().getGroup_2_1(), "rule__Info__Group_2_1__0");
			builder.put(grammarAccess.getInfoAccess().getGroup_2_2(), "rule__Info__Group_2_2__0");
			builder.put(grammarAccess.getInfoAccess().getGroup_2_3(), "rule__Info__Group_2_3__0");
			builder.put(grammarAccess.getInfoAccess().getGroup_2_4(), "rule__Info__Group_2_4__0");
			builder.put(grammarAccess.getInfoAccess().getGroup_2_5(), "rule__Info__Group_2_5__0");
			builder.put(grammarAccess.getContactAccess().getGroup(), "rule__Contact__Group__0");
			builder.put(grammarAccess.getContactAccess().getGroup_2_0(), "rule__Contact__Group_2_0__0");
			builder.put(grammarAccess.getContactAccess().getGroup_2_1(), "rule__Contact__Group_2_1__0");
			builder.put(grammarAccess.getContactAccess().getGroup_2_2(), "rule__Contact__Group_2_2__0");
			builder.put(grammarAccess.getLicenseAccess().getGroup(), "rule__License__Group__0");
			builder.put(grammarAccess.getLicenseAccess().getGroup_2_0(), "rule__License__Group_2_0__0");
			builder.put(grammarAccess.getLicenseAccess().getGroup_2_1(), "rule__License__Group_2_1__0");
			builder.put(grammarAccess.getServerAccess().getGroup(), "rule__Server__Group__0");
			builder.put(grammarAccess.getServerAccess().getGroup_2_0(), "rule__Server__Group_2_0__0");
			builder.put(grammarAccess.getServerAccess().getGroup_2_1(), "rule__Server__Group_2_1__0");
			builder.put(grammarAccess.getServerAccess().getGroup_2_2(), "rule__Server__Group_2_2__0");
			builder.put(grammarAccess.getServerAccess().getGroup_2_3(), "rule__Server__Group_2_3__0");
			builder.put(grammarAccess.getServerAccess().getGroup_2_3_4(), "rule__Server__Group_2_3_4__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_4_0(), "rule__Variable__Group_4_0__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_4_1(), "rule__Variable__Group_4_1__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_4_2(), "rule__Variable__Group_4_2__0");
			builder.put(grammarAccess.getVariableAccess().getGroup_4_2_4(), "rule__Variable__Group_4_2_4__0");
			builder.put(grammarAccess.getTopicAccess().getGroup(), "rule__Topic__Group__0");
			builder.put(grammarAccess.getTopicAccess().getGroup_4_0(), "rule__Topic__Group_4_0__0");
			builder.put(grammarAccess.getTopicAccess().getGroup_4_1(), "rule__Topic__Group_4_1__0");
			builder.put(grammarAccess.getMessageAccess().getGroup(), "rule__Message__Group__0");
			builder.put(grammarAccess.getMessageAccess().getGroup_2_0(), "rule__Message__Group_2_0__0");
			builder.put(grammarAccess.getMessageAccess().getGroup_2_1(), "rule__Message__Group_2_1__0");
			builder.put(grammarAccess.getMessageAccess().getGroup_2_2(), "rule__Message__Group_2_2__0");
			builder.put(grammarAccess.getMessageAccess().getGroup_2_3(), "rule__Message__Group_2_3__0");
			builder.put(grammarAccess.getMessageAccess().getGroup_2_4(), "rule__Message__Group_2_4__0");
			builder.put(grammarAccess.getMessageAccess().getGroup_2_4_4(), "rule__Message__Group_2_4_4__0");
			builder.put(grammarAccess.getMessageAccess().getGroup_2_5(), "rule__Message__Group_2_5__0");
			builder.put(grammarAccess.getNamedMessageAccess().getGroup(), "rule__NamedMessage__Group__0");
			builder.put(grammarAccess.getTagAccess().getGroup(), "rule__Tag__Group__0");
			builder.put(grammarAccess.getTagAccess().getGroup_2_0(), "rule__Tag__Group_2_0__0");
			builder.put(grammarAccess.getTagAccess().getGroup_2_1(), "rule__Tag__Group_2_1__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup(), "rule__Schema__Group__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_2_0(), "rule__Schema__Group_2_0__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_2_1(), "rule__Schema__Group_2_1__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_2_2(), "rule__Schema__Group_2_2__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_2_3(), "rule__Schema__Group_2_3__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_2_4(), "rule__Schema__Group_2_4__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_2_5(), "rule__Schema__Group_2_5__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_2_6(), "rule__Schema__Group_2_6__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_2_6_4(), "rule__Schema__Group_2_6_4__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_2_7(), "rule__Schema__Group_2_7__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_2_7_4(), "rule__Schema__Group_2_7_4__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_2_8(), "rule__Schema__Group_2_8__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_2_9(), "rule__Schema__Group_2_9__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_2_9_4(), "rule__Schema__Group_2_9_4__0");
			builder.put(grammarAccess.getSchemaAccess().getGroup_2_10(), "rule__Schema__Group_2_10__0");
			builder.put(grammarAccess.getNamedSchemaAccess().getGroup(), "rule__NamedSchema__Group__0");
			builder.put(grammarAccess.getComponentsAccess().getGroup(), "rule__Components__Group__0");
			builder.put(grammarAccess.getComponentsAccess().getGroup_2_0(), "rule__Components__Group_2_0__0");
			builder.put(grammarAccess.getComponentsAccess().getGroup_2_0_4(), "rule__Components__Group_2_0_4__0");
			builder.put(grammarAccess.getComponentsAccess().getGroup_2_1(), "rule__Components__Group_2_1__0");
			builder.put(grammarAccess.getComponentsAccess().getGroup_2_1_4(), "rule__Components__Group_2_1_4__0");
			builder.put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
			builder.put(grammarAccess.getReferenceAccess().getGroup_1(), "rule__Reference__Group_1__0");
			builder.put(grammarAccess.getAsyncAPIAccess().getVersionAssignment_2_0_2(), "rule__AsyncAPI__VersionAssignment_2_0_2");
			builder.put(grammarAccess.getAsyncAPIAccess().getInfoAssignment_2_1_2(), "rule__AsyncAPI__InfoAssignment_2_1_2");
			builder.put(grammarAccess.getAsyncAPIAccess().getServersAssignment_2_2_3(), "rule__AsyncAPI__ServersAssignment_2_2_3");
			builder.put(grammarAccess.getAsyncAPIAccess().getServersAssignment_2_2_4_1(), "rule__AsyncAPI__ServersAssignment_2_2_4_1");
			builder.put(grammarAccess.getAsyncAPIAccess().getTopicsAssignment_2_3_3(), "rule__AsyncAPI__TopicsAssignment_2_3_3");
			builder.put(grammarAccess.getAsyncAPIAccess().getTopicsAssignment_2_3_4_1(), "rule__AsyncAPI__TopicsAssignment_2_3_4_1");
			builder.put(grammarAccess.getAsyncAPIAccess().getComponentsAssignment_2_4_2(), "rule__AsyncAPI__ComponentsAssignment_2_4_2");
			builder.put(grammarAccess.getAsyncAPIAccess().getBaseTopicAssignment_2_5_2(), "rule__AsyncAPI__BaseTopicAssignment_2_5_2");
			builder.put(grammarAccess.getInfoAccess().getTitleAssignment_2_0_2(), "rule__Info__TitleAssignment_2_0_2");
			builder.put(grammarAccess.getInfoAccess().getVersionAssignment_2_1_2(), "rule__Info__VersionAssignment_2_1_2");
			builder.put(grammarAccess.getInfoAccess().getDescriptionAssignment_2_2_2(), "rule__Info__DescriptionAssignment_2_2_2");
			builder.put(grammarAccess.getInfoAccess().getTermsOfServiceAssignment_2_3_2(), "rule__Info__TermsOfServiceAssignment_2_3_2");
			builder.put(grammarAccess.getInfoAccess().getContactAssignment_2_4_2(), "rule__Info__ContactAssignment_2_4_2");
			builder.put(grammarAccess.getInfoAccess().getLicenseAssignment_2_5_2(), "rule__Info__LicenseAssignment_2_5_2");
			builder.put(grammarAccess.getContactAccess().getNameAssignment_2_0_2(), "rule__Contact__NameAssignment_2_0_2");
			builder.put(grammarAccess.getContactAccess().getUrlAssignment_2_1_2(), "rule__Contact__UrlAssignment_2_1_2");
			builder.put(grammarAccess.getContactAccess().getEmailAssignment_2_2_2(), "rule__Contact__EmailAssignment_2_2_2");
			builder.put(grammarAccess.getLicenseAccess().getNameAssignment_2_0_2(), "rule__License__NameAssignment_2_0_2");
			builder.put(grammarAccess.getLicenseAccess().getUrlAssignment_2_1_2(), "rule__License__UrlAssignment_2_1_2");
			builder.put(grammarAccess.getServerAccess().getTitleAssignment_2_0_2(), "rule__Server__TitleAssignment_2_0_2");
			builder.put(grammarAccess.getServerAccess().getSchemeAssignment_2_1_2(), "rule__Server__SchemeAssignment_2_1_2");
			builder.put(grammarAccess.getServerAccess().getDescriptionAssignment_2_2_2(), "rule__Server__DescriptionAssignment_2_2_2");
			builder.put(grammarAccess.getServerAccess().getVariablesAssignment_2_3_3(), "rule__Server__VariablesAssignment_2_3_3");
			builder.put(grammarAccess.getServerAccess().getVariablesAssignment_2_3_4_1(), "rule__Server__VariablesAssignment_2_3_4_1");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
			builder.put(grammarAccess.getVariableAccess().getDescriptionAssignment_4_0_2(), "rule__Variable__DescriptionAssignment_4_0_2");
			builder.put(grammarAccess.getVariableAccess().getDefaultAssignment_4_1_2(), "rule__Variable__DefaultAssignment_4_1_2");
			builder.put(grammarAccess.getVariableAccess().getEnumAssignment_4_2_3(), "rule__Variable__EnumAssignment_4_2_3");
			builder.put(grammarAccess.getVariableAccess().getEnumAssignment_4_2_4_1(), "rule__Variable__EnumAssignment_4_2_4_1");
			builder.put(grammarAccess.getTopicAccess().getNameAssignment_1(), "rule__Topic__NameAssignment_1");
			builder.put(grammarAccess.getTopicAccess().getPublishAssignment_4_0_2(), "rule__Topic__PublishAssignment_4_0_2");
			builder.put(grammarAccess.getTopicAccess().getSubscribeAssignment_4_1_2(), "rule__Topic__SubscribeAssignment_4_1_2");
			builder.put(grammarAccess.getMessageAccess().getSummaryAssignment_2_0_2(), "rule__Message__SummaryAssignment_2_0_2");
			builder.put(grammarAccess.getMessageAccess().getDescriptionAssignment_2_1_2(), "rule__Message__DescriptionAssignment_2_1_2");
			builder.put(grammarAccess.getMessageAccess().getDeprecatedAssignment_2_2_2(), "rule__Message__DeprecatedAssignment_2_2_2");
			builder.put(grammarAccess.getMessageAccess().getHeadersAssignment_2_3_2(), "rule__Message__HeadersAssignment_2_3_2");
			builder.put(grammarAccess.getMessageAccess().getTagsAssignment_2_4_3(), "rule__Message__TagsAssignment_2_4_3");
			builder.put(grammarAccess.getMessageAccess().getTagsAssignment_2_4_4_1(), "rule__Message__TagsAssignment_2_4_4_1");
			builder.put(grammarAccess.getMessageAccess().getPayloadAssignment_2_5_2(), "rule__Message__PayloadAssignment_2_5_2");
			builder.put(grammarAccess.getNamedMessageAccess().getNameAssignment_1(), "rule__NamedMessage__NameAssignment_1");
			builder.put(grammarAccess.getNamedMessageAccess().getMessageAssignment_3(), "rule__NamedMessage__MessageAssignment_3");
			builder.put(grammarAccess.getTagAccess().getNameAssignment_2_0_2(), "rule__Tag__NameAssignment_2_0_2");
			builder.put(grammarAccess.getTagAccess().getDescriptionAssignment_2_1_2(), "rule__Tag__DescriptionAssignment_2_1_2");
			builder.put(grammarAccess.getSchemaAccess().getTitleAssignment_2_0_2(), "rule__Schema__TitleAssignment_2_0_2");
			builder.put(grammarAccess.getSchemaAccess().getTypeAssignment_2_1_2(), "rule__Schema__TypeAssignment_2_1_2");
			builder.put(grammarAccess.getSchemaAccess().getDescriptionAssignment_2_2_2(), "rule__Schema__DescriptionAssignment_2_2_2");
			builder.put(grammarAccess.getSchemaAccess().getFormatAssignment_2_3_2(), "rule__Schema__FormatAssignment_2_3_2");
			builder.put(grammarAccess.getSchemaAccess().getDefaultAssignment_2_4_2(), "rule__Schema__DefaultAssignment_2_4_2");
			builder.put(grammarAccess.getSchemaAccess().getPayloadAssignment_2_5_2(), "rule__Schema__PayloadAssignment_2_5_2");
			builder.put(grammarAccess.getSchemaAccess().getPropertiesAssignment_2_6_3(), "rule__Schema__PropertiesAssignment_2_6_3");
			builder.put(grammarAccess.getSchemaAccess().getPropertiesAssignment_2_6_4_1(), "rule__Schema__PropertiesAssignment_2_6_4_1");
			builder.put(grammarAccess.getSchemaAccess().getEnumAssignment_2_7_3(), "rule__Schema__EnumAssignment_2_7_3");
			builder.put(grammarAccess.getSchemaAccess().getEnumAssignment_2_7_4_1(), "rule__Schema__EnumAssignment_2_7_4_1");
			builder.put(grammarAccess.getSchemaAccess().getItemsAssignment_2_8_2(), "rule__Schema__ItemsAssignment_2_8_2");
			builder.put(grammarAccess.getSchemaAccess().getRequiredAssignment_2_9_3(), "rule__Schema__RequiredAssignment_2_9_3");
			builder.put(grammarAccess.getSchemaAccess().getRequiredAssignment_2_9_4_1(), "rule__Schema__RequiredAssignment_2_9_4_1");
			builder.put(grammarAccess.getSchemaAccess().getFriendlyNameAssignment_2_10_2(), "rule__Schema__FriendlyNameAssignment_2_10_2");
			builder.put(grammarAccess.getNamedSchemaAccess().getNameAssignment_1(), "rule__NamedSchema__NameAssignment_1");
			builder.put(grammarAccess.getNamedSchemaAccess().getSchemaAssignment_3(), "rule__NamedSchema__SchemaAssignment_3");
			builder.put(grammarAccess.getComponentsAccess().getSchemasAssignment_2_0_3(), "rule__Components__SchemasAssignment_2_0_3");
			builder.put(grammarAccess.getComponentsAccess().getSchemasAssignment_2_0_4_1(), "rule__Components__SchemasAssignment_2_0_4_1");
			builder.put(grammarAccess.getComponentsAccess().getMessagesAssignment_2_1_3(), "rule__Components__MessagesAssignment_2_1_3");
			builder.put(grammarAccess.getComponentsAccess().getMessagesAssignment_2_1_4_1(), "rule__Components__MessagesAssignment_2_1_4_1");
			builder.put(grammarAccess.getReferenceAccess().getRefnameAssignment_1_0(), "rule__Reference__RefnameAssignment_1_0");
			builder.put(grammarAccess.getReferenceAccess().getUriAssignment_5(), "rule__Reference__UriAssignment_5");
			builder.put(grammarAccess.getAsyncAPIAccess().getUnorderedGroup_2(), "rule__AsyncAPI__UnorderedGroup_2");
			builder.put(grammarAccess.getInfoAccess().getUnorderedGroup_2(), "rule__Info__UnorderedGroup_2");
			builder.put(grammarAccess.getContactAccess().getUnorderedGroup_2(), "rule__Contact__UnorderedGroup_2");
			builder.put(grammarAccess.getLicenseAccess().getUnorderedGroup_2(), "rule__License__UnorderedGroup_2");
			builder.put(grammarAccess.getServerAccess().getUnorderedGroup_2(), "rule__Server__UnorderedGroup_2");
			builder.put(grammarAccess.getVariableAccess().getUnorderedGroup_4(), "rule__Variable__UnorderedGroup_4");
			builder.put(grammarAccess.getTopicAccess().getUnorderedGroup_4(), "rule__Topic__UnorderedGroup_4");
			builder.put(grammarAccess.getMessageAccess().getUnorderedGroup_2(), "rule__Message__UnorderedGroup_2");
			builder.put(grammarAccess.getTagAccess().getUnorderedGroup_2(), "rule__Tag__UnorderedGroup_2");
			builder.put(grammarAccess.getSchemaAccess().getUnorderedGroup_2(), "rule__Schema__UnorderedGroup_2");
			builder.put(grammarAccess.getComponentsAccess().getUnorderedGroup_2(), "rule__Components__UnorderedGroup_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AsyncApiGrammarAccess grammarAccess;

	@Override
	protected InternalAsyncApiParser createParser() {
		InternalAsyncApiParser result = new InternalAsyncApiParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AsyncApiGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AsyncApiGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
