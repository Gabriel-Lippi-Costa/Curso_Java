package com.mycompany.sistemagerenciamentocursos.telas;

import com.mycompany.sistemagerenciamentocursos.modelos.Curso;
import com.mycompany.sistemagerenciamentocursos.persistencias.DAO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class GerenciamentoCursosTela extends javax.swing.JFrame {

  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GerenciamentoCursosTela.class.getName());

  public GerenciamentoCursosTela() {
    super("Cursos");
    initComponents();
    cursosComboBox.setModel(new DefaultComboBoxModel<>());
    buscarCursos();
    this.setLocationRelativeTo(null);
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    cursosComboBox = new javax.swing.JComboBox<>();
    idTextField = new javax.swing.JTextField();
    nomeTextField = new javax.swing.JTextField();
    tipoTextField = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    cursosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" })););

  idTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

  nomeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("NOME"));

  tipoTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("TIPO"));

  jButton1.setText("Novo");

  jButton2.setText("Atualizar");

  jButton3.setText("Remover");

  jButton4.setText("Cancelar");

  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
  getContentPane().setLayout(layout);
  layout.setHorizontalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
      .addGap(112, 112, 112)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        .addComponent(cursosComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(tipoTextField)
        .addComponent(nomeTextField)
        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
      .addContainerGap(125, Short.MAX_VALUE))
  );
  layout.setVerticalGroup(
    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(layout.createSequentialGroup()
      .addGap(34, 34, 34)
      .addComponent(cursosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(42, 42, 42)
      .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(29, 29, 29)
      .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(35, 35, 35)
      .addComponent(tipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
      .addGap(18, 18, 18)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addContainerGap(16, Short.MAX_VALUE))
  );

  pack();
  }// </editor-fold>//GEN-END:initComponents

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
    } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
      logger.log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(() -> new GerenciamentoCursosTela().setVisible(true));
  }

  private void buscarCursos() {
    try {
      DAO dao = new DAO();
      Curso[] cursos = dao.obterCursos();
      cursosComboBox.setModel(new DefaultComboBoxModel<>(cursos));
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Tente novamente mais tarde!");
    }
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<Curso> cursosComboBox;
  private javax.swing.JTextField idTextField;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JTextField nomeTextField;
  private javax.swing.JTextField tipoTextField;
  // End of variables declaration//GEN-END:variables
}
