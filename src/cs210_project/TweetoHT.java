package cs210_project;

public class TweetoHT {
    private ArrayList [] HT;
    private final int size = 36; 

    public TweetoHT() {
        HT = new ArrayList[getSize()];
            
    }
    
    public void add (Tweeto t){
    int i = (t.hashCode() % 36);
    if (HT[i] == null)
        HT[i] = new ArrayList();
    HT[i].addfirst(t);
    }
    
    public int search(String u, String k){
    int c =0;
    int ucode=(int) u.charAt(0);
    int i = (ucode % 36);
    if (HT[i]==null)
        return 0;
    else
        return HT[i].search(u, k);
    } 
    

    public void setHT(ArrayList[] HT) {
        this.HT = HT;
    }
    

    public int getSize() {
        return size;
    }
    public ArrayList[] getHT() {
        return HT;
    }
    
    
    
    
    
    
    
    
}
