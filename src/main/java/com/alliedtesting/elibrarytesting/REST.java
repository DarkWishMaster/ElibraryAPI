package com.alliedtesting.elibrarytesting;

import java.util.ArrayList;
import java.util.List;

/* TODO:
 * 		- regroup methods to separate classes 
 */

public class REST {
	
	/** Book Resource **/
	/*******************/
	
	/* GET-  http://{host}/elibraryws/books/{bookId} */
	public Book getBook(int id){
		
		Book book = new Book();
		// ...
		return book;
	}
	
	/* POST - http://{host}/elibraryws/books */
	public void createBook(Book book){
		// ...
	}
	
	/* PUT - http://{host}/elibraryws/books/{bookId} */
	public void updateBook(int id, Book book){
		// ...
	}
	
	/* DELETE - http://{host}/elibraryws/books/{bookId} */
	public void removeBook(int id){
		// ...
	}
	
	/* POST - http://{host}/elibraryws/books/get-filtered-data-count */
	public int getBooksCount(String filter){
		
		int count = 0;
		// ...
		return count;
	}
	
	/* POST - http://{host}/elibraryws/books/get-data/{offset}/{limit}/{sort_by}/{sort_dir} */
	public List<Book> getBooks(String filter, int offset, int limit,
			String sort_by, String sort_dir){
		
		List<Book> books = new ArrayList<Book>();
		// ...
		return books;
	}

	
	/** Author Resource **/
	/*********************/
	
	/* GET - http://{host}/elibraryws/authors/{authorId} */
	public Author getAuthor(int id){
		
		Author author = new Author();
		// ...
		return author;
	}
	
	/* GET - http://{host}/elibraryws/authors/count */
	public int getAuthorsCount(){
		
		int count  = 0;
		// ...
		return count;
	}
	
	/* GET - http://{host}/elibraryws/authors */
	public List<Author> getAuthors(){
		
		List<Author> authors = new ArrayList<Author>();
		// ...
		return authors;
	}
	
	/* DELETE - http://localhost:8080/elibraryws/authors/{authorId} */
	public void removeAuthor(int id){
		// ...
	}
	
	/* POST - http://localhost:8080/elibraryws/authors */
	public void createAuthor(Author author){
		// ...
	}
	
	/* PUT-http://localhost:8080/elibraryws/authors */
	public void updateAuthor(int id, Author author){
		// ...
	}
	

	/** Category Resource **/
	/***********************/
	
	/* GET - http://{host}/elibraryws/categories/{categoryId} */
	public Category getCategory(int id){
		
		Category category = new Category();
		// ...
		return category;
	}
	
	/* GET - http://{host}/elibraryws/categories/count */
	public int getCategoriesCount(){
		
		int count = 0;
		// ...
		return count;
	}
	
	/* GET - http://{host}/elibraryws/categories */
	public List<Category> getCategories(){
		
		List<Category> categories = new ArrayList<Category>();
		// ...
		return categories;
	}
	
	/* DELETE - http://localhost:8080/elibraryws/categories/{categoryId} */
	public void removeCategory(int id){
		// ...
	}
	
	/* POST - http://localhost:8080/elibraryws/categories */
	public void createCategory(Category category){
		// ...
	}
	
	/* PUT-http://localhost:8080/elibraryws/categories */
	public void updateCategory(int id, Category category){
		// ...
	}
	
	/** User Role Resource **/
	/************************/
	
	/* GET - http://{host}/elibraryws/roles/{roleId} */
	public UserRole getUserRole(int id){
		
		UserRole userRole = new UserRole();
		// ...
		return userRole;
	}
	
	/* GET - http://{host}/elibraryws/roles/count */
	public int getUserRolesCount(){
		int count = 0;
		// ...
		return count;
	}
	
	/* GET - http://{host}/elibraryws/roles */
	public List<UserRole> getUserRoles(){
		
		List<UserRole> userRoles = new ArrayList<UserRole>();
		// ...
		return userRoles;
	}
	
	/* DELETE - http://localhost:8080/elibraryws/roles/{roleId} */
	public void removeUserRole(int id){
		// ...
	}
	
	/* POST - http://localhost:8080/elibraryws/roles */
	public void createUserRole(UserRole userRole){
		// ...
	}
	
	/* PUT-http: //localhost:8080/elibraryws/roles */
	public void updateUserRoles(int id, UserRole userRole){
		// ...
	}
	
	/** Book Request Resource **/
	/***************************/
	
	/* GET- http://{host}/elibraryws/ book-requests/{bookRequestId} */
	public BookRequest getBookRequest(){
		
		BookRequest bookRequest = new BookRequest();
		// ...
		return bookRequest;
	}
	
