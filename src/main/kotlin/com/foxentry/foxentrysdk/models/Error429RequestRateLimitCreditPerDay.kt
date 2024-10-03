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

@JsonDeserialize(`as` = Error429RequestRateLimitCreditPerDayImpl::class)
interface Error429RequestRateLimitCreditPerDay {
  val group: Error429RequestRateLimitCreditPerDayGroup?
  val type: Error429RequestRateLimitCreditPerDayType?
  val subtype: Error429RequestRateLimitCreditPerDaySubtype?
  val severity: Error429RequestRateLimitCreditPerDaySeverity?
  val relatedTo: List<String?>?
  val description: Error429RequestRateLimitCreditPerDayDescription?
}

data class Error429RequestRateLimitCreditPerDayImpl(
    override val group: Error429RequestRateLimitCreditPerDayGroup?,
    override val type: Error429RequestRateLimitCreditPerDayType?,
    override val subtype: Error429RequestRateLimitCreditPerDaySubtype?,
    override val severity: Error429RequestRateLimitCreditPerDaySeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error429RequestRateLimitCreditPerDayDescription?,
) : Error429RequestRateLimitCreditPerDay
/** Group of error. */
enum class Error429RequestRateLimitCreditPerDayGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error429RequestRateLimitCreditPerDayType(@JsonValue val value: String) {
  RATE_LIMIT("RATE_LIMIT"),
}
/** Subtype of error. */
enum class Error429RequestRateLimitCreditPerDaySubtype(@JsonValue val value: String) {
  CREDIT_PER_DAY("CREDIT_PER_DAY"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error429RequestRateLimitCreditPerDaySeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error429RequestRateLimitCreditPerDayDescription(@JsonValue val value: String) {
  THE_MAXIMUM_DAILY_LIMIT_HAS_BEEN_REACHED_ADJUST_THE_SETTINGS_IN_THE_PROJECT_OR_WAIT_UNTIL_THE_LIMIT_IS_RESET_(
      "The maximum daily limit has been reached. Adjust the settings in the project or wait until the limit is reset."),
}
