/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.services

import com.foxentry.foxentrysdk.core.*
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.mock.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import java.net.URLEncoder

class MockedHttpRequest(private val config: Config) {
  private val client: HttpClient

  init {
    client =
        HttpClient(MockEngine) {
          engine {
            addHandler { request ->
              // Here you can mock responses based on the request
              respond(
                  content = "Mocked response",
                  status = HttpStatusCode.OK,
                  headers = headersOf(HttpHeaders.ContentType, "application/json"))
            }
          }
        }
  }

  companion object {
    fun buildPath(
        path: String,
        pathParams: Map<String, Any?>?,
        queryParams: Map<String, Any?>?
    ): String {
      var uri = path

      pathParams?.forEach { (key, value) -> uri = uri.replace("{$key}", value.toString()) }

      if (!queryParams.isNullOrEmpty()) {
        val queryString =
            queryParams.entries.joinToString("&") { (key, value) ->
              "${URLEncoder.encode(key, "UTF-8")}=${URLEncoder.encode(value.toString(), "UTF-8")}"
            }
        uri += "?$queryString"
      }

      return uri
    }

    fun joinUrl(basePath: String, path: String): String {
      val trimmedBasePath = basePath.trimEnd('/')
      val trimmedPath = path.trimStart('/')
      return "$trimmedBasePath/$trimmedPath"
    }
  }
}
