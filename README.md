# DoReMi Subscription - [GeekTrust] - LLD 
-   Machine Coding Problem Statement:  [https://www.geektrust.com/coding/detailed/doremi-subscription](https://www.geektrust.com/coding/detailed/doremi-subscription)  .
    
-   This problem was solved on October 5, 2022.
    
-   The low-level design code reads data input from a file. After reading the input commands, processes them & prints output on the command line interface.
    
-   This code has earned all the required badges: Readability, Tests, Correctness, Build.

![enter image description here](https://raw.githubusercontent.com/axitchandora/Personal-Stuff/main/Images/geektrust-doremi-subscription.png)

## Statement
### Context
DoReMi is a streaming app which allows users to listen to music, podcasts and watch videos. They offer different subscription plans for different categories of services. Users can subscribe to any of these plans.
1. A user can choose only one plan per category.
2. All plans, by default, can only be streamed on one device.

**Music streaming subscription plans**
|FREE|PERSONAL|PREMIUM|
|--|--|--|
|1 month Trial |Rs.100 for 1 month|Rs. 250 for 3 months|

**Video streaming subscription plans**

|FREE|PERSONAL|PREMIUM|
|--|--|--|
|1 month Trial |Rs.200 for 1 month|Rs. 500 for 3 months|

**Podcast streaming subscription plans**

|FREE|PERSONAL|PREMIUM|
|--|--|--|
|1 month Trial|Rs.100 for 1 month|Rs. 300 for 3 months|

### Top Up

DoReMi allows users to add a top up to increase the number of devices that they can stream to for an additional cost.
1. A user can choose only one top up.
2. The subscribed top up is applicable for all subscriptions.
3. A top up can be added only when a subscription exists.

|FOUR_DEVICE|TEN_DEVICE|
|--|--|
|Upto 4 Devices|Upto 10 Devices|
|Total cost: Rs.50 for 1 month|Total cost: Rs.100 for 1 month|

#### Renewal Reminder
Once a user subscribes to a plan, the user needs to be notified 10 days before the plan expires.

### Goal

Given a date when the subscription starts, your program should print:

1. The date on which the reminder should be sent for each subscription category
2. The total amount for renewal. Renewal amount is the sum of all the subscription plan amount and top up amount.

### Assumptions
1. A user can buy only one category of subscription at a time.
2. By default all plans can only be streamed on one device
3. A user can buy only one category of top up at a time.
4.  One top up applies to all the subscriptions being bought.

## Pre-requisites
* Java 1.8/1.11/1.15
* Gradle 6

## How to run the code

We have provided scripts to execute the code. 

Use `run.sh` if you are Linux/Unix/macOS Operating systems and `run.bat` if you are on Windows.

Internally both the scripts run the following commands 

 * `gradle clean build -x test --no-daemon` - This will create a jar file `geektrust.jar` in the `build/libs` folder.
 * `java -jar build/libs/geektrust.jar sample_input/input1.txt` - This will execute the jar file passing in the sample input file as the command line argument

 Use the build.gradle file provided along with this project. Please change the main class entry under the `jar` task

 ```
 manifest {
        attributes 'Main-Class' : 'com.geektrust.backend.App' //Change this to the main class of your program which will be executed
    }
```
in the build.gradle if your main class has changed.

 ## How to execute the unit tests

 `gradle clean test --no-daemon` will execute the unit test cases.

## Help

You can refer our help documents [here](https://help.geektrust.in)
You can read build instructions [here](https://github.com/geektrust/coding-problem-artefacts/tree/master/Java)
