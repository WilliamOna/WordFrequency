# WordFrequency
## Problem Statement
Write a Java program to calculate word frequency.
Given a piece of text, it should output each word in the text and the number of times it occurred.
The words should be sorted by frequency, in descending order. Words with the same frequency
can be in any order.

For example for the input “the cat is in the bag”, output should be:
```
2 the
1 cat
1 is
1 in
1 bag
```

Please share your solution via a github

## Prerequisites
Please have at least Java 8 installed. Some of the syntax used in the code require at least Java 8.

## How to Run
The following steps are used to run the application with the least amount of additional tooling.

1. Clone the project:
    > git clone https://github.com/WilliamOna/WordFrequency.git
1. compile the source code:
    > javac Application.java
1. The step above should generate a file called 'Application.class'. Run this file:
    > java Application
1. Follow the prompt and enter any string that you like

## Considerations
- The application will take the lowercase version of strings that the user inputs. The frequency count is not case sensitive, so "DOG" will match "dog"
- Only words that consist of only letters will be counted. Other strings that are parsed will be ignored.
- If no valid word is given in the input string. There will be no output to display