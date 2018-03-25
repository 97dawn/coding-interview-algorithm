
public class MergeSort {
	private static int[] temp;
	private static int[] array;
	public static void mergeSort(){
		temp = new int[array.length];
		divide(0, array.length-1);
	}
	
	private static void divide(int leftStart, int rightEnd){
		if(leftStart >= rightEnd) return;
		int middle = (rightEnd + leftStart) / 2;
		divide(leftStart, middle);
		divide(middle+1, rightEnd);
		merge(leftStart, middle, rightEnd);
	}
	
	private static void merge(int leftStart, int mid, int rightEnd){
		for(int i=leftStart ; i<=rightEnd ; i++){
			temp[i] = array[i];
		}
				
		int left = leftStart;
		int right = mid+1;
		int index = leftStart;
		while(left <= mid && right <= rightEnd){
			if(temp[left] < temp[right]){
				array[index] = temp[left];
				left++;
			}
			else{
				array[index] = temp[right];
				right++;
			}
			index++;
		}
		if(left <= mid){
			while(left <= mid){
				array[index] = temp[left];
				left++;
				index++;
			}
		}
		else{
			while(right <= rightEnd){
				array[index] = temp[right];
				right++;
				index++;
			}
		}
	}
	public static void main(String[] args) {
		int[] test = {5,3,6,1,0,2};
		array = test;
		mergeSort();
		for(int i=0 ; i<array.length ; i++){
			System.out.print(array[i]+" ");
		}
	}

}
