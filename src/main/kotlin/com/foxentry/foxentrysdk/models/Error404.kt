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

/** Not Found. */
@JsonDeserialize(`as` = Error404Impl::class)
interface Error404 : ResponseStatus404 {
  val request: GlobalRequest?
  val errors: List<Error404Errors?>?
}

data class Error404Impl(
    override val request: GlobalRequest?,
    override val errors: List<Error404Errors?>?,
    override val status: Int?
) : Error404

class Error404ErrorsDeserializer : StdDeserializer<Error404Errors>(Error404Errors::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): Error404Errors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return Error404Errors.Error404RequestApiVersion(
          mapper.convertValue(node, Error404RequestApiVersion::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error404Errors.Error404RequestEndpointNotFound(
          mapper.convertValue(node, Error404RequestEndpointNotFound::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error404Errors.Error404RequestProjectNotFound(
          mapper.convertValue(node, Error404RequestProjectNotFound::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = Error404ErrorsDeserializer::class)
sealed interface Error404Errors {
  data class Error404RequestApiVersion(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error404RequestApiVersion
  ) : com.foxentry.foxentrysdk.models.Error404RequestApiVersion by _0, Error404Errors

  data class Error404RequestEndpointNotFound(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error404RequestEndpointNotFound
  ) : com.foxentry.foxentrysdk.models.Error404RequestEndpointNotFound by _0, Error404Errors

  data class Error404RequestProjectNotFound(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error404RequestProjectNotFound
  ) : com.foxentry.foxentrysdk.models.Error404RequestProjectNotFound by _0, Error404Errors
}
