package com.jiaoyu.teacher.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.SolrDataQuery;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jiaoyu.pojo.Ke;
import com.jiaoyu.teacher.service.KeService;

@RestController
@RequestMapping("/solr")
public class SolrInputUtil {
	
	@Autowired
	private SolrTemplate solrTemplate;
	
	
	@Reference
	private KeService keService;
	
	/**
	 * 导入课程数据
	 */
	
	@RequestMapping("/import")
	public void importKeData() {
		List<Ke> list = keService.findAll();
		System.out.println(list);
		solrTemplate.saveBeans(list);
		solrTemplate.commit();
		System.out.println("==导入成功==");
	}
	

	@RequestMapping("/deleteKeSolr")
	public void deleteKeSolr() {
		SolrDataQuery query=new SimpleQuery("*:*");
		solrTemplate.delete(query);
		solrTemplate.commit();
	}
}
