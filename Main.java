//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MovablePoint mvp1 = new MovablePoint(10, 20, 15, 25);
        System.out.println("X: " + mvp1.getX() + "\nX Speed: " + mvp1.getxSpeed());
        System.out.println("Y: " + mvp1.getY() + "\nY Speed: " + mvp1.getySpeed());
        mvp1.moveLeft();
        System.out.println("Move Left: " + mvp1.getX());
        mvp1.moveRight();
        System.out.println("Move right: " + mvp1.getX());
        mvp1.moveUp();
        System.out.println("Move Up: " + mvp1.getY());
        mvp1.moveDown();
        System.out.println("Move Down: " + mvp1.getY());
        System.out.println("************************");
        MovablePoint mvp2 = new MovablePoint(5, 5, 5, 5);
        mvp2.moveRight(); //10
        System.out.println("Move Right: " + mvp2.getX());
        mvp2.moveLeft(); //5
        System.out.println("Move Left: " + mvp2.getX());
        mvp2.moveUp(); // 10;
        System.out.println("Move Up: " + mvp2.getY());
        mvp2.moveDown(); // 5
        System.out.println("Move Down: " + mvp2.getY());
        mvp2.setxSpeed(10);
        mvp2.setySpeed(10);
        System.out.println("afet changing speed: ");
        System.out.println("Move Right: " + mvp2.getX());
        mvp2.moveLeft(); //5
        System.out.println("Move Left: " + mvp2.getX());
        mvp2.moveUp(); // 10;
        System.out.println("Move Up: " + mvp2.getY());
        mvp2.moveDown(); // 5
        System.out.println("Move Down: " + mvp2.getY());
    }
}