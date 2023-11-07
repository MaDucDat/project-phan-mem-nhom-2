package drinks;

import java.util.ArrayList;
import java.util.Objects;

public class Douong {
	
	    private int Madouong;
	    private String Tendouong;

	    public Douong(int Madouong, String Tendouong) {
	        this.Madouong = Madouong;
	        this.Tendouong = Tendouong;
	    }

	    public int getMadouong() {
	        return Madouong;
	    }

	    public void setMadouong(int Madouong) {
	        this.Madouong = Madouong;
	    }

	    public String getTendouong() {
	        return Tendouong;
	    }

	    public void setTendouong(String Tendouong) {
	        this.Tendouong = Tendouong;
	    }

	    @Override
	    public String toString() {
	        return "Douong [Madouong=" + Madouong + ", Tendouong=" + Tendouong + "]";
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        Douong other = (Douong) obj;
	        return Madouong == other.Madouong && Objects.equals(Tendouong, other.Tendouong);
	    }

	    public static ArrayList<Douong> getDSDouong() {
	        String[] arrayDouong = {
	            "Heniken"
	        };
	        ArrayList<Douong> listDouong = new ArrayList<>();
	        int i = 0;
	        for (String Tendouong : arrayDouong) {
	            Douong da = new Douong(i, Tendouong);
	            listDouong.add(da);
	            i++;
	        }
	        return listDouong;
	    }
	}
