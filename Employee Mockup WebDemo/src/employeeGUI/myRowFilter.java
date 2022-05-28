/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeGUI;

import javax.swing.RowFilter;

/**
 *
 * @author Wendell
 */
public class myRowFilter extends RowFilter{
    private String searchText;
    
    myRowFilter(String searchText){
        this.searchText=searchText;
    }
    
    @Override
    public boolean include(Entry entry) {
        return entry.getStringValue(1).startsWith(searchText)||entry.getStringValue(1).contains(searchText);
    }
    
}
