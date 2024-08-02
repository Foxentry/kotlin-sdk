/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.models

import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.foxentry.foxentrysdk.core.*

/** Query options. */
@JsonDeserialize(`as` = LocationRequestOptionsSearchImpl::class)
interface LocationRequestOptionsSearch {
  val dataScope: LocationRequestOptionsSearchDataScope?
  val dataSource: List<String?>?
  val resultsLimit: Int?
  val allowPartialResults: Boolean?
  val filterMode: LocationRequestOptionsSearchFilterMode?
  val filterAcceptFormat: Boolean?
  val filterAcceptAlternatives: Boolean?
  val filterExactMatch: Boolean?
  val zipFormat: Boolean?
  val cityFormat: LocationRequestOptionsSearchCityFormat?
  val countryFormat: LocationRequestOptionsSearchCountryFormat?
}

data class LocationRequestOptionsSearchImpl(
    override val dataScope: LocationRequestOptionsSearchDataScope?,
    override val dataSource: List<String?>?,
    override val resultsLimit: Int?,
    override val allowPartialResults: Boolean?,
    override val filterMode: LocationRequestOptionsSearchFilterMode?,
    override val filterAcceptFormat: Boolean?,
    override val filterAcceptAlternatives: Boolean?,
    override val filterExactMatch: Boolean?,
    override val zipFormat: Boolean?,
    override val cityFormat: LocationRequestOptionsSearchCityFormat?,
    override val countryFormat: LocationRequestOptionsSearchCountryFormat?,
) : LocationRequestOptionsSearch
/** Data scope of returned data. */
enum class LocationRequestOptionsSearchDataScope(@JsonValue val value: String) {
  BASIC("basic"),
  FULL("full"),
}
/**
 * <b>Prefer</b> = prefer results matching the filter parameters, <b>limit</b> = limit to results
 * matching the filter parameters.
 */
enum class LocationRequestOptionsSearchFilterMode(@JsonValue val value: String?) {
  LIMIT("limit"),
  PREFER("prefer"),
}
/**
 * This option determines the format in which the city is returned. <b>Minimal</b> = Praha,
 * <b>basic</b> = Praha 8, <b>extended</b> = Praha 8 - Karlín.
 */
enum class LocationRequestOptionsSearchCityFormat(@JsonValue val value: String) {
  MINIMAL("minimal"),
  BASIC("basic"),
  EXTENDED("extended"),
}
/**
 * This option determines the format in which the country is returned. Choices include local and
 * international variants with their shortened counterparts as well as ISO 3166 alpha codes.
 */
enum class LocationRequestOptionsSearchCountryFormat(@JsonValue val value: String) {
  ALPHA2("alpha2"),
  ALPHA3("alpha3"),
  LOCAL("local"),
  LOCAL_SHORTENED("localShortened"),
  INTERNATIONAL("international"),
  INTERNATIONAL_SHORTENED("internationalShortened"),
}
