package com.example.adv160421081week4.model

data class Game(
    val id:String?,
    val title:String?,
    val genre:String?,
    val platforms:List<String>?,
    val developer: Developer?,
    val images:String?
)
