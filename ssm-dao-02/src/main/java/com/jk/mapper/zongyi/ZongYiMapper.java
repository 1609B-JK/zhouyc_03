package com.jk.mapper.zongyi;

import com.jk.entity.banner.BannerResponse;

import java.util.List;

/**
 * Created by lx on 2017/5/27.
 */
public interface ZongYiMapper {
    List<BannerResponse> selectBannerList();
}
