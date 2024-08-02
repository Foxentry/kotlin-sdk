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

@JsonDeserialize(`as` = Error400RequestBodyNotJsonImpl::class)
interface Error400RequestBodyNotJson {
  val group: Error400RequestBodyNotJsonGroup?
  val type: Error400RequestBodyNotJsonType?
  val subtype: Error400RequestBodyNotJsonSubtype?
  val severity: Error400RequestBodyNotJsonSeverity?
  val relatedTo: List<String?>?
  val description: Error400RequestBodyNotJsonDescription?
}

data class Error400RequestBodyNotJsonImpl(
    override val group: Error400RequestBodyNotJsonGroup?,
    override val type: Error400RequestBodyNotJsonType?,
    override val subtype: Error400RequestBodyNotJsonSubtype?,
    override val severity: Error400RequestBodyNotJsonSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error400RequestBodyNotJsonDescription?,
) : Error400RequestBodyNotJson
/** Group of error. */
enum class Error400RequestBodyNotJsonGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error400RequestBodyNotJsonType(@JsonValue val value: String) {
  BODY("BODY"),
}
/** Subtype of error. */
enum class Error400RequestBodyNotJsonSubtype(@JsonValue val value: String) {
  NOT_JSON("NOT_JSON"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error400RequestBodyNotJsonSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error400RequestBodyNotJsonDescription(@JsonValue val value: String) {
  CANNOT_PROCESS_THE_REQUEST_BECAUSE_THE_JSON_IS_NOT_VALID_PLEASE_CHECK_FOXENTRY_DEV_FOR_MORE_INFORMATION_(
      "Cannot process the request because the JSON is not valid. Please check Foxentry.dev for more information."),
}
