package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.QLNVcontroller;
import model.QLKOKModel;
import staff.staff;

import javax.swing.JScrollPane;

public class staffView extends JFrame {
	private static final long serialVersionUID = 1L;
	public QLKOKModel model;
	private JPanel contentPane;
	private JTextField textPhone;
	private JTextField textName;
	private JTextField textID;
	private JTextField textPass;
	private JTextField textUser;
	private JTextField textAddress;
	private JTable table;
	private JComboBox comboBox_cv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staffView frame = new staffView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public staffView() {
		QLNVcontroller cl = new QLNVcontroller(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_staff = new JLabel("Tạo thông tin nhân viên");
		lblNewLabel_staff.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_staff.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_staff.setBounds(10, 11, 190, 25);
		contentPane.add(lblNewLabel_staff);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 37, 275, 312);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_idStaff = new JLabel("Mã nhân viên");
		lblNewLabel_idStaff.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_idStaff.setBounds(10, 11, 105, 28);
		panel.add(lblNewLabel_idStaff);
		
		JLabel lblNewLabel_Staff_1 = new JLabel("Tên nhân viên");
		lblNewLabel_Staff_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_Staff_1.setBounds(10, 50, 116, 28);
		panel.add(lblNewLabel_Staff_1);
		
		JLabel lblNewLabel_phone = new JLabel("Số điện thoại");
		lblNewLabel_phone.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_phone.setBounds(10, 89, 105, 28);
		panel.add(lblNewLabel_phone);
		
		JLabel lblNewLabel_address = new JLabel("Địa chỉ");
		lblNewLabel_address.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_address.setBounds(10, 128, 56, 28);
		panel.add(lblNewLabel_address);
		
		JLabel lblNewLabel_user = new JLabel("Tài khoản");
		lblNewLabel_user.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_user.setBounds(10, 167, 80, 28);
		panel.add(lblNewLabel_user);
		
		JLabel lblNewLabel_pass = new JLabel("Mật khẩu");
		lblNewLabel_pass.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_pass.setBounds(10, 206, 80, 28);
		panel.add(lblNewLabel_pass);
		
		JLabel lblNewLabel_CV = new JLabel("Chức vụ");
		lblNewLabel_CV.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_CV.setBounds(10, 245, 80, 28);
		panel.add(lblNewLabel_CV);
		
		textPhone = new JTextField();
		textPhone.setBounds(125, 89, 140, 26);
		panel.add(textPhone);
		textPhone.setColumns(10);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(125, 56, 140, 26);
		panel.add(textName);
		
		textID = new JTextField();
		textID.setColumns(10);
		textID.setBounds(125, 17, 140, 26);
		panel.add(textID);
		
		textPass = new JTextField();
		textPass.setColumns(10);
		textPass.setBounds(125, 209, 140, 26);
		panel.add(textPass);
		
		textUser = new JTextField();
		textUser.setColumns(10);
		textUser.setBounds(125, 170, 140, 26);
		panel.add(textUser);
		
		textAddress = new JTextField();
		textAddress.setColumns(10);
		textAddress.setBounds(125, 131, 140, 26);
		panel.add(textAddress);
		
		comboBox_cv = new JComboBox();
		String[] array_chucvu = {
			    "Thu ngân",
			    "Phục vụ",
			    "Đầu bếp",
			    "Phụ bếp",
			    "Dọn phòng",
			    "Bảo vệ"
			};

			ArrayList<staff> listchucvu = new ArrayList<staff>();
			int i = 0;
			for (String tenchucvu : array_chucvu) {
			    staff cv = new staff(i, tenchucvu, i, tenchucvu, i, i);
			    listchucvu.add(cv);
			    i++;
			}

			comboBox_cv.addItem("");
			for (String chucvu : array_chucvu) {
			    comboBox_cv.addItem(chucvu);
			}
		comboBox_cv.setBounds(125, 250, 140, 26);
		panel.add(comboBox_cv);
		
		JButton btnSave = new JButton("Lưu");
		btnSave.addActionListener(cl);
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnSave.setBounds(10, 360, 97, 40);
		contentPane.add(btnSave);
		
		JButton btnUpdate = new JButton("Cập nhật");
		btnUpdate.addActionListener(cl);
		btnUpdate.setHorizontalAlignment(SwingConstants.LEFT);
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnUpdate.setBounds(117, 360, 103, 40);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Xóa");
		btnDelete.addActionListener(cl);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnDelete.setBounds(230, 360, 97, 40);
		contentPane.add(btnDelete);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(295, 37, 555, 312);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 535, 290);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "T\u00EAn nh\u00E2n vi\u00EAn", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i", "\u0110\u1ECBa ch\u1EC9", "T\u00E0i kho\u1EA3n", "M\u1EADt kh\u1EA9u", "Ch\u1EE9c v\u1EE5"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(46);
		table.getColumnModel().getColumn(1).setPreferredWidth(103);
		table.getColumnModel().getColumn(2).setPreferredWidth(80);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		scrollPane.setViewportView(table);
	}

	public void xoaForm() {
		textID.setText("");
		textName.setText("");
		textPhone.setText("");
		textAddress.setText("");
		textUser.setText("");
		textPass.setText("");
		comboBox_cv.setSelectedIndex(-1);
	}
	public void themstaff(staff st) {
		this.model.insert(st);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(new Object[]{
				st.getIDnhanvien()+"",
				st.getTennhanvien(),
				st.getPhonenhanvien(),
				st.getUsernhanvien(),
				st.getPassnhanvien(),
				});
	}
}