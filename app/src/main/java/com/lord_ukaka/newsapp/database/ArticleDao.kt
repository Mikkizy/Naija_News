package com.lord_ukaka.newsapp.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.lord_ukaka.newsapp.dto.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArticle(article: Article): Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)
}