package amailp.parser

import amailp.elements.RobotIElementType

object RobotASTTypes {
  final val Ellipsis: RobotIElementType = new RobotIElementType("Ellipsis")

  final val SettingsTable: RobotIElementType = new RobotIElementType("SettingsTable")
  final val Setting: RobotIElementType = new RobotIElementType("Setting")
  final val SettingName: RobotIElementType = new RobotIElementType("SettingName")

  final val TestCasesTable: RobotIElementType = new RobotIElementType("TestCasesTable")
  final val TestCaseName: RobotIElementType = new RobotIElementType("TestCaseTitle")
  final val TestCaseDefinition: RobotIElementType = new RobotIElementType("TestCaseDefinition")

  final val KeywordsTable: RobotIElementType = new RobotIElementType("KeywordsTable")
  final val KeywordName: RobotIElementType = new RobotIElementType("KeywordName")
  final val KeywordDefinition: RobotIElementType = new RobotIElementType("KeywordDefinition")

  final val VariablesTable: RobotIElementType = new RobotIElementType("VariablesTable")
  final val TableRow: RobotIElementType = new RobotIElementType("TableRow")
  final val NonEmptyCell: RobotIElementType = new RobotIElementType("NonEmptyCell")
}