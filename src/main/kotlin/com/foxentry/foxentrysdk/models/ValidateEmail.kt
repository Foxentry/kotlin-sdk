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

/** Successful response */
@JsonDeserialize(`as` = ValidateEmailImpl::class)
interface ValidateEmail {
  val status: Int
  val request: ValidateEmailRequestModel
  val response: ValidateEmailResponse
  val errors: List<ValidateEmailErrors?>
}

data class ValidateEmailImpl(
    override val status: Int,
    override val request: ValidateEmailRequestModel,
    override val response: ValidateEmailResponse,
    override val errors: List<ValidateEmailErrors?>,
) : ValidateEmail

@JsonDeserialize(`as` = ValidateEmailRequestModelImpl::class)
interface ValidateEmailRequestModel : GlobalRequest {
  val query: ValidateEmailRequestModelQuery?
  val options: ValidateEmailRequestModelOptions?
  val client: ClientRequest?
}

data class ValidateEmailRequestModelImpl(
    override val query: ValidateEmailRequestModelQuery?,
    override val options: ValidateEmailRequestModelOptions?,
    override val client: ClientRequest?,
    override val endpoint: String,
    override val code: String,
    override val customId: String?
) : ValidateEmailRequestModel

@JsonDeserialize(`as` = ValidateEmailRequestModelQueryImpl::class)
interface ValidateEmailRequestModelQuery {
  val email: String
}

data class ValidateEmailRequestModelQueryImpl(
    override val email: String,
) : ValidateEmailRequestModelQuery
/** Query options. */
@JsonDeserialize(`as` = ValidateEmailRequestModelOptionsImpl::class)
interface ValidateEmailRequestModelOptions {
  val validationType: ValidateEmailRequestModelOptionsValidationType?
  val acceptDisposableEmails: Boolean?
  val acceptFreemails: Boolean?
}

data class ValidateEmailRequestModelOptionsImpl(
    override val validationType: ValidateEmailRequestModelOptionsValidationType?,
    override val acceptDisposableEmails: Boolean?,
    override val acceptFreemails: Boolean?,
) : ValidateEmailRequestModelOptions
/**
 * Type of validation. <b>Basic</b> = only the format of e-mail is checked and only standard
 * corrections are included. <b>Extended</b> = in depth check of deliverability. Additional
 * information is returned such as temporary mail check or freemail check. More complicated
 * corrections are included.
 */
enum class ValidateEmailRequestModelOptionsValidationType(@JsonValue val value: String) {
  BASIC("basic"),
  EXTENDED("extended"),
}

typealias ValidateEmailErrors = Any
