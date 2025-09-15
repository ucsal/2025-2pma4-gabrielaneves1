package br.com.mariojp.figureeditor;

import java.awt.Color;
import java.awt.Stroke;
import java.awt.BasicStroke;

public class PastelFigureFactory implements AbstractFigureFactory {

    
    public Figure createFigure(ShapeKind kind, int x, int y, int width, int height) {
        Color pastelColor = new Color(173, 216, 230);
        Stroke pastelStroke = new BasicStroke(2f);

        if(kind == ShapeKind.RECT) {
            return new RectFigure(x, y, width, height, pastelColor, pastelStroke);
        } else if (kind == ShapeKind.CIRCLE) {
            int size = Math.min(width, height);
            return new CircleFigure(x, y, size, pastelColor, pastelStroke);
        }
        return null;
    }

    @Override
    public Figure createCircle(int x, int y, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCircle'");
    }

    @Override
    public Figure createRectangle(int x, int y, int size) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createRectangle'");
    }

}
