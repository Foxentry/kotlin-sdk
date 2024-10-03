/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.models

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.foxentry.foxentrysdk.core.*

/** Internal Server Error. */
@JsonDeserialize(`as` = Error500Impl::class)
interface Error500 : ResponseStatus500 {
  val request: GlobalRequest?
  val errors: List<Error500Errors?>?
}

data class Error500Impl(
    override val request: GlobalRequest?,
    override val errors: List<Error500Errors?>?,
    override val status: Int?
) : Error500

class Error500ErrorsDeserializer : StdDeserializer<Error500Errors>(Error500Errors::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): Error500Errors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return Error500Errors.Error500InternalBilling(
          mapper.convertValue(node, Error500InternalBilling::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error500Errors.Error500InternalDatabaseConnection(
          mapper.convertValue(node, Error500InternalDatabaseConnection::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error500Errors.Error500InternalDatabaseError(
          mapper.convertValue(node, Error500InternalDatabaseError::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error500Errors.Error500InternalDatabaseNotAvailable(
          mapper.convertValue(node, Error500InternalDatabaseNotAvailable::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error500Errors.Error500InternalError(
          mapper.convertValue(node, Error500InternalError::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error500Errors.Error500Timeout(mapper.convertValue(node, Error500Timeout::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error500Errors.Error500RequestProjectNoData(
          mapper.convertValue(node, Error500RequestProjectNoData::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = Error500ErrorsDeserializer::class)
sealed interface Error500Errors {
  data class Error500InternalBilling(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500InternalBilling
  ) : com.foxentry.foxentrysdk.models.Error500InternalBilling by _0, Error500Errors

  data class Error500InternalDatabaseConnection(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500InternalDatabaseConnection
  ) : com.foxentry.foxentrysdk.models.Error500InternalDatabaseConnection by _0, Error500Errors

  data class Error500InternalDatabaseError(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500InternalDatabaseError
  ) : com.foxentry.foxentrysdk.models.Error500InternalDatabaseError by _0, Error500Errors

  data class Error500InternalDatabaseNotAvailable(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500InternalDatabaseNotAvailable
  ) : com.foxentry.foxentrysdk.models.Error500InternalDatabaseNotAvailable by _0, Error500Errors

  data class Error500InternalError(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500InternalError
  ) : com.foxentry.foxentrysdk.models.Error500InternalError by _0, Error500Errors

  data class Error500Timeout(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500Timeout) :
      com.foxentry.foxentrysdk.models.Error500Timeout by _0, Error500Errors

  data class Error500RequestProjectNoData(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500RequestProjectNoData
  ) : com.foxentry.foxentrysdk.models.Error500RequestProjectNoData by _0, Error500Errors
}
