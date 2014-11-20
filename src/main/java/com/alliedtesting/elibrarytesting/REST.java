package com.alliedtesting.elibrarytesting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/* TODO:
 * 		- regroup methods to separate classes 
 */

public class REST {
	
	private static HttpClient httpclient = null;
	private static Gson   gson           = null;
	private static String host           = "81.180.75.144:8080";
	
	public REST() {

		if (httpclient == null) {
			
			httpclient     = HttpClientBuilder.create().build();
			
			GsonBuilder gb = new GsonBuilder();
			
			gb.setDateFormat("yyyy-MM-dd");
			gb.setPrettyPrinting();
			
			gson       = gb.create();
		}
	}
	
	private String getResponseData(HttpResponse response) throws Exception
	{
		BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
		return result.toString();
	}
	
	public void prettyPrint(Object  obj)
	{
		String json             = gson.toJson(obj);
		JsonParser jp           = new JsonParser();
		JsonElement je          = jp.parse(json);
		String prettyJsonString = gson.toJson(je);
		System.out.println(prettyJsonString);
	}



	/** Book Resource **/
	/*******************/
	
	/* GET-  http://{host}/elibraryws/books/{bookId} */
	public Book getBook(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/books/" + id;
		HttpGet request       = new HttpGet(url);
		HttpResponse response = httpclient.execute(request);
		
		return gson.fromJson(getResponseData(response), Book.class);
	}

	/* POST - http://{host}/elibraryws/books */
	public void createBook(Book book) throws Exception {
		
		/* Посмотрите тут пожалуйста */
		/*****************************/
		
		String url           = "http://" + host + "/elibraryws/books";
		HttpPost request     = new HttpPost(url);
		StringEntity payload = new StringEntity(gson.toJson(book));
		request.setEntity(payload);
		HttpResponse response = httpclient.execute(request);
		
		System.out.println(getResponseData(response));
	} 
	
	/* PUT - http://{host}/elibraryws/books/{bookId} */
	public void updateBook(int id, Book book) throws Exception {
		// ...
	}
	
	/* DELETE - http://{host}/elibraryws/books/{bookId} */
	public void removeBook(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/books/" + id;
		HttpDelete request    = new HttpDelete(url);
		HttpResponse response = httpclient.execute(request);
		
		System.out.println("Removing Book with id : " + id);
		System.out.println(getResponseData(response));
	}
	
	/* POST - http://{host}/elibraryws/books/get-filtered-data-count */
	public int getBooksCount(String filter) throws Exception {
		
		int count = 0;
		// ...
		return count;
	}
	
	/* POST - http://{host}/elibraryws/books/get-data/{offset}/{limit}/{sort_by}/{sort_dir} */
	public List<Book> getBooks(String filter, int offset, int limit,
			String sort_by, String sort_dir) throws Exception {
		
		List<Book> books = new ArrayList<Book>();
		// ...
		return books;
	}

	
	/** Author Resource **/
	/*********************/
	
	/* GET - http://{host}/elibraryws/authors/{authorId} */
	public Author getAuthor(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/authors/" + id;
		HttpGet request       = new HttpGet(url);
		HttpResponse response = httpclient.execute(request);
		
		return gson.fromJson(getResponseData(response), Author.class);
	}
	
	/* GET - http://{host}/elibraryws/authors/count */
	public int getAuthorsCount() throws Exception {
		
/* TODO: returns Error report */
		String url            = "http://" + host + "/elibraryws/count";
		HttpGet request       = new HttpGet(url);
		HttpResponse response = httpclient.execute(request);
		System.out.println(getResponseData(response));
		
		return 0;
		//return Integer.valueOf(getResponseData(response));
	}
	
	/* GET - http://{host}/elibraryws/authors */
	@SuppressWarnings("unchecked")
	public List<Author> getAuthors() throws Exception {
		
		String url            = "http://" + host + "/elibraryws/authors";
		HttpGet request       = new HttpGet(url);
		HttpResponse response = httpclient.execute(request);
		
		return gson.fromJson(getResponseData(response), List.class);
	}
	
	/* DELETE - http://localhost:8080/elibraryws/authors/{authorId} */
	public void removeAuthor(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/authors/" + id;
		HttpDelete request    = new HttpDelete(url);
		HttpResponse response = httpclient.execute(request);
		
		System.out.println("Removing Author with id : " + id);
		System.out.println(getResponseData(response));
	}
	
	/* POST - http://localhost:8080/elibraryws/authors */
	public void createAuthor(Author author) throws Exception {
		// ...
	}
	
	/* PUT-http://localhost:8080/elibraryws/authors */
	public void updateAuthor(int id, Author author) throws Exception {
		// ...
	}
	

	/** Category Resource **/
	/***********************/
	
