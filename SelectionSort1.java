import java.util.*;
import java.time.*;
class SelectionSort1
	{
		public static void main(String args[])
			{
				Scanner sc = new Scanner(System.in);	
				int x = sc.nextInt();
				int a[]=new int[x];
				for(int i=0;i<x;i++)
					{
						a[i]=(int)(Math.random()*x);
					}/*
				for(int i=0;i<x;i++)
				{
					a[i]=x-i;
				}
				for(int i=0;i<x;i++)
				{
					a[i]=i;
				}*/


				System.out.println(Arrays.toString(a));
				Instant start = Instant.now();
				for(int i=0;i<x-1;i++)
					{
						int minIndex = i;
						for(int j=minIndex+1;j<x;j++)
							{
								if(a[minIndex]>a[j])
									{
										minIndex = j;
									}
							}
						int temp = a[minIndex];
						a[minIndex]=a[i];
						a[i]=temp;
					}
				Instant end = Instant.now();
				Duration timeElapsed = Duration.between(start, end);
				System.out.println(Arrays.toString(a));
				System.out.println(timeElapsed.toMillis());


			}
	}