package ru.mirea.jprw1.ex2;

public class Book {
    private String Label;
    private int CountOfBooks;

    public Book(String label, int countOfBooks) {
        Label = label;
        CountOfBooks = countOfBooks;
    }

    public Book(int countOfBooks) {
        CountOfBooks = countOfBooks;
    }

    public Book(String label) {
        Label = label;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public int getCountOfBooks() {
        return CountOfBooks;
    }

    public void setCountOfBooks(int countOfBooks) {
        CountOfBooks = countOfBooks;
    }

    public void intoPriseOfAllCollection(){
        System.out.println(Label + " will count: " + CountOfBooks*968 + "$");
    }

    @Override
    public String toString() {
        return "Book{" +
                "Label='" + Label + '\'' +
                ", CountOfBooks=" + CountOfBooks +
                '}';
    }
}
