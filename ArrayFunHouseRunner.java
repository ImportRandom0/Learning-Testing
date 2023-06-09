import java.util.Arrays;
public class ArrayFunHouseRunner
{
	public static void main( String args[] )
	{
		int[] one = {4,10,0,1,7,6,5,3,2,9};

		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + ArrayFunHouse.getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(one,2,9));
		System.out.println("# of 4s  =  " + ArrayFunHouse.getCount(one,4));
		System.out.println("# of 9s  =  " + ArrayFunHouse.getCount(one,9));

		int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};
		System.out.println("sum of spots 3-16  =  " + ArrayFunHouse.getSum(two,3,16));
		System.out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(two,2,9));
		System.out.println("# of 0s  =  " + ArrayFunHouse.getCount(two,0));
		System.out.println("# of 3s  =  " + ArrayFunHouse.getCount(two,3));
		System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(two,7));
		
		//add test cases
		//Example #1, in the list containing {74, 85, 102, 99, 101, 85, 56}, the last index of 85 is 5.
		//Example #2, in the list containing {74, 85, 102, 99, 101, 85, 56}, the last index of 100 is -1.
		int[] Tester1 = {74, 85, 102, 99, 101, 85, 56};
		System.out.println(ArrayFunHouse.lastIndexOf(	Tester1, 85)	);
		System.out.println(ArrayFunHouse.lastIndexOf(	Tester1, 100)	);
	}
}
