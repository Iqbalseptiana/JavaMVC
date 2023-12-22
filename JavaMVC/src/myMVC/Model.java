/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myMVC;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iqbal
 */
@SuppressWarnings("serial")
public class Model extends DefaultTableModel{
    
    public Model(){
    super(Constants.DATA, Constants.TABLE_HEADER);
    }
    
}
