package org.example;

public class Books {
    private int bookNo;
    private String bookName;
    private String category;
    private double bookPrice;

    public Books(int bookNo, String bookName, String category, double bookPrice) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.category = category;
        this.bookPrice = bookPrice;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookNo=" + bookNo +
                ", bookName='" + bookName + '\'' +
                ", category='" + category + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
