package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import assment.QLKOKModel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.Checkbox;
import javax.swing.JScrollBar;
import javax.swing.JCheckBoxMenuItem;
import java.awt.List;
import javax.swing.JComboBox;
import java.awt.Scrollbar;
import java.awt.Color;

public class QLKOKView extends JFrame {

	private JPanel contentPane;
	QLKOKModel model;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table_1;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTable table_2;
	private JTextField textField_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLKOKView frame = new QLKOKView();
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
	public QLKOKView() {
		this.model = new QLKOKModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1260, 600);
		
		JMenuBar MenuMain = new JMenuBar();
		MenuMain.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setJMenuBar(MenuMain);
		
		JMenu MenuInfor = new JMenu("Thông Tin");
		MenuInfor.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		MenuMain.add(MenuInfor);
		
		JMenuItem MenuItemLogin = new JMenuItem("Đăng Nhập");
		MenuItemLogin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		MenuInfor.add(MenuItemLogin);
		
		JSeparator separator = new JSeparator();
		MenuInfor.add(separator);
		
		JMenuItem MenuItemLogout = new JMenuItem("Đăng Xuất");
		MenuItemLogout.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		MenuInfor.add(MenuItemLogout);
		
		JSeparator separator_1 = new JSeparator();
		MenuInfor.add(separator_1);
		
		JMenuItem MenuItemExit = new JMenuItem("Thoát");
		MenuItemExit.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		MenuInfor.add(MenuItemExit);
		
		JMenu MenuSearch = new JMenu(" Tìm Kiếm");
		MenuSearch.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		MenuMain.add(MenuSearch);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(9, 30, 297, 368);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnLau1 = new JButton("Lầu 1");
		btnLau1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnLau1.setBounds(10, 10, 84, 33);
		panel.add(btnLau1);
		
		JButton btnLau2 = new JButton("Lầu 2");
		btnLau2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnLau2.setBounds(104, 10, 84, 33);
		panel.add(btnLau2);
		
		JButton btnLau3 = new JButton("Lầu 3");
		btnLau3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnLau3.setBounds(198, 10, 84, 33);
		panel.add(btnLau3);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"T\u00EAn Ph\u00F2ng", "T\u00ECnh tr\u1EA1ng ph\u00F2ng"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(20, 53, 267, 247);
		panel.add(scrollPane);
		
		JButton btnUpdate = new JButton("Cập Nhật");
		btnUpdate.setBounds(149, 311, 133, 33);
		panel.add(btnUpdate);
		
		JButton btnChuaBiet = new JButton("Chua Biet");
		btnChuaBiet.setBounds(10, 310, 133, 33);
		panel.add(btnChuaBiet);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(316, 30, 519, 242);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblRoom = new JLabel("Mã Phòng");
		lblRoom.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblRoom.setBounds(10, 10, 82, 28);
		panel_1.add(lblRoom);
		
		JLabel lblLoaiPhong = new JLabel("Loại Phòng");
		lblLoaiPhong.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblLoaiPhong.setBounds(10, 48, 94, 28);
		panel_1.add(lblLoaiPhong);
		
		JLabel lblCustomer = new JLabel("Khách hàng");
		lblCustomer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblCustomer.setBounds(10, 95, 94, 28);
		panel_1.add(lblCustomer);
		
		JLabel lblTimeStart = new JLabel("TG bắt đầu");
		lblTimeStart.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTimeStart.setBounds(10, 133, 94, 28);
		panel_1.add(lblTimeStart);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBounds(103, 99, 128, 25);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setColumns(10);
		textField_1.setBounds(103, 133, 128, 25);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setColumns(10);
		textField_2.setBounds(103, 52, 128, 25);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setColumns(10);
		textField_3.setBounds(103, 13, 128, 25);
		panel_1.add(textField_3);
		
		JLabel lblNamePhng = new JLabel("Tên Phòng");
		lblNamePhng.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNamePhng.setBounds(256, 10, 82, 28);
		panel_1.add(lblNamePhng);
		
		JLabel lblCustomerZise = new JLabel("Số lượng khách");
		lblCustomerZise.setHorizontalAlignment(SwingConstants.LEFT);
		lblCustomerZise.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblCustomerZise.setBounds(256, 66, 117, 28);
		panel_1.add(lblCustomerZise);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_4.setColumns(10);
		textField_4.setBounds(383, 70, 128, 25);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_5.setColumns(10);
		textField_5.setBounds(383, 17, 128, 25);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_6.setColumns(10);
		textField_6.setBounds(383, 133, 128, 25);
		panel_1.add(textField_6);
		
		JLabel lblTimeEnd = new JLabel("TG kết thúc");
		lblTimeEnd.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTimeEnd.setBounds(256, 133, 94, 28);
		panel_1.add(lblTimeEnd);
		
		JButton btnMonny = new JButton("Tính Tiền");
		btnMonny.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnMonny.setBounds(10, 171, 128, 62);
		panel_1.add(btnMonny);
		
		JButton btnInHD = new JButton("In hóa đơn");
		btnInHD.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnInHD.setBounds(186, 171, 128, 62);
		panel_1.add(btnInHD);
		
