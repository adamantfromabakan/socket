package gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import  org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import  org.eclipse.swt.widgets.Shell;

public class  SwtHello {
    public static  void  main(String[] args) {
      //Создаем объект Display для связи SWT
      //С дисплеем операционной системы
        Display display =  new  Display () ;
        //Создаем окно программы
        Shell shell =  new  Shell(display);
        shell.setText( "SWT Hello" );
        shell.setSize ( 800 ,  600 );
//

        new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);     
        Label lblHello = new Label(shell, SWT.NONE);           
        lblHello.setText("Simple Label");
        new Label(shell, SWT.SEPARATOR | SWT.HORIZONTAL);    
        shell.setLayout(new GridLayout());    
        Label lblDuke = new Label(shell, SWT.NONE);
   /*     lblDuke.setImage(new Image(Display.getCurrent(), getClass()
                    .getResourceAsStream("/by/bs/swt/images/duke_waving.gif")));*/
        shell.pack();
//        
        
       shell.open();
        //Обработка закрытия окна
        while  (!shell.isDisposed()) {
          if  (!display.readAndDispatch()) {
                display.sleep();
           }
       }
        //Ресурсы операционной системы
        //должны быть освобождены 
        display.dispose();
   }
} 