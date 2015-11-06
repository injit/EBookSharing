/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebooklogin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author indrajit
 */
public class WritetoDB {

    String url = "jdbc:mysql://localhost:3306/contactdb";
    String user = "root";
    String password = "secret";

    String bookPath = "/Users/indrajit/NetBeansProjects/EbookLogin_1/books&images/book.txt";
    String bookCover = "/Users/indrajit/NetBeansProjects/EbookLogin_1/books&images/sid.jpg";

    public void Write() {

        try {
//            Class.forName("org.apache.derby.jdbc.ClientDriver");
//            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/UsersRegistration", "java", "java");
            DbConnector dbc = new DbConnector();
            Connection conn = dbc.Connects();

            String sql = "INSERT INTO Books (BID, Book_Name, Uploader, BookCategory, BookCover, Text_Book, Pointstoread) values (?, ?, ?, ?, ?, ?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "3886");
            statement.setString(2, "Siddhartha");
            statement.setString(3, "System");
            statement.setString(4, "Religious");
            InputStream inputBookCover = new FileInputStream(new File(bookCover));
            statement.setBlob(5, inputBookCover);
            InputStream inputStream = new FileInputStream(new File(bookPath));
            statement.setBlob(6, inputStream);
            statement.setString(7, "30");

            int row = statement.executeUpdate();
            if (row > 0) {
                System.out.println("Data Inserted.");
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {

        }

    }
}
