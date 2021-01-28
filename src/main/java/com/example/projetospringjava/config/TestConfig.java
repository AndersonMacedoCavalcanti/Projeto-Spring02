package com.example.projetospringjava.config;

import com.example.projetospringjava.entities.Category;
import com.example.projetospringjava.entities.Order;
import com.example.projetospringjava.entities.User;
import com.example.projetospringjava.entities.enus.OrderStatus;
import com.example.projetospringjava.repositories.CategoryRepository;
import com.example.projetospringjava.repositories.OrderRepository;
import com.example.projetospringjava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile({"test"})
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;



    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Maria Brown","Maria@gmail.com","988888888","123456");
        User u2 = new User(null,"Alex Green","Alex@gmail.com","977777777","123456");

                                                           //ISO 8601
        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.WAITING_PAYMENT, u1);

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");


        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
    }


}
