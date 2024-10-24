# Example

Simple example of pitest configured for a multi module projects, excluding a failing test with configuration in the root pom.

Pitest has been bound to test-compile in a profile name pitest. This enables pitest to be easily run without the test failing in surefire.

```
mvn -Ppitest test-compile
```
