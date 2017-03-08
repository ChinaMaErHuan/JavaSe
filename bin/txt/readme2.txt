
	src WEB工程的资源目录（源代码，配置文件）
	WebRoot 项目部署后的根目录
	WEB-INF 外界不能访问，用来存储classes，安全性的文件， jar包
	WEB-INF/WEB.XML 项目主配置文件。web工程的描述文件
	WEB-INF/lib 存放项目需要的jar包
	META-INF  一个信息包，用于配置应用程序和扩展程序
	
	
	Java语言，内部采用的是UNICODE编码，
	所以Java运行程序时，就存在着一个从UNICODE编码和对应的操作系统以及浏览器支持的编码格式转换输入输出的问题！
	
	1.GET方式乱码
	 a.通过配置web容器的uri编码 server.xml  tomcat中的端口号那里 URIEncoding = “utf-8”
	 b.就是通过默认浏览器编码进行还原字节数组然后转化成项目编码
	2.POST方式乱码
		通过设置request的编码方式
	3.响应乱码
		通过设置response的编码方式
		
		乱码分类： 乱码分为，请求乱码和响应乱码 其中请求乱码有分为get乱码和post乱码 。
	解决方法：
	请求乱码：
	get乱码： new String(request.getParameter("pointName").getBytes("ISO-8859-
	1"),"UTF-8");
	post乱码： request.setCharacterEncoding("UTF-8");
	
	响应乱码： response.setCharacterEncoding("UTF-8");或者
	response.setContentType("text/html;charset=utf-8");
		
		
		
		
	Filter
	1.在Servlet等资源被调用前截获
	2.根据需要在doFilter中修改request和response的数据
	3.在Servlet等资源被调用之后截获
	4.可以根据需要修改response
	
	Filter的执行顺序是根据Web.xml的配置（声明）顺序来的。最后才会到达目标资源
	
	
	
		重定向介绍：
		
		服务器向浏览器发送一个302状态码及一个Location消息头，浏览器在收到后会立即向这个地址发送请求。
		
		sendRedirect(String location)
		
		转发介绍：
		
		转发：服务器将客户端的请求转发到另外一个页面
		
		request.getRequestDispatcher(String path)
		forward(HttpServletRequest request, HttpServletResponse response)
		
		
		重定向和转发的区别：
	
		1)重定向时，客户端发送了两个请求；而转发时，客户端只发送了一个请求(本质区别)
		
		2)重定向时，客户端浏览器的地址栏有变化，而转发时，客户端浏览器的地址栏没有变化
		
		3)重定向发生在客户端，而转发是发生在服务端，客户端不知道
		
		重定向与转发的应用场景：
	
		1，只是页面跳转的话，且没有业务请求处理参数等，可以使用重定向，也可以使用转发过去。
		2，如果请求跳转页面有业务处理，则必须使用转发，但是有两点需要处理：
			1.如果我们的action请求的jsp页面的有业务逻辑处理或者请求其他命名空间的action时，
			在不同的命名空间里面，那么必须使用"../"来跳出当前的路径请求，在进入其他的命名空间＋其他的action请求，
			这样才会使页面的其他导入文件才不会有丢失的情况；	
			2）当然，如果要跳转到注册，或者表单提交页面时，最后使用重定向比较好，这样不会有属性冲突，
			造成数据提交异常，但有时候却要转发过去，具体看是否需要当前的request请求参数
			
			
			
			
			
	Servlet的生命周期:
	1.当web客户请求Servlet服务或当web服务启动时，容器环境加载一个JavaServlet类。
	
	2.容器根据客户请求创建一个Servlet对象实例,或者创建多个Servlet对象实例,并把这些实例加入到Servler实例池中.
	
	3.容器环境调用Servlet的初始化方法init()进行初始化,这需要给init()方法传入一个ServletConfig对象,
	ServletConfig对象包含了初始化参数和容器环境的信息,并负责向Servlet传递数据,如果传递失败,
	则会发生ServletException异常,Servlet不能正常工作。
	
	4.容器环境利用一个HttpServletRequest和HttpServletResponse对象封装从web客户接受到的http请求和由Servlet生成的响应。
	
	5.容器环境吧HttpServletRequest 和HttpServletResponse 对象传递给HttpServlet.service()方法这样
	一个定制的java Servlet就可以访问这种http请求和响应接口 service方法可以调用多次,各调用过程运行在不同的线程中互不干扰
	
	6.定制的JavaServlet从HttpServletRequest对象读取http请求数据，访问来自HttpSession或Cookie对象的状态信息,进行
	特定应用的处理，并且用HttpServletResponse对象生成HTTP响应数据
	
	7.web容器关闭 会自动调用HttpServlet.destory()方法关闭所有打开的资源,并进行一些关闭前的处理。
	
	
	
		get /post /put /delete

		get基于浏览器请求，
			1:直接在浏览器输入框输入一个地址进行请求
			2:点击a连接是一个get请求
			3:通过form指明method="get"
			4:ajax 指明请求方式get

        post:form里面method="post"
		     ajax里面指明post请求


        他们区别在于：get发送给服务器段数量是有限的
		get请求的URL每个浏览器都有字符串的长度的限制，它不适用于大文本数据的传递
		用post

		get会暴露参数信息，不安全
		post安全，不会暴露
	
	
	

