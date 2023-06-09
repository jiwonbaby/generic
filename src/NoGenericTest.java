
public class NoGenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoGeneric noGeneric = new NoGeneric();
		
		String[] name = {"Hong", "kim"};
		
		
		noGeneric.set(name);
		
		
		Object[] v=noGeneric.get();
		String[] ss= (String[])v;
		
		System.out.println(ss[0]);
		System.out.println(ss[1]);
		
		Integer[] integers = {1, 2};
		noGeneric.set(integers);
		
		Object[] v2=noGeneric.get();
		Integer[] ii = (Integer[])v2;
		System.out.println(ii[0]);
		System.out.println(ii[1]);
		
	}

}
