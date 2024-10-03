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

/** Method Not Allowed. */
@JsonDeserialize(`as` = Error405Impl::class)
interface Error405 : ResponseStatus405 {
  val request: GlobalRequest?
  val errors: List<Error405RequestNotAllowedMethod>?
}

data class Error405Impl(
    override val request: GlobalRequest?,
    override val errors: List<Error405RequestNotAllowedMethod>?,
    override val status: Int?
) : Error405
