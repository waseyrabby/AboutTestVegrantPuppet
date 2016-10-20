This is a fun project where I briefly extended the functionality of <a href="https://github.com/amadeuspzs/TODO/tree/NSS-TODO">NSS-TODO-List v 1.1</a> made by "amadeus.maclab.org".

Test created by AAm Wasey.


<h3>Setup:</h3>


<h3>Test Env setup:</h3>
<ul>

Dowload the repo
Install vagrant
go inside your local repo 
Do vagrant UP
go to http://awesome.dev/index.php and start testing 
Unless u changet the configuration file.
Note:- App didnt work with php 7 it worked when i downgraded it to php 5.6 .it still give me an error but thats not an issue to test the api.
</ul>
<li><strong>Note:</strong> You may want to explore your file read/write permissions on your local file system.</li>

<h3>Test Cases:</h3>
<p>Write test cases to test various functionalities and features of this app. 
Imagine you are a QA Lead and how would you go about successfully testing this app. 
The more scenarios you cover the better coverage you can provide. First test the API call and then test the interface and functionality of this app. Please provide your test cases in plain English and paste them under 
/test_cases.txt file.
</p>
<h4>API Test Cases:</h4>

<ul>
<li>Test service status of the API endpoint (only one in this case)</li>
<li>Find how many tasks do not have "category" assigned</li>
<li>Aggregate and print only "task names"</li>
<li>Read API response and print tasks in descending "due date" order</li>
<li>Count and validate the number of tasks</li>
</ul>

<h3>Automation:</h3>
The goal is to use access the fake API call at http://localhost/nss-todo-automation/fake-API-call.php and automate above suggested test cases. 
Selenium Webdriver with preferably Python bindings (or any other OO language of your choice). Automate the above test cases in order to test the functional flow through of the application. In particular, we want to test options around creating a todo, assigning categories, modifying/deleting existing todos etc. The application should itself be fairly self-explanatory. Feel free to email us (qa@about.com) with any questions about it. Please use the application first to populate data for API. I would suggest create some dunny tasks.



uploading test with server configuration and originall app in my personal repo
https://github.com/waseyrabby/AboutTestVegrantPuppet


<h3>Resources:</h3>
<ul>
<li>API call for backend data validation: There's a fake API call that outputs JSON of the flat file at
http://awesome.dev/fake-api-call.php </li>

</ul>



