package designPattern.behaviorPattern.state

abstract class AbsState() {
    var logContext: LogContext? = null

    abstract fun logOut()

    abstract fun logIn()
}