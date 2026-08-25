# The `for` Loop in Java

## What is a `for` Loop?

The `for` loop is a repetition structure used when we already know (or control) how many times a block of code should be executed.

It's commonly used to iterate through sequences, count values, or repeat an action a defined number of times.

---

## Basic Structure

```java
for (initialization; condition; increment) {
    // code
}
```

- **initialization** → creates and sets the starting value of the control variable
- **condition** → checked before each iteration; while it's `true`, the loop continues
- **increment** → updates the control variable after each iteration

Example:

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

This code prints the numbers from `0` to `4`.

---

## How the `for` Loop Works (Step by Step)

1. The control variable is created (`int i = 0`)
2. The condition is checked (`i < 5`)
3. If it's `true`, the code block is executed
4. The increment is applied (`i++`)
5. The process repeats from step 2, until the condition becomes `false`

---

## `for` Looping Through an Array

The `for` loop is widely used to access each position of an array.

```java
int[] numbers = {10, 20, 30};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

---

## `for-each`

The `for-each` is a simplified version of the `for` loop, used when we don't need the index, only the value of each element.

```java
for (int number : numbers) {
    System.out.println(number);
}
```

---

## Decreasing `for`

The increment can also be negative, making the loop count backwards.

```java
for (int i = 5; i > 0; i--) {
    System.out.println(i);
}
```

---

## Conclusion

The `for` loop is essential in Java because it allows actions to be repeated in a controlled way, whether counting values, iterating through arrays, or executing a block of code a specific number of times.
