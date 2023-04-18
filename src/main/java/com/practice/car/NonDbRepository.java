package com.practice.car;

import org.slf4j.Logger;
import java.util.Random;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class NonDbRepository {
	private final long sleepTime = 3000L;
	private final Logger logger = LoggerFactory.getLogger(NonDbRepository.class);

	private void makeSlowService(){
		logger.info("start sleep");
		try{
			Thread.sleep(sleepTime);
		} catch (InterruptedException ire){
			throw new IllegalStateException(ire);
		}
		logger.info("end sleep");
	}

	public Car randomCarColor(Car car){
		Random rn = new Random();
		rn.setSeed(System.currentTimeMillis());

		String colors[] = {"red", "blue", "gray", "white", "purple"};
		for(int i = 0; i < 5; i++){
			int b = rn.nextInt(5);
			logger.info("" + b);
			car.setColor(colors[b]);
		}
		return car;
	}


	public Car getByName(String name){
		makeSlowService();
		Car myCar = new Car (name);
		return randomCarColor(myCar);
	}


}
