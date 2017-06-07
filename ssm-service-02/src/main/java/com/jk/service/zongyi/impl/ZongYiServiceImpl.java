package com.jk.service.zongyi.impl;

import com.jk.entity.banner.BannerResponse;
import com.jk.mapper.zongyi.ZongYiMapper;
import com.jk.service.zongyi.ZongYiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lx on 2017/5/27.
 */
@Service
public class ZongYiServiceImpl implements ZongYiService {

    @Autowired
    private ZongYiMapper zongYiMapper;
    @Override
    public List<BannerResponse> selectBannerList() {
        return zongYiMapper.selectBannerList();
    }
}
