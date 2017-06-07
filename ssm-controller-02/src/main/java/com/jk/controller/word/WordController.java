package com.jk.controller.word;

import com.jk.entity.ResultData;
import com.jk.entity.type.MovieTypeResponse;
import com.jk.entity.word.WordRequest;
import com.jk.entity.word.WordResponse;
import com.jk.service.word.WordService;
import common.PinYinUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lx on 2017/5/27.
 */
@Controller
@RequestMapping("/word/")
public class WordController {

    @Autowired
    private WordService wordService;

    @RequestMapping("spell_check")
    @ResponseBody
    public ResultData selectWordListByKeyWord(@RequestBody WordRequest wordRequest){
        String msg = "对不起没有你查询的信息";
        int code = 201;
        ResultData rd = new ResultData();
        String pinYinHeadChar = PinYinUtil.getPinYinHeadChar(wordRequest.getKeyWord());
        wordRequest.setPinYin(pinYinHeadChar);
        //查询类型列表
        List<WordResponse> wordList = wordService.selectWordListByKeyWord(wordRequest);
        if(0 < wordList.size()){
           msg = "成功";
           code = 200;
           rd.setData(wordList);
        }
        rd.setCode(code);
        rd.setMsg(msg);
        return rd;
    }


}
