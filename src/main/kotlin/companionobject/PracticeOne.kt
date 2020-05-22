package companionobject

fun main() {
    val course = Course()
    println(course.getCourseDescription())
    println(Course.getCourseMetaInfo())
}

class Course {
    fun getCourseDescription() : String {
        return "This course aims to teach programming"
    }

    companion object {
        fun getCourseMetaInfo() : String {
            return "Programming course divided into 5 modules"
        }
    }
}