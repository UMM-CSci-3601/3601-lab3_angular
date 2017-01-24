#Lab Tasks

After you have cloned the project and set it up as specified in the Readme, complete the following tasks, answering any
questions by editing this file. 

## Part #1: exploring the project.

> Protip: You'll need to start up the server before you can play with the website.

- Click links on the navigation bar. See what happens.  
- Observe the HTML element's formatting (it's done via bootstrap). As you are working on the questions below, experiment with the project to get a better sense for what each element is. 

##### List the folders in the public folder and describe the purpose for each.
##### What are the names of the Angular controllers in this web application? What does each of them do?
##### Open the index.html view. What controller(s) is it using? 
##### Where is the navigation bar included in the source code for index.html? 
##### app.js within public/javascript is where your Angular modules are located at. What modules does the project currently have?
##### How are new items added and deleted through the web page? (i.e. - What functions from the main controller are used in index.html, and what Angular directives allow them to interact with the view?)
##### Open navbar.html view. What is its purpose? How would you go about adding links to the navigation bar? 
##### Find two instances of use of bootstrap (see above) in either navbar view or index view or both; explain what is formatted. 

>Protip: Bootstrap is awesome. Start using it. Seriously. This allows you to do fancy things with styling (CSS) with very little effort. Think back to lab 1. http://getbootstrap.com/components/ <- Regular Bootstrap. https://angular-ui.github.io/bootstrap/ <- Angular Bootstrap. These offer separate functionality and both can be used simultaneously.

## Part #2: modifying the project.

- Set up Travis CI and add the build status icon to your project's README.
  - This should have been done as part of the setup.

- Currently clicking on "kittens" returns the "page under construction" message. Using the view about.html as a sample, add a page that has a navigation bar. Add an image of your choice to the page (be aware of copyright rules) and a div that describes the image. 
- Explore bootstrap by changing formatting of the page (for instance, position of the image and text). It doesn't have to look "nice", just different from what it currently is. 

## Part #3: components, controllers, and modules, oh my!

>Protip: You can blame Jacob for the cheesy part name.

- Your first task here is to create a new Angular module that acts as a container for Angular component controllers. To do this, look at javascript/app.js. Similar to `stdControllers`, create a module named `stdComponents`, and inject that into the `mainApp` module.
- Now that we have an Angular module for containing Angular controllers of components, we want to add the controller for our Angular component to the new module. As such, go to `navbar.controller.js` and change the module it is a part of to the new `stdComponents` module.
- Boom! You're done making your own module. To make sure Angular is still working, serve the application, and make sure you can still use the navbar on the index.html and about.html pages.

- Now, we are going to go a bit more in depth into this. Using navbar as an example, we want you to make another component. This component will be a `footer` that you will add to your index.html and about.html pages.
- To do this, you need to create: `footer.controller.js`, `footer.html`.

>Protip: Make sure these are added to Git before you commit!

- You need to modify: `index.html`, `about.html`.
- Some general advice:
  - Add the footer controller to the newly created `stdComponents` Angular module.
  - Make sure to include the javascript for the Angular controller in the web pages the components will be a part of. DO NOT put the script tag to include this into `footer.html`.
  - Put the footer at the bottom of the pages. Please.
  - If you get confused, look at the respective files that navbar uses. You should be able to mirror this _very_ closely after those files.
  - We don't really care what the content of your footer is. It should definitely consist of a footer element.

>Protip: From w3schools... A footer element typically contains: authorship information, copyright information, contact information, sitemap, back to top links, related documents.


## Part #4: ToDo List: Redux.

##### When you're done with the lab, take a look at your test coverage report and make a note here about what pieces of code are covered well, what isn't, and why this is the case.


