package wms.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import wms.dto.ProductDTO;
import wms.dto.inoutDTO;
import wms.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	
	// 제품조회 가져오기 합계 가져오기
	@GetMapping("/product")
	public String productList(Model model) {
	    List<ProductDTO> list = service.getProductList();
	    Map<String, Integer> map = service.getProductSum();
	    model.addAttribute("list", list);
	    model.addAttribute("totalIn", map.get("totalIn"));
		model.addAttribute("totalOut", map.get("totalOut"));
	    return "product";
	}
	
	// 입출고등록 품 보여주기
	@GetMapping("/stock")
	public String stock() {
		return "stock";
	}
	
	// 인설트 시킨다음에 표 볼 수 있게끔 리다이렉트
	@PostMapping("/stock")
	public String stockWrite(inoutDTO dto) {
		service.stockWrite(dto);
		return "redirect:/history";
	}
	
	// 입출고내역조희 한것 갖고오기
	@GetMapping("/history")
	public String history(Model model) {
	    List<inoutDTO> list = service.getHistoryList();
	    model.addAttribute("history", list);
	    return "history";
	}
	
	// 프로핏 매핑만 시켜줬음 일단
	@GetMapping("/profit")
	public String profit(Model model) {
		return "profit";
	}
	
}
