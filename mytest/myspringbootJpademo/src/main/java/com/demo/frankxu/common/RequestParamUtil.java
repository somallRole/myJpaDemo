package com.demo.frankxu.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * 请求参数工具类
 * @author:frankXu
 */
public class RequestParamUtil {

    /**
     * content_Type:application/x-www-form-urlencoded 请求参数转换为JavaBean
     * @param request
     * @param t
     * @param <T>
     * @return List<T>
     */
    public <T>List<T> x_www_formRequestParamConvertBeans(HttpServletRequest request,T t){
            Map<String,String[]> resource = new HashMap<>(request.getParameterMap()) ;
            // 初始化索引
            int index = 0;
            // 数据体接收容器
            StringBuffer bodys = new StringBuffer("[");
            while (resource.size() > 1) {
                // 对象数据存储容器
                StringBuffer buffer = new StringBuffer("{");
                // 删除数据接受容器
                List removeKey = new ArrayList();
                // 有数据则开始进行遍历
                int finalIndex = index;
                for (Map.Entry<String, String[]> x : resource.entrySet()){
                    String key = x.getKey();
                    String[] split = key.split("\\.");
                    String keyNum = Pattern.compile("[^0-9]").matcher(split[0]).replaceAll("").trim();
                    if(StringUtils.isEmpty(keyNum)){
                        continue;
                    }
                    int idx = Integer.valueOf(keyNum).intValue();
                    String valueName = split[1];
                    if (idx == finalIndex) {
                        buffer.append("\"" + valueName + "\":\"" + x.getValue()[0] + "\",");
                        removeKey.add(key);
                    }
                }
                buffer.deleteCharAt(buffer.length() - 1);
                buffer.append("}");
                bodys.append(buffer);
                // 清空StringBuffer
                buffer.delete(1, buffer.length() - 1);
                // 删除map已经遍历的资源
                for (Object o : removeKey){
                    resource.remove(o);
                }
                // 清除完成removeKey清空
                removeKey.clear();
                // 继续取值
                index++;
            }
            bodys.append("]");
            List<T> ts = JSON.parseObject(bodys.toString(), new TypeReference<List<T>>() {});
            return ts;
        
    }
    
}
