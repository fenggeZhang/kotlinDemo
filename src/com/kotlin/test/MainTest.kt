package com.kotlin.test

fun main(args: Array<String>) {
    val a = "你好，lalalala,,,"
    print(a.trimPunct())
}

fun String.trimPunct(): String? {
    return if (this.isEmpty()) {
        ""
    } else this.replace("[\\pP\\p{Punct}]".toRegex(), "")
}
