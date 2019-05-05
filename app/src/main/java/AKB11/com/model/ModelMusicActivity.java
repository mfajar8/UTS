package AKB11.com.model;

//Kelas   : AKB-11
//NIM     : 10116463
//Nama    : Mochamad Fajar Ismatulloh
//Tanggal : 1 Mei 2019

public class ModelMusicActivity {

    private String txtJudulMusic;
    private String txtArtisMusic;
    private int imgMusicLagu;
    private int rawMusic;

    public ModelMusicActivity(int imgMusicLagu, String txtJudulMusic, String txtArtisMusic, int rawMusic) {
        this.txtJudulMusic = txtJudulMusic;
        this.txtArtisMusic = txtArtisMusic;
        this.imgMusicLagu = imgMusicLagu;
        this.rawMusic = rawMusic;
    }

    public String getTxtJudulMusic() {
        return txtJudulMusic;
    }

    public String getTxtArtisMusic() {
        return txtArtisMusic;
    }

    public int getImgMusicLagu() {
        return imgMusicLagu;
    }

    public int getRawMusic() {
        return rawMusic;
    }

    public void setRawMusic(int rawMusic) {
        this.rawMusic = rawMusic;
    }
}
