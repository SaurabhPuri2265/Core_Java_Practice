package threading.threadSafetySchnronization;

public class Sequence {
    int value=0;

    public synchronized int getnext(){

        //Ensuring Threadsafety using synchronization between threads
        //We say that thread has acquired a lock and executes completely the code inside the 'synchronized' block
        //Synchrnized block guarantees atomicity


            value++;
            return value;

    }

}
