package ref_official.visibility_modifiers

/**
 * @author : Lex Yu
 */

open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4  // public by default

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = 5   // 'b' is protected
    override val c = 7   // 'c' is internal
}

class Unrelated(outer: Outer) {
    // o.a, o.b // are not visible
    // o.c, o.d // are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
    init {
        outer.d
        outer.c
    }

    val someValD = outer.d
    val someValC = outer.c
}