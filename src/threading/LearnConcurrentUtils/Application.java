package threading.LearnConcurrentUtils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {

    public static void main(String[] args) {

        //We aim to implement Producer Consumer problem by a special queue as wait and notify methods  mimic the working of a queue only
        //We use concurrent version of queue here to avoid coding of synchronize method and wait and notify method
        //ArrayBlocking Queue operates in a concurrent manner
        BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<Integer>(5);

        //Creation of producer and consumer threads
        Thread t1 = new Thread(new Producer(questionQueue));
        Thread t2 = new Thread(new Consumer(questionQueue));

        //Starting the threads
        t1.start();
        t2.start();



    }
}
