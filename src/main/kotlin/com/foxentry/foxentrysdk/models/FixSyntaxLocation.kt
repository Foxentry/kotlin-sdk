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

@JsonDeserialize(`as` = FixSyntaxLocationImpl::class)
interface FixSyntaxLocation {
  val group: FixSyntaxLocationGroup?
  val type: FixSyntaxLocationType?
  val subtype: FixSyntaxLocationSubtype?
  val data: FixData?
}

data class FixSyntaxLocationImpl(
    override val group: FixSyntaxLocationGroup?,
    override val type: FixSyntaxLocationType?,
    override val subtype: FixSyntaxLocationSubtype?,
    override val data: FixData?,
) : FixSyntaxLocation
/** Group of fix. */
enum class FixSyntaxLocationGroup(@JsonValue val value: String) {
  SYNTAX("SYNTAX"),
}
/** Type of fix. */
enum class FixSyntaxLocationType(@JsonValue val value: String) {
  VALUE_PART_ADDED("VALUE_PART_ADDED"),
}
/** Subtype of fix. */
enum class FixSyntaxLocationSubtype(@JsonValue val value: String) {
  NUMBER("NUMBER"),
  NUMBER_PART("NUMBER_PART"),
}
