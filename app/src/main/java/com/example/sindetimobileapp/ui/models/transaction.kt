package com.example.sindetimobileapp.ui.models

data class transaction(
    var description:String,
    var reference:String,
    var date:String,
    var amount:Int,
    var transaction_type:Boolean
)
