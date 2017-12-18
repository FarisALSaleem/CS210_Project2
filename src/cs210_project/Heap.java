package cs210_project;

public class Heap {

    private Tweeto root;
    private int size = 0;

    public Heap(Tweeto root) {
        setRoot(root);
        size++;
    }

    public Tweeto getRoot() {
        return root;
    }

    public Heap() {
    }

    public void setRoot(Tweeto root) {
        this.root = root;
    }

    public void add(Tweeto t) {
        if (getSize() == 0) {
            setRoot(t);
            size++;
        }
        
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
