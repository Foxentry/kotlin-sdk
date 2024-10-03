/**
 * Foxentry API reference
 *
 * The version of the OpenAPI document: 2.0 Contact: info@foxentry.com
 *
 * NOTE: This file is auto generated. Do not edit the file manually.
 */
package com.foxentry.foxentrysdk

import com.foxentry.foxentrysdk.core.*
import com.foxentry.foxentrysdk.models.*
import com.foxentry.foxentrysdk.services.*

class FoxentrySdk(val config: Config) {
  val Company: CompanyService = CompanyService(config)
  val Email: EmailService = EmailService(config)
  val Location: LocationService = LocationService(config)
  val Name: NameService = NameService(config)
  val Phone: PhoneService = PhoneService(config)
}
