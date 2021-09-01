package designPattern.behaviorPattern.state

class LogContext() {
    var absState: AbsState? = null
        set(value) {
            field = value.also {
                it?.logContext = this@LogContext
            }
        }

    fun loginTrigger() {
        absState?.logIn()
    }

    fun logoutTrigger() {
        absState?.logOut()
    }
}