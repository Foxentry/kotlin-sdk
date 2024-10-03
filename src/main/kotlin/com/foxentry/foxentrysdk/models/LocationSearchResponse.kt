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

@JsonDeserialize(`as` = LocationSearchResponseImpl::class)
interface LocationSearchResponse {
  val resultsCount: Int
  val results: List<LocationSearchResults>
}

data class LocationSearchResponseImpl(
    override val resultsCount: Int,
    override val results: List<LocationSearchResults>,
) : LocationSearchResponse
