package wms.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wms.dao.ProductDAO;
import wms.dto.ProductDTO;
import wms.dto.inoutDTO;

@Service
public class ProductService {
	@Autowired
	private ProductDAO dao;
	
	// 값 가져오기 연결
	public List<ProductDTO> getProductList(){
		return dao.selectProduct();
	}
	
	// 합계 가져오기 연결
	public Map<String, Integer> getProductSum(){
		return dao.selectSum();
	}
	
	// 입출고등록폼에서 입력한거 인설트 연결
	public int stockWrite(inoutDTO dto) {
		return dao.insertStock(dto);
	}
	
	// 입출고내역조회 셀렉트 연결
	public List<inoutDTO> getHistoryList(){
		return dao.selectHistory();
	}
	

}
