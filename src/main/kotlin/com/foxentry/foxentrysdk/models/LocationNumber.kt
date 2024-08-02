/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk.models

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.foxentry.foxentrysdk.core.*

@JsonDeserialize(`as` = LocationNumberImpl::class)
interface LocationNumber {
  val part1: String?
  val part1Number: String?
  val part1Letter: String?
  val part2: String?
  val part2Number: String?
  val part2Letter: String?
  val full: String?
}

data class LocationNumberImpl(
    override val part1: String?,
    override val part1Number: String?,
    override val part1Letter: String?,
    override val part2: String?,
    override val part2Number: String?,
    override val part2Letter: String?,
    override val full: String?,
) : LocationNumber
