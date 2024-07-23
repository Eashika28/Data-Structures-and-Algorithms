package algorithms;

/*Bubble Sort Algorithm is a comparison based algorithm. Comparing each pair of adjacent items
 *and swapping them if they are in wrong order. The list is repeated until no swaps are needed
 *which means list gets sorted.
*/
public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {36, 19, 29, 12, 5};
		int temp;
		for(int i=0;i<a.length;i++) // loop for no. of rounds
		{
			int flag=0;
			for(int j=0;j<a.length-1-i;j++) // loop for comparing elements
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) // this will execute when the list is sorted but the no of rounds are left
				break;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
