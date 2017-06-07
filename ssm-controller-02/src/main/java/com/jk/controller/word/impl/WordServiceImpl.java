package com.jk.controller.word.impl;

import com.jk.entity.word.WordRequest;
import com.jk.entity.word.WordResponse;
import com.jk.mapper.word.WordMapper;
import com.jk.service.word.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lx on 2017/5/27.
 */
@Service
public class WordServiceImpl implements WordService{

    @Autowired
    private WordMapper wordMapper;

    @Override
    public List<WordResponse> selectWordListByKeyWord(WordRequest wordRequest) {
        return wordMapper.selectWordListByKeyWord(wordRequest);
    }
}
