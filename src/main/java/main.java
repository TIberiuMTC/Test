public class main {
    public static void main(String args[]) {
        Carte book=new Carte("sadasd","wqrwqrwq",1997,2003);
        Carte book1=new Carte("213fd","dsfsdf",2001,280);
        Carte book2=new Carte("sa2432d","wdvswq",2012,800);
        System.out.println(book.toString());
        Biblioteca library=new Biblioteca(book);
        library.add(book1);
        library.add(book2);
        System.out.println(library.toString());
    }
}
