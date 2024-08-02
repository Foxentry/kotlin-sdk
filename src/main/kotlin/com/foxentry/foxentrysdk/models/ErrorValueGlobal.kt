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

@JsonDeserialize(`as` = ErrorValueGlobalImpl::class)
interface ErrorValueGlobal {
  val group: ErrorValueGlobalGroup?
  val type: ErrorValueGlobalType?
  val subtype: ErrorValueGlobalSubtype?
  val severity: ErrorValueGlobalSeverity?
  val relatedTo: List<String?>?
  val description: ErrorValueGlobalDescription?
}

data class ErrorValueGlobalImpl(
    override val group: ErrorValueGlobalGroup?,
    override val type: ErrorValueGlobalType?,
    override val subtype: ErrorValueGlobalSubtype?,
    override val severity: ErrorValueGlobalSeverity?,
    override val relatedTo: List<String?>?,
    override val description: ErrorValueGlobalDescription?,
) : ErrorValueGlobal
/** Group of error. */
enum class ErrorValueGlobalGroup(@JsonValue val value: String) {
  VALUE("VALUE"),
}
/** Type of error. */
enum class ErrorValueGlobalType(@JsonValue val value: String) {
  EMPTY("EMPTY"),
  INCORRECT_ORDER("INCORRECT_ORDER"),
  INVALID("INVALID"),
  INVALID_COMBINATION("INVALID_COMBINATION"),
  NOT_ALLOWED("NOT_ALLOWED"),
}
/** Subtype of error. */
enum class ErrorValueGlobalSubtype(@JsonValue val value: Any?) {
  NULL(null),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class ErrorValueGlobalSeverity(@JsonValue val value: String) {
  INFO("info"),
  WARNING("warning"),
  CRITICAL("critical"),
}
/** Description of error. */
enum class ErrorValueGlobalDescription(@JsonValue val value: String) {
  VALUE_IS_EMPTY_("Value is empty."),
  VALUE_CONTAINS_PARTS_IN_INCORRECT_ORDER_("Value contains parts in incorrect order."),
  VALUE_IS_NOT_VALID_("Value is not valid."),
  THE_COMBINATION_OF_VALUES_LISTED_IN_RELATED_TO_SECTION_IS_NOT_VALID_(
      "The Combination of values listed in relatedTo section is not valid."),
  CONTEXT_WORDS_ARE_NOT_ALLOWED_("Context words are not allowed."),
}
