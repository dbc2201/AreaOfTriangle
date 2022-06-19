# Area of a Triangle

## Java Programming Course

---

**Course 1**: Problem-Solving and Computational Thinking in Java

**Sprint 4**: Use Operators and Conditional Constructs

---

Problem Statement
---

Calculate the area of a triangle using [Heron's Formula](https://en.wikipedia.org/wiki/Heron's_formula)

$$area=\sqrt{s(s-a)(s-b)(s-c)}$$

$$s=\frac{a+b+c}{2}$$

Where `a`, `b`, and `c` are the lengths of the sides of the triangle.

---

Task
---

1. Open the [source code file](src/main/java/io/github/dbc/TriangleAreaFinder.java) and complete the code.
2. Open the [test case file](src/test/java/io/github/dbc/TriangleAreaFinderTest.java) and run the test cases to
   check your code.

---

Hint
---

Use either the [Math.sqrt()](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html#sqrt(double))
or [Math.pow()](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Math.html#pow(double,double)) method to calculate the value of the `area`.