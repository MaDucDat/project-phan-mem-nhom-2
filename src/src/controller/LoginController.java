package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.staffView;
import view.LoginView;

public class LoginController implements ActionListener {
	LoginView loginView;
	staffView qlNvView;

	public LoginController(LoginView loginView, staffView qlNvView) {
		this.loginView = loginView;
		this.qlNvView = qlNvView;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		JOptionPane.showMessageDialog(loginView, "Bạn vừa nhấn vào: " + cmd);
		if (cmd.equals("Thoát")) {
			loginView.dispose();
		}
		if (cmd.equals("Đăng Nhập")) {
			loginView.dispose();
			new staffView().setVisible(true);
		}

	}


}
