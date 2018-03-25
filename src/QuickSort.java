public class QuickSort {
	public static void quickSort(int[] array){
		quickSort(array, 0, array.length-1);
	}
	public static void quickSort(int[] array, int low, int high){
		if(low < high){
			int pivot = partition(array, low, high);
			quickSort(array, low, pivot-1);
			quickSort(array, pivot+1, high);
		}
	}
	public static int partition(int[] array, int low, int high){
		int pivot = array[high];
		int smallerThanPivot = low-1;
        for (int biggerThanPivot=low; biggerThanPivot<high; biggerThanPivot++)
        {
            if (array[biggerThanPivot] <= pivot)
            {
                smallerThanPivot++;
                int temp = array[smallerThanPivot];
                array[smallerThanPivot] = array[biggerThanPivot];
                array[biggerThanPivot] = temp;
            }
        }
 
        int temp = array[smallerThanPivot+1];
        array[smallerThanPivot+1] = array[high];
        array[high] = temp;
        return smallerThanPivot+1;
	}
	public static void main(String[] args) {
		int[] test = {5,3,6,1,0,2};
		quickSort(test);
		for(int i=0 ; i<test.length ; i++){
			System.out.print(test[i]+" ");
		}
	}
}