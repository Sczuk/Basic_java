# Exercise - Password Creation and Validation

## Description

Create a Java program where the user creates a password and then confirms it.

The password cannot contain more than `10` characters.

After creating the password, the user must enter the password again to confirm it.

---

# Rules

- Use `Scanner` to read the password.
- Use `if` and `else`.
- If the password length is greater than `10`:
    - Show an error message.
- If the passwords are equal:
    - Show `"Password created successfully"`.
- Otherwise:
    - Show `"Passwords do not match"`.

---

# Hint

You can use:

```java
password.length()
```

to check the password size.

And:

```java
To compare a String, its not highly recommended to use "==", search for how to compare a String.
```

to compare the passwords.

---

# Example Output

```text
Create your password: java123
Confirm your password: java123

Password created successfully
```

---

# Another Example

```text
Create your password: verylargepassword

Error: password cannot contain more than 10 characters.
```

---

# Another Example

```text
Create your password: java123
Confirm your password: java321

Passwords do not match
```