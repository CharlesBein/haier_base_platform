package cn.gooday.logistics.web.util.dozer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.dozer.Mapper;

import com.google.common.base.Function;
import com.google.common.collect.Lists;

/**
*
* @Title: DozerUtil.java
* @Package
* @Description: (dozer转化工具类)
* @author zhangsg
* @date 2015-1-22 上午9:45:32
* @version V1.0
*/
public class DozerUtil {


	/**
	 *
	 * @Title: fill
	 * @Description: (beanA to beanB 对考)
	 * @author:Gavin
	 * @param source 源
	 * @param destination 目标
	 * @return
	 * @throws
	 */
	public static  <F, T> T fill(F source, T destination,Mapper mapper) {
        if (source == null || destination == null) return null;
        mapper.map(source, destination);
        return destination;
    }

	/**
	 *
	 * @Title: convert
	 * @Description: (listA to　listB 对考)
	 * @author:Gavin
	 * @param fromList 源list
	 * @param toClass 目标list 内的泛型
	 * @return
	 * @throws
	 */
    public static  <F, T> List<T> convert(List<F> fromList, final Class<T> toClass,Mapper mapper) {
    	final Mapper finalMapper = mapper;
        return Lists.transform(fromList, new Function<F, T>() {
            @Override
            public T apply(F from) {
                return convert(from, toClass,finalMapper);
            }
        });
    }

    /**
     *
     * @Title: convertMap
     * @Description: (listMap 转 listBean)
     * @author:Gavin
     * @param source
     * @param toClass
     * @return
     * @throws
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> List<T> convertMap(List<Map> source,final Class<T> toClass){
    	List<T> arrayList = new ArrayList<T>();
    	for(Map map : source){
    		try {
    			T newInstance = toClass.newInstance();
				BeanUtils.populate(newInstance, map);
				arrayList.add(newInstance);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	return arrayList;

    }

    /**
     *
     * @Title: convert
     * @Description: (beanA to beanB)
     * @author:Gavin
     * @param from 源
     * @param toClass 目标类泛型
     * @return
     * @throws
     */
    public static <F, T> T convert(F from, final Class<T> toClass,Mapper mapper) {
        if (from == null) return null;
        return mapper.map(from, toClass);
    }
}
