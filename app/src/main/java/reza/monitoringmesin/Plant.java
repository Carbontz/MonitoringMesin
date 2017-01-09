package reza.monitoringmesin;

/**
 * Created by Reza on 09/01/2017.
 */

public class Plant {

    public static String[] arrayNamaPlant = {"Plant I", "Plant II", "Plant III", "Plant IV", "Plant V"};
    public static int[] arrayGambarPlant = {R.drawable.plant1,R.drawable.plant2,R.drawable.plant3,R.drawable.plant4,
            R.drawable.plant5};

    public Plant() {

    }

    public String[] getArrayNamaPlant() {
        return arrayNamaPlant;
    }

    public void setArrayNamaPlant(String[] arrayNamaPlant) {
        this.arrayNamaPlant = arrayNamaPlant;
    }

    public int[] getArrayGambarPlant() {
        return arrayGambarPlant;
    }

    public void setArrayGambarPlant(int[] arrayGambarPlant) {
        this.arrayGambarPlant = arrayGambarPlant;
    }
}
