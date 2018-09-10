package excercises.chap8.poly3;

class Glyph {
    void draw(){
        System.out.println("Glyph.draw()");
    }
    Glyph(){
        System.out.println("Glyph() before draw() call");
        draw();
        System.out.println("Glyph() after draw() call");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }

//    @Override
//    void draw() {
//        System.out.println("RoundGlyph.draw, radius = " + radius);
//    }
}

class RectangularGlyph extends Glyph{
    private int radius = 2;
//    @Override
//    void draw() {
//        System.out.println("RectangularGlyph.draw, radius = " + radius);
//    }

    public RectangularGlyph(int radius) {
        this.radius = radius;
        System.out.println("RectangularGlyph.draw(), radius = " + radius);
    }
}

public class PolyConstructors {

    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(6);

    }

}


