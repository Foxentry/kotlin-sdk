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

/** Successful response */
@JsonDeserialize(`as` = LocationGetImpl::class)
interface LocationGet {
  val status: Int
  val request: LocationGetRequestModel
  val response: LocationGetResults
  val errors: List<LocationGetErrors?>
}

data class LocationGetImpl(
    override val status: Int,
    override val request: LocationGetRequestModel,
    override val response: LocationGetResults,
    override val errors: List<LocationGetErrors?>,
) : LocationGet

@JsonDeserialize(`as` = LocationGetRequestModelImpl::class)
interface LocationGetRequestModel : GlobalRequest {
  val query: LocationGetRequestModelQuery?
  val options: LocationGetRequestModelOptions?
  val client: ClientRequest?
}

data class LocationGetRequestModelImpl(
    override val query: LocationGetRequestModelQuery?,
    override val options: LocationGetRequestModelOptions?,
    override val client: ClientRequest?,
    override val endpoint: String,
    override val code: String,
    override val customId: String?
) : LocationGetRequestModel

@JsonDeserialize(`as` = LocationGetRequestModelQueryImpl::class)
interface LocationGetRequestModelQuery {
  val country: String
  val id: String
}

data class LocationGetRequestModelQueryImpl(
    override val country: String,
    override val id: String,
) : LocationGetRequestModelQuery
/** Query options. */
@JsonDeserialize(`as` = LocationGetRequestModelOptionsImpl::class)
interface LocationGetRequestModelOptions {
  val idType: LocationGetRequestModelOptionsIdType
  val dataScope: LocationGetRequestModelOptionsDataScope
  val dataSource: List<String?>?
  val zipFormat: Boolean?
  val cityFormat: LocationGetRequestModelOptionsCityFormat?
  val countryFormat: LocationGetRequestModelOptionsCountryFormat?
}

data class LocationGetRequestModelOptionsImpl(
    override val idType: LocationGetRequestModelOptionsIdType,
    override val dataScope: LocationGetRequestModelOptionsDataScope,
    override val dataSource: List<String?>?,
    override val zipFormat: Boolean?,
    override val cityFormat: LocationGetRequestModelOptionsCityFormat?,
    override val countryFormat: LocationGetRequestModelOptionsCountryFormat?,
) : LocationGetRequestModelOptions
/**
 * Internal is assigned by Foxentry. External ID may vary for every supported country. CZ = RUIAN,
 * PL = Government data, SK = no external ID.
 */
enum class LocationGetRequestModelOptionsIdType(@JsonValue val value: String) {
  INTERNAL("internal"),
  EXTERNAL("external"),
}
/** Data scope of returned data. */
enum class LocationGetRequestModelOptionsDataScope(@JsonValue val value: String) {
  BASIC("basic"),
  FULL("full"),
}
/**
 * This option determines the format in which the city is returned. <b>Minimal</b> = Praha,
 * <b>basic</b> = Praha 8, <b>extended</b> = Praha 8 - Karlín.
 */
enum class LocationGetRequestModelOptionsCityFormat(@JsonValue val value: String) {
  MINIMAL("minimal"),
  BASIC("basic"),
  EXTENDED("extended"),
}
/**
 * This option determines the format in which the country is returned. Choices include local and
 * international variants with their shortened counterparts as well as ISO 3166 alpha codes.
 */
enum class LocationGetRequestModelOptionsCountryFormat(@JsonValue val value: String) {
  ALPHA2("alpha2"),
  ALPHA3("alpha3"),
  LOCAL("local"),
  LOCAL_SHORTENED("localShortened"),
  INTERNATIONAL("international"),
  INTERNATIONAL_SHORTENED("internationalShortened"),
}

typealias LocationGetErrors = Any
