/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clases.Proyecto;
import clases.Rol;
import clases.Usuario;
import java.awt.CardLayout;
import java.util.ArrayList;

/**
 *
 * @author Chino
 */
public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    private final Usuario usuarioLogueado;

    public FramePrincipal(Usuario usuarioFrame) {
        usuarioLogueado = usuarioFrame;
         initComponents();
        jLabelUsuario.setText(usuarioLogueado.getNombre());
        // se debe reconocer si es administrador o no
        if(usuarioLogueado.getRol() != Rol.ADMINISTRADOR){
            jMenuAdmin.setVisible(false);
        }
       
    }
    
    public Usuario getUsuarioLogueado(){
        return usuarioLogueado;
    }
    
    private void switchPanels(String cardName){
        CardLayout c;
        c = (CardLayout)cardPanel.getLayout();
        c.show(cardPanel,cardName);
     }
    
    public void setDatos(ArrayList<Usuario> usuarios, ArrayList<Proyecto> proyectos,ArrayList<Usuario> lideres){
        adminPanel.setUsuarios(usuarios);
        proyectoPanel.setProyectos(proyectos);
        proyectoPanel.setLideres(lideres);
    }
     
    public void mostrarItems(Proyecto proyectoItems){

        switchPanels("itemPanel");
        itemPanel.setProyecto(proyectoItems);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanel1 = new vistas.AdminPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelLogoPrincipal = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jButtonAvisos = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        cardPanel = new javax.swing.JPanel();
        proyectoPanel = new vistas.ProyectoPanel();
        itemPanel = new vistas.ItemPanel();
        adminPanel = new vistas.AdminPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelLogoPrincipal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelLogoPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/laptop64.png"))); // NOI18N
        jLabelLogoPrincipal.setText("Seguimiento Items");

        jLabelUsuario.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/round-account24.png"))); // NOI18N
        jLabelUsuario.setText("Usuario: UsuarioLogueado");

        jButtonAvisos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/envelope-lightblue16.png"))); // NOI18N
        jButtonAvisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvisosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogoPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelLogoPrincipal)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cardPanel.setLayout(new java.awt.CardLayout());
        cardPanel.add(proyectoPanel, "proyectoPanel");
        cardPanel.add(itemPanel, "itemPanel");
        cardPanel.add(adminPanel, "adminPanel");

        jMenu1.setText("Inicio");

        jMenuItem5.setText("Cargar");
        jMenu1.add(jMenuItem5);

        jMenuItem1.setText("Cerrar Sesión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Cerrar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Proyecto");

        jMenuItem6.setText("Proyectos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenuAdmin.setText("Administrador");

        jMenuItem4.setText("Usuarios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItem4);

        jMenuBar1.add(jMenuAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        lf.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        switchPanels("proyectoPanel");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        switchPanels("adminPanel");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButtonAvisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvisosActionPerformed
        // TODO add your handling code here:
           AvisosDialog ad = new AvisosDialog(this,true,usuarioLogueado);
                               ad.setLocationRelativeTo(this);
                               ad.setVisible(true);
    }//GEN-LAST:event_jButtonAvisosActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal(new Usuario("Por defecto","password",Rol.LIDER)).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vistas.AdminPanel adminPanel;
    private vistas.AdminPanel adminPanel1;
    private javax.swing.JPanel cardPanel;
    private vistas.ItemPanel itemPanel;
    private javax.swing.JButton jButtonAvisos;
    private javax.swing.JLabel jLabelLogoPrincipal;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private vistas.ProyectoPanel proyectoPanel;
    // End of variables declaration//GEN-END:variables
}