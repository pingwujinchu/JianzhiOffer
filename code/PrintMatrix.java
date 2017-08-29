
public class PrintMatrix {
	public static void printMatrix(int[][]matrix){
		int rows = matrix.length;
		int start = 0;
		if(rows == 0){
			return;
		}
		int columns = matrix[0].length;
		while(start <= rows/2 && start <= columns / 2){
			int startX  = start;
			int endX = rows - 1 - start;
			int startY = start;
			int endY = columns - 1 - start;
			//打印行
			for(int i = start; i <= endY ; i++){
				System.out.println(matrix[start][i]);
			}
			
			//打印列
			if(endX - start >0){
				for(int j = start+1 ; j <= endX ; j++){
				   System.out.println(matrix[j][endY]);
				}
			}
			
			//打印下面的行
			if(endY - start > 0 && endX - start > 0){
				for(int j = endY -1 ; j>= start ; j--){
					   System.out.println(matrix[endX][j]);
				}
			}
			
			//打印前面的列
			if(endX-start > 1 && endY - start > 0){
				for(int k = endX - 1 ; k > start ; k--){
					System.out.println(matrix[k][start]);
				}
			}
			start ++;
		}
	}
	
	public static void main(String []args){
		PrintMatrix.printMatrix(new int[][]{{1,2,3,4},{4,5,6,6},{7,8,9,9}});
	}
}
