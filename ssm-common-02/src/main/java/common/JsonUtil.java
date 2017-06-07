/** 
 * <pre>项目名称:ssh-hero 
 * 文件名称:JsonUtil.java 
 * 包名:com.jk.util 
 * 创建日期:2017年3月15日下午2:34:36 
 * Copyright (c) 2017, zhouyanchen 1186012559@qq.com  All Rights Reserved.</pre> 
 */  
package common;

import com.google.gson.Gson;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/** 
 * <p>项目名称：ssh-hero    
 * 类名称：JsonUtil    
 * 类描述：    
 * 创建人：zhouyanchen 1186012559@qq.com    
 * 创建时间：2017年3月15日 下午2:34:36    
 * 修改人：zhouyanchen 1186012559@qq.com 
 * 修改时间：2017年3月15日 下午2:34:36    
 * 修改备注：       
 * @version </p>    
 */
public class JsonUtil {

	public static void jsonOut(Object obj ,HttpServletResponse response){
		response.setCharacterEncoding("utf-8");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			String json = new Gson().toJson(obj);
			writer.write(json);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if (null != writer) {
				writer.close();
			}
		}
	}
	
	
	public static void jsonOutByJson(String json, HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			writer.write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != writer) {
				writer.close();
			}
		}
	}
	
}
