/**
 * Tm系统平台
 * tz_desk2
 * com.tz.util.image
 * Imageutils.java
 * 创建人:maerhuan 
 * 时间：2016年10月7日-下午11:56:13 
 * 2016Tm公司-版权所有
 */
package toolsUtils.imageUtil;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;


import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import toolsUtils.StringUtils.MehStringUtil;

public class Imageutils {

	/**
	 * 根据图片地址，获取图片的宽度和高度 com.tz.util.image 方法名：getImageWH 创建人：xuchengfei
	 * 手机号码:15074816437 时间：2015年9月26日-下午8:48:07
	 * 
	 * @param imgPath
	 * @return 返回类型：HashMap<String,Object>
	 * @exception
	 * @since 1.0.0
	 */
	public static HashMap<String, Object> getImageWH(String imgPath) {
		try {
			// 图片文件
			File file = new File(imgPath);
			// 图片处理类
			Image image = ImageIO.read(file);
			// 获取图片的宽度和高度
			int width = image.getWidth(null);
			int height = image.getHeight(null);
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("width", width);
			map.put("height", height);
			map.put("size", file.length());
			map.put("name", file.getName());
			map.put("sizeString", MehStringUtil.countFileSize(file.length()));
			return map;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 给图片添加文字水印</br> com.tz.util.image </br> 方法名：pressText </br> 创建人：maerhuan
	 * </br> 时间：2016年10月8日-上午12:03:44 </br>
	 * 
	 * @param pressText
	 * @param srcImageFile
	 *            图片源地址
	 * @param destImageFile目标地址
	 * @param fontName字体名称
	 * @param fontStyle
	 *            字体样式
	 * @param color
	 *            字体颜色
	 * @param fontSize
	 *            字体大小
	 * @param x
	 *            坐标
	 * @param y
	 *            坐标
	 * @param alphaalpha
	 *            透明度：alpha 必须是范围 [0.0, 1.0] 之内（包含边界值）的一个浮点数字 void </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static void pressText(String pressText, String srcImageFile,
			String destImageFile, String fontName, int fontStyle, Color color,
			int fontSize, int x, int y, float alpha) {
		try {
			File img = new File(srcImageFile);
			if (!img.exists())
				return;
			Image src = ImageIO.read(img);
			int width = src.getWidth(null);
			int height = src.getHeight(null);
			BufferedImage image = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics2D g = image.createGraphics();
			g.drawImage(src, 0, 0, width, height, null);
			g.setColor(color);
			g.setFont(new Font(fontName, fontStyle, fontSize));
			g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,
					alpha));
			// 在指定坐标绘制水印文字
			g.drawString(pressText, (width - (getLength(pressText) * fontSize))
					/ 2 + x, (height - fontSize) / 2 + y);
			g.dispose();
			// 输出图片--图片另存在到哪里去
			FileOutputStream out = new FileOutputStream(destImageFile);
			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
			encoder.encode(image);
			out.close();
		} catch (Exception e) {
			System.out.println("发生异常" + e.getMessage());
		}
	}

