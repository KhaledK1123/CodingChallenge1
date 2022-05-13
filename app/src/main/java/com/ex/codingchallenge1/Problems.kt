package com.ex.codingchallenge1

class Problems {

    //magic index function, Find magic index of a sorted array
    fun magicIndex(A: Array<Int>): Int {
        var magicInt = -1
        var i: Int = 0
        val length = A.size

        while (i < length) {

            if (i == A[i]) {
                magicInt = i
                break
            }
            else if (i < A[i])
            {
                i=A[i]
            }
            else
            {
                i += 1
            }
        }

        return magicInt
    }

    //Build a powerset
    //return: Set of all possible subsets
    fun <E> makeSubSets(set: Set<E>): Set<Set<E>> {

        return if (set.isEmpty()) {
            setOf(set)

        } else {
            val saved = set.first()
            val filteredSet = set.minus(saved)

            val subSets = makeSubSets(filteredSet)
            val newSet: MutableSet<Set<E>> = mutableSetOf(setOf())

            subSets.forEach { newSet.add(it.plus(saved)) }
            subSets + newSet
        }
    }

    //multiply without *
    fun multiply(x: Int, y: Int): Int {
        /* 0 multiplied with anything gives 0 */
        if (y == 0 || x == 0)
            return 0

        /* Add x one by one */
        if (y > 0)
            return (x + multiply(x, y - 1))

        /* the case where y is negative */
        if (y < 0)
            return -multiply(x, -y)

        return -1;
    }
}