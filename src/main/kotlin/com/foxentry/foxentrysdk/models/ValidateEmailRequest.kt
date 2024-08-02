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

@JsonDeserialize(`as` = ValidateEmailRequestImpl::class)
interface ValidateEmailRequest {
  val customId: String?
  val query: ValidateEmailRequestQuery
  val options: ValidateEmailRequestOptions?
  val client: ClientRequest?
}

data class ValidateEmailRequestImpl(
    override val customId: String?,
    override val query: ValidateEmailRequestQuery,
    override val options: ValidateEmailRequestOptions?,
    override val client: ClientRequest?,
) : ValidateEmailRequest

@JsonDeserialize(`as` = ValidateEmailRequestQueryImpl::class)
interface ValidateEmailRequestQuery {
  val email: String
}

data class ValidateEmailRequestQueryImpl(
    override val email: String,
) : ValidateEmailRequestQuery
/** Query options. */
@JsonDeserialize(`as` = ValidateEmailRequestOptionsImpl::class)
interface ValidateEmailRequestOptions {
  val validationType: ValidateEmailRequestOptionsValidationType?
  val acceptDisposableEmails: Boolean?
  val acceptFreemails: Boolean?
}

data class ValidateEmailRequestOptionsImpl(
    override val validationType: ValidateEmailRequestOptionsValidationType?,
    override val acceptDisposableEmails: Boolean?,
    override val acceptFreemails: Boolean?,
) : ValidateEmailRequestOptions
/**
 * Type of validation. <b>Basic</b> = only the format of e-mail is checked and only standard
 * corrections are included. <b>Extended</b> = in depth check of deliverability. Additional
 * information is returned such as temporary mail check or freemail check. More complicated
 * corrections are included.
 */
enum class ValidateEmailRequestOptionsValidationType(@JsonValue val value: String) {
  BASIC("basic"),
  EXTENDED("extended"),
}
