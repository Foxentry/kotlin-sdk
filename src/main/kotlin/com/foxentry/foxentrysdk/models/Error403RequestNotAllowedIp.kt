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

@JsonDeserialize(`as` = Error403RequestNotAllowedIpImpl::class)
interface Error403RequestNotAllowedIp {
  val group: Error403RequestNotAllowedIpGroup?
  val type: Error403RequestNotAllowedIpType?
  val subtype: Error403RequestNotAllowedIpSubtype?
  val severity: Error403RequestNotAllowedIpSeverity?
  val relatedTo: List<String?>?
  val description: Error403RequestNotAllowedIpDescription?
}

data class Error403RequestNotAllowedIpImpl(
    override val group: Error403RequestNotAllowedIpGroup?,
    override val type: Error403RequestNotAllowedIpType?,
    override val subtype: Error403RequestNotAllowedIpSubtype?,
    override val severity: Error403RequestNotAllowedIpSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error403RequestNotAllowedIpDescription?,
) : Error403RequestNotAllowedIp
/** Group of error. */
enum class Error403RequestNotAllowedIpGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error403RequestNotAllowedIpType(@JsonValue val value: String) {
  NOT_ALLOWED("NOT_ALLOWED"),
}
/** Subtype of error. */
enum class Error403RequestNotAllowedIpSubtype(@JsonValue val value: String) {
  IP("IP"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error403RequestNotAllowedIpSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error403RequestNotAllowedIpDescription(@JsonValue val value: String) {
  THE_API_KEY_HAS_IP_LIMITS_SET_AND_YOUR_IP_ADDRESS_IS_NOT_ALLOWED_CHANGE_THE_PROJECT_SETTINGS_AT_APP_FOXENTRY_COM_(
      "The API key has IP limits set and your IP address is not allowed. Change the project settings at app.foxentry.com."),
}
