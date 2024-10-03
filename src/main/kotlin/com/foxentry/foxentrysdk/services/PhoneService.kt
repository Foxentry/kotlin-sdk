/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.services

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.foxentry.foxentrysdk.core.*
import com.foxentry.foxentrysdk.models.*
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.jackson.*

class PhoneService(
    val config: Config,
    val httpClient: HttpClient = HttpClient { install(ContentNegotiation) { jackson() } }
) {
  /**
   * Validate phone number Foxentry allows you to check validity and the existence of phone numbers.
   * It can also give you additional information about the validated phone number based on the
   * <b>validationType</b> option.<br><br>Please pay attention to the <b>formatNumber</b> option.
   * This option defines the format of number that should be considered as valid. <br><br>Foxentry
   * validator is able not only to evaluate the validity of the inputed information but it also can
   * fix various typos, errors and missing data. Foxentry can also suggest more suitable
   * alternatives to the data sent in query. Please pay attention to the <b>result</b>,
   * <b>resultCorrected</b> and <b>suggestions</b> in the response.<br><br> Always check
   * <b>result.proposal</b> in the response for a proposed solution by Foxentry how you should
   * process the response in your form or application.
   *
   * @param requestBody
   * @param foxentryIncludeRequestDetails Parameter to add details of your request.
   * @return ValidatePhoneNumber Successful response
   */
  suspend fun validatePhoneNumber(
      requestBody: ValidatePhoneNumberRequestBody?,
      foxentryIncludeRequestDetails: Boolean?
  ): ValidatePhoneNumberResponseWrapper {
    val response =
        httpClient.request(config.url + "/phone/validate") {
          method = HttpMethod.Post
          if (config.token != null) {
            bearerAuth(config.token)
          } else if (config.username != null && config.password != null) {
            basicAuth(config.username, config.password)
          }
          headers {
            append(HttpHeaders.UserAgent, "FoxentrySdk (Kotlin/2.0; FoxentryApiReference/2.0)")
            foxentryIncludeRequestDetails?.let {
              append("foxentry-include-request-details", it.toString())
            }
          }
          contentType(ContentType.Application.Json)
          setBody(requestBody)
        }
    return ValidatePhoneNumberResponseWrapper(
        status = response.status,
        headers =
            ValidatePhoneNumberHeaders(
                foxentryApiVersion = response.headers["foxentry-api-version"],
                foxentryDailyCreditsLeft =
                    response.headers["foxentry-daily-credits-left"]?.toDoubleOrNull(),
                foxentryDailyCreditsLimit =
                    response.headers["foxentry-daily-credits-limit"]?.toDoubleOrNull(),
                foxentryRateLimit = response.headers["foxentry-rate-limit"]?.toIntOrNull(),
                foxentryRateLimitPeriod =
                    response.headers["foxentry-rate-limit-period"]?.toIntOrNull(),
                foxentryRateLimitRemaining =
                    response.headers["foxentry-rate-limit-remaining"]?.toIntOrNull()),
        body = response.body())
  }
}

data class ValidatePhoneNumberHeaders(
    val foxentryApiVersion: String?,
    val foxentryDailyCreditsLeft: Double?,
    val foxentryDailyCreditsLimit: Double?,
    val foxentryRateLimit: Int?,
    val foxentryRateLimitPeriod: Int?,
    val foxentryRateLimitRemaining: Int?
)

data class ValidatePhoneNumberResponseWrapper(
    val status: HttpStatusCode,
    val headers: ValidatePhoneNumberHeaders,
    val body: ValidatePhoneNumberResp
)

data class ValidatePhoneNumberRequestBody(val request: ValidatePhoneNumberRequest)

class ValidatePhoneNumberRespDeserializer :
    StdDeserializer<ValidatePhoneNumberResp>(ValidatePhoneNumberResp::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): ValidatePhoneNumberResp {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null

    try {
      return ValidatePhoneNumberResp.ValidatePhoneNumber(
          mapper.convertValue(node, ValidatePhoneNumber::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResp.Error400(mapper.convertValue(node, Error400::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResp.Error401(mapper.convertValue(node, Error401::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResp.Error402(mapper.convertValue(node, Error402::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResp.Error403(mapper.convertValue(node, Error403::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResp.Error404(mapper.convertValue(node, Error404::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResp.Error405(mapper.convertValue(node, Error405::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResp.Error429(mapper.convertValue(node, Error429::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResp.Error500(mapper.convertValue(node, Error500::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResp.Error503(mapper.convertValue(node, Error503::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }

    throw firstError!!
  }
}

@JsonDeserialize(using = ValidatePhoneNumberRespDeserializer::class)
sealed interface ValidatePhoneNumberResp {
  data class ValidatePhoneNumber(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ValidatePhoneNumber
  ) : com.foxentry.foxentrysdk.models.ValidatePhoneNumber by _0, ValidatePhoneNumberResp

  data class Error400(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400) :
      com.foxentry.foxentrysdk.models.Error400 by _0, ValidatePhoneNumberResp

  data class Error401(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error401) :
      com.foxentry.foxentrysdk.models.Error401 by _0, ValidatePhoneNumberResp

  data class Error402(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error402) :
      com.foxentry.foxentrysdk.models.Error402 by _0, ValidatePhoneNumberResp

  data class Error403(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403) :
      com.foxentry.foxentrysdk.models.Error403 by _0, ValidatePhoneNumberResp

  data class Error404(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error404) :
      com.foxentry.foxentrysdk.models.Error404 by _0, ValidatePhoneNumberResp

  data class Error405(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error405) :
      com.foxentry.foxentrysdk.models.Error405 by _0, ValidatePhoneNumberResp

  data class Error429(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429) :
      com.foxentry.foxentrysdk.models.Error429 by _0, ValidatePhoneNumberResp

  data class Error500(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500) :
      com.foxentry.foxentrysdk.models.Error500 by _0, ValidatePhoneNumberResp

  data class Error503(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error503) :
      com.foxentry.foxentrysdk.models.Error503 by _0, ValidatePhoneNumberResp
}
