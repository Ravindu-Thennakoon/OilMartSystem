/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DashboardDAO;
import Model.Item;
import Model.ItemDAO;
import Model.Transaction;
import java.util.List;

/**
 *
 * @author ravin
 */
public class DashboardController {
      public static List<Transaction> getAllItems() {
        return new DashboardDAO().getAllItems();
    }
    
}
