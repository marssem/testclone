package onv;

public class ArrayTest {
	
public static void main(String[] args) {
	int [][] nums = new int[3][3] ;
	/*nums[0][0] = 1;
	nums[0][1] = 2;
	nums[0][2] = 3;
	nums[1][0] = 4;
	nums[1][1] = 5;
	nums[1][2] = 6;
	*/
	int num = 1;
	for(int i=0;i<3;i++) {	
		
		for(int j=0;j<3;j++) {
		//	nums[i][j] = num++;
			nums[1][j] = (i*3)+1+j;
		}
	}
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.printf("nums[%d][%d]=%d\r",
					i,j,nums[i][j]);
		
		}
	}
}
}
	
	



