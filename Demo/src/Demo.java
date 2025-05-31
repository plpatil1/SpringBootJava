import java.util.HashMap;
import java.util.Map;

public class Demo {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Rahul");
		System.out.println(map.put(1, "Prriyanka"));
		System.out.println(map);
		
	}

}
