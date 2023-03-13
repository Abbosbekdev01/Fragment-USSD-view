package uz.abbosbek.fragmentdialogs.models

import java.io.Serializable

data class User(
    val services: String,
    val codes: String,
    val prices:String,
    val about: String
) : Serializable
