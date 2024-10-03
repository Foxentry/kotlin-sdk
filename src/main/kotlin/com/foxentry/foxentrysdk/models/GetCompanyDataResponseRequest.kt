/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.models

import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.foxentry.foxentrysdk.core.*

@JsonDeserialize(`as` = GetCompanyDataResponseRequestImpl::class)
interface GetCompanyDataResponseRequest {
  val endpoint: String
  val code: String
  val customId: String?
  val query: GetCompanyDataResponseRequestQuery?
  val options: GetCompanyDataResponseRequestOptions?
  val client: ClientRequest?
}

data class GetCompanyDataResponseRequestImpl(
    override val endpoint: String,
    override val code: String,
    override val customId: String?,
    override val query: GetCompanyDataResponseRequestQuery?,
    override val options: GetCompanyDataResponseRequestOptions?,
    override val client: ClientRequest?,
) : GetCompanyDataResponseRequest

@JsonDeserialize(`as` = GetCompanyDataResponseRequestQueryImpl::class)
interface GetCompanyDataResponseRequestQuery {
  val country: String?
  val registrationNumber: Any?
}

data class GetCompanyDataResponseRequestQueryImpl(
    override val country: String?,
    override val registrationNumber: Any?,
) : GetCompanyDataResponseRequestQuery

/** Query options. */
@JsonDeserialize(`as` = GetCompanyDataResponseRequestOptionsImpl::class)
interface GetCompanyDataResponseRequestOptions {
  val dataScope: GetCompanyDataResponseRequestOptionsDataScope?
  val dataSource: List<String?>?
  val includeTerminatedSubjects: Boolean?
  val zipFormat: Boolean?
  val cityFormat: GetCompanyDataResponseRequestOptionsCityFormat?
  val countryFormat: GetCompanyDataResponseRequestOptionsCountryFormat?
}

data class GetCompanyDataResponseRequestOptionsImpl(
    override val dataScope: GetCompanyDataResponseRequestOptionsDataScope?,
    override val dataSource: List<String?>?,
    override val includeTerminatedSubjects: Boolean?,
    override val zipFormat: Boolean?,
    override val cityFormat: GetCompanyDataResponseRequestOptionsCityFormat?,
    override val countryFormat: GetCompanyDataResponseRequestOptionsCountryFormat?,
) : GetCompanyDataResponseRequestOptions
/** Data scope of returned data. */
enum class GetCompanyDataResponseRequestOptionsDataScope(@JsonValue val value: String) {
  BASIC("basic"),
  EXTENDED("extended"),
  FULL("full"),
}
/**
 * This option determines the format in which the city is returned. <b>Minimal</b> = Praha,
 * <b>basic</b> = Praha 8, <b>extended</b> = Praha 8 - Karlín.
 */
enum class GetCompanyDataResponseRequestOptionsCityFormat(@JsonValue val value: String) {
  MINIMAL("minimal"),
  BASIC("basic"),
  EXTENDED("extended"),
}
/**
 * This option determines the format in which the country is returned. Choices include local and
 * international variants with their shortened counterparts as well as ISO 3166 alpha codes.
 */
enum class GetCompanyDataResponseRequestOptionsCountryFormat(@JsonValue val value: String) {
  ALPHA2("alpha2"),
  ALPHA3("alpha3"),
  LOCAL("local"),
  LOCAL_SHORTENED("localShortened"),
  INTERNATIONAL("international"),
  INTERNATIONAL_SHORTENED("internationalShortened"),
}
