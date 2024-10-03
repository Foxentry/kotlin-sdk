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

/** Bad Request. */
@JsonDeserialize(`as` = Error400Impl::class)
interface Error400 : ResponseStatus400 {
  val request: GlobalRequest?
  val errors: List<Error400Errors?>?
}

data class Error400Impl(
    override val request: GlobalRequest?,
    override val errors: List<Error400Errors?>?,
    override val status: Int?
) : Error400

class Error400ErrorsDeserializer : StdDeserializer<Error400Errors>(Error400Errors::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): Error400Errors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return Error400Errors.Error400RequestBodyEmpty(
          mapper.convertValue(node, Error400RequestBodyEmpty::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error400Errors.Error400RequestBodyNotJson(
          mapper.convertValue(node, Error400RequestBodyNotJson::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error400Errors.Error400RequestBodyNoRequest(
          mapper.convertValue(node, Error400RequestBodyNoRequest::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error400Errors.Error400RequestBodyTooBig(
          mapper.convertValue(node, Error400RequestBodyTooBig::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error400Errors.Error400RequestOptionsParameterNotSupported(
          mapper.convertValue(node, Error400RequestOptionsParameterNotSupported::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error400Errors.Error400RequestOptionParameterValueNotSupported(
          mapper.convertValue(node, Error400RequestOptionParameterValueNotSupported::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error400Errors.Error400RequestQueryNotSent(
          mapper.convertValue(node, Error400RequestQueryNotSent::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error400Errors.Error400RequestQueryParameterCombination(
          mapper.convertValue(node, Error400RequestQueryParameterCombination::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error400Errors.Error400RequestQueryParameterNotSupportedForQuery(
          mapper.convertValue(node, Error400RequestQueryParameterNotSupportedForQuery::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error400Errors.Error400RequestOptionsParameterCombination(
          mapper.convertValue(node, Error400RequestOptionsParameterCombination::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error400Errors.Error400RequestQueryParameterMissing(
          mapper.convertValue(node, Error400RequestQueryParameterMissing::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error400Errors.Error400RequestQueryParameterNotSupported(
          mapper.convertValue(node, Error400RequestQueryParameterNotSupported::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error400Errors.Error400RequestQueryParameterRequired(
          mapper.convertValue(node, Error400RequestQueryParameterRequired::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = Error400ErrorsDeserializer::class)
sealed interface Error400Errors {
  data class Error400RequestBodyEmpty(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400RequestBodyEmpty
  ) : com.foxentry.foxentrysdk.models.Error400RequestBodyEmpty by _0, Error400Errors

  data class Error400RequestBodyNotJson(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400RequestBodyNotJson
  ) : com.foxentry.foxentrysdk.models.Error400RequestBodyNotJson by _0, Error400Errors

  data class Error400RequestBodyNoRequest(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400RequestBodyNoRequest
  ) : com.foxentry.foxentrysdk.models.Error400RequestBodyNoRequest by _0, Error400Errors

  data class Error400RequestBodyTooBig(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400RequestBodyTooBig
  ) : com.foxentry.foxentrysdk.models.Error400RequestBodyTooBig by _0, Error400Errors

  data class Error400RequestOptionsParameterNotSupported(
      @JsonIgnore
      val _0: com.foxentry.foxentrysdk.models.Error400RequestOptionsParameterNotSupported
  ) :
      com.foxentry.foxentrysdk.models.Error400RequestOptionsParameterNotSupported by _0,
      Error400Errors

  data class Error400RequestOptionParameterValueNotSupported(
      @JsonIgnore
      val _0: com.foxentry.foxentrysdk.models.Error400RequestOptionParameterValueNotSupported
  ) :
      com.foxentry.foxentrysdk.models.Error400RequestOptionParameterValueNotSupported by _0,
      Error400Errors

  data class Error400RequestQueryNotSent(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400RequestQueryNotSent
  ) : com.foxentry.foxentrysdk.models.Error400RequestQueryNotSent by _0, Error400Errors

  data class Error400RequestQueryParameterCombination(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400RequestQueryParameterCombination
  ) :
      com.foxentry.foxentrysdk.models.Error400RequestQueryParameterCombination by _0,
      Error400Errors

  data class Error400RequestQueryParameterNotSupportedForQuery(
      @JsonIgnore
      val _0: com.foxentry.foxentrysdk.models.Error400RequestQueryParameterNotSupportedForQuery
  ) :
      com.foxentry.foxentrysdk.models.Error400RequestQueryParameterNotSupportedForQuery by _0,
      Error400Errors

  data class Error400RequestOptionsParameterCombination(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400RequestOptionsParameterCombination
  ) :
      com.foxentry.foxentrysdk.models.Error400RequestOptionsParameterCombination by _0,
      Error400Errors

  data class Error400RequestQueryParameterMissing(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400RequestQueryParameterMissing
  ) : com.foxentry.foxentrysdk.models.Error400RequestQueryParameterMissing by _0, Error400Errors

  data class Error400RequestQueryParameterNotSupported(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400RequestQueryParameterNotSupported
  ) :
      com.foxentry.foxentrysdk.models.Error400RequestQueryParameterNotSupported by _0,
      Error400Errors

  data class Error400RequestQueryParameterRequired(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400RequestQueryParameterRequired
  ) : com.foxentry.foxentrysdk.models.Error400RequestQueryParameterRequired by _0, Error400Errors
}
