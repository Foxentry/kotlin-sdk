/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.models

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import com.foxentry.foxentrysdk.core.*

@JsonDeserialize(`as` = ValidateCompanyDataResultsImpl::class)
interface ValidateCompanyDataResults {
  val result: ValidateCompanyDataResultsResult
  val resultCorrected: ValidateCompanyDataResultsResultCorrected?
  val suggestions: List<ValidateCompanyDataResultCorrected>
}

data class ValidateCompanyDataResultsImpl(
    override val result: ValidateCompanyDataResultsResult,
    override val resultCorrected: ValidateCompanyDataResultsResultCorrected?,
    override val suggestions: List<ValidateCompanyDataResultCorrected>,
) : ValidateCompanyDataResults
/** Evaluation of the sent query. */
@JsonDeserialize(`as` = ValidateCompanyDataResultsResultImpl::class)
interface ValidateCompanyDataResultsResult : CompanyResultsResponseResults {
  val isValid: Boolean?
  val proposal: ValidateCompanyDataResultsResultProposal?
  val errors: List<ValidateCompanyDataResultsResultErrors?>?
}

data class ValidateCompanyDataResultsResultImpl(
    override val isValid: Boolean?,
    override val proposal: ValidateCompanyDataResultsResultProposal?,
    override val errors: List<ValidateCompanyDataResultsResultErrors?>?,
    override val data: CompanyResultsResponseResultsData
) : ValidateCompanyDataResultsResult
/**
 * Proposed solution by Foxentry how you should process the response in your form or application.
 */
enum class ValidateCompanyDataResultsResultProposal(@JsonValue val value: String) {
  VALID("valid"),
  VALID_WITH_SUGGESTION("validWithSuggestion"),
  INVALID("invalid"),
  INVALID_WITH_CORRECTION("invalidWithCorrection"),
  INVALID_WITH_PARTIAL_CORRECTION("invalidWithPartialCorrection"),
  INVALID_WITH_SUGGESTION("invalidWithSuggestion"),
  INVALID_WITH_CORRECTION_WITH_SUGGESTION("invalidWithCorrectionWithSuggestion"),
}

class ValidateCompanyDataResultsResultErrorsDeserializer :
    StdDeserializer<ValidateCompanyDataResultsResultErrors>(
        ValidateCompanyDataResultsResultErrors::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): ValidateCompanyDataResultsResultErrors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return ValidateCompanyDataResultsResultErrors.ErrorSyntaxGlobal(
          mapper.convertValue(node, ErrorSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultsResultErrors.ErrorSyntaxCompany(
          mapper.convertValue(node, ErrorSyntaxCompany::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultsResultErrors.ErrorFormatGlobal(
          mapper.convertValue(node, ErrorFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultsResultErrors.ErrorValueGlobal(
          mapper.convertValue(node, ErrorValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = ValidateCompanyDataResultsResultErrorsDeserializer::class)
sealed interface ValidateCompanyDataResultsResultErrors {
  data class ErrorSyntaxGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal by _0,
      ValidateCompanyDataResultsResultErrors

  data class ErrorSyntaxCompany(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxCompany
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxCompany by _0,
      ValidateCompanyDataResultsResultErrors

  data class ErrorFormatGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorFormatGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorFormatGlobal by _0,
      ValidateCompanyDataResultsResultErrors

  data class ErrorValueGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorValueGlobal by _0,
      ValidateCompanyDataResultsResultErrors
}
/** Corrected version of the sent query. */
@JsonDeserialize(`as` = ValidateCompanyDataResultsResultCorrectedImpl::class)
interface ValidateCompanyDataResultsResultCorrected : CompanyResultsResponseResults {
  val isValid: Boolean?
  val errors: List<ValidateCompanyDataResultsResultCorrectedErrors?>?
  val fixes: List<ValidateCompanyDataResultsResultCorrectedFixes?>?
}

data class ValidateCompanyDataResultsResultCorrectedImpl(
    override val isValid: Boolean?,
    override val errors: List<ValidateCompanyDataResultsResultCorrectedErrors?>?,
    override val fixes: List<ValidateCompanyDataResultsResultCorrectedFixes?>?,
    override val data: CompanyResultsResponseResultsData
) : ValidateCompanyDataResultsResultCorrected

class ValidateCompanyDataResultsResultCorrectedErrorsDeserializer :
    StdDeserializer<ValidateCompanyDataResultsResultCorrectedErrors>(
        ValidateCompanyDataResultsResultCorrectedErrors::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): ValidateCompanyDataResultsResultCorrectedErrors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return ValidateCompanyDataResultsResultCorrectedErrors.ErrorSyntaxGlobal(
          mapper.convertValue(node, ErrorSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultsResultCorrectedErrors.ErrorSyntaxCompany(
          mapper.convertValue(node, ErrorSyntaxCompany::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultsResultCorrectedErrors.ErrorFormatGlobal(
          mapper.convertValue(node, ErrorFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultsResultCorrectedErrors.ErrorValueGlobal(
          mapper.convertValue(node, ErrorValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = ValidateCompanyDataResultsResultCorrectedErrorsDeserializer::class)
sealed interface ValidateCompanyDataResultsResultCorrectedErrors {
  data class ErrorSyntaxGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal by _0,
      ValidateCompanyDataResultsResultCorrectedErrors

  data class ErrorSyntaxCompany(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxCompany
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxCompany by _0,
      ValidateCompanyDataResultsResultCorrectedErrors

  data class ErrorFormatGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorFormatGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorFormatGlobal by _0,
      ValidateCompanyDataResultsResultCorrectedErrors

  data class ErrorValueGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorValueGlobal by _0,
      ValidateCompanyDataResultsResultCorrectedErrors
}

class ValidateCompanyDataResultsResultCorrectedFixesDeserializer :
    StdDeserializer<ValidateCompanyDataResultsResultCorrectedFixes>(
        ValidateCompanyDataResultsResultCorrectedFixes::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): ValidateCompanyDataResultsResultCorrectedFixes {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return ValidateCompanyDataResultsResultCorrectedFixes.FixFormatGlobal(
          mapper.convertValue(node, FixFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultsResultCorrectedFixes.FixSyntaxGlobal(
          mapper.convertValue(node, FixSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultsResultCorrectedFixes.FixSyntaxCompany(
          mapper.convertValue(node, FixSyntaxCompany::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateCompanyDataResultsResultCorrectedFixes.FixValueGlobal(
          mapper.convertValue(node, FixValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = ValidateCompanyDataResultsResultCorrectedFixesDeserializer::class)
sealed interface ValidateCompanyDataResultsResultCorrectedFixes {
  data class FixFormatGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixFormatGlobal) :
      com.foxentry.foxentrysdk.models.FixFormatGlobal by _0,
      ValidateCompanyDataResultsResultCorrectedFixes

  data class FixSyntaxGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxGlobal) :
      com.foxentry.foxentrysdk.models.FixSyntaxGlobal by _0,
      ValidateCompanyDataResultsResultCorrectedFixes

  data class FixSyntaxCompany(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxCompany
  ) :
      com.foxentry.foxentrysdk.models.FixSyntaxCompany by _0,
      ValidateCompanyDataResultsResultCorrectedFixes

  data class FixValueGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixValueGlobal) :
      com.foxentry.foxentrysdk.models.FixValueGlobal by _0,
      ValidateCompanyDataResultsResultCorrectedFixes
}
