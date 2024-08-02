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

@JsonDeserialize(`as` = Error401RequestAuthImpl::class)
interface Error401RequestAuth {
  val group: Error401RequestAuthGroup?
  val type: Error401RequestAuthType?
  val subtype: String?
  val severity: Error401RequestAuthSeverity?
  val relatedTo: List<String?>?
  val description: Error401RequestAuthDescription?
}

data class Error401RequestAuthImpl(
    override val group: Error401RequestAuthGroup?,
    override val type: Error401RequestAuthType?,
    override val subtype: String?,
    override val severity: Error401RequestAuthSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error401RequestAuthDescription?,
) : Error401RequestAuth
/** Group of error. */
enum class Error401RequestAuthGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error401RequestAuthType(@JsonValue val value: String) {
  AUTH("AUTH"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error401RequestAuthSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error401RequestAuthDescription(@JsonValue val value: String) {
  INVALID_AUTHORIZATION_CREDENTIALS_SENT_CHECK_FOXENTRY_DEV_FOR_MORE_INFORMATION_HOW_TO_SET_UP_THE_AUTH_PROPERLY_(
      "Invalid authorization credentials sent. Check Foxentry.dev for more information how to set up the AUTH properly."),
}
