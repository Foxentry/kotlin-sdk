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

@JsonDeserialize(`as` = Error404RequestEndpointNotFoundImpl::class)
interface Error404RequestEndpointNotFound {
  val group: Error404RequestEndpointNotFoundGroup?
  val type: Error404RequestEndpointNotFoundType?
  val subtype: Error404RequestEndpointNotFoundSubtype?
  val severity: Error404RequestEndpointNotFoundSeverity?
  val relatedTo: List<String?>?
  val description: Error404RequestEndpointNotFoundDescription?
}

data class Error404RequestEndpointNotFoundImpl(
    override val group: Error404RequestEndpointNotFoundGroup?,
    override val type: Error404RequestEndpointNotFoundType?,
    override val subtype: Error404RequestEndpointNotFoundSubtype?,
    override val severity: Error404RequestEndpointNotFoundSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error404RequestEndpointNotFoundDescription?,
) : Error404RequestEndpointNotFound
/** Group of error. */
enum class Error404RequestEndpointNotFoundGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error404RequestEndpointNotFoundType(@JsonValue val value: String) {
  ENDPOINT("ENDPOINT"),
}
/** Subtype of error. */
enum class Error404RequestEndpointNotFoundSubtype(@JsonValue val value: String) {
  NOT_FOUND("NOT_FOUND"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error404RequestEndpointNotFoundSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error404RequestEndpointNotFoundDescription(@JsonValue val value: String) {
  ENDPOINT_NOT_FOUND_PLEASE_CHECK_FOXENTRY_DEV_FOR_THE_SUPPORTED_ENDPOINTS_(
      "Endpoint not found. Please check Foxentry.dev for the supported endpoints."),
}
