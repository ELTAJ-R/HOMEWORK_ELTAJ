package WebApp.Database;

import java.sql.*;
import java.util.StringJoiner;

public class SQLdb {
    public SQLdb() throws SQLException {
    }

    private final static String URL = "jdbc:postgresql://localhost:5432/iba-lessons";
    private final static String name = "postgres";
    private final static String password = "9149";
    Connection cn = DriverManager.getConnection(URL, name, password);

    //Login Application
    public boolean checkIfExists(String username, String parol) throws SQLException {
        boolean isLogged = false;

        String command = "select id from userdata where username=? and password=?";
        PreparedStatement statement = cn.prepareStatement(command);
        statement.setString(1, username);
        statement.setString(2, parol);
        ResultSet result = statement.executeQuery();
        while (result.next()) {
            isLogged = true;
        }
        ;
        return isLogged;

//            return "You successfully logged in";
//        } else return "Input is not correct";

    }

    public void addHistory(String log, String first, String second, String op, String res) throws SQLException {
        String command = "insert into history (cookie, x, y, operation, result) VALUES (?,?,?,?,?)";
        PreparedStatement statement = cn.prepareStatement(command);
        statement.setString(1, log);
        statement.setString(2, first);
        statement.setString(3, second);
        statement.setString(4, op);
        statement.setString(5, res);
        boolean execute = statement.execute();
    }
    public String getHistory(String username) throws SQLException {
        StringJoiner sj=new StringJoiner("\n");
        String command = "select * from history where cookie=?";
        PreparedStatement statement = cn.prepareStatement(command);
        statement.setString(1, username);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){
            String x = resultSet.getString("x");
            String y = resultSet.getString("y");
            String operation = resultSet.getString("operation");
            String result = resultSet.getString("result");
            String s = String.format(" Calculation x:%s y:%s op:%s result:%s", x, y, operation, result);
           sj.add(s);
        }
        return sj.toString();
    }


    public String Register(String username, String parol, String repeatPassword, String email) throws SQLException {
        String findID = "select MAX(id) from users";
        PreparedStatement st = cn.prepareStatement(findID);
        ResultSet id = st.executeQuery();
        int lastID = 1;
        while (id.next()) {
            lastID = lastID + id.getInt("max");
        }
        if (parol.equals(repeatPassword)) {
            String command = "insert into users (id,username, password, email) VALUES (?,?,?,?)";
            PreparedStatement statement = cn.prepareStatement(command);
            statement.setInt(1, lastID);
            statement.setString(2, username);
            statement.setString(3, parol);
            statement.setString(4, email);
            boolean res = true;
            try {
                statement.execute();
            } catch (Exception e) {
                res = false;
            }
            if (res) {
                return "You registered";
            } else return "Registration failed";

        } else return "Passwords do not match";
    }

    public static void main(String[] args) throws SQLException {
        SQLdb example = new SQLdb();
        System.out.println(example.checkIfExists("eltaj", "eltaj123"));
    }
}
