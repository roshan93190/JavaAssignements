package Sprint2.masai.assignments;

public class PrintTheEvenSum {

 
	public static void main(String[] args) {
	 int [][] matrix=new int[3][3];
	 int [][] mat= {{1,2,3},{4,5,6},{7,8,9}};
	 
	 for(int i=0;i<mat.length;i++) {
		 int sum=0;
		 for(int j=0;j<mat[i].length;j++) {
			 if(mat[j][i]%2==0) {
				 sum+=mat[j][i];
			 }
		}
		 System.out.println(sum);
	 }
	}

}
