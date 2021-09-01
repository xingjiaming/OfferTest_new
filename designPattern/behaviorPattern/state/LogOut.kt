package designPattern.behaviorPattern.state

class LogOut : AbsState() {
    override fun logOut() {
        println("已经退出")
    }

    override fun logIn() {
        println("正在登录")
        logContext?.absState = LogIn()
    }
}