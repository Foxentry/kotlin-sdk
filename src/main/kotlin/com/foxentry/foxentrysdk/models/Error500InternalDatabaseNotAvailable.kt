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

@JsonDeserialize(`as` = Error500InternalDatabaseNotAvailableImpl::class)
interface Error500InternalDatabaseNotAvailable {
  val group: Error500InternalDatabaseNotAvailableGroup?
  val type: Error500InternalDatabaseNotAvailableType?
  val subtype: Error500InternalDatabaseNotAvailableSubtype?
  val severity: String?
  val relatedTo: List<String?>?
  val description: Error500InternalDatabaseNotAvailableDescription?
}

data class Error500InternalDatabaseNotAvailableImpl(
    override val group: Error500InternalDatabaseNotAvailableGroup?,
    override val type: Error500InternalDatabaseNotAvailableType?,
    override val subtype: Error500InternalDatabaseNotAvailableSubtype?,
    override val severity: String?,
    override val relatedTo: List<String?>?,
    override val description: Error500InternalDatabaseNotAvailableDescription?,
) : Error500InternalDatabaseNotAvailable
/** Group of error. */
enum class Error500InternalDatabaseNotAvailableGroup(@JsonValue val value: String) {
  INTERNAL("INTERNAL"),
}
/** Type of error. */
enum class Error500InternalDatabaseNotAvailableType(@JsonValue val value: String) {
  DATABASE("DATABASE"),
}
/** Subtype of error. */
enum class Error500InternalDatabaseNotAvailableSubtype(@JsonValue val value: String) {
  NOT_AVAILABLE("NOT_AVAILABLE"),
}
/** Description of error. */
enum class Error500InternalDatabaseNotAvailableDescription(@JsonValue val value: String) {
  INTERNAL_DATASTORE_IS_NOT_AVAILABLE_AT_THE_MOMENT_NO_OPERATION_ON_THIS_DATASTORE_IS_POSSIBLE_(
      "Internal datastore is not available at the moment. No operation on this datastore is possible."),
}
