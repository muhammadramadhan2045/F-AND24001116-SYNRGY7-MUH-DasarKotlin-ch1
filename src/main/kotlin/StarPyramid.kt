class StarPyramid(private val height :Int) : Shape() {
    override fun draw() {
        for (i in 1..height) {
            for (j in 1..height - i) {
                print(" ")
            }
            for (k in 1 until 2 * i) {
                print("*")
            }
            println()
        }
    }
    
}
