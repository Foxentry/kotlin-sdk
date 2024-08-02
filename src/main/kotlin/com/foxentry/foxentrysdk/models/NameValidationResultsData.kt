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

@JsonDeserialize(`as` = NameValidationResultsDataImpl::class)
interface NameValidationResultsData {
  val nameSurname: String?
  val name: String
  val surname: String?
  val context: List<String?>
  val degreesBefore: List<String?>
  val degreesAfter: List<String?>?
}

data class NameValidationResultsDataImpl(
    override val nameSurname: String?,
    override val name: String,
    override val surname: String?,
    override val context: List<String?>,
    override val degreesBefore: List<String?>,
    override val degreesAfter: List<String?>?,
) : NameValidationResultsData
