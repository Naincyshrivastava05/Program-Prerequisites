import java.util.*;
class Problem5{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int rad = sc.nextInt();
	int height = sc.nextInt();
	int vol = (22/7) * rad*rad * height;
	System.out.println("Volume is:"+vol);
	}
}