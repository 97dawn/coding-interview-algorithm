
public class BinarySearch {
	public static void binearySearch(int[] array, int findThis){
		System.out.println(isThere(array, findThis, 0, array.length-1));
	}
	public static boolean isThere(int[] array, int findThis, int start, int end){
		if(start < end){
			int middle = (end + start) / 2;
			if(findThis < array[middle]){
				return isThere(array, findThis, start, middle-1);
			}
			else if(findThis > array[middle]){
				return isThere(array, findThis, middle+1, end);
			}
			else if(findThis == array[middle]){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] test = {0, 1, 2, 3, 4};
		binearySearch(test, 3);
		binearySearch(test, 5);
	}

}
