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

@JsonDeserialize(`as` = CompanyResultsResponseResultsImpl::class)
interface CompanyResultsResponseResults {
  val data: CompanyResultsResponseResultsData
}

data class CompanyResultsResponseResultsImpl(
    override val data: CompanyResultsResponseResultsData,
) : CompanyResultsResponseResults

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataImpl::class)
interface CompanyResultsResponseResultsData {
  val country: String?
  val uuid: String?
  val name: String?
  val registrationNumber: String?
  val taxNumber: String?
  val vatNumber: String?
  val vatNumberSpecial: String?
  val address: CompanyResultsResponseResultsDataAddress?
  val addressOfficial: CompanyResultsResponseResultsDataAddressOfficial?
  val nace: List<CompanyResultsResponseResultsDataNace?>?
  val databoxes: List<CompanyResultsResponseResultsDataDataboxes?>?
  val registrations: List<CompanyResultsResponseResultsDataRegistrations?>?
  val legalForm: CompanyResultsResponseResultsDataLegalForm?
  val legalFormSpecific: CompanyResultsResponseResultsDataLegalFormSpecific?
  val esa2010: CompanyResultsResponseResultsDataEsa2010?
  val dates: CompanyResultsResponseResultsDataDates?
  val employees: CompanyResultsResponseResultsDataEmployees?
  val insolvency: CompanyResultsResponseResultsDataInsolvency?
  val businessPremises: List<CompanyResultsResponseResultsDataBusinessPremises?>?
  val authority: List<CompanyResultsResponseResultsDataAuthority?>?
  val capital: CompanyResultsResponseResultsDataCapital?
  val tradeLicences: List<CompanyResultsResponseResultsDataTradeLicences?>?
  val vat: CompanyResultsResponseResultsDataVat?
}

data class CompanyResultsResponseResultsDataImpl(
    override val country: String?,
    override val uuid: String?,
    override val name: String?,
    override val registrationNumber: String?,
    override val taxNumber: String?,
    override val vatNumber: String?,
    override val vatNumberSpecial: String?,
    override val address: CompanyResultsResponseResultsDataAddress?,
    override val addressOfficial: CompanyResultsResponseResultsDataAddressOfficial?,
    override val nace: List<CompanyResultsResponseResultsDataNace?>?,
    override val databoxes: List<CompanyResultsResponseResultsDataDataboxes?>?,
    override val registrations: List<CompanyResultsResponseResultsDataRegistrations?>?,
    override val legalForm: CompanyResultsResponseResultsDataLegalForm?,
    override val legalFormSpecific: CompanyResultsResponseResultsDataLegalFormSpecific?,
    override val esa2010: CompanyResultsResponseResultsDataEsa2010?,
    override val dates: CompanyResultsResponseResultsDataDates?,
    override val employees: CompanyResultsResponseResultsDataEmployees?,
    override val insolvency: CompanyResultsResponseResultsDataInsolvency?,
    override val businessPremises: List<CompanyResultsResponseResultsDataBusinessPremises?>?,
    override val authority: List<CompanyResultsResponseResultsDataAuthority?>?,
    override val capital: CompanyResultsResponseResultsDataCapital?,
    override val tradeLicences: List<CompanyResultsResponseResultsDataTradeLicences?>?,
    override val vat: CompanyResultsResponseResultsDataVat?,
) : CompanyResultsResponseResultsData
/** Address data */
@JsonDeserialize(`as` = CompanyResultsResponseResultsDataAddressImpl::class)
interface CompanyResultsResponseResultsDataAddress {
  val data: LocationData?
}

data class CompanyResultsResponseResultsDataAddressImpl(
    override val data: LocationData?,
) : CompanyResultsResponseResultsDataAddress

typealias CompanyResultsResponseResultsDataAddressOfficial = LocationOficial

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataNaceImpl::class)
interface CompanyResultsResponseResultsDataNace {
  val code: String?
  val name: String?
  val isPrimary: Boolean?
}

data class CompanyResultsResponseResultsDataNaceImpl(
    override val code: String?,
    override val name: String?,
    override val isPrimary: Boolean?,
) : CompanyResultsResponseResultsDataNace

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataDataboxesImpl::class)
interface CompanyResultsResponseResultsDataDataboxes {
  val code: String?
  val name: String?
  val receivingMessages: Boolean?
}

data class CompanyResultsResponseResultsDataDataboxesImpl(
    override val code: String?,
    override val name: String?,
    override val receivingMessages: Boolean?,
) : CompanyResultsResponseResultsDataDataboxes

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataRegistrationsImpl::class)
interface CompanyResultsResponseResultsDataRegistrations {
  val type: CompanyResultsResponseResultsDataRegistrationsType?
  val data: CompanyResultsResponseResultsDataRegistrationsData?
}

