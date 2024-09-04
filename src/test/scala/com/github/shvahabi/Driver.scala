package com.github.shvahabi

class Driver extends munit.FunSuite {
  test("""test "Hello world!" default message""") {
    val obtained = msg()
    val expected = "Hello world!"

    assertEquals(obtained, expected)
  }

  test("""test "Hello world!" non-default message""") {
    val obtained = msg("Shahed")
    val expected = "Hello Shahed!"

    assertEquals(obtained, expected)
  }
}
