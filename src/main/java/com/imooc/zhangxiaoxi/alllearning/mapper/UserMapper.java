package com.imooc.zhangxiaoxi.alllearning.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.imooc.zhangxiaoxi.alllearning.domain.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 类名称：UserMapper
 * ********************************
 * <p>
 * 类描述：UserMapper
 *
 * @author
 * @date 下午1:40
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

    // 如果需要自定义一些方法

}
