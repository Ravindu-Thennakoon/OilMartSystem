/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ravin
 */
public class DashboardDAO {
    public List<Transaction> getAllItems() {
        List<Transaction> transactionList = new ArrayList<>();
        String sql = "SELECT * FROM tbl_transaction";

        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Transaction transaction = new Transaction(
                    rs.getTimestamp("date_time"),
                    rs.getString("cashier_id"),
                    rs.getDouble("total_amount"),
                    rs.getDouble("discount")
                   
                   
                   
                );
                
                transactionList.add(transaction);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return transactionList;
    }
    
    
    
}
