package com.veryfi.lens.bank.statements.demo.logs

import org.json.JSONObject

data class Log(
    val title: String = "",
    val message: JSONObject = JSONObject()
)