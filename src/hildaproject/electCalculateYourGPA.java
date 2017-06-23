package hildaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.lang.*;



public class electCalculateYourGPA extends JFrame

{


	//to display grade and credit hour in combo box
	private String[] grd={"Grade","A","B","C","D","F"};
	private String[] crh={"Credit Unit","1","2","3","4","5","6"};
	private String[] prg={"Program","HC00 - Software Engineering","HC05 - System Management & Networking","HK01 - Civil Engineering",
							"HK02 - Electric & Electronic Engineering","HK03 - Chemical Engineering",
							"HK08 - Mechanical Engineering","HK20 - Computer Engineering"};
  	private String[] sub={"Courses","GENERAL INORGANIC CHEMISTRY","PHILOSOPHY, LOGIC & CONFLICT RESOLUTION","USE OF LIBRARY I","COMMUNICATION IN ENGLISH","GENERAL PHYSICS I","EXPERIMENTAL PHYSICS I","DATA ANALYSIS","GENERAL MATHEMATICS I","PRACTICAL CHEMISTRY","GENERAL PHYSICAL CHEMISTRY","COMMUNICATION IN ENGLISH II","AFRICAN CULTURE AND CIVILIZATION","EXPERIMENTAL PHYSICS II","HEAT AND PROPERTIES OF MATTER","GENERAL PHYSICS II","VECTORS AND DYNAMICS","GENERAL MATHEMATICS II","PRACTICAL CHEMISTRY","GENERAL ORGANIC CHEMISTRY","BASIC MANUFACTURING TECHNOLOGY","ENGINEERING LABORATORY I","FLUID MECHANICS I","ENGINEERING MATERIALS","BASIC THERMODYNAMICS","ENGINEERING MECHANICS I","ENGINEERING DRAWING I","MATHEMATICAL ANALYSIS","BASIC ELECTRICAL ENGINEERING","COMPUTER PROGRAMMING","BASIC CIVIL ENGINEERING","ENGINEERING LABORATORY II","STRENGTH OF MATERIALS I","ENGINEERING MECHANICS II","BASIC WORKSHOP PRACTICE","ENGINEERING DRAWING II","INFORMATION TECHNOLOGY IN ENGINEERING","BASIC ELECTRICAL ENGINEERING II","ENGINEER IN SOCIETY","LINEAR ALGEBRA AND ANALYTICAL GEOMETRY","LABORATORY","ENTREPRENEURIAL STUDIES","DIFFERENTIAL EQUATIONS","DIGITAL SYSTEMS FUNDAMENTALS","ELECTRICAL MACHINES I","PHYSICAL ELECTRONICS","ELECTROMAGNETIC FIELD AND WAVES I","CIRCUIT THEORY I","LABORATORY","ENGINEERING ENTERPRENEURSHIP","TECHNICAL WRITING AND SEMINAR","APPLIED ELECTRONICS I","ELECTROMAGNETIC FIELD & WAVES II","ELECTRIC POWER SYSTEMS PRINCIPLES","CIRCUIT THEORY II","MEASUREMENT AND INSTRUMENTATION","PROBABILITY AND STATISTICS","FIRE AND SAFTY ENGINEERING","LABORATORY/ WORKSHOP PRACTICE","INTRODUCTION TO OIL AND GAS PRODUCTION FACILITIES I","APPLIED ELECTRONICS II","INTRODUCTION TO PETROLEUM ENGINEERING","COMMUNICATION PRINCIPLES","CONTROL SYSTEMS ENGINEERING I","ADVANCED COMPUTER PROGRAMMING","ELECTRICAL MACHINES II","NUMERICAL METHODS AND COMPUTER APPLICATIONS","STUDENTS WORK EXPERIENCE PROGRAMME (SWEP) -6 MONTHS","MECHATRONICS I","INTRODUCTION TO OIL AND GAS FACILITIES II","ELECTRICAL SERVICE DESIGN","RENEWABLE ENERGY","SOFTWARE ENGINEERING","ENGINEERING MANAGEMENT AND LAW","ADVANCED CIRCUIT TECHNIQUES","RELIABILITY AND MAINTAINABILITY OF COMPONENTS & SYSTEMS","CONTROL SYSTEMS ENGINEERING II","SEMINAR AND PROJECT","ENGINEERING ECONOMICS","INDUSTRIAL AUTOMATION","MECHATRONICS II","ARTIFICIAL INTELLIGENCE AND ROBOTICS"};


