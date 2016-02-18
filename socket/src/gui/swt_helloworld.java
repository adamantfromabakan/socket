package gui;
import org.eclipse.swt.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;

public class swt_helloworld {
	public static void main (String[] args) {
	      Display display = new Display();
	      Shell shell = new Shell(display);
	      Label label = new Label(shell, SWT.NONE);
	      label.setText("Hello World");
	      label.pack();
			Button test = new Button(shell, SWT.NONE);
			test.setText("test");
			test.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					System.out.println("OK");
				}
			})	;      
	      shell.pack();
	      shell.open();
	      while (!shell.isDisposed()) {
	          if (!display.readAndDispatch ()) display.sleep (); 
	      } 
	      display.dispose ();
	   }
}
