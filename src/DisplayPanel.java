import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DisplayPanel extends JPanel implements ActionListener,KeyListener,MouseListener {
    private int heroX;
    private int heroY;
    private BufferedImage hero;
    private BufferedImage background;
    private JButton attack;
    private JButton defend;
    private JMenu spells;
    private JMenuItem poison,fireball;

    public DisplayPanel () {
        heroX = 0;
        heroY = 275;
        try {
            hero = ImageIO.read(new File("src/pictures/download.png"));
            background = ImageIO.read(new File("src/pictures/background.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        addKeyListener(this);
        attack = new JButton("Attack");
        defend = new JButton("Defend");
        spells = new JMenu("Spells");
        poison = new JMenuItem("poison");
        spells.add(poison);
        add(attack);
        add(defend);
        add(spells);
        attack.setVisible(true);
        defend.setVisible(true);
        spells.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background,0,0,null);
        g.drawImage(hero,heroX,heroY,null);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_W) {
            heroY += 5;
        } else if (keyCode == KeyEvent.VK_S) {
            heroY -= 5;
        } else if (keyCode == KeyEvent.VK_A) {
            heroX -= 5;
        } else if (keyCode == KeyEvent.VK_D) {
            heroX += 5;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed (MouseEvent e) {}

    public void mouseReleased (MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    public void actionPerformed (ActionEvent e) {

    }
}