	//default value for credit hour and grade for evaluation
	private final String defaultCredit="Credit Hour";
	private final String defaultGrade="Grade";
	private final String defaultProgram="Program";
	private final String defaultCourses="Courses";
	private JButton calcButton,clearButton;

        


    //JLabel that display the label for the text field
    private JLabel 	nameDisplay,
    				matrixNoDisplay,
    				semDisplay,
     				messageDisplay;

    //JTextField for the appropriate input
    private JTextField  nameField,
    					matrixNoField,
    					semField;

	//JComboBox for the grade and credit hour
    private JComboBox	gradeBox,
    					gradeBox1,
    					gradeBox2,
    					gradeBox3,
    					gradeBox4,
    					gradeBox5,
    					gradeBox6,
    					gradeBox7,
    					gradeBox8,
    					gradeBox9,

    					creditsBox,
    					creditsBox1,
    					creditsBox2,
    					creditsBox3,
    					creditsBox4,
    					creditsBox5,
    					creditsBox6,
    					creditsBox7,
    					creditsBox8,
    					creditsBox9,

    					//programBox,

    					coursesBox,
						coursesBox1,
						coursesBox2,
						coursesBox3,
						coursesBox4,
						coursesBox5,
						coursesBox6,
						coursesBox7,
						coursesBox8,
    					coursesBox9;

	//JPanel that holds the textfield,label and combo box
    private JPanel 		panel,
	   					panelTop,
    					panelTop1,
    					panelTop2,
    					panelTop3,
    					panelTop4,
    					panelTop5,
    					panelTop6,
    					panelTop7,
    					panelTop8,
    					panelTop9,
    					panelMid,
    					panelLow;

					//credit hour selection from combo box
 	private String 	creditSel,creditSel1,creditSel2,creditSel3,creditSel4,
 					creditSel5,creditSel6,creditSel7,creditSel8,creditSel9,
					//grade selection from combo box
 					gradeSel,gradeSel1,gradeSel2,gradeSel3,gradeSel4,
 					gradeSel5,gradeSel6,gradeSel7,gradeSel8,gradeSel9,

 					//program selection from combo box
 					programSel,

 					//courses selection from combo box
 					coursesSel,coursesSel1,coursesSel2,coursesSel3,coursesSel4,
 					coursesSel5,coursesSel6,coursesSel7,coursesSel8,coursesSel9;






 	private int WINDOW_WIDTH = 900, WINDOW_HEIGHT = 600;


				//converted credit hour selection
	private int credit,credit1,credit2,credit3,credit4,
				credit5,credit6,credit7,credit8,credit9;

				//converted grade selection
	private double grade,grade1,grade2,grade3,grade4,grade5,
					grade6,grade7,grade8,grade9;




    String display;

