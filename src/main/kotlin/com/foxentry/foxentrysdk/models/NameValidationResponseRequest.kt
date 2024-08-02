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

@JsonDeserialize(`as` = NameValidationResponseRequestImpl::class)
interface NameValidationResponseRequest {
  val endpoint: String
  val code: String
  val customId: String?
  val query: NameValidationResponseRequestQuery?
  val options: NameValidationResponseRequestOptions?
  val client: NameValidationResponseRequestClient?
}

data class NameValidationResponseRequestImpl(
    override val endpoint: String,
    override val code: String,
    override val customId: String?,
    override val query: NameValidationResponseRequestQuery?,
    override val options: NameValidationResponseRequestOptions?,
    override val client: NameValidationResponseRequestClient?,
) : NameValidationResponseRequest

@JsonDeserialize(`as` = NameValidationResponseRequestQueryImpl::class)
interface NameValidationResponseRequestQuery {
  val name: String?
  val surname: String?
  val nameSurname: String?
}

data class NameValidationResponseRequestQueryImpl(
    override val name: String?,
    override val surname: String?,
    override val nameSurname: String?,
) : NameValidationResponseRequestQuery
/** Query options. */
@JsonDeserialize(`as` = NameValidationResponseRequestOptionsImpl::class)
interface NameValidationResponseRequestOptions {
  val dataScope: NameValidationResponseRequestOptionsDataScope?
  val dataSource: List<String?>?
  val acceptDegrees: Boolean?
  val acceptContext: Boolean?
  val validationDepth: NameValidationResponseRequestOptionsValidationDepth?
  val smartMode: Boolean?
}

data class NameValidationResponseRequestOptionsImpl(
    override val dataScope: NameValidationResponseRequestOptionsDataScope?,
    override val dataSource: List<String?>?,
    override val acceptDegrees: Boolean?,
    override val acceptContext: Boolean?,
    override val validationDepth: NameValidationResponseRequestOptionsValidationDepth?,
    override val smartMode: Boolean?,
) : NameValidationResponseRequestOptions
/**
 * Data scope of returned data. In full datascope information like <b>gender</b>, <b>vocative</b>
 * and <b>date</b> of the name days is returned.
 */
enum class NameValidationResponseRequestOptionsDataScope(@JsonValue val value: String) {
  BASIC("basic"),
  FULL("full"),
}
/**
 * Specifies the depth of name validation. In other words how strict the validator should behave.
 * <b>Minimal</b> = all the names are considered valid as long as there are no forbidden characters
 * used or we are 100% sure the name is invalid. Usually the only thing corrected is format.
 * <b>Moderate</b> = something in between the minimal and strict validation. There are more
 * instances of corrections like typos etc. <b>Strict</b> = the most strict validation depth.
 * Missing names in our database are marked as invalid, the scoring for corrections and suggestions
 * is tweaked.
 */
enum class NameValidationResponseRequestOptionsValidationDepth(@JsonValue val value: String?) {
  MINIMAL("minimal"),
  MODERATE("moderate"),
  STRICT("strict"),
  NULL(null),
}
/** The information about your client to help specify the search or validation. */
@JsonDeserialize(`as` = NameValidationResponseRequestClientImpl::class)
interface NameValidationResponseRequestClient {
  val country: String?
  val location: NameValidationResponseRequestClientLocation?
}

data class NameValidationResponseRequestClientImpl(
    override val country: String?,
    override val location: NameValidationResponseRequestClientLocation?,
) : NameValidationResponseRequestClient
/** Client's location. */
@JsonDeserialize(`as` = NameValidationResponseRequestClientLocationImpl::class)
interface NameValidationResponseRequestClientLocation {
  val lat: Double?
  val lon: Double?
}

data class NameValidationResponseRequestClientLocationImpl(
    override val lat: Double?,
    override val lon: Double?,
) : NameValidationResponseRequestClientLocation
