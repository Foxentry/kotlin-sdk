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

@JsonDeserialize(`as` = Error400RequestOptionsParameterNotSupportedImpl::class)
interface Error400RequestOptionsParameterNotSupported {
  val group: Error400RequestOptionsParameterNotSupportedGroup?
  val type: Error400RequestOptionsParameterNotSupportedType?
  val subtype: Error400RequestOptionsParameterNotSupportedSubtype?
  val severity: Error400RequestOptionsParameterNotSupportedSeverity?
  val relatedTo: List<String?>?
  val description: Error400RequestOptionsParameterNotSupportedDescription?
}

data class Error400RequestOptionsParameterNotSupportedImpl(
    override val group: Error400RequestOptionsParameterNotSupportedGroup?,
    override val type: Error400RequestOptionsParameterNotSupportedType?,
    override val subtype: Error400RequestOptionsParameterNotSupportedSubtype?,
    override val severity: Error400RequestOptionsParameterNotSupportedSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error400RequestOptionsParameterNotSupportedDescription?,
) : Error400RequestOptionsParameterNotSupported
/** Group of error. */
enum class Error400RequestOptionsParameterNotSupportedGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error400RequestOptionsParameterNotSupportedType(@JsonValue val value: String) {
  OPTIONS("OPTIONS"),
}
/** Subtype of error. */
enum class Error400RequestOptionsParameterNotSupportedSubtype(@JsonValue val value: String) {
  PARAMETER_NOT_SUPPORTED("PARAMETER_NOT_SUPPORTED"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error400RequestOptionsParameterNotSupportedSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error400RequestOptionsParameterNotSupportedDescription(@JsonValue val value: String) {
  OPTIONS_PARAMETER_IS_NOT_SUPPORTED_FOR_THIS_ENDPOINT_(
      "Options parameter is not supported for this endpoint."),
}
