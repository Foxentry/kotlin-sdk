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

@JsonDeserialize(`as` = ErrorValueEmailImpl::class)
interface ErrorValueEmail {
  val group: ErrorValueEmailGroup?
  val type: ErrorValueEmailType?
  val subtype: ErrorValueEmailSubtype?
  val severity: ErrorValueEmailSeverity?
  val relatedTo: List<String?>?
  val description: ErrorValueEmailDescription?
}

data class ErrorValueEmailImpl(
    override val group: ErrorValueEmailGroup?,
    override val type: ErrorValueEmailType?,
    override val subtype: ErrorValueEmailSubtype?,
    override val severity: ErrorValueEmailSeverity?,
    override val relatedTo: List<String?>?,
    override val description: ErrorValueEmailDescription?,
) : ErrorValueEmail
/** Group of error. */
enum class ErrorValueEmailGroup(@JsonValue val value: String) {
  VALUE("VALUE"),
}
/** Type of error. */
enum class ErrorValueEmailType(@JsonValue val value: String) {
  INVALID("INVALID"),
  NOT_ALLOWED("NOT_ALLOWED"),
}
/** Subtype of error. */
enum class ErrorValueEmailSubtype(@JsonValue val value: String?) {
  DOMAIN("DOMAIN"),
  DOMAIN_DNS("DOMAIN_DNS"),
  DISPOSABLE("DISPOSABLE"),
  FREEMAIL("FREEMAIL"),
  NULL(null),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class ErrorValueEmailSeverity(@JsonValue val value: String) {
  INFO("info"),
  WARNING("warning"),
  CRITICAL("critical"),
}
/** Description of error. */
enum class ErrorValueEmailDescription(@JsonValue val value: String) {
  DOMAIN_NAME_IS_INVALID_("Domain name is invalid."),
  DOMAIN_DOES_NOT_HAVE_DNS_RECORDS_SET_PROPERLY_FOR_RECEIVING_EMAILS_(
      "Domain does not have DNS records set properly for receiving emails."),
  DISPOSABLE_EMAILS_ARE_NOT_ALLOWED_("Disposable emails are not allowed."),
  FREEMAILS_ARE_NOT_ALLOWED_("Freemails are not allowed."),
}
