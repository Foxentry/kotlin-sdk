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

@JsonDeserialize(`as` = EmailSearchRequestImpl::class)
interface EmailSearchRequest {
  val customId: String?
  val query: EmailSearchRequestQuery?
  val options: EmailSearchRequestOptions?
  val client: ClientRequest?
}

data class EmailSearchRequestImpl(
    override val customId: String?,
    override val query: EmailSearchRequestQuery?,
    override val options: EmailSearchRequestOptions?,
    override val client: ClientRequest?,
) : EmailSearchRequest

@JsonDeserialize(`as` = EmailSearchRequestQueryImpl::class)
interface EmailSearchRequestQuery {
  val value: String
}

data class EmailSearchRequestQueryImpl(
    override val value: String,
) : EmailSearchRequestQuery
/** Query options. */
@JsonDeserialize(`as` = EmailSearchRequestOptionsImpl::class)
interface EmailSearchRequestOptions {
  val resultsLimit: Double?
}

data class EmailSearchRequestOptionsImpl(
    override val resultsLimit: Double?,
) : EmailSearchRequestOptions
