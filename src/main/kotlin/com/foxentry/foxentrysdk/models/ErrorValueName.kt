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

@JsonDeserialize(`as` = ErrorValueNameImpl::class)
interface ErrorValueName {
  val group: ErrorValueNameGroup?
  val type: ErrorValueNameType?
  val subtype: ErrorValueNameSubtype?
  val severity: ErrorValueNameSeverity?
  val relatedTo: List<String?>?
  val description: ErrorValueNameDescription?
}

data class ErrorValueNameImpl(
    override val group: ErrorValueNameGroup?,
    override val type: ErrorValueNameType?,
    override val subtype: ErrorValueNameSubtype?,
    override val severity: ErrorValueNameSeverity?,
    override val relatedTo: List<String?>?,
    override val description: ErrorValueNameDescription?,
) : ErrorValueName
/** Group of error. */
enum class ErrorValueNameGroup(@JsonValue val value: String) {
  VALUE("VALUE"),
}
/** Type of error. */
enum class ErrorValueNameType(@JsonValue val value: String) {
  INVALID("INVALID"),
  NOT_ALLOWED("NOT_ALLOWED"),
}
/** Subtype of error. */
enum class ErrorValueNameSubtype(@JsonValue val value: String) {
  DEGREE("DEGREE"),
  NAME("NAME"),
  NAMESURNAME("NAMESURNAME"),
  SURNAME("SURNAME"),
  CONTEXT("CONTEXT"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class ErrorValueNameSeverity(@JsonValue val value: String) {
  INFO("info"),
  WARNING("warning"),
  CRITICAL("critical"),
}
/** Description of error. */
enum class ErrorValueNameDescription(@JsonValue val value: String) {
  DEGREE_VALUE_IS_INVALID_("Degree value is invalid."),
  NAME_HAS_NOT_BEEN_FOUND_IN_OUR_DATABASE_("Name has not been found in our database."),
  NAME_SURNAME_HAS_NOT_BEEN_FOUND_IN_OUR_DATABASE_(
      "NameSurname has not been found in our database."),
  SURNAME_HAS_NOT_BEEN_FOUND_IN_OUR_DATABASE_("Surname has not been found in our database."),
  DEGREES_ARE_NOT_ALLOWED_("Degrees are not allowed."),
}
