function stockFormValidate(){
	const stockForm  = document.querySelector("#stockForm");
	
	const no = stockForm.t_no;
	const code = stockForm.product_code;
	const type = stockForm.querySelector('input[name="t_type"]:checked');
	const cnt = stockForm.t_count;
	const date = stockForm.t_date;
	const company = stockForm.company_code;
	
	if(no.value === ""){
		alert("입출고번호를 입력해주세요.");
		no.focus();
		return false;
	}
	
	if(code.value === ""){
		alert("제품코드를 입력해주세요.");
		code.focus();
		return false;
	}
	
	if(!type){
		alert("입고 출고 중 하나를 선택해주세요.");
		return false;
	}
		
	if(cnt.value === ""){
		alert("수량을 입력해주세요..");
		cnt.focus();
		return false;
	}
			
	if(date.value === ""){
		alert("거래일자를 입력해주세요.");
		date.focus();
		return false;
	}
	
	if(company.value === ""){
		alert("거래처를 선택해주세요.");
		return false;
	}
	
	return true;
	
}