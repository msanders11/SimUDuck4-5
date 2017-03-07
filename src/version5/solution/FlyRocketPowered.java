package version5.solution;

import version5.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
        @Override
	public final void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
