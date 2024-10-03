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

@JsonDeserialize(`as` = ValidatePhoneNumberRequestImpl::class)
interface ValidatePhoneNumberRequest {
  val customId: String?
  val query: ValidatePhoneNumberRequestQuery
  val options: ValidatePhoneNumberRequestOptions?
  val client: ClientRequest?
}

data class ValidatePhoneNumberRequestImpl(
    override val customId: String?,
    override val query: ValidatePhoneNumberRequestQuery,
    override val options: ValidatePhoneNumberRequestOptions?,
    override val client: ClientRequest?,
) : ValidatePhoneNumberRequest

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
sealed interface ValidatePhoneNumberRequestQuery {
  data class Obj0(
      val prefix: String,
      val number: String,
  ) : ValidatePhoneNumberRequestQuery

  data class Obj1(
      val numberWithPrefix: String,
  ) : ValidatePhoneNumberRequestQuery
}
/** Query options. */
@JsonDeserialize(`as` = ValidatePhoneNumberRequestOptionsImpl::class)
interface ValidatePhoneNumberRequestOptions {
  val validationType: ValidatePhoneNumberRequestOptionsValidationType?
  val allowedPrefixes: List<String?>?
  val preferredPrefixes: List<String?>?
  val defaultPrefix: String?
  val formatNumber: Boolean?
}

data class ValidatePhoneNumberRequestOptionsImpl(
    override val validationType: ValidatePhoneNumberRequestOptionsValidationType?,
    override val allowedPrefixes: List<String?>?,
    override val preferredPrefixes: List<String?>?,
    override val defaultPrefix: String?,
    override val formatNumber: Boolean?,
) : ValidatePhoneNumberRequestOptions
/** Type of validation. */
enum class ValidatePhoneNumberRequestOptionsValidationType(@JsonValue val value: String) {
  BASIC("basic"),
  EXTENDED("extended"),
}
