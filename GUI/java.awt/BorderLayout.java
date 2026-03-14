/*
-	programmer:Mayank
-	./BorderLayout.java
*/
class BorderLayout extends java.awt.Frame
{
    BorderLayout()
    {
        setSize(500,500);
        
        java.awt.Panel center_Panel, north_Panel, south_Panel, west_Panel, east_Panel;
        
        center_Panel = new java.awt.Panel();
        center_Panel.setBackground(java.awt.Color.white);
        center_Panel.setPreferredSize(new java.awt.Dimension(100,100));
        
        north_Panel = new java.awt.Panel();
        north_Panel.setBackground(java.awt.Color.red);
        north_Panel.setPreferredSize(new java.awt.Dimension(100,200));
        
        south_Panel = new java.awt.Panel();
        south_Panel.setBackground(java.awt.Color.blue);
        south_Panel.setPreferredSize(new java.awt.Dimension(100,50));
        
        west_Panel = new java.awt.Panel();
        west_Panel.setBackground(java.awt.Color.green);
        west_Panel.setPreferredSize(new java.awt.Dimension(300,100));
        
        east_Panel = new java.awt.Panel();
        east_Panel.setBackground(java.awt.Color.yellow);
        east_Panel.setPreferredSize(new java.awt.Dimension(200,100));
        
        /* add panel at border layout */
        
        add(center_Panel, java.awt.BorderLayout.CENTER);
        add(north_Panel, java.awt.BorderLayout.NORTH);
        add(south_Panel, java.awt.BorderLayout.SOUTH);
        add(west_Panel, java.awt.BorderLayout.WEST);
        add(east_Panel, java.awt.BorderLayout.EAST);
    }
    
    public static void main(String args[])
    {
        new BorderLayout().setVisible(true);
    }
}

/*
Compiled from "BorderLayout.java"
public class java.awt.BorderLayout implements java.awt.LayoutManager2,java.io.Serializable {
  int hgap;
  int vgap;
  java.awt.Component north;
  java.awt.Component west;
  java.awt.Component east;
  java.awt.Component south;
  java.awt.Component center;
  java.awt.Component firstLine;
  java.awt.Component lastLine;
  java.awt.Component firstItem;
  java.awt.Component lastItem;
  public static final java.lang.String NORTH;
  public static final java.lang.String SOUTH;
  public static final java.lang.String EAST;
  public static final java.lang.String WEST;
  public static final java.lang.String CENTER;
  public static final java.lang.String BEFORE_FIRST_LINE;
  public static final java.lang.String AFTER_LAST_LINE;
  public static final java.lang.String BEFORE_LINE_BEGINS;
  public static final java.lang.String AFTER_LINE_ENDS;
  public static final java.lang.String PAGE_START;
  public static final java.lang.String PAGE_END;
  public static final java.lang.String LINE_START;
  public static final java.lang.String LINE_END;
  public java.awt.BorderLayout();
  public java.awt.BorderLayout(int, int);
  public int getHgap();
  public void setHgap(int);
  public int getVgap();
  public void setVgap(int);
  public void addLayoutComponent(java.awt.Component, java.lang.Object);
  public void addLayoutComponent(java.lang.String, java.awt.Component);
  public void removeLayoutComponent(java.awt.Component);
  public java.awt.Component getLayoutComponent(java.lang.Object);
  public java.awt.Component getLayoutComponent(java.awt.Container, java.lang.Object);
  public java.lang.Object getConstraints(java.awt.Component);
  public java.awt.Dimension minimumLayoutSize(java.awt.Container);
  public java.awt.Dimension preferredLayoutSize(java.awt.Container);
  public java.awt.Dimension maximumLayoutSize(java.awt.Container);
  public float getLayoutAlignmentX(java.awt.Container);
  public float getLayoutAlignmentY(java.awt.Container);
  public void invalidateLayout(java.awt.Container);
  public void layoutContainer(java.awt.Container);
  public java.lang.String toString();
}
*/

