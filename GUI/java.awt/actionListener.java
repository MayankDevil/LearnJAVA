/*
-	programmer:Mayank
-	./actionListener.java
*/
class ActionListener extends java.awt.Frame implements java.awt.event.ActionListener
{
	ActionListener()
	{
		setSize(300,200);

		java.awt.Button btn = new java.awt.Button("_HERO_TIME_");

		btn.addActionListener(this);

		add(btn);

		// add(new java.awt.Button("Mian").addActionListener(this));
	}
	public static void main(String args[])
	{
		new ActionListener().setVisible(true);
	}
	// @Override
	public void actionPerformed(java.awt.event.ActionEvent action_event)
	{
		System.out.println(" execute code ");
	}
}
/*
Compiled from "ActionListener.java"
public interface java.awt.event.ActionListener extends java.util.EventListener {
  public abstract void actionPerformed(java.awt.event.ActionEvent);
}

Compiled from "EventListener.java"
public interface java.util.EventListener {
}
*/
