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

@JsonDeserialize(`as` = Error400RequestBodyTooBigImpl::class)
interface Error400RequestBodyTooBig {
  val group: Error400RequestBodyTooBigGroup?
  val type: Error400RequestBodyTooBigType?
  val subtype: Error400RequestBodyTooBigSubtype?
  val severity: Error400RequestBodyTooBigSeverity?
  val relatedTo: List<String?>?
  val description: Error400RequestBodyTooBigDescription?
}

data class Error400RequestBodyTooBigImpl(
    override val group: Error400RequestBodyTooBigGroup?,
    override val type: Error400RequestBodyTooBigType?,
    override val subtype: Error400RequestBodyTooBigSubtype?,
    override val severity: Error400RequestBodyTooBigSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error400RequestBodyTooBigDescription?,
) : Error400RequestBodyTooBig
/** Group of error. */
enum class Error400RequestBodyTooBigGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error400RequestBodyTooBigType(@JsonValue val value: String) {
  BODY("BODY"),
}
/** Subtype of error. */
enum class Error400RequestBodyTooBigSubtype(@JsonValue val value: String) {
  TOO_BIG("TOO_BIG"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error400RequestBodyTooBigSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error400RequestBodyTooBigDescription(@JsonValue val value: String) {
  YOUR_REQUEST_LENGTH_IS_BIGGER_THAN_ALLOWED_PLEASE_CONTACT_US_IF_YOU_THINK_THIS_IS_A_MISTAKE_(
      "Your request length is bigger than allowed. Please contact us if you think this is a mistake."),
}
