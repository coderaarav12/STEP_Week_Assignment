# STEP Week Assignments

Welcome to the **STEP (Skills Training & Enrichment Program)** weekly assignment repository.

This repository stores the Java solutions and problem-sheet PDFs given during the STEP classes.
Each week's work lives on its own branch so you can track progress week by week.

## Repository Layout

| Branch | Contents |
| ------ | -------- |
| [`week1`](https://github.com/coderaarav12/STEP_Week_Assignment/tree/week1) | Week 1 — Core Java exercises (Day 1) + mentor problem sheet PDF |
| [`week2`](https://github.com/coderaarav12/STEP_Week_Assignment/tree/week2) | Week 2 — String handling, validation & formatting (Day 2) + practice PDF |
| `main` | This overview README |

## What the STEP Classes Cover

The STEP classes build programming fundamentals in Java, progressing from basic language
constructs to practical, real-world style problems.

### Week 1 — Core Java Fundamentals
Classic beginner exercises that practise **input handling, conditional logic, loops,
arrays, and HashMap-based counting**:

- **Q1 — Rock Paper Scissors**: Simple game against the computer using `Random` and `if/else` logic.
- **Q2 — Palindrome Checker**: Compares a string with its reverse to detect palindromes.
- **Q3 — VIP Customer**: Classifies customers as VIP or Regular by checking an ID prefix (`VIP-`).
- **Q4 — Unique Letter**: Finds the first non-repeating character using a frequency `HashMap`.
- **Q5 — Shortest & Longest Word**: Splits a sentence and finds the smallest and largest words.

### Week 2 — String Processing, Validation & Formatting
Problems that focus on **String manipulation, regular expressions, and input validation**
for realistic banking / academic scenarios:

- **P1 — Vowel & Consonant Counter**: Counts vowels and consonants in a sentence.
- **P2 — CSV Student Record Parser**: Parses and validates a `name,rollno,dept` CSV line.
- **P3 — File Extension Validator**: Accepts only allowed file types (pdf, docx, zip).
- **P4 — Masked Phone Number Formatter**: Masks a 10-digit phone number (`XXXXXX-1234`).
- **P5 — Bank Transaction Reference Generator**: Validates a 14-character bank
  reference and formats the embedded date + sequence.

## Running the Solutions

Each solution is a self-contained Java file. Compile and run it with:

```bash
javac Q1.java
java Q1
```

Week 1 programs read input from the console; Week 2 programs run against
hard-coded sample inputs in `main()`.

## Requirements

- Java 8 or newer
- No external libraries needed