    public electCalculateYourGPA()
    {
        super("CalculateYourGPA");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setLayout(new GridLayout(14,1));



		//JComboBox for the grade
        gradeBox = new JComboBox(grd);
        gradeBox1 = new JComboBox(grd);
        gradeBox2 = new JComboBox(grd);
        gradeBox3 = new JComboBox(grd);
        gradeBox4 = new JComboBox(grd);
        gradeBox5 = new JComboBox(grd);
        gradeBox6 = new JComboBox(grd);
        gradeBox7 = new JComboBox(grd);
        gradeBox8 = new JComboBox(grd);
        gradeBox9 = new JComboBox(grd);

		//JComboBox for the credit hour
        creditsBox = new JComboBox(crh);
        creditsBox1 = new JComboBox(crh);
        creditsBox2 = new JComboBox(crh);
        creditsBox3 = new JComboBox(crh);
        creditsBox4 = new JComboBox(crh);
        creditsBox5 = new JComboBox(crh);
        creditsBox6 = new JComboBox(crh);
        creditsBox7 = new JComboBox(crh);
        creditsBox8 = new JComboBox(crh);
        creditsBox9 = new JComboBox(crh);

		//JComboBox for the credit courses
        coursesBox = new JComboBox(sub);
        coursesBox1 = new JComboBox(sub);
        coursesBox2 = new JComboBox(sub);
        coursesBox3 = new JComboBox(sub);
        coursesBox4 = new JComboBox(sub);
        coursesBox5 = new JComboBox(sub);
        coursesBox6 = new JComboBox(sub);
        coursesBox7 = new JComboBox(sub);
        coursesBox8 = new JComboBox(sub);
        coursesBox9 = new JComboBox(sub);

        //JComboBox for the credit courses
       // programBox = new JComboBox(prg);
        


        calcButton = new JButton("Calculate");
        clearButton = new JButton("Reset");

        calcButton.addActionListener(new ButtonListener());
        clearButton.addActionListener(new ButtonListener());

		nameField = new JTextField(20);
		matrixNoField = new JTextField(10);
		semField = new JTextField(2);

		nameDisplay = new JLabel("Name: ");
    	matrixNoDisplay = new JLabel("Matrix No: ");
     	semDisplay = new JLabel("");

		panel = new JPanel();

		panel.add(nameDisplay);
		panel.add(nameField);
		panel.add(matrixNoDisplay);
		panel.add(matrixNoField);
		//panel.add(programBox);
		panel.add(semDisplay);
		panel.add(semField);

        panelTop = new JPanel();
        panelTop1 = new JPanel();
        panelTop2 = new JPanel();
        panelTop3 = new JPanel();
        panelTop4 = new JPanel();
        panelTop5 = new JPanel();
        panelTop6 = new JPanel();
        panelTop7 = new JPanel();
        panelTop8 = new JPanel();
        panelTop9 = new JPanel();



		//JTextLabel for courses
        panelTop.add(coursesBox);
        panelTop1.add(coursesBox1);
        panelTop2.add(coursesBox2);
        panelTop3.add(coursesBox3);
        panelTop4.add(coursesBox4);
        panelTop5.add(coursesBox5);
        panelTop6.add(coursesBox6);
        panelTop7.add(coursesBox7);
        panelTop8.add(coursesBox8);
        panelTop9.add(coursesBox9);

        //JTextField for grade
        panelTop.add(gradeBox);
        panelTop1.add(gradeBox1);
        panelTop2.add(gradeBox2);
        panelTop3.add(gradeBox3);
        panelTop4.add(gradeBox4);
        panelTop5.add(gradeBox5);
        panelTop6.add(gradeBox6);
        panelTop7.add(gradeBox7);
        panelTop8.add(gradeBox8);
        panelTop9.add(gradeBox9);

       //JTextField for credit hour
        panelTop.add(creditsBox);
        panelTop1.add(creditsBox1);
        panelTop2.add(creditsBox2);
        panelTop3.add(creditsBox3);
        panelTop4.add(creditsBox4);
        panelTop5.add(creditsBox5);
        panelTop6.add(creditsBox6);
        panelTop7.add(creditsBox7);
        panelTop8.add(creditsBox8);
        panelTop9.add(creditsBox9);

        messageDisplay = new JLabel(display);
        panelMid = new JPanel();
        panelMid.add(messageDisplay);

        panelLow = new JPanel();
        panelLow.add(calcButton);
        panelLow.add(clearButton);

		add(panel);
        add(panelTop);
        add(panelTop1);
        add(panelTop2);
        add(panelTop3);
        add(panelTop4);
        add(panelTop5);
        add(panelTop6);
        add(panelTop7);
        add(panelTop8);
        add(panelTop9);
        add(panelMid);
        add(panelLow);

        setVisible(true);
    }
	/**This method convert the grades of courses from String into double(Grade converter)*/
    public double getCreditGrade(String letterGrade)
    {
			double creditGrade = 0;
            if (letterGrade.equals ("A"))
                creditGrade = 5.000;
            else if (letterGrade.equals ("B"))
                creditGrade = 4.00;
            else if (letterGrade.equals ("C"))
                creditGrade = 3.000;
            else if (letterGrade.equals ("D"))
                creditGrade = 2.000;
            else if (letterGrade.equals ("E"))
                creditGrade = 1.000;
            else if (letterGrade.equals ("F"))
                creditGrade = 0.000;

            return creditGrade;
    }
	//ActionCommand for the calculate button and clear button
    private class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent a)
        {
            String 	buttonAction = a.getActionCommand();

            if(a.getSource() == calcButton)
            {



				//Selection from courses combo box
				Object obj = coursesBox.getSelectedItem();
				Object obj1 = coursesBox1.getSelectedItem();
				Object obj2 = coursesBox2.getSelectedItem();
				Object obj3 = coursesBox3.getSelectedItem();
				Object obj4 = coursesBox4.getSelectedItem();
				Object obj5 = coursesBox5.getSelectedItem();
				Object obj6 = coursesBox6.getSelectedItem();
				Object obj7 = coursesBox7.getSelectedItem();
				Object obj8 = coursesBox8.getSelectedItem();
				Object obj9 = coursesBox9.getSelectedItem();


				//convert the selection to string
				coursesSel = obj.toString();
				coursesSel1 = obj1.toString();
				coursesSel2 = obj2.toString();
				coursesSel3 = obj3.toString();
				coursesSel4 = obj4.toString();
				coursesSel5 = obj5.toString();
				coursesSel6 = obj6.toString();
				coursesSel7 = obj7.toString();
				coursesSel8 = obj8.toString();
				coursesSel9 = obj9.toString();





				//Selection from grade combo box
				obj = gradeBox.getSelectedItem();
				obj1 = gradeBox1.getSelectedItem();
				obj2 = gradeBox2.getSelectedItem();
				obj3 = gradeBox3.getSelectedItem();
			    obj4 = gradeBox4.getSelectedItem();
				obj5 = gradeBox5.getSelectedItem();
				obj6 = gradeBox6.getSelectedItem();
				obj7 = gradeBox7.getSelectedItem();
				obj8 = gradeBox8.getSelectedItem();
				obj9 = gradeBox9.getSelectedItem();



				//Convert the selection to String
				gradeSel = obj.toString();
				gradeSel1 = obj1.toString();
				gradeSel2 = obj2.toString();
				gradeSel3 = obj3.toString();
				gradeSel4 = obj4.toString();
				gradeSel5 = obj5.toString();
				gradeSel6 = obj6.toString();
				gradeSel7 = obj7.toString();
				gradeSel8 = obj8.toString();
				gradeSel9 = obj9.toString();

				//Selection from credit hour combo box
				obj = creditsBox.getSelectedItem();
				obj1 = creditsBox1.getSelectedItem();
				obj2 = creditsBox2.getSelectedItem();
				obj3 = creditsBox3.getSelectedItem();
				obj4 = creditsBox4.getSelectedItem();
				obj5 = creditsBox5.getSelectedItem();
				obj6 = creditsBox6.getSelectedItem();
				obj7 = creditsBox7.getSelectedItem();
				obj8 = creditsBox8.getSelectedItem();
				obj9 = creditsBox9.getSelectedItem();

				//convert the selection to String
				creditSel = obj.toString();
				creditSel1 = obj1.toString();
				creditSel2 = obj2.toString();
				creditSel3 = obj3.toString();
				creditSel4 = obj4.toString();
				creditSel5 = obj5.toString();
				creditSel6 = obj6.toString();
				creditSel7 = obj7.toString();
				creditSel8 = obj8.toString();
				creditSel9 = obj9.toString();

				//convert the selection of the credit hour to String and call the grade converter
				if (!creditSel.equals(defaultCredit) && !gradeSel.equals(defaultGrade))
				{
					grade = getCreditGrade(gradeSel);
					credit = Integer.parseInt(creditSel);
				}
				else
				{
					credit = 0;
				}
				if (!creditSel1.equals(defaultCredit) && !gradeSel1.equals(defaultGrade))
				{
					grade1 = getCreditGrade(gradeSel1);
					credit1 = Integer.parseInt(creditSel1);
				}
				else
				{
					credit1 = 0;
				}
				if (!creditSel2.equals(defaultCredit) && !gradeSel2.equals(defaultGrade))
				{
					grade2 = getCreditGrade(gradeSel2);
					credit2 = Integer.parseInt(creditSel2);
				}
				else
				{
					credit2 = 0;
				}
				if (!creditSel3.equals(defaultCredit) && !gradeSel3.equals(defaultGrade))
				{
					grade3 = getCreditGrade(gradeSel3);
					credit3 = Integer.parseInt(creditSel3);
				}
				else
				{
					credit3 = 0;
				}
				if (!creditSel4.equals(defaultCredit) && !gradeSel4.equals(defaultGrade))
				{
					grade4 = getCreditGrade(gradeSel4);
					credit4 = Integer.parseInt(creditSel4);
				}
				else
				{
					credit4 = 0;
				}
				if (!creditSel5.equals(defaultCredit) && !gradeSel5.equals(defaultGrade))
				{
					grade5 = getCreditGrade(gradeSel5);
					credit5 = Integer.parseInt(creditSel5);
				}
				else
				{
					credit5 = 0;
				}
				if (!creditSel6.equals(defaultCredit) && !gradeSel6.equals(defaultGrade))
				{
					grade6 = getCreditGrade(gradeSel6);
					credit6 = Integer.parseInt(creditSel6);
				}
				else
				{
					credit6 = 0;
				}
				if (!creditSel7.equals(defaultCredit) && !gradeSel7.equals(defaultGrade))
				{
					grade7 = getCreditGrade(gradeSel7);
					credit7 = Integer.parseInt(creditSel7);
				}
				else
				{
					credit7 = 0;
				}
				if (!creditSel8.equals(defaultCredit) && !gradeSel8.equals(defaultGrade))
				{
					grade8 = getCreditGrade(gradeSel8);
					credit8 = Integer.parseInt(creditSel8);
				}
				else
				{
					credit8 = 0;
				}
				if (!creditSel9.equals(defaultCredit) && !gradeSel9.equals(defaultGrade))
				{
					grade9 = getCreditGrade(gradeSel9);
					credit9 = Integer.parseInt(creditSel9);
				}
				else
				{
					credit = 0;
				}
				//Calculate the GPA
				double gpa = 	((grade*credit)+(grade1*credit1)+(grade2*credit2)+(grade3*credit3)+(grade4*credit4)+
								(grade5*credit5)+(grade6*credit6)+(grade7*credit7)+(grade8*credit8)+(grade9*credit9))/
								(credit+credit1+credit2+credit3+credit4+credit5+credit6+credit7+credit8+credit9);
				DecimalFormat fm = new DecimalFormat("#.###");


				messageDisplay.setText("Your GPA is "+fm.format(gpa));
			}

			//Clear all the input in text field and the message display
            if (a.getSource() == clearButton)
            {
				nameField.setText("");
				matrixNoField.setText("");
				semField.setText("");
				display = "";
                messageDisplay.setText(display);
			}
		}
	}
	
    public static void main (String [] args)
    {
        new electCalculateYourGPA();
    }
}


