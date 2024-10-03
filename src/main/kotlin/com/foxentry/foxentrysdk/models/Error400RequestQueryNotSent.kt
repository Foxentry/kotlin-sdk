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

@JsonDeserialize(`as` = Error400RequestQueryNotSentImpl::class)
interface Error400RequestQueryNotSent {
  val group: Error400RequestQueryNotSentGroup?
  val type: Error400RequestQueryNotSentType?
  val subtype: Error400RequestQueryNotSentSubtype?
  val severity: Error400RequestQueryNotSentSeverity?
  val relatedTo: List<String?>?
  val description: Error400RequestQueryNotSentDescription?
}

data class Error400RequestQueryNotSentImpl(
    override val group: Error400RequestQueryNotSentGroup?,
    override val type: Error400RequestQueryNotSentType?,
    override val subtype: Error400RequestQueryNotSentSubtype?,
    override val severity: Error400RequestQueryNotSentSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error400RequestQueryNotSentDescription?,
) : Error400RequestQueryNotSent
/** Group of error. */
enum class Error400RequestQueryNotSentGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error400RequestQueryNotSentType(@JsonValue val value: String) {
  QUERY("QUERY"),
}
/** Subtype of error. */
enum class Error400RequestQueryNotSentSubtype(@JsonValue val value: String) {
  NOT_SENT("NOT_SENT"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error400RequestQueryNotSentSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error400RequestQueryNotSentDescription(@JsonValue val value: String) {
  YOUR_REQUEST_QUERY_IS_EMPTY_PLEASE_CHECK_FOXENTRY_DEV_FOR_MORE_INFORMATION_ABOUT_HOW_TO_SET_UP_THE_QUERY_PROPERLY_(
      "Your request query is empty. Please check Foxentry.dev for more information about how to set up the query properly."),
}
