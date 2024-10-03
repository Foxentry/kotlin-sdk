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

@JsonDeserialize(`as` = ValidateCompanyDataResultsRequestImpl::class)
interface ValidateCompanyDataResultsRequest {
  val endpoint: String
  val code: String
  val customId: String?
  val query: ValidateCompanyDataResultsRequestQuery?
  val options: ValidateCompanyDataResultsRequestOptions?
  val client: ClientRequest?
}

data class ValidateCompanyDataResultsRequestImpl(
    override val endpoint: String,
    override val code: String,
    override val customId: String?,
    override val query: ValidateCompanyDataResultsRequestQuery?,
    override val options: ValidateCompanyDataResultsRequestOptions?,
    override val client: ClientRequest?,
) : ValidateCompanyDataResultsRequest

@JsonDeserialize(`as` = ValidateCompanyDataResultsRequestQueryImpl::class)
interface ValidateCompanyDataResultsRequestQuery {
  val name: String?
  val country: String?
  val registrationNumber: String?
  val taxNumber: String?
  val vatNumber: String?
}

data class ValidateCompanyDataResultsRequestQueryImpl(
    override val name: String?,
    override val country: String?,
    override val registrationNumber: String?,
    override val taxNumber: String?,
    override val vatNumber: String?,
) : ValidateCompanyDataResultsRequestQuery
/** Query options. */
@JsonDeserialize(`as` = ValidateCompanyDataResultsRequestOptionsImpl::class)
interface ValidateCompanyDataResultsRequestOptions {
  val dataScope: ValidateCompanyDataResultsRequestOptionsDataScope?
  val dataSource: List<String?>?
  val includeTerminatedSubjects: Boolean?
  val resultsLimit: Int?
  val zipFormat: Boolean?
  val cityFormat: ValidateCompanyDataResultsRequestOptionsCityFormat?
  val countryFormat: ValidateCompanyDataResultsRequestOptionsCountryFormat?
  val filterMode: ValidateCompanyDataResultsRequestOptionsFilterMode?
  val legalFormType: ValidateCompanyDataResultsRequestOptionsLegalFormType?
}

data class ValidateCompanyDataResultsRequestOptionsImpl(
    override val dataScope: ValidateCompanyDataResultsRequestOptionsDataScope?,
    override val dataSource: List<String?>?,
    override val includeTerminatedSubjects: Boolean?,
    override val resultsLimit: Int?,
    override val zipFormat: Boolean?,
    override val cityFormat: ValidateCompanyDataResultsRequestOptionsCityFormat?,
    override val countryFormat: ValidateCompanyDataResultsRequestOptionsCountryFormat?,
    override val filterMode: ValidateCompanyDataResultsRequestOptionsFilterMode?,
    override val legalFormType: ValidateCompanyDataResultsRequestOptionsLegalFormType?,
) : ValidateCompanyDataResultsRequestOptions
/** Data scope of returned data. */
enum class ValidateCompanyDataResultsRequestOptionsDataScope(@JsonValue val value: String) {
  BASIC("basic"),
  EXTENDED("extended"),
  FULL("full"),
}
/**
 * This option determines the format in which the city is returned. <b>Minimal</b> = Praha,
 * <b>basic</b> = Praha 8, <b>extended</b> = Praha 8 - Karlín.
 */
enum class ValidateCompanyDataResultsRequestOptionsCityFormat(@JsonValue val value: String) {
  MINIMAL("minimal"),
  BASIC("basic"),
  EXTENDED("extended"),
}
/**
 * This option determines the format in which the country is returned. Choices include local and
 * international variants with their shortened counterparts as well as ISO 3166 alpha codes.
 */
enum class ValidateCompanyDataResultsRequestOptionsCountryFormat(@JsonValue val value: String) {
  ALPHA2("alpha2"),
  ALPHA3("alpha3"),
  LOCAL("local"),
  LOCAL_SHORTENED("localShortened"),
  INTERNATIONAL("international"),
  INTERNATIONAL_SHORTENED("internationalShortened"),
}
/**
 * <b>Prefer</b> = prefer results matching the filter parameters, <b>limit</b> = limit to results
 * matching the filter parameters.
 */
enum class ValidateCompanyDataResultsRequestOptionsFilterMode(@JsonValue val value: String?) {
  LIMIT("limit"),
  PREFER("prefer"),
}
/** This option filters results by the legal form type. */
enum class ValidateCompanyDataResultsRequestOptionsLegalFormType(@JsonValue val value: String?) {
  JURIDICAL("juridical"),
  PHYSICAL("physical"),
  ANY("any"),
}
