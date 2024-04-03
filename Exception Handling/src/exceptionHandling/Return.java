package exceptionHandling;

public class Return {

	public static void main(String[] args) {

		try {
			System.out.println("try");
			return;
		} catch (Exception e) {
			System.out.println("catch");
			return;
		} finally {
			System.out.println("finally Block return Statement has More Priority than try and Catch");
		}
	}

}
