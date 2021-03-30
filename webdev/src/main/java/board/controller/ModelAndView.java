package board.controller;

import java.util.HashMap;
import java.util.Map;

public class ModelAndView {
	private Map<String, Object> model = new HashMap<String, Object>();
	private String viewName;
	
	public ModelAndView() {} //디폴트 생성자

	public ModelAndView(String viewName) { //생성자 오버로딩
		setViewName(viewName);
	}
	public ModelAndView(String viewName, String key, Object obj) { //생성자 오버로딩
		setViewName(viewName);
		addObject(key, obj);
	}
	
	public Map<String, Object> getModel() {
		return model;
	}
	public void setModel(Map<String, Object> model) {
		this.model = model;
	}
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	public void addObject(String key, Object obj) { //model 맵에 key와 value로 저장
		model.put(key, obj);
		
	}
}
