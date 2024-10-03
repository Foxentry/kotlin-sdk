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
}

data class LocationRequestOptionsImpl(
    override val dataScope: LocationRequestOptionsDataScope?,
    override val dataSource: List<String?>?,
    override val resultsLimit: Int?,
    override val zipFormat: Boolean?,
    override val cityFormat: LocationRequestOptionsCityFormat?,
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
