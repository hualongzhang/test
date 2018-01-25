package com.example.demo.repository.datasourcetwo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.two.TblFushuLog;





public interface FushuLogRepo extends CrudRepository<TblFushuLog, Serializable>{

	@Query("select t FROM TblFushuLog t where t.appNo = :appNo and t.txtType= :txtType order by t.crtTime DESC")
	List<TblFushuLog> findByAppNo(@Param("appNo") String appNo,@Param("txtType") String txtType);
	
	@Query("select t FROM TblFushuLog t where t.openId = :openId and t.txtType= :txtType order by t.crtTime DESC ")
	List<TblFushuLog> findByOpenId(@Param("openId") String openId,@Param("txtType") String txtType);
	
	@Modifying
	@Query("update TblFushuLog u set u.taskId = ?1,u.txtStatus= ?2,u.txtResponse= ?3"
			+ " where u.txtNo = ?4 ")
	int updateFushuLog(@Param("taskId")String taskId,@Param("txtStatus")String txtStatus,
			@Param("txtResponse")String txtResponse,@Param("txtNo")String txtNo);
	
}
