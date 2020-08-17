package Misc.Multithreading.src;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<CallableTask> tasks = List.of(new CallableTask("First Student"), 
                                            new CallableTask("Second Student"), 
                                            new CallableTask("Third Student"));

        String result = executorService.invokeAny(tasks);

        System.out.println(result);
        
        executorService.shutdown();
    }
}