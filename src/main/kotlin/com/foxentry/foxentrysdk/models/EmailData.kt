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

@JsonDeserialize(`as` = EmailDataImpl::class)
interface EmailData {
  val email: String?
  val user: String?
  val domain: String?
}

data class EmailDataImpl(
    override val email: String?,
    override val user: String?,
    override val domain: String?,
) : EmailData