	/* GET - http://{host}/elibraryws/categories/{categoryId} */
	public Category getCategory(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/categories/" + id;
		HttpGet request       = new HttpGet(url);
		HttpResponse response = httpclient.execute(request);
		
		return gson.fromJson(getResponseData(response), Category.class);
	}
	
	/* GET - http://{host}/elibraryws/categories/count */
	public int getCategoriesCount() throws Exception {
		
		int count = 0;
		// ...
		return count;
	}
	
	/* GET - http://{host}/elibraryws/categories */
	@SuppressWarnings("unchecked")
	public List<Category> getCategories() throws Exception {
		
		String url            = "http://" + host + "/elibraryws/categories";
		HttpGet request       = new HttpGet(url);
		HttpResponse response = httpclient.execute(request);
		
		return gson.fromJson(getResponseData(response), List.class);
	}
	
	/* DELETE - http://localhost:8080/elibraryws/categories/{categoryId} */
	public void removeCategory(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/categories/" + id;
		HttpDelete request    = new HttpDelete(url);
		HttpResponse response = httpclient.execute(request);
		
		System.out.println("Removing Category with id : " + id);
		System.out.println(getResponseData(response));
	}
	
	/* POST - http://localhost:8080/elibraryws/categories */
	public void createCategory(Category category) throws Exception {
		// ...
	}
	
	/* PUT-http://localhost:8080/elibraryws/categories */
	public void updateCategory(int id, Category category) throws Exception {
		// ...
	}
	
	/** User Role Resource **/
	/************************/
	
	/* GET - http://{host}/elibraryws/roles/{roleId} */
	public UserRole getUserRole(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/roles/" + id;
		HttpGet request       = new HttpGet(url);
		HttpResponse response = httpclient.execute(request);
		
		return gson.fromJson(getResponseData(response), UserRole.class);
	}
	
	/* GET - http://{host}/elibraryws/roles/count */
	public int getUserRolesCount() throws Exception {
		int count = 0;
		// ...
		return count;
	}
	
	/* GET - http://{host}/elibraryws/roles */
	@SuppressWarnings("unchecked")
	public List<UserRole> getUserRoles() throws Exception {
		
		String url            = "http://" + host + "/elibraryws/roles";
		HttpGet request       = new HttpGet(url);
		HttpResponse response = httpclient.execute(request);
		
		return gson.fromJson(getResponseData(response), List.class);
	}
	
	/* DELETE - http://localhost:8080/elibraryws/roles/{roleId} */
	public void removeUserRole(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/roles/" + id;
		HttpDelete request    = new HttpDelete(url);
		HttpResponse response = httpclient.execute(request);
		
		System.out.println("Removing UserRole with id : " + id);
		System.out.println(getResponseData(response));
	}
	
	/* POST - http://localhost:8080/elibraryws/roles */
	public void createUserRole(UserRole userRole) throws Exception {
		// ...
	}
	
	/* PUT-http: //localhost:8080/elibraryws/roles */
	public void updateUserRoles(int id, UserRole userRole) throws Exception {
		// ...
	}
	
	/** Book Request Resource **/
	/***************************/
	
	/* GET- http://{host}/elibraryws/ book-requests/{bookRequestId} */
	public BookRequest getBookRequest(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/book-requests/" + id;
		HttpGet request       = new HttpGet(url);
		HttpResponse response = httpclient.execute(request);
		
		return gson.fromJson(getResponseData(response), BookRequest.class);
	}
	
	/* POST - http://{host}/elibraryws/book-requests */
	public void createBookRequest(BookRequest bookRequest) throws Exception {
		//...
	}
	
	/* PUT - http://{host}/elibraryws/book-requests/{bookRequestId} */
	public void updateBookRequest(int id, BookRequest bookRequest) throws Exception {
		//...		
	}
	
	/* DELETE - http://{host}/elibraryws/book-requests/{bookRequestId} */
	public void removeBookRequest(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/book-requests/" + id;
		HttpDelete request    = new HttpDelete(url);
		HttpResponse response = httpclient.execute(request);
		
		System.out.println("Removing BookRequest with id : " + id);
		System.out.println(getResponseData(response));
	}
	
	/* POST - http://{host}/elibraryws/book-requests/get-filtered-data-count */
	public int getBookRequestsCount(String filter) throws Exception {
		
		int count = 0;
		// ...
		return count;
	}
	
	/* POST - http://{host}/elibraryws/book-requests/get-data/{offset}/{limit}/{sort_by}/{sort_dir} */
	public List<BookRequest> getBookRequests(String filter, int offset, int limit, 
			String sort_by, String sort_dir) throws Exception {
		
		List<BookRequest> bookRequests = new ArrayList<BookRequest>();
		// ...
		return bookRequests;
	}

