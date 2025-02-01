package com.eduardokandalski.dsjspd01;

import com.eduardokandalski.dsjspd01.entities.Order;
import com.eduardokandalski.dsjspd01.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dsjspd01Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Dsjspd01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order01 = new Order(1034, 150.0, 20.0);
		Order order02 = new Order(2282, 800.0, 10.0);
		Order order03 = new Order(1309, 95.9, 0.0);
		Order order04 = new Order(4501, 178.5, 5.0);

		System.out.println("Pedido código " + order01.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order01)));
		System.out.println();

		System.out.println("Pedido código " + order02.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order02)));
		System.out.println();

		System.out.println("Pedido código " + order03.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order03)));
		System.out.println();

		System.out.println("Pedido código " + order04.getCode());
		System.out.println("Valor total: R$ " + String.format("%.2f", orderService.total(order04)));
	}
}
