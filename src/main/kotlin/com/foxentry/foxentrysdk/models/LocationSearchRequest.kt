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

@JsonDeserialize(`as` = LocationSearchRequestImpl::class)
interface LocationSearchRequest {
  val customId: String?
  val query: LocationSearchRequestQuery
  val options: LocationRequestOptionsSearch?
  val client: ClientRequest?
}

data class LocationSearchRequestImpl(
    override val customId: String?,
    override val query: LocationSearchRequestQuery,
    override val options: LocationRequestOptionsSearch?,
    override val client: ClientRequest?,
) : LocationSearchRequest

@JsonDeserialize(`as` = LocationSearchRequestQueryImpl::class)
interface LocationSearchRequestQuery {
  val type: LocationSearchRequestQueryType
  val value: String
  val filter: LocationSearchRequestQueryFilter?
}

data class LocationSearchRequestQueryImpl(
    override val type: LocationSearchRequestQueryType,
    override val value: String,
    override val filter: LocationSearchRequestQueryFilter?,
) : LocationSearchRequestQuery
/** Type of search. */
enum class LocationSearchRequestQueryType(@JsonValue val value: String) {
  STREET("street"),
  STREET_WITH_NUMBER("streetWithNumber"),
  NUMBER_FULL("number.full"),
  NUMBER_PART1("number.part1"),
  NUMBER_PART2("number.part2"),
  CITY("city"),
  ZIP("zip"),
  FULL("full"),
}
/**
 * Additional filter in order to specify the search results. You can for example set as a filter
 * city of Prague, so the the search engine would look for the addresses only in Prague. Pay
 * attention to the options, which determines how the filter should behave.
 */
@JsonDeserialize(`as` = LocationSearchRequestQueryFilterImpl::class)
interface LocationSearchRequestQueryFilter {
  val street: String?
  val streetWithNumber: String?
  val numberFull: String?
  val numberPart1: String?
  val numberPart2: String?
  val city: String?
  val zip: String?
  val country: String?
}

data class LocationSearchRequestQueryFilterImpl(
    override val street: String?,
    override val streetWithNumber: String?,
    @JsonProperty("number.full") override val numberFull: String?,
    @JsonProperty("number.part1") override val numberPart1: String?,
    @JsonProperty("number.part2") override val numberPart2: String?,
    override val city: String?,
    override val zip: String?,
    override val country: String?,
) : LocationSearchRequestQueryFilter
