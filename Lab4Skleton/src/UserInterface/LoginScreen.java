// Xiyue Suo, NUID: 001348347
// INFO5100, Lab_4

package UserInterface;

import Business.Abstract.User;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/** 
 * This class allows user to log in, either customer or supplier.
 * @author AEDSpring2019
 */
public class LoginScreen extends javax.swing.JPanel {

    /**
     * Creates new form LoginScreen
     */
    List<User> list;
    JPanel panelRight;
    String role;
    public LoginScreen(String role, JPanel panelRight, List<User> list) {
        initComponents();
        this.role = role;
        this.list = list;
        this.panelRight = panelRight;
        initialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPword = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        comboUser = new javax.swing.JComboBox<>();
        txtTitle = new javax.swing.JLabel();

        btnSubmit.setText("Login");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        comboUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtTitle.setText("Supplier Login Screen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtTitle)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(btnSubmit))
                        .addComponent(comboUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(txtTitle)
                .addGap(30, 30, 30)
                .addComponent(comboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Takes to success screen if password verified.
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        String enterPass = txtPword.getText();
        User user = (User)comboUser.getSelectedItem();
        try {
            if (user.getRole().equalsIgnoreCase("Customer")) {
                if (user.verify(enterPass)) {
                    SuccessScreen panel = new SuccessScreen(user);
                    CardLayout layout = (CardLayout) panelRight.getLayout();
                    panelRight.add(panel);
                    layout.next(panelRight);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid password.");
                }
            }
            if (user.getRole().equalsIgnoreCase("Supplier")) {
                if (user.verify(enterPass)) {
                    SuccessScreen panel = new SuccessScreen(user);
                    CardLayout layout = (CardLayout) panelRight.getLayout();
                    panelRight.add(panel);
                    layout.next(panelRight);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid password.");
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Invalid selection.");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    
    private void initialize(){
        //text should either be "Supplier Login Screen" OR "Customer Login Screen"
        //Based on the selection
        txtTitle.setText("****** Login Screen");
        comboUser.removeAllItems();
        
        if (role.equalsIgnoreCase("Customer")) {
            txtTitle.setText("Customer Login Screen");
        }
        if (role.equalsIgnoreCase("Supplier")) {
            txtTitle.setText("Supplier Login Screen");
        }
        
        //only customer or suppliers should be listed based on the selection
        for (User user: list) {
            comboUser.addItem(user);
        }           
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<Object> comboUser;
    private javax.swing.JTextField txtPword;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
