/*
 * generated by Xtext 2.21.0
 */
package com.ktsv.gsl.parser.antlr;

import com.google.inject.Inject;
import com.ktsv.gsl.parser.antlr.internal.InternalGslParser;
import com.ktsv.gsl.services.GslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class GslParser extends AbstractAntlrParser {

	@Inject
	private GslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGslParser createParser(XtextTokenStream stream) {
		return new InternalGslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Gamamodel";
	}

	public GslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
