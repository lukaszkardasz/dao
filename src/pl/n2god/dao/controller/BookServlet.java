package pl.n2god.dao.controller;

import pl.n2god.dao.dao.BookDao;
import pl.n2god.dao.model.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author n2god on 23/12/2019
 * @project dao
 */
@WebServlet(name = "BookServlet", urlPatterns = "/BookServlet")
public class BookServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String isbn = request.getParameter("isbn");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String option = request.getParameter("option");

		try {
			BookDao dao = new BookDao();
			Book book = null;
			String operation = null;
			if (option.equals("search")){
				book = dao.read(isbn);
				operation = "search";
			} else if(option.equals("add")){
				book = new Book(isbn, title, description);
				dao.create(book);
				operation = "add";
			} else if(option.equals("update")){
				book = new Book(isbn, title, description);
				dao.update(book);
				operation = "update";
			} else if (option.equals("delete")){
				book = new Book (isbn, title, description);
				dao.delete(book);
				operation = "delete";
			}
			request.setAttribute("option", operation);
			request.setAttribute("book", book);
			request.getRequestDispatcher("result.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}
}
