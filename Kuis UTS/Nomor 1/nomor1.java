public class nomor1 {
    private String nbolpoint, npensil, npenghapus;
    private int sbolpoint, spensil, spenghapus;
    private int bolpoint, pensil, penghapus;
    private int hbolpoint, hpensil, hpenghapus;
    private int total;

    // Getter & Setter Method Bolpoint
    public void setNbolpoint(String nbolpoint){
        this.nbolpoint = nbolpoint;
    }

    public String getNbolpoint() {
        return nbolpoint;
    }

    public void setSbolpoint(int sbolpoint){
        this.sbolpoint = sbolpoint;
    }

    public int getSbolpoint(){
        return sbolpoint;
    }

    public void setBolpoint(int bolpoint){
        this.bolpoint = bolpoint;
    }

    public int getBolpoint(){
        return bolpoint;
    }

    public void setHbolpoint(int bolpoint){
        hbolpoint = 10 * bolpoint;
    }

    public int getHbolpoint(){
        return hbolpoint;
    }

    // Getter & Setter Method Pensil
    public void setNpensil(String npensil){
        this.npensil = npensil;
    }

    public String getNpensil() {
        return npensil;
    }

    public void setSpensil(int spensil){
        this.spensil = spensil;
    }

    public int getSpensil(){
        return spensil;
    }

    public void setPensil(int pensil){
        this.pensil = pensil;
    }

    public int getPensil(){
        return pensil;
    }

    public void setHpensil(int pensil){
        hpensil = 10 * pensil;
    }

    public int getHpensil(){
        return hpensil;
    }

    // Getter & Setter Method Penghapus
    public void setNpenghapus(String npenghapus){
        this.npenghapus = npenghapus;
    }

    public String getNpenghapus() {
        return npenghapus;
    }

    public void setSpenghapus(int spenghapus){
        this.spenghapus = spenghapus;
    }

    public int getSpenghapus(){
        return spenghapus;
    }

    public void setPenghapus(int penghapus){
        this.penghapus = penghapus;
    }

    public int getPenghapus(){
        return penghapus;
    }

    public void setHpenghapus(int penghapus){
        hpenghapus = 10 * penghapus;
    }

    public int getHpenghapus(){
        return hpenghapus;
    }

    public void setTotal(int hbolpoint, int hpenghapus, int hpensil){
        total = hbolpoint + hpensil + hpenghapus;
    }

    public int getTotal(){
        return total;
    }
}