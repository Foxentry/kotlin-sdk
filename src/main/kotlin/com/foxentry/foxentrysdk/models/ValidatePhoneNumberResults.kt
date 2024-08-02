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

@JsonDeserialize(`as` = ValidatePhoneNumberResultsImpl::class)
interface ValidatePhoneNumberResults {
  val result: ValidatePhoneNumberResultsResult
  val resultCorrected: ValidatePhoneNumberResultsResultCorrected?
  val suggestions: List<ValidatePhoneNumberResultsSuggestions?>
}

data class ValidatePhoneNumberResultsImpl(
    override val result: ValidatePhoneNumberResultsResult,
    override val resultCorrected: ValidatePhoneNumberResultsResultCorrected?,
    override val suggestions: List<ValidatePhoneNumberResultsSuggestions?>,
) : ValidatePhoneNumberResults
/** Evaluation of the sent query. */
@JsonDeserialize(`as` = ValidatePhoneNumberResultsResultImpl::class)
interface ValidatePhoneNumberResultsResult {
  val isValid: Boolean?
  val proposal: ValidatePhoneNumberResultsResultProposal?
  val data: ValidatePhoneNumberData
  val errors: List<ValidatePhoneNumberResultsResultErrors?>
}

data class ValidatePhoneNumberResultsResultImpl(
    override val isValid: Boolean?,
    override val proposal: ValidatePhoneNumberResultsResultProposal?,
    override val data: ValidatePhoneNumberData,
    override val errors: List<ValidatePhoneNumberResultsResultErrors?>,
) : ValidatePhoneNumberResultsResult
/**
 * Proposed solution by Foxentry how you should process the response in your form or application.
 */
enum class ValidatePhoneNumberResultsResultProposal(@JsonValue val value: String?) {
  VALID("valid"),
  VALID_WITH_SUGGESTION("validWithSuggestion"),
  INVALID("invalid"),
  INVALID_WITH_CORRECTION("invalidWithCorrection"),
  INVALID_WITH_PARTIAL_CORRECTION("invalidWithPartialCorrection"),
  INVALID_WITH_SUGGESTION("invalidWithSuggestion"),
  INVALID_WITH_CORRECTION_WITH_SUGGESTION("invalidWithCorrectionWithSuggestion"),
  NULL(null),
}

