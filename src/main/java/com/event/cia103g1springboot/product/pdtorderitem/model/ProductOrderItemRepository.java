package com.event.cia103g1springboot.product.pdtorderitem.model;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderItemRepository extends JpaRepository<ProductOrderItemVO, PdtOrderPK> {

	// ● (自訂)條件查詢
	//	@Query(value = "from ProductOrderItem where memId=?1")
	//	List<ProductOrderVO> findByMemId(int memId);
	
	//根據 pdtOrderId 查詢所有相關項目
	List<ProductOrderItemVO> findByPdtOrderId(Integer pdtOrderId);
}