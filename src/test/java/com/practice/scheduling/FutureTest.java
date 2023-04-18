//package com.practice.scheduling;
//
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class FutureTest {
//
//	@Test
//	void future() throws ExecutionException, InterruptedException {
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//		Callable<String> callable = new Callable<String>() {
//			@Override
//			public String call() throws InterruptedException {
//				Thread.sleep(3000L);
//				return "Thread: " + Thread.currentThread().getName();
//			}
//		};
//
//		Future<String> future = executorService.submit(callable);
//
//		System.out.println(future.get());
//
//		executorService.shutdown();
//	}
//
//
//}
