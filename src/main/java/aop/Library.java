package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {

    public void getBook() {
        System.out.println("Library: getBook method");
    }

    public void getMagazine() {
        System.out.println("Library: getMagazine method");
    }

    public void returnBook() {
        System.out.println("Library: returnBook method");
    }

    public void returnMagazine() {
        System.out.println("Library: returnMagazine method");
    }

    public void addBook() {
        System.out.println("Library: addBook method");
    }

    public void addMagazine() {
        System.out.println("Library: addMagazine method");
    }
}
