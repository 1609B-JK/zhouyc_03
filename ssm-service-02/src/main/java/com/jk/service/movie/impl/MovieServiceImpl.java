package com.jk.service.movie.impl;

import com.jk.entity.movie.MovieResponse;
import com.jk.mapper.movie.MovieMapper;
import com.jk.service.movie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lx on 2017/5/27.
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieMapper movieMapper;

    @Override
    public List<MovieResponse> selectBannerList() {
        return movieMapper.selectBannerList();
    }
}