data class CompanyResultsResponseResultsDataRegistrationsImpl(
    override val type: CompanyResultsResponseResultsDataRegistrationsType?,
    override val data: CompanyResultsResponseResultsDataRegistrationsData?,
) : CompanyResultsResponseResultsDataRegistrations
/** Type of registration. */
enum class CompanyResultsResponseResultsDataRegistrationsType(@JsonValue val value: String) {
  BUSINESS_REGISTER("businessRegister"),
  VAT_REGISTER("vatRegister"),
}

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataRegistrationsDataImpl::class)
interface CompanyResultsResponseResultsDataRegistrationsData {
  val registrator: CompanyResultsResponseResultsDataRegistrationsDataRegistrator?
  val reference: String?
}

data class CompanyResultsResponseResultsDataRegistrationsDataImpl(
    override val registrator: CompanyResultsResponseResultsDataRegistrationsDataRegistrator?,
    override val reference: String?,
) : CompanyResultsResponseResultsDataRegistrationsData
/** Information about registrator. */
@JsonDeserialize(`as` = CompanyResultsResponseResultsDataRegistrationsDataRegistratorImpl::class)
interface CompanyResultsResponseResultsDataRegistrationsDataRegistrator {
  val name: String?
  val detail: String?
}

data class CompanyResultsResponseResultsDataRegistrationsDataRegistratorImpl(
    override val name: String?,
    override val detail: String?,
) : CompanyResultsResponseResultsDataRegistrationsDataRegistrator

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataLegalFormImpl::class)
interface CompanyResultsResponseResultsDataLegalForm {
  val code: String?
  val name: String?
}

data class CompanyResultsResponseResultsDataLegalFormImpl(
    override val code: String?,
    override val name: String?,
) : CompanyResultsResponseResultsDataLegalForm
/** Specific cases of legalForm. */
@JsonDeserialize(`as` = CompanyResultsResponseResultsDataLegalFormSpecificImpl::class)
interface CompanyResultsResponseResultsDataLegalFormSpecific {
  val code: String?
  val name: String?
}

data class CompanyResultsResponseResultsDataLegalFormSpecificImpl(
    override val code: String?,
    override val name: String?,
) : CompanyResultsResponseResultsDataLegalFormSpecific
/** The European System of National and Regional Accounts. */
@JsonDeserialize(`as` = CompanyResultsResponseResultsDataEsa2010Impl::class)
interface CompanyResultsResponseResultsDataEsa2010 {
  val code: String?
  val name: String?
}

data class CompanyResultsResponseResultsDataEsa2010Impl(
    override val code: String?,
    override val name: String?,
) : CompanyResultsResponseResultsDataEsa2010
/** Important dates associated with company. */
@JsonDeserialize(`as` = CompanyResultsResponseResultsDataDatesImpl::class)
interface CompanyResultsResponseResultsDataDates {
  val created: String?
  val terminated: String?
}

data class CompanyResultsResponseResultsDataDatesImpl(
    override val created: String?,
    override val terminated: String?,
) : CompanyResultsResponseResultsDataDates
/** Employees information. */
@JsonDeserialize(`as` = CompanyResultsResponseResultsDataEmployeesImpl::class)
interface CompanyResultsResponseResultsDataEmployees {
  val count: Double?
  val category: String?
}

data class CompanyResultsResponseResultsDataEmployeesImpl(
    override val count: Double?,
    override val category: String?,
) : CompanyResultsResponseResultsDataEmployees
/** Company insolvency status with history */
@JsonDeserialize(`as` = CompanyResultsResponseResultsDataInsolvencyImpl::class)
interface CompanyResultsResponseResultsDataInsolvency {
  val history: List<CompanyResultsResponseResultsDataInsolvencyHistory?>?
}

data class CompanyResultsResponseResultsDataInsolvencyImpl(
    override val history: List<CompanyResultsResponseResultsDataInsolvencyHistory?>?,
) : CompanyResultsResponseResultsDataInsolvency

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataInsolvencyHistoryImpl::class)
interface CompanyResultsResponseResultsDataInsolvencyHistory {
  val reference: String?
  val dateFrom: String?
  val dateTo: String?
  val court: CompanyResultsResponseResultsDataInsolvencyHistoryCourt?
  val status: String?
  val detailUrl: String?
}

