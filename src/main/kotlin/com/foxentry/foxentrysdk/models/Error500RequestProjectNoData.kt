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

@JsonDeserialize(`as` = Error500RequestProjectNoDataImpl::class)
interface Error500RequestProjectNoData {
  val group: Error500RequestProjectNoDataGroup?
  val type: Error500RequestProjectNoDataType?
  val subtype: Error500RequestProjectNoDataSubtype?
  val severity: Error500RequestProjectNoDataSeverity?
  val relatedTo: List<String?>?
  val description: Error500RequestProjectNoDataDescription?
}

data class Error500RequestProjectNoDataImpl(
    override val group: Error500RequestProjectNoDataGroup?,
    override val type: Error500RequestProjectNoDataType?,
    override val subtype: Error500RequestProjectNoDataSubtype?,
    override val severity: Error500RequestProjectNoDataSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error500RequestProjectNoDataDescription?,
) : Error500RequestProjectNoData
/** Group of error. */
enum class Error500RequestProjectNoDataGroup(@JsonValue val value: String) {
  INTERNAL("INTERNAL"),
}
/** Type of error. */
enum class Error500RequestProjectNoDataType(@JsonValue val value: String) {
  PROJECT("PROJECT"),
}
/** Subtype of error. */
enum class Error500RequestProjectNoDataSubtype(@JsonValue val value: String) {
  NO_DATA("NO_DATA"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error500RequestProjectNoDataSeverity(@JsonValue val value: String) {
  CRITICAL("CRITICAL"),
}
/** Description of error. */
enum class Error500RequestProjectNoDataDescription(@JsonValue val value: String) {
  FAILED_TO_FETCH_PROJECT_DATA_NEEDED_FOR_PROCESSING_YOUR_REQUEST_PLEASE_CONTACT_US_IF_THE_ERROR_PERSISTS_(
      "Failed to fetch project data needed for processing your request. Please contact us if the error persists."),
}
