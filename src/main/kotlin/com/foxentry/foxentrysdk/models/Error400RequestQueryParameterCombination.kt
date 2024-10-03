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

@JsonDeserialize(`as` = Error400RequestQueryParameterCombinationImpl::class)
interface Error400RequestQueryParameterCombination {
  val group: Error400RequestQueryParameterCombinationGroup?
  val type: Error400RequestQueryParameterCombinationType?
  val subtype: Error400RequestQueryParameterCombinationSubtype?
  val severity: Error400RequestQueryParameterCombinationSeverity?
  val relatedTo: List<String?>?
  val description: Error400RequestQueryParameterCombinationDescription?
}

data class Error400RequestQueryParameterCombinationImpl(
    override val group: Error400RequestQueryParameterCombinationGroup?,
    override val type: Error400RequestQueryParameterCombinationType?,
    override val subtype: Error400RequestQueryParameterCombinationSubtype?,
    override val severity: Error400RequestQueryParameterCombinationSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error400RequestQueryParameterCombinationDescription?,
) : Error400RequestQueryParameterCombination
/** Group of error. */
enum class Error400RequestQueryParameterCombinationGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error400RequestQueryParameterCombinationType(@JsonValue val value: String) {
  QUERY("QUERY"),
}
/** Subtype of error. */
enum class Error400RequestQueryParameterCombinationSubtype(@JsonValue val value: String) {
  PARAMETERS_COMBINATION("PARAMETERS_COMBINATION"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error400RequestQueryParameterCombinationSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error400RequestQueryParameterCombinationDescription(@JsonValue val value: String) {
  IT_IS_NOT_POSSIBLE_TO_USE_THESE_PARAMETERS_AT_THE_SAME_TIME_IN_ONE_REQUEST_(
      "It is not possible to use these parameters at the same time in one request."),
}
