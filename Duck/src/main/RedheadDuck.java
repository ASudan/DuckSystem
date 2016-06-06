package main;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyWithRocket();
	}
}
