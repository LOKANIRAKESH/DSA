/*
	1)Take size of array as input
	2)Create array with given size
	3)Store  ./
*/
import java.util.Scanner;
class FindMaxElement
	{
		public static void main(String args[])
			{
				Scanner sc = new Scanner(System.in);
				int size = sc.nextInt();
				int a[] = new int[size];
				for(int i=0;i<size;i++)
					{
						a[i]=sc.nextInt();
					}
				int max=a[0];
				for(int i=0;i<size;i++)
					{
						if(max < a[i])
							{
								max = a[i];
							}
					}
				System.out.println(max);
			}
	}