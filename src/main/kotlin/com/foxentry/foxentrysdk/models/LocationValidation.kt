/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.models

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.foxentry.foxentrysdk.core.*

/** Successful response */
@JsonDeserialize(`as` = LocationValidationImpl::class)
interface LocationValidation {
  val status: Int
  val request: LocationValidationRequestModel
  val response: LocationValidationResponse
  val errors: List<LocationValidationErrors?>
}

data class LocationValidationImpl(
    override val status: Int,
    override val request: LocationValidationRequestModel,
    override val response: LocationValidationResponse,
    override val errors: List<LocationValidationErrors?>,
) : LocationValidation

@JsonDeserialize(`as` = LocationValidationRequestModelImpl::class)
interface LocationValidationRequestModel : GlobalRequest {
  val query: LocationValidationRequestModelQuery?
  val options: LocationValidationRequestModelOptions?
  val client: ClientRequest?
}

data class LocationValidationRequestModelImpl(
    override val query: LocationValidationRequestModelQuery?,
    override val options: LocationValidationRequestModelOptions?,
    override val client: ClientRequest?,
    override val endpoint: String,
    override val code: String,
    override val customId: String?
) : LocationValidationRequestModel

@JsonDeserialize(`as` = LocationValidationRequestModelQueryImpl::class)
interface LocationValidationRequestModelQuery {
  val street: String?
  val streetWithNumber: String?
  val numberFull: String?
  val numberPart1: String?
  val numberPart1Number: String?
  val numberPart1Letter: String?
  val numberPart2: String?
  val numberPart2Number: String?
  val numberPart2Letter: String?
  val city: String?
  val zip: String?
  val full: String?
  val country: String?
}

data class LocationValidationRequestModelQueryImpl(
    override val street: String?,
    override val streetWithNumber: String?,
    @JsonProperty("number.full") override val numberFull: String?,
    @JsonProperty("number.part1") override val numberPart1: String?,
    @JsonProperty("number.part1Number") override val numberPart1Number: String?,
    @JsonProperty("number.part1Letter") override val numberPart1Letter: String?,
    @JsonProperty("number.part2") override val numberPart2: String?,
    @JsonProperty("number.part2Number") override val numberPart2Number: String?,
    @JsonProperty("number.part2Letter") override val numberPart2Letter: String?,
    override val city: String?,
    override val zip: String?,
    override val full: String?,
    override val country: String?,
) : LocationValidationRequestModelQuery

@JsonDeserialize(`as` = LocationValidationRequestModelOptionsImpl::class)
interface LocationValidationRequestModelOptions : LocationRequestOptions {
  val acceptPostOfficeAsCity: Boolean?
  val countryFormat: LocationValidationRequestModelOptionsCountryFormat?
  val filterMode: LocationValidationRequestModelOptionsFilterMode?
}

data class LocationValidationRequestModelOptionsImpl(
    override val acceptPostOfficeAsCity: Boolean?,
    override val countryFormat: LocationValidationRequestModelOptionsCountryFormat?,
    override val filterMode: LocationValidationRequestModelOptionsFilterMode?,
    override val dataScope: LocationRequestOptionsDataScope?,
    override val dataSource: List<String?>?,
    override val resultsLimit: Int?,
    override val zipFormat: Boolean?,
    override val cityFormat: LocationRequestOptionsCityFormat?
) : LocationValidationRequestModelOptions
/**
 * This option determines the format in which the country is returned. Choices include local and
 * international variants with their shortened counterparts as well as ISO 3166 alpha codes.
 */
enum class LocationValidationRequestModelOptionsCountryFormat(@JsonValue val value: String) {
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
enum class LocationValidationRequestModelOptionsFilterMode(@JsonValue val value: String?) {
  LIMIT("limit"),
  PREFER("prefer"),
}

typealias LocationValidationErrors = Any
