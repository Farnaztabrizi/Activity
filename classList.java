
import java.util.HashMap; 
import java.util.Map;




Map<String,String> classList = new HashMap<String,String>();
public ClassGrades() {
	classList.put("Bob", "A");
	classList.put("Mary", "C");
	classList.put("Sarah", "B");
	classList.put("Philip", "A");
	classList.put("Greg", "F");

}
public void printClassList() {
	
	Iterator<Entry<String, String>> entries = classList.entrySet().iterator();
	while (entries.hasNext()) {
		Entry<String, String> entry = entries.next();
		system.out.println("Key = " + entry.getKey() + ", Value" + entry.getValue());
		
	}

}

public void printClassList2() {
	//iterating over keys only
	for (Map.Entry<String, String> entry : classList.entrySet()) {
		System.out.println("Key = " + key);
	}
	//iterating over values only
	for (String value : classList.values()) {
		System.out.println("Value ="+ value);
		}
}

public static void main(String[] args) {
	ClassGrades myClassList = new ClassGrades();
	myClassList.printClassList();
 }
