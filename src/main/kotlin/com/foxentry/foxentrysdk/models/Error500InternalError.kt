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

@JsonDeserialize(`as` = Error500InternalErrorImpl::class)
interface Error500InternalError {
  val group: Error500InternalErrorGroup?
  val type: Error500InternalErrorType?
  val subtype: String?
  val severity: Error500InternalErrorSeverity?
  val relatedTo: List<String?>?
  val description: Error500InternalErrorDescription?
}

data class Error500InternalErrorImpl(
    override val group: Error500InternalErrorGroup?,
    override val type: Error500InternalErrorType?,
    override val subtype: String?,
    override val severity: Error500InternalErrorSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error500InternalErrorDescription?,
) : Error500InternalError
/** Group of error. */
enum class Error500InternalErrorGroup(@JsonValue val value: String) {
  INTERNAL("INTERNAL"),
}
/** Type of error. */
enum class Error500InternalErrorType(@JsonValue val value: String) {
  ERROR("ERROR"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error500InternalErrorSeverity(@JsonValue val value: String) {
  CRITICAL("CRITICAL"),
}
/** Description of error. */
enum class Error500InternalErrorDescription(@JsonValue val value: String) {
  FAILED_TO_PROCESS_YOUR_REQUEST_PLEASE_TRY_AGAIN_LATER_OR_CONTACT_US_(
      "Failed to process your request. Please try again later or contact us."),
}
