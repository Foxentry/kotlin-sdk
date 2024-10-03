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

@JsonDeserialize(`as` = Error500TimeoutImpl::class)
interface Error500Timeout {
  val group: Error500TimeoutGroup?
  val type: Error500TimeoutType?
  val subtype: String?
  val severity: Error500TimeoutSeverity?
  val relatedTo: List<String?>?
  val description: Error500TimeoutDescription?
}

data class Error500TimeoutImpl(
    override val group: Error500TimeoutGroup?,
    override val type: Error500TimeoutType?,
    override val subtype: String?,
    override val severity: Error500TimeoutSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error500TimeoutDescription?,
) : Error500Timeout
/** Group of error. */
enum class Error500TimeoutGroup(@JsonValue val value: String) {
  INTERNAL("INTERNAL"),
}
/** Type of error. */
enum class Error500TimeoutType(@JsonValue val value: String) {
  TIMEOUT("TIMEOUT"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error500TimeoutSeverity(@JsonValue val value: String) {
  CRITICAL("CRITICAL"),
}
/** Description of error. */
enum class Error500TimeoutDescription(@JsonValue val value: String) {
  API_TIMEOUT_IN_EFFECT_YOUR_REQUEST_TOOK_TOO_MUCH_TIME_TO_PROCESS_(
      "API timeout in effect. Your request took too much time to process."),
}
