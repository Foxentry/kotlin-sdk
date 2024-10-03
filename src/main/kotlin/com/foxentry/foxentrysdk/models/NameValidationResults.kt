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

@JsonDeserialize(`as` = NameValidationResultsImpl::class)
interface NameValidationResults {
  val result: NameValidationResultsResult
  val resultCorrected: NameValidationResultsResultCorrected?
  val suggestions: List<NameValidationResultsSuggestions?>
}

data class NameValidationResultsImpl(
    override val result: NameValidationResultsResult,
    override val resultCorrected: NameValidationResultsResultCorrected?,
    override val suggestions: List<NameValidationResultsSuggestions?>,
) : NameValidationResults
/** Evaluation of the sent query. */
@JsonDeserialize(`as` = NameValidationResultsResultImpl::class)
interface NameValidationResultsResult {
  val isValid: Boolean
  val proposal: NameValidationResultsResultProposal
  val data: NameValidationResultsData
  val details: NameValidationResultsDetails?
  val errors: List<NameValidationResultsResultErrors?>?
}

data class NameValidationResultsResultImpl(
    override val isValid: Boolean,
    override val proposal: NameValidationResultsResultProposal,
    override val data: NameValidationResultsData,
    override val details: NameValidationResultsDetails?,
    override val errors: List<NameValidationResultsResultErrors?>?,
) : NameValidationResultsResult
/**
 * Proposed solution by Foxentry how you should process the response in your form or application.
 */
enum class NameValidationResultsResultProposal(@JsonValue val value: String) {
  VALID("valid"),
  VALID_WITH_SUGGESTION("validWithSuggestion"),
  INVALID("invalid"),
  INVALID_WITH_CORRECTION("invalidWithCorrection"),
  INVALID_WITH_PARTIAL_CORRECTION("invalidWithPartialCorrection"),
  INVALID_WITH_SUGGESTION("invalidWithSuggestion"),
  INVALID_WITH_CORRECTION_WITH_SUGGESTION("invalidWithCorrectionWithSuggestion"),
}

class NameValidationResultsResultErrorsDeserializer :
    StdDeserializer<NameValidationResultsResultErrors>(
        NameValidationResultsResultErrors::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): NameValidationResultsResultErrors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return NameValidationResultsResultErrors.ErrorSyntaxGlobal(
          mapper.convertValue(node, ErrorSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResultsResultErrors.ErrorSyntaxName(
          mapper.convertValue(node, ErrorSyntaxName::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResultsResultErrors.ErrorFormatGlobal(
          mapper.convertValue(node, ErrorFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResultsResultErrors.ErrorValueGlobal(
          mapper.convertValue(node, ErrorValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResultsResultErrors.ErrorValueName(
          mapper.convertValue(node, ErrorValueName::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = NameValidationResultsResultErrorsDeserializer::class)
sealed interface NameValidationResultsResultErrors {
  data class ErrorSyntaxGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal
  ) : com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal by _0, NameValidationResultsResultErrors

  data class ErrorSyntaxName(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxName) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxName by _0, NameValidationResultsResultErrors

  data class ErrorFormatGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorFormatGlobal
  ) : com.foxentry.foxentrysdk.models.ErrorFormatGlobal by _0, NameValidationResultsResultErrors

  data class ErrorValueGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueGlobal
  ) : com.foxentry.foxentrysdk.models.ErrorValueGlobal by _0, NameValidationResultsResultErrors

  data class ErrorValueName(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueName) :
      com.foxentry.foxentrysdk.models.ErrorValueName by _0, NameValidationResultsResultErrors
}
/** Corrected version of the sent query. */
@JsonDeserialize(`as` = NameValidationResultsResultCorrectedImpl::class)
interface NameValidationResultsResultCorrected {
  val isValid: Boolean
  val data: NameValidationResultsData
  val details: NameValidationResultsDetails?
  val fixes: List<NameValidationResultsResultCorrectedFixes?>
}

data class NameValidationResultsResultCorrectedImpl(
    override val isValid: Boolean,
    override val data: NameValidationResultsData,
    override val details: NameValidationResultsDetails?,
    override val fixes: List<NameValidationResultsResultCorrectedFixes?>,
) : NameValidationResultsResultCorrected

class NameValidationResultsResultCorrectedFixesDeserializer :
    StdDeserializer<NameValidationResultsResultCorrectedFixes>(
        NameValidationResultsResultCorrectedFixes::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): NameValidationResultsResultCorrectedFixes {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return NameValidationResultsResultCorrectedFixes.FixFormatGlobal(
          mapper.convertValue(node, FixFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResultsResultCorrectedFixes.FixSyntaxGlobal(
          mapper.convertValue(node, FixSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResultsResultCorrectedFixes.FixValueGlobal(
          mapper.convertValue(node, FixValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = NameValidationResultsResultCorrectedFixesDeserializer::class)
sealed interface NameValidationResultsResultCorrectedFixes {
  data class FixFormatGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixFormatGlobal) :
      com.foxentry.foxentrysdk.models.FixFormatGlobal by _0,
      NameValidationResultsResultCorrectedFixes

  data class FixSyntaxGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxGlobal) :
      com.foxentry.foxentrysdk.models.FixSyntaxGlobal by _0,
      NameValidationResultsResultCorrectedFixes

  data class FixValueGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixValueGlobal) :
      com.foxentry.foxentrysdk.models.FixValueGlobal by _0,
      NameValidationResultsResultCorrectedFixes
}
/** Alternatives suggested for the sent query. */
@JsonDeserialize(`as` = NameValidationResultsSuggestionsImpl::class)
interface NameValidationResultsSuggestions {
  val isValid: Boolean
  val data: NameValidationResultsData
  val details: NameValidationResultsDetails?
  val fixes: List<NameValidationResultsSuggestionsFixes?>
}

data class NameValidationResultsSuggestionsImpl(
    override val isValid: Boolean,
    override val data: NameValidationResultsData,
    override val details: NameValidationResultsDetails?,
    override val fixes: List<NameValidationResultsSuggestionsFixes?>,
) : NameValidationResultsSuggestions

class NameValidationResultsSuggestionsFixesDeserializer :
    StdDeserializer<NameValidationResultsSuggestionsFixes>(
        NameValidationResultsSuggestionsFixes::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): NameValidationResultsSuggestionsFixes {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return NameValidationResultsSuggestionsFixes.FixFormatGlobal(
          mapper.convertValue(node, FixFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResultsSuggestionsFixes.FixSyntaxGlobal(
          mapper.convertValue(node, FixSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return NameValidationResultsSuggestionsFixes.FixValueGlobal(
          mapper.convertValue(node, FixValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = NameValidationResultsSuggestionsFixesDeserializer::class)
sealed interface NameValidationResultsSuggestionsFixes {
  data class FixFormatGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixFormatGlobal) :
      com.foxentry.foxentrysdk.models.FixFormatGlobal by _0, NameValidationResultsSuggestionsFixes

  data class FixSyntaxGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxGlobal) :
      com.foxentry.foxentrysdk.models.FixSyntaxGlobal by _0, NameValidationResultsSuggestionsFixes

  data class FixValueGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixValueGlobal) :
      com.foxentry.foxentrysdk.models.FixValueGlobal by _0, NameValidationResultsSuggestionsFixes
}
