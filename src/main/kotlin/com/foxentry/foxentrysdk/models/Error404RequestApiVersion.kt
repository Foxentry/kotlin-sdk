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

@JsonDeserialize(`as` = Error404RequestApiVersionImpl::class)
interface Error404RequestApiVersion {
  val group: Error404RequestApiVersionGroup?
  val type: Error404RequestApiVersionType?
  val subtype: String?
  val severity: Error404RequestApiVersionSeverity?
  val relatedTo: List<String?>?
  val description: Error404RequestApiVersionDescription?
}

data class Error404RequestApiVersionImpl(
    override val group: Error404RequestApiVersionGroup?,
    override val type: Error404RequestApiVersionType?,
    override val subtype: String?,
    override val severity: Error404RequestApiVersionSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error404RequestApiVersionDescription?,
) : Error404RequestApiVersion
/** Group of error. */
enum class Error404RequestApiVersionGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error404RequestApiVersionType(@JsonValue val value: String) {
  API_VERSION("API_VERSION"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error404RequestApiVersionSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error404RequestApiVersionDescription(@JsonValue val value: String) {
  REQUESTED_API_VERSION_IS_NOT_AVAILABLE_PLEASE_CHECK_FOXENTRY_DEV_FOR_THE_SUPPORTED_VERSIONS_(
      "Requested API version is not available. Please check Foxentry.dev for the supported versions."),
}
