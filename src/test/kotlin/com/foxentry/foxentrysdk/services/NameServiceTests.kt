/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.services

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.foxentry.foxentrysdk.core.*
import com.foxentry.foxentrysdk.models.*
import io.dxheroes.foxentrysdk.services.NameService.*
import io.ktor.client.*
import io.ktor.client.engine.mock.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.http.*
import io.ktor.serialization.jackson.*
import java.io.File
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.*

class NameServiceTest {
  private val objectMapper = jacksonObjectMapper()
  private val testFile =
      File("src/test/kotlin/io/dxheroes/foxentrysdk/services/NameServiceTests.json")
  private val config = Config(url = "http://localhost:8080", token = "test-token")

  @Test
  fun `test nameValidation`() {
    val rootNode = objectMapper.readTree(testFile)
    val responseNode = rootNode.get("nameValidation")

    val expectedResponseBody =
        objectMapper.treeToValue(responseNode, NameValidationResp::class.java)

    val responseHeaders =
        headersOf(
            "Content-Type" to listOf("application/json"),
            "foxentry-api-version" to listOf("2.0"),
            "foxentry-daily-credits-left" to listOf(9881.64.toString()),
            "foxentry-daily-credits-limit" to listOf(1000.toDouble().toString()),
            "foxentry-rate-limit" to listOf(5000.toString()),
            "foxentry-rate-limit-period" to listOf(900.toString()),
            "foxentry-rate-limit-remaining" to listOf(4999.toString()),
        )

    val mockEngine = MockEngine { request ->
      val responseBody = objectMapper.writeValueAsString(expectedResponseBody)
      respond(content = responseBody, status = HttpStatusCode.OK, headers = responseHeaders)
    }

    val client = HttpClient(mockEngine) { install(ContentNegotiation) { jackson {} } }

    val service = NameService(config, client)

    val result: NameValidationResponseWrapper = runBlocking {
      service.nameValidation(requestBody = null, foxentryIncludeRequestDetails = null)
    }

    Assertions.assertNotNull(result.body)
    Assertions.assertEquals(expectedResponseBody, result.body)
    Assertions.assertEquals("2.0", result.headers.foxentryApiVersion)
    Assertions.assertEquals(9881.64, result.headers.foxentryDailyCreditsLeft)
    Assertions.assertEquals(1000.toDouble(), result.headers.foxentryDailyCreditsLimit)
    Assertions.assertEquals(5000, result.headers.foxentryRateLimit)
    Assertions.assertEquals(900, result.headers.foxentryRateLimitPeriod)
    Assertions.assertEquals(4999, result.headers.foxentryRateLimitRemaining)
  }
}
