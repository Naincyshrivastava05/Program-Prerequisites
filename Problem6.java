import java.util.*;
class Problem6{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int Principal = sc.nextInt();
	int rate = sc.nextInt();
	int time = sc.nextInt();
	int SimpleInterest = (Principal * rate * time) / 100;
	System.out.println("SimpleInterest is:"+SimpleInterest);
	}
}