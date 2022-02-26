

public class ArrayQueue implements Queue{
    Object a[];
    private int front;
    private int rear;
    private int size;
    public ArrayQueue(int size){
       front=rear=0;
       this.size=size;
        a=new Object[size];
    
    }
    
    
    public void add(int data){
        if(size==rear){
            System.out.printf("\nQueue is full\n");
            return;
        }
    else{
        a[rear]=data;
        rear++;
    
    }
    return;
    }
    public void  remove(){
    if(front==rear){
        System.out.printf("\nQueue is empty\n");
        return;
    }
    else{
        for(int i=0;i<rear-1;i++){
            a[i]=a[i+1];
        }
        if(rear<size)
        a[rear]=0;
    
        rear--;
    }
    return;
    }



    void display(){
        int i;
        if (front == rear) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
    for(i=front;i<rear;i++){
    System.out.print(a[i]+",");
    }
    }



    public int size(){
        return size;
    }
    void search(Object d){
int i;
boolean flag=false;
if (front == rear) {
    System.out.printf("\nQueue is Empty\n");
    return;
}
for(i=front;i<rear;i++){
if(d.equals(a[i])){
flag=true;
break;
}
else{
    flag=false;
}

}
if(flag){
    System.out.println("element is find ");
}
else{
    System.out.println("element is not find");
}

    }

    void frontelement(){

        if (front == rear) {
            System.out.println("queue is emepty");
            return;
        }
        System.out.println("front element is "+a[front]);
    return;
    }
    
    void rearelement(){

        if (front == rear) {
            System.out.println("queue is emepty");
            return;
        }
        System.out.println("rear element is "+a[rear-1]);
    return;
    }

    //check
 public Object clone(){
    Object b[];
  
    b=new Object[19]; 
    int i,j;
    if (front == rear) {
        System.out.printf("\nQueue is Empty\n");
        
    }
    for( i=front;i<rear;i++){
 b[i]=a[i];
 
        }
        for( i=front;i<rear;i++){
            System.out.print(b[i]+",");
            
                   }
           
                   return b[i];
           
    
}
//CHECK
public void removeBottomelement(){
    if(front==rear){
        System.out.printf("\nQueue is empty\n");
        return;
    }
    else{
       for(int i=front;i<rear;i++){
           if(i==rear-1){
               a[rear-1]=null;
               size--;
           }
       }
    }
    return ;

}
public void reverse(){
for(int i=rear-1;i>=front;i--){
    System.out.print(a[i]+",");
}
}

    public static void main(String args[]){
        ArrayQueue a=new ArrayQueue(22);
        a.add(3);
    a.add(5);
    a.add(7);

    a.add(9);
    a.add(13);
    a.add(33);
    a.add(99);
 System.out.println( "display" );
 System.out.println();
 a.display();
 System.out.println( " reverse display" );
 System.out.println();
 a.reverse();  
 System.out.println();
a.frontelement();
System.out.println();
    a.rearelement();
System.out.println("after removal Bottom/rear element ");

    a.removeBottomelement();
    System.out.println();
    a.display();
    System.out.println();
    System.out.println("after removal front element element ");

    a.remove();
    System.out.println();
    a.display();

    System.out.println();
a.search(5);
System.out.println();
System.out.println("display");

a.display();
System.out.println("display clone");
a.clone();

    }
    }
    