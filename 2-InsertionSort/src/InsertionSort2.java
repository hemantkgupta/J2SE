
public class InsertionSort2 {
	public static void main(String[] args) {


		int a[] = {2,6,4,5,8,7,3,9,1};
		printData(a);
		InsertionSort2 is = new InsertionSort2();
		is.insertionSort(a);
		printData(a);
	}
	public static void printData(int[] a){
		System.out.println();
		for (int x : a){
			{
				System.out.print(x +" ");	
			}

		}
	}	
	public void insertionSort(int[] a ){
		for (int j = 1; j < a.length; j++) {
			int key = a[j];
			int i= j-1;
			while(i >=0 && a[i] > key){
				a[i+1]=a[i];
				i--;
			}
			a[i+1]= key;

		}
	}
}
