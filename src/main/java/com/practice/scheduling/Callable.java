package com.practice.scheduling;

@FunctionalInterface
public interface Callable<V> {

	V call() throws Exception;

}
