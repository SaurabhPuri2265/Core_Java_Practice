package threading.ProducerConsumerPatternWaitNotify;

import java.util.List;

public class Consumer implements Runnable {

    //Shared Resource
    List<Integer> questionList = null;

    public Consumer(List<Integer> questionList)
    {
        this.questionList=questionList;
    }

    public void answerQuestion() throws InterruptedException {

        //Synchronization to communicate between threads
        synchronized (questionList){
            while(questionList.isEmpty())
            {
                System.out.println("No Questions to answer...Waiting for producer questions...");

                //Calling wait method to wait for new questions
                questionList.wait();
            }
        }

        synchronized (questionList){
            Thread.sleep(5000);
            //Answer the first question and remove it from the list
            System.out.println("Answered question: "+questionList.remove(0));

            //to slow down the process of adding items
            Thread.sleep(100);

            //To notify that a item has been added to the questionlist
            questionList.notify();

        }

    }

    @Override
    public void run() {

        while(true)
        {
            try {
                answerQuestion();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
