package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {


    }

    public static class DataAdapter implements RowItem{
                private Customer customer;
                private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String desiredKey = null;
            for(Map.Entry<String,String> pair : countries.entrySet())
                if(pair.getValue().equals(customer.getCountryName())) {
                    desiredKey = pair.getKey();  break;
                }
            return desiredKey;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getDialString() {
            String number = contact.getPhoneNumber();
            String dial = number.replaceAll("[^\\d,^+]", "");
            return "callto://" + dial;
        }

        @Override
        public String getContactLastName() {
            String name = contact.getName();
            int indexComa = name.indexOf(",");
            String lastName = name.substring(0, indexComa);
            return lastName;
        }

        @Override
        public String getContactFirstName() {

            String name = contact.getName();
            int indexComa = name.indexOf(",");
            String firstName = name.substring(indexComa+2);
            return firstName;
        }


    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}