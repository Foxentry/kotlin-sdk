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

/** Forbidden. */
@JsonDeserialize(`as` = Error403Impl::class)
interface Error403 : ResponseStatus403 {
  val request: GlobalRequest?
  val errors: List<Error403Errors?>?
}

data class Error403Impl(
    override val request: GlobalRequest?,
    override val errors: List<Error403Errors?>?,
    override val status: Int?
) : Error403

class Error403ErrorsDeserializer : StdDeserializer<Error403Errors>(Error403Errors::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): Error403Errors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return Error403Errors.Error403RequestAuthKey(
          mapper.convertValue(node, Error403RequestAuthKey::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error403Errors.Error403RequestAuthToken(
          mapper.convertValue(node, Error403RequestAuthToken::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error403Errors.Error403RequestNotAllowedDomain(
          mapper.convertValue(node, Error403RequestNotAllowedDomain::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error403Errors.Error403RequestNotAllowedIp(
          mapper.convertValue(node, Error403RequestNotAllowedIp::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = Error403ErrorsDeserializer::class)
sealed interface Error403Errors {
  data class Error403RequestAuthKey(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403RequestAuthKey
  ) : com.foxentry.foxentrysdk.models.Error403RequestAuthKey by _0, Error403Errors

  data class Error403RequestAuthToken(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403RequestAuthToken
  ) : com.foxentry.foxentrysdk.models.Error403RequestAuthToken by _0, Error403Errors

  data class Error403RequestNotAllowedDomain(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403RequestNotAllowedDomain
  ) : com.foxentry.foxentrysdk.models.Error403RequestNotAllowedDomain by _0, Error403Errors

  data class Error403RequestNotAllowedIp(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403RequestNotAllowedIp
  ) : com.foxentry.foxentrysdk.models.Error403RequestNotAllowedIp by _0, Error403Errors
}
