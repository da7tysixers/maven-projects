public class Furniture {
    private String bed;
    private String couch;
    private String desk;

    public Furniture(String bed, String couch, String desk) {
        this.bed = bed;
        this.couch = couch;
        this.desk = desk;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getCouch() {
        return couch;
    }

    public void setCouch(String couch) {
        this.couch = couch;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }
}
