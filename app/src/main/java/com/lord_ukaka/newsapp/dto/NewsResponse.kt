package com.lord_ukaka.newsapp.dto

import com.lord_ukaka.newsapp.dto.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)