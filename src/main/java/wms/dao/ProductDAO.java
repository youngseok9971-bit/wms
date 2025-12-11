package wms.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.dao.DataAccessException;

import wms.dto.ProductDTO;
import wms.dto.inoutDTO;

@Mapper
public interface ProductDAO {
	
	// 값 가져오는 dao
	@Select("select * from product_tbl")
	public List<ProductDTO> selectProduct() throws DataAccessException;
	
	// 매입단가 출고단가 합계 구하는 dao
	@Select("select sum(product_incost) as totalIn, sum(product_outcost) as totalOut from product_tbl")
	public Map<String, Integer> selectSum() throws DataAccessException;
	
	// 입출고등록 인설트 dao
	@Insert("insert into inout_tbl (t_no, product_code, t_type, t_count, t_date, company_code) " +
	        "values (#{t_no}, #{product_code}, #{t_type}, #{t_count}, #{t_date}, #{company_code})")
	public int insertStock(inoutDTO dto) throws DataAccessException;
	
	// 조인시켜서 제품코드에 맞게끔 제품명도 가져와서 제품조회 할 수 있도록 하는 dao
	@Select("select inout_tbl.t_no, " +
	        "inout_tbl.product_code, " +
	        "product_tbl.product_name, " +
	        "inout_tbl.t_type, " +
	        "inout_tbl.t_count, " +
	        "inout_tbl.t_date, " +
	        "inout_tbl.company_code " +
	        "from inout_tbl " +
	        "join product_tbl on inout_tbl.product_code = product_tbl.product_code")
	public List<inoutDTO> selectHistory() throws DataAccessException;
	
	
	

	
	
}
