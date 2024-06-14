package com.example.bdprojectyes;

import java.sql.*;

public class JavaPostgreSQL {
    // Constants for database connection
    private static final String URL = "jdbc:postgresql://localhost:5432/proyekBD";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Tanaka5768";

    // Method to get a database connection
    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    public static void insertIntoKelasTable(String class_name, boolean class_status) {
        String query = "INSERT INTO classes(class_name, class_status) VALUES (?, ?)";

        try (Connection conn = getConnection();

             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, class_name);
            pstmt.setBoolean(2, class_status);
            pstmt.executeUpdate();
            System.out.println("Insertion successful!");
        } catch (SQLException e) {
            System.out.println("SQL exception occurred");
            e.printStackTrace();
        }
    }
    public static void insertIntoAnakTable(String child_name, boolean gender, Date birth_date, String guardian_name, int guardian_telephone_number, String address){
        String query = "INSERT INTO childs(child_name, gender, birth_date, guardian_name, guardian_telephone_number, address) VALUES(?, ?, ?, ?, ?, ?)";
        try
                (
                Connection con = getConnection();
            PreparedStatement pstmt = con.prepareStatement(query)
        ) {
                pstmt.setString(1,child_name);
                pstmt.setBoolean(2,gender);
                pstmt.setDate(3,birth_date);
                pstmt.setString(4,guardian_name);
                pstmt.setInt(5,guardian_telephone_number);
                pstmt.setString(6,address);
            }catch (SQLException e){
            System.out.println("SQL exception occured");
            e.printStackTrace();
        }
    }
    public static void insertIntoKelasPararelTable(String parallel_name) {
        String query = "INSERT INTO parallels(parallel_name) VALUES (?)";

        try (Connection conn = getConnection();

             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, parallel_name);
            pstmt.executeUpdate();
            System.out.println("Insertion successful!");
        } catch (SQLException e) {
            System.out.println("SQL exception occurred");
            e.printStackTrace();
        }
    }
    public static void insertIntoTahunTable(String year_period, boolean semester) {
        String query = "INSERT INTO years(year_period, semester) VALUES (?, ?)";

        try (Connection conn = getConnection();

             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, year_period);
            pstmt.setBoolean(2, semester);
            pstmt.executeUpdate();
            System.out.println("Insertion successful!");
        } catch (SQLException e) {
            System.out.println("SQL exception occurred");
            e.printStackTrace();
        }
    }public static void insertIntoGuruTable(String teacher_name, boolean gender, int teacher_telephone_number,Date started_at){
        String query = "INSERT INTO teachers(teacher_name, gender, teacher_telephone_number, started_at) VALUES(?, ?, ?, ?)";
        try
                (
                        Connection con = getConnection();
                        PreparedStatement pstmt = con.prepareStatement(query)
                ) {
            pstmt.setString(1,teacher_name);
            pstmt.setBoolean(2,gender);
            pstmt.setInt(3,teacher_telephone_number);
            pstmt.setDate(4,started_at);
        }catch (SQLException e){
            System.out.println("SQL exception occured");
            e.printStackTrace();
        }
    }
    public static void insertIntoKebaktianTable(Date service_date, String service_type, String service_theme){
        String query = "INSERT INTO sunday_services(service_date, service_type, service_theme) VALUES(?, ?, ?)";
        try
                (
                        Connection con = getConnection();
                        PreparedStatement pstmt = con.prepareStatement(query)
                ) {
            pstmt.setDate(1,service_date);
            pstmt.setString(2,service_type);
            pstmt.setString(3,service_theme);
        }catch (SQLException e){
            System.out.println("SQL exception occured");
            e.printStackTrace();
        }
    }

}
