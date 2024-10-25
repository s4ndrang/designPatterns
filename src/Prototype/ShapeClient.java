package Prototype;

public class ShapeClient {
    private Shape shapePrototype;
    public ShapeClient(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    public Shape createShape() { //instead of creating with new, we call the clone method
        return shapePrototype.clone();
    }
}
