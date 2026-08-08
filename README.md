# STEP Week Assignments — Week 1

Welcome to the **STEP (Skills Training & Enrichment Program)** weekly assignment repository.
This branch (`week1`) contains the Week 1 assignment: **Core Java Fundamentals**.

## Week 1 — Core Java Fundamentals

Week 1 introduces core Java: **arrays, nested loops, String traversal, sum accumulation,
and running-maximum tracking** — through five real-world style problems.

All files live in the [`Week 1`](Week%201/) folder.

## Problems

| File | Problem | Sample Output |
| ---- | ------- | ------------- |
| `Week 1/Problem1_ExamHallSeatDuplicationChecker.java` | **Exam Hall Seat Duplication Checker** — flag duplicate seat numbers using arrays + nested loops (no Collections) | `Week 1/Problem1_Output.txt` |
| `Week 1/Problem2_TypingSpeedAccuracyChecker.java` | **Typing Speed Accuracy Checker** — character-by-character match, accuracy %, first mismatch position | `Week 1/Problem2_Output.txt` |
| `Week 1/Problem3_TrafficSignalStreakAnalyzer.java` | **Traffic Signal Streak Analyzer** — longest run of one color in a signal log | `Week 1/Problem3_Output.txt` |
| `Week 1/Problem4_WarehouseInventoryBalancer.java` | **Warehouse Inventory Balancer** — compare section totals and find the highest-quantity item | `Week 1/Problem4_Output.txt` |
| `Week 1/Problem5_MovieReviewWordLengthProfiler.java` | **Movie Review Word Length Profiler** — classify words as Short (1–4), Medium (5–8), Long (9+) | `Week 1/Problem5_Output.txt` |

## Running

Each program runs sample cases in `main()`. The matching output is captured in the
corresponding `ProblemX_Output.txt`.

```bash
cd "Week 1"
javac Problem1_ExamHallSeatDuplicationChecker.java
java Problem1_ExamHallSeatDuplicationChecker
```

## Problem Sheet

- [`Week 1/STEP=SEM-3 Week 1_Problems_Assignment.pdf`](Week%201/STEP%3DSEM-3%20Week%201_Problems_Assignment.pdf) — the official Week 1 assignment.

## Requirements

- Java 8 or newer
- No external libraries needed
