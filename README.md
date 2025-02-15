# Groovy NullPointerException with String.toUpperCase()

This example demonstrates a potential NullPointerException in Groovy when using the `toUpperCase()` method on a String that might be null or empty.  The solution showcases a more robust approach to handling such cases.

## Bug

The original code attempts to handle null input by checking `str == null`. However, if the input string is empty (""), the `toUpperCase()` method will still cause a runtime error,  as an empty string is different from a null reference, even if it produces the same result when calling toUpperCase().

## Solution

The improved code addresses this by explicitly checking for both null and empty strings before calling `toUpperCase()`.  This ensures the function handles all possible input gracefully without throwing an exception.