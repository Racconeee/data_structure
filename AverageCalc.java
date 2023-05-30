//ArrayDeque,Deque,Iterator 을 활용하는 예제 코드
// Iterator는 Deque 안에 있는 내용을 순서대로 출력하기 위해 사용
//Iterator<데이터타입> Iterator명 = 컬렉션.Iterator();으로 사용이 가능하다.


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

class student{
    int id;
    String name;
    int score;
    public student(int id, String name, int score){
        this.id = id;
        this.name = name;
        this.score = score;
    }
    @Override
    public String toString(){
        return "아이디 : " +id + " 이름 :  " + name+ " 성적 : " + score;
    }

    public int getscore(){
        return score;
    }
}
public class AverageCalc{
    public static void main(String[] args) {
        
        Deque<student> dq = new ArrayDeque<>();
        dq.addFirst(new student(5, "shin", 100));
        dq.addFirst(new student(4, "guck", 58));
        dq.addFirst(new student(3, "sank", 60));
        dq.addFirst(new student(2, "song", 20));
        dq.addLast(new student(6, "Choi", 50));
        dq.addLast(new student(7, "cho", 30));
        dq.addLast(new student(8, "joo", 90));
        dq.addLast(new student(9, "jae", 98));
        dq.addFirst(new student(1, "kim", 88));
        dq.addLast(new student(10, "LEE", 70));

        System.out.println();
        System.out.println("Iterator을 활용해서 원소들을 출력하기");
        Iterator it1 = dq.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        System.out.println();
        System.out.println("역순으로 출력하기");
        Iterator<student> reverseIt = dq.descendingIterator();
        while (reverseIt.hasNext()) {
            System.out.println(reverseIt.next());
        }
        
        int total = 0;
        int avg = 0;
        Iterator<student> st_list = dq.iterator();
        while (st_list.hasNext()) {
            total += st_list.next().getscore();
        }
        avg = total / dq.size();
        
        System.out.println();
        System.out.println(dq.size() + "명의 학생들의 평균은 : "+avg);
        

    }
}