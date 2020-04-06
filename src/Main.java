public class Main {
    public static void main(String[] args) {
        PhoneBook addressBook = new PhoneBook();

        addressBook.add("FirstName", 100000000);
        addressBook.add("SecondName", 225555550);
        addressBook.add("ThirdName", 355226630);

        System.out.println(addressBook.checkIfNameExists("SecondName"));
        System.out.println(addressBook.getNumber("ThirdName"));
        addressBook.printAll();
    }
}

