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

/** Service Unavailable. */
@JsonDeserialize(`as` = Error503Impl::class)
interface Error503 : ResponseStatus503 {
  val request: GlobalRequest?
  val errors: List<Error503RequestEndpointNotAvailable>?
}

data class Error503Impl(
    override val request: GlobalRequest?,
    override val errors: List<Error503RequestEndpointNotAvailable>?,
    override val status: Int?
) : Error503
