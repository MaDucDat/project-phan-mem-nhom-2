package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.staffView;

public class QLNVcontroller implements ActionListener {
	public staffView view;

	public QLNVcontroller(staffView view) {

		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào: " + cm);
		if (cm.equals("Lưu")) {
			this.view.xoaForm();
			this.view.model.setLuachon("Lưu");
		} else if (cm.equals("Cập nhật")) {
			if (this.view.model.getLuachon().equals("") || this.view.model.getLuachon().equals("Cập nhật")) {
				// trường hợp cm là "Cập nhật" và Luachon là trống hoặc "Cập nhật"
			} else if (this.view.model.getLuachon().equals("Lưu")) {
				// trường hợp cm là "Cập nhật" và Luachon là "Lưu"
			}
		} else if (cm.equals(" ")) {
			// trường hợp cm là khoảng trắng

		} else {
			// trường hợp cm không phù hợp với bất kỳ trường hợp nào ở trên
		}
		
	}

}
