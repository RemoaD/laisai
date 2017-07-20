package com.tata.code.service;

import java.awt.image.BufferedImage;

public interface CodeService { 
	public BufferedImage changeYanzhengma()throws Throwable;//改变验证码
	public String gainYanzhengma()throws Throwable;//获得验证码
}
