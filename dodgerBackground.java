import org.code.neighborhood.*;

public class dodgerBackground extends PainterPlus {

public void background() {
  /**
  *This is to paint the top row.
  */
  while(canMove("east")) {
    paint("blue");
    move();
  }
  turnRight();
    /**
  *This is to paint the right column.
  */
  while (canMove("south")){
      paint("blue");
    move();
  }
    turnRight();
  /**
  *This is to paint the bottom row.
  */
   while (canMove("west")){
      paint("blue");
    move();
  }
    turnRight();
  /**
  *This is to paint the left column.
  */
   while (canMove("north")){
      paint("blue");
    move();
  }
  turnLeft();
  turnLeft();
  move();
  turnLeft();
   while(canMove("east")) {
    paint("blue");
    move();
  }
  turnRight();
  move();
  turnRight();
   while(canMove("west")) {
    paint("blue");
    move();
  }
  turnLeft();
  move();
  turnLeft();
   while(canMove("east")) {
    paint("blue");
    move();
  }
  turnRight();
  move();
  turnRight();
   while(canMove("west")) {
    paint("blue");
    move();
  }
   turnLeft();
  move();
  turnLeft();
   while(canMove("east")) {
    paint("blue");
    move();
  }
  turnRight();
  move();
  turnRight();
   while(canMove("west")) {
    paint("blue");
    move();
  }
   turnLeft();
  move();
  turnLeft();
   while(canMove("east")) {
    paint("blue");
    move();
  }
  turnRight();
  move();
  turnRight();
   while(canMove("west")) {
    paint("blue");
    move();
  }
   turnLeft();
  move();
  turnLeft();
   while(canMove("east")) {
    paint("blue");
    move();
  }
  turnRight();
  move();
  turnRight();
   while(canMove("west")) {
    paint("blue");
    move();
  }
   turnLeft();
  move();
  turnLeft();
   while(canMove("east")) {
    paint("blue");
    move();
  }
  turnRight();
  move();
  turnRight();
   while(canMove("west")) {
    paint("blue");
    move();
  }
   turnLeft();
  move();
  turnLeft();
   while(canMove("east")) {
    paint("blue");
    move();
  }
  turnRight();
  move();
  turnRight();
   while(canMove("west")) {
    paint("blue");
    move();
  }
turnRight();
moveFast();
}
}