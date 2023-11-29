package com.fastspring.pizza;
import java.math.BigDecimal;
import com.fastspring.pizza.data.repositories.PizzaRepository;
import com.fastspring.pizza.data.repositories.ToppingRepository;
import com.fastspring.pizza.data.entities.Pizza;
import com.fastspring.pizza.data.entities.Topping;
import lombok.Data;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.PropertyAccessor.FIELD;
import java.io.FileInputStream;
import org.springframework.beans.factory.annotation.Value;
import java.util.List;
import java.io.IOException;
import com.fastspring.pizza.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Autowired
    private UserService userService;
    
    @Autowired
    private PizzaRepository pizzaRepository;
    
    @Autowired
    private ToppingRepository toppingRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
    public void run(String... args) throws Exception {
        fillUsers();
        fillPizzas();
        fillToppings();
    }
    
    private void fillUsers() {
        this.userService.signupAdmin("admin", "admin@fastpizza.com", "admin");
    }
    
    private void fillPizzas() {
        this.pizzaRepository.save(new Pizza(
            null,
            "Margherita",
            "https://static.vecteezy.com/system/resources/previews/022/478/733/original/pizza-margherita-and-beer-ai-transparent-png.png",
            "Classic pizza with tomato sauce, mozzarella cheese, fresh basil, salt, and extra-virgin olive oil.",
            new BigDecimal(8.99)
        ));
    
        this.pizzaRepository.save(new Pizza(
            null,
            "Pepperoni",
            "https://static.vecteezy.com/system/resources/previews/023/742/417/non_2x/pepperoni-pizza-isolated-illustration-ai-generative-free-png.png",
            "A popular pizza topped with pepperoni, mozzarella cheese, and tomato sauce.",
            new BigDecimal(9.82)
        ));
        
        this.pizzaRepository.save(new Pizza(
            null,
            "Hawaiian",
            "https://w7.pngwing.com/pngs/2/723/png-transparent-california-style-pizza-sicilian-pizza-hawaiian-pizza-neapolitan-pizza-pizza-food-recipe-cheese.png",
            "A sweet and savory combination of tomato sauce, cheese, ham, and pineapple.",
            new BigDecimal(10.99)
        ));
        
        this.pizzaRepository.save(new Pizza(
            null,
            "Veggie",
            "https://w7.pngwing.com/pngs/659/478/png-transparent-pizza-italian-cuisine-restaurant-delivery-pure-veg-food-recipe-cheese.png",
            "A healthy choice loaded with bell peppers, onions, mushrooms, tomatoes, and olives on a tomato sauce base.",
            new BigDecimal(9.49)
        ));
        
        this.pizzaRepository.save(new Pizza(
            null,
            "Meat Lovers",
            "https://napolipizzalv.com/wp-content/uploads/2019/10/DSC_0956-min.png",
            "Hearty pizza with pepperoni, ham, sausage, bacon, and beef on a rich tomato sauce.",
            new BigDecimal(12.99)
        ));
        
        this.pizzaRepository.save(new Pizza(
            null, 
            "BBQ Chicken",
            "https://img.freepik.com/premium-photo/pizza-with-chicken-onions-it-flat-lay-shot_3146-4294.jpg",
            "Grilled chicken, barbecue sauce, red onions, and cilantro, topped with mozzarella and cheddar cheese.",
            new BigDecimal(11.49)
        ));
        
        this.pizzaRepository.save(new Pizza(
            null,
            "Buffalo Chicken",
            "https://w7.pngwing.com/pngs/675/302/png-transparent-pizza-buffalo-wing-tandoori-chicken-bread-restaurant-pizza.png",
            "Spicy buffalo sauce, chicken, red onions, and a blend of mozzarella and blue cheese.",
            new BigDecimal(11.49)
        ));
    
        this.pizzaRepository.save(new Pizza(
            null,
            "Four Cheese",
            "https://img.freepik.com/premium-photo/4-cheese-pizza-with-white-sauce-crispy-sides-isolated-white-background_207126-7195.jpg",
            "A cheese lover's delight with mozzarella, parmesan, feta, and gorgonzola cheese on a garlic-seasoned tomato sauce base.",
            new BigDecimal(10.49)
        ));
    
        this.pizzaRepository.save(new Pizza(
            null,
            "Supreme",
            "https://sawepecomcdn.blob.core.windows.net/ph-web-ordering/Pizza_Hut_PL/Zdjecia/Refresh_26.10.23/WWW/1.PIZZE/pizza_supreme_1000x1000.jpg",
            "Loaded with pepperoni, sausage, mushrooms, onions, bell peppers, and black olives on a tomato sauce base.",
            new BigDecimal(13.49)
        ));
    }
    
    private void fillToppings() {
        this.toppingRepository.save(new Topping(
            null,
            "Sausage",
            "Sausage Description",
            new BigDecimal(1)
        ));
        
        this.toppingRepository.save(new Topping(
            null,
            "Onions",
            "Onions Description",
            new BigDecimal(1.2)
        ));
        
        this.toppingRepository.save(new Topping(
            null,
            "Mushrooms",
            "Mushrooms Description",
            new BigDecimal(1.3)
        ));
        
        this.toppingRepository.save(new Topping(
            null,
            "Bacon",
            "Bacon Description",
            new BigDecimal(1.5)
        ));
        
        this.toppingRepository.save(new Topping(
            null,
            "Extra cheese",
            "Extra cheese Description",
            new BigDecimal(2)
        ));
        
        this.toppingRepository.save(new Topping(
            null,
            "Pineapple",
            "Pineapple Description",
            new BigDecimal(1.8)
        ));
        
        this.toppingRepository.save(new Topping(
            null,
            "Ham",
            "Ham Description",
            new BigDecimal(0.9)
        ));
    }
}
