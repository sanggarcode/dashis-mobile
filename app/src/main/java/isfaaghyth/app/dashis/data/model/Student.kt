package isfaaghyth.app.dashis.data.model

/**
 * Created by isfaaghyth on 17/01/19.
 * github: @isfaaghyth
 */
data class Student(
        val uuid: String,
        val name: String,
        val email: String
)

data class StudentAuth(
        val status: Int,
        val student: Student,
        val token: String
)