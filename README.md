# Currency-Converter

A simple command-line application for converting amounts from Indian Rupees (INR) to various currencies. The application uses predefined exchange rates to perform conversions.

## Features

- Convert INR to various currencies such as USD, EUR, GBP, JPY, AUD, CAD, CHF, CNY, and RUB.
- Displays the converted amount in the target currency.
- Repeats conversions until the user decides to exit.

## Prerequisites

- Java Development Kit (JDK) 8 or higher installed on your machine.

## Code Explanation

- Exchange Rates: The application uses a HashMap to store predefined exchange rates for various currencies relative to INR.
- Conversion Logic: The conversion is done by multiplying the amount in INR by the exchange rate of the target currency.
- User Input: The program reads user input for the amount and target currency and handles invalid currency codes.
