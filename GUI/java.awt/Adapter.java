/*
-	programmer:Mayank
-	./Adapter.java
*/
class Adapter extends java.awt.Frame
{
	Adapter()
	{
		setSize(500,500);

		java.awt.Button b = new java.awt.Button("Execute");

		b.addMouseListener(new MyAdapter());

		add(b);
	}
	public static void main(String args[])
	{
		new Adapter().setVisible(true);
	}
}
class MyAdapter extends java.awt.event.MouseAdapter
{
	public void mouseClicked(java.awt.event.MouseEvent mouse_event)
	{
		System.out.println("i am action of your reaction");
	}
}
/*
Compiled from "MouseAdapter.java"
public abstract class java.awt.event.MouseAdapter implements java.awt.event.MouseListener,java.awt.event.MouseWheelListener,java.awt.event.MouseMotionListener {
  public java.awt.event.MouseAdapter();
  public void mouseClicked(java.awt.event.MouseEvent);
  public void mousePressed(java.awt.event.MouseEvent);
  public void mouseReleased(java.awt.event.MouseEvent);
  public void mouseEntered(java.awt.event.MouseEvent);
  public void mouseExited(java.awt.event.MouseEvent);
  public void mouseWheelMoved(java.awt.event.MouseWheelEvent);
  public void mouseDragged(java.awt.event.MouseEvent);
  public void mouseMoved(java.awt.event.MouseEvent);
}

Compiled from "KeyAdapter.java"
public abstract class java.awt.event.KeyAdapter implements java.awt.event.KeyListener {
  public java.awt.event.KeyAdapter();
  public void keyTyped(java.awt.event.KeyEvent);
  public void keyPressed(java.awt.event.KeyEvent);
  public void keyReleased(java.awt.event.KeyEvent);
}
*/
