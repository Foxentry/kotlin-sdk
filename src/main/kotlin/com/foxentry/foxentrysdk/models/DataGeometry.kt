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

@JsonDeserialize(`as` = DataGeometryImpl::class)
interface DataGeometry {
  val gps: DataGeometryGps?
  val custom: List<DataGeometryCustom?>?
}

data class DataGeometryImpl(
    override val gps: DataGeometryGps?,
    override val custom: List<DataGeometryCustom?>?,
) : DataGeometry

@JsonDeserialize(`as` = DataGeometryGpsImpl::class)
interface DataGeometryGps {
  val lat: Double?
  val lon: Double?
}

data class DataGeometryGpsImpl(
    override val lat: Double?,
    override val lon: Double?,
) : DataGeometryGps

@JsonDeserialize(`as` = DataGeometryCustomImpl::class)
interface DataGeometryCustom {
  val type: DataGeometryCustomType?
  val coordinates: DataGeometryCustomCoordinates?
}

data class DataGeometryCustomImpl(
    override val type: DataGeometryCustomType?,
    override val coordinates: DataGeometryCustomCoordinates?,
) : DataGeometryCustom
/** Type of coordinate system. */
enum class DataGeometryCustomType(@JsonValue val value: String?) {
  JTSK("JTSK"),
  ETRS89("ETRS89"),
}

@JsonDeserialize(`as` = DataGeometryCustomCoordinatesImpl::class)
interface DataGeometryCustomCoordinates {
  val x: Double?
  val y: Double?
}

data class DataGeometryCustomCoordinatesImpl(
    @JsonProperty("x") override val x: Double?,
    @JsonProperty("y") override val y: Double?,
) : DataGeometryCustomCoordinates
