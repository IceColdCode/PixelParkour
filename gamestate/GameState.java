public abstract class GameState {

  public abstract void init();
  public abstract void draw(Graphics2D g);
  public void drawToScreen(Graphics2D g) {
    draw(g);
  }
  public abstract void keyPressed(int k);
  public abstract void keyReleased(int k);
  
}
