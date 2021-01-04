/*

                    ******************************
                    *  Name: Database Managment  *
                    *  Author: Arafat Hossain Ar *
                    *  Date: 3 January 2021      *
                    ******************************


 */
package databasemanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Arafat Hossain Ar
 * All Right Reserved By Arafat Hossain Ar
 */
public final class MainFrame extends javax.swing.JFrame {

    @SuppressWarnings("empty-statement")
    public MainFrame() throws SQLException {

        initComponents();

        jtableCustom();
        connect();
        updateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        avarage = new javax.swing.JTextField();
        english = new javax.swing.JTextField();
        math = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roll = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bangla = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Class = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        tableScroll = new javax.swing.JScrollPane();
        infoTable = new javax.swing.JTable();
        result = new javax.swing.JButton();
        transcript = new javax.swing.JButton();
        print = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        printArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database Management");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Bright", 1, 18), new java.awt.Color(204, 255, 255))); // NOI18N

        avarage.setEditable(false);
        avarage.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        avarage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                avarageKeyTyped(evt);
            }
        });

        english.setBackground(new java.awt.Color(255, 255, 255));
        english.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        english.setForeground(new java.awt.Color(0, 0, 0));
        english.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        english.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                englishKeyTyped(evt);
            }
        });

        math.setBackground(new java.awt.Color(255, 255, 255));
        math.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        math.setForeground(new java.awt.Color(0, 0, 0));
        math.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        math.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mathKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Math:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("English:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Roll:");

        roll.setBackground(new java.awt.Color(255, 255, 255));
        roll.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        roll.setForeground(new java.awt.Color(0, 0, 0));
        roll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        roll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rollKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Avarage:");

        status.setEditable(false);
        status.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bangla:");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name:");

        bangla.setBackground(new java.awt.Color(255, 255, 255));
        bangla.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bangla.setForeground(new java.awt.Color(0, 0, 0));
        bangla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bangla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                banglaKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status:");

        total.setEditable(false);
        total.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Class:");

        Class.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Class.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "One", "Two", "Three" }));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 255));
        jLabel10.setText("Search:");

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        search.setForeground(java.awt.Color.red);
        search.setText("Enter Roll");
        search.setToolTipText("Enter Roll");
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(math, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(english, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bangla, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(36, 36, 36)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(status)
                    .addComponent(avarage)
                    .addComponent(Class, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bangla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(english, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(math, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Class, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(avarage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        infoTable.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        infoTable.setForeground(new java.awt.Color(0, 0, 0));
        infoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Roll", "Class", "Bangla", "English", "Math", "Status", "Avarage", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        infoTable.setSelectionBackground(new java.awt.Color(51, 51, 51));
        infoTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        infoTable.getTableHeader().setResizingAllowed(false);
        infoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoTableMouseClicked(evt);
            }
        });
        tableScroll.setViewportView(infoTable);
        if (infoTable.getColumnModel().getColumnCount() > 0) {
            infoTable.getColumnModel().getColumn(0).setResizable(false);
            infoTable.getColumnModel().getColumn(0).setPreferredWidth(130);
            infoTable.getColumnModel().getColumn(1).setResizable(false);
            infoTable.getColumnModel().getColumn(2).setResizable(false);
            infoTable.getColumnModel().getColumn(3).setResizable(false);
            infoTable.getColumnModel().getColumn(4).setResizable(false);
            infoTable.getColumnModel().getColumn(5).setResizable(false);
            infoTable.getColumnModel().getColumn(6).setResizable(false);
            infoTable.getColumnModel().getColumn(7).setResizable(false);
        }

        result.setBackground(new java.awt.Color(255, 255, 255));
        result.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        result.setForeground(new java.awt.Color(0, 0, 0));
        result.setText("Result");
        result.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        result.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        transcript.setBackground(new java.awt.Color(255, 255, 255));
        transcript.setFont(new java.awt.Font("Cooper Black", 1, 20)); // NOI18N
        transcript.setForeground(new java.awt.Color(0, 0, 0));
        transcript.setText("Marksheet");
        transcript.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        transcript.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transcript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transcriptActionPerformed(evt);
            }
        });

        print.setBackground(new java.awt.Color(255, 255, 255));
        print.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        print.setForeground(new java.awt.Color(0, 0, 0));
        print.setText("Print");
        print.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("Delete");
        delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 255, 255));
        reset.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 0, 0));
        reset.setText("Reset");
        reset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 0));
        exit.setText("Exit");
        exit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Marksheet", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Bright", 1, 18), new java.awt.Color(204, 255, 255))); // NOI18N

        printArea.setEditable(false);
        printArea.setColumns(20);
        printArea.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        printArea.setRows(5);
        jScrollPane2.setViewportView(printArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(transcript, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tableScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(transcript, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed

        resultGenerate();
    }//GEN-LAST:event_resultActionPerformed

    private void transcriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transcriptActionPerformed

        if (name.getText().equals("") || name.getText().equals(" ") || roll.getText().equals("") || roll.getText().equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Value First!");
        } else {
            generateMarksheet();
        }
    }//GEN-LAST:event_transcriptActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed

        MessageFormat header = new MessageFormat("Internationl Model School");
        MessageFormat footer = new MessageFormat("Date:___/____/_______");
        try {
            printArea.print(header, footer);

        } catch (PrinterException e) {
            System.err.format("No Printer Found", e.getMessage());
        }
    }//GEN-LAST:event_printActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        deleteData();
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        resetfield();
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void rollKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rollKeyTyped

        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
                || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
        if ((Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Number Only!");

        }

    }//GEN-LAST:event_rollKeyTyped

    private void banglaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_banglaKeyTyped

        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
                || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
        if ((Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Number Only!");

        }

    }//GEN-LAST:event_banglaKeyTyped

    private void englishKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_englishKeyTyped

        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
                || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
        if ((Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Number Only!");

        }
    }//GEN-LAST:event_englishKeyTyped

    private void mathKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mathKeyTyped

        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
                || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
        if ((Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Number Only!");

        }
    }//GEN-LAST:event_mathKeyTyped

    private void avarageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_avarageKeyTyped

        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
                || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
        if ((Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Number Only!");

        }
    }//GEN-LAST:event_avarageKeyTyped

    private void totalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalKeyTyped

        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
                || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
        if ((Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Number Only!");

        }
    }//GEN-LAST:event_totalKeyTyped

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped

        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber))
                || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();

        }
        if ((Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE)
                || (iNumber == KeyEvent.VK_DELETE)) {
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please Enter Number Only!");

        }
    }//GEN-LAST:event_searchKeyTyped

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed

    }//GEN-LAST:event_totalActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased

        try {

            searchStudent();

        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchKeyReleased

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        if (search.getText().equals("Enter Roll")) {
            search.setText("");
        }

    }//GEN-LAST:event_searchMouseClicked

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped

        char iNumber = evt.getKeyChar();
        if ((Character.isDigit(iNumber))) {
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Please Enter Character Only!");
        } else {

        }
    }//GEN-LAST:event_nameKeyTyped

    private void infoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoTableMouseClicked
        showMarkSheet();
    }//GEN-LAST:event_infoTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //  connect();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new MainFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Class;
    private javax.swing.JTextField avarage;
    private javax.swing.JTextField bangla;
    private javax.swing.JButton delete;
    private javax.swing.JTextField english;
    private javax.swing.JButton exit;
    private javax.swing.JTable infoTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField math;
    private javax.swing.JTextField name;
    private javax.swing.JButton print;
    private javax.swing.JTextArea printArea;
    private javax.swing.JButton reset;
    private javax.swing.JButton result;
    private javax.swing.JTextField roll;
    private javax.swing.JTextField search;
    private javax.swing.JTextField status;
    private javax.swing.JScrollPane tableScroll;
    private javax.swing.JTextField total;
    private javax.swing.JButton transcript;
    // End of variables declaration//GEN-END:variables

    public static Connection connect() {

        String url = "jdbc:sqlite:student.db";
        java.sql.Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            // JOptionPane.showMessageDialog(null, "Database Connected!");
            // System.out.println("Database Connected!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;

    }

    private void deleteData() {
        DefaultTableModel model = (DefaultTableModel) infoTable.getModel();

        if (infoTable.getSelectedRow() == -1) {

            if (infoTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No data to delete", "Student Result System", JOptionPane.OK_OPTION);

            } else {

                JOptionPane.showMessageDialog(null, "Select a Row to delete", "Student Result System", JOptionPane.OK_OPTION);
            }
        } else {
            int row = infoTable.getSelectedRow();
            String getroll = infoTable.getValueAt(row, 1).toString();
            //System.out.println(getroll);
            String sql = "delete from student where roll='" + getroll + "'";
            try {

                Connection conn = MainFrame.connect();
                PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(this, "Data Deleted!");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            model.removeRow(infoTable.getSelectedRow());
        }
    }

    private void jtableCustom() {
        JTableHeader header = infoTable.getTableHeader();
        header.setBackground(Color.getHSBColor(54, 169, 104));
        header.setForeground(Color.white);
        header.setFont(new Font("Dialog", Font.BOLD, 17));

        TableColumnModel columnModel = infoTable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(130);

    }

    private void generateMarksheet() {

        String addname = name.getText();
        String addroll = roll.getText();
        String addClass = Class.getSelectedItem().toString();
        String addbangla = bangla.getText();
        String addenglish = english.getText();
        String addmath = math.getText();
        String addstatus = status.getText();
        String addavarage = avarage.getText();
        String addtotal = total.getText();

        printArea.append("                                    Marksheet\n"
                + "______________________________________________\n"
                + "                    Name: \t     " + addname
                + "\n                    Roll: \t     " + addroll
                + "\n                    Class: \t     " + addClass
                + "\n                    Bangla: \t     " + addbangla
                + "\n                    English: \t     " + addenglish
                + "\n                    Math: \t     " + addmath
                + "\n______________________________________________"
                + "\n                    Status: \t     " + addstatus
                + "\n                    Avarage: \t     " + addavarage
                + "\n                    Total: \t     " + addtotal
        );
    }

    private void resultGenerate() {
        String addbangla = bangla.getText();
        String addenglish = english.getText();
        String addmath = math.getText();

        if (addbangla.isEmpty() || addenglish.isEmpty() || addmath.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Input Your Data First!");
        } else {
            int totalmark = Integer.parseInt(addbangla) + Integer.parseInt(addenglish) + Integer.parseInt(addmath);
            int avaragemark = (Integer.parseInt(addbangla) + Integer.parseInt(addenglish) + Integer.parseInt(addmath)) / 3;

            total.setText("" + totalmark);
            avarage.setText("" + avaragemark);
            if (totalmark < 99) {
                status.setText("F");
            } else if (totalmark <= 117) {
                status.setText("D");
            } else if (totalmark <= 147) {
                status.setText("C");
            } else if (totalmark <= 177) {
                status.setText("B");
            } else if (totalmark <= 207) {
                status.setText("A-");
            } else if (totalmark <= 237) {
                status.setText("A");
            } else if (totalmark <= 300) {
                status.setText("A+");
            }
            addData();
            try {
                updateTable();
            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void showMarkSheet() {
        int index = infoTable.getSelectedRow();
        TableModel model = infoTable.getModel();

        String addname = model.getValueAt(index, 0).toString();
        String addroll = model.getValueAt(index, 1).toString();
        String addClass = model.getValueAt(index, 2).toString();
        String addbangla = model.getValueAt(index, 3).toString();
        String addenglish = model.getValueAt(index, 4).toString();
        String addmath = model.getValueAt(index, 5).toString();
        String addstatus = model.getValueAt(index, 6).toString();
        String addavarage = model.getValueAt(index, 7).toString();
        String addtotal = model.getValueAt(index, 8).toString();

        if (printArea.getText().equals("")) {
            printArea.append("                                    Marksheet\n"
                    + "______________________________________________\n"
                    + "                    Name: \t     " + addname
                    + "\n                    Roll: \t     " + addroll
                    + "\n                    Class: \t     " + addClass
                    + "\n                    Bangla: \t     " + addbangla
                    + "\n                    English: \t     " + addenglish
                    + "\n                    Math: \t     " + addmath
                    + "\n______________________________________________"
                    + "\n                    Status: \t     " + addstatus
                    + "\n                    Avarage: \t     " + addavarage
                    + "\n                    Total: \t     " + addtotal
            );
        } else {
            printArea.setText("");
            printArea.append("                                    Marksheet\n"
                    + "______________________________________________\n"
                    + "                    Name: \t     " + addname
                    + "\n                    Roll: \t     " + addroll
                    + "\n                    Class: \t     " + addClass
                    + "\n                    Bangla: \t     " + addbangla
                    + "\n                    English: \t     " + addenglish
                    + "\n                    Math: \t     " + addmath
                    + "\n______________________________________________"
                    + "\n                    Status: \t     " + addstatus
                    + "\n                    Avarage: \t     " + addavarage
                    + "\n                    Total: \t     " + addtotal
            );
        }

    }

    public class InsertRecords {

        public void insert(String name, int roll, String Class, int bangla, int english, int math, String status, int avarage, int total) {
            String sql = "INSERT INTO student(name, roll, class, bangla, english, math, status, avarage, total) VALUES(?,?,?,?,?,?,?,?,?)";

            try {
                Connection conn = MainFrame.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql);

                pstmt.setString(1, name);
                pstmt.setInt(2, roll);
                pstmt.setString(3, Class);
                pstmt.setInt(4, bangla);
                pstmt.setInt(5, english);
                pstmt.setInt(6, math);
                pstmt.setString(7, status);
                pstmt.setInt(8, avarage);
                pstmt.setInt(9, total);

                pstmt.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void addData() {

        String addname = name.getText();
        String addroll = roll.getText();
        String addClass = Class.getSelectedItem().toString();
        String addbangla = bangla.getText();
        String addenglish = english.getText();
        String addmath = math.getText();
        String addstatus = status.getText();
        String addavarage = avarage.getText();
        String addtotal = total.getText();

        try {
            InsertRecords add = new InsertRecords();
            add.insert(
                    addname,
                    Integer.parseInt(addroll),
                    addClass,
                    Integer.parseInt(addbangla),
                    Integer.parseInt(addenglish),
                    Integer.parseInt(addmath),
                    addstatus,
                    Integer.parseInt(addavarage),
                    Integer.parseInt(addtotal));
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
    }

    public void updateTable() throws SQLException {

        Connection conn = MainFrame.connect();
        String url = "Select name, roll, class, bangla, english, math, status, avarage, total from student";

        try {
            PreparedStatement pstm = conn.prepareStatement(url);
            ResultSet rs = pstm.executeQuery();
            DefaultTableModel model = (DefaultTableModel) infoTable.getModel();
            Object[] colData = new Object[9];
            int rowCount = model.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            while (rs.next()) {

                colData[0] = rs.getString("Name");
                colData[1] = rs.getString("Roll");
                colData[2] = rs.getString("Class");
                colData[3] = rs.getString("Bangla");
                colData[4] = rs.getString("English");
                colData[5] = rs.getString("Math");
                colData[6] = rs.getString("Status");
                colData[7] = rs.getString("Avarage");
                colData[8] = rs.getString("Total");
                model.addRow(colData);

            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public void resetfield() {
        name.setText("");
        roll.setText("");
        bangla.setText("");
        english.setText("");
        math.setText("");
        status.setText("");
        avarage.setText("");
        total.setText("");
    }

    public void searchStudent() throws SQLException {

        Connection con = MainFrame.connect();
        PreparedStatement ps;
        if (search.getText().equals("")) {
            updateTable();
        } else {
            try {
                ps = con.prepareStatement("SELECT * FROM `student` WHERE  roll = '" + search.getText() + "'");

                ResultSet rs = ps.executeQuery();
                DefaultTableModel model = (DefaultTableModel) infoTable.getModel();

                Object[] colData = new Object[9];
                int rowCount = model.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                    model.removeRow(i);
                }
                while (rs.next()) {

                    colData[0] = rs.getString("Name");
                    colData[1] = rs.getString("Roll");
                    colData[2] = rs.getString("Class");
                    colData[3] = rs.getString("Bangla");
                    colData[4] = rs.getString("English");
                    colData[5] = rs.getString("Math");
                    colData[6] = rs.getString("Status");
                    colData[7] = rs.getString("Avarage");
                    colData[8] = rs.getString("Total");
                    model.addRow(colData);

                }

            } catch (SQLException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
