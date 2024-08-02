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

@JsonDeserialize(`as` = FixValueLocationImpl::class)
interface FixValueLocation {
  val group: FixValueLocationGroup?
  val type: FixValueLocationType?
  val subtype: FixValueLocationSubtype?
  val data: FixData?
}

data class FixValueLocationImpl(
    override val group: FixValueLocationGroup?,
    override val type: FixValueLocationType?,
    override val subtype: FixValueLocationSubtype?,
    override val data: FixData?,
) : FixValueLocation
/** Group of fix. */
enum class FixValueLocationGroup(@JsonValue val value: String) {
  VALUE("VALUE"),
}
/** Type of fix. */
enum class FixValueLocationType(@JsonValue val value: String) {
  PART_CHANGED("PART_CHANGED"),
}
/** Subtype of error. */
enum class FixValueLocationSubtype(@JsonValue val value: String) {
  CITY("CITY"),
  NUMBER("NUMBER"),
  STREET("STREET"),
  ZIP("ZIP"),
}
