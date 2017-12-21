package cs210_project;

public class TweetoBHHT {
    
    private Heap[] HT;
    private int size = 37;

    public TweetoBHHT() {
        HT =new Heap[getSize()];    
    }
    
    public void add(Tweeto t) {
        int i = (t.hashCode() % 37);
        HT[i].insert(new Tweeto(t.getID(), t.getTweet()));
    }
    
    public int search(String u, String k) {
        Tweeto ucode = new Tweeto("@"+u, " ");
        int i = (ucode.hashCode() % 37);
        if (HT[i] == null) 
            return 0;
        else
            return HT[i].search;}

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
