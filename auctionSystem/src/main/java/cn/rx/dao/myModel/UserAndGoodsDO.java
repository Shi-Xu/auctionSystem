package cn.rx.dao.myModel;

import cn.rx.dao.model.AsGoodsDO;
import cn.rx.dao.model.AsUserDO;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserAndGoodsDO implements Serializable {

    private AsUserDO asUserDO;

    private AsGoodsDO asGoodsDO;


}
