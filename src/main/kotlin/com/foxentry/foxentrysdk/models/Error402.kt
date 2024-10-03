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

/** Payment Required. */
@JsonDeserialize(`as` = Error402Impl::class)
interface Error402 : ResponseStatus402 {
  val request: GlobalRequest?
  val errors: List<Error402RequestBillingNoCredit>?
}

data class Error402Impl(
    override val request: GlobalRequest?,
    override val errors: List<Error402RequestBillingNoCredit>?,
    override val status: Int?
) : Error402
