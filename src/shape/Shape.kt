package shape

abstract class Shape {
    open var sizeX : Int = 0
    open var sizeY : Int = 0
    open var color : String = ""

    constructor() {
    }

    constructor(input : Shape) {
        this.sizeX = input.sizeX
        this.sizeY = input.sizeY
        this.color = input.color
    }

    abstract fun getType() : String
    abstract fun cloneShape() : Shape
}