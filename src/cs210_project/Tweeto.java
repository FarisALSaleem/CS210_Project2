package cs210_project;
public class Tweeto implements Comparable<Tweeto>{
    private String ID;
    private String Tweet;
    private Tweeto next;

    public Tweeto(String ID, String Tweet, Tweeto next) {
        setID(ID);
        setTweet(Tweet);
        setNext(next);        
    }

    public Tweeto(String ID, String Tweet) {
        setID(ID);
        setTweet(Tweet);
    }
    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTweet() {
        return Tweet;
    }

    public void setTweet(String Tweet) {
        this.Tweet = Tweet;
    }

    public Tweeto getNext() {
        return next;
    }

    public void setNext(Tweeto next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Tweeto o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
