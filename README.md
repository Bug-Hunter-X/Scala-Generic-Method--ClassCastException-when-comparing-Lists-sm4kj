# Scala Generic Method: ClassCastException when comparing Lists

This example demonstrates a common error when working with generic types and collections in Scala. The `==` operator compares references, not the content of the collections.  This leads to a `ClassCastException` when comparing Lists in a generic method even if the list contents are identical.

The solution involves using `equals` or a more robust comparison method for Lists, such as `deepEquals` from `org.scalactic.Equality`.

## Steps to Reproduce

1. Compile and run the code in `MyClass.scala`.
2. Observe the `ClassCastException` thrown when comparing `List(1, 2, 3)`.
