package gui;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities; 
import javax.swing.UIManager;

public final class HelloWorld implements Runnable {

    public static void main(String[] args) {
/*
 *  https://ru.wikipedia.org/wiki/Swing
 */
    	
    	
        // Swing ����� ����������� ����������� ����� (�.�. dispatching thread),
        // ������� �������� ����������� � �������� (���������, � ������� ����������� main())
        // �������. ��� �������� ��� ���� �������� ����� �������� ������ (����� main ����������),
        // ����� ���������� �� ������ Swing-���������� ����� ���������� ���� ������. 
        // � ���� ���� ������������ ������ ��� ����, ��������� ��������� ���� ������ 
        // (�� ��� ���, ���� ��� ������ �����). ������� � Java 6, ����� ��� ���������� ����������,
        // ����������� ����������� ����� ��������������� �������������.
        // 
        // ��������� ���� ���, ���������� � �����������, � ����������� ������, ���� �������������:
        SwingUtilities.invokeLater (new HelloWorld());
 	   try {
	      // UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	       UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");    	       
	   } 
	   catch (Exception e) {
	   //Exception handle
	   }

    } 

    public void run() {

        // ������� ���� � ���������� "Hello, World!"

        JFrame f = new JFrame ("Hello, World!");

        // ����� �������������� ���������: ���������� listener � ���������������
        // �� ���������� �������� ����, ������� ���������� �� windowClosing() 
        // �������������� ���������� ����������� ������ ������� System.exit()
        // ������ �� ���� ����� "����������" ������ ������ ������� �� �������� ����.
        // ������ ������ ���������� ������� ����, �� �� ������������� ����������. ���
        // ����� ���������� ����� �������� ���� �� ����� ������� ��� ����.

        f.setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE);

        // ������ ����� ������ � ���:
        //            f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        // ��������� �� ������ ���� ��������������� ��������� � �������.
 
        //f.getContentPane().add (new JLabel("Hello, World!")); - ������ �����
        f.add(new JLabel("Hello World"));
 
        // pack() "�����������" ���� �� ������������ �������, ������������� �� ��������� �������� 
        // ���� ������������� � ��� �����������.

        f.pack();

        // �������� ����

        f.setVisible(true);
    }
}
/*
����� ���� ���������� � ������� Look-And-Feel:

try { 
   UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
   SwingUtilities.updateComponentTreeUI(this); 
}
catch (Exception e){
   System.out.println("������ ��� �������� Metal-Look-And-Feel");
}

������������� ���������� Look-And-Feel:

//���������� �������, ��� ��������� L&F ���������� ������ ���� ��������� �� 
//������������� �����-���� ����������� Swing, ����� ��� ����� ���� ����������������
//Java L&F, ���������� �� ����, ����� L&F �� �����������.
public static void main(String[] args) {
   try {
       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
   } 
   catch (Exception e) {
   //Exception handle
   }
*/