package com.jinhui.po;

import java.util.ArrayList;
import java.util.List;

public class PackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PackExample() {
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

        public Criteria andConversationIsNull() {
            addCriterion("conversation is null");
            return (Criteria) this;
        }

        public Criteria andConversationIsNotNull() {
            addCriterion("conversation is not null");
            return (Criteria) this;
        }

        public Criteria andConversationEqualTo(Integer value) {
            addCriterion("conversation =", value, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationNotEqualTo(Integer value) {
            addCriterion("conversation <>", value, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationGreaterThan(Integer value) {
            addCriterion("conversation >", value, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationGreaterThanOrEqualTo(Integer value) {
            addCriterion("conversation >=", value, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationLessThan(Integer value) {
            addCriterion("conversation <", value, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationLessThanOrEqualTo(Integer value) {
            addCriterion("conversation <=", value, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationIn(List<Integer> values) {
            addCriterion("conversation in", values, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationNotIn(List<Integer> values) {
            addCriterion("conversation not in", values, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationBetween(Integer value1, Integer value2) {
            addCriterion("conversation between", value1, value2, "conversation");
            return (Criteria) this;
        }

        public Criteria andConversationNotBetween(Integer value1, Integer value2) {
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

        public Criteria andMessageEqualTo(Integer value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(Integer value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(Integer value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(Integer value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(Integer value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(Integer value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<Integer> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<Integer> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(Integer value1, Integer value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(Integer value1, Integer value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andDateTrafficIsNull() {
            addCriterion("date_traffic is null");
            return (Criteria) this;
        }

        public Criteria andDateTrafficIsNotNull() {
            addCriterion("date_traffic is not null");
            return (Criteria) this;
        }

        public Criteria andDateTrafficEqualTo(Integer value) {
            addCriterion("date_traffic =", value, "dateTraffic");
            return (Criteria) this;
        }

        public Criteria andDateTrafficNotEqualTo(Integer value) {
            addCriterion("date_traffic <>", value, "dateTraffic");
            return (Criteria) this;
        }

        public Criteria andDateTrafficGreaterThan(Integer value) {
            addCriterion("date_traffic >", value, "dateTraffic");
            return (Criteria) this;
        }

        public Criteria andDateTrafficGreaterThanOrEqualTo(Integer value) {
            addCriterion("date_traffic >=", value, "dateTraffic");
            return (Criteria) this;
        }

        public Criteria andDateTrafficLessThan(Integer value) {
            addCriterion("date_traffic <", value, "dateTraffic");
            return (Criteria) this;
        }

        public Criteria andDateTrafficLessThanOrEqualTo(Integer value) {
            addCriterion("date_traffic <=", value, "dateTraffic");
            return (Criteria) this;
        }

        public Criteria andDateTrafficIn(List<Integer> values) {
            addCriterion("date_traffic in", values, "dateTraffic");
            return (Criteria) this;
        }

        public Criteria andDateTrafficNotIn(List<Integer> values) {
            addCriterion("date_traffic not in", values, "dateTraffic");
            return (Criteria) this;
        }

        public Criteria andDateTrafficBetween(Integer value1, Integer value2) {
            addCriterion("date_traffic between", value1, value2, "dateTraffic");
            return (Criteria) this;
        }

        public Criteria andDateTrafficNotBetween(Integer value1, Integer value2) {
            addCriterion("date_traffic not between", value1, value2, "dateTraffic");
            return (Criteria) this;
        }

        public Criteria andUnitConversationIsNull() {
            addCriterion("unit_conversation is null");
            return (Criteria) this;
        }

        public Criteria andUnitConversationIsNotNull() {
            addCriterion("unit_conversation is not null");
            return (Criteria) this;
        }

        public Criteria andUnitConversationEqualTo(Float value) {
            addCriterion("unit_conversation =", value, "unitConversation");
            return (Criteria) this;
        }

        public Criteria andUnitConversationNotEqualTo(Float value) {
            addCriterion("unit_conversation <>", value, "unitConversation");
            return (Criteria) this;
        }

        public Criteria andUnitConversationGreaterThan(Float value) {
            addCriterion("unit_conversation >", value, "unitConversation");
            return (Criteria) this;
        }

        public Criteria andUnitConversationGreaterThanOrEqualTo(Float value) {
            addCriterion("unit_conversation >=", value, "unitConversation");
            return (Criteria) this;
        }

        public Criteria andUnitConversationLessThan(Float value) {
            addCriterion("unit_conversation <", value, "unitConversation");
            return (Criteria) this;
        }

        public Criteria andUnitConversationLessThanOrEqualTo(Float value) {
            addCriterion("unit_conversation <=", value, "unitConversation");
            return (Criteria) this;
        }

        public Criteria andUnitConversationIn(List<Float> values) {
            addCriterion("unit_conversation in", values, "unitConversation");
            return (Criteria) this;
        }

        public Criteria andUnitConversationNotIn(List<Float> values) {
            addCriterion("unit_conversation not in", values, "unitConversation");
            return (Criteria) this;
        }

        public Criteria andUnitConversationBetween(Float value1, Float value2) {
            addCriterion("unit_conversation between", value1, value2, "unitConversation");
            return (Criteria) this;
        }

        public Criteria andUnitConversationNotBetween(Float value1, Float value2) {
            addCriterion("unit_conversation not between", value1, value2, "unitConversation");
            return (Criteria) this;
        }

        public Criteria andUnitMessageIsNull() {
            addCriterion("unit_message is null");
            return (Criteria) this;
        }

        public Criteria andUnitMessageIsNotNull() {
            addCriterion("unit_message is not null");
            return (Criteria) this;
        }

        public Criteria andUnitMessageEqualTo(Float value) {
            addCriterion("unit_message =", value, "unitMessage");
            return (Criteria) this;
        }

        public Criteria andUnitMessageNotEqualTo(Float value) {
            addCriterion("unit_message <>", value, "unitMessage");
            return (Criteria) this;
        }

        public Criteria andUnitMessageGreaterThan(Float value) {
            addCriterion("unit_message >", value, "unitMessage");
            return (Criteria) this;
        }

        public Criteria andUnitMessageGreaterThanOrEqualTo(Float value) {
            addCriterion("unit_message >=", value, "unitMessage");
            return (Criteria) this;
        }

        public Criteria andUnitMessageLessThan(Float value) {
            addCriterion("unit_message <", value, "unitMessage");
            return (Criteria) this;
        }

        public Criteria andUnitMessageLessThanOrEqualTo(Float value) {
            addCriterion("unit_message <=", value, "unitMessage");
            return (Criteria) this;
        }

        public Criteria andUnitMessageIn(List<Float> values) {
            addCriterion("unit_message in", values, "unitMessage");
            return (Criteria) this;
        }

        public Criteria andUnitMessageNotIn(List<Float> values) {
            addCriterion("unit_message not in", values, "unitMessage");
            return (Criteria) this;
        }

        public Criteria andUnitMessageBetween(Float value1, Float value2) {
            addCriterion("unit_message between", value1, value2, "unitMessage");
            return (Criteria) this;
        }

        public Criteria andUnitMessageNotBetween(Float value1, Float value2) {
            addCriterion("unit_message not between", value1, value2, "unitMessage");
            return (Criteria) this;
        }

        public Criteria andUnitDateTrafficIsNull() {
            addCriterion("unit_date_traffic is null");
            return (Criteria) this;
        }

        public Criteria andUnitDateTrafficIsNotNull() {
            addCriterion("unit_date_traffic is not null");
            return (Criteria) this;
        }

        public Criteria andUnitDateTrafficEqualTo(Float value) {
            addCriterion("unit_date_traffic =", value, "unitDateTraffic");
            return (Criteria) this;
        }

        public Criteria andUnitDateTrafficNotEqualTo(Float value) {
            addCriterion("unit_date_traffic <>", value, "unitDateTraffic");
            return (Criteria) this;
        }

        public Criteria andUnitDateTrafficGreaterThan(Float value) {
            addCriterion("unit_date_traffic >", value, "unitDateTraffic");
            return (Criteria) this;
        }

        public Criteria andUnitDateTrafficGreaterThanOrEqualTo(Float value) {
            addCriterion("unit_date_traffic >=", value, "unitDateTraffic");
            return (Criteria) this;
        }

        public Criteria andUnitDateTrafficLessThan(Float value) {
            addCriterion("unit_date_traffic <", value, "unitDateTraffic");
            return (Criteria) this;
        }

        public Criteria andUnitDateTrafficLessThanOrEqualTo(Float value) {
            addCriterion("unit_date_traffic <=", value, "unitDateTraffic");
            return (Criteria) this;
        }

        public Criteria andUnitDateTrafficIn(List<Float> values) {
            addCriterion("unit_date_traffic in", values, "unitDateTraffic");
            return (Criteria) this;
        }

        public Criteria andUnitDateTrafficNotIn(List<Float> values) {
            addCriterion("unit_date_traffic not in", values, "unitDateTraffic");
            return (Criteria) this;
        }

        public Criteria andUnitDateTrafficBetween(Float value1, Float value2) {
            addCriterion("unit_date_traffic between", value1, value2, "unitDateTraffic");
            return (Criteria) this;
        }

        public Criteria andUnitDateTrafficNotBetween(Float value1, Float value2) {
            addCriterion("unit_date_traffic not between", value1, value2, "unitDateTraffic");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Float value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Float value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Float value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Float value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Float value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Float> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Float> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Float value1, Float value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Float value1, Float value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
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