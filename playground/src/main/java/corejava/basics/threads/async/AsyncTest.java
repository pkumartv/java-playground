package corejava.basics.threads.async;



import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AsyncTest {

    public static Future<String> calculateAsync() throws InterruptedException {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            completableFuture.complete("Hello");
            return null;
        });

        return completableFuture;
    }


    public static void main(String[] args) {
        Future<String> completableFuture=null;
        try {
            completableFuture = calculateAsync();
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

// ...

String result="";
try {
    result = completableFuture.get();
} catch (InterruptedException | ExecutionException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
//assertEquals("Hello", result);
System.out.println(result);

    }

}
