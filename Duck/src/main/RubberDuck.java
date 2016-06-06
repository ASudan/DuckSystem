package main;

public class RubberDuck extends Duck {
	public RubberDuck() {
		quackBehavior=new  Quack();
		flyBehavior=new  FlyNoWay();
	}
	
}
