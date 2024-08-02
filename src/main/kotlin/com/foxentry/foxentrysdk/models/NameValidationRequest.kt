/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.models

import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.foxentry.foxentrysdk.core.*

@JsonDeserialize(`as` = NameValidationRequestImpl::class)
interface NameValidationRequest {
  val customId: String?
  val query: NameValidationRequestQuery
  val options: NameValidationRequestOptions?
  val client: ClientRequest?
}

data class NameValidationRequestImpl(
    override val customId: String?,
    override val query: NameValidationRequestQuery,
    override val options: NameValidationRequestOptions?,
    override val client: ClientRequest?,
) : NameValidationRequest

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
sealed interface NameValidationRequestQuery {
  data class Obj0(
      val name: String,
      val surname: String,
  ) : NameValidationRequestQuery

  data class Obj1(
      val nameSurname: String,
  ) : NameValidationRequestQuery
}
/** Query options. */
@JsonDeserialize(`as` = NameValidationRequestOptionsImpl::class)
interface NameValidationRequestOptions {
  val dataScope: NameValidationRequestOptionsDataScope?
  val dataSource: List<String?>?
  val acceptDegrees: Boolean?
  val acceptContext: Boolean?
  val validationDepth: NameValidationRequestOptionsValidationDepth?
  val smartMode: Boolean?
}

data class NameValidationRequestOptionsImpl(
    override val dataScope: NameValidationRequestOptionsDataScope?,
    override val dataSource: List<String?>?,
    override val acceptDegrees: Boolean?,
    override val acceptContext: Boolean?,
    override val validationDepth: NameValidationRequestOptionsValidationDepth?,
    override val smartMode: Boolean?,
) : NameValidationRequestOptions
/**
 * Data scope of returned data. In full datascope information like <b>gender</b>, <b>vocative</b>
 * and <b>date</b> of the name days is returned.
 */
enum class NameValidationRequestOptionsDataScope(@JsonValue val value: String) {
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
enum class NameValidationRequestOptionsValidationDepth(@JsonValue val value: String) {
  MINIMAL("minimal"),
  MODERATE("moderate"),
  STRICT("strict"),
}
