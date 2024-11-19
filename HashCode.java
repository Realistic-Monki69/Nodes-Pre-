//Hashcodes

public class HashCode{
  public static void main(String[] args){
    Character c = new Character('a');
    System.out.println(c.hashCode());

    Character c2 = new Character('b');
    System.out.println(c2.hashCode());

    Character c3 = new Character('A');
    System.out.println(c3.hashCode());

    Integer num = 42;
    System.out.println(num.hashCode());

    Integer num2 = new Integer(101);
    System.out.println(num2.hashCode());

    String s = "ab";
    System.out.println(s.hashCode());
    // ab = 3105 because: ('a'*31^1)('b'*31^0)
    //arthimetic sequence
    //31 is a prime number
    //that prime number helps us mitigate coalitions

    Double d = 42.42;
    System.out.println(d.hashCode());
  }
}
