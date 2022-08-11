import book.Book;
import book.FictionBook;
import book.ProgrammingBook;


public class Main {
    public static void main(String[] args) {

        Book b1 = new ProgrammingBook("B1", "Java Overview", 100, "TG1", "Java", "None");
        ProgrammingBook b2 = new ProgrammingBook("B2", "Java Spring", 150, "TG2", "Java", "Spring");
        Book b3 = new FictionBook("B3", "Yeu em rat nhieu", 50, "TG3", "Sen");
        Book b4 = new FictionBook("B4", "Suot doi ben em", 154, "TG4", "Sen");
        Book b5 = new ProgrammingBook("b5", "Khong cam xuc", 500, "TG5", "Java", "None");
        Book b6 = new ProgrammingBook("b6", "Alo Alo", 400, "TG6", "Java", "None");
        Book b7 = new FictionBook("B7", "This is Book", 999, "TG7", "Sen");
        Book b8 = new FictionBook("B8", "This isn't Book", 111, "TG8", "Sen");
        Book b9 = new ProgrammingBook("b9", "Wanna join?", 499, "TG9", "Java", "None");
        Book b10 = new ProgrammingBook("b10", "Nhat ky trong tu", 299, "TG10", "Java", "None");

        Book listBook[] = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10};

        int count = 0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof ProgrammingBook) {
                ProgrammingBook p = (ProgrammingBook) listBook[i];
                String language = p.getLanguage();
                if (language == "Java") {
                    count++;
                }
            }
        }
        System.out.println(count);

//        tinh tien
        int sum = 0;
        for(Book b: listBook) {
            sum +=b.getPrice();
        }
        System.out.println(sum);

//        dem sach fiction
            int cu = 0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof FictionBook) {
                FictionBook f = (FictionBook) listBook [i];
                String category = f.getCategory();
                if (category == "Sen") {
                    cu++;
                }
            }
        }
        System.out.println(cu);


//        dem sach fiction co gia < 400
        int cun = 0;
        for (int i = 0; i < listBook.length; i++) {
            if (listBook[i] instanceof FictionBook) {
                cun++;
            }
        }
        System.out.println(cun);
    }

}