class ValidatePhoneNumberResultsResultErrorsDeserializer :
    StdDeserializer<ValidatePhoneNumberResultsResultErrors>(
        ValidatePhoneNumberResultsResultErrors::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): ValidatePhoneNumberResultsResultErrors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return ValidatePhoneNumberResultsResultErrors.ErrorSyntaxGlobal(
          mapper.convertValue(node, ErrorSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsResultErrors.ErrorSyntaxPhone(
          mapper.convertValue(node, ErrorSyntaxPhone::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsResultErrors.ErrorFormatGlobal(
          mapper.convertValue(node, ErrorFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsResultErrors.ErrorValueGlobal(
          mapper.convertValue(node, ErrorValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsResultErrors.ErrorValuePhone(
          mapper.convertValue(node, ErrorValuePhone::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = ValidatePhoneNumberResultsResultErrorsDeserializer::class)
sealed interface ValidatePhoneNumberResultsResultErrors {
  data class ErrorSyntaxGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal by _0,
      ValidatePhoneNumberResultsResultErrors

  data class ErrorSyntaxPhone(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxPhone
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxPhone by _0,
      ValidatePhoneNumberResultsResultErrors

  data class ErrorFormatGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorFormatGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorFormatGlobal by _0,
      ValidatePhoneNumberResultsResultErrors

  data class ErrorValueGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorValueGlobal by _0,
      ValidatePhoneNumberResultsResultErrors

  data class ErrorValuePhone(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValuePhone) :
      com.foxentry.foxentrysdk.models.ErrorValuePhone by _0, ValidatePhoneNumberResultsResultErrors
}
/** Corrected version of the sent query. */
@JsonDeserialize(`as` = ValidatePhoneNumberResultsResultCorrectedImpl::class)
interface ValidatePhoneNumberResultsResultCorrected {
  val isValid: Boolean?
  val data: ValidatePhoneNumberData?
  val errors: List<ValidatePhoneNumberResultsResultCorrectedErrors?>?
  val fixes: List<ValidatePhoneNumberResultsResultCorrectedFixes?>?
}

data class ValidatePhoneNumberResultsResultCorrectedImpl(
    override val isValid: Boolean?,
    override val data: ValidatePhoneNumberData?,
    override val errors: List<ValidatePhoneNumberResultsResultCorrectedErrors?>?,
    override val fixes: List<ValidatePhoneNumberResultsResultCorrectedFixes?>?,
) : ValidatePhoneNumberResultsResultCorrected

class ValidatePhoneNumberResultsResultCorrectedErrorsDeserializer :
    StdDeserializer<ValidatePhoneNumberResultsResultCorrectedErrors>(
        ValidatePhoneNumberResultsResultCorrectedErrors::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): ValidatePhoneNumberResultsResultCorrectedErrors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return ValidatePhoneNumberResultsResultCorrectedErrors.ErrorSyntaxGlobal(
          mapper.convertValue(node, ErrorSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsResultCorrectedErrors.ErrorSyntaxPhone(
          mapper.convertValue(node, ErrorSyntaxPhone::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsResultCorrectedErrors.ErrorFormatGlobal(
          mapper.convertValue(node, ErrorFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsResultCorrectedErrors.ErrorValueGlobal(
          mapper.convertValue(node, ErrorValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsResultCorrectedErrors.ErrorValuePhone(
          mapper.convertValue(node, ErrorValuePhone::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = ValidatePhoneNumberResultsResultCorrectedErrorsDeserializer::class)
sealed interface ValidatePhoneNumberResultsResultCorrectedErrors {
  data class ErrorSyntaxGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal by _0,
      ValidatePhoneNumberResultsResultCorrectedErrors

  data class ErrorSyntaxPhone(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxPhone
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxPhone by _0,
      ValidatePhoneNumberResultsResultCorrectedErrors

  data class ErrorFormatGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorFormatGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorFormatGlobal by _0,
      ValidatePhoneNumberResultsResultCorrectedErrors

  data class ErrorValueGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorValueGlobal by _0,
      ValidatePhoneNumberResultsResultCorrectedErrors

  data class ErrorValuePhone(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValuePhone) :
      com.foxentry.foxentrysdk.models.ErrorValuePhone by _0,
      ValidatePhoneNumberResultsResultCorrectedErrors
}

class ValidatePhoneNumberResultsResultCorrectedFixesDeserializer :
    StdDeserializer<ValidatePhoneNumberResultsResultCorrectedFixes>(
        ValidatePhoneNumberResultsResultCorrectedFixes::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): ValidatePhoneNumberResultsResultCorrectedFixes {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return ValidatePhoneNumberResultsResultCorrectedFixes.FixFormatGlobal(
          mapper.convertValue(node, FixFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsResultCorrectedFixes.FixSyntaxGlobal(
          mapper.convertValue(node, FixSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsResultCorrectedFixes.FixSyntaxPhone(
          mapper.convertValue(node, FixSyntaxPhone::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsResultCorrectedFixes.FixValueGlobal(
          mapper.convertValue(node, FixValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = ValidatePhoneNumberResultsResultCorrectedFixesDeserializer::class)
sealed interface ValidatePhoneNumberResultsResultCorrectedFixes {
  data class FixFormatGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixFormatGlobal) :
      com.foxentry.foxentrysdk.models.FixFormatGlobal by _0,
      ValidatePhoneNumberResultsResultCorrectedFixes

  data class FixSyntaxGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxGlobal) :
      com.foxentry.foxentrysdk.models.FixSyntaxGlobal by _0,
      ValidatePhoneNumberResultsResultCorrectedFixes

  data class FixSyntaxPhone(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxPhone) :
      com.foxentry.foxentrysdk.models.FixSyntaxPhone by _0,
      ValidatePhoneNumberResultsResultCorrectedFixes

  data class FixValueGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixValueGlobal) :
      com.foxentry.foxentrysdk.models.FixValueGlobal by _0,
      ValidatePhoneNumberResultsResultCorrectedFixes
}

@JsonDeserialize(`as` = ValidatePhoneNumberResultsSuggestionsImpl::class)
interface ValidatePhoneNumberResultsSuggestions {
  val isValid: Boolean?
  val data: ValidatePhoneNumberData?
  val errors: List<ValidatePhoneNumberResultsSuggestionsErrors?>?
  val fixes: List<ValidatePhoneNumberResultsSuggestionsFixes?>?
}

data class ValidatePhoneNumberResultsSuggestionsImpl(
    override val isValid: Boolean?,
    override val data: ValidatePhoneNumberData?,
    override val errors: List<ValidatePhoneNumberResultsSuggestionsErrors?>?,
    override val fixes: List<ValidatePhoneNumberResultsSuggestionsFixes?>?,
) : ValidatePhoneNumberResultsSuggestions

class ValidatePhoneNumberResultsSuggestionsErrorsDeserializer :
    StdDeserializer<ValidatePhoneNumberResultsSuggestionsErrors>(
        ValidatePhoneNumberResultsSuggestionsErrors::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): ValidatePhoneNumberResultsSuggestionsErrors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return ValidatePhoneNumberResultsSuggestionsErrors.ErrorSyntaxGlobal(
          mapper.convertValue(node, ErrorSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsSuggestionsErrors.ErrorSyntaxPhone(
          mapper.convertValue(node, ErrorSyntaxPhone::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsSuggestionsErrors.ErrorFormatGlobal(
          mapper.convertValue(node, ErrorFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsSuggestionsErrors.ErrorValueGlobal(
          mapper.convertValue(node, ErrorValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsSuggestionsErrors.ErrorValuePhone(
          mapper.convertValue(node, ErrorValuePhone::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = ValidatePhoneNumberResultsSuggestionsErrorsDeserializer::class)
sealed interface ValidatePhoneNumberResultsSuggestionsErrors {
  data class ErrorSyntaxGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal by _0,
      ValidatePhoneNumberResultsSuggestionsErrors

  data class ErrorSyntaxPhone(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxPhone
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxPhone by _0,
      ValidatePhoneNumberResultsSuggestionsErrors

  data class ErrorFormatGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorFormatGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorFormatGlobal by _0,
      ValidatePhoneNumberResultsSuggestionsErrors

  data class ErrorValueGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorValueGlobal by _0,
      ValidatePhoneNumberResultsSuggestionsErrors

  data class ErrorValuePhone(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValuePhone) :
      com.foxentry.foxentrysdk.models.ErrorValuePhone by _0,
      ValidatePhoneNumberResultsSuggestionsErrors
}

class ValidatePhoneNumberResultsSuggestionsFixesDeserializer :
    StdDeserializer<ValidatePhoneNumberResultsSuggestionsFixes>(
        ValidatePhoneNumberResultsSuggestionsFixes::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): ValidatePhoneNumberResultsSuggestionsFixes {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return ValidatePhoneNumberResultsSuggestionsFixes.FixFormatGlobal(
          mapper.convertValue(node, FixFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsSuggestionsFixes.FixSyntaxGlobal(
          mapper.convertValue(node, FixSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsSuggestionsFixes.FixSyntaxPhone(
          mapper.convertValue(node, FixSyntaxPhone::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidatePhoneNumberResultsSuggestionsFixes.FixValueGlobal(
          mapper.convertValue(node, FixValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = ValidatePhoneNumberResultsSuggestionsFixesDeserializer::class)
sealed interface ValidatePhoneNumberResultsSuggestionsFixes {
  data class FixFormatGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixFormatGlobal) :
      com.foxentry.foxentrysdk.models.FixFormatGlobal by _0,
      ValidatePhoneNumberResultsSuggestionsFixes

  data class FixSyntaxGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxGlobal) :
      com.foxentry.foxentrysdk.models.FixSyntaxGlobal by _0,
      ValidatePhoneNumberResultsSuggestionsFixes

  data class FixSyntaxPhone(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxPhone) :
      com.foxentry.foxentrysdk.models.FixSyntaxPhone by _0,
      ValidatePhoneNumberResultsSuggestionsFixes

  data class FixValueGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixValueGlobal) :
      com.foxentry.foxentrysdk.models.FixValueGlobal by _0,
      ValidatePhoneNumberResultsSuggestionsFixes
}
