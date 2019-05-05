package AKB11.com.model;

//Kelas   : AKB-11
//NIM     : 10116463
//Nama    : Mochamad Fajar Ismatulloh
//Tanggal : 1 Mei 2019

public class ModelVideoActivity {

    private String txtNamaVideo;
    private String rawVideo;

    public ModelVideoActivity(String txtNamaVideo, String rawVideo) {
        this.txtNamaVideo = txtNamaVideo;
        this.rawVideo = rawVideo;

    }

    public String getTxtNamaVideo() {
        return txtNamaVideo;
    }

    public String getRawVideo() {
        return rawVideo;
    }
}