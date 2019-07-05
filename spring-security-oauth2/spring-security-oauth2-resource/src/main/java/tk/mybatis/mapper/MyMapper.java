package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用Mapper
 * @author penghe.yu
 * @param <T>
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper {

}
