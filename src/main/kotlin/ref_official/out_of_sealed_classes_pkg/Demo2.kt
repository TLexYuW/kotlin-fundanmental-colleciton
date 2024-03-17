package ref_official.out_of_sealed_classes_pkg

import ref_official.sealed_classes_and_interfaces.Shape

/**
 * @author : Lex Yu
 */

// 在不同檔案中定義的外部類別，無法擴充 sealed 介面 Shape
// 這段程式碼會引發編譯錯誤
//class Triangle(val base: Double, val height: Double) : Shape {
//    override fun calculateArea(): Double {
//        return 0.5 * base * height
//    }
//}
