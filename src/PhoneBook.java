import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Integer> phoneBook = new HashMap<>();

    public void add(String name, int number) {
        phoneBook.put(name, number);
    }

    public boolean checkIfNameExists(String name) {
        return phoneBook.containsKey(name);
    }

    public Integer getNumber(String name) {
        return phoneBook.get(name);
    }

    public Integer getSize() {
        return phoneBook.size();
    }

    public void printAll() {
        for (Map.Entry<String, Integer> mapEntry : phoneBook.entrySet()) {
            System.out.println(mapEntry.getKey()
                    + "'s number is " + mapEntry.getValue());
        }
    }

}

