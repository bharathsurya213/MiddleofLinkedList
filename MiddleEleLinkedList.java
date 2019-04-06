class MiddleEleLinkedList
{
     class Node 
    { 
        int data; 
        Node next; 
        Node(int data) 
        { 
            this.data = data; 
            this.next = null; 
        } 
    } 
    
    Node head;
 
   void middle(){
       Node slw=head;
       Node fst=head;
       while(fst!=null && fst.next!=null){
              fst=fst.next.next;
              slw=slw.next;
          }
       System.out.println("the middle element is:"+slw.data);
   }
}