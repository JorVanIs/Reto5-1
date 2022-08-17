
package Vista;

import Controlador.ReportesController;
import Modelo.Vo.ComprasProyectoProveedorVo;
import Modelo.Vo.InformacionLiderVo;
import Modelo.Vo.ProyectoCasaCiudadVo;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class InformesProyectosConstruccion extends javax.swing.JFrame {
    ReportesController reportesController;
    
    public InformesProyectosConstruccion() {
        initComponents();
        
        //creo los objetos de la clases correspondientes
        this.reportesController = new ReportesController();
        
        //Al iniciar la vista cargo las tablas de informes
        mostrarTablaInforme1(); //Borra Informe 1 de  lider
        mostrarTablaInforme2(); //Borra Imforme 2 de  proyectos casa campestre y ciudad
        mostrarTablaInforme3(); //Borra Informe 3 de  compras Proyecto proveedor
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPaneInforme1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInforme1 = new javax.swing.JTable();
        jPaneInforme2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInforme2 = new javax.swing.JTable();
        jPaneInforme3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaInforme3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Información de Lideres");

        tablaInforme1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaInforme1);

        javax.swing.GroupLayout jPaneInforme1Layout = new javax.swing.GroupLayout(jPaneInforme1);
        jPaneInforme1.setLayout(jPaneInforme1Layout);
        jPaneInforme1Layout.setHorizontalGroup(
            jPaneInforme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneInforme1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel2)
                .addContainerGap(126, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPaneInforme1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPaneInforme1Layout.setVerticalGroup(
            jPaneInforme1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneInforme1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Informe-1", jPaneInforme1);

        jLabel3.setText("Informacion CasaCampestre Ciudad");

        tablaInforme2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaInforme2);

        javax.swing.GroupLayout jPaneInforme2Layout = new javax.swing.GroupLayout(jPaneInforme2);
        jPaneInforme2.setLayout(jPaneInforme2Layout);
        jPaneInforme2Layout.setHorizontalGroup(
            jPaneInforme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneInforme2Layout.createSequentialGroup()
                .addGroup(jPaneInforme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneInforme2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel3))
                    .addGroup(jPaneInforme2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPaneInforme2Layout.setVerticalGroup(
            jPaneInforme2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneInforme2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informe-2", jPaneInforme2);

        jLabel1.setText("Informacion ComprasProyectos Proveedor");

        tablaInforme3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaInforme3);

        javax.swing.GroupLayout jPaneInforme3Layout = new javax.swing.GroupLayout(jPaneInforme3);
        jPaneInforme3.setLayout(jPaneInforme3Layout);
        jPaneInforme3Layout.setHorizontalGroup(
            jPaneInforme3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneInforme3Layout.createSequentialGroup()
                .addGroup(jPaneInforme3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneInforme3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPaneInforme3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPaneInforme3Layout.setVerticalGroup(
            jPaneInforme3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneInforme3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Informe-3", jPaneInforme3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InformesProyectosConstruccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformesProyectosConstruccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformesProyectosConstruccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformesProyectosConstruccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformesProyectosConstruccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPaneInforme1;
    private javax.swing.JPanel jPaneInforme2;
    private javax.swing.JPanel jPaneInforme3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaInforme1;
    private javax.swing.JTable tablaInforme2;
    private javax.swing.JTable tablaInforme3;
    // End of variables declaration//GEN-END:variables

    //Metodo para realizar el llenado de la tabla de informe 1
    private void mostrarTablaInforme1(){
        String[] titulosColumnas = {"ID lider", "Nombre", "Primer apellido", "Residencia"};
        ReportesController reportesController = new ReportesController();
        
        ArrayList<InformacionLiderVo> listaInformacionLider;
        
        try {
            listaInformacionLider = (ArrayList<InformacionLiderVo>) this.reportesController.listarInformacionLider();
            
            Object[][] informacion = new Object[listaInformacionLider.size()][4];
            int index = 0;
            //recorro el ArrayList y lleno la tabla de informe 1
            for(InformacionLiderVo lista: listaInformacionLider){
                informacion[index][0] = lista.getIdLiderPk();
                informacion[index][1] = lista.getNombreLider();
                informacion[index][2] = lista.getPrimerApellido();
                informacion[index][3] = lista.getCiudadResidencia();
                index += 1;
            }
            DefaultTableModel model = new DefaultTableModel(informacion,titulosColumnas);
            tablaInforme1.setModel(model);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    //Metodo para realizar el llenado de la tabla de informe 2
    private void mostrarTablaInforme2(){
        
        String[] titulosColumnas = {"Id proyecto", "Nombre constructora", "Número habitaciones", "Ciudad"};
        ReportesController reportesController = new ReportesController();
        
        ArrayList<ProyectoCasaCiudadVo> listaProyectoCasa;

        try {
            listaProyectoCasa = (ArrayList<ProyectoCasaCiudadVo>) this.reportesController.listarProyectosCiudad();
            
            Object[][] informacion = new Object[listaProyectoCasa.size()][4];
            int index = 0;
        
            //recorro el ArrayList y lleno la tabla de informe 2
            for(ProyectoCasaCiudadVo lista: listaProyectoCasa){
                informacion[index][0] = lista.getIdProyectoPk();
                informacion[index][1] = lista.getConstructora();
                informacion[index][2] = lista.getNumeroHabitaciones();
                informacion[index][3] = lista.getCiudad();
                index += 1;
            }
            DefaultTableModel model = new DefaultTableModel(informacion,titulosColumnas);
            tablaInforme2.setModel(model);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    //Metodo para realizar el llenado de la tabla de informe 3
    private void mostrarTablaInforme3(){
        
        String[] tituloColumnas = {"Id compra", "Nombre constructora", "Banco vinculado"};
        ReportesController reportesController = new ReportesController();
        
        ArrayList<ComprasProyectoProveedorVo> listaComprasProyectoProveedor;
        
        try {
            listaComprasProyectoProveedor = (ArrayList<ComprasProyectoProveedorVo>) this.reportesController.listarProyectosProveedor();
            
            Object[][] informacion = new Object[listaComprasProyectoProveedor.size()][3];
            int index = 0;
            
            //recorro el ArrayList y lleno la tabla de informe 3
            for(ComprasProyectoProveedorVo lista: listaComprasProyectoProveedor){
                informacion[index][0] = lista.getIdCompraPk();
                informacion[index][1] = lista.getNombreConstructora();
                informacion[index][2] = lista.getBancoVinculado();
                index += 1;
            }
            DefaultTableModel model = new DefaultTableModel(informacion, tituloColumnas);
            tablaInforme3.setModel(model);
                
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
