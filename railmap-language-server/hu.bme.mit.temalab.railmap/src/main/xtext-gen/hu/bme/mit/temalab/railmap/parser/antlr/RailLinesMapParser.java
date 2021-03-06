/*
 * generated by Xtext 2.20.0-SNAPSHOT
 */
package hu.bme.mit.temalab.railmap.parser.antlr;

import com.google.inject.Inject;
import hu.bme.mit.temalab.railmap.parser.antlr.internal.InternalRailLinesMapParser;
import hu.bme.mit.temalab.railmap.services.RailLinesMapGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class RailLinesMapParser extends AbstractAntlrParser {

	@Inject
	private RailLinesMapGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalRailLinesMapParser createParser(XtextTokenStream stream) {
		return new InternalRailLinesMapParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "RailLineMap";
	}

	public RailLinesMapGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RailLinesMapGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