		JButton btnSaved = new JButton("Lưu");
		btnSaved.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSaved.setBounds(383, 171, 128, 62);
		panel_1.add(btnSaved);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(356, 184, -95, 25);
		panel_1.add(scrollBar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(316, 306, 519, 178);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 MH", "T\u00EAn MH", "\u0110\u01A1n v\u1ECB t\u00EDnh", "S\u1ED1 l\u01B0\u1EE3ng", "Th\u00E0nh ti\u1EC1n", "Ghi "
			}
		));
		table_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JScrollPane scrollPane_1 = new JScrollPane(table_1);
		scrollPane_1.setBounds(10, 10, 499, 158);
		panel_2.add(scrollPane_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(845, 37, 395, 214);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblBill = new JLabel("Mã Bill");
		lblBill.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblBill.setBounds(10, 10, 54, 28);
		panel_3.add(lblBill);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.LEFT);
		textField_7.setColumns(10);
		textField_7.setBounds(73, 10, 128, 25);
		panel_3.add(textField_7);
		
		JLabel lblsoTime = new JLabel("Số giờ");
		lblsoTime.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblsoTime.setBounds(10, 48, 54, 28);
		panel_3.add(lblsoTime);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.LEFT);
		textField_8.setColumns(10);
		textField_8.setBounds(73, 48, 128, 25);
		panel_3.add(textField_8);
		
		JLabel lblDate = new JLabel("Ngày");
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDate.setBounds(211, 10, 54, 28);
		panel_3.add(lblDate);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_9.setColumns(10);
		textField_9.setBounds(257, 14, 128, 25);
		panel_3.add(textField_9);
		
		JLabel lblDongia = new JLabel("Đơn giá");
		lblDongia.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDongia.setBounds(211, 48, 59, 28);
		panel_3.add(lblDongia);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_10.setColumns(10);
		textField_10.setBounds(277, 48, 108, 25);
		panel_3.add(textField_10);
		
		JLabel lblSumkaraoke = new JLabel("Tổng tiền karaoke");
		lblSumkaraoke.setHorizontalAlignment(SwingConstants.LEFT);
		lblSumkaraoke.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSumkaraoke.setBounds(10, 97, 135, 28);
		panel_3.add(lblSumkaraoke);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_11.setColumns(10);
		textField_11.setBounds(165, 101, 220, 25);
		panel_3.add(textField_11);
		
		JLabel lblSumFood = new JLabel("Tổng tiền gọi món");
		lblSumFood.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSumFood.setBounds(10, 135, 145, 28);
		panel_3.add(lblSumFood);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_12.setColumns(10);
		textField_12.setBounds(165, 136, 220, 25);
		panel_3.add(textField_12);
		
		JLabel lblTngTinKhch = new JLabel("Tổng tiền khách trả");
		lblTngTinKhch.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTngTinKhch.setBounds(10, 173, 145, 28);
		panel_3.add(lblTngTinKhch);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_13.setColumns(10);
		textField_13.setBounds(165, 171, 220, 25);
		panel_3.add(textField_13);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(855, 287, 385, 197);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNameFood = new JLabel("Loại món");
		lblNameFood.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNameFood.setBounds(10, 10, 79, 28);
		panel_4.add(lblNameFood);
		
		JComboBox comboBox = new JComboBox(new String[]{"Bia","Trái cây",""});
		comboBox.setBounds(99, 16, 276, 21);
		panel_4.add(comboBox);
		
		JScrollPane scrollPane_2 = new JScrollPane(table_2);
		scrollPane_2.setBounds(20, 48, 355, 139);
		panel_4.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"M\u1EB7t h\u00E0ng", "DVT", "\u0110\u01A1n gi\u00E1"
			}
		));
		table_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		scrollPane_2.setViewportView(table_2);
		
		JLabel lblSumFood_1 = new JLabel("Tổng tiền gọi món");
		lblSumFood_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSumFood_1.setBounds(460, 494, 145, 28);
		contentPane.add(lblSumFood_1);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_14.setColumns(10);
		textField_14.setBounds(615, 498, 220, 25);
		contentPane.add(textField_14);
		
		JLabel lblNewLabel = new JLabel("Phòng");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(114, 0, 80, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblGiMn = new JLabel("Gọi món");
		lblGiMn.setHorizontalAlignment(SwingConstants.CENTER);
		lblGiMn.setForeground(Color.RED);
		lblGiMn.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblGiMn.setBounds(529, 268, 80, 28);
		contentPane.add(lblGiMn);
		
		JLabel lbltPhng = new JLabel("Đặt phòng");
		lbltPhng.setHorizontalAlignment(SwingConstants.CENTER);
		lbltPhng.setForeground(new Color(0, 0, 255));
		lbltPhng.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lbltPhng.setBounds(545, 0, 80, 28);
		contentPane.add(lbltPhng);
		
		JLabel lblThcn = new JLabel("Thực đơn");
		lblThcn.setHorizontalAlignment(SwingConstants.CENTER);
		lblThcn.setForeground(new Color(0, 255, 0));
		lblThcn.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblThcn.setBounds(1004, 249, 80, 28);
		contentPane.add(lblThcn);
		
		JLabel lblChuaNghia = new JLabel("chua nghia");
		lblChuaNghia.setHorizontalAlignment(SwingConstants.CENTER);
		lblChuaNghia.setForeground(new Color(255, 0, 128));
		lblChuaNghia.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblChuaNghia.setBounds(1004, -1, 80, 28);
		contentPane.add(lblChuaNghia);
	
	
		this.setVisible(true);
	}
}
