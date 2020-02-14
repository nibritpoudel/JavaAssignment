/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcqexamination;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



/**
 *
 * @author Nibriti Poudel
 */

//To diplay the student's past results in a table set.
public class PastResult {
     public static TableModel TableModelResultSet(ResultSet rs) {
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int Columnsnumber = metaData.getColumnCount();
            Vector NameofColumn = new Vector();

            // Get the column names
            for (int column = 0; column < Columnsnumber; column++) {
                NameofColumn.addElement(metaData.getColumnLabel(column + 1));
            }

            // Get all rows.
            Vector rows = new Vector();

            while (rs.next()) {
                Vector newRow = new Vector();

                for (int i = 1; i <= Columnsnumber; i++) {
                    newRow.addElement(rs.getObject(i));
                }

                rows.addElement(newRow);
            }

            return new DefaultTableModel(rows, NameofColumn);
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}

