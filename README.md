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
