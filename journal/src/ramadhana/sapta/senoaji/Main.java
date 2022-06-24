package ramadhana.sapta.senoaji;

public class Main {

    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();

        myPhoneBook.simpanTelp("+6281310931175", "Rita");
        myPhoneBook.simpanTelp("+6281510451171", "Nina");
        myPhoneBook.simpanTelp("+62857310931175", "Meta");
        myPhoneBook.simpanTelp("+44773429438455", "Diki");
        myPhoneBook.simpanTelp("+6051310931175", "Datuk Sri");
        myPhoneBook.simpanTelp("+6351310931175", "Siti Nurhaliza");

        myPhoneBook.cetak();
    }

}