	/**
	 * 
	 * 图片添加文字水印</br> com.tz.util.image </br> 方法名：pressText </br> 创建人：maerhuan
	 * </br> 时间：2016年10月8日-上午12:40:04 </br>
	 * 
	 * @param pressText
	 * @param srcImageFile
	 * @param destImageFile
	 * @param fontName
	 * @param fontStyle
	 * @param color
	 * @param fontSize
	 * @param x
	 * @param y
	 *            void </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static void pressText(String pressText, String srcImageFile,
			String destImageFile, String fontName, int fontStyle, Color color,
			int fontSize, int x, int y) {
		try {
			File img = new File(srcImageFile);
			if (!img.exists())
				return;
			Image src = ImageIO.read(img);
			int width = src.getWidth(null);
			int height = src.getHeight(null);
			BufferedImage image = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics2D g = image.createGraphics();
			g.drawImage(src, 0, 0, width, height, null);
			g.setColor(color);
			g.setFont(new Font(fontName, fontStyle, fontSize));
			// 在指定坐标绘制水印文字
			g.drawString(pressText, (width - (getLength(pressText) * fontSize))
					/ 2 + x, (height - fontSize) / 2 + y);
			g.dispose();
			// 输出图片--图片另存在到哪里去
			FileOutputStream out = new FileOutputStream(destImageFile);
			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
			encoder.encode(image);
			out.close();
		} catch (Exception e) {
			System.out.println("发生异常" + e.getMessage());
		}
	}

	/**
	 * 
	 * 给图片添加文字水印</br> com.tz.util.image </br> 方法名：pressText </br> 创建人：maerhuan
	 * </br> 时间：2016年10月8日-上午12:46:43 </br>
	 * 
	 * @param pressText
	 * @param srcImageFile
	 * @param destImageFile
	 * @param fontName
	 * @param fontStyle
	 * @param color
	 * @param fontSize
	 * @param x
	 * @param y
	 * @param arrow
	 *            void </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static void pressText(String pressText, String srcImageFile,
			String destImageFile, String fontName, int fontStyle, Color color,
			int fontSize, int x, int y, Float alpha, int arrow) {
		try {
			File img = new File(srcImageFile);
			if (!img.exists())
				return;
			Image src = ImageIO.read(img);
			int width = src.getWidth(null);
			int height = src.getHeight(null);
			BufferedImage image = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics2D g = image.createGraphics();
			g.drawImage(src, 0, 0, width, height, null);
			g.setColor(color);
			g.setFont(new Font(fontName, fontStyle, fontSize));
			g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,
					alpha));
			// 在指定坐标绘制水印文字
			// 绘制文字
			if (arrow == 1)
				g.drawString(pressText, width - x - fontSize
						* getLength(pressText), height - fontSize - y);// 右下角
			if (arrow == 2)
				g.drawString(pressText, width - x - fontSize
						* getLength(pressText), fontSize + y);// 右上角
			if (arrow == 3)
				g.drawString(pressText, x, fontSize + y);// 左上角
			if (arrow == 4)
				g.drawString(pressText, x, height - fontSize - y);// 左下角
			if (arrow == 5)
				g.drawString(pressText, (width - fontSize
						* getLength(pressText)) / 2, height - fontSize - y);// 左下中心
			g.dispose();
			// 输出图片--图片另存在到哪里去
			FileOutputStream out = new FileOutputStream(destImageFile);
			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
			encoder.encode(image);
			out.close();
		} catch (Exception e) {
			System.out.println("发生异常" + e.getMessage());
		}
	}

	/**
	 * 添加文字水印
	 * 
	 * @param targetImg
	 *            目标图片路径，如：C:\\kutoku.jpg
	 * @param pressText
	 *            水印文字， 如：kutuku.com
	 * @param fontName
	 *            字体名称， 如：宋体
	 * @param fontStyle
	 *            字体样式，如：粗体和斜体(Font.BOLD|Font.ITALIC)
	 * @param fontSize
	 *            字体大小，单位为像素
	 * @param color
	 *            字体颜色
	 * @param x
	 *            水印文字距离目标图片左侧的偏移量，如果x<0, 则在正中间
	 * @param y
	 *            水印文字距离目标图片上侧的偏移量，如果y<0, 则在正中间
	 * @param alpha
	 *            透明度(0.0 -- 1.0, 0.0为完全透明，1.0为完全不透明)
	 */

	public static void pressText(String targetImg, String pressText,
			String destImageFile, String fontName, int fontStyle, int fontSize,
			Color color, int x, int y, float alpha) {
		try {
			// 加载目标图片
			File file = new File(targetImg);
			if (!file.exists())
				return;
			Image image = ImageIO.read(file);
			int width = image.getWidth(null);
			int height = image.getHeight(null);

			// 将目标图片加载到内存。
			BufferedImage bufferedImage = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics2D g = bufferedImage.createGraphics();
			g.drawImage(image, 0, 0, width, height, null);
			g.setFont(new Font(fontName, fontStyle, fontSize));
			g.setColor(color);
			// 设置水印图片的透明度。
			g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,
					alpha));

			// 设置水印图片的位置。
			int width_1 = fontSize * getLength(pressText);
			int height_1 = fontSize;
			int widthDiff = width - width_1;
			int heightDiff = height - height_1;
			if (x < 0) {
				x = widthDiff / 2;
			} else if (x > widthDiff) {
				x = widthDiff;
			}
			if (y < 0) {
				y = heightDiff / 2;
			} else if (y > heightDiff) {
				y = heightDiff;
			}

