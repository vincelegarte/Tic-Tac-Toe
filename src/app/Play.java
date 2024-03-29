package app;

import javax.swing.JOptionPane;

public class Play extends javax.swing.JFrame {

    private String pTurn = "X";
    private String p1;
    private String p2;
    /**
     * Creates new form ttt_single
     */
    public Play() {
        initComponents();
        this.playBoard.setVisible(false);
    }
    
    private void turns(){ //determine who's turn
        if (pTurn.equals("X")) {
            pTurn = "O";
            turnLabel.setText(p2 + "'s Turn");
        } else {
            pTurn = "X";
            turnLabel.setText(p1 + "'s Turn");
        }
    }
    
    private void xWins(){
        turnLabel.setText(p1 + " Wins!");
        JOptionPane.showMessageDialog(this,
                p1 + " Wins!",
                "Winner",
                JOptionPane.INFORMATION_MESSAGE);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }
    
    private void oWins(){
        turnLabel.setText(p2 + " Wins!");
        JOptionPane.showMessageDialog(this,
                p2 + " Wins!",
                "Winner",
                JOptionPane.INFORMATION_MESSAGE);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
    }
    
    private void nWins(){ //draw
        String  one = jButton1.getText();
        String  two = jButton2.getText();
        String  three = jButton3.getText();
        String  four = jButton4.getText();
        String  five = jButton5.getText();
        String  six = jButton6.getText();
        String  seven = jButton7.getText();
        String  eight = jButton8.getText();
        String  nine = jButton9.getText();
        
        if (!one.equals("") && !two.equals("") && !three.equals("")
                && !four.equals("") && !five.equals("") && !six.equals("")
                && !seven.equals("") && !eight.equals("") && !nine.equals("")){
            turnLabel.setText("Draw!");
            JOptionPane.showMessageDialog(this,
                "Draw!",
                "No Winner",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void winner(){ //determine who's the winner
        
        String  one = jButton1.getText();
        String  two = jButton2.getText();
        String  three = jButton3.getText();
        String  four = jButton4.getText();
        String  five = jButton5.getText();
        String  six = jButton6.getText();
        String  seven = jButton7.getText();
        String  eight = jButton8.getText();
        String  nine = jButton9.getText();
        
        if (one.equals("X") && two.equals("X") && three.equals("X")){ //top horizontal
            xWins();
        } else if (four.equals("X") && five.equals("X") && six.equals("X")){ //middle horizontal
            xWins();
        } else if (seven.equals("X") && eight.equals("X") && nine.equals("X")){ //bottom horizontal
            xWins();
        } else if (one.equals("X") && four.equals("X") && seven.equals("X")){ //left vertical
            xWins();
        } else if (two.equals("X") && five.equals("X") && eight.equals("X")){ //middle vertical
            xWins();
        } else if (three.equals("X") && six.equals("X") && nine.equals("X")){ //right vertical
            xWins();
        } else if (one.equals("X") && five.equals("X") && nine.equals("X")){ //left diagonal
            xWins();
        } else if (three.equals("X") && five.equals("X") && seven.equals("X")){ //right diagonal
            xWins();
        } else if (one.equals("O") && two.equals("O") && three.equals("O")){ //top horizontal
            oWins();
        } else if (four.equals("O") && five.equals("O") && six.equals("O")){ //middle horizontal
            oWins();
        } else if (seven.equals("O") && eight.equals("O") && nine.equals("O")){ //bottom horizontal
            oWins();
        } else if (one.equals("O") && four.equals("O") && seven.equals("O")){ //left vertical
            oWins();
        } else if (two.equals("O") && five.equals("O") && eight.equals("O")){ //middle vertical
            oWins();
        } else if (three.equals("O") && six.equals("O") && nine.equals("O")){ //right vertical
            oWins();
        } else if (one.equals("O") && five.equals("O") && nine.equals("O")){ //left diagonal
            oWins();
        } else if (three.equals("O") && five.equals("O") && seven.equals("O")){ //right diagonal
            oWins();
        } else {
            nWins();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        playBoard = new javax.swing.JLayeredPane();
        turnLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        play_bg = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        quitButton1 = new javax.swing.JButton();
        userName = new javax.swing.JLayeredPane();
        p1UN = new javax.swing.JTextField();
        p2UN = new javax.swing.JTextField();
        un_bg = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setToolTipText("");
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playBoard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        turnLabel.setBackground(null);
        turnLabel.setFont(new java.awt.Font("Century Gothic", 1, 50)); // NOI18N
        turnLabel.setForeground(new java.awt.Color(255, 219, 30));
        turnLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playBoard.add(turnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 780, 60));

        jButton1.setBackground(null);
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 76, 76));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        playBoard.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 120, 110));

