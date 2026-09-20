
# Calculator

A simple command-line calculator written in Java.

**Author:** Simon Toivola  
**Course:** SY25 System Development in Java — Assignment 2

---

## About

This project is a terminal-based calculator that lets the user pick an operator, enter a list of floating-point numbers, and get a result. It handles input validation, division by zero, and a help menu.

---

## Features

- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`*`)
- Division (`/`)
- Modulo (`%`)
- Exponentiation (`^`) — right-associative, positive operands only
- Help menu (`?`)
- Exit (`x`)
- Input validation for both operator and operands
- Error handling for division by zero and invalid input
- Supports decimal numbers (use `.`) and negative numbers

---

## Files

| File | Description |
|------|-------------|
| `Main.java` | Entry point — main menu loop and dispatch |
| `Menu.java` | Operator menu and operand input |
| `Calculator.java` | Performs the calculations |
| `Help.java` | Prints the help text |

---

## Requirements

- **Java 24 preview**  

---

## How to Run

1. Compile all files:
   ```bash
   javac *.java
