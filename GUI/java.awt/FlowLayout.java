/*
-	programmer:Mayank
-	./FLowLayout.java
*/
class MyFrame extends java.awt.Frame
{
	MyFrame()
	{
		setSize(300,300);
		setLayout(new java.awt.FlowLayout());
		setVisible(true);

		MyButton(25);
	}

	void MyButton(int n)
	{
		java.awt.Button button[] = new java.awt.Button[n];

		for (int index = 0; index < button.length; index++)
		{
			button[index] = new java.awt.Button();

			button[index].setLabel(""+i+"");

			this.add(button[index]);
		}
	}
}
class Test
{
	public static void main(String args[])
	{
		new MyFrame();
	}
}
/*Compiled from "FlowLayout.java"
public class java.awt.FlowLayout implements java.awt.LayoutManager,java.io.Serializable {
  public static final int LEFT;
  public static final int CENTER;
  public static final int RIGHT;
  public static final int LEADING;
  public static final int TRAILING;
  int align;
  int newAlign;
  int hgap;
  int vgap;
  public java.awt.FlowLayout();
  public java.awt.FlowLayout(int);
  public java.awt.FlowLayout(int, int, int);
  public int getAlignment();
  public void setAlignment(int);
  public int getHgap();
  public void setHgap(int);
  public int getVgap();
  public void setVgap(int);
  public void setAlignOnBaseline(boolean);
  public boolean getAlignOnBaseline();
  public void addLayoutComponent(java.lang.String, java.awt.Component);
  public void removeLayoutComponent(java.awt.Component);
  public java.awt.Dimension preferredLayoutSize(java.awt.Container);
  public java.awt.Dimension minimumLayoutSize(java.awt.Container);
  public void layoutContainer(java.awt.Container);
  public java.lang.String toString();
}
*/