data class CompanyResultsResponseResultsDataInsolvencyHistoryImpl(
    override val reference: String?,
    override val dateFrom: String?,
    override val dateTo: String?,
    override val court: CompanyResultsResponseResultsDataInsolvencyHistoryCourt?,
    override val status: String?,
    override val detailUrl: String?,
) : CompanyResultsResponseResultsDataInsolvencyHistory

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataInsolvencyHistoryCourtImpl::class)
interface CompanyResultsResponseResultsDataInsolvencyHistoryCourt {
  val name: String?
}

data class CompanyResultsResponseResultsDataInsolvencyHistoryCourtImpl(
    override val name: String?,
) : CompanyResultsResponseResultsDataInsolvencyHistoryCourt

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataBusinessPremisesImpl::class)
interface CompanyResultsResponseResultsDataBusinessPremises {
  val label: String?
  val address: CompanyResultsResponseResultsDataBusinessPremisesAddress?
  val activitySubjects: String?
}

data class CompanyResultsResponseResultsDataBusinessPremisesImpl(
    override val label: String?,
    override val address: CompanyResultsResponseResultsDataBusinessPremisesAddress?,
    override val activitySubjects: String?,
) : CompanyResultsResponseResultsDataBusinessPremises

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataBusinessPremisesAddressImpl::class)
interface CompanyResultsResponseResultsDataBusinessPremisesAddress {
  val full: String?
}

data class CompanyResultsResponseResultsDataBusinessPremisesAddressImpl(
    override val full: String?,
) : CompanyResultsResponseResultsDataBusinessPremisesAddress

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataAuthorityImpl::class)
interface CompanyResultsResponseResultsDataAuthority {
  val name: String?
  val members: List<CompanyResultsResponseResultsDataAuthorityMembers?>?
  val decisions: List<String?>?
}

data class CompanyResultsResponseResultsDataAuthorityImpl(
    override val name: String?,
    override val members: List<CompanyResultsResponseResultsDataAuthorityMembers?>?,
    override val decisions: List<String?>?,
) : CompanyResultsResponseResultsDataAuthority

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataAuthorityMembersImpl::class)
interface CompanyResultsResponseResultsDataAuthorityMembers {
  val name: String?
  val address: CompanyResultsResponseResultsDataAuthorityMembersAddress?
  val addressOficial: LocationOficial?
  val function: String?
  val birthDate: String?
  val registrationNumber: Double?
}

data class CompanyResultsResponseResultsDataAuthorityMembersImpl(
    override val name: String?,
    override val address: CompanyResultsResponseResultsDataAuthorityMembersAddress?,
    override val addressOficial: LocationOficial?,
    override val function: String?,
    override val birthDate: String?,
    override val registrationNumber: Double?,
) : CompanyResultsResponseResultsDataAuthorityMembers

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataAuthorityMembersAddressImpl::class)
interface CompanyResultsResponseResultsDataAuthorityMembersAddress {
  val data: LocationData?
}

data class CompanyResultsResponseResultsDataAuthorityMembersAddressImpl(
    override val data: LocationData?,
) : CompanyResultsResponseResultsDataAuthorityMembersAddress
/** Company's funding */
@JsonDeserialize(`as` = CompanyResultsResponseResultsDataCapitalImpl::class)
interface CompanyResultsResponseResultsDataCapital {
  val value: CompanyResultsResponseResultsDataCapitalValue?
  val shareholders: List<CompanyResultsResponseResultsDataCapitalShareholders?>?
  val stocks: List<String?>?
}

data class CompanyResultsResponseResultsDataCapitalImpl(
    override val value: CompanyResultsResponseResultsDataCapitalValue?,
    override val shareholders: List<CompanyResultsResponseResultsDataCapitalShareholders?>?,
    override val stocks: List<String?>?,
) : CompanyResultsResponseResultsDataCapital

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataCapitalValueImpl::class)
interface CompanyResultsResponseResultsDataCapitalValue {
  val amount: String?
  val currency: String?
}

data class CompanyResultsResponseResultsDataCapitalValueImpl(
    override val amount: String?,
    override val currency: String?,
) : CompanyResultsResponseResultsDataCapitalValue

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataCapitalShareholdersImpl::class)
interface CompanyResultsResponseResultsDataCapitalShareholders {
  val shareholder: String?
  val share: CompanyResultsResponseResultsDataCapitalShareholdersShare?
  val info: List<String?>?
}

data class CompanyResultsResponseResultsDataCapitalShareholdersImpl(
    override val shareholder: String?,
    override val share: CompanyResultsResponseResultsDataCapitalShareholdersShare?,
    override val info: List<String?>?,
) : CompanyResultsResponseResultsDataCapitalShareholders

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataCapitalShareholdersShareImpl::class)
interface CompanyResultsResponseResultsDataCapitalShareholdersShare {
  val amount: String?
  val currency: String?
  val percent: String?
  val percentPaid: String?
}

