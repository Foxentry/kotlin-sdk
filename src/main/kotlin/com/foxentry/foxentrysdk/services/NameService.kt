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

class NameService(
    val config: Config,
    val httpClient: HttpClient = HttpClient { install(ContentNegotiation) { jackson() } }
) {
  /**
   * Validate name data Foxentry allows you to check the validity and real existence of names and
   * their combinations. At least one parameter is required in the query. You can either write down
   * the name separately or use <b>nameSurname</b> as connected parameter. <br><br>Pay attention to
   * the query options. Especially <b>validationDepth</b>, which determines how strict the
   * validation should be based on your use case. For example you''d want minimal validationDepth
   * for web forms since you usually don''t want to disturb the user too much with error messages
   * and suggestions. <br><br> Foxentry validator is able not only to evaluate the validity of the
   * inputed information but it also can fix various typos, errors and missing data. Foxentry can
   * also suggest more suitable alternatives to the data sent in query. Please pay attention to the
   * <b>result</b>, <b>resultCorrected</b> and <b>suggestions</b> in the response.<br><br> Always
   * check <b>result.proposal</b> in the response for a proposed solution by Foxentry how you should
   * process the response in your form or application.
   *
   * @param requestBody
   * @param foxentryIncludeRequestDetails Parameter to add details of your request.
   * @return NameValidation Successful response
   */
  suspend fun nameValidation(
      requestBody: NameValidationRequestBody?,
      foxentryIncludeRequestDetails: Boolean?
  ): NameValidationResponseWrapper {
    val response =
        httpClient.request(config.url + "/name/validate") {
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
    return NameValidationResponseWrapper(
        status = response.status,
        headers =
            NameValidationHeaders(
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

data class NameValidationHeaders(
    val foxentryApiVersion: String?,
    val foxentryDailyCreditsLeft: Double?,
    val foxentryDailyCreditsLimit: Double?,
    val foxentryRateLimit: Int?,
    val foxentryRateLimitPeriod: Int?,
    val foxentryRateLimitRemaining: Int?
)

data class NameValidationResponseWrapper(
    val status: HttpStatusCode,
    val headers: NameValidationHeaders,
    val body: NameValidationResp
)

data class NameValidationRequestBody(val request: NameValidationRequest)

class NameValidationRespDeserializer :
    StdDeserializer<NameValidationResp>(NameValidationResp::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): NameValidationResp {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null

    try {
      return NameValidationResp.NameValidation(
          mapper.convertValue(node, NameValidation::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResp.Error400(mapper.convertValue(node, Error400::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResp.Error401(mapper.convertValue(node, Error401::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResp.Error402(mapper.convertValue(node, Error402::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResp.Error403(mapper.convertValue(node, Error403::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResp.Error404(mapper.convertValue(node, Error404::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResp.Error405(mapper.convertValue(node, Error405::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResp.Error429(mapper.convertValue(node, Error429::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResp.Error500(mapper.convertValue(node, Error500::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResp.Error503(mapper.convertValue(node, Error503::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }

    throw firstError!!
  }
}

@JsonDeserialize(using = NameValidationRespDeserializer::class)
sealed interface NameValidationResp {
  data class NameValidation(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.NameValidation) :
      com.foxentry.foxentrysdk.models.NameValidation by _0, NameValidationResp

  data class Error400(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400) :
      com.foxentry.foxentrysdk.models.Error400 by _0, NameValidationResp

  data class Error401(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error401) :
      com.foxentry.foxentrysdk.models.Error401 by _0, NameValidationResp

  data class Error402(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error402) :
      com.foxentry.foxentrysdk.models.Error402 by _0, NameValidationResp

  data class Error403(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403) :
      com.foxentry.foxentrysdk.models.Error403 by _0, NameValidationResp

  data class Error404(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error404) :
      com.foxentry.foxentrysdk.models.Error404 by _0, NameValidationResp

  data class Error405(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error405) :
      com.foxentry.foxentrysdk.models.Error405 by _0, NameValidationResp

  data class Error429(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429) :
      com.foxentry.foxentrysdk.models.Error429 by _0, NameValidationResp

  data class Error500(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500) :
      com.foxentry.foxentrysdk.models.Error500 by _0, NameValidationResp

  data class Error503(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error503) :
      com.foxentry.foxentrysdk.models.Error503 by _0, NameValidationResp
}
