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

@JsonDeserialize(`as` = Error500InternalBillingImpl::class)
interface Error500InternalBilling {
  val group: Error500InternalBillingGroup?
  val type: Error500InternalBillingType?
  val subtype: String?
  val severity: String?
  val relatedTo: List<String?>?
  val description: Error500InternalBillingDescription?
}

data class Error500InternalBillingImpl(
    override val group: Error500InternalBillingGroup?,
    override val type: Error500InternalBillingType?,
    override val subtype: String?,
    override val severity: String?,
    override val relatedTo: List<String?>?,
    override val description: Error500InternalBillingDescription?,
) : Error500InternalBilling
/** Group of error. */
enum class Error500InternalBillingGroup(@JsonValue val value: String) {
  INTERNAL("INTERNAL"),
}
/** Type of error. */
enum class Error500InternalBillingType(@JsonValue val value: String) {
  BILLING("BILLING"),
}
/** Description of error. */
enum class Error500InternalBillingDescription(@JsonValue val value: String) {
  FAILED_TO_PROCESS_YOUR_REQUEST_DUE_TO_A_BILLING_INTERNAL_ERROR_PLEASE_CONTACT_US_IF_THE_ERROR_PERSISTS_(
      "Failed to process your request due to a billing internal error. Please contact us if the error persists."),
}
