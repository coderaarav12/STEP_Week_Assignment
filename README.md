# STEP Week Assignments

Welcome to the **STEP (Skills Training & Enrichment Program)** weekly assignment repository.

This repository stores the Java solutions and problem-sheet PDFs given during the STEP classes.
Each week's work lives on its own branch so you can track progress week by week.

## Repository Layout

| Branch | Contents |
| ------ | -------- |
| [`week1`](https://github.com/coderaarav12/STEP_Week_Assignment/tree/week1) | Week 1 — Core Java exercises + problem sheet PDF + sample output files |
| `main` | This overview README |

## What the STEP Classes Cover

The STEP classes build programming fundamentals in Java, progressing from basic language
constructs to practical, real-world style problems.

### Week 1 — Core Java Fundamentals
Five self-contained programs that practise **arrays, nested loops, String traversal,
regex-free parsing, sum accumulation, and running-maximum tracking**:

1. **Exam Hall Seat Duplication Checker** — scans seat numbers with arrays + nested
   loops (no Collections) and flags any duplicated seat.
2. **Typing Speed Test Accuracy Checker** — compares a typed passage character-by-character
   against the original and reports accuracy % plus the first mismatch position.
3. **Traffic Signal Streak Analyzer** — scans a day's signal log (`R`/`Y`/`G`) and reports
   the longest continuous streak of a single color.
4. **Warehouse Inventory Balancer** — totals two storage sections, reports "Balanced" /
   "Not Balanced", and finds the single highest-quantity item.
5. **Movie Review Word Length Profiler** — splits a review into words and counts them as
   Short (1–4), Medium (5–8), or Long (9+).

Each problem ships as its own `.java` file together with a `.txt` file showing its output.

## Running the Solutions

Each solution is a self-contained Java file with sample cases in `main()`:

```bash
javac Problem1_ExamHallSeatDuplicationChecker.java
java Problem1_ExamHallSeatDuplicationChecker
```

## Requirements

- Java 8 or newer
- No external libraries needed
