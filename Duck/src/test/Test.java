package test;

import main.Duck;
import main.MallardDuck;

public class Test {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
	}

}
