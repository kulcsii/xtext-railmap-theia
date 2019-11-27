/*
 * generated by Xtext 2.20.0-SNAPSHOT
 */
grammar InternalRailLinesMap;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package hu.bme.mit.temalab.railmap.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package hu.bme.mit.temalab.railmap.parser.antlr.internal;

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
import hu.bme.mit.temalab.railmap.services.RailLinesMapGrammarAccess;

}

@parser::members {

 	private RailLinesMapGrammarAccess grammarAccess;

    public InternalRailLinesMapParser(TokenStream input, RailLinesMapGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "RailLineMap";
   	}

   	@Override
   	protected RailLinesMapGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRailLineMap
entryRuleRailLineMap returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRailLineMapRule()); }
	iv_ruleRailLineMap=ruleRailLineMap
	{ $current=$iv_ruleRailLineMap.current; }
	EOF;

// Rule RailLineMap
ruleRailLineMap returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='rail-map'
		{
			newLeafNode(otherlv_0, grammarAccess.getRailLineMapAccess().getRailMapKeyword_0());
		}
		(
			(
				lv_mapName_1_0=RULE_STRING
				{
					newLeafNode(lv_mapName_1_0, grammarAccess.getRailLineMapAccess().getMapNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRailLineMapRule());
					}
					setWithLastConsumed(
						$current,
						"mapName",
						lv_mapName_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRailLineMapAccess().getStationsStationParserRuleCall_2_0_0());
					}
					lv_stations_2_0=ruleStation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRailLineMapRule());
						}
						add(
							$current,
							"stations",
							lv_stations_2_0,
							"hu.bme.mit.temalab.railmap.RailLinesMap.Station");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getRailLineMapAccess().getTurnoutsTurnoutParserRuleCall_2_1_0());
					}
					lv_turnouts_3_0=ruleTurnout
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRailLineMapRule());
						}
						add(
							$current,
							"turnouts",
							lv_turnouts_3_0,
							"hu.bme.mit.temalab.railmap.RailLinesMap.Turnout");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getRailLineMapAccess().getConnectionsConnectionParserRuleCall_2_2_0());
					}
					lv_connections_4_0=ruleConnection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRailLineMapRule());
						}
						add(
							$current,
							"connections",
							lv_connections_4_0,
							"hu.bme.mit.temalab.railmap.RailLinesMap.Connection");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleStation
entryRuleStation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStationRule()); }
	iv_ruleStation=ruleStation
	{ $current=$iv_ruleStation.current; }
	EOF;

// Rule Station
ruleStation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='station'
		{
			newLeafNode(otherlv_0, grammarAccess.getStationAccess().getStationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='with'
			{
				newLeafNode(otherlv_2, grammarAccess.getStationAccess().getWithKeyword_2_0());
			}
			(
				(
					lv_tracks_3_0=RULE_INT
					{
						newLeafNode(lv_tracks_3_0, grammarAccess.getStationAccess().getTracksINTTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStationRule());
						}
						setWithLastConsumed(
							$current,
							"tracks",
							lv_tracks_3_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			otherlv_4='tracks'
			{
				newLeafNode(otherlv_4, grammarAccess.getStationAccess().getTracksKeyword_2_2());
			}
		)?
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getStationAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleConnection
entryRuleConnection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectionRule()); }
	iv_ruleConnection=ruleConnection
	{ $current=$iv_ruleConnection.current; }
	EOF;

// Rule Connection
ruleConnection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='connection'
		{
			newLeafNode(otherlv_0, grammarAccess.getConnectionAccess().getConnectionKeyword_0());
		}
		otherlv_1='from'
		{
			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getFromKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectionAccess().getSrcLocationParserRuleCall_2_0());
				}
				lv_src_2_0=ruleLocation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectionRule());
					}
					set(
						$current,
						"src",
						lv_src_2_0,
						"hu.bme.mit.temalab.railmap.RailLinesMap.Location");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='to'
		{
			newLeafNode(otherlv_3, grammarAccess.getConnectionAccess().getToKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectionAccess().getDstLocationParserRuleCall_4_0());
				}
				lv_dst_4_0=ruleLocation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectionRule());
					}
					set(
						$current,
						"dst",
						lv_dst_4_0,
						"hu.bme.mit.temalab.railmap.RailLinesMap.Location");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='in'
		{
			newLeafNode(otherlv_5, grammarAccess.getConnectionAccess().getInKeyword_5());
		}
		(
			(
				lv_length_6_0=RULE_INT
				{
					newLeafNode(lv_length_6_0, grammarAccess.getConnectionAccess().getLengthINTTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectionRule());
					}
					setWithLastConsumed(
						$current,
						"length",
						lv_length_6_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_7='segments'
		{
			newLeafNode(otherlv_7, grammarAccess.getConnectionAccess().getSegmentsKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectionAccess().getGaugeGaugeEnumRuleCall_8_0());
				}
				lv_gauge_8_0=ruleGauge
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectionRule());
					}
					set(
						$current,
						"gauge",
						lv_gauge_8_0,
						"hu.bme.mit.temalab.railmap.RailLinesMap.Gauge");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getConnectionAccess().getSemicolonKeyword_9());
		}
	)
