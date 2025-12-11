package wms.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class inoutDTO {
	private int t_no;
	private String product_code;
	private String product_name;
	private String t_type;
	private int t_count;
	private String t_date;
	private String company_code;
	
	public int getT_no() {
		return t_no;
	}
	public void setT_no(int t_no) {
		this.t_no = t_no;
	}
	public String getProduct_code() {
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getT_type() {
		return t_type;
	}
	public void setT_type(String t_type) {
		this.t_type = t_type;
	}
	public int getT_count() {
		return t_count;
	}
	public void setT_count(int t_count) {
		this.t_count = t_count;
	}
	public String getT_date() {
		return t_date;
	}
	public void setT_date(String t_date) {
		this.t_date = t_date;
	}
	public String getCompany_code() {
		return company_code;
	}
	public void setCompany_code(String company_code) {
		this.company_code = company_code;
	}
	
	
}
