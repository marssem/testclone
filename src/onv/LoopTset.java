package onv;

public class LoopTset {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		for(int i=1;i<=1000;i++) {
			if(i%2==0) {
				n1 += 1;
			}else {
				n2 += i;
			}
		}
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n1+n2);
		
		
	}

}
