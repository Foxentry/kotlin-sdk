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

@JsonDeserialize(`as` = Error403RequestNotAllowedDomainImpl::class)
interface Error403RequestNotAllowedDomain {
  val group: Error403RequestNotAllowedDomainGroup?
  val type: Error403RequestNotAllowedDomainType?
  val subtype: Error403RequestNotAllowedDomainSubtype?
  val severity: Error403RequestNotAllowedDomainSeverity?
  val relatedTo: List<String?>?
  val description: Error403RequestNotAllowedDomainDescription?
}

data class Error403RequestNotAllowedDomainImpl(
    override val group: Error403RequestNotAllowedDomainGroup?,
    override val type: Error403RequestNotAllowedDomainType?,
    override val subtype: Error403RequestNotAllowedDomainSubtype?,
    override val severity: Error403RequestNotAllowedDomainSeverity?,
    override val relatedTo: List<String?>?,
    override val description: Error403RequestNotAllowedDomainDescription?,
) : Error403RequestNotAllowedDomain
/** Group of error. */
enum class Error403RequestNotAllowedDomainGroup(@JsonValue val value: String) {
  REQUEST("REQUEST"),
}
/** Type of error. */
enum class Error403RequestNotAllowedDomainType(@JsonValue val value: String) {
  NOT_ALLOWED("NOT_ALLOWED"),
}
/** Subtype of error. */
enum class Error403RequestNotAllowedDomainSubtype(@JsonValue val value: String) {
  DOMAIN("DOMAIN"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class Error403RequestNotAllowedDomainSeverity(@JsonValue val value: String) {
  CRITICAL("critical"),
}
/** Description of error. */
enum class Error403RequestNotAllowedDomainDescription(@JsonValue val value: String) {
  WEBSITE_DOMAIN_IS_NOT_ALLOWED_IN_THE_PROJECT_SETTINGS_(
      "Website domain is not allowed in the project settings."),
}
