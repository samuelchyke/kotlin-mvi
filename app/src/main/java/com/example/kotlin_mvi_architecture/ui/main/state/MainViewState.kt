package com.example.kotlin_mvi_architecture.ui.main.state

import com.example.kotlin_mvi_architecture.model.BlogPost
import com.example.kotlin_mvi_architecture.model.User

data class MainViewState(

    var blogPosts: List<BlogPost>? = null,
    var user: User? = null
)