	/* POST - http://{host}/elibraryws/book-requests */
	public void createBookRequest(BookRequest bookRequest){
		//...
	}
	
	/* PUT - http://{host}/elibraryws/book-requests/{bookRequestId} */
	public void updateBookRequest(int id, BookRequest bookRequest){
		//...		
	}
	
	/* DELETE - http://{host}/elibraryws/book-requests/{bookRequestId} */
	public void removeBookRequest(int id){
		//...
	}
	
	/* POST - http://{host}/elibraryws/book-requests/get-filtered-data-count */
	public int getBookRequestsCount(String filter){
		
		int count = 0;
		// ...
		return count;
	}
	
	/* POST - http://{host}/elibraryws/book-requests/get-data/{offset}/{limit}/{sort_by}/{sort_dir} */
	public List<BookRequest> getBookRequests(String filter, int offset, int limit, 
			String sort_by, String sort_dir){
		
		List<BookRequest> bookRequests = new ArrayList<BookRequest>();
		// ...
		return bookRequests;
	}

	/** Log Request Resource **/
	/**************************/

	/* POST - http://{host}/elibraryws/logs/get-filtered-data-count */
	public int getLogsCount(){

		int count = 0;
		// ...
		return count;
	}
	
	/* POST - http://{host}/elibraryws/logs/get-data/{offset}/{limit}/{sort_by}/{sort_dir} */
	public List<LogRequest> getLogs(String filter, int offset, int limit, 
			String sort_by, String sort_dir){

		List<LogRequest> logRequests = new ArrayList<LogRequest>();
		// ...
		return logRequests;
	}
	
	/** Registration Request Resource **/
	/***********************************/

	/* GET- http://{host}/elibraryws/ registration/{registrationRequestId} */
	public RegistrationRequest getRegistrationRequest(int id){
		
		RegistrationRequest registrationRequest = new RegistrationRequest();
		// ...
		return registrationRequest;
	}
	
	/* POST - http://{host}/elibraryws/registration */
	public void createRegistrationRequest(RegistrationRequest request){
		// ...
	}
	
	/* DELETE - http://{host}/elibraryws/registration/{registrationRequestId} */
	public void removeRegistrationRequest(RegistrationRequest request){
		// ...
	}
	
	/* PUT - http://{host}/elibraryws/registration */
	public void updateRegistrationRequest(RegistrationRequest request){
		// ...
	}
	
	/* GET - http://{host}/elibraryws/registration/get-data-count */
	public int  getRegistrationRequestsCount(){
		
		int count = 0;
		// ...
		return count;
	}
	
	/* GET - http://{host}/elibraryws/regsitration/get-data/{offset}/{limit}/{sort_by}/{sort_dir} */
	public List<RegistrationRequest> getRegistratinRequests(int offset, int limit, 
			String sort_by, String sort_dir){

		List<RegistrationRequest> registrationRequests = new ArrayList<RegistrationRequest>();
		// ...
		return registrationRequests;
	}
	
	/* GET - http://{host}/elibraryws/registration/register/{registrationRequestId} */
	public void approveRegistrationRequest(int id){
		// ...
	}
	
	/* GET - http://{host}/elibraryws/registration/decline/{registrationRequestId} */
	public void declineRegistrationRequest(int id){
		// ...
	}
	
	/** User Resource **/
	/*******************/
	/*  GET- http://{host}/elibraryws/ users/{userId} */
	public User getUser(int id){
		
		User user = new User();
		// ...
		return user;
	}

	/* GET- http://{host}/elibraryws/ users/login/{username} */
	public User getUser(String login){
		
		User user = new User();
		// ...
		return user;
	}

	/* POST - http://{host}/elibraryws/users */
	public void createUser(User user){
		// ...
	}

	/* DELETE - http://{host}/elibraryws/users/{userId} */
	public void removeUser(int id){
		// ...
	}

	/* PUT - http://{host}/elibraryws/users */
	public void updateUser(int id, User user){
		// ...
	}

	/* GET - http://{host}/elibraryws/users/get-filtered-data-count  */
	public int getUsersCount(){
		
		int count = 0;
		//...
		return count;
	}

	/* GET - http://{host}/elibraryws/users/get-data/{offset}/{limit}/{sort_by}/{sort_dir} */
	public List<User> getUsers(String filter, int offset, int limit, 
			String sort_by, String sort_dir){

		List<User> users = new ArrayList<User>();
		// ...
		return users;
	}
	
	
	
	

}
