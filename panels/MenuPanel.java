import java.awt.*;

class MenuPanel extends JPanel implements Runnable, KeyListener{
  
  // surface for drawing
  Graphics2D menuSurface = new Graphics2D();
  
  // index
  public static int MENUINDEX = 0;
  public int currentIndex = 0;
  
  // menu options
  String[] options = {"Start", "Help", "Quit"};
  
  // title colour and font
  Color titleColor = new Color(0, 128, 0);
  Font titleFont = new Font("Arial", Font.BOLD, 24);
  
  // constructor time!
  public MenuPanel() {} // finish later
  
  // implemented methods
  public void keyPressed(int k) {}
  public void keyReleased(int k) {}
  public void keyTyped(int k) {}
  
}
