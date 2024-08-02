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

@JsonDeserialize(`as` = EmailFlagsImpl::class)
interface EmailFlags {
  val isCatchAllServer: Boolean?
  val isDisposableEmailLocation: Boolean?
  val isFreeMail: Boolean?
}

data class EmailFlagsImpl(
    override val isCatchAllServer: Boolean?,
    override val isDisposableEmailLocation: Boolean?,
    override val isFreeMail: Boolean?,
) : EmailFlags
