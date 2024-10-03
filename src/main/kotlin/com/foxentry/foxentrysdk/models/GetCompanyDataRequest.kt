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

@JsonDeserialize(`as` = GetCompanyDataRequestImpl::class)
interface GetCompanyDataRequest {
  val customId: String?
  val query: GetCompanyDataRequestQuery
  val options: CompanyDataRequestOption?
  val client: ClientRequest?
}

data class GetCompanyDataRequestImpl(
    override val customId: String?,
    override val query: GetCompanyDataRequestQuery,
    override val options: CompanyDataRequestOption?,
    override val client: ClientRequest?,
) : GetCompanyDataRequest

@JsonDeserialize(`as` = GetCompanyDataRequestQueryImpl::class)
interface GetCompanyDataRequestQuery {
  val country: String
  val registrationNumber: String
}

data class GetCompanyDataRequestQueryImpl(
    override val country: String,
    override val registrationNumber: String,
) : GetCompanyDataRequestQuery
