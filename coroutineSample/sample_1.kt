package coroutineSample

import kotlinx.coroutines.*


@OptIn(DelicateCoroutinesApi::class)
fun main(){

    CoroutineScope(Dispatchers.IO).launch {
        println("I am coroutine scope!!")
    }

    GlobalScope.launch {
        println("I am global scope")
    }

    runBlocking {
        println("Hey hello")
    }

    println("I am outside!!")

}