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

@JsonDeserialize(`as` = Error400RequestBodyNoRequestImpl::class)
interface Error400RequestBodyNoRequest {
  val group: Error400RequestBodyNoRequestGroup?
  val type: Error400RequestBodyNoRequestType?
  val subtype: Error400RequestBodyNoRequestSubtype?
  val severity: Error400RequestBodyNoRequestSeverity?
  val relatedTo: List<String?>?
  val description: Error400RequestBodyNoRequestDescription?
}

data class Error400RequestBodyNoRequestImpl(
    override val group: Error400RequestBodyNoRequestGroup?,
    override val type: Error400RequestBodyNoRequestType?,
    override val subtype: Error400RequestBodyNoRequestSubtype?,
    override val severity: Error400RequestBodyNoRequestSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error400RequestBodyNoRequestDescription?,
) : Error400RequestBodyNoRequest
/** Group of error. */
enum class Error400RequestBodyNoRequestGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error400RequestBodyNoRequestType(@JsonValue val value: String) {
  BODY("BODY"),
}
/** Subtype of error. */
enum class Error400RequestBodyNoRequestSubtype(@JsonValue val value: String) {
  NOT_JSON("NOT_JSON"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error400RequestBodyNoRequestSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error400RequestBodyNoRequestDescription(@JsonValue val value: String) {
  YOUR_API_CALL_BODY_DOES_NOT_CONTAIN_ANY_REQUESTS_(
      "Your API call body does not contain any requests."),
}