        jButton2.setBackground(null);
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 76, 76));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        playBoard.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 120, 110));

        jButton3.setBackground(null);
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 76, 76));
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        playBoard.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 120, 110));

        jButton4.setBackground(null);
        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 76, 76));
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        playBoard.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 120, 110));

        jButton5.setBackground(null);
        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 76, 76));
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        playBoard.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 120, 110));

        jButton6.setBackground(null);
        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 76, 76));
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        playBoard.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 120, 110));

        jButton7.setBackground(null);
        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 76, 76));
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        playBoard.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 120, 110));

        jButton8.setBackground(null);
        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 76, 76));
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        playBoard.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 120, 110));

        jButton9.setBackground(null);
        jButton9.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 76, 76));
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        playBoard.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 120, 110));

        play_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/tttplay.gif"))); // NOI18N
        playBoard.add(play_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        resetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        playBoard.add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 180, 60));

        quitButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButton1ActionPerformed(evt);
            }
        });
        playBoard.add(quitButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 160, 60));

        panel.add(playBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        userName.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1UN.setBackground(new java.awt.Color(255, 219, 30));
        p1UN.setFont(new java.awt.Font("Century Gothic", 1, 50)); // NOI18N
        p1UN.setForeground(new java.awt.Color(255, 76, 76));
        p1UN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p1UN.setText("PLAYER ONE");
        p1UN.setBorder(null);
        userName.add(p1UN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 530, 90));

        p2UN.setBackground(new java.awt.Color(255, 219, 30));
        p2UN.setFont(new java.awt.Font("Century Gothic", 1, 50)); // NOI18N
        p2UN.setForeground(new java.awt.Color(255, 76, 76));
        p2UN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        p2UN.setText("PLAYER TWO");
        p2UN.setBorder(null);
        userName.add(p2UN, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 530, 80));

        un_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/tttusername.png"))); // NOI18N
        userName.add(un_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        startButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        userName.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 190, 60));

        quitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        userName.add(quitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, 170, 60));

        panel.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(pTurn);
        jButton1.setEnabled(false);
        turns();
        winner();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText(pTurn);
        jButton2.setEnabled(false);
        turns();
        winner();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(pTurn);
        jButton3.setEnabled(false);
        turns();
        winner();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(pTurn);
        jButton4.setEnabled(false);
        turns();
        winner();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jButton5.setText(pTurn);
        jButton5.setEnabled(false);
        turns();
        winner();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText(pTurn);
        jButton6.setEnabled(false);
        turns();
        winner();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(pTurn);
        jButton7.setEnabled(false);
        turns();
        winner();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(pTurn);
        jButton8.setEnabled(false);
        turns();
        winner();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(pTurn);
        jButton9.setEnabled(false);
        turns();
        winner();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        pTurn = "X";
        turnLabel.setText(p1 + "'s Turn");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void quitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButton1ActionPerformed
        // TODO add your handling code here:
        new Start().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_quitButton1ActionPerformed

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        // TODO add your handling code here:
        new Start().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_quitButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        this.playBoard.setVisible(true);
        
        if (p1UN.getText().isEmpty()){
            p1 = "X";
        } else if (p1UN.getText().equals(p2UN.getText())){
            p1 = p1UN.getText()+" (X)";
        } else {
            p1 = p1UN.getText();
        }
        
        if (p2UN.getText().isEmpty()){
            p2 = "O";
        } else if (p2UN.getText().equals(p1UN.getText())){
            p2 = p2UN.getText()+" (O)";
        } else {
            p2 = p2UN.getText();
        }
        
        turnLabel.setText(p1 + "'s Turn");
    }//GEN-LAST:event_startButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField p1UN;
    private javax.swing.JTextField p2UN;
    private javax.swing.JPanel panel;
    private javax.swing.JLayeredPane playBoard;
    private javax.swing.JLabel play_bg;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton quitButton1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel turnLabel;
    private javax.swing.JLabel un_bg;
    private javax.swing.JLayeredPane userName;
    // End of variables declaration//GEN-END:variables
}
