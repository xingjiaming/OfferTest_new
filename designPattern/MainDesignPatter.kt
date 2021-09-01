package designPattern

import designPattern.behaviorPattern.chainofresponsibility.Handler1
import designPattern.behaviorPattern.chainofresponsibility.Handler2
import designPattern.behaviorPattern.observe.CurObservable
import designPattern.behaviorPattern.observe.Observe1
import designPattern.behaviorPattern.observe.Observe2
import designPattern.behaviorPattern.state.LogContext
import designPattern.behaviorPattern.state.LogOut
import designPattern.behaviorPattern.strategy.Circle
import designPattern.behaviorPattern.strategy.DrawTool
import designPattern.buildPattern.Singleton.DoubleCheckSingTonSafe
import designPattern.buildPattern.absfactory.FactoryHW
import designPattern.buildPattern.absfactory.FactoryXM
import designPattern.buildPattern.builder.DataBuilder
import designPattern.buildPattern.factorymethod.Factory1
import designPattern.buildPattern.factorymethod.Factory2
import designPattern.buildPattern.prototype.CommentData
import designPattern.buildPattern.prototype.RelationData
import designPattern.buildPattern.simpleFactory.Factory
import designPattern.structure.adapter.Adaptee
import designPattern.structure.adapter.Adapter
import designPattern.structure.briage.ActionA
import designPattern.structure.briage.ActionB
import designPattern.structure.briage.MemberA
import designPattern.structure.briage.MemberB
import designPattern.structure.decorator.ContextD
import designPattern.structure.decorator.IContext
import designPattern.structure.dynamicProxy.Context
import designPattern.structure.facadePattern.Client
import designPattern.structure.staticProxy.RequestProxy
import org.junit.Test
import utils.Utils

class MainDesignPatter {

    @Test
    @Throws(Exception::class)
    fun strategy() {
        println(DrawTool(Circle()).draw())
    }

    @Test
    @Throws(Exception::class)
    fun state() {
        val test = LogContext().also {
            it.absState = LogOut()
        }
        println(test.logoutTrigger())
        println(test.loginTrigger())
        println(test.loginTrigger())
        println(test.logoutTrigger())
    }

    @Test
    @Throws(Exception::class)
    fun chain() {
        val handler1 = Handler1(Handler2(null))
        handler1.handler("1")
        handler1.handler("Handler2")
        handler1.handler("Handler1")
    }

    @Test
    @Throws(Exception::class)
    fun observe() {
        val observe = CurObservable()
        observe.addObserve(Observe1())
        observe.addObserve(Observe2())
        observe.addObserve(Observe1())

        observe.notifyObserves("data ")
    }

    @Test
    @Throws(Exception::class)
    fun factory() {
        // 常用的最简单的
        Factory.getProduct("product1")?.also {
            it.show()
        }
        Factory.getProduct("product2")?.also {
            it.show()
        }
    }

    @Test
    @Throws(Exception::class)
    fun factoryMethod() {
        Factory1()?.getProduct("")?.run {
            this.show()
        }
        Factory2()?.getProduct("")?.run {
            this.show()
        }
    }

    @Test
    @Throws(Exception::class)
    fun absFactory() {
        // XML配置的方式会好一些
        FactoryHW()?.getProduct2("")?.show()
        FactoryHW()?.getProduct1("")?.show()
        FactoryXM()?.getProduct1("")?.show()
        FactoryXM()?.getProduct2("")?.show()
    }

    @Test
    @Throws(Exception::class)
    fun builderMode() {
        Utils.print(
            DataBuilder()
                .withName("xingjiaming")
                .withAvator("enter")
                .withTitle("title")
                .build()
                .toString()
        )
    }

    @Test
    @Throws(Exception::class)
    fun singleTon() {
        Utils.print(DoubleCheckSingTonSafe.getData().toString())
        Utils.print(DoubleCheckSingTonSafe.getData().toString())
        Utils.print(DoubleCheckSingTonSafe.getData().toString())
    }

    @Test
    @Throws(Exception::class)
    fun prototype() {
        val comment = CommentData()
        comment.run {
            name = "comment"
            relationData = RelationData()
            relationData.title = "comment_title"
        }

        val commentClone: CommentData = comment.clone() as CommentData
        commentClone.run {
            name = "commentClone"
            relationData.title = "commentClone_title"
        }

        Utils.print(comment.toString() + "  comment code  is  " + comment.hashCode())
        Utils.print(commentClone.toString() + "  commentClone  is  " + commentClone.hashCode())

        Utils.print(comment.toString() + "  comment code  is  " + comment.relationData.hashCode())
        Utils.print(commentClone.toString() + "  commentClone  is  " + commentClone.relationData.hashCode())
    }

    @Test
    @Throws(Exception::class)
    fun proxy() {
//        RequestProxy().request()
        Context.trigger()
    }

    @Test
    @Throws(Exception::class)
    fun adapter() {
        Adapter().show()
    }

    @Test
    @Throws(Exception::class)
    fun wrapper() {
        ContextD { Utils.print("这是装饰前的") }.run {
            show()
            showContextWrapper()
        }
    }

    @Test
    @Throws(Exception::class)
    fun facadePattern() {
        Client.showA()
        Client.showB()
    }

    @Test
    @Throws(Exception::class)
    fun briage(){
        MemberA().run {
            action = ActionA()
            wantToDo()
        }
        MemberA().run {
            action = ActionB()
            wantToDo()
        }
        MemberB().run {
            action = ActionA()
            wantToDo()
        }
        MemberB().run {
            action = ActionB()
            wantToDo()
        }
    }
}