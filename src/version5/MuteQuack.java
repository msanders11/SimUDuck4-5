package version5;

public class MuteQuack implements QuackBehavior {

        @Override
	public final void quack() {
		System.out.println("<< Silence >>");
	}

}
