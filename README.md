# Java-Testing-Practices
Junit and Mockito testing practice.

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
fail(String message) | _fails_ the test with the given message.

> **Note:** `assertEquals(Object, Object)`  from JUnit4/JUnit 5 or  `assertThat(actual, is(expected));`  from Hamcrest will work only as both  `equals()`  and  `toString()`  are overrided for the classes (and deeply) of the compared objects.
> 
> It matters because the equality test in the assertion relies on  `equals()`  and the test failure message relies on  `toString()`  of the compared objects.  
For built-in classes such as  `String`,  `Integer`  and so for ... no problem as these override both  `equals()`  and  `toString()`. So it is perfectly valid to assert  `List<String>`  or  `List<Integer>`  with  `assertEquals(Object,Object)`.

- A `message` can be passed as last argument for most of the assert methods to provide more description on the method.
