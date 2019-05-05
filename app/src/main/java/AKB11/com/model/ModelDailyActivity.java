package AKB11.com.model;

//Kelas   : AKB-11
//NIM     : 10116463
//Nama    : Mochamad Fajar Ismatulloh
//Tanggal : 1 Mei 2019

public class ModelDailyActivity {

    private int imgGambarDaily;
    private String txtJudulDaily;

    public ModelDailyActivity(int imgGambarDaily, String txtJudulDaily) {
        this.imgGambarDaily= imgGambarDaily;
        this.txtJudulDaily = txtJudulDaily;

    }

    public String getTxtJudulDaily() {
        return txtJudulDaily;
    }

    public int getImgGambarDaily() {
        return imgGambarDaily;
    }
}
