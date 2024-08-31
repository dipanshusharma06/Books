package org.example;

import java.sql.*;

public class BookServiceImplementation implements BookService{

    @Override
    public void saveBook(Books books) {
        Connection con= DbConnection.getDbConnection();
        try{
            PreparedStatement statement= con.prepareStatement("insert into books values(?,?,?,?)");
            statement.setInt(1,books.getBookNo());
            statement.setString(2,books.getBookName());
            statement.setString(3,books.getCategory());
            statement.setDouble(4,books.getBookPrice());

            // saving does not return any resultSet
            if(!statement.execute()){
                System.out.println("Book details have been saved");
            }else{
                throw new SQLException("Statement cannot be executed");
            }
            statement.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void getBook(int bookNo) {
        Connection con= DbConnection.getDbConnection();
        try{
            Statement statement= con.createStatement();
            String query= "select * from books where bookNo = "+bookNo;
            if(!statement.execute(query)){
                throw new SQLException("Statement cannot be executed");
            }else{
                System.out.println("Book details: ");
                ResultSet result= statement.getResultSet();
                while(result.next()){
                    System.out.println("Book number : "+result.getInt(0));
                    System.out.println("Book name : "+result.getString(1));
                    System.out.println("Category : "+result.getString(2));
                    System.out.println("price : "+result.getDouble(3));
                }
            }
            statement.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void getAllBooks() {
        Connection con= DbConnection.getDbConnection();
        try{
            Statement statement= con.createStatement();
            String query= "select * from books";
            if(!statement.execute(query)){
                throw new SQLException("Statement cannot be executed");
            }else{
                System.out.println("Book details: ");
                ResultSet result= statement.getResultSet();
                while(result.next()){
                    System.out.println("Book number : "+result.getInt(1));
                    System.out.println("Book name : "+result.getString(2));
                    System.out.println("Category : "+result.getString(3));
                    System.out.println("price : "+result.getDouble(4)+"\n");
                }
            }
            statement.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteBook(int bookNo) {
        Connection con= DbConnection.getDbConnection();
        try{
            Statement statement= con.createStatement();
            String query= "delete from books where bookNo = "+bookNo;
            if(statement.execute(query)){
                throw new SQLException("Statement cannot be executed");
            }else{
                System.out.println("Book details has been deleted");
            }
            statement.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateBook(int bookNo, Books books) {
        Connection con= DbConnection.getDbConnection();
        try{
            PreparedStatement statement= con.prepareStatement
                    ("update books set bookName= ?, category= ?, price= ? where bookNo = ?");
            statement.setString(1,books.getBookName());
            statement.setString(2,books.getCategory());
            statement.setDouble(3,books.getBookPrice());
            statement.setInt(4,bookNo);

            if(statement.execute()){
                throw new SQLException("Statement cannot be executed");
            }else{
                System.out.println("Book details updated");}
            statement.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
