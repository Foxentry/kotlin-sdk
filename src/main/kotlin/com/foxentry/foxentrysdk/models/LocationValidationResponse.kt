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

@JsonDeserialize(`as` = LocationValidationResponseImpl::class)
interface LocationValidationResponse {
  val result: LocationValidationResponseResult
  val resultCorrected: LocationValidationResponseResultCorrected?
  val suggestions: List<LocationValidationResponseSuggestions?>?
}

data class LocationValidationResponseImpl(
    override val result: LocationValidationResponseResult,
    override val resultCorrected: LocationValidationResponseResultCorrected?,
    override val suggestions: List<LocationValidationResponseSuggestions?>?,
) : LocationValidationResponse
/** Evaluation of the sent query. */
@JsonDeserialize(`as` = LocationValidationResponseResultImpl::class)
interface LocationValidationResponseResult {
  val isValid: Boolean?
  val proposal: LocationValidationResponseResultProposal?
  val data: LocationData
  val errors: List<LocationValidationResponseResultErrors?>?
}

data class LocationValidationResponseResultImpl(
    override val isValid: Boolean?,
    override val proposal: LocationValidationResponseResultProposal?,
    override val data: LocationData,
    override val errors: List<LocationValidationResponseResultErrors?>?,
) : LocationValidationResponseResult
/**
 * Proposed solution by Foxentry how you should process the response in your form or application.
 */
enum class LocationValidationResponseResultProposal(@JsonValue val value: String?) {
  VALID("valid"),
  VALID_WITH_SUGGESTION("validWithSuggestion"),
  INVALID("invalid"),
  INVALID_WITH_CORRECTION("invalidWithCorrection"),
  INVALID_WITH_PARTIAL_CORRECTION("invalidWithPartialCorrection"),
  INVALID_WITH_SUGGESTION("invalidWithSuggestion"),
  INVALID_WITH_CORRECTION_WITH_SUGGESTION("invalidWithCorrectionWithSuggestion"),
  NULL(null),
}

