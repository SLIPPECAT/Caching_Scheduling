//package com.practice.car;
//
//import javax.cache.Cache;
//import javax.cache.CacheManager;
//import javax.cache.Caching;
//import javax.cache.configuration.MutableConfiguration;
//import javax.cache.expiry.CreatedExpiryPolicy;
//import javax.cache.expiry.Duration;
//import javax.cache.spi.CachingProvider;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
///**
// *
// */
//@SpringBootApplication
//public class CachingApp implements CommandLineRunner {
//	private static final Logger logger = LoggerFactory.getLogger(CachingApp.class);
//
//	public static void main(String[] args) {
//		SpringApplication.run(CachingApp.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		CachingProvider cachingProvider = Caching.getCachingProvider();
//		CacheManager cacheManager = cachingProvider.getCacheManager();
//		MutableConfiguration<Long, String> config = new MutableConfiguration<Long, String>()
//			.setTypes(Long.class, String.class)
//			.setStoreByValue(false)
//			.setExpiryPolicyFactory(CreatedExpiryPolicy.factoryOf(Duration.ONE_MINUTE));
//
//		Cache<Long, String> cache = cacheManager.createCache("jCache", config);
//		System.out.println("cachingProvider = " + cachingProvider);
//		cache.put(1L, "data-one");
//		String value = cache.get(1L);
//
//		System.out.println("caching에 저장된 내용 출력: " + value);
//
//	}
//
//}