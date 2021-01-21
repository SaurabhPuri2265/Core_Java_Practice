package threading.ProducerConsumerPatternWaitNotify;

import java.util.List;

public class Producer implements Runnable {

    //Shared Resource
    List<Integer> questionList = null;

    //total Number of question capacity
    final int LIMIT=5;

    private int questioNo;

    public Producer(List<Integer> questionList)
    {
        this.questionList=questionList;
    }

    public void readQuestion(int questioNo) throws InterruptedException {

        //Synchronization to communicate between threads
        synchronized (questionList){
            while(questionList.size()==LIMIT)
            {
                System.out.println("Questions piled up...wait for answers..");

                //Calling wait method to wait for standby answers
                questionList.wait();
            }
        }

        synchronized (questionList){
            System.out.println("New Question: "+questioNo);
            questionList.add(questioNo);

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
                readQuestion(questioNo++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
