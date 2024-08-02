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
@JsonDeserialize(`as` = LocationLocalizationImpl::class)
interface LocationLocalization {
  val status: Int
  val request: LocationLocalizationRequestModel
  val response: LocationLocalizationResults
  val errors: List<LocationLocalizationErrors?>?
}

data class LocationLocalizationImpl(
    override val status: Int,
    override val request: LocationLocalizationRequestModel,
    override val response: LocationLocalizationResults,
    override val errors: List<LocationLocalizationErrors?>?,
) : LocationLocalization

@JsonDeserialize(`as` = LocationLocalizationRequestModelImpl::class)
interface LocationLocalizationRequestModel : GlobalRequest {
  val query: LocationLocalizationRequestModelQuery?
  val options: LocationLocalizationRequestModelOptions?
  val client: LocationLocalizationRequestModelClient?
}

data class LocationLocalizationRequestModelImpl(
    override val query: LocationLocalizationRequestModelQuery?,
    override val options: LocationLocalizationRequestModelOptions?,
    override val client: LocationLocalizationRequestModelClient?,
    override val endpoint: String,
    override val code: String,
    override val customId: String?
) : LocationLocalizationRequestModel

@JsonDeserialize(`as` = LocationLocalizationRequestModelQueryImpl::class)
interface LocationLocalizationRequestModelQuery {
  val lat: Double
  val lon: Double
}

data class LocationLocalizationRequestModelQueryImpl(
    override val lat: Double,
    override val lon: Double,
) : LocationLocalizationRequestModelQuery

typealias LocationLocalizationRequestModelOptions = Any
/**
 * Additional information about your user (from whom you've obtained the data sent in query) in
 * order to specify the results in response. Used mainly in web forms when you need more relevant
 * search/autocomplete results.
 */
@JsonDeserialize(`as` = LocationLocalizationRequestModelClientImpl::class)
interface LocationLocalizationRequestModelClient {
  val ip: String?
  val country: String?
}

data class LocationLocalizationRequestModelClientImpl(
    override val ip: String?,
    override val country: String?,
) : LocationLocalizationRequestModelClient

typealias LocationLocalizationErrors = Any