			// 将水印文字“写”在原有的图片的制定位置。
			g.drawString(pressText, x, y + height_1);
			// 关闭画笔。
			g.dispose();
			// 输出图片--图片另存在到哪里去
			FileOutputStream out = new FileOutputStream(destImageFile);
			// 生成图片
			ImageIO.write(bufferedImage, "JPG", out);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * 获取text的长度</br> com.tz.util.image </br> 方法名：getLength </br> 创建人：maerhuan
	 * </br> 时间：2016年10月8日-上午12:02:41 </br>
	 * 
	 * @param text
	 * @return int </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static int getLength(String text) {
		int length = 0;
		for (int i = 0; i < text.length(); i++) {
			if (new String(text.charAt(i) + "").getBytes().length > 1) {
				length += 2;
			} else {
				length += 1;
			}
		}
		return length / 2;
	}

	/**
	 * 
	 * 图片水印</br> com.tz.util.image </br> 方法名：pressImage </br> 创建人：maerhuan </br>
	 * 时间：2016年10月8日-下午6:50:39 </br>
	 * 
	 * @param pressImg
	 *            水印图片地址
	 * @param srcImageFile
	 *            目标图片地址
	 * @param destImageFile
	 *            另存图片地址
	 * @param x
	 * @param y
	 * @param alpha
	 *            void </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public static void pressImage(String pressImg, String srcImageFile,
			String destImageFile, int x, int y, float alpha) {
		try {
			// 加载目标图片
			File file = new File(srcImageFile);
			if (!file.exists())
				return;
			Image image = ImageIO.read(file);
			int width = image.getWidth(null);
			int height = image.getHeight(null);

			// 将目标图片加载到内存。
			BufferedImage bufferedImage = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics2D g = bufferedImage.createGraphics();
			g.drawImage(image, 0, 0, width, height, null);

			// if (null != degree) {
			// // 设置水印旋转
			// g.rotate(Math.toRadians(degree),
			// (double) buffImg.getWidth() / 2, (double) buffImg
			// .getHeight() / 2);
			// }
			// 加载水印图片。
			Image waterImage = ImageIO.read(new File(pressImg));
			int width_1 = waterImage.getWidth(null);
			int height_1 = waterImage.getHeight(null);
			// 设置水印图片的透明度。
			g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,
					alpha));

			// 设置水印图片的位置。
			int widthDiff = width - width_1;
			int heightDiff = height - height_1;
			if (x < 0) {
				x = widthDiff / 2;
			} else if (x > widthDiff) {
				x = widthDiff;
			}
			if (y < 0) {
				y = heightDiff / 2;
			} else if (y > heightDiff) {
				y = heightDiff;
			}

			// 将水印图片“画”在原有的图片的制定位置。
			g.drawImage(waterImage, x, y, width_1, height_1, null);
			// 关闭画笔。
			g.dispose();

			// 输出图片--图片另存在到哪里去
			FileOutputStream out = new FileOutputStream(destImageFile);
			// 生成图片
			ImageIO.write(bufferedImage, "JPG", out);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * 彩色转黑白</br> com.tz.util.image </br> 方法名：gray </br> 创建人：maerhuan </br>
	 * 时间：2016年10月8日-下午6:41:28 </br>
	 * 
	 * @param srcImageFile
	 *            图片源地址
	 * @param destImageFile
	 *            目标地址 void </br>
	 * @exception </br>
	 * @since 1.0.0
	 */
	public  static void gray(String srcImageFile, String destImageFile) {
		try {
			File file = new File(srcImageFile);
			if (!file.exists())
				return;
			BufferedImage src = ImageIO.read(file);
			ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
			ColorConvertOp op = new ColorConvertOp(cs, null);
			src = op.filter(src, null);
			ImageIO.write(src, "JPEG", new File(destImageFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 图像类型转换：GIF->JPG、GIF->PNG、PNG->JPG、PNG->GIF(X)、BMP->PNG
	 * 
	 * @param srcImageFile
	 *            源图像地址 (绝对路径)
	 * @param formatName
	 *            包含格式非正式名称的 String：如JPG、JPEG、GIF等
	 * @param destImageFile
	 *            目标图像地址 (绝对路径)
	 */
	public  static void convert(String srcImageFile, String formatName,
			String destImageFile) {
		try {
			File f = new File(srcImageFile);
			f.canRead();
			f.canWrite();
			BufferedImage src = ImageIO.read(f);
			ImageIO.write(src, formatName, new File(destImageFile));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 缩放图像（按比例缩放）
	 * 
	 * @param srcImageFile
	 *            源图像文件地址(绝对路径)
	 * @param result
	 *            缩放后的图像地址(绝对路径)
	 * @param scale
	 *            缩放比例
	 * @param flag
	 *            缩放选择:true 放大; false 缩小;
	 */
	public  static void scale(String srcImageFile, String result,
			int scale, boolean flag) {
		try {
			BufferedImage src = ImageIO.read(new File(srcImageFile)); // 读入文件
			int width = src.getWidth(); // 得到源图宽
			int height = src.getHeight(); // 得到源图长
			if (flag) {// 放大
				width = width * scale;
				height = height * scale;
			} else {// 缩小
				width = width / scale;
				height = height / scale;
			}
			Image image = src.getScaledInstance(width, height,
					Image.SCALE_DEFAULT);
			BufferedImage tag = new BufferedImage(width, height,
					BufferedImage.TYPE_INT_RGB);
			Graphics g = tag.getGraphics();
			g.drawImage(image, 0, 0, null); // 绘制缩小后的图
			g.dispose();
			ImageIO.write(tag, "JPEG", new File(result));// 输出到文件流
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 缩放图像（按高度和宽度缩放）
	 * 
	 * @param srcImageFile
	 *            源图像文件地址(绝对路径)
	 * @param result
	 *            缩放后的图像地址(绝对路径)
	 * @param height
	 *            缩放后的高度
	 * @param width
	 *            缩放后的宽度
	 * @param bb
	 *            比例不对时是否需要补白：true为补白; false为不补白;
	 */
	public  static void scale2(String srcImageFile, String result,
			int height, int width, boolean bb) {
		try {
			double ratio = 0.0; // 缩放比例
			File f = new File(srcImageFile);
			BufferedImage bi = ImageIO.read(f);
			Image itemp = bi.getScaledInstance(width, height, bi.SCALE_SMOOTH);
			// 计算比例
			if ((bi.getHeight() > height) || (bi.getWidth() > width)) {
				if (bi.getHeight() > bi.getWidth()) {
					ratio = (new Integer(height)).doubleValue()
							/ bi.getHeight();
				} else {
					ratio = (new Integer(width)).doubleValue() / bi.getWidth();
				}
				AffineTransformOp op = new AffineTransformOp(
						AffineTransform.getScaleInstance(ratio, ratio), null);
				itemp = op.filter(bi, null);
			}
			if (bb) {// 补白
				BufferedImage image = new BufferedImage(width, height,
						BufferedImage.TYPE_INT_RGB);
				Graphics2D g = image.createGraphics();
				g.setColor(Color.white);
				g.fillRect(0, 0, width, height);
				if (width == itemp.getWidth(null)) {
					g.drawImage(itemp, 0, (height - itemp.getHeight(null)) / 2,
							itemp.getWidth(null), itemp.getHeight(null),
							Color.white, null);
				} else {
					g.drawImage(itemp, (width - itemp.getWidth(null)) / 2, 0,
							itemp.getWidth(null), itemp.getHeight(null),
							Color.white, null);
				}
				g.dispose();
				itemp = image;
			}
			ImageIO.write((BufferedImage) itemp, "JPEG", new File(result));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
     * 图像切割(按指定起点坐标和宽高切割)
     *
     * @param srcImageFile 源图像地址 (绝对路径)
     * @param result       切片后的图像地址 (绝对路径)
     * @param x            目标切片起点坐标X
     * @param y            目标切片起点坐标Y
     * @param width        目标切片宽度
     * @param height       目标切片高度
     */
    public  static void cut(String srcImageFile, String result,
                                 int x, int y, int width, int height) {
        try {
            // 读取源图像
            BufferedImage bi = ImageIO.read(new File(srcImageFile));
            int srcWidth = bi.getWidth(); // 源图宽度
            int srcHeight = bi.getHeight(); // 源图高度
            if (srcWidth > 0 && srcHeight > 0) {
                Image image = bi.getScaledInstance(srcWidth, srcHeight,
                        Image.SCALE_DEFAULT);
                // 四个参数分别为图像起点坐标和宽高
                // 即: CropImageFilter(int x,int y,int width,int height)
                ImageFilter cropFilter = new CropImageFilter(x, y, width, height);
                Image img = Toolkit.getDefaultToolkit().createImage(
                        new FilteredImageSource(image.getSource(),
                                cropFilter));
                BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                Graphics g = tag.getGraphics();
                g.drawImage(img, 0, 0, width, height, null); // 绘制切割后的图
                g.dispose();
                // 输出为文件
                ImageIO.write(tag, "JPEG", new File(result));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 图像切割（指定切片的行数和列数）
     *
     * @param srcImageFile 源图像地址 (绝对路径)
     * @param descDir      切片目标文件夹
     * @param rows         目标切片行数。默认2，必须是范围 [1, 20] 之内
     * @param cols         目标切片列数。默认2，必须是范围 [1, 20] 之内
     */
    public final static void cut2(String srcImageFile, String descDir,
                                  int rows, int cols) {
        try {
            if (rows <= 0 || rows > 20) rows = 2; // 切片行数
            if (cols <= 0 || cols > 20) cols = 2; // 切片列数
            // 读取源图像
            BufferedImage bi = ImageIO.read(new File(srcImageFile));
            int srcWidth = bi.getWidth(); // 源图宽度
            int srcHeight = bi.getHeight(); // 源图高度
            if (srcWidth > 0 && srcHeight > 0) {
                Image img;
                ImageFilter cropFilter;
                Image image = bi.getScaledInstance(srcWidth, srcHeight, Image.SCALE_DEFAULT);
                int destWidth = srcWidth; // 每张切片的宽度
                int destHeight = srcHeight; // 每张切片的高度
                // 计算切片的宽度和高度
                if (srcWidth % cols == 0) {
                    destWidth = srcWidth / cols;
                } else {
                    destWidth = (int) Math.floor(srcWidth / cols) + 1;
                }
                if (srcHeight % rows == 0) {
                    destHeight = srcHeight / rows;
                } else {
                    destHeight = (int) Math.floor(srcWidth / rows) + 1;
                }
                // 循环建立切片
                // 改进的想法:是否可用多线程加快切割速度
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        // 四个参数分别为图像起点坐标和宽高
                        // 即: CropImageFilter(int x,int y,int width,int height)
                        cropFilter = new CropImageFilter(j * destWidth, i * destHeight,
                                destWidth, destHeight);
                        img = Toolkit.getDefaultToolkit().createImage(
                                new FilteredImageSource(image.getSource(),
                                        cropFilter));
                        BufferedImage tag = new BufferedImage(destWidth,
                                destHeight, BufferedImage.TYPE_INT_RGB);
                        Graphics g = tag.getGraphics();
                        g.drawImage(img, 0, 0, null); // 绘制缩小后的图
                        g.dispose();
                        // 输出为文件
                        ImageIO.write(tag, "JPEG", new File(descDir
                                + "_r" + i + "_c" + j + ".jpg"));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 图像切割（指定切片的宽度和高度）
     *
     * @param srcImageFile 源图像地址 (绝对路径)
     * @param descDir      切片目标文件夹
     * @param destWidth    目标切片宽度。默认200
     * @param destHeight   目标切片高度。默认150
     */
    public final static void cut3(String srcImageFile, String descDir,
                                  int destWidth, int destHeight) {
        try {
            if (destWidth <= 0) destWidth = 200; // 切片宽度
            if (destHeight <= 0) destHeight = 150; // 切片高度
            // 读取源图像
            BufferedImage bi = ImageIO.read(new File(srcImageFile));
            int srcWidth = bi.getWidth(); // 源图宽度
            int srcHeight = bi.getHeight(); // 源图高度
            if (srcWidth > destWidth && srcHeight > destHeight) {
                Image img;
                ImageFilter cropFilter;
                Image image = bi.getScaledInstance(srcWidth, srcHeight, Image.SCALE_DEFAULT);
                int cols = 0; // 切片横向数量
                int rows = 0; // 切片纵向数量
                // 计算切片的横向和纵向数量
                if (srcWidth % destWidth == 0) {
                    cols = srcWidth / destWidth;
                } else {
                    cols = (int) Math.floor(srcWidth / destWidth) + 1;
                }
                if (srcHeight % destHeight == 0) {
                    rows = srcHeight / destHeight;
                } else {
                    rows = (int) Math.floor(srcHeight / destHeight) + 1;
                }
                // 循环建立切片
                // 改进的想法:是否可用多线程加快切割速度
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        // 四个参数分别为图像起点坐标和宽高
                        // 即: CropImageFilter(int x,int y,int width,int height)
                        cropFilter = new CropImageFilter(j * destWidth, i * destHeight,
                                destWidth, destHeight);
                        img = Toolkit.getDefaultToolkit().createImage(
                                new FilteredImageSource(image.getSource(),
                                        cropFilter));
                        BufferedImage tag = new BufferedImage(destWidth,
                                destHeight, BufferedImage.TYPE_INT_RGB);
                        Graphics g = tag.getGraphics();
                        g.drawImage(img, 0, 0, null); // 绘制缩小后的图
                        g.dispose();
                        // 输出为文件
                        ImageIO.write(tag, "JPEG", new File(descDir
                                + "_r" + i + "_c" + j + ".jpg"));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 创建图片缩略图(等比缩放)
     * @param src源图片文件完整路径
     * @param dist 目标图片文件完整路径
     * @param width 缩放的宽度
     * @param height 缩放的高度
     */
    public static void createThumbnail(String src, String dist, float width, float height) {
        try {
            File srcfile = new File(src);
            if (!srcfile.exists()) return;
            BufferedImage image = ImageIO.read(srcfile);
            // 获得缩放的比例
            double ratio = 1.0;
            // 判断如果高、宽都不大于设定值，则不处理
            if (image.getHeight() > height || image.getWidth() > width) {
                if (image.getHeight() > image.getWidth()) {
                    ratio = height / image.getHeight();
                } else {
                    ratio = width / image.getWidth();
                }
            }
            
            // 计算新的图面宽度和高度
            int newWidth = (int) (image.getWidth() * ratio);
            int newHeight = (int) (image.getHeight() * ratio);

            BufferedImage bfImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
            bfImage.getGraphics().drawImage(image.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH), 0, 0,
                    null);

            FileOutputStream os = new FileOutputStream(dist);
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(os);
            encoder.encode(bfImage);
            os.close();
        } catch (Exception e) {
            System.out.println("创建缩略图发生异常" + e.getMessage());
        }
    }
    
    /**
     * 创建图片缩略图(等比缩放)
     * @param src源图片文件完整路径
     * @param dist 目标图片文件完整路径
     * @param width 缩放的宽度
     * @param height 缩放的高度
     */
    public static void createThumbnailNo(String src, String dist, int width, int height) {
        try {
            File srcfile = new File(src);
            if (!srcfile.exists()) return;
            BufferedImage image = ImageIO.read(srcfile);
            BufferedImage bfImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            bfImage.getGraphics().drawImage(image.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0,null);

            FileOutputStream os = new FileOutputStream(dist);
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(os);
            encoder.encode(bfImage);
            os.close();
        } catch (Exception e) {
            System.out.println("创建缩略图发生异常" + e.getMessage());
        }
    }
    /**
     * 
     * com.tz.util.image 
     * 方法名：getNewName
     * 创建人：xuchengfei 
     * 手机号码:15074816437
     * 时间：2015年9月26日-下午9:57:10 
     * @param filePath
     * @param suffix
     * @return 
     * 返回类型：String
     * @exception 
     * @since  1.0.0
     */
    public static String getNewName(String filePath,String suffix){
    	if(MehStringUtil.isNotEmpty(filePath)){
    		filePath= filePath.replace(".", suffix+".");
    		return filePath;
    	}else{
    		return "";
    	}
    }


	public static void main(String[] args) throws IOException {
		/*
		 * pressText("我是坦洲学院。。。。。。", "F:/BaiduYunDownload/404.jpg",
		 * "F:/BaiduYunDownload/array2.jpg", "微软雅黑", 600, Color.RED, 28, 100,
		 * 100, 0.1f); System.out.println(111);
		 */

		// pressImage("F:/BaiduYunDownload/shous.png",
		// "F:/BaiduYunDownload/404.jpg", "F:/BaiduYunDownload/array5.jpg", 500,
		// 500, 0.5f);
		// gray("F:/BaiduYunDownload/404.jpg",
		// "F:/BaiduYunDownload/array6.jpg");
		scale("F:/BaiduYunDownload/404.jpg", "F:/BaiduYunDownload/array7.jpg", 1, true);
		scale2("F:/BaiduYunDownload/404.jpg", "F:/BaiduYunDownload/array8.jpg", 100, 100, false);
	}
}
