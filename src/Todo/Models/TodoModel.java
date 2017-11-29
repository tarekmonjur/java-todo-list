package Todo.Models;

import Common.DatabaseClass;
import java.sql.*;

/**
 * Created by Tarek Monjur on 11/26/2017.
 */
public class TodoModel extends DatabaseClass{

    private static String dbDriver = "mysql";

    public static int save(Todo TD)
    {
        int result = 0;
        try {
            Connection DB = DatabaseClass.dbConnection(dbDriver);
            String query = "insert into users (first_name,last_name,email,password,address,city,state,zip) values (?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = DB.prepareStatement(query);
            pstmt.setString(1, TD.getFirstName());
            pstmt.setString(2, TD.getLastName());
            pstmt.setString(3, TD.getEmail());
            pstmt.setString(4, TD.getPassword());
            pstmt.setString(5, TD.getAddress());
            pstmt.setString(6, TD.getCity());
            pstmt.setString(7, TD.getState());
            pstmt.setString(8, TD.getZip());
            result = pstmt.executeUpdate();
            DB.close();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("data not save");
        }
        return result;
    }

}
