package cn.rx.dao.model;

import java.io.Serializable;
import java.util.Date;

public class AsGoodsDO implements Serializable {
    /**
     * 字段：goods_id
     * 
     *
     * @mbg.generated
     */
    private Integer goodsId;

    /**
     * 字段：goods_name
     * 商品名称
     *
     * @mbg.generated
     */
    private String goodsName;

    /**
     * 字段：goods_type
     * 商品类别
     *
     * @mbg.generated
     */
    private Integer goodsType;

    /**
     * 字段：goods_pic
     * 商品图片
     *
     * @mbg.generated
     */
    private String goodsPic;

    /**
     * 字段：goods_detail_pic
     * 商品详情展示图片
     *
     * @mbg.generated
     */
    private String goodsDetailPic;

    /**
     * 字段：goods_start_time
     * 竞拍开始时间
     *
     * @mbg.generated
     */
    private String goodsStartTime;

    /**
     * 字段：goods_end_time
     * 竞拍结束时间
     *
     * @mbg.generated
     */
    private String goodsEndTime;

    /**
     * 字段：goods_auction_times
     * 被竞拍次数
     *
     * @mbg.generated
     */
    private Integer goodsAuctionTimes;

    /**
     * 字段：goods_start_price
     * 初始价格
     *
     * @mbg.generated
     */
    private Double goodsStartPrice;

    /**
     * 字段：goods_current_price
     * 当前价格
     *
     * @mbg.generated
     */
    private Double goodsCurrentPrice;

    /**
     * 字段：goods_state
     * 商品当前状态，0未出售，1，已出售
     *
     * @mbg.generated
     */
    private Integer goodsState;

    /**
     * 字段：goods_description
     * 商品描述
     *
     * @mbg.generated
     */
    private String goodsDescription;

    /**
     * 字段：goods_release_time
     * 商品发布时间
     *
     * @mbg.generated
     */
    private Date goodsReleaseTime;

    /**
     * 字段：goods_audit
     * 是否审核 0未审核 1已审核
     *
     * @mbg.generated
     */
    private Integer goodsAudit;

