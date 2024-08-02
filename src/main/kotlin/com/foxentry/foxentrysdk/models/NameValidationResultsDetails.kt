/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.models

import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.foxentry.foxentrysdk.core.*

typealias NameValidationResultsDetails = List<NameValidationResultsDetailsEntry>

@JsonDeserialize(`as` = NameValidationResultsDetailsEntryImpl::class)
interface NameValidationResultsDetailsEntry {
  val type: NameValidationResultsDetailsEntryType
  val value: String
  val gender: NameValidationResultsDetailsEntryGender?
  val vocative: String?
  val nameDays: List<NameValidationResultsDetailsEntryNameDays?>?
}

data class NameValidationResultsDetailsEntryImpl(
    override val type: NameValidationResultsDetailsEntryType,
    override val value: String,
    override val gender: NameValidationResultsDetailsEntryGender?,
    override val vocative: String?,
    override val nameDays: List<NameValidationResultsDetailsEntryNameDays?>?,
) : NameValidationResultsDetailsEntry
/** Type of detail. */
enum class NameValidationResultsDetailsEntryType(@JsonValue val value: String) {
  NAME("name"),
  SURNAME("surname"),
  NAME_SURNAME("nameSurname"),
}
/** Gender of name. 0 for unspecified, 1 for men, 2 for women */
enum class NameValidationResultsDetailsEntryGender(@JsonValue val value: Int) {
  _0(0),
  _1(1),
  _2(2),
}

@JsonDeserialize(`as` = NameValidationResultsDetailsEntryNameDaysImpl::class)
interface NameValidationResultsDetailsEntryNameDays {
  val country: String
  val month: Double
  val day: Double
}

data class NameValidationResultsDetailsEntryNameDaysImpl(
    override val country: String,
    override val month: Double,
    override val day: Double,
) : NameValidationResultsDetailsEntryNameDays
