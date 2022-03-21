package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.List;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

import Model.ConsultPatient;
import Model.ConsultingBill;
import Model.Diagnostic;
import Model.HospitalizedPatient;
import Model.Medic;
import Model.Medicament;
import Model.Patient;
import Model.TreatmentBill;
public class ClinicGUI {

	private JFrame frame;
	
	private final JPanel panel_1 = new JPanel();
	private JTextField textField; //Input of the first name
	private JTextField textField_1; //Input of the last Name 
	private JTextField textField_2;//Input of the ID
	private JTextField textField_3;//Input of the age
	private JTextField textField_4;// Input of the address
	private JTextField textField_5;// Input of the phone
	private JTextField textField_6;// Input of the disease
	private JTextField textField_7;// Input of the date(It doesn´t really matter the format at the moment)
	private JTextField textField_8;// input of the name of the medic
	private JTextField textField_9;// input of the employee number
	private JTextField textField_10;// input of the specialty of the medic
	private JTextField textField_11;// input of the medicament name
	private JTextField textField_12;// input of the price of the medicament
	private JTextField textField_14; // input  the quantity of the medicamen
	private JTextField textField_13;// input ofdescription o how to apply the medicament
	private JTextField textField_15; // input  the quantity of the medicamen
	private JTextField textField_16;// input ofdescription o how to apply the medicament
	private ConsultingBill CB;
	private TreatmentBill TB;
	JTextArea textArea = new JTextArea();
	private LinkedList<Medicament> MEDI;
	private String r=""; //appending
//Init Consulting Bill
	private int C;
	private int ControlPatient;
	//initializing textfields
	
	private JTable table;
	JComboBox comboBox = new JComboBox(); // Type of patient(2 types)
	public DefaultTableModel model;
   ArrayList< Patient > Patient=new ArrayList<Patient>(); //POLYMORPHIC LIST OF THE PARENT CLASS
   JLabel label;
	

	public JFrame getFrame() {
	return frame;
}

public void setFrame(JFrame frame) {
	this.frame = frame;
}

