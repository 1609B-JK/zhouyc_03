package com.jk.mapper.movie;

import com.jk.entity.movie.MovieResponse;

import java.util.List;

/**
 * Created by lx on 2017/5/27.
 */
public interface MovieMapper {
    List<MovieResponse> selectBannerList();
}
