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

@JsonDeserialize(`as` = Error400RequestBodyEmptyImpl::class)
interface Error400RequestBodyEmpty {
  val group: Error400RequestBodyEmptyGroup?
  val type: Error400RequestBodyEmptyType?
  val subtype: Error400RequestBodyEmptySubtype?
  val severity: Error400RequestBodyEmptySeverity?
  val relatedTo: List<String?>?
  val description: Error400RequestBodyEmptyDescription?
}

data class Error400RequestBodyEmptyImpl(
    override val group: Error400RequestBodyEmptyGroup?,
    override val type: Error400RequestBodyEmptyType?,
    override val subtype: Error400RequestBodyEmptySubtype?,
    override val severity: Error400RequestBodyEmptySeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error400RequestBodyEmptyDescription?,
) : Error400RequestBodyEmpty
/** Group of error. */
enum class Error400RequestBodyEmptyGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error400RequestBodyEmptyType(@JsonValue val value: String) {
  BODY("BODY"),
}
/** Subtype of error. */
enum class Error400RequestBodyEmptySubtype(@JsonValue val value: String) {
  EMPTY("EMPTY"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error400RequestBodyEmptySeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error400RequestBodyEmptyDescription(@JsonValue val value: String) {
  CANNOT_PROCESS_THE_REQUEST_BECAUSE_OF_THE_EMPTY_BODY_PLEASE_CHECK_FOXENTRY_DEV_FOR_MORE_INFORMATION_(
      "Cannot process the request because of the empty body. Please check Foxentry.dev for more information."),
}
