# Naming Conventions

In Java, variable names usually follow the `camelCase` pattern.

Example:

```java
String firstName = "John";
int studentAge = 20;
```

---

# Rules for Creating Variables

- Variable names cannot contain spaces.
- Variable names cannot start with numbers.
- Avoid special characters.
- Variable names should be descriptive.

✅ Correct:

```java
int userAge = 25;
```

❌ Incorrect:

```java
int 2age = 25;
int user age = 25;
```

---

# Difference Between Primitive and Reference Types

## Primitive Types

Store simple values directly.

Examples:

- `int`
- `double`
- `boolean`
- `char`

---

## Reference Types

Store references to objects.

Example:

```java
String name = "Java";
```

`String` is not a primitive type.

---

# Type Conversion

Java allows converting values between types.

Example:

```java
double number = 10.5;
int converted = (int) number;
```

Result:

```java
10
```