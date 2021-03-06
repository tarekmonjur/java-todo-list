package Todo.Models;

import Common.DatabaseClass;
import java.sql.*;
import java.util.*;

/**
 * Created by Tarek Monjur on 11/26/2017.
 */
public class TodoModel extends DatabaseClass{

    private static String dbDriver = "mysql";
    private static String Table = "users";

    public static int save(Todo TD)
    {
        int result = 0;
        try {
            Connection DB = DatabaseClass.dbConnection(dbDriver);
            String query = "insert into "+Table+" (first_name,last_name,email,password,address,city,state,zip) values (?,?,?,?,?,?,?,?)";
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


    public static Todo find(int Id)
    {
        Todo TD = new Todo();
        try{
            Connection DB = DatabaseClass.dbConnection(dbDriver);
            String query = "select * from "+Table+" where id=?";
            PreparedStatement pstmt = DB.prepareStatement(query);
            pstmt.setInt(1,Id);
            ResultSet rs = pstmt.executeQuery();

            if(rs.next()){
                TD.setRow(1);
                TD.setId(rs.getInt("id"));
                TD.setFirstName(rs.getString("first_name"));
                TD.setLastName(rs.getString(3));
                TD.setEmail(rs.getString(4));
                TD.setAddress(rs.getString(6));
                TD.setCity(rs.getString(7));
                TD.setState(rs.getString(8));
                TD.setZip(rs.getString(9));
            }
            DB.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return TD;
    }


    public static List<Todo> select()
    {
        List<Todo> list = new ArrayList<>();
        int rows=1;

        try {
            Connection DB = DatabaseClass.dbConnection(dbDriver);
            String query = "select * from " + Table;
            PreparedStatement pstmt = DB.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Todo TD = new Todo();
                TD.setRow(rows);
                TD.setId(rs.getInt(1));
                TD.setFirstName(rs.getString(2));
                TD.setLastName(rs.getString(3));
                TD.setEmail(rs.getString(4));
                TD.setAddress(rs.getString(6));
                TD.setCity(rs.getString(7));
                TD.setState(rs.getString(8));
                TD.setZip(rs.getString(9));
                list.add(TD);
                rows++;
            }
            DB.close();
        }catch(Exception e){
            e.printStackTrace();
        }

        return list;
    }


    public static int update(Todo TD)
    {
        int result = 0;
        try {
            Connection DB = DatabaseClass.dbConnection(dbDriver);
            String query = "update "+Table+" set first_name=?,last_name=?,email=?,password=?,address=?,city=?,state=?,zip=? where id=?";
            PreparedStatement pstmt = DB.prepareStatement(query);
            pstmt.setString(1, TD.getFirstName());
            pstmt.setString(2, TD.getLastName());
            pstmt.setString(3, TD.getEmail());
            pstmt.setString(4, TD.getPassword());
            pstmt.setString(5, TD.getAddress());
            pstmt.setString(6, TD.getCity());
            pstmt.setString(7, TD.getState());
            pstmt.setString(8, TD.getZip());
            pstmt.setInt(9, TD.getId());
            result = pstmt.executeUpdate();
            DB.close();

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("data not update");
        }
        return result;
    }


    public static int delete(int id)
    {
        int result=0;
        try{
            Connection DB = DatabaseClass.dbConnection(dbDriver);
            String query = "delete from "+Table+" where id=?";
            PreparedStatement pstmt = DB.prepareStatement(query);
            pstmt.setInt(1,id);
            result = pstmt.executeUpdate();
            DB.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

}
