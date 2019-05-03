package se_GPA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SE_GPA {

	private JFrame frame;
	private JTextField sem1_GPA;
	private JTextField sem2_GPA;
	private JTextField total_GPA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SE_GPA window = new SE_GPA();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SE_GPA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1370, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1354, 34);
		frame.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnFile);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnFile.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mntmNewMenuItem_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnFile.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mntmNewMenuItem_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnFile.add(mntmNewMenuItem_2);
		
		JMenu mnNew = new JMenu("New1");
		mnNew.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNew);
		
		JMenu mnNew_1 = new JMenu("New2");
		mnNew_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNew_1);
		
		JMenu mnNew_2 = new JMenu("New3");
		mnNew_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNew_2);
		
		JMenu mnNew_3 = new JMenu("New4");
		mnNew_3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNew_3);
		
		JMenu mnNew_4 = new JMenu("Exit");
		mnNew_4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnNew_4);
		
		JLabel lblSeGpaCalculator = new JLabel("SE GPA Calculator");
		lblSeGpaCalculator.setBounds(385, 45, 637, 85);
		lblSeGpaCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeGpaCalculator.setFont(new Font("Tahoma", Font.BOLD, 70));
		frame.getContentPane().add(lblSeGpaCalculator);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 133, 1354, 558);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Level 01", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblSemester = new JLabel("Semester 01");
		lblSemester.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSemester.setBounds(157, 11, 203, 41);
		panel.add(lblSemester);
		
		JLabel txt_PMAT_01 = new JLabel("PMAT 11212 Discrete Mathematics for Computing I ");
		txt_PMAT_01.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_PMAT_01.setBounds(10, 382, 465, 41);
		panel.add(txt_PMAT_01);
		
		JLabel txt_SENG_Fundamentals = new JLabel("SENG 11213 Fundamentals of Computing");
		txt_SENG_Fundamentals.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_SENG_Fundamentals.setBounds(13, 190, 465, 41);
		panel.add(txt_SENG_Fundamentals);
		
		JComboBox btn_SENG_Fundamentals_Grade = new JComboBox();
		btn_SENG_Fundamentals_Grade.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_SENG_Fundamentals_Grade.setModel(new DefaultComboBoxModel(new String[] {"Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"}));
		btn_SENG_Fundamentals_Grade.setBounds(490, 188, 97, 45);
		panel.add(btn_SENG_Fundamentals_Grade);
		
		JComboBox btn_SENG_Statistics_Grade = new JComboBox();
		btn_SENG_Statistics_Grade.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_SENG_Statistics_Grade.setModel(new DefaultComboBoxModel(new String[] {"Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"}));
		btn_SENG_Statistics_Grade.setBounds(490, 128, 97, 45);
		panel.add(btn_SENG_Statistics_Grade);
		
		JLabel lblGpa = new JLabel("GPA");
		lblGpa.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblGpa.setBounds(13, 68, 111, 51);
		panel.add(lblGpa);
		
		//*********************Level 01 Semester 01 GPA***********************
		sem1_GPA = new JTextField();
		sem1_GPA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		sem1_GPA.setFont(new Font("Tahoma", Font.BOLD, 40));
		sem1_GPA.setBounds(157, 68, 140, 51);
		panel.add(sem1_GPA);
		sem1_GPA.setColumns(10);
		
		JLabel txt_SENG_Programming_Concepts = new JLabel("SENG 11223 Programming Concepts");
		txt_SENG_Programming_Concepts.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_SENG_Programming_Concepts.setBounds(13, 252, 465, 41);
		panel.add(txt_SENG_Programming_Concepts);
		
		JLabel txt_SENG_Engineering_Foundation = new JLabel("SENG 11232 Engineering Foundation");
		txt_SENG_Engineering_Foundation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_SENG_Engineering_Foundation.setBounds(13, 316, 465, 41);
		panel.add(txt_SENG_Engineering_Foundation);
		
		JLabel txt_SENG_Statistics = new JLabel("SENG 11243 Statistics");
		txt_SENG_Statistics.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_SENG_Statistics.setBounds(13, 130, 465, 41);
		panel.add(txt_SENG_Statistics);
		
		JLabel txt_DELT_01 = new JLabel("DELT 11212 English for Professionals");
		txt_DELT_01.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_DELT_01.setBounds(13, 446, 465, 41);
		panel.add(txt_DELT_01);
		
		JComboBox btn_SENG_Programming_Concepts_Grade = new JComboBox();
		btn_SENG_Programming_Concepts_Grade.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_SENG_Programming_Concepts_Grade.setModel(new DefaultComboBoxModel(new String[] {"Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"}));
		btn_SENG_Programming_Concepts_Grade.setBounds(490, 250, 97, 45);
		panel.add(btn_SENG_Programming_Concepts_Grade);
		
		JComboBox btn_SENG_Engineering_Foundation_Grade = new JComboBox();
		btn_SENG_Engineering_Foundation_Grade.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_SENG_Engineering_Foundation_Grade.setModel(new DefaultComboBoxModel(new String[] {"Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"}));
		btn_SENG_Engineering_Foundation_Grade.setBounds(490, 314, 97, 45);
		panel.add(btn_SENG_Engineering_Foundation_Grade);
		
		JComboBox btn_PMAT_01_Grade = new JComboBox();
		btn_PMAT_01_Grade.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_PMAT_01_Grade.setModel(new DefaultComboBoxModel(new String[] {"Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"}));
		btn_PMAT_01_Grade.setBounds(490, 380, 97, 45);
		panel.add(btn_PMAT_01_Grade);
		
		JComboBox btn_DELT_01_Grade = new JComboBox();
		btn_DELT_01_Grade.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_DELT_01_Grade.setModel(new DefaultComboBoxModel(new String[] {"Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"}));
		btn_DELT_01_Grade.setBounds(490, 444, 97, 45);
		panel.add(btn_DELT_01_Grade);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(653, 11, 2, 508);
		panel.add(separator);
		
		JLabel lblSemester_1 = new JLabel("Semester 02");
		lblSemester_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSemester_1.setBounds(886, 11, 203, 41);
		panel.add(lblSemester_1);
		
		JLabel label_5 = new JLabel("GPA");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 40));
		label_5.setBounds(730, 68, 111, 51);
		panel.add(label_5);
		
		sem2_GPA = new JTextField();
		sem2_GPA.setFont(new Font("Tahoma", Font.BOLD, 40));
		sem2_GPA.setColumns(10);
		sem2_GPA.setBounds(886, 68, 140, 51);
		panel.add(sem2_GPA);
		
		JLabel txt_SENG_DSA = new JLabel("SENG 12213 Data Structures and Algorithms ");
		txt_SENG_DSA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_SENG_DSA.setBounds(730, 130, 476, 41);
		panel.add(txt_SENG_DSA);
		
		JLabel txt_SENG_DBMS = new JLabel("SENG 12223 Database Design & Development ");
		txt_SENG_DBMS.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_SENG_DBMS.setBounds(730, 190, 476, 41);
		panel.add(txt_SENG_DBMS);
		
		JLabel txt_SENG_OOP = new JLabel("SENG 12233 Object Oriented Programming");
		txt_SENG_OOP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_SENG_OOP.setBounds(730, 252, 476, 41);
		panel.add(txt_SENG_OOP);
		
		JLabel txt_SENG_Management_01 = new JLabel("SENG 12242 Management for Software Engineering I ");
		txt_SENG_Management_01.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_SENG_Management_01.setBounds(730, 316, 476, 41);
		panel.add(txt_SENG_Management_01);
		
		JLabel txt_PMAT_02 = new JLabel("PMAT 12212 Discrete Mathematics for Computing II ");
		txt_PMAT_02.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_PMAT_02.setBounds(730, 382, 476, 41);
		panel.add(txt_PMAT_02);
		
		JLabel txt_DELT_02 = new JLabel("DELT 12212 Communication Skills for Professionals");
		txt_DELT_02.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txt_DELT_02.setBounds(730, 446, 476, 41);
		panel.add(txt_DELT_02);
		
		JComboBox btn_SENG_DSA_Grade = new JComboBox();
		btn_SENG_DSA_Grade.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_SENG_DSA_Grade.setModel(new DefaultComboBoxModel(new String[] {"Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"}));
		btn_SENG_DSA_Grade.setBounds(1221, 128, 97, 45);
		panel.add(btn_SENG_DSA_Grade);
		
		JComboBox btn_SENG_DBMS_Grade = new JComboBox();
		btn_SENG_DBMS_Grade.setModel(new DefaultComboBoxModel(new String[] {"Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"}));
		btn_SENG_DBMS_Grade.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_SENG_DBMS_Grade.setBounds(1221, 188, 97, 45);
		panel.add(btn_SENG_DBMS_Grade);
		
		JComboBox btn_SENG_OOP_Grade = new JComboBox();
		btn_SENG_OOP_Grade.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_SENG_OOP_Grade.setModel(new DefaultComboBoxModel(new String[] {"Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"}));
		btn_SENG_OOP_Grade.setBounds(1221, 250, 97, 45);
		panel.add(btn_SENG_OOP_Grade);
		
		JComboBox btn_SENG_Management_01_Grade = new JComboBox();
		btn_SENG_Management_01_Grade.setModel(new DefaultComboBoxModel(new String[] {"Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"}));
		btn_SENG_Management_01_Grade.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_SENG_Management_01_Grade.setBounds(1221, 314, 97, 45);
		panel.add(btn_SENG_Management_01_Grade);
		
		JComboBox btn_PMAT_02_Grade = new JComboBox();
		btn_PMAT_02_Grade.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_PMAT_02_Grade.setModel(new DefaultComboBoxModel(new String[] {"Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"}));
		btn_PMAT_02_Grade.setBounds(1221, 380, 97, 45);
		panel.add(btn_PMAT_02_Grade);
		
		JComboBox btn_DELT_02_Grade = new JComboBox();
		btn_DELT_02_Grade.setModel(new DefaultComboBoxModel(new String[] {"Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E"}));
		btn_DELT_02_Grade.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn_DELT_02_Grade.setBounds(1221, 444, 97, 45);
		panel.add(btn_DELT_02_Grade);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Level 02", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Level 03", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Level 04", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel label_12 = new JLabel("GPA");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 40));
		label_12.setBounds(10, 60, 111, 51);
		frame.getContentPane().add(label_12);
		
		total_GPA = new JTextField();
		total_GPA.setFont(new Font("Tahoma", Font.BOLD, 40));
		total_GPA.setColumns(10);
		total_GPA.setBounds(160, 60, 140, 51);
		frame.getContentPane().add(total_GPA);
	}
}
