package cs210_project;

public class TweetoHT {

    private Tweeto[] HT;
    private final int size = 36;

    public TweetoHT() {
        HT = new Tweeto[getSize()];

    }

    public void add(Tweeto t) {
        int i = (t.hashCode() % 36);
        if (HT[i] == null) {
            HT[i] = new Tweeto(t.getID(), t.getTweet());
        } else {
            t.setNext(HT[i]);
            HT[i] = t;
        }
    }

    public int search(String u, String k) {
        int ucode = (int) u.charAt(0);
        int i = (ucode % 36);
        Tweeto temp = HT[i];
        int c = 0;
        if (HT[i] == null) 
            return 0;
        
        else {
            while (temp != null) {
                if (temp.getID().toLowerCase().charAt(1) == u.toLowerCase().charAt(0)) {
                    if (temp.getTweet().contains(k)) 
                        c++;
                }temp = temp.getNext();
            }
            return c;
        }
    }

    public void setHT(Tweeto[] HT) {
        this.HT = HT;
    }

    public int getSize() {
        return size;
    }

    public Tweeto[] getHT() {
        return HT;
    }
}
