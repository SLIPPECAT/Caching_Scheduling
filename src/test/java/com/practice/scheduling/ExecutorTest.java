package com.practice.scheduling;

import com.jogamp.common.util.RunnableExecutor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExecutorTest {

	@Test
	void executorRun(){
		final Runnable runnable = () -> System.out.println("Thread: " + Thread.currentThread().getName());

		Executor executor = new RunExecutor();
		executor.execute(runnable);

	}

	static class RunExecutor implements Executor{

		@Override
		public void execute(final Runnable command){
			command.run();
		}

	}



}
