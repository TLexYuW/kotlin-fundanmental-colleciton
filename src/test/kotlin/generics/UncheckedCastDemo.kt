package generics

import org.junit.jupiter.api.assertDoesNotThrow
import kotlin.test.Test
import kotlin.test.assertFails
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

/**
 * @author : Lex Yu
 */
private data class Animal(val name: String)

private class ListCasting {
    companion object {
        fun castListToAnimalType(inputList: List<*>): List<Animal> {
            return inputList as List<Animal>
        }
    }
}

class UncheckedCastDemo {
    @Test
    fun `when casting exception is thrown`() {
        val listOfObjects = listOf(1, 2, Animal("Dog"))
        val animalList: List<Animal> = ListCasting.castListToAnimalType(listOfObjects)
        assertTrue { animalList.size == 3 }
        assertFailsWith<ClassCastException> {
            animalList[0].name
        }
    }

    @Test
    fun `when casting exception is not thrown`() {
        val listOfObjects = listOf(Animal("Dog"), Animal("Cat"))
        val animalList: List<Animal> = ListCasting.castListToAnimalType(listOfObjects)
        assertTrue { animalList.size == 2 }
        assertDoesNotThrow { animalList.forEach { println(it.name) } }
    }
}