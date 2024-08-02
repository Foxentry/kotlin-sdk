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
@JsonDeserialize(`as` = LocationSearchImpl::class)
interface LocationSearch {
  val status: Int
  val request: LocationSearchRequestModel
  val response: LocationSearchResponse?
  val errors: List<LocationSearchErrors?>?
}

data class LocationSearchImpl(
    override val status: Int,
    override val request: LocationSearchRequestModel,
    override val response: LocationSearchResponse?,
    override val errors: List<LocationSearchErrors?>?,
) : LocationSearch

@JsonDeserialize(`as` = LocationSearchRequestModelImpl::class)
interface LocationSearchRequestModel : GlobalRequest {
  val query: LocationSearchRequestModelQuery?
  val options: LocationRequestOptionsSearch?
  val client: ClientRequest?
}

data class LocationSearchRequestModelImpl(
    override val query: LocationSearchRequestModelQuery?,
    override val options: LocationRequestOptionsSearch?,
    override val client: ClientRequest?,
    override val endpoint: String,
    override val code: String,
    override val customId: String?
) : LocationSearchRequestModel

@JsonDeserialize(`as` = LocationSearchRequestModelQueryImpl::class)
interface LocationSearchRequestModelQuery {
  val type: LocationSearchRequestModelQueryType?
  val value: String?
  val filter: LocationSearchRequestModelQueryFilter?
}

data class LocationSearchRequestModelQueryImpl(
    override val type: LocationSearchRequestModelQueryType?,
    override val value: String?,
    override val filter: LocationSearchRequestModelQueryFilter?,
) : LocationSearchRequestModelQuery
/** Type of search. */
enum class LocationSearchRequestModelQueryType(@JsonValue val value: String) {
  STREET("street"),
  STREET_WITH_NUMBER("streetWithNumber"),
  NUMBER_FULL("number.full"),
  NUMBER_PART1("number.part1"),
  NUMBER_PART1NUMBER("number.part1Number"),
  NUMBER_PART2("number.part2"),
  NUMBER_PART2NUMBER("number.part2Number"),
  CITY("city"),
  ZIP("zip"),
  FULL("full"),
}
/**
 * Additional filter in order to specify the search results. You can for example set as a filter
 * city of Prague, so the the search engine would look for the addresses only in Prague. Pay
 * attention to the options, which determines how the filter should behave.
 */
@JsonDeserialize(`as` = LocationSearchRequestModelQueryFilterImpl::class)
interface LocationSearchRequestModelQueryFilter {
  val street: String?
  val streetWithNumber: String?
  val numberFull: String?
  val numberPart1: String?
  val numberPart2: String?
  val city: String?
  val zip: String?
  val country: String?
}

data class LocationSearchRequestModelQueryFilterImpl(
    override val street: String?,
    override val streetWithNumber: String?,
    @JsonProperty("number.full") override val numberFull: String?,
    @JsonProperty("number.part1") override val numberPart1: String?,
    @JsonProperty("number.part2") override val numberPart2: String?,
    override val city: String?,
    override val zip: String?,
    override val country: String?,
) : LocationSearchRequestModelQueryFilter

typealias LocationSearchErrors = Any
