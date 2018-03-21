import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * @author Narisa Singngam
 *
 */
public class Recursion {

	/**
	 * Remove duplicate consecutive items from a list, changing the list
	 * parameter. For example, if list = { a, b, b, b, c, b, c, c} then after
	 * calling unique the list will contain {a, b, c, b, c}. Only consecutive
	 * duplicates are removed. Objects are compared using their own equals
	 * method.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates
	 *         removed.
	 */

	public static List unique(List list) {
		
		
		if (list.size() <= 1) return list;
		if (list.get(0).equals(list.get(1))) {
			list.remove(1);
			return unique(list);
		}

		List sub = list.subList(1, list.size());
		unique(sub);
		return list;
	}
	
	public static long fibonacci(int n) {
//		if(n<2) return 1;
		return fib(n,0,1);
	}
	
	/**
	 * The method that help fibonacci method work faster 
	 * @param n the position of the value.
	 * @param first is the first value.
	 * @param next is the next value of fibonacci.
	 */
	public static int fib(int n , int first , int next){
		
		if(n == 0) return first;
		--n;
		return fib(n,next,first+next);

	}

	public static void main(String[] args) {

//		List list = new ArrayList<>();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		list.add("c");
//		list.add("e");
//		// // create a view (sublist) containing element 1, 2, 3 (but not 4)
//		// List sub = list.subList(1, 4);
//		// // sub contains {"b", "c", "d"}
//		// sub.get(0); // returns "b"
//		// sub.get(1); // returns "c"
//		// sub.set(2, "hahaha"); // change element 2 to "hahaha"
//		//
//		// sub.remove(1); // remove element #1 ("c")
//		// // print the original List. You'll see that subList changed it
//		list = unique(list);
//		for (Object o : list)
//			System.out.print(o + ", ");
		
		System.out.println(fibonacci(30));
	}

}

