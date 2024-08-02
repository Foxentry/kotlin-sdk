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

@JsonDeserialize(`as` = Error503RequestEndpointNotAvailableImpl::class)
interface Error503RequestEndpointNotAvailable {
  val group: Error503RequestEndpointNotAvailableGroup?
  val type: Error503RequestEndpointNotAvailableType?
  val subtype: Error503RequestEndpointNotAvailableSubtype?
  val severity: Error503RequestEndpointNotAvailableSeverity?
  val relatedTo: List<String?>?
  val description: Error503RequestEndpointNotAvailableDescription?
}

data class Error503RequestEndpointNotAvailableImpl(
    override val group: Error503RequestEndpointNotAvailableGroup?,
    override val type: Error503RequestEndpointNotAvailableType?,
    override val subtype: Error503RequestEndpointNotAvailableSubtype?,
    override val severity: Error503RequestEndpointNotAvailableSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error503RequestEndpointNotAvailableDescription?,
) : Error503RequestEndpointNotAvailable
/** Group of error. */
enum class Error503RequestEndpointNotAvailableGroup(@JsonValue val value: String) {
  INTERNAL("INTERNAL"),
}
/** Type of error. */
enum class Error503RequestEndpointNotAvailableType(@JsonValue val value: String) {
  ENDPOINT("ENDPOINT"),
}
/** Subtype of error. */
enum class Error503RequestEndpointNotAvailableSubtype(@JsonValue val value: String) {
  NOT_AVAILABLE("NOT_AVAILABLE"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error503RequestEndpointNotAvailableSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error503RequestEndpointNotAvailableDescription(@JsonValue val value: String) {
  API_ENDPOINT_IS_TEMPORARY_UNAVAILABLE_PLEASE_CONTACT_US_AT_INFO_FOXENTRY_COM_IF_THE_ERROR_PERSISTS_(
      "API endpoint is temporary unavailable. Please contact us at info@foxentry.com if the error persists."),
}
