import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import db.Conexion;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;


public class View extends javax.swing.JFrame {

public View() {
    initComponents(); // Esto inicializa todos los componentes del formulario
    setLocationRelativeTo(null);
    setTitle("Cuentas");   
    consultar();  // carga la tabla al abrir el programa
    
tablaDeudas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
tablaDeudas.setRowSelectionAllowed(true);
tablaDeudas.setColumnSelectionAllowed(false);

tablaDeudas.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        int fila = tablaDeudas.getSelectedRow();
        if (fila != -1) {
            txtnombre.setText(tablaDeudas.getValueAt(fila, 1).toString());
            txtmonto.setText(tablaDeudas.getValueAt(fila, 2).toString());
            txtmes1.setSelectedItem(tablaDeudas.getValueAt(fila, 3).toString());
            txtfecha1.setText(tablaDeudas.getValueAt(fila, 4).toString());
        }
    }
}
          
);

}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDeudas = new javax.swing.JTable();
        bneliminar = new javax.swing.JButton();
        bnguardar2 = new javax.swing.JButton();
        bnactualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtmonto = new javax.swing.JTextField();
        bnconsultar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtfecha1 = new javax.swing.JTextField();
        txtmes1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtmes = new javax.swing.JComboBox<>();
        txtfecha = new javax.swing.JTextField();
        bndatos = new javax.swing.JButton();
        bneliminar1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        bndatos1 = new javax.swing.JButton();
        suma = new javax.swing.JLabel();
        bnsuma = new javax.swing.JButton();
        bnpdf = new javax.swing.JButton();
        suma1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(206, 219, 245));

        tablaDeudas.setBackground(new java.awt.Color(206, 219, 240));
        tablaDeudas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaDeudas);

        bneliminar.setBackground(new java.awt.Color(206, 219, 240));
        bneliminar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bneliminar.setText("ELIMINAR");
        bneliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bneliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneliminarActionPerformed(evt);
            }
        });

        bnguardar2.setBackground(new java.awt.Color(206, 219, 240));
        bnguardar2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bnguardar2.setText("GUARDAR");
        bnguardar2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnguardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bnguardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnguardar2ActionPerformed(evt);
            }
        });

        bnactualizar.setBackground(new java.awt.Color(206, 219, 240));
        bnactualizar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bnactualizar.setText("ACTUALIZAR");
        bnactualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnactualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnactualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("AGENDA DEUDAL");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("DEUDA:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("MONTO:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("FECHA:");

        txtnombre.setBackground(new java.awt.Color(206, 219, 240));
        txtnombre.setOpaque(true);

        txtmonto.setBackground(new java.awt.Color(206, 219, 240));
        txtmonto.setOpaque(true);

        bnconsultar1.setBackground(new java.awt.Color(206, 219, 240));
        bnconsultar1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bnconsultar1.setText("CONSULTAR");
        bnconsultar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnconsultar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bnconsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnconsultar1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("MES:");

        txtfecha1.setBackground(new java.awt.Color(206, 219, 240));
        txtfecha1.setOpaque(true);

        txtmes1.setBackground(new java.awt.Color(206, 219, 240));
        txtmes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diceiembre" }));
        txtmes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmes1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FILTRAR POR:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("MES:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("AÑO:");

        txtmes.setBackground(new java.awt.Color(206, 219, 240));
        txtmes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diceiembre" }));
        txtmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmesActionPerformed(evt);
            }
        });

        txtfecha.setBackground(new java.awt.Color(206, 219, 240));
        txtfecha.setOpaque(true);

        bndatos.setBackground(new java.awt.Color(206, 219, 240));
        bndatos.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bndatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IngGana.jpg"))); // NOI18N
        bndatos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bndatos.setBorderPainted(false);
        bndatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bndatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bndatosActionPerformed(evt);
            }
        });

        bneliminar1.setBackground(new java.awt.Color(206, 219, 240));
        bneliminar1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bneliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        bneliminar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bneliminar1.setBorderPainted(false);
        bneliminar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bneliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneliminar1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("MOSTRAR DATOS");

        bndatos1.setBackground(new java.awt.Color(206, 219, 240));
        bndatos1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bndatos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clear.png"))); // NOI18N
        bndatos1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bndatos1.setBorderPainted(false);
        bndatos1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bndatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bndatos1ActionPerformed(evt);
            }
        });

        suma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        suma.setText("_________________");

        bnsuma.setBackground(new java.awt.Color(206, 219, 240));
        bnsuma.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bnsuma.setText("SUMAR");
        bnsuma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnsuma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnsumaActionPerformed(evt);
            }
        });

        bnpdf.setBackground(new java.awt.Color(206, 219, 240));
        bnpdf.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        bnpdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/consultarVenta.png"))); // NOI18N
        bnpdf.setText("PDF");
        bnpdf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bnpdf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bnpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnpdfActionPerformed(evt);
            }
        });

        suma1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        suma1.setText("TOTAL: $");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(bneliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bnguardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(bnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bnconsultar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(64, 64, 64)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(8, 8, 8)
                                    .addComponent(txtmes1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7))
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bndatos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                                    .addComponent(bndatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bnsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suma1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bnpdf, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bneliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtmes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bnguardar2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9))
                                    .addComponent(bndatos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(94, 94, 94)
                                .addComponent(bnconsultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bndatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bnpdf))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bnsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suma1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnguardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnguardar2ActionPerformed
    String nombre = txtnombre.getText().trim();
    String montoTxt = txtmonto.getText().trim();
    String mes = txtmes1.getSelectedItem().toString();
    String fecha = txtfecha1.getText().trim();         // formato recomendado: yyyy-MM-dd

    // Validaciones básicas
    if (nombre.isEmpty() || montoTxt.isEmpty() || fecha.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Llena todos los campos");
        return;
    }

    double monto;
    try {
        monto = Double.parseDouble(montoTxt);
        if (monto < 0) {
            JOptionPane.showMessageDialog(this, "El monto no puede ser negativo");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El monto debe ser un número válido (ej. 1234.56)");
        return;
    }

    // Si prefieres validar el formato de fecha rápido:
    if (!fecha.matches("\\d{4}-\\d{2}-\\d{2}")) {
        JOptionPane.showMessageDialog(this, "La fecha debe ser yyyy-MM-dd (ej. 2025-09-04)");
        return;
    }

    String sql = "INSERT INTO deudas (nombre, monto, mes, fecha) VALUES (?, ?, ?, ?)";

    try (
        Connection con = new Conexion().conexion();
        PreparedStatement ps = (con != null ? con.prepareStatement(sql) : null)
    ) {
        if (con == null) {
            JOptionPane.showMessageDialog(this, "No hay conexión a la BD");
            return;
        }

        // Opción A: guardar la fecha como texto (MySQL la acepta si es yyyy-MM-dd)
        ps.setString(1, nombre);
        ps.setDouble(2, monto);
        ps.setString(3, mes);        
        ps.setString(4, fecha);

        // Opción B (recomendada): convertir a java.sql.Date
        // ps.setDate(4, java.sql.Date.valueOf(fecha));

        int rows = ps.executeUpdate();
        if (rows > 0) {
            JOptionPane.showMessageDialog(this, "✅ Deuda registrada correctamente");
            limpiarCampos();
            consultar(); // refresca la JTable
        } else {
            JOptionPane.showMessageDialog(this, "No se insertó el registro");
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "❌ Error al guardar: " + ex.getMessage());
    }
    }//GEN-LAST:event_bnguardar2ActionPerformed

    private void bnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnactualizarActionPerformed
    int fila = tablaDeudas.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona una deuda de la tabla");
        return;
    }

    // Validar campos vacíos
    String nombre = txtnombre.getText().trim();
    String montoStr = txtmonto.getText().trim();
    String fecha = txtfecha1.getText().trim();
    String mes = txtmes1.getSelectedItem() != null ? txtmes1.getSelectedItem().toString() : "";

    if (nombre.isEmpty() || montoStr.isEmpty() || mes.isEmpty() || fecha.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
        return;
    }

    double monto;
    try {
        monto = Double.parseDouble(montoStr);
        if (monto < 0) {
            JOptionPane.showMessageDialog(this, "El monto debe ser positivo");
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El monto debe ser un número válido");
        return;
    }

    // Obtener el ID correctamente
    Object valorId = tablaDeudas.getValueAt(fila, 0);
    int id = Integer.parseInt(valorId.toString());

    // Actualizar la deuda en la base de datos
    try (Connection con = new Conexion().conexion()) {
        String sql = "UPDATE deudas SET nombre=?, monto=?, mes=?, fecha=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, nombre);
        ps.setDouble(2, monto);
        ps.setString(3, mes);
        ps.setString(4, fecha);
        ps.setInt(5, id);

        int actualizados = ps.executeUpdate();
        if (actualizados > 0) {
            JOptionPane.showMessageDialog(this, "✅ Deuda actualizada correctamente");
            limpiarCampos();
            consultar(); // Refresca la tabla
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar la deuda");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "❌ Error al actualizar la deuda: " + ex.getMessage());
    }
    }//GEN-LAST:event_bnactualizarActionPerformed

    private void txtmes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmes1ActionPerformed

    private void bneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneliminarActionPerformed
    int fila = tablaDeudas.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Selecciona una deuda de la tabla");
        return;
    }

    // Obtener el ID de la fila seleccionada
    Object valorId = tablaDeudas.getValueAt(fila, 0);
    int id = Integer.parseInt(valorId.toString());

    // Confirmar eliminación
    int opcion = JOptionPane.showConfirmDialog(this, 
        "¿Seguro que quieres eliminar esta deuda?", 
        "Confirmar eliminación", 
        JOptionPane.YES_NO_OPTION
    );

    if (opcion != JOptionPane.YES_OPTION) {
        return; // el usuario canceló
    }

    // Borrar de la base de datos
    try (Connection con = new Conexion().conexion()) {
        String sql = "DELETE FROM deudas WHERE id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);

        int eliminados = ps.executeUpdate();
        if (eliminados > 0) {
            JOptionPane.showMessageDialog(this, "✅ Deuda eliminada correctamente");
            limpiarCampos();
            consultar(); // Refresca la tabla
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo eliminar la deuda");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "❌ Error al eliminar la deuda: " + ex.getMessage());
    }
    }//GEN-LAST:event_bneliminarActionPerformed

    private void bnconsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnconsultar1ActionPerformed
    String mesSeleccionado = txtmes.getSelectedItem() != null ? txtmes.getSelectedItem().toString() : "";
    String anio = txtfecha.getText().trim(); // año ingresado por el usuario

    // Llamamos al método consultar con filtros
    consultar(mesSeleccionado, anio);    }//GEN-LAST:event_bnconsultar1ActionPerformed

    private void txtmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmesActionPerformed

    private void bndatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bndatosActionPerformed
    consultar();
    }//GEN-LAST:event_bndatosActionPerformed

    private void bneliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneliminar1ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_bneliminar1ActionPerformed

    private void bndatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bndatos1ActionPerformed
    txtnombre.setText("");
    txtmonto.setText("");
    txtfecha.setText("");
    txtfecha1.setText("");    }//GEN-LAST:event_bndatos1ActionPerformed

    private void bnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnsumaActionPerformed
    double total = 0.0;

    // Buscar la columna "MONTO" por nombre
    int columnaMonto = -1;
    for (int i = 0; i < tablaDeudas.getColumnCount(); i++) {
        if (tablaDeudas.getColumnName(i).equalsIgnoreCase("MONTO")) {
            columnaMonto = i;
            break;
        }
    }

    if (columnaMonto == -1) {
        JOptionPane.showMessageDialog(null, "No se encontró la columna MONTO");
        return;
    }

    // Sumar todos los valores de la columna MONTO
    for (int i = 0; i < tablaDeudas.getRowCount(); i++) {
        Object montoObj = tablaDeudas.getValueAt(i, columnaMonto);
        if (montoObj != null) {
            try {
                String valor = montoObj.toString().replace(",", "").replace("$", "");
                double monto = Double.parseDouble(valor);
                total += monto;
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir monto en fila " + i + ": " + montoObj);
            }
        }
    }

    // Mostrar el total en el JLabel
    suma.setText(String.valueOf(total));
    }//GEN-LAST:event_bnsumaActionPerformed

    private void bnpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnpdfActionPerformed
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Guardar PDF");
    fileChooser.setSelectedFile(new File("Deudas.pdf"));

    int userSelection = fileChooser.showSaveDialog(this);

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();

        // Evitar sobrescribir
        if (fileToSave.exists()) {
            int respuesta = JOptionPane.showConfirmDialog(
                this,
                "El archivo ya existe. ¿Deseas reemplazarlo?",
                "Archivo existente",
                JOptionPane.YES_NO_OPTION
            );
            if (respuesta != JOptionPane.YES_OPTION) return;
        }

        try {
            // Crear documento PDF
            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream(fileToSave));
            documento.open();

            // Título
            documento.add(new Paragraph("AGENDA DEUDAL\n\n"));

            // Tabla con los datos de JTable
            int numColumnas = tablaDeudas.getColumnCount();
            PdfPTable pdfTabla = new PdfPTable(numColumnas);

            for (int i = 0; i < numColumnas; i++) {
                pdfTabla.addCell(tablaDeudas.getColumnName(i));
            }

            for (int i = 0; i < tablaDeudas.getRowCount(); i++) {
                for (int j = 0; j < numColumnas; j++) {
                    Object valor = tablaDeudas.getValueAt(i, j);
                    pdfTabla.addCell(valor != null ? valor.toString() : "");
                }
            }

            documento.add(pdfTabla);

            // Total
            documento.add(new Paragraph("\nTOTAL DE MONTOS: " + suma.getText()));

            documento.close();
            JOptionPane.showMessageDialog(null, "PDF guardado en: " + fileToSave.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_bnpdfActionPerformed
// Método consultar con filtros de mes y año
private void consultar(String mesFiltro, String anioFiltro) {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("Nombre");
    model.addColumn("Monto");
    model.addColumn("Mes");
    model.addColumn("Fecha");

    String sql = "SELECT * FROM deudas WHERE 1=1";

    if (mesFiltro != null && !mesFiltro.isEmpty()) {
        sql += " AND mes = ?";
    }
    if (anioFiltro != null && !anioFiltro.isEmpty()) {
        sql += " AND YEAR(fecha) = ?";
    }

    try (Connection con = new Conexion().conexion();
         PreparedStatement ps = con.prepareStatement(sql)) {

        int paramIndex = 1;
        if (mesFiltro != null && !mesFiltro.isEmpty()) {
            ps.setString(paramIndex++, mesFiltro);
        }
        if (anioFiltro != null && !anioFiltro.isEmpty()) {
            ps.setInt(paramIndex++, Integer.parseInt(anioFiltro));
        }

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getDouble("monto"),
                rs.getString("mes"),
                rs.getDate("fecha")
            });
        }

        tablaDeudas.setModel(model);

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al consultar: " + ex.getMessage());
    }
}

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnactualizar;
    private javax.swing.JButton bnconsultar1;
    private javax.swing.JButton bndatos;
    private javax.swing.JButton bndatos1;
    private javax.swing.JButton bneliminar;
    private javax.swing.JButton bneliminar1;
    private javax.swing.JButton bnguardar2;
    private javax.swing.JButton bnpdf;
    private javax.swing.JButton bnsuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel suma;
    private javax.swing.JLabel suma1;
    private javax.swing.JTable tablaDeudas;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtfecha1;
    private javax.swing.JComboBox<String> txtmes;
    private javax.swing.JComboBox<String> txtmes1;
    private javax.swing.JTextField txtmonto;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
private void limpiarCampos() {
    txtnombre.setText("");
    txtmonto.setText("");
    txtfecha1.setText("");
    txtmes1.setSelectedIndex(0); // si txtmes es JComboBox
}
private void consultar() {
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("Nombre");
    model.addColumn("Monto");
    model.addColumn("Mes");
    model.addColumn("Fecha");

    String sql = "SELECT * FROM deudas";

    try (Connection con = new Conexion().conexion();
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(sql)) {

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getDouble("monto"),
                rs.getString("mes"),
                rs.getDate("fecha")
            });
        }

        // 👇 aquí se refiere a tu JTable del formulario
        tablaDeudas.setModel(model);

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al consultar: " + ex.getMessage());
    }
}
}





