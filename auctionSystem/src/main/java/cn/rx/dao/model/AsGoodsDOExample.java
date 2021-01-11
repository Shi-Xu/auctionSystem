package cn.rx.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AsGoodsDOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public static final String TALIAS = "goods";

    private Integer limit;

    private Integer offset;

    private Object resultColumns;

    public AsGoodsDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static String addAliasByComma(String columns) {
        if (columns == null) return null;
        String[] columnList=columns.split(",");
        columns="";
        for (int i=0;i< columnList.length;i++) {
            String string=TALIAS+"."+columnList[i].trim();
            if (i!=0) { string=","+string; }
            columns=columns+string;
        }
        return columns;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setResultColumns(Object resultColumns) {
        this.resultColumns = resultColumns;
    }

    public Object getResultColumns() {
        return resultColumns;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods.goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods.goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods.goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods.goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods.goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods.goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods.goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods.goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods.goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods.goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods.goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods.goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods.goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods.goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods.goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods.goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods.goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods.goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods.goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods.goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods.goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods.goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods.goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods.goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods.goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods.goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods.goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods.goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(Integer value) {
            addCriterion("goods.goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(Integer value) {
            addCriterion("goods.goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(Integer value) {
            addCriterion("goods.goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods.goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(Integer value) {
            addCriterion("goods.goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("goods.goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<Integer> values) {
            addCriterion("goods.goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<Integer> values) {
            addCriterion("goods.goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(Integer value1, Integer value2) {
            addCriterion("goods.goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods.goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsPicIsNull() {
            addCriterion("goods.goods_pic is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPicIsNotNull() {
            addCriterion("goods.goods_pic is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPicEqualTo(String value) {
            addCriterion("goods.goods_pic =", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicNotEqualTo(String value) {
            addCriterion("goods.goods_pic <>", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicGreaterThan(String value) {
            addCriterion("goods.goods_pic >", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicGreaterThanOrEqualTo(String value) {
            addCriterion("goods.goods_pic >=", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicLessThan(String value) {
            addCriterion("goods.goods_pic <", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicLessThanOrEqualTo(String value) {
            addCriterion("goods.goods_pic <=", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicLike(String value) {
            addCriterion("goods.goods_pic like", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicNotLike(String value) {
            addCriterion("goods.goods_pic not like", value, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicIn(List<String> values) {
            addCriterion("goods.goods_pic in", values, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicNotIn(List<String> values) {
            addCriterion("goods.goods_pic not in", values, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicBetween(String value1, String value2) {
            addCriterion("goods.goods_pic between", value1, value2, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsPicNotBetween(String value1, String value2) {
            addCriterion("goods.goods_pic not between", value1, value2, "goodsPic");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailPicIsNull() {
            addCriterion("goods.goods_detail_pic is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailPicIsNotNull() {
            addCriterion("goods.goods_detail_pic is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailPicEqualTo(String value) {
            addCriterion("goods.goods_detail_pic =", value, "goodsDetailPic");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailPicNotEqualTo(String value) {
            addCriterion("goods.goods_detail_pic <>", value, "goodsDetailPic");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailPicGreaterThan(String value) {
            addCriterion("goods.goods_detail_pic >", value, "goodsDetailPic");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailPicGreaterThanOrEqualTo(String value) {
            addCriterion("goods.goods_detail_pic >=", value, "goodsDetailPic");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailPicLessThan(String value) {
            addCriterion("goods.goods_detail_pic <", value, "goodsDetailPic");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailPicLessThanOrEqualTo(String value) {
            addCriterion("goods.goods_detail_pic <=", value, "goodsDetailPic");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailPicLike(String value) {
            addCriterion("goods.goods_detail_pic like", value, "goodsDetailPic");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailPicNotLike(String value) {
            addCriterion("goods.goods_detail_pic not like", value, "goodsDetailPic");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailPicIn(List<String> values) {
            addCriterion("goods.goods_detail_pic in", values, "goodsDetailPic");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailPicNotIn(List<String> values) {
            addCriterion("goods.goods_detail_pic not in", values, "goodsDetailPic");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailPicBetween(String value1, String value2) {
            addCriterion("goods.goods_detail_pic between", value1, value2, "goodsDetailPic");
            return (Criteria) this;
        }

        public Criteria andGoodsDetailPicNotBetween(String value1, String value2) {
            addCriterion("goods.goods_detail_pic not between", value1, value2, "goodsDetailPic");
            return (Criteria) this;
        }

        public Criteria andGoodsStartTimeIsNull() {
            addCriterion("goods.goods_start_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStartTimeIsNotNull() {
            addCriterion("goods.goods_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("goods.goods_start_time =", value, "goodsStartTime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("goods.goods_start_time <>", value, "goodsStartTime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("goods.goods_start_time >", value, "goodsStartTime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("goods.goods_start_time >=", value, "goodsStartTime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("goods.goods_start_time <", value, "goodsStartTime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("goods.goods_start_time <=", value, "goodsStartTime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("goods.goods_start_time in", values, "goodsStartTime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("goods.goods_start_time not in", values, "goodsStartTime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("goods.goods_start_time between", value1, value2, "goodsStartTime");
            return (Criteria) this;
        }

        public Criteria andGoodsStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("goods.goods_start_time not between", value1, value2, "goodsStartTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeIsNull() {
            addCriterion("goods.goods_end_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeIsNotNull() {
            addCriterion("goods.goods_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("goods.goods_end_time =", value, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("goods.goods_end_time <>", value, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("goods.goods_end_time >", value, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("goods.goods_end_time >=", value, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("goods.goods_end_time <", value, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("goods.goods_end_time <=", value, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("goods.goods_end_time in", values, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("goods.goods_end_time not in", values, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("goods.goods_end_time between", value1, value2, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("goods.goods_end_time not between", value1, value2, "goodsEndTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAuctionTimesIsNull() {
            addCriterion("goods.goods_auction_times is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAuctionTimesIsNotNull() {
            addCriterion("goods.goods_auction_times is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAuctionTimesEqualTo(Integer value) {
            addCriterion("goods.goods_auction_times =", value, "goodsAuctionTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsAuctionTimesNotEqualTo(Integer value) {
            addCriterion("goods.goods_auction_times <>", value, "goodsAuctionTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsAuctionTimesGreaterThan(Integer value) {
            addCriterion("goods.goods_auction_times >", value, "goodsAuctionTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsAuctionTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods.goods_auction_times >=", value, "goodsAuctionTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsAuctionTimesLessThan(Integer value) {
            addCriterion("goods.goods_auction_times <", value, "goodsAuctionTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsAuctionTimesLessThanOrEqualTo(Integer value) {
            addCriterion("goods.goods_auction_times <=", value, "goodsAuctionTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsAuctionTimesIn(List<Integer> values) {
            addCriterion("goods.goods_auction_times in", values, "goodsAuctionTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsAuctionTimesNotIn(List<Integer> values) {
            addCriterion("goods.goods_auction_times not in", values, "goodsAuctionTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsAuctionTimesBetween(Integer value1, Integer value2) {
            addCriterion("goods.goods_auction_times between", value1, value2, "goodsAuctionTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsAuctionTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("goods.goods_auction_times not between", value1, value2, "goodsAuctionTimes");
            return (Criteria) this;
        }

        public Criteria andGoodsStartPriceIsNull() {
            addCriterion("goods.goods_start_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStartPriceIsNotNull() {
            addCriterion("goods.goods_start_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStartPriceEqualTo(Double value) {
            addCriterion("goods.goods_start_price =", value, "goodsStartPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStartPriceNotEqualTo(Double value) {
            addCriterion("goods.goods_start_price <>", value, "goodsStartPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStartPriceGreaterThan(Double value) {
            addCriterion("goods.goods_start_price >", value, "goodsStartPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStartPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goods.goods_start_price >=", value, "goodsStartPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStartPriceLessThan(Double value) {
            addCriterion("goods.goods_start_price <", value, "goodsStartPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStartPriceLessThanOrEqualTo(Double value) {
            addCriterion("goods.goods_start_price <=", value, "goodsStartPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStartPriceIn(List<Double> values) {
            addCriterion("goods.goods_start_price in", values, "goodsStartPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStartPriceNotIn(List<Double> values) {
            addCriterion("goods.goods_start_price not in", values, "goodsStartPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStartPriceBetween(Double value1, Double value2) {
            addCriterion("goods.goods_start_price between", value1, value2, "goodsStartPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStartPriceNotBetween(Double value1, Double value2) {
            addCriterion("goods.goods_start_price not between", value1, value2, "goodsStartPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCurrentPriceIsNull() {
            addCriterion("goods.goods_current_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCurrentPriceIsNotNull() {
            addCriterion("goods.goods_current_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCurrentPriceEqualTo(Double value) {
            addCriterion("goods.goods_current_price =", value, "goodsCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCurrentPriceNotEqualTo(Double value) {
            addCriterion("goods.goods_current_price <>", value, "goodsCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCurrentPriceGreaterThan(Double value) {
            addCriterion("goods.goods_current_price >", value, "goodsCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCurrentPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goods.goods_current_price >=", value, "goodsCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCurrentPriceLessThan(Double value) {
            addCriterion("goods.goods_current_price <", value, "goodsCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCurrentPriceLessThanOrEqualTo(Double value) {
            addCriterion("goods.goods_current_price <=", value, "goodsCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCurrentPriceIn(List<Double> values) {
            addCriterion("goods.goods_current_price in", values, "goodsCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCurrentPriceNotIn(List<Double> values) {
            addCriterion("goods.goods_current_price not in", values, "goodsCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCurrentPriceBetween(Double value1, Double value2) {
            addCriterion("goods.goods_current_price between", value1, value2, "goodsCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCurrentPriceNotBetween(Double value1, Double value2) {
            addCriterion("goods.goods_current_price not between", value1, value2, "goodsCurrentPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNull() {
            addCriterion("goods.goods_state is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIsNotNull() {
            addCriterion("goods.goods_state is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStateEqualTo(Integer value) {
            addCriterion("goods.goods_state =", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotEqualTo(Integer value) {
            addCriterion("goods.goods_state <>", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThan(Integer value) {
            addCriterion("goods.goods_state >", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods.goods_state >=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThan(Integer value) {
            addCriterion("goods.goods_state <", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateLessThanOrEqualTo(Integer value) {
            addCriterion("goods.goods_state <=", value, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateIn(List<Integer> values) {
            addCriterion("goods.goods_state in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotIn(List<Integer> values) {
            addCriterion("goods.goods_state not in", values, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateBetween(Integer value1, Integer value2) {
            addCriterion("goods.goods_state between", value1, value2, "goodsState");
            return (Criteria) this;
        }

        public Criteria andGoodsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("goods.goods_state not between", value1, value2, "goodsState");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}