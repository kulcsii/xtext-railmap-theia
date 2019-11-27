/*
 * generated by Xtext 2.20.0-SNAPSHOT
 */
package hu.bme.mit.temalab.railmap.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RailLinesMapGrammarAccess extends AbstractGrammarElementFinder {
	
	public class RailLineMapElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.temalab.railmap.RailLinesMap.RailLineMap");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRailMapKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMapNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMapNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cMapNameAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cStationsAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cStationsStationParserRuleCall_2_0_0 = (RuleCall)cStationsAssignment_2_0.eContents().get(0);
		private final Assignment cTurnoutsAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cTurnoutsTurnoutParserRuleCall_2_1_0 = (RuleCall)cTurnoutsAssignment_2_1.eContents().get(0);
		private final Assignment cConnectionsAssignment_2_2 = (Assignment)cAlternatives_2.eContents().get(2);
		private final RuleCall cConnectionsConnectionParserRuleCall_2_2_0 = (RuleCall)cConnectionsAssignment_2_2.eContents().get(0);
		
		//RailLineMap:
		//	'rail-map' mapName=STRING (stations+=Station | turnouts+=Turnout | connections+=Connection)*;
		@Override public ParserRule getRule() { return rule; }
		
		//'rail-map' mapName=STRING (stations+=Station | turnouts+=Turnout | connections+=Connection)*
		public Group getGroup() { return cGroup; }
		
		//'rail-map'
		public Keyword getRailMapKeyword_0() { return cRailMapKeyword_0; }
		
		//mapName=STRING
		public Assignment getMapNameAssignment_1() { return cMapNameAssignment_1; }
		
		//STRING
		public RuleCall getMapNameSTRINGTerminalRuleCall_1_0() { return cMapNameSTRINGTerminalRuleCall_1_0; }
		
		//(stations+=Station | turnouts+=Turnout | connections+=Connection)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//stations+=Station
		public Assignment getStationsAssignment_2_0() { return cStationsAssignment_2_0; }
		
		//Station
		public RuleCall getStationsStationParserRuleCall_2_0_0() { return cStationsStationParserRuleCall_2_0_0; }
		
		//turnouts+=Turnout
		public Assignment getTurnoutsAssignment_2_1() { return cTurnoutsAssignment_2_1; }
		
		//Turnout
		public RuleCall getTurnoutsTurnoutParserRuleCall_2_1_0() { return cTurnoutsTurnoutParserRuleCall_2_1_0; }
		
		//connections+=Connection
		public Assignment getConnectionsAssignment_2_2() { return cConnectionsAssignment_2_2; }
		
		//Connection
		public RuleCall getConnectionsConnectionParserRuleCall_2_2_0() { return cConnectionsConnectionParserRuleCall_2_2_0; }
	}
	public class StationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.temalab.railmap.RailLinesMap.Station");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cWithKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTracksAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTracksINTTerminalRuleCall_2_1_0 = (RuleCall)cTracksAssignment_2_1.eContents().get(0);
		private final Keyword cTracksKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Station:
		//	'station' name=ID ('with' tracks=INT 'tracks')? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'station' name=ID ('with' tracks=INT 'tracks')? ';'
		public Group getGroup() { return cGroup; }
		
		//'station'
		public Keyword getStationKeyword_0() { return cStationKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('with' tracks=INT 'tracks')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'with'
		public Keyword getWithKeyword_2_0() { return cWithKeyword_2_0; }
		
		//tracks=INT
		public Assignment getTracksAssignment_2_1() { return cTracksAssignment_2_1; }
		
		//INT
		public RuleCall getTracksINTTerminalRuleCall_2_1_0() { return cTracksINTTerminalRuleCall_2_1_0; }
		
		//'tracks'
		public Keyword getTracksKeyword_2_2() { return cTracksKeyword_2_2; }
		
		//';'
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class ConnectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.temalab.railmap.RailLinesMap.Connection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConnectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cFromKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cSrcAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSrcLocationParserRuleCall_2_0 = (RuleCall)cSrcAssignment_2.eContents().get(0);
		private final Keyword cToKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cDstAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDstLocationParserRuleCall_4_0 = (RuleCall)cDstAssignment_4.eContents().get(0);
		private final Keyword cInKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cLengthAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cLengthINTTerminalRuleCall_6_0 = (RuleCall)cLengthAssignment_6.eContents().get(0);
		private final Keyword cSegmentsKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cGaugeAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cGaugeGaugeEnumRuleCall_8_0 = (RuleCall)cGaugeAssignment_8.eContents().get(0);
		private final Keyword cSemicolonKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Connection:
		//	'connection' 'from' src=Location 'to' dst=Location 'in' length=INT 'segments' gauge=Gauge? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'connection' 'from' src=Location 'to' dst=Location 'in' length=INT 'segments' gauge=Gauge? ';'
		public Group getGroup() { return cGroup; }
		
		//'connection'
		public Keyword getConnectionKeyword_0() { return cConnectionKeyword_0; }
		
		//'from'
		public Keyword getFromKeyword_1() { return cFromKeyword_1; }
		
		//src=Location
		public Assignment getSrcAssignment_2() { return cSrcAssignment_2; }
		
		//Location
		public RuleCall getSrcLocationParserRuleCall_2_0() { return cSrcLocationParserRuleCall_2_0; }
		
		//'to'
		public Keyword getToKeyword_3() { return cToKeyword_3; }
		
		//dst=Location
		public Assignment getDstAssignment_4() { return cDstAssignment_4; }
		
		//Location
		public RuleCall getDstLocationParserRuleCall_4_0() { return cDstLocationParserRuleCall_4_0; }
		
		//'in'
		public Keyword getInKeyword_5() { return cInKeyword_5; }
		
		//length=INT
		public Assignment getLengthAssignment_6() { return cLengthAssignment_6; }
		
		//INT
		public RuleCall getLengthINTTerminalRuleCall_6_0() { return cLengthINTTerminalRuleCall_6_0; }
		
		//'segments'
		public Keyword getSegmentsKeyword_7() { return cSegmentsKeyword_7; }
		
		//gauge=Gauge?
		public Assignment getGaugeAssignment_8() { return cGaugeAssignment_8; }
		
		//Gauge
		public RuleCall getGaugeGaugeEnumRuleCall_8_0() { return cGaugeGaugeEnumRuleCall_8_0; }
		
		//';'
		public Keyword getSemicolonKeyword_9() { return cSemicolonKeyword_9; }
	}
	public class TurnoutElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.temalab.railmap.RailLinesMap.Turnout");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTurnoutKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Turnout:
		//	'turnout' name=ID ';';
		@Override public ParserRule getRule() { return rule; }
		
		//'turnout' name=ID ';'
		public Group getGroup() { return cGroup; }
		
		//'turnout'
		public Keyword getTurnoutKeyword_0() { return cTurnoutKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class LocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.temalab.railmap.RailLinesMap.Location");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStationTrackLocationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTurnoutEndLocationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Location:
		//	StationTrackLocation | TurnoutEndLocation;
		@Override public ParserRule getRule() { return rule; }
		
		//StationTrackLocation | TurnoutEndLocation
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//StationTrackLocation
		public RuleCall getStationTrackLocationParserRuleCall_0() { return cStationTrackLocationParserRuleCall_0; }
		
		//TurnoutEndLocation
		public RuleCall getTurnoutEndLocationParserRuleCall_1() { return cTurnoutEndLocationParserRuleCall_1; }
	}
	public class StationTrackLocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.temalab.railmap.RailLinesMap.StationTrackLocation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cStationStationCrossReference_0_0 = (CrossReference)cStationAssignment_0.eContents().get(0);
		private final RuleCall cStationStationIDTerminalRuleCall_0_0_1 = (RuleCall)cStationStationCrossReference_0_0.eContents().get(1);
		private final Keyword cTrackKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTrackAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTrackINTTerminalRuleCall_2_0 = (RuleCall)cTrackAssignment_2.eContents().get(0);
		
		//StationTrackLocation:
		//	station=[Station] 'track' track=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//station=[Station] 'track' track=INT
		public Group getGroup() { return cGroup; }
		
		//station=[Station]
		public Assignment getStationAssignment_0() { return cStationAssignment_0; }
		
		//[Station]
		public CrossReference getStationStationCrossReference_0_0() { return cStationStationCrossReference_0_0; }
		
		//ID
		public RuleCall getStationStationIDTerminalRuleCall_0_0_1() { return cStationStationIDTerminalRuleCall_0_0_1; }
		
		//'track'
		public Keyword getTrackKeyword_1() { return cTrackKeyword_1; }
		
		//track=INT
		public Assignment getTrackAssignment_2() { return cTrackAssignment_2; }
		
		//INT
		public RuleCall getTrackINTTerminalRuleCall_2_0() { return cTrackINTTerminalRuleCall_2_0; }
	}
	public class TurnoutEndLocationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.temalab.railmap.RailLinesMap.TurnoutEndLocation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTurnoutAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cTurnoutTurnoutCrossReference_0_0 = (CrossReference)cTurnoutAssignment_0.eContents().get(0);
		private final RuleCall cTurnoutTurnoutIDTerminalRuleCall_0_0_1 = (RuleCall)cTurnoutTurnoutCrossReference_0_0.eContents().get(1);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEndAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEndTurnoutEndEnumRuleCall_2_0 = (RuleCall)cEndAssignment_2.eContents().get(0);
		
		//TurnoutEndLocation:
		//	turnout=[Turnout] '.' end=TurnoutEnd;
		@Override public ParserRule getRule() { return rule; }
		
		//turnout=[Turnout] '.' end=TurnoutEnd
		public Group getGroup() { return cGroup; }
		
		//turnout=[Turnout]
		public Assignment getTurnoutAssignment_0() { return cTurnoutAssignment_0; }
		
		//[Turnout]
		public CrossReference getTurnoutTurnoutCrossReference_0_0() { return cTurnoutTurnoutCrossReference_0_0; }
		
		//ID
		public RuleCall getTurnoutTurnoutIDTerminalRuleCall_0_0_1() { return cTurnoutTurnoutIDTerminalRuleCall_0_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//end=TurnoutEnd
		public Assignment getEndAssignment_2() { return cEndAssignment_2; }
		
		//TurnoutEnd
		public RuleCall getEndTurnoutEndEnumRuleCall_2_0() { return cEndTurnoutEndEnumRuleCall_2_0; }
	}
	
	public class TurnoutEndElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.temalab.railmap.RailLinesMap.TurnoutEnd");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTOPEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTOPTopKeyword_0_0 = (Keyword)cTOPEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cSTRAIGHTEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cSTRAIGHTStraightKeyword_1_0 = (Keyword)cSTRAIGHTEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cDIVERGENTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cDIVERGENTDivergentKeyword_2_0 = (Keyword)cDIVERGENTEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum TurnoutEnd:
		//	TOP='top' | STRAIGHT='straight' | DIVERGENT='divergent';
		public EnumRule getRule() { return rule; }
		
		//TOP='top' | STRAIGHT='straight' | DIVERGENT='divergent'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TOP='top'
		public EnumLiteralDeclaration getTOPEnumLiteralDeclaration_0() { return cTOPEnumLiteralDeclaration_0; }
		
		//'top'
		public Keyword getTOPTopKeyword_0_0() { return cTOPTopKeyword_0_0; }
		
		//STRAIGHT='straight'
		public EnumLiteralDeclaration getSTRAIGHTEnumLiteralDeclaration_1() { return cSTRAIGHTEnumLiteralDeclaration_1; }
		
		//'straight'
		public Keyword getSTRAIGHTStraightKeyword_1_0() { return cSTRAIGHTStraightKeyword_1_0; }
		
		//DIVERGENT='divergent'
		public EnumLiteralDeclaration getDIVERGENTEnumLiteralDeclaration_2() { return cDIVERGENTEnumLiteralDeclaration_2; }
		
		//'divergent'
		public Keyword getDIVERGENTDivergentKeyword_2_0() { return cDIVERGENTDivergentKeyword_2_0; }
	}
	public class GaugeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.temalab.railmap.RailLinesMap.Gauge");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cSTANDARDEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cSTANDARDStandardGaugeKeyword_0_0 = (Keyword)cSTANDARDEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cNARROWEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cNARROWNarrowGaugeKeyword_1_0 = (Keyword)cNARROWEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cBROADEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cBROADBroadGaugeKeyword_2_0 = (Keyword)cBROADEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum Gauge:
		//	STANDARD='standard gauge' | NARROW='narrow gauge' | BROAD='broad gauge';
		public EnumRule getRule() { return rule; }
		
		//STANDARD='standard gauge' | NARROW='narrow gauge' | BROAD='broad gauge'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STANDARD='standard gauge'
		public EnumLiteralDeclaration getSTANDARDEnumLiteralDeclaration_0() { return cSTANDARDEnumLiteralDeclaration_0; }
		
		//'standard gauge'
		public Keyword getSTANDARDStandardGaugeKeyword_0_0() { return cSTANDARDStandardGaugeKeyword_0_0; }
		
		//NARROW='narrow gauge'
		public EnumLiteralDeclaration getNARROWEnumLiteralDeclaration_1() { return cNARROWEnumLiteralDeclaration_1; }
		
		//'narrow gauge'
		public Keyword getNARROWNarrowGaugeKeyword_1_0() { return cNARROWNarrowGaugeKeyword_1_0; }
		
		//BROAD='broad gauge'
		public EnumLiteralDeclaration getBROADEnumLiteralDeclaration_2() { return cBROADEnumLiteralDeclaration_2; }
		
		//'broad gauge'
		public Keyword getBROADBroadGaugeKeyword_2_0() { return cBROADBroadGaugeKeyword_2_0; }
	}
	
	private final RailLineMapElements pRailLineMap;
	private final StationElements pStation;
	private final ConnectionElements pConnection;
	private final TurnoutElements pTurnout;
	private final LocationElements pLocation;
	private final StationTrackLocationElements pStationTrackLocation;
	private final TurnoutEndLocationElements pTurnoutEndLocation;
	private final TurnoutEndElements eTurnoutEnd;
	private final GaugeElements eGauge;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RailLinesMapGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pRailLineMap = new RailLineMapElements();
		this.pStation = new StationElements();
		this.pConnection = new ConnectionElements();
		this.pTurnout = new TurnoutElements();
		this.pLocation = new LocationElements();
		this.pStationTrackLocation = new StationTrackLocationElements();
		this.pTurnoutEndLocation = new TurnoutEndLocationElements();
		this.eTurnoutEnd = new TurnoutEndElements();
		this.eGauge = new GaugeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("hu.bme.mit.temalab.railmap.RailLinesMap".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//RailLineMap:
	//	'rail-map' mapName=STRING (stations+=Station | turnouts+=Turnout | connections+=Connection)*;
	public RailLineMapElements getRailLineMapAccess() {
		return pRailLineMap;
	}
	
	public ParserRule getRailLineMapRule() {
		return getRailLineMapAccess().getRule();
	}
	
	//Station:
	//	'station' name=ID ('with' tracks=INT 'tracks')? ';';
	public StationElements getStationAccess() {
		return pStation;
	}
	
	public ParserRule getStationRule() {
		return getStationAccess().getRule();
	}
	
	//Connection:
	//	'connection' 'from' src=Location 'to' dst=Location 'in' length=INT 'segments' gauge=Gauge? ';';
	public ConnectionElements getConnectionAccess() {
		return pConnection;
	}
	
	public ParserRule getConnectionRule() {
		return getConnectionAccess().getRule();
	}
	
	//Turnout:
	//	'turnout' name=ID ';';
	public TurnoutElements getTurnoutAccess() {
		return pTurnout;
	}
	
	public ParserRule getTurnoutRule() {
		return getTurnoutAccess().getRule();
	}
	
	//Location:
	//	StationTrackLocation | TurnoutEndLocation;
	public LocationElements getLocationAccess() {
		return pLocation;
	}
	
	public ParserRule getLocationRule() {
		return getLocationAccess().getRule();
	}
	
	//StationTrackLocation:
	//	station=[Station] 'track' track=INT;
	public StationTrackLocationElements getStationTrackLocationAccess() {
		return pStationTrackLocation;
	}
	
	public ParserRule getStationTrackLocationRule() {
		return getStationTrackLocationAccess().getRule();
	}
	
	//TurnoutEndLocation:
	//	turnout=[Turnout] '.' end=TurnoutEnd;
	public TurnoutEndLocationElements getTurnoutEndLocationAccess() {
		return pTurnoutEndLocation;
	}
	
	public ParserRule getTurnoutEndLocationRule() {
		return getTurnoutEndLocationAccess().getRule();
	}
	
	//enum TurnoutEnd:
	//	TOP='top' | STRAIGHT='straight' | DIVERGENT='divergent';
	public TurnoutEndElements getTurnoutEndAccess() {
		return eTurnoutEnd;
	}
	
	public EnumRule getTurnoutEndRule() {
		return getTurnoutEndAccess().getRule();
	}
	
	//enum Gauge:
	//	STANDARD='standard gauge' | NARROW='narrow gauge' | BROAD='broad gauge';
	public GaugeElements getGaugeAccess() {
		return eGauge;
	}
	
	public EnumRule getGaugeRule() {
		return getGaugeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
