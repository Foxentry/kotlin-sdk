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

@JsonDeserialize(`as` = EmailSearchResponseImpl::class)
interface EmailSearchResponse {
  val resultsCount: Double
  val results: List<EmailSearchResponseResults?>
}

data class EmailSearchResponseImpl(
    override val resultsCount: Double,
    override val results: List<EmailSearchResponseResults?>,
) : EmailSearchResponse

@JsonDeserialize(`as` = EmailSearchResponseResultsImpl::class)
interface EmailSearchResponseResults {
  val data: EmailSearchResponseResultsData
}

data class EmailSearchResponseResultsImpl(
    override val data: EmailSearchResponseResultsData,
) : EmailSearchResponseResults

@JsonDeserialize(`as` = EmailSearchResponseResultsDataImpl::class)
interface EmailSearchResponseResultsData {
  val email: String
  val user: String?
  val domain: String
}

data class EmailSearchResponseResultsDataImpl(
    override val email: String,
    override val user: String?,
    override val domain: String,
) : EmailSearchResponseResultsData
