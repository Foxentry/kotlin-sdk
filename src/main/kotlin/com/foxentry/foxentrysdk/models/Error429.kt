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

/** Too Many Requests. */
@JsonDeserialize(`as` = Error429Impl::class)
interface Error429 : ResponseStatus429 {
  val request: GlobalRequest?
  val errors: List<Error429Errors?>?
}

data class Error429Impl(
    override val request: GlobalRequest?,
    override val errors: List<Error429Errors?>?,
    override val status: Int?
) : Error429

class Error429ErrorsDeserializer : StdDeserializer<Error429Errors>(Error429Errors::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): Error429Errors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return Error429Errors.Error429RequestBillingServiceLimit(
          mapper.convertValue(node, Error429RequestBillingServiceLimit::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error429Errors.Error429RequestRateLimitCreditPerDay(
          mapper.convertValue(node, Error429RequestRateLimitCreditPerDay::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error429Errors.Error429RequestRateLimitCreditPerIp(
          mapper.convertValue(node, Error429RequestRateLimitCreditPerIp::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return Error429Errors.Error429RequestRateLimitTooManyRequests(
          mapper.convertValue(node, Error429RequestRateLimitTooManyRequests::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = Error429ErrorsDeserializer::class)
sealed interface Error429Errors {
  data class Error429RequestBillingServiceLimit(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429RequestBillingServiceLimit
  ) : com.foxentry.foxentrysdk.models.Error429RequestBillingServiceLimit by _0, Error429Errors

  data class Error429RequestRateLimitCreditPerDay(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429RequestRateLimitCreditPerDay
  ) : com.foxentry.foxentrysdk.models.Error429RequestRateLimitCreditPerDay by _0, Error429Errors

  data class Error429RequestRateLimitCreditPerIp(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429RequestRateLimitCreditPerIp
  ) : com.foxentry.foxentrysdk.models.Error429RequestRateLimitCreditPerIp by _0, Error429Errors

  data class Error429RequestRateLimitTooManyRequests(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429RequestRateLimitTooManyRequests
  ) : com.foxentry.foxentrysdk.models.Error429RequestRateLimitTooManyRequests by _0, Error429Errors
}
