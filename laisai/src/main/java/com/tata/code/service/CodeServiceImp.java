package com.tata.code.service;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Service;
@Service
public class CodeServiceImp implements CodeService{
	private String yanzhengma;
	
	public String getYanzhengma() {
		return yanzhengma;
	}

	public void setYanzhengma(String yanzhengma) {
		this.yanzhengma = yanzhengma;
	}

	@Override
	public BufferedImage changeYanzhengma() throws Throwable {
		int width = 80;//宽
		int height = 40;//高
		int linesNumber = 8;//干扰线数量
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = image.getGraphics();
		//设置背景色为白色
		graphics.setColor(Color.WHITE);
		//设置一个宽为80px，高为40px的矩形框
		graphics.fillRect(0, 0, width, height);
		//设置字体为Arial，加粗，20px的大小
		graphics.setFont(new Font("Arial", Font.BOLD, 20));
		Date d = new Date();
		System.out.println("时间为： " + d.getTime());
		Random r = new Random(d.getTime());
		//设置验证码内容
		String base = "QWERTYUIOPLKJHGFDSAZXCVBNM1234567890";
		System.out.print("验证码为：");
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 4; i++){
			int number = r.nextInt(base.length());
			int y = 15 + r.nextInt(20);
			Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
			graphics.setColor(c);
			String s = String.valueOf(base.charAt(number));
			graphics.drawString(s, 5 + i * width / 4, y);
			sb.append(s);
		}
		this.setYanzhengma(sb.toString());
		System.out.println(this.getYanzhengma());
		System.out.println("颜色：" + graphics.getColor() + ", \n字体：" + graphics.getFont());
		//设置干扰线
		for(int i = 0; i < linesNumber; i++){
			Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
			graphics.setColor(c);
			graphics.drawLine(r.nextInt(width), r.nextInt(height), r.nextInt(width), r.nextInt(height));
		}
		graphics.dispose();
		return image;
	}

	@Override
	public String gainYanzhengma() throws Throwable {
		return this.getYanzhengma();
	}
}
