package com.jk.mapper.banner;

import com.jk.entity.banner.BannerResponse;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lx on 2017/5/25.
 */
public interface BannerMapper {

    List<BannerResponse> selectBannerList();
}
