class Sedan {
 final int topSpeed;
 Sedan(int ts) {
 topSpeed = ts;
 // …
 }
}
class DragRace {
 Sedan chevy = new Sedan(120), ford = new Sedan(140);
 //! chevy.topSpeed = 150;
 class Sedan {
 public void replaceTire(final Tire t) {
 //! t = new Tire();