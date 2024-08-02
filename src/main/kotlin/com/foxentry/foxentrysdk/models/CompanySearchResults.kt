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

@JsonDeserialize(`as` = CompanySearchResultsImpl::class)
interface CompanySearchResults {
  val resultsCount: Double
  val results: List<CompanyResultsResponseResults>
}

data class CompanySearchResultsImpl(
    override val resultsCount: Double,
    override val results: List<CompanyResultsResponseResults>,
) : CompanySearchResults
