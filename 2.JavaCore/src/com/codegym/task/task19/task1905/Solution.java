package com.codegym.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Reinforce the adapter

*/

public class Solution {
    public static Map<String,String> countries = new HashMap<>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("US", "United States");
        countries.put("FR", "France");
    }

    public static void main(String[] args) {
//        Customer customer1 = new Customer() {
//            @Override
//            public String getCompanyName() {
//                return "CodeGym Ltd.";
//            }
//
//            @Override
//            public String getCountryName() {
//                return "United States";
//            }
//        };
//
//        Contact contact1 = new Contact() {
//            @Override
//            public String getName() {
//                return "Peterson, John";
//            }
//
//            @Override
//            public String getPhoneNumber() {
//                return "+1(111)222-3333";
//            }
//        };
//
//        RowItem rowItem = new DataAdapter(customer1, contact1);
//        System.out.println(rowItem.getDialString());

    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String country = customer.getCountryName();
            String countryCode = "";
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if (entry.getValue().equals(country)) {
                    countryCode = entry.getKey();
                }
            }
            return countryCode;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String fullName = contact.getName();
            String[] strings = fullName.split(" ");
            return strings[1];
        }

        @Override
        public String getContactLastName() {
            String fullName = contact.getName();
            String[] strings = fullName.split(" ");
            String lastName = strings[0].replace(",", "");
            return lastName;
        }

        @Override
        public String getDialString() {
            String phoneNumber = contact.getPhoneNumber();
            String dialString = phoneNumber.replaceAll("[^a-zA-Z0-9 ]", "");
            dialString = "callto://+" + dialString;
            return dialString;
        }
    }

    public static interface RowItem {
        String getCountryCode();        // For example: US
        String getCompany();            // For example: CodeGym Ltd.
        String getContactFirstName();   // For example: John
        String getContactLastName();    // For example: Peterson
        String getDialString();         // For example: callto://+11112223333
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.
        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Peterson, John
        String getPhoneNumber();        // For example: +1(111)222-3333, +3(805)0123-4567, +380(50)123-4567, etc.
    }
}