package AKB11.com.model;

//Kelas   : AKB-11
//NIM     : 10116463
//Nama    : Mochamad Fajar Ismatulloh
//Tanggal : 1 Mei 2019

public class ModelFriendActivity {

    private int imgGambarFriend;
    private String txtJudulFriend;

    public ModelFriendActivity(int imgGambarFriend, String txtJudulFriend) {
        this.imgGambarFriend= imgGambarFriend;
        this.txtJudulFriend= txtJudulFriend;
    }

    public String getTxtJudulFriend() {
        return txtJudulFriend;
    }

    public int getImgGambarFriend() {
        return imgGambarFriend;
    }
}