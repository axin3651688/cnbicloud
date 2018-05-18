package com.cnbicloud.dao;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
/**
 * spring data jpa 错误 Not an managed type: class java.lang.Object   添加注解 @NoRepositoryBean
 * @company 中国经邦
 * @author 龚佳新  JpaSpecificationExecutor  用来做负责查询的接口
 * @Time 2016年3月27日 下午2:49:05
 * @param <T>  实体类
 * @param <ID>  主键类型
 */
@NoRepositoryBean
public interface CnbiJpaRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID>,JpaSpecificationExecutor<T>{
	
	
	
	List<T> findAll();

	List<T> findAll(Sort sort);

	<S extends T> List<S> save(Iterable<S> entities);

	void flush();

	T saveAndFlush(T entity);

	void deleteInBatch(Iterable<T> entities);

	void deleteAllInBatch();	
	
	/**
	 *  不分页按条件查询 
	 * @param spec
	 * @return
	 */
	List<T> findAll(Specification<T> spec);   
}
/**
 *  http://uule.iteye.com/blog/2084512
 *  主要来看看Spring Data JPA提供的接口，也是Spring Data JPA的核心概念：
 *	1：Repository：最顶层的接口，是一个空的接口，目的是为了统一所有Repository的类型，且能让组件扫描的时候自动识别。
 *	2：CrudRepository ：是Repository的子接口，提供CRUD的功能
 *	3：PagingAndSortingRepository：是CrudRepository的子接口，添加分页和排序的功能
 *	4：JpaRepository：是PagingAndSortingRepository的子接口，增加了一些实用的功能，比如：批量操作等。
 *	5：JpaSpecificationExecutor：用来做负责查询的接口   JpaSpecificationExecutor
 *	6：Specification：是Spring Data JPA提供的一个查询规范，要做复杂的查询，只需围绕这个规范来设置查询条件即可
*/