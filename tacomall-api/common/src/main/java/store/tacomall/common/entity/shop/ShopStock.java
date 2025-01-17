/***
 * @Author: 码上talk|RC/3189482282@qq.com
 * @Date: 2021-11-04 13:50:39
 * @LastEditTime: 2021-11-04 13:51:04
 * @LastEditors: 码上talk|RC
 * @Description: 
 * @FilePath: /tacomall-api/common/src/main/java/store/tacomall/common/entity/shop/ShopStock.java
 */
package store.tacomall.common.entity.shop;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author 码上talk
 * @since 2021-11-04
 */
@Data
public class ShopStock implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer shopId;

    private Integer goodsItemsId;

    private Integer stock;

    private Integer stockFreeze;

    @TableLogic
    private Integer isDelete;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private LocalDateTime deleteTime;

}
