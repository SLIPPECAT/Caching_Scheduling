package com.practice.car;

import java.lang.reflect.Method;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableCaching
@Configuration
public class CacheConfig extends CachingConfigurerSupport{

	@Bean
	public KeyGenerator keyGenrerator(){
		return new KeyGenerator(){
			@Override
			public Object generate(Object o, Method method, Object... objects){
				StringBuilder sb = new StringBuilder();
				sb.append(o.getClass().getName());
				sb.append(method.getName());
				for (Object obj : objects){
					sb.append(obj.toString());
				}
				return sb.toString().hashCode();
			}
		};
	}
}
