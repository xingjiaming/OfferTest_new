package designPattern.behaviorPattern.strategy

class DrawTool(var drawTool: IDraw? = null) {
    fun draw() {
        drawTool?.draw()
    }
}