/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arm;

/**
 *
 * @author rahul
 */
public class loginUI extends javax.swing.JFrame {

    /**
     * Creates new form loginUI
     */
    public loginUI() {
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

        title = new javax.swing.JLabel();
        usernamelabel = new javax.swing.JLabel();
        passwordlabel = new javax.swing.JLabel();
        usernameinput = new javax.swing.JTextField();
        passwordinput = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        title.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("ARM - The Attendance Manager");

        usernamelabel.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        usernamelabel.setText("Username:");

        passwordlabel.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        passwordlabel.setText("Password:");

        loginbutton.setText("login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordinput, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameinput, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 213, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameinput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(passwordlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordinput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
	String idno=usernameinput.getText();
        String password=new String(passwordinput.getPassword());
	boolean adminAvailable=false;
	String[] adminList=util.SQLQuery("ARM_config","SELECT IDNo FROM admin");

	for(int i=0;i<adminList.length;i++)
                if(idno.equals(adminList[i])) {
                        adminAvailable=true;
			break;
                }

        if(adminAvailable) {
                if(password.equals(util.SQLQuery("ARM_config","SELECT Password FROM admin WHERE IDNo='"+idno+"'")[0])) {
			setVisible(false);
                        dispose();
                        adminMenuUI.main(null);
            	}

           	else
                	usernameinput.setForeground(new java.awt.Color(255, 0, 0));
        }

	else
    		usernameinput.setForeground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_loginbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
		Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e) {
                e.printStackTrace();
        }
                setup.firstRun();
                int temp=setup.createReports();
                boolean first_run=false;

        if(temp==1)
                first_run=true;

        if(!first_run)
        {
		/* Set the Nimbus look and feel */
       		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        	/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         	* For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         	*/
        	try {
        		util.setLookAndFeel();
		} catch (ClassNotFoundException ex) {
            		java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	} catch (InstantiationException ex) {
            		java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	} catch (IllegalAccessException ex) {
            		java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            		java.util.logging.Logger.getLogger(loginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	}
        	//</editor-fold>

        	/* Create and display the form */
        	java.awt.EventQueue.invokeLater(new Runnable() {
            		public void run() {
                		new loginUI().setVisible(true);
            		}
        	});
	}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginbutton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel usernamelabel;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JTextField usernameinput;
    private javax.swing.JPasswordField passwordinput;
    // End of variables declaration//GEN-END:variables
}
