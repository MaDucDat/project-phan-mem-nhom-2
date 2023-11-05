package assment;

import java.util.Objects;

public class staff {
	private int IDnhanvien;
	private String TenNhanVien;
	private String ChucVu;
	
	public staff() {
		
	}

	public staff(int iDnhanvien, String tenNhanVien, String chucVu) {
		IDnhanvien = iDnhanvien;
		TenNhanVien = tenNhanVien;
		ChucVu = chucVu;
	}

	public int getIDnhanvien() {
		return IDnhanvien;
	}

	public void setIDnhanvien(int iDnhanvien) {
		IDnhanvien = iDnhanvien;
	}

	public String getTenNhanVien() {
		return TenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		TenNhanVien = tenNhanVien;
	}

	public String getChucVu() {
		return ChucVu;
	}

	public void setChucVu(String chucVu) {
		ChucVu = chucVu;
	}

	@Override
	public String toString() {
		return "staff [IDnhanvien=" + IDnhanvien + ", TenNhanVien=" + TenNhanVien + ", ChucVu=" + ChucVu + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ChucVu, IDnhanvien, TenNhanVien);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		staff other = (staff) obj;
		return Objects.equals(ChucVu, other.ChucVu) && IDnhanvien == other.IDnhanvien
				&& Objects.equals(TenNhanVien, other.TenNhanVien);
	}
	
	
	
}
