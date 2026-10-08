//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.random.Random

fun main() {
    // Выигрышные числа (случайные, 3 разных)
    val winning = (0..42).shuffled().take(3)
    // Ввод игрока
    print("Введите первое число: ")
    val guess1 = readln().toInt()
    print("Введите второе число: ")
    val guess2 = readln().toInt()
    print("Введите третье число: ")
    val guess3 = readln().toInt()

    val guessed = listOf(guess1, guess2, guess3)
    val matches = guessed.intersect(winning)

    when (matches.size) {
        3 -> println("Вы выйграли джекпот")
        2 -> println("Вы выиграли крупный приз!")
        1 -> println("Вы выиграли утешительный приз!")
        else -> println("Неугадали ниодного числа")
    }
    println("Выигрышные числа: $winning")
}