/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.foxentry.foxentrysdk.core.*

@JsonDeserialize(`as` = LocationDataImpl::class)
interface LocationData {
  val country: String?
  val region: String?
  val district: String?
  val cityDistrict: String?
  val cityDistrictSpecial: String?
  val cityPart: String?
  val cityAdministrative: String?
  val cadastralArea: String?
  val ids: LocationDataIds
  val street: String?
  val number: LocationNumber
  val streetWithNumber: String?
  val city: String?
  val zip: String?
  val postOffice: LocationDataPostOffice?
  val geometry: DataGeometry?
  val full: String?
}

data class LocationDataImpl(
    override val country: String?,
    override val region: String?,
    override val district: String?,
    override val cityDistrict: String?,
    override val cityDistrictSpecial: String?,
    override val cityPart: String?,
    override val cityAdministrative: String?,
    override val cadastralArea: String?,
    override val ids: LocationDataIds,
    override val street: String?,
    override val number: LocationNumber,
    override val streetWithNumber: String?,
    override val city: String?,
    override val zip: String?,
    override val postOffice: LocationDataPostOffice?,
    override val geometry: DataGeometry?,
    override val full: String?,
) : LocationData
/** Address internal & external ids. */
@JsonDeserialize(`as` = LocationDataIdsImpl::class)
interface LocationDataIds {
  val internal: String?
  val external: String?
  val region: String?
  val discrict: String?
  val cityDistrictSpecial: String?
  val cityDistrict: String?
  val cityPart: String?
  val cadastralArea: String?
  val city: String?
  val street: String?
}

data class LocationDataIdsImpl(
    override val internal: String?,
    override val external: String?,
    override val region: String?,
    override val discrict: String?,
    override val cityDistrictSpecial: String?,
    override val cityDistrict: String?,
    override val cityPart: String?,
    override val cadastralArea: String?,
    override val city: String?,
    override val street: String?,
) : LocationDataIds
/** In what post office jurisdiction the address falls under. */
@JsonDeserialize(`as` = LocationDataPostOfficeImpl::class)
interface LocationDataPostOffice {
  val name: String?
}

data class LocationDataPostOfficeImpl(
    override val name: String?,
) : LocationDataPostOffice