class LocationValidationResponseResultErrorsDeserializer :
    StdDeserializer<LocationValidationResponseResultErrors>(
        LocationValidationResponseResultErrors::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): LocationValidationResponseResultErrors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return LocationValidationResponseResultErrors.ErrorSyntaxGlobal(
          mapper.convertValue(node, ErrorSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseResultErrors.ErrorSyntaxLocation(
          mapper.convertValue(node, ErrorSyntaxLocation::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseResultErrors.ErrorFormatGlobal(
          mapper.convertValue(node, ErrorFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseResultErrors.ErrorValueGlobal(
          mapper.convertValue(node, ErrorValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = LocationValidationResponseResultErrorsDeserializer::class)
sealed interface LocationValidationResponseResultErrors {
  data class ErrorSyntaxGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal by _0,
      LocationValidationResponseResultErrors

  data class ErrorSyntaxLocation(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxLocation
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxLocation by _0,
      LocationValidationResponseResultErrors

  data class ErrorFormatGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorFormatGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorFormatGlobal by _0,
      LocationValidationResponseResultErrors

  data class ErrorValueGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorValueGlobal by _0,
      LocationValidationResponseResultErrors
}
/** Corrected version of the sent query. */
@JsonDeserialize(`as` = LocationValidationResponseResultCorrectedImpl::class)
interface LocationValidationResponseResultCorrected {
  val isValid: Boolean
  val data: LocationData
  val errors: List<LocationValidationResponseResultCorrectedErrors?>?
  val fixes: List<LocationValidationResponseResultCorrectedFixes?>?
}

data class LocationValidationResponseResultCorrectedImpl(
    override val isValid: Boolean,
    override val data: LocationData,
    override val errors: List<LocationValidationResponseResultCorrectedErrors?>?,
    override val fixes: List<LocationValidationResponseResultCorrectedFixes?>?,
) : LocationValidationResponseResultCorrected

class LocationValidationResponseResultCorrectedErrorsDeserializer :
    StdDeserializer<LocationValidationResponseResultCorrectedErrors>(
        LocationValidationResponseResultCorrectedErrors::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): LocationValidationResponseResultCorrectedErrors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return LocationValidationResponseResultCorrectedErrors.ErrorSyntaxGlobal(
          mapper.convertValue(node, ErrorSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseResultCorrectedErrors.ErrorSyntaxLocation(
          mapper.convertValue(node, ErrorSyntaxLocation::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseResultCorrectedErrors.ErrorFormatGlobal(
          mapper.convertValue(node, ErrorFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseResultCorrectedErrors.ErrorValueGlobal(
          mapper.convertValue(node, ErrorValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = LocationValidationResponseResultCorrectedErrorsDeserializer::class)
sealed interface LocationValidationResponseResultCorrectedErrors {
  data class ErrorSyntaxGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal by _0,
      LocationValidationResponseResultCorrectedErrors

  data class ErrorSyntaxLocation(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxLocation
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxLocation by _0,
      LocationValidationResponseResultCorrectedErrors

  data class ErrorFormatGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorFormatGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorFormatGlobal by _0,
      LocationValidationResponseResultCorrectedErrors

  data class ErrorValueGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorValueGlobal by _0,
      LocationValidationResponseResultCorrectedErrors
}

class LocationValidationResponseResultCorrectedFixesDeserializer :
    StdDeserializer<LocationValidationResponseResultCorrectedFixes>(
        LocationValidationResponseResultCorrectedFixes::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): LocationValidationResponseResultCorrectedFixes {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return LocationValidationResponseResultCorrectedFixes.FixFormatGlobal(
          mapper.convertValue(node, FixFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseResultCorrectedFixes.FixSyntaxGlobal(
          mapper.convertValue(node, FixSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseResultCorrectedFixes.FixSyntaxLocation(
          mapper.convertValue(node, FixSyntaxLocation::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseResultCorrectedFixes.FixValueGlobal(
          mapper.convertValue(node, FixValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseResultCorrectedFixes.FixValueLocation(
          mapper.convertValue(node, FixValueLocation::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = LocationValidationResponseResultCorrectedFixesDeserializer::class)
sealed interface LocationValidationResponseResultCorrectedFixes {
  data class FixFormatGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixFormatGlobal) :
      com.foxentry.foxentrysdk.models.FixFormatGlobal by _0,
      LocationValidationResponseResultCorrectedFixes

  data class FixSyntaxGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxGlobal) :
      com.foxentry.foxentrysdk.models.FixSyntaxGlobal by _0,
      LocationValidationResponseResultCorrectedFixes

  data class FixSyntaxLocation(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxLocation
  ) :
      com.foxentry.foxentrysdk.models.FixSyntaxLocation by _0,
      LocationValidationResponseResultCorrectedFixes

  data class FixValueGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixValueGlobal) :
      com.foxentry.foxentrysdk.models.FixValueGlobal by _0,
      LocationValidationResponseResultCorrectedFixes

  data class FixValueLocation(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixValueLocation
  ) :
      com.foxentry.foxentrysdk.models.FixValueLocation by _0,
      LocationValidationResponseResultCorrectedFixes
}

@JsonDeserialize(`as` = LocationValidationResponseSuggestionsImpl::class)
interface LocationValidationResponseSuggestions {
  val isValid: Boolean?
  val data: LocationData
  val fixes: List<LocationValidationResponseSuggestionsFixes?>?
  val errors: List<LocationValidationResponseSuggestionsErrors?>?
}

data class LocationValidationResponseSuggestionsImpl(
    override val isValid: Boolean?,
    override val data: LocationData,
    override val fixes: List<LocationValidationResponseSuggestionsFixes?>?,
    override val errors: List<LocationValidationResponseSuggestionsErrors?>?,
) : LocationValidationResponseSuggestions

class LocationValidationResponseSuggestionsFixesDeserializer :
    StdDeserializer<LocationValidationResponseSuggestionsFixes>(
        LocationValidationResponseSuggestionsFixes::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): LocationValidationResponseSuggestionsFixes {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return LocationValidationResponseSuggestionsFixes.FixFormatGlobal(
          mapper.convertValue(node, FixFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseSuggestionsFixes.FixSyntaxGlobal(
          mapper.convertValue(node, FixSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseSuggestionsFixes.FixSyntaxLocation(
          mapper.convertValue(node, FixSyntaxLocation::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseSuggestionsFixes.FixValueGlobal(
          mapper.convertValue(node, FixValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseSuggestionsFixes.FixValueLocation(
          mapper.convertValue(node, FixValueLocation::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = LocationValidationResponseSuggestionsFixesDeserializer::class)
sealed interface LocationValidationResponseSuggestionsFixes {
  data class FixFormatGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixFormatGlobal) :
      com.foxentry.foxentrysdk.models.FixFormatGlobal by _0,
      LocationValidationResponseSuggestionsFixes

  data class FixSyntaxGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxGlobal) :
      com.foxentry.foxentrysdk.models.FixSyntaxGlobal by _0,
      LocationValidationResponseSuggestionsFixes

  data class FixSyntaxLocation(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixSyntaxLocation
  ) :
      com.foxentry.foxentrysdk.models.FixSyntaxLocation by _0,
      LocationValidationResponseSuggestionsFixes

  data class FixValueGlobal(@JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixValueGlobal) :
      com.foxentry.foxentrysdk.models.FixValueGlobal by _0,
      LocationValidationResponseSuggestionsFixes

  data class FixValueLocation(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.FixValueLocation
  ) :
      com.foxentry.foxentrysdk.models.FixValueLocation by _0,
      LocationValidationResponseSuggestionsFixes
}

class LocationValidationResponseSuggestionsErrorsDeserializer :
    StdDeserializer<LocationValidationResponseSuggestionsErrors>(
        LocationValidationResponseSuggestionsErrors::class.java) {
  override fun deserialize(
      p: JsonParser?,
      ctx: DeserializationContext?
  ): LocationValidationResponseSuggestionsErrors {
    val node = p?.codec?.readTree<JsonNode>(p)
    val mapper = ObjectMapper().registerKotlinModule()
    var firstError: Exception? = null
    try {
      return LocationValidationResponseSuggestionsErrors.ErrorSyntaxGlobal(
          mapper.convertValue(node, ErrorSyntaxGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseSuggestionsErrors.ErrorSyntaxLocation(
          mapper.convertValue(node, ErrorSyntaxLocation::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseSuggestionsErrors.ErrorFormatGlobal(
          mapper.convertValue(node, ErrorFormatGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    try {
      return LocationValidationResponseSuggestionsErrors.ErrorValueGlobal(
          mapper.convertValue(node, ErrorValueGlobal::class.java))
    } catch (e: Exception) {
      firstError = firstError ?: e
    }
    throw firstError!!
  }
}

@JsonDeserialize(using = LocationValidationResponseSuggestionsErrorsDeserializer::class)
sealed interface LocationValidationResponseSuggestionsErrors {
  data class ErrorSyntaxGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxGlobal by _0,
      LocationValidationResponseSuggestionsErrors

  data class ErrorSyntaxLocation(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorSyntaxLocation
  ) :
      com.foxentry.foxentrysdk.models.ErrorSyntaxLocation by _0,
      LocationValidationResponseSuggestionsErrors

  data class ErrorFormatGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorFormatGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorFormatGlobal by _0,
      LocationValidationResponseSuggestionsErrors

  data class ErrorValueGlobal(
      @JsonIgnore val _0: com.foxentry.foxentrysdk.models.ErrorValueGlobal
  ) :
      com.foxentry.foxentrysdk.models.ErrorValueGlobal by _0,
      LocationValidationResponseSuggestionsErrors
}
