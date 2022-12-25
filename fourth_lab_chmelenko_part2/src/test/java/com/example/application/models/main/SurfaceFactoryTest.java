package com.example.application.models.main;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurfaceFactoryTest {
    @Test
    public void testGeneralType() {
        Surface surface = SurfaceFactory.create(1, 1, 1, 1, 0, 0, 0, 0, 0, -1);
        assertEquals("Поверхня загального вигляду", surface.name());
    }

    @Test
    public void testElipsoid() {
        Surface surface = SurfaceFactory.create(1, 1, 1, 0, 0, 0, 0, 0, 0, -1);
        assertTrue(surface instanceof Elipsoid);
        assertEquals("Еліпсоїд", surface.name());
    }

    @Test
    public void testImaginaryElipsoid() {
        Surface surface = SurfaceFactory.create(1, 1, 1, 0, 0, 0, 0, 0, 0, 1);
        assertTrue(surface instanceof ImaginaryElipsoid);
        assertEquals("Уявний еліпсоїд", surface.name());
    }

    @Test
    public void testImaginaryCone() {
        Surface surface = SurfaceFactory.create(1, 1, 1, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(surface instanceof ImaginaryCone);
        assertEquals("Уявний конус", surface.name());
    }

    @Test
    public void testSingleCavityHyperboloid() {
        Surface surface = SurfaceFactory.create(1, 1, -1, 0, 0, 0, 0, 0, 0, 1);
        assertTrue(surface instanceof SingleCavityHyperboloid);
        assertEquals("Однопорожнинний гіперболоїд", surface.name());
    }

    @Test
    public void testDoubleCavityHyperboloid() {
        Surface surface = SurfaceFactory.create(1, 1, -1, 0, 0, 0, 0, 0, 0, -1);
        assertTrue(surface instanceof DoubleCavityHyperboloid);
        assertEquals("Двопорожнинний гіперболоїд", surface.name());
    }

    @Test
    public void testCone() {
        Surface surface = SurfaceFactory.create(1, 1, -1, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(surface instanceof Cone);
        assertEquals("Конус", surface.name());
    }

    @Test
    public void testEllipticParaboloid() {
        Surface surface = SurfaceFactory.create(1, 1, 0, 0, 0, 0, 0, 0, -1, 0);
        assertTrue(surface instanceof EllipticParaboloid);
        assertEquals("Еліптичний параболоїд", surface.name());
    }

    @Test
    public void testHyperbolicParaboloid() {
        Surface surface = SurfaceFactory.create(1, -1, 0, 0, 0, 0, 0, 0, -1, 0);
        assertTrue(surface instanceof HyperbolicParaboloid);
        assertEquals("Гіперболічний параболоїд", surface.name());
    }

    @Test
    public void testEllipticCylinder() {
        Surface surface = SurfaceFactory.create(1, 1, 0, 0, 0, 0, 0, 0, 0, -1);
        assertTrue(surface instanceof EllipticCylinder);
        assertEquals("Еліптичний циліндр", surface.name());
    }

    @Test
    public void testImaginaryEllipticCylinder() {
        Surface surface = SurfaceFactory.create(1, 1, 0, 0, 0, 0, 0, 0, 0, 1);
        assertTrue(surface instanceof ImaginaryEllipticCylinder);
        assertEquals("Уявний еліптичний циліндр", surface.name());
    }

    @Test
    public void testPairOfImaginaryIntersectedPlanes() {
        Surface surface = SurfaceFactory.create(1, 1, 0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(surface instanceof PairOfImaginaryIntersectedPlanes);
        assertEquals("Пара уявних площин, що перетинаються", surface.name());
    }

    @Test
    public void testHyperbolicCylinder() {
        Surface surface = SurfaceFactory.create(1, -1, 0, 0, 0, 0, 0, 0, 0, -1);
        assertTrue(surface instanceof HyperbolicCylinder);
        assertEquals("Гіперболічний циліндр", surface.name());
    }

    @Test
    public void testPairOfIntersectedPlanes() {
        Surface surface = SurfaceFactory.create(1, -1, 0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(surface instanceof PairOfIntersectedPlanes);
        assertEquals("Пара площин, що перетинаються", surface.name());
    }

    @Test
    public void testParabolicCylinder() {
        Surface surface = SurfaceFactory.create(0, 1, 0, 0, 0, 0, -2, 0, 0, 0);
        assertTrue(surface instanceof ParabolicCylinder);
        assertEquals("Параболічний циліндр", surface.name());
    }

    @Test
    public void testPairOfParallelPlanes() {
        Surface surface = SurfaceFactory.create(0, 1, 0, 0, 0, 0, 0, 0, 0, -2);
        assertTrue(surface instanceof PairOfParallelPlanes);
        assertEquals("Пара паралельних площин", surface.name());
    }

    @Test
    public void testPairOfImaginaryParallelPlanes() {
        Surface surface = SurfaceFactory.create(0, 1, 0, 0, 0, 0, 0, 0, 0, 2);
        assertTrue(surface instanceof PairOfImaginaryParallelPlanes);
        assertEquals("Пара уявних паралельних площин", surface.name());
    }

    @Test
    public void testPairOfMatchingPlanes() {
        Surface surface = SurfaceFactory.create(0, 1, 0, 0, 0, 0, 0, 0, 0, 0);
        assertTrue(surface instanceof PairOfMatchingPlanes);
        assertEquals("Пара співпадаючих площин", surface.name());
    }
}
