package com.huy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.huy.entity.Product;
import com.huy.service.ProductService;
import com.huy.service.SessionService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@Autowired
	SessionService session;
	
	@RequestMapping("/product/detail/{id}")
	public String productdetail(Model model, @PathVariable("id") Integer id) {
		Product item = productService.findById(id);
		model.addAttribute("item", item);
		Pageable pageable = PageRequest.of(0, 4);
		Page<Product> list = productService.findAllBy(pageable);
		model.addAttribute("items", list);		
		return "product/detail";
	}
	@RequestMapping("/home/product")
	public String home(Model model, @RequestParam("cid") Optional<String> cid) {
		if(cid.isPresent()) {
			List<Product> list = productService.findByCategoryId(cid.get());
			model.addAttribute("items", list);
		}else {			
			List<Product> list = productService.fillAll();
			model.addAttribute("items", list);
		}
		Pageable pageable = PageRequest.of(0, 3);
		Page<Product> list1 = productService.findAllBy(pageable);
		model.addAttribute("items1", list1);
		
		Pageable pageable2 = PageRequest.of(3, 3);
		Page<Product> list2 = productService.findAllBy(pageable2);
		model.addAttribute("items2", list2);
		
		Pageable pageable3 = PageRequest.of(6, 3);
		Page<Product> list3 = productService.findAllBy(pageable3);
		model.addAttribute("items3", list3);
		
		Pageable pageable4 = PageRequest.of(9, 3);
		Page<Product> list4 = productService.findAllBy(pageable4);
		model.addAttribute("items4", list4);
		
		Pageable pageable5 = PageRequest.of(12, 3);
		Page<Product> list5 = productService.findAllBy(pageable5);
		model.addAttribute("items5", list5);
		
		Pageable pageable6 = PageRequest.of(15, 3);
		Page<Product> list6 = productService.findAllBy(pageable6);
		model.addAttribute("items6", list6);
		return "product/product";
	}
}
