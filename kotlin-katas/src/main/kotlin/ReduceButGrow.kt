// Given a non-empty array of integers, return the result of multiplying the values together in order.

fun grow(arr: IntArray) = arr.reduce { acc, i -> acc * i}