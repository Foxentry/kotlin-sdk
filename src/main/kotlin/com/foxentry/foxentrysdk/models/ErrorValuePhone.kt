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

@JsonDeserialize(`as` = ErrorValuePhoneImpl::class)
interface ErrorValuePhone {
  val group: ErrorValuePhoneGroup?
  val type: ErrorValuePhoneType?
  val subtype: ErrorValuePhoneSubtype?
  val severity: ErrorValuePhoneSeverity?
  val relatedTo: List<String?>?
  val description: ErrorValuePhoneDescription?
}

data class ErrorValuePhoneImpl(
    override val group: ErrorValuePhoneGroup?,
    override val type: ErrorValuePhoneType?,
    override val subtype: ErrorValuePhoneSubtype?,
    override val severity: ErrorValuePhoneSeverity?,
    override val relatedTo: List<String?>?,
    override val description: ErrorValuePhoneDescription?,
) : ErrorValuePhone
/** Group of error. */
enum class ErrorValuePhoneGroup(@JsonValue val value: String) {
  VALUE("VALUE"),
}
/** Type of error. */
enum class ErrorValuePhoneType(@JsonValue val value: String) {
  INVALID("INVALID"),
  NOT_ALLOWED("NOT_ALLOWED"),
}
/** Subtype of error. */
enum class ErrorValuePhoneSubtype(@JsonValue val value: String) {
  PREFIX("PREFIX"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class ErrorValuePhoneSeverity(@JsonValue val value: String) {
  INFO("info"),
  WARNING("warning"),
  CRITICAL("critical"),
}
/** Description of error. */
enum class ErrorValuePhoneDescription(@JsonValue val value: String) {
  PREFIX_IS_INVALID_("Prefix is invalid."),
  THIS_PREFIX_IS_NOT_ALLOWED_CHECK_THE_ALLOWED_PREFIXES_OPTION_IN_THE_REQUEST_(
      "This prefix is not allowed. Check the \'allowedPrefixes\' option in the request."),
}
