package example

import org.jdbi.v3.core.Handle

// Simple data class used for demonstration
data class Foo(
    val fooId: Long,
    val fooName: String,
)

/**
 * Example function demonstrating the use of JDBI's `bindList` syntax.
 */
fun getFooSituation(handle: Handle, fooIds: Set<Long>): List<Foo> {
    return handle.createQuery("select * from foo where foo_id in (<fooIds>)")
        .bindList("fooIds", fooIds)
        .mapTo(Foo::class.java)
        .toList()
}
