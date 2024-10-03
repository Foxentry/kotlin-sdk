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

/** Unauthorized. */
@JsonDeserialize(`as` = Error401Impl::class)
interface Error401 : ResponseStatus401 {
  val request: GlobalRequest?
  val errors: List<Error401RequestAuth>?
}

data class Error401Impl(
    override val request: GlobalRequest?,
    override val errors: List<Error401RequestAuth>?,
    override val status: Int?
) : Error401