	/** Log Request Resource **/
	/**************************/

	/* POST - http://{host}/elibraryws/logs/get-filtered-data-count */
	public int getLogsCount() throws Exception {

		int count = 0;
		// ...
		return count;
	}
	
	/* POST - http://{host}/elibraryws/logs/get-data/{offset}/{limit}/{sort_by}/{sort_dir} */
	public List<LogRequest> getLogs(String filter, int offset, int limit, 
			String sort_by, String sort_dir) throws Exception {

		List<LogRequest> logRequests = new ArrayList<LogRequest>();
		// ...
		return logRequests;
	}
	
	/** Registration Request Resource **/
	/***********************************/

	/* GET- http://{host}/elibraryws/ registration/{registrationRequestId} */
	public RegistrationRequest getRegistrationRequest(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/registration/" + id;
		HttpGet request       = new HttpGet(url);
		HttpResponse response = httpclient.execute(request);
		
		return gson.fromJson(getResponseData(response), RegistrationRequest.class);
	}
	
	/* POST - http://{host}/elibraryws/registration */
	public void createRegistrationRequest(RegistrationRequest request) throws Exception {
		// ...
	}
	
	/* DELETE - http://{host}/elibraryws/registration/{registrationRequestId} */
	public void removeRegistrationRequest(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/registration/" + id;
		HttpDelete request    = new HttpDelete(url);
		HttpResponse response = httpclient.execute(request);
		
		System.out.println("Removing Registration with id : " + id);
		System.out.println(getResponseData(response));
	}
	
	/* PUT - http://{host}/elibraryws/registration */
	public void updateRegistrationRequest(RegistrationRequest request) throws Exception {
		// ...
	}
	
	/* GET - http://{host}/elibraryws/registration/get-data-count */
	public int  getRegistrationRequestsCount() throws Exception {
		
		int count = 0;
		// ...
		return count;
	}
	
	/* GET - http://{host}/elibraryws/regsitration/get-data/{offset}/{limit}/{sort_by}/{sort_dir} */
	public List<RegistrationRequest> getRegistratinRequests(int offset, int limit, 
			String sort_by, String sort_dir) throws Exception {

		List<RegistrationRequest> registrationRequests = new ArrayList<RegistrationRequest>();
		// ...
		return registrationRequests;
	}
	
	/* GET - http://{host}/elibraryws/registration/register/{registrationRequestId} */
	public void approveRegistrationRequest(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/registration/register/" + id;
		HttpGet request       = new HttpGet(url);
		HttpResponse response = httpclient.execute(request);
		
		System.out.println("Approving registration for id : " + id);
		System.out.println(getResponseData(response));
	}
	
	/* GET - http://{host}/elibraryws/registration/decline/{registrationRequestId} */
	public void declineRegistrationRequest(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/registration/decline/" + id;
		HttpGet request       = new HttpGet(url);
		HttpResponse response = httpclient.execute(request);
		
		System.out.println("Declining registration for id : " + id);
		System.out.println(getResponseData(response));
	}
	
	/** User Resource **/
	/*******************/
	/*  GET- http://{host}/elibraryws/ users/{userId} */
	public User getUser(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/users/" + id;
		HttpGet request       = new HttpGet(url);
		HttpResponse response = httpclient.execute(request);
		
		return gson.fromJson(getResponseData(response), User.class);
	}

	/* GET- http://{host}/elibraryws/ users/login/{username} */
	public User getUser(String login) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/users/" + login;
		HttpGet request       = new HttpGet(url);
		HttpResponse response = httpclient.execute(request);
		
		return gson.fromJson(getResponseData(response), User.class);
	}

	/* POST - http://{host}/elibraryws/users */
	public void createUser(User user) throws Exception {
		// ...
	}

	/* DELETE - http://{host}/elibraryws/users/{userId} */
	public void removeUser(int id) throws Exception {
		
		String url            = "http://" + host + "/elibraryws/users/" + id;
		HttpDelete request    = new HttpDelete(url);
		HttpResponse response = httpclient.execute(request);
		
		System.out.println("Removing User with id : " + id);
		System.out.println(getResponseData(response));
	}

	/* PUT - http://{host}/elibraryws/users */
	public void updateUser(int id, User user) throws Exception {
		// ...
	}

	/* GET - http://{host}/elibraryws/users/get-filtered-data-count  */
	public int getUsersCount() throws Exception {
		
		int count = 0;
		//...
		return count;
	}

	/* GET - http://{host}/elibraryws/users/get-data/{offset}/{limit}/{sort_by}/{sort_dir} */
	public List<User> getUsers(String filter, int offset, int limit, 
			String sort_by, String sort_dir) throws Exception {

		List<User> users = new ArrayList<User>();
		// ...
		return users;
	}
	
	
	
	

}
