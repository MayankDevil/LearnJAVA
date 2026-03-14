/*
-	programmer:Mayank
-	./GridLayout.java
*/
class GridLayout extends java.awt.Frame
{
	GridLayout()
	{
		setSize(400,400);
		setLayout(new java.awt.GridLayout(3,3,1,1));

		// Rows Columns Hgap Vgap

		for (int i = 0; i < 10; i++)
		{
			add(new java.awt.Button(""+i+""));
		}
	}
	public static void main(String args[])
	{
		new GridLayout().setVisible(true);
	}
}
/* Compiled from "GridLayout.java"
public class java.awt.GridLayout implements java.awt.LayoutManager,java.io.Serializable {
  int hgap;
  int vgap;
  int rows;
  int cols;
  public java.awt.GridLayout();
  public java.awt.GridLayout(int, int);
  public java.awt.GridLayout(int, int, int, int);
  public int getRows();
  public void setRows(int);
  public int getColumns();
  public void setColumns(int);
  public int getHgap();
  public void setHgap(int);
  public int getVgap();
  public void setVgap(int);
  public void addLayoutComponent(java.lang.String, java.awt.Component);
  public void removeLayoutComponent(java.awt.Component);
  public java.awt.Dimension preferredLayoutSize(java.awt.Container);
  public java.awt.Dimension minimumLayoutSize(java.awt.Container);
  public void layoutContainer(java.awt.Container);
  public java.lang.String toString();
}
*/
