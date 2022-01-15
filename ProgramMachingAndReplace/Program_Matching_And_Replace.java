package Praktikum9;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
import java.lang.String;
public class Program_Matching_And_Replace extends javax.swing.JFrame {
    int pilih;
    private String currentFile = "Untitled";
    private boolean changed = false;
    
    public Program_Matching_And_Replace() {
        initComponents();
    }
    private void saveFileAs() {
        if (jFileChooser1.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
            saveFile(jFileChooser1.getSelectedFile().getAbsolutePath());
    }
    private void saveOld() {
        if (changed) {
            if (JOptionPane.showConfirmDialog(this, 
                    "Anda ingin menyimpan "+currentFile+"?",
                    "Save", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
                saveFile(currentFile); }
    }
    private void readInFile (String fileName) {
        try {
            FileReader r = new FileReader(fileName);
            jTextArea1.read(r, null);
            r.close();
            currentFile = fileName;
            setTitle(currentFile);
            changed = false; }
        catch (IOException e) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(this, "File berikut tidak dapat"+
                    " ditemukan : "+fileName); }
    }
    private void saveFile (String fileName) {
        try {
            FileWriter w = new FileWriter(fileName);
            jTextArea1.write(w);
            w.close();
            currentFile = fileName;
            setTitle(currentFile);
            changed = false; }
        catch (IOException e) {  }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        IsiText = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Bruce_Force = new javax.swing.JRadioButton();
        Boyer_Moore = new javax.swing.JRadioButton();
        KMP = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        KataKunci = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        WaktuEksekusi = new javax.swing.JTextField();
        Proses_Matching = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Banyak_Kata_Kunci = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Kata_Ganti = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Kata_Asal = new javax.swing.JTextField();
        Replace = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Editor");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        IsiText.setViewportView(jTextArea1);

        jLabel1.setText("Pilih Algoritma Matching  :          ");

        Bruce_Force.setText("Bruce Force");
        Bruce_Force.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bruce_ForceActionPerformed(evt);
            }
        });

