package assment;
import java.util.Date;
import java.util.Objects;
	
public class room {
	//khoi tao thuoc tinh phong
	private int soPhong; 	// so phong 
	private String tenPhong;	// ten phong
	private boolean trangThai; // tinh trang su dung phong
	private Date GioVao; //thoi gian vao cua khach
	private Date GioHet; // thoi gian het

	public room(int soPhong, String tenPhong, Date Giovao, Date Giohet ) {
		this.soPhong = soPhong;
		this.tenPhong = tenPhong;
		this.trangThai = false;
	}

	public int getSoPhong() {
		return soPhong;
	}

	public void setSoPhong(int soPhong) {
		this.soPhong = soPhong;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	public Date getGioVao() {
		return GioVao;
	}

	public void setGioVao(Date gioVao) {
		GioVao = gioVao;
	}

	public Date getGioHet() {
		return GioHet;
	}

	public void setGioHet(Date gioHet) {
		GioHet = gioHet;
	}

	public room(int soPhong, String tenPhong, boolean trangThai, Date gioVao, Date gioHet) {
		super();
		this.soPhong = soPhong;
		this.tenPhong = tenPhong;
		this.trangThai = trangThai;
		GioVao = gioVao;
		GioHet = gioHet;
	}

	@Override
	public int hashCode() {
		return Objects.hash(GioHet, GioVao, soPhong, tenPhong, trangThai);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		room other = (room) obj;
		return Objects.equals(GioHet, other.GioHet) && Objects.equals(GioVao, other.GioVao) && soPhong == other.soPhong
				&& Objects.equals(tenPhong, other.tenPhong) && trangThai == other.trangThai;
	}

	@Override
	public String toString() {
		return "room [soPhong=" + soPhong + ", tenPhong=" + tenPhong + ", trangThai=" + trangThai + ", GioVao=" + GioVao
				+ ", GioHet=" + GioHet + ", getSoPhong()=" + getSoPhong() + ", getTenPhong()=" + getTenPhong()
				+ ", isTrangThai()=" + isTrangThai() + ", getGioVao()=" + getGioVao() + ", getGioHet()=" + getGioHet()
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
