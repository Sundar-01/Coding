package Telusko_Practice;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SteganographyEncoder {

    public static void hideMessage(BufferedImage image, String message, String outputFilePath) throws IOException {
        message += "#END#";  // Marker to indicate end of message
        int messageIndex = 0;
        int charBitIndex = 0;
        int width = image.getWidth();
        int height = image.getHeight();

        outerLoop:
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (messageIndex >= message.length()) break outerLoop;

                int rgb = image.getRGB(x, y);
                int blue = rgb & 0xFF;

                char currentChar = message.charAt(messageIndex);
                int bit = (currentChar >> (7 - charBitIndex)) & 1;

                blue = (blue & 0xFE) | bit;  // set LSB to message bit

                int newRgb = (rgb & 0xFFFFFF00) | blue;
                image.setRGB(x, y, newRgb);

                charBitIndex++;
                if (charBitIndex == 8) {
                    charBitIndex = 0;
                    messageIndex++;
                }
            }
        }

        File output = new File(outputFilePath);
        ImageIO.write(image, "png", output);
        System.out.println("Message hidden in image saved to: " + outputFilePath);
    }

    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("/Users/guestuser/Documents/Coding/Telusko_Practice/original.png"));
        String secretMessage = "Hello, this is secret!";
        hideMessage(image, secretMessage, "hidden.png");
    }
}