data class CompanyResultsResponseResultsDataCapitalShareholdersShareImpl(
    override val amount: String?,
    override val currency: String?,
    override val percent: String?,
    override val percentPaid: String?,
) : CompanyResultsResponseResultsDataCapitalShareholdersShare

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataTradeLicencesImpl::class)
interface CompanyResultsResponseResultsDataTradeLicences {
  val type: String?
  val name: String?
  val valid: CompanyResultsResponseResultsDataTradeLicencesValid?
  val interrupted: CompanyResultsResponseResultsDataTradeLicencesInterrupted?
  val responsiblePerson: String?
  val activitySubject: List<String?>?
}

data class CompanyResultsResponseResultsDataTradeLicencesImpl(
    override val type: String?,
    override val name: String?,
    override val valid: CompanyResultsResponseResultsDataTradeLicencesValid?,
    override val interrupted: CompanyResultsResponseResultsDataTradeLicencesInterrupted?,
    override val responsiblePerson: String?,
    override val activitySubject: List<String?>?,
) : CompanyResultsResponseResultsDataTradeLicences

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataTradeLicencesValidImpl::class)
interface CompanyResultsResponseResultsDataTradeLicencesValid {
  val from: String?
  val fromText: String?
  val to: String?
  val toText: String?
}

data class CompanyResultsResponseResultsDataTradeLicencesValidImpl(
    override val from: String?,
    override val fromText: String?,
    override val to: String?,
    override val toText: String?,
) : CompanyResultsResponseResultsDataTradeLicencesValid
/** Dates of interuption. */
@JsonDeserialize(`as` = CompanyResultsResponseResultsDataTradeLicencesInterruptedImpl::class)
interface CompanyResultsResponseResultsDataTradeLicencesInterrupted {
  val from: String?
  val to: String?
}

data class CompanyResultsResponseResultsDataTradeLicencesInterruptedImpl(
    override val from: String?,
    override val to: String?,
) : CompanyResultsResponseResultsDataTradeLicencesInterrupted
/** Vat payer information. */
@JsonDeserialize(`as` = CompanyResultsResponseResultsDataVatImpl::class)
interface CompanyResultsResponseResultsDataVat {
  val status: CompanyResultsResponseResultsDataVatStatus?
  val reliability: CompanyResultsResponseResultsDataVatReliability?
  val bankAccounts: List<CompanyResultsResponseResultsDataVatBankAccounts?>?
  val history: List<CompanyResultsResponseResultsDataVatHistory?>?
}

data class CompanyResultsResponseResultsDataVatImpl(
    override val status: CompanyResultsResponseResultsDataVatStatus?,
    override val reliability: CompanyResultsResponseResultsDataVatReliability?,
    override val bankAccounts: List<CompanyResultsResponseResultsDataVatBankAccounts?>?,
    override val history: List<CompanyResultsResponseResultsDataVatHistory?>?,
) : CompanyResultsResponseResultsDataVat
/**
 * Vat current status. Payer, non payer and subject. Subject means the company is a VAT payer only
 * for non domestic transactions (identifikovaná osoba).
 */
enum class CompanyResultsResponseResultsDataVatStatus(@JsonValue val value: String) {
  PAYER("payer"),
  NONPAYER("nonpayer"),
  SUBJECT("subject"),
}
/** Reliability of the VAT payer. */
@JsonDeserialize(`as` = CompanyResultsResponseResultsDataVatReliabilityImpl::class)
interface CompanyResultsResponseResultsDataVatReliability {
  val reliable: Boolean?
  val unreliableFrom: String?
}

data class CompanyResultsResponseResultsDataVatReliabilityImpl(
    override val reliable: Boolean?,
    override val unreliableFrom: String?,
) : CompanyResultsResponseResultsDataVatReliability

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataVatBankAccountsImpl::class)
interface CompanyResultsResponseResultsDataVatBankAccounts {
  val number: String?
}

data class CompanyResultsResponseResultsDataVatBankAccountsImpl(
    override val number: String?,
) : CompanyResultsResponseResultsDataVatBankAccounts

@JsonDeserialize(`as` = CompanyResultsResponseResultsDataVatHistoryImpl::class)
interface CompanyResultsResponseResultsDataVatHistory {
  val vatNumber: String?
  val registrationType: String?
  val validFrom: String?
  val validTo: String?
  val isGroupRegistration: Boolean?
}

data class CompanyResultsResponseResultsDataVatHistoryImpl(
    override val vatNumber: String?,
    override val registrationType: String?,
    override val validFrom: String?,
    override val validTo: String?,
    override val isGroupRegistration: Boolean?,
) : CompanyResultsResponseResultsDataVatHistory
