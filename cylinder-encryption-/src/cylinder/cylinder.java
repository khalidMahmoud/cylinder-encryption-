/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cylinder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class cylinder extends javax.swing.JDialog {

    public cylinder(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Array_1 = generateCharacterArray();
        Array_2 = generateCharacterArray();
        Array_3 = generateCharacterArray();
        Array_4 = generateCharacterArray();
        Array_5 = generateCharacterArray();
        Array_6 = generateCharacterArray();
        Array_7 = generateCharacterArray();
        Array_8 = generateCharacterArray();
        Array_9 = generateCharacterArray();
        Array_10 = generateCharacterArray();
        Array_11 = generateCharacterArray();
        Array_12 = generateCharacterArray();
        Array_13 = generateCharacterArray();
        Array_14 = generateCharacterArray();
        Array_15 = generateCharacterArray();
        Array_16 = generateCharacterArray();
        Array_17 = generateCharacterArray();
        Array_18 = generateCharacterArray();
        Array_19 = generateCharacterArray();
        Array_20 = generateCharacterArray();
        fillTexts();
        zeroFlags();
        choosen1 = txt_1.getText().charAt(0);
        choosen2 = txt_2.getText().charAt(0);
        choosen3 = txt_3.getText().charAt(0);
        choosen4 = txt_4.getText().charAt(0);
        choosen5 = txt_5.getText().charAt(0);
        choosen6 = txt_6.getText().charAt(0);
        choosen7 = txt_7.getText().charAt(0);
        choosen8 = txt_8.getText().charAt(0);
        choosen9 = txt_9.getText().charAt(0);
        choosen10 = txt_10.getText().charAt(0);
        choosen11 = txt_11.getText().charAt(0);
        choosen12 = txt_12.getText().charAt(0);
        choosen13 = txt_13.getText().charAt(0);
        choosen14 = txt_14.getText().charAt(0);
        choosen15 = txt_15.getText().charAt(0);
        choosen16 = txt_16.getText().charAt(0);
        choosen17 = txt_17.getText().charAt(0);
        choosen18 = txt_18.getText().charAt(0);
        choosen19 = txt_19.getText().charAt(0);
        choosen20 = txt_20.getText().charAt(0);
        try {
            FileOutputStream writer = new FileOutputStream("myFile");
            writer.write(new String().getBytes());
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(cylinder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(cylinder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        up_1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        up_2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        up_3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        up_4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        up_5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        up_6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        up_7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        up_8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        up_9 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        up_10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        up_11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        up_12 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        up_13 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        up_14 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        up_16 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        up_17 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        up_18 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        up_19 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        up_20 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        up_15 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txt_4 = new javax.swing.JTextField();
        txt_1 = new javax.swing.JTextField();
        txt_2 = new javax.swing.JTextField();
        txt_5 = new javax.swing.JTextField();
        txt_7 = new javax.swing.JTextField();
        txt_3 = new javax.swing.JTextField();
        txt_8 = new javax.swing.JTextField();
        txt_11 = new javax.swing.JTextField();
        txt_6 = new javax.swing.JTextField();
        txt_9 = new javax.swing.JTextField();
        txt_12 = new javax.swing.JTextField();
        txt_13 = new javax.swing.JTextField();
        txt_10 = new javax.swing.JTextField();
        txt_20 = new javax.swing.JTextField();
        txt_19 = new javax.swing.JTextField();
        txt_18 = new javax.swing.JTextField();
        txt_17 = new javax.swing.JTextField();
        txt_16 = new javax.swing.JTextField();
        txt_15 = new javax.swing.JTextField();
        txt_14 = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        siverText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        edit = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.lightGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choose your text", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.blue)); // NOI18N

        up_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        up_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_2MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        up_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_3MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        up_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_4MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        up_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_5MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        up_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_6MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        up_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_7MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        up_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_8MouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        up_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_9MouseClicked(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        up_10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_10MouseClicked(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        up_11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_11MouseClicked(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        up_12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_12MouseClicked(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });

        up_13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_13MouseClicked(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel26.setText(" ");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });

        up_14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_14MouseClicked(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel28.setText(" ");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        up_16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_16MouseClicked(evt);
            }
        });

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel30.setText(" ");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });

        up_17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_17MouseClicked(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel32.setText(" ");
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });

        up_18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_18MouseClicked(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel34.setText(" ");
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });

        up_19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_19MouseClicked(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel36.setText(" ");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });

        up_20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_20MouseClicked(evt);
            }
        });

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel38.setText(" ");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        up_15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/up.png"))); // NOI18N
        up_15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        up_15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                up_15MouseClicked(evt);
            }
        });

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        jLabel46.setText(" ");
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });

        txt_4.setEditable(false);
        txt_4.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_4.setEnabled(false);
        txt_4.setFocusable(false);

        txt_1.setEditable(false);
        txt_1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_1.setEnabled(false);
        txt_1.setFocusable(false);

        txt_2.setEditable(false);
        txt_2.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_2.setEnabled(false);
        txt_2.setFocusable(false);

        txt_5.setEditable(false);
        txt_5.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_5.setEnabled(false);
        txt_5.setFocusable(false);
        txt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_5ActionPerformed(evt);
            }
        });

        txt_7.setEditable(false);
        txt_7.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_7.setEnabled(false);
        txt_7.setFocusable(false);

        txt_3.setEditable(false);
        txt_3.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_3.setEnabled(false);
        txt_3.setFocusable(false);

        txt_8.setEditable(false);
        txt_8.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_8.setEnabled(false);
        txt_8.setFocusable(false);

        txt_11.setEditable(false);
        txt_11.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_11.setEnabled(false);
        txt_11.setFocusable(false);

        txt_6.setEditable(false);
        txt_6.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_6.setEnabled(false);
        txt_6.setFocusable(false);

        txt_9.setEditable(false);
        txt_9.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_9.setEnabled(false);
        txt_9.setFocusable(false);
        txt_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_9ActionPerformed(evt);
            }
        });

        txt_12.setEditable(false);
        txt_12.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_12.setEnabled(false);
        txt_12.setFocusable(false);

        txt_13.setEditable(false);
        txt_13.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_13.setEnabled(false);
        txt_13.setFocusable(false);

        txt_10.setEditable(false);
        txt_10.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_10.setEnabled(false);
        txt_10.setFocusable(false);

        txt_20.setEditable(false);
        txt_20.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_20.setEnabled(false);
        txt_20.setFocusable(false);

        txt_19.setEditable(false);
        txt_19.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_19.setEnabled(false);
        txt_19.setFocusable(false);

        txt_18.setEditable(false);
        txt_18.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_18.setEnabled(false);
        txt_18.setFocusable(false);

        txt_17.setEditable(false);
        txt_17.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_17.setEnabled(false);
        txt_17.setFocusable(false);

        txt_16.setEditable(false);
        txt_16.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_16.setEnabled(false);
        txt_16.setFocusable(false);
        txt_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_16ActionPerformed(evt);
            }
        });

        txt_15.setEditable(false);
        txt_15.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_15.setEnabled(false);
        txt_15.setFocusable(false);
        txt_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_15ActionPerformed(evt);
            }
        });

        txt_14.setEditable(false);
        txt_14.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        txt_14.setEnabled(false);
        txt_14.setFocusable(false);
        txt_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(up_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txt_1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(up_2))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(up_3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(up_4))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(up_5))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(up_6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(up_7))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(up_8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(up_9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(up_10)
                    .addComponent(txt_10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(up_11))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(up_12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(up_13)
                                .addGap(12, 12, 12)
                                .addComponent(up_14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(up_15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel46))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt_12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txt_14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(up_16)
                                .addGap(12, 12, 12)
                                .addComponent(up_17)
                                .addGap(18, 18, 18)
                                .addComponent(up_18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txt_19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(up_19)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(up_20))))
                .addGap(7, 7, 7))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(up_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(up_2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(up_5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(up_6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(up_7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(up_8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(up_9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(up_10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(up_12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(up_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(up_4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(up_11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(up_15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(up_16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(up_13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(up_18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(up_19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(up_20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(up_17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(up_14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_18, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_15, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jToolBar1.setRollover(true);

        jPanel2.setBackground(java.awt.Color.lightGray);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your siver texts", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), java.awt.Color.blue)); // NOI18N

        edit.setBackground(java.awt.Color.lightGray);
        edit.setColumns(20);
        edit.setRows(5);
        jScrollPane1.setViewportView(edit);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siverText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(siverText)
                .addContainerGap(269, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );

        jButton1.setText("Get Siver");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("New plan text");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(446, 446, 446)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_5ActionPerformed

    private void txt_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_9ActionPerformed

    private void txt_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_16ActionPerformed

    private void txt_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_14ActionPerformed

    private void txt_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_15ActionPerformed

    private void up_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_1MouseClicked
        // TODO add your handling code here:
        flag1 += 1;

        if (flag1 < 26 && flag1 >= 0) {
            txt_1.setText(String.valueOf(Array_1[flag1]));
            choosen1 = Array_1[flag1];
        } else {
            flag1 = 0;
            txt_1.setText(String.valueOf(Array_1[flag1]));
            choosen1 = Array_1[flag1];
        }
    }//GEN-LAST:event_up_1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:

        flag1_down = flag1_down - 1;
        if (flag1_down < 26 && flag1_down >= 0) {
            txt_1.setText(String.valueOf(Array_1[flag1_down]));
            choosen1 = Array_1[flag1_down];
        } else {
            flag1_down = 25;
            txt_1.setText(String.valueOf(Array_1[flag1_down]));
            choosen1 = Array_1[flag1_down];
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void up_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_2MouseClicked
        // TODO add your handling code here:
        flag2 += 1;

        if (flag2 < 26 && flag2 >= 0) {
            txt_2.setText(String.valueOf(Array_2[flag2]));
            choosen2 = Array_2[flag2];
        } else {
            flag2 = 0;
            txt_2.setText(String.valueOf(Array_2[flag2]));
            choosen2 = Array_2[flag2];
        }
    }//GEN-LAST:event_up_2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        flag2_down = flag2_down - 1;
        if (flag2_down < 26 && flag2_down >= 0) {
            txt_2.setText(String.valueOf(Array_2[flag2_down]));
            choosen2 = Array_2[flag2_down];
        } else {
            flag2_down = 25;
            txt_2.setText(String.valueOf(Array_2[flag2_down]));
            choosen2 = Array_2[flag2_down];
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void up_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_3MouseClicked
        // TODO add your handling code here:
        flag3 += 1;

        if (flag3 < 26 && flag3 >= 0) {
            txt_3.setText(String.valueOf(Array_3[flag3]));
            choosen3 = Array_3[flag3];
        } else {
            flag3 = 0;
            txt_3.setText(String.valueOf(Array_3[flag3]));
            choosen3 = Array_3[flag3];
        }
    }//GEN-LAST:event_up_3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        flag3_down = flag3_down - 1;
        if (flag3_down < 26 && flag3_down >= 0) {
            txt_3.setText(String.valueOf(Array_3[flag3_down]));
            choosen3 = Array_3[flag3_down];
        } else {
            flag3_down = 25;
            txt_3.setText(String.valueOf(Array_3[flag3_down]));
            choosen3 = Array_3[flag3_down];
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void up_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_4MouseClicked
        // TODO add your handling code here:
        flag4 += 1;

        if (flag4 < 26 && flag4 >= 0) {
            txt_4.setText(String.valueOf(Array_4[flag4]));
            choosen4 = Array_4[flag4];
        } else {
            flag4 = 0;
            txt_4.setText(String.valueOf(Array_4[flag4]));
            choosen4 = Array_4[flag4];
        }
    }//GEN-LAST:event_up_4MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        flag4_down = flag4_down - 1;
        if (flag4_down < 26 && flag4_down >= 0) {
            txt_4.setText(String.valueOf(Array_4[flag4_down]));
            choosen4 = Array_4[flag4_down];
        } else {
            flag4_down = 25;
            txt_4.setText(String.valueOf(Array_4[flag4_down]));
            choosen4 = Array_4[flag4_down];
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        flag5_down = flag5_down - 1;
        if (flag5_down < 26 && flag5_down >= 0) {
            txt_5.setText(String.valueOf(Array_5[flag5_down]));
            choosen5 = Array_5[flag5_down];
        } else {
            flag5_down = 25;
            txt_5.setText(String.valueOf(Array_5[flag5_down]));
            choosen5 = Array_5[flag5_down];
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void up_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_5MouseClicked
        // TODO add your handling code here:
        flag5 += 1;

        if (flag5 < 26 && flag5 >= 0) {
            txt_5.setText(String.valueOf(Array_5[flag5]));
            choosen5 = Array_5[flag5];
        } else {
            flag5 = 0;
            txt_5.setText(String.valueOf(Array_5[flag5]));
            choosen5 = Array_5[flag5];
        }
    }//GEN-LAST:event_up_5MouseClicked

    private void up_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_6MouseClicked
        // TODO add your handling code here:
        flag6 += 1;

        if (flag6 < 26 && flag6 >= 0) {
            txt_6.setText(String.valueOf(Array_6[flag6]));
            choosen6 = Array_6[flag6];
        } else {
            flag6 = 0;
            txt_6.setText(String.valueOf(Array_6[flag6]));
            choosen6 = Array_6[flag6];
        }
    }//GEN-LAST:event_up_6MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        flag6_down = flag6_down - 1;
        if (flag6_down < 26 && flag6_down >= 0) {
            txt_6.setText(String.valueOf(Array_6[flag6_down]));
            choosen6 = Array_6[flag6_down];
        } else {
            flag6_down = 25;
            txt_6.setText(String.valueOf(Array_6[flag6_down]));
            choosen6 = Array_6[flag6_down];
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void up_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_7MouseClicked
        // TODO add your handling code here:
        flag7 += 1;

        if (flag7 < 26 && flag7 >= 0) {
            txt_7.setText(String.valueOf(Array_7[flag7]));
            choosen7 = Array_7[flag7];
        } else {
            flag7 = 0;
            txt_7.setText(String.valueOf(Array_7[flag7]));
            choosen7 = Array_7[flag7];
        }
    }//GEN-LAST:event_up_7MouseClicked

    private void up_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_8MouseClicked
        // TODO add your handling code here:
        flag8 += 1;

        if (flag8 < 26 && flag8 >= 0) {
            txt_8.setText(String.valueOf(Array_8[flag8]));
            choosen8 = Array_8[flag8];
        } else {
            flag8 = 0;
            txt_8.setText(String.valueOf(Array_8[flag8]));
            choosen8 = Array_8[flag8];
        }
    }//GEN-LAST:event_up_8MouseClicked

    private void up_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_9MouseClicked
        // TODO add your handling code here:
        flag9 += 1;

        if (flag9 < 26 && flag9 >= 0) {
            txt_9.setText(String.valueOf(Array_9[flag9]));
            choosen9 = Array_9[flag9];
        } else {
            flag9 = 0;
            txt_9.setText(String.valueOf(Array_9[flag9]));
            choosen9 = Array_9[flag9];
        }
    }//GEN-LAST:event_up_9MouseClicked

    private void up_10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_10MouseClicked
        // TODO add your handling code here:
        flag10 += 1;

        if (flag10 < 26 && flag10 >= 0) {
            txt_10.setText(String.valueOf(Array_10[flag10]));
            choosen10 = Array_10[flag10];
        } else {
            flag10 = 0;
            txt_10.setText(String.valueOf(Array_10[flag10]));
            choosen10 = Array_10[flag10];
        }
    }//GEN-LAST:event_up_10MouseClicked

    private void up_11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_11MouseClicked
        // TODO add your handling code here:
        flag11 += 1;

        if (flag11 < 26 && flag11 >= 0) {
            txt_11.setText(String.valueOf(Array_11[flag11]));
            choosen11 = Array_11[flag11];
        } else {
            flag11 = 0;
            txt_11.setText(String.valueOf(Array_11[flag11]));
            choosen11 = Array_11[flag11];
        }
    }//GEN-LAST:event_up_11MouseClicked

    private void up_12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_12MouseClicked
        // TODO add your handling code here:
        flag12 += 1;

        if (flag12 < 26 && flag12 >= 0) {
            txt_12.setText(String.valueOf(Array_12[flag12]));
            choosen12 = Array_12[flag12];
        } else {
            flag12 = 0;
            txt_12.setText(String.valueOf(Array_12[flag12]));
            choosen12 = Array_12[flag12];
        }
    }//GEN-LAST:event_up_12MouseClicked

    private void up_13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_13MouseClicked
        // TODO add your handling code here:
        flag13 += 1;

        if (flag13 < 26 && flag13 >= 0) {
            txt_13.setText(String.valueOf(Array_13[flag13]));
            choosen13 = Array_13[flag13];
        } else {
            flag13 = 0;
            txt_13.setText(String.valueOf(Array_13[flag13]));
            choosen13 = Array_13[flag13];
        }
    }//GEN-LAST:event_up_13MouseClicked

    private void up_14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_14MouseClicked
        // TODO add your handling code here:
        flag14 += 1;

        if (flag14 < 26 && flag14 >= 0) {
            txt_14.setText(String.valueOf(Array_14[flag14]));
            choosen14 = Array_14[flag14];
        } else {
            flag14 = 0;
            txt_14.setText(String.valueOf(Array_14[flag14]));
            choosen14 = Array_14[flag14];
        }
    }//GEN-LAST:event_up_14MouseClicked

    private void up_15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_15MouseClicked
        // TODO add your handling code here:
        flag15 += 1;

        if (flag15 < 26 && flag15 >= 0) {
            txt_15.setText(String.valueOf(Array_15[flag15]));
            choosen15 = Array_15[flag15];
        } else {
            flag15 = 0;
            txt_15.setText(String.valueOf(Array_15[flag15]));
            choosen15 = Array_15[flag15];
        }
    }//GEN-LAST:event_up_15MouseClicked

    private void up_16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_16MouseClicked
        // TODO add your handling code here:
        flag16 += 1;

        if (flag16 < 26 && flag16 >= 0) {
            txt_16.setText(String.valueOf(Array_16[flag16]));
            choosen16 = Array_16[flag16];
        } else {
            flag16 = 0;
            txt_16.setText(String.valueOf(Array_16[flag16]));
            choosen16 = Array_16[flag16];
        }
    }//GEN-LAST:event_up_16MouseClicked

    private void up_17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_17MouseClicked
        // TODO add your handling code here:
        flag17 += 1;

        if (flag17 < 26 && flag17 >= 0) {
            txt_17.setText(String.valueOf(Array_17[flag17]));
            choosen17 = Array_17[flag17];
        } else {
            flag17 = 0;
            txt_17.setText(String.valueOf(Array_17[flag17]));
            choosen17 = Array_17[flag17];
        }
    }//GEN-LAST:event_up_17MouseClicked

    private void up_18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_18MouseClicked
        // TODO add your handling code here:
        flag18 += 1;

        if (flag18 < 26 && flag18 >= 0) {
            txt_18.setText(String.valueOf(Array_18[flag18]));
            choosen18 = Array_18[flag18];
        } else {
            flag18 = 0;
            txt_18.setText(String.valueOf(Array_18[flag18]));
            choosen18 = Array_18[flag18];
        }
    }//GEN-LAST:event_up_18MouseClicked

    private void up_19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_19MouseClicked
        // TODO add your handling code here:
        flag19 += 1;

        if (flag19 < 26 && flag19 >= 0) {
            txt_19.setText(String.valueOf(Array_19[flag19]));
            choosen19 = Array_19[flag19];
        } else {
            flag19 = 0;
            txt_19.setText(String.valueOf(Array_19[flag19]));
            choosen19 = Array_19[flag19];
        }
    }//GEN-LAST:event_up_19MouseClicked

    private void up_20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_up_20MouseClicked
        // TODO add your handling code here:
        flag20 += 1;

        if (flag20 < 26 && flag20 >= 0) {
            txt_20.setText(String.valueOf(Array_20[flag20]));
            choosen20 = Array_20[flag20];
        } else {
            flag20 = 0;
            txt_20.setText(String.valueOf(Array_20[flag20]));
            choosen20 = Array_20[flag20];
        }
    }//GEN-LAST:event_up_20MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        flag7_down = flag7_down - 1;
        if (flag7_down < 26 && flag7_down >= 0) {
            txt_7.setText(String.valueOf(Array_7[flag7_down]));
            choosen7 = Array_7[flag7_down];
        } else {
            flag7_down = 25;
            txt_7.setText(String.valueOf(Array_7[flag7_down]));
            choosen7 = Array_7[flag7_down];
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        flag8_down = flag8_down - 1;
        if (flag8_down < 26 && flag8_down >= 0) {
            txt_8.setText(String.valueOf(Array_8[flag8_down]));
            choosen8 = Array_8[flag8_down];
        } else {
            flag8_down = 25;
            txt_8.setText(String.valueOf(Array_8[flag8_down]));
            choosen8 = Array_8[flag8_down];
        }
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        flag9_down = flag9_down - 1;
        if (flag9_down < 26 && flag9_down >= 0) {
            txt_9.setText(String.valueOf(Array_9[flag9_down]));
            choosen9 = Array_9[flag9_down];
        } else {
            flag9_down = 25;
            txt_9.setText(String.valueOf(Array_9[flag9_down]));
            choosen9 = Array_9[flag9_down];
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        flag10_down = flag10_down - 1;
        if (flag10_down < 26 && flag10_down >= 0) {
            txt_10.setText(String.valueOf(Array_10[flag10_down]));
            choosen10 = Array_10[flag10_down];
        } else {
            flag10_down = 25;
            txt_10.setText(String.valueOf(Array_10[flag10_down]));
            choosen10 = Array_10[flag10_down];
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        flag11_down = flag11_down - 1;
        if (flag11_down < 26 && flag11_down >= 0) {
            txt_11.setText(String.valueOf(Array_11[flag11_down]));
            choosen11 = Array_11[flag11_down];
        } else {
            flag11_down = 25;
            txt_11.setText(String.valueOf(Array_11[flag11_down]));
            choosen11 = Array_11[flag11_down];
        }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        flag12_down = flag12_down - 1;
        if (flag12_down < 26 && flag12_down >= 0) {
            txt_12.setText(String.valueOf(Array_12[flag12_down]));
            choosen12 = Array_12[flag12_down];
        } else {
            flag12_down = 25;
            txt_12.setText(String.valueOf(Array_12[flag12_down]));
            choosen12 = Array_12[flag12_down];
        }
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        flag13_down = flag13_down - 1;
        if (flag13_down < 26 && flag13_down >= 0) {
            txt_13.setText(String.valueOf(Array_13[flag13_down]));
            choosen13 = Array_13[flag13_down];
        } else {
            flag13_down = 25;
            txt_13.setText(String.valueOf(Array_13[flag13_down]));
            choosen13 = Array_13[flag13_down];
        }
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        flag14_down_down = flag14_down_down - 1;
        if (flag14_down_down < 26 && flag14_down_down >= 0) {
            txt_14.setText(String.valueOf(Array_14[flag14_down_down]));
            choosen14 = Array_14[flag14_down_down];
        } else {
            flag14_down_down = 25;
            txt_14.setText(String.valueOf(Array_14[flag14_down_down]));
            choosen14 = Array_14[flag14_down_down];
        }
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel46MouseClicked
        // TODO add your handling code here:
        flag15_down = flag15_down - 1;
        if (flag15_down < 26 && flag15_down >= 0) {
            txt_15.setText(String.valueOf(Array_15[flag15_down]));
            choosen15 = Array_15[flag15_down];
        } else {
            flag15_down = 25;
            txt_15.setText(String.valueOf(Array_15[flag15_down]));
            choosen15 = Array_15[flag15_down];
        }
    }//GEN-LAST:event_jLabel46MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
        flag16_down = flag16_down - 1;
        if (flag16_down < 26 && flag16_down >= 0) {
            txt_16.setText(String.valueOf(Array_16[flag16_down]));
            choosen16 = Array_16[flag16_down];
        } else {
            flag16_down = 25;
            txt_16.setText(String.valueOf(Array_16[flag16_down]));
            choosen16 = Array_16[flag16_down];
        }
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        // TODO add your handling code here:
        flag17_down = flag17_down - 1;
        if (flag17_down < 26 && flag17_down >= 0) {
            txt_17.setText(String.valueOf(Array_17[flag17_down]));
            choosen17 = Array_17[flag17_down];
        } else {
            flag17_down = 25;
            txt_17.setText(String.valueOf(Array_17[flag17_down]));
            choosen17 = Array_17[flag17_down];
        }
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        // TODO add your handling code here:
        flag18_down = flag18_down - 1;
        if (flag18_down < 26 && flag18_down >= 0) {
            txt_18.setText(String.valueOf(Array_18[flag18_down]));
            choosen18 = Array_18[flag18_down];
        } else {
            flag18_down = 25;
            txt_18.setText(String.valueOf(Array_18[flag18_down]));
            choosen18 = Array_18[flag18_down];
        }
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
        flag19_down = flag19_down - 1;
        if (flag19_down < 26 && flag19_down >= 0) {
            txt_19.setText(String.valueOf(Array_19[flag19_down]));
            choosen19 = Array_19[flag19_down];
        } else {
            flag19_down = 25;
            txt_19.setText(String.valueOf(Array_19[flag19_down]));
            choosen19 = Array_19[flag19_down];
        }
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
        flag20_down = flag20_down - 1;
        if (flag20_down < 26 && flag20_down >= 0) {
            txt_20.setText(String.valueOf(Array_20[flag20_down]));
            choosen20 = Array_20[flag20_down];
        } else {
            flag20_down = 25;
            txt_20.setText(String.valueOf(Array_20[flag20_down]));
            choosen20 = Array_20[flag20_down];
        }
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FileReader reader = null;
        try {
            // TODO add your handling code here:
            for (int i = 0; i <= 25; i++) {
                if (Array_1[i] == choosen1 || Array_2[i] == choosen2 || Array_3[i] == choosen3 || Array_4[i] == choosen4 || Array_5[i] == choosen5 || Array_6[i] == choosen6
                        || Array_7[i] == choosen7 || Array_8[i] == choosen8 || Array_9[i] == choosen9 || Array_10[i] == choosen10 || Array_11[i] == choosen11
                        || Array_12[i] == choosen12 || Array_13[i] == choosen13 || Array_14[i] == choosen14 || Array_15[i] == choosen15 || Array_16[i] == choosen16
                        || Array_17[i] == choosen17 || Array_18[i] == choosen18 || Array_19[i] == choosen19 || Array_20[i] == choosen20) {
                    continue;
                } else {
                    siverArray[0] = String.valueOf(Array_1[i]);
                    siverArray[1] = String.valueOf(Array_2[i]);
                    siverArray[2] = String.valueOf(Array_3[i]);
                    siverArray[3] = String.valueOf(Array_4[i]);
                    siverArray[4] = String.valueOf(Array_5[i]);
                    siverArray[5] = String.valueOf(Array_6[i]);
                    siverArray[6] = String.valueOf(Array_7[i]);
                    siverArray[7] = String.valueOf(Array_8[i]);
                    siverArray[8] = String.valueOf(Array_9[i]);
                    siverArray[9] = String.valueOf(Array_10[i]);
                    siverArray[10] = String.valueOf(Array_11[i]);
                    siverArray[11] = String.valueOf(Array_12[i]);
                    siverArray[12] = String.valueOf(Array_13[i]);
                    siverArray[13] = String.valueOf(Array_14[i]);
                    siverArray[14] = String.valueOf(Array_15[i]);
                    siverArray[15] = String.valueOf(Array_16[i]);
                    siverArray[16] = String.valueOf(Array_17[i]);
                    siverArray[17] = String.valueOf(Array_18[i]);
                    siverArray[18] = String.valueOf(Array_19[i]);
                    siverArray[19] = String.valueOf(Array_20[i]);

                    for (int x = 0; x < siverArray.length; x++) {
                        try {
                            Files.write(Paths.get("myFile"), siverArray[x].getBytes(), StandardOpenOption.APPEND);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
//                    System.out.print(siverArray[x]);
                    }
                    try {
                        Files.write(Paths.get("myFile"), "\n".getBytes(), StandardOpenOption.APPEND);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
            FileReader reade;
            reade = new FileReader("myFile");
            BufferedReader br = new BufferedReader(reade);
            try {
                edit.read(br, null);
            } catch (IOException ex) {
                Logger.getLogger(cylinder.class.getName()).log(Level.SEVERE, null, ex);
            }
            br.close();
            edit.requestFocus();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(cylinder.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(cylinder.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                FileOutputStream writer = new FileOutputStream("myFile");
                writer.write(new String().getBytes());
                writer.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(cylinder.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(cylinder.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jButton1.setEnabled(false);
        edit.setEditable(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        edit.setText("");
        jButton1.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public char[] generateCharacterArray() {
        Random r = new Random();
        char[] letters = new char[26];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 26; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);

        for (int i = 0; i < 26; i++) {
            int randomNumber = list.get(i);
            letters[i] = alphabet.charAt(randomNumber);
        }
        return letters;
    }

    public void fillTexts() {
        txt_1.setText(String.valueOf(Array_1[0]));
        txt_2.setText(String.valueOf(Array_2[0]));
        txt_3.setText(String.valueOf(Array_3[0]));
        txt_4.setText(String.valueOf(Array_4[0]));
        txt_5.setText(String.valueOf(Array_5[0]));
        txt_6.setText(String.valueOf(Array_6[0]));
        txt_7.setText(String.valueOf(Array_7[0]));
        txt_8.setText(String.valueOf(Array_8[0]));
        txt_9.setText(String.valueOf(Array_9[0]));
        txt_10.setText(String.valueOf(Array_10[0]));
        txt_11.setText(String.valueOf(Array_11[0]));
        txt_12.setText(String.valueOf(Array_12[0]));
        txt_13.setText(String.valueOf(Array_13[0]));
        txt_14.setText(String.valueOf(Array_14[0]));
        txt_15.setText(String.valueOf(Array_15[0]));
        txt_16.setText(String.valueOf(Array_16[0]));
        txt_17.setText(String.valueOf(Array_17[0]));
        txt_18.setText(String.valueOf(Array_18[0]));
        txt_19.setText(String.valueOf(Array_19[0]));
        txt_20.setText(String.valueOf(Array_20[0]));
    }

    public void zeroFlags() {
        flag1 = 0;
        flag2 = 0;
        flag3 = 0;
        flag4 = 0;
        flag5 = 0;
        flag6 = 0;
        flag7 = 0;
        flag8 = 0;
        flag9 = 0;
        flag10 = 0;
        flag11 = 0;
        flag12 = 0;
        flag13 = 0;
        flag14 = 0;
        flag15 = 0;
        flag16 = 0;
        flag17 = 0;
        flag18 = 0;
        flag19 = 0;
        flag20 = 0;

    }

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
            java.util.logging.Logger.getLogger(cylinder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cylinder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cylinder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cylinder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                cylinder dialog = new cylinder(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel siverText;
    private javax.swing.JTextField txt_1;
    private javax.swing.JTextField txt_10;
    private javax.swing.JTextField txt_11;
    private javax.swing.JTextField txt_12;
    private javax.swing.JTextField txt_13;
    private javax.swing.JTextField txt_14;
    private javax.swing.JTextField txt_15;
    private javax.swing.JTextField txt_16;
    private javax.swing.JTextField txt_17;
    private javax.swing.JTextField txt_18;
    private javax.swing.JTextField txt_19;
    private javax.swing.JTextField txt_2;
    private javax.swing.JTextField txt_20;
    private javax.swing.JTextField txt_3;
    private javax.swing.JTextField txt_4;
    private javax.swing.JTextField txt_5;
    private javax.swing.JTextField txt_6;
    private javax.swing.JTextField txt_7;
    private javax.swing.JTextField txt_8;
    private javax.swing.JTextField txt_9;
    private javax.swing.JLabel up_1;
    private javax.swing.JLabel up_10;
    private javax.swing.JLabel up_11;
    private javax.swing.JLabel up_12;
    private javax.swing.JLabel up_13;
    private javax.swing.JLabel up_14;
    private javax.swing.JLabel up_15;
    private javax.swing.JLabel up_16;
    private javax.swing.JLabel up_17;
    private javax.swing.JLabel up_18;
    private javax.swing.JLabel up_19;
    private javax.swing.JLabel up_2;
    private javax.swing.JLabel up_20;
    private javax.swing.JLabel up_3;
    private javax.swing.JLabel up_4;
    private javax.swing.JLabel up_5;
    private javax.swing.JLabel up_6;
    private javax.swing.JLabel up_7;
    private javax.swing.JLabel up_8;
    private javax.swing.JLabel up_9;
    // End of variables declaration//GEN-END:variables

    char[] Array_1, Array_2, Array_3, Array_4, Array_5, Array_6, Array_7, Array_8, Array_9, Array_10, Array_11, Array_12, Array_13, Array_14, Array_15, Array_16, Array_17, Array_18, Array_19, Array_20;
    String[] siverArray = new String[20];
    int flag1, flag2, flag3, flag4, flag5, flag6, flag7, flag8, flag9, flag10, flag11, flag12, flag13, flag14, flag15, flag16, flag17, flag18, flag19, flag20 = 0;
    int flag1_down, flag2_down, flag3_down, flag4_down, flag5_down, flag6_down, flag7_down, flag8_down, flag9_down, flag10_down, flag11_down, flag12_down, flag13_down, flag14_down_down, flag15_down, flag16_down, flag17_down, flag18_down, flag19_down, flag20_down = 25;
    char choosen1, choosen2, choosen3, choosen4, choosen5, choosen6, choosen7, choosen8, choosen9, choosen10, choosen11, choosen12, choosen13, choosen14, choosen15, choosen16, choosen17, choosen18, choosen19, choosen20 = ' ';
    String val1 = "";
    String val2 = "";
    String val3 = "";
    String val4 = "";
    String val5 = "";
    String val6 = "";
    String val7 = "";
    String val8 = "";
    String val9 = "";
    String val10 = "";
    String val11 = "";
    String val12 = "";
    String val13 = "";
    String val14 = "";
    String val15 = "";
    String val16 = "";
    String val17 = "";
    String val18 = "";
    String val19 = "";
    String val20 = "";
    String val21 = "";
    String val22 = "";
    String val23 = "";
    String val24 = "";
    String val25 = "";
    ArrayList<String[]> siversList = new ArrayList<String[]>();
    String finalT;
}
