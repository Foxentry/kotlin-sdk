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

@JsonDeserialize(`as` = LocationGetResultsImpl::class)
interface LocationGetResults {
  val results: List<LocationGetResultsResults?>
}

data class LocationGetResultsImpl(
    override val results: List<LocationGetResultsResults?>,
) : LocationGetResults

@JsonDeserialize(`as` = LocationGetResultsResultsImpl::class)
interface LocationGetResultsResults {
  val data: LocationData
}

data class LocationGetResultsResultsImpl(
    override val data: LocationData,
) : LocationGetResultsResults
