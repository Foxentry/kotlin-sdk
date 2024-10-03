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

/**
 * Additional information about your user (from whom you've obtained the data sent in query) in
 * order to specify the results in response. Used mainly in web forms when you need more relevant
 * search/autocomplete results.
 */
@JsonDeserialize(`as` = ClientRequestImpl::class)
interface ClientRequest {
  val ip: String?
  val country: String?
  val location: ClientRequestLocation?
}

data class ClientRequestImpl(
    override val ip: String?,
    override val country: String?,
    override val location: ClientRequestLocation?,
) : ClientRequest
/** Latitude & longitude of the client's aprox location. */
@JsonDeserialize(`as` = ClientRequestLocationImpl::class)
interface ClientRequestLocation {
  val lat: Double?
  val lon: Double?
}

data class ClientRequestLocationImpl(
    override val lat: Double?,
    override val lon: Double?,
) : ClientRequestLocation
