import java.util.*;

public class HW5 {
    public static HashMap<String, ArrayList<String>> createAndPrintPhonebook(String[] arr) {
		HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
		ArrayList<String> phones = new ArrayList<>();
		for (String str : arr) {
			var temp = str.split(" ");
			if (!phoneBook.containsKey(temp[0])) {
				phones = new ArrayList<>();
				phones.add(temp[1]);
				phoneBook.put(temp[0], phones);

			} else if (phoneBook.containsKey(temp[0])) {
				ArrayList<String> list = phoneBook.get(temp[0]);
				list.add(temp[1]);
			}
		}
		return phoneBook;
	}
    public static HashMap<String, Integer> countPersons(String[] arr) {

		HashMap<String, String> persons = new HashMap<>();
		HashMap<String, Integer> countedName = new HashMap<>();
		for (String str : arr) {
			var tmp = str.split(" ");
			persons.put(tmp[1], tmp[0]);
			countedName.put(tmp[0], Collections.frequency(persons.values(), tmp[0]));
		}
		return countedName;
	}
	public 	static TreeMap<Integer, ArrayList<String>> sortedTreeByValue(HashMap<String, Integer> countedName){

		TreeMap<Integer, ArrayList<String>> result = new TreeMap<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer key1, Integer key2) {
				return Integer.compare(key2, key1);
			}
		});

		for (int i = 0; i < countedName.size(); i++) {
			if(!result.containsKey(countedName.values().toArray()[i])){
				ArrayList<String> names = new ArrayList<>();
				names.add((String) countedName.keySet().toArray()[i]);
				result.put((Integer) countedName.values().toArray()[i], names);
			}else{
				ArrayList<String> list = result.get(countedName.values().toArray()[i]);
				list.add((String) countedName.keySet().toArray()[i]);
			}
		}
		return result;
	}
}
