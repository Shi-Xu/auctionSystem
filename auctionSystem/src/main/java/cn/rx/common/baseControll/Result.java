package cn.rx.common.baseControll;

import cn.rx.common.base.BaseResult;

/**
 * cms系统常量枚举类
 *
 */
public class Result extends BaseResult {

    public Result(ResultConstant fbResultConstant, Object data) {
        super(fbResultConstant.getCode(), fbResultConstant.getMessage(), data);
    }
    
    public Result(ResultConstant fbResultConstant, Object data, String message) {
    	super(fbResultConstant.getCode(), message, data);
    }

}
