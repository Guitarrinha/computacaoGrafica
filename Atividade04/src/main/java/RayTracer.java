import imgFunctions.Point3;
import utils.MathUtils;

import java.io.PrintStream;

class Color {
    public double x, y, z;

    public Color(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Ray {
    public Point3 orig;
    public Point3 dir;

    public Ray(Point3 orig, Point3 dir) {
        this.orig = orig;
        this.dir = dir;
    }
}

public class RayTracer {
    public static Color rayColor(Ray r) {
        return new Color(0, 0, 0);
    }

    public static void main(String[] args) {
        // Image

        double aspectRatio = 16.0 / 9.0;
        int imageWidth = 400;

        // Calculate the image height, and ensure that it's at least 1.
        int imageHeight = (int) (imageWidth / aspectRatio);
        imageHeight = (imageHeight < 1) ? 1 : imageHeight;

        // Camera

        double focalLength = 1.0;
        double viewportHeight = 2.0;
        double viewportWidth = viewportHeight * ((double) imageWidth / imageHeight);
        Point3 cameraCenter = new Point3(0, 0, 0);

        // Calculate the vectors across the horizontal and down the vertical viewport edges.
        MathUtils.Vec3 viewportU = new MathUtils.Vec3(viewportWidth, 0, 0);
        MathUtils.Vec3 viewportV = new MathUtils.Vec3(0, -viewportHeight, 0);

        // Calculate the horizontal and vertical delta vectors from pixel to pixel.
        MathUtils.Vec3 pixelDeltaU = viewportU.dividir(imageWidth);
        MathUtils.Vec3 pixelDeltaV = viewportV.dividir(imageHeight);

        // Calculate the location of the upper left pixel.
        Point3 viewportUpperLeft = cameraCenter.minus(new MathUtils.Vec3(0, 0, focalLength)).minus(viewportU.multiplicar(0.5)).minus(viewportV.multiplicar(0.5));
        Point3 pixel00Loc = viewportUpperLeft.plus(pixelDeltaU.multiplicar(0.5)).plus(pixelDeltaV.multiplicar(0.5));

        // Render

        PrintStream out = System.out;
        out.println("P3");
        out.println(imageWidth + " " + imageHeight);
        out.println("255");

        for (int j = 0; j < imageHeight; ++j) {
            System.err.print("\rScanlines remaining: " + (imageHeight - j) + " ");
            for (int i = 0; i < imageWidth; ++i) {
                Point3 pixelCenter = pixel00Loc.plus(pixelDeltaU.multiplicar(i)).plus(pixelDeltaV.multiplicar(j));
                Point3 rayDirection = pixelCenter.minus(new MathUtils.Vec3(cameraCenter.getX(), cameraCenter.getY(), cameraCenter.getZ()));
                Ray r = new Ray(cameraCenter, rayDirection);

                Color pixelColor = rayColor(r);
                writeColor(out, pixelColor);
            }
        }

        System.err.println("\rDone.");
    }

    public static void writeColor(PrintStream out, Color color) {
        int ir = (int) (255.999 * color.x);
        int ig = (int) (255.999 * color.y);
        int ib = (int) (255.999 * color.z);

        out.println(ir + " " + ig + " " + ib);
    }
}