package designPattern.behaviorPattern.state

import sun.rmi.runtime.Log

class LogIn : AbsState() {
    override fun logOut() {
        println("正在退出")
        logContext?.absState = LogOut()
    }

    override fun logIn() {
        println("已经登录")
    }
}