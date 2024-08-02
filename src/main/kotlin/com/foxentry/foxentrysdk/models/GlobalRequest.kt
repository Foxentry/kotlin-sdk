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

@JsonDeserialize(`as` = GlobalRequestImpl::class)
interface GlobalRequest {
  val endpoint: String
  val code: String
  val customId: String?
}

data class GlobalRequestImpl(
    override val endpoint: String,
    override val code: String,
    override val customId: String?,
) : GlobalRequest
