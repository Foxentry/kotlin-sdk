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

/** List of all changes applied to the query data in order to get the corrected result. */
@JsonDeserialize(`as` = EmailFixesImpl::class)
interface EmailFixes {
  val type: String?
  val subtype: String?
  val data: EmailFixesData?
}

data class EmailFixesImpl(
    override val type: String?,
    override val subtype: String?,
    override val data: EmailFixesData?,
) : EmailFixes

@JsonDeserialize(`as` = EmailFixesDataImpl::class)
interface EmailFixesData {
  val typeFrom: String?
  val type: String?
  val valueFrom: String?
  val value: String?
}

data class EmailFixesDataImpl(
    override val typeFrom: String?,
    override val type: String?,
    override val valueFrom: String?,
    override val value: String?,
) : EmailFixesData
