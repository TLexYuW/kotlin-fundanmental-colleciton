package ref_official.inline_value_classes.mangling

/**
 * @author : Lex Yu
 */
@JvmInline
value class UInt(val x: Int)

// Represented as 'public final void compute(int x)' on the JVM
fun compute(x: Int) { }

// Also represented as 'public final void compute(int x)' on the JVM!
// Therefore, fun compute(x: UInt) will be represented as public final void compute-<hashcode>(int x)
//  , which solves the clash problem.
fun compute(x: UInt) { }


fun main() {


}