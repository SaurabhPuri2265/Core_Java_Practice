package threading;

public class ThreadingDemo {

    public static void main(String[] args) {


        System.out.println("Starting thread 1");
        task taskRunner = new task("Thread-A");
        taskRunner.start();

        System.out.println("Starting thread 2");
        task taskRunner2 = new task("Thread-B");
        taskRunner2.start();


    }
}

//Defining a class extending Thread class
class task extends Thread{

    String name;

    task(String name)
    {
        this.name=name;
    }
    public void run(){
        Thread.currentThread().setName(this.name);
        for(int i=1;i<=5;i++) {
            System.out.println("number: " + i+"->"+Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
