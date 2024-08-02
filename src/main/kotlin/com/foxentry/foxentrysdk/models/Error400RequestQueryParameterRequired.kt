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

@JsonDeserialize(`as` = Error400RequestQueryParameterRequiredImpl::class)
interface Error400RequestQueryParameterRequired {
  val group: Error400RequestQueryParameterRequiredGroup?
  val type: Error400RequestQueryParameterRequiredType?
  val subtype: Error400RequestQueryParameterRequiredSubtype?
  val severity: Error400RequestQueryParameterRequiredSeverity?
  val relatedTo: List<String?>?
  val description: Error400RequestQueryParameterRequiredDescription?
}

data class Error400RequestQueryParameterRequiredImpl(
    override val group: Error400RequestQueryParameterRequiredGroup?,
    override val type: Error400RequestQueryParameterRequiredType?,
    override val subtype: Error400RequestQueryParameterRequiredSubtype?,
    override val severity: Error400RequestQueryParameterRequiredSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error400RequestQueryParameterRequiredDescription?,
) : Error400RequestQueryParameterRequired
/** Group of error. */
enum class Error400RequestQueryParameterRequiredGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error400RequestQueryParameterRequiredType(@JsonValue val value: String) {
  QUERY("QUERY"),
}
/** Subtype of error. */
enum class Error400RequestQueryParameterRequiredSubtype(@JsonValue val value: String) {
  PARAMETERS_REQUIRED("PARAMETERS_REQUIRED"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error400RequestQueryParameterRequiredSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error400RequestQueryParameterRequiredDescription(@JsonValue val value: String) {
  AT_LEAST_ONE_OF_LISTED_PARAMETERS_IS_REQUIRED_("At least one of listed parameters is required."),
}
