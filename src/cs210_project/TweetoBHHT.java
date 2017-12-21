package cs210_project;
public class TweetoBHHT {
    
    //An array holding the hash table
    private Tweeto[] HT;
    //current number of Tweeto objects
    private int size;
   
    public TweetoBHHT(){
        HT = Tweeto[1000001];
        size = 0;
    }
//        public TweetoBHHT(Tweeto[] arr){
//        HT = (Tweeto[]) new Arraylist(); 
//    }
    
    public void insert(Tweeto T){
        //inserts Tweeto T in appropriate position.
        size++;
        HT[size] = T;
        swim(size);   
    }
    
    public Tweeto search(String U,String K){
        //NOT YET IMPLEM
        return null;
    }
    public Tweeto remove(){
        if (isEmpty()){
            return null;
        }
        //get tweeto
        Tweeto result = HT[1];
        
        //remove last child
        HT[1] = HT[size];
        HT[size] = null;
        size--;
        
        sink(1);
        
        return result;
    }
    
    private void swim(int k){
        
        // if k has parent and is bigger than child, swap
        while (k > 1 && 
                (HT[k].compareTo(HT[k/2]) > 0)) {
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
                   HT[k*2+1].compareTo(HT[2*k]) > 0){
               biggerChild = 2 * k + 1;
            }
             //compare parent with smaller child
            if (HT[biggerChild].compareTo(HT[k]) > 0){
                swap(k, biggerChild);
               
            }else{
                //we're done, get out
                break;
            }
            k = biggerChild;     
        }
    }
        
    
    public boolean isEmpty(){ 
        return size == 0;
    } 

    private void swap(int k, int i) {
        // swap elements
        Tweeto tmp = HT[k];
        HT[k] = HT[i];
        HT[i] = tmp;
        
    }
    public Tweeto[] getHT() {
        return HT;
    }

    public void setHT(Tweeto[] HT) {
        this.HT = HT;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
