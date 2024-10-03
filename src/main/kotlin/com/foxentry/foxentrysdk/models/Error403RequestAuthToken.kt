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

@JsonDeserialize(`as` = Error403RequestAuthTokenImpl::class)
interface Error403RequestAuthToken {
  val group: Error403RequestAuthTokenGroup?
  val type: Error403RequestAuthTokenType?
  val subtype: Error403RequestAuthTokenSubtype?
  val severity: Error403RequestAuthTokenSeverity?
  val relatedTo: List<String?>?
  val description: Error403RequestAuthTokenDescription?
}

data class Error403RequestAuthTokenImpl(
    override val group: Error403RequestAuthTokenGroup?,
    override val type: Error403RequestAuthTokenType?,
    override val subtype: Error403RequestAuthTokenSubtype?,
    override val severity: Error403RequestAuthTokenSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error403RequestAuthTokenDescription?,
) : Error403RequestAuthToken
/** Group of error. */
enum class Error403RequestAuthTokenGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error403RequestAuthTokenType(@JsonValue val value: String) {
  AUTH("AUTH"),
}
/** Subtype of error. */
enum class Error403RequestAuthTokenSubtype(@JsonValue val value: String) {
  TOKEN("TOKEN"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error403RequestAuthTokenSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error403RequestAuthTokenDescription(@JsonValue val value: String) {
  PROVIDED_ACCESS_TOKEN_IS_NOT_VALID_PLEASE_CHECK_THE_PROJECT_SETTINGS_AT_APP_FOXENTRY_COM_(
      "Provided access token is not valid. Please check the project settings at app.foxentry.com."),
}
