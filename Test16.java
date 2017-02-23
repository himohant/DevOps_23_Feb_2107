interface A{
	 int x = 1;
}

public class Test1 implements A{
	

	public static void main(String[] args) {

		int x = 22;
		System.out.println(A.x);
	}

}
