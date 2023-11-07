package test;

import view.LoginView;
import view.QLKOKView;

public class Test {
	public static void main(String[] args) {
		try {
			new LoginView();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
