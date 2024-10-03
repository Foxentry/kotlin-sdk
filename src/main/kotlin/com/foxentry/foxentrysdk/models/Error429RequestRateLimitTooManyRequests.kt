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

@JsonDeserialize(`as` = Error429RequestRateLimitTooManyRequestsImpl::class)
interface Error429RequestRateLimitTooManyRequests {
  val group: Error429RequestRateLimitTooManyRequestsGroup?
  val type: Error429RequestRateLimitTooManyRequestsType?
  val subtype: Error429RequestRateLimitTooManyRequestsSubtype?
  val severity: Error429RequestRateLimitTooManyRequestsSeverity?
  val relatedTo: List<String?>?
  val description: Error429RequestRateLimitTooManyRequestsDescription?
}

data class Error429RequestRateLimitTooManyRequestsImpl(
    override val group: Error429RequestRateLimitTooManyRequestsGroup?,
    override val type: Error429RequestRateLimitTooManyRequestsType?,
    override val subtype: Error429RequestRateLimitTooManyRequestsSubtype?,
    override val severity: Error429RequestRateLimitTooManyRequestsSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error429RequestRateLimitTooManyRequestsDescription?,
) : Error429RequestRateLimitTooManyRequests
/** Group of error. */
enum class Error429RequestRateLimitTooManyRequestsGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error429RequestRateLimitTooManyRequestsType(@JsonValue val value: String) {
  RATE_LIMIT("RATE_LIMIT"),
}
/** Subtype of error. */
enum class Error429RequestRateLimitTooManyRequestsSubtype(@JsonValue val value: String) {
  TOO_MANY_REQUESTS("TOO_MANY_REQUESTS"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error429RequestRateLimitTooManyRequestsSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error429RequestRateLimitTooManyRequestsDescription(@JsonValue val value: String) {
  THE_MAXIMUM_ALLOWED_REQUEST_RATE_LIMIT_HAS_BEEN_REACHED_CHECK_FOXENTRY_DEV_FOR_MORE_INFORMATION_OR_CONTACT_THE_SUPPORT_(
      "The maximum allowed request rate limit has been reached. Check Foxentry.dev for more information or contact the support."),
}
