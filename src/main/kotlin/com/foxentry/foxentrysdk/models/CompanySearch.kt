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
@JsonDeserialize(`as` = CompanySearchImpl::class)
interface CompanySearch {
  val status: Int
  val request: CompanySearchResultsRequest
  val response: CompanySearchResults
  val errors: List<CompanySearchErrors?>?
}

data class CompanySearchImpl(
    override val status: Int,
    override val request: CompanySearchResultsRequest,
    override val response: CompanySearchResults,
    override val errors: List<CompanySearchErrors?>?,
) : CompanySearch

typealias CompanySearchErrors = Any
