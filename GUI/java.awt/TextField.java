/*
-   programmer:Mayank
-   ./GUI/Field.java
*/

class MyFrame extends java.awt.Frame
{
    MyFrame()
    {
        setSize(300,100);
        setLayout(null);
        setVisible(true);
        
        java.awt.TextField text_field = new java.awt.TextField();
        
        text_field.setBounds(50,10,200,80);
        
        text_field.setText("Welcome Mayank");
        
        if (text_field.isEditable()) text_field.setEditable(false);
        
        /* isEditable return boolean & setEditable help to set */
        
        System.out.println(text_field.getText());
        
        /* return java.awt.String : return text_field all value */
        
        // text_field.setCaretPosition(3);
        
        /* return void : set position of caret in text_field */
        
        // text_field.getCaretPosition();
        
        /* return int : get position of caret in text_field */
        
        // text_field.setSelectionEnd(1);
        
        /* return void & arugment int : select text at end */
        
        // text_field.setSelectionStart(1);
        
        /* return void & arugment int : select text at start */
        
        text_field.selectAll();
        
        add(text_field);
    }
}

class Test
{
    public static void main(String args[])
    {
        new MyFrame();
        
        System.out.println("execute");
    }
}

/*Compiled from "TextField.java"
public class java.awt.TextField extends java.awt.TextComponent {
  int columns;
  char echoChar;
  transient java.awt.event.ActionListener actionListener;
  public java.awt.TextField() throws java.awt.HeadlessException;
  public java.awt.TextField(java.lang.String) throws java.awt.HeadlessException;
  public java.awt.TextField(int) throws java.awt.HeadlessException;
  public java.awt.TextField(java.lang.String, int) throws java.awt.HeadlessException;
  java.lang.String constructComponentName();
  public void addNotify();
  public char getEchoChar();
  public void setEchoChar(char);
  public synchronized void setEchoCharacter(char);
  public void setText(java.lang.String);
  public boolean echoCharIsSet();
  public int getColumns();
  public void setColumns(int);
  public java.awt.Dimension getPreferredSize(int);
  public java.awt.Dimension preferredSize(int);
  public java.awt.Dimension getPreferredSize();
  public java.awt.Dimension preferredSize();
  public java.awt.Dimension getMinimumSize(int);
  public java.awt.Dimension minimumSize(int);
  public java.awt.Dimension getMinimumSize();
  public java.awt.Dimension minimumSize();
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
