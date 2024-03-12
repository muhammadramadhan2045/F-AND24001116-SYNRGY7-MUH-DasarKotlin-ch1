class HollowStarPyramid(private val height :Int) : Shape() {
    override fun draw() {
        for (i in 1..height) {
            for (j in 1..height - i) {
                print(" ")
            }
            for (k in 1 until 2 * i) {
                if (k == 1 || k == 2 * i - 1) {
                    print("*")
                }else if (
                    i == height && k % 2 == 1
                ){
                    print("*")
                }
                else {
                    print(" ")
                }
            }
            println()
        }
    }
}