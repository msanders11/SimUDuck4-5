package version5.solution;


public class MuteQuack implements QuackBehavior {

        @Override
	public final void quack() {
		System.out.println("<< Silence >>");
	}

}
