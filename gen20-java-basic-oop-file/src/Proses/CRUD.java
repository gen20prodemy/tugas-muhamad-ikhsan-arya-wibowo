package Proses;

public abstract class CRUD {
    private String data;

    public CRUD (String data){
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
