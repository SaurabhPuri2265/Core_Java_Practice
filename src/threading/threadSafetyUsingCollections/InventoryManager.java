package threading.threadSafetyUsingCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

    //We use concurrent collections for the synchronization of resources
    //The simple arraylists are not synchronized hence mutli threading not possible

    List<Product> soldProductsList = new CopyOnWriteArrayList<>();
    List<Product> purchasedProuctList = new ArrayList<>();

    public void populateSoldProduct(){

        for(int i=0;i<1000;i++)
        {
            Product product = new Product(i,"test product "+i);
            soldProductsList.add(product);
            System.out.println("Added: "+product);
            try {

                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displaySoldProduct(){

        for (Product product:soldProductsList) {
            System.out.println("PRINTING SOLD " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
