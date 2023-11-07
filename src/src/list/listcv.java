package list;

import java.util.ArrayList;
import java.util.Objects;

import staff.staff;

public class listcv {
	private ArrayList<staff> DSchucvu;
	private String luachon;
	
	public listcv() {
		this.DSchucvu = new ArrayList<staff>();
		this.luachon = "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(DSchucvu, luachon);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		listcv other = (listcv) obj;
		return Objects.equals(DSchucvu, other.DSchucvu) && Objects.equals(luachon, other.luachon);
	}
	
}