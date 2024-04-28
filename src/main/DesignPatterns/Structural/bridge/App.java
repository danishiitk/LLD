package bridge;

import bridge.shape.Circle;
import bridge.shape.Shape;
import bridge.task.Drawing;
import bridge.task.PencilDrawing;

public class App {
    public static void main(String[] args) {
        Drawing pencilDrawing = new PencilDrawing();
        Shape circle = new Circle(pencilDrawing);
        circle.draw();
    }
}
