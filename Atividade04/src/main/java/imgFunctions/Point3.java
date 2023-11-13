package imgFunctions;

import utils.MathUtils;

public class Point3 {
    public double x, y, z;

    public Point3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3 minus(MathUtils.Vec3 v) {
        return new Point3(x - v.data[0], y - v.data[1], z - v.data[2]);
    }

    public Point3 plus(MathUtils.Vec3 v) {
        return new Point3(x + v.data[0], y + v.data[1], z + v.data[2]);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}