;

// Entry rule entryRuleTurnout
entryRuleTurnout returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTurnoutRule()); }
	iv_ruleTurnout=ruleTurnout
	{ $current=$iv_ruleTurnout.current; }
	EOF;

// Rule Turnout
ruleTurnout returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='turnout'
		{
			newLeafNode(otherlv_0, grammarAccess.getTurnoutAccess().getTurnoutKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTurnoutAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTurnoutRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getTurnoutAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleLocation
entryRuleLocation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLocationRule()); }
	iv_ruleLocation=ruleLocation
	{ $current=$iv_ruleLocation.current; }
	EOF;

// Rule Location
ruleLocation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getLocationAccess().getStationTrackLocationParserRuleCall_0());
		}
		this_StationTrackLocation_0=ruleStationTrackLocation
		{
			$current = $this_StationTrackLocation_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLocationAccess().getTurnoutEndLocationParserRuleCall_1());
		}
		this_TurnoutEndLocation_1=ruleTurnoutEndLocation
		{
			$current = $this_TurnoutEndLocation_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleStationTrackLocation
entryRuleStationTrackLocation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStationTrackLocationRule()); }
	iv_ruleStationTrackLocation=ruleStationTrackLocation
	{ $current=$iv_ruleStationTrackLocation.current; }
	EOF;

// Rule StationTrackLocation
ruleStationTrackLocation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStationTrackLocationRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getStationTrackLocationAccess().getStationStationCrossReference_0_0());
				}
			)
		)
		otherlv_1='track'
		{
			newLeafNode(otherlv_1, grammarAccess.getStationTrackLocationAccess().getTrackKeyword_1());
		}
		(
			(
				lv_track_2_0=RULE_INT
				{
					newLeafNode(lv_track_2_0, grammarAccess.getStationTrackLocationAccess().getTrackINTTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStationTrackLocationRule());
					}
					setWithLastConsumed(
						$current,
						"track",
						lv_track_2_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleTurnoutEndLocation
entryRuleTurnoutEndLocation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTurnoutEndLocationRule()); }
	iv_ruleTurnoutEndLocation=ruleTurnoutEndLocation
	{ $current=$iv_ruleTurnoutEndLocation.current; }
	EOF;

// Rule TurnoutEndLocation
ruleTurnoutEndLocation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTurnoutEndLocationRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getTurnoutEndLocationAccess().getTurnoutTurnoutCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getTurnoutEndLocationAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTurnoutEndLocationAccess().getEndTurnoutEndEnumRuleCall_2_0());
				}
				lv_end_2_0=ruleTurnoutEnd
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTurnoutEndLocationRule());
					}
					set(
						$current,
						"end",
						lv_end_2_0,
						"hu.bme.mit.temalab.railmap.RailLinesMap.TurnoutEnd");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Rule TurnoutEnd
ruleTurnoutEnd returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='top'
			{
				$current = grammarAccess.getTurnoutEndAccess().getTOPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTurnoutEndAccess().getTOPEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='straight'
			{
				$current = grammarAccess.getTurnoutEndAccess().getSTRAIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTurnoutEndAccess().getSTRAIGHTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='divergent'
			{
				$current = grammarAccess.getTurnoutEndAccess().getDIVERGENTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTurnoutEndAccess().getDIVERGENTEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Gauge
ruleGauge returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='standard gauge'
			{
				$current = grammarAccess.getGaugeAccess().getSTANDARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getGaugeAccess().getSTANDARDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='narrow gauge'
			{
				$current = grammarAccess.getGaugeAccess().getNARROWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getGaugeAccess().getNARROWEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='broad gauge'
			{
				$current = grammarAccess.getGaugeAccess().getBROADEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getGaugeAccess().getBROADEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;