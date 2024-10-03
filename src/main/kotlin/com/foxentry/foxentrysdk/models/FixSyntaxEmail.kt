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

@JsonDeserialize(`as` = FixSyntaxEmailImpl::class)
interface FixSyntaxEmail {
  val group: FixSyntaxEmailGroup?
  val type: FixSyntaxEmailType?
  val subtype: FixSyntaxEmailSubtype?
  val data: FixData?
}

data class FixSyntaxEmailImpl(
    override val group: FixSyntaxEmailGroup?,
    override val type: FixSyntaxEmailType?,
    override val subtype: FixSyntaxEmailSubtype?,
    override val data: FixData?,
) : FixSyntaxEmail
/** Group of fix. */
enum class FixSyntaxEmailGroup(@JsonValue val value: String) {
  SYNTAX("SYNTAX"),
}
/** Type of fix. */
enum class FixSyntaxEmailType(@JsonValue val value: String) {
  VALUE_PART_ADDED("VALUE_PART_ADDED"),
  VALUE_PART_CHANGED("VALUE_PART_CHANGED"),
  VALUE_PART_REMOVED("VALUE_PART_REMOVED"),
}
/** Subtype of fix. */
enum class FixSyntaxEmailSubtype(@JsonValue val value: String) {
  AT_SIGN("AT_SIGN"),
  DOMAIN_TLD("DOMAIN_TLD"),
  DOMAIN("DOMAIN"),
}
