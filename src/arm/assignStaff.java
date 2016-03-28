/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arm;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author rahul
 */
public class assignStaff extends javax.swing.JFrame {

    /**
     * Creates new form assignStaff
     */
    public assignStaff(addNamelist prev) {
	namelist=prev;
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

        backbutton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        departmentlabel = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        departmentchooser = new javax.swing.JComboBox<>();
        namechooser = new javax.swing.JComboBox<>();
        addbutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        tablescroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        applybutton = new javax.swing.JButton();
	tablemodel = new javax.swing.table.DefaultTableModel(new String[]{"Department","Name"},0) {
		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
	};
        department = new ArrayList<String>();
        staffName = new ArrayList<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backbutton.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        backbutton.setText("<");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Select Staff for the Class");

        departmentlabel.setText("Department");

        namelabel.setText("Name");

        departmentchooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentchooserActionPerformed(evt);
            }
        });

        addbutton.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        addbutton.setText("+");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        deletebutton.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        deletebutton.setText("-");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

	table.setModel(tablemodel);
        table.getTableHeader().setReorderingAllowed(false);
        tablescroll.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
        }

        applybutton.setText("Next >");
        applybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applybuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(departmentlabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(namelabel)
                                .addGap(241, 241, 241))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(departmentchooser, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namechooser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tablescroll))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(applybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(backbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentlabel)
                    .addComponent(namelabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentchooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namechooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbutton)
                    .addComponent(deletebutton))
                .addGap(18, 18, 18)
                .addComponent(tablescroll, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(applybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
	setVisible(false);
	dispose();
	namelist.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
	department.remove(department.size()-1);
        staffName.remove(staffName.size()-1);
        tablemodel.removeRow(department.size());
        table.setModel(tablemodel);
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void applybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applybuttonActionPerformed
	setVisible(false);
	addTimeTable.main(this);
    }//GEN-LAST:event_applybuttonActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addbuttonActionPerformed

    private void departmentchooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentchooserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentchooserActionPerformed

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
            java.util.logging.Logger.getLogger(assignStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(assignStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(assignStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(assignStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new assignStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton applybutton;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JComboBox<String> departmentchooser;
    private javax.swing.JLabel departmentlabel;
    private javax.swing.JComboBox<String> namechooser;
    private javax.swing.JLabel namelabel;
    private javax.swing.JTable table;
    private javax.swing.JScrollPane tablescroll;
    private javax.swing.JLabel title;
    public addNamelist namelist;
    public List<String> department;
    public List<String> staffName;
    // End of variables declaration//GEN-END:variables
}