        Boyer_Moore.setText("Boyer Moore");
        Boyer_Moore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boyer_MooreActionPerformed(evt);
            }
        });

        KMP.setText("Knuth-Morris-Pratt");
        KMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KMPActionPerformed(evt);
            }
        });

        jLabel2.setText("Kata Kunci :");

        jLabel3.setText("Waktu Eksekusi :");

        Proses_Matching.setText("Proses");
        Proses_Matching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proses_MatchingActionPerformed(evt);
            }
        });

        jLabel4.setText("Banyak Kata Kunci :");

        jLabel5.setText("Replace :");

        jLabel7.setText("Kata Ganti :");

        jLabel6.setText("Kata Kunci :");

        Replace.setText("Replace");
        Replace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReplaceActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Save As..");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Save");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        MenuBar.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem5.setText("Cut");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Copy");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Paste");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        MenuBar.add(jMenu2);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IsiText)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WaktuEksekusi, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Bruce_Force, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(KMP)
                                        .addGap(55, 55, 55))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(KataKunci, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Proses_Matching)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boyer_Moore)
                            .addComponent(Banyak_Kata_Kunci, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Kata_Ganti, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Kata_Asal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Replace)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(IsiText, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bruce_Force)
                    .addComponent(Boyer_Moore)
                    .addComponent(KMP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(KataKunci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Banyak_Kata_Kunci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(WaktuEksekusi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Proses_Matching))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Kata_Asal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Kata_Ganti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Replace)
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        if (!currentFile.equals("Untitled"))
            saveFile(currentFile);
        else
            saveFileAs();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void Bruce_ForceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bruce_ForceActionPerformed
        pilih = 1;
    }//GEN-LAST:event_Bruce_ForceActionPerformed

    private void KMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KMPActionPerformed
        pilih = 2;
    }//GEN-LAST:event_KMPActionPerformed

    private void Boyer_MooreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boyer_MooreActionPerformed
        pilih = 3;
    }//GEN-LAST:event_Boyer_MooreActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if (jFileChooser1.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            readInFile(jFileChooser1.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        saveFileAs();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        saveOld();
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ActionMap m = jTextArea1.getActionMap();
        Action Cut = m.get(DefaultEditorKit.cutAction);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ActionMap m = jTextArea1.getActionMap();
        Action Copy = m.get(DefaultEditorKit.copyAction); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ActionMap m = jTextArea1.getActionMap();
        Action Paste = m.get(DefaultEditorKit.pasteAction); 
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void Proses_MatchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proses_MatchingActionPerformed
        String pattern, text;
        int kata_kunci;
        double mulai, akhir, lama;
        pattern = KataKunci.getText();
        text = jTextArea1.getText().toLowerCase();
        switch (pilih) {
            case 1 : mulai = System.nanoTime();
                     kata_kunci = AlgoritmaBruceForce (text, pattern);
                     akhir = System.nanoTime();
                     lama = (akhir - mulai)/1E+9;
                     WaktuEksekusi.setText(String.valueOf(lama));
                     Banyak_Kata_Kunci.setText(String.valueOf(kata_kunci));
                     break;
            case 2 : mulai = System.nanoTime();
                     kata_kunci = AlgoritmaKMP (text, pattern);
                     akhir = System.nanoTime();
                     lama = (akhir - mulai)/1E+9;
                     WaktuEksekusi.setText(String.valueOf(lama));
                     Banyak_Kata_Kunci.setText(String.valueOf(kata_kunci));
                     break;
            case 3 : mulai = System.nanoTime();
                     kata_kunci = AlgoritmaBoyerMoore (text, pattern);
                     akhir = System.nanoTime();
                     lama = (akhir - mulai)/1E+9;
                     WaktuEksekusi.setText(String.valueOf(lama));
                     Banyak_Kata_Kunci.setText(String.valueOf(kata_kunci));
                     break;
        }
    }//GEN-LAST:event_Proses_MatchingActionPerformed

    private void ReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReplaceActionPerformed
        String pattern, text, replace;
        String output = "";
        int kata_kunci;
        double mulai, akhir, lama;
        pattern = Kata_Asal.getText();
        replace = Kata_Ganti.getText();
        text = jTextArea1.getText().toLowerCase();
        char[] kalimat = ReplaceBruceForce(text, pattern, replace);
        output =  (String.valueOf(kalimat));
        jTextArea1.setText(output);
    }//GEN-LAST:event_ReplaceActionPerformed

    private static int AlgoritmaBruceForce (String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int j, i, k = 0;
        for (i = 0; i <=(n-m); i++) {
            j = 0;
            while ((j < m) && (text.charAt(i+j) == pattern.charAt(j)))
                j++;
            if (j == m)
                k++; }
        return k;
    }
    
    private static char[] ReplaceBruceForce (String text, String pattern, String replace) {
        int x = text.length();
        int y = pattern.length();
        int z = replace.length();
        char[] teks = new char [x];
        for (int i = 0; i < x; i++) 
            teks[i] = text.charAt(i);
        int j, i, k = 0;
        for (i = 0; i <=(x-y); i++) {
            j = 0;
            while ((j < y) && (text.charAt(i+j) == pattern.charAt(j)))
                j++;
            if (j == y) {
                for (int a = 0; a < z; a++)
                    teks[i+a] = replace.charAt(a); } }
        return teks;
    }
    
    public static int AlgoritmaKMP (String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int fail[] = computeFail(pattern);
        int i = 0, j = 0, k = 0;
        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                if (j == m-1) {
                    k++;
                    j = -1; }
                i++;
                j++; }
            else if (j > 0)
                j = fail[j-1];
            else
                i++; }
        return k;
    }
    public static int[] computeFail (String pattern) {
        int fail[] = new int [pattern.length()];
        fail[0] = 0;
        int m = pattern.length();
        int j = 0, i = 1;
        while (i < m) {
            if (pattern.charAt(j) == pattern.charAt(i)) {
                fail[i] = j + 1;
                i++;
                j++; }
            else if (j > 0)
                j = fail[j-1];
            else {
                fail[i] = 0;
                i++; } }
        return fail;
    }
    
    public static int AlgoritmaBoyerMoore (String text, String pattern) {
        int last[] = buildLast(pattern);
        int n = text.length();
        int m = pattern.length();
        int i = m - 1;
        if (i > n-1)
            return -1;
        int j = m - 1;
        int k = 0;
        do {
            if (pattern.charAt(j) == text.charAt(i)) {
                if (j == 0) {
                    k++;
                    j = m - 1;
                    i+=m; }
                else {
                    i--;
                    j--; } }
            else {
                int lo = last[text.charAt(i)];
                i = i + m - Math.min(j, 1+lo);
                j = m - 1; }
        }
        while (i <= n-1);
        return k;
    }
    public static int[] buildLast (String pattern) {
        int last[] = new int[128];
        for (int i = 0; i < 128; i++)
            last[i] = -1;
        for (int i = 0; i < pattern.length(); i++)
            last[pattern.charAt(i)] = i;
        return last;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Program_Matching_And_Replace().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Banyak_Kata_Kunci;
    private javax.swing.JRadioButton Boyer_Moore;
    private javax.swing.JRadioButton Bruce_Force;
    private javax.swing.JScrollPane IsiText;
    private javax.swing.JRadioButton KMP;
    private javax.swing.JTextField KataKunci;
    private javax.swing.JTextField Kata_Asal;
    private javax.swing.JTextField Kata_Ganti;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton Proses_Matching;
    private javax.swing.JButton Replace;
    private javax.swing.JTextField WaktuEksekusi;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
