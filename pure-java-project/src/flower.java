public class Flower{
    int pentalCount = 0;
    String s = new String("null");
    Flower(int pentals){
        pentalCount = pentals;
    }
    Flower(String ss){
        s = ss;
    }
    Flower(String s, int pentals){
        this(pentals);
        this(s);
        this.s = s;
    }
    Flower(){
        this("hi",47);
    }  
}