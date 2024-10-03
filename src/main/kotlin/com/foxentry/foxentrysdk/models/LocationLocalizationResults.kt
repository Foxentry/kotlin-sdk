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

@JsonDeserialize(`as` = LocationLocalizationResultsImpl::class)
interface LocationLocalizationResults {
  val resultsCount: Double
  val results: List<LocationLocalizationResultsResults?>
}

data class LocationLocalizationResultsImpl(
    override val resultsCount: Double,
    override val results: List<LocationLocalizationResultsResults?>,
) : LocationLocalizationResults

@JsonDeserialize(`as` = LocationLocalizationResultsResultsImpl::class)
interface LocationLocalizationResultsResults {
  val data: LocationData?
}

data class LocationLocalizationResultsResultsImpl(
    override val data: LocationData?,
) : LocationLocalizationResultsResults
