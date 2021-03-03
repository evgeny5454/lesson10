package ru.geekbrains.lesson10;

public class MainApp2 {
    public static void main(String[] args) {
        System.out.println("Телефонный справочник");
        Phonebook phonebook = new Phonebook();
        System.out.println("");

        System.out.println("Наполняем справочник");
        phonebook.add("Иванов", "223344");
        phonebook.add("Иванов", "22334411");
        phonebook.add("Петров", "22334499");
        phonebook.add("Сидоров", "22334488");
        phonebook.add("Иванов", "22334422");
        System.out.println("");

        System.out.println("Получаем номера");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
    }
}

