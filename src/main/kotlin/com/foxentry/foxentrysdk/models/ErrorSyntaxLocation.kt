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

@JsonDeserialize(`as` = ErrorSyntaxLocationImpl::class)
interface ErrorSyntaxLocation {
  val group: ErrorSyntaxLocationGroup?
  val type: ErrorSyntaxLocationType?
  val subtype: ErrorSyntaxLocationSubtype?
  val severity: ErrorSyntaxLocationSeverity?
  val relatedTo: List<String?>?
  val description: ErrorSyntaxLocationDescription?
}

data class ErrorSyntaxLocationImpl(
    override val group: ErrorSyntaxLocationGroup?,
    override val type: ErrorSyntaxLocationType?,
    override val subtype: ErrorSyntaxLocationSubtype?,
    override val severity: ErrorSyntaxLocationSeverity?,
    override val relatedTo: List<String?>?,
    override val description: ErrorSyntaxLocationDescription?,
) : ErrorSyntaxLocation
/** Group of error. */
enum class ErrorSyntaxLocationGroup(@JsonValue val value: String) {
  SYNTAX("SYNTAX"),
}
/** Type of error. */
enum class ErrorSyntaxLocationType(@JsonValue val value: String) {
  VALUE_PART_MISSING("VALUE_PART_MISSING"),
}
/** Subtype of error. */
enum class ErrorSyntaxLocationSubtype(@JsonValue val value: String) {
  CITY("CITY"),
  NUMBER_PART("NUMBER_PART"),
  STREET("STREET"),
  ZIP("ZIP"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class ErrorSyntaxLocationSeverity(@JsonValue val value: String) {
  INFO("info"),
  WARNING("warning"),
  CRITICAL("critical"),
}
/** Description of error. */
enum class ErrorSyntaxLocationDescription(@JsonValue val value: String) {
  VALUE_IS_MISSING_THE_CITY_("Value is missing the city."),
  VALUE_IS_MISSING_THE_NUMBER_PART_("Value is missing the number part."),
  VALUE_IS_MISSING_THE_STREET_("Value is missing the street."),
  VALUE_IS_MISSING_THE_ZIP_("Value is missing the zip."),
  VALUE_IS_MISSING_SOME_PART_OF_THE_NUMBER_("Value is missing some part of the number."),
}
