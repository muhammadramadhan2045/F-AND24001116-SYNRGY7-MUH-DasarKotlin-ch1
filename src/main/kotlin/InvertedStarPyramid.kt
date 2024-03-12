class InvertedStarPyramid(private val height :Int): Shape() {
    override fun draw() {
        for (i in height downTo 1){
            for(j in 1..height - i){
                print(" ")
            }

            for(k in 1 until 2*i){
                print("*")
            }
            println()
        }
    }
}