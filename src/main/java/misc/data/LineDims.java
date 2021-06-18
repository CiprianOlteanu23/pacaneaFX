package misc.data;

public class LineDims {

    private int lX;
    private int lY;
    private int sX;
    private int sY;
    private int eX;
    private int eY;

    public LineDims(int lX, int lY, int sX, int sY, int eX, int eY) {
        this.lX = lX;
        this.lY = lY;
        this.sX = sX;
        this.sY = sY;
        this.eX = eX;
        this.eY = eY;
    }

    public int getlX() {
        return lX;
    }

    public void setlX(int lX) {
        this.lX = lX;
    }

    public int getlY() {
        return lY;
    }

    public void setlY(int lY) {
        this.lY = lY;
    }

    public int getsX() {
        return sX;
    }

    public void setsX(int sX) {
        this.sX = sX;
    }

    public int getsY() {
        return sY;
    }

    public void setsY(int sY) {
        this.sY = sY;
    }

    public int geteX() {
        return eX;
    }

    public void seteX(int eX) {
        this.eX = eX;
    }

    public int geteY() {
        return eY;
    }

    public void seteY(int eY) {
        this.eY = eY;
    }
}
