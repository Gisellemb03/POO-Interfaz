/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaelectrodomestico;

import static herenciaelectrodomestico.Principal.listaElectrodomesticos;//estaba llamando otro x
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 g  @author  
 */
public class GuiElectrodomesticos extends javax.swing.JInternalFrame {

    /**
     * Creates new form GuiElectrodomesticos
     */
    public GuiElectrodomesticos() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrecioBase = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtConsumo = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("PRECIO BASE");

        jLabel2.setText("PESO");

        jLabel3.setText("CONSUMO ENERGETICO");

        jLabel4.setText("COLOR");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTabla);

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //aqui se va mostra todo los elementos del arreglo 
        consultar();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    protected javax.swing.JTextField txtColor;
    protected javax.swing.JTextField txtConsumo;
    protected javax.swing.JTextField txtPeso;
    protected javax.swing.JTextField txtPrecioBase;
    // End of variables declaration//GEN-END:variables

    protected void guardar() {
        Principal.listaElectrodomesticos.add(new Electrodomestico(Double.parseDouble(txtPrecioBase.getText()),
                Double.parseDouble(txtPeso.getText()), txtConsumo.getText().toUpperCase().charAt(0), txtColor.getText()));
        //asi se guarda un electrodomestico.
        JOptionPane.showMessageDialog(this, "Se vendio un electrodomestico");

    }

    private void consultar() {
        //Creamos las variables que usaremos para almacenar la suma de los precios
        
        double sumaElectrodomesticos = 0;
        double sumaTelevisiones = 0;
        double sumaLavadoras = 0;
        Vector<String> columnas = new Vector<>();
        columnas.add("PrecioBase");
        columnas.add("Peso");
        columnas.add("Comsumo");
        columnas.add("Color");
        columnas.add("Precio Final");

        Vector datos = new Vector();
        //Recorremos el array invocando el metodo precioFinal
        for (Electrodomestico electrodomestico : listaElectrodomesticos) {//importo el arreglo
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */
            if (electrodomestico instanceof Electrodomestico) {
                /*
                * El operador instanceof sirve para conocer si un objeto es de un tipo determinado. 
                * Por tipo, nos referimos a clase o interfaz (interface)
                 */
                sumaElectrodomesticos += electrodomestico.precioFinal();
                // System.out.println("Precio Final Electrodomestico: " + electrodomestico.precioFinal());
                //Se guardan en el vector solo si son electrodomesticos.
                Vector row = new Vector();
                row.add(electrodomestico.getPrecioBase());
                row.add(electrodomestico.getPeso());
                row.add(electrodomestico.getConsumoEnergetico());
                row.add(electrodomestico.getColor());
                row.add (electrodomestico.precioFinal());
                datos.add(row);
            }

        }

        DefaultTableModel model = new DefaultTableModel(datos, columnas);
        jTabla.setModel(model);
    }
}//los ultimos dos son los que van a cambiar dependiendo del tipo de electrodomestico que se registre.
//polimorfismo!!
//tambien los cuadros de texto van a cambiar 
//solo los ultimos dos recuerda

//ahora viene lo divertido.
//tenemos que cambiar todos los elementos de la clase guielectro.. a protected para poder utilizarla desde las clases hijas..
//no se guarda nada en el arreglo no se por que :v

