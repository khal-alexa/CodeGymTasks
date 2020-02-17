package com.codegym.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Reading and writing to a file: CodeGym

*/
public class Solution {
    public static void main(String[] args) {
        // You can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        try {
//            File yourFile = File.createTempFile("your_file_name", null);
            String fileName = "SecondFile";
            OutputStream outputStream = new FileOutputStream(fileName);
            InputStream inputStream = new FileInputStream(fileName);

            CodeGym codeGym = new CodeGym();
            // Initialize users field for the codeGym object here

//            User user1 = new User();
//            user1.setFirstName("John");
//            user1.setLastName("Smith");
//            user1.setBirthDate(new SimpleDateFormat("MM dd yyyy").parse("12 31 1990"));
//            user1.setMale(true);
//            user1.setCountry(User.Country.UNITED_STATES);

//            User user2 = new User();
//            user2.setFirstName("Maya");
//            user2.setLastName("Reeves");
//            user2.setBirthDate(new SimpleDateFormat("MM dd yyyy").parse("12 01 1991"));
//            user2.setMale(false);
//            user2.setCountry(User.Country.UNITED_KINGDOM);
//
//            codeGym.users.add(user1);
//            codeGym.users.add(user2);

            codeGym.save(outputStream);
            outputStream.flush();

            CodeGym loadedObject = new CodeGym();
            loadedObject.load(inputStream);
            // Here check that the codeGym object is equal to the loadedObject object
            System.out.println(codeGym.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class CodeGym {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            ObjectOutputStream oos = new ObjectOutputStream(outputStream);
            oos.writeInt(users.size());
            System.out.println(users.size());
            if (users.size() != 0) {
                for (int i = 0; i < users.size(); i++) {
                    oos.writeObject(users.get(i).getFirstName());
                    oos.writeObject(users.get(i).getLastName());
                    oos.writeObject(users.get(i).getBirthDate());
                    oos.writeBoolean(users.get(i).isMale());
                    oos.writeObject(users.get(i).getCountry().getDisplayName());
                }
            }
            oos.close();
        }

        public void load(InputStream inputStream) throws Exception {
            ObjectInputStream reader = new ObjectInputStream(inputStream);
            int usersQuantity = reader.readInt();
            System.out.println("usersQuantity  = " + usersQuantity);

            if (usersQuantity > 0) {
                for (int i = 0; i < usersQuantity; i++) {
                    User user = new User();
                    user.setFirstName((String) reader.readObject());
                    user.setLastName((String) reader.readObject());
                    user.setBirthDate((Date) reader.readObject());
                    user.setMale(reader.readBoolean());
                    String countryName = (String) reader.readObject();
                    if (countryName.equals("United States")) {
                        user.setCountry(User.Country.UNITED_STATES);
                    } else if (countryName.equals("United Kingdom")) {
                        user.setCountry(User.Country.UNITED_KINGDOM);
                    } else {
                        user.setCountry(User.Country.OTHER);
                    }
                    users.add(user);
                }
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeGym codeGym = (CodeGym) o;

            return users != null ? users.equals(codeGym.users) : codeGym.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