	/**
	 * Create the application.
	 */
	public ClinicGUI() {
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
public void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1081, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(70, 130, 180));
		panel.setBounds(0, 0, 1065, 62);
		frame.getContentPane().add(panel);
		frame.setResizable(false);
		JLabel lblNewLabel = new JLabel("WELCOME TO THE CLINIC MANAGEMENT SYSTEM");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 51, 51));
		panel_2.setBounds(0, 62, 1065, 443);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("REGISTRATION");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(0, 0, 413, 29);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(70, 130, 180));
		panel_3.setBounds(0, 29, 656, 268);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Type of Patient");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 11, 103, 14);
		panel_3.add(lblNewLabel_2);
		
		//init textfields
		textField_6 = new JTextField();
		textField_7 = new JTextField();
		textField_8 = new JTextField();
		textField_9 = new JTextField();
		textField_10 = new JTextField();
		textField_11 = new JTextField();
		textField_12 = new JTextField();
		textField_13 = new JTextField();
		textField_14 = new JTextField();
		textField_15 = new JTextField();
		textField_16 = new JTextField();
		
		
		
		CB=new ConsultingBill();
		MEDI=new LinkedList<Medicament>();
		
		comboBox.setBounds(143, 9, 145, 20);
		comboBox.addItem("");
		comboBox.addItem("Consult Patient");
		comboBox.addItem("Hospitalized Patient");
		panel_3.add(comboBox);
		
		JLabel lblNewLabel_2_1 = new JLabel("First Name");
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(10, 47, 103, 14);
		panel_3.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setBounds(143, 45, 145, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Last Name");
		lblNewLabel_2_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(10, 79, 103, 14);
		panel_3.add(lblNewLabel_2_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(143, 77, 145, 20);
		panel_3.add(textField_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("ID");
		lblNewLabel_2_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1.setBounds(10, 124, 103, 14);
		panel_3.add(lblNewLabel_2_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(143, 122, 145, 20);
		panel_3.add(textField_2);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Age");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1.setBounds(10, 169, 103, 14);
		panel_3.add(lblNewLabel_2_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(143, 167, 145, 20);
		panel_3.add(textField_3);
		
		//Adding only number and the back space to erase
		textField_3.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = textField_3.getText();
	          //we evaluate that the input are values 0 to 9
	          //we evaluate the backspace to erase
	            if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')||
	            	  	  ke.getKeyChar() == KeyEvent.VK_BACK_SPACE){
	            	textField_3.setEditable(true);
	             
	            }
	            else {
	            	textField_3.setEditable(false);
	               JOptionPane.showMessageDialog(null, "Enter only numeric value");
	            }
	           
	            
	         }
	      });
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Address");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1.setBounds(10, 206, 103, 14);
		panel_3.add(lblNewLabel_2_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(143, 204, 145, 20);
		panel_3.add(textField_4);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Phone");
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(10, 243, 103, 14);
		panel_3.add(lblNewLabel_2_1_1_1_1_1_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(143, 241, 145, 20);
		panel_3.add(textField_5);
		//Adding only number and the back space to erase
		textField_5.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = textField_5.getText();
	          //we evaluate that the input are values 0 to 9
	          //we evaluate the backspace to erase
	            if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')||
	            	  	  ke.getKeyChar() == KeyEvent.VK_BACK_SPACE){
	            	textField_5.setEditable(true);
	             
	            }
	            else {
	            	textField_5.setEditable(false);
	               JOptionPane.showMessageDialog(null, "Enter only numeric value");
	            }
	           
	            
	         }
	      });
		JButton btnNewButton = new JButton("Add Diagnostic");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("")==true||textField.getText().equals("")==true||textField_1.getText().equals("")==true||textField_2.getText().equals("")==true||textField_3.getText().equals("")==true||textField_4.getText().equals("")==true
						||textField_5.getText().equals("")==true) {
					
					JOptionPane.showMessageDialog(null, "PLEASE, FILL THE INFORMATION REQUIRED!..(Patien Info)");
				}else {
				 DiagnosticGUI() ;
				}
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewButton.setBounds(335, 8, 169, 23);
		panel_3.add(btnNewButton);
		
		JButton btnAddMedicDetail = new JButton("Add Medic Details");
		btnAddMedicDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox.getSelectedItem().equals("")==true||textField.getText().equals("")==true||textField_1.getText().equals("")==true||textField_2.getText().equals("")==true||textField_3.getText().equals("")==true||textField_4.getText().equals("")==true
						||textField_5.getText().equals("")==true||textField_6.getText().equals("")==true||textField_7.getText().equals("")==true
						
						) {
					
					JOptionPane.showMessageDialog(null, "PLEASE, FILL THE INFORMATION REQUIRED!..(Patien Info,Diagnostic Info)");
				}else {
				//Getting the information	
					MedicGUI();
					
					
				}		
				
			}
		});
		btnAddMedicDetail.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnAddMedicDetail.setBounds(335, 44, 169, 23);
		panel_3.add(btnAddMedicDetail);
		
		JButton btnAddBillDetail = new JButton("Add Bill Details");
		btnAddBillDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				if(comboBox.getSelectedItem().equals("")==true||textField.getText().equals("")==true||textField_1.getText().equals("")==true||textField_2.getText().equals("")==true||textField_3.getText().equals("")==true||textField_4.getText().equals("")==true
						||textField_5.getText().equals("")==true||textField_6.getText().equals("")==true||textField_7.getText().equals("")==true
						||textField_8.getText().equals("")==true||textField_9.getText().equals("")==true||textField_10.getText().equals("")==true	
						) {
					
					JOptionPane.showMessageDialog(null, "PLEASE, FILL THE INFORMATION REQUIRED!..(Patien Info,Diagnostic Info,Medic info)");
				}else {
					
					
					
					
					if(comboBox.getSelectedItem().equals("Consult Patient")==true) {

					
					 //REMOVE ALL ELEMENTS OF THE LIST
							//Getting the information
							//WE CREATE NEW OBJECTS 
							// THIS C VARIABLE KEEP THE CONTROLLING OF PATIENTS
							if(C==1) {
								CB=new ConsultingBill();
								MEDI=new LinkedList<Medicament>();
								C=0;
							}
							
							
							
							
							BillGUI(CB,MEDI) ;
						
					
					}

					else if(comboBox.getSelectedItem().equals("Hospitalized Patient")==true) {
						
						
						HospitalizedDays();
				
						
					
					}
					
					
					
		
					
				}	
				
				
			}
		});
		btnAddBillDetail.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnAddBillDetail.setBounds(335, 88, 169, 23);
		panel_3.add(btnAddBillDetail);
		//Adding datas of the patient, doctor and the bill
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if(comboBox.getSelectedItem().equals("")==true||textField.getText().equals("")==true||textField_1.getText().equals("")==true||textField_2.getText().equals("")==true||textField_3.getText().equals("")==true||textField_4.getText().equals("")==true
					||textField_5.getText().equals("")==true||textField_6.getText().equals("")==true||textField_7.getText().equals("")==true
					||textField_8.getText().equals("")==true||textField_9.getText().equals("")==true||textField_10.getText().equals("")==true	
					) {
				
				JOptionPane.showMessageDialog(null, "PLEASE, FILL THE INFORMATION REQUIRED!..(Patien Info,Diagnostic Info, Doctor Info and Bill Info)");
			}else {

		
			//Getting the information	
				Diagnostic d=new Diagnostic(textField_6.getText(),textField_7.getText());
				Medic M=new Medic(textField_8.getText(),textField_9.getText(),textField_10.getText());
	
			
						
				if(comboBox.getSelectedItem().equals("Consult Patient")==true) {
					if(textField_11.getText().equals("")==true	||textField_12.getText().equals("")==true||textField_13.getText().equals("")==true||textField_14.getText().equals("")==true
							) {
						JOptionPane.showMessageDialog(null, "PLEASE, FILL THE INFORMATION REQUIRED!..(Patien Info,Diagnostic Info, Doctor Info and Bill Info)");
					}
					else {
					Patient ConsultedPatient=new ConsultPatient(textField.getText(), textField_1.getText(), textField_2.getText(),Integer.parseInt(textField_3.getText()), textField_4.getText(), Integer.parseInt(textField_5.getText()), 
							 d,M,CB.getMedicament(),CB.getMedicaments());
					Patient.add(ConsultedPatient);
					 Object Data[]= {textField.getText(), textField_1.getText(), textField_2.getText(),textField_3.getText(), textField_4.getText(), textField_5.getText()};
						model.addRow(Data);
			
				//cleaing the FieldTexts to keep filling the data clearly
					textField.setText("");
					textField_1 .setText("");
					textField_2.setText("");
					textField_3 .setText("");
					textField_4 .setText("");
					textField_5 .setText("");
					textField_6 .setText("");
					textField_7 .setText("");
					textField_8 .setText("");
					textField_9 .setText("");
					textField_10.setText("");
					textField_11.setText("");
					textField_12 .setText("");
					textField_13 .setText("");
					textField_14 .setText("");
				    textArea.append(Patient.get(ControlPatient).ShowInfo() +
				    		"\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					C++;
					//increasing to continue showing the patient since where it was with the index
					ControlPatient++;
					JOptionPane.showMessageDialog(null, "DATA INSERTED");
					}
				
				}

				else if(comboBox.getSelectedItem().equals("Hospitalized Patient")==true) {
					
					if(textField_15.getText().equals("")==true	||textField_16.getText().equals("")==true
							) {
						JOptionPane.showMessageDialog(null, "PLEASE, FILL THE INFORMATION REQUIRED!..(Patien Info,Diagnostic Info, Doctor Info and Bill Info)");
					}else {
					TreatmentBill TB=new TreatmentBill((double) Integer.parseInt(textField_15.getText()),Integer.parseInt(textField_16.getText()));
					Patient Hospitalized=new HospitalizedPatient(textField.getText(), textField_1.getText(), textField_2.getText(),Integer.parseInt(textField_3.getText()), textField_4.getText(), Integer.parseInt(textField_5.getText()), 
							 d,M,TB);	
					
					Patient.add(Hospitalized);
					Object Data[]= {textField.getText(), textField_1.getText(), textField_2.getText(),textField_3.getText(), textField_4.getText(), textField_5.getText()};
					model.addRow(Data);
					
					//cleaing the FieldTexts to keep filling the data clearly
					textField.setText("");
					textField_1 .setText("");
					textField_2.setText("");
					textField_3 .setText("");
					textField_4 .setText("");
					textField_5 .setText("");
					textField_6 .setText("");
					textField_7 .setText("");
					textField_8 .setText("");
					textField_9 .setText("");
					textField_10.setText("");
				    textArea.append(Patient.get(ControlPatient).ShowInfo() + //// the advantage of polymorphism is to use the parent method 
				    		"\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					
					//increasing to continue showing the patient since where it was with the index
					ControlPatient++;
					
					JOptionPane.showMessageDialog(null, "DATA INSERTED");
					}
				}
				
				
				
				
			
		
			}
	
			 
			}
			
		}
		
				);
		
		btnInsert.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnInsert.setBounds(318, 234, 103, 23);
		panel_3.add(btnInsert);
		//please avoid the name of the JButton
		JButton btnCancel = new JButton("UPDATE");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Update();
			}
		});
		btnCancel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnCancel.setBounds(434, 234, 103, 23);
		panel_3.add(btnCancel);
		//please avoid the name of the JButton
		JButton btnSearch = new JButton("REFRESH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 for(int c=0; c<Patient.size(); c++) {
			        	//inserting data to the text area
			        	r+=Patient.get(c).ShowInfo();
			        	
			        }
			        textArea.setText(r); //refreshing the data onto the textArea
			        r=""; //defining in an empty variable
			}
		});
		btnSearch.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnSearch.setBounds(547, 234, 103, 23);
		panel_3.add(btnSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(666, 29, 389, 268);
		panel_2.add(scrollPane);
		
	
		scrollPane.setViewportView(textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 308, 1055, 124);
		panel_2.add(scrollPane_1);
		
		table = new JTable();
	
		model=new DefaultTableModel();
		
		Object[]column= {"First name","Last Name","ID","Age","Address","Phone"};
		 
		model.setColumnIdentifiers(column);
	
		table.setModel(model);
		
		
		scrollPane_1.setViewportView(table);
		
		JLabel lblNewLabel_1_1 = new JLabel("FURTHER INFORMATION");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(652, 0, 413, 29);
		panel_2.add(lblNewLabel_1_1);
		frame.setVisible(true);
	}
	
	// Diagnostic GUI
	
	public void DiagnosticGUI() {
	    JFrame frame;
		frame = new JFrame();
		frame.setBounds(100, 100, 463, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Disease");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(29, 39, 86, 14);
		frame.getContentPane().add(lblNewLabel);
		
		
		textField_6.setBounds(190, 37, 142, 20);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDateOfResult = new JLabel("Date Of Result");
		lblDateOfResult.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblDateOfResult.setBounds(29, 130, 107, 14);
		frame.getContentPane().add(lblDateOfResult);
		
	
		textField_7.setColumns(10);
		textField_7.setBounds(190, 128, 142, 20);
		frame.getContentPane().add(textField_7);
		
		JButton btnNewButton = new JButton("SEND");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// exception of the patient details
				
				//Getting the information	
				
					if(textField_6.getText().equals("")==true||textField_7.getText().equals("")==true) {
						JOptionPane.showMessageDialog(null, "PLEASE, FILL THE INFORMATION REQUIRED!..(Diagnostic Info");
						
					}
					else {
						
						JOptionPane.showMessageDialog(null, "Datta Added");
						frame.setVisible(false);
						
					}
					
				
			
			}
		});
		btnNewButton.setBounds(61, 186, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "REMEMBER THESE DATA ARE REQUIRED TO CONTINUE WITH THE REGISTRATION AND BILLING");
				frame.setVisible(false);
			}
		});
		btnCancel.setBounds(307, 186, 89, 23);
		frame.getContentPane().add(btnCancel);	
		
		frame.setVisible(true);
		
		
	}
	
	// Medic GUI
	
	public void MedicGUI() {
	    JFrame frame;
		frame = new JFrame();
		frame.setBounds(100, 100, 465, 319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(23, 60, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		

		textField_8.setBounds(163, 58, 192, 20);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblEmployeeNumber = new JLabel("Employee Number");
		lblEmployeeNumber.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblEmployeeNumber.setBounds(23, 122, 125, 14);
		frame.getContentPane().add(lblEmployeeNumber);
		
		
		textField_9.setColumns(10);
		textField_9.setBounds(163, 120, 192, 20);
		frame.getContentPane().add(textField_9);
		
		//Adding only number and the back space to erase
		textField_9.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = textField_9.getText();
	          //we evaluate that the input are values 0 to 9
	          //we evaluate the backspace to erase
	            if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')||
	            	  	  ke.getKeyChar() == KeyEvent.VK_BACK_SPACE){
	            	textField_9.setEditable(true);
	             
	            }
	            else {
	            	textField_9.setEditable(false);
	               JOptionPane.showMessageDialog(null, "Enter only numeric value");
	            }
	           
	            
	         }
	      });
		JLabel lblSpecialty = new JLabel("Specialty");
		lblSpecialty.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblSpecialty.setBounds(23, 184, 125, 14);
		frame.getContentPane().add(lblSpecialty);
		
	
		textField_10.setColumns(10);
		textField_10.setBounds(163, 182, 192, 20);
		frame.getContentPane().add(textField_10);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_8.getText().equals("")==true||textField_9.getText().equals("")==true||textField_10.getText().equals("")==true) {
					JOptionPane.showMessageDialog(null, "PLEASE, FILL THE INFORMATION REQUIRED!..(Medic detail");
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Datta Added");
					frame.setVisible(false);
					
				}
	
			}
		});
		btnNewButton.setBounds(80, 246, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSend = new JButton("Cancel");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "REMEMBER THESE DATA ARE REQUIRED TO CONTINUE WITH THE REGISTRATION AND BILLING");
			}
		});
		btnSend.setBounds(262, 246, 89, 23);
		frame.getContentPane().add(btnSend);	
		frame.setVisible(true);
		
	}
	
	//billing of the ConsultPatient
	
	public void BillGUI(ConsultingBill CB,LinkedList< Medicament > MEDI) {
		 JFrame frame;
		frame = new JFrame();
		frame.setBounds(100, 100, 607, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Medicament Name");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(42, 38, 211, 23);
		frame.getContentPane().add(lblNewLabel);
		
	
		textField_11.setBounds(300, 40, 242, 20);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblQuantity = new JLabel(" Quantity");
		lblQuantity.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblQuantity.setBounds(42, 116, 211, 23);
		frame.getContentPane().add(lblQuantity);
		
		
		textField_12.setColumns(10);
		textField_12.setBounds(300, 103, 171, 35);
		frame.getContentPane().add(textField_12);
		
		//Adding only number and the back space to erase
		textField_12.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = textField_12.getText();
	          //we evaluate that the input are values 0 to 9
	          //we evaluate the backspace to erase
	            if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')||
	            	  	  ke.getKeyChar() == KeyEvent.VK_BACK_SPACE){
	            	textField_12.setEditable(true);
	             
	            }
	            else {
	            	textField_12.setEditable(false);
	               JOptionPane.showMessageDialog(null, "Enter only numeric value");
	            }
	           
	            
	         }
	      });
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblPrice.setBounds(42, 184, 211, 23);
		frame.getContentPane().add(lblPrice);
		
	
		textField_13.setColumns(10);
		textField_13.setBounds(300, 171, 171, 35);
		frame.getContentPane().add(textField_13);
		
		textField_12.setColumns(10);
		textField_12.setBounds(300, 103, 171, 35);
		frame.getContentPane().add(textField_12);
		
		//Adding only number and the back space to erase
		textField_13.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = textField_13.getText();
	          //we evaluate that the input are values 0 to 9
	          //we evaluate the backspace to erase
	            if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')||
	            	  	  ke.getKeyChar() == KeyEvent.VK_BACK_SPACE){
	            	textField_13.setEditable(true);
	             
	            }
	            else {
	            	textField_13.setEditable(false);
	               JOptionPane.showMessageDialog(null, "Enter only numeric value");
	            }
	           
	            
	         }
	      });
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblDescription.setBounds(42, 248, 211, 23);
		frame.getContentPane().add(lblDescription);
		
		
		textField_14.setColumns(10);
		textField_14.setBounds(300, 237, 242, 35);
		frame.getContentPane().add(textField_14);
		
		
		//Adding only number and the back space to erase
	
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(C==1) {
					MEDI.clear();
					C=0;
				}
				if(textField_11.getText().equals("")==true||textField_12.getText().equals("")==true||textField_13.getText().equals("")==true||textField_14.getText().equals("")==true) {
					JOptionPane.showMessageDialog(null, "PLEASE, FILL THE INFORMATION REQUIRED!..(Medic detail");
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Datta Added");
					Medicament M=new Medicament(textField_11.getText(), Integer.parseInt(textField_12.getText()), Integer.parseInt(textField_13.getText()), textField_14.getText());
				
					MEDI.add(M);
			         CB.setMedicament(M);
		
				     CB.setMedicaments(MEDI);
				
				    JOptionPane.showMessageDialog(null, CB);
					frame.setVisible(false);
					
			
				}
		
				
				
			}
		});
		btnNewButton.setBounds(132, 330, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReturn = new JButton("RETURN ");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnReturn.setBounds(329, 330, 89, 23);	
		frame.getContentPane().add(btnReturn);		
		
		frame.setVisible(true);
		
		
	}
	
	
	//billing of the Hospitalized patient
	
	public void HospitalizedDays() {
		frame = new JFrame();
		frame.setBounds(100, 100, 658, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Treatment Per Day Cost");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(42, 38, 211, 23);
		frame.getContentPane().add(lblNewLabel);
		
		
		textField_15.setBounds(300, 25, 242, 35);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		//Adding only number and the back space to erase
		textField_15.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = textField_15.getText();
	          //we evaluate that the input are values 0 to 9
	          //we evaluate the backspace to erase
	            if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')||
	            	  	  ke.getKeyChar() == KeyEvent.VK_BACK_SPACE){
	            	textField_15.setEditable(true);
	             
	            }
	            else {
	            	textField_15.setEditable(false);
	               JOptionPane.showMessageDialog(null, "Enter only numeric value");
	            }
	           
	            
	         }
	      });
		JLabel lblQuantity = new JLabel("Hospitalized Days");
		lblQuantity.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblQuantity.setBounds(42, 116, 211, 23);
		frame.getContentPane().add(lblQuantity);
		
	
		textField_16.setColumns(10);
		textField_16.setBounds(300, 103, 242, 35);
		frame.getContentPane().add(textField_16);
		
	
		
		//Adding only number and the back space to erase
		textField_16.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = textField_16.getText();
	          //we evaluate that the input are values 0 to 9
	          //we evaluate the backspace to erase
	            if ((ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9')||
	            	  	  ke.getKeyChar() == KeyEvent.VK_BACK_SPACE){
	            	textField_16.setEditable(true);
	             
	            }
	            else {
	            	textField_16.setEditable(false);
	               JOptionPane.showMessageDialog(null, "Enter only numeric value");
	            }
	           
	            
	         }
	      });
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(textField_15.getText().equals("")==true||textField_16.getText().equals("")==true) {
					JOptionPane.showMessageDialog(null, "PLEASE, FILL THE INFORMATION REQUIRED!..(Treatment details");
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Datta Added");
					
		
		
					frame.setVisible(false);
					
			
				}
				
			}
		});
		btnNewButton.setBounds(164, 217, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReturn = new JButton("CANCEL");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReturn.setBounds(344, 217, 89, 23);
		frame.getContentPane().add(btnReturn);	
		frame.setVisible(true);
		
	}
	// method to update only the personal information of the patient
	public void Update() {
		try {
		//updating the model with other array of type object
			Object Data[]= {textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText(),textField_5.getText()};
			
			int i = table.getSelectedRow(); // we get the iterator of the selected row
			//updating textfields
			
			
			
	    
	    
	   
	      
	    
	        
	      String d=(String) model.getValueAt(i, 2);
	    
	        for(int c=0; c<Patient.size(); c++) {
	        	
	        	if(Patient.get(c).getId().equalsIgnoreCase(d)) {
	        		if(textField.getText().equals("")==false) {
	        			Patient.get(c).setFirstName(textField.getText() );
	        			model.setValueAt(textField.getText(),i, 0);
	        			JOptionPane.showMessageDialog(null," Data updated successfully");
	        		}
	        		if(textField_1.getText().equals("")==false) {
	        			Patient.get(c).setLastName(textField_1.getText());
	        			  model.setValueAt(textField_1.getText(),i, 1);
	        			  JOptionPane.showMessageDialog(null," Data updated successfully");
	        		}
	        		if(textField_2.getText().equals("")==false) {
	        			Patient.get(c).setId(textField_2.getText() );
	        		     model.setValueAt(textField_2.getText(),i, 2);
	        		     JOptionPane.showMessageDialog(null," Data updated successfully");
	        		}
	        		if(textField_3.getText().equals("")==false) {
	        			Patient.get(c).setAge(Integer.parseInt(textField_3.getText()) );
	        			  model.setValueAt(textField_3.getText(),i, 3);
	        			  JOptionPane.showMessageDialog(null," Data updated successfully");
	        		}
	        		if(textField_4.getText().equals("")==false) {
	        			Patient.get(c).setAddress(textField_4.getText());
	        		    model.setValueAt(textField_4.getText(),i, 4);
	        		    JOptionPane.showMessageDialog(null," Data updated successfully");
	        			
	        		}
	        		if(textField_5.getText().equals("")==false) {
	        			Patient.get(c).setPhone(Integer.parseInt(textField_5.getText() ));
	        			model.setValueAt(textField_5.getText(),i, 5);
	        			JOptionPane.showMessageDialog(null," Data updated successfully");
	        		}
	        		
	        	}
	        	
	        	
	        }
	        for(int c=0; c<Patient.size(); c++) {
	        	//inserting data to the text area
	        	r+=Patient.get(c).ShowInfo();
	        	
	        }
	        textArea.setText(r); //refreshing the data onto the textArea
	        r="";
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Choose a row to update the patient!");
		}
		
		
		
		
	}
}
