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

@JsonDeserialize(`as` = ResponseStatus400Impl::class)
interface ResponseStatus400 {
  val status: Int?
}

data class ResponseStatus400Impl(
    override val status: Int?,
) : ResponseStatus400
