package cs210_project;

public class Arraylist {

    private Tweeto Head;
    private int Size = 0;

    public Arraylist() {
    }

    public Tweeto getHead() {
        return Head;
    }

    public void setHead(Tweeto head) {
        this.Head = head;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public void addfirst(Tweeto N) {
        if (getSize()== 0) {
            Head = N;
        } else {
            N.setNext(Head);
            Head = N;
        }
        Size++;
    }

    public int search(String u, String k) {
        int c = 0;
        if (Head == null) {
            return c;
        }
        Tweeto temp = Head;

        while (temp != null) {
            if (temp.getID().toLowerCase().charAt(1) == u.toLowerCase().charAt(0)){
                if (temp.getTweet().contains(k)) {
                    c++;
                }
            }
            temp = temp.getNext();
        }
        return c;

    }
    public void print(){
     Tweeto temp = Head;
        while (temp != null) {
            System.out.println(temp.toString());
            temp = temp.getNext();
            
        }
    }
    

}
