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

@JsonDeserialize(`as` = ValidateCompanyDataRequestImpl::class)
interface ValidateCompanyDataRequest {
  val customId: String?
  val query: ValidateCompanyDataRequestQuery
  val options: ValidateCompanyDataRequestOptions?
  val client: ClientRequest?
}

data class ValidateCompanyDataRequestImpl(
    override val customId: String?,
    override val query: ValidateCompanyDataRequestQuery,
    override val options: ValidateCompanyDataRequestOptions?,
    override val client: ClientRequest?,
) : ValidateCompanyDataRequest

@JsonDeserialize(`as` = ValidateCompanyDataRequestQueryImpl::class)
interface ValidateCompanyDataRequestQuery {
  val name: String?
  val country: String?
  val registrationNumber: String?
  val taxNumber: String?
  val vatNumber: String?
}

data class ValidateCompanyDataRequestQueryImpl(
    override val name: String?,
    override val country: String?,
    override val registrationNumber: String?,
    override val taxNumber: String?,
    override val vatNumber: String?,
) : ValidateCompanyDataRequestQuery
/** Query options. */
@JsonDeserialize(`as` = ValidateCompanyDataRequestOptionsImpl::class)
interface ValidateCompanyDataRequestOptions {
  val dataScope: ValidateCompanyDataRequestOptionsDataScope?
  val dataSource: List<String?>?
  val resultsLimit: Int?
  val includeTerminatedSubjects: Boolean?
  val zipFormat: Boolean?
  val cityFormat: ValidateCompanyDataRequestOptionsCityFormat?
  val countryFormat: ValidateCompanyDataRequestOptionsCountryFormat?
}

data class ValidateCompanyDataRequestOptionsImpl(
    override val dataScope: ValidateCompanyDataRequestOptionsDataScope?,
    override val dataSource: List<String?>?,
    override val resultsLimit: Int?,
    override val includeTerminatedSubjects: Boolean?,
    override val zipFormat: Boolean?,
    override val cityFormat: ValidateCompanyDataRequestOptionsCityFormat?,
    override val countryFormat: ValidateCompanyDataRequestOptionsCountryFormat?,
) : ValidateCompanyDataRequestOptions
/** Data scope of returned data. */
enum class ValidateCompanyDataRequestOptionsDataScope(@JsonValue val value: String) {
  BASIC("basic"),
  EXTENDED("extended"),
  FULL("full"),
}
/**
 * This option determines the format in which the city is returned. <b>Minimal</b> = Praha,
 * <b>basic</b> = Praha 8, <b>extended</b> = Praha 8 - Karlín.
 */
enum class ValidateCompanyDataRequestOptionsCityFormat(@JsonValue val value: String) {
  MINIMAL("minimal"),
  BASIC("basic"),
  EXTENDED("extended"),
}
/**
 * This option determines the format in which the country is returned. Choices include local and
 * international variants with their shortened counterparts as well as ISO 3166 alpha codes.
 */
enum class ValidateCompanyDataRequestOptionsCountryFormat(@JsonValue val value: String) {
  ALPHA2("alpha2"),
  ALPHA3("alpha3"),
  LOCAL("local"),
  LOCAL_SHORTENED("localShortened"),
  INTERNATIONAL("international"),
  INTERNATIONAL_SHORTENED("internationalShortened"),
}
