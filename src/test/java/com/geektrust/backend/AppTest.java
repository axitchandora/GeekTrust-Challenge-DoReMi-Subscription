package com.geektrust.backend;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Collections;


class AppTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor,true));
    }

    @Test
    @DisplayName("Integration Test #1")
    void runTest1(){
        //Arrange
        String argument= "sample_input/input1.txt";
        String expectedOutput = "RENEWAL_REMINDER MUSIC 23-02-2022\n" +
                "RENEWAL_REMINDER VIDEO 25-04-2022\n" +
                "RENEWAL_REMINDER PODCAST 23-02-2022\n" +
                "RENEWAL_AMOUNT 700";
        //Act
        App.run(Collections.singletonList(argument));
        //Assert
        Assertions.assertEquals(expectedOutput,outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Integration Test #2")
    void runTest2(){
        //Arrange
        String argument= "sample_input/input2.txt";
        String expectedOutput = "RENEWAL_REMINDER MUSIC 27-02-2020\n" +
                "RENEWAL_REMINDER PODCAST 29-12-2019\n" +
                "RENEWAL_AMOUNT 550";
        //Act
        App.run(Collections.singletonList(argument));
        //Assert
        Assertions.assertEquals(expectedOutput,outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Integration Test #3")
    void runTest3(){
        //Arrange
        String argument= "sample_input/input3.txt";
        String expectedOutput = "RENEWAL_REMINDER MUSIC 15-10-2021\n" +
                "RENEWAL_REMINDER VIDEO 15-10-2021\n" +
                "RENEWAL_REMINDER PODCAST 15-08-2021\n" +
                "RENEWAL_AMOUNT 850";
        //Act
        App.run(Collections.singletonList(argument));
        //Assert
        Assertions.assertEquals(expectedOutput,outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Integration Test #4")
    void runTest4(){
        //Arrange
        String argument= "sample_input/input4.txt";
        String expectedOutput = "INVALID_DATE\n" +
                "ADD_SUBSCRIPTION_FAILED INVALID_DATE\n" +
                "ADD_SUBSCRIPTION_FAILED INVALID_DATE\n" +
                "ADD_TOPUP_FAILED INVALID_DATE\n" +
                "SUBSCRIPTIONS_NOT_FOUND";
        //Act
        App.run(Collections.singletonList(argument));
        //Assert
        Assertions.assertEquals(expectedOutput,outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Integration Test #5")
    void runTest5(){
        //Arrange
        String argument= "sample_input/input5.txt";
        String expectedOutput = "ADD_SUBSCRIPTION_FAILED DUPLICATE_CATEGORY\n" +
                "ADD_TOPUP_FAILED DUPLICATE_TOPUP\n" +
                "RENEWAL_REMINDER MUSIC 10-11-2022\n" +
                "RENEWAL_AMOUNT 200";
        //Act
        App.run(Collections.singletonList(argument));
        //Assert
        Assertions.assertEquals(expectedOutput,outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Integration Test #6")
    void runTest6(){
        //Arrange
        String argument= "sample_input/input6.txt";
        String expectedOutput = "RENEWAL_REMINDER MUSIC 10-03-2022\n" +
                "RENEWAL_REMINDER VIDEO 10-03-2022\n" +
                "RENEWAL_REMINDER PODCAST 10-03-2022\n" +
                "RENEWAL_AMOUNT 250";
        //Act
        App.run(Collections.singletonList(argument));
        //Assert
        Assertions.assertEquals(expectedOutput,outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Integration Test #7")
    void runTest7(){
        //Arrange
        String argument= "sample_input/input7.txt";
        String expectedOutput = "ADD_TOPUP_FAILED SUBSCRIPTIONS_NOT_FOUND\n" +
                "SUBSCRIPTIONS_NOT_FOUND";
        //Act
        App.run(Collections.singletonList(argument));
        //Assert
        Assertions.assertEquals(expectedOutput,outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Integration Test #8")
    void runTest8(){
        //Arrange
        String argument= "sample_input/input8.txt";
        String expectedOutput = "SUBSCRIPTIONS_NOT_FOUND\n" +
                "No Command Found!";
        //Act
        App.run(Collections.singletonList(argument));
        //Assert
        Assertions.assertEquals(expectedOutput,outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("Integration Test #9")
    void runTest9(){
        //Arrange
        String argument= "sample_input/input9.txt";
        String expectedOutput = "ADD_SUBSCRIPTION_FAILED DUPLICATE_CATEGORY\n" +
                "ADD_SUBSCRIPTION_FAILED DUPLICATE_CATEGORY\n" +
                "ADD_SUBSCRIPTION_FAILED DUPLICATE_CATEGORY\n" +
                "ADD_SUBSCRIPTION_FAILED DUPLICATE_CATEGORY\n" +
                "ADD_SUBSCRIPTION_FAILED DUPLICATE_CATEGORY\n" +
                "ADD_SUBSCRIPTION_FAILED DUPLICATE_CATEGORY\n" +
                "ADD_TOPUP_FAILED DUPLICATE_TOPUP\n" +
                "RENEWAL_REMINDER MUSIC 28-03-2022\n" +
                "RENEWAL_REMINDER VIDEO 28-03-2022\n" +
                "RENEWAL_REMINDER PODCAST 28-05-2022\n" +
                "RENEWAL_AMOUNT 700";
        //Act
        App.run(Collections.singletonList(argument));
        //Assert
        Assertions.assertEquals(expectedOutput,outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

}
