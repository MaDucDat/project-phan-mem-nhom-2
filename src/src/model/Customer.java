package model;

import java.util.Objects;

public class Customer {
	//khai bao lop khach
	private String ten;
    private int tuoi;
    private String soDienThoai;
    
    //khoi tao thuoc tinh khach
    public Customer(String ten, int tuoi, String soDienThoai) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.soDienThoai = soDienThoai;
    }

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	@Override
	public String toString() {
		return "Customer [ten=" + ten + ", tuoi=" + tuoi + ", soDienThoai=" + soDienThoai + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(soDienThoai, ten, tuoi);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(soDienThoai, other.soDienThoai) && Objects.equals(ten, other.ten) && tuoi == other.tuoi;
	}
    
}