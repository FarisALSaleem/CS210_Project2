package cs210_project;
public class Tweeto implements Comparable<Tweeto>{
    private String ID;
    private String Tweet;
    private Tweeto next; //left
    private Tweeto next2; //right

    public Tweeto(String ID, String Tweet, Tweeto next) {
        setID(ID);
        setTweet(Tweet);
        setNext(next);        
    }

    public Tweeto(String ID, String Tweet) {
        setID(ID);
        setTweet(Tweet);
    }

    public Tweeto getNext2() {
        return next2;
    }

    public void setNext2(Tweeto next2) {
        this.next2 = next2;
    }

    public Tweeto(String ID, String Tweet, Tweeto next, Tweeto next2) {
        setID(ID);
        setTweet(Tweet);
        setNext(next);
        setNext2(next2);
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
        return String.format("%s:\n%s\n",getID(),getTweet());
    }

    @Override
    public int hashCode() {
        return ((int)(getID().toLowerCase().charAt(1)));
    }

    @Override
    public int compareTo(Tweeto o) {
        return (getID().compareTo(o.getID()));
    }    
}
