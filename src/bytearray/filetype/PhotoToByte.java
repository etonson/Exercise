package bytearray.filetype;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.imageio.ImageIO;

public class PhotoToByte {
	static byte[] bytes;

	public static void main(String[] args) throws Exception {
		File img = new File("/home/sixson/桌面/13938083_1228486123851645_8601760165325060267_o.jpg");
		fileToByte(img);
	}

	public static void fileToByte(File img) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			BufferedImage bi;
			bi = ImageIO.read(img);
			ImageIO.write(bi, "png", baos);
			bytes = baos.toByteArray();
			System.out.println(bytes.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			baos.close();
		}
	}
}
