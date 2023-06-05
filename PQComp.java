//우선순위 큐를 활용해서 MyNode에 해당하는 id,name,score를 관리하는 예제프로그램
//Comparator을 이용하였다.


import java.util.PriorityQueue;
import java.util.Comparator;


class MyNode{
    int id = 0;
    String name;
    int score;
    public MyNode(int id , String name, int score){
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public String toString(){
        return "(" +id+ ", " + name +", "+ score+")";
    }
}


public class PQComp{
    public static void main(String[] args) {
        Comparator<MyNode> comparator = new MyClassComparator();
        //MyClassComparator의 인스턴스를 생성해서 comparator안에 대입한다.
        PriorityQueue<MyNode> PQ = new PriorityQueue<MyNode>(10,comparator);
        MyNode n1 = new MyNode(1, "Kim",88);
        MyNode n2 = new MyNode(2, "Lee",68);
        MyNode n3 = new MyNode(3, "Park",88);
        MyNode n4 = new MyNode(4, "You",55);
        MyNode n5 = new MyNode(5, "Choi",99);

        PQ.add(n1);
        PQ.add(n2);
        PQ.add(n3);
        PQ.add(n4);
        PQ.add(n5);
        while(PQ.size() != 0){
            System.out.println(PQ.remove().toString());
        }
    }
}

//MyClassComparator클래스는 Comparator<MyNode> 를 성속받아서 compare()메소드를 구현한다.
//MyClassComparator클래스 안에서 compare()메소드를 구현해서 MyNode에 대한 두개의 값을 매개변수로 활용해 score을 기준으로 우선순위를 결정한다
class MyClassComparator implements Comparator<MyNode> { //Comparator 인터페이스를 구체화하는 빵틀
	@Override
	public int compare(MyNode x, MyNode y) {
		if (x.score < y.score) {
			return -1;
		}
		if (x.score > y.score) {
			return 1;
		}
		return 0;
        
	}
}