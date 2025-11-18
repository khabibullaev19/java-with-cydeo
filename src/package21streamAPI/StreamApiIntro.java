package package21streamAPI;

public class StreamApiIntro {

    /*

        - Stream is a sequence of elements from a data structure(Array & Collection)
        - Stream takes inputs from the source (Array & Collection), but unable to change/modify it.

        - After calling the stream() function from an Array/Collection to obtain stream instance,
          the intermediate operations can be accessed:
        - distinct() = removing duplicated elements in the stream
        - map() = transforming(edit) the stream elements
        - peek() = iterating the elements before terminal operations
        - skip() = we provide number(ex:5), and it removes the first 5 elements
        - filter() = filtering according to condition
        - limit() = we provide number(ex:5), and it returns the first 5 elements
        - sorted() = sorting according to natural order

        - The terminal operations can be accessed through the stream instance:
        - collect() = after intermediate operations, collecting stream instances in a specific type(Collectors.toList()...)
        - reduce() = (initialIdentity, BinaryOperator): combine the elements of stream and returns them as a single value
        - forEach() = iterating the operation result at the end
        - allMatch() = checks if all elements in the stream matches with the specified predicate
        - anyMatch() = checks if any elements in the stream matches with the specified predicate
        - nonMatch() = checks if all the elements in the stream does not match with specified predicate
        - findAny()
        - findAll()
        - max()
        - min()
        - toArray() = returns stream instances as array(a bit like collect())
        - count() = returning the total number of instances in the stream

     */

}
