/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons;
public class Address {
    private String country;
    private String city;
    private String street;
    private String buildingNumber;
    private int flatNumber;
    private int postCode;
    
    public Address (String country, String city, String street, String buildingNumber,int flatNumber,int postCode){
        this.country = country;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.flatNumber = flatNumber;
        this.postCode = postCode;
    }
    public String getAddress() {                
        return country + ", " + city + ", " + street + ", " + buildingNumber + ", " + flatNumber;
    }
}