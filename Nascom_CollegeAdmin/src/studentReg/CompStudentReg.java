package studentReg;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.text.NumberFormatter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import extendedClasses.DateLabelFormatter;
import extraClasses.StatesReadFromFile;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CompStudentReg
{
	private final static int PIN_CODE = 6;
	private final static int MOB_DIGIT = 10;
	private static final int framex = 0;
	private static final int framey = 0;
	private static final int frameLength = 800;
	private static final int frameheigth = 500;
	private Color bgColor;
	
	private JFrame compStudentReg;
	
	// Components Declaration.
	// Section 1.
	private JTextPane section1Header;
	private JSeparator section1Separator;
	private JTextField stdFirstName;
	private JTextField stdMiddelName;
	private JTextField stdLastName;
	private UtilDateModel stdDOBDateModel;
	private JDatePanelImpl stdDOBDatePickerPanel;
	private JDatePickerImpl stdDOB;
	@SuppressWarnings("rawtypes")
	private JComboBox stdGender;
	private JTextField stdEmail;
	private JFormattedTextField stdMobNo;
	@SuppressWarnings("rawtypes")
	private JComboBox stdCategory;
	private JTextPane stdFirstNameTextPane;
	private JTextPane stdMiddleNameTextPane;
	private JTextPane stdLastNameTextPane;
	private JTextPane stdDOBTextPane;
	private JTextPane stdGenderTextPane;
	private JTextPane stdEmailTextPane;
	private JTextPane stdMobNoTextPane;
	private JTextPane stdCategoryTextPane;
	// Section 2.
	private JTextPane section2Header;
	private JSeparator section2Separator;
	@SuppressWarnings("rawtypes")
	private JComboBox stdAddState;
	@SuppressWarnings("rawtypes")
	private JComboBox stdAddCity;
	private JFormattedTextField stdAddPincode;
	private JTextField stdAddHome;
	private JTextPane stdAddStateTextPane;
	private JTextPane stdAddCityTextPane;
	private JTextPane stdAddPincodeTextPane;
	private JTextPane stdAddHomeTextPane;
	// Section 3.
	private JTextPane section3Header;
	private JCheckBox stdCorespChoice;
	private JSeparator section3Separator;
	@SuppressWarnings("rawtypes")
	private JComboBox stdCorespAddState;
	@SuppressWarnings("rawtypes")
	private JComboBox stdCorespAddCity;
	private JFormattedTextField stdCorespAddPincode;
	private JTextField stdCorespAddHome;
	private JTextPane stdCorespAddStateTextPane;
	private JTextPane stdCorespAddCityTextPane;
	private JTextPane stdCorespAddPincodeTextPane;
	private JTextPane stdCorespAddHomeTextPane;
	
	private JButton stdRegNextFrame;
	
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				CompStudentReg window = new CompStudentReg();
				window.compStudentReg.setVisible(true);
			}
		});
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public CompStudentReg()
	{
		bgColor = new Color(238, 238, 238);
		initializeFrame();
		initComponents();
		initListeners();
		associateFrameComponents();
	}
	
	private void associateFrameComponents()
	{		
		//Section 1.
		compStudentReg.getContentPane().add(section1Header);
		compStudentReg.getContentPane().add(section1Separator);
		compStudentReg.getContentPane().add(stdFirstNameTextPane);
		compStudentReg.getContentPane().add(stdFirstName);
		compStudentReg.getContentPane().add(stdMiddleNameTextPane);
		compStudentReg.getContentPane().add(stdMiddelName);
		compStudentReg.getContentPane().add(stdLastNameTextPane);
		compStudentReg.getContentPane().add(stdLastName);
		compStudentReg.getContentPane().add(stdDOBTextPane);
		compStudentReg.getContentPane().add(stdDOB);
		compStudentReg.getContentPane().add(stdGenderTextPane);
		compStudentReg.getContentPane().add(stdGender);
		compStudentReg.getContentPane().add(stdEmailTextPane);
		compStudentReg.getContentPane().add(stdEmail);
		compStudentReg.getContentPane().add(stdCategoryTextPane);
		compStudentReg.getContentPane().add(stdCategory);
		compStudentReg.getContentPane().add(stdMobNoTextPane);
		compStudentReg.getContentPane().add(stdMobNo);

		//Section 2.
		compStudentReg.getContentPane().add(section2Header);
		compStudentReg.getContentPane().add(section2Separator);
		compStudentReg.getContentPane().add(stdAddStateTextPane);
		compStudentReg.getContentPane().add(stdAddState);
		compStudentReg.getContentPane().add(stdAddCityTextPane);
		compStudentReg.getContentPane().add(stdAddCity);
		compStudentReg.getContentPane().add(stdAddPincodeTextPane);
		compStudentReg.getContentPane().add(stdAddPincode);
		compStudentReg.getContentPane().add(stdAddHomeTextPane);
		compStudentReg.getContentPane().add(stdAddHome);

		//Section 3.
		compStudentReg.getContentPane().add(section3Header);
		compStudentReg.getContentPane().add(stdCorespChoice);
		compStudentReg.getContentPane().add(section3Separator);
		compStudentReg.getContentPane().add(stdCorespAddStateTextPane);
		compStudentReg.getContentPane().add(stdCorespAddState);
		compStudentReg.getContentPane().add(stdCorespAddCityTextPane);
		compStudentReg.getContentPane().add(stdCorespAddCity);
		compStudentReg.getContentPane().add(stdCorespAddPincodeTextPane);
		compStudentReg.getContentPane().add(stdCorespAddPincode);
		compStudentReg.getContentPane().add(stdCorespAddHomeTextPane);
		compStudentReg.getContentPane().add(stdCorespAddHome);
		compStudentReg.getContentPane().add(stdRegNextFrame);
		
		compStudentReg.getRootPane().setDefaultButton(stdRegNextFrame);
		
		compStudentReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		compStudentReg.setResizable(false);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initComponents()
	{		
		//////////////////////////////////////////////////////////////////
		//////////////////////FIRST SECTION///////////////////////////////
		//////////////////////////////////////////////////////////////////
		section1Header = new JTextPane();
		section1Header.setFont(new Font("Dialog", Font.BOLD, 16));
		section1Header.setBounds(20, 25, 150, 20);
		section1Header.setBackground(bgColor);
		section1Header.setText("Personal Details");
		section1Header.setFocusable(false);
		section1Header.setEditable(false);
		section1Separator = new JSeparator(SwingConstants.HORIZONTAL);
		section1Separator.setBounds(0, 37, frameLength, 2);
		// First Row
		stdFirstNameTextPane = new JTextPane();
		stdFirstNameTextPane.setBounds(20, 60, 80, 20);
		stdFirstNameTextPane.setBackground(bgColor);
		stdFirstNameTextPane.setText("First Name");
		stdFirstNameTextPane.setFocusable(false);
		stdFirstNameTextPane.setEditable(false);
		stdFirstName = new JTextField();
		stdFirstName.setBounds(110, 60, 130, 20);
		stdFirstName.setColumns(10);
		
		stdMiddleNameTextPane = new JTextPane();
		stdMiddleNameTextPane.setBounds(270, 60, 90, 20);
		stdMiddleNameTextPane.setBackground(bgColor);
		stdMiddleNameTextPane.setText("Middle Name");
		stdMiddleNameTextPane.setFocusable(false);
		stdMiddleNameTextPane.setEditable(false);
		stdMiddelName = new JTextField();
		stdMiddelName.setBounds(360, 60, 130, 20);
		stdMiddelName.setColumns(10);

		stdLastNameTextPane = new JTextPane();
		stdLastNameTextPane.setBounds(520, 60, 80, 20);
		stdLastNameTextPane.setBackground(bgColor);
		stdLastNameTextPane.setText("Last Name");
		stdLastNameTextPane.setFocusable(false);
		stdLastNameTextPane.setEditable(false);
		stdLastName = new JTextField();
		stdLastName.setColumns(10);
		stdLastName.setBounds(610, 60, 130, 20);
		
		// Second Row
		stdDOBTextPane = new JTextPane();
		stdDOBTextPane.setBounds(20, 100, 80, 20);
		stdDOBTextPane.setBackground(bgColor);
		stdDOBTextPane.setText("DOB");
		stdDOBTextPane.setFocusable(false);
		stdDOBTextPane.setEditable(false);
		stdDOBDateModel = new UtilDateModel();
		Properties datePanelProperties = new Properties();
		datePanelProperties.put("text.today", "Today");
		datePanelProperties.put("text.month", "Month");
		datePanelProperties.put("text.year", "Year");
		stdDOBDatePickerPanel = new JDatePanelImpl(stdDOBDateModel, datePanelProperties);
		stdDOB = new JDatePickerImpl(stdDOBDatePickerPanel, new DateLabelFormatter() );
		stdDOB.setBounds(110, 100, 130, 25);
		
		stdGenderTextPane = new JTextPane();
		stdGenderTextPane.setBounds(270, 100, 80, 20);
		stdGenderTextPane.setBackground(bgColor);
		stdGenderTextPane.setText("Gender");
		stdGenderTextPane.setFocusable(false);
		stdGenderTextPane.setEditable(false);
		String[] stdGenderChoices = {"Select","Female","Male", "Transgender"};
		stdGender = new JComboBox(stdGenderChoices);
		stdGender.setBounds(360, 100, 130, 20);

		stdEmailTextPane = new JTextPane();
		stdEmailTextPane.setBounds(520, 100, 80, 20);
		stdEmailTextPane.setBackground(bgColor);
		stdEmailTextPane.setText("E-Mail");
		stdEmailTextPane.setFocusable(false);
		stdEmailTextPane.setEditable(false);
		stdEmail = new JTextField();
		stdEmail.setColumns(10);
		stdEmail.setBounds(610, 100, 130, 20);
		
		// Third Row.
		stdMobNoTextPane = new JTextPane();
		stdMobNoTextPane.setBounds(20, 140, 80, 20);
		stdMobNoTextPane.setBackground(bgColor);
		stdMobNoTextPane.setText("Moblie");
		stdMobNoTextPane.setFocusable(false);
		stdMobNoTextPane.setEditable(false);
		stdMobNo = new JFormattedTextField(returnFormatter(MOB_DIGIT));
		stdMobNo.setBounds(110, 140, 130, 20);

		stdCategoryTextPane = new JTextPane();
		stdCategoryTextPane.setBounds(270, 140, 80, 20);
		stdCategoryTextPane.setBackground(bgColor);
		stdCategoryTextPane.setText("Category");
		stdCategoryTextPane.setFocusable(false);
		stdCategoryTextPane.setEditable(false);
		String[] stdCategoryChoices = {"Select","GEN","OBC(Creamy)", "OBC(Non-Creamy)", "SC", "ST"};
		stdCategory = new JComboBox(stdCategoryChoices);
		stdCategory.setBounds(360, 140, 130, 20);
		
		//////////////////////////////////////////////////////////////////
		//////////////////////SECOND SECTION//////////////////////////////
		//////////////////////////////////////////////////////////////////
		section2Header = new JTextPane();
		section2Header.setFont(new Font("Dialog", Font.BOLD, 16));
		section2Header.setBounds(20, 180, 130, 20);
		section2Header.setBackground(bgColor);
		section2Header.setText("Postal Details");
		section2Header.setFocusable(false);
		section2Header.setEditable(false);
		section2Separator = new JSeparator(SwingConstants.HORIZONTAL);
		section2Separator.setBounds(0, 192, frameLength, 2);
		// First Row
		stdAddStateTextPane = new JTextPane();
		stdAddStateTextPane.setBounds(20, 215, 80, 20);
		stdAddStateTextPane.setBackground(bgColor);
		stdAddStateTextPane.setText("State");
		stdAddStateTextPane.setFocusable(false);
		stdAddStateTextPane.setEditable(false);
		String[] stdAddStatesChoices = StatesReadFromFile.getStates();
		stdAddState = new JComboBox(stdAddStatesChoices);
		stdAddState.setBounds(110, 215, 130, 20);
		
		stdAddCityTextPane = new JTextPane();
		stdAddCityTextPane.setBounds(270, 215, 90, 20);
		stdAddCityTextPane.setBackground(bgColor);
		stdAddCityTextPane.setText("City");
		stdAddCityTextPane.setFocusable(false);
		stdAddCityTextPane.setEditable(false);
		stdAddCity = new JComboBox();
		stdAddCity.setBounds(360, 215, 130, 20);

		stdAddPincodeTextPane = new JTextPane();
		stdAddPincodeTextPane.setBounds(520, 215, 80, 20);
		stdAddPincodeTextPane.setBackground(bgColor);
		stdAddPincodeTextPane.setText("Pin Code");
		stdAddPincodeTextPane.setFocusable(false);
		stdAddPincodeTextPane.setEditable(false);
		stdAddPincode = new JFormattedTextField(returnFormatter(PIN_CODE));
		stdAddPincode.setColumns(10);
		stdAddPincode.setBounds(610, 215, 130, 20);
		
		// Second Row
		stdAddHomeTextPane = new JTextPane();
		stdAddHomeTextPane.setBounds(20, 255, 80, 20);
		stdAddHomeTextPane.setBackground(bgColor);
		stdAddHomeTextPane.setText("Address");
		stdAddHomeTextPane.setFocusable(false);
		stdAddHomeTextPane.setEditable(false);
		stdAddHome = new JTextField();
		stdAddHome.setBounds(110, 255, 300, 20);
		
		//////////////////////////////////////////////////////////////////
		//////////////////////THIRD SECTION//////////////////////////////
		//////////////////////////////////////////////////////////////////
		section3Header = new JTextPane();
		section3Header.setFont(new Font("Dialog", Font.BOLD, 16));
		section3Header.setBounds(20, 295, 280, 20);
		section3Header.setBackground(bgColor);
		section3Header.setText("Correspondence Postal Details");
		section3Header.setFocusable(false);
		section3Header.setEditable(false);
		stdCorespChoice = new JCheckBox("Same as Above");
		stdCorespChoice.setBounds(500, 295, 140, 20);
		section3Separator = new JSeparator(SwingConstants.HORIZONTAL);
		section3Separator.setBounds(0, 307, frameLength, 2);
		// First Row
		stdCorespAddStateTextPane = new JTextPane();
		stdCorespAddStateTextPane.setBounds(20, 330, 80, 20);
		stdCorespAddStateTextPane.setBackground(bgColor);
		stdCorespAddStateTextPane.setText("State");
		stdCorespAddStateTextPane.setFocusable(false);
		stdCorespAddStateTextPane.setEditable(false);
		stdCorespAddState = new JComboBox(stdAddStatesChoices);
		stdCorespAddState.setBounds(110, 330, 130, 20);
		
		stdCorespAddCityTextPane = new JTextPane();
		stdCorespAddCityTextPane.setBounds(270, 330, 90, 20);
		stdCorespAddCityTextPane.setBackground(bgColor);
		stdCorespAddCityTextPane.setText("City");
		stdCorespAddCityTextPane.setFocusable(false);
		stdCorespAddCityTextPane.setEditable(false);
		stdCorespAddCity = new JComboBox();
		stdCorespAddCity.setBounds(360, 330, 130, 20);

		stdCorespAddPincodeTextPane = new JTextPane();
		stdCorespAddPincodeTextPane.setBounds(520, 330, 80, 20);
		stdCorespAddPincodeTextPane.setBackground(bgColor);
		stdCorespAddPincodeTextPane.setText("Pin Code");
		stdCorespAddPincodeTextPane.setFocusable(false);
		stdCorespAddPincodeTextPane.setEditable(false);
		stdCorespAddPincode = new JFormattedTextField(returnFormatter(PIN_CODE));
		stdCorespAddPincode.setColumns(10);
		stdCorespAddPincode.setBounds(610, 330, 130, 20);
		
		// Second Row
		stdCorespAddHomeTextPane = new JTextPane();
		stdCorespAddHomeTextPane.setBounds(20, 370, 80, 20);
		stdCorespAddHomeTextPane.setBackground(bgColor);
		stdCorespAddHomeTextPane.setText("Address");
		stdCorespAddHomeTextPane.setFocusable(false);
		stdCorespAddHomeTextPane.setEditable(false);
		stdCorespAddHome = new JTextField();
		stdCorespAddHome.setBounds(110, 370, 300, 20);
		
		
		stdRegNextFrame = new JButton("New button");
		stdRegNextFrame.setText("Continue");
		stdRegNextFrame.setBounds(((frameLength/2)-60), 432, 120, 25);
	}
	
	private void initListeners()
	{
		//////////////////////////////////////////////////////////////////////
		//////////////////////////////Listner's///////////////////////////////
		//////////////////////////////////////////////////////////////////////
		stdCorespChoice.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if( stdCorespChoice.isSelected() )
				{
					stdCorespAddState.setEnabled(false);
					stdCorespAddCity.setEnabled(false);
					stdCorespAddHome.setEnabled(false);
					stdCorespAddPincode.setEnabled(false);
					
					stdCorespAddState.setSelectedIndex(stdAddState.getSelectedIndex());
					stdCorespAddCity.setSelectedIndex(stdAddCity.getSelectedIndex());
					stdCorespAddHome.setText(stdAddHome.getText());
					stdCorespAddPincode.setText(stdAddPincode.getText());
				}
				else
				{
					stdCorespAddState.setSelectedIndex(0);
					stdCorespAddHome.setText(null);
					stdCorespAddPincode.setText(null);
					
					stdCorespAddCity.setEnabled(true);
					stdCorespAddHome.setEnabled(true);
					stdCorespAddPincode.setEnabled(true);
					stdCorespAddState.setEnabled(true);
				}
			}
		});
		
		stdMobNo.addKeyListener(new KeyAdapter()
		{
			@Override
			public void keyReleased(KeyEvent arg0)
			{
				if( arg0.getKeyCode() == KeyEvent.VK_BACK_SPACE )
				{
					if( stdMobNo.getText().length() == 1 )
					{
						stdMobNo.setText("0");
					}
				}
			}
		});

		// Button Registration Listener.
		stdRegNextFrame.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				Date selectedDate = (Date) stdDOB.getModel().getValue();
				if( stdFirstName.getText().equals("") || stdLastName.getText().equals("") || 
						stdGender.getSelectedIndex() == 0 || selectedDate == null ||
						stdEmail.getText().equals("") || stdMobNo.getText().equals("") || 
						stdCorespAddCity.getSelectedIndex() == 0 )
				{
					JOptionPane.showMessageDialog(null, "Complete Personal Details");
					return;
				}
				if( stdMobNo.getText().length() != 10 )
				{
					JOptionPane.showMessageDialog(null, "Invalid Mobile Number");
					return;
				}
				if( stdAddState.getSelectedIndex() == 0 || stdAddCity.getSelectedIndex() == 0 ||
						stdAddHome.getText().equals("") || stdAddPincode.getText().equals("") )
				{
					JOptionPane.showMessageDialog(null, "Complete Postal Details");
					return;
				}
				if( stdCorespAddState.getSelectedIndex() == 0 || stdCorespAddCity.getSelectedIndex() == 0 ||
						stdCorespAddHome.getText().equals("") || stdCorespAddPincode.getText().equals("") )
				{
					JOptionPane.showMessageDialog(null, "Complete Correspondence Postal Details");
					return;
				}
				
				CompStudentReg1 reg = new CompStudentReg1();
				reg.compStudentReg1.setVisible(true);
				compStudentReg.dispose();
			}
		});
	}
	
	private void initializeFrame()
	{
		compStudentReg = new JFrame("Student Registration");
		compStudentReg.setBounds(framex, framey, frameLength, frameheigth);
		compStudentReg.setBackground(bgColor);
		compStudentReg.getContentPane().setLayout(null);
		compStudentReg.setVisible(true);
	}
	
	private NumberFormatter returnFormatter(int maxallowed)
	{
		NumberFormat longFormat = NumberFormat.getIntegerInstance(Locale.getDefault());
		longFormat.setGroupingUsed(false);
		longFormat.setMaximumFractionDigits(0);
		NumberFormatter numberFormatter = new NumberFormatter(longFormat);
		numberFormatter.setMaximum(9999999999l);
		numberFormatter.setAllowsInvalid(false);
		
		return numberFormatter;
	}
}
