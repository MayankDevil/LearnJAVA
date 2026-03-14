/*
-	programmer:Mayank
-	./Event.java
*/
class Event extends java.awt.Frame implements java.awt.event.ActionListener
{
	java.awt.Button b1, b2;

	Event()
	{
		setSize(300,300);
		setLayout(null);

		b1 = new java.awt.Button("Execute");
		b2 = new java.awt.Button("Close");

		b1.setBounds(50,50,200,100);
		b2.setBounds(50,150,200,100);

		b1.addActionListener(this);
		b2.addActionListener(this);

		add(b1);
		add(b2);
	}
	public static void main(String args[])
	{
		new Event().setVisible(true);
	}
	public void actionPerformed(java.awt.event.ActionEvent action_event)
	{
		if (action_event.getSource() == b1)
		{
			System.out.println("\t i am action of your reaction");
		}
		else
		{
			System.exit(0);
		}
	}
}
/*

Compiled from "EventObject.java"
public class java.util.EventObject implements java.io.Serializable {
  protected transient java.lang.Object source;
  public java.util.EventObject(java.lang.Object);
  public java.lang.Object getSource();
  public java.lang.String toString();
}

Compiled from "AWTEvent.java"
public abstract class java.awt.AWTEvent extends java.util.EventObject {
  protected int id;
  protected boolean consumed;
  transient boolean focusManagerIsDispatching;
  transient boolean isPosted;
  public static final long COMPONENT_EVENT_MASK;
  public static final long CONTAINER_EVENT_MASK;
  public static final long FOCUS_EVENT_MASK;
  public static final long KEY_EVENT_MASK;
  public static final long MOUSE_EVENT_MASK;
  public static final long MOUSE_MOTION_EVENT_MASK;
  public static final long WINDOW_EVENT_MASK;
  public static final long ACTION_EVENT_MASK;
  public static final long ADJUSTMENT_EVENT_MASK;
  public static final long ITEM_EVENT_MASK;
  public static final long TEXT_EVENT_MASK;
  public static final long INPUT_METHOD_EVENT_MASK;
  static final long INPUT_METHODS_ENABLED_MASK;
  public static final long PAINT_EVENT_MASK;
  public static final long INVOCATION_EVENT_MASK;
  public static final long HIERARCHY_EVENT_MASK;
  public static final long HIERARCHY_BOUNDS_EVENT_MASK;
  public static final long MOUSE_WHEEL_EVENT_MASK;
  public static final long WINDOW_STATE_EVENT_MASK;
  public static final long WINDOW_FOCUS_EVENT_MASK;
  public static final int RESERVED_ID_MAX;
  final java.security.AccessControlContext getAccessControlContext();
  public java.awt.AWTEvent(java.awt.Event);
  public java.awt.AWTEvent(java.lang.Object, int);
  public void setSource(java.lang.Object);
  public int getID();
  public java.lang.String toString();
  public java.lang.String paramString();
  protected void consume();
  protected boolean isConsumed();
  java.awt.Event convertToOld();
  void copyPrivateDataInto(java.awt.AWTEvent);
  void dispatched();
  static {};
}

Compiled from "ActionEvent.java"
public class java.awt.event.ActionEvent extends java.awt.AWTEvent {
  public static final int SHIFT_MASK;
  public static final int CTRL_MASK;
  public static final int META_MASK;
  public static final int ALT_MASK;
  public static final int ACTION_FIRST;
  public static final int ACTION_LAST;
  public static final int ACTION_PERFORMED;
  java.lang.String actionCommand;
  long when;
  int modifiers;
  public java.awt.event.ActionEvent(java.lang.Object, int, java.lang.String);
  public java.awt.event.ActionEvent(java.lang.Object, int, java.lang.String, int);
  public java.awt.event.ActionEvent(java.lang.Object, int, java.lang.String, long, int);
  public java.lang.String getActionCommand();
  public long getWhen();
  public int getModifiers();
  public java.lang.String paramString();
}


*/
