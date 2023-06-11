package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// REVIEW: Сделай отдельный контроллер, который на вход принимает строку формата "Число1 + Число2"
        // и который возвращает результат (для простоты сделай эти числа как double). Не подключай его к вебу, просто возьми
        // этот бин из контекста и ручками вызови метод. Для такого случая лучше убрать Multiplier и Adder, а сделать
		// отдельный интерфейс Calculator с методами сложения, умножениями и другими операторами, а уже далее сделать
		// его реализации типа DoubleCalculator и IntegerCalculator, которые будут компонентами

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println(context.getBean("multiplier", Multiplier.class).eval(1, 2));
		System.out.println(context.getBean("adder", Adder.class).eval(1, 2));
	}

}
