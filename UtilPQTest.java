import java.util.PriorityQueue;


public class UtilPQTest {
    public static void main(String[] args) {
        PriorityQueue<String> PQ = new PriorityQueue<String>();
        PQ.add("Kim");
        PQ.add("Lee");
        PQ.add("Choi");
        PQ.add("Park");
        PQ.add("oi");
        PQ.add("jae");
        System.out.println("현재 PQ의 원소 개수는 : "+PQ.size());
        System.out.println("clear메소드를 활용하여 전부 삭제시킵니다.");
        PQ.clear();
        System.out.println("현재 PQ의 원소 개수는 : "+PQ.size());

    }
}
