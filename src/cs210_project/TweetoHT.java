package cs210_project;

public class TweetoHT {

    private Tweeto[] HT;
    private final int size = 37;

    public TweetoHT() {
        HT = new Tweeto[getSize()];

    }

    public void add(Tweeto t) {
        int i = ((t.hashCode()*7+3) % 37);
        if (HT[i] == null) {
            HT[i] = new Tweeto(t.getID(), t.getTweet());
        } else {
            t.setNext(HT[i]);
            HT[i] = t;
        }
    }

    public int search(String u, String k) {
        Tweeto ucode = new Tweeto("@"+u, " ");
        int i = ((ucode.hashCode()*7+3) % 37);
        Tweeto temp = HT[i];
        int c = 0;
        if (HT[i] == null) 
            return 0;
        else {
            while (temp != null) {
                if (temp.getID().toLowerCase().charAt(1) == u.toLowerCase().charAt(0)) {
                    if (temp.getTweet().toLowerCase().contains(k.toLowerCase())) 
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
