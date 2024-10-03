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

@JsonDeserialize(`as` = CompanySearchRequestImpl::class)
interface CompanySearchRequest {
  val customId: String?
  val query: CompanySearchRequestQuery
  val options: CompanySearchRequestOptions?
  val client: ClientRequest?
}

data class CompanySearchRequestImpl(
    override val customId: String?,
    override val query: CompanySearchRequestQuery,
    override val options: CompanySearchRequestOptions?,
    override val client: ClientRequest?,
) : CompanySearchRequest

@JsonDeserialize(`as` = CompanySearchRequestQueryImpl::class)
interface CompanySearchRequestQuery {
  val type: CompanySearchRequestQueryType
  val value: String
  val filter: CompanySearchRequestQueryFilter?
}

data class CompanySearchRequestQueryImpl(
    override val type: CompanySearchRequestQueryType,
    override val value: String,
    override val filter: CompanySearchRequestQueryFilter?,
) : CompanySearchRequestQuery
/** Type of search. */
enum class CompanySearchRequestQueryType(@JsonValue val value: String) {
  NAME("name"),
  REGISTRATION_NUMBER("registrationNumber"),
  TAX_NUMBER("taxNumber"),
  VAT_NUMBER("vatNumber"),
}
/**
 * Additional filter in order to specify the search results. You can for example set as a filter
 * country CZ, so the the search engine would look for the companies only in the Czech republic. Pay
 * attention to the options, which determines how the filter should behave.
 */
@JsonDeserialize(`as` = CompanySearchRequestQueryFilterImpl::class)
interface CompanySearchRequestQueryFilter {
  val name: String?
  val country: String?
  val registrationNumber: String?
  val taxNumber: String?
  val vatNumber: String?
}

data class CompanySearchRequestQueryFilterImpl(
    override val name: String?,
    override val country: String?,
    override val registrationNumber: String?,
    override val taxNumber: String?,
    override val vatNumber: String?,
) : CompanySearchRequestQueryFilter
/** Query options. */
@JsonDeserialize(`as` = CompanySearchRequestOptionsImpl::class)
interface CompanySearchRequestOptions {
  val dataScope: CompanySearchRequestOptionsDataScope?
  val dataSource: List<String?>?
  val resultsLimit: Int?
  val includeTerminatedSubjects: Boolean?
  val filterMode: CompanySearchRequestOptionsFilterMode?
  val filterAcceptFormat: Boolean?
  val filterAcceptAlternatives: Boolean?
  val filterExactMatch: Boolean?
  val zipFormat: Boolean?
  val cityFormat: CompanySearchRequestOptionsCityFormat?
  val countryFormat: CompanySearchRequestOptionsCountryFormat?
}

data class CompanySearchRequestOptionsImpl(
    override val dataScope: CompanySearchRequestOptionsDataScope?,
    override val dataSource: List<String?>?,
    override val resultsLimit: Int?,
    override val includeTerminatedSubjects: Boolean?,
    override val filterMode: CompanySearchRequestOptionsFilterMode?,
    override val filterAcceptFormat: Boolean?,
    override val filterAcceptAlternatives: Boolean?,
    override val filterExactMatch: Boolean?,
    override val zipFormat: Boolean?,
    override val cityFormat: CompanySearchRequestOptionsCityFormat?,
    override val countryFormat: CompanySearchRequestOptionsCountryFormat?,
) : CompanySearchRequestOptions
/** Data scope of returned data. */
enum class CompanySearchRequestOptionsDataScope(@JsonValue val value: String) {
  BASIC("basic"),
  EXTENDED("extended"),
  FULL("full"),
}
/**
 * <b>Prefer</b> = prefer results matching the filter parameters, <b>limit</b> = limit to results
 * matching the filter parameters.
 */
enum class CompanySearchRequestOptionsFilterMode(@JsonValue val value: String?) {
  LIMIT("limit"),
  PREFER("prefer"),
}
/**
 * This option determines the format in which the city is returned. <b>Minimal</b> = Praha,
 * <b>basic</b> = Praha 8, <b>extended</b> = Praha 8 - Karlín.
 */
enum class CompanySearchRequestOptionsCityFormat(@JsonValue val value: String) {
  MINIMAL("minimal"),
  BASIC("basic"),
  EXTENDED("extended"),
}
/**
 * This option determines the format in which the country is returned. Choices include local and
 * international variants with their shortened counterparts as well as ISO 3166 alpha codes.
 */
enum class CompanySearchRequestOptionsCountryFormat(@JsonValue val value: String) {
  ALPHA2("alpha2"),
  ALPHA3("alpha3"),
  LOCAL("local"),
  LOCAL_SHORTENED("localShortened"),
  INTERNATIONAL("international"),
  INTERNATIONAL_SHORTENED("internationalShortened"),
}
