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

@JsonDeserialize(`as` = CompanySearchResultsRequestImpl::class)
interface CompanySearchResultsRequest {
  val endpoint: String
  val code: String
  val customId: String?
  val query: CompanySearchResultsRequestQuery?
  val options: CompanySearchResultsRequestOptions?
  val client: ClientRequest?
}

data class CompanySearchResultsRequestImpl(
    override val endpoint: String,
    override val code: String,
    override val customId: String?,
    override val query: CompanySearchResultsRequestQuery?,
    override val options: CompanySearchResultsRequestOptions?,
    override val client: ClientRequest?,
) : CompanySearchResultsRequest

@JsonDeserialize(`as` = CompanySearchResultsRequestQueryImpl::class)
interface CompanySearchResultsRequestQuery {
  val type: CompanySearchResultsRequestQueryType?
  val value: String?
  val filter: CompanySearchResultsRequestQueryFilter?
}

data class CompanySearchResultsRequestQueryImpl(
    override val type: CompanySearchResultsRequestQueryType?,
    override val value: String?,
    override val filter: CompanySearchResultsRequestQueryFilter?,
) : CompanySearchResultsRequestQuery
/** Type of search. */
enum class CompanySearchResultsRequestQueryType(@JsonValue val value: String) {
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
@JsonDeserialize(`as` = CompanySearchResultsRequestQueryFilterImpl::class)
interface CompanySearchResultsRequestQueryFilter {
  val registrationNumber: String?
  val taxNumber: String?
  val vatNumber: String?
  val name: String?
  val country: String?
}

data class CompanySearchResultsRequestQueryFilterImpl(
    override val registrationNumber: String?,
    override val taxNumber: String?,
    override val vatNumber: String?,
    override val name: String?,
    override val country: String?,
) : CompanySearchResultsRequestQueryFilter
/** Query options. */
@JsonDeserialize(`as` = CompanySearchResultsRequestOptionsImpl::class)
interface CompanySearchResultsRequestOptions {
  val dataScope: CompanySearchResultsRequestOptionsDataScope?
  val dataSource: List<String?>?
  val resultsLimit: Int?
  val includeTerminatedSubjects: Boolean?
  val filterMode: CompanySearchResultsRequestOptionsFilterMode?
  val filterAcceptFormat: Boolean?
  val filterAcceptAlternatives: Boolean?
  val filterExactMatch: Boolean?
  val zipFormat: Boolean?
  val cityFormat: CompanySearchResultsRequestOptionsCityFormat?
  val countryFormat: CompanySearchResultsRequestOptionsCountryFormat?
  val legalFormType: CompanySearchResultsRequestOptionsLegalFormType?
}

data class CompanySearchResultsRequestOptionsImpl(
    override val dataScope: CompanySearchResultsRequestOptionsDataScope?,
    override val dataSource: List<String?>?,
    override val resultsLimit: Int?,
    override val includeTerminatedSubjects: Boolean?,
    override val filterMode: CompanySearchResultsRequestOptionsFilterMode?,
    override val filterAcceptFormat: Boolean?,
    override val filterAcceptAlternatives: Boolean?,
    override val filterExactMatch: Boolean?,
    override val zipFormat: Boolean?,
    override val cityFormat: CompanySearchResultsRequestOptionsCityFormat?,
    override val countryFormat: CompanySearchResultsRequestOptionsCountryFormat?,
    override val legalFormType: CompanySearchResultsRequestOptionsLegalFormType?,
) : CompanySearchResultsRequestOptions
/** Data scope of returned data. */
enum class CompanySearchResultsRequestOptionsDataScope(@JsonValue val value: String) {
  BASIC("basic"),
  EXTENDED("extended"),
  FULL("full"),
}
/**
 * <b>Prefer</b> = prefer results matching the filter parameters, <b>limit</b> = limit to results
 * matching the filter parameters.
 */
enum class CompanySearchResultsRequestOptionsFilterMode(@JsonValue val value: String?) {
  LIMIT("limit"),
  PREFER("prefer"),
}
/**
 * This option determines the format in which the city is returned. <b>Minimal</b> = Praha,
 * <b>basic</b> = Praha 8, <b>extended</b> = Praha 8 - Karlín.
 */
enum class CompanySearchResultsRequestOptionsCityFormat(@JsonValue val value: String) {
  MINIMAL("minimal"),
  BASIC("basic"),
  EXTENDED("extended"),
}
/**
 * This option determines the format in which the country is returned. Choices include local and
 * international variants with their shortened counterparts as well as ISO 3166 alpha codes.
 */
enum class CompanySearchResultsRequestOptionsCountryFormat(@JsonValue val value: String) {
  ALPHA2("alpha2"),
  ALPHA3("alpha3"),
  LOCAL("local"),
  LOCAL_SHORTENED("localShortened"),
  INTERNATIONAL("international"),
  INTERNATIONAL_SHORTENED("internationalShortened"),
}
/** This option filters results by the legal form type. */
enum class CompanySearchResultsRequestOptionsLegalFormType(@JsonValue val value: String?) {
  JURIDICAL("juridical"),
  PHYSICAL("physical"),
  ANY("any"),
}
