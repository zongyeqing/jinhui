package com.jinhui.vo;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Result {
	 private static final ObjectMapper MAPPER = new ObjectMapper();

	    // 响应业务状态
	    private Integer status;

	    // 响应消息
	    private String msg;

	    // 响应中的数据
	    private Object data;

	    public static Result build(Integer status, String msg, Object data) {
	        return new Result(status, msg, data);
	    }
	    
	    public Result(Integer status, String msg, Object data) {
	        this.status = status;
	        this.msg = msg;
	        this.data = data;
	    }

	    public Result(Object data) {
	        this.status = 200;
	        this.msg = "OK";
	        this.data = data;
	    }

	    public static Result ok(Object data) {
	        return new Result(data);
	    }

	    public static Result ok() {
	        return new Result(null);
	    }

	    public Result() {

	    }
	    
	    
	    public static Result formatToPojo(String jsonData, Class<?> clazz) {
	        try {
	            if (clazz == null) {
	                return MAPPER.readValue(jsonData, Result.class);
	            }
	            JsonNode jsonNode = MAPPER.readTree(jsonData);
	            JsonNode data = jsonNode.get("data");
	            Object obj = null;
	            if (clazz != null) {
	                if (data.isObject()) {
	                    obj = MAPPER.readValue(data.traverse(), clazz);
	                } else if (data.isTextual()) {
	                    obj = MAPPER.readValue(data.asText(), clazz);
	                }
	            }
	            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
	        } catch (Exception e) {
	            return null;
	        }
	    }

	    /**
	     * 没有object对象的转化
	     * 
	     * @param json
	     * @return
	     */
	    public static Result format(String json) {
	        try {
	            return MAPPER.readValue(json, Result.class);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
	    }

	    /**
	     * Object是集合转化
	     * 
	     * @param jsonData json数据
	     * @param clazz 集合中的类型
	     * @return
	     */
	    public static Result formatToList(String jsonData, Class<?> clazz) {
	        try {
	            JsonNode jsonNode = MAPPER.readTree(jsonData);
	            JsonNode data = jsonNode.get("data");
	            Object obj = null;
	            if (data.isArray() && data.size() > 0) {
	                obj = MAPPER.readValue(data.traverse(),
	                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
	            }
	            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
	        } catch (Exception e) {
	            return null;
	        }
	    }
}
