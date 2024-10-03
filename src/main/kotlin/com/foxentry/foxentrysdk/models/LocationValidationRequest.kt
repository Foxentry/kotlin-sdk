/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.models

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.foxentry.foxentrysdk.core.*

@JsonDeserialize(`as` = LocationValidationRequestImpl::class)
interface LocationValidationRequest {
  val customId: String?
  val query: LocationValidationRequestQuery
  val options: LocationValidationRequestOptions?
  val client: ClientRequest?
}

data class LocationValidationRequestImpl(
    override val customId: String?,
    override val query: LocationValidationRequestQuery,
    override val options: LocationValidationRequestOptions?,
    override val client: ClientRequest?,
) : LocationValidationRequest

@JsonDeserialize(`as` = LocationValidationRequestQueryImpl::class)
interface LocationValidationRequestQuery {
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

data class LocationValidationRequestQueryImpl(
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
) : LocationValidationRequestQuery

@JsonDeserialize(`as` = LocationValidationRequestOptionsImpl::class)
interface LocationValidationRequestOptions : LocationRequestOptions {
  val acceptPostOfficeAsCity: Boolean?
}

data class LocationValidationRequestOptionsImpl(
    override val acceptPostOfficeAsCity: Boolean?,
    override val dataScope: LocationRequestOptionsDataScope?,
    override val dataSource: List<String?>?,
    override val resultsLimit: Int?,
    override val zipFormat: Boolean?,
    override val cityFormat: LocationRequestOptionsCityFormat?
) : LocationValidationRequestOptions
