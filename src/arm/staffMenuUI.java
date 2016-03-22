/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arm;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author rahul
 */
public class staffMenuUI extends javax.swing.JFrame {

	/**
	 * Creates new form staffMenuUI
	 */
	public staffMenuUI(String[] list) {
		classlist=list;
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

        editbutton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        viewbutton = new javax.swing.JButton();
        classchooser = new javax.swing.JComboBox();
        classlabel = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        datechooser = new javax.swing.JComboBox();
        datelabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        editbutton.setText("Edit Report");
        editbutton.setFont(new java.awt.Font("Cantarell", 2, 20));
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("ARM - Staff Main Menu");

        viewbutton.setText("View Report");
        viewbutton.setFont(new java.awt.Font("Cantarell", 2, 20));
        viewbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbuttonActionPerformed(evt);
            }
        });

        classchooser.setModel(new javax.swing.DefaultComboBoxModel(classlist));
        classchooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classchooserActionPerformed(evt);
            }
        });

        classlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        classlabel.setText("Choose Class:");
        classlabel.setFont(new java.awt.Font("Cantarell", 0, 16));

        backbutton.setText("<");
        backbutton.setFont(new java.awt.Font("Cantarell", 1, 18));
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        datechooser.setModel(new javax.swing.DefaultComboBoxModel(displayReports(classlist[0])));

        datelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        datelabel.setText("Choose Date:");
        datelabel.setFont(new java.awt.Font("Cantarell", 0, 16));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(viewbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(datelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datechooser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(classlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(classchooser, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classchooser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datechooser, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(datelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	private void classchooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classchooserActionPerformed
		datechooser.setModel(new javax.swing.DefaultComboBoxModel(displayReports(classchooser.getSelectedItem().toString())));
	}//GEN-LAST:event_classchooserActionPerformed
    
    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
    	String classname=classchooser.getSelectedItem().toString();
    	String date=datechooser.getSelectedItem().toString().replace("-","_");
    	setVisible(false);
    	reportEditorUI.main(classname,date,this);
    }//GEN-LAST:event_editbuttonActionPerformed

    private void viewbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbuttonActionPerformed
    	String classname=classchooser.getSelectedItem().toString();
    	String date=datechooser.getSelectedItem().toString().replace("-","_");
    	setVisible(false);
    	reportViewerUI.main(classname,date,this);
    }//GEN-LAST:event_viewbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        setVisible(false);
    	dispose();
    	loginUI.main(null);
    }//GEN-LAST:event_backbuttonActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] list) {
		/* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(staffMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(staffMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(staffMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(staffMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
        //</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new staffMenuUI(list).setVisible(true);
			}
		});
	}
	
	private String[] displayReports(String name)
	{
		String[] date=util.listReports(name);
		List<String> list = Arrays.asList(date);
		Collections.reverse(list);
		date=(String[]) list.toArray();
		
		for(int i=0;i<date.length;i++)
			date[i]=date[i].replace("_","-");
		
		return date;
	}
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JComboBox classchooser;
    private javax.swing.JLabel classlabel;
    private javax.swing.JComboBox datechooser;
    private javax.swing.JLabel datelabel;
    private javax.swing.JButton editbutton;
    private javax.swing.JLabel title;
    private javax.swing.JButton viewbutton;
    private String[] classlist;
    // End of variables declaration//GEN-END:variables
}
