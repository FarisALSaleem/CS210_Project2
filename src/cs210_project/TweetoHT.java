package cs210_project;

public class TweetoHT {
    private Arraylist [] HT;
    private final int size = 36; 

    public TweetoHT() {
        HT = new Arraylist[getSize()];
            
    }
    
    public void add (Tweeto t){
    int i = (t.hashCode() % 36);
    if (HT[i] == null)
        HT[i] = new Arraylist();
    HT[i].addfirst(t);
    }
    
    public int search(String u, String k){
    int ucode=(int) u.charAt(0);
    int i = (ucode % 36);
    if (HT[i]==null)
        return 0;
    else
        return HT[i].search(u, k);
    } 
    

    public void setHT(Arraylist[] HT) {
        this.HT = HT;
    }
    

    public int getSize() {
        return size;
    }
    public Arraylist[] getHT() {
        return HT;
    }
}
