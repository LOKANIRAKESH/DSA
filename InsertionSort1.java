import java.util.*;
import java.time.*;
class InsertionSort1
	{
		public static void main(String args[])
			{
				Scanner sc = new Scanner(System.in);	
				int x = sc.nextInt();
				int a[]=new int[x];
				/*
				for(int i=0;i<x;i++)
				{
					a[i]=x-i;
				}
				for(int i=0;i<x;i++)
				{
					a[i]=i;
				} */
				for(int i=0;i<x;i++)
					{
						a[i]=(int)(Math.random()*x);
					}
				
				
				System.out.println(Arrays.toString(a));
				Instant start = Instant.now();
				for(int i=0;i<x-1;i++)
					{
						for(int j=i+1;j<x;j++)
							{
								if(a[i]>a[j])
									{
										int temp = a[i];
										a[i]=a[j];
										a[j]=temp;
									}
							}
					}
				Instant end = Instant.now();
				Duration timeElapsed = Duration.between(start, end);
				System.out.println(Arrays.toString(a));
				System.out.println(timeElapsed.toMillis());


			}
	}