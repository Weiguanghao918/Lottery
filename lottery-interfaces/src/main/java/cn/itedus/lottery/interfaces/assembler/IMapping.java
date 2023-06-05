package cn.itedus.lottery.interfaces.assembler;

import org.mapstruct.*;

import java.util.List;
import java.util.stream.Stream;


/**
 * @author: Guanghao Wei
 * @date: 2023-05-29 11:08
 * @description: MapStruct 对象映射接口
 */
@MapperConfig
public interface IMapping<SOURCE, TARGET> {

    /**
     * 映射同名属性
     * @param var1 源
     * @return     结果
     */
//    @Mapping(target = "createTime", dateFormat = "yyyy-MM-dd HH:mm:ss")
//    @InheritInverseConfiguration(name = "sourceToTarget")
    TARGET sourceToTarget(SOURCE var1);

    /**
     * 映射同名属性，反向
     * @param var1 源
     * @return     结果
     */
    @InheritInverseConfiguration(name = "sourceToTarget")
    SOURCE targetToSource(TARGET var1);

    /**
     * 映射同名属性，集合形式
     * @param var1 源
     * @return     结果
     */
    @InheritConfiguration(name = "sourceToTarget")
    List<TARGET> sourceToTarget(List<SOURCE> var1);

    /**
     * 反向，映射同名属性，集合形式
     * @param var1 源
     * @return     结果
     */
    @InheritConfiguration(name = "targetToSource")
    List<SOURCE> targetToSource(List<TARGET> var1);

    /**
     * 映射同名属性，集合流形式
     * @param stream 源
     * @return       结果
     */
    List<TARGET> sourceToTarget(Stream<SOURCE> stream);

    /**
     * 反向，映射同名属性，集合流形式
     * @param stream 源
     * @return       结果
     */
    List<SOURCE> targetToSource(Stream<TARGET> stream);

}