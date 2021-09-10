/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.invetory.view;

import ec.edu.espe.invetory.controller.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class InventorySystem extends javax.swing.JFrame {

    /**
     * Creates new form InventorySystem
     */
    ProductController product = new ProductController();
    ProviderController provider = new ProviderController();
    InvoiceController invoice = new InvoiceController();
    CustomerController customer = new CustomerController();

    public InventorySystem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnProduct = new javax.swing.JMenu();
        sbtnAdd = new javax.swing.JMenuItem();
        sbtnDelete = new javax.swing.JMenuItem();
        sbntEdit = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnProvider = new javax.swing.JMenu();
        smnAddProvider = new javax.swing.JMenuItem();
        smnEditProvider = new javax.swing.JMenuItem();
        smnDeleteProvider = new javax.swing.JMenuItem();
        mnCustomer = new javax.swing.JMenu();
        smnDeleteCustomer = new javax.swing.JMenuItem();
        smnEditCustomer = new javax.swing.JMenuItem();
        mnInvoice = new javax.swing.JMenu();
        smnAddInvoice = new javax.swing.JMenuItem();
        smnDeleteInvoice = new javax.swing.JMenu();
        smnDeleteCedula = new javax.swing.JMenuItem();
        smnDeleteId = new javax.swing.JMenuItem();
        smnCheckInvoice = new javax.swing.JMenu();
        smnSearchInvoiceId = new javax.swing.JMenuItem();
        smnSearchInvoiceCedula = new javax.swing.JMenuItem();
        mnShow = new javax.swing.JMenu();
        smbShowProduct = new javax.swing.JMenuItem();
        smnShowCustomer = new javax.swing.JMenuItem();
        smnShowProvider = new javax.swing.JMenuItem();
        smnDisplayInvoice = new javax.swing.JMenuItem();
        mnExit = new javax.swing.JMenu();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Inventory System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        mnProduct.setText("Product");

        sbtnAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        sbtnAdd.setText("Add");
        sbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbtnAddActionPerformed(evt);
            }
        });
        mnProduct.add(sbtnAdd);

        sbtnDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        sbtnDelete.setText("Delete");
        sbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbtnDeleteActionPerformed(evt);
            }
        });
        mnProduct.add(sbtnDelete);

        sbntEdit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        sbntEdit.setText("Edit");
        sbntEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbntEditActionPerformed(evt);
            }
        });
        mnProduct.add(sbntEdit);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Search");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnProduct.add(jMenuItem4);

        jMenuBar1.add(mnProduct);

        mnProvider.setText("Provider");

        smnAddProvider.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        smnAddProvider.setText("Add");
        smnAddProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnAddProviderActionPerformed(evt);
            }
        });
        mnProvider.add(smnAddProvider);

        smnEditProvider.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        smnEditProvider.setText("Edit");
        smnEditProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnEditProviderActionPerformed(evt);
            }
        });
        mnProvider.add(smnEditProvider);

        smnDeleteProvider.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        smnDeleteProvider.setText("Delete");
        smnDeleteProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnDeleteProviderActionPerformed(evt);
            }
        });
        mnProvider.add(smnDeleteProvider);

        jMenuBar1.add(mnProvider);

        mnCustomer.setText("Customer");

        smnDeleteCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        smnDeleteCustomer.setText("Delete");
        smnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnDeleteCustomerActionPerformed(evt);
            }
        });
        mnCustomer.add(smnDeleteCustomer);

        smnEditCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        smnEditCustomer.setText("Edit");
        smnEditCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnEditCustomerActionPerformed(evt);
            }
        });
        mnCustomer.add(smnEditCustomer);

        jMenuBar1.add(mnCustomer);

        mnInvoice.setText("Invoice");

        smnAddInvoice.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        smnAddInvoice.setText("New");
        smnAddInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnAddInvoiceActionPerformed(evt);
            }
        });
        mnInvoice.add(smnAddInvoice);

        smnDeleteInvoice.setText("Delete");

        smnDeleteCedula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        smnDeleteCedula.setText("Cedula");
        smnDeleteCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnDeleteCedulaActionPerformed(evt);
            }
        });
        smnDeleteInvoice.add(smnDeleteCedula);

        smnDeleteId.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        smnDeleteId.setText("ID");
        smnDeleteId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnDeleteIdActionPerformed(evt);
            }
        });
        smnDeleteInvoice.add(smnDeleteId);

        mnInvoice.add(smnDeleteInvoice);

        smnCheckInvoice.setText("Check");

        smnSearchInvoiceId.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        smnSearchInvoiceId.setText("Id");
        smnSearchInvoiceId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnSearchInvoiceIdActionPerformed(evt);
            }
        });
        smnCheckInvoice.add(smnSearchInvoiceId);

        smnSearchInvoiceCedula.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        smnSearchInvoiceCedula.setText("Cedula");
        smnSearchInvoiceCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnSearchInvoiceCedulaActionPerformed(evt);
            }
        });
        smnCheckInvoice.add(smnSearchInvoiceCedula);

        mnInvoice.add(smnCheckInvoice);

        jMenuBar1.add(mnInvoice);

        mnShow.setText("Display");
        mnShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnShowMouseClicked(evt);
            }
        });

        smbShowProduct.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        smbShowProduct.setText("Products");
        smbShowProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smbShowProductActionPerformed(evt);
            }
        });
        mnShow.add(smbShowProduct);

        smnShowCustomer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        smnShowCustomer.setText("Customers");
        smnShowCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnShowCustomerActionPerformed(evt);
            }
        });
        mnShow.add(smnShowCustomer);

        smnShowProvider.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
        smnShowProvider.setText("Providers");
        smnShowProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnShowProviderActionPerformed(evt);
            }
        });
        mnShow.add(smnShowProvider);

        smnDisplayInvoice.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_MASK));
        smnDisplayInvoice.setText("Invoice");
        smnDisplayInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smnDisplayInvoiceActionPerformed(evt);
            }
        });
        mnShow.add(smnDisplayInvoice);

        jMenuBar1.add(mnShow);

        mnExit.setText("Exit");
        mnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbtnAddActionPerformed
        this.hide();
        ProductWindow prodW = new ProductWindow();
        prodW.setVisible(true);

    }//GEN-LAST:event_sbtnAddActionPerformed

    private void smnAddProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnAddProviderActionPerformed
        this.hide();
        ProviderWindow provW = new ProviderWindow();
        provW.setVisible(true);


    }//GEN-LAST:event_smnAddProviderActionPerformed

    private void smnDeleteProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnDeleteProviderActionPerformed

        Integer idD = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to Delete"));
        provider.delete(idD);

    }//GEN-LAST:event_smnDeleteProviderActionPerformed

    private void sbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbtnDeleteActionPerformed

        Integer idD = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to Delete"));
        product.delete(idD);

    }//GEN-LAST:event_sbtnDeleteActionPerformed

    private void sbntEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbntEditActionPerformed

        Integer idUpdate = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to update"));
        String nameUpdate = JOptionPane.showInputDialog("Enter name of product to update");
        String brandUpdate = JOptionPane.showInputDialog("Enter brand of product to update");
        Double purchasePriceUpdate = Double.parseDouble(JOptionPane.showInputDialog("Enter Purchase Price of product to update"));
        Double salePriceUpdate = Double.parseDouble(JOptionPane.showInputDialog("Enter Sale Price of product to update"));
        Integer quantityUpdate = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity to update"));
        Integer idProviderUpdate = Integer.parseInt(JOptionPane.showInputDialog("Enter ID PROVIDER to update"));
        product.update(idUpdate, nameUpdate, brandUpdate, purchasePriceUpdate, salePriceUpdate, quantityUpdate, idProviderUpdate);

    }//GEN-LAST:event_sbntEditActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        this.hide();
        SearchProductWindow searchW = new SearchProductWindow();
        searchW.setVisible(true);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void smnEditProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnEditProviderActionPerformed
        Integer idU = Integer.parseInt(JOptionPane.showInputDialog("Enter ID to update"));
        String nameU = JOptionPane.showInputDialog("Enter name of product to update");
        Integer phoneNumberU = Integer.parseInt(JOptionPane.showInputDialog("Enter  phone Number to update "));
        String addressU = JOptionPane.showInputDialog("Enter address to update");
        provider.update(idU, nameU, phoneNumberU, addressU);
    }//GEN-LAST:event_smnEditProviderActionPerformed

    private void smnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnDeleteCustomerActionPerformed
        Integer cedulaD = Integer.parseInt(JOptionPane.showInputDialog("Enter Cedula to Delete"));
        customer.delete(cedulaD);        // TODO add your handling code here:
    }//GEN-LAST:event_smnDeleteCustomerActionPerformed

    private void smnEditCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnEditCustomerActionPerformed
        Integer cedulaU = Integer.parseInt(JOptionPane.showInputDialog("Enter cedula to update"));
        String namesU = JOptionPane.showInputDialog("Enter names of Customer to update");
        String lastNameU = JOptionPane.showInputDialog("Enter last name of Customer to update");
        String addressU = JOptionPane.showInputDialog("Enter address of customer to update");
        int phoneU = Integer.parseInt(JOptionPane.showInputDialog("Enter phone of customer to update"));
        customer.update(cedulaU, namesU, lastNameU, addressU, phoneU);
    }//GEN-LAST:event_smnEditCustomerActionPerformed

    private void smnAddInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnAddInvoiceActionPerformed
        this.hide();
        InvoiceWindow invoiceWindow = new InvoiceWindow();
        invoiceWindow.setVisible(true);


    }//GEN-LAST:event_smnAddInvoiceActionPerformed

    private void smnDeleteCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnDeleteCedulaActionPerformed
        Integer cedulaD = Integer.parseInt(JOptionPane.showInputDialog("Enter Invoice Cedula to Delete"));
        invoice.deleteCedula(cedulaD);
    }//GEN-LAST:event_smnDeleteCedulaActionPerformed

    private void smnDeleteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnDeleteIdActionPerformed

        Integer idD = Integer.parseInt(JOptionPane.showInputDialog("Enter Invoice Id to Delete"));
        invoice.deleteId(idD);

    }//GEN-LAST:event_smnDeleteIdActionPerformed

    private void smnSearchInvoiceCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnSearchInvoiceCedulaActionPerformed

        this.hide();
        SearchInvoiceCedulaWindow searchInvoiceCedula = new SearchInvoiceCedulaWindow();
        searchInvoiceCedula.setVisible(true);

    }//GEN-LAST:event_smnSearchInvoiceCedulaActionPerformed

    private void smnSearchInvoiceIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnSearchInvoiceIdActionPerformed
        this.hide();
        SearchInvoiceIdWindow searchInvoiceId = new SearchInvoiceIdWindow();
        searchInvoiceId.setVisible(true);


    }//GEN-LAST:event_smnSearchInvoiceIdActionPerformed

    private void mnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnExitMouseClicked
        System.exit(0);             // TODO add your handling code here:
    }//GEN-LAST:event_mnExitMouseClicked

    private void mnShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnShowMouseClicked

    }//GEN-LAST:event_mnShowMouseClicked

    private void smbShowProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smbShowProductActionPerformed

        this.hide();
        DisplayProduct displayProduct = new DisplayProduct();
        displayProduct.setVisible(true);
    }//GEN-LAST:event_smbShowProductActionPerformed

    private void smnShowCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnShowCustomerActionPerformed
        this.hide();
        DisplayCustomer displayCustomer = new DisplayCustomer();
        displayCustomer.setVisible(true);
    }//GEN-LAST:event_smnShowCustomerActionPerformed

    private void smnShowProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnShowProviderActionPerformed
        this.hide();
        DisplayProvider displayProvider = new DisplayProvider();
        displayProvider.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_smnShowProviderActionPerformed

    private void smnDisplayInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smnDisplayInvoiceActionPerformed
        this.hide();
        DisplayInvoice displayInvoice = new DisplayInvoice();
        displayInvoice.setVisible(true);
    }//GEN-LAST:event_smnDisplayInvoiceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InventorySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventorySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventorySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventorySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventorySystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnCustomer;
    private javax.swing.JMenu mnExit;
    private javax.swing.JMenu mnInvoice;
    private javax.swing.JMenu mnProduct;
    private javax.swing.JMenu mnProvider;
    private javax.swing.JMenu mnShow;
    private javax.swing.JMenuItem sbntEdit;
    private javax.swing.JMenuItem sbtnAdd;
    private javax.swing.JMenuItem sbtnDelete;
    private javax.swing.JMenuItem smbShowProduct;
    private javax.swing.JMenuItem smnAddInvoice;
    private javax.swing.JMenuItem smnAddProvider;
    private javax.swing.JMenu smnCheckInvoice;
    private javax.swing.JMenuItem smnDeleteCedula;
    private javax.swing.JMenuItem smnDeleteCustomer;
    private javax.swing.JMenuItem smnDeleteId;
    private javax.swing.JMenu smnDeleteInvoice;
    private javax.swing.JMenuItem smnDeleteProvider;
    private javax.swing.JMenuItem smnDisplayInvoice;
    private javax.swing.JMenuItem smnEditCustomer;
    private javax.swing.JMenuItem smnEditProvider;
    private javax.swing.JMenuItem smnSearchInvoiceCedula;
    private javax.swing.JMenuItem smnSearchInvoiceId;
    private javax.swing.JMenuItem smnShowCustomer;
    private javax.swing.JMenuItem smnShowProvider;
    // End of variables declaration//GEN-END:variables
}
