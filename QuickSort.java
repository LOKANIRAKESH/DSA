import java.util.*;
import java.time.*;
class QuickSort
	{
		public static void main(String args[])
			{
				Scanner sc = new Scanner(System.in);
				int x = sc.nextInt();
				int arr[]=new int[x];
				for(int i=0;i<x;i++)
				{
					arr[i]=x-i;
				}
				System.out.println(Arrays.toString(arr));
				Instant start = Instant.now();
				sort(arr,0,x-1);
				Instant end = Instant.now();
				System.out.println(start+ " "+end);
				System.out.println(Arrays.toString(arr));
				Duration timeElapsed = Duration.between(start, end);
				System.out.println(timeElapsed.toMillis());
			}
		public static void sort(int arr[],int start,int end)
			{
				if(start < end)
					{
						int pivot = pivot(arr,start,end);
						sort(arr,start,pivot-1);
						sort(arr,pivot+1,end);
					}
			}
		public static void swap(int arr[],int firstIndex,int lastIndex)
			{
				int temp = arr[firstIndex];
				arr[firstIndex]=arr[lastIndex];
				arr[lastIndex]=temp;
			}
		public static int pivot(int arr[],int start,int end)
			{
				int swapIndex = start;
				int pivot =start;
				for(int i=start+1;i<=end;i++)
					{
						if(arr[i] < arr[pivot])
							{
								swapIndex++;
								swap(arr,i,swapIndex);
							}
					}
				swap(arr,pivot,swapIndex);
				return swapIndex;
			}
	}