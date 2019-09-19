package com.demo.frankxu.product.dao;

import com.demo.frankxu.product.entity.CustInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PrdInfoDao extends JpaRepository<CustInfo,Long>, JpaSpecificationExecutor<CustInfo> {

    @Query(value = "select a.* from prd_info a left join main_prd_rel b on a.id=b.main_prid_id where b.main_prid_id=?1 "
            , nativeQuery = true)
    List<CustInfo> getListByMprdId(long mPrdId);


}
