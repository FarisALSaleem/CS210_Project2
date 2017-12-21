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
        return String.format("%s:\n%s\n",getID(),getTweet());
    }

    @Override
    public int hashCode() {
        if ((getID().toLowerCase().charAt(1) == 'z'))
            return 96;
        else if ((getID().toLowerCase().charAt(1) == 'x'))
            return 94;
        else if ((getID().toLowerCase().charAt(1) == 'y'))
            return 95;
        return ((int)(getID().toLowerCase().charAt(1)));
    }

    @Override
    public int compareTo(Tweeto o) {
        return (getID().compareTo(o.getID()));
    }    
}
