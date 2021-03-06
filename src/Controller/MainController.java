/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Operations;
import View.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author nonek
 */
public class MainController implements ActionListener, MouseListener, KeyListener {
    
    private Main v;
    private Operations operations;
    
    public MainController(Main v){
     
        this.v=v;
        this.v.setVisible(true);
        operations=new Operations();
        
        initListeners();
    }
    
    public void initListeners(){
        
        //Alumnos
        this.v.jButtonAlumnosInsertar.addActionListener(this);
        this.v.jButtonAlumnosInsertar.setActionCommand("ALUMNOS_INSERT");
        this.v.jButtonAlumnosModificar.addActionListener(this);
        this.v.jButtonAlumnosModificar.setActionCommand("ALUMNOS_MODIFY");
        this.v.jToggleButtonAlumnosEliminar.addActionListener(this);
        this.v.jToggleButtonAlumnosEliminar.setActionCommand("ALUMNOS_DELETE");
        
        this.v.jButtonAlumnosTelefonosAñadir.addActionListener(this);
        this.v.jButtonAlumnosTelefonosAñadir.setActionCommand("ALUMNOS_AÑADIR_TELEFONO");
        this.v.jButtonAlumnosTelefonosEliminar.addActionListener(this);
        this.v.jButtonAlumnosTelefonosEliminar.setActionCommand("ALUMNOS_ELIMINAR_TELEFONO");
        
        this.v.jTextFieldAlumnosBusqueda.addKeyListener(this);
        
        this.v.jTableAlumnos.addMouseListener(this);
        
        //Cursos
        this.v.jButtonCursosInsertar.addActionListener(this);
        this.v.jButtonCursosInsertar.setActionCommand("CURSOS_INSERT");
        this.v.jButtonCursosModificar.addActionListener(this);
        this.v.jButtonCursosModificar.setActionCommand("CURSOS_MODIFY");
        this.v.jToggleButtonCursosEliminar.addActionListener(this);
        this.v.jToggleButtonCursosEliminar.setActionCommand("CURSOS_DELETE");
        
        this.v.jTextFieldCursosBusqueda.addKeyListener(this);
        
        this.v.jTableCurso.addMouseListener(this);
        
        initOperations();
    }
    
    public void initOperations(){
        refreshTable("ALUMNOS");
        refreshTable("CURSOS");
        refreshComboBox("CURSOS");
    }
    
    public enum ACTIONS{
        ALUMNOS_INSERT,
        ALUMNOS_MODIFY,
        ALUMNOS_DELETE,
        ALUMNOS_AÑADIR_TELEFONO,
        ALUMNOS_ELIMINAR_TELEFONO,
        
