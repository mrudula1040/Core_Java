package while_loop;

public class While4 {
	public static void main(String[] args) {
		int n = 5;
		int i = 1;
		while (i <= 10) {
			int result = n * i;
			System.out.printf("%d * %d = %d\n", n, i, result);
			i++;
		}

	}

}