// //Array로 PriorityQueue구현하기
// //우선순위 큐
// //입력된 원소순서와는 무관하게 원소가 가지고 있는 순위가 있어,
// //높은 우선순위를 가진 원소부터 출력되는 자료구조이다
// // PriorityQueue의 연산
// // insert(item) , remove, find, isEmpty,isFull,display


// import java.util.PriorityQueue;

// import javax.rmi.CORBA.Util;

// class PriorityQueue{
//     int maxSize; //배열의 최대 원소 개수
//     int[] qArray; // PriorityQueue 배열 선언
//     int nItems; // 원소들의 갯수
    
//     public PriorityQueue(int s ){
//         maxSize = s;
//         qArray = new int[maxSize];
//         nItems = 0;
//     }

//     public void insert(int x){ //x 원소를 삽입한다.
//         if ( nItems >= maxSize){ // 원소가 배열의 최대 원소 개수를 넘는다면  PQ is full출력한다.
//             System.out.println("PQ is full"); 
//             return;
//         }
//         if(nItems == 0){ // 원소가 하나도 없다면 x값을 원소 0번방에 넣게된다.
//             qArray[0] = x;
//             nItems++;
//         }else{ //원소가 하나라도 있는 경우라면 
//             int j = 0;
//             for(j = nItems-1; j>=0;j--){ // 원소의 개수-1만큼 진행하면서 원소의 개수와 처음 들어오는 x와 비교를한다
//                 if(x>qArray[j]){ //aArray 배열에 들어있는 원소가 x값보다 작다면 배열의 index를 1 증가시켜 index를 이동시킨다.
//                     qArray[j+1] = qArray[j];
//                 }else{ // 만약 배얄의 원소가 더 크다면 제대로 정렬된것이기 때문에 break해서 끝낸다.
//                     break;
//                 }
//             }
//             qArray[j+1] = x; //위에 for문에서 멈춘 j부분을 index삼아서 x의 값을 배열에 저장해준다.
//             nItems++;

//         }
//     }

//     public int remove(){ //가장 앞에있는 값을 삭제하는 메소드
        
//         int x = qArray[nItems-1]; // 우선순위가 가장 큰 원소를 x에 저장하고 return을 통해서 삭제된 원소의 값을 알려준다.
//         nItems--; // 원소를 하나 삭제하였으니, 전체 원소의 개수에서 -1을 해준다
//         return x;
//     }
//     public int peek(){ //현재 원소를 알려주는 메소드 == 우선순위가 가장 먼저인 원소
//         return qArray[nItems-1]; 
//     }
//     public boolean isEmpty(){ // 배열이 비었는지 알수있는 메소드
//         return nItems == 0; // nItems를 이용해서 구현 
//     }
//     public int size(){
//         return nItems;
//     }

// }


// public class ArrayPQ{


//     public static void main(String[] args) {
        
//         PriorityQueue pq1 = new PriorityQueue(100); //PriorityQueue를 생성하고 초기값으로 배열의 max길이를 100으로 초기화함
//         pq1.insert(10);
//         pq1.insert(20);
//         pq1.insert(9);
//         pq1.insert(14);
//         System.out.println("현재 배열의 원소의 개수는 : " + pq1.size());
//         System.out.println(pq1.isEmpty()); // 원소가 들어있으니 false
//         System.out.println(pq1.remove());
//         System.out.println(pq1.peek());
//         System.out.println(pq1.remove());
//         System.out.println(pq1.peek());
//         System.out.println(pq1.remove());
//         System.out.println(pq1.peek());
        
//     }
// }