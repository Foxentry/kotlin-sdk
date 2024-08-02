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

@JsonDeserialize(`as` = ValidatePhoneNumberDataImpl::class)
interface ValidatePhoneNumberData {
  val country: ValidatePhoneNumberDataCountry
  val prefix: String?
  val number: String?
  val numberWithPrefix: String?
  val carrier: ValidatePhoneNumberDataCarrier
  val format: ValidatePhoneNumberDataFormat
}

data class ValidatePhoneNumberDataImpl(
    override val country: ValidatePhoneNumberDataCountry,
    override val prefix: String?,
    override val number: String?,
    override val numberWithPrefix: String?,
    override val carrier: ValidatePhoneNumberDataCarrier,
    override val format: ValidatePhoneNumberDataFormat,
) : ValidatePhoneNumberData

@JsonDeserialize(`as` = ValidatePhoneNumberDataCountryImpl::class)
interface ValidatePhoneNumberDataCountry {
  val code: String?
  val prefix: String?
}

data class ValidatePhoneNumberDataCountryImpl(
    override val code: String?,
    override val prefix: String?,
) : ValidatePhoneNumberDataCountry
/** Phone carrier information. */
@JsonDeserialize(`as` = ValidatePhoneNumberDataCarrierImpl::class)
interface ValidatePhoneNumberDataCarrier {
  val name: String?
  val type: ValidatePhoneNumberDataCarrierType?
}

data class ValidatePhoneNumberDataCarrierImpl(
    override val name: String?,
    override val type: ValidatePhoneNumberDataCarrierType?,
) : ValidatePhoneNumberDataCarrier
/** Type of carrier. */
enum class ValidatePhoneNumberDataCarrierType(@JsonValue val value: String?) {
  LANDLINE("landline"),
  MOBILE("mobile"),
  VOIP("voip"),
  NULL(null),
}
/** Standardized international and local format. */
@JsonDeserialize(`as` = ValidatePhoneNumberDataFormatImpl::class)
interface ValidatePhoneNumberDataFormat {
  val national: String?
  val nationalFormatted: String?
  val international: String?
  val internationalFormatted: String?
}

data class ValidatePhoneNumberDataFormatImpl(
    override val national: String?,
    override val nationalFormatted: String?,
    override val international: String?,
    override val internationalFormatted: String?,
) : ValidatePhoneNumberDataFormat
