package staff;

import java.util.ArrayList;

public class staff {
	private int IDnhanvien;
	private String Tennhanvien;
	private int phonenhanvien;
	private String diachianv;
	private int usernhanvien;
	private int passnhanvien;
	
	public staff(int iDnhanvien, String tennhanvien, int phonenhanvien, String diachianv, int usernhanvien, int passnhanvien) {
		super();
		IDnhanvien = iDnhanvien;
		Tennhanvien = tennhanvien;
		this.phonenhanvien = phonenhanvien;
		this.diachianv = diachianv;
		this.usernhanvien = usernhanvien;
		this.passnhanvien = passnhanvien;
	}
	
	public int getIDnhanvien() {
		return IDnhanvien;
	}



	public void setIDnhanvien(int iDnhanvien) {
		IDnhanvien = iDnhanvien;
	}



	public String getTennhanvien() {
		return Tennhanvien;
	}



	public void setTennhanvien(String tennhanvien) {
		Tennhanvien = tennhanvien;
	}



	public int getPhonenhanvien() {
		return phonenhanvien;
	}



	public void setPhonenhanvien(int phonenhanvien) {
		this.phonenhanvien = phonenhanvien;
	}



	public String getDiachianv() {
		return diachianv;
	}



	public void setDiachianv(String diachianv) {
		this.diachianv = diachianv;
	}



	public int getUsernhanvien() {
		return usernhanvien;
	}



	public void setUsernhanvien(int usernhanvien) {
		this.usernhanvien = usernhanvien;
	}



	public int getPassnhanvien() {
		return passnhanvien;
	}



	public void setPassnhanvien(int passnhanvien) {
		this.passnhanvien = passnhanvien;
	}
	
	@Override
	public String toString() {
		return "staff [IDnhanvien=" + IDnhanvien + ", Tennhanvien=" + Tennhanvien + ", phonenhanvien=" + phonenhanvien
				+ ", diachianv=" + diachianv + ", usernhanvien=" + usernhanvien + ", passnhanvien=" + passnhanvien
				+ "]";
	}
	
}


