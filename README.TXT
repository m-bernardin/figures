Project "figures"
Authors: Michael Kölling and David J. Barnes

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling
   Pearson Education

It is discussed in chapter 1.

This is a very simple project to demonstrate some characteristics of
objects.

You can create various shapes, and you will see, if you do, that those
shapes are drawn on screen (in a window that we call the "canvas").

You can then manipulate these objects: change their position, size and 
colour. Try it out: create a few different squares, triangles and circles.

This project is designed as a first example of object-oriented programming.
It illustrates a number of concepts:

 - a Java project (application) is a collection of classes
 - objects can be created from classes
 - from any one class, many objects may be created
 - objects have operations (methods)
 - operations can have parameters
 - parameters have types (at least String and int)
 - objects hold data (fields)
 - the operations and fields are common to all objects
 - the values stored in the fields can be different for each object

The project also demonstrates

 - BlueJ object creation
 - interactive method invocation
 - parameter passing

A good second project to look at after this is "picture", which adds a class
to those ones in this project. That class (named "Picture") uses the shapes
to draw a picture. It can be used to experiment with coding.

part ii:
bluej v GitHub files difference 
most files are the same but github has an extra named 'package.bluej' it seems to be an internl file for bluej telling the app how and what to display, similar to an internal readme just for the program 

part iii:
"pink" colour created 
calling 'makeinvisible' twice keeps it invisible; its not a switch, to remake it visible again you'd have to call 'makeVisible
attempting to change the colour w/o quotes retrns an invalid string; quotes are required
"brown" colour created
the code pad follows the same syntax as the commands coming out of the terminal (when 'record method calls' is selected)
the default positions for all classes now render a scene of a person outside their house on the hill with the sun in the sky
