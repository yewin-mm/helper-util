# helper-util
<!-- PROJECT SHIELDS -->

<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/yewin-mm/helper-util.svg?style=for-the-badge
[contributors-url]: https://github.com/yewin-mm/helper-util/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/yewin-mm/helper-util.svg?style=for-the-badge
[forks-url]: https://github.com/yewin-mm/helper-util/network/members
[stars-shield]: https://img.shields.io/github/stars/yewin-mm/helper-util.svg?style=for-the-badge
[stars-url]: https://github.com/yewin-mm/helper-util/stargazers
[issues-shield]: https://img.shields.io/github/issues/yewin-mm/helper-util.svg?style=for-the-badge
[issues-url]: https://github.com/yewin-mm/helper-util/issues
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/ye-win-1a33a292/


<h3 align="center">
Overview
<img src="https://github.com/yewin-mm/helper-util/blob/master/github/template/images/overview/helper_util.png" /><br/>
</h3>

# helper-util
This is a lightweight java utility library to help our java projects as an assistant helper utility.<br>
See the [Instruction](#instruction) section for the usage.

<!-- TABLE OF CONTENTS -->
## Table of Contents
- [About The Project](#about-the-project)
    - [Built With](#built-with)
- [Getting Started](#getting-started)
    - [Before you begin](#before-you-begin)
    - [Clone Project](#clone-project)
    - [Prerequisites](#prerequisites)
    - [Instruction](#instruction)
        -  [Add Dependency](#add-dependency) 
        -  [Usage](#usage)
            -  [CommonUtil](#commonutil)
            -  [ValidationUtil](#validationutil)
            -  [PasswordUtil](#passwordutil)
            -  [DateTimeUtil](#datetimeutil)
            -  [ResponseUtil](#responseutil)
            -  [ConstantUtil](#constantutil)
- [Contact Me](#contact)
- [Becoming a Sponsor](#becoming-a-sponsor)
- [Contributing](#Contributing)


<a name="about-the-project"></a>
## ⚡️About The Project
* This is a lightweight java utility library to help our java projects as an assistant helper.
* There are many common methods which you can use in your projects through below helping classes.
1. CommonUtil class
2. ValidationUtil class
3. PasswordUtil class
4. DateTimeUtil class
5. ResponseUtil class
6. ConstantUtil class
See the [Instruction](#instruction) section for the usages.

<a name="built-with"></a>
### 🪓 Built With
This project is built with
* [Java](https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)


<a name="getting-started"></a>
## 🔥 Getting Started
This project purpose is to help our daily java applications by common methods.
You can use this helper utility by adding as dependency in your pom file.


<a name="before-you-begin"></a>
### 🔔 Before you begin
You should know about basic java and maven knowledge first. 

<a name="clone-project"></a>
### 🥡 Clone Project
* If you want to check my code or contribute, you can clone the project with below command.
* If you just want to use my library, you don't need to clone and please add the dependency as shown in below [instruction](#instruction) section.
   ```sh
   git clone https://github.com/yewin-mm/helper-util.git
  
   ```

<a name="prerequisites"></a>
### 🔑 Prerequisites
Set up maven and java in your machine.

<a name="instruction"></a>
### 📝 Instruction

<a name="add-dependency"></a>
#### Add Dependency
* Firstly, add this dependency inside your `pom.xml` file in your java maven project.
* Please check out the latest version in here, [maven-central-repository](https://central.sonatype.com/artifact/io.github.yewin-mm/helper-util/)
   ```sh
    <dependency>
      <groupId>io.github.yewin-mm</groupId>
      <artifactId>helper-util</artifactId>
      <version>1.0.5</version>
    </dependency>
   ```

* Copy above dependency and add inside `<dependencies> <dependencies>` tag in your `pom.xml` file.
* Refresh or Reload your maven pom file. 
* You can check out this library is already in your project or not by checking under External Libraries folder.
* After successfully adding this library in your application, you can use start to use methods in that library.

<a name="usage"></a>
#### Usage
* There are six utility classes to use.
1. CommonUtil      -> To use some common method like get integer length, printing out, etc.
2. ValidationUtil  -> To validate like empty String, email validation, empty Collection, etc.
3. PasswordUtil    -> To encode and verify password.
4. DateTimeUtil    -> To get datetime as per zoneId, two dates different, etc.
5. ResponseUtil    -> To get formatted microservice response object.
6. ConstantUtil    -> To use some common constant like error message, info message, etc.

<a name="commonutil"></a>
##### CommonUtil
* Here are the sample usage for `CommonUtil class` that you can apply in your application.

```java

    String greeting = "hello world";

    CommonUtil.printInfo("print hello world"); // no param
    CommonUtil.printInfo("print hello: {}", greeting); // one param
    CommonUtil.printInfo(greeting, YOUR_LOGGER); // no param and print using your logger
    CommonUtil.printInfo("print hello: {}", greeting, YOUR_LOGGER); // one param and print using your logger

    /** you can use other logger methods like below as well. */
    // CommonUtil.printWarn();
    // CommonUtil.printError();
    // CommonUtil.printDebug();

    List<String> testList = List.of("value1", "value2");
    testList = null; // make testList to be null for testing purpose.

    for(String testValue : CommonUtil.safeList(testList)){ // we can use safeList to avoid NullPointerException
        CommonUtil.printInfo(testValue);
    }

    Set<String> testSet = Set.of("value1", "value2");
    testSet = null; // make testSet to be null for testing purpose.

    for(String testValue : CommonUtil.safeSet(testSet)){ // we can use safeSet to avoid NullPointerException
        CommonUtil.printInfo(testValue);
    }

    int count = 35; // this is demo data and that value might get from request or anywhere

    int length = CommonUtil.getNumberLength(count); // get NumberLength and you can use long as well

    CommonUtil.printInfo("length of input is {}", String.valueOf(length)); // use printInfo method
    // sample output at console -> 13:22:32.667 [main] INFO helper.CommonUtil -- length of input is 2

    if(length > 5){ // example condition
        // do your process
    }else {
        // do your process
    }

```

<a name="validationutil"></a>
##### ValidationUtil
* Here are the sample usage for `ValidationUtil class` that you can apply in your application.

```java

    String name = ""; // this is demo data and that value might get from request or anywhere
    if(ValidationUtil.isEmptyString(name)){ // isEmptyString method with one param
        
        // here, I used print warn method with two params from CommonUtil class.
        CommonUtil.printWarn("input is null or empty, input: {}", name);

        // do your process like returning error or etc... when input is null or empty

    }else {
        // do your process when the input has data
    }


    String name1 = null; // this is demo data and that value might get from request or anywhere
    if(!ValidationUtil.isEmptyString(name1, "name1")){  // isEmptyString method with two params for printing logs
        // do your process when the input has data
    }
    // auto printing at console if you use two params methods
    // sample output at console -> 12:51:55.001 [main] WARN helper.ValidationUtil -- name1 is null or empty, input: null


    List<String> itemList = new ArrayList<>(); // this is demo data and that value might get from request or anywhere
    if(ValidationUtil.isEmptyCollection(itemList)){ // isEmptyCollection method with one param (you can also use isEmptyList method)

        // here, I used print warn method with one param from CommonUtil class.
        CommonUtil.printWarn("input list is null or empty, input: "+ itemList);
        
        // do your process like returning error or etc... when input is null or empty

    }else {
        // do your process when the input has data
    }


    List<String> itemList1 = new ArrayList<>(); // this is demo data and that value might get from request or anywhere
    if(!ValidationUtil.isEmptyCollection(itemList1, "itemList data")){ // isEmptyCollection method with two params for printing logs (you can also use isEmptyList method)
        // do your process when the input has data
    }
    // auto printing at console if you use two params methods
    // sample output at console -> 13:00:53.468 [main] WARN helper.ValidationUtil -- itemList data is null or empty, input: []
            
    /** you can use Set instead of List */
    

    String email = "aa@"; // this is demo data and that value might get from request or anywhere
    if(ValidationUtil.isValidEmail(email)){
        // do your process when the email is valid format
    }else {
        // do your process like returning error or etc... when the email is not valid format
        CommonUtil.printWarn("input email is not valid, input: {}", email);
    }


    String email1 = "a@c"; // this is demo data and that value might get from request or anywhere
    if(ValidationUtil.isValidEmail(email1, "email1")){
        // do your process when the email is valid format
    }
    // sample output at console -> 13:03:38.223 [main] WARN helper.ValidationUtil -- email1 is invalid format, input: a@c


    int count = -1; // this is demo data and that value might get from request or anywhere
    if(ValidationUtil.isPositiveNumber(count)){
        // do your process when the input is positive number
    }else {
        // do your process like returning error or etc... when the input is not positive number
        CommonUtil.printWarn("input is not positive, input: "+ count);
    }


    int count1 = -2; // this is demo data and that value might get from request or anywhere
    if(ValidationUtil.isPositiveNumber(count1, "count1")){
        // do your process when the input is positive number
    }
    // sample output at console -> 13:12:59.520 [main] WARN helper.ValidationUtil -- count1 is null or not positive number, input: -2
    /** you can use long instead of int. */

```

<a name="passwordutil"></a>
##### PasswordUtil
* Here are the sample usage for `PasswordUtil class` that you can apply in your application.

```java

    String inputPassword = "P@ssw0rd";  // sample data and it might get from register form
    String encodedPassword = encode(inputPassword); // call encode method from PasswordUtil to hash the password
    CommonUtil.printInfo("encodedPassword: {}", encodedPassword); // print console by using printInfo method
    // sample output at console -> 15:21:22.169 [main] INFO helper.CommonUtil -- encodedPassword: J78+7Cbv/IZSyUygAD/BDw$xgiAdngMzyWUzJSmrnW+YM6BGE578TaDGnTeB3+8Vvs

    // do your process like storing the password into database or etc...

    String loginPassword = "P@ssw0rd"; // sample data and it might get from login form
    String encodedDBPassword = "J78+7Cbv/IZSyUygAD/BDw$xgiAdngMzyWUzJSmrnW+YM6BGE578TaDGnTeB3+8Vvs"; // this value might get from database
    boolean match = checkPassword(loginPassword, encodedDBPassword); // call checkPassword method from PasswordUtil to check the login password is match or not
    if(match){ // it will true if two passwords are same
    CommonUtil.printInfo("successful login");
    // do your process eg. approve login
    }else {
    CommonUtil.printWarn("password doesn't match");
    // do your process eg. reject login
    }

```

<a name="datetimeutil"></a>
##### DatetimeUtil
* Here are the sample usage for `DateTimeUtil class` that you can apply in your application.

```java

    Instant instant = Instant.now(); // current datetime
    // this getDateTime method will give you datetime by using java 8 Instant object and zoneId (eg. UTC, etc) and format pattern (eg. "HH:mm:ss dd/MM/yyyy", etc) as param.
    // SAMPLE_FORMATTER is "yyyy-MM-dd HH:mm:ss.SSS" and get that from ConstantUtil class. You can use any string date format pattern here.
    String utcDateTime = DateTimeUtil.getDateTime(instant, "UTC", ConstantUtil.SAMPLE_FORMATTER);
    CommonUtil.printInfo(utcDateTime);  // printInfo is a method to print at console which is in CommonUtil.class
    // sample output -> 21:46:20.780 [main] INFO helper.CommonUtil - 2023-04-22 15:16:20.586

    /**
     * you can add any zone id and dateformat pattern instead of UTC and SAMPLE_FORMATTER as you want
     * ZoneId ref - https://docs.oracle.com/middleware/12211/wcs/tag-ref/MISC/TimeZones.html
     * Pattern ref - https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
     */

    // example of adding custom zoneId and date pattern format
    String mmDateTime = DateTimeUtil.getDateTime(instant, "Asia/Yangon", "HH:mm:ss dd/MM/yyyy");
    CommonUtil.printInfo(mmDateTime);
    // sample output -> 21:46:20.786 [main] INFO helper.CommonUtil - 21:46:20 22/04/2023


    // this currentDateTime method will give you datetime by using zoneId (eg. UTC, etc) as param.
    String currentDateTime = DateTimeUtil.getCurrentDateTime("UTC");
    CommonUtil.printInfo(currentDateTime);
    // sample output -> 21:46:20.787 [main] INFO helper.CommonUtil - 2023-04-22 15:16:20.787

    // this currentDateTime method will give you datetime by using zoneId (eg. UTC, etc) and format pattern (eg. "HH:mm:ss dd/MM/yyyy", etc) as param.
    String currentDateTimeParam = DateTimeUtil.getCurrentDateTime("UTC", "HH:mm:ss dd/MM/yyyy");
    CommonUtil.printInfo(currentDateTimeParam);
    // sample output -> 21:46:20.787 [main] INFO helper.CommonUtil - 15:16:20 22/04/2023

    // this getCurrentUTCDateTime method will give you UTC datetime by using format pattern (eg. "HH:mm:ss dd/MM/yyyy", etc) as param.
    String currentUTCDateTime = DateTimeUtil.getCurrentUTCDateTime("HH:mm:ss dd/MM/yyyy");
    CommonUtil.printInfo(currentUTCDateTime);
    // sample output -> 21:46:20.787 [main] INFO helper.CommonUtil - 15:16:20 22/04/2023

    // this getUTCDateTime method will give you UTC datetime by using java 8 Instant object and format pattern (eg. "HH:mm:ss dd/MM/yyyy", etc) as param.
    String utcDateTimeParam = DateTimeUtil.getUTCDateTime(instant, "HH:mm:ss dd/MM/yyyy");
    CommonUtil.printInfo(utcDateTimeParam);
    // sample output -> 21:46:20.787 [main] INFO helper.CommonUtil - 15:16:20 22/04/2023


    // this getCurrentLocalDateTime method will give your local country datetime
    LocalDateTime currentLocalDateTime = DateTimeUtil.getCurrentLocalDateTime();
    CommonUtil.printInfo(currentLocalDateTime.toString());
    // sample output -> 21:46:20.788 [main] INFO helper.CommonUtil - 2023-04-22T21:46:20.788103

    // this getCurrentLocalTime method will give your local country time
    LocalTime currentLocalTime = DateTimeUtil.getCurrentLocalTime();
    CommonUtil.printInfo(currentLocalTime.toString());
    // sample output -> 21:46:20.789 [main] INFO helper.CommonUtil - 21:46:20.789065

    LocalDateTime localDateTime1 = LocalDateTime.of(2021,6,15,14,50,12);
    LocalDateTime localDateTime2 = LocalDateTime.of(2021,7,17,15,54,15);

    // this differenceDateByMilliSeconds method will give you the milliseconds which is difference between two LocalDateTime objects
    long milliDiff = DateTimeUtil.differenceDateByMilliSeconds(localDateTime1, localDateTime2);
    CommonUtil.printInfo("difference in milliseconds: "+milliDiff);
    // sample output -> 21:46:20.789 [main] INFO helper.CommonUtil - difference in milliseconds: 2768643000

    // this differenceDateBySeconds method will give you the seconds which is difference between two LocalDateTime objects
    long secDiff = DateTimeUtil.differenceDateBySeconds(localDateTime1, localDateTime2);
    CommonUtil.printInfo("difference in seconds: "+secDiff);
    // sample output -> 21:46:20.789 [main] INFO helper.CommonUtil - difference in seconds: 2768643

    // this differenceDateByMinutes method will give you the minutes which is difference between two LocalDateTime objects
    long minDiff = DateTimeUtil.differenceDateByMinutes(localDateTime1, localDateTime2);
    CommonUtil.printInfo("difference in minutes: {}", String.valueOf(minDiff));
    // sample output -> 21:46:20.789 [main] INFO helper.CommonUtil - difference in minutes: 46144 

    // this differenceDateByHours method will give you the hours which is difference between two LocalDateTime objects
    long hourDiff = DateTimeUtil.differenceDateByHours(localDateTime1, localDateTime2);
    CommonUtil.printInfo("difference in hours: {}", String.valueOf(hourDiff));
    // sample output -> 21:46:20.792 [main] INFO helper.CommonUtil - difference in hours: 769

    // this differenceDateByDays method will give you the days which is difference between two LocalDateTime objects
    long dayDiff = DateTimeUtil.differenceDateByDays(localDateTime1, localDateTime2);
    CommonUtil.printInfo("difference in days: {}", String.valueOf(dayDiff));
    // sample output -> 21:46:20.792 [main] INFO helper.CommonUtil - difference in days: 32

    // this differenceDateByMonths method will give you the months which is difference between two LocalDateTime objects
    long monthsDiff = DateTimeUtil.differenceDateByMonths(localDateTime1, localDateTime2);
    CommonUtil.printInfo("difference in months: {}", String.valueOf(monthsDiff));
    // sample output -> 21:46:20.792 [main] INFO helper.CommonUtil - difference in months: 1

    // this differenceDateByYears method will give you the years which is difference between two LocalDateTime objects
    long yearDiff = DateTimeUtil.differenceDateByYears(localDateTime1, localDateTime2);
    CommonUtil.printInfo("difference in years: {}", String.valueOf(yearDiff));
    // sample output -> 21:46:20.793 [main] INFO helper.CommonUtil - difference in years: 0

```

<a name="responseutil"></a>
##### ResponseUtil
* Here are the sample usage for `ResponseUtil class` that you can apply in your application.

```java

    Employee employee = new Employee("Mr.Test", "123456"); // sample pojo class
    ServiceResponse serviceResponse = getResponseObj("SUCCESS", "success", employee, "UTC");
    LOGGER.info("Response data: {}", serviceResponse);
    // sample output -> 15:32:23.516 [main] INFO Test -- Response data: Response{status=Status{status='SUCCESS', message='success'}, data=Employee{name='Mr.Test', phone='123456'}, timestamp='2023-04-21 09:02:23.512'}

```

<a name="constantutil"></a>
##### ConstantUtil
* Here are the sample usage for `ConstantUtil class` that you can apply in your application.

```java

    String errMessage = ConstantUtil.VALUE_IS_EXISTED_MESSAGE; // one of the sample message
    CommonUtil.printWarn(errMessage);
    // sample output -> 21:55:12.402 [main] WARN helper.CommonUtil - Value is already existed.
    /** you can use other constant values, please check out ConstantUtil class*/

```

* Below are constant values


| KEY  			| Value 		                                                        |
| ------------- |-----------------------------------------------------------------|
| SPACE_REGEX  | \\\s*,\\\s*                                                     |
| EMAIL_REGEX  | check inside ConstantUtil class as my email regex included pipe |
| SIGN_REGEX  | \\\\$                                                           |
| SAMPLE_FORMATTER  | yyyy-MM-dd HH:mm:ss.SSS                                         |
| UTC_ZONE_ID  | UTC                                                             |
| MM_ZONE_ID  | Asia/Yangon                                                     |
| SG_ZONE_ID  | Asia/Singapore                                                  |
| INDIA_ZONE_ID  | Asia/Kolkata                                                    |
| VALUE_IS_EXISTED_MESSAGE  | Value is already existed.                                       |
| VALUE_IS_EXISTED_PARAM_MESSAGE  | Value is already existed: {}                                    |
| RECORD_IS_EXISTED_MESSAGE  | Records is already existed.                                     |
| RECORD_IS_EXISTED_PARAM_MESSAGE  | Records is already existed: {}                                  |
| CANNOT_FIND_RECORD_BY_ID_MESSAGE  | Can't find records by id.                                       |
| CANNOT_FIND_RECORD_BY_ID_PARAM_MESSAGE  | Can't find records by id: {}                                    |
| CANNOT_FIND_RECORD_BY_NAME_MESSAGE  | Can't find records by name.                                     |
| CANNOT_FIND_RECORD_BY_NAME_PARAM_MESSAGE  | Can't find records by name: {}                                  |
| CANNOT_FIND_RECORD_BY_VALUE_MESSAGE  | Can't find records by value.                                    |
| CANNOT_FIND_RECORD_BY_VALUE_PARAM_MESSAGE  | Can't find records by value: {}                                 |
| CANNOT_FIND_ANY_RECORD_MESSAGE  | Can't find any records.                                         |
| NO_RECORD_MESSAGE  | There is no record.                                             |
| CANNOT_ADD_RECORD_MESSAGE  | Can't add any records.                                          |
| SUCCESS_ADD_RECORD_MESSAGE  | Successfully added records.                                     |
| INPUT_NULL_OR_EMPTY_MESSAGE  | Input value is null or empty.                                   |
| VALUE_NULL_OR_EMPTY_MESSAGE  | Value is null or empty.                                         |
| INPUT_NULL_OR_EMPTY_PARAM_MESSAGE  | Value is null or empty, input: {}                               |
| VALUE_NULL_OR_EMPTY_PARAM_MESSAGE  | Value is null or empty, value: {}                               |
| NULL_OR_EMPTY_PARAM_MESSAGE  | {} is null or empty, input: {}                                  |
| NULL_OR_NOT_POSITIVE_PARAM_MESSAGE  | {} is null or not positive number, input: {}                    |
| INVALID_FORMAT_MESSAGE  | Invalid format.                                                 |
| INVALID_FORMAT_PARAM_MESSAGE  | {} is invalid format.                                           |
| INVALID_FORMAT_INPUT_PARAM_MESSAGE  | {} is invalid format, input: {}                                 |
| MAXIMUM_REACH  | {} is reach at maximum limit, maximum limit: {}                 |
| ERROR_PARAM_MESSAGE  | Error: {}                                                       |
| INTERNAL_ERROR_MESSAGE  | Internal error.                                                 |
| INTERNAL_SERVER_ERROR_MESSAGE  | Internal server error.                                          |
| GENERAL_ERROR_MESSAGE  | Something went wrong. Please contact to your administrator.     |
| TRY_AGAIN_ERROR_MESSAGE  | Something went wrong. Please try again later.                   |
| CANNOT_CALL_API_MESSAGE  | Can't call the api.                                             |
| CANNOT_CALL_API_PARAM_MESSAGE  | Can't call the api, url: {}                                     |
| CANNOT_LOAD_DATA_MESSAGE  | Can't load the data.                                            |
| SUCCESS_MESSAGE  | SUCCESS                                                         |
| FAIL_MESSAGE  | FAIL                                                            |
| SUCCESSFUL_MESSAGE  | SUCCESSFUL                                                      |
| LOADING_MESSAGE  | LOADING                                                         |
| PENDING_MESSAGE  | PENDING                                                         |
| UNDER_REVIEW_MESSAGE  | UNDER REVIEW                                                    |
| FINISHED_REVIEW_MESSAGE  | FINISHED REVIEW                                                 |
| PROCESSING_MESSAGE  | PROCESSING                                                      |
| ON_GOING_MESSAGE  | ON GOING                                                        |
| PRODUCTION_MESSAGE  | PRODUCTION                                                      |
| GO_LIVE_MESSAGE  | GO LIVE                                                         |
| HOLDING_MESSAGE  | HOLDING                                                         |
| RESTRICT_MESSAGE  | RESTRICT                                                        |
| MAINTAIN_MESSAGE  | MAINTAIN                                                        |
| CLOSE_MESSAGE  | CLOSE                                                           |
| SHUTDOWN_MESSAGE  | SHUTDOWN                                                        |
| SUSPEND_MESSAGE  | SUSPEND                                                         |
| REMOVE_MESSAGE  | REMOVE                                                          |
| DELETE_MESSAGE  | DELETE                                                          |
| SUCCESSFULLY_CREATED_MESSAGE  | Successfully created record.                                    |
| FAIL_CREATE_MESSAGE  | Failed to create record.                                        |
| OK_CODE  | 200                                                             |
| CREATED_CODE  | 201                                                             |
| BAD_REQUEST_CODE  | 400                                                             |
| UNAUTHORIZED_CODE  | 401                                                             |
| FORBIDDEN_CODE  | 403                                                             |
| NOT_FOUND_CODE  | 404                                                             |
| INTERNAL_SERVER_ERROR_CODE  | 500                                                             |
| NOT_IMPLEMENTED_CODE  | 501                                                             |
| SERVICE_UNAVAILABLE_CODE  | 503                                                             |
| INFO  | INFO                                                            |
| WARN  | WARN                                                            |
| DEBUG  | DEBUG                                                           |
| ERROR  | ERROR                                                           |
| ERROR  | ERROR                                                           |
| NUMBER_FIELD  | number                                                          |
| NO_FIELD  | no.                                                             |
| USERNAME_FIELD  | userName                                                        |
| NAME_FIELD  | name                                                            |
| FIRST_NAME_FIELD  | firstName                                                       |
| LAST_NAME_FIELD  | lastName                                                        |
| MIDDLE_NAME_FIELD  | middleName                                                      |
| PASSWORD_FIELD  | password                                                        |
| EMAIL_FIELD  | email                                                           |
| PHONE_NO_FIELD  | phoneNo                                                         |
| PHONE_FIELD  | phone                                                           |
| GENDER_FIELD  | gender                                                          |
| MALE_FIELD  | male                                                            |
| FEMALE_FIELD  | female                                                          |
| AGE_FIELD  | age                                                             |
| CURRENCY_FIELD  | currency                                                        |
| CURRENCY_TYPE_FIELD  | currencyType                                                    |
| USD_FIELD  | usd                                                             |
| BALANCE_FIELD  | balance                                                         |
| AMOUNT_FIELD  | amount                                                          |
| PRICE_FIELD  | price                                                           |
| TOKEN_FIELD  | token                                                           |
| ACCOUNT_FIELD  | account                                                         |
| ACCOUNT_TYPE_FIELD  | accountType                                                     |
| CARD_FIELD  | card                                                            |
| CARD_TYPE_FIELD  | cardType                                                        |
| SERVICE_FIELD  | service                                                         |
| SERVICES_FIELD  | services                                                        |
| SERVICE_TYPE_FIELD  | serviceType                                                     |
| SERVICE_ID_FIELD  | serviceId                                                       |
| LEVEL_FIELD  | level                                                           |
| TYPE_FIELD  | type                                                            |
| CLASS_FIELD  | class                                                           |
| COUNT_FIELD  | count                                                           |
| PRODUCT_FIELD  | product                                                         |
| PRODUCT_NAME_FIELD  | productName                                                     |
| PRODUCT_ID_FIELD  | productId                                                       |
| PROJECT_FIELD  | project                                                         |
| PROJECT_NAME_FIELD  | projectName                                                     |
| ADDRESS_FIELD  | address                                                         |
| COUNTRY_FIELD  | country                                                         |
| COUNTRY_NAME_FIELD  | countryName                                                     |
| CITY_FIELD  | city                                                            |
| CITY_NAME_FIELD  | cityName                                                        |
| TOWNSHIP_FIELD  | township                                                        |
| TOWNSHIP_NAME_FIELD  | townshipName                                                    |
| REGION_FIELD  | region                                                          |
| PROVINCE_FIELD  | province                                                        |
| DISTRICT_FIELD  | district                                                        |
| STATE_FIELD  | state                                                           |
| POSTAL_CODE_FIELD  | postalCode                                                      |
| POSTAL_FIELD  | postal                                                          |
| ZIP_CODE_FIELD  | zipCode                                                         |
| ZIP_FIELD  | zip                                                             |
| URL_FIELD  | url                                                             |
| LINK_FIELD  | link                                                            |
| DETAILS_FIELD  | details                                                         |
| REVIEW_FIELD  | review                                                          |
| REMARKS_FIELD  | remarks                                                         |
| DESCRIPTION_FIELD  | description                                                     |
| MESSAGE_FIELD  | message                                                         |
| MESSAGE_TYPE_FIELD  | messageType                                                     |
| NOTIFICATION_FIELD  | notification                                                    |
| NOTIFICATION_TYPE_FIELD  | notificationType                                                |
| DATE_FIELD  | date                                                            |
| DAY_FIELD  | day                                                             |
| MONTH_FIELD  | month                                                           |
| YEAR_FIELD  | year                                                            |


***Have Fun and Enjoy in Learning Code***


<a name="contact"></a>
## ✉️ Contact Me
Name - Ye Win <br> LinkedIn profile -  [Ye Win](https://www.linkedin.com/in/ye-win-1a33a292/)  <br> Email Address - <a href="mailto:yewin.mmr@gmail.com?">yewin.mmr@gmail.com</a> <br> WhatsApp - [+959252656065](https://wa.me/959252656065?text=Hi) <br> Website - [My Website](https://yewin.me/)

Project Link: [Helper Utility](https://github.com/yewin-mm/helper-util)

## 🥰 Becoming a Sponsor
If you like any of my projects or if you want to support my work, please kindly consider becoming a sponsor. <br>
It gives me great motivation and I can relentlessly maintain my projects and contribute to the open-source community.

<a href="https://www.buymeacoffee.com/yewin" target="_blank"><img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" width="150" ></a>


<a name="contributing"></a>
## ⭐ Contributing
Contributions are what make the open source community such an amazing place to be learnt, inspire, and create. Any contributions you make are **greatly appreciated**.
<br>If you want to contribute....
1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/yourname`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeatures'`)
4. Push to the Branch (`git push -u origin feature/yourname`)
5. Open a Pull Request

