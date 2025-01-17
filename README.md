<div align='center' class='text-center'>
  <img alt='' src='./assets/logo.png' width='200' />
  <h1 align='center' class='text-center'>com.foxentry.foxentrysdk</h1>
</div>

<div align='center' class='text-center'>
  <a aria-label='Version' href='#'>
    <img alt='' src='https://img.shields.io/badge/version-1.0.0-blue' />
  </a>
  <a aria-label='License' href='https://opensource.org/licenses/MIT'>
    <img alt='' src='https://img.shields.io/badge/License-MIT-blue.svg' />
  </a>
</div>

<!---
Repository badges to consider: (https://github.com/aleen42/badges)
  a. [![Build Status](https://travis-ci.com/username/repository.svg?branch=master)](https://travis-ci.com/)
  b. [![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
  c. [![Version](https://img.shields.io/badge/version-1.0.0-blue.svg)]()
  d. [![Downloads](https://img.shields.io/badge/downloads-1000%2Fmonth-brightgreen.svg)]()
  e. [![Contributors](https://img.shields.io/github/contributors/username/repository.svg)]()
--->

Welcome to our com.foxentry.foxentrysdk. We are committed to providing you with the best SDK services experience possible. Please use our step-by-step instructions to become familiar with how to use our SDK.

- Current API version: 2.0
- Current package version: 1.0.0

## Table of Contents

- [Requirements](#requirements)
- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)
- [Frequently Asked Questions (FAQ)](#frequently-asked-questions-faq)

## Requirements

<!--- Instructions on what the user must do before using the SDK. --->

- Installed Java, stable version >= 17. If you do not have it installed, please refer to the [Oracle website](https://www.oracle.com/java/technologies/downloads/#java17).
- Foxentry.com API credentials.

## Installation

<!--- Instructions on how to install and set up the SDK.--->

Use this command to install com.foxentry.foxentrysdk in your terminal.

### Linux/macOS

```bash
./mvnw install
```

### Windows

```bash
./mvnw.cmd install
```

## Usage

<!--- Description how users can use the SDK.--->

In case that you successfully installed our com.foxentry.foxentrysdk please execute this code:

```kotlin
import com.foxentry.foxentrysdk

fun main(args: Array<String>) {
  var config = Config(token = "YOUR_API_KEY"),
  val sdk = FoxentrySdk(config)

  sdk.CompanyService.validateCompanyData(/* query parameters */)
}
```

## Features

<!--- Highlighting the key features and capabilities of the SDK. --->

Kindly note that every URI is relative to _https://api.foxentry.com_.

The table displays all features categorized based on their specific purposes.

| Class                         | Method                   | HTTP request                | Description            |
| ----------------------------- | ------------------------ | --------------------------- | ---------------------- |
| _FoxentrySdk.CompanyService_  | **validateCompanyData**  | **POST** /company/validate  | Validate company data  |
| _FoxentrySdk.CompanyService_  | **companySearch**        | **POST** /company/search    | Search company         |
| _FoxentrySdk.CompanyService_  | **getCompanyData**       | **POST** /company/get       | Get company data       |
| _FoxentrySdk.EmailService_    | **validateEmail**        | **POST** /email/validate    | Validate email         |
| _FoxentrySdk.EmailService_    | **emailSearch**          | **POST** /email/search      | Search email           |
| _FoxentrySdk.LocationService_ | **locationValidation**   | **POST** /location/validate | Validate location data |
| _FoxentrySdk.LocationService_ | **locationSearch**       | **POST** /location/search   | Search location        |
| _FoxentrySdk.LocationService_ | **locationGet**          | **POST** /location/get      | Get location data      |
| _FoxentrySdk.LocationService_ | **locationLocalization** | **POST** /location/localize | Localization           |
| _FoxentrySdk.NameService_     | **nameValidation**       | **POST** /name/validate     | Validate name data     |
| _FoxentrySdk.PhoneService_    | **validatePhoneNumber**  | **POST** /phone/validate    | Validate phone number  |

## Contributing

<!--- Explaining how users can contribute to the project. Include guidelines for bug reports, feature requests, and pull requests.--->

To learn more about the possibility of contributing to the subsequent development of this SDK, please visit our [contributing page](./CONTRIBUTING.md). Kindly note that contributions are limited by a unique set of rules in order to ensure clarity.

## License

<!--- Including the license information for your project and the specification of the license type (e.g., MIT, Apache 2.0). --->

Please refer to the [license page](./LICENSE) for more information about the license type and the corresponding terms of use.

## Contact

<!--- Providing contact information or links to relevant communication channels (e.g., email, Slack, Gitter).--->

We kindly request that you direct all questions to our support email:

- [info@foxentry.com](mailto:info@foxentry.com)

## Frequently Asked Questions (FAQ)

<!--- Including a section addressing frequently asked questions about the SDK.--->

<!---  Questions that can be prefilled
What are the main functions or features supported by the SDK?
Are there any examples or tutorials to help me understand how to use the SDK effectively?
How can I get help or assistance if I encounter issues while using the SDK?
How often is the SDK updated, and how can users stay informed about updates?
Are there any best practices recommended for maintaining security while using the SDK?
What are the licensing terms for using the SDK?
--->
