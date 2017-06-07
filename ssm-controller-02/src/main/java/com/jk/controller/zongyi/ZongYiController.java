package com.jk.controller.zongyi;

import com.jk.entity.ResultData;
import com.jk.entity.banner.BannerResponse;
import com.jk.service.zongyi.ZongYiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lx on 2017/5/25.
 */
@Controller
@RequestMapping("/zongyi/")
public class ZongYiController {

    @Autowired
    private ZongYiService zongYiService;

    @RequestMapping("select_banner_list")
    @ResponseBody
    public ResultData selectBannerList(){
        String msg = "成功";
        int code = 200;
        Object data = null;
        ResultData rd = new ResultData();
        //查询类型列表
        List<BannerResponse> bannerList = zongYiService.selectBannerList();
        rd.setCode(code);
        rd.setMsg(msg);
        rd.setData(bannerList);
        return rd;
    }
}
