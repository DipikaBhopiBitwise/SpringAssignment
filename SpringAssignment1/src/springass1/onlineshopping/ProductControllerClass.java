package springass1.onlineshopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductControllerClass {

	@RequestMapping(value = "/Home", method = RequestMethod.GET)
	public String init(Model model) {
		ProductListClass p1 = new ProductListClass();
		List<ProductDetailsClass> itemlist = p1.getProductlist();
		model.addAttribute("ItemList", itemlist);
		model.addAttribute("product", new Product());
		// model.addAttribute("ItemList", ProductListClass);

		return "Home";

	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("product") Product product) {
		//System.out.println("In POST");
		//List<String> selectedlist = product.getProductName();
//		for(String temp : product.getProductName()) {
//			System.out.println(temp);
//		}
		ProductListClass p4 = new ProductListClass();
		ProductDetailsClass p5=new ProductDetailsClass();
		
		String[] p2=product.getProductName();
		List<ProductDetailsClass> itemlist1 = p4.getProductlist();
		System.out.println(itemlist1);
		List<ProductDetailsClass> itemlist2 = new ArrayList<ProductDetailsClass>();
		for(ProductDetailsClass str : itemlist1)		
		{System.out.println(p2.length);
		for(int i=0;i<product.getStringLength();i++)
		{     System.out.println(p2[i]);
		System.out.println(itemlist1.get(i).getProductname());
			if(p2[i].equals(str.getProductname()))
			{
				
				itemlist2.add(str);
				System.out.println(itemlist2);
			}
		}
		

		

	}
		model.addAttribute("selected", itemlist2);
		return "Selected";

}}

// @RequestMapping(value = "/prouctlistnames", method = RequestMethod.GET)
// public String init(Model model)
// { ProductListClass prodlist =new ProductListClass();
// String items =null;
// int x=items.length();
// prodlist.add();
// HashMap<String,Object> itemslist = prodlist.getList();
// for(String i : itemslist.keySet())
// { for(int y=0;y<=x;y++)
// {
//
// }
//
// }
// return "Home";
// }
