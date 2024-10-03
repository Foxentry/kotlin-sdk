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

@JsonDeserialize(`as` = ErrorSyntaxCompanyImpl::class)
interface ErrorSyntaxCompany {
  val group: ErrorSyntaxCompanyGroup?
  val type: ErrorSyntaxCompanyType?
  val subtype: ErrorSyntaxCompanySubtype?
  val severity: ErrorSyntaxCompanySeverity?
  val relatedTo: List<String?>?
  val description: ErrorSyntaxCompanyDescription?
}

data class ErrorSyntaxCompanyImpl(
    override val group: ErrorSyntaxCompanyGroup?,
    override val type: ErrorSyntaxCompanyType?,
    override val subtype: ErrorSyntaxCompanySubtype?,
    override val severity: ErrorSyntaxCompanySeverity?,
    override val relatedTo: List<String?>?,
    override val description: ErrorSyntaxCompanyDescription?,
) : ErrorSyntaxCompany
/** Group of error. */
enum class ErrorSyntaxCompanyGroup(@JsonValue val value: String) {
  SYNTAX("SYNTAX"),
}
/** Type of error. */
enum class ErrorSyntaxCompanyType(@JsonValue val value: String) {
  VALUE_PART_EXTRA("VALUE_PART_EXTRA"),
  VALUE_PART_MISSING("VALUE_PART_MISSING"),
}
/** Subtype of error. */
enum class ErrorSyntaxCompanySubtype(@JsonValue val value: String) {
  LEGAL_FORM("LEGAL_FORM"),
}
/**
 * Severity of error. <b>Info</b> = cosmetic changes that don't change the overall meaning.
 * <b>Warning</b> = typos and other errors that could affect the meaning. <b>Critical</b> = critical
 * errors.
 */
enum class ErrorSyntaxCompanySeverity(@JsonValue val value: String) {
  INFO("info"),
  WARNING("warning"),
  CRITICAL("critical"),
}
/** Description of error. */
enum class ErrorSyntaxCompanyDescription(@JsonValue val value: String) {
  VALUE_CONTAINS_DUPLICATED_LEGAL_FORM_("Value contains duplicated legal form."),
  COMPANY_NAME_IS_MISSING_THE_LEGAL_FORM_("Company name is missing the legal form."),
}
