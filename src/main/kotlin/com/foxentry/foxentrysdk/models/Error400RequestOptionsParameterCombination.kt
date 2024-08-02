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

@JsonDeserialize(`as` = Error400RequestOptionsParameterCombinationImpl::class)
interface Error400RequestOptionsParameterCombination {
  val group: Error400RequestOptionsParameterCombinationGroup?
  val type: Error400RequestOptionsParameterCombinationType?
  val subtype: Error400RequestOptionsParameterCombinationSubtype?
  val severity: Error400RequestOptionsParameterCombinationSeverity?
  val relatedTo: List<String?>?
  val description: Error400RequestOptionsParameterCombinationDescription?
}

data class Error400RequestOptionsParameterCombinationImpl(
    override val group: Error400RequestOptionsParameterCombinationGroup?,
    override val type: Error400RequestOptionsParameterCombinationType?,
    override val subtype: Error400RequestOptionsParameterCombinationSubtype?,
    override val severity: Error400RequestOptionsParameterCombinationSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error400RequestOptionsParameterCombinationDescription?,
) : Error400RequestOptionsParameterCombination
/** Group of error. */
enum class Error400RequestOptionsParameterCombinationGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error400RequestOptionsParameterCombinationType(@JsonValue val value: String) {
  OPTIONS("OPTIONS"),
}
/** Subtype of error. */
enum class Error400RequestOptionsParameterCombinationSubtype(@JsonValue val value: String) {
  PARAMETERS_COMBINATION("PARAMETERS_COMBINATION"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error400RequestOptionsParameterCombinationSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error400RequestOptionsParameterCombinationDescription(@JsonValue val value: String) {
  COMBINATION_OF_OPTIONS_OR_THEIR_VALUES_IS_NOT_VALID_(
      "Combination of options or their values is not valid."),
}
