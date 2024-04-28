package bridge.shape;

import bridge.task.Drawing;

public class Rectangle implements Shape{
    Drawing drawing;

    public Rectangle(Drawing drawing) {
        this.drawing = drawing;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
        drawing.drawShape();
    }
}
