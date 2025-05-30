package review;
public class Detergent extends Cleanser {
 private String specialIngredient;
 public void scrub(Brush b) {
    System.out.println("Brush!");
 // scrub gently, then
 super.scrub(b); // the usual way
 }
 public void foam() { // make bubbles}
}
}