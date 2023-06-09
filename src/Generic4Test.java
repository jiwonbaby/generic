import java.util.*;
public class Generic4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Map<String,Object>> list = new ArrayList<>();
		Map<String, Object>hm = new HashMap<String, Object>();
		hm.put("name", "김제니");
		hm.put("id", "jennie");
		hm.put("age", 28);
		
		list.add(hm);
		
		hm = new HashMap<String, Object>();
		hm.put("name", "똥남이");
		hm.put("id", "ddongnam");
		hm.put("age", 25);
		
		list.add(hm);
		
		hm = new HashMap<String, Object>();
		hm.put("name", "고똥이");
		hm.put("id", "goddongde");
		hm.put("age", 24);
		
		list.add(hm);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).get("name") + "," + list.get(i).get("id") + "," + list.get(i).get("age"));
		}
		
		
	}

}
