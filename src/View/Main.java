/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author nonek
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        jPanelAlumnos = new javax.swing.JPanel();
        jSplitPaneAlumnos = new javax.swing.JSplitPane();
        jPanelAlumnosCampos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAlumnosDni = new javax.swing.JTextField();
        jTextFieldAlumnosNombre = new javax.swing.JTextField();
        jTextFieldAlumnosApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAlumnosDomicilio = new javax.swing.JTextField();
        jPanelAlumnosTelefonos = new javax.swing.JPanel();
        jTextFieldAlumnosTelefono = new javax.swing.JTextField();
        jButtonAlumnosTelefonosAñadir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAlumnosTelefonos = new javax.swing.JList();
        jButtonAlumnosTelefonosEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAlumnosEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldAlumnosFechaNacimientoDia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAlumnosFechaNacimientoMes = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldAlumnosFechaNacimientoAnio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxAlumnosCurso = new javax.swing.JComboBox();
        jButtonAlumnosInsertar = new javax.swing.JButton();
        jButtonAlumnosModificar = new javax.swing.JButton();
        jToggleButtonAlumnosEliminar = new javax.swing.JToggleButton();
        jPanelAlumnosBusqueda = new javax.swing.JPanel();
        jTextFieldAlumnosBusqueda = new javax.swing.JTextField();
        jScrollPaneAlumnos = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jPanelCurso = new javax.swing.JPanel();
        jSplitPaneCurso = new javax.swing.JSplitPane();
        jPanelCursoCampos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCursoNombre = new javax.swing.JTextField();
        jButtonCursosInsertar = new javax.swing.JButton();
        jToggleButtonCursosEliminar = new javax.swing.JToggleButton();
        jButtonCursosModificar = new javax.swing.JButton();
        jPanelCursosBusqueda = new javax.swing.JPanel();
        jTextFieldCursosBusqueda = new javax.swing.JTextField();
        jScrollPaneAlumnos1 = new javax.swing.JScrollPane();
        jTableCurso = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jSplitPaneAlumnos.setDividerLocation(300);

        jLabel1.setText("DNI:");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("APELLIDOS:");

        jLabel4.setText("DOMICILIO:");

        jPanelAlumnosTelefonos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TELEFONOS", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jButtonAlumnosTelefonosAñadir.setText("AÑADIR");

        jScrollPane1.setViewportView(jListAlumnosTelefonos);

        jButtonAlumnosTelefonosEliminar.setText("ELIMINAR");

        javax.swing.GroupLayout jPanelAlumnosTelefonosLayout = new javax.swing.GroupLayout(jPanelAlumnosTelefonos);
        jPanelAlumnosTelefonos.setLayout(jPanelAlumnosTelefonosLayout);
        jPanelAlumnosTelefonosLayout.setHorizontalGroup(
            jPanelAlumnosTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlumnosTelefonosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlumnosTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanelAlumnosTelefonosLayout.createSequentialGroup()
                        .addComponent(jTextFieldAlumnosTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlumnosTelefonosAñadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlumnosTelefonosEliminar)))
                .addContainerGap())
        );
        jPanelAlumnosTelefonosLayout.setVerticalGroup(
            jPanelAlumnosTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlumnosTelefonosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlumnosTelefonosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAlumnosTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlumnosTelefonosAñadir)
                    .addComponent(jButtonAlumnosTelefonosEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setText("EMAIL:");

        jLabel6.setText("FECHA NACIMIENTO:");

        jTextFieldAlumnosFechaNacimientoDia.setToolTipText("DD");

        jLabel7.setText("/");

        jLabel8.setText("/");

        jLabel9.setText("CURSO:");

        jButtonAlumnosInsertar.setText("INSERTAR");

        jButtonAlumnosModificar.setText("MODIFICAR");

        jToggleButtonAlumnosEliminar.setText("ELIMINAR");

        jPanelAlumnosBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "BUSQUEDA"));

        javax.swing.GroupLayout jPanelAlumnosBusquedaLayout = new javax.swing.GroupLayout(jPanelAlumnosBusqueda);
        jPanelAlumnosBusqueda.setLayout(jPanelAlumnosBusquedaLayout);
        jPanelAlumnosBusquedaLayout.setHorizontalGroup(
            jPanelAlumnosBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlumnosBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldAlumnosBusqueda)
                .addContainerGap())
        );
        jPanelAlumnosBusquedaLayout.setVerticalGroup(
            jPanelAlumnosBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlumnosBusquedaLayout.createSequentialGroup()
                .addComponent(jTextFieldAlumnosBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelAlumnosCamposLayout = new javax.swing.GroupLayout(jPanelAlumnosCampos);
        jPanelAlumnosCampos.setLayout(jPanelAlumnosCamposLayout);
        jPanelAlumnosCamposLayout.setHorizontalGroup(
            jPanelAlumnosCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlumnosCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlumnosCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAlumnosBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlumnosInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAlumnosTelefonos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelAlumnosCamposLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAlumnosDomicilio))
                    .addGroup(jPanelAlumnosCamposLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAlumnosEmail))
                    .addGroup(jPanelAlumnosCamposLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAlumnosFechaNacimientoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAlumnosFechaNacimientoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAlumnosFechaNacimientoAnio))
                    .addGroup(jPanelAlumnosCamposLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxAlumnosCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonAlumnosModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButtonAlumnosEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelAlumnosCamposLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAlumnosApellidos))
                    .addGroup(jPanelAlumnosCamposLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAlumnosNombre))
                    .addGroup(jPanelAlumnosCamposLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAlumnosDni)))
                .addContainerGap())
        );
        jPanelAlumnosCamposLayout.setVerticalGroup(
            jPanelAlumnosCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlumnosCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAlumnosBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAlumnosCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldAlumnosDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAlumnosCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldAlumnosNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAlumnosCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldAlumnosApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAlumnosCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldAlumnosDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAlumnosTelefonos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAlumnosCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldAlumnosEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAlumnosCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldAlumnosFechaNacimientoDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldAlumnosFechaNacimientoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldAlumnosFechaNacimientoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAlumnosCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBoxAlumnosCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlumnosInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlumnosModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonAlumnosEliminar)
                .addContainerGap())
        );

        jSplitPaneAlumnos.setLeftComponent(jPanelAlumnosCampos);

        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRE", "APELLIDOS", "DOMICILIO", "TELEFONOS", "EMAIL", "FECHA NACIMIENTO", "CURSO"
            }
        ));
        jScrollPaneAlumnos.setViewportView(jTableAlumnos);

        jSplitPaneAlumnos.setRightComponent(jScrollPaneAlumnos);

        javax.swing.GroupLayout jPanelAlumnosLayout = new javax.swing.GroupLayout(jPanelAlumnos);
        jPanelAlumnos.setLayout(jPanelAlumnosLayout);
        jPanelAlumnosLayout.setHorizontalGroup(
            jPanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );
        jPanelAlumnosLayout.setVerticalGroup(
            jPanelAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneAlumnos)
        );

        jTabbedPane.addTab("ALUMNOS", jPanelAlumnos);

        jSplitPaneCurso.setDividerLocation(300);

        jLabel10.setText("NOMBRE:");

        jButtonCursosInsertar.setText("INSERTAR");

        jToggleButtonCursosEliminar.setText("ELIMINAR");

        jButtonCursosModificar.setText("MODIFICAR");

        jPanelCursosBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "BUSQUEDA"));

        javax.swing.GroupLayout jPanelCursosBusquedaLayout = new javax.swing.GroupLayout(jPanelCursosBusqueda);
        jPanelCursosBusqueda.setLayout(jPanelCursosBusquedaLayout);
        jPanelCursosBusquedaLayout.setHorizontalGroup(
            jPanelCursosBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCursosBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldCursosBusqueda)
                .addContainerGap())
        );
        jPanelCursosBusquedaLayout.setVerticalGroup(
            jPanelCursosBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCursosBusquedaLayout.createSequentialGroup()
                .addComponent(jTextFieldCursosBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCursoCamposLayout = new javax.swing.GroupLayout(jPanelCursoCampos);
        jPanelCursoCampos.setLayout(jPanelCursoCamposLayout);
        jPanelCursoCamposLayout.setHorizontalGroup(
            jPanelCursoCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCursoCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCursoCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCursoCamposLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCursoNombre))
                    .addComponent(jButtonCursosInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCursosModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(jToggleButtonCursosEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCursosBusqueda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCursoCamposLayout.setVerticalGroup(
            jPanelCursoCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCursoCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCursosBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCursoCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldCursoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCursosInsertar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCursosModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButtonCursosEliminar)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        jSplitPaneCurso.setLeftComponent(jPanelCursoCampos);

        jTableCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE"
            }
        ));
        jScrollPaneAlumnos1.setViewportView(jTableCurso);

        jSplitPaneCurso.setRightComponent(jScrollPaneAlumnos1);

        javax.swing.GroupLayout jPanelCursoLayout = new javax.swing.GroupLayout(jPanelCurso);
        jPanelCurso.setLayout(jPanelCursoLayout);
        jPanelCursoLayout.setHorizontalGroup(
            jPanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );
        jPanelCursoLayout.setVerticalGroup(
            jPanelCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneCurso)
        );

        jTabbedPane.addTab("CURSO", jPanelCurso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAlumnosInsertar;
    public javax.swing.JButton jButtonAlumnosModificar;
    public javax.swing.JButton jButtonAlumnosTelefonosAñadir;
    public javax.swing.JButton jButtonAlumnosTelefonosEliminar;
    public javax.swing.JButton jButtonCursosInsertar;
    public javax.swing.JButton jButtonCursosModificar;
    public javax.swing.JComboBox jComboBoxAlumnosCurso;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JList jListAlumnosTelefonos;
    public javax.swing.JPanel jPanelAlumnos;
    public javax.swing.JPanel jPanelAlumnosBusqueda;
    public javax.swing.JPanel jPanelAlumnosCampos;
    public javax.swing.JPanel jPanelAlumnosTelefonos;
    public javax.swing.JPanel jPanelCurso;
    public javax.swing.JPanel jPanelCursoCampos;
    public javax.swing.JPanel jPanelCursosBusqueda;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPaneAlumnos;
    public javax.swing.JScrollPane jScrollPaneAlumnos1;
    public javax.swing.JSplitPane jSplitPaneAlumnos;
    public javax.swing.JSplitPane jSplitPaneCurso;
    public javax.swing.JTabbedPane jTabbedPane;
    public javax.swing.JTable jTableAlumnos;
    public javax.swing.JTable jTableCurso;
    public javax.swing.JTextField jTextFieldAlumnosApellidos;
    public javax.swing.JTextField jTextFieldAlumnosBusqueda;
    public javax.swing.JTextField jTextFieldAlumnosDni;
    public javax.swing.JTextField jTextFieldAlumnosDomicilio;
    public javax.swing.JTextField jTextFieldAlumnosEmail;
    public javax.swing.JTextField jTextFieldAlumnosFechaNacimientoAnio;
    public javax.swing.JTextField jTextFieldAlumnosFechaNacimientoDia;
    public javax.swing.JTextField jTextFieldAlumnosFechaNacimientoMes;
    public javax.swing.JTextField jTextFieldAlumnosNombre;
    public javax.swing.JTextField jTextFieldAlumnosTelefono;
    public javax.swing.JTextField jTextFieldCursoNombre;
    public javax.swing.JTextField jTextFieldCursosBusqueda;
    public javax.swing.JToggleButton jToggleButtonAlumnosEliminar;
    public javax.swing.JToggleButton jToggleButtonCursosEliminar;
    // End of variables declaration//GEN-END:variables
}
