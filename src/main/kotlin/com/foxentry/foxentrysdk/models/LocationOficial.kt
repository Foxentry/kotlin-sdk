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

/** Address data from the official registry. Not validated by Foxentry. */
@JsonDeserialize(`as` = LocationOficialImpl::class)
interface LocationOficial {
  val data: LocationOficialData?
}

data class LocationOficialImpl(
    override val data: LocationOficialData?,
) : LocationOficial

@JsonDeserialize(`as` = LocationOficialDataImpl::class)
interface LocationOficialData {
  val country: String?
  val street: String?
  val number: LocationNumber?
  val streetWithNumber: String?
  val city: String?
  val zip: String?
  val full: String?
}

data class LocationOficialDataImpl(
    override val country: String?,
    override val street: String?,
    override val number: LocationNumber?,
    override val streetWithNumber: String?,
    override val city: String?,
    override val zip: String?,
    override val full: String?,
) : LocationOficialData
