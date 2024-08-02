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

@JsonDeserialize(`as` = FixValueGlobalImpl::class)
interface FixValueGlobal {
  val group: FixValueGlobalGroup?
  val type: FixValueGlobalType?
  val subtype: FixValueGlobalSubtype?
  val data: FixData?
}

data class FixValueGlobalImpl(
    override val group: FixValueGlobalGroup?,
    override val type: FixValueGlobalType?,
    override val subtype: FixValueGlobalSubtype?,
    override val data: FixData?,
) : FixValueGlobal
/** Group of fix. */
enum class FixValueGlobalGroup(@JsonValue val value: String) {
  VALUE("VALUE"),
}
/** Type of fix. */
enum class FixValueGlobalType(@JsonValue val value: String) {
  ADDED("ADDED"),
  CHANGED("CHANGED"),
  PART_CHANGED("PART_CHANGED"),
  REMOVED("REMOVED"),
}
/** Subtype of error. */
enum class FixValueGlobalSubtype(@JsonValue val value: String?) {
  INTERNAL_RULE("INTERNAL_RULE"),
  TYPO("TYPO"),
  NULL(null),
}
