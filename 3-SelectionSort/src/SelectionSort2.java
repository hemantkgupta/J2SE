
public class SelectionSort2 {
	public static void main(String[] args) {


		int a[] = {2,6,4,5,8,0,7,3,9,1};
		printData(a);
		SelectionSort2 is = new SelectionSort2();
		is.selectionSort(a);
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
	public void selectionSort(int[] a ){
		for (int j = 0; j < a.length-1; j++) {
			int smallest = j;
			for (int i =j+1; i < a.length; i++) {				
				if(a[smallest] > a[i]){
					smallest =i ;
				}
			}
			swap(a,j,smallest);
		}
	}
	public void swap(int[] a, int x, int y){
		int temp = a[x];
		a[x]=a[y];
		a[y]= temp;
		
	}
}
