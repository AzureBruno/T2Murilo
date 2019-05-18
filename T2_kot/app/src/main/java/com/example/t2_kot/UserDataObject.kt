package com.example.t2_kot

object UserDataObject {
    private var userName : String = ""
    private var userPass : String = ""

    fun builder(userName : String, userPass : String) {
        this.userName = userName
        this.userPass = userPass
    }

    fun getUserName(): String {
        return this.userName
    }

    fun getUserPass(): String {
        return this.userPass
    }
}