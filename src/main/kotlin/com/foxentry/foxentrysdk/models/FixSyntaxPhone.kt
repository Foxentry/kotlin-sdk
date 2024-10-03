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

@JsonDeserialize(`as` = FixSyntaxPhoneImpl::class)
interface FixSyntaxPhone {
  val group: FixSyntaxPhoneGroup?
  val type: FixSyntaxPhoneType?
  val subtype: FixSyntaxPhoneSubtype?
  val data: FixData?
}

data class FixSyntaxPhoneImpl(
    override val group: FixSyntaxPhoneGroup?,
    override val type: FixSyntaxPhoneType?,
    override val subtype: FixSyntaxPhoneSubtype?,
    override val data: FixData?,
) : FixSyntaxPhone
/** Group of fix. */
enum class FixSyntaxPhoneGroup(@JsonValue val value: String) {
  SYNTAX("SYNTAX"),
}
/** Type of fix. */
enum class FixSyntaxPhoneType(@JsonValue val value: String) {
  VALUE_PART_ADDED("VALUE_PART_ADDED"),
  VALUE_PART_CHANGED("VALUE_PART_CHANGED"),
  VALUE_PART_REMOVED("VALUE_PART_REMOVED"),
}
/** Subtype of error. */
enum class FixSyntaxPhoneSubtype(@JsonValue val value: String) {
  PLUS_SIGN("PLUS_SIGN"),
  PREFIX("PREFIX"),
}
