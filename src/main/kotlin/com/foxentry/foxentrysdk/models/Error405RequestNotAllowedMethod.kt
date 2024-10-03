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

@JsonDeserialize(`as` = Error405RequestNotAllowedMethodImpl::class)
interface Error405RequestNotAllowedMethod {
  val group: Error405RequestNotAllowedMethodGroup?
  val type: Error405RequestNotAllowedMethodType?
  val subtype: Error405RequestNotAllowedMethodSubtype?
  val severity: Error405RequestNotAllowedMethodSeverity?
  val relatedTo: List<String?>?
  val description: Error405RequestNotAllowedMethodDescription?
}

data class Error405RequestNotAllowedMethodImpl(
    override val group: Error405RequestNotAllowedMethodGroup?,
    override val type: Error405RequestNotAllowedMethodType?,
    override val subtype: Error405RequestNotAllowedMethodSubtype?,
    override val severity: Error405RequestNotAllowedMethodSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error405RequestNotAllowedMethodDescription?,
) : Error405RequestNotAllowedMethod
/** Group of error. */
enum class Error405RequestNotAllowedMethodGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error405RequestNotAllowedMethodType(@JsonValue val value: String) {
  ENDPOINT("ENDPOINT"),
}
/** Subtype of error. */
enum class Error405RequestNotAllowedMethodSubtype(@JsonValue val value: String) {
  NOT_ALLOWED("NOT_ALLOWED"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error405RequestNotAllowedMethodSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error405RequestNotAllowedMethodDescription(@JsonValue val value: String) {
  HTTP_METHOD_IS_NOT_ALLOWED_FOR_THIS_ENDPOINT_PLEASE_CHECK_FOXENTRY_DEV_FOR_MORE_INFORMATION_(
      "HTTP method is not allowed for this endpoint. Please check Foxentry.dev for more information."),
}
