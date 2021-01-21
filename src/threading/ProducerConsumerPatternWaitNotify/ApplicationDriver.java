package threading.ProducerConsumerPatternWaitNotify;

import java.util.*;
import java.lang.*;

public class ApplicationDriver{

    public static void main(String[] args) {

        List<Integer> questionList = new ArrayList<>();

        Thread producer = new Thread(new Producer(questionList));

        Thread consumer = new Thread(new Consumer(questionList));

        producer.start();
        consumer.start();

    }

}
