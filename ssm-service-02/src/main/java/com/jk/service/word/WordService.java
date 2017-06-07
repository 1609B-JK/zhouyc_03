package com.jk.service.word;

import com.jk.entity.word.WordRequest;
import com.jk.entity.word.WordResponse;

import java.util.List;

/**
 * Created by lx on 2017/5/27.
 */
public interface WordService {
    List<WordResponse> selectWordListByKeyWord(WordRequest wordRequest);
}
