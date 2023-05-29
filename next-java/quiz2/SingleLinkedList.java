package quiz2;

public class SingleLinkedList {
    Node head, tail;
    int size;
    
    SingleLinkedList(){
        head = tail = null;
        size=0;
    }
    boolean isEmpty(){
        return size==0;
    }
    void addFirst(int data){
        Node nu = new Node(data);
        if(isEmpty()){
            head = tail = nu;
        }else{
            nu.n = head;
            head = nu;
        }
        size++;
    } 
    void deleteFirst(){
        Node tmp = head.n;
        head = head.n;
        tmp = null;
        size--;
    }
    void print(){
        Node tmp = head;
        while(tmp!=null){
            System.out.print(""+tmp.data+"-");
            tmp = tmp.n;
        }
        System.out.println("");
    } 
    //1.A. complete the missing code addLast
    /**
     * this method will add new node at the last
     */
    // void addLast(int data){
    //     Node nu = new Node(data);
    //     if(isEmpty()){
    //         head = tail = nu;
    //     }else{
    //         tail.n = nu;
    //         tail = nu;
    //        //complete here
           
    //     }
    //     size++;
    // }
    // */
    //1.B. complete the deleteLast
    /**
     * this method will remove tail
     */
    void deleteLast(){
        // create new node
        Node tmp = head;
        // loop until tmp.n is tail
        while(tmp.n!=tail){
            // move tmp to next node
            tmp = tmp.n;
        }
        // set tail to be tmp
        tmp.n = null;
        // set tail to be tmp
        tail = tmp;
        // decrement size
        size--;
    }
}
