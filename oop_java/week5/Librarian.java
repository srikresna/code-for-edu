package oop_java.week5;


public class Librarian extends LibraryMember {
    private String id_librarian;

    public Librarian(String name, String member_number, String id_librarian){
        super(name, member_number);
        this.name = name;
        this.id_librarian = id_librarian;
    }


    public String getId(){
        return id_librarian;
    }

    public String setId(String id){
        return this.id_librarian = id;
    }

    public void processBorrow(LibraryMember member, Book book){
        System.out.println("Book " + book.getTitle() + " has been borrowed by " + member.getName());
    }

    public void processReturn(LibraryMember member, Book book){
        System.out.println("Book " + book.getTitle() + " has been returned by " + member.getName());
    }
}