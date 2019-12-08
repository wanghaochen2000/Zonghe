package Dota;

import java.io.*; 

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JTree;
import javax.swing.JComboBox;

public class Wsss extends JFrame {
	private static BufferedWriter bw;
	private JPanel contentPane;
	private JTextField textField;
	static String[] b;
    private JLabel label_1;
   // public char array;
    private JTextField textField_1;
	static ArrayList<Course> array=new ArrayList<Course>();
	private static students a;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Wsss() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5F00\u8BFE");
		label.setBounds(20, 96, 62, 46);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(75, 105, 192, 30);

		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				b=textField.getText().split(",", 4);
				students a= new students(b[0],b[1],b[2],b[3]);
			    a.displayCourse();
			}
		});
		button.setBounds(292, 102, 102, 34);
		contentPane.add(button);
		
		label_1 = new JLabel("\u9009\u8BFE");
		label_1.setBounds(29, 145, 53, 55);
		contentPane.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(75, 157, 189, 30);
		comboBox.addItem("数学");
		comboBox.addItem("语文");
		comboBox.addItem("英语");
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("确认");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(290, 157, 104, 30);
		contentPane.add(btnNewButton);
		
		JButton button_1 = new JButton("确认");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(290, 205, 104, 30);
		contentPane.add(button_1);
		
		JLabel label_2 = new JLabel("\u9000\u8BFE");
		label_2.setBounds(23, 203, 44, 34);
		contentPane.add(label_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(77, 208, 190, 25);
		contentPane.add(comboBox_1);
		
		JButton button_2 = new JButton("\u6253\u5370\u8BFE\u8868");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(array+"ds");
			}
		});
		button_2.setBounds(29, 259, 378, 27);
		contentPane.add(button_2);
		
		JLabel label_3 = new JLabel("\u5B66\u751F\u6CE8\u518C");
		label_3.setBounds(10, 35, 57, 46);
		contentPane.add(label_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(81, 48, 186, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button_3 = new JButton("\u786E\u5B9A");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button_3.setBounds(292, 47, 93, 30);
		contentPane.add(button_3);
	}
	public static void main(String[] args) throws IOException {
		students a= new students("1231","小明","man","21");
		students stu1 = new students("1332","小黄","man","19");
		teacher e=new teacher("1534","董老师","man","30","物理");
		teacher f=new teacher("2132","王老师","man","35","高数");
		Course d=new Course("2018310123","物理","综合楼","下午","9","董老师");
		Course c=new Course("2018310765","高数","教学楼","晚上","8","王老师");
		array.add(d);
		array.add(c);
	    a.addCourse(d);
		a.displayCourse();
		System.out.println(array);
		System.out.println(b);
		//a.removeCourse(d);
		//System.out.println(array);
		 File f1 = new File("D:\\123.txt");
		bw = new BufferedWriter(new FileWriter(f1)); 
		//bw.write(array);	    
		bw.close();
		
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wsss frame = new Wsss();
					frame.setVisible(true);	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
     //a.displayCourse();
	}
}
