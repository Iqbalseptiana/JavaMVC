   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iqbal
 */
public class Controller implements ActionListener{
    private JTextField textPencarian = new JTextField(26);
    private DefaultTableModel model;
    
    public Controller(JTextField searchTermTextField, DefaultTableModel model){
    super();
    this.textPencarian = searchTermTextField;
    this.model = model;
    }
    
    public void actionPerformed(ActionEvent e){
    
        String searchTerm = textPencarian.getText();
        if (searchTerm != null && !"".equals(searchTerm)){
            Object[][] newData = new Object[Constants.DATA.length][];
            int idx = 0;
            for (Object[] o: Constants.DATA){
                if ("*".equals(searchTerm.trim())){
                    newData[idx++] = o;
                } else{
                    if(String.valueOf(o[0]).startsWith(searchTerm.toUpperCase().trim())){
                        newData[idx++] = o;
                    }
                }
            }
            model.setDataVector(newData, Constants.TABLE_HEADER);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Istilah yang dicari tidak ditemukan!", "Error",
                    JOptionPane.ERROR_MESSAGE
                    );
        }
    }
}
