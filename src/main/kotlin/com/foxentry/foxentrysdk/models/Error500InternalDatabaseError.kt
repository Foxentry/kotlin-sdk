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

@JsonDeserialize(`as` = Error500InternalDatabaseErrorImpl::class)
interface Error500InternalDatabaseError {
  val group: Error500InternalDatabaseErrorGroup?
  val type: Error500InternalDatabaseErrorType?
  val subtype: Error500InternalDatabaseErrorSubtype?
  val severity: String?
  val relatedTo: List<String?>?
  val description: Error500InternalDatabaseErrorDescription?
}

data class Error500InternalDatabaseErrorImpl(
    override val group: Error500InternalDatabaseErrorGroup?,
    override val type: Error500InternalDatabaseErrorType?,
    override val subtype: Error500InternalDatabaseErrorSubtype?,
    override val severity: String?,
    override val relatedTo: List<String?>?,
    override val description: Error500InternalDatabaseErrorDescription?,
) : Error500InternalDatabaseError
/** Group of error. */
enum class Error500InternalDatabaseErrorGroup(@JsonValue val value: String) {
  INTERNAL("INTERNAL"),
}
/** Type of error. */
enum class Error500InternalDatabaseErrorType(@JsonValue val value: String) {
  DATABASE("DATABASE"),
}
/** Subtype of error. */
enum class Error500InternalDatabaseErrorSubtype(@JsonValue val value: String) {
  ERROR("ERROR"),
}
/** Description of error. */
enum class Error500InternalDatabaseErrorDescription(@JsonValue val value: String) {
  AN_ERROR_HAS_OCCURED_DURING_THE_COMMUNICATION_WITH_OUR_DATABASE_PLEASE_CONTACT_US_IF_THE_ERROR_PERSISTS_(
      "An error has occured during the communication with our database. Please contact us if the error persists."),
}
