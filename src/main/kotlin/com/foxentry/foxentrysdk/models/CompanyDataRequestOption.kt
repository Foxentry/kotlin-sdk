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

/** Query options. */
@JsonDeserialize(`as` = CompanyDataRequestOptionImpl::class)
interface CompanyDataRequestOption {
  val dataScope: CompanyDataRequestOptionDataScope?
  val dataSource: List<String?>?
  val includeTerminatedSubjects: Boolean?
  val zipFormat: Boolean?
  val cityFormat: CompanyDataRequestOptionCityFormat?
  val countryFormat: CompanyDataRequestOptionCountryFormat?
}

data class CompanyDataRequestOptionImpl(
    override val dataScope: CompanyDataRequestOptionDataScope?,
    override val dataSource: List<String?>?,
    override val includeTerminatedSubjects: Boolean?,
    override val zipFormat: Boolean?,
    override val cityFormat: CompanyDataRequestOptionCityFormat?,
    override val countryFormat: CompanyDataRequestOptionCountryFormat?,
) : CompanyDataRequestOption
/** Data scope of returned data. */
enum class CompanyDataRequestOptionDataScope(@JsonValue val value: String) {
  BASIC("basic"),
  EXTENDED("extended"),
  FULL("full"),
}
/**
 * This option determines the format in which the city is returned. <b>Minimal</b> = Praha,
 * <b>basic</b> = Praha 8, <b>extended</b> = Praha 8 - Karlín.
 */
enum class CompanyDataRequestOptionCityFormat(@JsonValue val value: String) {
  MINIMAL("minimal"),
  BASIC("basic"),
  EXTENDED("extended"),
}
/**
 * This option determines the format in which the country is returned. Choices include local and
 * international variants with their shortened counterparts as well as ISO 3166 alpha codes.
 */
enum class CompanyDataRequestOptionCountryFormat(@JsonValue val value: String) {
  ALPHA2("alpha2"),
  ALPHA3("alpha3"),
  LOCAL("local"),
  LOCAL_SHORTENED("localShortened"),
  INTERNATIONAL("international"),
  INTERNATIONAL_SHORTENED("internationalShortened"),
}
