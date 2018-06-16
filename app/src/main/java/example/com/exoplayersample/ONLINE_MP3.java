package example.com.exoplayersample;

import com.google.gson.annotations.SerializedName;

public class ONLINE_MP3 {
    private String category_image_thumb;
    private String category_image;
    private String category_name;
    private String cid;
    private String rate_avg;
    private String total_rate;
    private String mp3_description;
    private String mp3_artist;
    private String mp3_duration;
    private String mp3_thumbnail_s;
    private String mp3_thumbnail_b;
    private String mp3_url;
    private String mp3_title;
    private String mp3_type;
    private String cat_id;
    private String id;

    public ONLINE_MP3(String mp3_url, String mp3_title,String mp3_thumbnail_s) {
        this.mp3_url = mp3_url;
        this.mp3_title = mp3_title;
        this.mp3_thumbnail_b=mp3_thumbnail_s;
    }

    public String getCategory_image_thumb() {
        return category_image_thumb;
    }

    public void setCategory_image_thumb(String category_image_thumb) {
        this.category_image_thumb = category_image_thumb;
    }

    public String getCategory_image() {
        return category_image;
    }

    public void setCategory_image(String category_image) {
        this.category_image = category_image;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getRate_avg() {
        return rate_avg;
    }

    public void setRate_avg(String rate_avg) {
        this.rate_avg = rate_avg;
    }

    public String getTotal_rate() {
        return total_rate;
    }

    public void setTotal_rate(String total_rate) {
        this.total_rate = total_rate;
    }

    public String getMp3_description() {
        return mp3_description;
    }

    public void setMp3_description(String mp3_description) {
        this.mp3_description = mp3_description;
    }

    public String getMp3_artist() {
        return mp3_artist;
    }

    public void setMp3_artist(String mp3_artist) {
        this.mp3_artist = mp3_artist;
    }

    public String getMp3_duration() {
        return mp3_duration;
    }

    public void setMp3_duration(String mp3_duration) {
        this.mp3_duration = mp3_duration;
    }

    public String getMp3_thumbnail_s() {
        return mp3_thumbnail_s;
    }

    public void setMp3_thumbnail_s(String mp3_thumbnail_s) {
        this.mp3_thumbnail_s = mp3_thumbnail_s;
    }

    public String getMp3_thumbnail_b() {
        return mp3_thumbnail_b;
    }

    public void setMp3_thumbnail_b(String mp3_thumbnail_b) {
        this.mp3_thumbnail_b = mp3_thumbnail_b;
    }

    public String getMp3_url() {
        return mp3_url;
    }

    public void setMp3_url(String mp3_url) {
        this.mp3_url = mp3_url;
    }

    public String getMp3_title() {
        return mp3_title;
    }

    public void setMp3_title(String mp3_title) {
        this.mp3_title = mp3_title;
    }

    public String getMp3_type() {
        return mp3_type;
    }

    public void setMp3_type(String mp3_type) {
        this.mp3_type = mp3_type;
    }

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
