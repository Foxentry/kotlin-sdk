/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.models

import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.foxentry.foxentrysdk.core.*

@JsonDeserialize(`as` = ErrorSyntaxGlobalImpl::class)
interface ErrorSyntaxGlobal {
  val group: ErrorSyntaxGlobalGroup?
  val type: ErrorSyntaxGlobalType?
  val subtype: ErrorSyntaxGlobalSubtype?
  val severity: ErrorSyntaxGlobalSeverity?
  val relatedTo: List<String?>?
  val description: ErrorSyntaxGlobalDescription?
}

data class ErrorSyntaxGlobalImpl(
    override val group: ErrorSyntaxGlobalGroup?,
    override val type: ErrorSyntaxGlobalType?,
    override val subtype: ErrorSyntaxGlobalSubtype?,
    override val severity: ErrorSyntaxGlobalSeverity?,
    override val relatedTo: List<String?>?,
    override val description: ErrorSyntaxGlobalDescription?,
) : ErrorSyntaxGlobal
/** Group of error. */
enum class ErrorSyntaxGlobalGroup(@JsonValue val value: String) {
  SYNTAX("SYNTAX"),
}
/** Type of error. */
enum class ErrorSyntaxGlobalType(@JsonValue val value: String) {
  CHARACTERS("CHARACTERS"),
  INVALID("INVALID"),
  UNABLE_TO_PROCESS("UNABLE_TO_PROCESS"),
  VALUE_LENGTH("VALUE_LENGTH"),
  VALUE_PART_EXTRA("VALUE_PART_EXTRA"),
  VALUE_PART_MISSING("VALUE_PART_MISSING"),
}
/** Subtype of error. */
enum class ErrorSyntaxGlobalSubtype(@JsonValue val value: String) {
  NOT_ALLOWED("NOT_ALLOWED"),
  WHITESPACES("WHITESPACES"),
  TOO_LONG("TOO_LONG"),
  TOO_SHORT("TOO_SHORT"),
  CONTEXT("CONTEXT"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class ErrorSyntaxGlobalSeverity(@JsonValue val value: String) {
  INFO("info"),
  WARNING("warning"),
  CRITICAL("critical"),
}
/** Description of error. */
enum class ErrorSyntaxGlobalDescription(@JsonValue val value: String) {
  DISALLOWED_CHARACTERS_WERE_USED_IN_THE_VALUE_("Disallowed characters were used in the value."),
  VALUE_CONTAINS_INVALID_USE_OF_SPACES_("Value contains invalid use of spaces."),
  VALUE_HAS_INVALID_SYNTAX_("Value has invalid syntax."),
  CANNOT_BE_PROCESSED_DUE_TO_THE_INVALID_SYNTAX_("Cannot be processed due to the invalid syntax."),
  VALUE_IS_TOO_LONG_("Value is too long."),
  VALUE_IS_TOO_SHORT_("Value is too short."),
  VALUE_CONTAINS_UNNECCESSARY_CONTEXT_("Value contains unneccessary context."),
}
