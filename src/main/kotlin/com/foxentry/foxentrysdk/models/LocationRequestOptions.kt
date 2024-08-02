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
@JsonDeserialize(`as` = LocationRequestOptionsImpl::class)
interface LocationRequestOptions {
  val dataScope: LocationRequestOptionsDataScope?
  val dataSource: List<String?>?
  val resultsLimit: Int?
  val zipFormat: Boolean?
  val cityFormat: LocationRequestOptionsCityFormat?
  val countryFormat: LocationRequestOptionsCountryFormat?
  val filterMode: LocationRequestOptionsFilterMode?
}

data class LocationRequestOptionsImpl(
    override val dataScope: LocationRequestOptionsDataScope?,
    override val dataSource: List<String?>?,
    override val resultsLimit: Int?,
    override val zipFormat: Boolean?,
    override val cityFormat: LocationRequestOptionsCityFormat?,
    override val countryFormat: LocationRequestOptionsCountryFormat?,
    override val filterMode: LocationRequestOptionsFilterMode?,
) : LocationRequestOptions
/** Data scope of returned data. */
enum class LocationRequestOptionsDataScope(@JsonValue val value: String) {
  BASIC("basic"),
  FULL("full"),
}
/**
 * This option determines the format in which the city is returned. <b>Minimal</b> = Praha,
 * <b>basic</b> = Praha 8, <b>extended</b> = Praha 8 - Karlín.
 */
enum class LocationRequestOptionsCityFormat(@JsonValue val value: String) {
  MINIMAL("minimal"),
  BASIC("basic"),
  EXTENDED("extended"),
}
/**
 * This option determines the format in which the country is returned. Choices include local and
 * international variants with their shortened counterparts as well as ISO 3166 alpha codes.
 */
enum class LocationRequestOptionsCountryFormat(@JsonValue val value: String) {
  ALPHA2("alpha2"),
  ALPHA3("alpha3"),
  LOCAL("local"),
  LOCAL_SHORTENED("localShortened"),
  INTERNATIONAL("international"),
  INTERNATIONAL_SHORTENED("internationalShortened"),
}
/**
 * <b>Prefer</b> = prefer results matching the filter parameters, <b>limit</b> = limit to results
 * matching the filter parameters.
 */
enum class LocationRequestOptionsFilterMode(@JsonValue val value: String?) {
  LIMIT("limit"),
  PREFER("prefer"),
}
