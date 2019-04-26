package com.weilai.o2o.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * 接收验证码并验证
 * @author ASUS
 *
 */
public class CodeUtil {
	public static boolean checkVerifyCode(HttpServletRequest request) {
		//理想验证码
		String verifyCodeExpected = (String)request.getSession().getAttribute(
				com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		//输入的验证码
		String verifyCodeActual = HttpServletRequestUtil.getString(request, "verifyCodeActual");
		if (verifyCodeActual == null||!verifyCodeActual.equals(verifyCodeExpected)) {
			return false;
		}
		return true;
	}
}
