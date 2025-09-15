package br.com.mariojp.figureeditor;


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class RectFigure extends BaseFigure {

    private int x;
    private int y;
    private int width;
    private int height;

    public RectFigure(int x, int y, int width, int height, Color color, Stroke stroke) {
        super(x, y, width, height, color, stroke);
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(this.color);
        g.setStroke(this.stroke);
        g.drawRect(this.x, this.y, this.width, this.height);
    }
}

