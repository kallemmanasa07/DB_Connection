package com.corejava;

import java.sql.Connection;

public class TestConnection {

    public static void main(String[] args) {

        Connection con = null;

        try {

            con = DBConnection.getConnection();

            if (con != null) {
                System.out.println("DATABASE CONNECTION SUCCESSFUL!");
            } else {
                System.out.println("DATABASE CONNECTION FAILED!");
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}