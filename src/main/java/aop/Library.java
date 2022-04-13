package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void getBook() {
        System.out.println("Library: getBook method");
        System.out.println("------------------------------");
    }

    public void getMagazine() {
        System.out.println("Library: getMagazine method");
        System.out.println("------------------------------");
    }

    public void returnBook() {
        System.out.println("Library: returnBook method");
        System.out.println("------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Library: returnMagazine method");
        System.out.println("------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Library: addBook method");
        System.out.println("------------------------------");
    }

    public void addMagazine() {
        System.out.println("Library: addMagazine method");
        System.out.println("------------------------------");
    }
}
