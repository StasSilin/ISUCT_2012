package com.isuct.programming;

import com.isuct.programming.Car;

public class HelloWorld {

	public static void main(String[] args) {
		// создаем классику
		Car vaz2107 = new Car(3000, 1400, 1800);
		vaz2107.setPosition(0, 0);
		vaz2107.setFuelLevel(20);
		vaz2107.setRashod(8);
		if (vaz2107.move("x", 100)) {
			System.out.println("2107 Новые координаты теперь х= "
					+ vaz2107.getCoords()[0] + " y= " + vaz2107.getCoords()[1]);
		} else {
			System.out.println("2107 Не хватит топлива");
		}

		if (vaz2107.move("y", 500)) {
			System.out.println("2107 Новые координаты теперь х= "
					+ vaz2107.getCoords()[0] + " y= " + vaz2107.getCoords()[1]);
		} else {
			System.out.println("2107 Не хватит топлива");
		}
		System.out.println("2107 Проверим координаты х= " + vaz2107.getCoords()[0]
				+ " y= " + vaz2107.getCoords()[1]);

		
		Car ladaLargus= new Car(3000, 1400, 1800,4,5,5);
		ladaLargus.setPosition(0, 0);
		ladaLargus.setFuelLevel(30);
		ladaLargus.setRashod(5);
		if (vaz2107.move("y", 100)) {
			System.out.println("Largus Новые координаты теперь х= "
					+ vaz2107.getCoords()[0] + " y= " + vaz2107.getCoords()[1]);
		} else {
			System.out.println("Largus Не хватит топлива");
		}

		if (vaz2107.move("y", 100)) {
			System.out.println("Largus Новые координаты теперь х= "
					+ vaz2107.getCoords()[0] + " y= " + vaz2107.getCoords()[1]);
		} else {
			System.out.println("Largus Не хватит топлива");
		}

		
	}
}
