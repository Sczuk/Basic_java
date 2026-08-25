# Conditional Statements (`if` / `else`) in Java

## What is an `if` Statement?

The `if` statement is used to create conditions in Java.

It allows the program to make decisions based on whether a condition is `true` or `false`.

---

# Comparison Operators

These operators are commonly used inside conditions:

| Operator | Meaning |
|---|---|
| `==` | Equal to |
| `!=` | Different from |
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal to |
| `<=` | Less than or equal to |

---

# Logical Operators

These operators are used to combine conditions:

| Operator | Meaning |
|----|--------|
| `&&` | AND    |
|    | OR |
| `!` | NOT    |

Example:

```java
--AND--
if(age >= 18 && age < 50){
    return "your are adult";
}
```

```java
--OR--
if(animal.equals(dog) || animal.equals(cat)){
    return pet;
}
```

```java
--NOT--
if(!testConnect){
    return "connecting failed";
}
```

---

# Basic `if` Structure

```java
if(condition) {

    // code

}
```

Example:

```java
int age = 18;

if(age >= 18) {
    System.out.println("Adult");
}
```

---

# `if` with `else`

The `else` block runs when the condition is `false`.

```java
if(condition) {

    // code if true

} else {

    // code if false

}
```

Example:

```java
int age = 15;

if(age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

---

# `if`, `else if`, and `else`

Used when there are multiple conditions.

```java
int grade = 75;

if(grade >= 90) {
    System.out.println("Excellent");
} else if(grade >= 60) {
    System.out.println("Approved");
} else {
    System.out.println("Failed");
}
```

---

# Conclusion

Conditional statements are essential in Java because they allow the program to make decisions and execute different actions depending on the condition.