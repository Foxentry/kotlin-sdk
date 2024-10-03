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

@JsonDeserialize(`as` = LocationGetRequestImpl::class)
interface LocationGetRequest {
  val customId: String?
  val query: LocationGetRequestQuery
  val options: LocationGetRequestOptions?
  val client: ClientRequest?
}

data class LocationGetRequestImpl(
    override val customId: String?,
    override val query: LocationGetRequestQuery,
    override val options: LocationGetRequestOptions?,
    override val client: ClientRequest?,
) : LocationGetRequest

@JsonDeserialize(`as` = LocationGetRequestQueryImpl::class)
interface LocationGetRequestQuery {
  val country: String
  val id: String
}

data class LocationGetRequestQueryImpl(
    override val country: String,
    override val id: String,
) : LocationGetRequestQuery
/** Query options. */
@JsonDeserialize(`as` = LocationGetRequestOptionsImpl::class)
interface LocationGetRequestOptions {
  val idType: LocationGetRequestOptionsIdType
  val dataScope: LocationGetRequestOptionsDataScope
  val dataSource: List<String?>?
  val zipFormat: Boolean?
  val cityFormat: LocationGetRequestOptionsCityFormat?
}

data class LocationGetRequestOptionsImpl(
    override val idType: LocationGetRequestOptionsIdType,
    override val dataScope: LocationGetRequestOptionsDataScope,
    override val dataSource: List<String?>?,
    override val zipFormat: Boolean?,
    override val cityFormat: LocationGetRequestOptionsCityFormat?,
) : LocationGetRequestOptions
/**
 * Internal is assigned by Foxentry. External ID may vary for every supported country. CZ = RUIAN,
 * PL = Government data, SK = no external ID.
 */
enum class LocationGetRequestOptionsIdType(@JsonValue val value: String) {
  INTERNAL("internal"),
  EXTERNAL("external"),
}
/** Data scope of returned data. */
enum class LocationGetRequestOptionsDataScope(@JsonValue val value: String) {
  BASIC("basic"),
  FULL("full"),
}
/**
 * This option determines the format in which the city is returned. <b>Minimal</b> = Praha,
 * <b>basic</b> = Praha 8, <b>extended</b> = Praha 8 - Karlín.
 */
enum class LocationGetRequestOptionsCityFormat(@JsonValue val value: String) {
  MINIMAL("minimal"),
  BASIC("basic"),
  EXTENDED("extended"),
}
