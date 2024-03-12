import java.util.*

fun main() {

    var count = 0
    var choice = 0
    do {
        val input = Scanner(System.`in`)
        print("Enter the number of rows: ")
        count = input.nextInt()
        
        println("1. Star Pyramid")
        println("2. Inverted Star Pyramid")
        println("3. Diamond Pyramid")
        println("4. X Star")
        println("5. Hollow Star Pyramid")
        println("6. Exit")
        print("Enter your choice: ")
        choice = input.nextInt()
        drawPyramid(count, choice)
    } while (choice != 6 && count > 0)

    println("Program terminated")
}

fun drawPyramid(count: Int, choice: Int) {
    when (choice) {
        1 -> StarPyramid(count).draw()
        2 -> InvertedStarPyramid(count).draw()
        3 -> DiamondPyramid(count).draw()
        4 -> XStar(count).draw()
        5-> HollowStarPyramid(count).draw()
        6 -> return
        else -> println("Invalid choice")
    }
}
