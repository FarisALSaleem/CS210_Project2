package cs210_project;
public class ArrayList {
    private Tweeto Head;
    private int Size=0;

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

    public void addfirst(Tweeto N){
        if (this.Head==null){
          Head=N;
          
        }
          else{
         N.getNext().setNext(Head);
              Head=N;
              
                  }
        Size++;
     }
     public Tweeto search(String ID){
        if (Head== null)
            return null;
        Tweeto temp= Head;
        
        while(temp!=null){
            if (temp.getID()== ID){
                return temp;
            }
            temp=temp.getNext();
                }
        return temp;
        
        
    }
    
}
