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

/** Data that has been changed */
@JsonDeserialize(`as` = FixDataImpl::class)
interface FixData {
  val typeFrom: String?
  val type: String?
  val valueFrom: String?
  val value: String?
}

data class FixDataImpl(
    override val typeFrom: String?,
    override val type: String?,
    override val valueFrom: String?,
    override val value: String?,
) : FixData
