/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.AlumnoData;
import Modelo.Alumno;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

/**
 *
 * @author Anto
 */
public class FormularioAlumnoView extends javax.swing.JInternalFrame {

    private AlumnoData ad;
    /**
     * Creates new form AgregarAlumnoView
     */
    public FormularioAlumnoView() {
        

    }

    public FormularioAlumnoView(AlumnoData ad) {
        initComponents();
        this.ad=ad;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFormMaterias = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblApellido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblLegajo = new javax.swing.JLabel();
        txtLegajo = new javax.swing.JTextField();
        buttonBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        radBtnEstadoAlum = new javax.swing.JRadioButton();
        btnSalir = new javax.swing.JButton();
        jcfechaNac = new com.toedter.calendar.JDateChooser();
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblFechaNac1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Alumnos");

        lblFormMaterias.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFormMaterias.setText("Alumno");

        lblApellido.setText("Apellido:");

        lblNombre.setText("Nombre:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        lblLegajo.setText("Legajo:");

        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Modificar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Cambiar Estado");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        lblEstado.setText("Estado: ");

        radBtnEstadoAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radBtnEstadoAlumActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblDni.setText("DNI:");

        lblFechaNac1.setText("Fecha de Nacimiento: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(lblFormMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBorrar)
                        .addGap(32, 32, 32)
                        .addComponent(btnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDni)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNombre)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblApellido))
                                        .addComponent(lblEstado)
                                        .addComponent(lblFechaNac1))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtLegajo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(buttonBuscar))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(radBtnEstadoAlum)
                                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jcfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(363, 363, 363)
                                    .addComponent(btnSalir))))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblFormMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscar)
                    .addComponent(lblLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblEstado))
                    .addComponent(radBtnEstadoAlum))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaNac1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnGuardar)
                    .addComponent(btnBorrar)
                    .addComponent(btnSalir))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
   
        
        Integer id = 0;
        try {
             id = Integer.parseInt(txtLegajo.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Valor ingresado invalido, ingrese numeros");
            txtLegajo.requestFocus();// vuelve al comp
        }
       
        
      
        Alumno alumno = new Alumno();
        alumno=ad.buscarAlumno(id);
        
        
        if (alumno.getIdAlumno()!= 0) {
            //Cambiar int a string
            String legajo = String.valueOf(alumno.getIdAlumno());
            String dni = String.valueOf(alumno.getDni());
            txtLegajo.setText(legajo);
            txtDni.setText(dni);
            txtApellido.setText(alumno.getApellido());
            txtNombre.setText(alumno.getNombre());
         
            LocalDate lc = alumno.getFechaNac();
            Date date = Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jcfechaNac.setDate(date);

        }

    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
     
        Integer id = Integer.parseInt(txtLegajo.getText());

        if (radBtnEstadoAlum.isSelected()) {
            ad.activarAlumno(id);
        } else {
            ad.eliminarAlumno(id);
        }


    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    
        Integer id = Integer.parseInt(txtLegajo.getText());
        int dni = Integer.parseInt(txtDni.getText());
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
 
        Date sfecha = jcfechaNac.getDate();
        LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Boolean estado = radBtnEstadoAlum.isSelected();

        Alumno alumno = new Alumno(dni, apellido, nombre, fechaNac, estado);

        ad.modificarAlumno(id, alumno);


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
                
       try{ 
        int dni = Integer.parseInt(txtDni.getText());
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        Date sfecha = jcfechaNac.getDate();
        LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Boolean estado = radBtnEstadoAlum.isSelected();

        Alumno alumno = new Alumno(dni, apellido, nombre, fechaNac, estado);

        ad.guardarAlumno(alumno);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(this, "El DNI es incorrecto.");
            txtDni.requestFocus();
        }
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void radBtnEstadoAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radBtnEstadoAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radBtnEstadoAlumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser jcfechaNac;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaNac1;
    private javax.swing.JLabel lblFormMaterias;
    private javax.swing.JLabel lblLegajo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JRadioButton radBtnEstadoAlum;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtLegajo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
