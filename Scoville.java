/* PQ에 대한 원소의 값을 모두 50이상 만드는 에제이다.
 * PQ.peek() <= 50를 진행해도 PriorityQueue자체가 낮은 값이 우선순위가 높아 낮은 값들만 비교하기 떄문에
 * 다른 코드를 작성할 필요없이 비교가 가능하다.
 */

import java.util.PriorityQueue;

public class Scoville {
    public static void main(String[] args) {
        
    PriorityQueue<Integer> PQ = new PriorityQueue<>();

    PQ.add(20);
    PQ.add(10);
    PQ.add(8);
    PQ.add(40);
    PQ.add(30);
    PQ.add(40);
    PQ.add(100);
    PQ.add(60);
    PQ.add(70);
    PQ.add(20);

    int first = 0;
    int second = 0;
    int total;
    int count = 0;

    while(PQ.peek() <= 50){
        first = PQ.remove();
        second = PQ.peek();
        total = first + second*2;
        PQ.add(total);
        count++;
    }

    while(PQ.size() != 0){
        System.out.println(PQ.remove());
    }
    System.out.println("총 섞은 횟수는 : "+ count + "번 입니다.");
}
}