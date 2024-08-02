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

/** Successful response */
@JsonDeserialize(`as` = ValidatePhoneNumberImpl::class)
interface ValidatePhoneNumber {
  val status: Int
  val request: ValidatePhoneNumberResponseRequest
  val response: ValidatePhoneNumberResults
  val errors: List<ValidatePhoneNumberErrors?>?
}

data class ValidatePhoneNumberImpl(
    override val status: Int,
    override val request: ValidatePhoneNumberResponseRequest,
    override val response: ValidatePhoneNumberResults,
    override val errors: List<ValidatePhoneNumberErrors?>?,
) : ValidatePhoneNumber

typealias ValidatePhoneNumberErrors = Any
