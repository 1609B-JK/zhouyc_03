package com.jk.service.movie;

import com.jk.entity.movie.MovieResponse;

import java.util.List;

/**
 * Created by lx on 2017/5/27.
 */
public interface MovieService {
    List<MovieResponse> selectBannerList();
}
