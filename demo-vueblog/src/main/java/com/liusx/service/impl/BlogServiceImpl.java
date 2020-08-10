package com.liusx.service.impl;

import com.liusx.entity.Blog;
import com.liusx.mapper.BlogMapper;
import com.liusx.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liusx
 * @since 2020-08-10
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
