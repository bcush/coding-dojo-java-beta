# Pets
* Create data model; create a dog, and create a cat.
    1. Create a new package - `com.briancushman.web.models`
    2. Inside here create a new call - `Animal`
    3. Inside here create your Animal attributes - `name`, `breed`, `weight`.
        - `private String name;`
        - `private String breed;`
        - `private double weight;`
    4. Create your constructor method for `Animal`.
        - `public Animal (String name, String breed, double weight)`
    5. Create your getter/setter methods for all.
        - opt-cmd-s - creates public getter/setters which are public and will be inherited.

* Create an interface. (still within your com.briancushman.web.models package)
    1. Call the interface `Pet`.
    2. Add the method header that will be defined by the interface.
        - Does this need to take a weight parameter? No, because the information is available already via the getter.
        - In the case of the cat, we don't care. It's the same response no matter what weight.
        - In other words, your interface contains `String showAffection();`

    3. Create your dog model.
        - new Class within models package; call it `DogModel`.
        - You can build it using `Animal` as the superclass, and `Pet` as the interface.
        - Define your `showAffection` method. Remember to check weight and to return appropriately.
    4. Create your cat model like the dog model.
        - Define your `showAffection` method. No need to check weight.
    5. Your models are done now. On to the new step. We should look at creating out Controllers and Views.

* Create your XML file since this is a part of the controllers.
    1. Create a new XML file called `web.xml` in your `WebContent/WEB-INF` folder. We will fill this in later.
    2. Create a new package which will contain all your controllers.
        - Call it `com.briancushman.web.controllers`
    3. Create a new Servlet in this package. Remember servlets are what the req/res objects are passed to by the container.
        - Call it `Dog`.
    4. Create another Servlet. Call it `Cat`.
    5. You can erase the code block that references super() both these Servlets.
    6. You can also remove the doPost from the code (Dog and Cat) since we aren't going to POST anything.
    7. Copy and paste the web.xml data from the platform into your web config XML. It's under the section 'Web Containers.'
        - Change the fields in web.xml as necessary.
        - <servlet-name> could be anything, but give it something nice. Like Dog.. because remember this is our Controller.
        - <servlet-class> will be your controller package namespace with .Dog at the end.
        - <servlet-name> is Dog once again (or whatever)
        - <url-pattern> will be /dog (or will it.. we will see this again later).
    8. Copy and paste the XML you just wrote to create the same for Cat.

* Create a new HTML file inside your WebContent root, let's call it index.html.
    - Remember that you need a form to send to the container, which goes to a Controller (servlet).

* Now we need to configure our application to render a JSP file.
    1. What do we use to render JSP files? It's Request Dispatcher. This goes in your Controller or your Dog.java.
        - `RequestDispatcher view = request.getRequest("/WEB-INF/dog.jsp");`
        - `view.forward(request, response);`
        - view is the RequestDispatcher object; we forward this, giving the request/response object to the JSP file making them available.
        - this lets us do request.getParamater, etc.. put this code in your Cat as well.
    2. Now create your JSP files. Remember, these go in your WEB-INF folder, not the root. These should not be publically accessible.
        - Click New, select JSP, then call it dog.jsp and cat.jsp.

* Now we have created our Models (JavaBean), Views (JSP), and our Controllers (Servlets). Now we just need to use our Model in our View.
    1. Within your particular JSP, you need to import your Models (so that they can be used).
        - import='com.briancushman.web.models.Cat' near the top of your JSP header. Do the same for your dog JSP.
    2. Now we can use some templating language to work with the Methods and Models.
    3. Inside <body> you can use the following:
        - <%
        -     String name = request.getParameter("name");
        -     String breed = request.getParameter("breed");
        -     double weight = Double.parseDouble(request.getParameter("weight");
        - %>
    4. Know that for the last line, since your data type is a double, and getParameter returns a String, that you need to typecast.
    5. Know also that each primitive has an associated Class, and in there is a method called parse<something> that will convert from String to datatype.
    6. Now create an instance of your CatModel in order to work with it. Make sure you instantiate it using the values we just set.
        - CatModel cat = new CatModel(name, breed, weight);
    7. Finally, modify your JSP file to use the new templating variables.
        - <%= cat.getBreed() %>
        - <%= cat.getName() %>
        - <%= cat.showAffection() %>
    8. Perform the same for your dog.jsp as well.