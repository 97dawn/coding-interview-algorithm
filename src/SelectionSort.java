
public class SelectionSort {
	public static int[] selectionSort(int[] array){
		int N = array.length;
		for(int i=0 ; i<N ; i++){
			int min=i;
			for(int j=i+1 ; j<N ; j++){
				if(array[j] < array[min]){
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		return array;
	}
	public static void main(String[] args) {
		int[] test = {3,5,6,1,0,7};
		int[] array = selectionSort(test);
		for(int i=0 ; i<array.length ; i++){
			System.out.print(array[i]+" ");
		}
	}
}
