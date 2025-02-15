```groovy
def myMethod(String str) {
  if (str == null || str.isEmpty()) {
    return "null or empty string"
  }
  return str.toUpperCase()
}

println myMethod(null)
println myMethod("")
println myMethod("hello")
```