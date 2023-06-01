import org.omg.CORBA.ValueBaseHolder;

class PQNode{
    String name;
    int priority;
    PQNode link;
    public PQNode(String name, int priority){
        this.name = name;
        this.priority = priority;
        link = null;
    }
    public String toString(){
        return this.name + "  " +this.priority;
    }
}

class priorityQueue{
    PQNode front;
    public void enqueue(String name , int priority){
        PQNode q,p;
        PQNode newNode = new PQNode(name, priority);
        if(front == null){  // front가 null 이면 newNode값을 연결리스트의 front으로 설정한다.
            front = newNode;
        }else if ( newNode.priority < front.priority){ // 새로운 원소의 원소보다 front의 값이 더 크다면 
            newNode.link = front;
            front = newNode;
        }else {
            q=null;
            p = front;
            while(p.link != null && p.priority <= newNode.priority){
                q = p;
                p = p.link;
            }
            newNode.link = p.link;
            p.link = newNode;
        }
    }

    public PQNode dequeue(){
        PQNode tmPqNode = front;
        front = front.link;
        return tmPqNode;
    }
    public PQNode peek(){
        return front;

    }
    public int size(){
        PQNode tmPqNode = front;
        int count=0;
        if(tmPqNode == null){
            return 0;
        }else{
        while(tmPqNode != null){
            count++;
            tmPqNode= tmPqNode.link;
        }}
        return count;
    }


}
public class ListPQ {
    public static void main(String[] args) {
        PQNode tmpNode;
        priorityQueue pq1 = new priorityQueue();
        pq1.enqueue("Kim",30);
        pq1.enqueue("Lee",20);
        pq1.enqueue("Park",40);
        pq1.enqueue("Choi",50);
        System.out.println("연결리스트에 저장된 원소의 개수는  : "+pq1.size());

        // tmpNode = pq1.dequeue();
        // System.out.println(tmpNode.name + " "+tmpNode.priority);
        System.out.println(pq1.dequeue());
        System.out.println(pq1.dequeue());
        System.out.println(pq1.dequeue());
        System.out.println(pq1.dequeue());
        
    }
}
