```groovy
def myMethod(String str) {
  if (str == null) {
    return "null string"
  }
  return str.toUpperCase()
}

println myMethod(null)
println myMethod("")
```