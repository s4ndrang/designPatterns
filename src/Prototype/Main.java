package Prototype;

public class Main {
    public static void main(String args[]) {
        Shape redCircle = new Circle("red");
        ShapeClient client = new ShapeClient(redCircle);
        Shape clonedRedCircle = client.createShape();
        clonedRedCircle.draw();

        redCircle.draw();

        Shape blueSquare = new Square("blue");
        ShapeClient blueSquareClient = new ShapeClient(blueSquare);
        Shape clonedBlueSquare = blueSquareClient.createShape();
        clonedBlueSquare.draw();
        blueSquare.draw();
    }
}
