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

class EmailService(
    val config: Config,
    val httpClient: HttpClient = HttpClient { install(ContentNegotiation) { jackson() } }
) {
  /**
   * Validate email This endpoint will let you check if the e-mail address sent in query is
   * valid.<br><br> Please pay attention to the <b>validationType</b> option since it has direct
   * impact on the returned data. <b>Extended validation</b> (default) is the more advanced type
   * that checks the real existence of the e-mail address and its deliverability. It also informs
   * you about various flags such as <b>freemail and disposable mail</b> detection. <br><br>
   * Foxentry validator is able not only to evaluate the validity of the inputed information but it
   * also can fix various typos, errors and missing data. Foxentry can also suggest more suitable
   * alternatives to the data sent in query. Please pay attention to the <b>result</b>,
   * <b>resultCorrected</b> and <b>suggestions</b> in the response.<br><br> Always check
   * <b>result.proposal</b> in the response for a proposed solution by Foxentry how you should
   * process the response in your form or application.
   *
   * @param requestBody
   * @param foxentryIncludeRequestDetails Parameter to add details of your request.
   * @return ValidateEmail Successful response
   */
  suspend fun validateEmail(
      requestBody: ValidateEmailRequestBody?,
      foxentryIncludeRequestDetails: Boolean?
  ): ValidateEmailResponseWrapper {
    val response =
        httpClient.request(config.url + "/email/validate") {
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
    return ValidateEmailResponseWrapper(
        status = response.status,
        headers =
            ValidateEmailHeaders(
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
  /**
   * Search email Foxentry will automatically offer you suggestions to complete the e-mail address
   * you are writing down. This mainly serves as <b>autocomplete</b>.<br><br> Pay attention to the
   * <b>client</b> section in the request body. You can specify the user's location in order to
   * receive more relevant suggestions.
   *
   * @param requestBody
   * @param foxentryIncludeRequestDetails Parameter to add details of your request.
   * @return EmailSearch Successful response
   */
  suspend fun emailSearch(
      requestBody: EmailSearchRequestBody?,
      foxentryIncludeRequestDetails: Boolean?
  ): EmailSearchResponseWrapper {
    val response =
        httpClient.request(config.url + "/email/search") {
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
    return EmailSearchResponseWrapper(
        status = response.status,
        headers =
            EmailSearchHeaders(
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

data class ValidateEmailHeaders(
    val foxentryApiVersion: String?,
    val foxentryDailyCreditsLeft: Double?,
    val foxentryDailyCreditsLimit: Double?,
    val foxentryRateLimit: Int?,
    val foxentryRateLimitPeriod: Int?,
    val foxentryRateLimitRemaining: Int?
)

data class ValidateEmailResponseWrapper(
    val status: HttpStatusCode,
    val headers: ValidateEmailHeaders,
    val body: ValidateEmailResp
)

data class ValidateEmailRequestBody(val request: ValidateEmailRequest)

class ValidateEmailRespDeserializer :
    StdDeserializer<ValidateEmailResp>(ValidateEmailResp::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): ValidateEmailResp {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null

    try {
      return ValidateEmailResp.ValidateEmail(mapper.convertValue(node, ValidateEmail::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResp.Error400(mapper.convertValue(node, Error400::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResp.Error401(mapper.convertValue(node, Error401::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResp.Error402(mapper.convertValue(node, Error402::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResp.Error403(mapper.convertValue(node, Error403::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResp.Error404(mapper.convertValue(node, Error404::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResp.Error405(mapper.convertValue(node, Error405::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResp.Error429(mapper.convertValue(node, Error429::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResp.Error500(mapper.convertValue(node, Error500::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResp.Error503(mapper.convertValue(node, Error503::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }

    throw firstError!!
  }
}

@JsonDeserialize(using = ValidateEmailRespDeserializer::class)
sealed interface ValidateEmailResp {
  data class ValidateEmail(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.ValidateEmail) :
      com.foxentry.foxentrysdk.models.ValidateEmail by _0, ValidateEmailResp

  data class Error400(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400) :
      com.foxentry.foxentrysdk.models.Error400 by _0, ValidateEmailResp

  data class Error401(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error401) :
      com.foxentry.foxentrysdk.models.Error401 by _0, ValidateEmailResp

  data class Error402(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error402) :
      com.foxentry.foxentrysdk.models.Error402 by _0, ValidateEmailResp

  data class Error403(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403) :
      com.foxentry.foxentrysdk.models.Error403 by _0, ValidateEmailResp

  data class Error404(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error404) :
      com.foxentry.foxentrysdk.models.Error404 by _0, ValidateEmailResp

  data class Error405(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error405) :
      com.foxentry.foxentrysdk.models.Error405 by _0, ValidateEmailResp

  data class Error429(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429) :
      com.foxentry.foxentrysdk.models.Error429 by _0, ValidateEmailResp

  data class Error500(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500) :
      com.foxentry.foxentrysdk.models.Error500 by _0, ValidateEmailResp

  data class Error503(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error503) :
      com.foxentry.foxentrysdk.models.Error503 by _0, ValidateEmailResp
}

data class EmailSearchHeaders(
    val foxentryApiVersion: String?,
    val foxentryDailyCreditsLeft: Double?,
    val foxentryDailyCreditsLimit: Double?,
    val foxentryRateLimit: Int?,
    val foxentryRateLimitPeriod: Int?,
    val foxentryRateLimitRemaining: Int?
)

data class EmailSearchResponseWrapper(
    val status: HttpStatusCode,
    val headers: EmailSearchHeaders,
    val body: EmailSearchResp
)

data class EmailSearchRequestBody(val request: EmailSearchRequest)

class EmailSearchRespDeserializer : StdDeserializer<EmailSearchResp>(EmailSearchResp::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): EmailSearchResp {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null

    try {
      return EmailSearchResp.EmailSearch(mapper.convertValue(node, EmailSearch::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return EmailSearchResp.Error400(mapper.convertValue(node, Error400::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return EmailSearchResp.Error401(mapper.convertValue(node, Error401::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return EmailSearchResp.Error402(mapper.convertValue(node, Error402::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return EmailSearchResp.Error403(mapper.convertValue(node, Error403::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return EmailSearchResp.Error404(mapper.convertValue(node, Error404::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return EmailSearchResp.Error405(mapper.convertValue(node, Error405::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return EmailSearchResp.Error429(mapper.convertValue(node, Error429::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return EmailSearchResp.Error500(mapper.convertValue(node, Error500::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return EmailSearchResp.Error503(mapper.convertValue(node, Error503::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }

    throw firstError!!
  }
}

@JsonDeserialize(using = EmailSearchRespDeserializer::class)
sealed interface EmailSearchResp {
  data class EmailSearch(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.EmailSearch) :
      com.foxentry.foxentrysdk.models.EmailSearch by _0, EmailSearchResp

  data class Error400(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400) :
      com.foxentry.foxentrysdk.models.Error400 by _0, EmailSearchResp

  data class Error401(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error401) :
      com.foxentry.foxentrysdk.models.Error401 by _0, EmailSearchResp

  data class Error402(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error402) :
      com.foxentry.foxentrysdk.models.Error402 by _0, EmailSearchResp

  data class Error403(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403) :
      com.foxentry.foxentrysdk.models.Error403 by _0, EmailSearchResp

  data class Error404(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error404) :
      com.foxentry.foxentrysdk.models.Error404 by _0, EmailSearchResp

  data class Error405(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error405) :
      com.foxentry.foxentrysdk.models.Error405 by _0, EmailSearchResp

  data class Error429(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429) :
      com.foxentry.foxentrysdk.models.Error429 by _0, EmailSearchResp

  data class Error500(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500) :
      com.foxentry.foxentrysdk.models.Error500 by _0, EmailSearchResp

  data class Error503(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error503) :
      com.foxentry.foxentrysdk.models.Error503 by _0, EmailSearchResp
}
