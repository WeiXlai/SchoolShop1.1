package com.weilai.o2o.utils;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * 封装Util
 * @author ASUS
 *
 */
public class PathUtil {
	//获取系统文件的执行属性，分隔符
	private static String seperator = System.getProperty("file.separator");
	/**
	 * 返回项目图片的根路径
	 * @return
	 */
	public static String getImgBasePath() {
		
		
		//获取操作系统的名字
		String os = System.getProperty("os.name");
		String basePath = "";
		if (os.toLowerCase().startsWith("win")) {
			basePath = "D:/projectdev/image/";
		}else {
			basePath = "/home/xiangze/image";
		}
		basePath = basePath.replace("/", seperator);
		return basePath;
	}
	/**
	 * 根据不同的业务需求，返回不同的子路经
	 * @param shopId
	 * @return
	 */
	public static String getShopImagePath(long shopId) {
		String imagePath = "/upload/item/shop/"+shopId+"/";
		return imagePath.replace("/", seperator);
	}

}
