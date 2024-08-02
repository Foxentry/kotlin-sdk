/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.foxentry.foxentrysdk.core.*

@JsonDeserialize(`as` = ValidatePhoneNumberResponseRequestImpl::class)
interface ValidatePhoneNumberResponseRequest {
  val endpoint: String
  val code: String
  val customId: String?
  val query: ValidatePhoneNumberResponseRequestQuery?
  val options: ValidatePhoneNumberResponseRequestOptions?
  val client: ClientRequest?
}

data class ValidatePhoneNumberResponseRequestImpl(
    override val endpoint: String,
    override val code: String,
    override val customId: String?,
    override val query: ValidatePhoneNumberResponseRequestQuery?,
    override val options: ValidatePhoneNumberResponseRequestOptions?,
    override val client: ClientRequest?,
) : ValidatePhoneNumberResponseRequest

@JsonDeserialize(`as` = ValidatePhoneNumberResponseRequestQueryImpl::class)
interface ValidatePhoneNumberResponseRequestQuery {
  val prefix: String?
  val number: String?
  val numberWithPrefix: String?
}

data class ValidatePhoneNumberResponseRequestQueryImpl(
    override val prefix: String?,
    override val number: String?,
    override val numberWithPrefix: String?,
) : ValidatePhoneNumberResponseRequestQuery
/** Query options. */
@JsonDeserialize(`as` = ValidatePhoneNumberResponseRequestOptionsImpl::class)
interface ValidatePhoneNumberResponseRequestOptions {
  val validationType: String?
  val allowedPrefixes: List<String?>?
  val formatNumber: Boolean?
  val preferredPrefixes: List<String?>?
  val defaultPrefix: String?
}

data class ValidatePhoneNumberResponseRequestOptionsImpl(
    override val validationType: String?,
    override val allowedPrefixes: List<String?>?,
    override val formatNumber: Boolean?,
    override val preferredPrefixes: List<String?>?,
    override val defaultPrefix: String?,
) : ValidatePhoneNumberResponseRequestOptions
