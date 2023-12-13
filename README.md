# PostfixArithmetic

# Postfix Arithmetic

Postfix is a way of representing mathmatical expressions. Postfix is evaluated faster than infix notation because there are no parenthesis to process.

### Infix Notation
(4 + 2 - 3) * 7

### Postfix Notation
4 2 + 3 - 7 *

## Processing a Postfix Expression
1. If the token is an operand, push it to the stack.
2. If the token is an operator, pop the stack twice to get two operands.
3. Use the operator on the two operands and push the result to the stack.
4. Repeat steps 1-3 until done reading.

# Instructions

Write a program that uses a stack to evaluate an expression written in postfix notation.


# Sample Execution
```
Expression? 4 2 + 3 - 7 *
Result: 21
```
