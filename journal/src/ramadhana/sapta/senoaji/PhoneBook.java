package ramadhana.sapta.senoaji;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, String> contacts = new HashMap<String, String>();

    public void simpanTelp(String phoneNumber, String Name) {
        contacts.put(phoneNumber, Name);
    }

    public void cetak() {
        Map<String, String> referance = new HashMap<String, String>();
        referance.put("+62", "Indonesia");
        referance.put("+44", "UK");
        referance.put("+60", "Malaysia");

        for (Map.Entry<String, String> contact : contacts.entrySet()) {
            String country = referance.get(contact.getKey().substring(0, 3));

            if (country == null) {
                System.out.println("Nomor kontak salah");
                continue;
            }

            System.out.println("no. telp: " + contact.getKey()
                                + ", nama: " + contact.getValue()
                                + ", negara: " + country);
        }
    }
}
