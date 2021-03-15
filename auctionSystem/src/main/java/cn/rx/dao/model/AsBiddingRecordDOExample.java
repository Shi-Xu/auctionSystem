package cn.rx.dao.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AsBiddingRecordDOExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public static final String TALIAS = "null";

    private Integer limit;

    private Integer offset;

    private Object resultColumns;

    public AsBiddingRecordDOExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("record_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("record_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Integer value) {
            addCriterion("record_id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Integer value) {
            addCriterion("record_id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Integer value) {
            addCriterion("record_id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Integer value) {
            addCriterion("record_id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Integer> values) {
            addCriterion("record_id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Integer> values) {
            addCriterion("record_id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("record_id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdIsNull() {
            addCriterion("record_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdIsNotNull() {
            addCriterion("record_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdEqualTo(Integer value) {
            addCriterion("record_user_id =", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdNotEqualTo(Integer value) {
            addCriterion("record_user_id <>", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdGreaterThan(Integer value) {
            addCriterion("record_user_id >", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_user_id >=", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdLessThan(Integer value) {
            addCriterion("record_user_id <", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_user_id <=", value, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdIn(List<Integer> values) {
            addCriterion("record_user_id in", values, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdNotIn(List<Integer> values) {
            addCriterion("record_user_id not in", values, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdBetween(Integer value1, Integer value2) {
            addCriterion("record_user_id between", value1, value2, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_user_id not between", value1, value2, "recordUserId");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsIdIsNull() {
            addCriterion("record_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsIdIsNotNull() {
            addCriterion("record_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsIdEqualTo(Integer value) {
            addCriterion("record_goods_id =", value, "recordGoodsId");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsIdNotEqualTo(Integer value) {
            addCriterion("record_goods_id <>", value, "recordGoodsId");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsIdGreaterThan(Integer value) {
            addCriterion("record_goods_id >", value, "recordGoodsId");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_goods_id >=", value, "recordGoodsId");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsIdLessThan(Integer value) {
            addCriterion("record_goods_id <", value, "recordGoodsId");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("record_goods_id <=", value, "recordGoodsId");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsIdIn(List<Integer> values) {
            addCriterion("record_goods_id in", values, "recordGoodsId");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsIdNotIn(List<Integer> values) {
            addCriterion("record_goods_id not in", values, "recordGoodsId");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("record_goods_id between", value1, value2, "recordGoodsId");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("record_goods_id not between", value1, value2, "recordGoodsId");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingPriceIsNull() {
            addCriterion("record_bidding_price is null");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingPriceIsNotNull() {
            addCriterion("record_bidding_price is not null");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingPriceEqualTo(Double value) {
            addCriterion("record_bidding_price =", value, "recordBiddingPrice");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingPriceNotEqualTo(Double value) {
            addCriterion("record_bidding_price <>", value, "recordBiddingPrice");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingPriceGreaterThan(Double value) {
            addCriterion("record_bidding_price >", value, "recordBiddingPrice");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("record_bidding_price >=", value, "recordBiddingPrice");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingPriceLessThan(Double value) {
            addCriterion("record_bidding_price <", value, "recordBiddingPrice");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingPriceLessThanOrEqualTo(Double value) {
            addCriterion("record_bidding_price <=", value, "recordBiddingPrice");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingPriceIn(List<Double> values) {
            addCriterion("record_bidding_price in", values, "recordBiddingPrice");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingPriceNotIn(List<Double> values) {
            addCriterion("record_bidding_price not in", values, "recordBiddingPrice");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingPriceBetween(Double value1, Double value2) {
            addCriterion("record_bidding_price between", value1, value2, "recordBiddingPrice");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingPriceNotBetween(Double value1, Double value2) {
            addCriterion("record_bidding_price not between", value1, value2, "recordBiddingPrice");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingTimeIsNull() {
            addCriterion("record_bidding_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingTimeIsNotNull() {
            addCriterion("record_bidding_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingTimeEqualTo(String value) {
            addCriterion("record_bidding_time =", value, "recordBiddingTime");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingTimeNotEqualTo(String value) {
            addCriterion("record_bidding_time <>", value, "recordBiddingTime");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingTimeGreaterThan(String value) {
            addCriterion("record_bidding_time >", value, "recordBiddingTime");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("record_bidding_time >=", value, "recordBiddingTime");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingTimeLessThan(String value) {
            addCriterion("record_bidding_time <", value, "recordBiddingTime");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingTimeLessThanOrEqualTo(String value) {
            addCriterion("record_bidding_time <=", value, "recordBiddingTime");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingTimeLike(String value) {
            addCriterion("record_bidding_time like", value, "recordBiddingTime");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingTimeNotLike(String value) {
            addCriterion("record_bidding_time not like", value, "recordBiddingTime");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingTimeIn(List<String> values) {
            addCriterion("record_bidding_time in", values, "recordBiddingTime");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingTimeNotIn(List<String> values) {
            addCriterion("record_bidding_time not in", values, "recordBiddingTime");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingTimeBetween(String value1, String value2) {
            addCriterion("record_bidding_time between", value1, value2, "recordBiddingTime");
            return (Criteria) this;
        }

        public Criteria andRecordBiddingTimeNotBetween(String value1, String value2) {
            addCriterion("record_bidding_time not between", value1, value2, "recordBiddingTime");
            return (Criteria) this;
        }

        public Criteria andRecordUserNameIsNull() {
            addCriterion("record_user_name is null");
            return (Criteria) this;
        }

        public Criteria andRecordUserNameIsNotNull() {
            addCriterion("record_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecordUserNameEqualTo(String value) {
            addCriterion("record_user_name =", value, "recordUserName");
            return (Criteria) this;
        }

        public Criteria andRecordUserNameNotEqualTo(String value) {
            addCriterion("record_user_name <>", value, "recordUserName");
            return (Criteria) this;
        }

        public Criteria andRecordUserNameGreaterThan(String value) {
            addCriterion("record_user_name >", value, "recordUserName");
            return (Criteria) this;
        }

        public Criteria andRecordUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("record_user_name >=", value, "recordUserName");
            return (Criteria) this;
        }

        public Criteria andRecordUserNameLessThan(String value) {
            addCriterion("record_user_name <", value, "recordUserName");
            return (Criteria) this;
        }

        public Criteria andRecordUserNameLessThanOrEqualTo(String value) {
            addCriterion("record_user_name <=", value, "recordUserName");
            return (Criteria) this;
        }

        public Criteria andRecordUserNameLike(String value) {
            addCriterion("record_user_name like", value, "recordUserName");
            return (Criteria) this;
        }

        public Criteria andRecordUserNameNotLike(String value) {
            addCriterion("record_user_name not like", value, "recordUserName");
            return (Criteria) this;
        }

        public Criteria andRecordUserNameIn(List<String> values) {
            addCriterion("record_user_name in", values, "recordUserName");
            return (Criteria) this;
        }

        public Criteria andRecordUserNameNotIn(List<String> values) {
            addCriterion("record_user_name not in", values, "recordUserName");
            return (Criteria) this;
        }

        public Criteria andRecordUserNameBetween(String value1, String value2) {
            addCriterion("record_user_name between", value1, value2, "recordUserName");
            return (Criteria) this;
        }

        public Criteria andRecordUserNameNotBetween(String value1, String value2) {
            addCriterion("record_user_name not between", value1, value2, "recordUserName");
            return (Criteria) this;
        }

        public Criteria andRecordIsWinBidIsNull() {
            addCriterion("record_is_win_bid is null");
            return (Criteria) this;
        }

        public Criteria andRecordIsWinBidIsNotNull() {
            addCriterion("record_is_win_bid is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIsWinBidEqualTo(Integer value) {
            addCriterion("record_is_win_bid =", value, "recordIsWinBid");
            return (Criteria) this;
        }

        public Criteria andRecordIsWinBidNotEqualTo(Integer value) {
            addCriterion("record_is_win_bid <>", value, "recordIsWinBid");
            return (Criteria) this;
        }

        public Criteria andRecordIsWinBidGreaterThan(Integer value) {
            addCriterion("record_is_win_bid >", value, "recordIsWinBid");
            return (Criteria) this;
        }

        public Criteria andRecordIsWinBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_is_win_bid >=", value, "recordIsWinBid");
            return (Criteria) this;
        }

        public Criteria andRecordIsWinBidLessThan(Integer value) {
            addCriterion("record_is_win_bid <", value, "recordIsWinBid");
            return (Criteria) this;
        }

        public Criteria andRecordIsWinBidLessThanOrEqualTo(Integer value) {
            addCriterion("record_is_win_bid <=", value, "recordIsWinBid");
            return (Criteria) this;
        }

        public Criteria andRecordIsWinBidIn(List<Integer> values) {
            addCriterion("record_is_win_bid in", values, "recordIsWinBid");
            return (Criteria) this;
        }

        public Criteria andRecordIsWinBidNotIn(List<Integer> values) {
            addCriterion("record_is_win_bid not in", values, "recordIsWinBid");
            return (Criteria) this;
        }

        public Criteria andRecordIsWinBidBetween(Integer value1, Integer value2) {
            addCriterion("record_is_win_bid between", value1, value2, "recordIsWinBid");
            return (Criteria) this;
        }

        public Criteria andRecordIsWinBidNotBetween(Integer value1, Integer value2) {
            addCriterion("record_is_win_bid not between", value1, value2, "recordIsWinBid");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsNameIsNull() {
            addCriterion("record_goods_name is null");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsNameIsNotNull() {
            addCriterion("record_goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsNameEqualTo(String value) {
            addCriterion("record_goods_name =", value, "recordGoodsName");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsNameNotEqualTo(String value) {
            addCriterion("record_goods_name <>", value, "recordGoodsName");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsNameGreaterThan(String value) {
            addCriterion("record_goods_name >", value, "recordGoodsName");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("record_goods_name >=", value, "recordGoodsName");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsNameLessThan(String value) {
            addCriterion("record_goods_name <", value, "recordGoodsName");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("record_goods_name <=", value, "recordGoodsName");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsNameLike(String value) {
            addCriterion("record_goods_name like", value, "recordGoodsName");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsNameNotLike(String value) {
            addCriterion("record_goods_name not like", value, "recordGoodsName");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsNameIn(List<String> values) {
            addCriterion("record_goods_name in", values, "recordGoodsName");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsNameNotIn(List<String> values) {
            addCriterion("record_goods_name not in", values, "recordGoodsName");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsNameBetween(String value1, String value2) {
            addCriterion("record_goods_name between", value1, value2, "recordGoodsName");
            return (Criteria) this;
        }

        public Criteria andRecordGoodsNameNotBetween(String value1, String value2) {
            addCriterion("record_goods_name not between", value1, value2, "recordGoodsName");
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