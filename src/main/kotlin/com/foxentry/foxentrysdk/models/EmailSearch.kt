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

/** Successful response */
@JsonDeserialize(`as` = EmailSearchImpl::class)
interface EmailSearch {
  val status: Int
  val request: EmailSearchRequestModel
  val response: EmailSearchResponse?
  val errors: List<EmailSearchErrors?>?
}

data class EmailSearchImpl(
    override val status: Int,
    override val request: EmailSearchRequestModel,
    override val response: EmailSearchResponse?,
    override val errors: List<EmailSearchErrors?>?,
) : EmailSearch

@JsonDeserialize(`as` = EmailSearchRequestModelImpl::class)
interface EmailSearchRequestModel : GlobalRequest {
  val query: EmailSearchRequestModelQuery?
  val options: EmailSearchRequestModelOptions?
  val client: ClientRequest?
}

data class EmailSearchRequestModelImpl(
    override val query: EmailSearchRequestModelQuery?,
    override val options: EmailSearchRequestModelOptions?,
    override val client: ClientRequest?,
    override val endpoint: String,
    override val code: String,
    override val customId: String?
) : EmailSearchRequestModel

@JsonDeserialize(`as` = EmailSearchRequestModelQueryImpl::class)
interface EmailSearchRequestModelQuery {
  val value: String?
}

data class EmailSearchRequestModelQueryImpl(
    override val value: String?,
) : EmailSearchRequestModelQuery
/** Query options. */
@JsonDeserialize(`as` = EmailSearchRequestModelOptionsImpl::class)
interface EmailSearchRequestModelOptions {
  val resultsLimit: Double?
}

data class EmailSearchRequestModelOptionsImpl(
    override val resultsLimit: Double?,
) : EmailSearchRequestModelOptions

typealias EmailSearchErrors = Any
