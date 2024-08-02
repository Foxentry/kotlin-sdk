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
@JsonDeserialize(`as` = ValidateCompanyDataImpl::class)
interface ValidateCompanyData {
  val status: Int
  val request: ValidateCompanyDataResultsRequest
  val response: ValidateCompanyDataResults
  val errors: List<ValidateCompanyDataErrors?>?
}

data class ValidateCompanyDataImpl(
    override val status: Int,
    override val request: ValidateCompanyDataResultsRequest,
    override val response: ValidateCompanyDataResults,
    override val errors: List<ValidateCompanyDataErrors?>?,
) : ValidateCompanyData

typealias ValidateCompanyDataErrors = Any
