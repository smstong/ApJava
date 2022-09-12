/*
 * Key points:
 * - 2D array is a 1D array whose elements are of type array.
 * - "int[][]" means "(int[])[]" 
 * - Rows may have different lengths. (APCSA only needs same length rows)
 * - 3D and more are rearly used. int[][][]
 */
class TwoDimensionArrayDemo
{
	public static void main(String[] args)
	{
		int[][] a1 = {
			{1,2,3},	// each row is an array
			{4,5,6},
			{7,8,9,10},
		};

		int[][] a2 = new int[3][4];
		a2[0][0] = 1;
		a2[2][3] = 1;

		// verify that int[][] is a type
		System.out.println(int[][].class);
		System.out.println(a1.getClass());

		// traverse
		for(int[] row : a1){
			for(int v : row){
				System.out.print(v + "\t");
			}
			System.out.println();
		}
		
		for(int i=0; i<a2.length; i++){
			for(int j=0; j<a2[i].length; j++){
				System.out.print(a2[i][j] + "\t");
			}
			System.out.println();
		}

		// as Matrix
	}
}
