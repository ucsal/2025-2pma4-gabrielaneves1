package br.com.mariojp.figureeditor;

import java.awt.*;

public abstract class BaseFigure implements Figure {
    protected final int cx, cy, size;

    protected final Color color;
    protected final Stroke stroke;

    protected BaseFigure(int cx, int cy, int size, int height, Color color, Stroke stroke) {
        this.cx = cx;
        this.cy = cy;
        this.size = size;
        this.color = color;
        this.stroke = stroke;
    }

    public abstract void draw(Graphics2D g);
}
