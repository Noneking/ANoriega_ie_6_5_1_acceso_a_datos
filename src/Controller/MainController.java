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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 *
 * @author nonek
 */
public class MainController implements ActionListener, MouseListener {
    
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
        
        this.v.jTableAlumnos.addMouseListener(this);
        
        //Cursos
        this.v.jButtonCursosInsertar.addActionListener(this);
        this.v.jButtonCursosInsertar.setActionCommand("CURSOS_INSERT");
        this.v.jButtonCursosModificar.addActionListener(this);
        this.v.jButtonCursosModificar.setActionCommand("CURSOS_MODIFY");
        this.v.jToggleButtonCursosEliminar.addActionListener(this);
        this.v.jToggleButtonCursosEliminar.setActionCommand("CURSOS_DELETE");
        
        this.v.jTableCurso.addMouseListener(this);
        
        initOperations();
    }
    
    public void initOperations(){
        refreshTable("ALUMNOS");
        refreshTable("CURSOS");
    }
    
    public enum ACTIONS{
        ALUMNOS_INSERT,
        ALUMNOS_MODIFY,
        ALUMNOS_DELETE,
        
        CURSOS_INSERT,
        CURSOS_MODIFY,
        CURSOS_DELETE
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(Controller.MainController.ACTIONS.valueOf(e.getActionCommand())){
            case ALUMNOS_INSERT:
                ArrayList<String> telefonos = null;
                for(int i=0;i<this.v.jListAlumnosTelefonos.getModel().getSize();i++){
                    telefonos.add(this.v.jListAlumnosTelefonos.getModel().getElementAt(i).toString());
                }
                String birthday=this.v.jTextFieldAlumnosFechaNacimientoDia.getText()+"/"+this.v.jTextFieldAlumnosFechaNacimientoMes+"/"+this.v.jTextFieldAlumnosFechaNacimientoAnio.getText();
                operations.insertStudent(this.v.jTextFieldAlumnosDni.getText(), this.v.jTextFieldAlumnosNombre.getText(), this.v.jTextFieldAlumnosApellidos.getText(), this.v.jTextFieldAlumnosDomicilio.getText(), birthday, telefonos, this.v.jTextFieldAlumnosEmail.getText(), this.v.jComboBoxAlumnosCurso.getSelectedItem().toString());
                refreshTable("ALUMNOS");
                break;
            case ALUMNOS_MODIFY:
                
                break;
            case ALUMNOS_DELETE:
                if(this.v.jToggleButtonAlumnosEliminar.isSelected()){
                    
                }
                break;
            case CURSOS_INSERT:
                operations.insertCource(this.v.jTextFieldCursoNombre.getText());
                refreshTable("CURSOS");
                break;
            case CURSOS_MODIFY:
                
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
            }
        }else if(e.getComponent().equals(this.v.jTableCurso)){
            if(this.v.jToggleButtonCursosEliminar.isSelected()){
                operations.deleteCource(this.v.jTableCurso.getValueAt(this.v.jTableCurso.getSelectedRow(), 0).toString());
                refreshTable("CURSOS");
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
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
    
}
