package models.Content

import play.api.libs.json.JsError
import play.api.libs.json.JsResult.Exception

import javax.inject.Inject

@javax.inject.Singleton
class PostDao @Inject()() {

  var posts: Seq[Post] = Seq(
    Post("title",  "What does the * stand for?", "float *x", 2023, 0, List("C", "Pointer")),
    Post("title","Why do i get a stackoverflow error?", "def main(): \n main()", 2015, 10, List("error", "python")),
    Post("title","What is a macro?", "#define SIZE 30", 2019, 5, List("macros", "C")),
    Post("title","What is an if", "if true ok", 2017, 2, List("beginner")),
    Post("title","What is an if", "if true ok", 2017, 2, List("beginner")),
    Post("title","What is an if", "if true ok", 2017, 2, List("beginner")),
    Post("title","What is an if", "if true ok", 2017, 2, List("beginner")),
    Post("title","What is an if", "if true ok", 2017, 2, List("beginner")))

  def findbyId(id:Int): Post = {
    posts.find(p => p.id == id).getOrElse(throw Exception(JsError("couldn't find post by id")))
  }
  def upvote(id: Int) = {
    val index = posts.indexWhere(p => p.id == id)
    val post = posts(index)
    post.upvote()
  }
  def downvote(id: Int) = {
    val index = posts.indexWhere(p => p.id == id)
    val post = posts(index)
    post.downvote()
  }
  def add(p:Post) = {
    posts = posts :+ p
  }
  def lookupPost(p: Post): Boolean = {
    posts.contains(p)
  }
  def sortPostsByDate() = {
     posts.sortWith((p1,p2) => p1.date < p2.date)
  }
  def sortPostsByUpvotes() = {
     posts.sortWith((p1,p2) => p1.votes < p2.votes)
  }
  def searchByTag(tag:String) = {
    posts.filter(p => p.tags.contains(tag))
  }

  def addAnswer(postId: Int, answerId: Int): Unit ={
    val index = posts.indexWhere(p => p.id == postId)
    val post = posts(index)
    post.addAnswer(answerId)
  }

}
