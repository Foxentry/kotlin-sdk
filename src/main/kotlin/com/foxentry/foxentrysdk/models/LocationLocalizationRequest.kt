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

@JsonDeserialize(`as` = LocationLocalizationRequestImpl::class)
interface LocationLocalizationRequest {
  val customId: String?
  val query: LocationLocalizationRequestQuery
  val options: LocationLocalizationRequestOptions?
  val client: LocationLocalizationRequestClient?
}

data class LocationLocalizationRequestImpl(
    override val customId: String?,
    override val query: LocationLocalizationRequestQuery,
    override val options: LocationLocalizationRequestOptions?,
    override val client: LocationLocalizationRequestClient?,
) : LocationLocalizationRequest

@JsonDeserialize(`as` = LocationLocalizationRequestQueryImpl::class)
interface LocationLocalizationRequestQuery {
  val lat: Double
  val lon: Double
}

data class LocationLocalizationRequestQueryImpl(
    override val lat: Double,
    override val lon: Double,
) : LocationLocalizationRequestQuery

@JsonDeserialize(`as` = LocationLocalizationRequestOptionsImpl::class)
interface LocationLocalizationRequestOptions : LocationRequestOptions {
  val radius: Int?
  val acceptNearest: Boolean?
}

data class LocationLocalizationRequestOptionsImpl(
    override val radius: Int?,
    override val acceptNearest: Boolean?,
    override val dataScope: LocationRequestOptionsDataScope?,
    override val dataSource: List<String?>?,
    override val resultsLimit: Int?,
    override val zipFormat: Boolean?,
    override val cityFormat: LocationRequestOptionsCityFormat?,
    override val countryFormat: LocationRequestOptionsCountryFormat?,
    override val filterMode: LocationRequestOptionsFilterMode?
) : LocationLocalizationRequestOptions
/**
 * Additional information about your user (from whom you've obtained the data sent in query) in
 * order to specify the results in response. Used mainly in web forms when you need more relevant
 * search/autocomplete results.
 */
@JsonDeserialize(`as` = LocationLocalizationRequestClientImpl::class)
interface LocationLocalizationRequestClient {
  val ip: String?
  val country: String?
}

data class LocationLocalizationRequestClientImpl(
    override val ip: String?,
    override val country: String?,
) : LocationLocalizationRequestClient
