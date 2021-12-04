package java8.CompletableFuture;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFutureTest {

    public static Future<String> calculateAsync() {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            System.out.println("Thread name is " + Thread.currentThread().getName());
            completableFuture.complete("DONEMAN");
            return null;
        });

        return completableFuture;

    }

    public static void main(String[] args) {

        // Future<String> oldFuture= new Future<String>() {
            
        // };
        Future<String> completableFuture = calculateAsync();

        // With an known result
        Future<String> knownResultFuture = CompletableFuture.completedFuture("Hello");
        
        String answer = "FAILED";
        try {
            answer = completableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(answer);
        // assertEquals(answer,"DONEMAN");

        // simply execute some code asynchronously
        CompletableFuture<String> completableFutureSimple = CompletableFuture.supplyAsync(() -> "Pavan");
        // This thenApply takes a function
        CompletableFuture<String> futureSimple = completableFutureSimple.thenApply(s -> s + " Kumar");

        // what if you do not need a return type (function returns a type)
        // Then we use thenAccept
        CompletableFuture<Void> futureWithConsumerNoRetunrType = completableFutureSimple
                .thenAccept(s -> System.out.println("okist" + s));

        try {
            System.out.println(futureSimple.get());
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Combing Futures
        // The thenCompose method, together with thenApply, implement basic building
        // blocks of the monadic pattern.
        // They closely relate to the map and flatMap methods of Stream and Optional
        // classes also available in Java 8.

        CompletableFuture<String> completableFutureCombined = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + " World"));

        // If we want to execute two independent Futures and do something with their
        // results,
        // we can use the thenCombine method that accepts a Future and a Function with
        // two arguments to process both results:

        CompletableFuture<String> completableFutureWithThenCombine = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCombine(CompletableFuture.supplyAsync(() -> " World"), (s1, s2) -> s1 + s2);

        // A simpler case is when we want to do something with two Futures‘ results,
        // but don't need to pass any resulting value down a Future chain.
        // The thenAcceptBoth method is there to help:

        CompletableFuture future = CompletableFuture.supplyAsync(() -> "Hello").then
                .thenAcceptBoth(CompletableFuture.supplyAsync(() -> " World"), (s1, s2) -> System.out.println(s1 + s2));


               // CompletableFuture.supplyAsync(supplier, executor)

    }

}
