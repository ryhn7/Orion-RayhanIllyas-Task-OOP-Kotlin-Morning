package id.infinitelearning.KotlinSubmission.exercise4

import kotlin.random.Random
import kotlinx.coroutines.*

fun main() {
        runBlocking { getTheMission() }
}
/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 */
// Buat di bawah sini
suspend fun getTheMission() = coroutineScope {
        val hero = async {
                try {
                        getHeroes()
                } catch (e: Exception) {
                        print("Error: $e")
                        println()
                        "{No Hero was found}"
                }
        }
        val place = async {
                try {
                        getPlaces()
                } catch (e: Exception) {
                        print("Error: $e")
                        println()
                        "{No Place was found}"
                }
        }
        val name = getName()
        println("Hello $name,\nYou will be ${hero.await()} and you have to save ${place.await()}")
}

suspend fun getHeroes(): String {
        delay(1000)
        // Possible Exception
        if (Random.nextInt(0, 10) < 3) {
                throw Exception("Failed to get Heroes")
        }
        var heroList =
                        mutableListOf<String>(
                                        "Superman",
                                        "Batman",
                                        "The Flash",
                                        "Green Lantern",
                                        "Wonder Woman",
                                        "Spiderman",
                                        "Thor",
                                        "Captain America",
                                        "Loki",
                                        "Iron Man"
                        )
        return heroList.random()
}

suspend fun getPlaces(): String {
        delay(1000)
        // Possible Exception
        if (Random.nextInt(0, 10) < 3) {
                throw Exception("Failed to get Places")
        }
        var placeList =
                        mutableListOf<String>(
                                        "New York",
                                        "Gotham",
                                        "Metropolis",
                                        "Asgard",
                                        "Themyscira",
                                        "Central City",
                                        "Queens",
                        )
        return placeList.random()
}

fun getName(): String {
        // make a input reader
        print("Enter your name: ")
        val name = readLine()
        return name.toString()
}
