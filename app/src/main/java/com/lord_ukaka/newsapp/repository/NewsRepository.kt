package com.lord_ukaka.newsapp.repository

import com.lord_ukaka.newsapp.api.RetrofitInstance
import com.lord_ukaka.newsapp.database.ArticleDatabase
import com.lord_ukaka.newsapp.dto.Article

class NewsRepository(
    val db: ArticleDatabase
) {

    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(query: String, pageNumber: Int) =
        RetrofitInstance.api.SearchNews(query, pageNumber)

    suspend fun insert(article: Article) = db.getArticleDao().insertArticle(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}