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

@JsonDeserialize(`as` = Error400RequestOptionParameterValueNotSupportedImpl::class)
interface Error400RequestOptionParameterValueNotSupported {
  val group: Error400RequestOptionParameterValueNotSupportedGroup?
  val type: Error400RequestOptionParameterValueNotSupportedType?
  val subtype: Error400RequestOptionParameterValueNotSupportedSubtype?
  val severity: Error400RequestOptionParameterValueNotSupportedSeverity?
  val relatedTo: List<String?>?
  val description: Error400RequestOptionParameterValueNotSupportedDescription?
}

data class Error400RequestOptionParameterValueNotSupportedImpl(
    override val group: Error400RequestOptionParameterValueNotSupportedGroup?,
    override val type: Error400RequestOptionParameterValueNotSupportedType?,
    override val subtype: Error400RequestOptionParameterValueNotSupportedSubtype?,
    override val severity: Error400RequestOptionParameterValueNotSupportedSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error400RequestOptionParameterValueNotSupportedDescription?,
) : Error400RequestOptionParameterValueNotSupported
/** Group of error. */
enum class Error400RequestOptionParameterValueNotSupportedGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error400RequestOptionParameterValueNotSupportedType(@JsonValue val value: String) {
  OPTIONS("OPTIONS"),
}
/** Subtype of error. */
enum class Error400RequestOptionParameterValueNotSupportedSubtype(@JsonValue val value: String) {
  PARAMETER_VALUE_NOT_SUPPORTED("PARAMETER_VALUE_NOT_SUPPORTED"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error400RequestOptionParameterValueNotSupportedSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error400RequestOptionParameterValueNotSupportedDescription(
    @JsonValue val value: String
) {
  VALUE_IN_PARAMATER_IS_NOT_VALID_PLEASE_CHECK_FOXENTRY_DEV_FOR_MORE_INFORMATION_(
      "Value in paramater is not valid. Please check Foxentry.dev for more information."),
}
