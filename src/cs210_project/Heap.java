package cs210_project;

public class Heap {

    private Tweeto[] heap;
    private int size;
    
    public Heap() {
        heap= new Tweeto[1000001];
        size=0;
    }


   public void insert(Tweeto T){
        //inserts Tweeto T in appropriate position.
        size++;
        heap[size] = T;
        swim(size);   
    }
    
    
    public int getSize() {
        return size;
    }
    private void swap(int k, int i) {
        // swap elements
        Tweeto tmp = heap[k];
        heap[k] = heap[i];
        heap[i] = tmp;
        
    }

    
     private void swim(int k){
        
        // if k has parent and is bigger than child, swap
        while (k > 1 && 
                (heap[k].compareTo(heap[k/2]) > 0)) {
            swap(k, k/2);
            // K becomes the parent
            k = k/2;
        }
    }
    private void sink(int k){
        
        while (2 * k <= size){
            //start with left child
            int biggerChild = k * 2;
            
             //compare left child with right child 
            if ( 2 * k + 1 <= size && 
                   heap[k*2+1].compareTo(heap[2*k]) > 0){
               biggerChild = 2 * k + 1;
            }
             //compare parent with smaller child
            if (heap[biggerChild].compareTo(heap[k]) > 0){
                swap(k, biggerChild);
               
            }else{
                //we're done, get out
                break;
            }
            k = biggerChild;     
        }
    }
    private Tweeto getTweeto (int x){
        return heap[x];
    }
    
    public Tweeto remove(){
        if (isEmpty()){
            return null;
        }
        //get tweeto
        Tweeto result = heap[1];
        
        //remove last child
        heap[1] = heap[size];
        heap[size] = null;
        size--;
        
        sink(1);
        
        return result;
    }
     public boolean isEmpty(){ 
        return size == 0;
    } 
    
    
    
    

}
