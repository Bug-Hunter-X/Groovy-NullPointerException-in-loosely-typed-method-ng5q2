def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // or some other appropriate default value
  }
  return a + b
}

println myMethod(null, 5)
println myMethod(10, null)
println myMethod(10, 5)