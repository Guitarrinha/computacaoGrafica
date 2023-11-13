public class Main {
    public static void main(String[] args) {
        double aspectRatio = 16.0 / 9.0;
        int imageWidth = 400;

        // Calculate the image height, and ensure that it's at least 1.
        int imageHeight = (int) (imageWidth / aspectRatio);
        imageHeight = (imageHeight < 1) ? 1 : imageHeight;

        // Viewport widths less than one are ok since they are real valued.
        double viewportHeight = 2.0;
        double viewportWidth = viewportHeight * ((double) imageWidth / imageHeight);

        System.out.println("Image Width: " + imageWidth);
        System.out.println("Image Height: " + imageHeight);
        System.out.println("Viewport Width: " + viewportWidth);
        System.out.println("Viewport Height: " + viewportHeight);
    }
}
