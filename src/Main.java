import javax.swing.JOptionPane;
import java.util.*;

//In this game the user has to guess what will be the number that matches the random number in the specified range of 1 to 100 
// And provide feedback on whether the guessis correct, too high, or too low.
public class Main extends javax.swing.JFrame {
    int number;
    static int a = 0;

    public static void randomgenerate() {

        Random r = new Random();
        for (int i = 0; i < 1; i++) {
            int b = r.nextInt(100);
            a = b;
        }

    }

    public Main() {
        randomgenerate();
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        title = new javax.swing.JLabel();
        enter = new javax.swing.JLabel();
        yournumber = new javax.swing.JTextField();
        go = new javax.swing.JButton();
        answer1 = new javax.swing.JLabel();
        replay = new javax.swing.JButton();
        youranswer = new javax.swing.JLabel();
        yourscore = new javax.swing.JLabel();
        answer2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Segoe UI", 1, 24));
        title.setText("Number_Game");

        enter.setFont(new java.awt.Font("Segoe UI", 1, 14));
        enter.setText("Enter the number (1-100)");

        yournumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yournumberActionPerformed(evt);
            }
        });

        go.setFont(new java.awt.Font("Segoe UI", 3, 14));
        go.setText("Go");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });

        answer1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        answer1.setText("Score");

        replay.setFont(new java.awt.Font("Segoe UI", 3, 14));
        replay.setText("Replay");
        replay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replayActionPerformed(evt);
            }
        });

        youranswer.setFont(new java.awt.Font("Segoe UI", 0, 14));
        youranswer.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        yourscore.setFont(new java.awt.Font("Segoe UI", 3, 14));

        answer2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        answer2.setText("Answer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(yournumber)
                                        .addComponent(enter, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 310,
                                        Short.MAX_VALUE)
                                .addComponent(youranswer, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(300, 300, 300)
                                                .addComponent(go)
                                                .addGap(67, 67, 67)
                                                .addComponent(replay))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(320, 320, 320)
                                                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 178,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(382, 382, 382)
                                                .addComponent(answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(374, 374, 374)
                                                .addComponent(yourscore, javax.swing.GroupLayout.PREFERRED_SIZE, 57,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(585, Short.MAX_VALUE)
                                        .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, 61,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(196, 196, 196))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(title)
                                .addGap(42, 42, 42)
                                .addComponent(enter)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(yournumber, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(youranswer, javax.swing.GroupLayout.PREFERRED_SIZE, 52,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(answer1))
                                .addGap(18, 18, 18)
                                .addComponent(yourscore, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(go)
                                        .addComponent(replay))
                                .addGap(73, 73, 73))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(answer2)
                                        .addContainerGap(287, Short.MAX_VALUE))));

        pack();
    }

    private void goActionPerformed(java.awt.event.ActionEvent evt) {
        String var = yournumber.getText();
        number = Integer.parseInt(var);

        if (yournumber.getText().equals(" ")) {
            JOptionPane.showMessageDialog(null, "PLEASE ENTER NUMBER", "Error",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (yournumber.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "PLEASE ENTER NUMBER", "Error",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (number > 100 || number < 0) {
            JOptionPane.showMessageDialog(null, "PLEASE ENTER NUMBER IN RANGE OF 1 TO 100", "Error",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (number < 100) {
            if (number == a) {
                youranswer.setText("Correct");
            } else if (number > a) {
                youranswer.setText("TOO High");
            } else if (number < a) {
                youranswer.setText("TOO Low");
            }
        }
        int score = 0;
        if (a < 50) {
            score = (number + a) / 2;
        }
        if (a > 50) {
            score = (number + a) / 3;
        }
        if (a == number) {
            score = 100;
        }
        if (a > 101 || a < 0) {
            score = 0;
        }

        String stringscore = Integer.toString(score);
        yourscore.setText(stringscore);

    }

    private void replayActionPerformed(java.awt.event.ActionEvent evt) {
        youranswer.setText(null);
        yournumber.setText(null);
        yourscore.setText(null);
    }

    private void yournumberActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel answer1;
    private javax.swing.JLabel answer2;
    private javax.swing.JLabel enter;
    private javax.swing.JButton go;
    private javax.swing.JButton replay;
    private javax.swing.JLabel title;
    private javax.swing.JLabel youranswer;
    private javax.swing.JTextField yournumber;
    private javax.swing.JLabel yourscore;

}
