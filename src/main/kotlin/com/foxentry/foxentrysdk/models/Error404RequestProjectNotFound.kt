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

@JsonDeserialize(`as` = Error404RequestProjectNotFoundImpl::class)
interface Error404RequestProjectNotFound {
  val group: Error404RequestProjectNotFoundGroup?
  val type: Error404RequestProjectNotFoundType?
  val subtype: Error404RequestProjectNotFoundSubtype?
  val severity: Error404RequestProjectNotFoundSeverity?
  val relatedTo: List<String?>?
  val description: Error404RequestProjectNotFoundDescription?
}

data class Error404RequestProjectNotFoundImpl(
    override val group: Error404RequestProjectNotFoundGroup?,
    override val type: Error404RequestProjectNotFoundType?,
    override val subtype: Error404RequestProjectNotFoundSubtype?,
    override val severity: Error404RequestProjectNotFoundSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error404RequestProjectNotFoundDescription?,
) : Error404RequestProjectNotFound
/** Group of error. */
enum class Error404RequestProjectNotFoundGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error404RequestProjectNotFoundType(@JsonValue val value: String) {
  PROJECT("PROJECT"),
}
/** Subtype of error. */
enum class Error404RequestProjectNotFoundSubtype(@JsonValue val value: String) {
  NOT_FOUND("NOT_FOUND"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error404RequestProjectNotFoundSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error404RequestProjectNotFoundDescription(@JsonValue val value: String) {
  THE_PROJECT_DOES_NOT_EXIST_PLEASE_CHECK_THE_AVAILABLE_PROJECTS_AT_APP_FOXENTRY_COM_OR_CONTACT_THE_SUPPORT_(
      "The project does not exist. Please check the available projects at app.foxentry.com or contact the support."),
}
