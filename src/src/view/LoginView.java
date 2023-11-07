package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.LoginController;

import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Window;

import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextField;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private TextField txtUserName;
	private JPasswordField txtPass;

	public LoginView() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Đăng Nhập");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(243, 10, 186, 51);
		contentPane.add(lblNewLabel);

		JLabel lblTaiKhoan = new JLabel("Tài Khoản:");
		lblTaiKhoan.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaiKhoan.setForeground(new Color(0, 0, 0));
		lblTaiKhoan.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTaiKhoan.setBounds(10, 98, 186, 51);
		contentPane.add(lblTaiKhoan);

		JLabel lblMatKhau = new JLabel("Mật Khẩu:");
		lblMatKhau.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatKhau.setForeground(new Color(0, 0, 0));
		lblMatKhau.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblMatKhau.setBounds(10, 189, 186, 51);
		contentPane.add(lblMatKhau);

		LoginController ac = new LoginController(this, null);

		JButton Login = new JButton("Đăng Nhập");
		Login.addActionListener(ac);
		Login.setFont(new Font("Times New Roman", Font.BOLD, 25));
		Login.setBounds(147, 297, 158, 47);
		contentPane.add(Login);

		JButton exit = new JButton("Thoát");
		exit.addActionListener(ac);
		exit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		exit.setBounds(396, 297, 158, 47);
		contentPane.add(exit);

		TextField txtUserName = new TextField();
		txtUserName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtUserName.setBounds(202, 98, 392, 39);
		contentPane.add(txtUserName);

		txtPass = new JPasswordField();
		txtPass.setBounds(202, 193, 392, 51);
		contentPane.add(txtPass);

		this.setVisible(true);
	}
}
