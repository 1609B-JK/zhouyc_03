package com.jk.controller.movie;

import com.jk.entity.ResultData;
import com.jk.entity.movie.MovieResponse;
import com.jk.service.movie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by lx on 2017/5/27.
 */
@Controller
@RequestMapping("/zongyi/")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping("select_movie_list")
    @ResponseBody
    public ResultData seletMovieList(){
        String msg = "成功";
        int code = 200;
        ResultData rd = new ResultData();
        //查询类型列表
        List<MovieResponse> movieList = movieService.selectBannerList();
        rd.setCode(code);
        rd.setMsg(msg);
        rd.setData(movieList);
        return rd;
    }
}
