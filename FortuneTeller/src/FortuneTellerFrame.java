import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FortuneTellerFrame extends JFrame {

    public FortuneTellerFrame() {

        setTitle("Fortune Teller");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        Font fonty_mcfonterson = new Font("Times New Roman", Font.BOLD, 56);
        Font fonty_jr = new Font("Times New Roman", Font.PLAIN, 18);
        Font fonty_III = new Font("Times New Roman", Font.PLAIN, 14);

        ImageIcon icon = new ImageIcon("Cookie.png");

        JLabel jabel = new JLabel("Fortune Teller", icon, JLabel.CENTER);
        jabel.setBounds(0, 50, 600, 100);
        jabel.setFont(fonty_mcfonterson);

        JTextArea jerria = new JTextArea();
        jerria.setFont(fonty_III);

        JScrollPane jane = new JScrollPane(jerria);
        jane.setBounds(40, 200, 600, 300);

        JButton read_butt = new JButton("Eat a Fortune Cookie");
        read_butt.setBounds(40, 515, 200, 25);
        read_butt.setFont(fonty_jr);
        read_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int x = (int)(Math.random()*12);
                if (x == 0){
                    jerria.append("You shall soon get crumbs on your pants.\n");
                }

                if (x == 1){
                    jerria.append("Try again later.\n");
                }

                if (x == 2){
                    jerria.append("Is your refrigerator running?\n");
                }

                if (x == 3){
                    jerria.append("You shall receive food poisoning from an under-baked fortune cookie.\n");
                }

                if (x == 4){
                    jerria.append("You shall eat another cookie.\n");
                }

                if (x == 5){
                    jerria.append("You shall be really cool and epic and stuff.\n");
                }

                if (x == 6){
                    jerria.append("That last fortune was for someone else; sorry.\n");
                }

                if (x == 7){
                    jerria.append("You shall have Chinese leftovers for dinner.\n");
                }

                if (x == 8){
                    jerria.append("Looking to appeal to fortune readers? Contact us to purchase this ad space!\n");
                }

                if (x == 9){
                    jerria.append("You shall enjoy this cookie. :)\n");
                }

                if (x == 10){
                    jerria.append("You shall dislike this cookie! :(\n");
                }

                if (x == 11){
                    jerria.append("[PLACE FORTUNE HERE]\n");
                }

            }
        });

        JButton quit_butt = new JButton("Quit");

        add(jabel);
        add(jane);
        add(read_butt);
        add(quit_butt);

        setVisible(true);

    }}
