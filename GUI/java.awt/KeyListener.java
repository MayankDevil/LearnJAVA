/*
-	programmer:Mayank
-	./KeyListener.java
*/
class KeyListener extends java.awt.Frame implements java.awt.event.KeyListener
{
	java.awt.TextField t;

	KeyListener()
	{
		setSize(300,100);

		t = new java.awt.TextField();

		t.addKeyListener(this);

		add(t);
	}
	public static void main(String args[])
	{
		new KeyListener().setVisible(true);
	}
	// @Override --------------------------
	public void keyTyped(java.awt.event.KeyEvent key_event)
	{
//		System.out.println(" key typed ");
	}
	public void keyPressed(java.awt.event.KeyEvent key_event)
	{
		char c = t.geText();
		System.out.println(c);
	}
	public void keyReleased(java.awt.event.KeyEvent key_event)
	{
//		System.out.println(""+t.getText());
	}
}
/*
Compiled from "KeyListener.java"
public interface java.awt.event.KeyListener extends java.util.EventListener {
  public abstract void keyTyped(java.awt.event.KeyEvent);
  public abstract void keyPressed(java.awt.event.KeyEvent);
  public abstract void keyReleased(java.awt.event.KeyEvent);
}
*/
