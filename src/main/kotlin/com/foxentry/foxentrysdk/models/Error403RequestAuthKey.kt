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

@JsonDeserialize(`as` = Error403RequestAuthKeyImpl::class)
interface Error403RequestAuthKey {
  val group: Error403RequestAuthKeyGroup?
  val type: Error403RequestAuthKeyType?
  val subtype: Error403RequestAuthKeySubtype?
  val severity: Error403RequestAuthKeySeverity?
  val relatedTo: List<String?>?
  val description: Error403RequestAuthKeyDescription?
}

data class Error403RequestAuthKeyImpl(
    override val group: Error403RequestAuthKeyGroup?,
    override val type: Error403RequestAuthKeyType?,
    override val subtype: Error403RequestAuthKeySubtype?,
    override val severity: Error403RequestAuthKeySeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error403RequestAuthKeyDescription?,
) : Error403RequestAuthKey
/** Group of error. */
enum class Error403RequestAuthKeyGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error403RequestAuthKeyType(@JsonValue val value: String) {
  AUTH("AUTH"),
}
/** Subtype of error. */
enum class Error403RequestAuthKeySubtype(@JsonValue val value: String) {
  KEY("KEY"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error403RequestAuthKeySeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error403RequestAuthKeyDescription(@JsonValue val value: String) {
  PROVIDED_API_KEY_IS_NOT_VALID_PLEASE_CHECK_THE_PROJECT_SETTINGS_AT_APP_FOXENTRY_COM_(
      "Provided API key is not valid. Please check the project settings at app.foxentry.com."),
}
