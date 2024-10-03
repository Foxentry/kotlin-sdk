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

@JsonDeserialize(`as` = Error500InternalDatabaseConnectionImpl::class)
interface Error500InternalDatabaseConnection {
  val group: Error500InternalDatabaseConnectionGroup?
  val type: Error500InternalDatabaseConnectionType?
  val subtype: Error500InternalDatabaseConnectionSubtype?
  val severity: String?
  val relatedTo: List<String?>?
  val description: Error500InternalDatabaseConnectionDescription?
}

data class Error500InternalDatabaseConnectionImpl(
    override val group: Error500InternalDatabaseConnectionGroup?,
    override val type: Error500InternalDatabaseConnectionType?,
    override val subtype: Error500InternalDatabaseConnectionSubtype?,
    override val severity: String?,
    override val relatedTo: List<String?>?,
    override val description: Error500InternalDatabaseConnectionDescription?,
) : Error500InternalDatabaseConnection
/** Group of error. */
enum class Error500InternalDatabaseConnectionGroup(@JsonValue val value: String) {
  INTERNAL("INTERNAL"),
}
/** Type of error. */
enum class Error500InternalDatabaseConnectionType(@JsonValue val value: String) {
  DATABASE("DATABASE"),
}
/** Subtype of error. */
enum class Error500InternalDatabaseConnectionSubtype(@JsonValue val value: String) {
  CONNECTION("CONNECTION"),
}
/** Description of error. */
enum class Error500InternalDatabaseConnectionDescription(@JsonValue val value: String) {
  FAILED_TO_ESTABLISH_CONNECTION_WITH_THE_DATABASE_SERVER_PLEASE_CONTACT_US_IF_THE_ERROR_PERSISTS_(
      "Failed to establish connection with the database server. Please contact us if the error persists."),
}
