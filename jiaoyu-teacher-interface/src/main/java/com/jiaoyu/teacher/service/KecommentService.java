package com.jiaoyu.teacher.service;
import java.util.List;
import com.jiaoyu.pojo.Kecomment;

import entity.PageResult;
/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface KecommentService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<Kecomment> findAll();
	
	
	
	public PageResult findListByKeId(Integer keid, int pageNum, int pageSize);
	
	/**
	 * 返回分页列表
	 * @return
	 */
	public PageResult findPage(int pageNum,int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(Kecomment kecomment);
	
	
	/**
	 * 修改
	 */
	public void update(Kecomment kecomment);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public Kecomment findOne(Integer id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer [] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	public PageResult findPage(Kecomment kecomment, int pageNum,int pageSize);
	
}