    /**
     * 字段：user_id
     * 用户id
     *
     * @mbg.generated
     */
    private Integer userId;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public AsGoodsDO withGoodsId(Integer goodsId) {
        this.setGoodsId(goodsId);
        return this;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public AsGoodsDO withGoodsName(String goodsName) {
        this.setGoodsName(goodsName);
        return this;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public AsGoodsDO withGoodsType(Integer goodsType) {
        this.setGoodsType(goodsType);
        return this;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public AsGoodsDO withGoodsPic(String goodsPic) {
        this.setGoodsPic(goodsPic);
        return this;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic;
    }

    public String getGoodsDetailPic() {
        return goodsDetailPic;
    }

    public AsGoodsDO withGoodsDetailPic(String goodsDetailPic) {
        this.setGoodsDetailPic(goodsDetailPic);
        return this;
    }

    public void setGoodsDetailPic(String goodsDetailPic) {
        this.goodsDetailPic = goodsDetailPic;
    }

    public String getGoodsStartTime() {
        return goodsStartTime;
    }

    public AsGoodsDO withGoodsStartTime(String goodsStartTime) {
        this.setGoodsStartTime(goodsStartTime);
        return this;
    }

    public void setGoodsStartTime(String goodsStartTime) {
        this.goodsStartTime = goodsStartTime;
    }

    public String getGoodsEndTime() {
        return goodsEndTime;
    }

    public AsGoodsDO withGoodsEndTime(String goodsEndTime) {
        this.setGoodsEndTime(goodsEndTime);
        return this;
    }

    public void setGoodsEndTime(String goodsEndTime) {
        this.goodsEndTime = goodsEndTime;
    }

    public Integer getGoodsAuctionTimes() {
        return goodsAuctionTimes;
    }

    public AsGoodsDO withGoodsAuctionTimes(Integer goodsAuctionTimes) {
        this.setGoodsAuctionTimes(goodsAuctionTimes);
        return this;
    }

    public void setGoodsAuctionTimes(Integer goodsAuctionTimes) {
        this.goodsAuctionTimes = goodsAuctionTimes;
    }

    public Double getGoodsStartPrice() {
        return goodsStartPrice;
    }

    public AsGoodsDO withGoodsStartPrice(Double goodsStartPrice) {
        this.setGoodsStartPrice(goodsStartPrice);
        return this;
    }

    public void setGoodsStartPrice(Double goodsStartPrice) {
        this.goodsStartPrice = goodsStartPrice;
    }

    public Double getGoodsCurrentPrice() {
        return goodsCurrentPrice;
    }

    public AsGoodsDO withGoodsCurrentPrice(Double goodsCurrentPrice) {
        this.setGoodsCurrentPrice(goodsCurrentPrice);
        return this;
    }

    public void setGoodsCurrentPrice(Double goodsCurrentPrice) {
        this.goodsCurrentPrice = goodsCurrentPrice;
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public AsGoodsDO withGoodsState(Integer goodsState) {
        this.setGoodsState(goodsState);
        return this;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    public String getGoodsDescription() {
        return goodsDescription;
    }

    public AsGoodsDO withGoodsDescription(String goodsDescription) {
        this.setGoodsDescription(goodsDescription);
        return this;
    }

    public void setGoodsDescription(String goodsDescription) {
        this.goodsDescription = goodsDescription;
    }

    public Date getGoodsReleaseTime() {
        return goodsReleaseTime;
    }

    public AsGoodsDO withGoodsReleaseTime(Date goodsReleaseTime) {
        this.setGoodsReleaseTime(goodsReleaseTime);
        return this;
    }

    public void setGoodsReleaseTime(Date goodsReleaseTime) {
        this.goodsReleaseTime = goodsReleaseTime;
    }

    public Integer getGoodsAudit() {
        return goodsAudit;
    }

    public AsGoodsDO withGoodsAudit(Integer goodsAudit) {
        this.setGoodsAudit(goodsAudit);
        return this;
    }

    public void setGoodsAudit(Integer goodsAudit) {
        this.goodsAudit = goodsAudit;
    }

    public Integer getUserId() {
        return userId;
    }

    public AsGoodsDO withUserId(Integer userId) {
        this.setUserId(userId);
        return this;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsType=").append(goodsType);
        sb.append(", goodsPic=").append(goodsPic);
        sb.append(", goodsDetailPic=").append(goodsDetailPic);
        sb.append(", goodsStartTime=").append(goodsStartTime);
        sb.append(", goodsEndTime=").append(goodsEndTime);
        sb.append(", goodsAuctionTimes=").append(goodsAuctionTimes);
        sb.append(", goodsStartPrice=").append(goodsStartPrice);
        sb.append(", goodsCurrentPrice=").append(goodsCurrentPrice);
        sb.append(", goodsState=").append(goodsState);
        sb.append(", goodsDescription=").append(goodsDescription);
        sb.append(", goodsReleaseTime=").append(goodsReleaseTime);
        sb.append(", goodsAudit=").append(goodsAudit);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AsGoodsDO other = (AsGoodsDO) that;
        return (this.getGoodsId() == null ? other.getGoodsId() == null : this.getGoodsId().equals(other.getGoodsId()))
            && (this.getGoodsName() == null ? other.getGoodsName() == null : this.getGoodsName().equals(other.getGoodsName()))
            && (this.getGoodsType() == null ? other.getGoodsType() == null : this.getGoodsType().equals(other.getGoodsType()))
            && (this.getGoodsPic() == null ? other.getGoodsPic() == null : this.getGoodsPic().equals(other.getGoodsPic()))
            && (this.getGoodsDetailPic() == null ? other.getGoodsDetailPic() == null : this.getGoodsDetailPic().equals(other.getGoodsDetailPic()))
            && (this.getGoodsStartTime() == null ? other.getGoodsStartTime() == null : this.getGoodsStartTime().equals(other.getGoodsStartTime()))
            && (this.getGoodsEndTime() == null ? other.getGoodsEndTime() == null : this.getGoodsEndTime().equals(other.getGoodsEndTime()))
            && (this.getGoodsAuctionTimes() == null ? other.getGoodsAuctionTimes() == null : this.getGoodsAuctionTimes().equals(other.getGoodsAuctionTimes()))
            && (this.getGoodsStartPrice() == null ? other.getGoodsStartPrice() == null : this.getGoodsStartPrice().equals(other.getGoodsStartPrice()))
            && (this.getGoodsCurrentPrice() == null ? other.getGoodsCurrentPrice() == null : this.getGoodsCurrentPrice().equals(other.getGoodsCurrentPrice()))
            && (this.getGoodsState() == null ? other.getGoodsState() == null : this.getGoodsState().equals(other.getGoodsState()))
            && (this.getGoodsDescription() == null ? other.getGoodsDescription() == null : this.getGoodsDescription().equals(other.getGoodsDescription()))
            && (this.getGoodsReleaseTime() == null ? other.getGoodsReleaseTime() == null : this.getGoodsReleaseTime().equals(other.getGoodsReleaseTime()))
            && (this.getGoodsAudit() == null ? other.getGoodsAudit() == null : this.getGoodsAudit().equals(other.getGoodsAudit()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGoodsId() == null) ? 0 : getGoodsId().hashCode());
        result = prime * result + ((getGoodsName() == null) ? 0 : getGoodsName().hashCode());
        result = prime * result + ((getGoodsType() == null) ? 0 : getGoodsType().hashCode());
        result = prime * result + ((getGoodsPic() == null) ? 0 : getGoodsPic().hashCode());
        result = prime * result + ((getGoodsDetailPic() == null) ? 0 : getGoodsDetailPic().hashCode());
        result = prime * result + ((getGoodsStartTime() == null) ? 0 : getGoodsStartTime().hashCode());
        result = prime * result + ((getGoodsEndTime() == null) ? 0 : getGoodsEndTime().hashCode());
        result = prime * result + ((getGoodsAuctionTimes() == null) ? 0 : getGoodsAuctionTimes().hashCode());
        result = prime * result + ((getGoodsStartPrice() == null) ? 0 : getGoodsStartPrice().hashCode());
        result = prime * result + ((getGoodsCurrentPrice() == null) ? 0 : getGoodsCurrentPrice().hashCode());
        result = prime * result + ((getGoodsState() == null) ? 0 : getGoodsState().hashCode());
        result = prime * result + ((getGoodsDescription() == null) ? 0 : getGoodsDescription().hashCode());
        result = prime * result + ((getGoodsReleaseTime() == null) ? 0 : getGoodsReleaseTime().hashCode());
        result = prime * result + ((getGoodsAudit() == null) ? 0 : getGoodsAudit().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }
}