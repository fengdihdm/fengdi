/**
 * 
 */
package com.fengdi.pojo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import javax.validation.constraints.NotNull;

import com.alibaba.fastjson.JSON;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author hdm
 * @description ָ������
 * @Date 2023��2��2��
 */
@Getter
@Setter
public class Metrics {
	@NotNull
	private String metrics;
	private LinkedHashMap<String, String> labels = new LinkedHashMap<String, String>();
	private float value;

	/**
	 * 
	 * @Decription ���췽��
	 * @Date 2023��2��2��
	 * @param name
	 * @param value
	 */
	public Metrics(String name, float value) {
		this.metrics = name;
		this.value = value;
	}

	/**
	 * 
	 * @Decription ���ñ�ǩ
	 * @Date 2023��2��2��
	 * @param key
	 * @param value
	 * @return
	 */
	public LinkedHashMap<String, String> setLabels(String key, String value) {
		this.labels.put(key, value);
		return this.labels;
	}

	/**
	 * ת����ָ����ʽ
	 */
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(metrics);
		if (labels != null && labels.size() > 0) {
			buffer.append("{");
			Iterator<Entry<String, String>> iterator = labels.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry<String, String> next = iterator.next();
				buffer.append(next.getKey()).append("=").append("\"").append(next.getValue()).append("\"").append(",");
			}
			buffer.delete(buffer.length() - 1, buffer.length());
			buffer.append("}");
		}
		buffer.append(" ").append(value);
		return buffer.toString();
	}
}
