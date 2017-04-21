package com.jinhui.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SummaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SummaryExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andConversationIsNull() {
            addCriterion("conversation is null");
            return (Criteria) this;
        }

        public Criteria andConversationIsNotNull() {
            addCriterion("conversation is not null");
            return (Criteria) this;
        }

        public Criteria andConversationEqualTo(Float value) {
            addCriterion("conversation =", value, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationNotEqualTo(Float value) {
            addCriterion("conversation <>", value, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationGreaterThan(Float value) {
            addCriterion("conversation >", value, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationGreaterThanOrEqualTo(Float value) {
            addCriterion("conversation >=", value, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationLessThan(Float value) {
            addCriterion("conversation <", value, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationLessThanOrEqualTo(Float value) {
            addCriterion("conversation <=", value, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationIn(List<Float> values) {
            addCriterion("conversation in", values, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationNotIn(List<Float> values) {
            addCriterion("conversation not in", values, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationBetween(Float value1, Float value2) {
            addCriterion("conversation between", value1, value2, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationNotBetween(Float value1, Float value2) {
            addCriterion("conversation not between", value1, value2, "conversation");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(Float value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(Float value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(Float value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(Float value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(Float value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(Float value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<Float> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<Float> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(Float value1, Float value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(Float value1, Float value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andDataTrafficIsNull() {
            addCriterion("data_traffic is null");
            return (Criteria) this;
        }

        public Criteria andDataTrafficIsNotNull() {
            addCriterion("data_traffic is not null");
            return (Criteria) this;
        }

        public Criteria andDataTrafficEqualTo(Float value) {
            addCriterion("data_traffic =", value, "dataTraffic");
            return (Criteria) this;
        }

        public Criteria andDataTrafficNotEqualTo(Float value) {
            addCriterion("data_traffic <>", value, "dataTraffic");
            return (Criteria) this;
        }

        public Criteria andDataTrafficGreaterThan(Float value) {
            addCriterion("data_traffic >", value, "dataTraffic");
            return (Criteria) this;
        }

        public Criteria andDataTrafficGreaterThanOrEqualTo(Float value) {
            addCriterion("data_traffic >=", value, "dataTraffic");
            return (Criteria) this;
        }

        public Criteria andDataTrafficLessThan(Float value) {
            addCriterion("data_traffic <", value, "dataTraffic");
            return (Criteria) this;
        }

        public Criteria andDataTrafficLessThanOrEqualTo(Float value) {
            addCriterion("data_traffic <=", value, "dataTraffic");
            return (Criteria) this;
        }

        public Criteria andDataTrafficIn(List<Float> values) {
            addCriterion("data_traffic in", values, "dataTraffic");
            return (Criteria) this;
        }

        public Criteria andDataTrafficNotIn(List<Float> values) {
            addCriterion("data_traffic not in", values, "dataTraffic");
            return (Criteria) this;
        }

        public Criteria andDataTrafficBetween(Float value1, Float value2) {
            addCriterion("data_traffic between", value1, value2, "dataTraffic");
            return (Criteria) this;
        }

        public Criteria andDataTrafficNotBetween(Float value1, Float value2) {
            addCriterion("data_traffic not between", value1, value2, "dataTraffic");
            return (Criteria) this;
        }

        public Criteria andConversationPriceIsNull() {
            addCriterion("conversation_price is null");
            return (Criteria) this;
        }

        public Criteria andConversationPriceIsNotNull() {
            addCriterion("conversation_price is not null");
            return (Criteria) this;
        }

        public Criteria andConversationPriceEqualTo(Float value) {
            addCriterion("conversation_price =", value, "conversationPrice");
            return (Criteria) this;
        }

        public Criteria andConversationPriceNotEqualTo(Float value) {
            addCriterion("conversation_price <>", value, "conversationPrice");
            return (Criteria) this;
        }

        public Criteria andConversationPriceGreaterThan(Float value) {
            addCriterion("conversation_price >", value, "conversationPrice");
            return (Criteria) this;
        }

        public Criteria andConversationPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("conversation_price >=", value, "conversationPrice");
            return (Criteria) this;
        }

        public Criteria andConversationPriceLessThan(Float value) {
            addCriterion("conversation_price <", value, "conversationPrice");
            return (Criteria) this;
        }

        public Criteria andConversationPriceLessThanOrEqualTo(Float value) {
            addCriterion("conversation_price <=", value, "conversationPrice");
            return (Criteria) this;
        }

        public Criteria andConversationPriceIn(List<Float> values) {
            addCriterion("conversation_price in", values, "conversationPrice");
            return (Criteria) this;
        }

        public Criteria andConversationPriceNotIn(List<Float> values) {
            addCriterion("conversation_price not in", values, "conversationPrice");
            return (Criteria) this;
        }

        public Criteria andConversationPriceBetween(Float value1, Float value2) {
            addCriterion("conversation_price between", value1, value2, "conversationPrice");
            return (Criteria) this;
        }

        public Criteria andConversationPriceNotBetween(Float value1, Float value2) {
            addCriterion("conversation_price not between", value1, value2, "conversationPrice");
            return (Criteria) this;
        }

        public Criteria andMessagePriceIsNull() {
            addCriterion("message_price is null");
            return (Criteria) this;
        }

        public Criteria andMessagePriceIsNotNull() {
            addCriterion("message_price is not null");
            return (Criteria) this;
        }

        public Criteria andMessagePriceEqualTo(Float value) {
            addCriterion("message_price =", value, "messagePrice");
            return (Criteria) this;
        }

        public Criteria andMessagePriceNotEqualTo(Float value) {
            addCriterion("message_price <>", value, "messagePrice");
            return (Criteria) this;
        }

        public Criteria andMessagePriceGreaterThan(Float value) {
            addCriterion("message_price >", value, "messagePrice");
            return (Criteria) this;
        }

        public Criteria andMessagePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("message_price >=", value, "messagePrice");
            return (Criteria) this;
        }

        public Criteria andMessagePriceLessThan(Float value) {
            addCriterion("message_price <", value, "messagePrice");
            return (Criteria) this;
        }

        public Criteria andMessagePriceLessThanOrEqualTo(Float value) {
            addCriterion("message_price <=", value, "messagePrice");
            return (Criteria) this;
        }

        public Criteria andMessagePriceIn(List<Float> values) {
            addCriterion("message_price in", values, "messagePrice");
            return (Criteria) this;
        }

        public Criteria andMessagePriceNotIn(List<Float> values) {
            addCriterion("message_price not in", values, "messagePrice");
            return (Criteria) this;
        }

        public Criteria andMessagePriceBetween(Float value1, Float value2) {
            addCriterion("message_price between", value1, value2, "messagePrice");
            return (Criteria) this;
        }

        public Criteria andMessagePriceNotBetween(Float value1, Float value2) {
            addCriterion("message_price not between", value1, value2, "messagePrice");
            return (Criteria) this;
        }

        public Criteria andDataTrafficPriceIsNull() {
            addCriterion("data_traffic_price is null");
            return (Criteria) this;
        }

        public Criteria andDataTrafficPriceIsNotNull() {
            addCriterion("data_traffic_price is not null");
            return (Criteria) this;
        }

        public Criteria andDataTrafficPriceEqualTo(Float value) {
            addCriterion("data_traffic_price =", value, "dataTrafficPrice");
            return (Criteria) this;
        }

        public Criteria andDataTrafficPriceNotEqualTo(Float value) {
            addCriterion("data_traffic_price <>", value, "dataTrafficPrice");
            return (Criteria) this;
        }

        public Criteria andDataTrafficPriceGreaterThan(Float value) {
            addCriterion("data_traffic_price >", value, "dataTrafficPrice");
            return (Criteria) this;
        }

        public Criteria andDataTrafficPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("data_traffic_price >=", value, "dataTrafficPrice");
            return (Criteria) this;
        }

        public Criteria andDataTrafficPriceLessThan(Float value) {
            addCriterion("data_traffic_price <", value, "dataTrafficPrice");
            return (Criteria) this;
        }

        public Criteria andDataTrafficPriceLessThanOrEqualTo(Float value) {
            addCriterion("data_traffic_price <=", value, "dataTrafficPrice");
            return (Criteria) this;
        }

        public Criteria andDataTrafficPriceIn(List<Float> values) {
            addCriterion("data_traffic_price in", values, "dataTrafficPrice");
            return (Criteria) this;
        }

        public Criteria andDataTrafficPriceNotIn(List<Float> values) {
            addCriterion("data_traffic_price not in", values, "dataTrafficPrice");
            return (Criteria) this;
        }

        public Criteria andDataTrafficPriceBetween(Float value1, Float value2) {
            addCriterion("data_traffic_price between", value1, value2, "dataTrafficPrice");
            return (Criteria) this;
        }

        public Criteria andDataTrafficPriceNotBetween(Float value1, Float value2) {
            addCriterion("data_traffic_price not between", value1, value2, "dataTrafficPrice");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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