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

@JsonDeserialize(`as` = FixSyntaxCompanyImpl::class)
interface FixSyntaxCompany {
  val group: FixSyntaxCompanyGroup?
  val type: FixSyntaxCompanyType?
  val subtype: FixSyntaxCompanySubtype?
  val data: FixData?
}

data class FixSyntaxCompanyImpl(
    override val group: FixSyntaxCompanyGroup?,
    override val type: FixSyntaxCompanyType?,
    override val subtype: FixSyntaxCompanySubtype?,
    override val data: FixData?,
) : FixSyntaxCompany
/** Group of fix. */
enum class FixSyntaxCompanyGroup(@JsonValue val value: String) {
  SYNTAX("SYNTAX"),
}
/** Type of fix. */
enum class FixSyntaxCompanyType(@JsonValue val value: String) {
  VALUE_PART_ADDED("VALUE_PART_ADDED"),
  VALUE_PART_CHANGED("VALUE_PART_CHANGED"),
  VALUE_PART_REMOVED("VALUE_PART_REMOVED"),
}
/** Subtype of fix. */
enum class FixSyntaxCompanySubtype(@JsonValue val value: String) {
  LEGAL_FORM("LEGAL_FORM"),
}
