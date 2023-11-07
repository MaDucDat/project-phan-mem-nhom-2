package food;

import java.util.ArrayList;
import java.util.Objects;

public class Doan {
    private int Madoan;
    private String Tendoan;

    public Doan(int Madoan, String Tendoan) {
        this.Madoan = Madoan;
        this.Tendoan = Tendoan;
    }

    public int getMadoan() {
        return Madoan;
    }

    public void setMadoan(int Madoan) {
        this.Madoan = Madoan;
    }

    public String getTendoan() {
        return Tendoan;
    }

    public void setTendoan(String Tendoan) {
        this.Tendoan = Tendoan;
    }

    @Override
    public String toString() {
        return "Doan [Madoan=" + Madoan + ", Tendoan=" + Tendoan + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Doan other = (Doan) obj;
        return Madoan == other.Madoan && Objects.equals(Tendoan, other.Tendoan);
    }

    public static ArrayList<Doan> getDSDoan() {
        String[] arrayDoan = {
            "Sụn gà rang muối",
        	"Xúc xích nướng tiêu",
        	"Cơm chiên hải sản",
        	"Mì xào hải sản",
        	"Tôm mực lăn chiên bột",
        	"Tôm sú hấp trái dừa (bia)",
        	"Tôm nướng muối ớt",
        	"Ba rọi giòn da",
        	"Giò heo muối chiên giòn"
        };
        ArrayList<Doan> listDoan = new ArrayList<>();
        int i = 0;
        for (String Tendoan : arrayDoan) {
            Doan da = new Doan(i, Tendoan);
            listDoan.add(da);
            i++;
        }
        return listDoan;
    }
}
