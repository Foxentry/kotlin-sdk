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
@JsonDeserialize(`as` = NameValidationImpl::class)
interface NameValidation {
  val status: Int
  val request: NameValidationResponseRequest
  val response: NameValidationResults
  val errors: List<NameValidationErrors?>
}

data class NameValidationImpl(
    override val status: Int,
    override val request: NameValidationResponseRequest,
    override val response: NameValidationResults,
    override val errors: List<NameValidationErrors?>,
) : NameValidation

typealias NameValidationErrors = Any
