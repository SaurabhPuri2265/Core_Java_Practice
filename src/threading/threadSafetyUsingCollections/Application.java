package threading.threadSafetyUsingCollections;

public class Application {

    public static void main(String[] args) throws InterruptedException {

        InventoryManager manager = new InventoryManager();

        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProduct();
            }
        });

        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProduct();
            }
        });

        inventoryTask.start();
        Thread.sleep(2000 );
        displayTask.start();
    }
}
