import java.util.Scanner;

public class Rectangletest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i <=3; i ++){
			System.out.println("What is your Width");

			int l = scan.nextInt();
			System.out.println("What is your length");
			int w = scan.nextInt();
			Rectangle v = new Rectangle(l,w);
			System.out.println(v.getArea());
			System.out.println(v.getPerimeter());
		}
	}

}
