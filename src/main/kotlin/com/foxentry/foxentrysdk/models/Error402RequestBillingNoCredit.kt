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

@JsonDeserialize(`as` = Error402RequestBillingNoCreditImpl::class)
interface Error402RequestBillingNoCredit {
  val group: Error402RequestBillingNoCreditGroup?
  val type: Error402RequestBillingNoCreditType?
  val subtype: Error402RequestBillingNoCreditSubtype?
  val severity: Error402RequestBillingNoCreditSeverity?
  val relatedTo: List<String?>?
  val description: Error402RequestBillingNoCreditDescription?
}

data class Error402RequestBillingNoCreditImpl(
    override val group: Error402RequestBillingNoCreditGroup?,
    override val type: Error402RequestBillingNoCreditType?,
    override val subtype: Error402RequestBillingNoCreditSubtype?,
    override val severity: Error402RequestBillingNoCreditSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error402RequestBillingNoCreditDescription?,
) : Error402RequestBillingNoCredit
/** Group of error. */
enum class Error402RequestBillingNoCreditGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error402RequestBillingNoCreditType(@JsonValue val value: String) {
  BILLING("BILLING"),
}
/** Subtype of error. */
enum class Error402RequestBillingNoCreditSubtype(@JsonValue val value: String) {
  NO_CREDIT("NO_CREDIT"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error402RequestBillingNoCreditSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error402RequestBillingNoCreditDescription(@JsonValue val value: String) {
  NO_CREDIT_AVAILABLE_YOU_NEED_TO_PURCHASE_A_SUFFICIENT_AMMOUNT_OF_CREDITS_IN_THE_PROJECT_ADMINISTRATION_AT_APP_FOXENTRY_COM_(
      "No credit available. You need to purchase a sufficient ammount of credits in the project administration at app.foxentry.com."),
}
