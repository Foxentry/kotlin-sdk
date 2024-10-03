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

@JsonDeserialize(`as` = FixSyntaxGlobalImpl::class)
interface FixSyntaxGlobal {
  val group: FixSyntaxGlobalGroup?
  val type: FixSyntaxGlobalType?
  val subtype: FixSyntaxGlobalSubtype?
  val data: FixData?
}

data class FixSyntaxGlobalImpl(
    override val group: FixSyntaxGlobalGroup?,
    override val type: FixSyntaxGlobalType?,
    override val subtype: FixSyntaxGlobalSubtype?,
    override val data: FixData?,
) : FixSyntaxGlobal
/** Group of fix. */
enum class FixSyntaxGlobalGroup(@JsonValue val value: String) {
  SYNTAX("SYNTAX"),
}
/** Type of fix. */
enum class FixSyntaxGlobalType(@JsonValue val value: String) {
  VALUE_CHANGED("VALUE_CHANGED"),
  VALUE_PART_CHANGED("VALUE_PART_CHANGED"),
  VALUE_PART_REMOVED("VALUE_PART_REMOVED"),
}
/** Subtype of fix. */
enum class FixSyntaxGlobalSubtype(@JsonValue val value: String?) {
  CHARACTERS("CHARACTERS"),
  WHITESPACES("WHITESPACES"),
  CONTEXT("CONTEXT"),
  DUPLICITY("DUPLICITY"),
  NULL(null),
}
