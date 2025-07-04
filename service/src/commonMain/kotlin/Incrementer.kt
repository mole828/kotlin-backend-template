package service

interface Incrementer {
    fun inc(key: String, value: Int): Int
    fun get(key: String): Int?
}