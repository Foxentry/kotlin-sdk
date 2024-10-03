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
@JsonDeserialize(`as` = GetCompanyDataImpl::class)
interface GetCompanyData {
  val status: Int
  val request: GetCompanyDataResponseRequest
  val response: GetCompanyDataResults
  val errors: List<GetCompanyDataErrors?>?
}

data class GetCompanyDataImpl(
    override val status: Int,
    override val request: GetCompanyDataResponseRequest,
    override val response: GetCompanyDataResults,
    override val errors: List<GetCompanyDataErrors?>?,
) : GetCompanyData

typealias GetCompanyDataErrors = Any
