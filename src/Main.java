
public class Main {
	public static void main(String[] args) throws Exception {
		try {
			int i = 1/0;
			System.out.println(i);
		}
		catch(ArithmeticException e) {
			System.out.println("handling ArithmeticException");
		}
		catch(Exception e) {
			log(e);
			throw e;
		}
		finally {
			System.out.println("I'm always called");
		}
	}

	public static void log(Exception e) {
		System.out.println("Logged: "+e);
	}
}
