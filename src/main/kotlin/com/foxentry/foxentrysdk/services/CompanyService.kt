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

class CompanyService(
    val config: Config,
    val httpClient: HttpClient = HttpClient { install(ContentNegotiation) { jackson() } }
) {
  /**
   * Validate company data This endpoint requires at least 1 query parameter and will check if the
   * parameters and their combinations are valid. Returns information about the company based on the
   * datascope set in the options.<br><br> Foxentry validator is able not only to evaluate the
   * validity of the inputed information but it also can fix various typos, errors and missing data.
   * Foxentry can also suggest more suitable alternatives to the data sent in query. Please pay
   * attention to the <b>result</b>, <b>resultCorrected</b> and <b>suggestions</b> in the
   * response.<br><br> Always check <b>result.proposal</b> in the response for a proposed solution
   * by Foxentry how you should process the response in your form or application.
   *
   * @param requestBody
   * @param foxentryIncludeRequestDetails Parameter to add details of your request.
   * @return ValidateCompanyData Successful response
   */
  suspend fun validateCompanyData(
      requestBody: ValidateCompanyDataRequestBody?,
      foxentryIncludeRequestDetails: Boolean?
  ): ValidateCompanyDataResponseWrapper {
    val response =
        httpClient.request(config.url + "/company/validate") {
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
    return ValidateCompanyDataResponseWrapper(
        status = response.status,
        headers =
            ValidateCompanyDataHeaders(
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
   * Search company This enpoint mainly serves as <b>autocomplete</b> but can be used to search for
   * specific companies based on filter criteria as well. Foxentry will automatically offer you
   * suggestions to complete the company you are writing down. <br><br>Pay attention to the
   * <b>client</b> section in the request body. You can specify the user's location in order to
   * receive more relevant suggestions.
   *
   * @param requestBody
   * @param foxentryIncludeRequestDetails Parameter to add details of your request.
   * @return CompanySearch Successful response
   */
  suspend fun companySearch(
      requestBody: CompanySearchRequestBody?,
      foxentryIncludeRequestDetails: Boolean?
  ): CompanySearchResponseWrapper {
    val response =
        httpClient.request(config.url + "/company/search") {
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
    return CompanySearchResponseWrapper(
        status = response.status,
        headers =
            CompanySearchHeaders(
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
   * Get company data Foxentry allows you to get information about company based on the
   * <b>dataScope</b> option. <b>Country</b> and <b>registrationNumber</b> parameters are required.
   *
   * @param requestBody
   * @param foxentryIncludeRequestDetails Parameter to add details of your request.
   * @return GetCompanyData Successful response
   */
  suspend fun getCompanyData(
      requestBody: GetCompanyDataRequestBody?,
      foxentryIncludeRequestDetails: Boolean?
  ): GetCompanyDataResponseWrapper {
    val response =
        httpClient.request(config.url + "/company/get") {
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
    return GetCompanyDataResponseWrapper(
        status = response.status,
        headers =
            GetCompanyDataHeaders(
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

data class ValidateCompanyDataHeaders(
    val foxentryApiVersion: String?,
    val foxentryDailyCreditsLeft: Double?,
    val foxentryDailyCreditsLimit: Double?,
    val foxentryRateLimit: Int?,
    val foxentryRateLimitPeriod: Int?,
    val foxentryRateLimitRemaining: Int?
)

data class ValidateCompanyDataResponseWrapper(
    val status: HttpStatusCode,
    val headers: ValidateCompanyDataHeaders,
    val body: ValidateCompanyDataResp
)

data class ValidateCompanyDataRequestBody(val request: ValidateCompanyDataRequest)

class ValidateCompanyDataRespDeserializer :
    StdDeserializer<ValidateCompanyDataResp>(ValidateCompanyDataResp::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): ValidateCompanyDataResp {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null

    try {
      return ValidateCompanyDataResp.ValidateCompanyData(
          mapper.convertValue(node, ValidateCompanyData::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResp.Error400(mapper.convertValue(node, Error400::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResp.Error401(mapper.convertValue(node, Error401::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResp.Error402(mapper.convertValue(node, Error402::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResp.Error403(mapper.convertValue(node, Error403::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResp.Error404(mapper.convertValue(node, Error404::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResp.Error405(mapper.convertValue(node, Error405::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResp.Error429(mapper.convertValue(node, Error429::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResp.Error500(mapper.convertValue(node, Error500::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResp.Error503(mapper.convertValue(node, Error503::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }

    throw firstError!!
  }
}

@JsonDeserialize(using = ValidateCompanyDataRespDeserializer::class)
sealed interface ValidateCompanyDataResp {
  data class ValidateCompanyData(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ValidateCompanyData
  ) : com.foxentry.foxentrysdk.models.ValidateCompanyData by _0, ValidateCompanyDataResp

  data class Error400(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400) :
      com.foxentry.foxentrysdk.models.Error400 by _0, ValidateCompanyDataResp

  data class Error401(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error401) :
      com.foxentry.foxentrysdk.models.Error401 by _0, ValidateCompanyDataResp

  data class Error402(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error402) :
      com.foxentry.foxentrysdk.models.Error402 by _0, ValidateCompanyDataResp

  data class Error403(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403) :
      com.foxentry.foxentrysdk.models.Error403 by _0, ValidateCompanyDataResp

  data class Error404(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error404) :
      com.foxentry.foxentrysdk.models.Error404 by _0, ValidateCompanyDataResp

  data class Error405(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error405) :
      com.foxentry.foxentrysdk.models.Error405 by _0, ValidateCompanyDataResp

  data class Error429(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429) :
      com.foxentry.foxentrysdk.models.Error429 by _0, ValidateCompanyDataResp

  data class Error500(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500) :
      com.foxentry.foxentrysdk.models.Error500 by _0, ValidateCompanyDataResp

  data class Error503(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error503) :
      com.foxentry.foxentrysdk.models.Error503 by _0, ValidateCompanyDataResp
}

data class CompanySearchHeaders(
    val foxentryApiVersion: String?,
    val foxentryDailyCreditsLeft: Double?,
    val foxentryDailyCreditsLimit: Double?,
    val foxentryRateLimit: Int?,
    val foxentryRateLimitPeriod: Int?,
    val foxentryRateLimitRemaining: Int?
)

data class CompanySearchResponseWrapper(
    val status: HttpStatusCode,
    val headers: CompanySearchHeaders,
    val body: CompanySearchResp
)

data class CompanySearchRequestBody(val request: CompanySearchRequest)

class CompanySearchRespDeserializer :
    StdDeserializer<CompanySearchResp>(CompanySearchResp::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): CompanySearchResp {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null

    try {
      return CompanySearchResp.CompanySearch(mapper.convertValue(node, CompanySearch::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return CompanySearchResp.Error400(mapper.convertValue(node, Error400::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return CompanySearchResp.Error401(mapper.convertValue(node, Error401::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return CompanySearchResp.Error402(mapper.convertValue(node, Error402::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return CompanySearchResp.Error403(mapper.convertValue(node, Error403::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return CompanySearchResp.Error404(mapper.convertValue(node, Error404::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return CompanySearchResp.Error405(mapper.convertValue(node, Error405::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return CompanySearchResp.Error429(mapper.convertValue(node, Error429::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return CompanySearchResp.Error500(mapper.convertValue(node, Error500::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return CompanySearchResp.Error503(mapper.convertValue(node, Error503::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }

    throw firstError!!
  }
}

@JsonDeserialize(using = CompanySearchRespDeserializer::class)
sealed interface CompanySearchResp {
  data class CompanySearch(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.CompanySearch) :
      com.foxentry.foxentrysdk.models.CompanySearch by _0, CompanySearchResp

  data class Error400(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400) :
      com.foxentry.foxentrysdk.models.Error400 by _0, CompanySearchResp

  data class Error401(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error401) :
      com.foxentry.foxentrysdk.models.Error401 by _0, CompanySearchResp

  data class Error402(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error402) :
      com.foxentry.foxentrysdk.models.Error402 by _0, CompanySearchResp

  data class Error403(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403) :
      com.foxentry.foxentrysdk.models.Error403 by _0, CompanySearchResp

  data class Error404(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error404) :
      com.foxentry.foxentrysdk.models.Error404 by _0, CompanySearchResp

  data class Error405(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error405) :
      com.foxentry.foxentrysdk.models.Error405 by _0, CompanySearchResp

  data class Error429(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429) :
      com.foxentry.foxentrysdk.models.Error429 by _0, CompanySearchResp

  data class Error500(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500) :
      com.foxentry.foxentrysdk.models.Error500 by _0, CompanySearchResp

  data class Error503(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error503) :
      com.foxentry.foxentrysdk.models.Error503 by _0, CompanySearchResp
}

data class GetCompanyDataHeaders(
    val foxentryApiVersion: String?,
    val foxentryDailyCreditsLeft: Double?,
    val foxentryDailyCreditsLimit: Double?,
    val foxentryRateLimit: Int?,
    val foxentryRateLimitPeriod: Int?,
    val foxentryRateLimitRemaining: Int?
)

data class GetCompanyDataResponseWrapper(
    val status: HttpStatusCode,
    val headers: GetCompanyDataHeaders,
    val body: GetCompanyDataResp
)

data class GetCompanyDataRequestBody(val request: GetCompanyDataRequest)

class GetCompanyDataRespDeserializer :
    StdDeserializer<GetCompanyDataResp>(GetCompanyDataResp::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): GetCompanyDataResp {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null

    try {
      return GetCompanyDataResp.GetCompanyData(
          mapper.convertValue(node, GetCompanyData::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return GetCompanyDataResp.Error400(mapper.convertValue(node, Error400::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return GetCompanyDataResp.Error401(mapper.convertValue(node, Error401::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return GetCompanyDataResp.Error402(mapper.convertValue(node, Error402::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return GetCompanyDataResp.Error403(mapper.convertValue(node, Error403::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return GetCompanyDataResp.Error404(mapper.convertValue(node, Error404::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return GetCompanyDataResp.Error405(mapper.convertValue(node, Error405::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return GetCompanyDataResp.Error429(mapper.convertValue(node, Error429::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return GetCompanyDataResp.Error500(mapper.convertValue(node, Error500::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return GetCompanyDataResp.Error503(mapper.convertValue(node, Error503::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }

    throw firstError!!
  }
}

@JsonDeserialize(using = GetCompanyDataRespDeserializer::class)
sealed interface GetCompanyDataResp {
  data class GetCompanyData(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.GetCompanyData) :
      com.foxentry.foxentrysdk.models.GetCompanyData by _0, GetCompanyDataResp

  data class Error400(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400) :
      com.foxentry.foxentrysdk.models.Error400 by _0, GetCompanyDataResp

  data class Error401(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error401) :
      com.foxentry.foxentrysdk.models.Error401 by _0, GetCompanyDataResp

  data class Error402(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error402) :
      com.foxentry.foxentrysdk.models.Error402 by _0, GetCompanyDataResp

  data class Error403(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403) :
      com.foxentry.foxentrysdk.models.Error403 by _0, GetCompanyDataResp

  data class Error404(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error404) :
      com.foxentry.foxentrysdk.models.Error404 by _0, GetCompanyDataResp

  data class Error405(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error405) :
      com.foxentry.foxentrysdk.models.Error405 by _0, GetCompanyDataResp

  data class Error429(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429) :
      com.foxentry.foxentrysdk.models.Error429 by _0, GetCompanyDataResp

  data class Error500(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500) :
      com.foxentry.foxentrysdk.models.Error500 by _0, GetCompanyDataResp

  data class Error503(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error503) :
      com.foxentry.foxentrysdk.models.Error503 by _0, GetCompanyDataResp
}
