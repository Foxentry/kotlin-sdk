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

@JsonDeserialize(`as` = Error429RequestBillingServiceLimitImpl::class)
interface Error429RequestBillingServiceLimit {
  val group: Error429RequestBillingServiceLimitGroup?
  val type: Error429RequestBillingServiceLimitType?
  val subtype: Error429RequestBillingServiceLimitSubtype?
  val severity: Error429RequestBillingServiceLimitSeverity?
  val relatedTo: List<String?>?
  val description: Error429RequestBillingServiceLimitDescription?
}

data class Error429RequestBillingServiceLimitImpl(
    override val group: Error429RequestBillingServiceLimitGroup?,
    override val type: Error429RequestBillingServiceLimitType?,
    override val subtype: Error429RequestBillingServiceLimitSubtype?,
    override val severity: Error429RequestBillingServiceLimitSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error429RequestBillingServiceLimitDescription?,
) : Error429RequestBillingServiceLimit
/** Group of error. */
enum class Error429RequestBillingServiceLimitGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error429RequestBillingServiceLimitType(@JsonValue val value: String) {
  BILLING("BILLING"),
}
/** Subtype of error. */
enum class Error429RequestBillingServiceLimitSubtype(@JsonValue val value: String) {
  SERVICE_LIMIT_REACHED("SERVICE_LIMIT_REACHED"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error429RequestBillingServiceLimitSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error429RequestBillingServiceLimitDescription(@JsonValue val value: String) {
  REQUESTED_API_VERSION_IS_NOT_AVAILABLE_PLEASE_CHECK_FOXENTRY_DEV_FOR_THE_SUPPORTED_VERSIONS_(
      "Requested API version is not available. Please check Foxentry.dev for the supported versions."),
}
