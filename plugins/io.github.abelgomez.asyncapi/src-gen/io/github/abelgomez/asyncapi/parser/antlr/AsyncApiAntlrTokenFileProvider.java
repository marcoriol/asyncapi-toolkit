/*
 * generated by Xtext 2.18.0.M3
 */
package io.github.abelgomez.asyncapi.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AsyncApiAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("io/github/abelgomez/asyncapi/parser/antlr/internal/InternalAsyncApi.tokens");
	}
}
