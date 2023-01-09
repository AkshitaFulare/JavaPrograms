package StaticFunc;

public class TestMain {

	public static void main(String[] args) {
		//TestMethod();
		Testing t = new Testing();
		t.TestMethod();
        Testing.TestMethod();
        //Testing.TestMethod2();
        t.TestMethod2();
        System.out.println(Testing.cal(7));
        System.out.println(Testing.cal(7.5,7.5));
        System.out.println(Testing.cal(7.5555,7.5555));
	}

}
