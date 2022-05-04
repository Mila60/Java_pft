package ru.stqa.pft.sendbox;

public class PointTests {

    @Test

    public void testDistance() {
        Point p1 = new Point(-4.0, 10.0);
        Point p2 = new Point(0.0, 13.0);
        assert distance() == 5.0
    }
}
