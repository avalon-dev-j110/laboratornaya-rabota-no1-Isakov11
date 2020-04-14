package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.*;
import ru.avalon.java.dev.j10.labs.commons.*;

 public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    public static void main(String[] args) {

        /*1
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        Address ivanovAddress = new Address("Россия", "Москва", "ул. Ленина", "12","56","123456");
        Address smithAddress = new Address("USA", "New-York", "11 line st.", "119","4","98745-6458");
        Passport ivanovPass = new Passport.Builder()
                .withName("Иван")
                .withSurname("Иванов")
                .withPatronymic("Иванович")
                .withBirthDay("01.03.1001")
                .withDocNumber("1234")
                .withDocSeries("54 89 78")
                .withIssueDate("01.01.1001")
                .withIssuer("ОУФМС")
                .withaddress(ivanovAddress)
                .build();        
        Person ivanov = new Person(ivanovPass);
        
        Passport smithPass = new Passport.Builder()
                .withName("John")                
                .withSecondName("Edvard")
                .withSurname("Smith")
                .withBirthDay("05.08.1501")
                .withDocNumber("4567")
                .withDocSeries("66 33 99")
                .withIssueDate("01.01.1501")
                .withIssuer("GOV")
                .withaddress(smithAddress)
                .build(); 
        Person smith = new Person(smithPass);

         /*
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         */        
        String getAddressIvanov = ivanov.getAddress();
         
         /* 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
         String getAddressSmith = smith.getAddress();
         
        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
        System.out.println(getAddressIvanov);
        System.out.println(getAddressSmith);        
    }
}
