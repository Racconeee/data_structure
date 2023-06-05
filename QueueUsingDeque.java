//deque를 사용해서 Queue구현하기


import java.util.Deque;
import java.util.ArrayDeque;


class Queue<E>{ // 
    Deque<E> dq1 = new ArrayDeque<>(); //ArrayDeque의 인스턴스를 생성하고 
    //ArrayDeque 구현에 제공하는 기능을 사용하는 Deque의 유요한 인스턴스이다.

    public void enqueue(E x){ // enqueue()메소드는 원소를 삽입한다.
        dq1.addLast(x); //deque를 활용해서 마지막부분에 원소를 삽입한다.
    }

    public E dequeue(){ //dequeue() 메소드는 가장 앞에 있는 원소를 삭제한다.
        return dq1.removeFirst(); // deque메소드 removeFirst()메소드를 이용해 queue의 dequeue 기능을 구현.
    }
    public E peek(){ //queue의 가장 앞에 있는 원소 출력 
        return dq1.peekFirst();
    }
    public boolean isEmpty(){ //스택이 비었는지 유무를 확인하는 메소드
        return dq1.isEmpty();
    }
}
public class QueueUsingDeque {
    public static void main(String[] args) {
        Queue<String> q1 = new Queue<>();
        q1.enqueue("Kim");
        q1.enqueue("Lee");
        q1.enqueue("Park");
        q1.enqueue("ssin");
        System.out.println(q1.peek());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.isEmpty());
    }
}
