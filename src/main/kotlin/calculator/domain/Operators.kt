package calculator.domain

import java.util.*

class Operators(private val operatorQueue: Queue<Operator>) {

    fun hasNext(): Boolean {
        return operatorQueue.isNotEmpty()
    }

    fun pull(): Operator {
        return operatorQueue.poll()
    }
}
