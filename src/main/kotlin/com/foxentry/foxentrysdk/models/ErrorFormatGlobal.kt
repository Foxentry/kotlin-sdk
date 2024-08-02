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

@JsonDeserialize(`as` = ErrorFormatGlobalImpl::class)
interface ErrorFormatGlobal {
  val group: ErrorFormatGlobalGroup?
  val type: ErrorFormatGlobalType?
  val subtype: ErrorFormatGlobalSubtype?
  val severity: ErrorFormatGlobalSeverity?
  val relatedTo: List<String?>?
  val description: ErrorFormatGlobalDescription?
}

data class ErrorFormatGlobalImpl(
    override val group: ErrorFormatGlobalGroup?,
    override val type: ErrorFormatGlobalType?,
    override val subtype: ErrorFormatGlobalSubtype?,
    override val severity: ErrorFormatGlobalSeverity?,
    override val relatedTo: List<String?>?,
    override val description: ErrorFormatGlobalDescription?,
) : ErrorFormatGlobal
/** Group of error. */
enum class ErrorFormatGlobalGroup(@JsonValue val value: String) {
  FORMAT("FORMAT"),
}
/** Type of error. */
enum class ErrorFormatGlobalType(@JsonValue val value: String) {
  CHARACTERS("CHARACTERS"),
}
/** Subtype of error. */
enum class ErrorFormatGlobalSubtype(@JsonValue val value: String?) {
  CASE_SENSITIVITY("CASE_SENSITIVITY"),
  DIACRITICS("DIACRITICS"),
  SPECIAL("SPECIAL"),
  WHITESPACES("WHITESPACES"),
  NULL(null),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class ErrorFormatGlobalSeverity(@JsonValue val value: String) {
  INFO("info"),
  WARNING("warning"),
  CRITICAL("critical"),
}
/** Description of error. */
enum class ErrorFormatGlobalDescription(@JsonValue val value: String?) {
  INVALID_CASE_SENSITIVITY_SPECIFIC_RULES_ARE_APPLIED_TO_THE_USE_OF_UPPER_AND_LOWER_CASE_LETTERS_(
      "Invalid case sensitivity. Specific rules are applied to the use of upper and lower case letters."),
  INVALID_DIACRITICS_SPECIFIC_RULES_ARE_APPLIED_TO_THE_USE_OF_DIACRITICS_(
      "Invalid diacritics. Specific rules are applied to the use of diacritics."),
  INVALID_USE_OF_SPACES_SPECIFIC_RULES_ARE_APPLIED_TO_THE_USE_OF_SPACES_(
      "Invalid use of spaces. Specific rules are applied to the use of spaces."),
  NULL(null),
}
