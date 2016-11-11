package models;

import java.util.*;
import javax.persistence.*;

import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@Entity
public class Product extends Model{

	@Id
	private Long id;
	@Constraints.Required
	private String name;
	@Constraints.Required
	private String description;
	@Constraints.Required
	private int stock;
	@Constraints.Required
	private double price;

	public Product(){
	}

	public Product(Long idIn, String nIn, String dIn, int sIn, double pIn){
		id = idIn;
		name = nIn;
		description = dIn;
		stock = sIn;
		price = pIn;
	}

	public static Finder<Long,Product> find = new Finder<Long,Product>(Product.class);

	public static List<Product> findAll(){
		return Product.find.all();
	}

	public Long getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public String getDescription(){
		return description;	
	}

	public int getStock(){
		return stock;
	}

	public double getPrice(){
		return price;
	}

	public void setId(Long idIn){
		id = idIn;
	}

	public void setName(String nIn){
		name = nIn;
	}

	public void setDescription(String dIn){
		description = dIn;
	}

	public void setStock(int sIn){
		stock = sIn;
	}

	public void setPrice(double pIn){
		price = pIn;
	}

}
