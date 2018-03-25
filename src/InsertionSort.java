
public class InsertionSort {
	public static int[] insertionSort(int[] array){
		for(int i=1 ; i<array.length ; i++){
			for(int j=i ; j>0 && array[j-1]>array[j] ; j--){
				int temp = array[j];
				array[j] = array[j-1];
				array[j-1] = temp;
			}
		}
		return array;
	}
	public static void main(String[] args) {
		int[] test = {3,5,6,1,0,2};
		int[] array = insertionSort(test);
		for(int i=0 ; i<array.length ; i++){
			System.out.print(array[i]+" ");
		}
	}

}
