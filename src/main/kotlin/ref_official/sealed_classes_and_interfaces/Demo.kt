package ref_official.sealed_classes_and_interfaces

/**
 * @author : Lex Yu
 */
// 定義一個使用 sealed 關鍵字修飾的介面
sealed interface Shape {
    fun calculateArea(): Double
}

// 定義在相同檔案中的子類別，擴展自 sealed 介面 Shape
class Circle(val radius: Double) : Shape {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

class Rectangle(val width: Double, val height: Double) : Shape {
    override fun calculateArea(): Double {
        return width * height
    }
}
