package Telusko_Practice;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class SteganographyDecoder {

    public static String extractMessage(BufferedImage image) {
        StringBuilder message = new StringBuilder();
        int width = image.getWidth();
        int height = image.getHeight();

        int charValue = 0;
        int bitCount = 0;

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgb = image.getRGB(x, y);
                int blue = rgb & 0xFF;
                int bit = blue & 1;

                charValue = (charValue << 1) | bit;
                bitCount++;

                if (bitCount == 8) {
                    char character = (char) charValue;
                    message.append(character);
                    if (message.toString().endsWith("#END#")) {
                        return message.substring(0, message.length() - 5);
                    }
                    charValue = 0;
                    bitCount = 0;
                }
            }
        }
        return message.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedImage image = ImageIO.read(new File("hidden.png"));
        String extractedMessage = extractMessage(image);
        System.out.println("Extracted Message: " + extractedMessage);
    }
}
