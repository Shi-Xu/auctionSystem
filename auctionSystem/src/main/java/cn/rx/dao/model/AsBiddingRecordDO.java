package cn.rx.dao.model;

import java.io.Serializable;

public class AsBiddingRecordDO implements Serializable {
    /**
     * 字段：record_id
     * 竞价记录id
     *
     * @mbg.generated
     */
    private Integer recordId;

    /**
     * 字段：record_user_id
     * 竞价用户id
     *
     * @mbg.generated
     */
    private Integer recordUserId;

    /**
     * 字段：record_goods_id
     * 竞价商品id
     *
     * @mbg.generated
     */
    private Integer recordGoodsId;

    /**
     * 字段：record_bidding_price
     * 竞价后价格
     *
     * @mbg.generated
     */
    private Double recordBiddingPrice;

    /**
     * 字段：record_bidding_time
     * 竞拍时间
     *
     * @mbg.generated
     */
    private String recordBiddingTime;

    /**
     * 字段：record_user_name
     * 竞价人姓名
     *
     * @mbg.generated
     */
    private String recordUserName;

    /**
     * 字段：record_is_win_bid
     * 是否中标 0 未中标 1已中标
     *
     * @mbg.generated
     */
    private Integer recordIsWinBid;

    /**
     * 字段：record_goods_name
     * 竞拍商品
     *
     * @mbg.generated
     */
    private String recordGoodsName;

    private static final long serialVersionUID = 1L;

    public Integer getRecordId() {
        return recordId;
    }

    public AsBiddingRecordDO withRecordId(Integer recordId) {
        this.setRecordId(recordId);
        return this;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getRecordUserId() {
        return recordUserId;
    }

    public AsBiddingRecordDO withRecordUserId(Integer recordUserId) {
        this.setRecordUserId(recordUserId);
        return this;
    }

    public void setRecordUserId(Integer recordUserId) {
        this.recordUserId = recordUserId;
    }

    public Integer getRecordGoodsId() {
        return recordGoodsId;
    }

    public AsBiddingRecordDO withRecordGoodsId(Integer recordGoodsId) {
        this.setRecordGoodsId(recordGoodsId);
        return this;
    }

    public void setRecordGoodsId(Integer recordGoodsId) {
        this.recordGoodsId = recordGoodsId;
    }

    public Double getRecordBiddingPrice() {
        return recordBiddingPrice;
    }

    public AsBiddingRecordDO withRecordBiddingPrice(Double recordBiddingPrice) {
        this.setRecordBiddingPrice(recordBiddingPrice);
        return this;
    }

    public void setRecordBiddingPrice(Double recordBiddingPrice) {
        this.recordBiddingPrice = recordBiddingPrice;
    }

    public String getRecordBiddingTime() {
        return recordBiddingTime;
    }

    public AsBiddingRecordDO withRecordBiddingTime(String recordBiddingTime) {
        this.setRecordBiddingTime(recordBiddingTime);
        return this;
    }

    public void setRecordBiddingTime(String recordBiddingTime) {
        this.recordBiddingTime = recordBiddingTime;
    }

    public String getRecordUserName() {
        return recordUserName;
    }

    public AsBiddingRecordDO withRecordUserName(String recordUserName) {
        this.setRecordUserName(recordUserName);
        return this;
    }

    public void setRecordUserName(String recordUserName) {
        this.recordUserName = recordUserName;
    }

    public Integer getRecordIsWinBid() {
        return recordIsWinBid;
    }

    public AsBiddingRecordDO withRecordIsWinBid(Integer recordIsWinBid) {
        this.setRecordIsWinBid(recordIsWinBid);
        return this;
    }

    public void setRecordIsWinBid(Integer recordIsWinBid) {
        this.recordIsWinBid = recordIsWinBid;
    }

    public String getRecordGoodsName() {
        return recordGoodsName;
    }

    public AsBiddingRecordDO withRecordGoodsName(String recordGoodsName) {
        this.setRecordGoodsName(recordGoodsName);
        return this;
    }

    public void setRecordGoodsName(String recordGoodsName) {
        this.recordGoodsName = recordGoodsName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", recordId=").append(recordId);
        sb.append(", recordUserId=").append(recordUserId);
        sb.append(", recordGoodsId=").append(recordGoodsId);
        sb.append(", recordBiddingPrice=").append(recordBiddingPrice);
        sb.append(", recordBiddingTime=").append(recordBiddingTime);
        sb.append(", recordUserName=").append(recordUserName);
        sb.append(", recordIsWinBid=").append(recordIsWinBid);
        sb.append(", recordGoodsName=").append(recordGoodsName);
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
        AsBiddingRecordDO other = (AsBiddingRecordDO) that;
        return (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getRecordUserId() == null ? other.getRecordUserId() == null : this.getRecordUserId().equals(other.getRecordUserId()))
            && (this.getRecordGoodsId() == null ? other.getRecordGoodsId() == null : this.getRecordGoodsId().equals(other.getRecordGoodsId()))
            && (this.getRecordBiddingPrice() == null ? other.getRecordBiddingPrice() == null : this.getRecordBiddingPrice().equals(other.getRecordBiddingPrice()))
            && (this.getRecordBiddingTime() == null ? other.getRecordBiddingTime() == null : this.getRecordBiddingTime().equals(other.getRecordBiddingTime()))
            && (this.getRecordUserName() == null ? other.getRecordUserName() == null : this.getRecordUserName().equals(other.getRecordUserName()))
            && (this.getRecordIsWinBid() == null ? other.getRecordIsWinBid() == null : this.getRecordIsWinBid().equals(other.getRecordIsWinBid()))
            && (this.getRecordGoodsName() == null ? other.getRecordGoodsName() == null : this.getRecordGoodsName().equals(other.getRecordGoodsName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getRecordUserId() == null) ? 0 : getRecordUserId().hashCode());
        result = prime * result + ((getRecordGoodsId() == null) ? 0 : getRecordGoodsId().hashCode());
        result = prime * result + ((getRecordBiddingPrice() == null) ? 0 : getRecordBiddingPrice().hashCode());
        result = prime * result + ((getRecordBiddingTime() == null) ? 0 : getRecordBiddingTime().hashCode());
        result = prime * result + ((getRecordUserName() == null) ? 0 : getRecordUserName().hashCode());
        result = prime * result + ((getRecordIsWinBid() == null) ? 0 : getRecordIsWinBid().hashCode());
        result = prime * result + ((getRecordGoodsName() == null) ? 0 : getRecordGoodsName().hashCode());
        return result;
    }
}