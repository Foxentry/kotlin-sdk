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

@JsonDeserialize(`as` = ValidateEmailResponseImpl::class)
interface ValidateEmailResponse {
  val result: ValidateEmailResponseResult
  val resultCorrected: ValidateEmailResponseResultCorrected?
  val suggestions: List<ValidateEmailResponseSuggestions?>?
}

data class ValidateEmailResponseImpl(
    override val result: ValidateEmailResponseResult,
    override val resultCorrected: ValidateEmailResponseResultCorrected?,
    override val suggestions: List<ValidateEmailResponseSuggestions?>?,
) : ValidateEmailResponse
/** Evaluation of the sent query. */
@JsonDeserialize(`as` = ValidateEmailResponseResultImpl::class)
interface ValidateEmailResponseResult {
  val isValid: Boolean?
  val proposal: ValidateEmailResponseResultProposal
  val data: EmailData
  val flags: EmailFlags?
  val errors: List<ValidateEmailResponseResultErrors?>?
}

data class ValidateEmailResponseResultImpl(
    override val isValid: Boolean?,
    override val proposal: ValidateEmailResponseResultProposal,
    override val data: EmailData,
    override val flags: EmailFlags?,
    override val errors: List<ValidateEmailResponseResultErrors?>?,
) : ValidateEmailResponseResult
/**
 * Proposed solution by Foxentry how you should process the response in your form or application.
 */
enum class ValidateEmailResponseResultProposal(@JsonValue val value: String) {
  VALID("valid"),
  VALID_WITH_SUGGESTION("validWithSuggestion"),
  INVALID("invalid"),
  INVALID_WITH_CORRECTION("invalidWithCorrection"),
  INVALID_WITH_PARTIAL_CORRECTION("invalidWithPartialCorrection"),
  INVALID_WITH_SUGGESTION("invalidWithSuggestion"),
  INVALID_WITH_CORRECTION_WITH_SUGGESTION("invalidWithCorrectionWithSuggestion"),
  UNKNOWN_WITH_CORRECTION("unknownWithCorrection"),
  UNKNOWN_WITH_PARTIAL_CORRECTION("unknownWithPartialCorrection"),
}

