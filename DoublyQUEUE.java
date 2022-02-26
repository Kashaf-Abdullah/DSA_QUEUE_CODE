public class DoublyQUEUE implements  DoublyQueueInterface  {
    Node head=new Node();
    private int size;
    public static class Node {

        int data;
        Node next=this;
        Node prev=this;
        Node(int data){
            this.data=data;
        }
        Node (){
 
        }
 Node(int data,Node next,Node prev){
 
     this.data=data;
     this.next=next;
     this.prev=prev;
 }
    }
    public void addatfront(int obj){
       if(this.head.next==null){
           head.next.data=obj;
           head.next=head.prev;
           ++size;
       }
       else{
           head.prev=head.prev.next=new Node(obj,head,head.prev);
           ++size;
       }
 
 }
     public void addatrear(int obj){
        if(this.head.next==null){
            head.next.data=obj;
            head.next=head.prev;
            ++size;
        }
        else{
            head.next=head.next.prev=new Node(obj,head.next,head.next.next);

            ++size;
        
        }
     }
     
   public int first(){
       return 0;
   }
   public int last(){
       return 0;
   }
   
     public int removeatfront (){
        Node n = null;
		if (head.next == null) {
			throw new IllegalArgumentException("Stack is Empty");
		}
        else{
            n=head.next;
            head.next=head.next.next;
            size--;
        }
        return n.data;
     }
     public int removeatrear(){
        Node r = null;
		if (head.next == null) {
			throw new IllegalArgumentException("Stack is Empty");
		}
        else{
            r=head.prev;
            head.prev=head;
            size--;

        }

         return r.data;
     }
 
     public int size(){
         return size;
     } 
     public void display(){
         
for(Node i=head.next;i!=head;i=i.next){
System.out.print(i.data);

}
     }
 
 public static void main(String args[]){
     DoublyQUEUE d=new DoublyQUEUE();
//      d.addatrear(3);

//      d.addatrear(5);
 
//  d.addatrear(8);
//  d.addatrear(6);
d.addatfront(4);
d.addatfront(6);
d.addatfront(9);
System.out.println("size :"+d.size());
     d.display();
     System.out.println();

     System.out.println("last eelement");
 System.out.println(d.removeatrear());
 d.display();
 System.out.println("size :"+d.size());
 System.out.println("first element "+d.removeatfront());
 d.display();
 System.out.println("size :"+d.size());
 
    }
     
 }
 