

## Junit
- Junit works on the principle of **Test Driven Development** which means it emphasises on setting up the test data for a piece of code before implementation
- The latest version of Junit is called 	**Jupiter** with version 5.0. Latest version of IntelliJ comes with Jupiter by default.
- Junit is an open source **Regression Testing Framework** mainly used to implement unit testing.

## Junit Jupiter
New annotations in Junit 5.0 when compared to Junit 4.0 :
|Junit 5.0  |Junit 4.0  | Description |
|--|--|--|
|_@BeforeEach_  | _@Before_  | Denotes that the annotated method will be executed before each test method |
_@AfterEach_ | _@After_ | Denotes that the annotated method will be executed after each test method |
_@BeforeAll_ | _@BeforeClass_ | Denotes that the annotated method will be executed before all test methods in the current class |
_@AfterAll_ | _@After_ | Denotes that the annotated method will be executed after all test methods in the current class |
_@Disable_ | _@Ignore_ | It is used to disable a test class or method
Additionally :
-   _@DisplayName_ – defines custom display name for a test class or a test method
-   _@Nested_ – denotes that the annotated class is a nested, non-static test class
-   _@Tag_ – declares tags for filtering tests
-   _@ExtendWith_  – it is used to register custom extensions

## Assertions

`Assertions` is a collection of utility methods that support asserting conditions in tests.
A *failed* assertio throws a **AssertionFailed** error.

Types of Assertions :
| **Method** | **Description** |
|--|--|
| assertEquals() | _Asserts_ that `expected` and actual values are equal
assertArrayEquals()  | Asserts that `expected` and `actual` arrays are equal
assertFalse(boolean Condition, String message) | Asserts that the given `boolean condition` is not true |
assertIterableEquals() | _Asserts_ that `expected` and `actual` iterables are **deeply** equal.
assertNotEquals() | _Asserts_ that `expected` and `actual` are not equal.|
assertNotNull(Object object, String message) | _Asserts_ that the passed `object` is not null |
assertNotSame() | _Asserts_ that `expected` and `actual` do not refer to the same object.|
assertNull(Object object) | _Asserts_ that the passed `object` is null |
assertSame() |  _Asserts_ that `expected` and `actual` refer to the same object.|
assertTrue(boolean Condition, String message) | _Asserts_ that the given `boolean condition` is true |
fail(String message) | _fails_ the test with the given message. |
assertThrows(Class expectedType,Executable executable ) | _Asserts_ that execution of the supplied `executable` throws an exception of the `expectedType` and returns the exception.
> **Note:** `assertEquals(Object, Object)`  from JUnit4/JUnit 5 or  `assertThat(actual, is(expected));`  from Hamcrest will work only as both  `equals()`  and  `toString()`  are overrided for the classes (and deeply) of the compared objects.
> 
> It matters because the equality test in the assertion relies on  `equals()`  and the test failure message relies on  `toString()`  of the compared objects.  
For built-in classes such as  `String`,  `Integer`  and so for ... no problem as these override both  `equals()`  and  `toString()`. So it is perfectly valid to assert  `List<String>`  or  `List<Integer>`  with  `assertEquals(Object,Object)`.
- A `message` can be passed as last argument for most of the assert methods to provide more description on the method.
- `assertThrows()` uses a lambda in place of executable.
