package bridge.shape;

import bridge.task.Drawing;

public class Circle implements Shape{
    Drawing drawing;

    public Circle(Drawing drawing) {
        this.drawing = drawing;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
        drawing.drawShape();
    }
}
