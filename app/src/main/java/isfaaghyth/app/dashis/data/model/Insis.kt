package isfaaghyth.app.dashis.data.model

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */
data class Insis(
        val uuid: String,
        val title: String,
        val value: Int,
        val studentId: Student
)

data class Insisses(
        val status: Int,
        val value: List<Insis>
)