package clock;


	public class ClockMain {

		public static void main(String[] args) {
			Clock c1 = new Clock();
			boolean setCheck = c1.setTime(15,60,60);
			System.out.println(setCheck);
			c1.printTime();
		}
	}

