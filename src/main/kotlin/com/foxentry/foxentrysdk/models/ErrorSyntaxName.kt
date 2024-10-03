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

@JsonDeserialize(`as` = ErrorSyntaxNameImpl::class)
interface ErrorSyntaxName {
  val group: ErrorSyntaxNameGroup?
  val type: ErrorSyntaxNameType?
  val subtype: ErrorSyntaxNameSubtype?
  val severity: ErrorSyntaxNameSeverity?
  val relatedTo: List<String?>?
  val description: ErrorSyntaxNameDescription?
}

data class ErrorSyntaxNameImpl(
    override val group: ErrorSyntaxNameGroup?,
    override val type: ErrorSyntaxNameType?,
    override val subtype: ErrorSyntaxNameSubtype?,
    override val severity: ErrorSyntaxNameSeverity?,
    override val relatedTo: List<String?>?,
    override val description: ErrorSyntaxNameDescription?,
) : ErrorSyntaxName
/** Group of error. */
enum class ErrorSyntaxNameGroup(@JsonValue val value: String) {
  SYNTAX("SYNTAX"),
}
/** Type of error. */
enum class ErrorSyntaxNameType(@JsonValue val value: String) {
  VALUE_PART_MISSING("VALUE_PART_MISSING"),
  VALUE_PART_POSITION("VALUE_PART_POSITION"),
}
/** Subtype of error. */
enum class ErrorSyntaxNameSubtype(@JsonValue val value: String) {
  NAME("NAME"),
  SURNAME("SURNAME"),
  DEGREE("DEGREE"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class ErrorSyntaxNameSeverity(@JsonValue val value: String) {
  INFO("info"),
  WARNING("warning"),
  CRITICAL("critical"),
}
/** Description of error. */
enum class ErrorSyntaxNameDescription(@JsonValue val value: String) {
  VALUE_IS_MISSING_THE_NAME_PART_("Value is missing the name part."),
  VALUE_IS_MISSING_THE_SURNAME_PART_("Value is missing the surname part."),
  THE_DEGREE_PART_OF_THE_VALUE_IS_PLACED_IN_THE_WRONG_POSITION_(
      "The DEGREE part of the value is placed in the wrong position."),
}
