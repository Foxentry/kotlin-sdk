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

@JsonDeserialize(`as` = ErrorSyntaxEmailImpl::class)
interface ErrorSyntaxEmail {
  val group: ErrorSyntaxEmailGroup?
  val type: ErrorSyntaxEmailType?
  val subtype: ErrorSyntaxEmailSubtype?
  val severity: ErrorSyntaxEmailSeverity?
  val relatedTo: List<String?>?
  val description: ErrorSyntaxEmailDescription?
}

data class ErrorSyntaxEmailImpl(
    override val group: ErrorSyntaxEmailGroup?,
    override val type: ErrorSyntaxEmailType?,
    override val subtype: ErrorSyntaxEmailSubtype?,
    override val severity: ErrorSyntaxEmailSeverity?,
    override val relatedTo: List<String?>?,
    override val description: ErrorSyntaxEmailDescription?,
) : ErrorSyntaxEmail
/** Group of error. */
enum class ErrorSyntaxEmailGroup(@JsonValue val value: String) {
  SYNTAX("SYNTAX"),
}
/** Type of error. */
enum class ErrorSyntaxEmailType(@JsonValue val value: String) {
  VALUE_PART("VALUE_PART"),
  VALUE_PART_EXTRA("VALUE_PART_EXTRA"),
  VALUE_PART_MISSING("VALUE_PART_MISSING"),
  VALUE_PART_POSITION("VALUE_PART_POSITION"),
}
/** Subtype of error. */
enum class ErrorSyntaxEmailSubtype(@JsonValue val value: String) {
  DOMAIN("DOMAIN"),
  AT_SIGN("AT_SIGN"),
  TLD("TLD"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class ErrorSyntaxEmailSeverity(@JsonValue val value: String) {
  INFO("info"),
  WARNING("warning"),
  CRITICAL("critical"),
}
/** Description of error. */
enum class ErrorSyntaxEmailDescription(@JsonValue val value: String) {
  THE_DOMAIN_CONTAINS_INVALID_SYNTAX_("The domain contains invalid syntax."),
  VALUE_CONTAINS_DUPLICATED_SIGN_("Value contains duplicated \'@\' sign."),
  VALUE_DOES_NOT_CONTAIN_SIGN_("Value does not contain \'@\' sign."),
  VALUE_IS_MISSING_THE_TOP_LEVEL_DOMAIN_("Value is missing the top level domain."),
  THE_TLD_PART_OF_THE_VALUE_IS_PLACED_IN_THE_WRONG_POSITION_(
      "The TLD part of the value is placed in the wrong position."),
}
