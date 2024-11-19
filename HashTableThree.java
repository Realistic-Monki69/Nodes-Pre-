import java.util.LinkedList;

public class HashTableThree{
    public static void main(String[] args){
        //first make a table
        LinkedList[] hashTable = new LinkedList[10];

        for(int i = 0; i < hashTable.length; i++){
            hashTable[i] = new LinkedList();        
        }

        Character c = '1';
        hashTable[c.hashCode()%10].add(c);

        Integer  num = 42;
        hashTable[num.hashCode()%10].add(num);

        for(LinkedList list : hashTable){
            for(Object thing : list){
                System.out.println(thing + "->");
            }   
            System.out.println();
        }
    }
}