import javax.swing.*;
import java.awt.*;
public class SampelBentukProgram extends javax.swing.JFrame {
    private double jarak = 0;
    double[][] rute = {
            {0,0,0,0.6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,2,2.7,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,2,0,0.1,0,0,0,0,1.8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0.6,2.7,0.1,0,0.3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0.3,0,0.5,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0.5,0,0.8,0,0,0,1.3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0.8,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,2,0,0,0,0,0,0,0.8,0,0,0,3.5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1.8,0,0,0,0,0.8,0,0,0,0,0,0,0,0,0,1.6,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1.3,0,0,0,1,0,0.3,0,0,0,0,0,0,0.7,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,0,0,0,0.3,0,0,0,0,0,0,0,0,0.8,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,3.5,0,0,0,0,0,0.5,0,0,0,0,0,0,0,0,2,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0.4,0,0.5,0,0,0,0,0,0,1,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0.5,0,0.2,0,1.5,0,0,0,0.3,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.2,0,0.5,0,0,0,0,0,0,0,0,0,0,0.3},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.5,0,2.3,0,0,0,0,0,3.5,0,0,0,1.75},
            {0,0,0,0,0,0,0,0,1.6,1,0,0,0,0,1.5,0,2.3,0,1,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0.7,0,0,0,0,0,0,1,0,0.3,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0.8,0,0,0,0,0,0,0.3,0,0.7,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1.5,0,0,0,0,0,0,0,1},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,1,0.3,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,1,0.5,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3.5,0,0,0,0.4,0,1,0,0,0,0.5,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.5,0,0,0.9,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.9,0,0.7,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.5,0,0.7,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.3,1.75,0,0,0,1,0,0,1.75,0,0,0,0}
        };
    public SampelBentukProgram() {
        initComponents();
        MenampilkanPeta();
    }
    
    public void MenampilkanPeta() {
        PanelPeta = new TampilanPeta();
        PanelPeta.repaint();
        jScrollPane2.setViewportView(PanelPeta);
        PanelPeta.setAutoscrolls(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPeta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        PanelRute = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Pilih_Tempat_Tuju = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        Jarak_Tempuh = new javax.swing.JTextField();
        Hitung_Jarak_Tempuh = new javax.swing.JButton();
        Gambar_Rute_Perjalanan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Program Rute Jalan");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout PanelPetaLayout = new javax.swing.GroupLayout(PanelPeta);
        PanelPeta.setLayout(PanelPetaLayout);
        PanelPetaLayout.setHorizontalGroup(
            PanelPetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        PanelPetaLayout.setVerticalGroup(
            PanelPetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        javax.swing.GroupLayout PanelRuteLayout = new javax.swing.GroupLayout(PanelRute);
        PanelRute.setLayout(PanelRuteLayout);
        PanelRuteLayout.setHorizontalGroup(
            PanelRuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        PanelRuteLayout.setVerticalGroup(
            PanelRuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        jLabel1.setText("Tempat yang dituju :");

        Pilih_Tempat_Tuju.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ATMI", "Gramedia", "Univ.Setia Budi", "Stadion Mahanan", "Solo Grandmall" }));

        jLabel2.setText("Jarak Tempuh : ");

        Hitung_Jarak_Tempuh.setText("Proses Tempuh");
        Hitung_Jarak_Tempuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hitung_Jarak_TempuhActionPerformed(evt);
            }
        });

        Gambar_Rute_Perjalanan.setText("Bentuk Rute Jalan");
        Gambar_Rute_Perjalanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gambar_Rute_PerjalananActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelRute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Pilih_Tempat_Tuju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Jarak_Tempuh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Hitung_Jarak_Tempuh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(Gambar_Rute_Perjalanan)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(Jarak_Tempuh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pilih_Tempat_Tuju, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hitung_Jarak_Tempuh)
                    .addComponent(Gambar_Rute_Perjalanan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(PanelRute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Hitung_Jarak_TempuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hitung_Jarak_TempuhActionPerformed
        int pilih_tempat = Pilih_Tempat_Tuju.getSelectedIndex();
        int tujuan = 0;
        switch (pilih_tempat) {
            case 0 : tujuan = 25; break;
            case 1 : tujuan = 19; break;
            case 2 : tujuan = 1; break;
            case 3 : tujuan = 21; break;
            case 4 : tujuan = 20; break; }
        jarak = HitungJarak(rute, 0, jarak, tujuan);
        Jarak_Tempuh.setText(jarak+" KM");
    }//GEN-LAST:event_Hitung_Jarak_TempuhActionPerformed

    private void Gambar_Rute_PerjalananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gambar_Rute_PerjalananActionPerformed
        int pilih_tempat = Pilih_Tempat_Tuju.getSelectedIndex();
        switch (pilih_tempat) {
            case 0 : PanelRute = new TampilanRuteATMI();
                     PanelRute.repaint();
                     jScrollPane3.setViewportView(PanelRute);
                     PanelRute.setAutoscrolls(true);
                     break;
            case 1 : PanelRute = new TampilanRuteGramedia();
                     PanelRute.repaint();
                     jScrollPane3.setViewportView(PanelRute);
                     PanelRute.setAutoscrolls(true);
                     break;
            case 2 : PanelRute = new TampilanRuteUniv_SetiaBudi();
                     PanelRute.repaint();
                     jScrollPane3.setViewportView(PanelRute);
                     PanelRute.setAutoscrolls(true);
                     break;
            case 3 : PanelRute = new TampilanRuteStadionManahan();
                     PanelRute.repaint();
                     jScrollPane3.setViewportView(PanelRute);
                     PanelRute.setAutoscrolls(true);
                     break;
            case 4 : PanelRute = new TampilanRuteSoloGrandmall();
                     PanelRute.repaint();
                     jScrollPane3.setViewportView(PanelRute);
                     PanelRute.setAutoscrolls(true);
                     break;
        }
    }//GEN-LAST:event_Gambar_Rute_PerjalananActionPerformed

    public static double HitungJarak (double[][] rute, int awal, double jarak, int tujuan) {
        double[] jalan = new double [rute.length];
        int[] temp = new int [rute.length];
        double before = 0, total = 0;
        int n = 0, min = 0;
        while (awal != tujuan) {
            for (int i = 0; i < rute.length; i++) {
                if (rute[awal][i] != 0) {
                    jalan[n] = rute[awal][i];
                    temp[n] = i;
                    n++; } } 
            for (int j = 0; j < n; j++) {
                if (n == 1) {
                    jarak = jalan[n-1];
                    awal = temp[n-1]; }
                else {
                    if (jalan[min] > jalan[j]) {
                        if (jalan[j] == before) {
                            before = 0;
                            if (j == 1) 
                                awal = temp[0]; }
                        else {
                            min = j;
                            jarak = jalan[min];
                            awal = temp[min]; } }
                    else if (jalan[min] == jalan[j]) {
                        if (jalan[j] == before) {
                            before = 0;
                            if (jalan[j] == 0.3)
                                min = j+1;
                            else if (jalan[j] == 0.5)
                                min = j+1;
                            else if (jalan[j] == 0.8) {
                                min = j+1;
                                awal = temp[min]; } }
                        else {
                            if (j == 1) {
                                jarak = jalan[j];
                                awal = temp[j]; }
                            jarak = jalan[min]; } }
                    else if (jalan[min] < jalan[j]) {
                        if (jalan[j] == 2) {
                            jarak = jalan[j];
                            awal = temp[j]; }
                        else {
                            jarak = jalan[min];
                            awal = temp[min]; } } } }
            before = jarak;
            total += jarak;
            n = 0; min = 0; }
        return total;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SampelBentukProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gambar_Rute_Perjalanan;
    private javax.swing.JButton Hitung_Jarak_Tempuh;
    private javax.swing.JTextField Jarak_Tempuh;
    private javax.swing.JPanel PanelPeta;
    private javax.swing.JPanel PanelRute;
    private javax.swing.JComboBox Pilih_Tempat_Tuju;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
class TampilanPeta extends JPanel {
    private ImageIcon IkonCitra = new ImageIcon ("src/gambar/Gambar Graf Rute ambulan.gif");
    private Image citra = IkonCitra.getImage();
    
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        if (citra != null) 
            g.drawImage(citra, 0, 0, getWidth(), getHeight(), this);
    }
}
class TampilanRuteATMI extends JPanel {
    private ImageIcon IkonCitra = new ImageIcon ("src/gambar/Rute ke ATMI.gif");
    private Image citra = IkonCitra.getImage();
    
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        if (citra != null) 
            g.drawImage(citra, 0, 0, getWidth(), getHeight(), this);
    }
}
class TampilanRuteGramedia extends JPanel {
    private ImageIcon IkonCitra = new ImageIcon ("src/gambar/Rute ke Gramedia.gif");
    private Image citra = IkonCitra.getImage();
    
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        if (citra != null) 
            g.drawImage(citra, 0, 0, getWidth(), getHeight(), this);
    }
}
class TampilanRuteUniv_SetiaBudi extends JPanel {
    private ImageIcon IkonCitra = new ImageIcon ("src/gambar/Rute ke Univ.Setia Budi.gif");
    private Image citra = IkonCitra.getImage();
    
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        if (citra != null) 
            g.drawImage(citra, 0, 0, getWidth(), getHeight(), this);
    }
}
class TampilanRuteStadionManahan extends JPanel {
    private ImageIcon IkonCitra = new ImageIcon ("src/gambar/Rute ke Stadion Manahan.gif");
    private Image citra = IkonCitra.getImage();
    
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        if (citra != null) 
            g.drawImage(citra, 0, 0, getWidth(), getHeight(), this);
    }
}
class TampilanRuteSoloGrandmall extends JPanel {
    private ImageIcon IkonCitra = new ImageIcon ("src/gambar/Rute ke Solo Grandmall.gif");
    private Image citra = IkonCitra.getImage();
    
    protected void paintComponent (Graphics g) {
        super.paintComponent(g);
        if (citra != null) 
            g.drawImage(citra, 0, 0, getWidth(), getHeight(), this);
    }
}