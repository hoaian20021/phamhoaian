package phamhoaian.lab3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import phamhoaian.lab3.entity.Book;
import phamhoaian.lab3.services.BookService;
import phamhoaian.lab3.services.CategoryService;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String showAllBooks(Model model){

        List<Book>books=bookService.getAllBooks();
        model.addAttribute("books",books);
        return "book/list";
    }

   // @GetMapping("/add")
    //public String addBooksForm (Model model){

    //}
}