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
            -  [PrintUtil](#printutil)
            -  [CommonUtil](#commonutil)
            -  [ValidationUtil](#validationutil)
            -  [ValidationUtil](#validationutil)
            -  [JsonUtil](#jsonutil)
            -  [PasswordUtil](#passwordutil)
            -  [DateTimeUtil](#datetimeutil)
            -  [ResponseUtil](#responseutil)
            -  [ConstantUtil](#constantutil)
- [Contact Me](#contact)
- [Becoming a Sponsor](#becoming-a-sponsor)
- [Contributing](#Contributing)


<a name="about-the-project"></a>
## ⚡️About The Project
* This is a lightweight java utility library to help our java projects as an assistant.
* There are many common methods which you can use in your projects through below helping classes.
1. PrintUtil class
2. CommonUtil class
3. ValidationUtil class
4. JsonUtil class
5. PasswordUtil class
6. DateTimeUtil class
7. ResponseUtil class
8. ConstantUtil class

See the [Instruction](#instruction) section for the all usages.


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
      <version>1.0.6</version>
    </dependency>
   ```

* Copy above dependency and add inside `<dependencies> <dependencies>` tag in your `pom.xml` file.
* Refresh or Reload your maven pom file. 
* You can check out this library is already in your project or not by checking under External Libraries folder.
* After successfully adding this library in your application, you can use start to use methods in that library.


<a name="usage"></a>
#### Usage
* There are six utility classes to use.
1. PrintUtil       -> To use common methods to print out.
2. CommonUtil      -> To use some useful common methods like safe list, safe set, safe map, joinCollectionToString, mapToQueryString, generateRandomString, capitalize letters, get integer length and etc.
3. ValidationUtil  -> To validate like object, empty String, email validation, empty Collection, etc.
4. JsonUtil        -> To do Json operations like objectToJson, jsonToObject, readJsonFile, writeJsonFile, etc.
5. PasswordUtil    -> To encode and verify password.
6. DateTimeUtil    -> To get datetime as per zoneId, two dates different, etc.
7. ResponseUtil    -> To get formatted microservice response object.
8. ConstantUtil    -> To use some common constant like error message, info message, etc.


<a name="printutil"></a>
##### PrintUtil
* Here are the sample usage for `PrintUtil class` that you can apply in your application.

```java

    PrintUtil.printInfo("This is testing info log.");
    // sample output at console -> 2024-12-16 19:18:44,179 [main] INFO  helper.PrintUtil - This is testing info log.

    PrintUtil.printWarn("This is testing warn log.");
    // sample output at console -> 2024-12-16 19:18:44,181 [main] WARN  helper.PrintUtil - This is testing warn log.

    PrintUtil.printError("This is testing error log.");
    // sample output at console -> 2024-12-16 19:18:44,181 [main] ERROR helper.PrintUtil - This is testing error log.

    PrintUtil.printInfo("This is testing info log."); // no param
    // sample output at console -> 2024-12-16 19:18:44,182 [main] INFO  helper.PrintUtil - This is testing info log.

    PrintUtil.printInfo("This is testing info log with {} param.", "one"); // one param
    // sample output at console -> 2024-12-16 19:18:44,194 [main] INFO  helper.PrintUtil - This is testing info log with one param.

    PrintUtil.printInfo("This is testing info log with {} {}.", "two", "params"); // two params
    // sample output at console -> 2024-12-16 19:18:44,194 [main] INFO  helper.PrintUtil - This is testing info log with two params.

    PrintUtil.printInfo("{} {}, This is testing log with {} params.","Hello", "World", "3"); // three params
    // sample output at console -> 2024-12-16 19:18:44,194 [main] INFO  helper.PrintUtil - Hello World, This is testing log with 3 params.

    private static final Logger customizeLogger = LoggerFactory.getLogger("test.Testing"); // declare above method
    PrintUtil.printInfo(customizeLogger, "This is testing log with customize logger name. {} {}", "hello", "world"); // customize logger
    // sample output at console -> 2024-12-16 19:18:44,194 [main] INFO  test.Testing - This is testing log with customize logger name. hello world     

    Student studentObj = new Student("Mr.YE", "male"); // create sample object
    PrintUtil.printInfo("Student info log: {}", studentObj); // print object
    // sample output at console -> 2024-12-16 19:29:32,284 [main] INFO  helper.PrintUtil - Student info log: Student{name='Mr.YE', gender='male'} 

```

<a name="commonutil"></a>
##### CommonUtil
* Here are the sample usage for `CommonUtil class` that you can apply in your application.

```java

    /** test safe methods */
    String test = null; // test null value
    
    // test by calling toLowerCase method to test whether null pointer exception can be handled or not
    String result = CommonUtil.safeString(test).toLowerCase(); // you can use safeString method in anywhere if you want to do string operation and want to safe from null pointer
    PrintUtil.printInfo(result); // result will be empty if null
    // sample output at console -> 2024-12-18 04:32:56,940 [main] WARN  helper.ValidationUtil - Input data is null.
    // sample output at console -> 2024-12-18 04:32:56,943 [main] INFO  helper.PrintUtil -
            
    List<String> testList = List.of("value1", "value2");
    testList = null; // make testList to be null for testing purpose.

    for(String testValue : CommonUtil.safeList(testList)){ // we can use safeList to avoid NullPointerException
        PrintUtil.printInfo(testValue);
    }

    Set<String> testSet = Set.of("value1", "value2");
    testSet = null; // make testSet to be null for testing purpose.

    for(String testValue : CommonUtil.safeSet(testSet)){ // we can use safeSet to avoid NullPointerException
        PrintUtil.printInfo(testValue);
    }

    
    /** test capitalize letter methods */
    String helloString = " hello "; // single word
    String capitalizeString = CommonUtil.capitalizeFirstLetter(helloString);
    PrintUtil.printInfo(capitalizeString);
    // sample output at console -> 2024-12-17 05:23:39,431 [main] INFO  helper.CommonUtil - Hello

    String helloWordString = " hello  world "; // multiple words
    String capitalizeMultipleString = CommonUtil.capitalizeAllFirstLetter(helloWordString);
    PrintUtil.printInfo(capitalizeMultipleString);
    // sample output at console -> 2024-12-17 05:23:39,433 [main] INFO  helper.CommonUtil - Hello World


    /** test joinCollectionToString method by adding some separators (you can put any separator as you want) */
    List<Integer> intList = List.of(1, 2, 3, 4);
    String joinIntList = CommonUtil.joinCollectionToString(intList, ConstantUtil.COMMA_SEPARATOR); //test for int List by separator , (you can put any separator as you want)
    PrintUtil.printInfo(joinIntList);
    // sample output at console -> 2024-12-18 04:12:00,112 [main] INFO  helper.PrintUtil - 1, 2, 3, 4

    Set<Double> doubleSet = new HashSet<>(Arrays.asList(1.1, 2.2, 3.3));
    String joinDoubleSet =  CommonUtil.joinCollectionToString(doubleSet, ConstantUtil.PIPE); // test for double Set by separator |
    PrintUtil.printInfo(joinDoubleSet);
    // sample output at console -> 2024-12-18 04:12:00,114 [main] INFO  helper.PrintUtil - 1.1 | 2.2 | 3.3

    List<Object> mixedList = Arrays.asList("Hello", 123, null, 45.67);
    String joinMixList = CommonUtil.joinCollectionToString(mixedList, " - "); // test for mixed value list by separator - (will skip if null values included)
    PrintUtil.printInfo(joinMixList);
    // sample output at console -> 2024-12-18 04:12:00,114 [main] INFO  helper.PrintUtil - Hello - 123 - 45.67

    String joinNullValue =  CommonUtil.joinCollectionToString(null, ", "); // test for null and will get empty String if collection was null
    PrintUtil.printInfo(joinNullValue);
    // sample output at console -> 2024-12-18 04:12:00,114 [main] INFO  helper.PrintUtil -



    /** test mapToQueryString method */
    Map<String, Integer> sampleMap = new LinkedHashMap<>();
    sampleMap.put("Apple", 50);
    sampleMap.put(null, 40);
    sampleMap.put("Orange", 10);
    sampleMap.put("Banana", null);
    sampleMap.put("Grape", 5);


    String result = CommonUtil.mapToQueryString(sampleMap, PIPE_SEPARATOR);
    PrintUtil.printInfo(result);
    // sample output at console -> 2024-12-18 05:50:52,871 [main] INFO  helper.PrintUtil - Apple=50 | =40 | Orange=10 | Banana= | Grape=5

    String result1 = CommonUtil.mapToQueryString(sampleMap, COMMA_SEPARATOR, true); // test with isSkipNullKey by setting true
    PrintUtil.printInfo(result1);
    // sample output at console -> 2024-12-18 05:50:52,873 [main] INFO  helper.PrintUtil - Apple=50, Orange=10, Banana=, Grape=5

    Person p1 = new Person("Ye", 30); // test object
    Person p2 = new Person("Win", 31);
    Person p3 = new Person(null, 32);
    Map<Person, String> personMap = new LinkedHashMap<>();
    personMap.put(p1, "first person");
    personMap.put(p2, "second person");
    personMap.put(p3, "third person");
    personMap.put(null, "fourth person");

    String personResult = CommonUtil.mapToQueryString(personMap, PIPE_SEPARATOR);
    PrintUtil.printInfo(personResult);
    // sample output at console -> 2024-12-18 05:50:52,891 [main] INFO  helper.PrintUtil - Person{name='Ye', age=30}=first person | Person{name='Win', age=31}=second person | Person{name='null', age=32}=third person | =fourth person

    /** test defaultIfNull method */
    String testDefault = null;
    String defaultVal = CommonUtil.defaultIfNull(testDefault, "sample default value");
    PrintUtil.printInfo(defaultVal);
    // sample output at console -> 2024-12-18 05:50:52,891 [main] INFO  helper.PrintUtil - sample default value


    /** test generateRandomString method */
    String result = CommonUtil.generateRandomString(15); // get 15 random alphanumeric strings
    PrintUtil.printInfo(result);
    // sample output at console -> 2024-12-18 06:07:36,531 [main] INFO  helper.PrintUtil - YeY1aYt4NnhFCfA

    String result1 = CommonUtil.generateRandomString(8); // get 8 random alphanumeric strings
    PrintUtil.printInfo(result1);
    // sample output at console -> 2024-12-18 06:07:36,533 [main] INFO  helper.PrintUtil - 10ShDm1o
            

    /** test get NumberLength */
    int count = 35; // this is demo data and that value might get from request or anywhere
    int length = CommonUtil.getNumberLength(count); // get NumberLength and you can use long as well

    PrintUtil.printInfo("length of input is {}", CommonUtil.toString(length)); // use printInfo method
    // sample output at console -> 13:22:32.667 [main] INFO helper.PrintUtil -- length of input is 2

    if(length > 5){ // example condition
        // do your process
    }else {
        // do your process
    }

    /**
     * You can use other methods in ValidationUtil like below
     * swap(T[] arr, int index1, int index2), sleep(milliseconds), toLowerCase(input), toUpperCase(input), toString(input) and so on.
     */

```

<a name="validationutil"></a>
##### ValidationUtil
* Here are the sample usage for `ValidationUtil class` that you can apply in your application.

```java

    /** test for isNull and isEmptyString methods */
    Student studentObj = null; // test for demo object with null value
    if(ValidationUtil.isNull(studentObj)){

        // here, I used print warn method from PrintUtil class.
        PrintUtil.printWarn("studentObj is null");
        // sample output at console -> 2024-12-16 22:46:20,439 [main] WARN  helper.PrintUtil - studentObj is null

        // similarly you can use ConstantUtil.INPUT_NULL_OR_EMPTY_PARAM_MESSAGE from ConstantUtil like below
        // PrintUtil.printWarn(ConstantUtil.NULL_PARAM_MESSAGE, "studentObj");
        // if you want to print with params, you can use printWarn method with two or more params like above

    } else {
        // do your process when the input object is not null
    }

    Student studentObj2 = null; // test for demo object with null value
    if(!ValidationUtil.isNull(studentObj2, "studentObj2")){  // isNull method with two params for printing logs
        // do your process when the input has data
    }
    // auto printing at console if you use isNull method with two params
    // sample output at console -> 2024-12-16 22:46:20,452 [main] WARN  helper.ValidationUtil - studentObj2 is null.



    String name = ""; // this is demo data and that value might get from request or anywhere
    if(ValidationUtil.isEmptyString(name)){ // isEmptyString method with one param

        // here, I used print warn method with two or more params from PrintUtil class.
        PrintUtil.printWarn("input is null or empty, input: {}", name);
    
        // similarly you can use ConstantUtil.INPUT_NULL_OR_EMPTY_PARAM_MESSAGE from ConstantUtil like below
        // PrintUtil.printWarn(ConstantUtil.INPUT_NULL_OR_EMPTY_PARAM_MESSAGE, name);
        // if you want to print with params, you can use printWarn method with two or more params like above
    
        // sample output at console -> 2024-12-16 22:19:18,854 [main] WARN  helper.PrintUtil - input is null or empty, input:
    
        // do your process like returning error or etc... when input is null or empty

    }else {
        // do your process when the input has data
    }


    String name1 = null; // this is demo data and that value might get from request or anywhere
    if(!ValidationUtil.isEmptyString(name1, "name1")){  // isEmptyString method with two params for printing logs
        // do your process when the input has data
    }
    // auto printing at console if you use isEmptyString method with two params
    // sample output at console -> 2024-12-16 22:19:40,105 [main] WARN  helper.ValidationUtil - name1 is null or empty, input: null

            
            
    /** test for collection and map methods */
    List<String> itemList = new ArrayList<>(); // this is demo data and that value might get from request or anywhere
    if(ValidationUtil.isEmptyCollection(itemList)){ // isEmptyCollection method with one param (you can also use isEmptyList(list) method)
    
        // here, I used print warn method with two or more param from PrintUtil class.
        PrintUtil.printWarn("input list is null or empty, input: "+ itemList);
        // sample output at console -> 2024-12-16 22:20:51,862 [main] WARN  helper.PrintUtil - input list is null or empty, input: []
    
        // do your process like returning error or etc... when input is null or empty

    }else {
        // do your process when the input has data
    }


    List<String> itemList1 = new ArrayList<>(); // this is demo data and that value might get from request or anywhere
    if(!ValidationUtil.isEmptyCollection(itemList1, "itemList data")){ // isEmptyCollection method with two params for printing logs (you can also use isEmptyList(list, message) method)
        // do your process when the input has data
    }
    // auto printing at console if you use two params methods
    // sample output at console if empty -> 2024-12-16 22:21:10,435 [main] WARN  helper.ValidationUtil - itemList data is null or empty, input: []


    /**
     * you can also use isEmptyList(list), isEmptySet(set) and isEmptyMap(map) methods
     * you can also use isEmptyList(list, message), isEmptySet(set, message) isEmptyMap(map, message) methods if you want to directly print if input was empty
     * */


    /** test for email validation method */
    String email = "aa@"; // this is demo data and that value might get from request or anywhere
    if(ValidationUtil.isValidEmail(email)){
        // do your process when the email is valid format
    }else {
        // do your process like returning error or etc... when the email is not valid format

        PrintUtil.printWarn("input email is not valid, input: {}", email);
        // sample output at console -> 2024-12-16 22:21:10,438 [main] WARN  helper.PrintUtil - input email is not valid, input: aa@
    }


    String email1 = "a@c"; // this is demo data and that value might get from request or anywhere
    if(ValidationUtil.isValidEmail(email1, "email1")){
        // do your process when the email is valid format
    }
    // sample output at console -> 2024-12-16 22:21:10,439 [main] WARN  helper.ValidationUtil - email1 is invalid format, input: a@c


    /** test for number validation methods */
    int count = -1; // this is demo data and that value might get from request or anywhere
    if(ValidationUtil.isPositiveNumber(count)){
        // do your process when the input is positive number
    }else {
        // do your process like returning error or etc... when the input is not positive number

    PrintUtil.printWarn("input is not positive, input: "+ count);
        // sample output at console -> 2024-12-16 22:21:10,466 [main] WARN  helper.PrintUtil - input is not positive, input: -1
    }


    int count1 = -2; // this is demo data and that value might get from request or anywhere
    if(ValidationUtil.isPositiveNumber(count1, "count1")){ // you can use two params method to print out for else case
        // do your process when the input is positive number
    }
    // sample output at console -> 2024-12-16 22:21:10,467 [main] WARN  helper.ValidationUtil - count1 is null or not positive number, input: -2
    /** you can also use long instead of int. */

    

    String testNumber = "12.3";
    if(ValidationUtil.isValidNumber(testNumber)){ // you can use two param method if you want to print out for else case
    // do your process if it's valid number
    PrintUtil.printInfo("test number is valid number");
    }
    // sample output at console -> 2024-12-18 04:52:41,527 [main] INFO  helper.PrintUtil - test number is valid number
    
    String errTestNumber = "12abc.3";
    if(ValidationUtil.isValidNumber(errTestNumber, "errTestNumber")){ // you can use two param method if you want to print out for else case
    // do your process if it's valid number
    PrintUtil.printInfo("test number is valid number");
    }
    // sample output at console -> 2024-12-18 04:52:41,541 [main] WARN  helper.PrintUtil - errTestNumber is not a number, input: 12abc.3
    
    
    String testInt = "12";
    if(ValidationUtil.isIntegerNumber(testInt)){
    // do your process if it's valid number
    PrintUtil.printInfo("test number is integer number");
    }
    // sample output at console -> 2024-12-18 04:52:41,541 [main] INFO  helper.PrintUtil - test number is integer number
    
    String errTestInt = "21.1";
    if(ValidationUtil.isIntegerNumber(errTestInt, "errTestInt")){
    // do your process if it's valid number
    PrintUtil.printInfo("test number is integer number");
    }
    // sample output at console -> 2024-12-18 04:52:41,541 [main] WARN  helper.PrintUtil - errTestInt is not a number, input: 21.1
    
    
    /**
     * You can use other methods in ValidationUtil like below
     * isLongNumber(longValue), isLongNumber(longValue, message) and so on.
     */

```

<a name="jsonutil"></a>
##### JsonUtil
* Here are the sample usage for `JsonUtil class` that you can apply in your application.

```java

    /** Testing jsonToObject method */
    String testJsonString = "{ \"name\": \"Ye Win\", \"age\": 30 }"; // demo json string
            Person person = JsonUtil.jsonToObject(testJsonString, Person.class);
    PrintUtil.printInfo("Deserialized object: {}", person);
    // sample output at console -> 2024-12-17 04:50:39,139 [main] INFO  helper.PrintUtil - Deserialized object: Person{name='Ye Win', age=30}

    Person errPerson = JsonUtil.jsonToObject("", Person.class); // empty json string or wrong json format won't be converted
    PrintUtil.printInfo("Deserialized object: {}", errPerson);
    // sample output at console -> 2024-12-17 04:50:39,141 [main] WARN  helper.ValidationUtil - Input json string is null or empty, input: 
    // sample output at console -> 2024-12-17 04:50:39,142 [main] WARN  helper.PrintUtil - Could not convert to object.
    // sample output at console -> 2024-12-17 04:50:39,142 [main] INFO  helper.PrintUtil - Deserialized object: null


    /** Testing objectToJson method */
    Person personObj = new Person("Ye Win", 30); // create demo object
    String personJsonString = JsonUtil.objectToJson(personObj);
    PrintUtil.printInfo("Serialized JSON: {}", personJsonString);
    // sample output at console -> 2024-12-17 04:50:39,157 [main] INFO  helper.PrintUtil - Serialized JSON: {"name":"Ye Win","age":30}

    String errPersonJsonString = JsonUtil.objectToJson(null); // null object won't be converted
    PrintUtil.printInfo("Serialized JSON: {}", errPersonJsonString);
    // sample output at console -> 2024-12-17 04:50:39,157 [main] WARN  helper.ValidationUtil - Input object is null.
    // sample output at console -> 2024-12-17 04:50:39,157 [main] WARN  helper.PrintUtil - Could not convert to json.
    // sample output at console -> 2024-12-17 04:50:39,157 [main] INFO  helper.PrintUtil - Serialized JSON: null


    /** Testing readJsonFile method */
    String filePath = "person.json"; // demo file path, and it can be other path like (resource/file/test.json)
    Person personObjFromFile = JsonUtil.readJsonFile(filePath, Person.class);
    PrintUtil.printInfo("Deserialized object: {}", personObjFromFile);
    // sample output at console -> 2024-12-17 04:50:39,164 [main] INFO  helper.PrintUtil - Deserialized object: Person{name='Ye Win', age=30}

    Person errPersonObjFromFile = JsonUtil.readJsonFile("", Person.class); // empty or wrong file path won't be converted
    PrintUtil.printInfo("Deserialized object: {}", errPersonObjFromFile);
    // sample output at console -> 2024-12-17 04:50:39,164 [main] WARN  helper.ValidationUtil - Input file path is null or empty, input: 
    // sample output at console -> 2024-12-17 04:50:39,164 [main] WARN  helper.PrintUtil - Could not read the file.
    // sample output at console -> 2024-12-17 04:50:39,164 [main] INFO  helper.PrintUtil - Deserialized object: null


    /** Testing writeJsonFile method */
    JsonUtil.writeJsonFile(filePath, personObj);
    // sample output at console -> 2024-12-17 04:50:39,166 [main] INFO  helper.PrintUtil - File written successfully to person.json

    JsonUtil.writeJsonFile("", personObj); // empty or wrong file path won't be written into file
    // sample output at console -> 2024-12-17 04:50:39,167 [main] WARN  helper.ValidationUtil - Input file path is null or empty, input: 
    // sample output at console -> 2024-12-17 04:50:39,167 [main] WARN  helper.PrintUtil - Could not write the file.

```

<a name="passwordutil"></a>
##### PasswordUtil
* Here are the sample usage for `PasswordUtil class` that you can apply in your application.

```java

    String inputPassword = "P@ssw0rd";  // sample data and it might get from register form
    String encodedPassword = encode(inputPassword); // call encode method from PasswordUtil to hash the password
    PrintUtil.printInfo("encodedPassword: {}", encodedPassword); // print console by using printInfo method
    // sample output at console -> 2024-12-16 22:21:11,467 [main] INFO helper.PrintUtil -- encodedPassword: J78+7Cbv/IZSyUygAD/BDw$xgiAdngMzyWUzJSmrnW+YM6BGE578TaDGnTeB3+8Vvs

    // do your process like storing the password into database or etc...

    String loginPassword = "P@ssw0rd"; // sample data and it might get from login form
    String encodedDBPassword = "J78+7Cbv/IZSyUygAD/BDw$xgiAdngMzyWUzJSmrnW+YM6BGE578TaDGnTeB3+8Vvs"; // this value might get from database
    boolean match = checkPassword(loginPassword, encodedDBPassword); // call checkPassword method from PasswordUtil to check the login password is match or not
    if(match){ // it will true if two passwords are same
        PrintUtil.printInfo("successful login");
        // do your process eg. approve login
    }else {
        PrintUtil.printWarn("password doesn't match");
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
    PrintUtil.printInfo(utcDateTime);  // printInfo is a method to print at console which is in PrintUtil.class
    // sample output -> 2024-12-16 23:08:41,663 [main] INFO  helper.PrintUtil - 2024-12-16 15:08:41.001

    /**
     * you can add any zone id and dateformat pattern instead of UTC and SAMPLE_FORMATTER as you want
     * ZoneId ref - https://docs.oracle.com/middleware/12211/wcs/tag-ref/MISC/TimeZones.html
     * Pattern ref - https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
     */

    // example of adding custom zoneId and date pattern format
    String mmDateTime = DateTimeUtil.getDateTime(instant, "Asia/Yangon", "HH:mm:ss dd/MM/yyyy");
    PrintUtil.printInfo(mmDateTime);
    // sample output -> 2024-12-16 23:08:41,667 [main] INFO  helper.PrintUtil - 21:38:41 16/12/2024


    // this currentDateTime method will give you datetime by using zoneId (eg. UTC, etc) as param.
    String currentDateTime = DateTimeUtil.getCurrentDateTime("UTC");
    PrintUtil.printInfo(currentDateTime);
    // sample output -> 2024-12-16 23:08:41,668 [main] INFO  helper.PrintUtil - 2024-12-16 15:08:41.668

    // this currentDateTime method will give you datetime by using zoneId (eg. UTC, etc) and format pattern (eg. "HH:mm:ss dd/MM/yyyy", etc) as param.
    String currentDateTimeParam = DateTimeUtil.getCurrentDateTime("UTC", "HH:mm:ss dd/MM/yyyy");
    PrintUtil.printInfo(currentDateTimeParam);
    // sample output -> 2024-12-16 23:08:41,668 [main] INFO  helper.PrintUtil - 15:08:41 16/12/2024

    // this getCurrentUTCDateTime method will give you UTC datetime by using format pattern (eg. "HH:mm:ss dd/MM/yyyy", etc) as param.
    String currentUTCDateTime = DateTimeUtil.getCurrentUTCDateTime("HH:mm:ss dd/MM/yyyy");
    PrintUtil.printInfo(currentUTCDateTime);
    // sample output -> 2024-12-16 23:08:41,668 [main] INFO  helper.PrintUtil - 15:08:41 16/12/2024

    // this getUTCDateTime method will give you UTC datetime by using java 8 Instant object and format pattern (eg. "HH:mm:ss dd/MM/yyyy", etc) as param.
    String utcDateTimeParam = DateTimeUtil.getUTCDateTime(instant, "HH:mm:ss dd/MM/yyyy");
    PrintUtil.printInfo(utcDateTimeParam);
    // sample output -> 2024-12-16 23:08:41,668 [main] INFO  helper.PrintUtil - 15:08:41 16/12/2024


    // this getCurrentLocalDateTime method will give your local country datetime
    LocalDateTime currentLocalDateTime = DateTimeUtil.getCurrentLocalDateTime();
    PrintUtil.printInfo(currentLocalDateTime.toString());
    // sample output -> 2024-12-16 23:08:41,668 [main] INFO  helper.PrintUtil - 2024-12-16T23:08:41.668838

    // this getCurrentLocalTime method will give your local country time
    LocalTime currentLocalTime = DateTimeUtil.getCurrentLocalTime();
    PrintUtil.printInfo(currentLocalTime.toString());
    // sample output -> 2024-12-16 23:08:41,668 [main] INFO  helper.PrintUtil - 23:08:41.668945

    LocalDateTime localDateTime1 = LocalDateTime.of(2021,6,15,14,50,12);
    LocalDateTime localDateTime2 = LocalDateTime.of(2021,7,17,15,54,15);

    // this differenceDateByMilliSeconds method will give you the milliseconds which is difference between two LocalDateTime objects
    long milliDiff = DateTimeUtil.differenceDateByMilliSeconds(localDateTime1, localDateTime2);
    PrintUtil.printInfo("difference in milliseconds: "+milliDiff);
    // sample output -> 2024-12-16 23:08:41,681 [main] INFO  helper.PrintUtil - difference in milliseconds: 2768643000

    // this differenceDateBySeconds method will give you the seconds which is difference between two LocalDateTime objects
    long secDiff = DateTimeUtil.differenceDateBySeconds(localDateTime1, localDateTime2);
    PrintUtil.printInfo("difference in seconds: "+secDiff);
    // sample output -> 2024-12-16 23:08:41,682 [main] INFO  helper.PrintUtil - difference in seconds: 2768643

    // this differenceDateByMinutes method will give you the minutes which is difference between two LocalDateTime objects
    long minDiff = DateTimeUtil.differenceDateByMinutes(localDateTime1, localDateTime2);
    PrintUtil.printInfo("difference in minutes: {}", CommonUtil.toString(minDiff));
    // sample output -> 2024-12-16 23:08:41,684 [main] INFO  helper.PrintUtil - difference in minutes: 46144

    // this differenceDateByHours method will give you the hours which is difference between two LocalDateTime objects
    long hourDiff = DateTimeUtil.differenceDateByHours(localDateTime1, localDateTime2);
    PrintUtil.printInfo("difference in hours: {}", CommonUtil.toString(hourDiff));
    // sample output -> 2024-12-16 23:08:41,684 [main] INFO  helper.PrintUtil - difference in hours: 769

    // this differenceDateByDays method will give you the days which is difference between two LocalDateTime objects
    long dayDiff = DateTimeUtil.differenceDateByDays(localDateTime1, localDateTime2);
    PrintUtil.printInfo("difference in days: {}", CommonUtil.toString(dayDiff));
    // sample output -> 2024-12-16 23:08:41,685 [main] INFO  helper.PrintUtil - difference in days: 32

    // this differenceDateByMonths method will give you the months which is difference between two LocalDateTime objects
    long monthsDiff = DateTimeUtil.differenceDateByMonths(localDateTime1, localDateTime2);
    PrintUtil.printInfo("difference in months: {}", CommonUtil.toString(monthsDiff));
    // sample output -> 2024-12-16 23:08:41,685 [main] INFO  helper.PrintUtil - difference in months: 1

    // this differenceDateByYears method will give you the years which is difference between two LocalDateTime objects
    long yearDiff = DateTimeUtil.differenceDateByYears(localDateTime1, localDateTime2);
    PrintUtil.printInfo("difference in years: {}", CommonUtil.toString(yearDiff));
    // sample output -> 2024-12-16 23:08:41,685 [main] INFO  helper.PrintUtil - difference in years: 0

```

<a name="responseutil"></a>
##### ResponseUtil
* Here are the sample usage for `ResponseUtil class` that you can apply in your application.

```java

    Employee employee = new Employee("Mr.Test", "123456"); // sample pojo class
    ServiceResponse serviceResponse = ResponseUtil.getResponseObj("SUCCESS", "success", employee, "UTC");
    PrintUtil.printInfo(ConstantUtil.RESPONSE_DATA_PARAM_MESSAGE, serviceResponse);
    // sample output -> 2024-12-17 04:08:08,832 [main] INFO  helper.PrintUtil - Response data: Response{status=Status{status='SUCCESS', message='success'}, data=Employee{name='Mr.Test', phoneNo='123456'}, timestamp='2024-12-16 20:13:08.155'}

```

<a name="constantutil"></a>
##### ConstantUtil
* Here are the sample usage for `ConstantUtil class` that you can apply in your application.

```java

    String errMessage = ConstantUtil.VALUE_IS_EXISTED_MESSAGE; // one of the sample message
    PrintUtil.printWarn(errMessage);
    // sample output -> 2024-12-16 22:52:29,713 [main] WARN  helper.PrintUtil - Value is already existed.

    PrintUtil.printWarn(ConstantUtil.EXISTED_PARAM_MESSAGE, "User");
    // sample output -> 2024-12-16 22:55:25,295 [main] WARN  helper.PrintUtil - User is already existed.

    /** you can use other constant values, please check out ConstantUtil class*/

```

* Below are some common constant values

| KEY                                           | Value                                                             |
|-----------------------------------------------|-------------------------------------------------------------------|
| SPACE_REGEX                                   | \\\s+                                                             |
| COMMA_AND_SPACE_REGEX                         | \\\s*,\\\s*                                                       |
| EMAIL_REGEX                                   | check inside ConstantUtil class as my email regex included pipe   |
| SIGN_REGEX                                    | $                                                                 |
| SPACE_SEPARATOR                               |                                                                   |
| COMMA_SEPARATOR                               | ,                                                                 |
| SELECT_SEPARATOR                              | /                                                                 |
| PIPE_SEPARATOR                                |                                                                   |
| DASH_SEPARATOR                                | -                                                                 |
| EQUAL_SEPARATOR                               | =                                                                 |
| SINGLE_QUOTE                                  | '                                                                 |
| UNDERSCORE                                    | _                                                                 |
| DASH                                          | -                                                                 |
| EQUAL                                         | =                                                                 |
| PLUS                                          | +                                                                 |
| FULL_COLON                                    | :                                                                 |
| AND                                           | &                                                                 |
| STAR                                          | *                                                                 |
| PERCENT                                       | %                                                                 |
| DOLLAR_SIGN                                   | $                                                                 |
| HASH                                          | #                                                                 |
| AT                                            | @                                                                 |
| PIPE                                          |                                                                   |                                                               |
| TILDE                                         | ~                                                                 |
| COMMA                                         | ,                                                                 |
| DOT                                           | .                                                                 |
| EMPTY_STRING                                  |                                                                   |
| ZERO                                          | 0                                                                 |
| SAMPLE_FORMATTER                              | yyyy-MM-dd HH:mm:ss.SSS                                           |
| UTC_ZONE_ID                                   | UTC                                                               |
| MM_ZONE_ID                                    | Asia/Yangon                                                       |
| SG_ZONE_ID                                    | Asia/Singapore                                                    |
| INDIA_ZONE_ID                                 | Asia/Kolkata                                                      |
| REQUEST_DATA_PARAM_MESSAGE                    | Request data: {}                                                  |
| RESPONSE_DATA_PARAM_MESSAGE                   | Response data: {}                                                 |
| RESULT_PARAM_MESSAGE                          | Result: {}                                                        |
| INPUT_DATA_PARAM_MESSAGE                      | Input data: {}                                                    |
| OUTPUT_DATA_PARAM_MESSAGE                     | Output data: {}                                                   |
| EXISTED_PARAM_MESSAGE                         | {} is already existed.                                            |
| VALUE_IS_EXISTED_MESSAGE                      | Value is already existed.                                         |
| VALUE_IS_EXISTED_PARAM_MESSAGE                | Value is already existed: {}                                      |
| RECORD_IS_EXISTED_MESSAGE                     | Records is already existed.                                       |
| RECORD_IS_EXISTED_PARAM_MESSAGE               | Records is already existed: {}                                    |
| COULD_NOT_FIND_RECORD_BY_ID_MESSAGE           | Could not find records by id.                                     |
| COULD_NOT_FIND_RECORD_BY_ID_PARAM_MESSAGE     | Could not find records by id: {}                                  |
| COULD_NOT_FIND_RECORD_BY_NAME_MESSAGE         | Could not find records by name.                                   |
| COULD_NOT_FIND_RECORD_BY_NAME_PARAM_MESSAGE   | Could not find records by name: {}                                |
| COULD_NOT_FIND_RECORD_BY_VALUE_MESSAGE        | Could not find records by value.                                  |
| COULD_NOT_FIND_RECORD_BY_VALUE_PARAM_MESSAGE  | Could not find records by value: {}                               |
| COULD_NOT_FETCH_DATA_BY_ID_MESSAGE            | Could not fetch data by id.                                       |
| COULD_NOT_FETCH_DATA_BY_ID_PARAM_MESSAGE      | Could not fetch data by id: {}                                    |
| COULD_NOT_FIND_ANY_RECORD_MESSAGE             | Could not find any records.                                       |
| COULD_NOT_FETCH_ANY_RECORD_MESSAGE            | Could not fetch any records.                                      |
| NO_RECORD_MESSAGE                             | There is no record.                                               |
| COULD_NOT_ADD_RECORD_MESSAGE                  | Could not add any records.                                        |
| SUCCESS_ADD_RECORD_MESSAGE                    | Successfully added records.                                       |
| VALUE_NULL_MESSAGE                            | Value is null.                                                    |
| INPUT_NULL_MESSAGE                            | Input is null.                                                    |
| INPUT_NULL_OR_EMPTY_MESSAGE                   | Input value is null or empty.                                     |
| VALUE_NULL_OR_EMPTY_MESSAGE                   | Value is null or empty.                                           |
| NULL_PARAM_MESSAGE                            | {} is null.                                                       |
| INPUT_NULL_OR_EMPTY_PARAM_MESSAGE             | Input is null or empty, input: {}                                 |
| VALUE_NULL_OR_EMPTY_PARAM_MESSAGE             | Value is null or empty, value: {}                                 |
| INPUT_JSON_STRING_MESSAGE                     | Input json string                                                 |
| INPUT_OBJECT_MESSAGE                          | Input object                                                      |
| INPUT_DATA_MESSAGE                            | Input data                                                        |
| INPUT_FILE_PATH_MESSAGE                       | Input file path                                                   |
| NULL_OR_EMPTY_PARAM_MESSAGE                   | {} is null or empty, input: {}                                    |
| NULL_OR_NOT_POSITIVE_PARAM_MESSAGE            | {} is null or not positive number, input: {}                      |
| INVALID_FORMAT_MESSAGE                        | Invalid format.                                                   |
| INVALID_FORMAT_PARAM_MESSAGE                  | {} is invalid format.                                             |
| INVALID_FORMAT_INPUT_PARAM_MESSAGE            | {} is invalid format, input: {}                                   |
| MAXIMUM_REACH                                 | {} is reach at maximum limit.                                     |
| MAXIMUM_REACH_PARAM_MESSAGE                   | {} is reach at maximum limit, maximum limit: {}                   |
| ERROR_PARAM_MESSAGE                           | Error: {}                                                         |
| INTERNAL_ERROR_MESSAGE                        | Internal error.                                                   |
| INTERNAL_SERVER_ERROR_MESSAGE                 | Internal server error.                                            |
| GENERAL_ERROR_MESSAGE                         | Something went wrong. Please contact to your administrator.       |
| TRY_AGAIN_ERROR_MESSAGE                       | Something went wrong. Please try again later.                     |
| COULD_NOT_CALL_API_MESSAGE                    | Could not call the api.                                           |
| COULD_NOT_CALL_API_PARAM_MESSAGE              | Could not call the api, url: {}                                   |
| COULD_NOT_LOAD_DATA_MESSAGE                   | Could not load the data.                                          |
| COULD_NOT_READ_THE_DATA_MESSAGE               | Could not read the data.                                          |
| COULD_NOT_WRITE_THE_DATA_MESSAGE              | Could not write the data.                                         |
| COULD_NOT_READ_THE_FILE_MESSAGE               | Could not read the file.                                          |
| COULD_NOT_WRITE_THE_FILE_MESSAGE              | Could not write the file.                                         |
| COULD_NOT_CONVERT_TO_OBJECT_MESSAGE           | Could not convert to object.                                      |
| COULD_NOT_CONVERT_TO_JSON_MESSAGE             | Could not convert to json.                                        |
| COULD_NOT_CONVERT_TO_PARAM_MESSAGE            | Could not convert to {}                                           |
| COULD_NOT_SAVE_INTO_DATABASE_MESSAGE          | Could not save into database.                                     |
| FILE_WRITTEN_SUCCESS_MESSAGE                  | File written successfully.                                        |
| FILE_WRITTEN_SUCCESS_PARAM_MESSAGE            | File written successfully to {}                                   |
| SUCCESS_MESSAGE                               | SUCCESS                                                           |
| FAIL_MESSAGE                                  | FAIL                                                              |
| SUCCESSFUL_MESSAGE                            | SUCCESSFUL                                                        |
| LOADING_MESSAGE                               | LOADING                                                           |
| PENDING_MESSAGE                               | PENDING                                                           |
| UNDER_REVIEW_MESSAGE                          | UNDER REVIEW                                                      |
| FINISHED_REVIEW_MESSAGE                       | FINISHED REVIEW                                                   |
| PROCESSING_MESSAGE                            | PROCESSING                                                        |
| ON_GOING_MESSAGE                              | ON GOING                                                          |
| PRODUCTION_MESSAGE                            | PRODUCTION                                                        |
| GO_LIVE_MESSAGE                               | GO LIVE                                                           |
| HOLDING_MESSAGE                               | HOLDING                                                           |
| RESTRICT_MESSAGE                              | RESTRICT                                                          |
| MAINTAIN_MESSAGE                              | MAINTAIN                                                          |
| CLOSE_MESSAGE                                 | CLOSE                                                             |
| SHUTDOWN_MESSAGE                              | SHUTDOWN                                                          |
| SUSPEND_MESSAGE                               | SUSPEND                                                           |
| REMOVE_MESSAGE                                | REMOVE                                                            |
| DELETE_MESSAGE                                | DELETE                                                            |
| SUCCESSFULLY_CREATED_MESSAGE                  | Successfully created record.                                      |
| FAIL_CREATE_MESSAGE                           | Failed to create record.                                          |
| OK_CODE                                       | 200                                                               |
| CREATED_CODE                                  | 201                                                               |
| BAD_REQUEST_CODE                              | 400                                                               |
| UNAUTHORIZED_CODE                             | 401                                                               |
| FORBIDDEN_CODE                                | 403                                                               |
| NOT_FOUND_CODE                                | 404                                                               |
| INTERNAL_SERVER_ERROR_CODE                    | 500                                                               |
| NOT_IMPLEMENTED_CODE                          | 501                                                               |
| SERVICE_UNAVAILABLE_CODE                      | 503                                                               |
| INFO                                          | INFO                                                              |
| WARN                                          | WARN                                                              |
| DEBUG                                         | DEBUG                                                             |
| ERROR                                         | ERROR                                                             |
| ERROR                                         | ERROR                                                             |
| NUMBER_FIELD                                  | number                                                            |
| NO_FIELD                                      | no.                                                               |
| USERNAME_FIELD                                | userName                                                          |
| NAME_FIELD                                    | name                                                              |
| FIRST_NAME_FIELD                              | firstName                                                         |
| LAST_NAME_FIELD                               | lastName                                                          |
| MIDDLE_NAME_FIELD                             | middleName                                                        |
| PASSWORD_FIELD                                | password                                                          |
| EMAIL_FIELD                                   | email                                                             |
| PHONE_NO_FIELD                                | phoneNo                                                           |
| PHONE_FIELD                                   | phone                                                             |
| GENDER_FIELD                                  | gender                                                            |
| MALE_FIELD                                    | male                                                              |
| FEMALE_FIELD                                  | female                                                            |
| AGE_FIELD                                     | age                                                               |
| JSON_FIELD                                    | json                                                              |
| OBJECT_FIELD                                  | object                                                            |
| PATH_FIELD                                    | path                                                              |
| DATA_FIELD                                    | data                                                              |
| DATABASE_FIELD                                | database                                                          |
| CURRENCY_FIELD                                | currency                                                          |
| CURRENCY_TYPE_FIELD                           | currencyType                                                      |
| USD_FIELD                                     | usd                                                               |
| BALANCE_FIELD                                 | balance                                                           |
| AMOUNT_FIELD                                  | amount                                                            |
| PRICE_FIELD                                   | price                                                             |
| TOKEN_FIELD                                   | token                                                             |
| ACCOUNT_FIELD                                 | account                                                           |
| ACCOUNT_TYPE_FIELD                            | accountType                                                       |
| CARD_FIELD                                    | card                                                              |
| CARD_TYPE_FIELD                               | cardType                                                          |
| SERVICE_FIELD                                 | service                                                           |
| SERVICES_FIELD                                | services                                                          |
| SERVICE_TYPE_FIELD                            | serviceType                                                       |
| SERVICE_ID_FIELD                              | serviceId                                                         |
| LEVEL_FIELD                                   | level                                                             |
| TYPE_FIELD                                    | type                                                              |
| CLASS_FIELD                                   | class                                                             |
| COUNT_FIELD                                   | count                                                             |
| PRODUCT_FIELD                                 | product                                                           |
| PRODUCT_NAME_FIELD                            | productName                                                       |
| PRODUCT_ID_FIELD                              | productId                                                         |
| PROJECT_FIELD                                 | project                                                           |
| PROJECT_NAME_FIELD                            | projectName                                                       |
| ADDRESS_FIELD                                 | address                                                           |
| COUNTRY_FIELD                                 | country                                                           |
| COUNTRY_NAME_FIELD                            | countryName                                                       |
| CITY_FIELD                                    | city                                                              |
| CITY_NAME_FIELD                               | cityName                                                          |
| TOWNSHIP_FIELD                                | township                                                          |
| TOWNSHIP_NAME_FIELD                           | townshipName                                                      |
| REGION_FIELD                                  | region                                                            |
| PROVINCE_FIELD                                | province                                                          |
| DISTRICT_FIELD                                | district                                                          |
| STATE_FIELD                                   | state                                                             |
| POSTAL_CODE_FIELD                             | postalCode                                                        |
| POSTAL_FIELD                                  | postal                                                            |
| ZIP_CODE_FIELD                                | zipCode                                                           |
| ZIP_FIELD                                     | zip                                                               |
| URL_FIELD                                     | url                                                               |
| LINK_FIELD                                    | link                                                              |
| DETAILS_FIELD                                 | details                                                           |
| REVIEW_FIELD                                  | review                                                            |
| REMARKS_FIELD                                 | remarks                                                           |
| DESCRIPTION_FIELD                             | description                                                       |
| MESSAGE_FIELD                                 | message                                                           |
| MESSAGE_TYPE_FIELD                            | messageType                                                       |
| NOTIFICATION_FIELD                            | notification                                                      |
| NOTIFICATION_TYPE_FIELD                       | notificationType                                                  |
| DATE_FIELD                                    | date                                                              |
| DAY_FIELD                                     | day                                                               |
| MONTH_FIELD                                   | month                                                             |
| YEAR_FIELD                                    | year                                                              |


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