        CURSOS_INSERT,
        CURSOS_MODIFY,
        CURSOS_DELETE
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(Controller.MainController.ACTIONS.valueOf(e.getActionCommand())){
            case ALUMNOS_INSERT:
                String[] telefonos = new String[this.v.jListAlumnosTelefonos.getModel().getSize()];
                for(int i=0;i<this.v.jListAlumnosTelefonos.getModel().getSize();i++){
                    telefonos[i]=this.v.jListAlumnosTelefonos.getModel().getElementAt(i).toString();
                }
                String birthday=this.v.jTextFieldAlumnosFechaNacimientoDia.getText()+"/"+this.v.jTextFieldAlumnosFechaNacimientoMes.getText()+"/"+this.v.jTextFieldAlumnosFechaNacimientoAnio.getText();
                operations.insertStudent(this.v.jTextFieldAlumnosDni.getText(), this.v.jTextFieldAlumnosNombre.getText(), this.v.jTextFieldAlumnosApellidos.getText(), this.v.jTextFieldAlumnosDomicilio.getText(), birthday, telefonos, this.v.jTextFieldAlumnosEmail.getText(), this.v.jComboBoxAlumnosCurso.getSelectedItem().toString());
                refreshTable("ALUMNOS");
                break;
            case ALUMNOS_MODIFY:
                String[] telefonos2=new String[this.v.jListAlumnosTelefonos.getModel().getSize()];
                for(int i=0;i<this.v.jListAlumnosTelefonos.getModel().getSize();i++){
                    telefonos2[i]=this.v.jListAlumnosTelefonos.getModel().getElementAt(i).toString();
                }
                String birthday2=this.v.jTextFieldAlumnosFechaNacimientoDia.getText()+"/"+this.v.jTextFieldAlumnosFechaNacimientoMes.getText()+"/"+this.v.jTextFieldAlumnosFechaNacimientoAnio.getText();
                operations.modifyStudent(this.v.jTableAlumnos.getValueAt(this.v.jTableAlumnos.getSelectedRow(), 0).toString(), this.v.jTextFieldAlumnosDni.getText(), this.v.jTextFieldAlumnosNombre.getText(), this.v.jTextFieldAlumnosApellidos.getText(), this.v.jTextFieldAlumnosDomicilio.getText(), telefonos2, this.v.jTextFieldAlumnosEmail.getText(), birthday2, this.v.jComboBoxAlumnosCurso.getSelectedItem().toString());
                refreshTable("ALUMNOS");
                break;
            case ALUMNOS_DELETE:
                if(this.v.jToggleButtonAlumnosEliminar.isSelected()){
                    
                }
                break;
            case ALUMNOS_AÑADIR_TELEFONO:
                ListModel listModel=this.v.jListAlumnosTelefonos.getModel();
                DefaultListModel newListModel=new DefaultListModel();
                for(int i=0;i<listModel.getSize();i++){
                    newListModel.addElement(listModel.getElementAt(i));
                }
                newListModel.addElement(this.v.jTextFieldAlumnosTelefono.getText());
                this.v.jListAlumnosTelefonos.setModel(newListModel);
                break;
            case ALUMNOS_ELIMINAR_TELEFONO:
                listModel=this.v.jListAlumnosTelefonos.getModel();
                DefaultListModel listModel2=new DefaultListModel();
                for(int i=0;i<listModel.getSize();i++){
                    if(!(listModel.getElementAt(i).toString().equals(this.v.jListAlumnosTelefonos.getSelectedValue().toString()))){
                        listModel2.addElement(listModel.getElementAt(i));
                    }
                }
                this.v.jListAlumnosTelefonos.setModel(listModel2);
                break;
            case CURSOS_INSERT:
                operations.insertCource(this.v.jTextFieldCursoNombre.getText());
                refreshTable("CURSOS");
                refreshComboBox("CURSOS");
                break;
            case CURSOS_MODIFY:
                operations.modifyCource(this.v.jTableCurso.getValueAt(this.v.jTableCurso.getSelectedRow(), 0).toString(), this.v.jTextFieldCursoNombre.getText());
                refreshTable("CURSOS");
                break;
            case CURSOS_DELETE:
                if(this.v.jToggleButtonCursosEliminar.isSelected()){
                    
                }
                break;
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getComponent().equals(this.v.jTableAlumnos)){
            if(this.v.jToggleButtonAlumnosEliminar.isSelected()){
                operations.deleteStudent(this.v.jTableAlumnos.getValueAt(this.v.jTableAlumnos.getSelectedRow(), 0).toString());
                refreshTable("ALUMNOS");
            }else{
                this.v.jTextFieldAlumnosDni.setText(this.v.jTableAlumnos.getValueAt(this.v.jTableAlumnos.getSelectedRow(), 1).toString());
                this.v.jTextFieldAlumnosNombre.setText(this.v.jTableAlumnos.getValueAt(this.v.jTableAlumnos.getSelectedRow(), 2).toString());
                this.v.jTextFieldAlumnosApellidos.setText(this.v.jTableAlumnos.getValueAt(this.v.jTableAlumnos.getSelectedRow(), 3).toString());
                this.v.jTextFieldAlumnosDomicilio.setText(this.v.jTableAlumnos.getValueAt(this.v.jTableAlumnos.getSelectedRow(), 4).toString());
                
                String telefonos=this.v.jTableAlumnos.getValueAt(this.v.jTableAlumnos.getSelectedRow(), 5).toString();
                
                telefonos=telefonos.replace("[", "");
                telefonos=telefonos.replace("]", "");
                telefonos=telefonos.replace("\"", "");
                telefonos=telefonos.replace("\\s+", "");
                
                String[] arrayTelefonos=telefonos.split(",");
                DefaultListModel listModel=new DefaultListModel();
                for(int i=0;i<arrayTelefonos.length;i++){
                    listModel.addElement(arrayTelefonos[i]);
                }
                this.v.jListAlumnosTelefonos.setModel(listModel);
                
                this.v.jTextFieldAlumnosEmail.setText(this.v.jTableAlumnos.getValueAt(this.v.jTableAlumnos.getSelectedRow(), 6).toString());
                String[] arrayFecha=this.v.jTableAlumnos.getValueAt(this.v.jTableAlumnos.getSelectedRow(), 7).toString().split("/");
                this.v.jTextFieldAlumnosFechaNacimientoDia.setText(arrayFecha[0]);
                this.v.jTextFieldAlumnosFechaNacimientoMes.setText(arrayFecha[1]);
                this.v.jTextFieldAlumnosFechaNacimientoAnio.setText(arrayFecha[2]);
                
                for(int i=0;i<this.v.jComboBoxAlumnosCurso.getItemCount();i++){
                    String combo=this.v.jComboBoxAlumnosCurso.getItemAt(i).toString();
                    String table=this.v.jTableAlumnos.getValueAt(this.v.jTableAlumnos.getSelectedRow(), 8).toString();
                    System.out.println("¿Combo --> "+combo+" = "+table+" <-- Table?");
                    if(combo.equals(table)){
                        System.out.println("Entonces.. "+i);
                        this.v.jComboBoxAlumnosCurso.setSelectedIndex(i);
                    }
                }
            }
        }else if(e.getComponent().equals(this.v.jTableCurso)){
            if(this.v.jToggleButtonCursosEliminar.isSelected()){
                operations.deleteCource(this.v.jTableCurso.getValueAt(this.v.jTableCurso.getSelectedRow(), 0).toString());
                refreshTable("CURSOS");
                refreshComboBox("CURSOS");
            }else{
                this.v.jTextFieldCursoNombre.setText(this.v.jTableCurso.getValueAt(this.v.jTableCurso.getSelectedRow(), 1).toString());
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("aaa");
        if(e.getComponent().equals(this.v.jTextFieldAlumnosBusqueda)){
            System.out.println("eee");
            this.v.jTableAlumnos.setModel(operations.getTableModelByQuery("ALUMNOS", this.v.jTextFieldAlumnosBusqueda.getText()));
        }else if(e.getComponent().equals(this.v.jTextFieldCursosBusqueda)){
            this.v.jTableCurso.setModel(operations.getTableModelByQuery("CURSOS", this.v.jTextFieldCursosBusqueda.getText()));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getComponent().equals(this.v.jTextFieldAlumnosBusqueda)){
            if(this.v.jTextFieldAlumnosBusqueda.getText().equals("")){
                this.v.jTableAlumnos.setModel(operations.getTableModel("ALUMNOS"));
            }else{
                this.v.jTableAlumnos.setModel(operations.getTableModelByQuery("ALUMNOS", this.v.jTextFieldAlumnosBusqueda.getText()));
            }
        }else if(e.getComponent().equals(this.v.jTextFieldCursosBusqueda)){
            if(this.v.jTextFieldCursosBusqueda.getText().equals("")){
                this.v.jTableAlumnos.setModel(operations.getTableModel("CURSOS"));
            }else{
                this.v.jTableCurso.setModel(operations.getTableModelByQuery("CURSOS", this.v.jTextFieldCursosBusqueda.getText()));
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    public void refreshTable(String table){
        switch(table){
            case "ALUMNOS":
                this.v.jTableAlumnos.setModel(operations.getTableModel("ALUMNOS"));
                break;
            case "CURSOS":
                this.v.jTableCurso.setModel(operations.getTableModel("CURSOS"));
                break;
        }
    }
    
    public void refreshComboBox(String table){
        switch(table){
            case "CURSOS":
                this.v.jComboBoxAlumnosCurso.setModel(operations.getComboBoxModel("CURSOS"));
                break;
        }
    }
    
}
