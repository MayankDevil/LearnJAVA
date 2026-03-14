/*
-	programmer:Mayank
-	./Button.java
*/
class MyFrame extends java.awt.Frame
{
	MyFrame()
	{
		setVisible(true);
		setSize(300,300);
		setLayout(null);

		add(MyButton("Mayank"));
	}

	java.awt.Button MyButton(String name)
	{
//		if (name.length == null) name = "";

		java.awt.Button button = new java.awt.Button();

		button.setLabel(name);
		button.setBounds(100,100,100,50);

		System.out.println(button.getLabel());

		return button;
	}
}
class Test
{
	public static void main(String args[])
	{
		new MyFrame();
	}
}
/*Compiled from "Button.java"
public class java.awt.Button extends java.awt.Component implements javax.accessibility.Accessible {
  java.lang.String label;
  java.lang.String actionCommand;
  transient java.awt.event.ActionListener actionListener;
  public java.awt.Button() throws java.awt.HeadlessException;
  public java.awt.Button(java.lang.String) throws java.awt.HeadlessException;
  java.lang.String constructComponentName();
  public void addNotify();
  public java.lang.String getLabel();
  public void setLabel(java.lang.String);
  public void setActionCommand(java.lang.String);
  public java.lang.String getActionCommand();
  public synchronized void addActionListener(java.awt.event.ActionListener);
  public synchronized void removeActionListener(java.awt.event.ActionListener);
  public synchronized java.awt.event.ActionListener[] getActionListeners();
  public <T extends java.util.EventListener> T[] getListeners(java.lang.Class<T>);
  boolean eventEnabled(java.awt.AWTEvent);
  protected void processEvent(java.awt.AWTEvent);
  protected void processActionEvent(java.awt.event.ActionEvent);
  protected java.lang.String paramString();
  public javax.accessibility.AccessibleContext getAccessibleContext();
  static {};
}
*/
