// PROBLEM: Replace 'associate' with 'associateWith'
// FIX: Replace with 'associateWith'
// WITH_RUNTIME
fun getValue(i: Int): String = ""

fun test() {
    setOf(1).<caret>associate { it to getValue(it) }
}