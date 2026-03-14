/*
-	programmer:Mayank
-	./mouseListener.java
*/
class MouseListener extends java.awt.Frame implements java.awt.events.MouseListener
{
	MouseListener()
	{
		setSize(500,100);

		setLayout(new java.awt.FlowLayout());

		java.awt.Button b[] = new java.awt.Button[5];

		for (int i = 0; i < b.length; i++)
		{
			b[i] = new java.awt.Button(""+i+"");

			if (i == 1)
				b[i].addMouseListener(this);
			add(b[i]);
		}
	}
	public static void main(String args[])
	{
		new MouseListener().setVisible(true);
	}
	// @Override
	public abstract void mouseClicked(java.awt.event.MouseEvent mouse_event)
	{
		System.out.println(" mouseClicked event ");
	}
	public abstract void mousePressed(java.awt.event.MouseEvent mouse_event);
	{}
	public abstract void mouseReleased(java.awt.event.MouseEvent mouse_event);
	{}
	public abstract void mouseEntered(java.awt.event.MouseEvent mouse_event);
	{}
	public abstract void mouseExited(java.awt.event.MouseEvent mouse_event);
	{}
}
/*
Compiled from "MouseListener.java"
public interface java.awt.event.MouseListener extends java.util.EventListener {
  public abstract void mouseClicked(java.awt.event.MouseEvent);
  public abstract void mousePressed(java.awt.event.MouseEvent);
  public abstract void mouseReleased(java.awt.event.MouseEvent);
  public abstract void mouseEntered(java.awt.event.MouseEvent);
  public abstract void mouseExited(java.awt.event.MouseEvent);
}
*/
