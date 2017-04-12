import static java.lang.System.*;

import java.util.List;
import java.util.stream.Stream;
public class SetTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
 add(12,34,55);
	}
	
	public static void add(int ... a){
		out.println("");
		
		MyComparator myComparator = (a1, a2) ->  a1 + a2;
		System.out.println(myComparator.add(100, 200));
		
		List<Integer> list = null;
		Stream<Integer> l = list.stream();
		Stream<Integer> plist = list.parallelStream();
		l.forEach(p->System.out.println(p));
		list.forEach(p->System.out.println(p));
	}
}


 interface MyComparator {

    public int add(int a1, int a2);

}