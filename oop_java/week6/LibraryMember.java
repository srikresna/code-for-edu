package oop_java.week6;

public class LibraryMember {
    String name, member_number;

    public LibraryMember(String name, String member_number){
        this.name = name;
        this.member_number = member_number;
    }

    public String getName(){
        return name;
    }

    public String getMemberNumber(){
        return member_number;
    }

    public String setName(String name){
        return this.name = name;
    }

    public String setMemberNumber(String member_number){
        return this.member_number = member_number;
    }

    public void findBook(Librarian librarian, Book book){
        System.out.println("Library member want to find book " + book.getTitle());
    }

    public void borrow(Librarian librarian, Book book){
        System.out.println("Library member want to borrow book " + book.getTitle());
    }

    public void returnBook(Librarian librarian, Book book){
        System.out.println("Library member want to return book " + book.getTitle());
    }

}
