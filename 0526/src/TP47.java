import java.util.HashMap;

public class TP47 {

	public static void main(String[] args) {
		HashMap myMap = new HashMap();
		
		myMap.put(7, "����");
		myMap.put(36, "�̽¿�");
		myMap.put(21, "����ȯ");
		myMap.put(21, "������");
		
		myMap.remove(7);
		System.out.println(myMap);
		
		myMap.remove(36, "����ö");
		System.out.println(myMap);

	}

}
