import java.util.*;
import java.time.*;
class BubbleSort1
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
						for(int j=0;j<x-1-i;j++)
							{
								if (a[j]>a[j+1])
									{
										int temp=a[j];
										a[j]=a[j+1];
										a[j+1]=temp;
									}
							}
					}
				Instant end = Instant.now();
				Duration timeElapsed = Duration.between(start, end);
				System.out.println(Arrays.toString(a));
				System.out.println(timeElapsed.toMillis());


			}
	}