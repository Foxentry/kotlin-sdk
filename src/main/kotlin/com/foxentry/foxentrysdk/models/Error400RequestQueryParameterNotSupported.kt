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

@JsonDeserialize(`as` = Error400RequestQueryParameterNotSupportedImpl::class)
interface Error400RequestQueryParameterNotSupported {
  val group: Error400RequestQueryParameterNotSupportedGroup?
  val type: Error400RequestQueryParameterNotSupportedType?
  val subtype: Error400RequestQueryParameterNotSupportedSubtype?
  val severity: Error400RequestQueryParameterNotSupportedSeverity?
  val relatedTo: List<String?>?
  val description: Error400RequestQueryParameterNotSupportedDescription?
}

data class Error400RequestQueryParameterNotSupportedImpl(
    override val group: Error400RequestQueryParameterNotSupportedGroup?,
    override val type: Error400RequestQueryParameterNotSupportedType?,
    override val subtype: Error400RequestQueryParameterNotSupportedSubtype?,
    override val severity: Error400RequestQueryParameterNotSupportedSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error400RequestQueryParameterNotSupportedDescription?,
) : Error400RequestQueryParameterNotSupported
/** Group of error. */
enum class Error400RequestQueryParameterNotSupportedGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error400RequestQueryParameterNotSupportedType(@JsonValue val value: String) {
  QUERY("QUERY"),
}
/** Subtype of error. */
enum class Error400RequestQueryParameterNotSupportedSubtype(@JsonValue val value: String) {
  PARAMETERS_NOT_SUPPORTED("PARAMETERS_NOT_SUPPORTED"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error400RequestQueryParameterNotSupportedSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error400RequestQueryParameterNotSupportedDescription(@JsonValue val value: String) {
  QUERY_PARAMETER_IS_NOT_SUPPORTED_FOR_THIS_ENDPOINT_(
      "Query parameter is not supported for this endpoint."),
}
