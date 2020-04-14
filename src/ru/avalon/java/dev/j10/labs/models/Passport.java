package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;
import java.util.logging.Logger;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
      
/*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
    
    private String name;
    private String secondName;
    private String patronymic;
    private String surname;
    private String birthDay;
    private String docSeries;
    private String docNumber;
    private String issueDate;
    private String issuer;
    private Address address;

    private Passport() {
    }

    public static class Builder {
            private Passport newPassport;
 
            public Builder() {
                newPassport = new Passport();       
            }
            
            public Builder withName(String name){
                newPassport.name = name;                
                return this;
            }
            public Builder withSecondName(String secondName){
                newPassport.secondName = secondName;                
                return this;
            }
            public Builder withPatronymic(String patronymic){
                newPassport.patronymic = patronymic;                
                return this;
            }
            public Builder withSurname(String surname){
                newPassport.surname = surname;                
                return this;
            }
            public Builder withBirthDay(String birthDay){
                newPassport.birthDay = birthDay;                
                return this;
            }
            public Builder withDocSeries(String docSeries){
                newPassport.docSeries = docSeries;                
                return this;
            }
            public Builder withDocNumber(String docNumber){
                newPassport.docNumber = docNumber;                
                return this;
            }
            public Builder withIssueDate(String issueDate){
                newPassport.issueDate = issueDate;                
                return this;
            }
            public Builder withIssuer(String issuer){
                newPassport.issuer = issuer;                
                return this;
            }
            public Builder withaddress(Address address){
                newPassport.address = address;                
                return this;
            }
            public Passport build(){
                return newPassport;
            }
        }   

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getDocSeries() {
        return docSeries;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getAddress() {
        return address.getAddress();
    }        
}
