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

@JsonDeserialize(`as` = Error429RequestRateLimitCreditPerIpImpl::class)
interface Error429RequestRateLimitCreditPerIp {
  val group: Error429RequestRateLimitCreditPerIpGroup?
  val type: Error429RequestRateLimitCreditPerIpType?
  val subtype: Error429RequestRateLimitCreditPerIpSubtype?
  val severity: Error429RequestRateLimitCreditPerIpSeverity?
  val relatedTo: List<String?>?
  val description: Error429RequestRateLimitCreditPerIpDescription?
}

data class Error429RequestRateLimitCreditPerIpImpl(
    override val group: Error429RequestRateLimitCreditPerIpGroup?,
    override val type: Error429RequestRateLimitCreditPerIpType?,
    override val subtype: Error429RequestRateLimitCreditPerIpSubtype?,
    override val severity: Error429RequestRateLimitCreditPerIpSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error429RequestRateLimitCreditPerIpDescription?,
) : Error429RequestRateLimitCreditPerIp
/** Group of error. */
enum class Error429RequestRateLimitCreditPerIpGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error429RequestRateLimitCreditPerIpType(@JsonValue val value: String) {
  RATE_LIMIT("RATE_LIMIT"),
}
/** Subtype of error. */
enum class Error429RequestRateLimitCreditPerIpSubtype(@JsonValue val value: String) {
  CREDIT_PER_IP("CREDIT_PER_IP"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error429RequestRateLimitCreditPerIpSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error429RequestRateLimitCreditPerIpDescription(@JsonValue val value: String) {
  THE_MAXIMUM_DAILY_LIMIT_PER_IP_ADDRESS_HAS_BEEN_REACHED_ADJUST_THE_SETTINGS_IN_THE_PROJECT_OR_WAIT_UNTIL_THE_LIMIT_IS_RESET_(
      "The maximum daily limit per IP address has been reached. Adjust the settings in the project or wait until the limit is reset."),
}
