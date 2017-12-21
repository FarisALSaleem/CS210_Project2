package cs210_project;

public class TweetoBHHT {

    private Heap[] HT;
    private int size = 37;

    public TweetoBHHT() {
        HT = new Heap[getSize()];
    }

    public void add(Tweeto t) {
        int i = (t.hashCode() % 37);
        if (HT[i]==null)
            HT[i] = new Heap();
        HT[i].insert(new Tweeto(t.getID(), t.getTweet()));
    }

    public int search(String u, String k) {
        Tweeto ucode = new Tweeto("@" + u, " ");
        int c = 0;
        int i = (ucode.hashCode() % 37);
        if (HT[i] == null) {
            return 0;
        } else 
            while (!HT[i].isEmpty()) {
                Tweeto t = HT[i].remove();
                if (t.getID().toLowerCase().charAt(1) == u.toLowerCase().charAt(0))
                    if (t.getTweet().toLowerCase().contains(k.toLowerCase())) 
                        c++; 
            }
            return c;
         }

    public Heap[] getHT() {
        return HT;
    }

    public void setHT(Heap[] HT) {
        this.HT = HT;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
