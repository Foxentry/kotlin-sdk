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

class LocationService(
    val config: Config,
    val httpClient: HttpClient = HttpClient { install(ContentNegotiation) { jackson() } }
) {
  /**
   * Validate location data This endpoint requires at least 1 query parameter and will check if the
   * parameters and their combinations are valid. Returns information about the location based on
   * the datascope set in the options.<br><br> Foxentry validator is able not only to evaluate the
   * validity of the inputed information but it also can fix various typos, errors and missing data.
   * Foxentry can also suggest more suitable alternatives to the data sent in query. Please pay
   * attention to the <b>result</b>, <b>resultCorrected</b> and <b>suggestions</b> in the
   * response.<br><br> Always check <b>result.proposal</b> in the response for a proposed solution
   * by Foxentry how you should process the response in your form or application.
   *
   * @param requestBody
   * @param foxentryIncludeRequestDetails Parameter to add details of your request.
   * @return LocationValidation Successful response
   */
  suspend fun locationValidation(
      requestBody: LocationValidationRequestBody?,
      foxentryIncludeRequestDetails: Boolean?
  ): LocationValidationResponseWrapper {
    val response =
        httpClient.request(config.url + "/location/validate") {
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
    return LocationValidationResponseWrapper(
        status = response.status,
        headers =
            LocationValidationHeaders(
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
   * Search location This enpoint mainly serves as <b>autocomplete</b> but can be used to search for
   * specific addresses based on filter criteria as well. Foxentry will automatically offer you
   * suggestions to complete the address you are writing down. <br><br>Pay attention to the
   * <b>client</b> section in the request body. You can specify the user's location in order to
   * receive more relevant suggestions.
   *
   * @param requestBody
   * @param foxentryIncludeRequestDetails Parameter to add details of your request.
   * @return LocationSearch Successful response
   */
  suspend fun locationSearch(
      requestBody: LocationSearchRequestBody?,
      foxentryIncludeRequestDetails: Boolean?
  ): LocationSearchResponseWrapper {
    val response =
        httpClient.request(config.url + "/location/search") {
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
    return LocationSearchResponseWrapper(
        status = response.status,
        headers =
            LocationSearchHeaders(
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
   * Get location data Foxentry allows you to get information about location based on the
   * <b>dataScope</b> option. <b>Country</b> and <b>ID</b> parameters are required. You can either
   * choose internal ID, which is assigned by Foxentry or external ID from the data source. <b>CZ
   * external</b> = RUIAN, <b>PL external</b> = Gov data, <b>SK external does not exist</b>.
   *
   * @param requestBody
   * @param foxentryIncludeRequestDetails Parameter to add details of your request.
   * @return LocationGet Successful response
   */
  suspend fun locationGet(
      requestBody: LocationGetRequestBody?,
      foxentryIncludeRequestDetails: Boolean?
  ): LocationGetResponseWrapper {
    val response =
        httpClient.request(config.url + "/location/get") {
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
    return LocationGetResponseWrapper(
        status = response.status,
        headers =
            LocationGetHeaders(
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
   * Localization Foxentry allows you to check an area with GPS radius in order to return all the
   * addresses within that area. It can also give you additional information about the addresses
   * based on the <b>dataScope</b> option.<br><br>Please pay attention to the
   * <b>singleLocationResultDistance</b> option, which determines the radius of the search area in
   * meters.<br><br>
   *
   * @param requestBody
   * @param foxentryIncludeRequestDetails Parameter to add details of your request.
   * @return LocationLocalization Successful response
   */
  suspend fun locationLocalization(
      requestBody: LocationLocalizationRequestBody?,
      foxentryIncludeRequestDetails: Boolean?
  ): LocationLocalizationResponseWrapper {
    val response =
        httpClient.request(config.url + "/location/localize") {
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
    return LocationLocalizationResponseWrapper(
        status = response.status,
        headers =
            LocationLocalizationHeaders(
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

data class LocationValidationHeaders(
    val foxentryApiVersion: String?,
    val foxentryDailyCreditsLeft: Double?,
    val foxentryDailyCreditsLimit: Double?,
    val foxentryRateLimit: Int?,
    val foxentryRateLimitPeriod: Int?,
    val foxentryRateLimitRemaining: Int?
)

data class LocationValidationResponseWrapper(
    val status: HttpStatusCode,
    val headers: LocationValidationHeaders,
    val body: LocationValidationResp
)

data class LocationValidationRequestBody(val request: LocationValidationRequest)

class LocationValidationRespDeserializer :
    StdDeserializer<LocationValidationResp>(LocationValidationResp::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): LocationValidationResp {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null

    try {
      return LocationValidationResp.LocationValidation(
          mapper.convertValue(node, LocationValidation::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResp.Error400(mapper.convertValue(node, Error400::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResp.Error401(mapper.convertValue(node, Error401::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResp.Error402(mapper.convertValue(node, Error402::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResp.Error403(mapper.convertValue(node, Error403::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResp.Error404(mapper.convertValue(node, Error404::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResp.Error405(mapper.convertValue(node, Error405::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResp.Error429(mapper.convertValue(node, Error429::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResp.Error500(mapper.convertValue(node, Error500::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResp.Error503(mapper.convertValue(node, Error503::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }

    throw firstError!!
  }
}

@JsonDeserialize(using = LocationValidationRespDeserializer::class)
sealed interface LocationValidationResp {
  data class LocationValidation(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.LocationValidation
  ) : com.foxentry.foxentrysdk.models.LocationValidation by _0, LocationValidationResp

  data class Error400(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400) :
      com.foxentry.foxentrysdk.models.Error400 by _0, LocationValidationResp

  data class Error401(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error401) :
      com.foxentry.foxentrysdk.models.Error401 by _0, LocationValidationResp

  data class Error402(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error402) :
      com.foxentry.foxentrysdk.models.Error402 by _0, LocationValidationResp

  data class Error403(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403) :
      com.foxentry.foxentrysdk.models.Error403 by _0, LocationValidationResp

  data class Error404(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error404) :
      com.foxentry.foxentrysdk.models.Error404 by _0, LocationValidationResp

  data class Error405(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error405) :
      com.foxentry.foxentrysdk.models.Error405 by _0, LocationValidationResp

  data class Error429(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429) :
      com.foxentry.foxentrysdk.models.Error429 by _0, LocationValidationResp

  data class Error500(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500) :
      com.foxentry.foxentrysdk.models.Error500 by _0, LocationValidationResp

  data class Error503(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error503) :
      com.foxentry.foxentrysdk.models.Error503 by _0, LocationValidationResp
}

data class LocationSearchHeaders(
    val foxentryApiVersion: String?,
    val foxentryDailyCreditsLeft: Double?,
    val foxentryDailyCreditsLimit: Double?,
    val foxentryRateLimit: Int?,
    val foxentryRateLimitPeriod: Int?,
    val foxentryRateLimitRemaining: Int?
)

data class LocationSearchResponseWrapper(
    val status: HttpStatusCode,
    val headers: LocationSearchHeaders,
    val body: LocationSearchResp
)

data class LocationSearchRequestBody(val request: LocationSearchRequest)

class LocationSearchRespDeserializer :
    StdDeserializer<LocationSearchResp>(LocationSearchResp::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): LocationSearchResp {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null

    try {
      return LocationSearchResp.LocationSearch(
          mapper.convertValue(node, LocationSearch::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationSearchResp.Error400(mapper.convertValue(node, Error400::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationSearchResp.Error401(mapper.convertValue(node, Error401::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationSearchResp.Error402(mapper.convertValue(node, Error402::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationSearchResp.Error403(mapper.convertValue(node, Error403::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationSearchResp.Error404(mapper.convertValue(node, Error404::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationSearchResp.Error405(mapper.convertValue(node, Error405::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationSearchResp.Error429(mapper.convertValue(node, Error429::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationSearchResp.Error500(mapper.convertValue(node, Error500::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationSearchResp.Error503(mapper.convertValue(node, Error503::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }

    throw firstError!!
  }
}

@JsonDeserialize(using = LocationSearchRespDeserializer::class)
sealed interface LocationSearchResp {
  data class LocationSearch(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.LocationSearch) :
      com.foxentry.foxentrysdk.models.LocationSearch by _0, LocationSearchResp

  data class Error400(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400) :
      com.foxentry.foxentrysdk.models.Error400 by _0, LocationSearchResp

  data class Error401(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error401) :
      com.foxentry.foxentrysdk.models.Error401 by _0, LocationSearchResp

  data class Error402(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error402) :
      com.foxentry.foxentrysdk.models.Error402 by _0, LocationSearchResp

  data class Error403(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403) :
      com.foxentry.foxentrysdk.models.Error403 by _0, LocationSearchResp

  data class Error404(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error404) :
      com.foxentry.foxentrysdk.models.Error404 by _0, LocationSearchResp

  data class Error405(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error405) :
      com.foxentry.foxentrysdk.models.Error405 by _0, LocationSearchResp

  data class Error429(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429) :
      com.foxentry.foxentrysdk.models.Error429 by _0, LocationSearchResp

  data class Error500(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500) :
      com.foxentry.foxentrysdk.models.Error500 by _0, LocationSearchResp

  data class Error503(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error503) :
      com.foxentry.foxentrysdk.models.Error503 by _0, LocationSearchResp
}

data class LocationGetHeaders(
    val foxentryApiVersion: String?,
    val foxentryDailyCreditsLeft: Double?,
    val foxentryDailyCreditsLimit: Double?,
    val foxentryRateLimit: Int?,
    val foxentryRateLimitPeriod: Int?,
    val foxentryRateLimitRemaining: Int?
)

data class LocationGetResponseWrapper(
    val status: HttpStatusCode,
    val headers: LocationGetHeaders,
    val body: LocationGetResp
)

data class LocationGetRequestBody(val request: LocationGetRequest)

class LocationGetRespDeserializer : StdDeserializer<LocationGetResp>(LocationGetResp::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): LocationGetResp {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null

    try {
      return LocationGetResp.LocationGet(mapper.convertValue(node, LocationGet::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationGetResp.Error400(mapper.convertValue(node, Error400::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationGetResp.Error401(mapper.convertValue(node, Error401::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationGetResp.Error402(mapper.convertValue(node, Error402::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationGetResp.Error403(mapper.convertValue(node, Error403::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationGetResp.Error404(mapper.convertValue(node, Error404::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationGetResp.Error405(mapper.convertValue(node, Error405::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationGetResp.Error429(mapper.convertValue(node, Error429::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationGetResp.Error500(mapper.convertValue(node, Error500::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationGetResp.Error503(mapper.convertValue(node, Error503::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }

    throw firstError!!
  }
}

@JsonDeserialize(using = LocationGetRespDeserializer::class)
sealed interface LocationGetResp {
  data class LocationGet(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.LocationGet) :
      com.foxentry.foxentrysdk.models.LocationGet by _0, LocationGetResp

  data class Error400(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400) :
      com.foxentry.foxentrysdk.models.Error400 by _0, LocationGetResp

  data class Error401(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error401) :
      com.foxentry.foxentrysdk.models.Error401 by _0, LocationGetResp

  data class Error402(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error402) :
      com.foxentry.foxentrysdk.models.Error402 by _0, LocationGetResp

  data class Error403(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403) :
      com.foxentry.foxentrysdk.models.Error403 by _0, LocationGetResp

  data class Error404(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error404) :
      com.foxentry.foxentrysdk.models.Error404 by _0, LocationGetResp

  data class Error405(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error405) :
      com.foxentry.foxentrysdk.models.Error405 by _0, LocationGetResp

  data class Error429(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429) :
      com.foxentry.foxentrysdk.models.Error429 by _0, LocationGetResp

  data class Error500(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500) :
      com.foxentry.foxentrysdk.models.Error500 by _0, LocationGetResp

  data class Error503(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error503) :
      com.foxentry.foxentrysdk.models.Error503 by _0, LocationGetResp
}

data class LocationLocalizationHeaders(
    val foxentryApiVersion: String?,
    val foxentryDailyCreditsLeft: Double?,
    val foxentryDailyCreditsLimit: Double?,
    val foxentryRateLimit: Int?,
    val foxentryRateLimitPeriod: Int?,
    val foxentryRateLimitRemaining: Int?
)

data class LocationLocalizationResponseWrapper(
    val status: HttpStatusCode,
    val headers: LocationLocalizationHeaders,
    val body: LocationLocalizationResp
)

data class LocationLocalizationRequestBody(val request: LocationLocalizationRequest)

class LocationLocalizationRespDeserializer :
    StdDeserializer<LocationLocalizationResp>(LocationLocalizationResp::class.java) {
  override fun deserialize(p: JsonParser?, ctx: DeserializationContext?): LocationLocalizationResp {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null

    try {
      return LocationLocalizationResp.LocationLocalization(
          mapper.convertValue(node, LocationLocalization::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationLocalizationResp.Error400(mapper.convertValue(node, Error400::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationLocalizationResp.Error401(mapper.convertValue(node, Error401::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationLocalizationResp.Error402(mapper.convertValue(node, Error402::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationLocalizationResp.Error403(mapper.convertValue(node, Error403::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationLocalizationResp.Error404(mapper.convertValue(node, Error404::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationLocalizationResp.Error405(mapper.convertValue(node, Error405::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationLocalizationResp.Error429(mapper.convertValue(node, Error429::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationLocalizationResp.Error500(mapper.convertValue(node, Error500::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationLocalizationResp.Error503(mapper.convertValue(node, Error503::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }

    throw firstError!!
  }
}

@JsonDeserialize(using = LocationLocalizationRespDeserializer::class)
sealed interface LocationLocalizationResp {
  data class LocationLocalization(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.LocationLocalization
  ) : com.foxentry.foxentrysdk.models.LocationLocalization by _0, LocationLocalizationResp

  data class Error400(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error400) :
      com.foxentry.foxentrysdk.models.Error400 by _0, LocationLocalizationResp

  data class Error401(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error401) :
      com.foxentry.foxentrysdk.models.Error401 by _0, LocationLocalizationResp

  data class Error402(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error402) :
      com.foxentry.foxentrysdk.models.Error402 by _0, LocationLocalizationResp

  data class Error403(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error403) :
      com.foxentry.foxentrysdk.models.Error403 by _0, LocationLocalizationResp

  data class Error404(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error404) :
      com.foxentry.foxentrysdk.models.Error404 by _0, LocationLocalizationResp

  data class Error405(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error405) :
      com.foxentry.foxentrysdk.models.Error405 by _0, LocationLocalizationResp

  data class Error429(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error429) :
      com.foxentry.foxentrysdk.models.Error429 by _0, LocationLocalizationResp

  data class Error500(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error500) :
      com.foxentry.foxentrysdk.models.Error500 by _0, LocationLocalizationResp

  data class Error503(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.Error503) :
      com.foxentry.foxentrysdk.models.Error503 by _0, LocationLocalizationResp
}
