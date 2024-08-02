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

@JsonDeserialize(`as` = ErrorSyntaxPhoneImpl::class)
interface ErrorSyntaxPhone {
  val group: ErrorSyntaxPhoneGroup?
  val type: ErrorSyntaxPhoneType?
  val subtype: ErrorSyntaxPhoneSubtype?
  val severity: ErrorSyntaxPhoneSeverity?
  val relatedTo: List<String?>?
  val description: ErrorSyntaxPhoneDescription?
}

data class ErrorSyntaxPhoneImpl(
    override val group: ErrorSyntaxPhoneGroup?,
    override val type: ErrorSyntaxPhoneType?,
    override val subtype: ErrorSyntaxPhoneSubtype?,
    override val severity: ErrorSyntaxPhoneSeverity?,
    override val relatedTo: List<String?>?,
    override val description: ErrorSyntaxPhoneDescription?,
) : ErrorSyntaxPhone
/** Group of error. */
enum class ErrorSyntaxPhoneGroup(@JsonValue val value: String) {
  SYNTAX("SYNTAX"),
}
/** Type of error. */
enum class ErrorSyntaxPhoneType(@JsonValue val value: String) {
  VALUE_PART_EXTRA("VALUE_PART_EXTRA"),
  VALUE_PART_MISSING("VALUE_PART_MISSING"),
}
/** Subtype of error. */
enum class ErrorSyntaxPhoneSubtype(@JsonValue val value: String) {
  PLUS_SIGN("PLUS_SIGN"),
  NUMBER("NUMBER"),
  PREFIX("PREFIX"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class ErrorSyntaxPhoneSeverity(@JsonValue val value: String) {
  INFO("info"),
  WARNING("warning"),
  CRITICAL("critical"),
}
/** Description of error. */
enum class ErrorSyntaxPhoneDescription(@JsonValue val value: String) {
  VALUE_CONTAINS_DUPLICATED_SIGN_("Value contains duplicated \'+\' sign."),
  VALUE_IS_MISSING_THE_NUMBER_("Value is missing the number."),
  VALUE_IS_MISSING_THE_SIGN_("Value is missing the \'+\' sign."),
  VALUE_IS_MISSING_THE_PREFIX_("Value is missing the prefix."),
}
