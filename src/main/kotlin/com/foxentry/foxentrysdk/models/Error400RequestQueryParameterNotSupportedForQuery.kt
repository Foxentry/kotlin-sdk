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

@JsonDeserialize(`as` = Error400RequestQueryParameterNotSupportedForQueryImpl::class)
interface Error400RequestQueryParameterNotSupportedForQuery {
  val group: Error400RequestQueryParameterNotSupportedForQueryGroup?
  val type: Error400RequestQueryParameterNotSupportedForQueryType?
  val subtype: Error400RequestQueryParameterNotSupportedForQuerySubtype?
  val severity: Error400RequestQueryParameterNotSupportedForQuerySeverity?
  val relatedTo: List<String?>?
  val description: Error400RequestQueryParameterNotSupportedForQueryDescription?
}

data class Error400RequestQueryParameterNotSupportedForQueryImpl(
    override val group: Error400RequestQueryParameterNotSupportedForQueryGroup?,
    override val type: Error400RequestQueryParameterNotSupportedForQueryType?,
    override val subtype: Error400RequestQueryParameterNotSupportedForQuerySubtype?,
    override val severity: Error400RequestQueryParameterNotSupportedForQuerySeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error400RequestQueryParameterNotSupportedForQueryDescription?,
) : Error400RequestQueryParameterNotSupportedForQuery
/** Group of error. */
enum class Error400RequestQueryParameterNotSupportedForQueryGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error400RequestQueryParameterNotSupportedForQueryType(@JsonValue val value: String) {
  OPTIONS("OPTIONS"),
}
/** Subtype of error. */
enum class Error400RequestQueryParameterNotSupportedForQuerySubtype(@JsonValue val value: String) {
  PARAMETER_NOT_SUPPORTED_FOR_QUERY("PARAMETER_NOT_SUPPORTED_FOR_QUERY"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error400RequestQueryParameterNotSupportedForQuerySeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error400RequestQueryParameterNotSupportedForQueryDescription(
    @JsonValue val value: String
) {
  PARAMETER_CAN_NOT_BE_USED_IN_COMBINATION_WITH_THIS_QUERY_PARAMETERS_(
      "Parameter can not be used in combination with this query parameters."),
}
