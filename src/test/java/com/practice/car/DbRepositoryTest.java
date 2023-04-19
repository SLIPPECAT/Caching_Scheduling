//package com.practice.car;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class DbRepositoryTest {
//
//	@Autowired
//	CarRepository nonDbRepository = new CarRepository();
//
//	@Test
//	@DisplayName("자동차 색 랜덤으로 나오는지 확인")
//	public void random_color_check(){
//		//given
//		Car car = new Car("Ryu", "red");
//
//		//when
//		String color = String.valueOf(nonDbRepository.randomCarColor(car));
//
//		//then
//		System.out.println(car.getColor());
//		System.out.println(color);
//
//
//	}
//
//}
