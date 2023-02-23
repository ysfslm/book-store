package com.yit.bookstore;

import com.yit.bookstore.model.Book;
import com.yit.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {

	private final BookRepository bookRepository;

	public BookStoreApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {

		SpringApplication.run(BookStoreApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		Book book1 = Book.builder()
				.name("Türk İnkılabına Bakışlar")
				.author("Peyami Safa")
				.price(10.0)
				.stock(10)
				.build();

		Book book2 = Book.builder()
				.name("Safahat")
				.author("Mehmet Akif Ersoy")
				.price(15.0)
				.stock(10)
				.build();

		Book book3 = Book.builder()
				.name("Üç Zor Mesele")
				.author("İsmet Özel")
				.price(21.2)
				.stock(10)
				.build();

		Book book4 = Book.builder()
				.name("Beş Şehir")
				.author("Ahmet Hamdi Tanpınar")
				.price(21.2)
				.stock(10)
				.build();

		bookRepository.saveAll((Arrays.asList(book1,book2,book3, book4)));
	}
}
