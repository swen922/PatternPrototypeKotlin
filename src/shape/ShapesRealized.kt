package shape

class Circle : Shape {
    var diameter : Int = 0
    override var color : String = ""

    constructor() : super()

    constructor(input: Circle) : super(input) {
        this.diameter = input.diameter
        this.color = input.color
    }

    override fun getType(): String {
        return this.toString()
    }

    override fun cloneShape(): Shape {
        return Circle(this)
    }

    override fun toString(): String {
        return "Circle(diameter=$diameter, color='$color')"
    }
}

class Rectangle : Shape {
    var width : Int = 0
    var height : Int = 0
    override var color : String = ""

    constructor() : super()
    constructor(input: Rectangle) : super(input) {
        this.width = input.width
        this.height = input.height
        this.color = input.color
    }

    override fun getType(): String {
        return this.toString()
    }

    override fun cloneShape(): Shape {
        return Rectangle(this)
    }

    override fun toString(): String {
        return "Rectangle(width=$width, height=$height, color='$color')"
    }
}