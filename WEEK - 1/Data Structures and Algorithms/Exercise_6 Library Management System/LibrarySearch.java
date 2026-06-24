import java.util.Arrays;

public class LibrarySearch{

    // Linear Search
    public static Book linearSearch(Book[] books, String title){

        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    // Binary Search
    public static Book binarySearch(Book[] books, String title){

        int left = 0;
        int right = books.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            int compare = books[mid].getTitle().compareToIgnoreCase(title);

            if (compare == 0){
                return books[mid];
            }

            if (compare < 0){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args){

        System.out.println("=======================================");
        System.out.println(" Library Management System");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("=======================================");

        Book[] books ={
                new Book(101, "Data Structures", "Shubham"),
                new Book(103, "Java Programming", "Satyam"),
                new Book(106, "Database Systems", "Soham"),
                new Book(111, "Operating Systems", "Sangram"),
                new Book(121, "Computer Networks", "Shivam")
        };

        String searchTitle = "Operating Systems";

        // Linear Search
        long startLinear = System.nanoTime();
        Book linearResult = linearSearch(books, searchTitle);
        long endLinear = System.nanoTime();
        System.out.println("\nLINEAR SEARCH RESULT");
        System.out.println(linearResult != null ? linearResult : "Book Not Found");
        System.out.println("Execution Time : " + (endLinear - startLinear) + " ns");

        // Sorting for Binary Search
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        // Binary Search
        long startBinary = System.nanoTime();
        Book binaryResult = binarySearch(books, searchTitle);
        long endBinary = System.nanoTime();
        System.out.println("\nBINARY SEARCH RESULT");
        System.out.println(binaryResult != null ? binaryResult : "Book Not Found");
        System.out.println("Execution Time : " + (endBinary - startBinary) + " ns");

        System.out.println("\nObservation:");
        System.out.println("For large sorted datasets, Binary Search is generally more efficient than Linear Search.");
    }
}