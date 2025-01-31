package racing.domain

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.should
import io.kotest.matchers.types.beInstanceOf

class ResultTest : StringSpec() {
    init {
        "Result 는 CarInfos 를 가질 수 있다" {
            val resultMutable: List<CarInfos> = buildList {
                add(CarInfos(listOf(CarInfo("ko", Position(1)), CarInfo("rong", Position(2)))))
                add(CarInfos(listOf(CarInfo("ko", Position(3)), CarInfo("rong", Position(4)))))
            }


            val result = Result(resultMutable)

            result.roundResults should beInstanceOf<List<CarInfos>>()
            result.roundResults[0].carInfoList shouldContainExactly listOf(
                CarInfo("ko", Position(1)),
                CarInfo("rong", Position(2))
            )
            result.roundResults[1].carInfoList shouldContainExactly listOf(
                CarInfo("ko", Position(3)),
                CarInfo("rong", Position(4))
            )
        }
    }
}
