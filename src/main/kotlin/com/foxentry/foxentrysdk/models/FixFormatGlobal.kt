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

@JsonDeserialize(`as` = FixFormatGlobalImpl::class)
interface FixFormatGlobal {
  val group: FixFormatGlobalGroup?
  val type: FixFormatGlobalType?
  val subtype: FixFormatGlobalSubtype?
  val data: FixData?
}

data class FixFormatGlobalImpl(
    override val group: FixFormatGlobalGroup?,
    override val type: FixFormatGlobalType?,
    override val subtype: FixFormatGlobalSubtype?,
    override val data: FixData?,
) : FixFormatGlobal
/** Group of fix. */
enum class FixFormatGlobalGroup(@JsonValue val value: String) {
  FORMAT("FORMAT"),
  VALUE("VALUE"),
}
/** Type of fix. */
enum class FixFormatGlobalType(@JsonValue val value: String) {
  CHANGED("CHANGED"),
}
/** Subtype of fix. */
enum class FixFormatGlobalSubtype(@JsonValue val value: String?) {
  CASE_SENSITIVITY("CASE_SENSITIVITY"),
  DIACRITICS("DIACRITICS"),
  WHITESPACES("WHITESPACES"),
  TYPO("TYPO"),
  NULL(null),
}
