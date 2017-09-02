package cn.relaxtech.doomsday.bi.boot.entity.bi;

import lombok.Data;

import javax.persistence.Id;

/**
 * Created by zhoulinghong on 2017/9/2.
 */
@Data
public class BiLibaoData {
    @Id
    private Integer id;
    private String libaoName;
    private String libaoId;
    private Integer humanCount;
    private Integer libaoCount;
    private Double moneyNum;
    private Double totalNum;
    private Double percent;

}
