package com.glaway.excel.util.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExcelListener<T> extends AnalysisEventListener<T> {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelListener.class);

    //可以通过实例获取该值
     @Getter @Setter
     List<T> dataList = new ArrayList<>();

    // 存储解析excel条数
    private int count = 0;

    @Override
    public void invoke(T t, AnalysisContext context) {
        //数据存储到list，供批量处理，或后续自己业务逻辑处理。

        count += 1;
        dataList.add(t);

          /*
            如数据过大，可以进行定量分批处理
            if(dataList.size()>=200){
                handleBusinessLogic();
                dataList.clear();
            }
         */
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        LOGGER.info("all excel data parsed, count:{}", count);
    }



}
