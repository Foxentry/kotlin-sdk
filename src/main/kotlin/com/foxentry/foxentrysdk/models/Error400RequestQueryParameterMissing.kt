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

@JsonDeserialize(`as` = Error400RequestQueryParameterMissingImpl::class)
interface Error400RequestQueryParameterMissing {
  val group: Error400RequestQueryParameterMissingGroup?
  val type: Error400RequestQueryParameterMissingType?
  val subtype: Error400RequestQueryParameterMissingSubtype?
  val severity: Error400RequestQueryParameterMissingSeverity?
  val relatedTo: List<String?>?
  val description: Error400RequestQueryParameterMissingDescription?
}

data class Error400RequestQueryParameterMissingImpl(
    override val group: Error400RequestQueryParameterMissingGroup?,
    override val type: Error400RequestQueryParameterMissingType?,
    override val subtype: Error400RequestQueryParameterMissingSubtype?,
    override val severity: Error400RequestQueryParameterMissingSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error400RequestQueryParameterMissingDescription?,
) : Error400RequestQueryParameterMissing
/** Group of error. */
enum class Error400RequestQueryParameterMissingGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error400RequestQueryParameterMissingType(@JsonValue val value: String) {
  QUERY("QUERY"),
}
/** Subtype of error. */
enum class Error400RequestQueryParameterMissingSubtype(@JsonValue val value: String) {
  PARAMETERS_MISSING("PARAMETERS_MISSING"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error400RequestQueryParameterMissingSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error400RequestQueryParameterMissingDescription(@JsonValue val value: String) {
  QUERY_PARAMETER_IS_MISSING_PLEASE_CHECK_FOXENTRY_DEV_FOR_MORE_INFORMATION_ABOUT_HOW_TO_SET_UP_THE_QUERY_PROPERLY_(
      "Query parameter is missing. Please check Foxentry.dev for more information about how to set up the query properly."),
}
