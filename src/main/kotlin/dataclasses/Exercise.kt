package dataclasses

fun main() {
    val newspaper = Newspaper()
    val javaArticle = newspaper.articles[0]
    val hospitalArticle = newspaper.articles[1]

    newspaper.articles.add(javaArticle.copy(title = "Java 15 Released"))
    newspaper.articles.add(hospitalArticle.copy(title = "America's Largest Private Hospital Closed Down"))

    newspaper.printArticles()
}

class Newspaper {
    var articles = arrayListOf<Article>()

    constructor() {
        articles.add(Article("Java 14 Released", "On March 17th, 2020, a newer version of Java was released", 5))
        articles.add(Article("Europe’s Largest Private Hospital Closed Down", "The largest private hospital is now closed", 10))
    }

    fun printArticles() {
        this.articles.forEach {
            println(it)
        }
    }
}

data class Article(
    val title: String,
    val content: String,
    val readers: Int
)