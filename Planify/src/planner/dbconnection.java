package planner;

import java.sql.*;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;

public class dbconnection {
    static Connection c;
    
    public static Connection getCon() throws Exception{
        if(c == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/planner", "root", "");
        }
        return c;
    }
    
    public static void InsertData(String sql) throws Exception {
        getCon().createStatement().executeUpdate(sql);
    }
    
    public static String Printdata(String username) throws Exception{
        ResultSet rs = getCon().createStatement().executeQuery("SELECT * FROM notes WHERE username = '" + username + "'");
        String note = null;
        while(rs.next()){
            note = rs.getString("note");
        }
        return note;
    }
    
    public static String getNoteHistory(String username, String namaWeek) throws Exception{
        ResultSet rs = getCon().createStatement().executeQuery("SELECT * FROM history WHERE username = '" + username + "' AND namaWeek = '" + namaWeek + "'");
        String note = null;
        while(rs.next()){
            note = rs.getString("notes");
        }
        return note;
    }
    
    public static DefaultListModel getList(String username, String table) throws Exception{
        DefaultListModel model = new DefaultListModel();
        ResultSet rs = getCon().createStatement().executeQuery("SELECT * FROM weeklist WHERE username = '" + username + "' AND day = '" + table + "'");
        while (rs.next()) {
            String data = rs.getString("todo");
            model.addElement(data); 
        }
        return model;
    }
    
    public static DefaultListModel getListDaily(String username, String table, String category) throws Exception{
        DefaultListModel model = new DefaultListModel();
        ResultSet rs = getCon().createStatement().executeQuery("SELECT * FROM weeklist WHERE username = '" + username + "' AND category = '" + category +"' AND day = '"+ table +"'");
        while (rs.next()) {
            String data = rs.getString("todo");
            model.addElement(data); 
        }
        return model;
    }
    
    public static DefaultListModel getDailyHistory(String username, String namaWeek, String day) throws Exception{
        DefaultListModel model = new DefaultListModel();
        ResultSet rs = getCon().createStatement().executeQuery("SELECT * FROM history H JOIN detail_history DH ON H.id = DH.id WHERE H.username = '" + username + "' AND H.namaWeek = '" + namaWeek +"' AND DH.day = '"+ day +"'");
        while (rs.next()) {
            String data = rs.getString("todo");
            model.addElement(data); 
        }
        return model;
    }
    
    public static DefaultTableModel getHistoryModel(String username) throws Exception{
        DefaultTableModel model = new DefaultTableModel();
        ResultSet rs = getCon().createStatement().executeQuery("SELECT * FROM history WHERE username = '" + username + "'");
        while (rs.next()) {
            String data = rs.getString("namaWeek");
            String allData[] = {data};
            model.addRow(allData); 
        }
        return model;
    }
    
    
}