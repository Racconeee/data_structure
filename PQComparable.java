//우선순위 큐를 활용해서 MyNode에 해당하는 id,name,score를 관리하는 예제프로그램
//Comparable 객체들의 순서를 정의하는데 사용되는인터페이스이다.
//Comparable는 compareTo 메소드를 정의하여 객체간의 비교를 수행한다.


import java.util.PriorityQueue;
import java.lang.Comparable;

//MyNode클래스 에서 Comparable<제네릭> 을 상속받아 구현하였다.
class MyNode implements Comparable<MyNode> {
    int id = 0;
    String name;
    int score;

    public MyNode(int id , String name, int score){
        this.id = id;
        this.name = name;
        this.score = score;
    }


    //compareTo를 오버라이드 하여서 
    @Override
	public int compareTo(MyNode other) {
		if (score != other.score)
			return Integer.compare(score, other.score);
        return 0;
    }
    
    public String toString(){
        return "(" +id+ ", " + name +", "+ score+")";
    }
}



public class PQComparable{
    public static void main(String[] args) {
        //MyClassComparable의 인스턴스를 생성해서 comparator안에 대입한다.
        PriorityQueue<MyNode> PQ = new PriorityQueue<MyNode>();

        PQ.add(new MyNode(1, "Kim",88));
        PQ.add(new MyNode(2, "Lee",68));
        PQ.add(new MyNode(3, "Park",88));
        PQ.add(new MyNode(4, "You",55));
        PQ.add(new MyNode(5, "Choi",99));

        while(PQ.size() != 0){
            System.out.println(PQ.remove().toString());
        }
    }
}