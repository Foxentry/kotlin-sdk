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

@JsonDeserialize(`as` = ResponseStatus401Impl::class)
interface ResponseStatus401 {
  val status: Int?
}

data class ResponseStatus401Impl(
    override val status: Int?,
) : ResponseStatus401
