package Arrays;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
			int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };
			int temp = 0;

			// Display the original (unsorted values)
			System.out.print("before: ");
			for ( int i=0; i<arr.length; i++ )
				System.out.print( arr[i] + " " );
			System.out.println();

			// Swap the values around to put them ascending order.


			for (int i = 0; i < 10; i++ )
			{
				for (int j = 0 ; j < 9 ; j++ )
				{

					//// swap the values in two slots
					if (arr[j] > arr[j + 1])
					{
						temp = arr[j+1];
						arr[j+1] = arr[j];
						arr[j]= temp;
					}

				}
			}


				// Display the values again, now (hopefully) sorted.
				System.out.print("after : ");
				for ( int i=0; i<arr.length; i++ )
					System.out.print( arr[i] + " " );
				System.out.println();
			}
		}
	}