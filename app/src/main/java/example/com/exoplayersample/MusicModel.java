package example.com.exoplayersample;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MusicModel {


    @SerializedName("ONLINE_MP3")
    private List<ONLINE_MP3> ONLINE_MP3;

    public List<ONLINE_MP3> getONLINE_MP3() {
        return ONLINE_MP3;
    }

    public void setONLINE_MP3(List<ONLINE_MP3> ONLINE_MP3) {
        this.ONLINE_MP3 = ONLINE_MP3;
    }
}
