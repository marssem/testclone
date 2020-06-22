package onv;

public class ArrayTest2 {
public static void main(String[] args) {
	int[][] nums = new int[4][3];
	for(int i=0;i<nums.length;i++) {
		for(int j=0;j<nums[1].length;j++) {
		}
	}
	
	//nums[1][j] = (i*(nums.length))+1+(nums.length[0]);
	for(int i=0;i<nums.length;i++) {
		for(int j=0;j<nums[1].length;j++) {
			nums[i][j]=(i*nums.length)+1+j;
			System.out.println("nums["+
		i+"]["+j+"]="+nums[i][j]);
			
			
		}
		
		
	}
	
}
}
