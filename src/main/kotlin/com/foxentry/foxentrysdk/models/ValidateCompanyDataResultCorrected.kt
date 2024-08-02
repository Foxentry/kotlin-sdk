/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.models

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.foxentry.foxentrysdk.core.*

@JsonDeserialize(`as` = ValidateCompanyDataResultCorrectedImpl::class)
interface ValidateCompanyDataResultCorrected : CompanyResultsResponseResults {
  val isValid: Boolean
  val errors: List<ValidateCompanyDataResultCorrectedErrors?>
  val fixes: List<ValidateCompanyDataResultCorrectedFixes?>
}

data class ValidateCompanyDataResultCorrectedImpl(
    override val isValid: Boolean,
    override val errors: List<ValidateCompanyDataResultCorrectedErrors?>,
    override val fixes: List<ValidateCompanyDataResultCorrectedFixes?>,
    override val data: CompanyResultsResponseResultsData
) : ValidateCompanyDataResultCorrected

class ValidateCompanyDataResultCorrectedErrorsDeserializer :
    StdDeserializer<ValidateCompanyDataResultCorrectedErrors>(
        ValidateCompanyDataResultCorrectedErrors::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): ValidateCompanyDataResultCorrectedErrors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return ValidateCompanyDataResultCorrectedErrors.ErrorSyntaxGlobal(
          mapper.convertValue(node, ErrorSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultCorrectedErrors.ErrorSyntaxCompany(
          mapper.convertValue(node, ErrorSyntaxCompany::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultCorrectedErrors.ErrorFormatGlobal(
          mapper.convertValue(node, ErrorFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultCorrectedErrors.ErrorValueGlobal(
          mapper.convertValue(node, ErrorValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = ValidateCompanyDataResultCorrectedErrorsDeserializer::class)
sealed interface ValidateCompanyDataResultCorrectedErrors {
  data class ErrorSyntaxGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal by _0,
      ValidateCompanyDataResultCorrectedErrors

  data class ErrorSyntaxCompany(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxCompany
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxCompany by _0,
      ValidateCompanyDataResultCorrectedErrors

  data class ErrorFormatGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorFormatGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorFormatGlobal by _0,
      ValidateCompanyDataResultCorrectedErrors

  data class ErrorValueGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorValueGlobal by _0,
      ValidateCompanyDataResultCorrectedErrors
}

class ValidateCompanyDataResultCorrectedFixesDeserializer :
    StdDeserializer<ValidateCompanyDataResultCorrectedFixes>(
        ValidateCompanyDataResultCorrectedFixes::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): ValidateCompanyDataResultCorrectedFixes {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return ValidateCompanyDataResultCorrectedFixes.FixFormatGlobal(
          mapper.convertValue(node, FixFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultCorrectedFixes.FixSyntaxGlobal(
          mapper.convertValue(node, FixSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultCorrectedFixes.FixSyntaxCompany(
          mapper.convertValue(node, FixSyntaxCompany::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultCorrectedFixes.FixValueGlobal(
          mapper.convertValue(node, FixValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = ValidateCompanyDataResultCorrectedFixesDeserializer::class)
sealed interface ValidateCompanyDataResultCorrectedFixes {
  data class FixFormatGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixFormatGlobal) :
      com.foxentry.foxentrysdk.models.FixFormatGlobal by _0,
      ValidateCompanyDataResultCorrectedFixes

  data class FixSyntaxGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxGlobal) :
      com.foxentry.foxentrysdk.models.FixSyntaxGlobal by _0,
      ValidateCompanyDataResultCorrectedFixes

  data class FixSyntaxCompany(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxCompany
  ) :
      com.foxentry.foxentrysdk.models.FixSyntaxCompany by _0,
      ValidateCompanyDataResultCorrectedFixes

  data class FixValueGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixValueGlobal) :
      com.foxentry.foxentrysdk.models.FixValueGlobal by _0, ValidateCompanyDataResultCorrectedFixes
}
