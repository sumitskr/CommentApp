# CommentApp
 
1. we need to create database for the purpose


	-here i have used mysql(phpmyadmin)            ///we can use phpmyadmin gui tool for creating the database its quite easy
	Database Name : CommentApp
		
			1. Table 1 : userdatabase (username,password,active,secret)
				 CREATE TABLE USERDATABASE( USERNAME VARCHAR(20),PASSWORD VARCHAR(20),ACTIVE BOOLEAN);
			2. Table 2 : comments(username(fk) , comment(varchar(100));
				CREATE TABLE COMMENTS (USERNAME VARCHAR(20),COMMENT(VARCHAR(100),FOREIGN KEY (USERNAME) REFERENCES userdatabase(USERNAME));


2. Download the zip file and extract:
				0.Open Eclipse IDE :
				1.import the zip file(CommentApp.zip) into the eclipse
				2.set up the apache tomcat server(8.0) in eclipse
				3.set up runtime library
				4.set the apache tomcat http port to 9999 , bcz phpmyadmin use 8080 port.
				5.now start the server

3. go to web browser :
			
				1.home page:  http://localhost:9999/CommentApp/comment    (Home page if in session then comments will be shown else redirect to sign in page)

				2.sign in : http://localhost:9999/CommentApp/html/signin.html
				
				3.sign up : http://localhost:9999/CommentApp/html/signup.html

				4.Forget pssword : http://localhost:9999/CommentApp/html/forgot.html
				



(eclipse set up is little bit of tricky)

its a java servlet/jsp/jdbc programming