class ValidateEmailResponseResultErrorsDeserializer :
    StdDeserializer<ValidateEmailResponseResultErrors>(
        ValidateEmailResponseResultErrors::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): ValidateEmailResponseResultErrors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return ValidateEmailResponseResultErrors.ErrorSyntaxGlobal(
          mapper.convertValue(node, ErrorSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResponseResultErrors.ErrorSyntaxEmail(
          mapper.convertValue(node, ErrorSyntaxEmail::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResponseResultErrors.ErrorFormatGlobal(
          mapper.convertValue(node, ErrorFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResponseResultErrors.ErrorValueGlobal(
          mapper.convertValue(node, ErrorValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResponseResultErrors.ErrorValueEmail(
          mapper.convertValue(node, ErrorValueEmail::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = ValidateEmailResponseResultErrorsDeserializer::class)
sealed interface ValidateEmailResponseResultErrors {
  data class ErrorSyntaxGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal
  ) : com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal by _0, ValidateEmailResponseResultErrors

  data class ErrorSyntaxEmail(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxEmail
  ) : com.foxentry.foxentrysdk.models.ErrorSyntaxEmail by _0, ValidateEmailResponseResultErrors

  data class ErrorFormatGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorFormatGlobal
  ) : com.foxentry.foxentrysdk.models.ErrorFormatGlobal by _0, ValidateEmailResponseResultErrors

  data class ErrorValueGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueGlobal
  ) : com.foxentry.foxentrysdk.models.ErrorValueGlobal by _0, ValidateEmailResponseResultErrors

  data class ErrorValueEmail(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueEmail) :
      com.foxentry.foxentrysdk.models.ErrorValueEmail by _0, ValidateEmailResponseResultErrors
}
/** Corrected version of the sent query. */
@JsonDeserialize(`as` = ValidateEmailResponseResultCorrectedImpl::class)
interface ValidateEmailResponseResultCorrected {
  val isValid: Boolean
  val data: EmailData?
  val flags: EmailFlags?
  val fixes: List<ValidateEmailResponseResultCorrectedFixes?>?
}

data class ValidateEmailResponseResultCorrectedImpl(
    override val isValid: Boolean,
    override val data: EmailData?,
    override val flags: EmailFlags?,
    override val fixes: List<ValidateEmailResponseResultCorrectedFixes?>?,
) : ValidateEmailResponseResultCorrected

class ValidateEmailResponseResultCorrectedFixesDeserializer :
    StdDeserializer<ValidateEmailResponseResultCorrectedFixes>(
        ValidateEmailResponseResultCorrectedFixes::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): ValidateEmailResponseResultCorrectedFixes {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return ValidateEmailResponseResultCorrectedFixes.FixFormatGlobal(
          mapper.convertValue(node, FixFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResponseResultCorrectedFixes.FixSyntaxGlobal(
          mapper.convertValue(node, FixSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResponseResultCorrectedFixes.FixSyntaxEmail(
          mapper.convertValue(node, FixSyntaxEmail::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResponseResultCorrectedFixes.FixValueGlobal(
          mapper.convertValue(node, FixValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = ValidateEmailResponseResultCorrectedFixesDeserializer::class)
sealed interface ValidateEmailResponseResultCorrectedFixes {
  data class FixFormatGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixFormatGlobal) :
      com.foxentry.foxentrysdk.models.FixFormatGlobal by _0,
      ValidateEmailResponseResultCorrectedFixes

  data class FixSyntaxGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxGlobal) :
      com.foxentry.foxentrysdk.models.FixSyntaxGlobal by _0,
      ValidateEmailResponseResultCorrectedFixes

  data class FixSyntaxEmail(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxEmail) :
      com.foxentry.foxentrysdk.models.FixSyntaxEmail by _0,
      ValidateEmailResponseResultCorrectedFixes

  data class FixValueGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixValueGlobal) :
      com.foxentry.foxentrysdk.models.FixValueGlobal by _0,
      ValidateEmailResponseResultCorrectedFixes
}

@JsonDeserialize(`as` = ValidateEmailResponseSuggestionsImpl::class)
interface ValidateEmailResponseSuggestions {
  val isValid: Boolean?
  val data: EmailData?
  val flags: EmailFlags?
  val fixes: List<EmailFixes>?
  val errors: List<ValidateEmailResponseSuggestionsErrors?>?
}

data class ValidateEmailResponseSuggestionsImpl(
    override val isValid: Boolean?,
    override val data: EmailData?,
    override val flags: EmailFlags?,
    override val fixes: List<EmailFixes>?,
    override val errors: List<ValidateEmailResponseSuggestionsErrors?>?,
) : ValidateEmailResponseSuggestions

class ValidateEmailResponseSuggestionsErrorsDeserializer :
    StdDeserializer<ValidateEmailResponseSuggestionsErrors>(
        ValidateEmailResponseSuggestionsErrors::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): ValidateEmailResponseSuggestionsErrors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return ValidateEmailResponseSuggestionsErrors.ErrorSyntaxGlobal(
          mapper.convertValue(node, ErrorSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResponseSuggestionsErrors.ErrorSyntaxEmail(
          mapper.convertValue(node, ErrorSyntaxEmail::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResponseSuggestionsErrors.ErrorFormatGlobal(
          mapper.convertValue(node, ErrorFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResponseSuggestionsErrors.ErrorValueGlobal(
          mapper.convertValue(node, ErrorValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return ValidateEmailResponseSuggestionsErrors.ErrorValueEmail(
          mapper.convertValue(node, ErrorValueEmail::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = ValidateEmailResponseSuggestionsErrorsDeserializer::class)
sealed interface ValidateEmailResponseSuggestionsErrors {
  data class ErrorSyntaxGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal by _0,
      ValidateEmailResponseSuggestionsErrors

  data class ErrorSyntaxEmail(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxEmail
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxEmail by _0,
      ValidateEmailResponseSuggestionsErrors

  data class ErrorFormatGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorFormatGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorFormatGlobal by _0,
      ValidateEmailResponseSuggestionsErrors

  data class ErrorValueGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorValueGlobal by _0,
      ValidateEmailResponseSuggestionsErrors

  data class ErrorValueEmail(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueEmail) :
      com.foxentry.foxentrysdk.models.ErrorValueEmail by _0, ValidateEmailResponseSuggestionsErrors
}
