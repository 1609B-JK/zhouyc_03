package common;

import freemarker.template.Configuration;
import freemarker.template.Template;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by lx on 2017/6/6.
 */
public class FreemarkerUtil {

    public static void getConfigurationAndTemplate(Object obj,String templateUrl,String templateName,HttpServletRequest request,HttpServletResponse response){
        //实例化Configuration
        Configuration cfg = new Configuration();
        //设置编码格式
        cfg.setDefaultEncoding("utf-8");
        cfg.setOutputEncoding("utf-8");

        //设置模板所在路径
        cfg.setServletContextForTemplateLoading(request.getSession().getServletContext(), templateUrl);

        try {
            //获取模板
            Template template =template = cfg.getTemplate(templateName);
            template.setEncoding("utf-8");
            template.setOutputEncoding("utf-8");
            PrintWriter writer = response.getWriter();
            template.process(obj, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
